// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import java.util.Random;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            m

public final class <init>
{

    volatile String a;
    private m b;

    static void a(<init> <init>1)
    {
        <init>1.b.h = false;
        <init>1.b.a(0);
    }

    static void b(b b1)
    {
        b1.b();
    }

    final void a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = m.n(b);
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        b b1 = b.f.a();
        if (b1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        m.b(b1.a);
        (new Thread(b1, "DataRequestDispatcher")).start();
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    final void b()
    {
        boolean flag;
        if (!b.a() && b.f.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            a();
        }
    }

    final long c()
    {
        this;
        JVM INSTR monitorenter ;
        m.o(b);
        JVM INSTR tableswitch 4 4: default 89
    //                   4 40;
           goto _L1 _L2
_L1:
        long l = m.p(b);
_L4:
        this;
        JVM INSTR monitorexit ;
        return l;
_L2:
        long l1;
        long l2;
        l = m.p(b);
        l1 = m.q(b).nextLong();
        l2 = m.p(b);
        l = l + 800L + l1 % l2;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private (m m1, String s)
    {
        b = m1;
        super();
        a = s;
    }

    a(m m1, String s, byte byte0)
    {
        this(m1, s);
    }
}
