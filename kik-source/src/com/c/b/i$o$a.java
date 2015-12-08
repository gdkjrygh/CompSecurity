// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.c.b:
//            i, ay, av, bk, 
//            as, bp, az, bn, 
//            bd, g, aq, be

public static final class <init> extends <init>
    implements <init>
{

    private int a;
    private Object b;
    private Object c;
    private az d;
    private List e;
    private List f;
    private List g;
    private bn h;
    private List i;
    private bn j;
    private List k;
    private bn l;
    private List m;
    private bn n;
    private  o;
    private bp p;
    private  q;
    private bp r;
    private Object s;

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

    private  d(g g1, aq aq)
    {
        g1 = ().a(g1, aq);
        if (g1 != null)
        {
            a(g1);
        }
        return this;
        aq;
        g1 = (a)aq.a();
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
            v();
            x();
            y();
            if (p == null)
            {
                p = new bp(z(), p(), n());
                o = null;
            }
            if (r == null)
            {
                a a1;
                if (r == null)
                {
                    if (q == null)
                    {
                        a1 = ();
                    } else
                    {
                        a1 = q;
                    }
                } else
                {
                    a1 = (q)r.b();
                }
                r = new bp(a1, p(), n());
                q = null;
            }
        }
    }

    private q s()
    {
        int i1 = 1;
          = new nit>(this, (byte)0);
        int k1 = a;
        int j1;
        if ((k1 & 1) != 1)
        {
            i1 = 0;
        }
        a(, b);
        j1 = i1;
        if ((k1 & 2) == 2)
        {
            j1 = i1 | 2;
        }
        b(, c);
        if ((a & 4) == 4)
        {
            d = d.e();
            a = a & -5;
        }
        a(, d);
        if ((a & 8) == 8)
        {
            e = Collections.unmodifiableList(e);
            a = a & -9;
        }
        a(, e);
        if ((a & 0x10) == 16)
        {
            f = Collections.unmodifiableList(f);
            a = a & 0xffffffef;
        }
        a(, f);
        if (h == null)
        {
            if ((a & 0x20) == 32)
            {
                g = Collections.unmodifiableList(g);
                a = a & 0xffffffdf;
            }
            a(, g);
        } else
        {
            g(, h.e());
        }
        if (j == null)
        {
            if ((a & 0x40) == 64)
            {
                i = Collections.unmodifiableList(i);
                a = a & 0xffffffbf;
            }
            a(, i);
        } else
        {
            i(, j.e());
        }
        if (l == null)
        {
            if ((a & 0x80) == 128)
            {
                k = Collections.unmodifiableList(k);
                a = a & 0xffffff7f;
            }
            a(, k);
        } else
        {
            k(, l.e());
        }
        if (n == null)
        {
            if ((a & 0x100) == 256)
            {
                m = Collections.unmodifiableList(m);
                a = a & 0xfffffeff;
            }
            a(, m);
        } else
        {
            m(, n.e());
        }
        if ((k1 & 0x200) == 512)
        {
            j1 |= 4;
        }
        if (p == null)
        {
            p(, o);
        } else
        {
            o(, (o)p.c());
        }
        i1 = j1;
        if ((k1 & 0x400) == 1024)
        {
            i1 = j1 | 8;
        }
        if (r == null)
        {
            r(, q);
        } else
        {
            q(, (q)r.c());
        }
        j1 = i1;
        if ((k1 & 0x800) == 2048)
        {
            j1 = i1 | 0x10;
        }
        r(, s);
        s(, j1);
        l();
        return ;
    }

    private void t()
    {
        if ((a & 0x20) != 32)
        {
            g = new ArrayList(g);
            a = a | 0x20;
        }
    }

    private bn u()
    {
        if (h == null)
        {
            List list = g;
            boolean flag;
            if ((a & 0x20) == 32)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            h = new bn(list, flag, p(), n());
            g = null;
        }
        return h;
    }

    private bn v()
    {
        if (j == null)
        {
            List list = i;
            boolean flag;
            if ((a & 0x40) == 64)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j = new bn(list, flag, p(), n());
            i = null;
        }
        return j;
    }

    private bn x()
    {
        if (l == null)
        {
            List list = k;
            boolean flag;
            if ((a & 0x80) == 128)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            l = new bn(list, flag, p(), n());
            k = null;
        }
        return l;
    }

    private bn y()
    {
        if (n == null)
        {
            List list = m;
            boolean flag;
            if ((a & 0x100) == 256)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            n = new bn(list, flag, p(), n());
            m = null;
        }
        return n;
    }

    private n z()
    {
        if (p == null)
        {
            if (o == null)
            {
                return o();
            } else
            {
                return o;
            }
        } else
        {
            return (o)p.b();
        }
    }

    public final p a(bd bd)
    {
        return d(bd);
    }

    public final d a(g g1, aq aq)
    {
        return d(g1, aq);
    }

    public final d a(d d1)
    {
        if (h == null)
        {
            if (d1 == null)
            {
                throw new NullPointerException();
            } else
            {
                t();
                g.add(d1);
                q();
                return this;
            }
        } else
        {
            h.a(d1);
            return this;
        }
    }

    public final h a(h h1)
    {
        Object obj1 = null;
        if (h1 == able())
        {
            return this;
        }
        if (h1.able())
        {
            a = a | 1;
            b = b(h1);
            q();
        }
        if (h1.q())
        {
            a = a | 2;
            c = c(h1);
            q();
        }
        Object obj;
        if (!q(h1).isEmpty())
        {
            if (d.isEmpty())
            {
                d = d(h1);
                a = a & -5;
            } else
            {
                if ((a & 4) != 4)
                {
                    d = new ay(d);
                    a = a | 4;
                }
                d.addAll(ection(h1));
            }
            q();
        }
        if (!q(h1).isEmpty())
        {
            if (e.isEmpty())
            {
                e = e(h1);
                a = a & -9;
            } else
            {
                if ((a & 8) != 8)
                {
                    e = new ArrayList(e);
                    a = a | 8;
                }
                e.addAll(ection(h1));
            }
            q();
        }
        if (!q(h1).isEmpty())
        {
            if (f.isEmpty())
            {
                f = f(h1);
                a = a & 0xffffffef;
            } else
            {
                if ((a & 0x10) != 16)
                {
                    f = new ArrayList(f);
                    a = a | 0x10;
                }
                f.addAll(ection(h1));
            }
            q();
        }
        if (h == null)
        {
            if (!h(h1).isEmpty())
            {
                if (g.isEmpty())
                {
                    g = g(h1);
                    a = a & 0xffffffdf;
                } else
                {
                    t();
                    g.addAll(ection(h1));
                }
                q();
            }
        } else
        if (!q(h1).isEmpty())
        {
            if (h.d())
            {
                h.b();
                h = null;
                g = g(h1);
                a = a & 0xffffffdf;
                if (as.d)
                {
                    obj = u();
                } else
                {
                    obj = null;
                }
                h = ((bn) (obj));
            } else
            {
                h.a(able(h1));
            }
        }
        if (j == null)
        {
            if (!j(h1).isEmpty())
            {
                if (i.isEmpty())
                {
                    i = i(h1);
                    a = a & 0xffffffbf;
                } else
                {
                    if ((a & 0x40) != 64)
                    {
                        i = new ArrayList(i);
                        a = a | 0x40;
                    }
                    i.addAll(ection(h1));
                }
                q();
            }
        } else
        if (!q(h1).isEmpty())
        {
            if (j.d())
            {
                j.b();
                j = null;
                i = i(h1);
                a = a & 0xffffffbf;
                if (as.d)
                {
                    obj = v();
                } else
                {
                    obj = null;
                }
                j = ((bn) (obj));
            } else
            {
                j.a(able(h1));
            }
        }
        if (l == null)
        {
            if (!l(h1).isEmpty())
            {
                if (k.isEmpty())
                {
                    k = k(h1);
                    a = a & 0xffffff7f;
                } else
                {
                    if ((a & 0x80) != 128)
                    {
                        k = new ArrayList(k);
                        a = a | 0x80;
                    }
                    k.addAll(ection(h1));
                }
                q();
            }
        } else
        if (!q(h1).isEmpty())
        {
            if (l.d())
            {
                l.b();
                l = null;
                k = k(h1);
                a = a & 0xffffff7f;
                if (as.d)
                {
                    obj = x();
                } else
                {
                    obj = null;
                }
                l = ((bn) (obj));
            } else
            {
                l.a(able(h1));
            }
        }
        if (n == null)
        {
            if (!n(h1).isEmpty())
            {
                if (m.isEmpty())
                {
                    m = m(h1);
                    a = a & 0xfffffeff;
                } else
                {
                    if ((a & 0x100) != 256)
                    {
                        m = new ArrayList(m);
                        a = a | 0x100;
                    }
                    m.addAll(ection(h1));
                }
                q();
            }
        } else
        if (!q(h1).isEmpty())
        {
            if (n.d())
            {
                n.b();
                n = null;
                m = m(h1);
                a = a & 0xfffffeff;
                obj = obj1;
                if (as.d)
                {
                    obj = y();
                }
                n = ((bn) (obj));
            } else
            {
                n.a(able(h1));
            }
        }
        if (h1.able())
        {
            obj = h1.able();
            if (p == null)
            {
                if ((a & 0x200) == 512 && o != null && o != o())
                {
                    o = o(o).a(((a) (obj))).g();
                } else
                {
                    o = ((o) (obj));
                }
                q();
            } else
            {
                p.b(((as) (obj)));
            }
            a = a | 0x200;
        }
        if (h1.a())
        {
            obj = h1.a();
            if (r == null)
            {
                if ((a & 0x400) == 1024 && q != null && q != ())
                {
                    q = (q).a(((.a) (obj))).g();
                } else
                {
                    q = ((q) (obj));
                }
                q();
            } else
            {
                r.b(((as) (obj)));
            }
            a = a | 0x400;
        }
        if (h1.a())
        {
            a = a | 0x800;
            s = s(h1);
            q();
        }
        d(h1.d);
        q();
        return this;
    }

    public final ng a(String s1)
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
        int i1 = 0;
