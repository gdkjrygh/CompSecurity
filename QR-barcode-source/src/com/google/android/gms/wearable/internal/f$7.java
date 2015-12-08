// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataItemAsset;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            d, f, aw

class nit> extends d
{

    final f avn;
    final DataItemAsset avp;

    protected volatile void a(com.google.android.gms.common.api.a a1)
        throws RemoteException
    {
        a((aw)a1);
    }

    protected void a(aw aw1)
        throws RemoteException
    {
        aw1.a(this, avp);
    }

    protected com.google.android.gms.wearable.Api.GetFdForAssetResult aI(Status status)
    {
        return new <init>(status, null);
    }

    protected Result c(Status status)
    {
        return aI(status);
    }

    (f f1, DataItemAsset dataitemasset)
    {
        avn = f1;
        avp = dataitemasset;
        super();
    }
}
