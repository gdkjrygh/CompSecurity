// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.m4b.maps.GoogleMapOptions;
import com.google.android.m4b.maps.ai.c;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.ad;
import com.google.android.m4b.maps.ay.b;
import com.google.android.m4b.maps.ay.k;
import com.google.android.m4b.maps.ay.m;
import com.google.android.m4b.maps.bs.e;
import com.google.android.m4b.maps.cz.a;
import com.google.android.m4b.maps.da.d;
import com.google.android.m4b.maps.df.aa;
import com.google.android.m4b.maps.df.ac;
import com.google.android.m4b.maps.df.ae;
import com.google.android.m4b.maps.df.af;
import com.google.android.m4b.maps.df.ag;
import com.google.android.m4b.maps.df.ah;
import com.google.android.m4b.maps.df.ai;
import com.google.android.m4b.maps.df.aj;
import com.google.android.m4b.maps.df.ak;
import com.google.android.m4b.maps.df.al;
import com.google.android.m4b.maps.df.am;
import com.google.android.m4b.maps.df.an;
import com.google.android.m4b.maps.df.h;
import com.google.android.m4b.maps.df.l;
import com.google.android.m4b.maps.df.n;
import com.google.android.m4b.maps.df.r;
import com.google.android.m4b.maps.df.u;
import com.google.android.m4b.maps.df.w;
import com.google.android.m4b.maps.df.z;
import com.google.android.m4b.maps.g.g;
import com.google.android.m4b.maps.j.f;
import com.google.android.m4b.maps.model.CameraPosition;
import com.google.android.m4b.maps.model.CircleOptions;
import com.google.android.m4b.maps.model.GroundOverlayOptions;
import com.google.android.m4b.maps.model.MapsEngineLayerOptions;
import com.google.android.m4b.maps.model.MarkerOptions;
import com.google.android.m4b.maps.model.PolygonOptions;
import com.google.android.m4b.maps.model.PolylineOptions;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.model.TileOverlayOptions;
import com.google.android.m4b.maps.y.j;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            ce, bj, bv, bu, 
//            h, bh, ao, bt, 
//            bw, bf, by, q, 
//            bn, bm, o, ba, 
//            bc, cb, p, ah, 
//            g, ac, af, w, 
//            ag, m, ae, am, 
//            bg, j, bp, bi, 
//            bs, l, d, cf, 
//            br, cc, y, aa, 
//            aj, ak, bd, al, 
//            aq

