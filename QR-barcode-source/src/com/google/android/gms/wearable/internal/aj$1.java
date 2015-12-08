// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            d, aj, aw

class it> extends d
{

    final aj avJ;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((aw));
    }

    protected void a(aw aw1)
        throws RemoteException
    {
        aw1.p(this);
    }

    protected com.google.android.gms.wearable.pi.GetLocalNodeResult aK(Status status)
    {
        return new <init>(status, null);
    }

    protected Result c(Status status)
    {
        return aK(status);
    }

    alNodeResult(aj aj1)
    {
        avJ = aj1;
        super();
    }
}
