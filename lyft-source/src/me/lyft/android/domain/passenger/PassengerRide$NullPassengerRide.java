// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.passenger;

import java.util.Collections;
import me.lyft.android.domain.location.NullLocation;
import me.lyft.android.domain.ride.RideStatus;
import me.lyft.android.domain.ride.RideType;

// Referenced classes of package me.lyft.android.domain.passenger:
//            PassengerRide, Driver

class  extends PassengerRide
{

    private static final PassengerRide INSTANCE = new <init>();

    public static PassengerRide getInstance()
    {
        return INSTANCE;
    }

    public boolean isNull()
    {
        return true;
    }


    private ()
    {
        super("", Driver.empty(), RideType.empty(), RideStatus.empty(), NullLocation.getInstance(), NullLocation.getInstance(), Collections.emptyList(), Collections.emptyList(), 0, false, 0);
    }
}
