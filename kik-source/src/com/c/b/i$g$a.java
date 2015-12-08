// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;


// Referenced classes of package com.c.b:
//            i, av, bk, as, 
//            bp, bd, g, aq, 
//            be

public static final class <init> extends <init>
    implements <init>
{

    private int a;
    private Object b;
    private int c;
    private ct d;
    private bp e;

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

    private  d(g g1, aq aq)
    {
        g1 = ().a(g1, aq);
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

    private void r()
    {
        if (as.d && e == null)
        {
            e = new bp(t(), p(), n());
            d = null;
        }
    }

    private d s()
    {
        int k = 1;
        ct ct = new nit>(this, (byte)0);
        int i1 = a;
        int l;
        if ((i1 & 1) != 1)
        {
            k = 0;
        }
        a(ct, b);
        l = k;
        if ((i1 & 2) == 2)
        {
            l = k | 2;
        }
        b(ct, c);
        if ((i1 & 4) == 4)
        {
            k = l | 4;
        } else
        {
            k = l;
        }
        if (e == null)
        {
            e(ct, d);
        } else
        {
            d(ct, (d)e.c());
        }
        e(ct, k);
        l();
        return ct;
    }

    private l t()
    {
        if (e == null)
        {
            if (d == null)
            {
                return d();
            } else
            {
                return d;
            }
        } else
        {
            return (d)e.b();
        }
    }

    public final e a(bd bd)
    {
        return d(bd);
    }

    public final d a(g g1, aq aq)
    {
        return d(g1, aq);
    }

    public final d a(int k)
    {
        a = a | 2;
        c = k;
        q();
        return this;
    }

    public final q a(q q)
    {
        if (q == q())
        {
            return this;
        }
        if (q.q())
        {
            a = a | 1;
            b = b(q);
            q();
        }
        if (q.q())
        {
            a(q.a());
        }
        if (q.a())
        {
            q q1 = q.a();
            if (e == null)
            {
                if ((a & 4) == 4 && d != null && d != d())
                {
                    d = d(d).a(q1).g();
                } else
                {
                    d = q1;
                }
                q();
            } else
            {
                e.b(q1);
            }
            a = a | 4;
        }
        d(q.d);
        q();
        return this;
    }

    public final ng a(String s1)
    {
        if (s1 == null)
        {
            throw new NullPointerException();
        } else
        {
            a = a | 1;
            b = s1;
            q();
            return this;
        }
    }

    public final boolean a()
    {
        boolean flag;
        if ((a & 4) == 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return !flag || t().t();
    }

    public final t b(g g1, aq aq)
    {
        return d(g1, aq);
    }

    public final d c(bd bd)
    {
        return d(bd);
    }

    public final d c(g g1, aq aq)
    {
        return d(g1, aq);
    }

    protected final d d()
    {
        return com.c.b.i.q().(com/c/b/i$g, com/c/b/i$g$a);
    }

    public final s e()
    {
        return com.c.b.i.p();
    }

    public final s g()
    {
        s s1 = s();
        if (!s1.s())
        {
            throw b(s1);
        } else
        {
            return s1;
        }
    }

    public final bd h()
    {
        return s();
    }

    public final bd i()
    {
        return g();
    }

    public final be j()
    {
        return g();
    }

    public final bd w()
    {
        return g();
    }

    private ng()
    {
        b = "";
        d = null;
        r();
    }

    r(byte byte0)
    {
        this();
    }

    private <init>(<init> <init>1)
    {
        super(<init>1);
        b = "";
        d = null;
        r();
    }

    r(r r1, byte byte0)
    {
        this(r1);
    }
}
