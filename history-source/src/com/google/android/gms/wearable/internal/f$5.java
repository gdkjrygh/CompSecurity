// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            d, f, ba

class ient extends d
{

    final Uri amO;
    final f axy;

    protected volatile void a(com.google.android.gms.common.api.a a1)
        throws RemoteException
    {
        a((ba)a1);
    }

    protected void a(ba ba1)
        throws RemoteException
    {
        ba1.c(this, amO);
    }

    protected com.google.android.gms.wearable.Api.DeleteDataItemsResult aG(Status status)
    {
        return new <init>(status, 0);
    }

    protected Result c(Status status)
    {
        return aG(status);
    }

    ient(f f1, GoogleApiClient googleapiclient, Uri uri)
    {
        axy = f1;
        amO = uri;
        super(googleapiclient);
    }
}
