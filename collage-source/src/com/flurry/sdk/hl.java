// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


// Referenced classes of package com.flurry.sdk:
//            fp, hq, hj

public class hl
{

    private static final String a = com/flurry/sdk/hl.getSimpleName();
    private long b;
    private boolean c;
    private boolean d;
    private hq e;

    public hl()
    {
        b = 1000L;
        c = true;
        d = false;
        e = new hq() {

            final hl a;

            public void safeRun()
            {
                (new hj()).b();
                if (hl.a(a) && hl.b(a))
                {
                    fp.a().b(hl.c(a), hl.d(a));
                }
            }

            
            {
                a = hl.this;
                super();
            }
        };
    }

    static boolean a(hl hl1)
    {
        return hl1.c;
    }

    static boolean b(hl hl1)
    {
        return hl1.d;
    }

    static hq c(hl hl1)
    {
        return hl1.e;
    }

    static long d(hl hl1)
    {
        return hl1.b;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = d;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        fp.a().b(e, b);
        d = true;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void a(long l)
    {
        b = l;
    }

    public void a(boolean flag)
    {
        c = flag;
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = d;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        fp.a().c(e);
        d = false;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

}
