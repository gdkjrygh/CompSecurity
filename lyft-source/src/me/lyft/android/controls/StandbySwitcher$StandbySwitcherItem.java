// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import me.lyft.android.domain.ride.FixedFare;

// Referenced classes of package me.lyft.android.controls:
//            ISwitcherItem

public class fare
    implements ISwitcherItem
{

    private final FixedFare fare;

    public String getActiveColor()
    {
        return null;
    }

    public FixedFare getFare()
    {
        return fare;
    }

    public String getId()
    {
        return fare.getFixedFareToken();
    }

    public (FixedFare fixedfare)
    {
        fare = fixedfare;
    }
}
