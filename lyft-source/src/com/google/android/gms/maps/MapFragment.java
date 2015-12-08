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

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions

public class MapFragment extends Fragment
{

    private final zzb a = new zzb(this);

    public MapFragment()
    {
    }

    public void onActivityCreated(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/MapFragment.getClassLoader());
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
        layoutinflater = a.a(layoutinflater, viewgroup, bundle);
        layoutinflater.setClickable(true);
        return layoutinflater;
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
        attributeset = GoogleMapOptions.a(activity, attributeset);
        Bundle bundle1 = new Bundle();
        bundle1.putParcelable("MapOptions", attributeset);
        a.a(activity, bundle1, bundle);
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
            bundle.setClassLoader(com/google/android/gms/maps/MapFragment.getClassLoader());
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
                break MISSING_BLOCK_LABEL_139;
            }
            IMapFragmentDelegate imapfragmentdelegate;
            MapsInitializer.a(c);
            imapfragmentdelegate = zzy.a(c).b(zze.a(c));
            if (imapfragmentdelegate == null)
            {
                return;
            }
            RemoteException remoteexception;
            a.a(new zza(b, imapfragmentdelegate));
            OnMapReadyCallback onmapreadycallback;
            for (Iterator iterator = d.iterator(); iterator.hasNext(); ((zza)a()).a(onmapreadycallback))
            {
                onmapreadycallback = (OnMapReadyCallback)iterator.next();
            }

            try
            {
                d.clear();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
            catch (GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception) { }
        }

        zzb(Fragment fragment)
        {
            b = fragment;
        }

        private class zza
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
                        final zza b;

                        public void a(IGoogleMapDelegate igooglemapdelegate)
                        {
                            a.onMapReady(new GoogleMap(igooglemapdelegate));
                        }

                    
                    {
                        b = zza.this;
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

            public zza(Fragment fragment, IMapFragmentDelegate imapfragmentdelegate)
            {
                b = (IMapFragmentDelegate)zzu.a(imapfragmentdelegate);
                a = (Fragment)zzu.a(fragment);
            }
        }

    }

}
