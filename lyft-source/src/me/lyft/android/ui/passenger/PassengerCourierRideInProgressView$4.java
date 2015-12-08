// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.res.Resources;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.rx.ReactiveProperty;
import me.lyft.android.ui.ride.RideMap;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerCourierRideInProgressView

class this._cls0
    implements Action1
{

    final PassengerCourierRideInProgressView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        PassengerCourierRideInProgressView.access$300(PassengerCourierRideInProgressView.this).onNext(passengerRideProvider.getPassengerRide().getPassengers());
        PassengerCourierRideInProgressView.access$800(PassengerCourierRideInProgressView.this).onNext(passengerRideProvider.getPassengerRide().isPickedUp());
        PassengerCourierRideInProgressView.access$900(PassengerCourierRideInProgressView.this).onNext(passengerRideProvider.getPassengerRide().isAccepted());
        PassengerCourierRideInProgressView.access$1000(PassengerCourierRideInProgressView.this).onNext(passengerRideProvider.getPassengerRide().isArrived());
        unit = PassengerCourierRideInProgressView.access$1100(PassengerCourierRideInProgressView.this, passengerRideProvider.getPassengerRide().getCurrentStop().getPassenger());
        rideMap.refreshDriverMarker(unit, getResources().getColor(0x7f0c0071));
        PassengerCourierRideInProgressView.access$1200(PassengerCourierRideInProgressView.this, passengerRideProvider.getPassengerRide());
        if (passengerRideProvider.getPassengerRide().shouldHideLocationMarker())
        {
            rideMap.hideLocation();
            return;
        } else
        {
            rideMap.displayLocation();
            return;
        }
    }

    ()
    {
        this$0 = PassengerCourierRideInProgressView.this;
        super();
    }
}
