// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.d.b;

import com.c.b.aq;
import com.c.b.av;
import com.c.b.bd;
import com.c.b.be;
import com.c.b.bk;
import com.c.b.bn;
import com.c.b.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.kik.d.b:
//            a

public static final class <init> extends com.c.b.g.a
    implements <init>
{

    private int a;
    private Object b;
    private Object c;
    private Object d;
    private List e;
    private bn f;
    private Object g;

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
        if (a())
        {
            v();
        }
    }

    private v t()
    {
        int l = 1;
        v v1 = new nit>(this, (byte)0);
        int i1 = a;
        int k;
        if ((i1 & 1) != 1)
        {
            l = 0;
        }
        a(v1, b);
        k = l;
        if ((i1 & 2) == 2)
        {
            k = l | 2;
        }
        b(v1, c);
        l = k;
        if ((i1 & 4) == 4)
        {
            l = k | 4;
        }
        c(v1, d);
        if (f == null)
        {
            if ((a & 8) == 8)
            {
                e = Collections.unmodifiableList(e);
                a = a & -9;
            }
            a(v1, e);
        } else
        {
            e(v1, f.e());
        }
        k = l;
        if ((i1 & 0x10) == 16)
        {
            k = l | 8;
        }
        f(v1, g);
        g(v1, k);
        l();
        return v1;
    }

    private void u()
    {
        if ((a & 8) != 8)
        {
            e = new ArrayList(e);
            a = a | 8;
        }
    }

    private bn v()
    {
        if (f == null)
        {
            List list = e;
            boolean flag;
            if ((a & 8) == 8)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f = new bn(list, flag, p(), n());
            e = null;
        }
        return f;
    }

    public final com.c.b.g.a a(bd bd)
    {
        return d(bd);
    }

    public final com.c.b.g.a a(g g1, aq aq)
    {
        return d(g1, aq);
    }

    public final d a(d d1)
    {
        bn bn1;
        bn1 = null;
        if (d1 == ())
        {
            return this;
        }
        if (d1.())
        {
            a = a | 1;
            b = b(d1);
            q();
        }
        if (d1.q())
        {
            a = a | 2;
            c = c(d1);
            q();
        }
        if (d1.q())
        {
            a = a | 4;
            d = d(d1);
            q();
        }
        if (f != null) goto _L2; else goto _L1
_L1:
        if (!f(d1).isEmpty())
        {
            if (e.isEmpty())
            {
                e = e(d1);
                a = a & -9;
            } else
            {
                u();
                e.addAll(on(d1));
            }
            q();
        }
_L4:
        if (d1.q())
        {
            a = a | 0x10;
            g = g(d1);
            q();
        }
        d(d(d1));
        q();
        return this;
_L2:
        if (!q(d1).isEmpty())
        {
            if (f.d())
            {
                f.b();
                f = null;
                e = e(d1);
                a = a & -9;
                if (a())
                {
                    bn1 = v();
                }
                f = bn1;
            } else
            {
                f.a((d1));
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final  a(Iterable iterable)
    {
        if (f == null)
        {
            u();
            com.c.b.g.a.u(iterable, e);
            q();
            return this;
        } else
        {
            f.a(iterable);
            return this;
        }
    }

    public final  a(String s1)
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
        if ((a & 1) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int k;
        if ((a & 2) == 2)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (k == 0) goto _L1; else goto _L3
_L3:
        k = 0;
_L5:
        q q;
        int l;
        if (f == null)
        {
            l = e.size();
        } else
        {
            l = f.c();
        }
        if (k >= l)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        if (f == null)
        {
            q = (f)e.get(k);
        } else
        {
            q = ()f.a(k);
        }
        if (!q.f()) goto _L1; else goto _L4
_L4:
        k++;
          goto _L5
        return true;
    }

    public final com.c.b.g.a b(g g1, aq aq)
    {
        return d(g1, aq);
    }

    public final d b(String s1)
    {
        if (s1 == null)
        {
            throw new NullPointerException();
        } else
        {
            a = a | 2;
            c = s1;
            q();
            return this;
        }
    }

    public final com.c.b.g.a c(bd bd)
    {
        return d(bd);
    }

    public final com.c.b.g.a c(g g1, aq aq)
    {
        return d(g1, aq);
    }

    public final d c(String s1)
    {
        if (s1 == null)
        {
            throw new NullPointerException();
        } else
        {
            a = a | 4;
            d = s1;
            q();
            return this;
        }
    }

    protected final com.c.b.g.a d()
    {
        return com.kik.d.b.a.h().(com/kik/d/b/a$g, com/kik/d/b/a$g$a);
    }

    public final q d(String s1)
    {
        if (s1 == null)
        {
            throw new NullPointerException();
        } else
        {
            a = a | 0x10;
            g = s1;
            q();
            return this;
        }
    }

    public final com.c.b.g.a e()
    {
        return com.kik.d.b.a.g();
    }

    public final bd h()
    {
        return t();
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
        r r1 = t();
        if (!r1.t())
        {
            throw b(r1);
        } else
        {
            return r1;
        }
    }

    public final bd w()
    {
        return b();
    }

    private ()
    {
        b = "";
        c = "";
        d = "";
        e = Collections.emptyList();
        g = "";
        s();
    }

    s(byte byte0)
    {
        this();
    }

    private <init>(com.c.b.g.a a1)
    {
        super(a1);
        b = "";
        c = "";
        d = "";
        e = Collections.emptyList();
        g = "";
        s();
    }

    s(com.c.b.g.a a1, byte byte0)
    {
        this(a1);
    }
}
