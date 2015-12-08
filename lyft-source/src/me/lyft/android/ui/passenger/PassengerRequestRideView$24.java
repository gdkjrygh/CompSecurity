// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.domain.location.Location;
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
        if (PassengerRequestRideView.access$5100(PassengerRequestRideView.this))
        {
            rideRequestSession.setPickupLocation(location);
            PassengerRequestRideView.access$4800(PassengerRequestRideView.this);
        }
    }

    ()
    {
        this$0 = PassengerRequestRideView.this;
        super();
    }
}
