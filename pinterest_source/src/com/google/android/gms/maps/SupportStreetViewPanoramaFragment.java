// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
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

public class SupportStreetViewPanoramaFragment extends Fragment
{

    private final b alF = new b();
    private StreetViewPanorama alm;

    public SupportStreetViewPanoramaFragment()
    {
    }

    public static SupportStreetViewPanoramaFragment newInstance()
    {
        return new SupportStreetViewPanoramaFragment();
    }

    public static SupportStreetViewPanoramaFragment newInstance(StreetViewPanoramaOptions streetviewpanoramaoptions)
    {
        SupportStreetViewPanoramaFragment supportstreetviewpanoramafragment = new SupportStreetViewPanoramaFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("StreetViewPanoramaOptions", streetviewpanoramaoptions);
        supportstreetviewpanoramafragment.setArguments(bundle);
        return supportstreetviewpanoramafragment;
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
        alF.getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
    }

    protected IStreetViewPanoramaFragmentDelegate nR()
    {
        alF.nO();
        if (alF.je() == null)
        {
            return null;
        } else
        {
            return ((a)alF.je()).nR();
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/SupportStreetViewPanoramaFragment.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        b.a(alF, activity);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        alF.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return alF.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        alF.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView()
    {
        alF.onDestroyView();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        b.a(alF, activity);
        attributeset = new Bundle();
        alF.onInflate(activity, attributeset, bundle);
    }

    public void onLowMemory()
    {
        alF.onLowMemory();
        super.onLowMemory();
    }

    public void onPause()
    {
        alF.onPause();
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        alF.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/SupportStreetViewPanoramaFragment.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        alF.onSaveInstanceState(bundle);
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
