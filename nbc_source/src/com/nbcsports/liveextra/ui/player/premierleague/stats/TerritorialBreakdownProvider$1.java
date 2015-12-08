// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.stats;

import android.util.Pair;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import rx.functions.Func2;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.stats:
//            TerritorialBreakdownProvider

class this._cls0
    implements Func2
{

    final TerritorialBreakdownProvider this$0;

    public com.nbcsports.liveextra.content.models.overlay.premierleague.lInterval call(List list, Pair pair)
    {
        if (list != null && ((Integer)pair.first).intValue() != 0 && ((Integer)pair.second).intValue() != 0) goto _L2; else goto _L1
_L1:
        pair = null;
_L4:
        return pair;
_L2:
        int i;
        int j;
        j = (((Integer)pair.second).intValue() / 5) * 5;
        if (((Integer)pair.first).intValue() != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        i = j;
        if (j > 45)
        {
            i = 45;
        }
_L5:
        com.nbcsports.liveextra.content.models.overlay.premierleague.lInterval linterval = (com.nbcsports.liveextra.content.models.overlay.premierleague.lInterval)CollectionUtils.find(list, new Predicate() {

            final TerritorialBreakdownProvider._cls1 this$1;
            final String val$intervalTime;

            public boolean evaluate(com.nbcsports.liveextra.content.models.overlay.premierleague.TerritorialBreakdown.TerritorialInterval territorialinterval)
            {
                return territorialinterval.getIntervalType().equals(intervalTime);
            }

            public volatile boolean evaluate(Object obj)
            {
                return evaluate((com.nbcsports.liveextra.content.models.overlay.premierleague.TerritorialBreakdown.TerritorialInterval)obj);
            }

            
            {
                this$1 = TerritorialBreakdownProvider._cls1.this;
                intervalTime = s;
                super();
            }
        });
        pair = linterval;
        if (linterval == null)
        {
            pair = linterval;
            if (TerritorialBreakdownProvider.access$000(TerritorialBreakdownProvider.this).isLive())
            {
                pair = linterval;
                if (list.size() > 0)
                {
                    return (com.nbcsports.liveextra.content.models.overlay.premierleague.lInterval)list.get(0);
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        i = j;
        if (j > 90)
        {
            i = 90;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public volatile Object call(Object obj, Object obj1)
    {
        return call((List)obj, (Pair)obj1);
    }

    _cls1.val.intervalTime()
    {
        this$0 = TerritorialBreakdownProvider.this;
        super();
    }
}
