// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.d.b;

import com.c.b.aq;
import com.c.b.as;
import com.c.b.av;
import com.c.b.ay;
import com.c.b.az;
import com.c.b.bd;
import com.c.b.be;
import com.c.b.bk;
import com.c.b.bm;
import com.c.b.by;
import com.c.b.f;
import com.c.b.g;
import com.c.b.h;
import java.io.IOException;

// Referenced classes of package com.kik.d.b:
//            a, k

public static final class <init> extends as
    implements <init>
{
    public static final class a extends com.c.b.as.a
        implements a.o
    {

        private int a;
        private Object b;
        private az c;

        private a d(bd bd)
        {
            if (bd instanceof a.n)
            {
                return a((a.n)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private a d(g g1, aq aq)
        {
            g1 = (a.n)a.n.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (a.n)aq.a();
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

        private a.n s()
        {
            int i1 = 1;
            a.n n1 = new a.n(this, (byte)0);
            if ((a & 1) != 1)
            {
                i1 = 0;
            }
            a.n.a(n1, b);
            if ((a & 2) == 2)
            {
                c = c.e();
                a = a & -3;
            }
            a.n.a(n1, c);
            a.n.a(n1, i1);
            l();
            return n1;
        }

        private void t()
        {
            if ((a & 2) != 2)
            {
                c = new ay(c);
                a = a | 2;
            }
        }

        public final com.c.b.a.a a(bd bd)
        {
            return d(bd);
        }

        public final com.c.b.a.a a(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final a a(a.n n1)
        {
            if (n1 == a.n.j())
            {
                return this;
            }
            if (n1.h())
            {
                a = a | 1;
                b = a.n.a(n1);
                q();
            }
            if (!a.n.b(n1).isEmpty())
            {
                if (c.isEmpty())
                {
                    c = a.n.b(n1);
                    a = a & -3;
                } else
                {
                    t();
                    c.addAll(a.n.b(n1));
                }
                q();
            }
            d(a.n.c(n1));
            q();
            return this;
        }

        public final a a(Iterable iterable)
        {
            t();
            com.c.b.b.a.a(iterable, c);
            q();
            return this;
        }

        public final a a(String s1)
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
            return com.kik.d.b.a.n().a(com/kik/d/b/a$n, com/kik/d/b/a$n$a);
        }

        public final com.c.b.ak.a e()
        {
            return com.kik.d.b.a.m();
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

        public final a.n r()
        {
            a.n n1 = s();
            if (!n1.a())
            {
                throw b(n1);
            } else
            {
                return n1;
            }
        }

        public final bd w()
        {
            return a.n.j();
        }

        private a()
        {
            b = "";
            c = ay.a;
            a.n.k();
        }

        a(byte byte0)
        {
            this();
        }

        private a(com.c.b.as.b b1)
        {
            super(b1);
            b = "";
            c = ay.a;
            a.n.k();
        }

        a(com.c.b.as.b b1, byte byte0)
        {
            this(b1);
        }
    }


    public static final bk c = new k();
    private static final nit> k = new <init>();
    private int f;
    private volatile Object g;
    private az h;
    private byte i;
    private int j;

    static int a( , int i1)
    {
        .f = i1;
        return i1;
    }

    static az a(f f1, az az1)
    {
        f1.h = az1;
        return az1;
    }

    static Object a(h h1)
    {
        return h1.g;
    }

    static Object a( , Object obj)
    {
        .g = obj;
        return obj;
    }

    static az b(g g1)
    {
        return g1.h;
    }

    static by c(h h1)
    {
        return h1.e;
    }

    public static a i()
    {
        return k.m();
    }

    public static m j()
    {
        return k;
    }

    static boolean k()
    {
        return d;
    }

    private f l()
    {
        Object obj = g;
        if (obj instanceof String)
        {
            obj = com.c.b.f.a((String)obj);
            g = obj;
            return ((f) (obj));
        } else
        {
            return (f)obj;
        }
    }

    private a m()
    {
        if (this == k)
        {
            return new a((byte)0);
        } else
        {
            return (new a((byte)0)).a(this);
        }
    }

    protected final com.c.b. a(com.c.b. )
    {
        return new a(, (byte)0);
    }

    public final void a(h h1)
    {
        if ((f & 1) == 1)
        {
            h1.a(1, l());
        }
        for (int i1 = 0; i1 < h.size(); i1++)
        {
            h1.a(2, h.a(i1));
        }

        e.a(h1);
    }

    public final boolean a()
    {
        byte byte0 = i;
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
            i = 0;
            return false;
        } else
        {
            i = 1;
            return true;
        }
    }

    public final int b()
    {
        int j1 = 0;
        int i1 = j;
        if (i1 != -1)
        {
            return i1;
        }
        int k1;
        if ((f & 1) == 1)
        {
            i1 = com.c.b.h.c(1, l()) + 0;
        } else
        {
            i1 = 0;
        }
        k1 = 0;
        for (; j1 < h.size(); j1++)
        {
            k1 += com.c.b.h.b(h.a(j1));
        }

        i1 = i1 + k1 + h.size() * 1 + e.b();
        j = i1;
        return i1;
    }

    protected final com.c.b. c_()
    {
        return com.kik.d.b.a.n().a(com/kik/d/b/a$n, com/kik/d/b/a$n$a);
    }

    public final by f()
    {
        return e;
    }

    public final boolean h()
    {
        return (f & 1) == 1;
    }

    public final bk t()
    {
        return c;
    }

    public final com.c.b. u()
    {
        return k.m();
    }

    public final com.c.b. v()
    {
        return m();
    }

    public final volatile bd w()
    {
        return k;
    }


    private a()
    {
        i = -1;
        j = -1;
        g = "";
        h = ay.a;
    }

    private h(com.c.b. )
    {
        super();
        i = -1;
        j = -1;
    }

    j(com.c.b. , byte byte0)
    {
        this();
    }

    private ble(g g1, aq aq)
    {
        com.c.b. ;
        int i1;
        boolean flag;
        i1 = 0;
        this();
         = by.c();
        flag = false;
_L11:
        if (flag) goto _L2; else goto _L1
_L1:
        int k1;
        int l1;
        int i2;
        k1 = i1;
        l1 = i1;
        i2 = i1;
        int j1 = g1.a();
        j1;
        JVM INSTR lookupswitch 3: default 376
    //                   0: 379
    //                   10: 102
    //                   18: 217;
           goto _L3 _L4 _L5 _L6
_L3:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        if (!a(g1, , aq, j1))
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f f1 = g1.l();
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f = f | 1;
        k1 = i1;
        l1 = i1;
        i2 = i1;
        g = f1;
        continue; /* Loop/switch isn't completed */
        g1;
        i1 = k1;
        throw new RuntimeException(g1.a(this));
        g1;
_L9:
        if ((i1 & 2) == 2)
        {
            h = h.e();
        }
        e = .b();
        L();
        throw g1;
_L6:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f1 = g1.l();
        j1 = i1;
        if ((i1 & 2) == 2) goto _L8; else goto _L7
_L7:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        h = new ay();
        j1 = i1 | 2;
_L8:
        k1 = j1;
        l1 = j1;
        i2 = j1;
        h.a(f1);
        i1 = j1;
        continue; /* Loop/switch isn't completed */
        g1;
        i1 = l1;
        throw new RuntimeException((new av(g1.getMessage())).a(this));
_L2:
        if ((i1 & 2) == 2)
        {
            h = h.e();
        }
        e = .b();
        L();
        return;
        g1;
        i1 = i2;
          goto _L9
_L4:
        flag = true;
        if (true) goto _L11; else goto _L10
_L10:
    }

    L(g g1, aq aq, byte byte0)
    {
        this(g1, aq);
    }
}
