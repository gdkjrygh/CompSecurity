// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


// Referenced classes of package com.flurry.sdk:
//            fb

public class fa
{

    private static long a = 1000L;
    private static fa b = null;
    private final fb c = new fb();

    public fa()
    {
        c.a(a);
        c.a(true);
    }

    public static fa a()
    {
        com/flurry/sdk/fa;
        JVM INSTR monitorenter ;
        fa fa1;
        if (b == null)
        {
            b = new fa();
        }
        fa1 = b;
        com/flurry/sdk/fa;
        JVM INSTR monitorexit ;
        return fa1;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(fb.a a1)
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

    public boolean b(fb.a a1)
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
