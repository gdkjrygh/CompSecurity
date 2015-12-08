// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.c.b:
//            as, i, n, av, 
//            by, g, f, h, 
//            be, bk, aq, bd, 
//            bp, bn

public static final class <init> extends as
    implements <init>
{
    public static final class a extends as.a
        implements i.d
    {

        private int a;
        private Object b;
        private List c;
        private bn d;
        private i.e e;
        private bp f;

        private a d(bd bd)
        {
            if (bd instanceof i.c)
            {
                return a((i.c)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private a d(g g1, aq aq)
        {
            g1 = (i.c)i.c.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (i.c)aq.a();
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

        private void r()
        {
            if (as.d)
            {
                u();
                if (f == null)
                {
                    f = new bp(v(), p(), n());
                    e = null;
                }
            }
        }

        private i.c s()
        {
            i.c c1 = t();
            if (!c1.a())
            {
                throw b(c1);
            } else
            {
                return c1;
            }
        }

        private i.c t()
        {
            int i1 = 1;
            i.c c1 = new i.c(this, (byte)0);
            int j1 = a;
            if ((j1 & 1) != 1)
            {
                i1 = 0;
            }
            i.c.a(c1, b);
            if (d == null)
            {
                if ((a & 2) == 2)
                {
                    c = Collections.unmodifiableList(c);
                    a = a & -3;
                }
                i.c.a(c1, c);
            } else
            {
                i.c.a(c1, d.e());
            }
            if ((j1 & 4) == 4)
            {
                i1 |= 2;
            }
            if (f == null)
            {
                i.c.a(c1, e);
            } else
            {
                i.c.a(c1, (i.e)f.c());
            }
            i.c.a(c1, i1);
            l();
            return c1;
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

        private i.e v()
        {
            if (f == null)
            {
                if (e == null)
                {
                    return com.c.b.i.e.m();
                } else
                {
                    return e;
                }
            } else
            {
                return (i.e)f.b();
            }
        }

        public final a.a a(bd bd)
        {
            return d(bd);
        }

        public final a.a a(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final a a(i.c c1)
        {
            Object obj = null;
            if (c1 == i.c.m())
            {
                return this;
            }
            if (c1.h())
            {
                a = a | 1;
                b = i.c.a(c1);
                q();
            }
            if (d == null)
            {
                if (!i.c.b(c1).isEmpty())
                {
                    if (c.isEmpty())
                    {
                        c = i.c.b(c1);
                        a = a & -3;
                    } else
                    {
                        if ((a & 2) != 2)
                        {
                            c = new ArrayList(c);
                            a = a | 2;
                        }
                        c.addAll(i.c.b(c1));
                    }
                    q();
                }
            } else
            if (!i.c.b(c1).isEmpty())
            {
                if (d.d())
                {
                    d.b();
                    d = null;
                    c = i.c.b(c1);
                    a = a & -3;
                    if (as.d)
                    {
                        obj = u();
                    }
                    d = ((bn) (obj));
                } else
                {
                    d.a(i.c.b(c1));
                }
            }
            if (c1.k())
            {
                obj = c1.l();
                if (f == null)
                {
                    if ((a & 4) == 4 && e != null && e != com.c.b.i.e.m())
                    {
                        e = com.c.b.i.e.a(e).a(((i.e) (obj))).g();
                    } else
                    {
                        e = ((i.e) (obj));
                    }
                    q();
                } else
                {
                    f.b(((as) (obj)));
                }
                a = a | 4;
            }
            d(c1.e);
            q();
            return this;
        }

        public final boolean a()
        {
            int i1 = 0;
_L7:
            i.g g1;
            int j1;
            if (d == null)
            {
                j1 = c.size();
            } else
            {
                j1 = d.c();
            }
            if (i1 >= j1) goto _L2; else goto _L1
_L1:
            if (d == null)
            {
                g1 = (i.g)c.get(i1);
            } else
            {
                g1 = (i.g)d.a(i1);
            }
            if (g1.a()) goto _L4; else goto _L3
_L3:
            return false;
_L4:
            i1++;
            continue; /* Loop/switch isn't completed */
_L2:
            if ((a & 4) == 4)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 && !v().a()) goto _L3; else goto _L5
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
            return com.c.b.i.o().a(com/c/b/i$c, com/c/b/i$c$a);
        }

        public final ak.a e()
        {
            return com.c.b.i.n();
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
            return i.c.m();
        }

        private a()
        {
            b = "";
            c = Collections.emptyList();
            e = null;
            r();
        }

        a(byte byte0)
        {
            this();
        }

        private a(as.b b1)
        {
            super(b1);
            b = "";
            c = Collections.emptyList();
            e = null;
            r();
        }

        a(as.b b1, byte byte0)
        {
            this(b1);
        }
    }


    public static final bk c = new n();
    private static final nit> l = new <init>();
    private int f;
    private volatile Object g;
    private List h;
    private st i;
    private byte j;
    private int k;

    static int a(st st, int i1)
    {
        st.f = i1;
        return i1;
    }

    static f a(f f1, f f2)
    {
        f1.i = f2;
        return f2;
    }

    static Object a(i i1)
    {
        return i1.g;
    }

    static Object a(ject ject, Object obj)
    {
        ject.g = obj;
        return obj;
    }

    static List a(st st, List list)
    {
        st.h = list;
        return list;
    }

    static List b(h h1)
    {
        return h1.h;
    }

    public static h m()
    {
        return l;
    }

    private f n()
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

    private a o()
    {
        if (this == l)
        {
            return new a((byte)0);
        } else
        {
            return (new a((byte)0)).a(this);
        }
    }

    protected final  a( )
    {
        return new a(, (byte)0);
    }

    public final  a(int i1)
    {
        return ()h.get(i1);
    }

    public final void a(h h1)
    {
        if ((f & 1) == 1)
        {
            h1.a(1, n());
        }
        for (int i1 = 0; i1 < h.size(); i1++)
        {
            h1.b(2, (be)h.get(i1));
        }

        if ((f & 2) == 2)
        {
            h1.b(3, l());
        }
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
            for (int i1 = 0; i1 < j(); i1++)
            {
                if (!a(i1).a())
                {
                    j = 0;
                    return false;
                }
            }

            if (k() && !l().a())
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
        int j1 = 0;
        int i1 = k;
        if (i1 != -1)
        {
            return i1;
        }
        if ((f & 1) == 1)
        {
            i1 = com.c.b.h.c(1, n()) + 0;
        } else
        {
            i1 = 0;
        }
        while (j1 < h.size()) 
        {
            int k1 = com.c.b.h.d(2, (be)h.get(j1));
            j1++;
            i1 = k1 + i1;
        }
        j1 = i1;
        if ((f & 2) == 2)
        {
            j1 = i1 + com.c.b.h.d(3, l());
        }
        i1 = e.b() + j1;
        k = i1;
        return i1;
    }

    protected final  c_()
    {
        return com.c.b.i.o().a(com/c/b/i$c, com/c/b/i$c$a);
    }

    public final by f()
    {
        return e;
    }

    public final boolean h()
    {
        return (f & 1) == 1;
    }

    public final String i()
    {
        Object obj = g;
        if (obj instanceof String)
        {
            return (String)obj;
        }
        obj = (f)obj;
        String s = ((f) (obj)).f();
        if (((f) (obj)).g())
        {
            g = s;
        }
        return s;
    }

    public final int j()
    {
        return h.size();
    }

    public final boolean k()
    {
        return (f & 2) == 2;
    }

    public final f l()
    {
        if (i == null)
        {
            return m();
        } else
        {
            return i;
        }
    }

    public final bk t()
    {
        return c;
    }

    public final  u()
    {
        return l.o();
    }

    public final  v()
    {
        return o();
    }

    public final volatile bd w()
    {
        return l;
    }


    private ()
    {
        j = -1;
        k = -1;
        g = "";
        h = Collections.emptyList();
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

    private ject(g g1, aq aq)
    {
         ;
        int i1;
        boolean flag;
        this();
         = by.c();
        flag = false;
        i1 = 0;
_L16:
        if (flag) goto _L2; else goto _L1
_L1:
        int k1;
        int l1;
        int i2;
        l1 = i1;
        k1 = i1;
        i2 = i1;
        int j1 = g1.a();
        j1;
        JVM INSTR lookupswitch 4: default 510
    //                   0: 513
    //                   10: 115
    //                   18: 227
    //                   26: 333;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        l1 = i1;
        k1 = i1;
        i2 = i1;
        if (!a(g1, , aq, j1))
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        l1 = i1;
        k1 = i1;
        i2 = i1;
        Object obj = g1.l();
        l1 = i1;
        k1 = i1;
        i2 = i1;
        f = f | 1;
        l1 = i1;
        k1 = i1;
        i2 = i1;
        g = obj;
        continue; /* Loop/switch isn't completed */
        g1;
        k1 = l1;
        throw new RuntimeException(g1.a(this));
        g1;
        if ((k1 & 2) == 2)
        {
            h = Collections.unmodifiableList(h);
        }
        e = .b();
        L();
        throw g1;
_L6:
        j1 = i1;
        if ((i1 & 2) == 2) goto _L9; else goto _L8
_L8:
        l1 = i1;
        k1 = i1;
        i2 = i1;
        h = new ArrayList();
        j1 = i1 | 2;
_L9:
        l1 = j1;
        k1 = j1;
        i2 = j1;
        h.add(g1.a(c, aq));
        i1 = j1;
        continue; /* Loop/switch isn't completed */
        g1;
        k1 = i2;
        throw new RuntimeException((new av(g1.getMessage())).a(this));
_L7:
        l1 = i1;
        k1 = i1;
        i2 = i1;
        if ((f & 2) != 2) goto _L11; else goto _L10
_L10:
        l1 = i1;
        k1 = i1;
        i2 = i1;
        obj = i.l();
_L14:
        l1 = i1;
        k1 = i1;
        i2 = i1;
        i = (i)g1.a(c, aq);
        if (obj == null) goto _L13; else goto _L12
_L12:
        l1 = i1;
        k1 = i1;
        i2 = i1;
        ((a) (obj)).a(i);
        l1 = i1;
        k1 = i1;
        i2 = i1;
        i = ((a) (obj)).g();
_L13:
        l1 = i1;
        k1 = i1;
        i2 = i1;
        f = f | 2;
        continue; /* Loop/switch isn't completed */
_L2:
        if ((i1 & 2) == 2)
        {
            h = Collections.unmodifiableList(h);
        }
        e = .b();
        L();
        return;
_L11:
        obj = null;
          goto _L14
_L4:
        flag = true;
        if (true) goto _L16; else goto _L15
_L15:
    }

    L(g g1, aq aq, byte byte0)
    {
        this(g1, aq);
    }
}
