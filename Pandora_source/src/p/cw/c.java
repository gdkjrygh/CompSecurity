// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cw;

import android.content.Context;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.ah;
import com.pandora.radio.data.o;
import com.pandora.radio.data.p;
import com.pandora.radio.data.r;
import com.pandora.radio.data.u;
import com.pandora.radio.provider.d;
import com.pandora.radio.util.NetworkUtil;
import com.pandora.radio.util.h;
import com.pandora.radio.util.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p.cx.aa;
import p.cx.ab;
import p.cx.e;
import p.cx.j;
import p.cx.k;
import p.cx.l;
import p.cx.t;
import p.cx.w;
import p.cx.x;
import p.dg.a;
import p.dg.f;
import p.dk.b;
import p.dm.m;
import p.dt.i;

// Referenced classes of package p.cw:
//            f, b, a

public class c
{

    public static c z;
    private final Object A = new Object();
    private a B;
    private u C;
    private i D;
    private p.dg.i E;
    private Context F;
    private final String G;
    private final boolean H;
    private final boolean I;
    private boolean J;
    private final List K = new ArrayList();
    private final boolean L;
    private final p.de.a M;
    private final com.pandora.radio.util.a N;
    private l O;
    private final p.cw.f P;
    private r Q;
    private final List R = new ArrayList();
    protected p.cw.b a;
    protected p.dh.a b;
    protected h c;
    protected d d;
    protected NetworkUtil e;
    protected w f;
    protected p.cx.b g;
    protected com.pandora.radio.util.k h;
    protected f i;
    protected p.dg.d j;
    protected p.cx.p k;
    protected o l;
    protected ag m;
    protected com.pandora.radio.data.f n;
    protected p.cx.f o;
    protected x p;
    protected p.cx.u q;
    protected p.dj.b r;
    protected j s;
    protected aa t;
    protected s u;
    protected p.dk.a v;
    protected final String w;
    protected final boolean x;
    protected boolean y;

    public c(Context context, String s1, int i1, boolean flag, boolean flag1, String s2, boolean flag2, 
            boolean flag3, String s3, String s4, String s5, String s6, String s7, String s8, 
            String s9, p.de.a a1, com.pandora.radio.util.a a2, List list, l l1, p.cw.f f1, r r1)
        throws e.e, e.b
    {
        if (r1 == null || !r1.a())
        {
            throw new e.a("Radio.startup() requires a non null, PartnerDeviceData that must contain a partner username, password, synctime key and request key.");
        }
        F = context.getApplicationContext();
        if (F == null)
        {
            throw new IllegalArgumentException("Radio.startup() must be called with a valid application context");
        }
        if (z != null)
        {
            throw new e.e();
        }
        z = this;
        G = s1;
        H = flag;
        w = s2;
        x = flag2;
        I = flag3;
        L = flag1;
        N = a2;
        M = a1;
        if (f1 == null)
        {
            f1 = p.cw.f.b;
        }
        P = f1;
        Q = r1;
        C = new u(this);
        D = a();
        D.c(this);
        a(flag, s3, s4, s5, s6, s7, s8, s9, list, i1, r1);
        y = false;
    }

    private void c(a a1)
    {
        if (a1 != B)
        {
            a a2 = B;
            B = a1;
            if (a2 != null)
            {
                a2.C();
            } else
            if (a != null)
            {
                a.C();
            }
            if (B == null)
            {
                if (a != null)
                {
                    a.B();
                    return;
                }
            } else
            {
                B.B();
                return;
            }
        }
    }

    public String A()
    {
        return w;
    }

    public String B()
    {
        return G;
    }

    public boolean C()
    {
        if (m.bj)
        {
            return true;
        }
        for (Iterator iterator = K.iterator(); iterator.hasNext();)
        {
            if (((k)iterator.next()).G())
            {
                return true;
            }
        }

        return false;
    }

    public boolean D()
    {
        return d().A();
    }

    public boolean E()
    {
        return J;
    }

    public a F()
    {
        for (Iterator iterator = R.iterator(); iterator.hasNext();)
        {
            a a1 = (a)iterator.next();
            if (a1 != null && a1.V())
            {
                return a1;
            }
        }

        return null;
    }

