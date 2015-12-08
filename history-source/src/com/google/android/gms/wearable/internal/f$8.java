// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            d, f, ba

class ient extends d
{

    final com.google.android.gms.wearable.Api.DataListener axB;
    final f axy;

    protected volatile void a(com.google.android.gms.common.api.a a1)
        throws RemoteException
    {
        a((ba)a1);
    }

    protected void a(ba ba1)
        throws RemoteException
    {
        ba1.a(this, axB);
    }

    public Status b(Status status)
    {
        return status;
    }

    public Result c(Status status)
    {
        return b(status);
    }

    ient(f f1, GoogleApiClient googleapiclient, com.google.android.gms.wearable.Api.DataListener datalistener)
    {
        axy = f1;
        axB = datalistener;
        super(googleapiclient);
    }
}
