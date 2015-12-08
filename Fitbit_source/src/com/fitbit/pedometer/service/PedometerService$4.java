// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer.service;

import android.content.Intent;
import com.fitbit.pedometer.e;

// Referenced classes of package com.fitbit.pedometer.service:
//            PedometerService

class c
    implements com.fitbit.pedometer.rvice._cls4
{

    final Intent a;
    final int b;
    final int c;
    final PedometerService d;

    public void a(e e1)
    {
    /* block-local class not found */
    class _cls1 {}

        e.a(new _cls1(e1));
    }

    public volatile void a(Object obj)
    {
        a((e)obj);
    }

    _cls1(PedometerService pedometerservice, Intent intent, int i, int j)
    {
        d = pedometerservice;
        a = intent;
        b = i;
        c = j;
        super();
    }
}
