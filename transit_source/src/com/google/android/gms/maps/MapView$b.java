// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.c;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.internal.q;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            MapView, GoogleMapOptions

static class pR extends a
{

    private final Context mContext;
    protected d pL;
    private final ViewGroup pQ;
    private final GoogleMapOptions pR;

    protected void a(d d1)
    {
        pL = d1;
        cE();
    }

    public void cE()
    {
        if (pL == null || bP() != null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        com.google.android.gms.maps.internal.IMapViewDelegate imapviewdelegate = q.u(mContext).a(c.g(mContext), pR);
        pL.a(new <init>(pQ, imapviewdelegate));
        return;
        Object obj;
        obj;
        throw new RuntimeRemoteException(((RemoteException) (obj)));
        obj;
    }

    ptions(ViewGroup viewgroup, Context context, GoogleMapOptions googlemapoptions)
    {
        pQ = viewgroup;
        mContext = context;
        pR = googlemapoptions;
    }
}
