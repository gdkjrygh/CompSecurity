// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;

// Referenced classes of package com.google.android.gms.internal:
//            qh, jx

final class My extends My
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

    public eption(qh qh1, int j)
    {
        awG = qh1;
        super(null);
        My = j;
    }
}
