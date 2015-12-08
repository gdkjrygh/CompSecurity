// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.a.a;

import com.c.b.aq;
import com.c.b.av;
import com.c.b.bd;
import com.c.b.be;
import com.c.b.bk;
import com.c.b.bn;
import com.c.b.by;
import com.c.b.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.kik.a.a:
//            a

public static final class <init> extends com.c.b.e.a
    implements <init>
{

    private int a;
    private List b;
    private bn c;
    private boolean d;

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
        if (a())
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
        b b1 = new nit>(this, (byte)0);
        if (c == null)
        {
            if ((a & 1) == 1)
            {
                b = Collections.unmodifiableList(b);
                a = a & -2;
            }
            a(b1, b);
        } else
        {
            b(b1, c.e());
        }
        c(b1, d);
        d(b1);
        l();
        return b1;
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

    public final com.c.b.e.a a(bd bd)
    {
        return d(bd);
    }

    public final volatile com.c.b.e.a a(by by)
    {
        return this;
    }

    public final com.c.b.e.a a(g g, aq aq)
    {
        return d(g, aq);
    }

    public final d a(d d1)
    {
        bn bn1;
        bn1 = null;
        if (d1 == ())
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
                b.addAll(on(d1));
            }
            q();
        }
_L4:
        if (d1.q())
        {
            d = d1.d();
            q();
        }
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
                if (a())
                {
                    bn1 = u();
                }
                c = bn1;
            } else
            {
                c.a((d1));
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean a()
    {
        return true;
    }

    public final com.c.b.e.a b(g g, aq aq)
    {
        return d(g, aq);
    }

    public final volatile com.c.b.e.a b(by by)
    {
        return this;
    }

    public final volatile com.c.b.e.a c(by by)
    {
        return this;
    }

    public final com.c.b.e.a c(bd bd)
    {
        return d(bd);
    }

    public final com.c.b.e.a c(g g, aq aq)
    {
        return d(g, aq);
    }

    public final volatile com.c.b.e.a d(by by)
    {
        return this;
    }

    protected final com.c.b.e.a d()
    {
        return com.kik.a.a.a.f().(com/kik/a/a/a$e, com/kik/a/a/a$e$a);
    }

    public final com.c.b.e.a e()
    {
        return com.kik.a.a.a.e();
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
        r();
    }

    r(byte byte0)
    {
        this();
    }

    private <init>(com.c.b.e.a a1)
    {
        super(a1);
        b = Collections.emptyList();
        r();
    }

    r(com.c.b.e.a a1, byte byte0)
    {
        this(a1);
    }
}
