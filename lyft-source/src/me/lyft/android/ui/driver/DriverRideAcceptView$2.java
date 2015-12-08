// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.analytics.ScreenAnalytics;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.ReactiveProperty;
import me.lyft.android.ui.ride.RideMap;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideAcceptView

class this._cls0
    implements Action1
{

    final DriverRideAcceptView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        ScreenAnalytics.trackScreenView("driver_incoming_job");
        DriverRideAcceptView.access$100(DriverRideAcceptView.this);
        rideMap.bindPadding(driverRideTop, driverRideBottom);
        DriverRideAcceptView.access$300(DriverRideAcceptView.this).bind(routeProvider.observeRide(), DriverRideAcceptView.access$200(DriverRideAcceptView.this));
        DriverRideAcceptView.access$300(DriverRideAcceptView.this).bind(DriverRideAcceptView.access$400(DriverRideAcceptView.this).map(Unit.func1()), DriverRideAcceptView.access$500(DriverRideAcceptView.this));
        DriverRideAcceptView.access$300(DriverRideAcceptView.this).bind(DriverRideAcceptView.access$600(DriverRideAcceptView.this), DriverRideAcceptView.access$700(DriverRideAcceptView.this));
    }

    der()
    {
        this$0 = DriverRideAcceptView.this;
        super();
    }
}
