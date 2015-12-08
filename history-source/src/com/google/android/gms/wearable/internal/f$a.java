// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            d, f, ba

private static final class ner extends d
{

    private com.google.android.gms.wearable.Api.DataListener axC;
    private IntentFilter axD[];

    protected volatile void a(com.google.android.gms.common.api.a a1)
        throws RemoteException
    {
        a((ba)a1);
    }

    protected void a(ba ba1)
        throws RemoteException
    {
        ba1.a(this, axC, axD);
        axC = null;
        axD = null;
    }

    public Status b(Status status)
    {
        axC = null;
        axD = null;
        return status;
    }

    public Result c(Status status)
    {
        return b(status);
    }

    private ient(GoogleApiClient googleapiclient, com.google.android.gms.wearable.Api.DataListener datalistener, IntentFilter aintentfilter[])
    {
        super(googleapiclient);
        axC = datalistener;
        axD = aintentfilter;
    }

    ner(GoogleApiClient googleapiclient, com.google.android.gms.wearable.Api.DataListener datalistener, IntentFilter aintentfilter[], ner ner)
    {
        this(googleapiclient, datalistener, aintentfilter);
    }
}
