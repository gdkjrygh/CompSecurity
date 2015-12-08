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
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.internal.w;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            SupportStreetViewPanoramaFragment, OnStreetViewPanoramaReadyCallback, StreetViewPanorama

static final class VB
    implements StreetViewLifecycleDelegate
{

    private final Fragment VB;
    private final IStreetViewPanoramaFragmentDelegate azt;

    public final void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
    {
        try
        {
            azt.getStreetViewPanoramaAsync(new com.google.android.gms.maps.internal.u.a(onstreetviewpanoramareadycallback) {

                final SupportStreetViewPanoramaFragment.a azM;
                final OnStreetViewPanoramaReadyCallback azu;

                public final void a(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
                    throws RemoteException
                {
                    OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback1 = azu;
                    new StreetViewPanorama(istreetviewpanoramadelegate);
                }

            
            {
                azM = SupportStreetViewPanoramaFragment.a.this;
                azu = onstreetviewpanoramareadycallback;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
        {
            throw new RuntimeRemoteException(onstreetviewpanoramareadycallback);
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
        if (bundle.containsKey("StreetViewPanoramaOptions"))
        {
            w.a(bundle1, "StreetViewPanoramaOptions", bundle.getParcelable("StreetViewPanoramaOptions"));
        }
        azt.onCreate(bundle1);
        return;
        bundle;
        throw new RuntimeRemoteException(bundle);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        try
        {
            layoutinflater = azt.onCreateView(e.q(layoutinflater), e.q(viewgroup), bundle);
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
            azt.onDestroy();
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
            azt.onDestroyView();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public final void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
    {
        try
        {
            azt.onInflate(e.q(activity), null, bundle1);
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
            azt.onLowMemory();
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
            azt.onPause();
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
            azt.onResume();
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
            azt.onSaveInstanceState(bundle);
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

    public Delegate(Fragment fragment, IStreetViewPanoramaFragmentDelegate istreetviewpanoramafragmentdelegate)
    {
        azt = (IStreetViewPanoramaFragmentDelegate)kn.k(istreetviewpanoramafragmentdelegate);
        VB = (Fragment)kn.k(fragment);
    }
}
