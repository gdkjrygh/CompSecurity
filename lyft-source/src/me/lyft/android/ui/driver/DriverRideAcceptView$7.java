// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.application.geo.IGeoService;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Stop;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideAcceptView

class this._cls0
    implements Func1
{

    final DriverRideAcceptView this$0;

    public volatile Object call(Object obj)
    {
        return call((Location)obj);
    }

    public Observable call(Location location)
    {
        return geoService.getDriverEta(routeProvider.getDriverRide().getCurrentRideId(), location, new Location[] {
            routeProvider.getDriverRide().getCurrentStop().getLocation()
        });
    }

    der()
    {
        this$0 = DriverRideAcceptView.this;
        super();
    }
}
