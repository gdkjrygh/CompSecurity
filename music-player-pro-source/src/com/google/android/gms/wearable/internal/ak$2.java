// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            d, ak, ba

class ent extends d
{

    final ak axX;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((ba));
    }

    protected void a(ba ba1)
        throws RemoteException
    {
        ba1.p(this);
    }

    protected com.google.android.gms.wearable.pi.GetConnectedNodesResult aK(Status status)
    {
        return new <init>(status, null);
    }

    protected Result c(Status status)
    {
        return aK(status);
    }

    ent(ak ak1, GoogleApiClient googleapiclient)
    {
        axX = ak1;
        super(googleapiclient);
    }
}
