// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import android.os.Bundle;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.logging.WLog;

public class PinResetReturnActivity extends WalletActivity
{

    private static final String TAG = com/google/android/apps/wallet/pin/PinResetReturnActivity.getSimpleName();
    UriRegistry uriRegistry;

    public PinResetReturnActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    protected final void doOnCreate(Bundle bundle)
    {
        WLog.e(TAG, "Received intent");
        startActivity(uriRegistry.createIntent(2, new Object[0]));
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    protected final void onUpPressed()
    {
        onBackPressed();
    }

}
