// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.domain.ride.FixedFare;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerDialogs

public class fare extends PassengerDialogs
{

    private final FixedFare fare;

    public FixedFare getFare()
    {
        return fare;
    }

    public (FixedFare fixedfare)
    {
        fare = fixedfare;
    }
}
