// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.c.b:
//            i, av, bk, as, 
//            bp, bn, bd, g, 
//            aq, be

public static final class <init> extends <init>
    implements <init>
{

    private int a;
    private Object b;
    private List c;
    private bn d;
    private t e;
    private bp f;

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

    private void r()
    {
        if (as.d)
        {
            u();
            if (f == null)
            {
                f = new bp(v(), p(), n());
                e = null;
            }
        }
    }

    private e s()
    {
        e e1 = t();
        if (!e1.t())
        {
            throw b(e1);
        } else
        {
            return e1;
        }
    }

    private b t()
    {
        int k = 1;
        t t1 = new nit>(this, (byte)0);
        int l = a;
        if ((l & 1) != 1)
        {
            k = 0;
        }
        a(t1, b);
        if (d == null)
        {
            if ((a & 2) == 2)
            {
                c = Collections.unmodifiableList(c);
                a = a & -3;
            }
            a(t1, c);
        } else
        {
            c(t1, d.e());
        }
        if ((l & 4) == 4)
        {
            k |= 2;
        }
        if (f == null)
        {
            f(t1, e);
        } else
        {
            e(t1, (e)f.c());
        }
        f(t1, k);
        l();
        return t1;
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

    private d v()
    {
        if (f == null)
        {
            if (e == null)
            {
                return e();
            } else
            {
                return e;
            }
        } else
        {
            return (e)f.b();
        }
    }

    public final f a(bd bd)
    {
        return d(bd);
    }

    public final d a(g g, aq aq)
    {
        return d(g, aq);
    }

    public final d a(d d1)
    {
        Object obj = null;
        if (d1 == ble())
        {
            return this;
        }
        if (d1.ble())
        {
            a = a | 1;
            b = b(d1);
            q();
        }
        if (d == null)
        {
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
        } else
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
                    obj = u();
                }
                d = ((bn) (obj));
            } else
            {
                d.a(ble(d1));
            }
        }
        if (d1.ble())
        {
            obj = d1.ble();
            if (f == null)
            {
                if ((a & 4) == 4 && e != null && e != e())
                {
                    e = e(e).a(((a) (obj))).g();
                } else
                {
                    e = ((e) (obj));
                }
                q();
            } else
            {
                f.b(((as) (obj)));
            }
            a = a | 4;
        }
        d(d1.d);
        q();
        return this;
    }

    public final boolean a()
    {
        int k = 0;
_L7:
        q q;
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
            q = (d)c.get(k);
        } else
        {
            q = (get)d.a(k);
        }
        if (q.d()) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        k++;
        continue; /* Loop/switch isn't completed */
_L2:
        if ((a & 4) == 4)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (k && !v().v()) goto _L3; else goto _L5
_L5:
        return true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final v b(g g, aq aq)
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
        return com.c.b.i.s().(com/c/b/i$aa, com/c/b/i$aa$a);
    }

    public final  e()
    {
        return com.c.b.i.r();
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
        b = "";
        c = Collections.emptyList();
        e = null;
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
        c = Collections.emptyList();
        e = null;
        r();
    }

    r(r r1, byte byte0)
    {
        this(r1);
    }
}
