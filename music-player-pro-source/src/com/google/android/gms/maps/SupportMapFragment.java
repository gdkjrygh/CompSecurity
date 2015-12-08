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
import com.google.android.gms.internal.jx;
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
//            GoogleMap, GoogleMapOptions, OnMapReadyCallback, MapsInitializer

public class SupportMapFragment extends Fragment
{
    static class a
        implements MapLifecycleDelegate
    {

        private final Fragment Mx;
        private final IMapFragmentDelegate akT;

        public void getMapAsync(OnMapReadyCallback onmapreadycallback)
        {
            try
            {
                akT.getMapAsync(new com.google.android.gms.maps.internal.m.a(this, onmapreadycallback) {

                    final OnMapReadyCallback akU;
                    final a alE;

                    public void a(IGoogleMapDelegate igooglemapdelegate)
                        throws RemoteException
                    {
                        akU.onMapReady(new GoogleMap(igooglemapdelegate));
                    }

            
            {
                alE = a1;
                akU = onmapreadycallback;
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

        public IMapFragmentDelegate nN()
        {
            return akT;
        }

        public void onCreate(Bundle bundle)
        {
            Bundle bundle1;
            bundle1 = bundle;
            if (bundle != null)
            {
                break MISSING_BLOCK_LABEL_14;
            }
            bundle1 = new Bundle();
            bundle = Mx.getArguments();
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_47;
            }
            if (bundle.containsKey("MapOptions"))
            {
                w.a(bundle1, "MapOptions", bundle.getParcelable("MapOptions"));
            }
            akT.onCreate(bundle1);
            return;
            bundle;
            throw new RuntimeRemoteException(bundle);
        }

        public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
        {
            try
            {
                layoutinflater = akT.onCreateView(e.k(layoutinflater), e.k(viewgroup), bundle);
            }
            // Misplaced declaration of an exception variable
            catch (LayoutInflater layoutinflater)
            {
                throw new RuntimeRemoteException(layoutinflater);
            }
            return (View)e.f(layoutinflater);
        }

        public void onDestroy()
        {
            try
            {
                akT.onDestroy();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public void onDestroyView()
        {
            try
            {
                akT.onDestroyView();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
        {
            bundle = (GoogleMapOptions)bundle.getParcelable("MapOptions");
            try
            {
                akT.onInflate(e.k(activity), bundle, bundle1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                throw new RuntimeRemoteException(activity);
            }
        }

        public void onLowMemory()
        {
            try
            {
                akT.onLowMemory();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public void onPause()
        {
            try
            {
                akT.onPause();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public void onResume()
        {
            try
            {
                akT.onResume();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public void onSaveInstanceState(Bundle bundle)
        {
            try
            {
                akT.onSaveInstanceState(bundle);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw new RuntimeRemoteException(bundle);
            }
        }

        public void onStart()
        {
        }

        public void onStop()
        {
        }

        public a(Fragment fragment, IMapFragmentDelegate imapfragmentdelegate)
        {
            akT = (IMapFragmentDelegate)jx.i(imapfragmentdelegate);
            Mx = (Fragment)jx.i(fragment);
        }
    }

    static class b extends com.google.android.gms.dynamic.a
    {

        private final Fragment Mx;
        protected f akW;
        private final List akX = new ArrayList();
        private Activity nB;

        static void a(b b1, Activity activity)
        {
            b1.setActivity(activity);
        }

        private void setActivity(Activity activity)
        {
            nB = activity;
            nO();
        }

        protected void a(f f1)
        {
            akW = f1;
            nO();
        }

        public void getMapAsync(OnMapReadyCallback onmapreadycallback)
        {
            if (je() != null)
            {
                ((a)je()).getMapAsync(onmapreadycallback);
                return;
            } else
            {
                akX.add(onmapreadycallback);
                return;
            }
        }

        public void nO()
        {
            if (nB == null || akW == null || je() != null)
            {
                break MISSING_BLOCK_LABEL_132;
            }
            try
            {
                MapsInitializer.initialize(nB);
                IMapFragmentDelegate imapfragmentdelegate = x.S(nB).j(e.k(nB));
                akW.a(new a(Mx, imapfragmentdelegate));
                OnMapReadyCallback onmapreadycallback;
                for (Iterator iterator = akX.iterator(); iterator.hasNext(); ((a)je()).getMapAsync(onmapreadycallback))
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
            akX.clear();
        }

        b(Fragment fragment)
        {
            Mx = fragment;
        }
    }


    private GoogleMap akS;
    private final b alD = new b(this);

    public SupportMapFragment()
    {
    }

    public static SupportMapFragment newInstance()
    {
        return new SupportMapFragment();
    }

    public static SupportMapFragment newInstance(GoogleMapOptions googlemapoptions)
    {
        SupportMapFragment supportmapfragment = new SupportMapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googlemapoptions);
        supportmapfragment.setArguments(bundle);
        return supportmapfragment;
    }

    public final GoogleMap getMap()
    {
        Object obj = nN();
        if (obj != null)
        {
            try
            {
                obj = ((IMapFragmentDelegate) (obj)).getMap();
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
            if (obj != null)
            {
                if (akS == null || akS.nC().asBinder() != ((IGoogleMapDelegate) (obj)).asBinder())
                {
                    akS = new GoogleMap(((IGoogleMapDelegate) (obj)));
                }
                return akS;
            }
        }
        return null;
    }

    public void getMapAsync(OnMapReadyCallback onmapreadycallback)
    {
        jx.aU("getMapAsync must be called on the main thread.");
        alD.getMapAsync(onmapreadycallback);
    }

    protected IMapFragmentDelegate nN()
    {
        alD.nO();
        if (alD.je() == null)
        {
            return null;
        } else
        {
            return ((a)alD.je()).nN();
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/SupportMapFragment.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        b.a(alD, activity);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        alD.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return alD.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        alD.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView()
    {
        alD.onDestroyView();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        b.a(alD, activity);
        attributeset = GoogleMapOptions.createFromAttributes(activity, attributeset);
        Bundle bundle1 = new Bundle();
        bundle1.putParcelable("MapOptions", attributeset);
        alD.onInflate(activity, bundle1, bundle);
    }

    public void onLowMemory()
    {
        alD.onLowMemory();
        super.onLowMemory();
    }

    public void onPause()
    {
        alD.onPause();
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        alD.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/SupportMapFragment.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        alD.onSaveInstanceState(bundle);
    }

    public void setArguments(Bundle bundle)
    {
        super.setArguments(bundle);
    }
}
