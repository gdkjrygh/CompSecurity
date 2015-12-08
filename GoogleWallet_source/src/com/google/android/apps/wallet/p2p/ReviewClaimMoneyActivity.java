// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.funding.api.FundingSource;
import com.google.android.apps.wallet.p2p.api.P2pApi;
import com.google.android.apps.wallet.paymentcard.widgets.FundingSourceView;
import com.google.android.apps.wallet.util.view.Views;
import com.google.common.base.Preconditions;

public class ReviewClaimMoneyActivity extends WalletActivity
{

    UriRegistry uriRegistry;

    public ReviewClaimMoneyActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    protected final void doOnCreate(final Bundle instrument)
    {
        Preconditions.checkArgument(getIntent().hasExtra("amount"));
        Object obj = getIntent().getStringExtra("amount");
        Preconditions.checkArgument(getIntent().hasExtra("funding_source"));
        instrument = (FundingSource)getIntent().getParcelableExtra("funding_source");
        setContentView(com.google.android.apps.walletnfcrel.R.layout.confirm_money_transfer);
        setTitle(com.google.android.apps.walletnfcrel.R.string.review_recurring_topup_title);
        findViewById(com.google.android.apps.walletnfcrel.R.id.P2pHeaderFragment).setVisibility(8);
        findViewById(com.google.android.apps.walletnfcrel.R.id.RecipientName).setVisibility(8);
        findViewById(com.google.android.apps.walletnfcrel.R.id.RecipientEmail).setVisibility(8);
        findViewById(com.google.android.apps.walletnfcrel.R.id.RequestMemo).setVisibility(8);
        TextView textview = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.MoneyTransferLargeDescription);
        textview.setVisibility(0);
        textview.setText(((CharSequence) (obj)));
        ((TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.MoneyTransferDescription)).setText(com.google.android.apps.walletnfcrel.R.string.claim_money_to_bank_account_review_description);
        ((FundingSourceView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.FundingSourceIcon)).setFundingSource(instrument);
        ((TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.FundingSourceName)).setText(instrument.getDescriptiveName(this));
        obj = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.FeeDelayText);
        ((TextView) (obj)).setVisibility(0);
        ((TextView) (obj)).setText(com.google.android.apps.walletnfcrel.R.string.claim_money_to_bank_account_expected_availability);
        obj = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.ConfirmButton);
        ((TextView) (obj)).setText(com.google.android.apps.walletnfcrel.R.string.transfer_money_action);
        ((TextView) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

            final ReviewClaimMoneyActivity this$0;
            final FundingSource val$instrument;

            public final void onClick(View view)
            {
                startActivity(P2pApi.createClaimMoneyResultsActivityIntent(ReviewClaimMoneyActivity.this, instrument));
                finish();
            }

            
            {
                this$0 = ReviewClaimMoneyActivity.this;
                instrument = fundingsource;
                super();
            }
        });
    }

    public final boolean isWidthLimited()
    {
        return false;
    }

    protected final void onUpPressed()
    {
        navigateUpWithIntent(uriRegistry.createIntent(2, new Object[0]));
    }
}
