// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.player;

import com.nbcsports.liveextra.content.models.overlay.premierleague.GameInfo;
import rx.Subscriber;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.player:
//            PlayerSeasonStatsProvider

class ayerSeasonStatsSubscriber extends Subscriber
{

    final PlayerSeasonStatsProvider this$0;
    final ayerSeasonStatsSubscriber val$subscriber;

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
        Timber.d(throwable, "", new Object[0]);
    }

    public void onNext(GameInfo gameinfo)
    {
        if (gameinfo == null || gameinfo.getSeason() == 0)
        {
            return;
        } else
        {
            PlayerSeasonStatsProvider.access$002(PlayerSeasonStatsProvider.this, gameinfo.getSeason());
            val$subscriber.kick();
            unsubscribe();
            return;
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((GameInfo)obj);
    }

    ayerSeasonStatsSubscriber()
    {
        this$0 = final_playerseasonstatsprovider;
        val$subscriber = ayerSeasonStatsSubscriber.this;
        super();
    }
}
