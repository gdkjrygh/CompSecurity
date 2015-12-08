// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.heartrate.HeartRateZone;
import java.util.Date;

public class ag
{

    public static final int a = 220;
    public static final int b = 30;

    public ag()
    {
    }

    public static double a()
    {
        Profile profile = an.a().b();
        if (profile != null)
        {
            return 220D - profile.b(new Date());
        } else
        {
            return 0.0D;
        }
    }

    private static int a(double d1, int i)
    {
        return (int)(((double)i * d1) / 100D);
    }

    public static HeartRateZone b()
    {
        HeartRateZone heartratezone = new HeartRateZone();
        double d1 = a();
        heartratezone.b(a(d1, 85));
        heartratezone.a(a(d1, 100));
        heartratezone.a(com.fitbit.data.domain.heartrate.HeartRateZone.HeartRateZoneType.PEAK);
        return heartratezone;
    }

    public static HeartRateZone c()
    {
        HeartRateZone heartratezone = new HeartRateZone();
        double d1 = a();
        heartratezone.b(a(d1, 70));
        heartratezone.a(a(d1, 85));
        heartratezone.a(com.fitbit.data.domain.heartrate.HeartRateZone.HeartRateZoneType.CARDIO);
        return heartratezone;
    }

    public static HeartRateZone d()
    {
        HeartRateZone heartratezone = new HeartRateZone();
        double d1 = a();
        heartratezone.b(a(d1, 50));
        heartratezone.a(a(d1, 70));
        heartratezone.a(com.fitbit.data.domain.heartrate.HeartRateZone.HeartRateZoneType.FAT_BURN);
        return heartratezone;
    }
}
