// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.pin.CloudPinManager;
import com.google.android.apps.wallet.pin.PinSettingsActivity;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import java.util.concurrent.Callable;

public class LegacySetupNfcPaymentCongratsActivity extends WalletActivity
{

    private static final String TAG = com/google/android/apps/wallet/hce/setup/LegacySetupNfcPaymentCongratsActivity.getSimpleName();
    ActionExecutor actionExecutor;
    CloudPinManager cloudPinManager;
    private volatile boolean fetchedPinTimeout;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    private final Callable getPinTimeoutAction = new Callable() {

        final LegacySetupNfcPaymentCongratsActivity this$0;

        private Integer call()
            throws Exception
        {
            return Integer.valueOf(cloudPinManager.getPinTimeout());
        }

        public final volatile Object call()
            throws Exception
        {
            return call();
        }

            
            {
                this$0 = LegacySetupNfcPaymentCongratsActivity.this;
                super();
            }
    };
    private final AsyncCallback getPinTimeoutCallback = new AsyncCallback() {

        final LegacySetupNfcPaymentCongratsActivity this$0;

        private void onSuccess(Integer integer)
        {
            boolean flag = true;
            fetchedPinTimeout = true;
            if (integer.intValue() != 0)
            {
                flag = false;
            }
            updatePinTimeoutMessage(flag);
            hideSpinnerIfAllReceived();
        }

        private void updatePinTimeoutMessage(boolean flag)
        {
            if (!flag)
            {
                pinTimeoutRecommendationMessage.setVisibility(8);
                return;
            } else
            {
                Views.setNativeLink(pinTimeoutRecommendationMessage, com.google.android.apps.walletnfcrel.R.string.setup_nfc_congrats_message_pin_expiration_reminder, InternalIntents.forClass(LegacySetupNfcPaymentCongratsActivity.this, com/google/android/apps/wallet/pin/PinSettingsActivity));
                pinTimeoutRecommendationMessage.setVisibility(0);
                return;
            }
        }

        public final void onFailure(Exception exception)
        {
            fetchedPinTimeout = true;
            updatePinTimeoutMessage(true);
            hideSpinnerIfAllReceived();
            WLog.d(LegacySetupNfcPaymentCongratsActivity.TAG, "Unable to fetch pin timeout from the secure pin manager, default to show user reminder message");
        }

        public final volatile void onSuccess(Object obj)
        {
            onSuccess((Integer)obj);
        }

            
            {
                this$0 = LegacySetupNfcPaymentCongratsActivity.this;
                super();
            }
    };
    private TextView pinTimeoutRecommendationMessage;
    UriRegistry uriRegistry;

    public LegacySetupNfcPaymentCongratsActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
        pinTimeoutRecommendationMessage = null;
        fetchedPinTimeout = false;
    }

    private void hideSpinnerIfAllReceived()
    {
        if (fetchedPinTimeout)
        {
            fullScreenProgressSpinnerManager.hide();
        }
    }

    protected final void doOnCreate(Bundle bundle)
    {
        fullScreenProgressSpinnerManager.show();
        setContentView(com.google.android.apps.walletnfcrel.R.layout.legacy_setup_nfc_congrats);
        pinTimeoutRecommendationMessage = (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.PinTimeoutRecommendationMessage);
        setTitle(com.google.android.apps.walletnfcrel.R.string.setup_nfc_congrats_title);
        Views.setNativeLink((TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.NfcGuideLink), com.google.android.apps.walletnfcrel.R.string.setup_nfc_guide, InternalIntents.forClass(this, "com.google.android.apps.wallet.help.ui.HowToPurchaseSynopsisActivity"));
        findViewById(com.google.android.apps.walletnfcrel.R.id.ConfirmNfcSetupDone).setOnClickListener(new android.view.View.OnClickListener() {

            final LegacySetupNfcPaymentCongratsActivity this$0;

            public final void onClick(View view)
            {
                finish();
            }

            
            {
                this$0 = LegacySetupNfcPaymentCongratsActivity.this;
                super();
            }
        });
    }

    protected final void doOnResume()
    {
        actionExecutor.executeAction(getPinTimeoutAction, getPinTimeoutCallback);
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    protected void onPause()
    {
        actionExecutor.cancelAll();
        super.onPause();
    }

    protected final void onUpPressed()
    {
        navigateUpWithIntent(uriRegistry.createIntent(2, new Object[0]));
    }



/*
    static boolean access$002(LegacySetupNfcPaymentCongratsActivity legacysetupnfcpaymentcongratsactivity, boolean flag)
    {
        legacysetupnfcpaymentcongratsactivity.fetchedPinTimeout = flag;
        return flag;
    }

*/



}
