// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.c.b:
//            i, ac, av, by, 
//            g, h, be, bk, 
//            aq, bd, as, bn

public static final class <init> extends 
    implements 
{
    public static final class a extends as.c
        implements i.x
    {

        private int a;
        private boolean b;
        private List c;
        private bn d;

        private a d(bd bd)
        {
            if (bd instanceof i.w)
            {
                return a((i.w)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private a d(g g1, aq aq)
        {
            g1 = (i.w)i.w.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (i.w)aq.a();
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

        private i.w t()
        {
            i.w w1 = g();
            if (!w1.a())
            {
                throw b(w1);
            } else
            {
                return w1;
            }
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

        public final a.a a(bd bd)
        {
            return d(bd);
        }

        public final a.a a(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final a a(i.w w1)
        {
            bn bn1;
            bn1 = null;
            if (w1 == i.w.k())
            {
                return this;
            }
            if (w1.h())
            {
                boolean flag = w1.i();
                a = a | 1;
                b = flag;
                q();
            }
            if (d != null) goto _L2; else goto _L1
_L1:
            if (!i.w.b(w1).isEmpty())
            {
                if (c.isEmpty())
                {
                    c = i.w.b(w1);
                    a = a & -3;
                } else
                {
                    if ((a & 2) != 2)
                    {
                        c = new ArrayList(c);
                        a = a | 2;
                    }
                    c.addAll(i.w.b(w1));
                }
                q();
            }
_L4:
            a(((as.d) (w1)));
            d(w1.e);
            q();
            return this;
_L2:
            if (!i.w.b(w1).isEmpty())
            {
                if (d.d())
                {
                    d.b();
                    d = null;
                    c = i.w.b(w1);
                    a = a & -3;
                    if (as.d)
                    {
                        bn1 = u();
                    }
                    d = bn1;
                } else
                {
                    d.a(i.w.b(w1));
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final boolean a()
        {
            int l = 0;
_L7:
            i.ag ag;
            int i1;
            if (d == null)
            {
                i1 = c.size();
            } else
            {
                i1 = d.c();
            }
            if (l >= i1) goto _L2; else goto _L1
_L1:
            if (d == null)
            {
                ag = (i.ag)c.get(l);
            } else
            {
                ag = (i.ag)d.a(l);
            }
            if (ag.a()) goto _L4; else goto _L3
_L3:
            return false;
_L4:
            l++;
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
            return com.c.b.i.I().a(com/c/b/i$w, com/c/b/i$w$a);
        }

        public final ak.a e()
        {
            return com.c.b.i.H();
        }

        public final i.w g()
        {
            int l = 1;
            i.w w1 = new i.w(this, (byte)0);
            if ((a & 1) != 1)
            {
                l = 0;
            }
            i.w.a(w1, b);
            if (d == null)
            {
                if ((a & 2) == 2)
                {
                    c = Collections.unmodifiableList(c);
                    a = a & -3;
                }
                i.w.a(w1, c);
            } else
            {
                i.w.a(w1, d.e());
            }
            i.w.a(w1, l);
            l();
            return w1;
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
            return i.w.k();
        }

        private a()
        {
            c = Collections.emptyList();
            s();
        }

        a(byte byte0)
        {
            this();
        }

        private a(as.b b1)
        {
            super(b1);
            c = Collections.emptyList();
            s();
        }

        a(as.b b1, byte byte0)
        {
            this(b1);
        }
    }


    public static final bk c = new ac();
    private static final init> k = new <init>();
    private int f;
    private boolean g;
    private List h;
    private byte i;
    private int j;

    static int a(st st, int l)
    {
        st.f = l;
        return l;
    }

    public static a a(f f1)
    {
        return k.j().a(f1);
    }

    static List a(st st, List list)
    {
        st.h = list;
        return list;
    }

    static boolean a(h h1, boolean flag)
    {
        h1.g = flag;
        return flag;
    }

    static List b(g g1)
    {
        return g1.h;
    }

    public static h k()
    {
        return k;
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
            h1.a(33, g);
        }
        for (int l = 0; l < h.size(); l++)
        {
            h1.b(999, (be)h.get(l));
        }

        a1.a(h1);
        e.a(h1);
    }

    public final boolean a()
    {
        boolean flag = false;
        byte byte0 = i;
        if (byte0 == 1)
        {
            flag = true;
        } else
        if (byte0 != 0)
        {
            for (int l = 0; l < h.size(); l++)
            {
                if (!(()h.get(l)).a())
                {
                    i = 0;
                    return false;
                }
            }

            if (!M())
            {
                i = 0;
                return false;
            } else
            {
                i = 1;
                return true;
            }
        }
        return flag;
    }

    public final int b()
    {
        int i1 = 0;
        int l = j;
        if (l != -1)
        {
            return l;
        }
        if ((f & 1) == 1)
        {
            l = com.c.b.h.j(33) + 1 + 0;
        } else
        {
            l = 0;
        }
        while (i1 < h.size()) 
        {
            int j1 = com.c.b.h.d(999, (be)h.get(i1));
            i1++;
            l = j1 + l;
        }
        l = O() + l + e.b();
        j = l;
        return l;
    }

    protected final  c_()
    {
        return com.c.b.i.I().a(com/c/b/i$w, com/c/b/i$w$a);
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

    public final a j()
    {
        if (this == k)
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
        return k.j();
    }

    public final  v()
    {
        return j();
    }

    public final volatile bd w()
    {
        return k;
    }


    private ()
    {
        i = -1;
        j = -1;
        g = false;
        h = Collections.emptyList();
    }

    private ( )
    {
        super();
        i = -1;
        j = -1;
    }

    ( , byte byte0)
    {
        this();
    }

    private st(g g1, aq aq)
    {
         ;
        int l;
        boolean flag;
        l = 0;
        this();
         = by.c();
        flag = false;
_L11:
        if (flag) goto _L2; else goto _L1
_L1:
        int j1;
        int k1;
        int l1;
        j1 = l;
        k1 = l;
        l1 = l;
        int i1 = g1.a();
        i1;
        JVM INSTR lookupswitch 3: default 345
    //                   0: 348
    //                   264: 102
    //                   7994: 199;
           goto _L3 _L4 _L5 _L6
_L3:
        j1 = l;
        k1 = l;
        l1 = l;
        if (!a(g1, , aq, i1))
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        j1 = l;
        k1 = l;
        l1 = l;
        f = f | 1;
        j1 = l;
        k1 = l;
        l1 = l;
        g = g1.i();
        continue; /* Loop/switch isn't completed */
        g1;
        l = j1;
        throw new RuntimeException(g1.a(this));
        g1;
_L9:
        if ((l & 2) == 2)
        {
            h = Collections.unmodifiableList(h);
        }
        e = .b();
        L();
        throw g1;
_L6:
        i1 = l;
        if ((l & 2) == 2) goto _L8; else goto _L7
_L7:
        j1 = l;
        k1 = l;
        l1 = l;
        h = new ArrayList();
        i1 = l | 2;
_L8:
        j1 = i1;
        k1 = i1;
        l1 = i1;
        h.add(g1.a(.c, aq));
        l = i1;
        continue; /* Loop/switch isn't completed */
        g1;
        l = k1;
        throw new RuntimeException((new av(g1.getMessage())).a(this));
_L2:
        if ((l & 2) == 2)
        {
            h = Collections.unmodifiableList(h);
        }
        e = .b();
        L();
        return;
        g1;
        l = l1;
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
