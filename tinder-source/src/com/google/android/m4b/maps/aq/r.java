// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aq;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.v4.view.x;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.widget.TextView;
import com.google.android.m4b.maps.ar.a;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.m;
import com.google.android.m4b.maps.az.i;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bo.h;
import com.google.android.m4b.maps.br.c;
import com.google.android.m4b.maps.bs.e;
import com.google.android.m4b.maps.bw.g;
import com.google.android.m4b.maps.bx.ai;
import com.google.android.m4b.maps.bx.ao;
import com.google.android.m4b.maps.bx.aq;
import com.google.android.m4b.maps.bx.at;
import com.google.android.m4b.maps.bx.b;
import com.google.android.m4b.maps.bx.l;
import com.google.android.m4b.maps.bx.o;
import com.google.android.m4b.maps.bx.p;
import com.google.android.m4b.maps.bx.q;
import com.google.android.m4b.maps.bx.v;
import com.google.android.m4b.maps.bx.w;
import com.google.android.m4b.maps.cg.ba;
import com.google.android.m4b.maps.cg.bc;
import com.google.android.m4b.maps.cg.bg;
import com.google.android.m4b.maps.cg.bj;
import com.google.android.m4b.maps.cg.bn;
import com.google.android.m4b.maps.cg.bp;
import com.google.android.m4b.maps.cg.bt;
import com.google.android.m4b.maps.cg.ca;
import com.google.android.m4b.maps.cg.cb;
import com.google.android.m4b.maps.cg.cd;
import com.google.android.m4b.maps.cg.d;
import com.google.android.m4b.maps.df.ae;
import com.google.android.m4b.maps.df.ag;
import com.google.android.m4b.maps.df.an;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.PointOfInterest;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.google.android.m4b.maps.aq:
//            v, u, m, c, 
//            a, k, h, q, 
//            g, e, b

