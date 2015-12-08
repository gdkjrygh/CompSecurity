// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.wallet.bankaccount.api.BankAccount;
import com.google.android.apps.wallet.bankaccount.api.BankAccountApi;
import com.google.android.apps.wallet.bankaccount.api.BankAccountsModel;
import com.google.android.apps.wallet.bankaccount.api.BankAccountsModelEvent;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.config.featurecontrol.FeaturesChangedEvent;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.eventbus.HandlerRegistration;
import com.google.android.apps.wallet.funding.widgets.VerifyBankAccountDialogFragment;
import com.google.android.apps.wallet.kyc.api.KycStatusPublisher;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import com.google.android.apps.wallet.storedvalue.api.StoredValueEvent;
import com.google.android.apps.wallet.storedvalue.api.StoredValueModel;
import com.google.android.apps.wallet.topup.api.TopUpApi;
import com.google.android.apps.wallet.transfer.api.TransferApi;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.android.apps.wallet.withdraw.WithdrawActivity;
import com.google.common.base.Strings;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.storedvalue:
//            TileFragment

public class WalletBalanceAmountFragment extends TileFragment
{

    private Button addFund;
    private TextView balanceTextView;
    private HandlerRegistration bankAccountsModelEventRegistration;
    private View errorMsg;
    EventBus eventBus;
    FeatureManager featureManager;
    private HandlerRegistration kycStatusEventRegistration;
    KycStatusPublisher kycStatusPublisher;
    NetworkAccessChecker networkAccessChecker;
    private View positiveAmountButtons;
    private Button settleButton;
    private boolean shouldShow;
    FullScreenProgressSpinnerManager spinnerManager;
    private StoredValueEvent storedValueEvent;
    private Button transferFund;

    public WalletBalanceAmountFragment()
    {
        shouldShow = false;
    }

    private void displayStoredValue()
    {
        shouldShow = true;
        updateStoredValueViewsVisibilities();
        Object obj = storedValueEvent.getModel();
        if (obj == null)
        {
            showUnknownBalanceAmount();
            return;
        }
        obj = ((StoredValueModel) (obj)).getStoredValue();
        if (obj == null)
        {
            showUnknownBalanceAmount();
            return;
        }
        if (((com.google.wallet.proto.NanoWalletEntities.StoredValue) (obj)).balance.amount.micros.longValue() < 0L)
        {
            settleButton.setVisibility(0);
            positiveAmountButtons.setVisibility(8);
            final com.google.wallet.proto.NanoWalletEntities.MoneyProto amountOwed = ((com.google.wallet.proto.NanoWalletEntities.StoredValue) (obj)).requiredTopUpAmount.amount;
            settleButton.setOnClickListener(new android.view.View.OnClickListener() {

                final WalletBalanceAmountFragment this$0;
                final com.google.wallet.proto.NanoWalletEntities.MoneyProto val$amountOwed;

                public final void onClick(View view)
                {
                    view = TransferApi.createConfirmMoneyTransferIntent(getActivity(), 3, amountOwed.micros.longValue(), amountOwed.currencyCode, null, null);
                    startActivity(view);
                }

            
            {
                this$0 = WalletBalanceAmountFragment.this;
                amountOwed = moneyproto;
                super();
            }
            });
        } else
        {
            settleButton.setVisibility(8);
            positiveAmountButtons.setVisibility(0);
        }
        obj = ((com.google.wallet.proto.NanoWalletEntities.StoredValue) (obj)).balance.displayAmount;
        if (Strings.isNullOrEmpty(((String) (obj))))
        {
            showUnknownBalanceAmount();
            return;
        }
        balanceTextView.setText(((CharSequence) (obj)));
        if (storedValueEvent.getFailureCause() != null)
        {
            errorMsg.setVisibility(0);
            return;
        } else
        {
            errorMsg.setVisibility(8);
            return;
        }
    }

