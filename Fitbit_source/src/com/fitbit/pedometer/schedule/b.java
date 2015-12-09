// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer.schedule;

import android.os.PowerManager;
import com.fitbit.ApplicationForegroundController;
import com.fitbit.FitBitApplication;
import com.fitbit.e.a;
import com.fitbit.savedstate.PedometerSavedState;
import com.fitbit.savedstate.w;

// Referenced classes of package com.fitbit.pedometer.schedule:
//            c

public final class b extends c
{

    private static final String a = "HtcPedometerSchedulingPolicy";

    public b()
    {
    }

    public long a(SchedulingPolicy.ApplicationState applicationstate)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[SchedulingPolicy.ApplicationState.values().length];
                try
                {
                    a[com.fitbit.pedometer.schedule.SchedulingPolicy.ApplicationState.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[SchedulingPolicy.ApplicationState.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.fitbit.pedometer.schedule._cls1.a[applicationstate.ordinal()])
        {
        default:
            return -1L;

        case 1: // '\001'
            return (long)PedometerSavedState.l() * 1000L;

        case 2: // '\002'
            return (long)PedometerSavedState.k() * 60000L;
        }
    }

    public boolean a()
    {
        if (!super.a())
        {
            return false;
        }
        if (!((PowerManager)FitBitApplication.a().getSystemService("power")).isScreenOn())
        {
            com.fitbit.e.a.a("HtcPedometerSchedulingPolicy", "PedometerService is not scheduled: screen is off.", new Object[0]);
            return false;
        }
        if (!ApplicationForegroundController.a().b() && !w.h())
        {
            com.fitbit.e.a.a("HtcPedometerSchedulingPolicy", "PedometerService is not scheduled: application is in background and widget is not enabled.", new Object[0]);
            return false;
        } else
        {
            return true;
        }
    }
}
