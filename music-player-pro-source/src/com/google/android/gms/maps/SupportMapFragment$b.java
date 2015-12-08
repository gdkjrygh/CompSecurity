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

static class Mx extends a
{

    private final Fragment Mx;
    protected f akW;
    private final List akX = new ArrayList();
    private Activity nB;

    static void a(Mx mx, Activity activity)
    {
        mx.setActivity(activity);
    }

    private void setActivity(Activity activity)
    {
        nB = activity;
        nO();
    }

    protected void a(f f1)
    {
        akW = f1;
        nO();
    }

    public void getMapAsync(OnMapReadyCallback onmapreadycallback)
    {
        if (je() != null)
        {
            ((je)je()).getMapAsync(onmapreadycallback);
            return;
        } else
        {
            akX.add(onmapreadycallback);
            return;
        }
    }

    public void nO()
    {
        if (nB == null || akW == null || je() != null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        try
        {
            MapsInitializer.initialize(nB);
            com.google.android.gms.maps.internal.IMapFragmentDelegate imapfragmentdelegate = x.S(nB).j(e.k(nB));
            akW.a(new <init>(Mx, imapfragmentdelegate));
            OnMapReadyCallback onmapreadycallback;
            for (Iterator iterator = akX.iterator(); iterator.hasNext(); ((akX)je()).getMapAsync(onmapreadycallback))
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
        akX.clear();
    }

    otAvailableException(Fragment fragment)
    {
        Mx = fragment;
    }
}
