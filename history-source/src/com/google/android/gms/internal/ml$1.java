// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.m;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;

// Referenced classes of package com.google.android.gms.internal:
//            ml, lu, lz

class gleApiClient extends gleApiClient
{

    final m Vk;
    final ml Vl;

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
        lu1.jM().a(Vk, b, s);
    }

    protected Result c(Status status)
    {
        return y(status);
    }

    protected ListSubscriptionsResult y(Status status)
    {
        return ListSubscriptionsResult.F(status);
    }

    gleApiClient(ml ml1, GoogleApiClient googleapiclient, m m)
    {
        Vl = ml1;
        Vk = m;
        super(googleapiclient);
    }
}
