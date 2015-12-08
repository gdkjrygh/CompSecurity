// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            d, ah, au

class it> extends d
{

    final ah alX;
    final com.google.android.gms.wearable.pi.NodeListener alY;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((au));
    }

    protected void a(au au1)
        throws RemoteException
    {
        au1.a(this, alY);
    }

    public Result c(Status status)
    {
        return d(status);
    }

    public Status d(Status status)
    {
        return new Status(13);
    }

    r(ah ah1, com.google.android.gms.wearable.pi.NodeListener nodelistener)
    {
        alX = ah1;
        alY = nodelistener;
        super();
    }
}
