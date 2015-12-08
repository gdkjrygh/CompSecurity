// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


class lqk
{

    private static lqk d;
    volatile lql a;
    volatile String b;
    volatile String c;
    private volatile String e;

    lqk()
    {
        a = lql.a;
        c = null;
        b = null;
        e = null;
    }

    static lqk a()
    {
        lqk;
        JVM INSTR monitorenter ;
        lqk lqk1;
        if (d == null)
        {
            d = new lqk();
        }
        lqk1 = d;
        lqk;
        JVM INSTR monitorexit ;
        return lqk1;
        Exception exception;
        exception;
        lqk;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
