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
//            qh

public class qg
    implements Payments
{

    public qg()
    {
    }

    public void changeMaskedWallet(GoogleApiClient googleapiclient, String s, String s1, int i)
    {
        googleapiclient.a(new com.google.android.gms.wallet.Wallet.b(googleapiclient, s, s1, i) {

            final int afG;
            final qg awA;
            final String awD;
            final String awE;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((qh)a1);
            }

            protected void a(qh qh1)
            {
                qh1.d(awD, awE, afG);
                b(Status.Kw);
            }

            
            {
                awA = qg.this;
                awD = s;
                awE = s1;
                afG = i;
                super(googleapiclient);
            }
        });
    }

    public void checkForPreAuthorization(GoogleApiClient googleapiclient, int i)
    {
        googleapiclient.a(new com.google.android.gms.wallet.Wallet.b(googleapiclient, i) {

            final int afG;
            final qg awA;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((qh)a1);
            }

            protected void a(qh qh1)
            {
                qh1.gk(afG);
                b(Status.Kw);
            }

            
            {
                awA = qg.this;
                afG = i;
                super(googleapiclient);
            }
        });
    }

    public void loadFullWallet(GoogleApiClient googleapiclient, FullWalletRequest fullwalletrequest, int i)
    {
        googleapiclient.a(new com.google.android.gms.wallet.Wallet.b(googleapiclient, fullwalletrequest, i) {

            final int afG;
            final qg awA;
            final FullWalletRequest awC;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((qh)a1);
            }

            protected void a(qh qh1)
            {
                qh1.a(awC, afG);
                b(Status.Kw);
            }

            
            {
                awA = qg.this;
                awC = fullwalletrequest;
                afG = i;
                super(googleapiclient);
            }
        });
    }

    public void loadMaskedWallet(GoogleApiClient googleapiclient, MaskedWalletRequest maskedwalletrequest, int i)
    {
        googleapiclient.a(new com.google.android.gms.wallet.Wallet.b(googleapiclient, maskedwalletrequest, i) {

            final int afG;
            final qg awA;
            final MaskedWalletRequest awB;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((qh)a1);
            }

            protected void a(qh qh1)
            {
                qh1.a(awB, afG);
                b(Status.Kw);
            }

            
            {
                awA = qg.this;
                awB = maskedwalletrequest;
                afG = i;
                super(googleapiclient);
            }
        });
    }

    public void notifyTransactionStatus(GoogleApiClient googleapiclient, NotifyTransactionStatusRequest notifytransactionstatusrequest)
    {
        googleapiclient.a(new com.google.android.gms.wallet.Wallet.b(googleapiclient, notifytransactionstatusrequest) {

            final qg awA;
            final NotifyTransactionStatusRequest awF;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((qh)a1);
            }

            protected void a(qh qh1)
            {
                qh1.a(awF);
                b(Status.Kw);
            }

            
            {
                awA = qg.this;
                awF = notifytransactionstatusrequest;
                super(googleapiclient);
            }
        });
    }
}
