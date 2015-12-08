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
    private int b;
    private boolean c;
    private int d;
    private boolean e;
    private boolean f;
    private boolean g;
    private List h;
    private bn i;

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
        if (i == null)
        {
            List list = h;
            boolean flag;
            if ((a & 0x40) == 64)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i = new bn(list, flag, p(), n());
            h = null;
        }
        return i;
    }

    public final i a(bd bd)
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
            able able = d1.able();
            if (able == null)
            {
                throw new NullPointerException();
            }
            a = a | 1;
            b = able.a();
            q();
        }
        if (d1.q())
        {
            boolean flag = d1.q();
            a = a | 2;
            c = flag;
            q();
        }
        if (d1.q())
        {
            able able1 = d1.q();
            if (able1 == null)
            {
                throw new NullPointerException();
            }
            a = a | 4;
            d = able1.a();
            q();
        }
        if (d1.q())
        {
            boolean flag1 = d1.q();
            a = a | 8;
            e = flag1;
            q();
        }
        if (d1.q())
        {
            boolean flag2 = d1.q();
            a = a | 0x10;
            f = flag2;
            q();
        }
        if (d1.q())
        {
            boolean flag3 = d1.q();
            a = a | 0x20;
            g = flag3;
            q();
        }
        if (i != null) goto _L2; else goto _L1
_L1:
        if (!i(d1).isEmpty())
        {
            if (h.isEmpty())
            {
                h = h(d1);
                a = a & 0xffffffbf;
            } else
            {
                if ((a & 0x40) != 64)
                {
                    h = new ArrayList(h);
                    a = a | 0x40;
                }
                h.addAll(ection(d1));
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
            if (i.d())
            {
                i.b();
                i = null;
                h = h(d1);
                a = a & 0xffffffbf;
                if (as.d)
                {
                    bn1 = u();
                }
                i = bn1;
            } else
            {
                i.a(able(d1));
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
        if (i == null)
        {
            l = h.size();
        } else
        {
            l = i.c();
        }
        if (k >= l) goto _L2; else goto _L1
_L1:
        if (i == null)
        {
            able = (i)h.get(k);
        } else
        {
            able = (.get)i.a(k);
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
        return com.c.b.i.A().(com/c/b/i$m, com/c/b/i$m$a);
    }

    public final s e()
    {
        return com.c.b.i.z();
    }

    public final s g()
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
        if (i == null)
        {
            if ((a & 0x40) == 64)
            {
                h = Collections.unmodifiableList(h);
                a = a & 0xffffffbf;
            }
            a(, h);
        } else
        {
            h(, i.e());
        }
        i(, k);
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
        b = 0;
        d = 0;
        h = Collections.emptyList();
        s();
    }

    s(byte byte0)
    {
        this();
    }

    private <init>(<init> <init>1)
    {
        super(<init>1);
        b = 0;
        d = 0;
        h = Collections.emptyList();
        s();
    }

    s(s s1, byte byte0)
    {
        this(s1);
    }
}
