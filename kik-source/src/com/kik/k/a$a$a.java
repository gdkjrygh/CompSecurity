// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.k;

import com.c.b.aq;
import com.c.b.av;
import com.c.b.bd;
import com.c.b.be;
import com.c.b.bk;
import com.c.b.g;

// Referenced classes of package com.kik.k:
//            a

public static final class <init> extends com.c.b.a
    implements <init>
{

    private int a;
    private boolean b;
    private Object c;
    private int d;
    private int e;
    private long f;
    private long g;
    private int h;
    private int i;

    private <init> d(bd bd)
    {
        if (bd instanceof <init>)
        {
            return a((a)bd);
        } else
        {
            super.(bd);
            return this;
        }
    }

    private a d(g g1, aq aq)
    {
        g1 = (a)a.a(g1, aq);
        if (g1 != null)
        {
            a(g1);
        }
        return this;
        aq;
        g1 = (a)aq.a();
        throw aq;
        aq;
_L2:
        if (g1 != null)
        {
            a(g1);
        }
        throw aq;
        aq;
        g1 = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private a r()
    {
        a a1 = s();
        if (!a1.s())
        {
            throw b(a1);
        } else
        {
            return a1;
        }
    }

    private b s()
    {
        int l = 1;
          = new nit>(this, (byte)0);
        int i1 = a;
        int k;
        if ((i1 & 1) != 1)
        {
            l = 0;
        }
        a(, b);
        k = l;
        if ((i1 & 2) == 2)
        {
            k = l | 2;
        }
        b(, c);
        l = k;
        if ((i1 & 4) == 4)
        {
            l = k | 4;
        }
        c(, d);
        k = l;
        if ((i1 & 8) == 8)
        {
            k = l | 8;
        }
        d(, e);
        l = k;
        if ((i1 & 0x10) == 16)
        {
            l = k | 0x10;
        }
        e(, f);
        k = l;
        if ((i1 & 0x20) == 32)
        {
            k = l | 0x20;
        }
        f(, g);
        l = k;
        if ((i1 & 0x40) == 64)
        {
            l = k | 0x40;
        }
        g(, h);
        k = l;
        if ((i1 & 0x80) == 128)
        {
            k = l | 0x80;
        }
        h(, i);
        i(, k);
        l();
        return ;
    }

    public final com.c.b.a a(bd bd)
    {
        return d(bd);
    }

    public final com.c.b.a a(g g1, aq aq)
    {
        return d(g1, aq);
    }

    public final d a(d d1)
    {
        if (d1 == d())
        {
            return this;
        }
        if (d1.d())
        {
            boolean flag = d1.d();
            a = a | 1;
            b = flag;
            q();
        }
        if (d1.q())
        {
            a = a | 2;
            c = c(d1);
            q();
        }
        if (d1.q())
        {
            int k = d1.q();
            a = a | 4;
            d = k;
            q();
        }
        if (d1.q())
        {
            int l = d1.q();
            a = a | 8;
            e = l;
            q();
        }
        if (d1.q())
        {
            long l1 = d1.q();
            a = a | 0x10;
            f = l1;
            q();
        }
        if (d1.q())
        {
            long l2 = d1.q();
            a = a | 0x20;
            g = l2;
            q();
        }
        if (d1.q())
        {
            int i1 = d1.q();
            a = a | 0x40;
            h = i1;
            q();
        }
        if (d1.q())
        {
            int j1 = d1.q();
            a = a | 0x80;
            i = j1;
            q();
        }
        d(d(d1));
        q();
        return this;
    }

    public final boolean a()
    {
        return true;
    }

    public final com.c.b.a b(g g1, aq aq)
    {
        return d(g1, aq);
    }

    public final com.c.b.a c(bd bd)
    {
        return d(bd);
    }

    public final com.c.b.a c(g g1, aq aq)
    {
        return d(g1, aq);
    }

    protected final com.c.b.a d()
    {
        return com.kik.k.a.c().(com/kik/k/a$a, com/kik/k/a$a$a);
    }

    public final com.c.b.a e()
    {
        return com.kik.k.a.b();
    }

    public final bd h()
    {
        return s();
    }

    public final bd i()
    {
        return r();
    }

    public final be j()
    {
        return r();
    }

    public final bd w()
    {
        return r();
    }

    private ()
    {
        c = "";
        c();
    }

    c(byte byte0)
    {
        this();
    }

    private <init>(com.c.b.a a1)
    {
        super(a1);
        c = "";
        c();
    }

    c(com.c.b.a a1, byte byte0)
    {
        this(a1);
    }
}
