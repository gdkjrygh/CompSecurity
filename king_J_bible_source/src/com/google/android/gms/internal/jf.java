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
//            jg

public class jf
    implements Payments
{

    public jf()
    {
    }

    public void changeMaskedWallet(GoogleApiClient googleapiclient, String s, String s1, int i)
    {
        googleapiclient.a(new com.google.android.gms.wallet.Wallet.b(s, s1, i) {

            final int Nx;
            final jf acV;
            final String acY;
            final String acZ;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((jg)a1);
            }

            protected void a(jg jg1)
            {
                jg1.d(acY, acZ, Nx);
                a(((com.google.android.gms.common.api.Result) (Status.Bv)));
            }

            
            {
                acV = jf.this;
                acY = s;
                acZ = s1;
                Nx = i;
                super();
            }
        });
    }

    public void checkForPreAuthorization(GoogleApiClient googleapiclient, int i)
    {
        googleapiclient.a(new com.google.android.gms.wallet.Wallet.b(i) {

            final int Nx;
            final jf acV;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((jg)a1);
            }

            protected void a(jg jg1)
            {
                jg1.cD(Nx);
                a(((com.google.android.gms.common.api.Result) (Status.Bv)));
            }

            
            {
                acV = jf.this;
                Nx = i;
                super();
            }
        });
    }

    public void loadFullWallet(GoogleApiClient googleapiclient, FullWalletRequest fullwalletrequest, int i)
    {
        googleapiclient.a(new com.google.android.gms.wallet.Wallet.b(fullwalletrequest, i) {

            final int Nx;
            final jf acV;
            final FullWalletRequest acX;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((jg)a1);
            }

            protected void a(jg jg1)
            {
                jg1.a(acX, Nx);
                a(((com.google.android.gms.common.api.Result) (Status.Bv)));
            }

            
            {
                acV = jf.this;
                acX = fullwalletrequest;
                Nx = i;
                super();
            }
        });
    }

    public void loadMaskedWallet(GoogleApiClient googleapiclient, MaskedWalletRequest maskedwalletrequest, int i)
    {
        googleapiclient.a(new com.google.android.gms.wallet.Wallet.b(maskedwalletrequest, i) {

            final int Nx;
            final jf acV;
            final MaskedWalletRequest acW;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((jg)a1);
            }

            protected void a(jg jg1)
            {
                jg1.a(acW, Nx);
                a(((com.google.android.gms.common.api.Result) (Status.Bv)));
            }

            
            {
                acV = jf.this;
                acW = maskedwalletrequest;
                Nx = i;
                super();
            }
        });
    }

    public void notifyTransactionStatus(GoogleApiClient googleapiclient, NotifyTransactionStatusRequest notifytransactionstatusrequest)
    {
        googleapiclient.a(new com.google.android.gms.wallet.Wallet.b(notifytransactionstatusrequest) {

            final jf acV;
            final NotifyTransactionStatusRequest ada;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((jg)a1);
            }

            protected void a(jg jg1)
            {
                jg1.a(ada);
                a(((com.google.android.gms.common.api.Result) (Status.Bv)));
            }

            
            {
                acV = jf.this;
                ada = notifytransactionstatusrequest;
                super();
            }
        });
    }
}
