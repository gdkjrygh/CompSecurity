// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.analytics.ScreenAnalytics;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.location.Location;
import me.lyft.android.ui.ride.RideMap;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRequestRideView, PassengerRideAddressInput, RequestRideButton

class this._cls0
    implements Action1
{

    final PassengerRequestRideView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        ScreenAnalytics.trackScreenView("passenger_line_request_ride");
        passengerRideAddressInput.unfocusStretchEqually();
        requestRideButton.switchToRequestRide();
        unit = rideRequestSession.getPickupLocation();
        Location location = rideRequestSession.getDropoffLocation();
        rideMap.showPickupMarker(unit);
        rideMap.showDestinationMarker(location);
        rideMap.fitMapTo(new Location[] {
            unit, location
        });
        PassengerRequestRideView.access$6800(PassengerRequestRideView.this);
        rideMap.clearHotspotMarkers();
        rideMap.clearShortcutMarkers();
    }

    ()
    {
        this$0 = PassengerRequestRideView.this;
        super();
    }
}
