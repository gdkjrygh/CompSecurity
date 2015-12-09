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
//            StreetViewPanoramaView, OnStreetViewPanoramaReadyCallback, StreetViewPanoramaOptions

static final class azI extends a
{

    private final StreetViewPanoramaOptions azI;
    protected f azc;
    private final ViewGroup azj;
    private final List azw = new ArrayList();
    private final Context mContext;

    private void qc()
    {
        if (azc == null || lf() != null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        try
        {
            com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate istreetviewpanoramaviewdelegate = x.V(mContext).a(e.q(mContext), azI);
            azc.a(new <init>(azj, istreetviewpanoramaviewdelegate));
            OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback;
            for (Iterator iterator = azw.iterator(); iterator.hasNext(); ((azw)lf()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback))
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
        azw.clear();
    }

    protected final void a(f f1)
    {
        azc = f1;
        qc();
    }

    (ViewGroup viewgroup, Context context, StreetViewPanoramaOptions streetviewpanoramaoptions)
    {
        azj = viewgroup;
        mContext = context;
        azI = streetviewpanoramaoptions;
    }
}
