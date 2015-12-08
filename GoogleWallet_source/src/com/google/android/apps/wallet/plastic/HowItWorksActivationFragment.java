// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.storedvalue.api.StoredValueEvent;
import com.google.android.apps.wallet.storedvalue.api.StoredValueModel;
import com.google.android.apps.wallet.util.view.Views;
import com.google.common.base.Strings;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            ActivationFragment

public class HowItWorksActivationFragment extends ActivationFragment
    implements android.view.View.OnClickListener
{

    TextView balanceAmount;
    View balanceSection;
    EventBus eventBus;

    public HowItWorksActivationFragment()
    {
    }

    public void onClick(View view)
    {
        requestNav(ActivationFragment.NavState.CONGRATULATIONS);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        getActivity().setTitle(com.google.android.apps.walletnfcrel.R.string.activate_how_it_works_title);
        layoutinflater = layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.activate_how_it_works, null);
        layoutinflater.findViewById(com.google.android.apps.walletnfcrel.R.id.NextButton).setOnClickListener(this);
        balanceSection = Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.HowPlasticCardWorkBalanceSection);
        balanceSection.setVisibility(8);
        balanceAmount = (TextView)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.HowPlasticCardWorkBalanceAmount);
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

    public void onStoredValueEvent(StoredValueEvent storedvalueevent)
    {
        if (storedvalueevent.getModel() != null && storedvalueevent.isFeatureEnabled() && storedvalueevent.getModel().getStoredValue() != null)
        {
            if (((com.google.wallet.proto.NanoWalletEntities.StoredValue) (storedvalueevent = storedvalueevent.getModel().getStoredValue())).balance.amount.micros.longValue() >= 0L && !Strings.isNullOrEmpty(storedvalueevent = ((com.google.wallet.proto.NanoWalletEntities.StoredValue) (storedvalueevent)).balance.displayAmount))
            {
                balanceSection.setVisibility(0);
                balanceAmount.setText(storedvalueevent);
                return;
            }
        }
    }
}
