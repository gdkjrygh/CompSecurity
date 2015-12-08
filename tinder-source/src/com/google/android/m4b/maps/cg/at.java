// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.m4b.maps.StreetViewPanoramaOptions;
import com.google.android.m4b.maps.ai.c;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.ad;
import com.google.android.m4b.maps.ay.b;
import com.google.android.m4b.maps.ay.f;
import com.google.android.m4b.maps.ay.m;
import com.google.android.m4b.maps.da.d;
import com.google.android.m4b.maps.df.e;
import com.google.android.m4b.maps.df.n;
import com.google.android.m4b.maps.g.g;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.model.StreetViewPanoramaCamera;
import com.google.android.m4b.maps.model.StreetViewPanoramaLocation;
import com.google.android.m4b.maps.model.StreetViewPanoramaOrientation;
import com.google.android.m4b.maps.y.j;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            av, au, h, bj, 
//            bt, ao, ay, am, 
//            ax, bw, bf, cb, 
//            ab, ap

public final class at extends com.google.android.m4b.maps.df.i.a
    implements android.view.View.OnClickListener
{
    public static interface a
    {

        public abstract void a(String s, StreetViewPanoramaLocation streetviewpanoramalocation);
    }


    private static final String d = com/google/android/m4b/maps/cg/at.getSimpleName();
    private static StreetViewPanoramaCamera o = new StreetViewPanoramaCamera(0.0F, 0.0F, 0.0F);
    final StreetViewPanoramaOptions a;
    final FrameLayout b;
    final m c;
    private final av e;
    private final b f;
    private final au g;
    private final Context h;
    private final Resources i;
    private final cb j;
    private a k;
    private final ax l;
    private final Executor m;
    private final c n;

    private at(Context context, Resources resources, av av1, StreetViewPanoramaOptions streetviewpanoramaoptions, b b1, au au1, FrameLayout framelayout, 
            cb cb1, ax ax1, m m1, Executor executor, c c1)
    {
        h = context;
        i = resources;
        e = av1;
        a = streetviewpanoramaoptions;
        f = b1;
        g = au1;
        b = framelayout;
        j = cb1;
        l = ax1;
        c = m1;
        m = executor;
        n = c1;
        k = new a() {

            private at a;

            public final void a(String s, StreetViewPanoramaLocation streetviewpanoramalocation)
            {
                boolean flag = false;
                byte byte0;
                if (streetviewpanoramalocation != null)
                {
                    byte0 = 1;
                } else
                {
                    byte0 = 0;
                }
                if (com.google.android.m4b.maps.cz.a.a(at.a(a)))
                {
                    byte0 = 0;
                }
                if (byte0 != 0)
                {
                    Object obj = com.google.android.m4b.maps.cg.at.b(a);
                    ((au) (obj)).c.setText(s);
                    obj = ((au) (obj)).c;
                    byte0 = flag;
                    if (s.isEmpty())
                    {
                        byte0 = 8;
                    }
                    ((TextView) (obj)).setVisibility(byte0);
                    com.google.android.m4b.maps.cg.at.b(a).a(true);
                } else
                {
                    com.google.android.m4b.maps.cg.at.b(a).a(false);
                }
                if (streetviewpanoramalocation != null && ab.a(at.a(a)))
                {
                    s = a;
                    streetviewpanoramalocation = new ap(streetviewpanoramalocation.c, 21F);
                    streetviewpanoramalocation.a = s. new ap.a() {

                        private at a;

                        public final void a(ap ap1)
                        {
                            if (ap1.i() > 0)
                            {
                                Object obj = ap1.h();
                                ap1 = String.valueOf(com.google.android.m4b.maps.cg.at.c(a).getString(com.google.android.m4b.maps.h.h.maps_YOUR_LOCATION));
                                obj = ((ap.b) (obj)).a();
                                ap1 = (new StringBuilder(String.valueOf(ap1).length() + 2 + String.valueOf(obj).length())).append(ap1).append(": ").append(((String) (obj))).toString();
                                ab.a(com.google.android.m4b.maps.cg.at.d(a).k(), ap1);
                            }
                        }

            
            {
                a = at.this;
                super();
            }
                    };
                    ((at) (s)).c.c(streetviewpanoramalocation);
                }
            }

            
            {
                a = at.this;
                super();
            }
        };
        e.a(k);
        g.b.setOnClickListener(this);
        if (a.f != null)
        {
            c(a.f.booleanValue());
        }
        if (a.g != null)
        {
            a(a.g.booleanValue());
        }
        if (a.h != null)
        {
            b(a.h.booleanValue());
        }
        if (a.i != null)
        {
            d(a.i.booleanValue());
        }
    }

    static Context a(at at1)
    {
        return at1.h;
    }

    public static at a(StreetViewPanoramaOptions streetviewpanoramaoptions, bj bj1)
    {
        com.google.android.m4b.maps.cg.h.a(bj1);
        Context context = bj1.a;
        FrameLayout framelayout = new FrameLayout(context);
        bt bt1 = bj1.d;
        m m1 = bt1.a();
        av av1 = ao.a("G", bj1);
        au au1 = new au(context, bj1.b);
        com.google.android.m4b.maps.y.j.a(streetviewpanoramaoptions);
        Object obj1 = streetviewpanoramaoptions.b;
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = o;
        }
        av1.a(streetviewpanoramaoptions.c, streetviewpanoramaoptions.d, streetviewpanoramaoptions.e, ay.a(((StreetViewPanoramaCamera) (obj))));
        bj1.h.a();
        obj = new ax(context);
        framelayout.addView(av1.k());
        framelayout.addView(au1.a);
        obj1 = bj1.e;
        obj1 = bf.a(context, new f(new bw(context, context.getPackageName()), m1), ((bg) (obj1)), "G");
        ((cb) (obj1)).a(cb.a.bK);
        return new at(context, bj1.b, av1, streetviewpanoramaoptions, bj1.f, au1, framelayout, ((cb) (obj1)), ((ax) (obj)), bt1.a(), bj1.g, bj1.j);
    }

    static au b(at at1)
    {
        return at1.g;
    }

    static Resources c(at at1)
    {
        return at1.i;
    }

    static av d(at at1)
    {
        return at1.e;
    }

    static void e(at at1)
    {
        at1.c.h = false;
        at1.n.d();
    }

    static Executor f(at at1)
    {
        return at1.m;
    }

    public final com.google.android.m4b.maps.da.b a(StreetViewPanoramaOrientation streetviewpanoramaorientation)
    {
        f.a();
        j.b(cb.a.bY);
        return com.google.android.m4b.maps.da.d.a(e.a(streetviewpanoramaorientation));
    }

    public final StreetViewPanoramaOrientation a(com.google.android.m4b.maps.da.b b1)
    {
        f.a();
        j.b(cb.a.bX);
        b1 = (Point)com.google.android.m4b.maps.da.d.a(b1);
        if (b1 == null)
        {
            return null;
        } else
        {
            return e.a(((Point) (b1)).x, ((Point) (b1)).y);
        }
    }

    public final void a()
    {
        e.b();
    }

    public final void a(Bundle bundle)
    {
        Object obj = (StreetViewPanoramaCamera)com.google.android.m4b.maps.df.n.a(bundle, "camera");
        StreetViewPanoramaCamera streetviewpanoramacamera = ((StreetViewPanoramaCamera) (obj));
        if (obj == null)
        {
            if (a.b != null)
            {
                streetviewpanoramacamera = a.b;
            } else
            {
                streetviewpanoramacamera = o;
            }
        }
        obj = e;
        if (bundle != null && bundle.containsKey("position"))
        {
            bundle = bundle.getString("position");
        } else
        {
            bundle = "";
        }
        ((av) (obj)).a(streetviewpanoramacamera, bundle);
    }

    public final void a(com.google.android.m4b.maps.df.b b1)
    {
        f.a();
        j.b(cb.a.bU);
        e.a(b1);
    }

    public final void a(com.google.android.m4b.maps.df.c c1)
    {
        f.a();
        j.b(cb.a.bT);
        e.a(c1);
    }

    public final void a(com.google.android.m4b.maps.df.d d1)
    {
        f.a();
        j.b(cb.a.bV);
        e.a(d1);
    }

    public final void a(e e1)
    {
        f.a();
        j.b(cb.a.bW);
        e.a(e1);
    }

    public final void a(com.google.android.m4b.maps.df.f f1)
    {
        f.a();
        j.b(cb.a.bZ);
        f1 = new Runnable(f1) {

            private com.google.android.m4b.maps.df.f a;
            private at b;

            public final void run()
            {
                try
                {
                    a.a(b);
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    throw new RuntimeRemoteException(remoteexception);
                }
            }

            
            {
                b = at.this;
                a = f1;
                super();
            }
        };
        if (com.google.android.m4b.maps.g.g.e(h))
        {
            (new ad(h, "com.google.android.gms")).a(new com.google.android.m4b.maps.ay.ad.a(f1) {

                final at a;
                private Runnable b;

                public final void a(boolean flag)
                {
                    if (flag)
                    {
                        ab.a("The Maps API is blocked on this device.");
                        com.google.android.m4b.maps.cg.at.f(a).execute(new Runnable(this) {

                            private _cls4 a;

                            public final void run()
                            {
                                com.google.android.m4b.maps.cg.at.e(a.a);
                            }

            
            {
                a = _pcls4;
                super();
            }
                        });
                        return;
                    } else
                    {
                        com.google.android.m4b.maps.cg.at.f(a).execute(b);
                        return;
                    }
                }

            
            {
                a = at.this;
                b = runnable;
                super();
            }
            });
            return;
        } else
        {
            m.execute(f1);
            return;
        }
    }

    public final void a(LatLng latlng)
    {
        f.a();
        j.b(cb.a.bR);
        e.a(latlng);
    }

    public final void a(LatLng latlng, int i1)
    {
        f.a();
        j.b(cb.a.bS);
        e.a(latlng, i1);
    }

    public final void a(StreetViewPanoramaCamera streetviewpanoramacamera, long l1)
    {
        f.a();
        j.b(cb.a.bP);
        e.a(streetviewpanoramacamera, l1);
    }

    public final void a(String s)
    {
        f.a();
        j.b(cb.a.bQ);
        e.a(s);
    }

    public final void a(boolean flag)
    {
        f.a();
        j.b(cb.a.bL);
        e.a(flag);
    }

    public final void b()
    {
        e.a();
    }

    public final void b(Bundle bundle)
    {
        com.google.android.m4b.maps.df.n.a(bundle, "StreetViewPanoramaOptions", a);
        com.google.android.m4b.maps.df.n.a(bundle, "camera", h());
        if (e.d() != null)
        {
            bundle.putString("position", e.d().d);
        }
    }

    public final void b(boolean flag)
    {
        f.a();
        j.b(cb.a.bM);
        e.b(flag);
    }

    public final void c()
    {
        j.a();
    }

    public final void c(boolean flag)
    {
        f.a();
        j.b(cb.a.bN);
        e.c(flag);
    }

    public final void d(boolean flag)
    {
        f.a();
        j.b(cb.a.bO);
        e.d(flag);
    }

    public final boolean d()
    {
        f.a();
        return e.g();
    }

    public final boolean e()
    {
        f.a();
        return e.h();
    }

    public final boolean f()
    {
        f.a();
        return e.i();
    }

    public final boolean g()
    {
        f.a();
        return e.j();
    }

    public final StreetViewPanoramaCamera h()
    {
        f.a();
        return e.e();
    }

    public final StreetViewPanoramaLocation i()
    {
        f.a();
        return e.d();
    }

    public final void onClick(View view)
    {
        Object obj;
        if (view != g.b)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        view = l;
        Object obj1 = e.d();
        obj = e.e();
        float f1 = ((StreetViewPanoramaCamera) (obj)).c;
        obj = String.format("&cbp=1,%f,,%f,%f", new Object[] {
            Float.valueOf(((StreetViewPanoramaCamera) (obj)).d), Float.valueOf(((StreetViewPanoramaCamera) (obj)).b), Float.valueOf(-1F * f1)
        });
        obj1 = ((StreetViewPanoramaLocation) (obj1)).d;
        String s = String.valueOf("https://cbk0.google.com/cbk?cb_client=an_mobile&output=report&panoid=");
        obj = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(obj1).length() + String.valueOf(obj).length())).append(s).append(((String) (obj1))).append("&").append(((String) (obj))).toString()));
        ((Intent) (obj)).setFlags(0x10000000);
        ((ax) (view)).b.startActivity(((Intent) (obj)));
_L1:
        return;
        view;
        if (ab.a(ax.a, 6))
        {
            Log.e(ax.a, "Could not start activty.", view);
            return;
        }
          goto _L1
    }

}
