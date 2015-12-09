// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer.service;

import android.content.Intent;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.pedometer.service:
//            PedometerService

class readName extends c
{

    final PedometerService a;

    public void a(Intent intent)
    {
        if ("com.fitbit.SavedState.SoftTrackerData.ACTION_LIVE_DATA_OFFSET_CHANGED".equals(intent.getAction()))
        {
            a.a(PedometerService.a(a), PedometerService.b(a), com.fitbit.pedometer.service.PedometerService.c(a));
        }
    }

    readName(PedometerService pedometerservice, com.fitbit.util.threading..ThreadName threadname)
    {
        a = pedometerservice;
        super(threadname);
    }
}
