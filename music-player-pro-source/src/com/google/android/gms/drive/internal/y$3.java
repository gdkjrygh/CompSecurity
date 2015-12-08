// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.internal:
//            y, r, SetResourceParentsRequest, bg, 
//            ae

class iClient extends iClient
{

    final y Qt;
    final List Qu;

    protected volatile void a(com.google.android.gms.common.api.a a1)
        throws RemoteException
    {
        a((r)a1);
    }

    protected void a(r r1)
        throws RemoteException
    {
        r1.iG().a(new SetResourceParentsRequest(Qt.Oj, Qu), new bg(this));
    }

    iClient(y y1, GoogleApiClient googleapiclient, List list)
    {
        Qt = y1;
        Qu = list;
        super(googleapiclient);
    }
}
