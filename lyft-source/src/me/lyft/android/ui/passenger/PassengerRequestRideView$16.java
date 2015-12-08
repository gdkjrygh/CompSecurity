// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.controls.RideTypeSwitcher;
import me.lyft.android.domain.ride.RequestRideType;
import me.lyft.android.rx.ReactiveProperty;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRequestRideView, PassengerRideAddressInput

class this._cls0
    implements Action1
{

    final PassengerRequestRideView this$0;

    public volatile void call(Object obj)
    {
        call((RequestRideType)obj);
    }

    public void call(RequestRideType requestridetype)
    {
        requestridetype = requestridetype.getId();
        PassengerRequestRideView.access$5500(PassengerRequestRideView.this);
        rideTypeSwitcher.animateThumbToItemId(requestridetype);
        PassengerRequestRideView.access$3500(PassengerRequestRideView.this).onNext("");
        if (rideRequestSession.getCurrentRideType().isCourier())
        {
            passengerRideAddressInput.showPickupAndDropoff();
        } else
        {
            PassengerRequestRideView.access$4600(PassengerRequestRideView.this);
            passengerRideAddressInput.showPickupOnly();
        }
        PassengerRequestRideView.access$5600(PassengerRequestRideView.this);
        PassengerRequestRideView.access$5700(PassengerRequestRideView.this);
    }

    ()
    {
        this$0 = PassengerRequestRideView.this;
        super();
    }
}
