// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataItemBuffer;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            d, f, ba

class ient extends d
{

    final f axy;

    protected volatile void a(com.google.android.gms.common.api.a a1)
        throws RemoteException
    {
        a((ba)a1);
    }

    protected void a(ba ba1)
        throws RemoteException
    {
        ba1.n(this);
    }

    protected DataItemBuffer aF(Status status)
    {
        return new DataItemBuffer(DataHolder.av(status.getStatusCode()));
    }

    protected Result c(Status status)
    {
        return aF(status);
    }

    ient(f f1, GoogleApiClient googleapiclient)
    {
        axy = f1;
        super(googleapiclient);
    }
}
