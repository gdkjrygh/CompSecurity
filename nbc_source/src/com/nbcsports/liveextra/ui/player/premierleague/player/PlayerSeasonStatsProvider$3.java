// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.player;

import com.nbcsports.liveextra.content.models.overlay.premierleague.PlayerSeasonStats;
import org.apache.commons.collections4.CollectionUtils;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.player:
//            PlayerSeasonStatsProvider

class this._cls0
    implements Func1
{

    final PlayerSeasonStatsProvider this$0;

    public volatile Object call(Object obj)
    {
        return call((PlayerSeasonStats)obj);
    }

    public Observable call(PlayerSeasonStats playerseasonstats)
    {
        if (playerseasonstats == null || CollectionUtils.isEmpty(playerseasonstats.getStats()))
        {
            return Observable.empty();
        } else
        {
            return Observable.from(playerseasonstats.getStats());
        }
    }

    ()
    {
        this$0 = PlayerSeasonStatsProvider.this;
        super();
    }
}
