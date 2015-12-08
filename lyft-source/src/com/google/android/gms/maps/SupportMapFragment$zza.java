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
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.zzx;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions, OnMapReadyCallback, GoogleMap

class a
    implements MapLifecycleDelegate
{

    private final Fragment a;
    private final IMapFragmentDelegate b;

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        try
        {
            layoutinflater = b.a(zze.a(layoutinflater), zze.a(viewgroup), bundle);
        }
        // Misplaced declaration of an exception variable
        catch (LayoutInflater layoutinflater)
        {
            throw new RuntimeRemoteException(layoutinflater);
        }
        return (View)zze.a(layoutinflater);
    }

    public void a()
    {
    }

    public void a(Activity activity, Bundle bundle, Bundle bundle1)
    {
        bundle = (GoogleMapOptions)bundle.getParcelable("MapOptions");
        try
        {
            b.a(zze.a(activity), bundle, bundle1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw new RuntimeRemoteException(activity);
        }
    }

    public void a(Bundle bundle)
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
            zzx.a(bundle1, "MapOptions", bundle.getParcelable("MapOptions"));
        }
        b.a(bundle1);
        return;
        bundle;
        throw new RuntimeRemoteException(bundle);
    }

    public void a(OnMapReadyCallback onmapreadycallback)
    {
        try
        {
            b.a(new com.google.android.gms.maps.internal.zzm.zza(onmapreadycallback) {

                final OnMapReadyCallback a;
                final SupportMapFragment.zza b;

                public void a(IGoogleMapDelegate igooglemapdelegate)
                {
                    a.onMapReady(new GoogleMap(igooglemapdelegate));
                }

            
            {
                b = SupportMapFragment.zza.this;
                a = onmapreadycallback;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnMapReadyCallback onmapreadycallback)
        {
            throw new RuntimeRemoteException(onmapreadycallback);
        }
    }

    public void b()
    {
        try
        {
            b.b();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void b(Bundle bundle)
    {
        try
        {
            b.b(bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new RuntimeRemoteException(bundle);
        }
    }

    public void c()
    {
        try
        {
            b.c();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void d()
    {
    }

    public void e()
    {
        try
        {
            b.d();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void f()
    {
        try
        {
            b.e();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void g()
    {
        try
        {
            b.f();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public legate(Fragment fragment, IMapFragmentDelegate imapfragmentdelegate)
    {
        b = (IMapFragmentDelegate)zzu.a(imapfragmentdelegate);
        a = (Fragment)zzu.a(fragment);
    }
}
