// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.internal:
//            ke, kg, ki

class gleApiClient extends gleApiClient
{

    final ke Nv;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((kg));
    }

    protected void a(kg kg1)
        throws RemoteException
    {
        ((ki)kg1.hw()).a(new <init>(this));
    }

    gleApiClient(ke ke1, GoogleApiClient googleapiclient)
    {
        Nv = ke1;
        super(googleapiclient);
    }
}
