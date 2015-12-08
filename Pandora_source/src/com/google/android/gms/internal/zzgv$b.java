// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.appdatasearch.zza;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.internal:
//            zzgv, zzgt, zzgq

private static abstract class zc extends com.google.android.gms.common.api.
{

    protected abstract void a(zzgq zzgq)
        throws RemoteException;

    protected final void a(zzgt zzgt1)
        throws RemoteException
    {
        a(zzgt1.zzjI());
    }

    protected void zza(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((zzgt));
    }

    public eApiClient(GoogleApiClient googleapiclient)
    {
        super(zza.zzIS, googleapiclient);
    }
}
