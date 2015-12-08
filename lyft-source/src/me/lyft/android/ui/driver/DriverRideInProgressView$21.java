// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.res.Resources;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.ride.RideMap;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideInProgressView

class val.stop extends AsyncCall
{

    final DriverRideInProgressView this$0;
    final Stop val$stop;

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Location)obj);
    }

    public void onSuccess(Location location)
    {
        super.onSuccess(location);
        DriverRideInProgressView.access$4300(DriverRideInProgressView.this, location, getResources().getColor(0x7f0c000b), getResources().getColor(0x7f0c0070));
        rideMap.fitMapTo(new Location[] {
            location, val$stop.getLocation()
        });
    }

    ()
    {
        this$0 = final_driverrideinprogressview;
        val$stop = Stop.this;
        super();
    }
}
