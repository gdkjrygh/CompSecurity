// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.c.b:
//            as, i, ah, ay, 
//            av, by, g, az, 
//            f, h, bm, bk, 
//            aq, bd, be

public static final class <init> extends as
    implements <init>
{
    public static final class a extends as.a
        implements i.ae.c
    {

        private int a;
        private List b;
        private List c;
        private Object d;
        private Object e;
        private az f;

        private a d(bd bd)
        {
            if (bd instanceof i.ae.b)
            {
                return a((i.ae.b)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private a d(g g1, aq aq)
        {
            g1 = (i.ae.b)i.ae.b.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (i.ae.b)aq.a();
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

        private i.ae.b r()
        {
            i.ae.b b1 = s();
            if (!b1.a())
            {
                throw b(b1);
            } else
            {
                return b1;
            }
        }

        private i.ae.b s()
        {
            int i1 = 1;
            i.ae.b b1 = new i.ae.b(this, (byte)0);
            int k1 = a;
            if ((a & 1) == 1)
            {
                b = Collections.unmodifiableList(b);
                a = a & -2;
            }
            i.ae.b.a(b1, b);
            if ((a & 2) == 2)
            {
                c = Collections.unmodifiableList(c);
                a = a & -3;
            }
            i.ae.b.b(b1, c);
            int j1;
            if ((k1 & 4) != 4)
            {
                i1 = 0;
            }
            i.ae.b.a(b1, d);
            j1 = i1;
            if ((k1 & 8) == 8)
            {
                j1 = i1 | 2;
            }
            i.ae.b.b(b1, e);
            if ((a & 0x10) == 16)
            {
                f = f.e();
                a = a & 0xffffffef;
            }
            i.ae.b.a(b1, f);
            i.ae.b.a(b1, j1);
            l();
            return b1;
        }

        public final a.a a(bd bd)
        {
            return d(bd);
        }

        public final a.a a(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final a a(i.ae.b b1)
        {
            if (b1 == i.ae.b.j())
            {
                return this;
            }
            if (!i.ae.b.a(b1).isEmpty())
            {
                if (b.isEmpty())
                {
                    b = i.ae.b.a(b1);
                    a = a & -2;
                } else
                {
                    if ((a & 1) != 1)
                    {
                        b = new ArrayList(b);
                        a = a | 1;
                    }
                    b.addAll(i.ae.b.a(b1));
                }
                q();
            }
            if (!i.ae.b.b(b1).isEmpty())
            {
                if (c.isEmpty())
                {
                    c = i.ae.b.b(b1);
                    a = a & -3;
                } else
                {
                    if ((a & 2) != 2)
                    {
                        c = new ArrayList(c);
                        a = a | 2;
                    }
                    c.addAll(i.ae.b.b(b1));
                }
                q();
            }
            if (b1.h())
            {
                a = a | 4;
                d = i.ae.b.c(b1);
                q();
            }
            if (b1.i())
            {
                a = a | 8;
                e = i.ae.b.d(b1);
                q();
            }
            if (!i.ae.b.e(b1).isEmpty())
            {
                if (f.isEmpty())
                {
                    f = i.ae.b.e(b1);
                    a = a & 0xffffffef;
                } else
                {
                    if ((a & 0x10) != 16)
                    {
                        f = new ay(f);
                        a = a | 0x10;
                    }
                    f.addAll(i.ae.b.e(b1));
                }
                q();
            }
            d(b1.e);
            q();
            return this;
        }

        public final boolean a()
        {
            return true;
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
            return com.c.b.i.Q().a(com/c/b/i$ae$b, com/c/b/i$ae$b$a);
        }

        public final ak.a e()
        {
            return com.c.b.i.P();
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

        public final bd w()
        {
            return i.ae.b.j();
        }

        private a()
        {
            b = Collections.emptyList();
            c = Collections.emptyList();
            d = "";
            e = "";
            f = ay.a;
        }

        a(byte byte0)
        {
            this();
        }

        private a(as.b b1)
        {
            super(b1);
            b = Collections.emptyList();
            c = Collections.emptyList();
            d = "";
            e = "";
            f = ay.a;
        }

        a(as.b b1, byte byte0)
        {
            this(b1);
        }
    }


    public static final bk c = new ah();
    private static final t> p = new <init>();
    private int f;
    private List g;
    private int h;
    private List i;
    private int j;
    private volatile Object k;
    private volatile Object l;
    private az m;
    private byte n;
    private int o;

    static int a(t t1, int i1)
    {
        t1.f = i1;
        return i1;
    }

    static az a(f f1, az az1)
    {
        f1.m = az1;
        return az1;
    }

    static Object a(t t1, Object obj)
    {
        t1.k = obj;
        return obj;
    }

    static List a(k k1)
    {
        return k1.g;
    }

    static List a(g g1, List list)
    {
        g1.g = list;
        return list;
    }

    static Object b(t t1, Object obj)
    {
        t1.l = obj;
        return obj;
    }

    static List b(l l1)
    {
        return l1.i;
    }

    static List b(i i1, List list)
    {
        i1.i = list;
        return list;
    }

    static Object c(i i1)
    {
        return i1.k;
    }

    static Object d(k k1)
    {
        return k1.l;
    }

    static az e(l l1)
    {
        return l1.m;
    }

    public static m j()
    {
        return p;
    }

    private f k()
    {
        Object obj = k;
        if (obj instanceof String)
        {
            obj = com.c.b.f.a((String)obj);
            k = obj;
            return ((f) (obj));
        } else
        {
            return (f)obj;
        }
    }

    private f l()
    {
        Object obj = l;
        if (obj instanceof String)
        {
            obj = com.c.b.f.a((String)obj);
            l = obj;
            return ((f) (obj));
        } else
        {
            return (f)obj;
        }
    }

    private a m()
    {
        if (this == p)
        {
            return new a((byte)0);
        } else
        {
            return (new a((byte)0)).a(this);
        }
    }

    protected final a.a a(a.a a1)
    {
        return new a(a1, (byte)0);
    }

    public final void a(h h1)
    {
        boolean flag = false;
        b();
        if (g.size() > 0)
        {
            h1.k(10);
            h1.k(h);
        }
        for (int i1 = 0; i1 < g.size(); i1++)
        {
            h1.b(((Integer)g.get(i1)).intValue());
        }

        if (i.size() > 0)
        {
            h1.k(18);
            h1.k(j);
        }
        for (int j1 = 0; j1 < i.size(); j1++)
        {
            h1.b(((Integer)i.get(j1)).intValue());
        }

        if ((f & 1) == 1)
        {
            h1.a(3, k());
        }
        int k1 = ((flag) ? 1 : 0);
        if ((f & 2) == 2)
        {
            h1.a(4, l());
            k1 = ((flag) ? 1 : 0);
        }
        for (; k1 < m.size(); k1++)
        {
            h1.a(6, m.a(k1));
        }

        e.a(h1);
    }

    public final boolean a()
    {
        byte byte0 = n;
        if (byte0 == 1)
        {
            return true;
        }
        if (byte0 == 0)
        {
            return false;
        } else
        {
            n = 1;
            return true;
        }
    }

    public final int b()
    {
        boolean flag = false;
        int i1 = o;
        if (i1 != -1)
        {
            return i1;
        }
        i1 = 0;
        int j1 = 0;
        for (; i1 < g.size(); i1++)
        {
            j1 += com.c.b.h.i(((Integer)g.get(i1)).intValue());
        }

        i1 = j1 + 0;
        if (!g.isEmpty())
        {
            i1 = i1 + 1 + com.c.b.h.i(j1);
        }
        h = j1;
        int l1 = 0;
        j1 = 0;
        for (; l1 < i.size(); l1++)
        {
            j1 += com.c.b.h.i(((Integer)i.get(l1)).intValue());
        }

        l1 = i1 + j1;
        i1 = l1;
        if (!i.isEmpty())
        {
            i1 = l1 + 1 + com.c.b.h.i(j1);
        }
        j = j1;
        j1 = i1;
        if ((f & 1) == 1)
        {
            j1 = i1 + com.c.b.h.c(3, k());
        }
        i1 = j1;
        if ((f & 2) == 2)
        {
            i1 = j1 + com.c.b.h.c(4, l());
        }
        l1 = 0;
        for (int k1 = ((flag) ? 1 : 0); k1 < m.size(); k1++)
        {
            l1 += com.c.b.h.b(m.a(k1));
        }

        i1 = i1 + l1 + m.size() * 1 + e.b();
        o = i1;
        return i1;
    }

    protected final o c_()
    {
        return com.c.b.i.Q().(com/c/b/i$ae$b, com/c/b/i$ae$b$a);
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
        return (f & 2) == 2;
    }

    public final bk t()
    {
        return c;
    }

    public final c u()
    {
        return p.m();
    }

    public final m v()
    {
        return m();
    }

    public final volatile bd w()
    {
        return p;
    }


    private a()
    {
        h = -1;
        j = -1;
        n = -1;
        o = -1;
        g = Collections.emptyList();
        i = Collections.emptyList();
        k = "";
        l = "";
        m = ay.a;
    }

    private m(m m1)
    {
        super(m1);
        h = -1;
        j = -1;
        n = -1;
        o = -1;
    }

    o(o o1, byte byte0)
    {
        this(o1);
    }

    private able(g g1, aq aq)
    {
        able able;
        int i1;
        boolean flag;
        i1 = 0;
        this();
        able = by.c();
        flag = false;
_L13:
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
        JVM INSTR lookupswitch 8: default 1042
    //                   0: 1045
    //                   8: 142
    //                   10: 215
    //                   16: 463
    //                   18: 536
    //                   26: 718
    //                   34: 779
    //                   50: 840;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L3:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        if (a(g1, able, aq, j1)) goto _L13; else goto _L12
_L12:
        flag = true;
          goto _L13
_L5:
        if ((i1 & 1) == 1) goto _L15; else goto _L14
_L14:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        g = new ArrayList();
        j1 = i1 | 1;
_L34:
        k1 = j1;
        i1 = j1;
        l1 = j1;
        g.add(Integer.valueOf(g1.f()));
        i1 = j1;
          goto _L13
_L6:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        int j2 = g1.c(g1.s());
        if ((i1 & 1) == 1) goto _L17; else goto _L16
_L16:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        if (g1.t() <= 0) goto _L17; else goto _L18
_L18:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        g = new ArrayList();
        j1 = i1 | 1;
_L21:
        k1 = j1;
        i1 = j1;
        l1 = j1;
        if (g1.t() <= 0) goto _L20; else goto _L19
_L19:
        k1 = j1;
        i1 = j1;
        l1 = j1;
        g.add(Integer.valueOf(g1.f()));
          goto _L21
        g1;
        i1 = k1;
_L35:
        throw new RuntimeException(g1.a(this));
        g1;
_L32:
        if ((i1 & 1) == 1)
        {
            g = Collections.unmodifiableList(g);
        }
        if ((i1 & 2) == 2)
        {
            i = Collections.unmodifiableList(i);
        }
        if ((i1 & 0x10) == 16)
        {
            m = m.e();
        }
        e = able.e();
        L();
        throw g1;
_L20:
        k1 = j1;
        i1 = j1;
        l1 = j1;
        g1.d(j2);
        i1 = j1;
          goto _L13
_L7:
        if ((i1 & 2) == 2) goto _L23; else goto _L22
_L22:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        i = new ArrayList();
        j1 = i1 | 2;
_L33:
        k1 = j1;
        i1 = j1;
        l1 = j1;
        i.add(Integer.valueOf(g1.f()));
        i1 = j1;
          goto _L13
_L8:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        j2 = g1.c(g1.s());
        if ((i1 & 2) == 2) goto _L25; else goto _L24
_L24:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        if (g1.t() <= 0) goto _L25; else goto _L26
_L26:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        i = new ArrayList();
        j1 = i1 | 2;
_L29:
        k1 = j1;
        i1 = j1;
        l1 = j1;
        if (g1.t() <= 0) goto _L28; else goto _L27
_L27:
        k1 = j1;
        i1 = j1;
        l1 = j1;
        i.add(Integer.valueOf(g1.f()));
          goto _L29
        g1;
        i1 = l1;
_L36:
        throw new RuntimeException((new av(g1.getMessage())).a(this));
_L28:
        k1 = j1;
        i1 = j1;
        l1 = j1;
        g1.d(j2);
        i1 = j1;
          goto _L13
_L9:
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
        k = f1;
          goto _L13
_L10:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f1 = g1.l();
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f = f | 2;
        k1 = i1;
        l1 = i1;
        i2 = i1;
        l = f1;
          goto _L13
_L11:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        f1 = g1.l();
        j1 = i1;
        if ((i1 & 0x10) == 16) goto _L31; else goto _L30
_L30:
        k1 = i1;
        l1 = i1;
        i2 = i1;
        m = new ay();
        j1 = i1 | 0x10;
_L31:
        k1 = j1;
        l1 = j1;
        i2 = j1;
        m.a(f1);
        i1 = j1;
          goto _L13
        g1;
        i1 = k1;
          goto _L32
_L2:
        if ((i1 & 1) == 1)
        {
            g = Collections.unmodifiableList(g);
        }
        if ((i1 & 2) == 2)
        {
            i = Collections.unmodifiableList(i);
        }
        if ((i1 & 0x10) == 16)
        {
            m = m.e();
        }
        e = able.e();
        L();
        return;
_L25:
        j1 = i1;
          goto _L29
_L23:
        j1 = i1;
          goto _L33
_L17:
        j1 = i1;
          goto _L21
_L15:
        j1 = i1;
          goto _L34
_L4:
        flag = true;
          goto _L13
        g1;
        i1 = l1;
          goto _L35
        g1;
        i1 = i2;
          goto _L36
    }

    L(g g1, aq aq, byte byte0)
    {
        this(g1, aq);
    }
}
