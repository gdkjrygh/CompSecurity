// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.res.Resources;
import me.lyft.android.domain.location.Location;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.ride.RideMap;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideAcceptView

class val.pickupLocation extends AsyncCall
{

    final DriverRideAcceptView this$0;
    final Location val$pickupLocation;

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Location)obj);
    }

    public void onSuccess(Location location)
    {
        super.onSuccess(location);
        rideMap.showDriverDirections(location, val$pickupLocation, getResources().getColor(0x7f0c000b));
        rideMap.fitMapTo(new Location[] {
            val$pickupLocation, location
        });
    }

    ()
    {
        this$0 = final_driverrideacceptview;
        val$pickupLocation = Location.this;
        super();
    }
}
