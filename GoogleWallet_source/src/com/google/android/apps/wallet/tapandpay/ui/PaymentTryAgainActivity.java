// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.tapandpay.ui;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.google.android.apps.wallet.api.QuitIntent;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.WalletActivity;

public class PaymentTryAgainActivity extends WalletActivity
{

    UriRegistry uriRegistry;

    public PaymentTryAgainActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    protected final void doOnCreate(Bundle bundle)
    {
        getWindow().addFlags(0x280000);
        setContentView(com.google.android.apps.walletnfcrel.R.layout.payment_notification_fail);
        findViewById(com.google.android.apps.walletnfcrel.R.id.CancelPaymentButton).setOnClickListener(new android.view.View.OnClickListener() {

            final PaymentTryAgainActivity this$0;

            public final void onClick(View view)
            {
                startActivity(QuitIntent.create());
                finish();
            }

            
            {
                this$0 = PaymentTryAgainActivity.this;
                super();
            }
        });
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
