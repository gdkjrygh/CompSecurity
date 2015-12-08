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
//            ls

public class lr
    implements Payments
{

    public lr()
    {
    }

    public void changeMaskedWallet(GoogleApiClient googleapiclient, String s, String s1, int i)
    {
        googleapiclient.a(new com.google.android.gms.wallet.Wallet.b(s, s1, i) {

            final int UA;
            final lr akD;
            final String akG;
            final String akH;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ls)a1);
            }

            protected void a(ls ls1)
            {
                ls1.d(akG, akH, UA);
                b(Status.Ek);
            }

            
            {
                akD = lr.this;
                akG = s;
                akH = s1;
                UA = i;
                super();
            }
        });
    }

    public void checkForPreAuthorization(GoogleApiClient googleapiclient, int i)
    {
        googleapiclient.a(new com.google.android.gms.wallet.Wallet.b(i) {

            final int UA;
            final lr akD;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ls)a1);
            }

            protected void a(ls ls1)
            {
                ls1.dQ(UA);
                b(Status.Ek);
            }

            
            {
                akD = lr.this;
                UA = i;
                super();
            }
        });
    }

    public void loadFullWallet(GoogleApiClient googleapiclient, FullWalletRequest fullwalletrequest, int i)
    {
        googleapiclient.a(new com.google.android.gms.wallet.Wallet.b(fullwalletrequest, i) {

            final int UA;
            final lr akD;
            final FullWalletRequest akF;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ls)a1);
            }

            protected void a(ls ls1)
            {
                ls1.a(akF, UA);
                b(Status.Ek);
            }

            
            {
                akD = lr.this;
                akF = fullwalletrequest;
                UA = i;
                super();
            }
        });
    }

    public void loadMaskedWallet(GoogleApiClient googleapiclient, MaskedWalletRequest maskedwalletrequest, int i)
    {
        googleapiclient.a(new com.google.android.gms.wallet.Wallet.b(maskedwalletrequest, i) {

            final int UA;
            final lr akD;
            final MaskedWalletRequest akE;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ls)a1);
            }

            protected void a(ls ls1)
            {
                ls1.a(akE, UA);
                b(Status.Ek);
            }

            
            {
                akD = lr.this;
                akE = maskedwalletrequest;
                UA = i;
                super();
            }
        });
    }

    public void notifyTransactionStatus(GoogleApiClient googleapiclient, NotifyTransactionStatusRequest notifytransactionstatusrequest)
    {
        googleapiclient.a(new com.google.android.gms.wallet.Wallet.b(notifytransactionstatusrequest) {

            final lr akD;
            final NotifyTransactionStatusRequest akI;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ls)a1);
            }

            protected void a(ls ls1)
            {
                ls1.a(akI);
                b(Status.Ek);
            }

            
            {
                akD = lr.this;
                akI = notifytransactionstatusrequest;
                super();
            }
        });
    }
}
