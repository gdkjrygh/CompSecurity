// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            d, ag, aw

class it> extends d
{

    final ag avF;
    final com.google.android.gms.wearable.geApi.MessageListener avG;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((aw));
    }

    protected void a(aw aw1)
        throws RemoteException
    {
        aw1.a(this, avG);
    }

    public Result c(Status status)
    {
        return d(status);
    }

    public Status d(Status status)
    {
        return new Status(13);
    }

    istener(ag ag1, com.google.android.gms.wearable.geApi.MessageListener messagelistener)
    {
        avF = ag1;
        avG = messagelistener;
        super();
    }
}
