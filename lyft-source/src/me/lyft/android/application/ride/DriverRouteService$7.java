// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.LocationMapper;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.ride:
//            DriverRouteService

class val.partySize
    implements Func1
{

    final DriverRouteService this$0;
    final int val$partySize;
    final Passenger val$passenger;

    public volatile Object call(Object obj)
    {
        return call((Location)obj);
    }

    public Observable call(Location location)
    {
        return DriverRouteService.access$100(DriverRouteService.this).changePartySizeAndStatus(val$passenger.getRideId(), "pickedUp", val$partySize, LocationMapper.fromLocationDomain(location));
    }

    ()
    {
        this$0 = final_driverrouteservice;
        val$passenger = passenger1;
        val$partySize = I.this;
        super();
    }
}
