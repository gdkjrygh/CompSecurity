// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.c.b:
//            i, o, av, by, 
//            g, h, be, bk, 
//            aq, bd, as, bn

public static final class <init> extends 
    implements 
{
    public static final class a extends as.c
        implements i.f
    {

        private int a;
        private boolean b;
        private boolean c;
        private List d;
        private bn e;

        private a d(bd bd)
        {
            if (bd instanceof i.e)
            {
                return a((i.e)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private a d(g g1, aq aq)
        {
            g1 = (i.e)i.e.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (i.e)aq.a();
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

        private i.e t()
        {
            i.e e1 = g();
            if (!e1.a())
            {
                throw b(e1);
            } else
            {
                return e1;
            }
        }

        private bn u()
        {
            if (e == null)
            {
                List list = d;
                boolean flag;
                if ((a & 4) == 4)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                e = new bn(list, flag, p(), n());
                d = null;
            }
            return e;
        }

        public final a.a a(bd bd)
        {
            return d(bd);
        }

        public final a.a a(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final a a(i.e e1)
        {
            bn bn1;
            bn1 = null;
            if (e1 == i.e.m())
            {
                return this;
            }
            if (e1.h())
            {
                boolean flag = e1.i();
                a = a | 1;
                b = flag;
                q();
            }
            if (e1.j())
            {
                boolean flag1 = e1.k();
                a = a | 2;
                c = flag1;
                q();
            }
            if (e != null) goto _L2; else goto _L1
_L1:
            if (!i.e.b(e1).isEmpty())
            {
                if (d.isEmpty())
                {
                    d = i.e.b(e1);
                    a = a & -5;
                } else
                {
                    if ((a & 4) != 4)
                    {
                        d = new ArrayList(d);
                        a = a | 4;
                    }
                    d.addAll(i.e.b(e1));
                }
                q();
            }
_L4:
            a(((as.d) (e1)));
            d(e1.e);
            q();
            return this;
_L2:
            if (!i.e.b(e1).isEmpty())
            {
                if (e.d())
                {
                    e.b();
                    e = null;
                    d = i.e.b(e1);
                    a = a & -5;
                    if (as.d)
                    {
                        bn1 = u();
                    }
                    e = bn1;
                } else
                {
                    e.a(i.e.b(e1));
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
            if (e == null)
            {
                j1 = d.size();
            } else
            {
                j1 = e.c();
            }
            if (i1 >= j1) goto _L2; else goto _L1
_L1:
            if (e == null)
            {
                ag = (i.ag)d.get(i1);
            } else
            {
                ag = (i.ag)e.a(i1);
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
            return com.c.b.i.C().a(com/c/b/i$e, com/c/b/i$e$a);
        }

        public final ak.a e()
        {
            return com.c.b.i.B();
        }

        public final i.e g()
        {
            int i1 = 1;
            i.e e1 = new i.e(this, (byte)0);
            int k1 = a;
            int j1;
            if ((k1 & 1) != 1)
            {
                i1 = 0;
            }
            i.e.a(e1, b);
            j1 = i1;
            if ((k1 & 2) == 2)
            {
                j1 = i1 | 2;
            }
            i.e.b(e1, c);
            if (e == null)
            {
                if ((a & 4) == 4)
                {
                    d = Collections.unmodifiableList(d);
                    a = a & -5;
                }
                i.e.a(e1, d);
            } else
            {
                i.e.a(e1, e.e());
            }
            i.e.a(e1, j1);
            l();
            return e1;
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
            return i.e.m();
        }

        private a()
        {
            d = Collections.emptyList();
            s();
        }

        a(byte byte0)
        {
            this();
        }

        private a(as.b b1)
        {
            super(b1);
            d = Collections.emptyList();
            s();
        }

        a(as.b b1, byte byte0)
        {
            this(b1);
        }
    }


    public static final bk c = new o();
    private static final nit> l = new <init>();
    private int f;
    private boolean g;
    private boolean h;
    private List i;
    private byte j;
    private int k;

    static int a(st st, int i1)
    {
        st.f = i1;
        return i1;
    }

    public static a a(f f1)
    {
        return l.l().a(f1);
    }

    static List a(st st, List list)
    {
        st.i = list;
        return list;
    }

    static boolean a(i i1, boolean flag)
    {
        i1.g = flag;
        return flag;
    }

    static List b(g g1)
    {
        return g1.i;
    }

    static boolean b(i i1, boolean flag)
    {
        i1.h = flag;
        return flag;
    }

    public static h m()
    {
        return l;
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
            h1.a(2, g);
        }
        if ((f & 2) == 2)
        {
            h1.a(3, h);
        }
        for (int i1 = 0; i1 < i.size(); i1++)
        {
            h1.b(999, (be)i.get(i1));
        }

        a1.a(h1);
        e.a(h1);
    }

    public final boolean a()
    {
        boolean flag = false;
        byte byte0 = j;
        if (byte0 == 1)
        {
            flag = true;
        } else
        if (byte0 != 0)
        {
            for (int i1 = 0; i1 < i.size(); i1++)
            {
                if (!(()i.get(i1)).a())
                {
                    j = 0;
                    return false;
                }
            }

            if (!M())
            {
                j = 0;
                return false;
            } else
            {
                j = 1;
                return true;
            }
        }
        return flag;
    }

    public final int b()
    {
        boolean flag = false;
        int i1 = k;
        if (i1 != -1)
        {
            return i1;
        }
        int j1;
        if ((f & 1) == 1)
        {
            i1 = com.c.b.h.j(2) + 1 + 0;
        } else
        {
            i1 = 0;
        }
        j1 = i1;
        if ((f & 2) == 2)
        {
            j1 = i1 + (com.c.b.h.j(3) + 1);
        }
        i1 = j1;
        for (int k1 = ((flag) ? 1 : 0); k1 < i.size();)
        {
            int l1 = com.c.b.h.d(999, (be)i.get(k1));
            k1++;
            i1 = l1 + i1;
        }

        i1 = O() + i1 + e.b();
        k = i1;
        return i1;
    }

    protected final  c_()
    {
        return com.c.b.i.C().a(com/c/b/i$e, com/c/b/i$e$a);
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

    public final a l()
    {
        if (this == l)
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
        return l.l();
    }

    public final  v()
    {
        return l();
    }

    public final volatile bd w()
    {
        return l;
    }


    private ()
    {
        j = -1;
        k = -1;
        g = false;
        h = false;
        i = Collections.emptyList();
    }

    private ( )
    {
        super();
        j = -1;
        k = -1;
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
_L12:
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
        JVM INSTR lookupswitch 4: default 398
    //                   0: 401
    //                   16: 110
    //                   24: 207
    //                   7994: 280;
           goto _L3 _L4 _L5 _L6 _L7
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
        f = f | 1;
        k1 = i1;
        l1 = i1;
        i2 = i1;
        g = g1.i();
        continue; /* Loop/switch isn't completed */
        g1;
        i1 = k1;
        throw new RuntimeException(g1.a(this));
        g1;
_L10:
        if ((i1 & 4) == 4)
        {
            i = Collections.unmodifiableList(i);
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
        continue; /* Loop/switch isn't completed */
        g1;
        i1 = l1;
        throw new RuntimeException((new av(g1.getMessage())).a(this));
_L7:
        j1 = i1;
        if ((i1 & 4) == 4) goto _L9; else goto _L8
_L8:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        i = new ArrayList();
        j1 = i1 | 4;
_L9:
        k1 = j1;
        l1 = j1;
        i2 = j1;
        i.add(g1.a(.c, aq));
        i1 = j1;
        continue; /* Loop/switch isn't completed */
        g1;
        i1 = i2;
        if (true) goto _L10; else goto _L2
_L2:
        if ((i1 & 4) == 4)
        {
            i = Collections.unmodifiableList(i);
        }
        e = .b();
        L();
        return;
_L4:
        flag = true;
        if (true) goto _L12; else goto _L11
_L11:
    }

    L(g g1, aq aq, byte byte0)
    {
        this(g1, aq);
    }
}
