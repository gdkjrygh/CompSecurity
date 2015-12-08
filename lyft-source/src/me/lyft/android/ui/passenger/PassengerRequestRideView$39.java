// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.domain.location.Location;
import me.lyft.android.rx.ReactiveProperty;
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
        location.setSource("map");
        if (!PassengerRequestRideView.access$5100(PassengerRequestRideView.this)) goto _L2; else goto _L1
_L1:
        rideRequestSession.setPickupLocation(location);
_L4:
        PassengerRequestRideView.access$5500(PassengerRequestRideView.this);
        PassengerRequestRideView.access$4100(PassengerRequestRideView.this).onNext(Boolean.valueOf(false));
        return;
_L2:
        if (PassengerRequestRideView.access$5400(PassengerRequestRideView.this) && location.distanceTo(rideRequestSession.getPickupLocation()) > 30D)
        {
            rideRequestSession.setDropoffLocation(location);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    ()
    {
        this$0 = PassengerRequestRideView.this;
        super();
    }
}
