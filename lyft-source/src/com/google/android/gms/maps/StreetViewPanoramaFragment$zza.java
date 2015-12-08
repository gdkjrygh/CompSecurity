// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.internal.zzx;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            OnStreetViewPanoramaReadyCallback, StreetViewPanorama

class a
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
                final StreetViewPanoramaFragment.zza b;

                public void a(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
                {
                    a.a(new StreetViewPanorama(istreetviewpanoramadelegate));
                }

            
            {
                b = StreetViewPanoramaFragment.zza.this;
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

    public gmentDelegate(Fragment fragment, IStreetViewPanoramaFragmentDelegate istreetviewpanoramafragmentdelegate)
    {
        b = (IStreetViewPanoramaFragmentDelegate)zzu.a(istreetviewpanoramafragmentdelegate);
        a = (Fragment)zzu.a(fragment);
    }
}
