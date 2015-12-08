// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.ride.RequestRideType;
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
        PassengerRequestRideView.access$5000(PassengerRequestRideView.this, location, PassengerRequestRideView.access$1500(PassengerRequestRideView.this), PassengerRequestRideView.access$4900(PassengerRequestRideView.this));
        if (PassengerRequestRideView.access$5100(PassengerRequestRideView.this) || !rideRequestSession.getCurrentRideType().isCourier())
        {
            rideMap.centerToLocationWithoutPadding(location);
        }
        if (rideRequestSession.getPickupLocation().isNull())
        {
            PassengerRequestRideView.access$5200(PassengerRequestRideView.this);
        }
    }

    ()
    {
        this$0 = PassengerRequestRideView.this;
        super();
    }
}
