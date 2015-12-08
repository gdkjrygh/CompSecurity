// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ride;

import java.util.Collections;
import java.util.List;
import me.lyft.android.common.Iterables;
import me.lyft.android.domain.geo.Leg;
import me.lyft.android.rx.AsyncCall;

// Referenced classes of package me.lyft.android.ui.ride:
//            RideMap

class  extends AsyncCall
{

    final RideMap this$0;
    final int val$currentLegColor;
    final int val$otherLegColor;

    public volatile void onSuccess(Object obj)
    {
        onSuccess((List)obj);
    }

    public void onSuccess(List list)
    {
        clearRoutes();
        Leg leg = (Leg)Iterables.firstOrDefault(list);
        RideMap.access$400(RideMap.this, val$currentLegColor, Collections.singletonList(leg), 5);
        list = Iterables.skip(list, 1);
        RideMap.access$400(RideMap.this, val$otherLegColor, list, 5);
    }

    ()
    {
        this$0 = final_ridemap;
        val$currentLegColor = i;
        val$otherLegColor = I.this;
        super();
    }
}
