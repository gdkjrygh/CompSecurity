// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.stats;

import com.nbcsports.liveextra.content.models.overlay.premierleague.TerritorialBreakdown;
import org.apache.commons.collections4.CollectionUtils;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.stats:
//            TerritorialBreakdownProvider

class this._cls0
    implements Func1
{

    final TerritorialBreakdownProvider this$0;

    public volatile Object call(Object obj)
    {
        return call((TerritorialBreakdown)obj);
    }

    public Observable call(TerritorialBreakdown territorialbreakdown)
    {
        if (territorialbreakdown == null || CollectionUtils.isEmpty(territorialbreakdown.getTerritorialIntervals()))
        {
            return null;
        } else
        {
            return Observable.just(territorialbreakdown.getTerritorialIntervals());
        }
    }

    ()
    {
        this$0 = TerritorialBreakdownProvider.this;
        super();
    }
}
