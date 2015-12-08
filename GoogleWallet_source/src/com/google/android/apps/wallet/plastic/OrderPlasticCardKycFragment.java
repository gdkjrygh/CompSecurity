// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.apps.wallet.base.fragment.WalletFragment;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.kyc.api.KycApi;
import com.google.android.apps.wallet.util.view.Views;

public class OrderPlasticCardKycFragment extends WalletFragment
{

    EventBus eventBus;
    FeatureManager featureManager;
    KycApi kycApi;

    public OrderPlasticCardKycFragment()
    {
    }

    private void onKycExperimentEvent(com.google.android.apps.wallet.kyc.api.KycExperimentPublisher.KycExperimentEvent kycexperimentevent)
    {
        Button button = (Button)Views.findViewById(getActivity(), com.google.android.apps.walletnfcrel.R.id.twoStepKycButton);
        Button button1 = (Button)Views.findViewById(getActivity(), com.google.android.apps.walletnfcrel.R.id.manualKycButton);
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

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        getActivity().setTitle(com.google.android.apps.walletnfcrel.R.string.verify_your_identity);
        layoutinflater = layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.order_plastic_kyc_fragment, viewgroup, false);
        ((Button)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.twoStepKycButton)).setOnClickListener(new android.view.View.OnClickListener() {

            final OrderPlasticCardKycFragment this$0;

            public final void onClick(View view)
            {
                getActivity().startActivityForResult(KycApi.createTwoStepKycActivityIntentForPlasticCard(getActivity()), 1);
            }

            
            {
                this$0 = OrderPlasticCardKycFragment.this;
                super();
            }
        });
        ((Button)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.manualKycButton)).setOnClickListener(new android.view.View.OnClickListener() {

            final OrderPlasticCardKycFragment this$0;

            public final void onClick(View view)
            {
                getActivity().startActivityForResult(KycApi.createManualKycActivityIntentForPlasticCard(getActivity()), 1);
            }

            
            {
                this$0 = OrderPlasticCardKycFragment.this;
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
}
