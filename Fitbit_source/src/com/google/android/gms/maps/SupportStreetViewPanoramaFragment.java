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
import com.google.android.gms.internal.am;
import com.google.android.gms.maps.internal.g;
import com.google.android.gms.maps.internal.h;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            j, StreetViewPanoramaOptions, h

public class SupportStreetViewPanoramaFragment extends Fragment
{

    private final b a = new b();
    private j b;

    public SupportStreetViewPanoramaFragment()
    {
    /* block-local class not found */
    class b {}

    }

    public static SupportStreetViewPanoramaFragment a()
    {
        return new SupportStreetViewPanoramaFragment();
    }

    public static SupportStreetViewPanoramaFragment a(StreetViewPanoramaOptions streetviewpanoramaoptions)
    {
        SupportStreetViewPanoramaFragment supportstreetviewpanoramafragment = new SupportStreetViewPanoramaFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("StreetViewPanoramaOptions", streetviewpanoramaoptions);
        supportstreetviewpanoramafragment.setArguments(bundle);
        return supportstreetviewpanoramafragment;
    }

    public void a(com.google.android.gms.maps.h h1)
    {
        am.b("getStreetViewPanoramaAsync() must be called on the main thread");
        a.a(h1);
    }

    protected h b()
    {
        a.i();
    /* block-local class not found */
    class a {}

        if (a.a() == null)
        {
            return null;
        } else
        {
            return ((a)a.a()).h();
        }
    }

    public final j c()
    {
        Object obj = b();
        if (obj != null)
        {
            try
            {
                obj = ((h) (obj)).a();
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
            if (obj != null)
            {
                if (b == null || b.a().asBinder() != ((g) (obj)).asBinder())
                {
                    b = new j(((g) (obj)));
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
            bundle.setClassLoader(com/google/android/gms/maps/SupportStreetViewPanoramaFragment.getClassLoader());
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
            bundle.setClassLoader(com/google/android/gms/maps/SupportStreetViewPanoramaFragment.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        a.b(bundle);
    }

    public void setArguments(Bundle bundle)
    {
        super.setArguments(bundle);
    }
}
