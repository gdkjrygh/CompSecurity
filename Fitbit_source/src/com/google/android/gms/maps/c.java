// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.internal.am;
import com.google.android.gms.maps.internal.b;
import com.google.android.gms.maps.internal.v;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.d;
import com.google.android.gms.maps.model.e;
import com.google.android.gms.maps.model.g;
import com.google.android.gms.maps.model.h;
import com.google.android.gms.maps.model.i;
import com.google.android.gms.maps.model.j;

// Referenced classes of package com.google.android.gms.maps:
//            a, l, i, d

public final class com.google.android.gms.maps.c
{
    public static interface a
    {

        public abstract void a();

        public abstract void b();
    }

    public static interface b
    {

        public abstract View a(com.google.android.gms.maps.model.g g1);

        public abstract View b(com.google.android.gms.maps.model.g g1);
    }

    public static interface c
    {

        public abstract void a(CameraPosition cameraposition);
    }

    public static interface d
    {

        public abstract void a();

        public abstract void a(com.google.android.gms.maps.model.e e1);
    }

    public static interface e
    {

        public abstract void a(com.google.android.gms.maps.model.g g1);
    }

    public static interface f
    {

        public abstract void a(LatLng latlng);
    }

    public static interface g
    {

        public abstract void a();
    }

    public static interface h
    {

        public abstract void a(LatLng latlng);
    }

    public static interface i
    {

        public abstract boolean a(com.google.android.gms.maps.model.g g1);
    }

    public static interface j
    {

        public abstract void a(com.google.android.gms.maps.model.g g1);

        public abstract void b(com.google.android.gms.maps.model.g g1);

        public abstract void c(com.google.android.gms.maps.model.g g1);
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

    private static final class n extends com.google.android.gms.maps.internal.o.a
    {

        private final a a;

        public void a()
        {
            a.a();
        }

        public void b()
        {
            a.b();
        }

        n(a a1)
        {
            a = a1;
        }
    }


    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    private final com.google.android.gms.maps.internal.b f;
    private com.google.android.gms.maps.l g;

    protected com.google.android.gms.maps.c(com.google.android.gms.maps.internal.b b1)
    {
        f = (com.google.android.gms.maps.internal.b)am.a(b1);
    }

    com.google.android.gms.maps.internal.b a()
    {
        return f;
    }

    public final com.google.android.gms.maps.model.c a(CircleOptions circleoptions)
    {
        try
        {
            circleoptions = new com.google.android.gms.maps.model.c(f.a(circleoptions));
        }
        // Misplaced declaration of an exception variable
        catch (CircleOptions circleoptions)
        {
            throw new RuntimeRemoteException(circleoptions);
        }
        return circleoptions;
    }

