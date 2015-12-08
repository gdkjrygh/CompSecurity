// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns;


// Referenced classes of package com.roidapp.cloudlib.sns:
//            v, o

public class u
{

    private static u a;
    private v b;

    private u()
    {
        b = new v();
        b.b();
    }

    public static u a()
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        com/roidapp/cloudlib/sns/u;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new u();
        }
        com/roidapp/cloudlib/sns/u;
        JVM INSTR monitorexit ;
_L2:
        return a;
        Exception exception;
        exception;
        com/roidapp/cloudlib/sns/u;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final void a(o o)
    {
        if (b != null)
        {
            b.a(o);
        }
    }

    public final void a(Object obj)
    {
        if (b != null)
        {
            b.a(obj);
        }
    }

    public final void b()
    {
        if (b != null)
        {
            b.c();
            b = null;
        }
        a = null;
    }
}
