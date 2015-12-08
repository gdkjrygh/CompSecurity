// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.b;

// Referenced classes of package com.google.android.gms.internal:
//            mh, lu, lz

class gleApiClient extends gleApiClient
{

    final mh UX;
    final BleDevice Va;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((lu));
    }

    protected void a(lu lu1)
        throws RemoteException
    {
        ementation.b b1 = new <init>(this);
        String s = lu1.getContext().getPackageName();
        lu1.jM().a(new b(Va), b1, s);
    }

    gleApiClient(mh mh1, GoogleApiClient googleapiclient, BleDevice bledevice)
    {
        UX = mh1;
        Va = bledevice;
        super(googleapiclient);
    }
}
