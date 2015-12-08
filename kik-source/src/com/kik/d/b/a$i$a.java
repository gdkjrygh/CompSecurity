// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.d.b;

import com.c.b.aq;
import com.c.b.av;
import com.c.b.bd;
import com.c.b.be;
import com.c.b.bk;
import com.c.b.g;

// Referenced classes of package com.kik.d.b:
//            a

public static final class <init> extends com.c.b.i.a
    implements <init>
{

    private int a;
    private int b;

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

    private a d(g g, aq aq)
    {
        g = (a)a.a(g, aq);
        if (g != null)
        {
            a(g);
        }
        return this;
        aq;
        g = (a)aq.a();
        throw aq;
        aq;
_L2:
        if (g != null)
        {
            a(g);
        }
        throw aq;
        aq;
        g = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final com.c.b.i.a a(bd bd)
    {
        return d(bd);
    }

    public final com.c.b.i.a a(g g, aq aq)
    {
        return d(g, aq);
    }

    public final d a(d d1)
    {
        if (d1 == d())
        {
            return this;
        }
        if (d1.d())
        {
            a(d1.a());
        }
        d(d(d1));
        q();
        return this;
    }

    public final q a(q q)
    {
        if (q == null)
        {
            throw new NullPointerException();
        } else
        {
            a = a | 1;
            b = q.b();
            q();
            return this;
        }
    }

    public final boolean a()
    {
        boolean flag;
        if ((a & 1) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public final com.c.b.i.a b(g g, aq aq)
    {
        return d(g, aq);
    }

    public final com.c.b.i.a c(bd bd)
    {
        return d(bd);
    }

    public final com.c.b.i.a c(g g, aq aq)
    {
        return d(g, aq);
    }

    protected final com.c.b.i.a d()
    {
        return com.kik.d.b.a.b().(com/kik/d/b/a$i, com/kik/d/b/a$i$a);
    }

    public final com.c.b.i.a e()
    {
        return com.kik.d.b.a.a();
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

    public final r r()
    {
        r r1 = s();
        if (!r1.s())
        {
            throw b(r1);
        } else
        {
            return r1;
        }
    }

    public final b s()
    {
        int k = 1;
        b b1 = new nit>(this, (byte)0);
        if ((a & 1) != 1)
        {
            k = 0;
        }
        a(b1, b);
        b(b1, k);
        l();
        return b1;
    }

    public final bd w()
    {
        return l();
    }

    private terException()
    {
        b = 300;
        b();
    }

    b(byte byte0)
    {
        this();
    }

    private <init>(com.c.b.i.a a1)
    {
        super(a1);
        b = 300;
        b();
    }

    b(com.c.b.i.a a1, byte byte0)
    {
        this(a1);
    }
}
