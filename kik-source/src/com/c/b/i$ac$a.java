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
    private List c;
    private bn d;

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
        if (d == null)
        {
            List list = c;
            boolean flag;
            if ((a & 2) == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            d = new bn(list, flag, p(), n());
            c = null;
        }
        return d;
    }

    public final d a(bd bd)
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
        if (d1 == ble())
        {
            return this;
        }
        if (d1.ble())
        {
            boolean flag = d1.ble();
            a = a | 1;
            b = flag;
            q();
        }
        if (d != null) goto _L2; else goto _L1
_L1:
        if (!d(d1).isEmpty())
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
                c.addAll(ction(d1));
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
            if (d.d())
            {
                d.b();
                d = null;
                c = c(d1);
                a = a & -3;
                if (as.d)
                {
                    bn1 = u();
                }
                d = bn1;
            } else
            {
                d.a(ble(d1));
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean a()
    {
        int k = 0;
_L7:
        ble ble;
        int l;
        if (d == null)
        {
            l = c.size();
        } else
        {
            l = d.c();
        }
        if (k >= l) goto _L2; else goto _L1
_L1:
        if (d == null)
        {
            ble = (d)c.get(k);
        } else
        {
            ble = (get)d.a(k);
        }
        if (ble.d()) goto _L4; else goto _L3
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
        return com.c.b.i.G().(com/c/b/i$ac, com/c/b/i$ac$a);
    }

    public final  e()
    {
        return com.c.b.i.F();
    }

    public final  g()
    {
        int k = 1;
          = new nit>(this, (byte)0);
        if ((a & 1) != 1)
        {
            k = 0;
        }
        a(, b);
        if (d == null)
        {
            if ((a & 2) == 2)
            {
                c = Collections.unmodifiableList(c);
                a = a & -3;
            }
            a(, c);
        } else
        {
            c(, d.e());
        }
        d(, k);
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

    private List()
    {
        c = Collections.emptyList();
        s();
    }

    s(byte byte0)
    {
        this();
    }

    private <init>(<init> <init>1)
    {
        super(<init>1);
        c = Collections.emptyList();
        s();
    }

    s(s s1, byte byte0)
    {
        this(s1);
    }
}
