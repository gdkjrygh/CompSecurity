// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.passenger;

import java.util.List;
import me.lyft.android.common.Preconditions;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.ride.RideStatus;
import me.lyft.android.domain.ride.RideType;

// Referenced classes of package me.lyft.android.domain.passenger:
//            PassengerRide, Driver

class PassengerRideValidator
{

    PassengerRideValidator()
    {
    }

    private static void checkArgument(boolean flag, Object obj, PassengerRide passengerride)
    {
        Preconditions.checkArgument(flag, (new StringBuilder()).append(obj).append(". Ride id: ").append(passengerride.getId()).append(", ride status: ").append(passengerride.getStatus()).toString());
    }

    public static void validate(PassengerRide passengerride)
    {
        boolean flag1 = true;
        boolean flag;
        if (!Strings.isNullOrEmpty(passengerride.getId()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        checkArgument(flag, "ride id is null", passengerride);
        if (!passengerride.getStatus().isNull())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        checkArgument(flag, "ride status is null", passengerride);
        if (!passengerride.getRideType().isNull())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        checkArgument(flag, "ride type is null", passengerride);
        if (passengerride.getStatus().isActive())
        {
            if (passengerride.getPassengers().size() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            checkArgument(flag, "active ride has 0 passengers", passengerride);
            if (!passengerride.getPickup().isNull())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            checkArgument(flag, "pickup location is null", passengerride);
        }
        if (passengerride.getStatus().isActive() && passengerride.getRideType().isCourier())
        {
            if (!passengerride.getDropoff().isNull())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            checkArgument(flag, "dropoff location is null", passengerride);
        }
        if (passengerride.getStatus().isInProgress())
        {
            if (!passengerride.getDriver().isNull())
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            checkArgument(flag, "ride has no driver", passengerride);
        }
    }
}
