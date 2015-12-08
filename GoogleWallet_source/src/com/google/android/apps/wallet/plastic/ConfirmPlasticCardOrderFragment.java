// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.wallet.base.fragment.WalletFragment;
import com.google.android.apps.wallet.callstatus.CallErrorDialogs;
import com.google.android.apps.wallet.fragment.Fragments;
import com.google.android.apps.wallet.help.api.HelpUrls;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            OrderPlasticCardCongratulationsActivity, OrderPlasticCardUiModel, SelectShippingAddressFragment

public class ConfirmPlasticCardOrderFragment extends WalletFragment
{

    private static final String TAG = com/google/android/apps/wallet/plastic/ConfirmPlasticCardOrderFragment.getSimpleName();
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    NetworkAccessChecker networkAccessChecker;
    OrderPlasticCardAction.Factory orderPlasticCardActionFactory;
    private OrderPlasticCardUiModel uiModel;
    UserEventLogger userEventLogger;

    public ConfirmPlasticCardOrderFragment()
    {
    }

    private void completeOrder()
    {
        FragmentActivity fragmentactivity = getActivity();
        userEventLogger.log(21, 94);
        fragmentactivity.startActivity(OrderPlasticCardCongratulationsActivity.createIntent(fragmentactivity));
        fragmentactivity.setResult(-1);
        fragmentactivity.finish();
    }

    private static String createWalletCardTermsOfUseMarkup(Context context)
    {
        return context.getString(com.google.android.apps.walletnfcrel.R.string.wallet_card_terms_of_use, new Object[] {
            HelpUrls.createWalletCardTosUrl()
        });
    }

    private void handleActionFailure(Exception exception)
    {
        WLog.e(TAG, "Order card failed", exception);
        fullScreenProgressSpinnerManager.hide();
        getView().findViewById(com.google.android.apps.walletnfcrel.R.id.SendButton).setEnabled(true);
        CallErrorDialogs.createBuilder(exception, com.google.android.apps.walletnfcrel.R.string.order_plastic_card_error_title, com.google.android.apps.walletnfcrel.R.string.order_plastic_card_error_text).build().show(getActivity().getSupportFragmentManager());
    }

    private void orderPlasticCard()
    {
        if (!networkAccessChecker.check())
        {
            return;
        } else
        {
            getView().findViewById(com.google.android.apps.walletnfcrel.R.id.SendButton).setEnabled(false);
            fullScreenProgressSpinnerManager.showImmediately();
            executeAction("order_card", orderPlasticCardActionFactory.get(uiModel.getSelectedAddress()));
            return;
        }
    }

    private void refreshUi()
    {
        com.google.wallet.proto.NanoWalletEntities.Address address = uiModel.getSelectedAddress();
        String s = getString(com.google.android.apps.walletnfcrel.R.string.address_line3, new Object[] {
            address.city, address.state, address.postalCode
        });
        Views.setTextOrHide((TextView)getView().findViewById(com.google.android.apps.walletnfcrel.R.id.RecipientName), address.recipientName);
        Views.setTextOrHide((TextView)getView().findViewById(com.google.android.apps.walletnfcrel.R.id.AddressLine1), address.line1);
        Views.setTextOrHide((TextView)getView().findViewById(com.google.android.apps.walletnfcrel.R.id.AddressLine2), address.line2);
        Views.setTextOrHide((TextView)getView().findViewById(com.google.android.apps.walletnfcrel.R.id.AddressLine3), s);
    }

    public final boolean onActionFailure(String s, Callable callable, Exception exception)
    {
        if (!super.onActionFailure(s, callable, exception))
        {
            handleActionFailure(exception);
        }
        return true;
    }

    public final void onActionSuccess(String s, Callable callable, Object obj)
    {
        completeOrder();
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.confirm_plastic_card_order_activity, null);
        getActivity().setTitle(com.google.android.apps.walletnfcrel.R.string.confirm_plastic_card_order_activity_title);
        Views.setLinkOnClickListener((TextView)layoutinflater.findViewById(com.google.android.apps.walletnfcrel.R.id.EditAddress), new android.view.View.OnClickListener() {

            final ConfirmPlasticCardOrderFragment this$0;

            public final void onClick(View view)
            {
                getFragmentManager().beginTransaction().replace(com.google.android.apps.walletnfcrel.R.id.ChildActivityContainer, new SelectShippingAddressFragment(), Fragments.getTransactionTag(com/google/android/apps/wallet/plastic/SelectShippingAddressFragment)).addToBackStack(null).commit();
            }

            
            {
                this$0 = ConfirmPlasticCardOrderFragment.this;
                super();
            }
        });
        layoutinflater.findViewById(com.google.android.apps.walletnfcrel.R.id.SendButton).setOnClickListener(new android.view.View.OnClickListener() {

            final ConfirmPlasticCardOrderFragment this$0;

            public final void onClick(View view)
            {
                orderPlasticCard();
            }

            
            {
                this$0 = ConfirmPlasticCardOrderFragment.this;
                super();
            }
        });
        Views.setLink((TextView)layoutinflater.findViewById(com.google.android.apps.walletnfcrel.R.id.TermsOfUse), createWalletCardTermsOfUseMarkup(layoutinflater.getContext()));
        return layoutinflater;
    }

    public final void onResume()
    {
        super.onResume();
        if (isActionRunning("order_card"))
        {
            fullScreenProgressSpinnerManager.showImmediately();
        }
        refreshUi();
    }

    public final void onStart()
    {
        super.onStart();
        userEventLogger.log(21, 93);
    }

    public final void setModel(OrderPlasticCardUiModel orderplasticcarduimodel)
    {
        uiModel = orderplasticcarduimodel;
    }


}
