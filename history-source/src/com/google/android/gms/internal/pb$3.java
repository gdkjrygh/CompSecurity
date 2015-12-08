// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.plus.internal.e;
import com.google.android.gms.plus.model.moments.Moment;

// Referenced classes of package com.google.android.gms.internal:
//            pb

class gleApiClient extends gleApiClient
{

    final pb anZ;
    final Moment aoe;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((e));
    }

    protected void a(e e1)
    {
        e1.a(this, aoe);
    }

    gleApiClient(pb pb1, GoogleApiClient googleapiclient, Moment moment)
    {
        anZ = pb1;
        aoe = moment;
        super(googleapiclient, null);
    }
}
