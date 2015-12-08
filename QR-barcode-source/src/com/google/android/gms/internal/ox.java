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
//            oy

public class ox
    implements Payments
{

    public ox()
    {
    }

    public void changeMaskedWallet(GoogleApiClient googleapiclient, String s, String s1, int i)
    {
        googleapiclient.a(new com.google.android.gms.wallet.Wallet.b(s, s1, i) {

            final int adJ;
            final ox auq;
            final String aut;
            final String auu;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((oy)a1);
            }

            protected void a(oy oy1)
            {
                oy1.d(aut, auu, adJ);
                b(Status.Jv);
            }

            
            {
                auq = ox.this;
                aut = s;
                auu = s1;
                adJ = i;
                super();
            }
        });
    }

    public void checkForPreAuthorization(GoogleApiClient googleapiclient, int i)
    {
        googleapiclient.a(new com.google.android.gms.wallet.Wallet.b(i) {

            final int adJ;
            final ox auq;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((oy)a1);
            }

            protected void a(oy oy1)
            {
                oy1.fI(adJ);
                b(Status.Jv);
            }

            
            {
                auq = ox.this;
                adJ = i;
                super();
            }
        });
    }

    public void loadFullWallet(GoogleApiClient googleapiclient, FullWalletRequest fullwalletrequest, int i)
    {
        googleapiclient.a(new com.google.android.gms.wallet.Wallet.b(fullwalletrequest, i) {

            final int adJ;
            final ox auq;
            final FullWalletRequest aus;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((oy)a1);
            }

            protected void a(oy oy1)
            {
                oy1.a(aus, adJ);
                b(Status.Jv);
            }

            
            {
                auq = ox.this;
                aus = fullwalletrequest;
                adJ = i;
                super();
            }
        });
    }

    public void loadMaskedWallet(GoogleApiClient googleapiclient, MaskedWalletRequest maskedwalletrequest, int i)
    {
        googleapiclient.a(new com.google.android.gms.wallet.Wallet.b(maskedwalletrequest, i) {

            final int adJ;
            final ox auq;
            final MaskedWalletRequest aur;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((oy)a1);
            }

            protected void a(oy oy1)
            {
                oy1.a(aur, adJ);
                b(Status.Jv);
            }

            
            {
                auq = ox.this;
                aur = maskedwalletrequest;
                adJ = i;
                super();
            }
        });
    }

    public void notifyTransactionStatus(GoogleApiClient googleapiclient, NotifyTransactionStatusRequest notifytransactionstatusrequest)
    {
        googleapiclient.a(new com.google.android.gms.wallet.Wallet.b(notifytransactionstatusrequest) {

            final ox auq;
            final NotifyTransactionStatusRequest auv;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((oy)a1);
            }

            protected void a(oy oy1)
            {
                oy1.a(auv);
                b(Status.Jv);
            }

            
            {
                auq = ox.this;
                auv = notifytransactionstatusrequest;
                super();
            }
        });
    }
}
