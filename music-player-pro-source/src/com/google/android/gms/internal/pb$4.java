// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.internal.e;

// Referenced classes of package com.google.android.gms.internal:
//            pb

class gleApiClient extends gleApiClient
{

    final pb anZ;
    final String aof;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((e));
    }

    protected void a(e e1)
    {
        e1.removeMoment(aof);
        b(Status.Kw);
    }

    gleApiClient(pb pb1, GoogleApiClient googleapiclient, String s)
    {
        anZ = pb1;
        aof = s;
        super(googleapiclient, null);
    }
}
