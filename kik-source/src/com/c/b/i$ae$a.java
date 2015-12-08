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
    private List b;
    private bn c;

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
            t();
        }
    }

    private t s()
    {
        t t1 = g();
        if (!t1.g())
        {
            throw b(t1);
        } else
        {
            return t1;
        }
    }

    private bn t()
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
        bn bn1;
        bn1 = null;
        if (d1 == ble())
        {
            return this;
        }
        if (c != null) goto _L2; else goto _L1
_L1:
        if (!c(d1).isEmpty())
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
                b.addAll(ction(d1));
            }
            q();
        }
_L4:
        d(d1.d);
        q();
        return this;
_L2:
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
                    bn1 = t();
                }
                c = bn1;
            } else
            {
                c.a(ble(d1));
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean a()
    {
        return true;
    }

    public final ble b(g g1, aq aq)
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
        return com.c.b.i.O().(com/c/b/i$ae, com/c/b/i$ae$a);
    }

    public final  e()
    {
        return com.c.b.i.N();
    }

    public final  g()
    {
          = new nit>(this, (byte)0);
        if (c == null)
        {
            if ((a & 1) == 1)
            {
                b = Collections.unmodifiableList(b);
                a = a & -2;
            }
            a(, b);
        } else
        {
            b(, c.e());
        }
        l();
        return ;
    }

    public final bd h()
    {
        return g();
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

    private List()
    {
        b = Collections.emptyList();
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
        r();
    }

    r(r r1, byte byte0)
    {
        this(r1);
    }
}
