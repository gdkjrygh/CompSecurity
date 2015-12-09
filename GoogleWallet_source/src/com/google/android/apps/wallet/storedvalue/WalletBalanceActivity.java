// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.WalletActivity;

// Referenced classes of package com.google.android.apps.wallet.storedvalue:
//            WalletBalanceFragment

public class WalletBalanceActivity extends WalletActivity
{

    AnalyticsUtil analyticsUtil;
    UriRegistry uriRegistry;

    public WalletBalanceActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    public final void doOnCreate(Bundle bundle)
    {
        setContentView(com.google.android.apps.walletnfcrel.R.layout.main_activity);
        getSupportFragmentManager().beginTransaction().setCustomAnimations(0x10a0000, 0x10a0001).replace(com.google.android.apps.walletnfcrel.R.id.MainActivityContainer, new WalletBalanceFragment()).commit();
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            findViewById(com.google.android.apps.walletnfcrel.R.id.toolbar).setElevation(0.0F);
        }
    }

    public final boolean hasDrawerIndicator()
    {
        return true;
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public void onBackPressed()
    {
        startActivity(uriRegistry.createIntent(2, new Object[0]));
    }

    protected void onStop()
    {
        super.onStop();
        analyticsUtil.clearTiming("OpenWalletBalance", "user_open_wallet_balance");
    }
}
