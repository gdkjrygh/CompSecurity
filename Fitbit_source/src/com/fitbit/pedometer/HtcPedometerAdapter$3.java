// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer;


// Referenced classes of package com.fitbit.pedometer:
//            HtcPedometerAdapter

class a
    implements Runnable
{

    final boolean a;
    final HtcPedometerAdapter b;

    public void run()
    {
        HtcPedometerAdapter.f(b);
        b.d(a);
        HtcPedometerAdapter.g(b);
        return;
        Exception exception;
        exception;
        HtcPedometerAdapter.g(b);
        throw exception;
    }

    (HtcPedometerAdapter htcpedometeradapter, boolean flag)
    {
        b = htcpedometeradapter;
        a = flag;
        super();
    }
}
