// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            qg, qh

class gleApiClient extends com.google.android.gms.wallet.t.b
{

    final int afG;
    final qg awA;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((qh));
    }

    protected void a(qh qh1)
    {
        qh1.gk(afG);
        b(Status.Kw);
    }

    gleApiClient(qg qg1, GoogleApiClient googleapiclient, int i)
    {
        awA = qg1;
        afG = i;
        super(googleapiclient);
    }
}