public final class bz extends com.google.android.m4b.maps.df.t.a
    implements ce, l, z
{
    static final class a extends com.google.android.m4b.maps.df.aa.a
    {

        private final bi a;
        private final bp b;

        public final void a(CameraPosition cameraposition)
        {
            boolean flag1 = true;
            bi bi1 = a;
            boolean flag;
            if (cameraposition.c < b.a(cameraposition.b))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            bi1.a.setEnabled(flag);
            bi1 = a;
            if (cameraposition.c > b.d())
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            bi1.b.setEnabled(flag);
        }

        a(bp bp1, bi bi1)
        {
            a = bi1;
            b = bp1;
        }
    }


    private static final boolean a;
    private final c A;
    private int B;
    private l C;
    private final bi.a D = new bi.a() {

        private bz a;

        public final void a()
        {
            com.google.android.m4b.maps.cg.bz.a(a).b(cb.a.bi);
            com.google.android.m4b.maps.cg.bz.b(a).a(1.0F);
        }

        public final void b()
        {
            com.google.android.m4b.maps.cg.bz.a(a).b(cb.a.bj);
            com.google.android.m4b.maps.cg.bz.b(a).a(-1F);
        }

            
            {
                a = bz.this;
                super();
            }
    };
    private a E;
    private boolean F;
    private boolean G;
    private boolean H;
    private z I;
    private final com.google.android.m4b.maps.cg.g J;
    private boolean K;
    private boolean L;
    private boolean M;
    private final bp b;
    private final p c;
    private volatile boolean d;
    private final bm e;
    private final com.google.android.m4b.maps.cg.ac f;
    private final com.google.android.m4b.maps.cg.af g;
    private final com.google.android.m4b.maps.cg.ag h;
    private final com.google.android.m4b.maps.cg.l i;
    private final com.google.android.m4b.maps.cg.ae j;
    private final bh k;
    private final bn l;
    private final com.google.android.m4b.maps.cg.w m;
    private final o n;
    private final b o;
    private final View p;
    private final cb q;
    private final GoogleMapOptions r;
    private final bu s;
    private final com.google.android.m4b.maps.cg.d t;
    private final ScheduledExecutorService u;
    private final aq v;
    private final Executor w;
    private final m x;
    private final Context y;
    private final Resources z;

    private bz(View view, p p1, bm bm1, com.google.android.m4b.maps.cg.ac ac1, com.google.android.m4b.maps.cg.l l1, com.google.android.m4b.maps.cg.ae ae1, com.google.android.m4b.maps.cg.ag ag1, 
            com.google.android.m4b.maps.cg.af af1, bp bp1, bh bh1, bn bn1, com.google.android.m4b.maps.cg.w w1, o o1, b b1, 
            cb cb1, GoogleMapOptions googlemapoptions, bu bu1, com.google.android.m4b.maps.cg.d d1, aq aq, ScheduledExecutorService scheduledexecutorservice, com.google.android.m4b.maps.cg.g g1, 
            Executor executor, m m1, Resources resources, Context context, c c1)
    {
        d = false;
        B = 1;
        H = true;
        p = view;
        c = p1;
        e = bm1;
        f = ac1;
        i = l1;
        j = ae1;
        h = ag1;
        g = af1;
        b = bp1;
        k = bh1;
        l = bn1;
        m = w1;
        n = o1;
        o = b1;
        q = cb1;
        r = googlemapoptions;
        s = bu1;
        t = d1;
        v = aq;
        u = scheduledexecutorservice;
        J = g1;
        w = executor;
        x = m1;
        z = resources;
        y = context;
        A = c1;
    }

    public static bz a(GoogleMapOptions googlemapoptions, boolean flag, bj bj1)
    {
        bg bg1;
        o o1;
        boolean flag2;
        com.google.android.m4b.maps.y.j.a(googlemapoptions);
        Object obj = bj1.i.d;
        View view;
        bv bv1;
        bu.a a1;
        Context context;
        Resources resources;
        ScheduledExecutorService scheduledexecutorservice;
        bh bh1;
        cb cb1;
        m m1;
        bn bn1;
        bm bm1;
        Object obj1;
        q q1;
        Object obj2;
        Object obj3;
        b b1;
        com.google.android.m4b.maps.cg.g g1;
        Object obj4;
        Object obj5;
        com.google.android.m4b.maps.cg.af af1;
        com.google.android.m4b.maps.cg.w w1;
        com.google.android.m4b.maps.cg.m m2;
        Object obj6;
        com.google.android.m4b.maps.cg.d d1;
        aq aq;
        if (obj != null && ((com.google.android.m4b.maps.bs.a) (obj)).b)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        bv1 = new bv(new k(), "map_start_up", flag2, bj1.d);
        bv1.a();
        a1 = bv1.a("init");
        obj1 = bv1.a("map_load");
        context = bj1.a;
        resources = bj1.b;
        com.google.android.m4b.maps.cg.h.a(bj1);
        scheduledexecutorservice = Executors.newScheduledThreadPool(10);
        bh1 = new bh(context, resources);
        flag2 = b(googlemapoptions);
        obj = bj1.i.c;
        obj2 = com.google.android.m4b.maps.cg.ao.a(flag2);
        bg1 = bj1.e;
        m1 = bj1.d.a();
        cb1 = com.google.android.m4b.maps.cg.bf.a(context, new com.google.android.m4b.maps.ay.f(new bw(context, context.getPackageName()), m1), bg1, ((String) (obj2)));
        obj3 = new by(context, cb1, resources);
        q1 = com.google.android.m4b.maps.cg.q.a(context, resources, ((by) (obj3)), flag2);
        bn1 = new bn(context, resources, q1);
        bm1 = new bm(context);
        o1 = new o(com.google.android.m4b.maps.cg.ba.a());
        view = null;
        obj = view;
        if (googlemapoptions.n != null)
        {
            obj = view;
            if (googlemapoptions.n.booleanValue())
            {
                obj = com.google.android.m4b.maps.cg.bc.a(context);
            }
        }
        if (obj != null)
        {
            cb1.a(cb.a.ch);
        }
        obj = com.google.android.m4b.maps.cg.ao.a(((String) (obj2)), bj1, scheduledexecutorservice, bh1.a, bn1, flag, "", a(googlemapoptions), bh1.d, o1, ((by) (obj3)), cb1, ((bc) (obj)));
        view = ((p) (obj)).d();
        if ((view instanceof SurfaceView) && googlemapoptions.b != null)
        {
            ((SurfaceView)view).setZOrderOnTop(googlemapoptions.b.booleanValue());
        }
        view.setContentDescription(resources.getString(com.google.android.m4b.maps.h.h.maps_GOOGLE_MAP));
        obj2 = ((p) (obj)).e();
        obj3 = bj1.g;
        obj4 = new com.google.android.m4b.maps.cg.ah(((Executor) (obj3)), q1, m1);
        b1 = bj1.f;
        obj5 = ((p) (obj)).f();
        g1 = com.google.android.m4b.maps.cg.g.a(b1, context, resources);
        obj4 = new com.google.android.m4b.maps.cg.ac(((ac.a) (obj5)), g1, bm1, b1, cb1, bn1.e, ((p) (obj)), flag2, ((com.google.android.m4b.maps.cg.ah) (obj4)), resources);
        obj5 = ((p) (obj)).g();
        af1 = new com.google.android.m4b.maps.cg.af();
        w1 = new com.google.android.m4b.maps.cg.w(context, resources, ((com.google.android.m4b.maps.cg.ag) (obj5)), af1, bm1, cb1, b1);
        ((com.google.android.m4b.maps.cg.ag) (obj5)).a(w1);
        m2 = com.google.android.m4b.maps.cg.m.a(context);
        obj6 = ((p) (obj)).h();
        obj6 = new com.google.android.m4b.maps.cg.ae(context, resources, ((bp) (obj2)), bn1.c, ((ae.a) (obj6)), m2, cb1, m1);
        d1 = ((p) (obj)).i();
        aq = ((p) (obj)).j();
        obj1 = new com.google.android.m4b.maps.df.af.a(bv1, ((bu.a) (obj1)), q1) {

            private bu a;
            private bu.a b;
            private q c;

            public final void a()
            {
                a.a(b);
                a.b();
                q q2 = c;
                q2.c = true;
                q2.b();
            }

            
            {
                a = bu1;
                b = a1;
                c = q1;
                super();
            }
        };
        o1;
        JVM INSTR monitorenter ;
        o1.b = ((af) (obj1));
        o1;
        JVM INSTR monitorexit ;
        o1.a();
        obj1 = new FrameLayout(context);
        ((FrameLayout) (obj1)).addView(view);
        ((FrameLayout) (obj1)).addView(bh1.a);
        ((FrameLayout) (obj1)).addView(bn1.a);
        ((FrameLayout) (obj1)).addView(w1.a);
        ((FrameLayout) (obj1)).setTag("GoogleMapView");
        googlemapoptions = new bz(((View) (obj1)), ((p) (obj)), bm1, ((com.google.android.m4b.maps.cg.ac) (obj4)), m2, ((com.google.android.m4b.maps.cg.ae) (obj6)), ((com.google.android.m4b.maps.cg.ag) (obj5)), af1, ((bp) (obj2)), bh1, bn1, w1, o1, b1, cb1, googlemapoptions, bv1, d1, aq, scheduledexecutorservice, g1, ((Executor) (obj3)), m1, resources, context, bj1.j);
        flag2 = b(((bz) (googlemapoptions)).r);
        ((bz) (googlemapoptions)).h.a(googlemapoptions);
        if (((bz) (googlemapoptions)).r.g != null)
        {
            googlemapoptions.h(((bz) (googlemapoptions)).r.g.booleanValue());
        } else
        {
            flag = a;
            if (com.google.android.m4b.maps.cz.a.a(((bz) (googlemapoptions)).y))
            {
                flag = false;
            }
            googlemapoptions.s(flag);
        }
        if (com.google.android.m4b.maps.cz.a.a(((bz) (googlemapoptions)).p.getContext()))
        {
            googlemapoptions.H = false;
        }
        if (!flag2)
        {
            googlemapoptions.p(true);
            flag = true;
            if (com.google.android.m4b.maps.cz.a.a(((bz) (googlemapoptions)).p.getContext()))
            {
                flag = false;
            }
            googlemapoptions.o(flag);
        }
        if (((bz) (googlemapoptions)).r.f == null) goto _L2; else goto _L1
_L1:
        googlemapoptions.f(((bz) (googlemapoptions)).r.f.booleanValue());
_L3:
        if (((bz) (googlemapoptions)).r.d != -1)
        {
            googlemapoptions.a(((bz) (googlemapoptions)).r.d);
        }
        boolean flag1;
        if (!flag2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((bz) (googlemapoptions)).r.i != null)
        {
            googlemapoptions.k(((bz) (googlemapoptions)).r.i.booleanValue());
        } else
        {
            googlemapoptions.v(flag);
        }
        if (((bz) (googlemapoptions)).r.h != null)
        {
            googlemapoptions.j(((bz) (googlemapoptions)).r.h.booleanValue());
        } else
        {
            googlemapoptions.u(flag);
        }
        if (((bz) (googlemapoptions)).r.j != null)
        {
            googlemapoptions.l(((bz) (googlemapoptions)).r.j.booleanValue());
        } else
        {
            googlemapoptions.w(flag);
        }
        if (((bz) (googlemapoptions)).r.k != null)
        {
            googlemapoptions.m(((bz) (googlemapoptions)).r.k.booleanValue());
        } else
        {
            googlemapoptions.x(flag);
        }
        if (((bz) (googlemapoptions)).r.m != null)
        {
            googlemapoptions.g(((bz) (googlemapoptions)).r.m.booleanValue());
        } else
        {
            flag = com.google.android.m4b.maps.cz.a.a(((bz) (googlemapoptions)).y);
            if (com.google.android.m4b.maps.g.g.e(((bz) (googlemapoptions)).y) || flag)
            {
                googlemapoptions.r(false);
            } else
            if (flag2)
            {
                googlemapoptions.r(true);
            } else
            {
                googlemapoptions.r(bg1.a(0x632ea0));
            }
        }
        googlemapoptions.t(a);
        cb1.a(com.google.android.m4b.maps.cg.cb.a.a);
        bj1.h.a();
        bv1.a(a1);
        return googlemapoptions;
        googlemapoptions;
        o1;
        JVM INSTR monitorexit ;
        throw googlemapoptions;
_L2:
        if (!a)
        {
            break MISSING_BLOCK_LABEL_1106;
        }
        if (!bg1.a(0x632ea0))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_1106;
        }
        flag = true;
_L4:
        googlemapoptions.q(flag);
          goto _L3
        flag = false;
          goto _L4
    }

    static cb a(bz bz1)
    {
        return bz1.q;
    }

    private static boolean a(GoogleMapOptions googlemapoptions)
    {
        if (googlemapoptions.c != null)
        {
            return googlemapoptions.c.booleanValue();
        } else
        {
            return false;
        }
    }

    static bp b(bz bz1)
    {
        return bz1.b;
    }

    private static boolean b(GoogleMapOptions googlemapoptions)
    {
        boolean flag = false;
        if (googlemapoptions.l != null)
        {
            flag = googlemapoptions.l.booleanValue();
        }
        return flag;
    }

    static aq c(bz bz1)
    {
        return bz1.v;
    }

    static boolean d(bz bz1)
    {
        return bz1.d;
    }

    static void e(bz bz1)
    {
        bz1.x.h = false;
        bz1.a(0);
        bz1.c.k();
        bz1.A.d();
    }

    static Executor f(bz bz1)
    {
        return bz1.w;
    }

    private boolean o(boolean flag)
    {
        L = c.b(flag);
        if (L)
        {
            if (H)
            {
                l.d.a(0);
            }
            l.d.a(t);
        } else
        {
            l.d.a(null);
            l.d.a(8);
        }
        return L;
    }

    private void p(boolean flag)
    {
        M = c.c(flag);
    }

    private void q(boolean flag)
    {
        int i1 = 0;
        if (b(r))
        {
            flag = false;
        }
        if (F != flag)
        {
            F = flag;
            Object obj = l.b;
            if (flag)
            {
                E = new a(b, ((bi) (obj)));
                E.a(e());
                b.b(E);
                obj.d = D;
            } else
            {
                obj.d = null;
                b.c(E);
                E = null;
            }
            obj = ((bi) (obj)).c;
            if (!flag)
            {
                i1 = 8;
            }
            ((View) (obj)).setVisibility(i1);
        }
    }

    private void r(boolean flag)
    {
        q q1 = l.e;
        if (flag == Boolean.valueOf(q1.b).booleanValue())
        {
            return;
        }
        q1.b = flag;
        if (!flag)
        {
            q1.a.setVisibility(8);
        }
        q1.b();
        if (flag)
        {
            b.b(q1);
            return;
        } else
        {
            b.c(q1);
            return;
        }
    }

    private void s(boolean flag)
    {
        bs bs1;
label0:
        {
            if (G != flag)
            {
                G = flag;
                bs1 = l.f;
                CameraPosition cameraposition = b.c();
                bs1.a = flag;
                if (flag)
                {
                    bs1.setVisibility(4);
                    bs1.a(cameraposition);
                } else
                {
                    bs1.clearAnimation();
                    bs1.setVisibility(8);
                }
                if (!flag)
                {
                    break label0;
                }
                bs1.setOnClickListener(new android.view.View.OnClickListener() {

                    private bz a;

                    public final void onClick(View view)
                    {
                        com.google.android.m4b.maps.cg.bz.a(a).b(cb.a.ba);
                        view = com.google.android.m4b.maps.cg.bz.b(a).c();
                        view = new CameraPosition(((CameraPosition) (view)).b, ((CameraPosition) (view)).c, 0.0F, 0.0F);
                        com.google.android.m4b.maps.cg.bz.b(a).a(view, 400);
                    }

            
            {
                a = bz.this;
                super();
            }
                });
                b.b(bs1);
            }
            return;
        }
        b.c(bs1);
        bs1.setOnClickListener(null);
    }

    private void t(boolean flag)
    {
        if (b(r))
        {
            flag = false;
        }
        com.google.android.m4b.maps.cg.ae ae1 = j;
        if (ae1.f != flag)
        {
            ae1.f = flag;
            ae1.a();
        }
    }

    private void u(boolean flag)
    {
        c.d(flag);
    }

    private void v(boolean flag)
    {
        c.e(flag);
    }

    private void w(boolean flag)
    {
        c.f(flag);
    }

    private void x(boolean flag)
    {
        c.g(flag);
    }

    public final boolean A()
    {
        return c.A();
    }

    public final View B()
    {
        return p;
    }

    public final boolean C()
    {
        return a(r);
    }

    public final void D()
    {
        o.a();
        bc bc1 = c.l();
        if (bc1 != null)
        {
            bc1.a = false;
            c.m();
            j.a(false);
            f.a(false);
        }
        i.d();
    }

    public final com.google.android.m4b.maps.model.internal.g E()
    {
        o.a();
        q.b(cb.a.bF);
        cg cg = t.c();
        if (cg != null)
        {
            return new cf(t, cg, q);
        } else
        {
            return null;
        }
    }

    public final com.google.android.m4b.maps.model.internal.e a(CircleOptions circleoptions)
    {
        o.a();
        q.b(cb.a.P);
        circleoptions = new br(circleoptions, g, q, o);
        circleoptions.a = h.a(circleoptions, true);
        g.a(circleoptions);
        return circleoptions;
    }

    public final com.google.android.m4b.maps.model.internal.f a(GroundOverlayOptions groundoverlayoptions)
    {
        o.a();
        q.b(cb.a.Y);
        groundoverlayoptions = new cc(groundoverlayoptions, g, e, q, o, z);
        groundoverlayoptions.a = h.a(groundoverlayoptions);
        g.a(groundoverlayoptions);
        return groundoverlayoptions;
    }

    public final com.google.android.m4b.maps.model.internal.j a(MapsEngineLayerOptions mapsenginelayeroptions)
    {
        o.a();
        q.b(com.google.android.m4b.maps.cg.cb.a.ah);
        mapsenginelayeroptions = com.google.android.m4b.maps.cg.y.a(mapsenginelayeroptions, this, u, x, g, q, o);
        mapsenginelayeroptions.b = h.a(mapsenginelayeroptions);
        g.a(mapsenginelayeroptions);
        return mapsenginelayeroptions;
    }

    public final com.google.android.m4b.maps.model.internal.k a(MarkerOptions markeroptions)
    {
        o.a();
        q.b(com.google.android.m4b.maps.cg.cb.a.c);
        com.google.android.m4b.maps.cg.ac ac1 = f;
        ac1.g.a();
        aa.a a1;
        boolean flag;
        if (markeroptions.b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.m4b.maps.y.j.a(flag, "no position in marker options");
        markeroptions = new com.google.android.m4b.maps.cg.aa(String.format("m%d", new Object[] {
            Integer.valueOf(ac1.b)
        }), markeroptions, ac1, ac1.d, ac1.g, ac1.e, ac1.n);
        ac1.b = ac1.b + 1;
        a1 = ac1.f.a(markeroptions);
        markeroptions.c = a1;
        a1.a();
        ac1.c.put(markeroptions, a1);
        return markeroptions;
    }

    public final com.google.android.m4b.maps.model.internal.l a(PolygonOptions polygonoptions)
    {
        o.a();
        q.b(cb.a.F);
        polygonoptions = new com.google.android.m4b.maps.cg.aj(polygonoptions, g, q, o);
        polygonoptions.a = h.a(polygonoptions, true);
        g.a(polygonoptions);
        return polygonoptions;
    }

    public final com.google.android.m4b.maps.model.internal.m a(PolylineOptions polylineoptions)
    {
        o.a();
        q.b(cb.a.x);
        polylineoptions = new com.google.android.m4b.maps.cg.ak(polylineoptions, g, q, o);
        polylineoptions.a = h.a(polylineoptions, false);
        g.a(polylineoptions);
        return polylineoptions;
    }

    public final com.google.android.m4b.maps.model.internal.n a(TileOverlayOptions tileoverlayoptions)
    {
        o.a();
        q.b(com.google.android.m4b.maps.cg.cb.a.ah);
        tileoverlayoptions = new bd(tileoverlayoptions, g, q, o);
        tileoverlayoptions.a = h.a(tileoverlayoptions);
        g.a(tileoverlayoptions);
        return tileoverlayoptions;
    }

    public final void a()
    {
        d = true;
        q.a();
        c.a();
    }

    public final void a(int i1)
    {
        int j1;
        int k1;
        boolean flag;
        k1 = 1;
        flag = false;
        o.a();
        q.b(cb.a.aH);
        switch (i1)
        {
        case 3: // '\003'
        default:
            j1 = 0;
            break;

        case 2: // '\002'
        case 4: // '\004'
            break MISSING_BLOCK_LABEL_157;
        }
_L1:
        c.a(i1);
        Object obj = k;
        TextView textview;
        if (i1 == 0)
        {
            k1 = 0;
        }
        textview = ((bh) (obj)).d;
        if (((bh) (obj)).e && k1 != 0)
        {
            k1 = ((flag) ? 1 : 0);
        } else
        {
            k1 = 8;
        }
        textview.setVisibility(k1);
        obj = k;
        if (j1 != 0)
        {
            k1 = com.google.android.m4b.maps.h.e.maps_watermark_light;
        } else
        {
            k1 = com.google.android.m4b.maps.h.e.maps_watermark_dark;
        }
        ((bh) (obj)).c.setImageDrawable(((bh) (obj)).b.getDrawable(k1));
        obj = ((bh) (obj)).d;
        if (j1 != 0)
        {
            j1 = -1;
        } else
        {
            j1 = 0xff000000;
        }
        ((TextView) (obj)).setTextColor(j1);
        B = i1;
        return;
        j1 = 1;
          goto _L1
    }

    public final void a(int i1, int j1, int k1, int l1)
    {
        int i2 = i1;
        if (i1 < 0)
        {
            i2 = 0;
        }
        i1 = k1;
        if (k1 < 0)
        {
            i1 = 0;
        }
        k1 = j1;
        if (j1 < 0)
        {
            k1 = 0;
        }
        j1 = l1;
        if (l1 < 0)
        {
            j1 = 0;
        }
        o.a();
        q.b(cb.a.ca);
        b.a(i2, k1, i1, j1);
        l.a.setPadding(i2, k1, i1, j1);
        k.a.setPadding(i2, k1, i1, j1);
    }

    public final void a(Bundle bundle)
    {
        d = false;
        bu.a a1 = s.a("on_create");
        CameraPosition cameraposition = (CameraPosition)com.google.android.m4b.maps.df.n.a(bundle, "camera");
        bundle = cameraposition;
        if (cameraposition == null)
        {
            if (r.e != null)
            {
                bundle = r.e;
            } else
            {
                bundle = com.google.android.m4b.maps.cg.bp.a;
            }
        }
        b.a(bundle, 0);
        s.a(a1);
    }

    public final void a(com.google.android.m4b.maps.da.b b1)
    {
        o.a();
        q.b(cb.a.at);
        b1 = (bp.a)com.google.android.m4b.maps.da.d.a(b1);
        b.a(b1, 0, null, q);
    }

    public final void a(com.google.android.m4b.maps.da.b b1, int i1, r r1)
    {
        o.a();
        q.b(cb.a.as);
        b1 = (bp.a)com.google.android.m4b.maps.da.d.a(b1);
        boolean flag;
        if (i1 > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.m4b.maps.y.j.a(flag, "durationMs must be positive");
        b.a(b1, i1, r1, q);
    }

    public final void a(com.google.android.m4b.maps.da.b b1, r r1)
    {
        o.a();
        q.b(cb.a.ar);
        b1 = (bp.a)com.google.android.m4b.maps.da.d.a(b1);
        b.a(b1, -1, r1, q);
    }

    public final void a(aa aa1)
    {
        o.a();
        q.b(cb.a.aT);
        b.a(aa1);
    }

    public final void a(com.google.android.m4b.maps.df.ab ab1)
    {
        o.a();
        q.b(cb.a.aU);
        t.a(ab1);
    }

    public final void a(ac ac1)
    {
        o.a();
        q.b(cb.a.aS);
        com.google.android.m4b.maps.cg.ac ac2 = f;
        ac2.g.a();
        ac2.j = ac1;
    }

    public final void a(ae ae1)
    {
        o.a();
        q.b(cb.a.aV);
        c.a(ae1);
    }

    public final void a(af af1)
    {
        o.a();
        q.b(cb.a.aZ);
        synchronized (n)
        {
            o1.a = af1;
        }
        o1.a();
        return;
        af1;
        o1;
        JVM INSTR monitorexit ;
        throw af1;
    }

    public final void a(ag ag1)
    {
        o.a();
        q.b(cb.a.aW);
        c.a(ag1);
    }

    public final void a(ah ah1)
    {
        o.a();
        q.b(com.google.android.m4b.maps.cg.cb.a.b);
        ah1 = new Runnable(ah1) {

            private ah a;
            private bz b;

            public final void run()
            {
                try
                {
                    if (!com.google.android.m4b.maps.cg.bz.d(b))
                    {
                        a.a(b);
                    }
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    throw new RuntimeRemoteException(remoteexception);
                }
            }

            
            {
                b = bz.this;
                a = ah1;
                super();
            }
        };
        if (com.google.android.m4b.maps.g.g.e(y))
        {
            (new ad(y, "com.google.android.gms")).a(new com.google.android.m4b.maps.ay.ad.a(ah1) {

                final bz a;
                private Runnable b;

                public final void a(boolean flag)
                {
                    if (flag)
                    {
                        ab.a("The Maps API is blocked on this device.");
                        com.google.android.m4b.maps.cg.bz.f(a).execute(new Runnable(this) {

                            private _cls7 a;

                            public final void run()
                            {
                                com.google.android.m4b.maps.cg.bz.e(a.a);
                            }

            
            {
                a = _pcls7;
                super();
            }
                        });
                        return;
                    } else
                    {
                        com.google.android.m4b.maps.cg.bz.f(a).execute(b);
                        return;
                    }
                }

            
            {
                a = bz.this;
                b = runnable;
                super();
            }
            });
            return;
        } else
        {
            w.execute(ah1);
            return;
        }
    }

    public final void a(ai ai)
    {
        o.a();
        q.b(cb.a.ap);
        h.a(ai);
    }

    public final void a(aj aj1)
    {
        o.a();
        q.b(cb.a.aX);
        com.google.android.m4b.maps.cg.ac ac1 = f;
        ac1.g.a();
        ac1.h = aj1;
    }

    public final void a(ak ak1)
    {
        o.a();
        q.b(cb.a.aY);
        com.google.android.m4b.maps.cg.ac ac1 = f;
        ac1.g.a();
        ac1.i = ak1;
    }

    public final void a(al al1)
    {
        o.a();
        q.b(cb.a.aR);
        j.h = al1;
    }

    public final void a(am am1)
    {
        o.a();
        q.b(cb.a.aQ);
        j.g = am1;
    }

    public final void a(an an)
    {
        o.a();
        c.a(an);
    }

    public final void a(h h1, com.google.android.m4b.maps.da.b b1)
    {
        com.google.android.m4b.maps.y.j.a(h1, "Callback method is null.");
        Bitmap bitmap;
        cb cb1;
        if (b1 != null)
        {
            b1 = ((com.google.android.m4b.maps.da.b) (com.google.android.m4b.maps.da.d.a(b1)));
        } else
        {
            b1 = null;
        }
        bitmap = (Bitmap)b1;
        cb1 = q;
        if (bitmap == null)
        {
            b1 = cb.a.bI;
        } else
        {
            b1 = cb.a.bJ;
        }
        cb1.b(b1);
        (new Thread(new Runnable(bitmap, h1) {

            private Bitmap a;
            private h b;
            private bz c;

            public final void run()
            {
                com.google.android.m4b.maps.cg.bz.c(c).b(a, b);
            }

            
            {
                c = bz.this;
                a = bitmap;
                b = h1;
                super();
            }
        })).start();
    }

    public final void a(u u1)
    {
        o.a();
        q.b(com.google.android.m4b.maps.cg.cb.a.r);
        com.google.android.m4b.maps.cg.g g1 = J;
        g1.a.a();
        g1.b = u1;
    }

    public final void a(w w1)
    {
        com.google.android.m4b.maps.cg.ae ae1;
        if (w1 != null)
        {
            q.b(cb.a.aP);
        } else
        {
            q.b(cb.a.aO);
        }
        o.a();
        ae1 = j;
        if (ae1.e)
        {
            try
            {
                ae1.d.e();
            }
            // Misplaced declaration of an exception variable
            catch (w w1)
            {
                throw new RuntimeRemoteException(w1);
            }
        }
        if (w1 == null)
        {
            w1 = ae1.a;
        }
        ae1.d = w1;
        if (!ae1.e)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        ae1.d.a(ae1);
        return;
        w1;
        throw new RuntimeRemoteException(w1);
    }

    public final void a(z z1)
    {
        o.a();
        q.b(cb.a.cb);
        I = z1;
    }

    public final void a(String s1)
    {
        if (I != null)
        {
            I.a(s1);
        }
    }

    public final void a(boolean flag)
    {
        o.a();
        cb cb1 = q;
        cb.a a1;
        if (flag)
        {
            a1 = cb.a.aJ;
        } else
        {
            a1 = cb.a.aI;
        }
        cb1.b(a1);
        K = c.a(flag);
    }

    public final void b()
    {
        bu.a a1 = s.a("on_resume");
        c.v();
        i.a();
        s.a(a1);
    }

    public final void b(Bundle bundle)
    {
        com.google.android.m4b.maps.df.n.a(bundle, "MapOptions", r);
        com.google.android.m4b.maps.df.n.a(bundle, "camera", b.c());
    }

    public final void b(com.google.android.m4b.maps.da.b b1)
    {
        o.a();
        q.b(cb.a.aq);
        b1 = (bp.a)com.google.android.m4b.maps.da.d.a(b1);
        b.a(b1, -1, null, q);
    }

    public final void b(String s1)
    {
        o.a();
        c.d().setContentDescription(s1);
    }

    public final boolean b(boolean flag)
    {
        o.a();
        cb cb1 = q;
        cb.a a1;
        if (flag)
        {
            a1 = cb.a.bz;
        } else
        {
            a1 = cb.a.bA;
        }
        cb1.b(a1);
        return o(flag);
    }

    public final void c()
    {
        i.b();
        c.u();
    }

    public final void c(Bundle bundle)
    {
        o.a();
        i.c();
        bc bc1 = c.l();
        if (bc1 != null)
        {
            if (bundle != null)
            {
                bc.a a1 = bc1.c;
                boolean flag = bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false);
                bundle = a1.a.edit();
                bundle.putBoolean("IsLowBitDisplay", flag);
                bundle.commit();
            }
            bc1.a = true;
            c.m();
            j.a(true);
            f.a(true);
        }
    }

    public final void c(boolean flag)
    {
        o.a();
        cb cb1 = q;
        cb.a a1;
        if (flag)
        {
            a1 = cb.a.bB;
        } else
        {
            a1 = cb.a.bC;
        }
        cb1.b(a1);
        if (b(r))
        {
            flag = false;
        }
        if (com.google.android.m4b.maps.cz.a.a(p.getContext()))
        {
            flag = false;
        }
        if (L)
        {
            if (flag)
            {
                l.d.a(0);
            } else
            {
                l.d.a(8);
            }
        }
        H = flag;
    }

    public final void d()
    {
        c.w();
    }

    public final void d(boolean flag)
    {
        o.a();
        cb cb1 = q;
        cb.a a1;
        if (flag)
        {
            a1 = cb.a.aN;
        } else
        {
            a1 = cb.a.aM;
        }
        cb1.b(a1);
        p(flag);
    }

    public final CameraPosition e()
    {
        o.a();
        return b.c();
    }

    public final void e(boolean flag)
    {
        o.a();
        if (flag)
        {
            q.b(cb.a.aL);
            com.google.android.m4b.maps.cg.ae ae1 = j;
            if (!ae1.e)
            {
                ae1.e = true;
                ae1.b.a();
                try
                {
                    ae1.d.a(ae1);
                }
                catch (RemoteException remoteexception)
                {
                    throw new RuntimeRemoteException(remoteexception);
                }
                ae1.a();
                if (ae1.c != null)
                {
                    ae1.a(ae1.c);
                }
            }
        } else
        {
            q.b(cb.a.aK);
            com.google.android.m4b.maps.cg.ae ae2 = j;
            if (ae2.e)
            {
                ae2.e = false;
                ae2.a();
                try
                {
                    ae2.d.e();
                }
                catch (RemoteException remoteexception1)
                {
                    throw new RuntimeRemoteException(remoteexception1);
                }
                ae2.b.b();
                return;
            }
        }
    }

    public final float f()
    {
        o.a();
        return b.a(b.c().b);
    }

    public final void f(boolean flag)
    {
        o.a();
        cb cb1 = q;
        cb.a a1;
        if (flag)
        {
            a1 = cb.a.bg;
        } else
        {
            a1 = cb.a.bd;
        }
        cb1.b(a1);
        q(flag);
    }

    public final float g()
    {
        o.a();
        return b.d();
    }

    public final void g(boolean flag)
    {
        o.a();
        cb cb1 = q;
        cb.a a1;
        boolean flag1;
        if (flag)
        {
            a1 = cb.a.bu;
        } else
        {
            a1 = cb.a.bv;
        }
        cb1.b(a1);
        flag1 = com.google.android.m4b.maps.cz.a.a(y);
        if (com.google.android.m4b.maps.g.g.e(y) || flag1)
        {
            if (flag)
            {
                ab.a(4, "The toolbar cannot be enabled on this device.");
            }
            return;
        } else
        {
            r(flag);
            return;
        }
    }

    public final void h()
    {
        o.a();
        q.b(cb.a.au);
        b.a();
    }

    public final void h(boolean flag)
    {
        o.a();
        cb cb1 = q;
        cb.a a1;
        if (flag)
        {
            a1 = cb.a.be;
        } else
        {
            a1 = cb.a.bb;
        }
        cb1.b(a1);
        s(flag);
    }

    public final String i()
    {
        if (I != null)
        {
            return I.i();
        } else
        {
            return null;
        }
    }

    public final void i(boolean flag)
    {
        o.a();
        cb cb1 = q;
        cb.a a1;
        if (flag)
        {
            a1 = cb.a.bf;
        } else
        {
            a1 = cb.a.bc;
        }
        cb1.b(a1);
        t(flag);
    }

    public final void j(boolean flag)
    {
        o.a();
        cb cb1 = q;
        cb.a a1;
        if (flag)
        {
            a1 = cb.a.bk;
        } else
        {
            a1 = cb.a.bl;
        }
        cb1.b(a1);
        u(flag);
    }

    public final boolean j()
    {
        o.a();
        return K;
    }

    public final void k(boolean flag)
    {
        o.a();
        cb cb1 = q;
        cb.a a1;
        if (flag)
        {
            a1 = cb.a.bm;
        } else
        {
            a1 = cb.a.bn;
        }
        cb1.b(a1);
        v(flag);
    }

    public final boolean k()
    {
        o.a();
        return L;
    }

    public final void l(boolean flag)
    {
        o.a();
        cb cb1 = q;
        cb.a a1;
        if (flag)
        {
            a1 = cb.a.bq;
        } else
        {
            a1 = cb.a.br;
        }
        cb1.b(a1);
        w(flag);
    }

    public final boolean l()
    {
        o.a();
        return H;
    }

    public final void m(boolean flag)
    {
        o.a();
        cb cb1 = q;
        cb.a a1;
        if (flag)
        {
            a1 = cb.a.bo;
        } else
        {
            a1 = cb.a.bp;
        }
        cb1.b(a1);
        x(flag);
    }

    public final boolean m()
    {
        o.a();
        return M;
    }

    public final void n(boolean flag)
    {
        o.a();
        cb cb1 = q;
        cb.a a1;
        if (flag)
        {
            a1 = cb.a.bs;
        } else
        {
            a1 = cb.a.bt;
        }
        cb1.b(a1);
        u(flag);
        v(flag);
        w(flag);
        x(flag);
    }

    public final boolean n()
    {
        o.a();
        return j.e;
    }

    public final Location o()
    {
        o.a();
        com.google.android.m4b.maps.cg.ae ae1 = j;
        com.google.android.m4b.maps.y.j.b(ae1.e, "MyLocation layer not enabled");
        return ae1.c;
    }

    public final int p()
    {
        o.a();
        return B;
    }

    public final void q()
    {
        o.a();
        q.b(cb.a.aG);
        Object obj = f;
        ((com.google.android.m4b.maps.cg.ac) (obj)).g.a();
        for (Iterator iterator = ((com.google.android.m4b.maps.cg.ac) (obj)).c.keySet().iterator(); iterator.hasNext(); ((com.google.android.m4b.maps.cg.aa)iterator.next()).c()) { }
        ((com.google.android.m4b.maps.cg.ac) (obj)).c.clear();
        obj = g;
        for (Iterator iterator1 = ((com.google.android.m4b.maps.cg.af) (obj)).a.iterator(); iterator1.hasNext(); ((af.a)iterator1.next()).b()) { }
        ((com.google.android.m4b.maps.cg.af) (obj)).a.clear();
    }

    public final com.google.android.m4b.maps.df.g r()
    {
        o.a();
        return new com.google.android.m4b.maps.cg.al(q, b.e());
    }

    public final l s()
    {
        o.a();
        if (C == null)
        {
            C = new com.google.android.m4b.maps.df.l.a() {

                private bz a;

                public final boolean A()
                {
                    return a.A();
                }

                public final void c(boolean flag)
                {
                    a.c(flag);
                }

                public final void f(boolean flag)
                {
                    a.f(flag);
                }

                public final void g(boolean flag)
                {
                    a.g(flag);
                }

                public final void h(boolean flag)
                {
                    a.h(flag);
                }

                public final void i(boolean flag)
                {
                    a.i(flag);
                }

                public final void j(boolean flag)
                {
                    a.j(flag);
                }

                public final void k(boolean flag)
                {
                    a.k(flag);
                }

                public final void l(boolean flag)
                {
                    a.l(flag);
                }

                public final boolean l()
                {
                    return a.l();
                }

                public final void m(boolean flag)
                {
                    a.m(flag);
                }

                public final void n(boolean flag)
                {
                    a.n(flag);
                }

                public final boolean t()
                {
                    return a.t();
                }

                public final boolean u()
                {
                    return a.u();
                }

                public final boolean v()
                {
                    return a.v();
                }

                public final boolean w()
                {
                    return a.w();
                }

                public final boolean x()
                {
                    return a.x();
                }

                public final boolean y()
                {
                    return a.y();
                }

                public final boolean z()
                {
                    return a.z();
                }

            
            {
                a = bz.this;
                super();
            }
            };
        }
        return C;
    }

    public final boolean t()
    {
        o.a();
        return Boolean.valueOf(l.e.b).booleanValue();
    }

    public final boolean u()
    {
        return F;
    }

    public final boolean v()
    {
        return G;
    }

    public final boolean w()
    {
        return j.f;
    }

    public final boolean x()
    {
        return c.x();
    }

    public final boolean y()
    {
        return c.y();
    }

    public final boolean z()
    {
        return c.z();
    }

    static 
    {
        boolean flag;
        if (!com.google.android.m4b.maps.cz.a.b(f.a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
