// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.plastic.PlasticCardTile;
import com.google.android.apps.wallet.plastic.api.PlasticCard;
import com.google.android.apps.wallet.plastic.api.PlasticCardModel;
import com.google.android.apps.wallet.plastic.api.PlasticCardModelEvent;
import com.google.android.apps.wallet.storedvalue.api.StoredValueEvent;
import com.google.android.apps.wallet.storedvalue.api.StoredValueModel;
import com.google.android.apps.wallet.tile.Tile;
import com.google.common.base.Objects;

// Referenced classes of package com.google.android.apps.wallet.storedvalue:
//            TileFragment

public class WalletBalancePlasticCardFragment extends TileFragment
{

    public static final String TAG = com/google/android/apps/wallet/storedvalue/WalletBalancePlasticCardFragment.getSimpleName();
    EventBus eventBus;
    FeatureManager featureManager;
    private boolean haveKyc;
    private boolean haveNotOrderedCard;
    private boolean haveStoredValue;
    SharedPreferences sharedPreferences;
    PlasticCardTile tile;

    public WalletBalancePlasticCardFragment()
    {
        haveKyc = false;
        haveStoredValue = false;
        haveNotOrderedCard = false;
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = new FrameLayout(getActivity());
        viewgroup = tile.onCreateView(layoutinflater);
        layoutinflater.addView(viewgroup);
        tile.setView(viewgroup);
        tile.addTileDismissedListener(new com.google.android.apps.wallet.tile.Tile.TileDismissedListener() {

            final WalletBalancePlasticCardFragment this$0;

            public final void onTileDismissed(Tile tile1)
            {
                notifyTileChanged();
            }

            
            {
                this$0 = WalletBalancePlasticCardFragment.this;
                super();
            }
        });
        return layoutinflater;
    }

    public void onKycStatusEvent(com.google.android.apps.wallet.kyc.api.KycStatusPublisher.KycStatusEvent kycstatusevent)
    {
        haveKyc = Objects.equal(kycstatusevent.getStatus(), Integer.valueOf(1));
        notifyTileChanged();
    }

    public void onNewPlasticCardModel(PlasticCardModelEvent plasticcardmodelevent)
    {
        if (plasticcardmodelevent != null && plasticcardmodelevent.getModel() != null)
        {
            boolean flag;
            if (!plasticcardmodelevent.getModel().hasCard() || plasticcardmodelevent.getModel().getCard().getStatus() == com.google.android.apps.wallet.plastic.api.PlasticCard.Status.NOT_REQUESTED)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            haveNotOrderedCard = flag;
            notifyTileChanged();
        }
    }

    public final void onPause()
    {
        super.onPause();
        tile.onDeactivate();
        eventBus.unregisterAll(this);
    }

    public final void onResume()
    {
        super.onResume();
        eventBus.register(this);
        tile.onActivate();
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
        haveStoredValue = flag;
        notifyTileChanged();
    }

    public final boolean shouldShow()
    {
        return featureManager.isFeatureEnabled(Feature.WALLET_CARD) && haveKyc && haveStoredValue && haveNotOrderedCard && !((Boolean)SharedPreference.ORDER_PLASTIC_CARD_TILE_DISMISSED.get(sharedPreferences)).booleanValue();
    }

}
