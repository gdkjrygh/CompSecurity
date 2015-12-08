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
import com.google.android.gms.b.e;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.maps.a.aj;
import com.google.android.gms.maps.a.ak;
import com.google.android.gms.maps.a.b;
import com.google.android.gms.maps.a.d;
import com.google.android.gms.maps.a.k;
import com.google.android.gms.maps.a.o;
import com.google.android.gms.maps.model.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps:
//            b, GoogleMapOptions, e, d

public class SupportMapFragment extends Fragment
{
    static final class a
        implements k
    {

        private final Fragment a;
        private final d b;

        public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
        {
            try
            {
                layoutinflater = b.a(com.google.android.gms.b.d.a(layoutinflater), com.google.android.gms.b.d.a(viewgroup), bundle);
            }
            // Misplaced declaration of an exception variable
            catch (LayoutInflater layoutinflater)
            {
                throw new c(layoutinflater);
            }
            return (View)com.google.android.gms.b.d.a(layoutinflater);
        }

        public final void a()
        {
            try
            {
                b.b();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new c(remoteexception);
            }
        }

        public final void a(Activity activity, Bundle bundle, Bundle bundle1)
        {
            bundle = (GoogleMapOptions)bundle.getParcelable("MapOptions");
            try
            {
                b.a(com.google.android.gms.b.d.a(activity), bundle, bundle1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                throw new c(activity);
            }
        }

        public final void a(Bundle bundle)
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
                aj.a(bundle1, "MapOptions", bundle.getParcelable("MapOptions"));
            }
            b.a(bundle1);
            return;
            bundle;
            throw new c(bundle);
        }

        public final void a(com.google.android.gms.maps.e e1)
        {
            try
            {
                b.a(new com.google.android.gms.maps.a.x.a(this, e1) {

                    final com.google.android.gms.maps.e a;
                    final a b;

                    public final void a(com.google.android.gms.maps.a.b b1)
                        throws RemoteException
                    {
                        a.onMapReady(new com.google.android.gms.maps.b(b1));
                    }

            
            {
                b = a1;
                a = e1;
                super();
            }
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (com.google.android.gms.maps.e e1)
            {
                throw new c(e1);
            }
        }

        public final void b()
        {
            try
            {
                b.c();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new c(remoteexception);
            }
        }

        public final void b(Bundle bundle)
        {
            try
            {
                b.b(bundle);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw new c(bundle);
            }
        }

        public final void c()
        {
            try
            {
                b.d();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new c(remoteexception);
            }
        }

        public final void d()
        {
            try
            {
                b.e();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new c(remoteexception);
            }
        }

        public final void e()
        {
            try
            {
                b.f();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new c(remoteexception);
            }
        }

        public final d f()
        {
            return b;
        }

        public a(Fragment fragment, d d1)
        {
            b = (d)y.a(d1);
            a = (Fragment)y.a(fragment);
        }
    }

    static final class b extends com.google.android.gms.b.b
    {

        protected e a;
        private final Fragment b;
        private Activity c;
        private final List d = new ArrayList();

        static void a(b b1, Activity activity)
        {
            b1.c = activity;
            b1.g();
        }

        protected final void a(e e1)
        {
            a = e1;
            g();
        }

        public final void a(com.google.android.gms.maps.e e1)
        {
            if (a() != null)
            {
                ((a)a()).a(e1);
                return;
            } else
            {
                d.add(e1);
                return;
            }
        }

        public final void g()
        {
            if (c == null || a == null || a() != null)
            {
                break MISSING_BLOCK_LABEL_139;
            }
            d d1;
            com.google.android.gms.maps.d.a(c);
            d1 = ak.a(c).b(com.google.android.gms.b.d.a(c));
            if (d1 == null)
            {
                return;
            }
            RemoteException remoteexception;
            a.a(new a(b, d1));
            com.google.android.gms.maps.e e1;
            for (Iterator iterator = d.iterator(); iterator.hasNext(); ((a)a()).a(e1))
            {
                e1 = (com.google.android.gms.maps.e)iterator.next();
            }

            try
            {
                d.clear();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (RemoteException remoteexception)
            {
                throw new c(remoteexception);
            }
            catch (com.google.android.gms.common.c c1) { }
        }

        b(Fragment fragment)
        {
            b = fragment;
        }
    }


    private com.google.android.gms.maps.b zzaFV;
    private final b zzaGH = new b(this);

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

    public final com.google.android.gms.maps.b getMap()
    {
        Object obj = zzwO();
        if (obj != null)
        {
            try
            {
                obj = ((d) (obj)).a();
            }
            catch (RemoteException remoteexception)
            {
                throw new c(remoteexception);
            }
            if (obj != null)
            {
                if (zzaFV == null || zzaFV.a().asBinder() != ((com.google.android.gms.maps.a.b) (obj)).asBinder())
                {
                    zzaFV = new com.google.android.gms.maps.b(((com.google.android.gms.maps.a.b) (obj)));
                }
                return zzaFV;
            }
        }
        return null;
    }

    public void getMapAsync(com.google.android.gms.maps.e e)
    {
        y.b("getMapAsync must be called on the main thread.");
        zzaGH.a(e);
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
        b.a(zzaGH, activity);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        zzaGH.a(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = zzaGH.a(layoutinflater, viewgroup, bundle);
        layoutinflater.setClickable(true);
        return layoutinflater;
    }

    public void onDestroy()
    {
        zzaGH.e();
        super.onDestroy();
    }

    public void onDestroyView()
    {
        zzaGH.d();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        b.a(zzaGH, activity);
        attributeset = GoogleMapOptions.a(activity, attributeset);
        Bundle bundle1 = new Bundle();
        bundle1.putParcelable("MapOptions", attributeset);
        zzaGH.a(activity, bundle1, bundle);
    }

    public void onLowMemory()
    {
        zzaGH.f();
        super.onLowMemory();
    }

    public void onPause()
    {
        zzaGH.c();
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        zzaGH.b();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/SupportMapFragment.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        zzaGH.b(bundle);
    }

    public void setArguments(Bundle bundle)
    {
        super.setArguments(bundle);
    }

    protected d zzwO()
    {
        zzaGH.g();
        if (zzaGH.a() == null)
        {
            return null;
        } else
        {
            return ((a)zzaGH.a()).f();
        }
    }
}
