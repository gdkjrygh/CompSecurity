// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bkv
{

    private static final Object a;
    private static bkv b;
    private final bir c = new bir();
    private final bhk d = new bhk();
    private final bhq e = new bhq();
    private final chp f = new chp();
    private final cjj g = new cjj();
    private final clc h = new clc();
    private final cjl i;
    private final cix j = new cix();
    private final cnp k = new cnq();
    private final cbf l = new cbf();
    private final cim m = new cim();
    private final caz n = new caz();
    private final cay o = new cay();
    private final cba p = new cba();
    private final bim q = new bim();
    private final ckb r = new ckb();
    private final ceu s = new ceu();
    private final cdy t = new cdy();

    protected bkv()
    {
        int i1 = android.os.Build.VERSION.SDK_INT;
        Object obj;
        if (i1 >= 19)
        {
            obj = new cjs();
        } else
        if (i1 >= 18)
        {
            obj = new cjq();
        } else
        if (i1 >= 17)
        {
            obj = new cjp();
        } else
        if (i1 >= 16)
        {
            obj = new cjr();
        } else
        if (i1 >= 14)
        {
            obj = new cjo();
        } else
        if (i1 >= 11)
        {
            obj = new cjn();
        } else
        if (i1 >= 9)
        {
            obj = new cjm();
        } else
        {
            obj = new cjl();
        }
        i = ((cjl) (obj));
    }

    public static bir a()
    {
        return s().c;
    }

    public static bhk b()
    {
        return s().d;
    }

    public static bhq c()
    {
        return s().e;
    }

    public static chp d()
    {
        return s().f;
    }

    public static cjj e()
    {
        return s().g;
    }

    public static clc f()
    {
        return s().h;
    }

    public static cjl g()
    {
        return s().i;
    }

    public static cix h()
    {
        return s().j;
    }

    public static cnp i()
    {
        return s().k;
    }

    public static cbf j()
    {
        return s().l;
    }

    public static cim k()
    {
        return s().m;
    }

    public static caz l()
    {
        return s().n;
    }

    public static cay m()
    {
        return s().o;
    }

    public static cba n()
    {
        return s().p;
    }

    public static bim o()
    {
        return s().q;
    }

    public static ckb p()
    {
        return s().r;
    }

    public static ceu q()
    {
        return s().s;
    }

    public static cdy r()
    {
        return s().t;
    }

    private static bkv s()
    {
        bkv bkv1;
        synchronized (a)
        {
            bkv1 = b;
        }
        return bkv1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        a = new Object();
        bkv bkv1 = new bkv();
        synchronized (a)
        {
            b = bkv1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
