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
//            MapView, GoogleMapOptions

static class Sb extends a
{

    protected f RV;
    private final ViewGroup Sa;
    private final GoogleMapOptions Sb;
    private final Context mContext;

    protected void a(f f1)
    {
        RV = f1;
        ip();
    }

    public void ip()
    {
        if (RV == null || fW() != null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        com.google.android.gms.maps.internal.IMapViewDelegate imapviewdelegate = u.A(mContext).a(e.h(mContext), Sb);
        RV.a(new <init>(Sa, imapviewdelegate));
        return;
        Object obj;
        obj;
        throw new RuntimeRemoteException(((RemoteException) (obj)));
        obj;
    }

    ptions(ViewGroup viewgroup, Context context, GoogleMapOptions googlemapoptions)
    {
        Sa = viewgroup;
        mContext = context;
        Sb = googlemapoptions;
    }
}
