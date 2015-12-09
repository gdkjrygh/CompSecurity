// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import android.os.SystemClock;

// Referenced classes of package com.flurry.sdk:
//            hf, fp, hc, hq, 
//            fh

public class fo
    implements hf
{

    private static final String a = com/flurry/sdk/fo.getSimpleName();
    private long b;
    private long c;
    private long d;
    private long e;
    private long f;

    public fo()
    {
        b = 0L;
        c = 0L;
        d = -1L;
        e = 0L;
        f = 0L;
    }

    public void a()
    {
    }

    public void a(Context context)
    {
        b = System.currentTimeMillis();
        c = SystemClock.elapsedRealtime();
        fp.a().b(new hq() {

            final fo a;

            public void safeRun()
            {
                fh.a().c();
            }

            
            {
                a = fo.this;
                super();
            }
        });
    }

    public long b()
    {
        return b;
    }

    public void b(Context context)
    {
        long l = hc.a().c();
        if (l > 0L)
        {
            long l1 = e;
            e = (System.currentTimeMillis() - l) + l1;
        }
    }

    public long c()
    {
        return c;
    }

    public void c(Context context)
    {
        d = SystemClock.elapsedRealtime() - c;
    }

    public long d()
    {
        return d;
    }

    public long e()
    {
        return e;
    }

    public long f()
    {
        this;
        JVM INSTR monitorenter ;
        long l;
        l = SystemClock.elapsedRealtime() - c;
        if (l <= f)
        {
            break MISSING_BLOCK_LABEL_34;
        }
_L1:
        f = l;
        l = f;
        this;
        JVM INSTR monitorexit ;
        return l;
        l = f + 1L;
        f = l;
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

}
