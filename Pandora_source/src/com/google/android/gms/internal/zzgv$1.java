// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.internal:
//            zzgv, zzgq

class eApiClient extends eApiClient
{

    final String a;
    final UsageInfo b[];
    final zzgv c;

    protected void a(zzgq zzgq1)
        throws RemoteException
    {
        zzgq1.zza(new <init>(this), a, b);
    }

    eApiClient(zzgv zzgv1, GoogleApiClient googleapiclient, String s, UsageInfo ausageinfo[])
    {
        c = zzgv1;
        a = s;
        b = ausageinfo;
        super(googleapiclient);
    }
}
