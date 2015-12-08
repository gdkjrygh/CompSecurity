// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.common.Unit;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.application.ride:
//            DriverRouteService

class val.analytics
    implements Action1
{

    final DriverRouteService this$0;
    final AsyncActionAnalytics val$analytics;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        val$analytics.trackResponseSuccess();
    }

    ()
    {
        this$0 = final_driverrouteservice;
        val$analytics = AsyncActionAnalytics.this;
        super();
    }
}
