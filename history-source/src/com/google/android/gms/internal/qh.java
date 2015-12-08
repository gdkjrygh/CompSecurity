// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.accounts.Account;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;

// Referenced classes of package com.google.android.gms.internal:
//            jl, jt, qc, py, 
//            jx

public class qh extends jl
{
    private static class a extends qf.a
    {

        public void a(int j, FullWallet fullwallet, Bundle bundle)
        {
        }

        public void a(int j, MaskedWallet maskedwallet, Bundle bundle)
        {
        }

        public void a(int j, boolean flag, Bundle bundle)
        {
        }

        public void a(Status status, py py, Bundle bundle)
        {
        }

        public void i(int j, Bundle bundle)
        {
        }

        private a()
        {
        }

    }

    final class b extends a
    {

        private final int My;
        final qh awG;

        public void a(int j, FullWallet fullwallet, Bundle bundle)
        {
            Object obj = null;
            if (bundle != null)
            {
                obj = (PendingIntent)bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
            }
            bundle = new ConnectionResult(j, ((PendingIntent) (obj)));
            if (bundle.hasResolution())
            {
                try
                {
                    bundle.startResolutionForResult(qh.b(awG), My);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (FullWallet fullwallet)
                {
                    Log.w("WalletClientImpl", "Exception starting pending intent", fullwallet);
                }
                return;
            }
            obj = new Intent();
            byte byte0;
            if (bundle.isSuccess())
            {
                byte0 = -1;
                ((Intent) (obj)).putExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET", fullwallet);
            } else
            {
                if (j == 408)
                {
                    byte0 = 0;
                } else
                {
                    byte0 = 1;
                }
                ((Intent) (obj)).putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", j);
            }
            fullwallet = qh.b(awG).createPendingResult(My, ((Intent) (obj)), 0x40000000);
            if (fullwallet == null)
            {
                Log.w("WalletClientImpl", "Null pending result returned for onFullWalletLoaded");
                return;
            }
            try
            {
                fullwallet.send(byte0);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (FullWallet fullwallet)
            {
                Log.w("WalletClientImpl", "Exception setting pending result", fullwallet);
            }
        }

        public void a(int j, MaskedWallet maskedwallet, Bundle bundle)
        {
            Object obj = null;
            if (bundle != null)
            {
                obj = (PendingIntent)bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
            }
            bundle = new ConnectionResult(j, ((PendingIntent) (obj)));
            if (bundle.hasResolution())
            {
                try
                {
                    bundle.startResolutionForResult(qh.b(awG), My);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (MaskedWallet maskedwallet)
                {
                    Log.w("WalletClientImpl", "Exception starting pending intent", maskedwallet);
                }
                return;
            }
            obj = new Intent();
            byte byte0;
            if (bundle.isSuccess())
            {
                byte0 = -1;
                ((Intent) (obj)).putExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", maskedwallet);
            } else
            {
                if (j == 408)
                {
                    byte0 = 0;
                } else
                {
                    byte0 = 1;
                }
                ((Intent) (obj)).putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", j);
            }
            maskedwallet = qh.b(awG).createPendingResult(My, ((Intent) (obj)), 0x40000000);
            if (maskedwallet == null)
            {
                Log.w("WalletClientImpl", "Null pending result returned for onMaskedWalletLoaded");
                return;
            }
            try
            {
                maskedwallet.send(byte0);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (MaskedWallet maskedwallet)
            {
                Log.w("WalletClientImpl", "Exception setting pending result", maskedwallet);
            }
        }

        public void a(int j, boolean flag, Bundle bundle)
        {
            bundle = new Intent();
            bundle.putExtra("com.google.android.gm.wallet.EXTRA_IS_USER_PREAUTHORIZED", flag);
            bundle = qh.b(awG).createPendingResult(My, bundle, 0x40000000);
            if (bundle == null)
            {
                Log.w("WalletClientImpl", "Null pending result returned for onPreAuthorizationDetermined");
                return;
            }
            try
            {
                bundle.send(-1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                Log.w("WalletClientImpl", "Exception setting pending result", bundle);
            }
        }

        public void i(int j, Bundle bundle)
        {
            jx.b(bundle, "Bundle should not be null");
            bundle = new ConnectionResult(j, (PendingIntent)bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT"));
            if (bundle.hasResolution())
            {
                try
                {
                    bundle.startResolutionForResult(qh.b(awG), My);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Bundle bundle)
                {
                    Log.w("WalletClientImpl", "Exception starting pending intent", bundle);
                }
                return;
            }
            Log.e("WalletClientImpl", (new StringBuilder()).append("Create Wallet Objects confirmation UI will not be shown connection result: ").append(bundle).toString());
            bundle = new Intent();
            bundle.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", 413);
            bundle = qh.b(awG).createPendingResult(My, bundle, 0x40000000);
            if (bundle == null)
            {
                Log.w("WalletClientImpl", "Null pending result returned for onWalletObjectsCreated");
                return;
            }
            try
            {
                bundle.send(1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                Log.w("WalletClientImpl", "Exception setting pending result", bundle);
            }
        }

        public b(int j)
        {
            awG = qh.this;
            super();
            My = j;
        }
    }


    private final String DZ;
    private final int avV;
    private final int mTheme;
    private final Activity nB;

    public qh(Activity activity, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, int i, String s, int j)
    {
        super(activity, looper, connectioncallbacks, onconnectionfailedlistener, new String[0]);
        nB = activity;
        avV = i;
        DZ = s;
        mTheme = j;
    }

    public static Bundle a(int i, String s, String s1, int j)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", i);
        bundle.putString("androidPackageName", s);
        if (!TextUtils.isEmpty(s1))
        {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(s1, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", j);
        return bundle;
    }

    static Activity b(qh qh1)
    {
        return qh1.nB;
    }

    private Bundle rf()
    {
        return a(avV, nB.getPackageName(), DZ, mTheme);
    }

    protected void a(jt jt1, jl.e e)
        throws RemoteException
    {
        jt1.k(e, 0x648278, getContext().getPackageName());
    }

    public void a(FullWalletRequest fullwalletrequest, int i)
    {
        b b1 = new b(i);
        Bundle bundle = rf();
        try
        {
            ((qc)hw()).a(fullwalletrequest, bundle, b1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (FullWalletRequest fullwalletrequest)
        {
            Log.e("WalletClientImpl", "RemoteException getting full wallet", fullwalletrequest);
        }
        b1.a(8, null, Bundle.EMPTY);
    }

    public void a(MaskedWalletRequest maskedwalletrequest, int i)
    {
        Bundle bundle = rf();
        b b1 = new b(i);
        try
        {
            ((qc)hw()).a(maskedwalletrequest, bundle, b1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MaskedWalletRequest maskedwalletrequest)
        {
            Log.e("WalletClientImpl", "RemoteException getting masked wallet", maskedwalletrequest);
        }
        b1.a(8, null, Bundle.EMPTY);
    }

    public void a(NotifyTransactionStatusRequest notifytransactionstatusrequest)
    {
        Bundle bundle = rf();
        try
        {
            ((qc)hw()).a(notifytransactionstatusrequest, bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (NotifyTransactionStatusRequest notifytransactionstatusrequest)
        {
            return;
        }
    }

    protected String bK()
    {
        return "com.google.android.gms.wallet.service.BIND";
    }

    protected String bL()
    {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    protected qc bV(IBinder ibinder)
    {
        return qc.a.bR(ibinder);
    }

    public void d(String s, String s1, int i)
    {
        Bundle bundle = rf();
        b b1 = new b(i);
        try
        {
            ((qc)hw()).a(s, s1, bundle, b1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("WalletClientImpl", "RemoteException changing masked wallet", s);
        }
        b1.a(8, null, Bundle.EMPTY);
    }

    public void gk(int i)
    {
        Bundle bundle = rf();
        b b1 = new b(i);
        try
        {
            ((qc)hw()).a(bundle, b1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.e("WalletClientImpl", "RemoteException during checkForPreAuthorization", remoteexception);
        }
        b1.a(8, false, Bundle.EMPTY);
    }

    protected IInterface l(IBinder ibinder)
    {
        return bV(ibinder);
    }
}