_L13:
        q q1;
        int j1;
        if (h == null)
        {
            j1 = g.size();
        } else
        {
            j1 = h.c();
        }
        if (i1 >= j1) goto _L2; else goto _L1
_L1:
        if (h == null)
        {
            q1 = (h)g.get(i1);
        } else
        {
            q1 = (.get)h.a(i1);
        }
        if (q1.h()) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        i1++;
        continue; /* Loop/switch isn't completed */
_L2:
        i1 = 0;
_L6:
        q q2;
        int k1;
        if (j == null)
        {
            k1 = i.size();
        } else
        {
            k1 = j.c();
        }
        if (i1 >= k1)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        if (j == null)
        {
            q2 = (j)i.get(i1);
        } else
        {
            q2 = (.get)j.a(i1);
        }
        if (!q2.j()) goto _L3; else goto _L5
_L5:
        i1++;
          goto _L6
        i1 = 0;
_L8:
        q q3;
        int l1;
        if (l == null)
        {
            l1 = k.size();
        } else
        {
            l1 = l.c();
        }
        if (i1 >= l1)
        {
            break MISSING_BLOCK_LABEL_257;
        }
        if (l == null)
        {
            q3 = (l)k.get(i1);
        } else
        {
            q3 = (.get)l.a(i1);
        }
        if (!q3.()) goto _L3; else goto _L7
