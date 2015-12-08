// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Asset;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            d, f, ba

class ient extends d
{

    final f axy;
    final Asset axz;

    protected volatile void a(com.google.android.gms.common.api.a a1)
        throws RemoteException
    {
        a((ba)a1);
    }

    protected void a(ba ba1)
        throws RemoteException
    {
        ba1.a(this, axz);
    }

    protected com.google.android.gms.wearable.Api.GetFdForAssetResult aH(Status status)
    {
        return new <init>(status, null);
    }

    protected Result c(Status status)
    {
        return aH(status);
    }

    ient(f f1, GoogleApiClient googleapiclient, Asset asset)
    {
        axy = f1;
        axz = asset;
        super(googleapiclient);
    }
}
