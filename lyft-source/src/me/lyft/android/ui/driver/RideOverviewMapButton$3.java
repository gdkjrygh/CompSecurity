// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import java.util.List;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.Iterables;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.rx.ReactiveProperty;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            RideOverviewMapButton

class this._cls0
    implements Action1
{

    final RideOverviewMapButton this$0;

    public volatile void call(Object obj)
    {
        call((DriverRide)obj);
    }

    public void call(DriverRide driverride)
    {
        driverride = routeProvider.getDriverRide().getCurrentRouteNotDroppedOffPassengers();
        List list = routeProvider.getDriverRide().getPassengersFromNextRoute();
        RideOverviewMapButton.access$200(RideOverviewMapButton.this).onNext(driverride);
        RideOverviewMapButton.access$300(RideOverviewMapButton.this).onNext(Iterables.take(list, 4 - driverride.size()));
    }

    er()
    {
        this$0 = RideOverviewMapButton.this;
        super();
    }
}
