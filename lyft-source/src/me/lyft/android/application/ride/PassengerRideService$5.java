// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.LocationMapper;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.constants.CancellationOption;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.ride:
//            PassengerRideService

class val.cancelStatus
    implements Func1
{

    final PassengerRideService this$0;
    final String val$cancelStatus;
    final CancellationOption val$cancellationOption;
    final PassengerRide val$passengerRide;

    public volatile Object call(Object obj)
    {
        return call((Location)obj);
    }

    public Observable call(Location location)
    {
        return PassengerRideService.access$300(PassengerRideService.this).cancelRide(val$passengerRide.getId(), val$cancellationOption.getId(), val$cancelStatus, LocationMapper.fromLocationDomain(location));
    }

    onOption()
    {
        this$0 = final_passengerrideservice;
        val$passengerRide = passengerride;
        val$cancellationOption = cancellationoption;
        val$cancelStatus = String.this;
        super();
    }
}
