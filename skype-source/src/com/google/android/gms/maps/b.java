// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.maps.a.t;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.a.f;
import com.google.android.gms.maps.model.c;

// Referenced classes of package com.google.android.gms.maps:
//            a, h, c

public final class com.google.android.gms.maps.b
{
    public static interface a
    {

        public abstract void onCancel();

        public abstract void onFinish();
    }

    public static interface b
    {

        public abstract void onCameraChange(CameraPosition cameraposition);
    }

    public static interface c
    {

        public abstract void onMapClick(LatLng latlng);
    }

    public static interface d
    {

        public abstract boolean onMarkerClick(com.google.android.gms.maps.model.b b1);
    }

    private static final class e extends com.google.android.gms.maps.a.n.a
    {

        private final a a;

        public final void a()
        {
            a.onFinish();
        }

        public final void b()
        {
            a.onCancel();
        }

        e(a a1)
        {
            a = a1;
        }
    }


    private final com.google.android.gms.maps.a.b a;
    private h b;

    protected com.google.android.gms.maps.b(com.google.android.gms.maps.a.b b1)
    {
        a = (com.google.android.gms.maps.a.b)y.a(b1);
    }

    final com.google.android.gms.maps.a.b a()
    {
        return a;
    }

    public final com.google.android.gms.maps.model.b a(MarkerOptions markeroptions)
    {
        try
        {
            markeroptions = a.a(markeroptions);
        }
        // Misplaced declaration of an exception variable
        catch (MarkerOptions markeroptions)
        {
            throw new com.google.android.gms.maps.model.c(markeroptions);
        }
        if (markeroptions == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        markeroptions = new com.google.android.gms.maps.model.b(markeroptions);
        return markeroptions;
        return null;
    }

    public final void a(com.google.android.gms.maps.a a1)
    {
        try
        {
            a.a(a1.a());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.maps.a a1)
        {
            throw new com.google.android.gms.maps.model.c(a1);
        }
    }

    public final void a(com.google.android.gms.maps.a a1, a a2)
    {
        try
        {
            a.a(a1.a(), new e(a2));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.maps.a a1)
        {
            throw new com.google.android.gms.maps.model.c(a1);
        }
    }

    public final void a(b b1)
    {
        try
        {
            a.a(new com.google.android.gms.maps.a.q.a(b1) {

                final b a;
                final com.google.android.gms.maps.b b;

                public final void a(CameraPosition cameraposition)
                {
                    a.onCameraChange(cameraposition);
                }

            
            {
                b = com.google.android.gms.maps.b.this;
                a = b2;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (b b1)
        {
            throw new com.google.android.gms.maps.model.c(b1);
        }
    }

    public final void a(c c1)
    {
        if (c1 == null)
        {
            try
            {
                a.a(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (c c1)
            {
                throw new com.google.android.gms.maps.model.c(c1);
            }
        }
        a.a(new com.google.android.gms.maps.a.u.a(c1) {

            final c a;
            final com.google.android.gms.maps.b b;

            public final void a(LatLng latlng)
            {
                a.onMapClick(latlng);
            }

            
            {
                b = com.google.android.gms.maps.b.this;
                a = c1;
                super();
            }
        });
        return;
    }

    public final void a(d d1)
    {
        try
        {
            a.a(new com.google.android.gms.maps.a.y.a(d1) {

                final d a;
                final com.google.android.gms.maps.b b;

                public final boolean a(f f1)
                {
                    return a.onMarkerClick(new com.google.android.gms.maps.model.b(f1));
                }

            
            {
                b = com.google.android.gms.maps.b.this;
                a = d1;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (d d1)
        {
            throw new com.google.android.gms.maps.model.c(d1);
        }
    }

    public final void a(com.google.android.gms.maps.c c1)
    {
        if (c1 == null)
        {
            try
            {
                a.a(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (com.google.android.gms.maps.c c1)
            {
                throw new com.google.android.gms.maps.model.c(c1);
            }
        }
        a.a(new com.google.android.gms.maps.a.c.a(c1) {

            final com.google.android.gms.maps.c a;
            final com.google.android.gms.maps.b b;

            public final void a()
            {
                a.deactivate();
            }

            public final void a(t t)
            {
                a.activate(new c.a(this, t) {

                    final t a;
                    final _cls2 b;

                    public final void onLocationChanged(Location location)
                    {
                        try
                        {
                            a.a(location);
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (Location location)
                        {
                            throw new com.google.android.gms.maps.model.c(location);
                        }
                    }

            
            {
                b = _pcls2;
                a = t1;
                super();
            }
                });
            }

            
            {
                b = com.google.android.gms.maps.b.this;
                a = c1;
                super();
            }
        });
        return;
    }

    public final CameraPosition b()
    {
        CameraPosition cameraposition;
        try
        {
            cameraposition = a.a();
        }
        catch (RemoteException remoteexception)
        {
            throw new com.google.android.gms.maps.model.c(remoteexception);
        }
        return cameraposition;
    }

    public final void b(com.google.android.gms.maps.a a1)
    {
        try
        {
            a.b(a1.a());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.maps.a a1)
        {
            throw new com.google.android.gms.maps.model.c(a1);
        }
    }

    public final void c()
    {
        try
        {
            a.e();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new com.google.android.gms.maps.model.c(remoteexception);
        }
    }

    public final void d()
    {
        try
        {
            a.c(true);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new com.google.android.gms.maps.model.c(remoteexception);
        }
    }

    public final Location e()
    {
        Location location;
        try
        {
            location = a.j();
        }
        catch (RemoteException remoteexception)
        {
            throw new com.google.android.gms.maps.model.c(remoteexception);
        }
        return location;
    }

    public final h f()
    {
        h h1;
        try
        {
            if (b == null)
            {
                b = new h(a.k());
            }
            h1 = b;
        }
        catch (RemoteException remoteexception)
        {
            throw new com.google.android.gms.maps.model.c(remoteexception);
        }
        return h1;
    }
}
