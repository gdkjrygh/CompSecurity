// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.ui.ride.RideMap;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerClassicRideMatchingView, PassengerRideAddressInput

class this._cls0
    implements Action1
{

    final PassengerClassicRideMatchingView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        rideMap.bindPadding(passengerRideTop, passengerRideBottom);
        unit = passengerRideProvider.getPassengerRide();
        Location location = unit.getPickup();
        Location location1 = unit.getDropoff();
        rideMap.showPickupMarker(location);
        if (!location1.isNull())
        {
            rideMap.showDestinationMarker(unit.getDropoff());
            rideMap.fitMapTo(new Location[] {
                location, unit.getDropoff()
            });
        } else
        {
            rideMap.clearDestinationMarker();
            rideMap.centerToLocationWithZoom(location, 16F);
        }
        passengerRideAddressInput.setDropoffAddress(PassengerClassicRideMatchingView.access$000(PassengerClassicRideMatchingView.this, location1));
    }

    ()
    {
        this$0 = PassengerClassicRideMatchingView.this;
        super();
    }
}
