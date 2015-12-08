// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.accounts.Account;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;

// Referenced classes of package com.google.android.gms.internal:
//            de, dj, gh

public class gj extends de
{
    final class a extends gi.a
    {

        private final int ky;
        final gj ut;

        public void a(int i, FullWallet fullwallet, Bundle bundle)
        {
            PendingIntent pendingintent = null;
            if (bundle != null)
            {
                pendingintent = (PendingIntent)bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
            }
            bundle = new ConnectionResult(i, pendingintent);
            if (bundle.hasResolution())
            {
                try
                {
                    bundle.startResolutionForResult(gj.a(ut), ky);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (FullWallet fullwallet)
                {
                    Log.w("WalletClientImpl", "Exception starting pending intent", fullwallet);
                }
                return;
            }
            byte byte0;
            if (bundle.isSuccess())
            {
                byte0 = -1;
                bundle = new Intent();
                bundle.putExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET", fullwallet);
                fullwallet = bundle;
            } else
            {
                if (i == 408)
                {
                    byte0 = 0;
                } else
                {
                    byte0 = 1;
                }
                fullwallet = new Intent();
                fullwallet.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", i);
            }
            try
            {
                gj.a(ut).createPendingResult(ky, fullwallet, 0x40000000).send(byte0);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (FullWallet fullwallet)
            {
                Log.w("WalletClientImpl", "Exception setting pending result", fullwallet);
            }
        }

        public void a(int i, MaskedWallet maskedwallet, Bundle bundle)
        {
            PendingIntent pendingintent = null;
            if (bundle != null)
            {
                pendingintent = (PendingIntent)bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
            }
            bundle = new ConnectionResult(i, pendingintent);
            if (bundle.hasResolution())
            {
                try
                {
                    bundle.startResolutionForResult(gj.a(ut), ky);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (MaskedWallet maskedwallet)
                {
                    Log.w("WalletClientImpl", "Exception starting pending intent", maskedwallet);
                }
                return;
            }
            byte byte0;
            if (bundle.isSuccess())
            {
                byte0 = -1;
                bundle = new Intent();
                bundle.putExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", maskedwallet);
                maskedwallet = bundle;
            } else
            {
                if (i == 408)
                {
                    byte0 = 0;
                } else
                {
                    byte0 = 1;
                }
                maskedwallet = new Intent();
                maskedwallet.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", i);
            }
            try
            {
                gj.a(ut).createPendingResult(ky, maskedwallet, 0x40000000).send(byte0);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (MaskedWallet maskedwallet)
            {
                Log.w("WalletClientImpl", "Exception setting pending result", maskedwallet);
            }
        }

        public void a(int i, boolean flag, Bundle bundle)
        {
            bundle = new Intent();
            bundle.putExtra("com.google.android.gm.wallet.EXTRA_IS_USER_PREAUTHORIZED", flag);
            try
            {
                gj.a(ut).createPendingResult(ky, bundle, 0x40000000).send(-1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                Log.w("WalletClientImpl", "Exception setting pending result", bundle);
            }
        }

        public a(int i)
        {
            ut = gj.this;
            super();
            ky = i;
        }
    }


    private final Activity fD;
    private final String it;
    private final int mTheme;
    private final int us;

    public gj(Activity activity, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener, int i, String s, int j)
    {
        super(activity, connectioncallbacks, onconnectionfailedlistener, new String[0]);
        fD = activity;
        us = i;
        it = s;
        mTheme = j;
    }

    static Activity a(gj gj1)
    {
        return gj1.fD;
    }

    private Bundle eb()
    {
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", us);
        bundle.putString("androidPackageName", fD.getPackageName());
        if (!TextUtils.isEmpty(it))
        {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(it, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", mTheme);
        return bundle;
    }

    protected void a(dj dj1, de.d d)
        throws RemoteException
    {
        dj1.a(d, 0x3d8024);
    }

    protected String ag()
    {
        return "com.google.android.gms.wallet.service.BIND";
    }

    protected String ah()
    {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    protected gh au(IBinder ibinder)
    {
        return gh.a.as(ibinder);
    }

    public void changeMaskedWallet(String s, String s1, int i)
    {
        Bundle bundle = eb();
        a a1 = new a(i);
        try
        {
            ((gh)bd()).a(s, s1, bundle, a1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("WalletClientImpl", "RemoteException changing masked wallet", s);
        }
        a1.a(8, null, null);
    }

    public void checkForPreAuthorization(int i)
    {
        Bundle bundle = eb();
        a a1 = new a(i);
        try
        {
            ((gh)bd()).a(bundle, a1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.e("WalletClientImpl", "RemoteException during checkForPreAuthorization", remoteexception);
        }
        a1.a(8, false, null);
    }

    public void loadFullWallet(FullWalletRequest fullwalletrequest, int i)
    {
        a a1 = new a(i);
        Bundle bundle = eb();
        try
        {
            ((gh)bd()).a(fullwalletrequest, bundle, a1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (FullWalletRequest fullwalletrequest)
        {
            Log.e("WalletClientImpl", "RemoteException getting full wallet", fullwalletrequest);
        }
        a1.a(8, null, null);
    }

    public void loadMaskedWallet(MaskedWalletRequest maskedwalletrequest, int i)
    {
        Bundle bundle = eb();
        a a1 = new a(i);
        try
        {
            ((gh)bd()).a(maskedwalletrequest, bundle, a1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MaskedWalletRequest maskedwalletrequest)
        {
            Log.e("WalletClientImpl", "RemoteException getting masked wallet", maskedwalletrequest);
        }
        a1.a(8, null, null);
    }

    public void notifyTransactionStatus(NotifyTransactionStatusRequest notifytransactionstatusrequest)
    {
        Bundle bundle = eb();
        try
        {
            ((gh)bd()).a(notifytransactionstatusrequest, bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (NotifyTransactionStatusRequest notifytransactionstatusrequest)
        {
            return;
        }
    }

    protected IInterface p(IBinder ibinder)
    {
        return au(ibinder);
    }
}
