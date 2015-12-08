// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a;

import com.kik.g.f;
import com.kik.g.k;
import com.kik.g.p;
import com.kik.g.s;
import java.util.concurrent.Executors;
import kik.a.d.aa;
import kik.a.d.j;
import kik.a.e.c;
import kik.a.e.d;
import kik.a.e.e;
import kik.a.e.i;
import kik.a.e.l;
import kik.a.e.m;
import kik.a.e.n;
import kik.a.e.r;
import kik.a.e.t;
import kik.a.e.u;
import kik.a.e.w;
import kik.a.g.b;
import kik.a.g.v;
import kik.a.h.h;
import kik.a.j.o;

// Referenced classes of package kik.a:
//            aa, ab, c, b, 
//            z

public final class a
    implements kik.a.aa, ab
{

    protected static final Object a = new Object();
    private c A;
    private p B;
    private p C;
    protected boolean b;
    protected kik.a.e.o c;
    protected d d;
    protected t e;
    protected kik.a.e.k f;
    protected kik.a.e.v g;
    protected kik.a.e.f h;
    protected l i;
    protected n j;
    protected kik.a.f.k k;
    protected w l;
    protected v m;
    protected kik.a.e.b n;
    protected e o;
    protected i p;
    protected u q;
    protected kik.a.i.h r;
    protected m s;
    protected o t;
    protected f u;
    private k v;
    private k w;
    private k x;
    private final String y;
    private final k z;

    protected a()
    {
        this(null);
    }

    protected a(String s1)
    {
        b = false;
        z = new k(this);
        B = new p();
        C = new p();
        y = s1;
    }

    public final com.kik.g.e a()
    {
        return v.a();
    }

    public final void a(kik.a.c c1)
    {
        java.util.concurrent.ExecutorService executorservice = Executors.newSingleThreadExecutor();
        v = new com.kik.g.a(this, executorservice);
        w = new com.kik.g.a(this, executorservice);
        x = new com.kik.g.a(this, executorservice);
        u = new f();
        c = new kik.a.b.a();
        k = c1.e();
        e = c1.c();
        e.a();
        f = c1.b();
        f.a(executorservice, this);
        g = c1.a(e, executorservice, k);
        h = c1.a();
        h.a(executorservice, k, c);
        l = c1.a(g, h);
        l.a(executorservice);
        m = new v(g, h, f, executorservice);
        m.l();
        i = new b(m.n(), m, h, g, executorservice);
        j = new kik.a.c.b(g);
        n = c1.a(g, h, l);
        o = c1.a(g, h, k, z.a());
        p = c1.a(h, m, g, c, m, l, i, executorservice);
        m.a(p.e());
        p.y();
        i.a(p);
        u.a(l.c(), new kik.a.b(this));
        d = c1.a(h, g, e, l);
        A = c1.g();
        t = new o();
        t.a(c1.f(), h);
        c.a(t);
        r = new kik.a.i.a(t);
        s = new kik.a.c.a(g);
        q = c1.a(h);
        q.a(t);
        A.a(t, g, C, l.h());
        n.a(A);
        o.a(t);
        b = true;
        g.e();
        c1 = kik.a.z.b(g);
        if (c1 != null)
        {
            a(c1.a(), c1.d(), false);
        }
        p.w();
    }

    public final void a(j j1, String s1)
    {
        a(j1, s1, false);
    }

    public final void a(j j1, String s1, boolean flag)
    {
        aa aa1 = l.d();
        Object obj = kik.a.z.b(g);
        boolean flag1;
        boolean flag2;
        if (obj == null || ((z) (obj)).c() == null || ((z) (obj)).b() == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (obj == null || ((z) (obj)).d() != null && !((z) (obj)).d().equals(s1))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag1 || flag2)
        {
            String s3 = aa1.c;
            String s2 = aa1.a;
            obj = g;
            byte abyte1[] = kik.a.h.h.a(s1, s3, "niCRwL7isZHny24qgLvy");
            byte abyte0[] = kik.a.h.h.a(s1, s2, "niCRwL7isZHny24qgLvy");
            ((kik.a.e.v) (obj)).c("CredentialData.jid", j1.toString());
            ((kik.a.e.v) (obj)).c("CredentialData.password", s1);
            ((kik.a.e.v) (obj)).c("CredentialData.username_passkey", kik.a.h.i.a(abyte1));
            ((kik.a.e.v) (obj)).c("CredentialData.email_passkey", kik.a.h.i.a(abyte0));
            obj = kik.a.z.b(g);
        }
        if (obj != null)
        {
            com.kik.g.s.b(com.kik.g.s.a(com.kik.g.s.b(h.b()), B), C);
            h.a(((z) (obj)));
            t.a(((z) (obj)), aa1.c);
            if (flag)
            {
                c.a(true);
            } else
            {
                c.a(false);
            }
            z.a(obj);
            B.a(obj);
            B = com.kik.g.s.a(obj);
        }
    }

    public final com.kik.g.e b()
    {
        return w.a();
    }

    public final com.kik.g.e c()
    {
        return x.a();
    }

    public final p d()
    {
        return C;
    }

    public final void e()
    {
        w.a(null);
    }

    public final void f()
    {
        v.a(null);
    }

    public final boolean g()
    {
        return b;
    }

    public final kik.a.e.f h()
    {
        return h;
    }

    public final t i()
    {
        return e;
    }

    public final kik.a.f.k j()
    {
        return k;
    }

    public final kik.a.e.v k()
    {
        return g;
    }

    public final w l()
    {
        return l;
    }

    public final kik.a.e.b m()
    {
        return n;
    }

    public final e n()
    {
        return o;
    }

    public final i o()
    {
        return p;
    }

    public final d p()
    {
        return d;
    }

    public final r q()
    {
        return m;
    }

    public final l r()
    {
        return i;
    }

    public final n s()
    {
        return j;
    }

    public final kik.a.e.o t()
    {
        return c;
    }

    public final u u()
    {
        return q;
    }

    public final kik.a.i.h v()
    {
        return r;
    }

    public final m w()
    {
        return s;
    }

    public final kik.a.j.m x()
    {
        return t;
    }

    public final void y()
    {
        aa aa1 = l.d();
        kik.a.e.v v1 = g;
        if (p != null)
        {
            p.z();
        }
        if (n != null)
        {
            n.a();
        }
        if (m != null)
        {
            m.k();
        }
        if (l != null)
        {
            l.i();
        }
        if (h != null)
        {
            h.n();
        }
        if (g != null)
        {
            g.k();
        }
        if (f != null)
        {
            f.b();
        }
        if (t != null)
        {
            t.c();
        }
        if (d != null)
        {
            d.a();
        }
        if (i != null)
        {
            i.f();
        }
        p = null;
        m = null;
        l = null;
        h = null;
        g = null;
        f = null;
        k = null;
        q = null;
        c = null;
        t = null;
        e = null;
        i = null;
        j = null;
        b = false;
        v1.a(aa1);
    }

    public final kik.a.e.k z()
    {
        return f;
    }

}
