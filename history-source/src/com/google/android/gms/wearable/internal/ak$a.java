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

private static final class r extends d
{

    private com.google.android.gms.wearable.pi.NodeListener axZ;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((ba));
    }

    protected void a(ba ba1)
        throws RemoteException
    {
        ba1.a(this, axZ);
        axZ = null;
    }

    public Status b(Status status)
    {
        axZ = null;
        return status;
    }

    public Result c(Status status)
    {
        return b(status);
    }

    private ent(GoogleApiClient googleapiclient, com.google.android.gms.wearable.pi.NodeListener nodelistener)
    {
        super(googleapiclient);
        axZ = nodelistener;
    }

    r(GoogleApiClient googleapiclient, com.google.android.gms.wearable.pi.NodeListener nodelistener, r r)
    {
        this(googleapiclient, nodelistener);
    }
}
