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
import com.google.android.gms.dynamic.e;
import com.google.android.gms.internal.kn;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.w;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            SupportMapFragment, GoogleMapOptions, OnMapReadyCallback, GoogleMap

static final class VB
    implements MapLifecycleDelegate
{

    private final Fragment VB;
    private final IMapFragmentDelegate ayZ;

    public final void getMapAsync(OnMapReadyCallback onmapreadycallback)
    {
        try
        {
            ayZ.getMapAsync(new com.google.android.gms.maps.internal.m.a(onmapreadycallback) {

                final SupportMapFragment.a azK;
                final OnMapReadyCallback aza;

                public final void a(IGoogleMapDelegate igooglemapdelegate)
                    throws RemoteException
                {
                    OnMapReadyCallback onmapreadycallback1 = aza;
                    new GoogleMap(igooglemapdelegate);
                }

            
            {
                azK = SupportMapFragment.a.this;
                aza = onmapreadycallback;
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

    public final void onCreate(Bundle bundle)
    {
        Bundle bundle1;
        bundle1 = bundle;
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        bundle1 = new Bundle();
        bundle = VB.getArguments();
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        if (bundle.containsKey("MapOptions"))
        {
            w.a(bundle1, "MapOptions", bundle.getParcelable("MapOptions"));
        }
        ayZ.onCreate(bundle1);
        return;
        bundle;
        throw new RuntimeRemoteException(bundle);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        try
        {
            layoutinflater = ayZ.onCreateView(e.q(layoutinflater), e.q(viewgroup), bundle);
        }
        // Misplaced declaration of an exception variable
        catch (LayoutInflater layoutinflater)
        {
            throw new RuntimeRemoteException(layoutinflater);
        }
        return (View)e.i(layoutinflater);
    }

    public final void onDestroy()
    {
        try
        {
            ayZ.onDestroy();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void onDestroyView()
    {
        try
        {
            ayZ.onDestroyView();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
    {
        bundle = (GoogleMapOptions)bundle.getParcelable("MapOptions");
        try
        {
            ayZ.onInflate(e.q(activity), bundle, bundle1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw new RuntimeRemoteException(activity);
        }
    }

    public final void onLowMemory()
    {
        try
        {
            ayZ.onLowMemory();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void onPause()
    {
        try
        {
            ayZ.onPause();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void onResume()
    {
        try
        {
            ayZ.onResume();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        try
        {
            ayZ.onSaveInstanceState(bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new RuntimeRemoteException(bundle);
        }
    }

    public final void onStart()
    {
    }

    public final void onStop()
    {
    }

    public Delegate(Fragment fragment, IMapFragmentDelegate imapfragmentdelegate)
    {
        ayZ = (IMapFragmentDelegate)kn.k(imapfragmentdelegate);
        VB = (Fragment)kn.k(fragment);
    }
}
