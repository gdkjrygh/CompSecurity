// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;


// Referenced classes of package com.c.b:
//            i, av, bk, bd, 
//            g, aq, be

public static final class <init> extends <init>
    implements <init>
{

    private int a;
    private Object b;
    private boolean c;

    private <init> d(bd bd)
    {
        if (bd instanceof <init>)
        {
            return a((a)bd);
        } else
        {
            super.a(bd);
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
        int k = 1;
        b b1 = new nit>(this, (byte)0);
        int i1 = a;
        int l;
        if ((i1 & 1) != 1)
        {
            k = 0;
        }
        a(b1, b);
        l = k;
        if ((i1 & 2) == 2)
        {
            l = k | 2;
        }
        b(b1, c);
        c(b1, l);
        l();
        return b1;
    }

    public final l a(bd bd)
    {
        return d(bd);
    }

    public final d a(g g, aq aq)
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
            a = a | 1;
            b = b(d1);
            q();
        }
        if (d1.q())
        {
            boolean flag = d1.q();
            a = a | 2;
            c = flag;
            q();
        }
        d(d1.d);
        q();
        return this;
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
        if (flag)
        {
            boolean flag1;
            if ((a & 2) == 2)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                return true;
            }
        }
        return false;
    }

    public final a b(g g, aq aq)
    {
        return d(g, aq);
    }

    public final d c(bd bd)
    {
        return d(bd);
    }

    public final d c(g g, aq aq)
    {
        return d(g, aq);
    }

    protected final d d()
    {
        return com.c.b.i.M().d(com/c/b/i$ag$b, com/c/b/i$ag$b$a);
    }

    public final d e()
    {
        return com.c.b.i.L();
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
        b = "";
    }

    b(byte byte0)
    {
        this();
    }

    private <init>(<init> <init>1)
    {
        super(<init>1);
        b = "";
    }

    b(b b1, byte byte0)
    {
        this(b1);
    }
}
