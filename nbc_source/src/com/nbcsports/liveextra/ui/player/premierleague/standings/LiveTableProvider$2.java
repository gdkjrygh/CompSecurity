// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.standings;

import com.nbcsports.liveextra.content.models.overlay.premierleague.LeagueInfo;
import org.apache.commons.collections4.CollectionUtils;
import rx.Subscriber;

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
    }

    public void onNext(LeagueInfo leagueinfo)
    {
        if (leagueinfo == null || CollectionUtils.isEmpty(leagueinfo.getTeams()))
        {
            return;
        } else
        {
            val$subscriber.kick();
            unsubscribe();
            return;
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((LeagueInfo)obj);
    }

    veTableSubscriber()
    {
        this$0 = final_livetableprovider;
        val$subscriber = veTableSubscriber.this;
        super();
    }
}
