// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.internal:
//            zzhk, zzhm, zzho

class eApiClient extends eApiClient
{

    final zzhk a;

    protected void a(zzhm zzhm1)
        throws RemoteException
    {
        ((zzho)zzhm1.zzlX()).zza(new <init>(this));
    }

    protected void zza(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((zzhm));
    }

    eApiClient(zzhk zzhk1, GoogleApiClient googleapiclient)
    {
        a = zzhk1;
        super(googleapiclient);
    }
}
