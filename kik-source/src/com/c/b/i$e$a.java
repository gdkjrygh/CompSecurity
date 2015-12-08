// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.c.b:
//            i, av, bk, as, 
//            bn, bd, g, aq, 
//            be

public static final class <init> extends <init>
    implements <init>
{

    private int a;
    private boolean b;
    private boolean c;
    private List d;
    private bn e;

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

    private void s()
    {
        if (as.d)
        {
            u();
        }
    }

    private u t()
    {
        u u1 = g();
        if (!u1.g())
        {
            throw b(u1);
        } else
        {
            return u1;
        }
    }

    private bn u()
    {
        if (e == null)
        {
            List list = d;
            boolean flag;
            if ((a & 4) == 4)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            e = new bn(list, flag, p(), n());
            d = null;
        }
        return e;
    }

    public final e a(bd bd)
    {
        return d(bd);
    }

    public final d a(g g1, aq aq)
    {
        return d(g1, aq);
    }

    public final d a(d d1)
    {
        bn bn1;
        bn1 = null;
        if (d1 == able())
        {
            return this;
        }
        if (d1.able())
        {
            boolean flag = d1.able();
            a = a | 1;
            b = flag;
            q();
        }
        if (d1.q())
        {
            boolean flag1 = d1.q();
            a = a | 2;
            c = flag1;
            q();
        }
        if (e != null) goto _L2; else goto _L1
_L1:
        if (!e(d1).isEmpty())
        {
            if (d.isEmpty())
            {
                d = d(d1);
                a = a & -5;
            } else
            {
                if ((a & 4) != 4)
                {
                    d = new ArrayList(d);
                    a = a | 4;
                }
                d.addAll(ection(d1));
            }
            q();
        }
_L4:
        a(((a) (d1)));
        d(d1.d);
        q();
        return this;
_L2:
        if (!q(d1).isEmpty())
        {
            if (e.d())
            {
                e.b();
                e = null;
                d = d(d1);
                a = a & -5;
                if (as.d)
                {
                    bn1 = u();
                }
                e = bn1;
            } else
            {
                e.a(able(d1));
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean a()
    {
        int k = 0;
_L7:
        able able;
        int l;
        if (e == null)
        {
            l = d.size();
        } else
        {
            l = e.c();
        }
        if (k >= l) goto _L2; else goto _L1
_L1:
        if (e == null)
        {
            able = (e)d.get(k);
        } else
        {
            able = (.get)e.a(k);
        }
        if (able.()) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        k++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (!r()) goto _L3; else goto _L5
_L5:
        return true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final r b(g g1, aq aq)
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
        return com.c.b.i.C().(com/c/b/i$e, com/c/b/i$e$a);
    }

    public final s e()
    {
        return com.c.b.i.B();
    }

    public final s g()
    {
        int k = 1;
          = new nit>(this, (byte)0);
        int i1 = a;
        int l;
        if ((i1 & 1) != 1)
        {
            k = 0;
        }
        a(, b);
        l = k;
        if ((i1 & 2) == 2)
        {
            l = k | 2;
        }
        b(, c);
        if (e == null)
        {
            if ((a & 4) == 4)
            {
                d = Collections.unmodifiableList(d);
                a = a & -5;
            }
            a(, d);
        } else
        {
            d(, e.e());
        }
        e(, l);
        l();
        return ;
    }

    public final bd h()
    {
        return g();
    }

    public final bd i()
    {
        return t();
    }

    public final be j()
    {
        return t();
    }

    public final bd w()
    {
        return t();
    }

    private ()
    {
        d = Collections.emptyList();
        s();
    }

    s(byte byte0)
    {
        this();
    }

    private <init>(<init> <init>1)
    {
        super(<init>1);
        d = Collections.emptyList();
        s();
    }

    s(s s1, byte byte0)
    {
        this(s1);
    }
}
