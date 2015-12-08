// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.standings;

import com.nbcsports.liveextra.content.models.overlay.premierleague.Standings;
import org.apache.commons.collections4.CollectionUtils;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.standings:
//            StandingsLiveProvider

class this._cls0
    implements Func1
{

    final StandingsLiveProvider this$0;

    public volatile Object call(Object obj)
    {
        return call((Standings)obj);
    }

    public Observable call(Standings standings)
    {
        if (standings == null || CollectionUtils.isEmpty(standings.getWeeks()))
        {
            return null;
        } else
        {
            return Observable.from(standings.getWeeks());
        }
    }

    ()
    {
        this$0 = StandingsLiveProvider.this;
        super();
    }
}