    public final com.google.android.gms.maps.model.d a(GroundOverlayOptions groundoverlayoptions)
    {
        try
        {
            groundoverlayoptions = f.a(groundoverlayoptions);
        }
        // Misplaced declaration of an exception variable
        catch (GroundOverlayOptions groundoverlayoptions)
        {
            throw new RuntimeRemoteException(groundoverlayoptions);
        }
        if (groundoverlayoptions == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        groundoverlayoptions = new com.google.android.gms.maps.model.d(groundoverlayoptions);
        return groundoverlayoptions;
        return null;
    }

    public final com.google.android.gms.maps.model.g a(MarkerOptions markeroptions)
    {
        try
        {
            markeroptions = f.a(markeroptions);
        }
        // Misplaced declaration of an exception variable
        catch (MarkerOptions markeroptions)
        {
            throw new RuntimeRemoteException(markeroptions);
        }
        if (markeroptions == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        markeroptions = new com.google.android.gms.maps.model.g(markeroptions);
        return markeroptions;
        return null;
    }

    public final com.google.android.gms.maps.model.h a(PolygonOptions polygonoptions)
    {
        try
        {
            polygonoptions = new com.google.android.gms.maps.model.h(f.a(polygonoptions));
        }
        // Misplaced declaration of an exception variable
        catch (PolygonOptions polygonoptions)
        {
            throw new RuntimeRemoteException(polygonoptions);
        }
        return polygonoptions;
    }

    public final com.google.android.gms.maps.model.i a(PolylineOptions polylineoptions)
    {
        try
        {
            polylineoptions = new com.google.android.gms.maps.model.i(f.a(polylineoptions));
        }
        // Misplaced declaration of an exception variable
        catch (PolylineOptions polylineoptions)
        {
            throw new RuntimeRemoteException(polylineoptions);
        }
        return polylineoptions;
    }

    public final com.google.android.gms.maps.model.j a(TileOverlayOptions tileoverlayoptions)
    {
        try
        {
            tileoverlayoptions = f.a(tileoverlayoptions);
        }
        // Misplaced declaration of an exception variable
        catch (TileOverlayOptions tileoverlayoptions)
        {
            throw new RuntimeRemoteException(tileoverlayoptions);
        }
        if (tileoverlayoptions == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        tileoverlayoptions = new com.google.android.gms.maps.model.j(tileoverlayoptions);
        return tileoverlayoptions;
        return null;
    }

    public final void a(int i1)
    {
        try
        {
            f.a(i1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void a(int i1, int j1, int k1, int l1)
    {
        try
        {
            f.a(i1, j1, k1, l1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void a(com.google.android.gms.maps.a a1)
    {
        try
        {
            f.a(a1.a());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.maps.a a1)
        {
            throw new RuntimeRemoteException(a1);
        }
    }

    public final void a(com.google.android.gms.maps.a a1, int i1, a a2)
    {
        com.google.android.gms.maps.internal.b b1;
        com.google.android.gms.dynamic.e e1;
        try
        {
            b1 = f;
            e1 = a1.a();
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.maps.a a1)
        {
            throw new RuntimeRemoteException(a1);
        }
        if (a2 != null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        a1 = null;
        b1.a(e1, i1, a1);
        return;
        a1 = new n(a2);
        break MISSING_BLOCK_LABEL_18;
    }

    public final void a(com.google.android.gms.maps.a a1, a a2)
    {
        com.google.android.gms.maps.internal.b b1;
        com.google.android.gms.dynamic.e e1;
        try
        {
            b1 = f;
            e1 = a1.a();
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.maps.a a1)
        {
            throw new RuntimeRemoteException(a1);
        }
        if (a2 != null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        a1 = null;
        b1.a(e1, a1);
        return;
        a1 = new n(a2);
        break MISSING_BLOCK_LABEL_17;
    }

    public final void a(b b1)
    {
        if (b1 == null)
        {
            try
            {
                f.a(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (b b1)
            {
                throw new RuntimeRemoteException(b1);
            }
        }
        f.a(new com.google.android.gms.maps.internal.q.a(b1) {

            final b a;
            final com.google.android.gms.maps.c b;

            public com.google.android.gms.dynamic.e a(com.google.android.gms.maps.model.internal.m m1)
            {
                return com.google.android.gms.dynamic.f.a(a.a(new com.google.android.gms.maps.model.g(m1)));
            }

            public com.google.android.gms.dynamic.e b(com.google.android.gms.maps.model.internal.m m1)
            {
                return com.google.android.gms.dynamic.f.a(a.b(new com.google.android.gms.maps.model.g(m1)));
            }

            
            {
                b = com.google.android.gms.maps.c.this;
                a = b1;
                super();
            }
        });
        return;
    }

    public final void a(c c1)
    {
        if (c1 == null)
        {
            try
            {
                f.a(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (c c1)
            {
                throw new RuntimeRemoteException(c1);
            }
        }
        f.a(new com.google.android.gms.maps.internal.s.a(c1) {

            final c a;
            final com.google.android.gms.maps.c b;

            public void a(CameraPosition cameraposition)
            {
                a.a(cameraposition);
            }

            
            {
                b = com.google.android.gms.maps.c.this;
                a = c2;
                super();
            }
        });
        return;
    }

    public final void a(d d1)
    {
        if (d1 == null)
        {
            try
            {
                f.a(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (d d1)
            {
                throw new RuntimeRemoteException(d1);
            }
        }
        f.a(new com.google.android.gms.maps.internal.t.a(d1) {

            final d a;
            final com.google.android.gms.maps.c b;

            public void a()
            {
                a.a();
            }

            public void a(com.google.android.gms.maps.model.internal.k k1)
            {
                a.a(new com.google.android.gms.maps.model.e(k1));
            }

            
            {
                b = com.google.android.gms.maps.c.this;
                a = d1;
                super();
            }
        });
        return;
    }

    public final void a(e e1)
    {
        if (e1 == null)
        {
            try
            {
                f.a(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (e e1)
            {
                throw new RuntimeRemoteException(e1);
            }
        }
        f.a(new com.google.android.gms.maps.internal.u.a(e1) {

            final e a;
            final com.google.android.gms.maps.c b;

            public void a(com.google.android.gms.maps.model.internal.m m1)
            {
                a.a(new com.google.android.gms.maps.model.g(m1));
            }

            
            {
                b = com.google.android.gms.maps.c.this;
                a = e1;
                super();
            }
        });
        return;
    }

    public final void a(f f1)
    {
        if (f1 == null)
        {
            try
            {
                f.a(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (f f1)
            {
                throw new RuntimeRemoteException(f1);
            }
        }
        f.a(new com.google.android.gms.maps.internal.w.a(f1) {

            final f a;
            final com.google.android.gms.maps.c b;

            public void a(LatLng latlng)
            {
                a.a(latlng);
            }

            
            {
                b = com.google.android.gms.maps.c.this;
                a = f1;
                super();
            }
        });
        return;
    }

    public void a(g g1)
    {
        if (g1 == null)
        {
            try
            {
                f.a(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (g g1)
            {
                throw new RuntimeRemoteException(g1);
            }
        }
        f.a(new com.google.android.gms.maps.internal.x.a(g1) {

            final g a;
            final com.google.android.gms.maps.c b;

            public void a()
                throws RemoteException
            {
                a.a();
            }

            
            {
                b = com.google.android.gms.maps.c.this;
                a = g1;
                super();
            }
        });
        return;
    }

    public final void a(h h1)
    {
        if (h1 == null)
        {
            try
            {
                f.a(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (h h1)
            {
                throw new RuntimeRemoteException(h1);
            }
        }
        f.a(new com.google.android.gms.maps.internal.z.a(h1) {

            final h a;
            final com.google.android.gms.maps.c b;

            public void a(LatLng latlng)
            {
                a.a(latlng);
            }

            
            {
                b = com.google.android.gms.maps.c.this;
                a = h1;
                super();
            }
        });
        return;
    }

    public final void a(i i1)
    {
        if (i1 == null)
        {
            try
            {
                f.a(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (i i1)
            {
                throw new RuntimeRemoteException(i1);
            }
        }
        f.a(new com.google.android.gms.maps.internal.ab.a(i1) {

            final i a;
            final com.google.android.gms.maps.c b;

            public boolean a(com.google.android.gms.maps.model.internal.m m1)
            {
                return a.a(new com.google.android.gms.maps.model.g(m1));
            }

            
            {
                b = com.google.android.gms.maps.c.this;
                a = i1;
                super();
            }
        });
        return;
    }

    public final void a(j j1)
    {
        if (j1 == null)
        {
            try
            {
                f.a(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (j j1)
            {
                throw new RuntimeRemoteException(j1);
            }
        }
        f.a(new com.google.android.gms.maps.internal.ac.a(j1) {

            final j a;
            final com.google.android.gms.maps.c b;

            public void a(com.google.android.gms.maps.model.internal.m m1)
            {
                a.a(new com.google.android.gms.maps.model.g(m1));
            }

            public void b(com.google.android.gms.maps.model.internal.m m1)
            {
                a.c(new com.google.android.gms.maps.model.g(m1));
            }

            public void c(com.google.android.gms.maps.model.internal.m m1)
            {
                a.b(new com.google.android.gms.maps.model.g(m1));
            }

            
            {
                b = com.google.android.gms.maps.c.this;
                a = j1;
                super();
            }
        });
        return;
    }

    public final void a(k k1)
    {
        if (k1 == null)
        {
            try
            {
                f.a(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (k k1)
            {
                throw new RuntimeRemoteException(k1);
            }
        }
        f.a(new com.google.android.gms.maps.internal.ad.a(k1) {

            final k a;
            final com.google.android.gms.maps.c b;

            public boolean a()
                throws RemoteException
            {
                return a.a();
            }

            
            {
                b = com.google.android.gms.maps.c.this;
                a = k1;
                super();
            }
        });
        return;
    }

    public final void a(l l1)
    {
        if (l1 == null)
        {
            try
            {
                f.a(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (l l1)
            {
                throw new RuntimeRemoteException(l1);
            }
        }
        f.a(new com.google.android.gms.maps.internal.ae.a(l1) {

            final l a;
            final com.google.android.gms.maps.c b;

            public void a(Location location)
            {
                a.a(location);
            }

            public void a(com.google.android.gms.dynamic.e e1)
            {
                a.a((Location)com.google.android.gms.dynamic.f.a(e1));
            }

            
            {
                b = com.google.android.gms.maps.c.this;
                a = l1;
                super();
            }
        });
        return;
    }

    public final void a(m m1)
    {
        a(m1, ((Bitmap) (null)));
    }

    public final void a(m m1, Bitmap bitmap)
    {
        if (bitmap != null)
        {
            bitmap = com.google.android.gms.dynamic.f.a(bitmap);
        } else
        {
            bitmap = null;
        }
        bitmap = (com.google.android.gms.dynamic.f)(com.google.android.gms.dynamic.f)bitmap;
        try
        {
            f.a(new com.google.android.gms.maps.internal.aj.a(m1) {

                final m a;
                final com.google.android.gms.maps.c b;

                public void a(Bitmap bitmap1)
                    throws RemoteException
                {
                    a.a(bitmap1);
                }

                public void a(com.google.android.gms.dynamic.e e1)
                    throws RemoteException
                {
                    a.a((Bitmap)com.google.android.gms.dynamic.f.a(e1));
                }

            
            {
                b = com.google.android.gms.maps.c.this;
                a = m1;
                super();
            }
            }, bitmap);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (m m1)
        {
            throw new RuntimeRemoteException(m1);
        }
    }

    public final void a(com.google.android.gms.maps.d d1)
    {
        if (d1 == null)
        {
            try
            {
                f.a(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (com.google.android.gms.maps.d d1)
            {
                throw new RuntimeRemoteException(d1);
            }
        }
        f.a(new com.google.android.gms.maps.internal.a(d1) {

            final com.google.android.gms.maps.d a;
            final com.google.android.gms.maps.c b;

            public void a()
            {
                a.a();
            }

            public void a(v v)
            {
            /* block-local class not found */
            class _cls1 {}

                a.a(new _cls1(v));
            }

            
            {
                b = com.google.android.gms.maps.c.this;
                a = d1;
                super();
            }
        });
        return;
    }

    public final void a(String s)
    {
        try
        {
            f.a(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeRemoteException(s);
        }
    }

    public final void a(boolean flag)
    {
        try
        {
            f.a(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final CameraPosition b()
    {
        CameraPosition cameraposition;
        try
        {
            cameraposition = f.a();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return cameraposition;
    }

    public final void b(com.google.android.gms.maps.a a1)
    {
        try
        {
            f.b(a1.a());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.maps.a a1)
        {
            throw new RuntimeRemoteException(a1);
        }
    }

    public final boolean b(boolean flag)
    {
        try
        {
            flag = f.b(flag);
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public final float c()
    {
        float f1;
        try
        {
            f1 = f.b();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return f1;
    }

    public final void c(boolean flag)
    {
        try
        {
            f.d(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final float d()
    {
        float f1;
        try
        {
            f1 = f.c();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return f1;
    }

    public final void d(boolean flag)
    {
        try
        {
            f.c(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void e()
    {
        try
        {
            f.d();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void f()
    {
        try
        {
            f.e();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public com.google.android.gms.maps.model.e g()
    {
        Object obj;
        try
        {
            obj = f.n();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        obj = new com.google.android.gms.maps.model.e(((com.google.android.gms.maps.model.internal.k) (obj)));
        return ((com.google.android.gms.maps.model.e) (obj));
        return null;
    }

    public final int h()
    {
        int i1;
        try
        {
            i1 = f.f();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i1;
    }

    public final boolean i()
    {
        boolean flag;
        try
        {
            flag = f.g();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public final boolean j()
    {
        boolean flag;
        try
        {
            flag = f.h();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public final boolean k()
    {
        boolean flag;
        try
        {
            flag = f.m();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public final boolean l()
    {
        boolean flag;
        try
        {
            flag = f.i();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public final Location m()
    {
        Location location;
        try
        {
            location = f.j();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return location;
    }

    public final com.google.android.gms.maps.l n()
    {
        com.google.android.gms.maps.l l1;
        try
        {
            if (g == null)
            {
                g = new com.google.android.gms.maps.l(f.k());
            }
            l1 = g;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return l1;
    }

    public final com.google.android.gms.maps.i o()
    {
        com.google.android.gms.maps.i i1;
        try
        {
            i1 = new com.google.android.gms.maps.i(f.l());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i1;
    }
}
