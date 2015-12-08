// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


// Referenced classes of package com.flurry.sdk:
//            ll, jy, jx

public class lk
{

    private static long a = 100L;
    private static lk b = null;
    private final ll c = new ll();

    public lk()
    {
        c.a(a);
        c.a(true);
    }

    public static lk a()
    {
        com/flurry/sdk/lk;
        JVM INSTR monitorenter ;
        lk lk1;
        if (b == null)
        {
            b = new lk();
        }
        lk1 = b;
        com/flurry/sdk/lk;
        JVM INSTR monitorexit ;
        return lk1;
        Exception exception;
        exception;
        throw exception;
    }

    public static void b()
    {
        com/flurry/sdk/lk;
        JVM INSTR monitorenter ;
        if (b != null)
        {
            b.c();
            b = null;
        }
        com/flurry/sdk/lk;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(jx jx)
    {
        this;
        JVM INSTR monitorenter ;
        jy.a().a("com.flurry.android.sdk.TickEvent", jx);
        if (jy.a().b("com.flurry.android.sdk.TickEvent") > 0)
        {
            c.a();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        jx;
        throw jx;
    }

    public void b(jx jx)
    {
        this;
        JVM INSTR monitorenter ;
        jy.a().b("com.flurry.android.sdk.TickEvent", jx);
        if (jy.a().b("com.flurry.android.sdk.TickEvent") == 0)
        {
            c.b();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        jx;
        throw jx;
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        jy.a().a("com.flurry.android.sdk.TickEvent");
        c.b();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
