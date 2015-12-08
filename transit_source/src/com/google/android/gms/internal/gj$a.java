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
//            gj

final class ky extends ky
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

    public eption(gj gj1, int i)
    {
        ut = gj1;
        super();
        ky = i;
    }
}
