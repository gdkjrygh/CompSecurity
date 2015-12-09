// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.Drive;

// Referenced classes of package com.google.android.gms.drive.internal:
//            l, n

static class a extends a
{

    protected volatile void a(com.google.android.gms.common.api.a a1)
        throws RemoteException
    {
        a((n)a1);
    }

    protected void a(n n1)
    {
    }

    iClient(GoogleApiClient googleapiclient, Status status)
    {
        a(new com.google.android.gms.common.api.<init>(((n)googleapiclient.a(Drive.wx)).getLooper()));
        a(status);
    }
}
