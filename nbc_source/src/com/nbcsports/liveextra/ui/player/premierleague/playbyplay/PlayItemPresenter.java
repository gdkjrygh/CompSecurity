// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.playbyplay;

import android.databinding.Observable;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import com.nbcsports.liveextra.ui.player.PlayerPresenter;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.core.PremierLeagueOverlayBindingPresenter;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.playbyplay:
//            PlayViewModel

public class PlayItemPresenter extends PremierLeagueOverlayBindingPresenter
{

    private PlayViewModel viewModel;

    protected PlayItemPresenter(PremierLeagueEngine premierleagueengine, PlayerPresenter playerpresenter)
    {
        super(premierleagueengine, playerpresenter);
    }

    public void adComplete()
    {
        super.adComplete();
        if (!hasBinder())
        {
            return;
        } else
        {
            ((PlayItemView.Binder)binder).isSeekEnabled.set(true);
            return;
        }
    }

    public void adStart()
    {
        super.adStart();
        if (!hasBinder())
        {
            return;
        } else
        {
            ((PlayItemView.Binder)binder).isSeekEnabled.set(false);
            return;
        }
    }

    protected void load()
    {
        if (viewModel == null || !hasBinder())
        {
            return;
        }
        ((PlayItemView.Binder)binder).time.set(viewModel.getGameTime());
        ((PlayItemView.Binder)binder).detail.set(viewModel.getDetail());
        ObservableBoolean observableboolean = ((PlayItemView.Binder)binder).playButtonVisible;
        boolean flag;
        if (viewModel.getTimestamp() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        observableboolean.set(flag);
    }

    public void onComplete()
    {
        super.onComplete();
        if (!hasBinder())
        {
            return;
        } else
        {
            ((PlayItemView.Binder)binder).isSeekEnabled.set(false);
            return;
        }
    }

    public void seek()
    {
        if (viewModel == null)
        {
            return;
        }
        org.joda.time.DateTime datetime1 = viewModel.getTimestamp();
        org.joda.time.DateTime datetime = datetime1;
        if (datetime1 == null)
        {
            datetime = engine.getEncoderStartTime();
        }
        engine.seekTo(datetime);
    }

    public void setViewModel(PlayViewModel playviewmodel)
    {
        viewModel = playviewmodel;
        load();
    }

    public volatile void takeView(Observable observable)
    {
        takeView((PlayItemView.Binder)observable);
    }

    public void takeView(PlayItemView.Binder binder)
    {
        super.takeView(binder);
        binder = binder.isSeekEnabled;
        boolean flag;
        if (!playerPresenter.isInAdBreak())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        binder.set(flag);
    }
}
