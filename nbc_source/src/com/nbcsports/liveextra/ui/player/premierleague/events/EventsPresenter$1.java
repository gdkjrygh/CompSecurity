// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.events;

import com.nbcsports.liveextra.content.models.overlay.premierleague.TeamInfo;
import com.nbcsports.liveextra.ui.player.PlayerPresenter;
import rx.Subscriber;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.events:
//            EventsPresenter, EventsView

class this._cls0 extends Subscriber
{

    final EventsPresenter this$0;

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
    }

    public void onNext(TeamInfo teaminfo)
    {
        if (!hasView())
        {
            return;
        }
        ((EventsView)EventsPresenter.access$000(EventsPresenter.this)).bindPrematch(teaminfo.getTeamHome().bbreviation(), teaminfo.getTeamAway().bbreviation());
        teaminfo = (EventsView)EventsPresenter.access$200(EventsPresenter.this);
        boolean flag;
        if (!EventsPresenter.access$100(EventsPresenter.this).isInAdBreak())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        teaminfo.enablePrematch(flag);
    }

    public volatile void onNext(Object obj)
    {
        onNext((TeamInfo)obj);
    }

    m()
    {
        this$0 = EventsPresenter.this;
        super();
    }
}
