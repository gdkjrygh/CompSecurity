// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWalletRequest;

// Referenced classes of package com.google.android.gms.internal:
//            qg, qh

class gleApiClient extends com.google.android.gms.wallet.t.b
{

    final int afG;
    final qg awA;
    final FullWalletRequest awC;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((qh));
    }

    protected void a(qh qh1)
    {
        qh1.a(awC, afG);
        b(Status.Kw);
    }

    gleApiClient(qg qg1, GoogleApiClient googleapiclient, FullWalletRequest fullwalletrequest, int i)
    {
        awA = qg1;
        awC = fullwalletrequest;
        afG = i;
        super(googleapiclient);
    }
}
