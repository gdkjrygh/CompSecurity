// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.hardware;


// Referenced classes of package com.facebook.common.hardware:
//            n

public class o
{

    final n a;
    private final android.os.PowerManager.WakeLock b;
    private final String c;
    private int d;
    private long e;
    private long f;
    private int g;
    private boolean h;

    o(n n, android.os.PowerManager.WakeLock wakelock, String s)
    {
        a = n;
        super();
        b = wakelock;
        c = s;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        a(-1L);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(long l)
    {
        this;
        JVM INSTR monitorenter ;
        c();
        if (l >= 0L)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        b.acquire();
_L1:
        d = d + 1;
        if (d == 1)
        {
            e = System.currentTimeMillis();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        b.acquire(l);
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = h;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (d != 0)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        g = g + 1;
          goto _L1
        Exception exception;
        exception;
        throw exception;
        b.release();
        d = d - 1;
        if (d == 0)
        {
            f = f + (System.currentTimeMillis() - e);
        }
          goto _L1
    }

    public void c()
    {
        if (h)
        {
            throw new RuntimeException("Wake lock already disposed");
        } else
        {
            return;
        }
    }
}
