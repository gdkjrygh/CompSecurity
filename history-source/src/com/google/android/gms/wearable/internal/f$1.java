// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.PutDataRequest;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            d, f, ba

class ient extends d
{

    final PutDataRequest axx;
    final f axy;

    protected volatile void a(com.google.android.gms.common.api.a a1)
        throws RemoteException
    {
        a((ba)a1);
    }

    protected void a(ba ba1)
        throws RemoteException
    {
        ba1.a(this, axx);
    }

    public com.google.android.gms.wearable.Api.DataItemResult aE(Status status)
    {
        return new <init>(status, null);
    }

    public Result c(Status status)
    {
        return aE(status);
    }

    ient(f f1, GoogleApiClient googleapiclient, PutDataRequest putdatarequest)
    {
        axy = f1;
        axx = putdatarequest;
        super(googleapiclient);
    }
}
