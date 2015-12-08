// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.d.b;

import com.c.b.aq;
import com.c.b.as;
import com.c.b.av;
import com.c.b.bd;
import com.c.b.be;
import com.c.b.bk;
import com.c.b.by;
import com.c.b.g;
import com.c.b.h;
import java.io.IOException;

// Referenced classes of package com.kik.d.b:
//            a, h

public static final class <init> extends as
    implements <init>
{
    public static final class a extends com.c.b.as.a
        implements a.j
    {

        private int a;
        private int b;

        private a d(bd bd)
        {
            if (bd instanceof a.i)
            {
                return a((a.i)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private a d(g g1, aq aq)
        {
            g1 = (a.i)a.i.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (a.i)aq.a();
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

        public final com.c.b.a.a a(bd bd)
        {
            return d(bd);
        }

        public final com.c.b.a.a a(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final a a(a.i i1)
        {
            if (i1 == a.i.l())
            {
                return this;
            }
            if (i1.h())
            {
                a(i1.i());
            }
            d(a.i.b(i1));
            q();
            return this;
        }

        public final a a(a.k k1)
        {
            if (k1 == null)
            {
                throw new NullPointerException();
            } else
            {
                a = a | 1;
                b = k1.a();
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
            return flag;
        }

        public final com.c.b.b.a b(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final com.c.b.bd.a c(bd bd)
        {
            return d(bd);
        }

        public final com.c.b.be.a c(g g1, aq aq)
        {
            return d(g1, aq);
        }

        protected final com.c.b.as.g d()
        {
            return com.kik.d.b.a.b().a(com/kik/d/b/a$i, com/kik/d/b/a$i$a);
        }

        public final com.c.b.ak.a e()
        {
            return com.kik.d.b.a.a();
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

        public final a.i r()
        {
            a.i i1 = s();
            if (!i1.a())
            {
                throw b(i1);
            } else
            {
                return i1;
            }
        }

        public final a.i s()
        {
            int j1 = 1;
            a.i i1 = new a.i(this, (byte)0);
            if ((a & 1) != 1)
            {
                j1 = 0;
            }
            a.i.a(i1, b);
            a.i.b(i1, j1);
            l();
            return i1;
        }

        public final bd w()
        {
            return a.i.l();
        }

        private a()
        {
            b = 300;
            a.i.m();
        }

        a(byte byte0)
        {
            this();
        }

        private a(com.c.b.as.b b1)
        {
            super(b1);
            b = 300;
            a.i.m();
        }

        a(com.c.b.as.b b1, byte byte0)
        {
            this(b1);
        }
    }


    public static final bk c = new com.kik.d.b.h();
    private static final nit> j = new <init>();
    private int f;
    private int g;
    private byte h;
    private int i;

    static int a(l l1, int i1)
    {
        l1.g = i1;
        return i1;
    }

    public static a a(g g1)
    {
        return j.k().a(g1);
    }

    static int b(a.a a1, int i1)
    {
        a1.f = i1;
        return i1;
    }

    static by b(f f1)
    {
        return f1.e;
    }

    public static a j()
    {
        return j.k();
    }

    public static k l()
    {
        return j;
    }

    static boolean m()
    {
        return d;
    }

    protected final com.c.b. a(com.c.b. )
    {
        return new a(, (byte)0);
    }

    public final void a(h h1)
    {
        if ((f & 1) == 1)
        {
            h1.c(1, g);
        }
        e.a(h1);
    }

    public final boolean a()
    {
        byte byte0 = h;
        if (byte0 == 1)
        {
            return true;
        }
        if (byte0 == 0)
        {
            return false;
        }
        if (!h())
        {
            h = 0;
            return false;
        } else
        {
            h = 1;
            return true;
        }
    }

    public final int b()
    {
        int i1 = i;
        if (i1 != -1)
        {
            return i1;
        }
        i1 = 0;
        if ((f & 1) == 1)
        {
            i1 = com.c.b.h.f(1, g) + 0;
        }
        i1 += e.b();
        i = i1;
        return i1;
    }

    protected final com.c.b. c_()
    {
        return com.kik.d.b.a.b().a(com/kik/d/b/a$i, com/kik/d/b/a$i$a);
    }

    public final by f()
    {
        return e;
    }

    public final boolean h()
    {
        return (f & 1) == 1;
    }

    public final f i()
    {
        f f2 = a(g);
        f f1 = f2;
        if (f2 == null)
        {
            f1 = a;
        }
        return f1;
    }

    public final a k()
    {
        if (this == j)
        {
            return new a((byte)0);
        } else
        {
            return (new a((byte)0)).a(this);
        }
    }

    public final bk t()
    {
        return c;
    }

    public final com.c.b. u()
    {
        return j.k();
    }

    public final com.c.b. v()
    {
        return k();
    }

    public final volatile bd w()
    {
        return j;
    }


    private a()
    {
        h = -1;
        i = -1;
        g = 300;
    }

    private g(com.c.b. )
    {
        super();
        h = -1;
        i = -1;
    }

    i(com.c.b. , byte byte0)
    {
        this();
    }

    private ble(g g1, aq aq)
    {
        com.c.b. ;
        boolean flag;
        this();
         = by.c();
        flag = false;
_L8:
        if (flag) goto _L2; else goto _L1
_L1:
        int i1 = g1.a();
        i1;
        JVM INSTR lookupswitch 2: default 180
    //                   0: 183
    //                   8: 70;
           goto _L3 _L4 _L5
_L3:
        if (!a(g1, , aq, i1))
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        i1 = g1.n();
        if (a(i1) == null)
        {
            .a(1, i1);
            continue; /* Loop/switch isn't completed */
        }
          goto _L6
        g1;
        throw new RuntimeException(g1.a(this));
        g1;
        e = .b();
        L();
        throw g1;
_L6:
        f = f | 1;
        g = i1;
        continue; /* Loop/switch isn't completed */
        g1;
        throw new RuntimeException((new av(g1.getMessage())).a(this));
_L2:
        e = .b();
        L();
        return;
_L4:
        flag = true;
        if (true) goto _L8; else goto _L7
_L7:
    }

    L(g g1, aq aq, byte byte0)
    {
        this(g1, aq);
    }
}
