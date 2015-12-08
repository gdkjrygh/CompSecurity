// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


// Referenced classes of package com.flurry.sdk:
//            ey

public class ex
{

    private static long a = 1000L;
    private static ex b = null;
    private final ey c = new ey();

    public ex()
    {
        c.a(a);
        c.a(true);
    }

    public static ex a()
    {
        com/flurry/sdk/ex;
        JVM INSTR monitorenter ;
        ex ex1;
        if (b == null)
        {
            b = new ex();
        }
        ex1 = b;
        com/flurry/sdk/ex;
        JVM INSTR monitorexit ;
        return ex1;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(ey.a a1)
    {
        this;
        JVM INSTR monitorenter ;
        c.a(a1);
        if (!c.c() && c.d() > 0)
        {
            c.a();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        throw a1;
    }

    public boolean b(ey.a a1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        flag = c.b(a1);
        if (c.d() == 0)
        {
            c.b();
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        a1;
        throw a1;
    }

}
