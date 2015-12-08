// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.res.Resources;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.ui.ride.RideMap;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerClassicRideInProgressView, PassengerRideAddressInput

class this._cls0
    implements Action1
{

    final PassengerClassicRideInProgressView this$0;

    public volatile void call(Object obj)
    {
        call((Location)obj);
    }

    public void call(Location location)
    {
        rideMap.showPickupMarker(passengerRideProvider.getPassengerRide().getPickup());
        if (Strings.isNullOrEmpty(location.getDisplayName()))
        {
            passengerRideAddressInput.setPickupAddress(getResources().getString(0x7f07023e));
            return;
        } else
        {
            passengerRideAddressInput.setPickupAddress(location.getDisplayName());
            return;
        }
    }

    ()
    {
        this$0 = PassengerClassicRideInProgressView.this;
        super();
    }
}
