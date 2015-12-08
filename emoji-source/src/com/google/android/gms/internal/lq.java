// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.Payments;

// Referenced classes of package com.google.android.gms.internal:
//            lr

public class lq
    implements Payments
{

    public lq()
    {
    }

    public void changeMaskedWallet(GoogleApiClient googleapiclient, String s, String s1, int i)
    {
        googleapiclient.a(new com.google.android.gms.wallet.Wallet.b(s, s1, i) {

            final int UD;
            final lq akG;
            final String akJ;
            final String akK;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lr)a1);
            }

            protected void a(lr lr1)
            {
                lr1.d(akJ, akK, UD);
                b(Status.En);
            }

            
            {
                akG = lq.this;
                akJ = s;
                akK = s1;
                UD = i;
                super();
            }
        });
    }

    public void checkForPreAuthorization(GoogleApiClient googleapiclient, int i)
    {
        googleapiclient.a(new com.google.android.gms.wallet.Wallet.b(i) {

            final int UD;
            final lq akG;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lr)a1);
            }

            protected void a(lr lr1)
            {
                lr1.dQ(UD);
                b(Status.En);
            }

            
            {
                akG = lq.this;
                UD = i;
                super();
            }
        });
    }

    public void loadFullWallet(GoogleApiClient googleapiclient, FullWalletRequest fullwalletrequest, int i)
    {
        googleapiclient.a(new com.google.android.gms.wallet.Wallet.b(fullwalletrequest, i) {

            final int UD;
            final lq akG;
            final FullWalletRequest akI;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lr)a1);
            }

            protected void a(lr lr1)
            {
                lr1.a(akI, UD);
                b(Status.En);
            }

            
            {
                akG = lq.this;
                akI = fullwalletrequest;
                UD = i;
                super();
            }
        });
    }

    public void loadMaskedWallet(GoogleApiClient googleapiclient, MaskedWalletRequest maskedwalletrequest, int i)
    {
        googleapiclient.a(new com.google.android.gms.wallet.Wallet.b(maskedwalletrequest, i) {

            final int UD;
            final lq akG;
            final MaskedWalletRequest akH;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lr)a1);
            }

            protected void a(lr lr1)
            {
                lr1.a(akH, UD);
                b(Status.En);
            }

            
            {
                akG = lq.this;
                akH = maskedwalletrequest;
                UD = i;
                super();
            }
        });
    }

    public void notifyTransactionStatus(GoogleApiClient googleapiclient, NotifyTransactionStatusRequest notifytransactionstatusrequest)
    {
        googleapiclient.a(new com.google.android.gms.wallet.Wallet.b(notifytransactionstatusrequest) {

            final lq akG;
            final NotifyTransactionStatusRequest akL;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lr)a1);
            }

            protected void a(lr lr1)
            {
                lr1.a(akL);
                b(Status.En);
            }

            
            {
                akG = lq.this;
                akL = notifytransactionstatusrequest;
                super();
            }
        });
    }
}
