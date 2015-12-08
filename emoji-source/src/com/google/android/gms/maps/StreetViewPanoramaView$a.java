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
import com.google.android.gms.maps.internal.u;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            StreetViewPanoramaView, StreetViewPanoramaOptions

static class aad extends a
{

    protected f ZF;
    private final ViewGroup ZK;
    private final StreetViewPanoramaOptions aad;
    private final Context mContext;

    protected void a(f f1)
    {
        ZF = f1;
        jz();
    }

    public void jz()
    {
        if (ZF == null || gH() != null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate istreetviewpanoramaviewdelegate = u.H(mContext).a(e.h(mContext), aad);
        ZF.a(new <init>(ZK, istreetviewpanoramaviewdelegate));
        return;
        Object obj;
        obj;
        throw new RuntimeRemoteException(((RemoteException) (obj)));
        obj;
    }

    (ViewGroup viewgroup, Context context, StreetViewPanoramaOptions streetviewpanoramaoptions)
    {
        ZK = viewgroup;
        mContext = context;
        aad = streetviewpanoramaoptions;
    }
}
