// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo;


// Referenced classes of package com.fitbit.data.repo:
//            o, ag

public abstract class l
{

    private static o a;
    private static ag b;

    public l()
    {
    }

    public static o a()
    {
        com/fitbit/data/repo/l;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new o();
        }
        com/fitbit/data/repo/l;
        JVM INSTR monitorexit ;
        return a;
        Exception exception;
        exception;
        com/fitbit/data/repo/l;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static ag b()
    {
        com/fitbit/data/repo/l;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new ag();
        }
        com/fitbit/data/repo/l;
        JVM INSTR monitorexit ;
        return b;
        Exception exception;
        exception;
        com/fitbit/data/repo/l;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public abstract void a(String s, byte abyte0[]);

    public abstract byte[] a(String s);

    public abstract void b(String s);

    public abstract void c();

    public abstract boolean c(String s);
}
