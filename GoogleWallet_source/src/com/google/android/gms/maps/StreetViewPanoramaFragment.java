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
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.internal.kn;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.internal.c;
import com.google.android.gms.maps.internal.w;
import com.google.android.gms.maps.internal.x;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps:
//            OnStreetViewPanoramaReadyCallback, StreetViewPanorama, MapsInitializer

public class StreetViewPanoramaFragment extends Fragment
{
    static final class a
        implements StreetViewLifecycleDelegate
    {

        private final Fragment afI;
        private final IStreetViewPanoramaFragmentDelegate azt;

        public final void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
        {
            try
            {
                azt.getStreetViewPanoramaAsync(new com.google.android.gms.maps.internal.u.a(this, onstreetviewpanoramareadycallback) {

                    final OnStreetViewPanoramaReadyCallback azu;
                    final a azv;

                    public final void a(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
                        throws RemoteException
                    {
                        OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback = azu;
                        new StreetViewPanorama(istreetviewpanoramadelegate);
                    }

            
            {
                azv = a1;
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
            bundle = afI.getArguments();
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

        public a(Fragment fragment, IStreetViewPanoramaFragmentDelegate istreetviewpanoramafragmentdelegate)
        {
            azt = (IStreetViewPanoramaFragmentDelegate)kn.k(istreetviewpanoramafragmentdelegate);
            afI = (Fragment)kn.k(fragment);
        }
    }

    static final class b extends com.google.android.gms.dynamic.a
    {

        private final Fragment afI;
        protected f azc;
        private final List azw = new ArrayList();
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
                IStreetViewPanoramaFragmentDelegate istreetviewpanoramafragmentdelegate = x.V(mActivity).n(e.q(mActivity));
                azc.a(new a(afI, istreetviewpanoramafragmentdelegate));
                OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback;
                for (Iterator iterator = azw.iterator(); iterator.hasNext(); ((a)lf()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback))
                {
                    onstreetviewpanoramareadycallback = (OnStreetViewPanoramaReadyCallback)iterator.next();
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
            azw.clear();
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
            afI = fragment;
        }
    }


    private final b azr = new b(this);

    public StreetViewPanoramaFragment()
    {
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
        b.a(azr, activity);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        azr.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return azr.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        azr.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView()
    {
        azr.onDestroyView();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        b.a(azr, activity);
        attributeset = new Bundle();
        azr.onInflate(activity, attributeset, bundle);
    }

    public void onLowMemory()
    {
        azr.onLowMemory();
        super.onLowMemory();
    }

    public void onPause()
    {
        azr.onPause();
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        azr.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/StreetViewPanoramaFragment.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        azr.onSaveInstanceState(bundle);
    }

    public void setArguments(Bundle bundle)
    {
        super.setArguments(bundle);
    }
}
