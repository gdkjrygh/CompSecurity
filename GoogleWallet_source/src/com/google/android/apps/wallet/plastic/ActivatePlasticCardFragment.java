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
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.callstatus.CallErrorDialogs;
import com.google.android.apps.wallet.data.StringValidators;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import com.google.android.apps.wallet.plastic.api.PlasticCard;
import com.google.android.apps.wallet.plastic.api.PlasticCardModel;
import com.google.android.apps.wallet.plastic.api.PlasticCardModelEvent;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.android.apps.wallet.widgets.validation.ValidatedEditText;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            ActivationFragment, ActivatePlasticCardAction, PlasticCardModelPublisher

public class ActivatePlasticCardFragment extends ActivationFragment
{

    private static final String TAG = com/google/android/apps/wallet/plastic/ActivatePlasticCardFragment.getSimpleName();
    ActionExecutor actionExecutor;
    EventBus eventBus;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    NetworkAccessChecker networkAccessChecker;
    PlasticCardModelPublisher plasticCardModelPublisher;

    public ActivatePlasticCardFragment()
    {
    }

    private void startActivation()
    {
        WLog.d(TAG, "Started Activation");
        final Button activateButton = (Button)Views.findViewById(getView(), com.google.android.apps.walletnfcrel.R.id.ActivateCardButton);
        activateButton.setClickable(false);
        activateButton.requestFocus();
        fullScreenProgressSpinnerManager.show();
        actionExecutor.executeAction(new ActivatePlasticCardAction(((ValidatedEditText)Views.findViewById(getView(), com.google.android.apps.walletnfcrel.R.id.PlasticCardLastFourField)).getValue(), plasticCardModelPublisher), new AsyncCallback() {

            final ActivatePlasticCardFragment this$0;
            final Button val$activateButton;

            private void onSuccess(Void void1)
            {
                analyticsUtil.sendSuccess("ActivateWalletCard", new AnalyticsCustomDimension[0]);
                activateButton.setClickable(true);
                requestNav(ActivationFragment.NavState.HOW_IT_WORKS);
                getView().setVisibility(8);
                Views.hideSoftKeyboard(getActivity(), getView());
                fullScreenProgressSpinnerManager.hide();
            }

            public final void onFailure(Exception exception)
            {
                WLog.e(ActivatePlasticCardFragment.TAG, "Failed to activate card. Stack Trace:", exception);
                analyticsUtil.sendError("ActivateWalletCard", new AnalyticsCustomDimension[0]);
                fullScreenProgressSpinnerManager.hide();
                CallErrorDialogs.createBuilder(exception, com.google.android.apps.walletnfcrel.R.string.activate_plastic_card_error_title, com.google.android.apps.walletnfcrel.R.string.activate_plastic_card_error_text).build().show(getActivity().getSupportFragmentManager());
                activateButton.setClickable(true);
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((Void)obj);
            }

            
            {
                this$0 = ActivatePlasticCardFragment.this;
                activateButton = button;
                super();
            }
        });
    }

    public final View onCreateView(LayoutInflater layoutinflater, final ViewGroup lastFour, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.activate_plastic_card, null);
        getActivity().setTitle(com.google.android.apps.walletnfcrel.R.string.activate_plastic_card_activity_title);
        lastFour = (ValidatedEditText)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.PlasticCardLastFourField);
        lastFour.setHint(getActivity().getString(com.google.android.apps.walletnfcrel.R.string.activate_plastic_card_hint));
        lastFour.setMaxLength(4);
        lastFour.setAutoAdvanceEnabled(true);
        lastFour.setInputType(2);
        ((Button)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.ActivateCardButton)).setOnClickListener(new android.view.View.OnClickListener() {

            final ActivatePlasticCardFragment this$0;
            final ValidatedEditText val$lastFour;

            public final void onClick(View view)
            {
                analyticsUtil.sendButtonTap("ActivateWalletCard", new AnalyticsCustomDimension[0]);
                if (lastFour.checkForError())
                {
                    analyticsUtil.sendUserError("ActivateWalletCard", new AnalyticsCustomDimension[0]);
                } else
                if (networkAccessChecker.check())
                {
                    startActivation();
                    return;
                }
            }

            
            {
                this$0 = ActivatePlasticCardFragment.this;
                lastFour = validatededittext;
                super();
            }
        });
        lastFour.setValidator(StringValidators.PLASTIC_CARD_LAST_FOUR);
        return layoutinflater;
    }

    public final void onDestroy()
    {
        super.onDestroy();
        actionExecutor.cancelAll();
    }

    public final void onPause()
    {
        eventBus.unregisterAll(this);
        super.onPause();
    }

    void onPlasticCardModel(PlasticCardModelEvent plasticcardmodelevent)
    {
        plasticcardmodelevent = plasticcardmodelevent.getModel();
        if (plasticcardmodelevent != null && plasticcardmodelevent.hasCard() && plasticcardmodelevent.getCard().getStatus() == com.google.android.apps.wallet.plastic.api.PlasticCard.Status.ACTIVATED)
        {
            requestNav(ActivationFragment.NavState.HOW_IT_WORKS);
        }
    }

    public final void onResume()
    {
        super.onResume();
        eventBus.register(this);
    }



}
