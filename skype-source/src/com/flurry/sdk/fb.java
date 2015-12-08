// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.flurry.sdk:
//            dt, do, ff, eo

public class fb
{
    public static interface a
    {

        public abstract void a(fb fb1);
    }


    private static final String a = com/flurry/sdk/fb.getSimpleName();
    private final dt b = new dt();
    private long c;
    private boolean d;
    private boolean e;
    private ff f;

    public fb()
    {
        c = 1000L;
        d = true;
        e = false;
        f = new ff() {

            final fb a;

            public void a()
            {
                try
                {
                    for (Iterator iterator = fb.a(a).iterator(); iterator.hasNext(); ((a)iterator.next()).a(a)) { }
                }
                catch (Throwable throwable)
                {
                    eo.a(6, fb.e(), "", throwable);
                }
                if (fb.b(a) && fb.c(a))
                {
                    com.flurry.sdk.do.a().a(fb.d(a), fb.e(a));
                }
            }

            
            {
                a = fb.this;
                super();
            }
        };
    }

    static List a(fb fb1)
    {
        return fb1.f();
    }

    static boolean b(fb fb1)
    {
        return fb1.d;
    }

    static boolean c(fb fb1)
    {
        return fb1.e;
    }

    static ff d(fb fb1)
    {
        return fb1.f;
    }

    static long e(fb fb1)
    {
        return fb1.c;
    }

    static String e()
    {
        return a;
    }

    private List f()
    {
        this;
        JVM INSTR monitorenter ;
        List list = b.a();
        this;
        JVM INSTR monitorexit ;
        return list;
        Exception exception;
        exception;
        throw exception;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = e;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        com.flurry.sdk.do.a().a(f, c);
        e = true;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void a(long l)
    {
        c = l;
    }

    public void a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        b.a(a1);
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        throw a1;
    }

    public void a(boolean flag)
    {
        d = flag;
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = e;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        com.flurry.sdk.do.a().b(f);
        e = false;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public boolean b(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = b.b(a1);
        this;
        JVM INSTR monitorexit ;
        return flag;
        a1;
        throw a1;
    }

    public boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = e;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public int d()
    {
        this;
        JVM INSTR monitorenter ;
        int i = b.b();
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

}
