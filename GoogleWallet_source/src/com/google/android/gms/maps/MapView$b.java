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

static final class azk extends a
{

    protected f azc;
    private final List azd = new ArrayList();
    private final ViewGroup azj;
    private final GoogleMapOptions azk;
    private final Context mContext;

    private void qc()
    {
        if (azc == null || lf() != null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        try
        {
            com.google.android.gms.maps.internal.IMapViewDelegate imapviewdelegate = x.V(mContext).a(e.q(mContext), azk);
            azc.a(new <init>(azj, imapviewdelegate));
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

    protected final void a(f f1)
    {
        azc = f1;
        qc();
    }

    ptions(ViewGroup viewgroup, Context context, GoogleMapOptions googlemapoptions)
    {
        azj = viewgroup;
        mContext = context;
        azk = googlemapoptions;
    }
}
