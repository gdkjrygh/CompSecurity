// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.help;

import android.os.Bundle;
import android.widget.TextView;
import com.google.android.apps.wallet.base.activity.WalletActivity;

public class LicenseDisclosureActivity extends WalletActivity
{

    public LicenseDisclosureActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    protected final void doOnCreate(Bundle bundle)
    {
        setContentView(com.google.android.apps.walletnfcrel.R.layout.license_disclosure);
        setTitle(com.google.android.apps.walletnfcrel.R.string.license_disclosure_link);
        ((TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.LicenseTextView)).setAutoLinkMask(15);
    }

    protected final boolean isWidthLimited()
    {
        return true;
    }

    protected final void onUpPressed()
    {
        onBackPressed();
    }
}
