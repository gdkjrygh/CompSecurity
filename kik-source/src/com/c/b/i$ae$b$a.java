// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.c.b:
//            i, ay, av, bk, 
//            az, bd, g, aq, 
//            be

public static final class <init> extends <init>
    implements <init>
{

    private int a;
    private List b;
    private List c;
    private Object d;
    private Object e;
    private az f;

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
        if ((a & 1) == 1)
        {
            b = Collections.unmodifiableList(b);
            a = a & -2;
        }
        a(b1, b);
        if ((a & 2) == 2)
        {
            c = Collections.unmodifiableList(c);
            a = a & -3;
        }
        a(b1, c);
        int l;
        if ((i1 & 4) != 4)
        {
            k = 0;
        }
        c(b1, d);
        l = k;
        if ((i1 & 8) == 8)
        {
            l = k | 2;
        }
        d(b1, e);
        if ((a & 0x10) == 16)
        {
            f = f.e();
            a = a & 0xffffffef;
        }
        a(b1, f);
        f(b1, l);
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
        if (d1 == ion())
        {
            return this;
        }
        if (!ion(d1).isEmpty())
        {
            if (b.isEmpty())
            {
                b = b(d1);
                a = a & -2;
            } else
            {
                if ((a & 1) != 1)
                {
                    b = new ArrayList(b);
                    a = a | 1;
                }
                b.addAll(ion(d1));
            }
            q();
        }
        if (!q(d1).isEmpty())
        {
            if (c.isEmpty())
            {
                c = c(d1);
                a = a & -3;
            } else
            {
                if ((a & 2) != 2)
                {
                    c = new ArrayList(c);
                    a = a | 2;
                }
                c.addAll(ion(d1));
            }
            q();
        }
        if (d1.q())
        {
            a = a | 4;
            d = d(d1);
            q();
        }
        if (d1.q())
        {
            a = a | 8;
            e = e(d1);
            q();
        }
        if (!q(d1).isEmpty())
        {
            if (f.isEmpty())
            {
                f = f(d1);
                a = a & 0xffffffef;
            } else
            {
                if ((a & 0x10) != 16)
                {
                    f = new ay(f);
                    a = a | 0x10;
                }
                f.addAll(ion(d1));
            }
            q();
        }
        d(d1.d);
        q();
        return this;
    }

    public final boolean a()
    {
        return true;
    }

    public final q b(g g, aq aq)
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
        return com.c.b.i.Q().d(com/c/b/i$ae$b, com/c/b/i$ae$b$a);
    }

    public final d e()
    {
        return com.c.b.i.P();
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

    private st()
    {
        b = Collections.emptyList();
        c = Collections.emptyList();
        d = "";
        e = "";
        f = ay.a;
    }

    f(byte byte0)
    {
        this();
    }

    private <init>(<init> <init>1)
    {
        super(<init>1);
        b = Collections.emptyList();
        c = Collections.emptyList();
        d = "";
        e = "";
        f = ay.a;
    }

    f(f f1, byte byte0)
    {
        this(f1);
    }
}
