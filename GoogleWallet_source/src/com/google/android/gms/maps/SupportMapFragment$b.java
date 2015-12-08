// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.maps.internal.c;
import com.google.android.gms.maps.internal.x;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps:
//            SupportMapFragment, MapsInitializer, OnMapReadyCallback

static final class VB extends a
{

    private final Fragment VB;
    protected f azc;
    private final List azd = new ArrayList();
    private Activity mActivity;

    static void a(VB vb, Activity activity)
    {
        vb.setActivity(activity);
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
            com.google.android.gms.maps.internal.IMapFragmentDelegate imapfragmentdelegate = x.V(mActivity).m(e.q(mActivity));
            azc.a(new <init>(VB, imapfragmentdelegate));
            OnMapReadyCallback onmapreadycallback;
            for (Iterator iterator = azd.iterator(); iterator.hasNext(); ((azd)lf()).getMapAsync(onmapreadycallback))
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
        azd.clear();
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

    otAvailableException(Fragment fragment)
    {
        VB = fragment;
    }
}
