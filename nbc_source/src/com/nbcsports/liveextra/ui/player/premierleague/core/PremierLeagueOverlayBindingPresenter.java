// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.core;

import android.databinding.Observable;
import com.nbcsports.liveextra.ui.core.BaseBindingPresenter;
import com.nbcsports.liveextra.ui.player.AbstractPresenterListener;
import com.nbcsports.liveextra.ui.player.PlayerPresenter;
import com.nbcsports.liveextra.ui.player.PlayerPresenterListener;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;

public abstract class PremierLeagueOverlayBindingPresenter extends BaseBindingPresenter
    implements com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine.Listener
{

    protected final PremierLeagueEngine engine;
    private PlayerPresenterListener listener;
    protected final PlayerPresenter playerPresenter;

    protected PremierLeagueOverlayBindingPresenter(PremierLeagueEngine premierleagueengine, PlayerPresenter playerpresenter)
    {
        listener = new AbstractPresenterListener() {

            final PremierLeagueOverlayBindingPresenter this$0;

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
                this$0 = PremierLeagueOverlayBindingPresenter.this;
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
        return new AbstractPresenterListener() {

            final PremierLeagueOverlayBindingPresenter this$0;

            
            {
                this$0 = PremierLeagueOverlayBindingPresenter.this;
                super();
            }
        };
    }

    protected abstract void load();

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
        super.release();
        engine.removeListener(this);
        playerPresenter.unregister(listener);
        playerPresenter.unregister(getPresenterListener());
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

    public void takeView(Observable observable)
    {
        super.takeView(observable);
        engine.addListener(this);
        playerPresenter.register(listener);
        playerPresenter.register(getPresenterListener());
    }
}
