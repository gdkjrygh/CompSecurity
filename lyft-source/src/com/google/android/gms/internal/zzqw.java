// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.Payments;

// Referenced classes of package com.google.android.gms.internal:
//            zzqx

public class zzqw
    implements Payments
{

    public zzqw()
    {
    }

    public void a(GoogleApiClient googleapiclient, FullWalletRequest fullwalletrequest, int i)
    {
        googleapiclient.a(new com.google.android.gms.wallet.Wallet.zzb(googleapiclient, fullwalletrequest, i) {

            final FullWalletRequest b;
            final int c;
            final zzqw d;

            protected void a(zzqx zzqx1)
            {
                zzqx1.a(b, c);
                a(((com.google.android.gms.common.api.Result) (Status.a)));
            }

            protected void b(com.google.android.gms.common.api.Api.Client client)
            {
                a((zzqx)client);
            }

            
            {
                d = zzqw.this;
                b = fullwalletrequest;
                c = i;
                super(googleapiclient);
            }
        });
    }

    public void a(GoogleApiClient googleapiclient, MaskedWalletRequest maskedwalletrequest, int i)
    {
        googleapiclient.a(new com.google.android.gms.wallet.Wallet.zzb(googleapiclient, maskedwalletrequest, i) {

            final MaskedWalletRequest b;
            final int c;
            final zzqw d;

            protected void a(zzqx zzqx1)
            {
                zzqx1.a(b, c);
                a(((com.google.android.gms.common.api.Result) (Status.a)));
            }

            protected void b(com.google.android.gms.common.api.Api.Client client)
            {
                a((zzqx)client);
            }

            
            {
                d = zzqw.this;
                b = maskedwalletrequest;
                c = i;
                super(googleapiclient);
            }
        });
    }
}
