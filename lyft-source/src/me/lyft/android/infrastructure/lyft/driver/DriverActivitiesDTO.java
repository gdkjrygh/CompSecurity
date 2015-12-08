// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.driver;

import me.lyft.android.infrastructure.lyft.payment.MoneyDTO;

public class DriverActivitiesDTO
{

    public static final String TYPE_DAILY = "daily";
    public static final String TYPE_WEEKLY = "weekly";
    public final MoneyDTO amountEarned;
    public final Integer rideCount;
    public final String subtitle;
    public final Integer timeDrivenSeconds;
    public final String title;
    public final String type;

    public DriverActivitiesDTO(String s, MoneyDTO moneydto, Integer integer, Integer integer1, String s1, String s2)
    {
        type = s;
        amountEarned = moneydto;
        rideCount = integer;
        timeDrivenSeconds = integer1;
        title = s1;
        subtitle = s2;
    }
}
