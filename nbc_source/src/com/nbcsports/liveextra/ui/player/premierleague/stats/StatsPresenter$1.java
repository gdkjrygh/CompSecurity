// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.stats;

import android.databinding.ObservableInt;
import android.graphics.Color;
import com.nbcsports.liveextra.content.models.overlay.premierleague.TeamInfo;
import rx.Subscriber;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.stats:
//            StatsPresenter

class this._cls0 extends Subscriber
{

    final StatsPresenter this$0;

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
        Timber.d(throwable, "Error setting team data", new Object[0]);
    }

    public void onNext(TeamInfo teaminfo)
    {
        if (!hasBinder() || teaminfo == null)
        {
            return;
        } else
        {
            StatsPresenter.access$002(StatsPresenter.this, StatsPresenter.access$100(StatsPresenter.this, teaminfo.getTeamHome()));
            StatsPresenter.access$202(StatsPresenter.this, StatsPresenter.access$100(StatsPresenter.this, teaminfo.getTeamAway()));
            ((etTeamAway)StatsPresenter.access$300(StatsPresenter.this)).homeColor.set(Color.parseColor(StatsPresenter.access$000(StatsPresenter.this)));
            ((this._cls0)StatsPresenter.access$400(StatsPresenter.this)).homeColor.set(Color.parseColor(StatsPresenter.access$200(StatsPresenter.this)));
            return;
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((TeamInfo)obj);
    }

    ()
    {
        this$0 = StatsPresenter.this;
        super();
    }
}
