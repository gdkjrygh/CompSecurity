// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bfq
{

    private static final Object a;
    private static bfq b;
    private final bjz c = new bjz();
    private final bfl d = new bfl();
    private final bfr e = new bfr();
    private final cda f = new cda();

    protected bfq()
    {
        new bfg();
        new bjt();
    }

    public static bjz a()
    {
        return e().c;
    }

    public static bfl b()
    {
        return e().d;
    }

    public static bfr c()
    {
        return e().e;
    }

    public static cda d()
    {
        return e().f;
    }

    private static bfq e()
    {
        bfq bfq1;
        synchronized (a)
        {
            bfq1 = b;
        }
        return bfq1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        a = new Object();
        bfq bfq1 = new bfq();
        synchronized (a)
        {
            b = bfq1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
