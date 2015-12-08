// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.d.b;

import com.c.b.aq;
import com.c.b.av;
import com.c.b.ay;
import com.c.b.az;
import com.c.b.bd;
import com.c.b.be;
import com.c.b.bk;
import com.c.b.bn;
import com.c.b.bp;
import com.c.b.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.kik.d.b:
//            a

public static final class <init> extends com.c.b.a.a
    implements <init>
{

    private int a;
    private b b;
    private bp c;
    private b d;
    private bp e;
    private long f;
    private int g;
    private Object h;
    private az i;
    private List j;
    private bn k;
    private List l;
    private bn m;
    private List n;
    private bn o;

    private bn A()
    {
        if (m == null)
        {
            List list = l;
            boolean flag;
            if ((a & 0x80) == 128)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            m = new bn(list, flag, p(), n());
            l = null;
        }
        return m;
    }

    private void B()
    {
        if ((a & 0x100) != 256)
        {
            n = new ArrayList(n);
            a = a | 0x100;
        }
    }

    private bn C()
    {
        if (o == null)
        {
            List list = n;
            boolean flag;
            if ((a & 0x100) == 256)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o = new bn(list, flag, p(), n());
            n = null;
        }
        return o;
    }

    private o d(bd bd)
    {
        if (bd instanceof o)
        {
            return a((a)bd);
        } else
        {
            super.(bd);
            return this;
        }
    }

    private a d(g g1, aq aq)
    {
        g1 = (a)a.a(g1, aq);
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

    private void s()
    {
        if (a())
        {
            if (c == null)
            {
                c = new bp(u(), p(), n());
                b = null;
            }
            if (e == null)
            {
                e = new bp(v(), p(), n());
                d = null;
            }
            y();
            A();
            C();
        }
    }

    private C t()
    {
        int j1 = 0;
        C c1 = new nit>(this, (byte)0);
        int k1 = a;
        if ((k1 & 1) == 1)
        {
            j1 = 1;
        }
        int i1;
        if (c == null)
        {
            c(c1, b);
        } else
        {
            b(c1, (b)c.c());
        }
        i1 = j1;
        if ((k1 & 2) == 2)
        {
            i1 = j1 | 2;
        }
        if (e == null)
        {
            e(c1, d);
        } else
        {
            d(c1, (d)e.c());
        }
        j1 = i1;
        if ((k1 & 4) == 4)
        {
            j1 = i1 | 4;
        }
        e(c1, f);
        i1 = j1;
        if ((k1 & 8) == 8)
        {
            i1 = j1 | 8;
        }
        f(c1, g);
        j1 = i1;
        if ((k1 & 0x10) == 16)
        {
            j1 = i1 | 0x10;
        }
        g(c1, h);
        if ((a & 0x20) == 32)
        {
            i = i.e();
            a = a & 0xffffffdf;
        }
        a(c1, i);
        if (k == null)
        {
            if ((a & 0x40) == 64)
            {
                j = Collections.unmodifiableList(j);
                a = a & 0xffffffbf;
            }
            a(c1, j);
        } else
        {
            j(c1, k.e());
        }
        if (m == null)
        {
            if ((a & 0x80) == 128)
            {
                l = Collections.unmodifiableList(l);
                a = a & 0xffffff7f;
            }
            a(c1, l);
        } else
        {
            l(c1, m.e());
        }
        if (o == null)
        {
            if ((a & 0x100) == 256)
            {
                n = Collections.unmodifiableList(n);
                a = a & 0xfffffeff;
            }
            a(c1, n);
        } else
        {
            n(c1, o.e());
        }
        o(c1, j1);
        l();
        return c1;
    }

    private l u()
    {
        if (c == null)
        {
            if (b == null)
            {
                return b();
            } else
            {
                return b;
            }
        } else
        {
            return (b)c.b();
        }
    }

    private c v()
    {
        if (e == null)
        {
            if (d == null)
            {
                return d();
            } else
            {
                return d;
            }
        } else
        {
            return (d)e.b();
        }
    }

    private void x()
    {
        if ((a & 0x40) != 64)
        {
            j = new ArrayList(j);
            a = a | 0x40;
        }
    }

    private bn y()
    {
        if (k == null)
        {
            List list = j;
            boolean flag;
            if ((a & 0x40) == 64)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            k = new bn(list, flag, p(), n());
            j = null;
        }
        return k;
    }

    private void z()
    {
        if ((a & 0x80) != 128)
        {
            l = new ArrayList(l);
            a = a | 0x80;
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

    public final d a(int i1)
    {
        a = a | 8;
        g = i1;
        q();
        return this;
    }

    public final q a(long l1)
    {
        a = a | 4;
        f = l1;
        q();
        return this;
    }

    public final q a(q q)
    {
        Object obj1 = null;
        if (q == ())
        {
            return this;
        }
        Object obj;
        if (q.())
        {
            obj = q.();
            if (c == null)
            {
                if ((a & 1) == 1 && b != null && b != b())
                {
                    b = b(b).a(((a) (obj))).s();
                } else
                {
                    b = ((b) (obj));
                }
                q();
            } else
            {
                c.b(((com.c.b.as) (obj)));
            }
            a = a | 1;
        }
        if (q.a())
        {
            obj = q.a();
            if (e == null)
            {
                if ((a & 2) == 2 && d != null && d != d())
                {
                    d = d(d).a(((a) (obj))).s();
                } else
                {
                    d = ((d) (obj));
                }
                q();
            } else
            {
                e.b(((com.c.b.as) (obj)));
            }
            a = a | 2;
        }
        if (q.a())
        {
            a(q.a());
        }
        if (q.a())
        {
            a(q.a());
        }
        if (q.a())
        {
            a = a | 0x10;
            h = h(q);
            q();
        }
        if (!q(q).isEmpty())
        {
            if (i.isEmpty())
            {
                i = i(q);
                a = a & 0xffffffdf;
            } else
            {
                if ((a & 0x20) != 32)
                {
                    i = new ay(i);
                    a = a | 0x20;
                }
                i.addAll(on(q));
            }
            q();
        }
        if (k == null)
        {
            if (!k(q).isEmpty())
            {
                if (j.isEmpty())
                {
                    j = j(q);
                    a = a & 0xffffffbf;
                } else
                {
                    x();
                    j.addAll(on(q));
                }
                q();
            }
        } else
        if (!q(q).isEmpty())
        {
            if (k.d())
            {
                k.b();
                k = null;
                j = j(q);
                a = a & 0xffffffbf;
                bn bn1;
                if (a())
                {
                    bn1 = y();
                } else
                {
                    bn1 = null;
                }
                k = bn1;
            } else
            {
                k.a((q));
            }
        }
        if (m == null)
        {
            if (!m(q).isEmpty())
            {
                if (l.isEmpty())
                {
                    l = l(q);
                    a = a & 0xffffff7f;
                } else
                {
                    z();
                    l.addAll(on(q));
                }
                q();
            }
        } else
        if (!q(q).isEmpty())
        {
            if (m.d())
            {
                m.b();
                m = null;
                l = l(q);
                a = a & 0xffffff7f;
                bn bn2;
                if (a())
                {
                    bn2 = A();
                } else
                {
                    bn2 = null;
                }
                m = bn2;
            } else
            {
                m.a((q));
            }
        }
        if (o == null)
        {
            if (!o(q).isEmpty())
            {
                if (n.isEmpty())
                {
                    n = n(q);
                    a = a & 0xfffffeff;
                } else
                {
                    B();
                    n.addAll(on(q));
                }
                q();
            }
        } else
        if (!q(q).isEmpty())
        {
            if (o.d())
            {
                o.b();
                o = null;
                n = n(q);
                a = a & 0xfffffeff;
                bn bn3 = obj1;
                if (a())
                {
                    bn3 = C();
                }
                o = bn3;
            } else
            {
                o.a((q));
            }
        }
        d(d(q));
        q();
        return this;
    }

    public final q a(q q)
    {
        if (e == null)
        {
            if (q == null)
            {
                throw new NullPointerException();
            }
            d = q;
            q();
        } else
        {
            e.a(q);
        }
        a = a | 2;
        return this;
    }

    public final a a(a a1)
    {
        if (c == null)
        {
            if (a1 == null)
            {
                throw new NullPointerException();
            }
            b = a1;
            q();
        } else
        {
            c.a(a1);
        }
        a = a | 1;
        return this;
    }

    public final a a(a a1)
    {
        if (k == null)
        {
            x();
            j.add(a1.r());
            q();
            return this;
        } else
        {
            k.a(a1.r());
            return this;
        }
    }

    public final r a(r r1)
    {
        if (o == null)
        {
            B();
            n.add(r1.r());
            q();
            return this;
        } else
        {
            o.a(r1.r());
            return this;
        }
    }

    public final r a(r r1)
    {
        if (m == null)
        {
            z();
            l.add(r1.r());
            q();
            return this;
        } else
        {
            m.a(r1.r());
            return this;
        }
    }

    public final boolean a()
    {
        boolean flag;
        if ((a & 4) == 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i1;
        if ((a & 8) == 8)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0) goto _L1; else goto _L3
_L3:
        if ((a & 1) == 1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0 && !u().u()) goto _L1; else goto _L4
_L4:
        if ((a & 2) == 2)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0 && !v().v()) goto _L1; else goto _L5
_L5:
        i1 = 0;
_L7:
        r r1;
        int j1;
        if (k == null)
        {
            j1 = j.size();
        } else
        {
            j1 = k.c();
        }
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_193;
        }
        if (k == null)
        {
            r1 = (k)j.get(i1);
        } else
        {
            r1 = ()k.a(i1);
        }
        if (!r1.k()) goto _L1; else goto _L6
_L6:
        i1++;
          goto _L7
        i1 = 0;
_L9:
        r r2;
        int k1;
        if (m == null)
        {
            k1 = l.size();
        } else
        {
            k1 = m.c();
        }
        if (i1 >= k1)
        {
            break MISSING_BLOCK_LABEL_278;
        }
        if (m == null)
        {
            r2 = (m)l.get(i1);
        } else
        {
            r2 = ()m.a(i1);
        }
        if (!r2.m()) goto _L1; else goto _L8
_L8:
        i1++;
          goto _L9
        i1 = 0;
_L11:
        r r3;
        int l1;
        if (o == null)
        {
            l1 = n.size();
        } else
        {
            l1 = o.c();
        }
        if (i1 >= l1)
        {
            break MISSING_BLOCK_LABEL_363;
        }
        if (o == null)
        {
            r3 = (o)n.get(i1);
        } else
        {
            r3 = ()o.a(i1);
        }
        if (!r3.o()) goto _L1; else goto _L10
_L10:
        i1++;
          goto _L11
        return true;
    }

    public final com.c.b.a.a b(g g1, aq aq)
    {
        return d(g1, aq);
    }

    public final com.c.b.a.a c(bd bd)
    {
        return d(bd);
    }

    public final com.c.b.a.a c(g g1, aq aq)
    {
        return d(g1, aq);
    }

    protected final com.c.b.a.a d()
    {
        return com.kik.d.b.a.f().(com/kik/d/b/a$a, com/kik/d/b/a$a$a);
    }

    public final com.c.b.a.a e()
    {
        return com.kik.d.b.a.e();
    }

    public final bd h()
    {
        return t();
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
        r r1 = t();
        if (!r1.t())
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
        b = null;
        d = null;
        h = "";
        i = ay.a;
        j = Collections.emptyList();
        l = Collections.emptyList();
        n = Collections.emptyList();
        s();
    }

    s(byte byte0)
    {
        this();
    }

    private <init>(com.c.b.a.a a1)
    {
        super(a1);
        b = null;
        d = null;
        h = "";
        i = ay.a;
        j = Collections.emptyList();
        l = Collections.emptyList();
        n = Collections.emptyList();
        s();
    }

    s(com.c.b.a.a a1, byte byte0)
    {
        this(a1);
    }
}
