// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ride;

import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.map.lyft.MapOwner;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.ride:
//            RideMap

class this._cls0
    implements Action1
{

    final RideMap this$0;

    public volatile void call(Object obj)
    {
        call((Location)obj);
    }

    public void call(Location location)
    {
        Location location1 = RideMap.access$200(RideMap.this).getDriverRide().getCurrentStop().getLocation();
        if (location1.isNull())
        {
            RideMap.access$100(RideMap.this).centerWithPadding(location, RideMap.access$100(RideMap.this).getCameraZoom());
            return;
        } else
        {
            fitMapTo(new Location[] {
                location, location1
            });
            return;
        }
    }

    cation()
    {
        this$0 = RideMap.this;
        super();
    }
}
