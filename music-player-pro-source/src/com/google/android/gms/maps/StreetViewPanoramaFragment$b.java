// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.RemoteException;
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
//            StreetViewPanoramaFragment, MapsInitializer, OnStreetViewPanoramaReadyCallback

static class TG extends a
{

    private final Fragment TG;
    protected f akW;
    private final List alq = new ArrayList();
    private Activity nB;

    static void a(TG tg, Activity activity)
    {
        tg.setActivity(activity);
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

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
    {
        if (je() != null)
        {
            ((je)je()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
            return;
        } else
        {
            alq.add(onstreetviewpanoramareadycallback);
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
            com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate istreetviewpanoramafragmentdelegate = x.S(nB).k(e.k(nB));
            akW.a(new <init>(TG, istreetviewpanoramafragmentdelegate));
            OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback;
            for (Iterator iterator = alq.iterator(); iterator.hasNext(); ((alq)je()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback))
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
        alq.clear();
    }

    bleException(Fragment fragment)
    {
        TG = fragment;
    }
}
