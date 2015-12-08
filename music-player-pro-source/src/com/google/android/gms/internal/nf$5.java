// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationListener;

// Referenced classes of package com.google.android.gms.internal:
//            nf, nk

class gleApiClient extends gleApiClient
{

    final LocationListener agG;
    final nf agH;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((nk));
    }

    protected void a(nk nk1)
        throws RemoteException
    {
        nk1.a(agG);
        b(Status.Kw);
    }

    gleApiClient(nf nf1, GoogleApiClient googleapiclient, LocationListener locationlistener)
    {
        agH = nf1;
        agG = locationlistener;
        super(googleapiclient);
    }
}
