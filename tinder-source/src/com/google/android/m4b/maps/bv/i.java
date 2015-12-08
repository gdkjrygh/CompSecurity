// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ay.m;
import com.google.android.m4b.maps.ay.n;
import com.google.android.m4b.maps.cq.c;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.OutputStream;

public final class i extends n
{
    static final class a
    {

        int a;
        int b;
        int c;
        private int d;

        private static void a(int j, com.google.android.m4b.maps.ac.a a1, int k)
        {
            if (j > 0)
            {
                a1.a(k, j);
            }
        }

        final void a(com.google.android.m4b.maps.ac.a a1)
        {
            if (a())
            {
                return;
            } else
            {
                a1 = com.google.android.m4b.maps.ac.c.c(a1, 4);
                a(d, a1, 1);
                a(a, a1, 2);
                a(b, a1, 3);
                a(c, a1, 4);
                return;
            }
        }

        final boolean a()
        {
            return a <= 0 && b <= 0 && c <= 0;
        }

        a(int j)
        {
            d = j;
        }
    }


    private boolean a;
    private boolean b;
    private final a c = new a(0);
    private final a d = new a(1);
    private final m e;

    public i(m m1)
    {
        a = false;
        b = false;
        e = m1;
    }

    public final void a(DataOutput dataoutput)
    {
        this;
        JVM INSTR monitorenter ;
        b = true;
        com.google.android.m4b.maps.ac.a a1 = new com.google.android.m4b.maps.ac.a(c.d);
        c.a(a1);
        d.a(a1);
        a1.a((OutputStream)dataoutput, true);
        this;
        JVM INSTR monitorexit ;
        return;
        dataoutput;
        throw dataoutput;
    }

    public final boolean a(int j, int k, int l, int i1)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        if (!b)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        this;
        JVM INSTR monitorexit ;
        return false;
        if (j != 1)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        a a1 = d;
_L1:
        if (!c() && i1 > 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        a1.a = a1.a + k;
        a1.b = a1.b + l;
        a1.c = a1.c + i1;
        k = ((flag) ? 1 : 0);
        if (a)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        if (!d.a())
        {
            break MISSING_BLOCK_LABEL_111;
        }
        k = ((flag) ? 1 : 0);
        if (c.a())
        {
            break MISSING_BLOCK_LABEL_118;
        }
        a = true;
        k = 1;
        this;
        JVM INSTR monitorexit ;
        Exception exception;
        if (k != 0)
        {
            e.c(this);
        } else
        if (j != 0)
        {
            e.b();
            e.c();
        }
        return true;
        a1 = c;
          goto _L1
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean a(DataInput datainput)
    {
        com.google.android.m4b.maps.ac.c.a(c.e, datainput);
        return true;
    }

    public final boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        if (c.c > 0) goto _L2; else goto _L1
_L1:
        int j = d.c;
        if (j <= 0) goto _L3; else goto _L2
_L2:
        boolean flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L3:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public final int g()
    {
        return 45;
    }
}
