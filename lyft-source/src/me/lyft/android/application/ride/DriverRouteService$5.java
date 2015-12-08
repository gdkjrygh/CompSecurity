// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.LocationMapper;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.constants.CancellationOption;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.ride:
//            DriverRouteService, IDriverRideProvider

class tionOption
    implements Func1
{

    final DriverRouteService this$0;
    final CancellationOption val$cancellationOption;

    public volatile Object call(Object obj)
    {
        return call((Location)obj);
    }

    public Observable call(Location location)
    {
        return DriverRouteService.access$100(DriverRouteService.this).cancelRide(DriverRouteService.access$000(DriverRouteService.this).getDriverRide().getCurrentStop().getRideId(), val$cancellationOption.getId(), val$cancellationOption.getStatus(), LocationMapper.fromLocationDomain(location));
    }

    tionOption()
    {
        this$0 = final_driverrouteservice;
        val$cancellationOption = CancellationOption.this;
        super();
    }
}
