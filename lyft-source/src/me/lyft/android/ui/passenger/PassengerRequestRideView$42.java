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
//            PassengerRequestRideView, RequestRideButton

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
        ScreenAnalytics.trackScreenView("passenger_regular_request_ride");
        requestRideButton.switchToRequestRide();
        rideMap.clearPickupMarker();
        rideMap.clearDestinationMarker();
        rideMap.clearHotspotMarkers();
        rideMap.clearShortcutMarkers();
        unit = rideRequestSession.getPickupLocation();
        if (!unit.isNull())
        {
            rideMap.centerToLocationWithoutPadding(unit);
        }
        PassengerRequestRideView.access$6700(PassengerRequestRideView.this);
    }

    ()
    {
        this$0 = PassengerRequestRideView.this;
        super();
    }
}
