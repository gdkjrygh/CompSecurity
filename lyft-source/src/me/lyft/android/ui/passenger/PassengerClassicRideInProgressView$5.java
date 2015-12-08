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
        rideMap.showDestinationMarker(passengerRideProvider.getPassengerRide().getDropoff());
        if (location.isNull())
        {
            passengerRideAddressInput.setDropoffAddress("");
        } else
        if (Strings.isNullOrEmpty(location.getDisplayName()))
        {
            passengerRideAddressInput.setDropoffAddress(getResources().getString(0x7f070064));
        } else
        {
            passengerRideAddressInput.setDropoffAddress(location.getDisplayName());
        }
        if (location.isNull())
        {
            passengerRideAddressInput.focusAndStretchDropoffAddress();
            return;
        } else
        {
            passengerRideAddressInput.focusAndStretchPickupAddress();
            return;
        }
    }

    ()
    {
        this$0 = PassengerClassicRideInProgressView.this;
        super();
    }
}
