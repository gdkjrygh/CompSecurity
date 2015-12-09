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

static class St extends a
{

    protected f RV;
    private final ViewGroup Sa;
    private final StreetViewPanoramaOptions St;
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
        com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate istreetviewpanoramaviewdelegate = u.A(mContext).a(e.h(mContext), St);
        RV.a(new <init>(Sa, istreetviewpanoramaviewdelegate));
        return;
        Object obj;
        obj;
        throw new RuntimeRemoteException(((RemoteException) (obj)));
        obj;
    }

    (ViewGroup viewgroup, Context context, StreetViewPanoramaOptions streetviewpanoramaoptions)
    {
        Sa = viewgroup;
        mContext = context;
        St = streetviewpanoramaoptions;
    }
}
