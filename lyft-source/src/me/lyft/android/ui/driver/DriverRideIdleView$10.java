// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.rx.Binder;
import me.lyft.android.services.HeatMapService;
import me.lyft.android.ui.ride.RideMap;
import rx.Subscription;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideIdleView

class this._cls0
    implements Action1
{

    final DriverRideIdleView this$0;

    public void call(Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            DriverRideIdleView.access$1400(DriverRideIdleView.this).unsubscribe();
            DriverRideIdleView.access$1500(DriverRideIdleView.this);
            heatMapService.start();
            DriverRideIdleView.access$1100(DriverRideIdleView.this);
            return;
        } else
        {
            DriverRideIdleView.access$1402(DriverRideIdleView.this, DriverRideIdleView.access$100(DriverRideIdleView.this).bind(DriverRideIdleView.access$1300(DriverRideIdleView.this), DriverRideIdleView.access$1600(DriverRideIdleView.this)));
            heatMapService.stop();
            rideMap.removeTileOverlay();
            return;
        }
    }

    public volatile void call(Object obj)
    {
        call((Boolean)obj);
    }

    ()
    {
        this$0 = DriverRideIdleView.this;
        super();
    }
}