    public s G()
    {
        if (y)
        {
            throw new e.d();
        } else
        {
            return u;
        }
    }

    public p.dk.a H()
    {
        if (y)
        {
            throw new e.d();
        } else
        {
            return v;
        }
    }

    protected i a()
    {
        return new i();
    }

    public void a(Object obj)
    {
        a(obj, null);
    }

    public void a(Object obj, p.dt.i.a a1)
    {
        if (y)
        {
            throw new e.d();
        } else
        {
            D.a(obj, a1);
            return;
        }
    }

    public void a(p.cw.b b1)
    {
        if (B == b1)
        {
            c(((a) (null)));
        }
    }

    public void a(k k1)
    {
        K.add(k1);
    }

    public void a(a a1)
    {
        if (a1 == null)
        {
            throw new e.c("Cannot set null alternate player!");
        }
        if (a != null)
        {
            if (a.p())
            {
                h().a(1);
            }
            a.b(p.cw.b.c.b);
        }
        c(a1);
    }

    public void a(boolean flag)
    {
        J = flag;
    }

    protected void a(boolean flag, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, List list, int i1, r r1)
    {
        l = new p(this, i1);
        m = new ah(this);
        d = new d(this, list);
        o = new p.cx.f(this);
        t = new aa(this, r1);
        q = new p.cx.u(this, o, s1, s2, s3, s5, s4, t);
        e = new NetworkUtil(this);
        f = new w(this);
        k = new p.cx.p(this, s6, flag);
        i = new f(this);
        r = new p.dj.c(this);
        b = new p.dh.a(this);
        s = new j(this);
        u = new s(this);
        v = new b(this);
        h = new com.pandora.radio.util.k(this, s7, N);
        g = new p.cx.b(this);
        y = false;
    }

    public boolean a(p.dj.b.a a1)
    {
        if (y)
        {
            throw new e.d();
        } else
        {
            return r.a(a1);
        }
    }

    public void b(Object obj)
    {
        if (y)
        {
            throw new e.d();
        } else
        {
            D.c(obj);
            return;
        }
    }

    public void b(a a1)
    {
        R.add(a1);
    }

    public boolean b()
    {
        return y;
    }

    public void c()
        throws e.d
    {
        Object obj = A;
        obj;
        JVM INSTR monitorenter ;
        if (y)
        {
            throw new e.d();
        }
        break MISSING_BLOCK_LABEL_27;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        D.b(this);
        h.c(true);
        if (a != null)
        {
            a.k();
            a = null;
        }
        if (c != null)
        {
            c.a();
            c = null;
        }
        ab.b();
        g.e();
        k.g();
        b.b();
        h.e();
        f.a();
        l.p();
        m.L();
        e.a();
        o.d();
        r.a();
        i.a();
        s.e();
        u.a();
        v.b();
        f = null;
        g = null;
        e = null;
        h = null;
        E = null;
        C = null;
        d = null;
        D = null;
        F = null;
        j = null;
        n = null;
        o = null;
        t = null;
        p = null;
        i = null;
        k = null;
        b = null;
        r = null;
        s = null;
        u = null;
        v = null;
        z = null;
        y = true;
        obj;
        JVM INSTR monitorexit ;
    }

    public void c(Object obj)
    {
        if (y)
        {
            throw new e.d();
        }
        D.b(obj);
_L1:
        return;
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        if (obj != null)
        {
            obj = obj.getClass().getName();
        } else
        {
            obj = "null object";
        }
        p.df.a.b("Radio", illegalargumentexception, "Unexpected exception unregistering %s", new Object[] {
            obj
        });
        if (!com.pandora.radio.util.i.e())
        {
            throw illegalargumentexception;
        }
          goto _L1
    }

    public p.cw.b d()
    {
        Object obj = A;
        obj;
        JVM INSTR monitorenter ;
        if (y)
        {
            throw new e.d();
        }
        break MISSING_BLOCK_LABEL_27;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        a a1;
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        a = new p.dg.h(this, D, P);
        a1 = F();
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        a.B();
_L1:
        obj;
        JVM INSTR monitorexit ;
        if (B != null)
        {
            return B;
        } else
        {
            return a;
        }
        a(a1);
          goto _L1
    }

