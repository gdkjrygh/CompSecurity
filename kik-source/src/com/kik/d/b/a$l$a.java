// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.d.b;

import com.c.b.aq;
import com.c.b.av;
import com.c.b.bd;
import com.c.b.be;
import com.c.b.bk;
import com.c.b.g;

// Referenced classes of package com.kik.d.b:
//            a

public static final class <init> extends com.c.b.l.a
    implements <init>
{

    private int a;
    private Object b;
    private Object c;

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

    private a s()
    {
        int k = 1;
        a a1 = new nit>(this, (byte)0);
        int j1 = a;
        int i1;
        if ((j1 & 1) != 1)
        {
            k = 0;
        }
        a(a1, b);
        i1 = k;
        if ((j1 & 2) == 2)
        {
            i1 = k | 2;
        }
        b(a1, c);
        c(a1, i1);
        l();
        return a1;
    }

    public final com.c.b.l.a a(bd bd)
    {
        return d(bd);
    }

    public final com.c.b.l.a a(g g, aq aq)
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
        d(d(d1));
        q();
        return this;
    }

    public final q a(String s1)
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
        if (flag)
        {
            boolean flag1;
            if ((a & 2) == 2)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                return true;
            }
        }
        return false;
    }

    public final com.c.b.l.a b(g g, aq aq)
    {
        return d(g, aq);
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

    public final com.c.b.l.a c(bd bd)
    {
        return d(bd);
    }

    public final com.c.b.l.a c(g g, aq aq)
    {
        return d(g, aq);
    }

    protected final com.c.b.l.a d()
    {
        return com.kik.d.b.a.j().(com/kik/d/b/a$l, com/kik/d/b/a$l$a);
    }

    public final com.c.b.l.a e()
    {
        return com.kik.d.b.a.i();
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
        b = "";
        c = "";
        c();
    }

    c(byte byte0)
    {
        this();
    }

    private <init>(com.c.b.l.a a1)
    {
        super(a1);
        b = "";
        c = "";
        c();
    }

    c(com.c.b.l.a a1, byte byte0)
    {
        this(a1);
    }
}
