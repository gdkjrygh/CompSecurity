// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            eh, cm, ct, ee, 
//            es, fq, eu, ek, 
//            ip, at, ap, aq, 
//            dq, bo, io

public final class a
{

    private static final Object a;
    private static a b;
    private final eh c = new eh();
    private final cm d = new cm();
    private final ct e = new ct();
    private final ee f = new ee();
    private final es g = new es();
    private final fq h = new fq();
    private final eu i;
    private final ek j = new ek();
    private final io k = new ip();
    private final at l = new at();
    private final ap m = new ap();
    private final aq n = new aq();
    private final dq o = new dq();
    private final bo p = new bo();

    protected a()
    {
        i = eu.a(android.os.Build.VERSION.SDK_INT);
    }

    public static cm a()
    {
        return j().d;
    }

    public static ct b()
    {
        return j().e;
    }

    public static es c()
    {
        return j().g;
    }

    public static fq d()
    {
        return j().h;
    }

    public static eu e()
    {
        return j().i;
    }

    public static ek f()
    {
        return j().j;
    }

    public static ap g()
    {
        return j().m;
    }

    public static aq h()
    {
        return j().n;
    }

    public static dq i()
    {
        return j().o;
    }

    private static a j()
    {
        a a1;
        synchronized (a)
        {
            a1 = b;
        }
        return a1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        a = new Object();
        a a1 = new a();
        synchronized (a)
        {
            b = a1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