    private void onFeaturesChanged(FeaturesChangedEvent featureschangedevent)
    {
        if (featureschangedevent.didFeatureStateChange(Feature.STORED_VALUE_TOPUP) || featureschangedevent.didFeatureStateChange(Feature.STORED_VALUE_WITHDRAWAL) || featureschangedevent.didFeatureStateChange(Feature.BANK_ACCOUNT))
        {
            updateStoredValueViewsVisibilities();
            notifyTileChanged();
        }
    }

    private void onGetBankAccountsModelEvent(BankAccountsModelEvent bankaccountsmodelevent)
    {
        if (bankaccountsmodelevent.getFailureCause() != null)
        {
            spinnerManager.hide();
            AlertDialogFragment.newBuilder().setMessage(getString(com.google.android.apps.walletnfcrel.R.string.withdraw_error_please_try_again)).build().show(getActivity().getSupportFragmentManager());
            return;
        }
        bankaccountsmodelevent = bankaccountsmodelevent.getModel().getBankAccounts();
        spinnerManager.hide();
        if (bankaccountsmodelevent.isEmpty())
        {
            startActivity(BankAccountApi.createAddBankAccountActivityWithUseIntent(getActivity(), 4));
            return;
        }
        bankaccountsmodelevent = (BankAccount)bankaccountsmodelevent.get(0);
        com.google.wallet.proto.NanoWalletEntities.RestrictedInstrumentUse restrictedinstrumentuse = bankaccountsmodelevent.getRestrictedUseExcludingUnverified(4);
        if (restrictedinstrumentuse != null)
        {
            AlertDialogFragment.newBuilder().setTitle(restrictedinstrumentuse.shortMessage).setMessage(restrictedinstrumentuse.longMessage).build().show(getActivity().getSupportFragmentManager());
            return;
        }
        if (bankaccountsmodelevent.isValid())
        {
            startActivity(WithdrawActivity.createIntent(getActivity()));
            return;
        } else
        {
            VerifyBankAccountDialogFragment verifybankaccountdialogfragment = new VerifyBankAccountDialogFragment();
            verifybankaccountdialogfragment.setBankAccount(bankaccountsmodelevent);
            verifybankaccountdialogfragment.show(getActivity().getSupportFragmentManager());
            return;
        }
    }

    private void onStoredValueEvent(StoredValueEvent storedvalueevent)
    {
        storedValueEvent = storedvalueevent;
        displayStoredValue();
        notifyTileChanged();
    }

    private void registerKycStatusEvent()
    {
        kycStatusEventRegistration = eventBus.register(this, com/google/android/apps/wallet/kyc/api/KycStatusPublisher$KycStatusEvent, new EventHandler() {

            final WalletBalanceAmountFragment this$0;

            private void handleEvent(com.google.android.apps.wallet.kyc.api.KycStatusPublisher.KycStatusEvent kycstatusevent)
            {
                if (kycstatusevent.getStatus() != null && kycstatusevent.getStatus().intValue() == 1)
                {
                    eventBus.unregister(new HandlerRegistration[] {
                        kycStatusEventRegistration
                    });
                    registerStoredValueEvent();
                }
            }

            public final volatile void handleEvent(Object obj)
            {
                handleEvent((com.google.android.apps.wallet.kyc.api.KycStatusPublisher.KycStatusEvent)obj);
            }

            
            {
                this$0 = WalletBalanceAmountFragment.this;
                super();
            }
        });
    }

