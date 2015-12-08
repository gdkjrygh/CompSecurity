// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer.service;

import android.content.Intent;
import com.fitbit.data.domain.Length;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.pedometer.service:
//            PedometerService

class readName extends c
{

    final PedometerService a;

    public void a(Intent intent)
    {
        if ("com.fitbit.controllers.AlarmsController.ACTION_MIDNIGHT_COMES".equals(intent.getAction()))
        {
            a.a(0, 0.0D, new Length(0.0D, com.fitbit.data.domain.KM));
        }
    }

    readName(PedometerService pedometerservice, com.fitbit.util.threading..ThreadName threadname)
    {
        a = pedometerservice;
        super(threadname);
    }
}
