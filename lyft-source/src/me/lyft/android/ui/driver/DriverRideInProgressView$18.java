// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.application.geo.IGeoService;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.ride.DriverRide;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideInProgressView

class val.stopLocation
    implements Func1
{

    final DriverRideInProgressView this$0;
    final Location val$stopLocation;

    public volatile Object call(Object obj)
    {
        return call((Location)obj);
    }

    public Observable call(Location location)
    {
        return geoService.getDriverEta(routeProvider.getDriverRide().getCurrentRideId(), location, new Location[] {
            val$stopLocation
        });
    }

    ()
    {
        this$0 = final_driverrideinprogressview;
        val$stopLocation = Location.this;
        super();
    }
}
