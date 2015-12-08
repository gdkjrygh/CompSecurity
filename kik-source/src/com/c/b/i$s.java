// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.c.b:
//            i, aa, av, by, 
//            g, h, be, bk, 
//            aq, bd, as, bn

public static final class <init> extends 
    implements 
{
    public static final class a extends as.c
        implements i.t
    {

        private int a;
        private boolean b;
        private boolean c;
        private boolean d;
        private boolean e;
        private List f;
        private bn g;

        private a d(bd bd)
        {
            if (bd instanceof i.s)
            {
                return a((i.s)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private a d(g g1, aq aq)
        {
            g1 = (i.s)i.s.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (i.s)aq.a();
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

        private i.s t()
        {
            i.s s1 = g();
            if (!s1.a())
            {
                throw b(s1);
            } else
            {
                return s1;
            }
        }

        private bn u()
        {
            if (g == null)
            {
                List list = f;
                boolean flag;
                if ((a & 0x10) == 16)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                g = new bn(list, flag, p(), n());
                f = null;
            }
            return g;
        }

        public final a.a a(bd bd)
        {
            return d(bd);
        }

        public final a.a a(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final a a(i.s s1)
        {
            bn bn1;
            bn1 = null;
            if (s1 == i.s.q())
            {
                return this;
            }
            if (s1.h())
            {
                boolean flag = s1.i();
                a = a | 1;
                b = flag;
                q();
            }
            if (s1.j())
            {
                boolean flag1 = s1.k();
                a = a | 2;
                c = flag1;
                q();
            }
            if (s1.l())
            {
                boolean flag2 = s1.m();
                a = a | 4;
                d = flag2;
                q();
            }
            if (s1.n())
            {
                boolean flag3 = s1.o();
                a = a | 8;
                e = flag3;
                q();
            }
            if (g != null) goto _L2; else goto _L1
_L1:
            if (!i.s.b(s1).isEmpty())
            {
                if (f.isEmpty())
                {
                    f = i.s.b(s1);
                    a = a & 0xffffffef;
                } else
                {
                    if ((a & 0x10) != 16)
                    {
                        f = new ArrayList(f);
                        a = a | 0x10;
                    }
                    f.addAll(i.s.b(s1));
                }
                q();
            }
_L4:
            a(((as.d) (s1)));
            d(s1.e);
            q();
            return this;
_L2:
            if (!i.s.b(s1).isEmpty())
            {
                if (g.d())
                {
                    g.b();
                    g = null;
                    f = i.s.b(s1);
                    a = a & 0xffffffef;
                    if (as.d)
                    {
                        bn1 = u();
                    }
                    g = bn1;
                } else
                {
                    g.a(i.s.b(s1));
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final boolean a()
        {
            int i1 = 0;
_L7:
            i.ag ag;
            int j1;
            if (g == null)
            {
                j1 = f.size();
            } else
            {
                j1 = g.c();
            }
            if (i1 >= j1) goto _L2; else goto _L1
_L1:
            if (g == null)
            {
                ag = (i.ag)f.get(i1);
            } else
            {
                ag = (i.ag)g.a(i1);
            }
            if (ag.a()) goto _L4; else goto _L3
_L3:
            return false;
_L4:
            i1++;
            continue; /* Loop/switch isn't completed */
_L2:
            if (!r()) goto _L3; else goto _L5
_L5:
            return true;
            if (true) goto _L7; else goto _L6
_L6:
        }

        public final b.a b(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final bd.a c(bd bd)
        {
            return d(bd);
        }

        public final be.a c(g g1, aq aq)
        {
            return d(g1, aq);
        }

        protected final as.g d()
        {
            return com.c.b.i.y().a(com/c/b/i$s, com/c/b/i$s$a);
        }

        public final ak.a e()
        {
            return com.c.b.i.x();
        }

        public final i.s g()
        {
            int j1 = 1;
            i.s s1 = new i.s(this, (byte)0);
            int k1 = a;
            int i1;
            if ((k1 & 1) != 1)
            {
                j1 = 0;
            }
            i.s.a(s1, b);
            i1 = j1;
            if ((k1 & 2) == 2)
            {
                i1 = j1 | 2;
            }
            i.s.b(s1, c);
            j1 = i1;
            if ((k1 & 4) == 4)
            {
                j1 = i1 | 4;
            }
            i.s.c(s1, d);
            i1 = j1;
            if ((k1 & 8) == 8)
            {
                i1 = j1 | 8;
            }
            i.s.d(s1, e);
            if (g == null)
            {
                if ((a & 0x10) == 16)
                {
                    f = Collections.unmodifiableList(f);
                    a = a & 0xffffffef;
                }
                i.s.a(s1, f);
            } else
            {
                i.s.a(s1, g.e());
            }
            i.s.a(s1, i1);
            l();
            return s1;
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
            return i.s.q();
        }

        private a()
        {
            f = Collections.emptyList();
            s();
        }

        a(byte byte0)
        {
            this();
        }

        private a(as.b b1)
        {
            super(b1);
            f = Collections.emptyList();
            s();
        }

        a(as.b b1, byte byte0)
        {
            this(b1);
        }
    }


    public static final bk c = new aa();
    private static final init> n = new <init>();
    private int f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private List k;
    private byte l;
    private int m;

    static int a(st st, int i1)
    {
        st.f = i1;
        return i1;
    }

    public static a a(f f1)
    {
        return n.p().a(f1);
    }

    static List a(st st, List list)
    {
        st.k = list;
        return list;
    }

    static boolean a(k k1, boolean flag)
    {
        k1.g = flag;
        return flag;
    }

    static List b(g g1)
    {
        return g1.k;
    }

    static boolean b(k k1, boolean flag)
    {
        k1.h = flag;
        return flag;
    }

    static boolean c(h h1, boolean flag)
    {
        h1.i = flag;
        return flag;
    }

    static boolean d(i i1, boolean flag)
    {
        i1.j = flag;
        return flag;
    }

    public static j q()
    {
        return n;
    }

    protected final  a( )
    {
        return new a(, (byte)0);
    }

    public final void a(h h1)
    {
        .a a1 = N();
        if ((f & 1) == 1)
        {
            h1.a(1, g);
        }
        if ((f & 2) == 2)
        {
            h1.a(2, h);
        }
        if ((f & 4) == 4)
        {
            h1.a(3, i);
        }
        if ((f & 8) == 8)
        {
            h1.a(7, j);
        }
        for (int i1 = 0; i1 < k.size(); i1++)
        {
            h1.b(999, (be)k.get(i1));
        }

        a1.a(h1);
        e.a(h1);
    }

    public final boolean a()
    {
        boolean flag = false;
        byte byte0 = l;
        if (byte0 == 1)
        {
            flag = true;
        } else
        if (byte0 != 0)
        {
            for (int i1 = 0; i1 < k.size(); i1++)
            {
                if (!(()k.get(i1)).a())
                {
                    l = 0;
                    return false;
                }
            }

            if (!M())
            {
                l = 0;
                return false;
            } else
            {
                l = 1;
                return true;
            }
        }
        return flag;
    }

    public final int b()
    {
        boolean flag = false;
        int i1 = m;
        if (i1 != -1)
        {
            return i1;
        }
        int j1;
        if ((f & 1) == 1)
        {
            j1 = com.c.b.h.j(1) + 1 + 0;
        } else
        {
            j1 = 0;
        }
        i1 = j1;
        if ((f & 2) == 2)
        {
            i1 = j1 + (com.c.b.h.j(2) + 1);
        }
        j1 = i1;
        if ((f & 4) == 4)
        {
            j1 = i1 + (com.c.b.h.j(3) + 1);
        }
        i1 = j1;
        if ((f & 8) == 8)
        {
            i1 = j1 + (com.c.b.h.j(7) + 1);
        }
        for (j1 = ((flag) ? 1 : 0); j1 < k.size();)
        {
            int k1 = com.c.b.h.d(999, (be)k.get(j1));
            j1++;
            i1 = k1 + i1;
        }

        i1 = O() + i1 + e.b();
        m = i1;
        return i1;
    }

    protected final  c_()
    {
        return com.c.b.i.y().a(com/c/b/i$s, com/c/b/i$s$a);
    }

    public final by f()
    {
        return e;
    }

    public final boolean h()
    {
        return (f & 1) == 1;
    }

    public final boolean i()
    {
        return g;
    }

    public final boolean j()
    {
        return (f & 2) == 2;
    }

    public final boolean k()
    {
        return h;
    }

    public final boolean l()
    {
        return (f & 4) == 4;
    }

    public final boolean m()
    {
        return i;
    }

    public final boolean n()
    {
        return (f & 8) == 8;
    }

    public final boolean o()
    {
        return j;
    }

    public final a p()
    {
        if (this == n)
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

    public final  u()
    {
        return n.p();
    }

    public final  v()
    {
        return p();
    }

    public final volatile bd w()
    {
        return n;
    }


    private ()
    {
        l = -1;
        m = -1;
        g = false;
        h = false;
        i = false;
        j = false;
        k = Collections.emptyList();
    }

    private ( )
    {
        super();
        l = -1;
        m = -1;
    }

    ( , byte byte0)
    {
        this();
    }

    private st(g g1, aq aq)
    {
         ;
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
        JVM INSTR lookupswitch 6: default 504
    //                   0: 507
    //                   8: 126
    //                   16: 225
    //                   24: 298
    //                   56: 343
    //                   7994: 389;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        if (a(g1, , aq, j1)) goto _L11; else goto _L10
_L10:
        flag = true;
          goto _L11
_L5:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f = f | 1;
        k1 = i1;
        l1 = i1;
        i2 = i1;
        g = g1.i();
          goto _L11
        g1;
        i1 = k1;
        throw new RuntimeException(g1.a(this));
        g1;
_L14:
        if ((i1 & 0x10) == 16)
        {
            k = Collections.unmodifiableList(k);
        }
        e = .b();
        L();
        throw g1;
_L6:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f = f | 2;
        k1 = i1;
        l1 = i1;
        i2 = i1;
        h = g1.i();
          goto _L11
        g1;
        i1 = l1;
        throw new RuntimeException((new av(g1.getMessage())).a(this));
_L7:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f = f | 4;
        k1 = i1;
        l1 = i1;
        i2 = i1;
        i = g1.i();
          goto _L11
_L8:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f = f | 8;
        k1 = i1;
        l1 = i1;
        i2 = i1;
        j = g1.i();
          goto _L11
_L9:
        j1 = i1;
        if ((i1 & 0x10) == 16) goto _L13; else goto _L12
_L12:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        k = new ArrayList();
        j1 = i1 | 0x10;
_L13:
        k1 = j1;
        l1 = j1;
        i2 = j1;
        k.add(g1.a(.c, aq));
        i1 = j1;
          goto _L11
_L2:
        if ((i1 & 0x10) == 16)
        {
            k = Collections.unmodifiableList(k);
        }
        e = .b();
        L();
        return;
_L4:
        flag = true;
          goto _L11
        g1;
        i1 = i2;
          goto _L14
    }

    L(g g1, aq aq, byte byte0)
    {
        this(g1, aq);
    }
}
