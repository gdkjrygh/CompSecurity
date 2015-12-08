// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.maps.a.aj;
import com.google.android.gms.maps.a.b;
import com.google.android.gms.maps.a.d;
import com.google.android.gms.maps.a.k;
import com.google.android.gms.maps.model.c;

// Referenced classes of package com.google.android.gms.maps:
//            SupportMapFragment, GoogleMapOptions, e, b

static final class a
    implements k
{

    private final Fragment a;
    private final d b;

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        try
        {
            layoutinflater = b.a(com.google.android.gms.b.d.a(layoutinflater), com.google.android.gms.b.d.a(viewgroup), bundle);
        }
        // Misplaced declaration of an exception variable
        catch (LayoutInflater layoutinflater)
        {
            throw new c(layoutinflater);
        }
        return (View)com.google.android.gms.b.d.a(layoutinflater);
    }

    public final void a()
    {
        try
        {
            b.b();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new c(remoteexception);
        }
    }

    public final void a(Activity activity, Bundle bundle, Bundle bundle1)
    {
        bundle = (GoogleMapOptions)bundle.getParcelable("MapOptions");
        try
        {
            b.a(com.google.android.gms.b.d.a(activity), bundle, bundle1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw new c(activity);
        }
    }

    public final void a(Bundle bundle)
    {
        Bundle bundle1;
        bundle1 = bundle;
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        bundle1 = new Bundle();
        bundle = a.getArguments();
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        if (bundle.containsKey("MapOptions"))
        {
            aj.a(bundle1, "MapOptions", bundle.getParcelable("MapOptions"));
        }
        b.a(bundle1);
        return;
        bundle;
        throw new c(bundle);
    }

    public final void a(e e1)
    {
        try
        {
            b.a(new com.google.android.gms.maps.a.x.a(e1) {

                final e a;
                final SupportMapFragment.a b;

                public final void a(b b1)
                    throws RemoteException
                {
                    a.onMapReady(new com.google.android.gms.maps.b(b1));
                }

            
            {
                b = SupportMapFragment.a.this;
                a = e1;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (e e1)
        {
            throw new c(e1);
        }
    }

    public final void b()
    {
        try
        {
            b.c();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new c(remoteexception);
        }
    }

    public final void b(Bundle bundle)
    {
        try
        {
            b.b(bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new c(bundle);
        }
    }

    public final void c()
    {
        try
        {
            b.d();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new c(remoteexception);
        }
    }

    public final void d()
    {
        try
        {
            b.e();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new c(remoteexception);
        }
    }

    public final void e()
    {
        try
        {
            b.f();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new c(remoteexception);
        }
    }

    public final d f()
    {
        return b;
    }

    public _cls1.a(Fragment fragment, d d1)
    {
        b = (d)y.a(d1);
        a = (Fragment)y.a(fragment);
    }
}
