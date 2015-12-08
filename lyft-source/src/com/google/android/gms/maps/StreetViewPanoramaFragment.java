// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class StreetViewPanoramaFragment extends Fragment
{

    private final zzb a = new zzb(this);

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
        zzb.a(a, activity);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a.a(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return a.a(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        a.g();
        super.onDestroy();
    }

    public void onDestroyView()
    {
        a.f();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        zzb.a(a, activity);
        attributeset = new Bundle();
        a.a(activity, attributeset, bundle);
    }

    public void onLowMemory()
    {
        a.h();
        super.onLowMemory();
    }

    public void onPause()
    {
        a.d();
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        a.c();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/StreetViewPanoramaFragment.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        a.b(bundle);
    }

    public void setArguments(Bundle bundle)
    {
        super.setArguments(bundle);
    }

    private class zzb extends zza
    {

        protected zzf a;
        private final Fragment b;
        private Activity c;
        private final List d = new ArrayList();

        private void a(Activity activity)
        {
            c = activity;
            i();
        }

        static void a(zzb zzb1, Activity activity)
        {
            zzb1.a(activity);
        }

        protected void a(zzf zzf1)
        {
            a = zzf1;
            i();
        }

        public void i()
        {
            if (c == null || a == null || a() != null)
            {
                break MISSING_BLOCK_LABEL_132;
            }
            try
            {
                MapsInitializer.a(c);
                IStreetViewPanoramaFragmentDelegate istreetviewpanoramafragmentdelegate = zzy.a(c).c(zze.a(c));
                a.a(new zza(b, istreetviewpanoramafragmentdelegate));
                OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback;
                for (Iterator iterator = d.iterator(); iterator.hasNext(); ((zza)a()).a(onstreetviewpanoramareadycallback))
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
            d.clear();
        }

        zzb(Fragment fragment)
        {
            b = fragment;
        }

        private class zza
            implements StreetViewLifecycleDelegate
        {

            private final Fragment a;
            private final IStreetViewPanoramaFragmentDelegate b;

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
                try
                {
                    b.a(zze.a(activity), null, bundle1);
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
                if (bundle.containsKey("StreetViewPanoramaOptions"))
                {
                    zzx.a(bundle1, "StreetViewPanoramaOptions", bundle.getParcelable("StreetViewPanoramaOptions"));
                }
                b.a(bundle1);
                return;
                bundle;
                throw new RuntimeRemoteException(bundle);
            }

            public void a(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
            {
                try
                {
                    b.a(new com.google.android.gms.maps.internal.zzv.zza(onstreetviewpanoramareadycallback) {

                        final OnStreetViewPanoramaReadyCallback a;
                        final zza b;

                        public void a(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
                        {
                            a.a(new StreetViewPanorama(istreetviewpanoramadelegate));
                        }

                    
                    {
                        b = zza.this;
                        a = onstreetviewpanoramareadycallback;
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

            public zza(Fragment fragment, IStreetViewPanoramaFragmentDelegate istreetviewpanoramafragmentdelegate)
            {
                b = (IStreetViewPanoramaFragmentDelegate)zzu.a(istreetviewpanoramafragmentdelegate);
                a = (Fragment)zzu.a(fragment);
            }
        }

    }

}
