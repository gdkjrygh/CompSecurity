// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataItemBuffer;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            d, f, aw

class nit> extends d
{

    final Uri aky;
    final f avn;

    protected volatile void a(com.google.android.gms.common.api.a a1)
        throws RemoteException
    {
        a((aw)a1);
    }

    protected void a(aw aw1)
        throws RemoteException
    {
        aw1.b(this, aky);
    }

    protected DataItemBuffer aG(Status status)
    {
        return new DataItemBuffer(DataHolder.as(status.getStatusCode()));
    }

    protected Result c(Status status)
    {
        return aG(status);
    }

    r(f f1, Uri uri)
    {
        avn = f1;
        aky = uri;
        super();
    }
}
