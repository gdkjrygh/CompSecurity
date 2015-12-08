// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.maps;

import android.graphics.Bitmap;
import android.location.Location;
import android.view.View;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.fitbit.maps:
//            CameraPosition, f, CircleOptions, i, 
//            GroundOverlayOptions, o, MarkerOptions, p, 
//            PolygonOptions, q, PolylineOptions, t, 
//            TileOverlayOptions, d, j, v, 
//            s, m, LatLng

public class com.fitbit.maps.h
{
    public static interface a
    {

        public abstract void a();

        public abstract void b();
    }

    public static interface b
    {

        public abstract View a(o o1);

        public abstract View b(o o1);
    }

    public static interface c
    {

        public abstract void a(com.fitbit.maps.CameraPosition cameraposition);
    }

    public static interface d
    {

        public abstract void a();

        public abstract void a(com.fitbit.maps.j j1);
    }

    public static interface e
    {

        public abstract void a(o o1);
    }

    public static interface f
    {

        public abstract void a(com.fitbit.maps.LatLng latlng);
    }

    public static interface g
    {

        public abstract void a();
    }

    public static interface h
    {

        public abstract void a(com.fitbit.maps.LatLng latlng);
    }

    public static interface i
    {

        public abstract boolean a(o o1);
    }

    public static interface j
    {

        public abstract void a(o o1);

        public abstract void b(o o1);

        public abstract void c(o o1);
    }

    public static interface k
    {

        public abstract boolean a();
    }

    public static interface l
    {

        public abstract void a(Location location);
    }

    public static interface m
    {

        public abstract void a(Bitmap bitmap);
    }


    public static int a = 1;
    public static int b = 2;
    private com.google.android.gms.maps.c c;

    public com.fitbit.maps.h(com.google.android.gms.maps.c c1)
    {
        c = c1;
    }

    public final com.fitbit.maps.CameraPosition a()
    {
        return new com.fitbit.maps.CameraPosition(c.b());
    }

    public final com.fitbit.maps.f a(CircleOptions circleoptions)
    {
        return new com.fitbit.maps.f(c.a(circleoptions.a()));
    }

    public final com.fitbit.maps.i a(GroundOverlayOptions groundoverlayoptions)
    {
        return new com.fitbit.maps.i(c.a(groundoverlayoptions.a()));
    }

    public final o a(MarkerOptions markeroptions)
    {
        return new o(c.a(markeroptions.a()));
    }

    public final p a(PolygonOptions polygonoptions)
    {
        return new p(c.a(polygonoptions.a()));
    }

    public final q a(PolylineOptions polylineoptions)
    {
        return new q(c.a(polylineoptions.a()));
    }

    public final t a(TileOverlayOptions tileoverlayoptions)
    {
        return new t(c.a(tileoverlayoptions.a()));
    }

    public final void a(int i1)
    {
        c.a(i1);
    }

    public final void a(int i1, int j1, int k1, int l1)
    {
        c.a(i1, j1, k1, l1);
    }

    public final void a(com.fitbit.maps.d d1)
    {
        c.a(d1.a());
    }

    public final void a(com.fitbit.maps.d d1, int i1, a a1)
    {
        c.a(d1.a(), i1, new com.google.android.gms.maps.c.a(a1) {

            final a a;
            final com.fitbit.maps.h b;

            public void a()
            {
                a.a();
            }

            public void b()
            {
                a.b();
            }

            
            {
                b = com.fitbit.maps.h.this;
                a = a1;
                super();
            }
        });
    }

    public final void a(com.fitbit.maps.d d1, a a1)
    {
        c.a(d1.a(), new com.google.android.gms.maps.c.a(a1) {

            final a a;
            final com.fitbit.maps.h b;

            public void a()
            {
                a.a();
            }

            public void b()
            {
                a.b();
            }

            
            {
                b = com.fitbit.maps.h.this;
                a = a1;
                super();
            }
        });
    }

    public final void a(b b1)
    {
        c.a(new com.google.android.gms.maps.c.b(b1) {

            final b a;
            final com.fitbit.maps.h b;

            public View a(com.google.android.gms.maps.model.g g1)
            {
                return a.a(new o(g1));
            }

            public View b(com.google.android.gms.maps.model.g g1)
            {
                return a.b(new o(g1));
            }

            
            {
                b = com.fitbit.maps.h.this;
                a = b1;
                super();
            }
        });
    }

    public final void a(c c1)
    {
        c.a(new com.google.android.gms.maps.c.c(c1) {

            final c a;
            final com.fitbit.maps.h b;

            public void a(CameraPosition cameraposition)
            {
                a.a(new com.fitbit.maps.CameraPosition(cameraposition));
            }

            
            {
                b = com.fitbit.maps.h.this;
                a = c1;
                super();
            }
        });
    }

    public final void a(d d1)
    {
        c.a(new com.google.android.gms.maps.c.d(d1) {

            final d a;
            final com.fitbit.maps.h b;

            public void a()
            {
                a.a();
            }

            public void a(com.google.android.gms.maps.model.e e1)
            {
                a.a(new com.fitbit.maps.j(e1));
            }

            
            {
                b = com.fitbit.maps.h.this;
                a = d1;
                super();
            }
        });
    }

    public final void a(e e1)
    {
        c.a(new com.google.android.gms.maps.c.e(e1) {

            final e a;
            final com.fitbit.maps.h b;

            public void a(com.google.android.gms.maps.model.g g1)
            {
                a.a(new o(g1));
            }

            
            {
                b = com.fitbit.maps.h.this;
                a = e1;
                super();
            }
        });
    }

