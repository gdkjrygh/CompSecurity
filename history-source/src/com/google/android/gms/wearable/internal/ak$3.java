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
    final com.google.android.gms.wearable.pi.NodeListener axY;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((ba));
    }

    protected void a(ba ba1)
        throws RemoteException
    {
        ba1.b(this, axY);
    }

    public Status b(Status status)
    {
        return status;
    }

    public Result c(Status status)
    {
        return b(status);
    }

    ent(ak ak1, GoogleApiClient googleapiclient, com.google.android.gms.wearable.pi.NodeListener nodelistener)
    {
        axX = ak1;
        axY = nodelistener;
        super(googleapiclient);
    }
}
