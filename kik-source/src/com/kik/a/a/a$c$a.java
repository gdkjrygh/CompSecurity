// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.a.a;

import com.c.b.aq;
import com.c.b.av;
import com.c.b.bd;
import com.c.b.be;
import com.c.b.bk;
import com.c.b.bp;
import com.c.b.by;
import com.c.b.g;
import com.kik.o.c;

// Referenced classes of package com.kik.a.a:
//            a

public static final class <init> extends com.c.b.c.a
    implements <init>
{

    private c a;
    private bp b;

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
        g = (a)com.kik.a.a.a.a(g, aq);
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

    private a s()
    {
        a a1 = new nit>(this, (byte)0);
        if (b == null)
        {
            b(a1, a);
        } else
        {
            a(a1, (c)b.c());
        }
        l();
        return a1;
    }

    public final com.c.b.c.a a(bd bd)
    {
        return d(bd);
    }

    public final volatile com.c.b.c.a a(by by)
    {
        return this;
    }

    public final com.c.b.c.a a(g g, aq aq)
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
            d1 = d1.d();
            if (b == null)
            {
                if (a != null)
                {
                    a = com.kik.o.c.a(a).a(d1).a();
                } else
                {
                    a = d1;
                }
                q();
            } else
            {
                b.b(d1);
            }
        }
        q();
        return this;
    }

    public final q a(c c1)
    {
        if (b == null)
        {
            if (c1 == null)
            {
                throw new NullPointerException();
            } else
            {
                a = c1;
                q();
                return this;
            }
        } else
        {
            b.a(c1);
            return this;
        }
    }

    public final boolean a()
    {
        return true;
    }

    public final com.c.b.c.a b(g g, aq aq)
    {
        return d(g, aq);
    }

    public final volatile com.c.b.c.a b(by by)
    {
        return this;
    }

    public final volatile com.c.b.c.a c(by by)
    {
        return this;
    }

    public final com.c.b.c.a c(bd bd)
    {
        return d(bd);
    }

    public final com.c.b.c.a c(g g, aq aq)
    {
        return d(g, aq);
    }

    public final volatile com.c.b.c.a d(by by)
    {
        return this;
    }

    protected final com.c.b.c.a d()
    {
        return com.kik.a.a.a.d().(com/kik/a/a/a$c, com/kik/a/a/a$c$a);
    }

    public final com.c.b.c.a e()
    {
        return com.kik.a.a.a.c();
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

    public final r r()
    {
        r r1 = s();
        if (!r1.s())
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

    private terException()
    {
        a = null;
        a();
    }

    a(byte byte0)
    {
        this();
    }

    private <init>(com.c.b.c.a a1)
    {
        super(a1);
        a = null;
        a();
    }

    a(com.c.b.c.a a1, byte byte0)
    {
        this(a1);
    }
}
