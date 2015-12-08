// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.kyc.api.KycApi;
import com.google.android.apps.wallet.p2p.ClaimablePurchaseRecordEvent;
import com.google.android.apps.wallet.util.view.Views;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.storedvalue:
//            TileFragment

public class WalletBalanceKycFragment extends TileFragment
{

    private ClaimablePurchaseRecordEvent claimablePurchaseRecordsEvent;
    EventBus eventBus;
    FeatureManager featureManager;
    KycApi kycApi;
    private com.google.android.apps.wallet.kyc.api.KycStatusPublisher.KycStatusEvent kycStatusEvent;

    public WalletBalanceKycFragment()
    {
        kycStatusEvent = null;
        claimablePurchaseRecordsEvent = null;
    }

    private void maybeNotifyTileChanged()
    {
        if (kycStatusEvent != null && claimablePurchaseRecordsEvent != null)
        {
            notifyTileChanged();
        }
    }

    private void onClaimablePurchaseRecordEvent(ClaimablePurchaseRecordEvent claimablepurchaserecordevent)
    {
        claimablePurchaseRecordsEvent = claimablepurchaserecordevent;
        maybeNotifyTileChanged();
    }

    private void onKycExperimentEvent(com.google.android.apps.wallet.kyc.api.KycExperimentPublisher.KycExperimentEvent kycexperimentevent)
    {
        Button button = (Button)Views.findViewById(getView(), com.google.android.apps.walletnfcrel.R.id.twoStepKycButton);
        Button button1 = (Button)Views.findViewById(getView(), com.google.android.apps.walletnfcrel.R.id.manualKycButton);
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

    private void onKycStatusEvent(com.google.android.apps.wallet.kyc.api.KycStatusPublisher.KycStatusEvent kycstatusevent)
    {
        kycStatusEvent = kycstatusevent;
        maybeNotifyTileChanged();
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.wallet_balance_kyc_fragment, viewgroup, false);
        ((Button)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.twoStepKycButton)).setOnClickListener(new android.view.View.OnClickListener() {

            final WalletBalanceKycFragment this$0;

            public final void onClick(View view)
            {
                startActivity(KycApi.createTwoStepKycActivityIntentForSetUpWalletBalance(getActivity()));
            }

            
            {
                this$0 = WalletBalanceKycFragment.this;
                super();
            }
        });
        ((Button)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.manualKycButton)).setOnClickListener(new android.view.View.OnClickListener() {

            final WalletBalanceKycFragment this$0;

            public final void onClick(View view)
            {
                startActivity(KycApi.createManualKycActivityIntentForSetUpWalletBalance(getActivity()));
            }

            
            {
                this$0 = WalletBalanceKycFragment.this;
                super();
            }
        });
        return layoutinflater;
    }

    public final void onPause()
    {
        super.onPause();
        eventBus.unregisterAll(this);
    }

    public final void onResume()
    {
        super.onResume();
        eventBus.register(this);
    }

    public final boolean shouldShow()
    {
        if (kycStatusEvent != null && kycStatusEvent.getStatus() != null)
        {
            if (kycStatusEvent.getStatus().intValue() == 1)
            {
                analyticsUtil.sendScreen("Wallet Balance", new AnalyticsCustomDimension[0]);
                analyticsUtil.endTiming("OpenWalletBalance", "user_open_wallet_balance");
                return false;
            }
            if (claimablePurchaseRecordsEvent == null)
            {
                if (!featureManager.isFeatureEnabled(Feature.TRANSACTION_LIST))
                {
                    analyticsUtil.sendScreen("Wallet Balance Verify Your Identity", new AnalyticsCustomDimension[0]);
                    return true;
                }
            } else
            if (claimablePurchaseRecordsEvent.getPurchaseRecords() == null || claimablePurchaseRecordsEvent.getPurchaseRecords().isEmpty())
            {
                analyticsUtil.sendScreen("Wallet Balance Verify Your Identity", new AnalyticsCustomDimension[0]);
                return true;
            } else
            {
                analyticsUtil.sendScreen("Wallet Balance Verify Your Identity To Claim Money", new AnalyticsCustomDimension[0]);
                return false;
            }
        }
        return false;
    }
}
