// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.domain.ride.Passenger;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverDialogs

public class partySize extends DriverDialogs
{

    private Integer partySize;
    private Passenger passenger;

    public Integer getPartySize()
    {
        return partySize;
    }

    public Passenger getPassenger()
    {
        return passenger;
    }

    public A(Passenger passenger1, Integer integer)
    {
        passenger = passenger1;
        partySize = integer;
    }
}
