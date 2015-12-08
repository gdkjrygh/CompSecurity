// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.wallet.api.UriIntents;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.help.api.HelpUrls;
import com.google.android.apps.wallet.topup.api.TopUpApi;
import com.google.android.apps.wallet.util.view.Views;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            ActivationFragment

public class CongratulationsActivationFragment extends ActivationFragment
    implements android.view.View.OnClickListener
{

    FeatureManager featureManager;

    public CongratulationsActivationFragment()
    {
    }

    public void onClick(View view)
    {
        getActivity().finish();
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        getActivity().setTitle(com.google.android.apps.walletnfcrel.R.string.activate_complete_title);
        layoutinflater = layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.activate_congratulations, null);
        layoutinflater.findViewById(com.google.android.apps.walletnfcrel.R.id.DoneButton).setOnClickListener(this);
        viewgroup = layoutinflater.findViewById(com.google.android.apps.walletnfcrel.R.id.AddMoneyButton);
        if (featureManager.isFeatureEnabled(Feature.STORED_VALUE_TOPUP))
        {
            viewgroup.setOnClickListener(new android.view.View.OnClickListener() {

                final CongratulationsActivationFragment this$0;

                public final void onClick(View view)
                {
                    startActivity(TopUpApi.createTopUpActivityIntent(getActivity()));
                }

            
            {
                this$0 = CongratulationsActivationFragment.this;
                super();
            }
            });
        } else
        {
            viewgroup.setVisibility(4);
        }
        Views.setLinkOnClickListener(layoutinflater.findViewById(com.google.android.apps.walletnfcrel.R.id.LearnMore), new android.view.View.OnClickListener() {

            final CongratulationsActivationFragment this$0;

            public final void onClick(View view)
            {
                view = UriIntents.create(getActivity(), HelpUrls.createWalletCardFaqUrl());
                startActivity(view);
            }

            
            {
                this$0 = CongratulationsActivationFragment.this;
                super();
            }
        }, com.google.android.apps.walletnfcrel.R.string.activate_complete_learn_more);
        return layoutinflater;
    }
}
