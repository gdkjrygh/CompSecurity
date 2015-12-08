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
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.internal.kn;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.c;
import com.google.android.gms.maps.internal.w;
import com.google.android.gms.maps.internal.x;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions, OnMapReadyCallback, GoogleMap, MapsInitializer

public class SupportMapFragment extends Fragment
{
    static final class a
        implements MapLifecycleDelegate
    {

        private final Fragment VB;
        private final IMapFragmentDelegate ayZ;

        public final void getMapAsync(OnMapReadyCallback onmapreadycallback)
        {
            try
            {
                ayZ.getMapAsync(new com.google.android.gms.maps.internal.m.a(this, onmapreadycallback) {

                    final a azK;
                    final OnMapReadyCallback aza;

                    public final void a(IGoogleMapDelegate igooglemapdelegate)
                        throws RemoteException
                    {
                        OnMapReadyCallback onmapreadycallback = aza;
                        new GoogleMap(igooglemapdelegate);
                    }

            
            {
                azK = a1;
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

        public a(Fragment fragment, IMapFragmentDelegate imapfragmentdelegate)
        {
            ayZ = (IMapFragmentDelegate)kn.k(imapfragmentdelegate);
            VB = (Fragment)kn.k(fragment);
        }
    }

    static final class b extends com.google.android.gms.dynamic.a
    {

        private final Fragment VB;
        protected f azc;
        private final List azd = new ArrayList();
        private Activity mActivity;

        static void a(b b1, Activity activity)
        {
            b1.setActivity(activity);
        }

        private void qc()
        {
            if (mActivity == null || azc == null || lf() != null)
            {
                break MISSING_BLOCK_LABEL_132;
            }
            try
            {
                MapsInitializer.initialize(mActivity);
                IMapFragmentDelegate imapfragmentdelegate = x.V(mActivity).m(e.q(mActivity));
                azc.a(new a(VB, imapfragmentdelegate));
                OnMapReadyCallback onmapreadycallback;
                for (Iterator iterator = azd.iterator(); iterator.hasNext(); ((a)lf()).getMapAsync(onmapreadycallback))
                {
                    onmapreadycallback = (OnMapReadyCallback)iterator.next();
                }

            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
            catch (GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
            {
                return;
            }
            azd.clear();
        }

        private void setActivity(Activity activity)
        {
            mActivity = activity;
            qc();
        }

        protected final void a(f f1)
        {
            azc = f1;
            qc();
        }

        b(Fragment fragment)
        {
            VB = fragment;
        }
    }


    private final b azJ = new b(this);

    public SupportMapFragment()
    {
    }

    public final void onActivityCreated(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/SupportMapFragment.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        b.a(azJ, activity);
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        azJ.onCreate(bundle);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return azJ.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public final void onDestroy()
    {
        azJ.onDestroy();
        super.onDestroy();
    }

    public final void onDestroyView()
    {
        azJ.onDestroyView();
        super.onDestroyView();
    }

    public final void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        b.a(azJ, activity);
        attributeset = GoogleMapOptions.createFromAttributes(activity, attributeset);
        Bundle bundle1 = new Bundle();
        bundle1.putParcelable("MapOptions", attributeset);
        azJ.onInflate(activity, bundle1, bundle);
    }

    public void onLowMemory()
    {
        azJ.onLowMemory();
        super.onLowMemory();
    }

    public final void onPause()
    {
        azJ.onPause();
        super.onPause();
    }

    public final void onResume()
    {
        super.onResume();
        azJ.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/SupportMapFragment.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        azJ.onSaveInstanceState(bundle);
    }

    public final void setArguments(Bundle bundle)
    {
        super.setArguments(bundle);
    }
}
