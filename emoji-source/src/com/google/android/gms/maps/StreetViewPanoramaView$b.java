// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.internal.hm;
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            StreetViewPanoramaView

static class ZH
    implements LifecycleDelegate
{

    private final ViewGroup ZH;
    private final IStreetViewPanoramaViewDelegate aae;
    private View aaf;

    public IStreetViewPanoramaViewDelegate jG()
    {
        return aae;
    }

    public void onCreate(Bundle bundle)
    {
        try
        {
            aae.onCreate(bundle);
            aaf = (View)e.e(aae.getView());
            ZH.removeAllViews();
            ZH.addView(aaf);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new RuntimeRemoteException(bundle);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
    }

    public void onDestroy()
    {
        try
        {
            aae.onDestroy();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void onDestroyView()
    {
        throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
    }

    public void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
    {
        throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
    }

    public void onLowMemory()
    {
        try
        {
            aae.onLowMemory();
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
            aae.onPause();
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
            aae.onResume();
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
            aae.onSaveInstanceState(bundle);
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

    public amaViewDelegate(ViewGroup viewgroup, IStreetViewPanoramaViewDelegate istreetviewpanoramaviewdelegate)
    {
        aae = (IStreetViewPanoramaViewDelegate)hm.f(istreetviewpanoramaviewdelegate);
        ZH = (ViewGroup)hm.f(viewgroup);
    }
}
