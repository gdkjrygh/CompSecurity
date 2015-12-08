// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.internal:
//            r, CancelPendingActionsRequest, bg, ae

class iClient extends iClient
{

    final r PT;
    final List PV;

    protected volatile void a(com.google.android.gms.common.api.a a1)
        throws RemoteException
    {
        a((r)a1);
    }

    protected void a(r r1)
        throws RemoteException
    {
        r1.iG().a(new CancelPendingActionsRequest(PV), new bg(this));
    }

    iClient(r r1, GoogleApiClient googleapiclient, List list)
    {
        PT = r1;
        PV = list;
        super(googleapiclient);
    }
}
