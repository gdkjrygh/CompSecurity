// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.core;

import android.view.View;
import com.nbcsports.liveextra.ui.core.BasePresenter;
import com.nbcsports.liveextra.ui.player.AbstractPresenterListener;
import com.nbcsports.liveextra.ui.player.PlayerPresenter;
import com.nbcsports.liveextra.ui.player.PlayerPresenterListener;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;

public abstract class PremierLeagueOverlayPresenter extends BasePresenter
    implements com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine.Listener
{

    protected final PremierLeagueEngine engine;
    protected final PlayerPresenter playerPresenter;
    PlayerPresenterListener presenterListener;

    protected PremierLeagueOverlayPresenter(PremierLeagueEngine premierleagueengine, PlayerPresenter playerpresenter)
    {
        presenterListener = new AbstractPresenterListener() {

            final PremierLeagueOverlayPresenter this$0;

            public void onAdBreakComplete()
            {
                super.onAdBreakComplete();
                adComplete();
            }

            public void onAdBreakStart()
            {
                super.onAdBreakStart();
                adStart();
            }

            public void onPlayComplete()
            {
                super.onPlayComplete();
                onComplete();
            }

            public void onToggleFullScreen(boolean flag)
            {
                super.onToggleFullScreen(flag);
                if (flag)
                {
                    pause();
                    return;
                } else
                {
                    resume();
                    return;
                }
            }

            
            {
                this$0 = PremierLeagueOverlayPresenter.this;
                super();
            }
        };
        engine = premierleagueengine;
        playerPresenter = playerpresenter;
    }

    public void adComplete()
    {
    }

    public void adStart()
    {
    }

    protected PlayerPresenterListener getPresenterListener()
    {
        return presenterListener;
    }

    public void onComplete()
    {
    }

    public void onSeek()
    {
        pause();
    }

    public void onSeekComplete()
    {
        resume();
    }

    public void release()
    {
        engine.removeListener(this);
        playerPresenter.unregister(presenterListener);
        playerPresenter.unregister(getPresenterListener());
        super.release();
    }

    public void resume()
    {
        if (playerPresenter.isFullScreen())
        {
            return;
        } else
        {
            super.resume();
            return;
        }
    }

    public void showGoLive(boolean flag)
    {
    }

    public void takeView(View view)
    {
        super.takeView(view);
        engine.addListener(this);
        playerPresenter.register(presenterListener);
        playerPresenter.register(getPresenterListener());
    }
}
