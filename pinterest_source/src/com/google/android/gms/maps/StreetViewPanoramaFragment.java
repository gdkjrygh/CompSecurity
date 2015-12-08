// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.jx;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            StreetViewPanorama, StreetViewPanoramaOptions, OnStreetViewPanoramaReadyCallback

public class StreetViewPanoramaFragment extends Fragment
{

    private final b all = new b();
    private StreetViewPanorama alm;

    public StreetViewPanoramaFragment()
    {
    }

    public static StreetViewPanoramaFragment newInstance()
    {
        return new StreetViewPanoramaFragment();
    }

    public static StreetViewPanoramaFragment newInstance(StreetViewPanoramaOptions streetviewpanoramaoptions)
    {
        StreetViewPanoramaFragment streetviewpanoramafragment = new StreetViewPanoramaFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("StreetViewPanoramaOptions", streetviewpanoramaoptions);
        streetviewpanoramafragment.setArguments(bundle);
        return streetviewpanoramafragment;
    }

    public final StreetViewPanorama getStreetViewPanorama()
    {
        Object obj = nR();
        if (obj != null)
        {
            try
            {
                obj = ((IStreetViewPanoramaFragmentDelegate) (obj)).getStreetViewPanorama();
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
            if (obj != null)
            {
                if (alm == null || alm.nQ().asBinder() != ((IStreetViewPanoramaDelegate) (obj)).asBinder())
                {
                    alm = new StreetViewPanorama(((IStreetViewPanoramaDelegate) (obj)));
                }
                return alm;
            }
        }
        return null;
    }

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
    {
        jx.aU("getStreetViewPanoramaAsync() must be called on the main thread");
        all.getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
    }

    protected IStreetViewPanoramaFragmentDelegate nR()
    {
        all.nO();
        if (all.je() == null)
        {
            return null;
        } else
        {
            return ((a)all.je()).nR();
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/StreetViewPanoramaFragment.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        b.a(all, activity);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        all.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return all.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        all.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView()
    {
        all.onDestroyView();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        b.a(all, activity);
        attributeset = new Bundle();
        all.onInflate(activity, attributeset, bundle);
    }

    public void onLowMemory()
    {
        all.onLowMemory();
        super.onLowMemory();
    }

    public void onPause()
    {
        all.onPause();
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        all.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/StreetViewPanoramaFragment.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        all.onSaveInstanceState(bundle);
    }

    public void setArguments(Bundle bundle)
    {
        super.setArguments(bundle);
    }

    /* member class not found */
    class b {}


    /* member class not found */
    class a {}

}
