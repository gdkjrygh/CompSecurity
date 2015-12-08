// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            nf, nk

class gleApiClient extends gleApiClient
{

    final nf agH;
    final boolean agK;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((nk));
    }

    protected void a(nk nk1)
        throws RemoteException
    {
        nk1.S(agK);
        b(Status.Kw);
    }

    gleApiClient(nf nf1, GoogleApiClient googleapiclient, boolean flag)
    {
        agH = nf1;
        agK = flag;
        super(googleapiclient);
    }
}
