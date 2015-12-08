// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.kyc.SplashScreenDisplay;
import com.google.android.apps.wallet.plastic.api.PlasticCard;
import com.google.android.apps.wallet.plastic.api.PlasticCardModel;
import com.google.android.apps.wallet.plastic.api.PlasticCardModelEvent;
import com.google.android.apps.wallet.ui.listener.OnActionListener;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;

public class OrderPlasticCardCongratulationsActivity extends WalletActivity
{

    SplashScreenDisplay display;
    EventBus eventBus;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    UriRegistry uriRegistry;

    public OrderPlasticCardCongratulationsActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    public static Intent createIntent(Context context)
    {
        return InternalIntents.forClass(context, com/google/android/apps/wallet/plastic/OrderPlasticCardCongratulationsActivity);
    }

    protected final void doOnCreate(Bundle bundle)
    {
        display.createView(getLayoutInflater());
        display.setImageResource(com.google.android.apps.walletnfcrel.R.drawable.img_large_order_complete_envelope);
        display.setHeadLine(getString(com.google.android.apps.walletnfcrel.R.string.congratulate_plastic_card_order_message));
        display.setBodyText1(getString(com.google.android.apps.walletnfcrel.R.string.congratulate_plastic_card_order_default_description));
        display.setBodyText2(null);
        display.setLinkText(null);
        display.setButtonText(getString(com.google.android.apps.walletnfcrel.R.string.button_done));
        display.setButtonOnActionListener(new OnActionListener() {

            final OrderPlasticCardCongratulationsActivity this$0;

            private void onAction(Void void1)
            {
                finish();
            }

            public final volatile void onAction(Object obj)
            {
                onAction((Void)obj);
            }

            
            {
                this$0 = OrderPlasticCardCongratulationsActivity.this;
                super();
            }
        });
        setContentView(display.getView());
        setTitle(com.google.android.apps.walletnfcrel.R.string.congratulate_plastic_card_order_activity_title);
        fullScreenProgressSpinnerManager.show();
    }

    public final void doOnResume()
    {
        eventBus.register(this);
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public void onNewPlasticCardModel(PlasticCardModelEvent plasticcardmodelevent)
    {
        fullScreenProgressSpinnerManager.hide();
        if (plasticcardmodelevent != null && plasticcardmodelevent.getModel() != null && plasticcardmodelevent.getModel().hasCard())
        {
            plasticcardmodelevent = plasticcardmodelevent.getModel().getCard();
            if (plasticcardmodelevent.hasEstimatedDeliveryDays())
            {
                display.setBodyText1(getString(com.google.android.apps.walletnfcrel.R.string.congratulate_plastic_card_order_description, new Object[] {
                    Integer.valueOf(plasticcardmodelevent.getMinEstimatedDeliveryDays()), Integer.valueOf(plasticcardmodelevent.getMaxEstimatedDeliveryDays())
                }));
            }
        }
    }

    protected void onPause()
    {
        eventBus.unregisterAll(this);
        super.onPause();
    }

    protected final void onUpPressed()
    {
        navigateUpWithIntent(uriRegistry.createIntent(2, new Object[0]));
    }
}
