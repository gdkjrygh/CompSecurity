// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            d, k

final class a
    implements Runnable
{

    private d a;

    public final void run()
    {
        boolean flag = false;
        d d1 = a;
        d1;
        JVM INSTR monitorenter ;
        long l = a.d - k.b();
        if (l <= 0L)
        {
            flag = true;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        a.c = false;
_L1:
        d1;
        JVM INSTR monitorexit ;
        if (flag)
        {
            a.b.run();
        }
        return;
        a.a.schedule(this, l, TimeUnit.MILLISECONDS);
          goto _L1
        Exception exception;
        exception;
        d1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    torService(d d1)
    {
        a = d1;
        super();
    }
}
