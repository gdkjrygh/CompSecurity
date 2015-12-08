// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
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
//            MapView, OnMapReadyCallback, GoogleMapOptions

static class ale extends a
{

    protected f akW;
    private final List akX = new ArrayList();
    private final ViewGroup ald;
    private final GoogleMapOptions ale;
    private final Context mContext;

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
        if (akW == null || je() != null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        try
        {
            com.google.android.gms.maps.internal.IMapViewDelegate imapviewdelegate = x.S(mContext).a(e.k(mContext), ale);
            akW.a(new <init>(ald, imapviewdelegate));
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

    ptions(ViewGroup viewgroup, Context context, GoogleMapOptions googlemapoptions)
    {
        ald = viewgroup;
        mContext = context;
        ale = googlemapoptions;
    }
}
