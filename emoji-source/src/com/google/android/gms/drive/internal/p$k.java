// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.Drive;

// Referenced classes of package com.google.android.gms.drive.internal:
//            p, r

static class b extends b
{

    protected volatile void a(com.google.android.gms.common.api.a a1)
        throws RemoteException
    {
        a((r)a1);
    }

    protected void a(r r1)
    {
    }

    iClient(GoogleApiClient googleapiclient, Status status)
    {
        a(new com.google.android.gms.common.api.<init>(((r)googleapiclient.a(Drive.yH)).getLooper()));
        b(status);
    }
}
