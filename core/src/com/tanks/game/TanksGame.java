package com.tanks.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TanksGame extends Game {
    private SpriteBatch batch;

    // Планы на будущее:
    // Камера и большая карта
    // Оптимизация (рендер в буфер)
    // Команды танков
    // При получении урона танк должен немного отскакивать в сторону

    @Override
    public void create() {
        batch = new SpriteBatch();
        ScreenManager.getInstance().init(this, batch);
        ScreenManager.getInstance().switchScreen(ScreenManager.ScreenType.MENU);
    }


    @Override
    public void render() {
        float dt = Gdx.graphics.getDeltaTime();
        getScreen().render(dt);
    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}
