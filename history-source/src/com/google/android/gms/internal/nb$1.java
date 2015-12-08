// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            nb, nk

class gleApiClient extends gleApiClient
{

    final long agA;
    final PendingIntent agB;
    final nb agC;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((nk));
    }

    protected void a(nk nk1)
        throws RemoteException
    {
        nk1.a(agA, agB);
        b(Status.Kw);
    }

    gleApiClient(nb nb1, GoogleApiClient googleapiclient, long l, PendingIntent pendingintent)
    {
        agC = nb1;
        agA = l;
        agB = pendingintent;
        super(googleapiclient);
    }
}
