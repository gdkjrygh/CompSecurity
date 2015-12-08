// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.accounts.Account;
import android.app.Activity;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.internal:
//            zzqs

public class zzqx extends zzi
{

    private final Activity d;
    private final int e;
    private final String f;
    private final int g;

    public zzqx(Activity activity, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, int i, String s, int j)
    {
        super(activity, looper, 4, connectioncallbacks, onconnectionfailedlistener);
        d = activity;
        e = i;
        f = s;
        g = j;
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

    private Bundle p()
    {
        return a(e, d.getPackageName(), f, g);
    }

    protected IInterface a(IBinder ibinder)
    {
        return b(ibinder);
    }

    public void a(FullWalletRequest fullwalletrequest, int i)
    {
        zzb zzb1 = new zzb(d, i);
        Bundle bundle = p();
        try
        {
            ((zzqs)m()).a(fullwalletrequest, bundle, zzb1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (FullWalletRequest fullwalletrequest)
        {
            Log.e("WalletClientImpl", "RemoteException getting full wallet", fullwalletrequest);
        }
        zzb1.a(8, null, Bundle.EMPTY);
    }

    public void a(MaskedWalletRequest maskedwalletrequest, int i)
    {
        Bundle bundle = p();
        zzb zzb1 = new zzb(d, i);
        try
        {
            ((zzqs)m()).a(maskedwalletrequest, bundle, zzb1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MaskedWalletRequest maskedwalletrequest)
        {
            Log.e("WalletClientImpl", "RemoteException getting masked wallet", maskedwalletrequest);
        }
        zzb1.a(8, null, Bundle.EMPTY);
    }

    protected zzqs b(IBinder ibinder)
    {
        return zzqs.zza.a(ibinder);
    }

    protected String d()
    {
        return "com.google.android.gms.wallet.service.BIND";
    }

    protected String e()
    {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    public boolean o()
    {
        return true;
    }

    private class zzb extends zza
    {
        private class zza extends zzqv.zza
        {

            public void a(int i, Bundle bundle)
            {
            }

            public void a(int i, FullWallet fullwallet, Bundle bundle)
            {
            }

            public void a(int i, MaskedWallet maskedwallet, Bundle bundle)
            {
            }

            public void a(int i, boolean flag, Bundle bundle)
            {
            }

            public void a(Status status, GetBuyFlowInitializationTokenResponse getbuyflowinitializationtokenresponse, Bundle bundle)
            {
            }

            public void a(Status status, GetInstrumentsResponse getinstrumentsresponse, Bundle bundle)
            {
            }

            public void b(int i, boolean flag, Bundle bundle)
            {
            }

            private zza()
            {
            }

        }


        private final WeakReference a;
        private final int b;

        public void a(int i, Bundle bundle)
        {
            zzu.a(bundle, "Bundle should not be null");
            Activity activity = (Activity)a.get();
            if (activity == null)
            {
                Log.d("WalletClientImpl", "Ignoring onWalletObjectsCreated, Activity has gone");
                return;
            }
            bundle = new ConnectionResult(i, (PendingIntent)bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT"));
            if (bundle.a())
            {
                try
                {
                    bundle.a(activity, b);
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
            bundle = activity.createPendingResult(b, bundle, 0x40000000);
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

        public void a(int i, FullWallet fullwallet, Bundle bundle)
        {
            Activity activity = (Activity)a.get();
            if (activity == null)
            {
                Log.d("WalletClientImpl", "Ignoring onFullWalletLoaded, Activity has gone");
                return;
            }
            Object obj = null;
            if (bundle != null)
            {
                obj = (PendingIntent)bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
            }
            bundle = new ConnectionResult(i, ((PendingIntent) (obj)));
            if (bundle.a())
            {
                try
                {
                    bundle.a(activity, b);
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
            if (bundle.b())
            {
                byte0 = -1;
                ((Intent) (obj)).putExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET", fullwallet);
            } else
            {
                if (i == 408)
                {
                    byte0 = 0;
                } else
                {
                    byte0 = 1;
                }
                ((Intent) (obj)).putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", i);
            }
            fullwallet = activity.createPendingResult(b, ((Intent) (obj)), 0x40000000);
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

        public void a(int i, MaskedWallet maskedwallet, Bundle bundle)
        {
            Activity activity = (Activity)a.get();
            if (activity == null)
            {
                Log.d("WalletClientImpl", "Ignoring onMaskedWalletLoaded, Activity has gone");
                return;
            }
            Object obj = null;
            if (bundle != null)
            {
                obj = (PendingIntent)bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
            }
            bundle = new ConnectionResult(i, ((PendingIntent) (obj)));
            if (bundle.a())
            {
                try
                {
                    bundle.a(activity, b);
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
            if (bundle.b())
            {
                byte0 = -1;
                ((Intent) (obj)).putExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", maskedwallet);
            } else
            {
                if (i == 408)
                {
                    byte0 = 0;
                } else
                {
                    byte0 = 1;
                }
                ((Intent) (obj)).putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", i);
            }
            maskedwallet = activity.createPendingResult(b, ((Intent) (obj)), 0x40000000);
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

        public void a(int i, boolean flag, Bundle bundle)
        {
            bundle = (Activity)a.get();
            if (bundle == null)
            {
                Log.d("WalletClientImpl", "Ignoring onPreAuthorizationDetermined, Activity has gone");
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("com.google.android.gm.wallet.EXTRA_IS_USER_PREAUTHORIZED", flag);
            bundle = bundle.createPendingResult(b, intent, 0x40000000);
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

        public void b(int i, boolean flag, Bundle bundle)
        {
            bundle = (Activity)a.get();
            if (bundle == null)
            {
                Log.d("WalletClientImpl", "Ignoring onIsNewUserDetermined, Activity has gone");
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("com.google.android.gms.wallet.EXTRA_IS_NEW_USER", flag);
            bundle = bundle.createPendingResult(b, intent, 0x40000000);
            if (bundle == null)
            {
                Log.w("WalletClientImpl", "Null pending result returned for onIsNewUserDetermined");
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

        public zzb(Activity activity, int i)
        {
            a = new WeakReference(activity);
            b = i;
        }
    }

}
