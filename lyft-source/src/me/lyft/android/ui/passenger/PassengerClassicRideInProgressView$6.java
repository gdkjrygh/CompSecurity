// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.passenger.Driver;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.rx.ReactiveProperty;
import me.lyft.android.ui.ride.RideMap;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerClassicRideInProgressView

class this._cls0
    implements Action1
{

    final PassengerClassicRideInProgressView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        PassengerClassicRideInProgressView.access$100(PassengerClassicRideInProgressView.this).onNext(passengerRideProvider.getPassengerRide().getDriver());
        PassengerClassicRideInProgressView.access$1000(PassengerClassicRideInProgressView.this).onNext(passengerRideProvider.getPassengerRide().getPassengers());
        PassengerClassicRideInProgressView.access$700(PassengerClassicRideInProgressView.this).onNext(passengerRideProvider.getPassengerRide().getDriver().getLocation());
        PassengerClassicRideInProgressView.access$1100(PassengerClassicRideInProgressView.this).onNext(passengerRideProvider.getPassengerRide().isPickedUp());
        PassengerClassicRideInProgressView.access$1200(PassengerClassicRideInProgressView.this).onNext(passengerRideProvider.getPassengerRide().isAccepted());
        PassengerClassicRideInProgressView.access$300(PassengerClassicRideInProgressView.this).onNext(passengerRideProvider.getPassengerRide().getDropoff());
        PassengerClassicRideInProgressView.access$500(PassengerClassicRideInProgressView.this).onNext(passengerRideProvider.getPassengerRide().getPickup());
        PassengerClassicRideInProgressView.access$1300(PassengerClassicRideInProgressView.this).onNext(passengerRideProvider.getPassengerRide().isArrived());
        PassengerClassicRideInProgressView.access$1400(PassengerClassicRideInProgressView.this).onNext(passengerRideProvider.getPassengerRide().getStops());
        PassengerClassicRideInProgressView.access$1500(PassengerClassicRideInProgressView.this, passengerRideProvider.getPassengerRide());
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
        this$0 = PassengerClassicRideInProgressView.this;
        super();
    }
}
