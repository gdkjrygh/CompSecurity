// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.internal:
//            zzqw, zzqx

class eApiClient extends com.google.android.gms.wallet.zzb
{

    final MaskedWalletRequest b;
    final int c;
    final zzqw d;

    protected void a(zzqx zzqx1)
    {
        zzqx1.a(b, c);
        a(((com.google.android.gms.common.api.Result) (Status.a)));
    }

    protected void b(com.google.android.gms.common.api.ent ent)
    {
        a((zzqx)ent);
    }

    eApiClient(zzqw zzqw1, GoogleApiClient googleapiclient, MaskedWalletRequest maskedwalletrequest, int i)
    {
        d = zzqw1;
        b = maskedwalletrequest;
        c = i;
        super(googleapiclient);
    }
}
