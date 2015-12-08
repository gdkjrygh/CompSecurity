// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


// Referenced classes of package com.flurry.sdk:
//            hl, fz, fy

public class hk
{

    private static long a = 100L;
    private static hk b = null;
    private final hl c = new hl();

    public hk()
    {
        c.a(a);
        c.a(true);
    }

    public static hk a()
    {
        com/flurry/sdk/hk;
        JVM INSTR monitorenter ;
        hk hk1;
        if (b == null)
        {
            b = new hk();
        }
        hk1 = b;
        com/flurry/sdk/hk;
        JVM INSTR monitorexit ;
        return hk1;
        Exception exception;
        exception;
        throw exception;
    }

    public static void b()
    {
        com/flurry/sdk/hk;
        JVM INSTR monitorenter ;
        if (b != null)
        {
            b.c();
            b = null;
        }
        com/flurry/sdk/hk;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(fy fy)
    {
        this;
        JVM INSTR monitorenter ;
        fz.a().a("com.flurry.android.sdk.TickEvent", fy);
        if (fz.a().b("com.flurry.android.sdk.TickEvent") > 0)
        {
            c.a();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        fy;
        throw fy;
    }

    public void b(fy fy)
    {
        this;
        JVM INSTR monitorenter ;
        fz.a().b("com.flurry.android.sdk.TickEvent", fy);
        if (fz.a().b("com.flurry.android.sdk.TickEvent") == 0)
        {
            c.b();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        fy;
        throw fy;
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        fz.a().a("com.flurry.android.sdk.TickEvent");
        c.b();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
