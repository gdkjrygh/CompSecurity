// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.standings;

import com.nbcsports.liveextra.content.models.overlay.premierleague.GameInfo;
import rx.Subscriber;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.standings:
//            StandingsLiveProvider

class andingsLiveSubscriber extends Subscriber
{

    final StandingsLiveProvider this$0;
    final andingsLiveSubscriber val$subscriber;

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
        Timber.d(throwable, "Error getting game info", new Object[0]);
    }

    public void onNext(GameInfo gameinfo)
    {
        if (gameinfo == null || gameinfo.getSeason() == 0 || gameinfo.getWeek() == 0)
        {
            return;
        } else
        {
            StandingsLiveProvider.access$002(StandingsLiveProvider.this, gameinfo.getSeason());
            StandingsLiveProvider.access$102(StandingsLiveProvider.this, gameinfo.getWeek());
            val$subscriber.kick();
            unsubscribe();
            return;
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((GameInfo)obj);
    }

    andingsLiveSubscriber()
    {
        this$0 = final_standingsliveprovider;
        val$subscriber = andingsLiveSubscriber.this;
        super();
    }
}