public final class r extends ao
    implements com.google.android.m4b.maps.aq.v
{
    static interface a
    {

        public abstract b a(Resources resources);

        public abstract l a(ah ah1, Resources resources);

        public abstract l a(l l1, Resources resources);

        public abstract l b(Resources resources);

        public abstract l b(ah ah1, Resources resources);

        public abstract l c(ah ah1, Resources resources);
    }


    private ae A;
    private ag B;
    private com.google.android.m4b.maps.bx.r C;
    private com.google.android.m4b.maps.bx.r D;
    private com.google.android.m4b.maps.bx.r E;
    private b F;
    private com.google.android.m4b.maps.ay.b G;
    private ca H;
    private int I;
    private bc J;
    private final p n;
    private final u o;
    private final com.google.android.m4b.maps.aq.a p;
    private final com.google.android.m4b.maps.aq.m q;
    private final com.google.android.m4b.maps.aq.c r;
    private final q s;
    private final cd t = new cd(new Runnable() {

        private r a;

        public final void run()
        {
            com.google.android.m4b.maps.aq.r.c(a);
        }

            
            {
                a = r.this;
                super();
            }
    });
    private final com.google.android.m4b.maps.bx.ao.b u = new com.google.android.m4b.maps.bx.ao.b() {

        private r a;

        public final void a(com.google.android.m4b.maps.bo.g g3)
        {
            if (com.google.android.m4b.maps.aq.r.a(a) == null)
            {
                break MISSING_BLOCK_LABEL_26;
            }
            com.google.android.m4b.maps.aq.r.a(a).a(com.google.android.m4b.maps.aq.b.a(g3));
            return;
            g3;
            throw new RuntimeRemoteException(g3);
        }

        public final void b(com.google.android.m4b.maps.bo.g g3)
        {
            if (com.google.android.m4b.maps.aq.r.b(a) == null)
            {
                break MISSING_BLOCK_LABEL_26;
            }
            com.google.android.m4b.maps.aq.r.b(a).a(com.google.android.m4b.maps.aq.b.a(g3));
            return;
            g3;
            throw new RuntimeRemoteException(g3);
        }

            
            {
                a = r.this;
                super();
            }
    };
    private final com.google.android.m4b.maps.aq.h v;
    private final a w;
    private final com.google.android.m4b.maps.aq.g x;
    private final k y = new k(this);
    private final com.google.android.m4b.maps.aq.q z;

    private r(Context context, Resources resources, p p1, q q1, a a1, com.google.android.m4b.maps.aq.g g1, ScheduledExecutorService scheduledexecutorservice, 
            View view, bn bn1, String s1, boolean flag, TextView textview, com.google.android.m4b.maps.cg.o o1, com.google.android.m4b.maps.ay.b b1, 
            bg bg, m m1, e e1, g g2, bc bc1)
    {
        super(context, resources, textview, bn1.e, e1, g2, bc1);
        I = 1;
        G = b1;
        n = p1;
        n.a();
        o = new u(n, this);
        super.e = n;
        super.e.a(super.f);
        super.e.a(super.a);
        super.a.a(super.e);
        super.m = true;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h(flag);
        s = q1;
        s.e = new com.google.android.m4b.maps.bx.q.b() {

            private r a;

            
            {
                a = r.this;
                super();
            }
        };
        n.e = s;
        q = new com.google.android.m4b.maps.aq.m(this, scheduledexecutorservice, m1, e1, g2);
        r = com.google.android.m4b.maps.aq.c.a(this, o, G);
        H = new ca(this, r);
        android.support.v4.view.x.a(this, H);
        context = new Handler(Looper.getMainLooper());
        p = new com.google.android.m4b.maps.aq.a(this, o, context);
        v = com.google.android.m4b.maps.aq.h.a(this, o1);
        x = g1;
        w = a1;
        J = bc1;
        if (!com.google.android.m4b.maps.y.p.b(s1))
        {
            context = w.b(ah.a, getResources());
            super.a.a(context);
        }
        if (!(this instanceof SurfaceView))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        context = ba.a();
        z = new com.google.android.m4b.maps.aq.q(this, view, bn1.a, flag, context, bg);
        a(w.b(ah.o, getResources()));
        if (com.google.android.m4b.maps.ar.a.a(resources))
        {
            context = c.u;
        } else
        {
            context = c.t;
        }
        super.a.a(context);
        a(r.b);
        a(q);
    }

    private void F()
    {
        if (A == null && B == null)
        {
            super.b = null;
            return;
        } else
        {
            super.b = u;
            return;
        }
    }

    private boolean G()
    {
        return x != null && x.d();
    }

    public static com.google.android.m4b.maps.aq.v a(bj bj1, ScheduledExecutorService scheduledexecutorservice, View view, bn bn1, String s1, boolean flag, TextView textview, com.google.android.m4b.maps.cg.o o1, 
            cb cb, bc bc1)
    {
        Context context = bj1.a;
        Resources resources = bj1.b;
        m m1 = bj1.d.a();
        e e1 = bj1.i;
        g g1 = new g(context, m1, new Runnable() {

            public final void run()
            {
                ab.a("Failed to load map. Error contacting Google servers. This is probably an authentication issue (but could be due to network errors).");
            }

        }, e1, bj1.d);
        com.google.android.m4b.maps.aq.e.a(bj1, g1);
        p p1 = new p(bj1.b);
        q q1 = new q(m1);
        Object obj = new Handler(Looper.getMainLooper());
        cb = com.google.android.m4b.maps.aq.g.a(com.google.android.m4b.maps.az.i.a(), ((Handler) (obj)), cb);
        obj = new a(e1, g1, s1, cb) {

            private e a;
            private g b;
            private String c;
            private com.google.android.m4b.maps.aq.g d;

            public final b a(Resources resources1)
            {
                return (b)com.google.android.m4b.maps.bx.l.a(resources1, d.a, a, b);
            }

            public final l a(ah ah1, Resources resources1)
            {
                return com.google.android.m4b.maps.bx.l.c(ah1, resources1, a, b);
            }

            public final l a(l l1, Resources resources1)
            {
                l1 = com.google.android.m4b.maps.bx.l.a(l1.o, ah.a, resources1, a, b);
                com.google.android.m4b.maps.aq.r.a(l1, c);
                return l1;
            }

            public final l b(Resources resources1)
            {
                resources1 = com.google.android.m4b.maps.bx.l.a(resources1, ah.f, a, b);
                com.google.android.m4b.maps.aq.r.a(resources1, c);
                return resources1;
            }

            public final l b(ah ah1, Resources resources1)
            {
                ah1 = com.google.android.m4b.maps.bx.l.a(ah1, resources1, a, b);
                com.google.android.m4b.maps.aq.r.a(ah1, c);
                return ah1;
            }

            public final l c(ah ah1, Resources resources1)
            {
                return com.google.android.m4b.maps.bx.l.b(ah1, resources1, a, b);
            }

            
            {
                a = e1;
                b = g1;
                c = s1;
                d = g2;
                super();
            }
        };
        if (!com.google.android.m4b.maps.y.p.b(s1))
        {
            com.google.android.m4b.maps.bx.o.a(ah.j, context, resources, m1, e1);
            com.google.android.m4b.maps.bx.o.a(ah.m, context, resources, m1, e1);
        }
        if (bc1 != null)
        {
            com.google.android.m4b.maps.bx.o.a(bc1.a(), context, resources, m1, e1);
        }
        return new r(context, resources, p1, q1, ((a) (obj)), cb, scheduledexecutorservice, view, bn1, s1, flag, textview, o1, bj1.f, bj1.e, m1, e1, g1, bc1);
    }

    static ag a(r r1)
    {
        return r1.B;
    }

    static void a(l l1, String s1)
    {
        if (!com.google.android.m4b.maps.y.p.b(s1))
        {
            com.google.android.m4b.maps.bo.at.a a1 = new com.google.android.m4b.maps.bo.at.a();
            a1.a = s1;
            l1.a(a1.a());
        }
    }

    static ae b(r r1)
    {
        return r1.A;
    }

    static void c(r r1)
    {
        r1.ao.a(true, false);
    }

    public final void a()
    {
        b(false);
        h(false);
        super.a();
    }

    public final void a(float f1, float f2)
    {
        H.b();
        super.a(f1, f2);
    }

    public final void a(int i1)
    {
        if (J == null || !J.a) goto _L2; else goto _L1
_L1:
        com.google.android.m4b.maps.bx.i j1;
        ah ah1;
        ah1 = J.a();
        j1 = com.google.android.m4b.maps.bx.i.g;
_L4:
        if (E != null)
        {
            b(E);
            E = null;
        }
        if (ah1 != null && ah1 != ah.a)
        {
            if (J != null && ah1 == J.a())
            {
                E = w.c(ah1, getResources());
            } else
            {
                E = w.a(ah1, getResources());
            }
            a(E);
        }
        I = i1;
        super.a.b(j1);
        return;
_L2:
        switch (i1)
        {
        case 1: // '\001'
        default:
            ah1 = ah.a;
            j1 = com.google.android.m4b.maps.bx.i.a;
            break;

        case 0: // '\0'
            j1 = com.google.android.m4b.maps.bx.i.e;
            ah1 = null;
            break;

        case 2: // '\002'
            ah1 = ah.d;
            j1 = com.google.android.m4b.maps.bx.i.e;
            break;

        case 4: // '\004'
            ah1 = ah.d;
            j1 = com.google.android.m4b.maps.bx.i.b;
            break;

        case 3: // '\003'
            ah1 = ah.e;
            j1 = com.google.android.m4b.maps.bx.i.d;
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(v.a a1)
    {
        if (a1 == null)
        {
            super.c = null;
            return;
        } else
        {
            super.c = new com.google.android.m4b.maps.bx.ao.a(a1) {

                private v.a a;
                private r b;

                public final boolean a()
                {
                    return a.f();
                }

            
            {
                b = r.this;
                a = a1;
                super();
            }
            };
            return;
        }
    }

    public final void a(ae ae)
    {
        A = ae;
        F();
    }

    public final void a(ag ag)
    {
        B = ag;
        F();
    }

    public final void a(an an)
    {
        if (an == null)
        {
            super.a.d.d = null;
            return;
        } else
        {
            super.a.d.d = new com.google.android.m4b.maps.bx.w.a(an) {

                private an a;
                private r b;

                public final void a(v v1)
                {
                    com.google.android.m4b.maps.ay.c.d();
                    if (!(v1 instanceof com.google.android.m4b.maps.cc.g))
                    {
                        break MISSING_BLOCK_LABEL_68;
                    }
                    Object obj = ((com.google.android.m4b.maps.cc.g)v1).a;
                    String s1 = ((h) (obj)).c();
                    obj = ((h) (obj)).b;
                    v1 = new PointOfInterest(new LatLng(((com.google.android.m4b.maps.bo.g) (obj)).b(), ((com.google.android.m4b.maps.bo.g) (obj)).d()), s1, v1.k());
                    a.a(v1);
                    return;
                    v1;
                    throw new RuntimeRemoteException(v1);
                }

            
            {
                b = r.this;
                a = an1;
                super();
            }
            };
            return;
        }
    }

    public final void a(boolean flag, boolean flag1)
    {
        H.b();
        super.a(flag, flag1);
    }

    public final boolean a(boolean flag)
    {
        if (flag)
        {
            if (C == null)
            {
                C = w.b(getResources());
                a(C);
            }
        } else
        if (C != null)
        {
            b(C);
            C = null;
            return flag;
        }
        return flag;
    }

    public final void b()
    {
        v.a();
        t.a();
    }

    public final boolean b(boolean flag)
    {
        if (x != null && G() != flag)
        {
            if (flag)
            {
                if (x.a())
                {
                    a a1 = w;
                    getContext();
                    F = a1.a(getResources());
                    a(F);
                }
            } else
            {
                s.d = null;
                b(((com.google.android.m4b.maps.bx.r) (F)));
                F.f();
                F = null;
                x.b();
            }
        }
        return G();
    }

    public final com.google.android.m4b.maps.bx.ah c()
    {
        return super.a.e;
    }

    public final boolean c(boolean flag)
    {
        if (flag)
        {
            if (D == null)
            {
                D = w.a(super.a.h, getResources());
                a(D);
            }
        } else
        if (D != null)
        {
            b(D);
            D = null;
            return flag;
        }
        return flag;
    }

    public final boolean canScrollHorizontally(int i1)
    {
        return super.d.a.a;
    }

    public final boolean canScrollVertically(int i1)
    {
        return super.d.a.a;
    }

    public final View d()
    {
        return this;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionevent)
    {
        if (H.a(motionevent))
        {
            return true;
        } else
        {
            return super.dispatchHoverEvent(motionevent);
        }
    }

    public final bp e()
    {
        return p;
    }

    public final com.google.android.m4b.maps.cg.ac.a f()
    {
        return r;
    }

    public final com.google.android.m4b.maps.cg.ag g()
    {
        return q;
    }

    public final com.google.android.m4b.maps.cg.ae.a h()
    {
        return y;
    }

    public final d i()
    {
        return x;
    }

    public final com.google.android.m4b.maps.cg.aq j()
    {
        return z;
    }

    public final void k()
    {
        com.google.android.m4b.maps.bx.o.d();
    }

    public final bc l()
    {
        return J;
    }

    public final void m()
    {
        if (J != null)
        {
            a(I);
        }
    }
}
