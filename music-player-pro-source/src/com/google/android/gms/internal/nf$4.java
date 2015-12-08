// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;

// Referenced classes of package com.google.android.gms.internal:
//            nf, nk

class gleApiClient extends gleApiClient
{

    final PendingIntent agB;
    final LocationRequest agF;
    final nf agH;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((nk));
    }

    protected void a(nk nk1)
        throws RemoteException
    {
        nk1.b(agF, agB);
        b(Status.Kw);
    }

    gleApiClient(nf nf1, GoogleApiClient googleapiclient, LocationRequest locationrequest, PendingIntent pendingintent)
    {
        agH = nf1;
        agF = locationrequest;
        agB = pendingintent;
        super(googleapiclient);
    }
}
