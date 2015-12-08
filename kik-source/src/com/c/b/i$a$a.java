// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.c.b:
//            i, ay, bn, bp, 
//            av, bk, as, az, 
//            bd, g, aq, be

public static final class <init> extends <init>
    implements <init>
{

    private int a;
    private Object b;
    private List c;
    private bn d;
    private List e;
    private bn f;
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
    private List q;
    private bn r;
    private az s;

    private bn A()
    {
        if (n == null)
        {
            List list = m;
            boolean flag;
            if ((a & 0x40) == 64)
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

    private n B()
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

    private bn C()
    {
        if (r == null)
        {
            List list = q;
            boolean flag;
            if ((a & 0x100) == 256)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            r = new bn(list, flag, p(), n());
            q = null;
        }
        return r;
    }

    private r d(bd bd)
    {
        if (bd instanceof r)
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
            t();
            u();
            v();
            x();
            z();
            A();
            if (p == null)
            {
                p = new bp(B(), p(), n());
                o = null;
            }
            C();
        }
    }

    private C s()
    {
        int i1 = 1;
          = new nit>(this, (byte)0);
        int j1 = a;
        if ((j1 & 1) != 1)
        {
            i1 = 0;
        }
        a(, b);
        if (d == null)
        {
            if ((a & 2) == 2)
            {
                c = Collections.unmodifiableList(c);
                a = a & -3;
            }
            a(, c);
        } else
        {
            c(, d.e());
        }
        if (f == null)
        {
            if ((a & 4) == 4)
            {
                e = Collections.unmodifiableList(e);
                a = a & -5;
            }
            a(, e);
        } else
        {
            e(, f.e());
        }
        if (h == null)
        {
            if ((a & 8) == 8)
            {
                g = Collections.unmodifiableList(g);
                a = a & -9;
            }
            a(, g);
        } else
        {
            g(, h.e());
        }
        if (j == null)
        {
            if ((a & 0x10) == 16)
            {
                i = Collections.unmodifiableList(i);
                a = a & 0xffffffef;
            }
            a(, i);
        } else
        {
            i(, j.e());
        }
        if (l == null)
        {
            if ((a & 0x20) == 32)
            {
                k = Collections.unmodifiableList(k);
                a = a & 0xffffffdf;
            }
            a(, k);
        } else
        {
            k(, l.e());
        }
        if (n == null)
        {
            if ((a & 0x40) == 64)
            {
                m = Collections.unmodifiableList(m);
                a = a & 0xffffffbf;
            }
            a(, m);
        } else
        {
            m(, n.e());
        }
        if ((j1 & 0x80) == 128)
        {
            i1 |= 2;
        }
        if (p == null)
        {
            p(, o);
        } else
        {
            o(, (o)p.c());
        }
        if (r == null)
        {
            if ((a & 0x100) == 256)
            {
                q = Collections.unmodifiableList(q);
                a = a & 0xfffffeff;
            }
            a(, q);
        } else
        {
            q(, r.e());
        }
        if ((a & 0x200) == 512)
        {
            s = s.e();
            a = a & 0xfffffdff;
        }
        a(, s);
        s(, i1);
        l();
        return ;
    }

    private bn t()
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

    private bn u()
    {
        if (f == null)
        {
            List list = e;
            boolean flag;
            if ((a & 4) == 4)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f = new bn(list, flag, p(), n());
            e = null;
        }
        return f;
    }

    private bn v()
    {
        if (h == null)
        {
            List list = g;
            boolean flag;
            if ((a & 8) == 8)
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

    private bn x()
    {
        if (j == null)
        {
            List list = i;
            boolean flag;
            if ((a & 0x10) == 16)
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

    private void y()
    {
        if ((a & 0x20) != 32)
        {
            k = new ArrayList(k);
            a = a | 0x20;
        }
    }

    private bn z()
    {
        if (l == null)
        {
            List list = k;
            boolean flag;
            if ((a & 0x20) == 32)
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

    public final l a(bd bd)
    {
        return d(bd);
    }

    public final d a(g g1, aq aq)
    {
        return d(g1, aq);
    }

    public final d a(d d1)
    {
        if (l == null)
        {
            if (d1 == null)
            {
                throw new NullPointerException();
            } else
            {
                y();
                k.add(d1);
                q();
                return this;
            }
        } else
        {
            l.a(d1);
            return this;
        }
    }

    public final l a(l l1)
    {
        Object obj1 = null;
        if (l1 == ection())
        {
            return this;
        }
        if (l1.ection())
        {
            a = a | 1;
            b = b(l1);
            q();
        }
        if (d == null)
        {
            if (!d(l1).isEmpty())
            {
                if (c.isEmpty())
                {
                    c = c(l1);
                    a = a & -3;
                } else
                {
                    if ((a & 2) != 2)
                    {
                        c = new ArrayList(c);
                        a = a | 2;
                    }
                    c.addAll(ection(l1));
                }
                q();
            }
        } else
        if (!q(l1).isEmpty())
        {
            if (d.d())
            {
                d.b();
                d = null;
                c = c(l1);
                a = a & -3;
                if (as.d)
                {
                    obj = t();
                } else
                {
                    obj = null;
                }
                d = ((bn) (obj));
            } else
            {
                d.a(able(l1));
            }
        }
        if (f == null)
        {
            if (!f(l1).isEmpty())
            {
                if (e.isEmpty())
                {
                    e = e(l1);
                    a = a & -5;
                } else
                {
                    if ((a & 4) != 4)
                    {
                        e = new ArrayList(e);
                        a = a | 4;
                    }
                    e.addAll(ection(l1));
                }
                q();
            }
        } else
        if (!q(l1).isEmpty())
        {
            if (f.d())
            {
                f.b();
                f = null;
                e = e(l1);
                a = a & -5;
                if (as.d)
                {
                    obj = u();
                } else
                {
                    obj = null;
                }
                f = ((bn) (obj));
            } else
            {
                f.a(able(l1));
            }
        }
        if (h == null)
        {
            if (!h(l1).isEmpty())
            {
                if (g.isEmpty())
                {
                    g = g(l1);
                    a = a & -9;
                } else
                {
                    if ((a & 8) != 8)
                    {
                        g = new ArrayList(g);
                        a = a | 8;
                    }
                    g.addAll(ection(l1));
                }
                q();
            }
        } else
        if (!q(l1).isEmpty())
        {
            if (h.d())
            {
                h.b();
                h = null;
                g = g(l1);
                a = a & -9;
                if (as.d)
                {
                    obj = v();
                } else
                {
                    obj = null;
                }
                h = ((bn) (obj));
            } else
            {
                h.a(able(l1));
            }
        }
        if (j == null)
        {
            if (!j(l1).isEmpty())
            {
                if (i.isEmpty())
                {
                    i = i(l1);
                    a = a & 0xffffffef;
                } else
                {
                    if ((a & 0x10) != 16)
                    {
                        i = new ArrayList(i);
                        a = a | 0x10;
                    }
                    i.addAll(ection(l1));
                }
                q();
            }
        } else
        if (!q(l1).isEmpty())
        {
            if (j.d())
            {
                j.b();
                j = null;
                i = i(l1);
                a = a & 0xffffffef;
                if (as.d)
                {
                    obj = x();
                } else
                {
                    obj = null;
                }
                j = ((bn) (obj));
            } else
            {
                j.a(able(l1));
            }
        }
        if (l == null)
        {
            if (!l(l1).isEmpty())
            {
                if (k.isEmpty())
                {
                    k = k(l1);
                    a = a & 0xffffffdf;
                } else
                {
                    y();
                    k.addAll(ection(l1));
                }
                q();
            }
        } else
        if (!q(l1).isEmpty())
        {
            if (l.d())
            {
                l.b();
                l = null;
                k = k(l1);
                a = a & 0xffffffdf;
                if (as.d)
                {
                    obj = z();
                } else
                {
                    obj = null;
                }
                l = ((bn) (obj));
            } else
            {
                l.a(able(l1));
            }
        }
        if (n == null)
        {
            if (!n(l1).isEmpty())
            {
                if (m.isEmpty())
                {
                    m = m(l1);
                    a = a & 0xffffffbf;
                } else
                {
                    if ((a & 0x40) != 64)
                    {
                        m = new ArrayList(m);
                        a = a | 0x40;
                    }
                    m.addAll(ection(l1));
                }
                q();
            }
        } else
        if (!q(l1).isEmpty())
        {
            if (n.d())
            {
                n.b();
                n = null;
                m = m(l1);
                a = a & 0xffffffbf;
                if (as.d)
                {
                    obj = A();
                } else
                {
                    obj = null;
                }
                n = ((bn) (obj));
            } else
            {
                n.a(able(l1));
            }
        }
        if (l1.able())
        {
            Object obj = l1.able();
            if (p == null)
            {
                if ((a & 0x80) == 128 && o != null && o != o())
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
            a = a | 0x80;
        }
        if (r == null)
        {
            if (!r(l1).isEmpty())
            {
                if (q.isEmpty())
                {
                    q = q(l1);
                    a = a & 0xfffffeff;
                } else
                {
                    if ((a & 0x100) != 256)
                    {
                        q = new ArrayList(q);
                        a = a | 0x100;
                    }
                    q.addAll(ection(l1));
                }
                q();
            }
        } else
        if (!q(l1).isEmpty())
        {
            if (r.d())
            {
                r.b();
                r = null;
                q = q(l1);
                a = a & 0xfffffeff;
                bn bn1 = obj1;
                if (as.d)
                {
                    bn1 = C();
                }
                r = bn1;
            } else
            {
                r.a(able(l1));
            }
        }
        if (!able(l1).isEmpty())
        {
            if (s.isEmpty())
            {
                s = s(l1);
                a = a & 0xfffffdff;
            } else
            {
                if ((a & 0x200) != 512)
                {
                    s = new ay(s);
                    a = a | 0x200;
                }
                s.addAll(ection(l1));
            }
            q();
        }
        d(l1.d);
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
            q1 = (d)c.get(i1);
        } else
        {
            q1 = (.get)d.a(i1);
        }
        if (q1.d()) goto _L4; else goto _L3
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
        if (f == null)
        {
            k1 = e.size();
        } else
        {
            k1 = f.c();
        }
        if (i1 >= k1)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        if (f == null)
        {
            q2 = (f)e.get(i1);
        } else
        {
            q2 = (.get)f.a(i1);
        }
        if (!q2.f()) goto _L3; else goto _L5
_L5:
        i1++;
          goto _L6
        i1 = 0;
_L8:
        q q3;
        int l1;
        if (h == null)
        {
            l1 = g.size();
        } else
        {
            l1 = h.c();
        }
        if (i1 >= l1)
        {
            break MISSING_BLOCK_LABEL_257;
        }
        if (h == null)
        {
            q3 = (h)g.get(i1);
        } else
        {
            q3 = (.get)h.a(i1);
        }
        if (!q3.h()) goto _L3; else goto _L7
_L7:
        i1++;
          goto _L8
        i1 = 0;
_L10:
        q q4;
        int i2;
        if (j == null)
        {
            i2 = i.size();
        } else
        {
            i2 = j.c();
        }
        if (i1 >= i2)
        {
            break MISSING_BLOCK_LABEL_342;
        }
        if (j == null)
        {
            q4 = (j)i.get(i1);
        } else
        {
            q4 = (.get)j.a(i1);
        }
        if (!q4.j()) goto _L3; else goto _L9
_L9:
        i1++;
          goto _L10
        if ((a & 0x80) == 128)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 && !B().B()) goto _L3; else goto _L11
_L11:
        return true;
        if (true) goto _L13; else goto _L12
_L12:
    }

    public final B b(g g1, aq aq)
    {
        return d(g1, aq);
    }

    public final d c(bd bd)
    {
        return d(bd);
    }

    public final d c(g g1, aq aq)
    {
        return d(g1, aq);
    }

    protected final d d()
    {
        return com.c.b.i.e().(com/c/b/i$a, com/c/b/i$a$a);
    }

    public final s e()
    {
        return com.c.b.i.d();
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
        c = Collections.emptyList();
        e = Collections.emptyList();
        g = Collections.emptyList();
        i = Collections.emptyList();
        k = Collections.emptyList();
        m = Collections.emptyList();
        o = null;
        q = Collections.emptyList();
        s = ay.a;
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
        c = Collections.emptyList();
        e = Collections.emptyList();
        g = Collections.emptyList();
        i = Collections.emptyList();
        k = Collections.emptyList();
        m = Collections.emptyList();
        o = null;
        q = Collections.emptyList();
        s = ay.a;
        r();
    }

    r(r r1, byte byte0)
    {
        this(r1);
    }
}
