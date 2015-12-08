// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.drive.internal:
//            s, r, CloseContentsRequest, bg, 
//            ae

class iClient extends iClient
{

    final s PZ;

    protected volatile void a(com.google.android.gms.common.api.a a1)
        throws RemoteException
    {
        a((r)a1);
    }

    protected void a(r r1)
        throws RemoteException
    {
        r1.iG().a(new CloseContentsRequest(s.a(PZ), false), new bg(this));
    }

    iClient(s s1, GoogleApiClient googleapiclient)
    {
        PZ = s1;
        super(googleapiclient);
    }
}
