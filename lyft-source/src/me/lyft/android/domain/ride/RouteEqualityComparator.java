// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ride;

import java.util.Arrays;
import java.util.List;

// Referenced classes of package me.lyft.android.domain.ride:
//            DriverRide, RideStatus

public class RouteEqualityComparator
    implements me.lyft.android.rx.ReactiveProperty.EqualityComparator
{

    public RouteEqualityComparator()
    {
    }

    public volatile boolean equals(Object obj, Object obj1)
    {
        return equals((DriverRide)obj, (DriverRide)obj1);
    }

    public boolean equals(DriverRide driverride, DriverRide driverride1)
    {
        if (driverride != driverride1)
        {
            if (driverride == null || driverride1 == null)
            {
                return false;
            }
            if (!driverride.getType().equals(driverride1.getType()) || !driverride.getStatus().equals(driverride1.getStatus()) || driverride.getPrimeTimePercent() != driverride1.getPrimeTimePercent())
            {
                return false;
            }
            if (!Arrays.equals(driverride.getPassengersFromCurrentRoute().toArray(), driverride1.getPassengersFromCurrentRoute().toArray()))
            {
                return false;
            }
            if (!Arrays.equals(driverride.getStopsFromCurrentRoute().toArray(), driverride1.getStopsFromCurrentRoute().toArray()))
            {
                return false;
            }
        }
        return true;
    }
}
