// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ride;

import java.util.Collections;
import java.util.List;

// Referenced classes of package me.lyft.android.domain.ride:
//            DriverRide, RideStatus, RideType

public class  extends DriverRide
{

    private static DriverRide INSTANCE = new <init>();

    public List getIncompleteStops()
    {
        return Collections.emptyList();
    }

    public boolean isNull()
    {
        return true;
    }



    private ()
    {
        super(Collections.emptyList(), RideStatus.empty(), RideType.empty(), null, "", false, 0L, 0, null, false, false);
    }
}
