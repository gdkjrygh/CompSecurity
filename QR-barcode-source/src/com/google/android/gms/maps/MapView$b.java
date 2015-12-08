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

static class aiZ extends a
{

    protected f aiT;
    private final ViewGroup aiY;
    private final GoogleMapOptions aiZ;
    private final Context mContext;

    protected void a(f f1)
    {
        aiT = f1;
        mA();
    }

    public void mA()
    {
        if (aiT == null || it() != null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        com.google.android.gms.maps.internal.IMapViewDelegate imapviewdelegate = u.S(mContext).a(e.k(mContext), aiZ);
        aiT.a(new <init>(aiY, imapviewdelegate));
        return;
        Object obj;
        obj;
        throw new RuntimeRemoteException(((RemoteException) (obj)));
        obj;
    }

    ptions(ViewGroup viewgroup, Context context, GoogleMapOptions googlemapoptions)
    {
        aiY = viewgroup;
        mContext = context;
        aiZ = googlemapoptions;
    }
}
