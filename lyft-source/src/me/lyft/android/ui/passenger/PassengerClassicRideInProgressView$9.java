// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.domain.location.Location;
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
        call((Location)obj);
    }

    public void call(Location location)
    {
        rideMap.refreshDriverMarker();
    }

    ()
    {
        this$0 = PassengerClassicRideInProgressView.this;
        super();
    }
}