_L7:
        i1++;
          goto _L8
        i1 = 0;
_L10:
        q q4;
        int i2;
        if (n == null)
        {
            i2 = m.size();
        } else
        {
            i2 = n.c();
        }
        if (i1 >= i2)
        {
            break MISSING_BLOCK_LABEL_342;
        }
        if (n == null)
        {
            q4 = (n)m.get(i1);
        } else
        {
            q4 = (.get)n.a(i1);
        }
        if (!q4.n()) goto _L3; else goto _L9
_L9:
        i1++;
          goto _L10
        if ((a & 0x200) == 512)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 && !z().z()) goto _L3; else goto _L11
_L11:
        return true;
        if (true) goto _L13; else goto _L12
_L12:
    }

    public final z b(g g1, aq aq)
    {
        return d(g1, aq);
    }

    public final ng b(String s1)
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

    public final q c(bd bd)
    {
        return d(bd);
    }

    public final d c(g g1, aq aq)
    {
        return d(g1, aq);
    }

    protected final d d()
    {
        return com.c.b.i.c().(com/c/b/i$o, com/c/b/i$o$a);
    }

    public final s e()
    {
        return com.c.b.i.b();
    }

    public final s g()
    {
        s s1 = s();
        if (!s1.s())
        {
            throw b(s1);
        } else
        {
            return s1;
        }
    }

    public final bd h()
    {
        return s();
    }

    public final bd i()
    {
        return g();
    }

    public final be j()
    {
        return g();
    }

    public final bd w()
    {
        return g();
    }

    private ng()
    {
        b = "";
        c = "";
        d = ay.a;
        e = Collections.emptyList();
        f = Collections.emptyList();
        g = Collections.emptyList();
        i = Collections.emptyList();
        k = Collections.emptyList();
        m = Collections.emptyList();
        o = null;
        q = null;
        s = "";
        r();
    }

    r(byte byte0)
    {
        this();
    }

    private <init>(<init> <init>1)
    {
        super(<init>1);
        b = "";
        c = "";
        d = ay.a;
        e = Collections.emptyList();
        f = Collections.emptyList();
        g = Collections.emptyList();
        i = Collections.emptyList();
        k = Collections.emptyList();
        m = Collections.emptyList();
        o = null;
        q = null;
        s = "";
        r();
    }

    r(r r1, byte byte0)
    {
        this(r1);
    }
}
