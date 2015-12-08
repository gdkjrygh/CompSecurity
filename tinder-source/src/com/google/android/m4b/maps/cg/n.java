// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.m4b.maps.GoogleMapOptions;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.ag;
import com.google.android.m4b.maps.da.b;
import com.google.android.m4b.maps.da.d;
import com.google.android.m4b.maps.df.ah;
import com.google.android.m4b.maps.df.t;
import com.google.android.m4b.maps.g.g;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.y.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            bj, ce, bz

public class n extends com.google.android.m4b.maps.df.x.a
{
    public static interface a
    {

        public abstract ce a(GoogleMapOptions googlemapoptions);
    }


    private static final String a = com/google/android/m4b/maps/cg/n.getSimpleName();
    private final a b;
    private ce c;
    private GoogleMapOptions d;
    private final List e = new ArrayList();
    private final Context f;

    private n(a a1, Context context)
    {
        b = (a)j.a(a1);
        f = context;
    }

    public static n a(Activity activity, bj bj1)
    {
        return new n(new a(ag.a(activity), bj1) {

            private boolean a;
            private bj b;

            public final ce a(GoogleMapOptions googlemapoptions)
            {
                return bz.a(googlemapoptions, a, b);
            }

            
            {
                a = flag;
                b = bj1;
                super();
            }
        }, bj1.a);
    }

    public final b a(b b1, Bundle bundle)
    {
        if (c != null) goto _L2; else goto _L1
_L1:
        com.google.android.m4b.maps.da.d.a(b1);
        c = b.a(d);
        c.a(bundle);
        b1 = c.B();
        for (bundle = e.iterator(); bundle.hasNext();)
        {
            ah ah1 = (ah)bundle.next();
            try
            {
                c.a(ah1);
            }
            // Misplaced declaration of an exception variable
            catch (b b1)
            {
                throw new RuntimeRemoteException(b1);
            }
        }

        e.clear();
_L4:
        return com.google.android.m4b.maps.da.d.a(b1);
_L2:
        b1 = c.B();
        bundle = (ViewGroup)b1.getParent();
        if (bundle != null)
        {
            bundle.removeView(b1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final t a()
    {
        if (com.google.android.m4b.maps.g.g.e(f))
        {
            ab.a("This device does not support the use of MapFragment.getMap(). Please use MapFragment.getMapAsync() instead.");
            return null;
        } else
        {
            return c;
        }
    }

    public final void a(Bundle bundle)
    {
        if (d == null)
        {
            d = (GoogleMapOptions)com.google.android.m4b.maps.df.n.a(bundle, "MapOptions");
        }
        if (d == null)
        {
            d = new GoogleMapOptions();
        }
    }

    public final void a(GoogleMapOptions googlemapoptions)
    {
        d = googlemapoptions;
    }

    public final void a(ah ah1)
    {
        if (c != null)
        {
            try
            {
                c.a(ah1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ah ah1)
            {
                throw new RuntimeRemoteException(ah1);
            }
        } else
        {
            e.add(ah1);
            return;
        }
    }

    public final void b()
    {
        c.b();
    }

    public final void b(Bundle bundle)
    {
        if (c == null)
        {
            if (d != null)
            {
                com.google.android.m4b.maps.df.n.a(bundle, "MapOptions", d);
            }
            return;
        } else
        {
            c.b(bundle);
            return;
        }
    }

    public final void c()
    {
        c.c();
    }

    public final void c(Bundle bundle)
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        c.c(bundle);
        return;
        bundle;
        throw new RuntimeRemoteException(bundle);
    }

    public final void d()
    {
        if (c.C())
        {
            c.a();
            c = null;
        }
    }

    public final void e()
    {
        if (c != null)
        {
            c.a();
            c = null;
        }
        d = null;
    }

    public final void f()
    {
        c.d();
    }

    public final boolean g()
    {
        return c != null;
    }

    public final void h()
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        c.D();
        return;
        RemoteException remoteexception;
        remoteexception;
        throw new RuntimeRemoteException(remoteexception);
    }

}
