// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ride;

import java.util.List;
import me.lyft.android.common.Preconditions;

// Referenced classes of package me.lyft.android.domain.ride:
//            DriverRide, RideStatus, RideType

class RouteValidator
{

    RouteValidator()
    {
    }

    private static void checkArgument(boolean flag, Object obj, DriverRide driverride)
    {
        Preconditions.checkArgument(flag, (new StringBuilder()).append(obj).append(". Ride id: ").append(driverride.getCurrentRideId()).append(", ride status: ").append(driverride.getStatus()).toString());
    }

    public static void validate(DriverRide driverride)
    {
        boolean flag1 = true;
        boolean flag;
        if (driverride.getCurrentRideId() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        checkArgument(flag, "ride id is null", driverride);
        if (!driverride.getStatus().isNull())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        checkArgument(flag, "ride status is null", driverride);
        if (!driverride.getType().isNull())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        checkArgument(flag, "ride type is null", driverride);
        if (driverride.getStatus().isActive())
        {
            if (driverride.getPassengersFromCurrentRoute().size() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            checkArgument(flag, "route has 0 passengers", driverride);
            if (driverride.getPickupStops().size() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            checkArgument(flag, "route has 0 pickup stops", driverride);
        }
        if (driverride.getStatus().isPending() || driverride.getStatus().isAccepted() || driverride.getStatus().isPickedUp())
        {
            if (driverride.getIncompleteStops().size() > 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            checkArgument(flag, "active ride has 0 incomplete stops", driverride);
        }
    }
}
