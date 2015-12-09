// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.kyc.api.KycApi;
import com.google.android.apps.wallet.util.view.Views;

public class GenericVerifyYourIdentityActivity extends WalletActivity
{

    AnalyticsUtil analyticsUtil;
    EventBus eventBus;
    FeatureManager featureManager;
    UriRegistry uriRegistry;

    public GenericVerifyYourIdentityActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    private void onKycExperimentEvent(com.google.android.apps.wallet.kyc.api.KycExperimentPublisher.KycExperimentEvent kycexperimentevent)
    {
        Button button = (Button)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.twoStepKycButton);
        Button button1 = (Button)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.manualKycButton);
        button.setVisibility(8);
        button1.setVisibility(8);
        if (featureManager.isFeatureEnabled(Feature.UNIFIED_KYC_FLOW))
        {
            switch (kycexperimentevent.getExperiment().intValue())
            {
            default:
                return;

            case 4: // '\004'
                button1.setVisibility(0);
                button.setVisibility(0);
                return;

            case 3: // '\003'
                button.setVisibility(0);
                return;

            case 2: // '\002'
                button1.setVisibility(0);
                button1.setText(com.google.android.apps.walletnfcrel.R.string.verify_your_identity);
                return;
            }
        } else
        {
            button1.setVisibility(0);
            return;
        }
    }

    protected final void doOnCreate(Bundle bundle)
    {
        setContentView(com.google.android.apps.walletnfcrel.R.layout.generic_warm_kyc_activity);
        setTitle(com.google.android.apps.walletnfcrel.R.string.verify_your_identity);
        if (getIntent().getBooleanExtra("KYC_CLAIM_CONTEXT", false))
        {
            ((TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.SplashSubText)).setText(com.google.android.apps.walletnfcrel.R.string.claim_money_kyc_body);
        }
        ((Button)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.twoStepKycButton)).setOnClickListener(new android.view.View.OnClickListener() {

            final GenericVerifyYourIdentityActivity this$0;

            public final void onClick(View view)
            {
                startActivityForResult(KycApi.createTwoStepKycActivityIntentToClaimMoney(GenericVerifyYourIdentityActivity.this), 1);
            }

            
            {
                this$0 = GenericVerifyYourIdentityActivity.this;
                super();
            }
        });
        ((Button)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.manualKycButton)).setOnClickListener(new android.view.View.OnClickListener() {

            final GenericVerifyYourIdentityActivity this$0;

            public final void onClick(View view)
            {
                startActivityForResult(KycApi.createManualKycActivityIntentToClaimMoney(GenericVerifyYourIdentityActivity.this), 1);
            }

            
            {
                this$0 = GenericVerifyYourIdentityActivity.this;
                super();
            }
        });
    }

    public final void doOnResume()
    {
        super.doOnResume();
        eventBus.register(this);
        if (Boolean.valueOf(getIntent().getBooleanExtra("KYC_CLAIM_CONTEXT", false)).booleanValue())
        {
            analyticsUtil.sendScreen("Claim Money Verify Your Identity", new AnalyticsCustomDimension[0]);
            return;
        } else
        {
            analyticsUtil.sendScreen("Wallet Server Challenge Verify Your Identity", new AnalyticsCustomDimension[0]);
            return;
        }
    }

    public final boolean isWidthLimited()
    {
        return false;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 1 && j == -1)
        {
            setResult(-1);
        } else
        {
            setResult(0);
        }
        finish();
    }

    public void onPause()
    {
        super.onPause();
        eventBus.unregisterAll(this);
    }

    protected final void onUpPressed()
    {
        navigateUpWithIntent(uriRegistry.createIntent(2, new Object[0]));
    }
}
