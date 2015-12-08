// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bs;

import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ac.c;
import com.google.android.m4b.maps.ay.m;
import com.google.android.m4b.maps.ay.n;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.OutputStream;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.m4b.maps.bs:
//            e

final class c extends n
{

    final e a;
    private final String b;
    private final m c;

    static m a(c c1)
    {
        return c1.c;
    }

    static String b(c c1)
    {
        return c1.b;
    }

    public final void a(DataOutput dataoutput)
    {
        a a1 = new a(com.google.android.m4b.maps.cq.n.a);
        e e1 = a;
        e1;
        JVM INSTR monitorenter ;
        int j = com.google.android.m4b.maps.bs.e.a(a).j(1);
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        a a2;
        a a3;
        int k;
        a2 = com.google.android.m4b.maps.bs.e.a(a).c(1, i);
        a3 = new a(com.google.android.m4b.maps.cq.n.d);
        k = com.google.android.m4b.maps.ac.c.a(a2, 1, -1);
        if (k == -1)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        a3.a(1, k);
        if (a2.i(2))
        {
            a3.a(2, a2.e(2));
        }
        a1.a(1, a3);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        e1;
        JVM INSTR monitorexit ;
        a.a(e.g(a), a1);
        a1.a((OutputStream)dataoutput, true);
        return;
        dataoutput;
        e1;
        JVM INSTR monitorexit ;
        throw dataoutput;
    }

    public final boolean a(DataInput datainput)
    {
        a a1;
        boolean flag;
        int j;
        flag = false;
        a1 = com.google.android.m4b.maps.ac.c.a(com.google.android.m4b.maps.cq.n.c, datainput);
        j = a1.j(1);
        datainput = a;
        datainput;
        JVM INSTR monitorenter ;
        int i = 0;
_L4:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        a a2 = a1.c(1, i);
        boolean flag1 = flag;
        if (!a2.i(2))
        {
            break MISSING_BLOCK_LABEL_213;
        }
        flag1 = flag;
        if (!com.google.android.m4b.maps.bs.e.a(a, a2))
        {
            break MISSING_BLOCK_LABEL_213;
        }
        e.b(a, a2);
        flag1 = true;
        break MISSING_BLOCK_LABEL_213;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        com.google.android.m4b.maps.bs.e.a(com.google.android.m4b.maps.bs.e.a(a), b);
        e.b(a);
        datainput;
        JVM INSTR monitorexit ;
        com.google.android.m4b.maps.bs.e.c(a);
        datainput = ((DataInput) (e.d(a)));
        datainput;
        JVM INSTR monitorenter ;
        e.e(a);
        if (!e.f(a))
        {
            break MISSING_BLOCK_LABEL_173;
        }
        com.google.android.m4b.maps.bs.e.a(a, c, b);
_L2:
        return true;
        Exception exception;
        exception;
        datainput;
        JVM INSTR monitorexit ;
        throw exception;
        Runnable runnable = new Runnable() {

            private e.b a;

            public final void run()
            {
                com.google.android.m4b.maps.bs.e.a(a.a, com.google.android.m4b.maps.bs.e.b.a(a), e.b.b(a));
            }

            
            {
                a = e.b.this;
                super();
            }
        };
        com.google.android.m4b.maps.bs.e.a(a, com.google.android.m4b.maps.bs.e.a().schedule(runnable, 3L, TimeUnit.HOURS));
        if (true) goto _L2; else goto _L1
_L1:
        runnable;
        datainput;
        JVM INSTR monitorexit ;
        throw runnable;
        i++;
        flag = flag1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean c()
    {
        return false;
    }

    public final boolean d()
    {
        return true;
    }

    public final int g()
    {
        return 75;
    }

    public _cls1.a(e e1, String s, m m)
    {
        a = e1;
        super();
        b = s;
        c = m;
    }
}
