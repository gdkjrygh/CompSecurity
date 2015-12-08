// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.result.BleDevicesResult;

// Referenced classes of package com.google.android.gms.internal:
//            mh, lu, lz

class gleApiClient extends gleApiClient
{

    final mh UX;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((lu));
    }

    protected void a(lu lu1)
        throws RemoteException
    {
        ementation.b b = new <init>(this, null);
        String s = lu1.getContext().getPackageName();
        lu1.jM().a(b, s);
    }

    protected Result c(Status status)
    {
        return v(status);
    }

    protected BleDevicesResult v(Status status)
    {
        return BleDevicesResult.C(status);
    }

    gleApiClient(mh mh1, GoogleApiClient googleapiclient)
    {
        UX = mh1;
        super(googleapiclient);
    }
}
