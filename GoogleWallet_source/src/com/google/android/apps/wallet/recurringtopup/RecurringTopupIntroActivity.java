// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.recurringtopup;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.wallet.bankaccount.api.BankAccountApi;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.topup.api.TopUpApi;
import com.google.android.apps.wallet.util.view.Views;

public class RecurringTopupIntroActivity extends WalletActivity
{

    public RecurringTopupIntroActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    protected final void doOnCreate(Bundle bundle)
    {
        setTitle(com.google.android.apps.walletnfcrel.R.string.recurring_topup_intro_title);
        setContentView(com.google.android.apps.walletnfcrel.R.layout.recurring_topup_intro_activity);
        Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.LinkBankAccount).setOnClickListener(new android.view.View.OnClickListener() {

            final RecurringTopupIntroActivity this$0;

            public final void onClick(View view)
            {
                startActivity(BankAccountApi.createAddBankAccountActivityWithUseIntent(RecurringTopupIntroActivity.this, 5));
                finish();
            }

            
            {
                this$0 = RecurringTopupIntroActivity.this;
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
        Views.hideSoftKeyboard(this, getCurrentFocus());
        navigateUpWithIntent(TopUpApi.createTopUpActivityIntent(this));
    }
}