    public x e()
    {
        if (y)
        {
            throw new e.d();
        }
        synchronized (A)
        {
            if (p == null)
            {
                p = new x(this, (p.cx.f)m(), q, b, L, O, t, Q, N, s, H);
            }
        }
        return p;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public p.dg.i f()
    {
        synchronized (A)
        {
            if (E == null)
            {
                E = new p.dg.i(this);
            }
        }
        return E;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public h g()
    {
        if (y)
        {
            throw new e.d();
        }
        synchronized (A)
        {
            if (c == null)
            {
                c = new h(this);
            }
        }
        return c;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public f h()
    {
        if (y)
        {
            throw new e.d();
        } else
        {
            return i;
        }
    }

    public p.dg.d i()
    {
        if (y)
        {
            throw new e.d();
        }
        synchronized (A)
        {
            if (j == null)
            {
                j = new p.dg.d(this, M, P);
            }
        }
        return j;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public o j()
    {
        if (y)
        {
            throw new e.d();
        } else
        {
            return l;
        }
    }

    public ag k()
    {
        if (y)
        {
            throw new e.d();
        } else
        {
            return m;
        }
    }

    public com.pandora.radio.data.f l()
    {
        if (y)
        {
            throw new e.d();
        }
        synchronized (A)
        {
            if (n == null)
            {
                n = new com.pandora.radio.data.f(this, G, H, Q);
            }
        }
        return n;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public e m()
    {
        if (y)
        {
            throw new e.d();
        } else
        {
            return o;
        }
    }

    public p.cw.a n()
    {
        if (y)
        {
            throw new e.d();
        } else
        {
            return b;
        }
    }

    public com.pandora.radio.util.k o()
    {
        if (y)
        {
            throw new e.d();
        } else
        {
            return h;
        }
    }

    public void onAlternatePlayerDisconnected(p.dd.b b1)
    {
        if (!y && B != null && B.D())
        {
            a(B);
            if (a != null && b1.b)
            {
                a.d(b1.a);
                a.a(b1.a, null, false, b.b.c, b1.e);
                if (!b1.d)
                {
                    a.b(p.cw.b.c.b);
                }
            }
        }
    }

    public void onDeadEvent(p.dt.d d1)
    {
        p.df.a.a("Radio", (new StringBuilder()).append("Got dead event: ").append(d1.b).toString());
    }

    public t p()
    {
        if (y)
        {
            throw new e.d();
        } else
        {
            return q;
        }
    }

    public p.dd.ag producePlayerStateChangeEvent()
    {
        if (B != null)
        {
            return new p.dd.ag(B.u(), B.t());
        }
        if (a != null)
        {
            return new p.dd.ag(a.u(), a.t());
        } else
        {
            return new p.dd.ag(p.cw.b.a.a, null);
        }
    }

    public p.dj.b q()
    {
        if (y)
        {
            throw new e.d();
        } else
        {
            return r;
        }
    }

    public p.cx.i r()
    {
        if (y)
        {
            throw new e.d();
        } else
        {
            return s;
        }
    }

    public Context s()
    {
        if (y)
        {
            throw new e.d();
        } else
        {
            return F;
        }
    }

    public u t()
    {
        if (y)
        {
            throw new e.d();
        } else
        {
            return C;
        }
    }

    public NetworkUtil u()
    {
        if (y)
        {
            throw new e.d();
        } else
        {
            return e;
        }
    }

    public p.cx.b v()
    {
        if (y)
        {
            throw new e.d();
        } else
        {
            return g;
        }
    }

    public d w()
    {
        if (y)
        {
            throw new e.d();
        } else
        {
            return d;
        }
    }

    public com.pandora.radio.provider.f x()
    {
        if (y)
        {
            throw new e.d();
        } else
        {
            return w().d();
        }
    }

    public com.pandora.radio.provider.i y()
    {
        if (y)
        {
            throw new e.d();
        } else
        {
            return w().e();
        }
    }

    public p.cx.p z()
    {
        if (y)
        {
            throw new e.d();
        } else
        {
            return k;
        }
    }
}
