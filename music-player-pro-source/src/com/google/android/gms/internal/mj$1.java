// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.data.DataSet;

// Referenced classes of package com.google.android.gms.internal:
//            mj, lu, lz

class gleApiClient extends gleApiClient
{

    final DataSet Ve;
    final mj Vf;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((lu));
    }

    protected void a(lu lu1)
        throws RemoteException
    {
        ementation.b b = new <init>(this);
        String s = lu1.getContext().getPackageName();
        lu1.jM().a((new com.google.android.gms.fitness.request.init>()).(Ve).U(), b, s);
    }

    gleApiClient(mj mj1, GoogleApiClient googleapiclient, DataSet dataset)
    {
        Vf = mj1;
        Ve = dataset;
        super(googleapiclient);
    }
}
