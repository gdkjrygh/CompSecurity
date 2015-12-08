// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            p, r, GetMetadataRequest, ae

class iClient extends iClient
{

    final p PF;
    final String PH;

    protected volatile void a(com.google.android.gms.common.api.a a1)
        throws RemoteException
    {
        a((r)a1);
    }

    protected void a(r r1)
        throws RemoteException
    {
        r1.iG().a(new GetMetadataRequest(DriveId.bi(PH)), new <init>(this));
    }

    iClient(p p1, GoogleApiClient googleapiclient, String s)
    {
        PF = p1;
        PH = s;
        super(googleapiclient);
    }
}
