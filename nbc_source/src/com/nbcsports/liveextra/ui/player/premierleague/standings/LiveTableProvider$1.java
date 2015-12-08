// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.standings;

import com.nbcsports.liveextra.content.models.overlay.premierleague.GameInfo;
import rx.Subscriber;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.standings:
//            LiveTableProvider

class veTableSubscriber extends Subscriber
{

    final LiveTableProvider this$0;
    final veTableSubscriber val$subscriber;

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
        Timber.d(throwable, "Error getting game info", new Object[0]);
    }

    public void onNext(GameInfo gameinfo)
    {
        if (gameinfo == null || gameinfo.getSeason() == 0 || gameinfo.getMaxWeek() == 0)
        {
            return;
        } else
        {
            LiveTableProvider.access$002(LiveTableProvider.this, gameinfo.getSeason());
            LiveTableProvider.access$102(LiveTableProvider.this, gameinfo.getMaxWeek());
            val$subscriber.kick();
            unsubscribe();
            return;
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((GameInfo)obj);
    }

    veTableSubscriber()
    {
        this$0 = final_livetableprovider;
        val$subscriber = veTableSubscriber.this;
        super();
    }
}
