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
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.internal.hm;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.internal.c;
import com.google.android.gms.maps.internal.t;
import com.google.android.gms.maps.internal.u;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            StreetViewPanorama, StreetViewPanoramaOptions, MapsInitializer

public class StreetViewPanoramaFragment extends Fragment
{
    static class a
        implements LifecycleDelegate
    {

        private final Fragment Mj;
        private final IStreetViewPanoramaFragmentDelegate ZU;

        public IStreetViewPanoramaFragmentDelegate jC()
        {
            return ZU;
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
            bundle = Mj.getArguments();
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_47;
            }
            if (bundle.containsKey("StreetViewPanoramaOptions"))
            {
                t.a(bundle1, "StreetViewPanoramaOptions", bundle.getParcelable("StreetViewPanoramaOptions"));
            }
            ZU.onCreate(bundle1);
            return;
            bundle;
            throw new RuntimeRemoteException(bundle);
        }

        public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
        {
            try
            {
                layoutinflater = ZU.onCreateView(e.h(layoutinflater), e.h(viewgroup), bundle);
            }
            // Misplaced declaration of an exception variable
            catch (LayoutInflater layoutinflater)
            {
                throw new RuntimeRemoteException(layoutinflater);
            }
            return (View)e.e(layoutinflater);
        }

        public void onDestroy()
        {
            try
            {
                ZU.onDestroy();
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
                ZU.onDestroyView();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
        {
            try
            {
                ZU.onInflate(e.h(activity), null, bundle1);
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
                ZU.onLowMemory();
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
                ZU.onPause();
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
                ZU.onResume();
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
                ZU.onSaveInstanceState(bundle);
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

        public a(Fragment fragment, IStreetViewPanoramaFragmentDelegate istreetviewpanoramafragmentdelegate)
        {
            ZU = (IStreetViewPanoramaFragmentDelegate)hm.f(istreetviewpanoramafragmentdelegate);
            Mj = (Fragment)hm.f(fragment);
        }
    }

    static class b extends com.google.android.gms.dynamic.a
    {

        private final Fragment Mj;
        protected f ZF;
        private Activity og;

        static void a(b b1, Activity activity)
        {
            b1.setActivity(activity);
        }

        private void setActivity(Activity activity)
        {
            og = activity;
            jz();
        }

        protected void a(f f1)
        {
            ZF = f1;
            jz();
        }

        public void jz()
        {
            if (og == null || ZF == null || gH() != null)
            {
                break MISSING_BLOCK_LABEL_70;
            }
            MapsInitializer.initialize(og);
            IStreetViewPanoramaFragmentDelegate istreetviewpanoramafragmentdelegate = u.H(og).j(e.h(og));
            ZF.a(new a(Mj, istreetviewpanoramafragmentdelegate));
            return;
            Object obj;
            obj;
            throw new RuntimeRemoteException(((RemoteException) (obj)));
            obj;
        }

        b(Fragment fragment)
        {
            Mj = fragment;
        }
    }


    private final b ZS = new b(this);
    private StreetViewPanorama ZT;

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
        Object obj = jC();
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
                if (ZT == null || ZT.jB().asBinder() != ((IStreetViewPanoramaDelegate) (obj)).asBinder())
                {
                    ZT = new StreetViewPanorama(((IStreetViewPanoramaDelegate) (obj)));
                }
                return ZT;
            }
        }
        return null;
    }

    protected IStreetViewPanoramaFragmentDelegate jC()
    {
        ZS.jz();
        if (ZS.gH() == null)
        {
            return null;
        } else
        {
            return ((a)ZS.gH()).jC();
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
        b.a(ZS, activity);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        ZS.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return ZS.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        ZS.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView()
    {
        ZS.onDestroyView();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        b.a(ZS, activity);
        attributeset = new Bundle();
        ZS.onInflate(activity, attributeset, bundle);
    }

    public void onLowMemory()
    {
        ZS.onLowMemory();
        super.onLowMemory();
    }

    public void onPause()
    {
        ZS.onPause();
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        ZS.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/StreetViewPanoramaFragment.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        ZS.onSaveInstanceState(bundle);
    }

    public void setArguments(Bundle bundle)
    {
        super.setArguments(bundle);
    }
}
