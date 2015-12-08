// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.settings.UserSettingsEvent;
import com.google.android.apps.wallet.settings.api.SettingsApi;
import com.google.android.apps.wallet.storedvalue.api.StoredValueEvent;
import com.google.android.apps.wallet.storedvalue.api.StoredValueModel;
import com.google.android.apps.wallet.util.view.Views;

// Referenced classes of package com.google.android.apps.wallet.storedvalue:
//            TileFragment

public class WalletBalanceLowBalanceFragment extends TileFragment
{

    EventBus eventBus;
    FeatureManager featureManager;
    private boolean hasStoredValue;
    private TextView line2;
    private com.google.wallet.proto.api.NanoWalletSettings.LowBalanceSettings lowBalanceSettings;

    public WalletBalanceLowBalanceFragment()
    {
        hasStoredValue = false;
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.wallet_balance_low_balance_fragment, viewgroup, false);
        line2 = (TextView)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.Line2);
        layoutinflater.findViewById(com.google.android.apps.walletnfcrel.R.id.Tile).setOnClickListener(new android.view.View.OnClickListener() {

            final WalletBalanceLowBalanceFragment this$0;

            public final void onClick(View view)
            {
                startActivity(SettingsApi.createLowBalanceSettingsActivityIntentForWalletBalance(getActivity()));
            }

            
            {
                this$0 = WalletBalanceLowBalanceFragment.this;
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

    public void onStoredValueEvent(StoredValueEvent storedvalueevent)
    {
        boolean flag;
        if (storedvalueevent.isFeatureEnabled() && storedvalueevent.getModel() != null && storedvalueevent.getModel().getStoredValue() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hasStoredValue = flag;
        notifyTileChanged();
    }

    public void onUserSettingsEvent(UserSettingsEvent usersettingsevent)
    {
        usersettingsevent = usersettingsevent.getSettings();
        if (usersettingsevent != null && ((com.google.wallet.proto.api.NanoWalletSettings.Settings) (usersettingsevent)).lowBalanceSettings != null)
        {
            lowBalanceSettings = ((com.google.wallet.proto.api.NanoWalletSettings.Settings) (usersettingsevent)).lowBalanceSettings;
            TextView textview = line2;
            if (((com.google.wallet.proto.api.NanoWalletSettings.Settings) (usersettingsevent)).enableNotifications.booleanValue() && lowBalanceSettings.enableNotifications.booleanValue())
            {
                usersettingsevent = getString(com.google.android.apps.walletnfcrel.R.string.low_balance_tile_threshold, new Object[] {
                    lowBalanceSettings.balanceThreshold.displayAmount
                });
            } else
            {
                usersettingsevent = getString(com.google.android.apps.walletnfcrel.R.string.low_balance_tile_setup);
            }
            textview.setText(usersettingsevent);
        } else
        {
            lowBalanceSettings = null;
        }
        notifyTileChanged();
    }

    public final boolean shouldShow()
    {
        return featureManager.isFeatureEnabled(Feature.LOW_BALANCE_ALERT) && hasStoredValue && lowBalanceSettings != null;
    }
}
