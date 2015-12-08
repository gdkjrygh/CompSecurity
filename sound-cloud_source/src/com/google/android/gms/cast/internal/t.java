// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.cast.internal:
//            p, s

public final class t
{

    public static final Object b = new Object();
    private static final p f = new p("RequestTracker");
    long a;
    private long c;
    private long d;
    private s e;

    public t()
    {
        c = 0x5265c00L;
        a = -1L;
        d = 0L;
    }

    final void a()
    {
        a = -1L;
        e = null;
        d = 0L;
    }

    public final void a(long l, s s1)
    {
        s s2;
        synchronized (b)
        {
            s2 = e;
            a = l;
            e = s1;
            d = SystemClock.elapsedRealtime();
        }
        if (s2 != null)
        {
            s2.a();
        }
        return;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final boolean a(long l)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (a != -1L && a == l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean a(long l, int i, Object obj)
    {
        s s1;
        boolean flag;
        flag = true;
        s1 = null;
        Object obj1 = b;
        obj1;
        JVM INSTR monitorenter ;
        if (a == -1L || a != l)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        f.a("request %d completed", new Object[] {
            Long.valueOf(a)
        });
        s1 = e;
        a();
_L2:
        if (s1 != null)
        {
            s1.a(i, obj);
        }
        return flag;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        flag = false;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final boolean b()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (a != -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean b(long l)
    {
        boolean flag = true;
        Object obj1 = b;
        obj1;
        JVM INSTR monitorenter ;
        Object obj;
        if (a == -1L || l - d < c)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        f.a("request %d timed out", new Object[] {
            Long.valueOf(a)
        });
        obj = e;
        a();
_L2:
        if (obj != null)
        {
            ((s) (obj)).a(2102, null);
        }
        return flag;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        flag = false;
        obj = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

}
