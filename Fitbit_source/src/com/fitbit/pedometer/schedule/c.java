// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer.schedule;

import com.fitbit.e.a;
import com.fitbit.pedometer.e;
import com.fitbit.util.p;

// Referenced classes of package com.fitbit.pedometer.schedule:
//            SchedulingPolicy

abstract class c
    implements SchedulingPolicy
{

    private static final String a = "PedometerSchedulingPolicy";

    c()
    {
    }

    public boolean a()
    {
        if (!e.h())
        {
            com.fitbit.e.a.a("PedometerSchedulingPolicy", "PedometerService is not scheduled: pedometer is not supported.", new Object[0]);
            return false;
        }
        if (!p.l())
        {
            com.fitbit.e.a.a("PedometerSchedulingPolicy", "PedometerService is not scheduled: pedometer is not paired.", new Object[0]);
            return false;
        } else
        {
            return true;
        }
    }
}
