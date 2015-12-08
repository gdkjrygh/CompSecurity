// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.c.b:
//            i, f, av, bk, 
//            as, bn, bd, g, 
//            aq, be

public static final class <init> extends <init>
    implements <init>
{

    private int a;
    private List b;
    private bn c;
    private Object d;
    private long e;
    private long f;
    private double g;
    private f h;
    private Object i;

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

    private void r()
    {
        if (as.d)
        {
            u();
        }
    }

    private u s()
    {
        u u1 = t();
        if (!u1.t())
        {
            throw b(u1);
        } else
        {
            return u1;
        }
    }

    private b t()
    {
        int l = 1;
        t t1 = new nit>(this, (byte)0);
        int i1 = a;
        int k;
        if (c == null)
        {
            if ((a & 1) == 1)
            {
                b = Collections.unmodifiableList(b);
                a = a & -2;
            }
            a(t1, b);
        } else
        {
            b(t1, c.e());
        }
        if ((i1 & 2) != 2)
        {
            l = 0;
        }
        c(t1, d);
        k = l;
        if ((i1 & 4) == 4)
        {
            k = l | 2;
        }
        d(t1, e);
        l = k;
        if ((i1 & 8) == 8)
        {
            l = k | 4;
        }
        e(t1, f);
        k = l;
        if ((i1 & 0x10) == 16)
        {
            k = l | 8;
        }
        f(t1, g);
        l = k;
        if ((i1 & 0x20) == 32)
        {
            l = k | 0x10;
        }
        g(t1, h);
        k = l;
        if ((i1 & 0x40) == 64)
        {
            k = l | 0x20;
        }
        h(t1, i);
        i(t1, k);
        l();
        return t1;
    }

    private bn u()
    {
        boolean flag = true;
        if (c == null)
        {
            List list = b;
            if ((a & 1) != 1)
            {
                flag = false;
            }
            c = new bn(list, flag, p(), n());
            b = null;
        }
        return c;
    }

    public final c a(bd bd)
    {
        return d(bd);
    }

    public final d a(g g1, aq aq)
    {
        return d(g1, aq);
    }

    public final d a(d d1)
    {
        Object obj = null;
        if (d1 == ble())
        {
            return this;
        }
        if (c == null)
        {
            if (!c(d1).isEmpty())
            {
                double d2;
                long l;
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
                    b.addAll(ction(d1));
                }
                q();
            }
        } else
        if (!q(d1).isEmpty())
        {
            if (c.d())
            {
                c.b();
                c = null;
                b = b(d1);
                a = a & -2;
                if (as.d)
                {
                    obj = u();
                }
                c = ((bn) (obj));
            } else
            {
                c.a(ble(d1));
            }
        }
        if (d1.ble())
        {
            a = a | 2;
            d = d(d1);
            q();
        }
        if (d1.q())
        {
            l = d1.q();
            a = a | 4;
            e = l;
            q();
        }
        if (d1.q())
        {
            l = d1.q();
            a = a | 8;
            f = l;
            q();
        }
        if (d1.q())
        {
            d2 = d1.q();
            a = a | 0x10;
            g = d2;
            q();
        }
        if (d1.q())
        {
            obj = d1.q();
            if (obj == null)
            {
                throw new NullPointerException();
            }
            a = a | 0x20;
            h = ((f) (obj));
            q();
        }
        if (d1.q())
        {
            a = a | 0x40;
            i = i(d1);
            q();
        }
        d(d1.d);
        q();
        return this;
    }

    public final boolean a()
    {
        int k = 0;
        do
        {
            int l;
            if (c == null)
            {
                l = b.size();
            } else
            {
                l = c.c();
            }
            if (k < l)
            {
                q q;
                if (c == null)
                {
                    q = (c)b.get(k);
                } else
                {
                    q = (get)c.a(k);
                }
                if (!q.a())
                {
                    return false;
                }
                k++;
            } else
            {
                return true;
            }
        } while (true);
    }

    public final a b(g g1, aq aq)
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
        return com.c.b.i.K().(com/c/b/i$ag, com/c/b/i$ag$a);
    }

    public final  e()
    {
        return com.c.b.i.J();
    }

    public final bd h()
    {
        return t();
    }

    public final bd i()
    {
        return s();
    }

    public final be j()
    {
        return s();
    }

    public final bd w()
    {
        return s();
    }

    private t()
    {
        b = Collections.emptyList();
        d = "";
        h = f.a;
        i = "";
        r();
    }

    r(byte byte0)
    {
        this();
    }

    private <init>(<init> <init>1)
    {
        super(<init>1);
        b = Collections.emptyList();
        d = "";
        h = f.a;
        i = "";
        r();
    }

    r(r r1, byte byte0)
    {
        this(r1);
    }
}
