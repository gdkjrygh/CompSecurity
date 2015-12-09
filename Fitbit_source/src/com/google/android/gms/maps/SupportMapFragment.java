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
import com.google.android.gms.dynamic.f;
import com.google.android.gms.dynamic.h;
import com.google.android.gms.internal.am;
import com.google.android.gms.maps.internal.ak;
import com.google.android.gms.maps.internal.al;
import com.google.android.gms.maps.internal.b;
import com.google.android.gms.maps.internal.d;
import com.google.android.gms.maps.internal.k;
import com.google.android.gms.maps.internal.p;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps:
//            c, GoogleMapOptions, g, f

public class SupportMapFragment extends Fragment
{
    static class a
        implements k
    {

        private final Fragment a;
        private final d b;

        public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
        {
            try
            {
                layoutinflater = b.a(com.google.android.gms.dynamic.f.a(layoutinflater), com.google.android.gms.dynamic.f.a(viewgroup), bundle);
            }
            // Misplaced declaration of an exception variable
            catch (LayoutInflater layoutinflater)
            {
                throw new RuntimeRemoteException(layoutinflater);
            }
            return (View)com.google.android.gms.dynamic.f.a(layoutinflater);
        }

        public void a()
        {
        }

        public void a(Activity activity, Bundle bundle, Bundle bundle1)
        {
            bundle = (GoogleMapOptions)bundle.getParcelable("MapOptions");
            try
            {
                b.a(com.google.android.gms.dynamic.f.a(activity), bundle, bundle1);
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
                ak.a(bundle1, "MapOptions", bundle.getParcelable("MapOptions"));
            }
            b.a(bundle1);
            return;
            bundle;
            throw new RuntimeRemoteException(bundle);
        }

        public void a(g g1)
        {
            try
            {
                b.a(new com.google.android.gms.maps.internal.aa.a(this, g1) {

                    final g a;
                    final a b;

                    public void a(com.google.android.gms.maps.internal.b b1)
                        throws RemoteException
                    {
                        a.a(new c(b1));
                    }

            
            {
                b = a1;
                a = g1;
                super();
            }
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (g g1)
            {
                throw new RuntimeRemoteException(g1);
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

        public d h()
        {
            return b;
        }

        public a(Fragment fragment, d d1)
        {
            b = (d)am.a(d1);
            a = (Fragment)am.a(fragment);
        }
    }

    static class b extends com.google.android.gms.dynamic.b
    {

        protected h a;
        private final Fragment b;
        private Activity c;
        private final List d = new ArrayList();

        private void a(Activity activity)
        {
            c = activity;
            i();
        }

        static void a(b b1, Activity activity)
        {
            b1.a(activity);
        }

        protected void a(h h1)
        {
            a = h1;
            i();
        }

        public void a(g g1)
        {
            if (a() != null)
            {
                ((a)a()).a(g1);
                return;
            } else
            {
                d.add(g1);
                return;
            }
        }

        public void i()
        {
            if (c == null || a == null || a() != null)
            {
                break MISSING_BLOCK_LABEL_132;
            }
            try
            {
                f.a(c);
                d d1 = al.a(c).b(f.a(c));
                a.a(new a(b, d1));
                g g1;
                for (Iterator iterator = d.iterator(); iterator.hasNext(); ((a)a()).a(g1))
                {
                    g1 = (g)iterator.next();
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

        b(Fragment fragment)
        {
            b = fragment;
        }
    }


    private final b a = new b(this);
    private c b;

    public SupportMapFragment()
    {
    }

    public static SupportMapFragment a(GoogleMapOptions googlemapoptions)
    {
        SupportMapFragment supportmapfragment = new SupportMapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googlemapoptions);
        supportmapfragment.setArguments(bundle);
        return supportmapfragment;
    }

    public static SupportMapFragment c()
    {
        return new SupportMapFragment();
    }

    public void a(g g)
    {
        am.b("getMapAsync must be called on the main thread.");
        a.a(g);
    }

    protected d d()
    {
        a.i();
        if (a.a() == null)
        {
            return null;
        } else
        {
            return ((a)a.a()).h();
        }
    }

    public final c e()
    {
        Object obj = d();
        if (obj != null)
        {
            try
            {
                obj = ((d) (obj)).a();
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
            if (obj != null)
            {
                if (b == null || b.a().asBinder() != ((com.google.android.gms.maps.internal.b) (obj)).asBinder())
                {
                    b = new c(((com.google.android.gms.maps.internal.b) (obj)));
                }
                return b;
            }
        }
        return null;
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
        b.a(a, activity);
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
        b.a(a, activity);
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
            bundle.setClassLoader(com/google/android/gms/maps/SupportMapFragment.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        a.b(bundle);
    }

    public void setArguments(Bundle bundle)
    {
        super.setArguments(bundle);
    }
}
