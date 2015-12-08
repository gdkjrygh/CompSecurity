// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.domain.location.Location;
import me.lyft.android.ui.ride.RideMap;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRequestRideView

class this._cls0
    implements Action1
{

    final PassengerRequestRideView this$0;

    public volatile void call(Object obj)
    {
        call((Location)obj);
    }

    public void call(Location location)
    {
        if (location.isNull())
        {
            PassengerRequestRideView.access$5200(PassengerRequestRideView.this);
            return;
        }
        switch (.SwitchMap.me.lyft.android.domain.ride.PassengerRideRequest.RideStep[rideRequestSession.getRideStep().ordinal()])
        {
        default:
            rideMap.centerToCurrentLocation();
            return;

        case 1: // '\001'
            rideRequestSession.setPickupLocation(location);
            return;

        case 2: // '\002'
            rideRequestSession.setDropoffLocation(location);
            break;
        }
    }

    ()
    {
        this$0 = PassengerRequestRideView.this;
        super();
    }
}
