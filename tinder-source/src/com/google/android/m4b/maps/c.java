// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps;

import android.os.RemoteException;
import android.view.View;
import com.google.android.m4b.maps.df.t;
import com.google.android.m4b.maps.j.x;
import com.google.android.m4b.maps.model.CameraPosition;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.MarkerOptions;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.model.internal.k;
import com.google.android.m4b.maps.model.j;

// Referenced classes of package com.google.android.m4b.maps:
//            k, g

public final class com.google.android.m4b.maps.c
{
    public static interface a
    {

        public abstract View a(j j1);
    }

    public static interface b
    {

        public abstract void a(j j1);
    }

    public static interface c
    {

        public abstract void a(LatLng latlng);
    }

    public static interface d
    {

        public abstract void b(j j1);

        public abstract void c(j j1);
    }


    public final t a;
    private com.google.android.m4b.maps.k b;

    protected com.google.android.m4b.maps.c(t t1)
    {
        a = (t)x.a(t1);
    }

    public final CameraPosition a()
    {
        CameraPosition cameraposition;
        try
        {
            cameraposition = a.e();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return cameraposition;
    }

    public final j a(MarkerOptions markeroptions)
    {
        try
        {
            markeroptions = a.a(markeroptions);
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
        markeroptions = new j(markeroptions);
        return markeroptions;
        return null;
    }

    public final com.google.android.m4b.maps.k b()
    {
        com.google.android.m4b.maps.k k1;
        try
        {
            if (b == null)
            {
                b = new com.google.android.m4b.maps.k(a.s());
            }
            k1 = b;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return k1;
    }

    public final g c()
    {
        g g1;
        try
        {
            g1 = new g(a.r());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return g1;
    }

    // Unreferenced inner class com/google/android/m4b/maps/c$1

/* anonymous class */
    public final class _cls1 extends com.google.android.m4b.maps.df.ae.a
    {

        private c a;
        private com.google.android.m4b.maps.c b;

        public final void a(LatLng latlng)
        {
            a.a(latlng);
        }

            public 
            {
                b = com.google.android.m4b.maps.c.this;
                a = c2;
                super();
            }
    }


    // Unreferenced inner class com/google/android/m4b/maps/c$2

/* anonymous class */
    public final class _cls2 extends com.google.android.m4b.maps.df.ak.a
    {

        private d a;
        private com.google.android.m4b.maps.c b;

        public final void a(k k1)
        {
            a.b(new j(k1));
        }

        public final void b(k k1)
        {
            a.c(new j(k1));
        }

        public final void c(k k1)
        {
            new j(k1);
        }

            public 
            {
                b = com.google.android.m4b.maps.c.this;
                a = d1;
                super();
            }
    }


    // Unreferenced inner class com/google/android/m4b/maps/c$3

/* anonymous class */
    public final class _cls3 extends com.google.android.m4b.maps.df.ac.a
    {

        private b a;
        private com.google.android.m4b.maps.c b;

        public final void a(k k1)
        {
            a.a(new j(k1));
        }

            public 
            {
                b = com.google.android.m4b.maps.c.this;
                a = b1;
                super();
            }
    }


    // Unreferenced inner class com/google/android/m4b/maps/c$4

/* anonymous class */
    public final class _cls4 extends com.google.android.m4b.maps.df.u.a
    {

        private a a;
        private com.google.android.m4b.maps.c b;

        public final com.google.android.m4b.maps.da.b a(k k1)
        {
            return com.google.android.m4b.maps.da.d.a(a.a(new j(k1)));
        }

        public final com.google.android.m4b.maps.da.b b(k k1)
        {
            new j(k1);
            return com.google.android.m4b.maps.da.d.a(null);
        }

            public 
            {
                b = com.google.android.m4b.maps.c.this;
                a = a1;
                super();
            }
    }

}
