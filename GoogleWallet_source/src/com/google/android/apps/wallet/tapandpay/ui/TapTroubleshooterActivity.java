// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.tapandpay.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.util.view.Views;

public class TapTroubleshooterActivity extends WalletActivity
{

    private LinearLayout contentsView;
    UriRegistry uriRegistry;

    public TapTroubleshooterActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    private void addStringToView(int i, int j)
    {
        ((TextView)contentsView.findViewById(i).findViewById(com.google.android.apps.walletnfcrel.R.id.TapTroubleshooterEntryText)).setText(j);
    }

    public static Intent createIntent(Context context)
    {
        return InternalIntents.forClass(context, com/google/android/apps/wallet/tapandpay/ui/TapTroubleshooterActivity);
    }

    protected final void doOnCreate(Bundle bundle)
    {
        getWindow().addFlags(0x80000);
        setTitle(com.google.android.apps.walletnfcrel.R.string.tap_troubleshooter_page_title);
        bundle = getLayoutInflater().inflate(com.google.android.apps.walletnfcrel.R.layout.tap_troubleshooter, null);
        contentsView = (LinearLayout)Views.findViewById(bundle, com.google.android.apps.walletnfcrel.R.id.TapTroubleshooterContents);
        addStringToView(com.google.android.apps.walletnfcrel.R.id.TapTroubleshooterEntry1, com.google.android.apps.walletnfcrel.R.string.tap_and_pay_troubleshooter_content_general_tap_again);
        addStringToView(com.google.android.apps.walletnfcrel.R.id.TapTroubleshooterEntry2, com.google.android.apps.walletnfcrel.R.string.tap_and_pay_troubleshooter_content_select_debit_or_credit);
        addStringToView(com.google.android.apps.walletnfcrel.R.id.TapTroubleshooterEntry3, com.google.android.apps.walletnfcrel.R.string.tap_and_pay_troubleshooter_content_general_not_used);
        addStringToView(com.google.android.apps.walletnfcrel.R.id.TapTroubleshooterEntry4, com.google.android.apps.walletnfcrel.R.string.tap_and_pay_troubleshooter_content_general_payment_card_expired);
        setContentView(bundle);
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    protected final void onUpPressed()
    {
        navigateUpWithIntent(uriRegistry.createIntent(2, new Object[0]));
    }
}
