// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


// Referenced classes of package com.flurry.sdk:
//            jo, lr

public class ll
{

    private static final String a = com/flurry/sdk/ll.getSimpleName();
    private long b;
    private boolean c;
    private boolean d;
    private lr e;

    public ll()
    {
        b = 1000L;
        c = true;
        d = false;
        e = new _cls1();
    }

    static boolean a(ll ll1)
    {
        return ll1.c;
    }

    static boolean b(ll ll1)
    {
        return ll1.d;
    }

    static lr c(ll ll1)
    {
        return ll1.e;
    }

    static long d(ll ll1)
    {
        return ll1.b;
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
        jo.a().b(e, b);
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
        jo.a().c(e);
        d = false;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }


    private class _cls1 extends lr
    {

        final ll a;

        public void a()
        {
            (new lj()).b();
            if (ll.a(a) && ll.b(a))
            {
                jo.a().b(ll.c(a), ll.d(a));
            }
        }

        _cls1()
        {
            a = ll.this;
            super();
        }
    }

}