    public final void a(f f1)
    {
        c.a(new com.google.android.gms.maps.c.f(f1) {

            final f a;
            final com.fitbit.maps.h b;

            public void a(LatLng latlng)
            {
                a.a(new com.fitbit.maps.LatLng(latlng));
            }

            
            {
                b = com.fitbit.maps.h.this;
                a = f1;
                super();
            }
        });
    }

    public void a(g g1)
    {
        if (g1 == null)
        {
            c.a(null);
            return;
        } else
        {
            c.a(new com.google.android.gms.maps.c.g(g1) {

                final g a;
                final com.fitbit.maps.h b;

                public void a()
                {
                    a.a();
                }

            
            {
                b = com.fitbit.maps.h.this;
                a = g1;
                super();
            }
            });
            return;
        }
    }

    public final void a(h h1)
    {
        c.a(new com.google.android.gms.maps.c.h(h1) {

            final h a;
            final com.fitbit.maps.h b;

            public void a(LatLng latlng)
            {
                a.a(new com.fitbit.maps.LatLng(latlng));
            }

            
            {
                b = com.fitbit.maps.h.this;
                a = h2;
                super();
            }
        });
    }

    public final void a(i i1)
    {
        c.a(new com.google.android.gms.maps.c.i(i1) {

            final i a;
            final com.fitbit.maps.h b;

            public boolean a(com.google.android.gms.maps.model.g g1)
            {
                return a.a(new o(g1));
            }

            
            {
                b = com.fitbit.maps.h.this;
                a = i1;
                super();
            }
        });
    }

    public final void a(j j1)
    {
        c.a(new com.google.android.gms.maps.c.j(j1) {

            final j a;
            final com.fitbit.maps.h b;

            public void a(com.google.android.gms.maps.model.g g1)
            {
                a.a(new o(g1));
            }

            public void b(com.google.android.gms.maps.model.g g1)
            {
                a.b(new o(g1));
            }

            public void c(com.google.android.gms.maps.model.g g1)
            {
                a.c(new o(g1));
            }

            
            {
                b = com.fitbit.maps.h.this;
                a = j1;
                super();
            }
        });
    }

    public final void a(k k1)
    {
        c.a(new com.google.android.gms.maps.c.k(k1) {

            final k a;
            final com.fitbit.maps.h b;

            public boolean a()
            {
                return a.a();
            }

            
            {
                b = com.fitbit.maps.h.this;
                a = k1;
                super();
            }
        });
    }

    public final void a(l l1)
    {
        c.a(new com.google.android.gms.maps.c.l(l1) {

            final l a;
            final com.fitbit.maps.h b;

            public void a(Location location)
            {
                a.a(location);
            }

            
            {
                b = com.fitbit.maps.h.this;
                a = l1;
                super();
            }
        });
    }

    public final void a(m m1)
    {
        c.a(new com.google.android.gms.maps.c.m(m1) {

            final m a;
            final com.fitbit.maps.h b;

            public void a(Bitmap bitmap)
            {
                a.a(bitmap);
            }

            
            {
                b = com.fitbit.maps.h.this;
                a = m1;
                super();
            }
        });
    }

    public final void a(m m1, Bitmap bitmap)
    {
        c.a(new com.google.android.gms.maps.c.m(m1) {

            final m a;
            final com.fitbit.maps.h b;

            public void a(Bitmap bitmap1)
            {
                a.a(bitmap1);
            }

            
            {
                b = com.fitbit.maps.h.this;
                a = m1;
                super();
            }
        }, bitmap);
    }

    public final void a(com.fitbit.maps.m m1)
    {
        c.a(new com.google.android.gms.maps.d(m1) {

            final com.fitbit.maps.m a;
            final com.fitbit.maps.h b;

            public void a()
            {
                a.a();
            }

            public void a(com.google.android.gms.maps.d.a a1)
            {
            /* block-local class not found */
            class _cls1 {}

                a.a(new _cls1(a1));
            }

            
            {
                b = com.fitbit.maps.h.this;
                a = m1;
                super();
            }
        });
    }

    public final void a(String s1)
    {
        c.a(s1);
    }

    public final void a(boolean flag)
    {
        c.a(flag);
    }

    public final float b()
    {
        return c.c();
    }

    public final void b(com.fitbit.maps.d d1)
    {
        c.b(d1.a());
    }

    public final boolean b(boolean flag)
    {
        return c.b(flag);
    }

    public final float c()
    {
        return c.d();
    }

    public final void c(boolean flag)
    {
        c.c(flag);
    }

    public final void d()
    {
        c.e();
    }

    public final void d(boolean flag)
    {
        c.d(flag);
    }

    public final void e()
    {
        c.f();
    }

    public com.fitbit.maps.j f()
    {
        return new com.fitbit.maps.j(c.g());
    }

    public final int g()
    {
        return c.h();
    }

    public final boolean h()
    {
        return c.i();
    }

    public final boolean i()
    {
        return c.j();
    }

    public final boolean j()
    {
        return c.k();
    }

    public final boolean k()
    {
        return c.l();
    }

    public final Location l()
    {
        return c.m();
    }

    public final v m()
    {
        return new v(c.n());
    }

    public final s n()
    {
        return new s(c.o());
    }

}
