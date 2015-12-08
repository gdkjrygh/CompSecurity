// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            oz, pe

final class gleApiClient extends gleApiClient
{

    final PendingIntent avi;
    final oz avo;

    private void a(pe pe1)
        throws RemoteException
    {
        pe1.removeLocationUpdates(avi);
        b(Status.Th);
    }

    protected final volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((pe));
    }

    gleApiClient(oz oz1, GoogleApiClient googleapiclient, PendingIntent pendingintent)
    {
        avo = oz1;
        avi = pendingintent;
        super(googleapiclient);
    }
}
