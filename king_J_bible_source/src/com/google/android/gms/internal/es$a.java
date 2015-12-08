// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.internal:
//            es, ev

private class <init>
    implements Runnable
{

    final es zW;

    public void run()
    {
        boolean flag;
        flag = false;
        es.a(zW, false);
        long l = SystemClock.elapsedRealtime();
        es.a(zW).d(l, 3);
        es.b(zW).d(l, 3);
        es.c(zW).d(l, 3);
        es.d(zW).d(l, 3);
        es.e(zW).d(l, 3);
        es.f(zW).d(l, 3);
        es.g(zW).d(l, 3);
        es.h(zW).d(l, 3);
        Object obj = ev.Ab;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        if (es.a(zW).dU() || es.e(zW).dU() || es.f(zW).dU() || es.g(zW).dU() || es.h(zW).dU())
        {
            flag = true;
        }
        obj;
        JVM INSTR monitorexit ;
        es.b(zW, flag);
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private (es es1)
    {
        zW = es1;
        super();
    }

    zW(es es1, zW zw)
    {
        this(es1);
    }
}