    private void registerStoredValueEvent()
    {
        eventBus.register(this, com/google/android/apps/wallet/storedvalue/api/StoredValueEvent, new EventHandler() {

            final WalletBalanceAmountFragment this$0;

            private void handleEvent(StoredValueEvent storedvalueevent)
            {
                onStoredValueEvent(storedvalueevent);
            }

            public final volatile void handleEvent(Object obj)
            {
                handleEvent((StoredValueEvent)obj);
            }

            
            {
                this$0 = WalletBalanceAmountFragment.this;
                super();
            }
        });
        eventBus.register(this, com/google/android/apps/wallet/config/featurecontrol/FeaturesChangedEvent, new EventHandler() {

            final WalletBalanceAmountFragment this$0;

            private void handleEvent(FeaturesChangedEvent featureschangedevent)
            {
                onFeaturesChanged(featureschangedevent);
            }

            public final volatile void handleEvent(Object obj)
            {
                handleEvent((FeaturesChangedEvent)obj);
            }

            
            {
                this$0 = WalletBalanceAmountFragment.this;
                super();
            }
        });
    }

    private void showUnknownBalanceAmount()
    {
        balanceTextView.setText(getString(com.google.android.apps.walletnfcrel.R.string.unknown_wallet_balance_amount));
        errorMsg.setVisibility(8);
    }

    private void updateStoredValueViewsVisibilities()
    {
        if (featureManager.isFeatureEnabled(Feature.STORED_VALUE_TOPUP))
        {
            addFund.setVisibility(0);
        } else
        {
            addFund.setVisibility(8);
        }
        if (featureManager.isFeatureEnabled(Feature.STORED_VALUE_WITHDRAWAL) && featureManager.isFeatureEnabled(Feature.BANK_ACCOUNT))
        {
            transferFund.setVisibility(0);
            return;
        } else
        {
            transferFund.setVisibility(8);
            return;
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.wallet_balance_amount_fragment, viewgroup, false);
        balanceTextView = (TextView)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.BalanceFragmentAmount);
        addFund = (Button)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.AddFund);
        transferFund = (Button)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.TransferFund);
        errorMsg = Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.ErrorMsg);
        positiveAmountButtons = Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.PositiveAmountButtons);
        settleButton = (Button)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.Settle);
        updateStoredValueViewsVisibilities();
        addFund.setOnClickListener(new android.view.View.OnClickListener() {

            final WalletBalanceAmountFragment this$0;

            public final void onClick(View view)
            {
                if (!networkAccessChecker.check())
                {
                    return;
                } else
                {
                    startActivity(TopUpApi.createTopUpActivityIntent(getActivity()));
                    return;
                }
            }

            
            {
                this$0 = WalletBalanceAmountFragment.this;
                super();
            }
        });
        transferFund.setOnClickListener(new android.view.View.OnClickListener() {

            final WalletBalanceAmountFragment this$0;

            public final void onClick(View view)
            {
                if (!networkAccessChecker.check())
                {
                    return;
                } else
                {
                    spinnerManager.show();
                    bankAccountsModelEventRegistration = eventBus.register(this, com/google/android/apps/wallet/bankaccount/api/BankAccountsModelEvent, new EventHandler() {

                        final _cls5 this$1;

                        private void handleEvent(BankAccountsModelEvent bankaccountsmodelevent)
                        {
                            eventBus.unregister(new HandlerRegistration[] {
                                bankAccountsModelEventRegistration
                            });
                            bankAccountsModelEventRegistration = null;
                            onGetBankAccountsModelEvent(bankaccountsmodelevent);
                        }

                        public final volatile void handleEvent(Object obj)
                        {
                            handleEvent((BankAccountsModelEvent)obj);
                        }

            
            {
                this$1 = _cls5.this;
                super();
            }
                    });
                    return;
                }
            }

            
            {
                this$0 = WalletBalanceAmountFragment.this;
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
        if (kycStatusPublisher.hasPassedKyc())
        {
            registerStoredValueEvent();
            return;
        } else
        {
            registerKycStatusEvent();
            notifyTileChanged();
            return;
        }
    }

    public final boolean shouldShow()
    {
        return shouldShow;
    }







/*
    static HandlerRegistration access$402(WalletBalanceAmountFragment walletbalanceamountfragment, HandlerRegistration handlerregistration)
    {
        walletbalanceamountfragment.bankAccountsModelEventRegistration = handlerregistration;
        return handlerregistration;
    }

*/

}
