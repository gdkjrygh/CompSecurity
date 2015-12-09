// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer.schedule;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.fitbit.FitBitApplication;

// Referenced classes of package com.fitbit.pedometer.schedule:
//            c

public final class a extends c
{

    private static final String a = "GooglePedometerSchedulingPolicy";
    private static final long b = 30000L;

    public a()
    {
    }

    public long a(SchedulingPolicy.ApplicationState applicationstate)
    {
        if (applicationstate == SchedulingPolicy.ApplicationState.b || applicationstate == SchedulingPolicy.ApplicationState.c)
        {
            applicationstate = ((SensorManager)FitBitApplication.a().getSystemService("sensor")).getDefaultSensor(18);
            if (applicationstate != null)
            {
                return Math.max(60000L, (long)(applicationstate.getFifoReservedEventCount() / 300) * 60000L - 60000L);
            } else
            {
                com.fitbit.e.a.e("GooglePedometerSchedulingPolicy", (new StringBuilder()).append("Use default background flush interval ").append(60000L).toString(), new Object[0]);
                return 60000L;
            }
        } else
        {
            return 30000L;
        }
    }

    public volatile boolean a()
    {
        return super.a();
    }
}
