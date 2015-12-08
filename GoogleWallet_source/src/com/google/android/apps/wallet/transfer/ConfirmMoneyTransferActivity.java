// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriIntents;
import com.google.android.apps.wallet.bankaccount.api.BankAccount;
import com.google.android.apps.wallet.bankaccount.api.BankAccountsModel;
import com.google.android.apps.wallet.bankaccount.api.BankAccountsModelEvent;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.callstatus.CallErrorDialogs;
import com.google.android.apps.wallet.cardlist.PaymentCardModel;
import com.google.android.apps.wallet.cardlist.PaymentCardModelEvent;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.funding.api.FeeDescriber;
import com.google.android.apps.wallet.funding.api.FundingApi;
import com.google.android.apps.wallet.funding.api.FundingSource;
import com.google.android.apps.wallet.help.api.HelpUrls;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.money.CurrencyUtil;
import com.google.android.apps.wallet.money.MoneyConverter;
import com.google.android.apps.wallet.p2p.api.Contact;
import com.google.android.apps.wallet.paymentcard.api.CdpId;
import com.google.android.apps.wallet.paymentcard.api.PaymentCard;
import com.google.android.apps.wallet.paymentcard.api.PaymentCardApi;
import com.google.android.apps.wallet.paymentcard.ui.AddressUpgradeRequiredDialog;
import com.google.android.apps.wallet.paymentcard.widgets.FundingSourceView;
import com.google.android.apps.wallet.pin.api.PinApi;
import com.google.android.apps.wallet.storedvalue.api.StoredValueEvent;
import com.google.android.apps.wallet.storedvalue.api.StoredValueModel;
import com.google.android.apps.wallet.storedvalue.api.StoredValuePublisher;
import com.google.android.apps.wallet.topup.api.TopUpApi;
import com.google.android.apps.wallet.transfer.api.FundsTransferClient;
import com.google.android.apps.wallet.transfer.api.FundsTransferInfoEvent;
import com.google.android.apps.wallet.transfer.ui.P2pHeaderFragment;
import com.google.android.apps.wallet.transfer.validator.MoneyTransferAmountValidator;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.android.apps.wallet.withdraw.WithdrawAction;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.protobuf.nano.MessageNano;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;

public class ConfirmMoneyTransferActivity extends WalletActivity
{

    private static final ImmutableMap ANALYTICS_LABEL = ImmutableMap.of(Integer.valueOf(1), "SendMoney", Integer.valueOf(3), "SettleBalance", Integer.valueOf(2), "TopUp", Integer.valueOf(5), "TransferToBank");
    private static final ImmutableMap ANALYTICS_SCREEN = ImmutableMap.of(Integer.valueOf(1), "Confirm Send Money", Integer.valueOf(3), "Confirm Settle Wallet Balance", Integer.valueOf(2), "Confirm Add Money", Integer.valueOf(5), "Review Transfer To Bank");
    private static final ImmutableMap BUTTON;
    private static final ImmutableMap CSI_TIMING = ImmutableMap.of(Integer.valueOf(1), "user_send_money", Integer.valueOf(3), "user_top_up", Integer.valueOf(2), "user_top_up", Integer.valueOf(5), "user_withdraw");
    protected static final ImmutableMap FEE_INFO_MODE = ImmutableMap.of(Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(3), Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(5), Integer.valueOf(3));
    private static final ImmutableMap INSTRUMENT_USE = ImmutableMap.of(Integer.valueOf(1), Integer.valueOf(3), Integer.valueOf(3), Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(5), Integer.valueOf(4));
    private static final String TAG = com/google/android/apps/wallet/transfer/ConfirmMoneyTransferActivity.getSimpleName();
    static final ImmutableMap TRANSACTION_TYPE = ImmutableMap.of(Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(3), Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(5), Integer.valueOf(3));
    ActionExecutor actionExecutor;
    AnalyticsUtil analyticsUtil;
    private Optional bankAccountsModelEvent;
    private String currencyCode;
    EventBus eventBus;
    private com.google.wallet.proto.api.NanoWalletFundsTransfer.GetFundsTransferAvailabilityResponse.HelpLink feeHelpLink;
    private com.google.wallet.proto.NanoWalletEntities.DisplayableMoney fees;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    FundsTransferClient fundsTransferClient;
    private Optional fundsTransferInfoEvent;
    protected boolean isFetchingDelay;
    private boolean isFetchingFees;
    private String longFeeDelayMessage;
    private String memo;
    private String moneyRequestId;
    MoneyTransferAmountValidator moneyTransferAmountValidator;
    private Optional paymentCardModelEvent;
    private long preFeeAmountMicros;
    private String previousError;
    private Contact recipient;
    private FundingSource selectedFundingSource;
    private boolean sendWhenFeesReady;
    private String shortFeeDelayMessage;
    private boolean shownLoadingError;
    private Optional storedValueEvent;
    StoredValuePublisher storedValuePublisher;
    private com.google.wallet.proto.NanoWalletEntities.DisplayableMoney totalAmount;
    private String transactionId;
    protected int transferType;

    public ConfirmMoneyTransferActivity()
    {
        this(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    public ConfirmMoneyTransferActivity(int i)
    {
        super(i);
        paymentCardModelEvent = Optional.absent();
        bankAccountsModelEvent = Optional.absent();
        storedValueEvent = Optional.absent();
        fundsTransferInfoEvent = Optional.absent();
    }

    private void clearFundingSourceDerivedData()
    {
        fees = null;
        totalAmount = null;
        shortFeeDelayMessage = null;
        longFeeDelayMessage = null;
        feeHelpLink = null;
        transactionId = null;
    }

    private void confirmAmountMismatch(com.google.wallet.proto.api.NanoWalletFundsTransfer.FundsTransferAmountMismatch fundstransferamountmismatch)
    {
        setTitle(com.google.android.apps.walletnfcrel.R.string.fee_changed_dialog_title);
        fees = fundstransferamountmismatch.expectedFeeAmount;
        totalAmount = fundstransferamountmismatch.expectedTotalAmount;
        renderOrFetchFees();
    }

    protected static Intent createSelectFundingSourceIntent(Context context, int i, FundingSource fundingsource, boolean flag)
    {
        return FundingApi.createSelectFundingSourceIntent(context, i, fundingsource, flag);
    }

    private boolean eventsAreReady()
    {
        return paymentCardModelEvent.isPresent() && bankAccountsModelEvent.isPresent() && storedValueEvent.isPresent() && fundsTransferInfoEvent.isPresent();
    }

    private static int getActivityLayout()
    {
        return com.google.android.apps.walletnfcrel.R.layout.confirm_money_transfer;
    }

    private com.google.wallet.proto.NanoWalletEntities.MoneyProto getAmount()
    {
        com.google.wallet.proto.NanoWalletEntities.MoneyProto moneyproto = new com.google.wallet.proto.NanoWalletEntities.MoneyProto();
        moneyproto.currencyCode = currencyCode;
        moneyproto.micros = Long.valueOf(preFeeAmountMicros);
        return moneyproto;
    }

    private List getBankAccountsFromEvent()
    {
        if (((BankAccountsModelEvent)bankAccountsModelEvent.get()).isFeatureEnabled())
        {
            return ((BankAccountsModelEvent)bankAccountsModelEvent.get()).getModel().getBankAccounts();
        } else
        {
            return ImmutableList.of();
        }
    }

    private String getSuccessMessage()
    {
        if (transferType == 1)
        {
            String s = MoneyConverter.toString(getAmount());
            return getString(com.google.android.apps.walletnfcrel.R.string.send_money_success_message, new Object[] {
                s, recipient.getPreferredHumanIdentifier()
            });
        }
        if (transferType == 2)
        {
            String s1;
            if (selectedFundingSource.isBankAccount())
            {
                s1 = getString(com.google.android.apps.walletnfcrel.R.string.top_up_bank_transfer_started);
            } else
            {
                s1 = MoneyConverter.toString(getAmount());
                s1 = getString(com.google.android.apps.walletnfcrel.R.string.top_up_transaction_succeed, new Object[] {
                    s1
                });
            }
            return s1;
        }
        if (transferType == 3)
        {
            return getString(com.google.android.apps.walletnfcrel.R.string.settle_balance_succeed);
        }
        if (transferType == 5)
        {
            return getString(com.google.android.apps.walletnfcrel.R.string.withdraw_transaction_succeed, new Object[] {
                MoneyConverter.toString(getAmount())
            });
        } else
        {
            throw new IllegalStateException();
        }
    }

    private void handleCallError(com.google.wallet.proto.NanoWalletError.CallError callerror)
    {
        CallErrorDialogs.createBuilderWithGenericTitle(callerror, com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message).build().show(getSupportFragmentManager());
        fullScreenProgressSpinnerManager.hide();
    }

    private void handleFetchDelayResponse(com.google.wallet.proto.api.NanoWalletFundsTransfer.GetFundsTransferAvailabilityResponse getfundstransferavailabilityresponse)
    {
        if (getfundstransferavailabilityresponse.callError != null) goto _L2; else goto _L1
_L1:
        if (getfundstransferavailabilityresponse.instant == null) goto _L4; else goto _L3
_L3:
        shortFeeDelayMessage = getfundstransferavailabilityresponse.instant.description;
_L5:
        renderOrFetchDelay();
        return;
_L4:
        if (getfundstransferavailabilityresponse.delay != null)
        {
            String s = String.valueOf(getfundstransferavailabilityresponse.delay.descriptionPrefix);
            String s1 = String.valueOf(getfundstransferavailabilityresponse.delay.description);
            shortFeeDelayMessage = (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append(" ").append(s1).toString();
            longFeeDelayMessage = getfundstransferavailabilityresponse.delay.explanation;
            feeHelpLink = getfundstransferavailabilityresponse.delay.helpLink;
        }
        if (true) goto _L5; else goto _L2
_L2:
        handleCallError(getfundstransferavailabilityresponse.callError);
        return;
    }

    private void handleFetchFeesResponse(com.google.wallet.proto.api.NanoWalletFundsTransfer.CalculateFeeResponse calculatefeeresponse)
    {
        if (calculatefeeresponse.callError == null)
        {
            fees = calculatefeeresponse.feeAmount;
            totalAmount = calculatefeeresponse.totalAmount;
            renderOrFetchFees();
            if (sendWhenFeesReady)
            {
                sendWhenFeesReady = false;
                sendMoneyTransferRequest();
            }
            return;
        } else
        {
            handleCallError(calculatefeeresponse.callError);
            return;
        }
    }

    private void handleFundTransferResponse(com.google.wallet.proto.api.NanoWalletFundsTransfer.WithdrawFundsResponse withdrawfundsresponse)
    {
        if (withdrawfundsresponse.callError != null)
        {
            handleMoneyTransferCallError(withdrawfundsresponse.callError, withdrawfundsresponse.amountMismatch);
            return;
        } else
        {
            storedValuePublisher.generateAndPostEvent();
            toastSuccessAndFinish();
            return;
        }
    }

    private boolean handleLoadingError(Throwable throwable)
    {
        if (throwable != null)
        {
            WLog.e(TAG, "Received exception from an event provider", throwable);
            if (!shownLoadingError && !eventsAreReady())
            {
                shownLoadingError = true;
                CallErrorDialogs.createBuilderWithGenericTitle(throwable, com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message).setFinishActivityOnClick().setFinishActivityOnDismiss().build().show(getSupportFragmentManager(), "loading_error_dialog");
            }
            return true;
        } else
        {
            return false;
        }
    }

    private void handleMoneyTransferCallError(com.google.wallet.proto.NanoWalletError.CallError callerror, com.google.wallet.proto.api.NanoWalletFundsTransfer.FundsTransferAmountMismatch fundstransferamountmismatch)
    {
        fullScreenProgressSpinnerManager.hide();
        int i = Protos.valueWithDefault(callerror.errorCode, 1);
        if (i == 5)
        {
            PinApi.startVerifyPinActivityForResult(this, 1);
            return;
        }
        if (i == 4)
        {
            analyticsUtil.sendError("MoneyTransferFeeChanged", new AnalyticsCustomDimension[0]);
            confirmAmountMismatch(fundstransferamountmismatch);
            return;
        }
        if (i == 8)
        {
            analyticsUtil.sendError("PaymentCardMinAddressUpgradeRequired", new AnalyticsCustomDimension[0]);
            showAddressUpgradeRequiredDialog();
            return;
        } else
        {
            analyticsUtil.sendError((String)ANALYTICS_LABEL.get(Integer.valueOf(transferType)), new AnalyticsCustomDimension[0]);
            handleCallError(callerror);
            return;
        }
    }

    private void handleOtherErrors(Exception exception)
    {
        WLog.e(TAG, "generic error", exception);
        AlertDialogFragment.newBuilder().setMessage(getString(com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message)).build().show(getSupportFragmentManager());
        fullScreenProgressSpinnerManager.hide();
    }

    private void handleSendMoneyResponse(com.google.wallet.proto.api.NanoWalletFundsTransfer.SendMoneyResponse sendmoneyresponse)
    {
        if (sendmoneyresponse.callError != null)
        {
            handleMoneyTransferCallError(sendmoneyresponse.callError, sendmoneyresponse.amountMismatch);
            return;
        } else
        {
            toastSuccessAndFinish();
            return;
        }
    }

    private void handleTopUpResponse(com.google.wallet.proto.api.NanoWalletFundsTransfer.AddToStoredValueResponse addtostoredvalueresponse)
    {
        if (addtostoredvalueresponse.callError != null)
        {
            handleMoneyTransferCallError(addtostoredvalueresponse.callError, addtostoredvalueresponse.amountMismatch);
            return;
        } else
        {
            toastSuccessAndFinish();
            return;
        }
    }

    private static boolean hasApplicableBankAccount(List list, int i)
    {
        return list != null && !list.isEmpty() && ((BankAccount)list.get(0)).isValid() && !((BankAccount)list.get(0)).isInapplicableForUse(i);
    }

    private void loadIntentExtras()
    {
        Preconditions.checkArgument(getIntent().hasExtra("type"));
        Preconditions.checkArgument(getIntent().hasExtra("amount"));
        Preconditions.checkArgument(getIntent().hasExtra("currency"));
        boolean flag;
        if (transferType != 1 || getIntent().hasExtra("contact"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        transferType = getIntent().getIntExtra("type", 0);
        if (transferType != 1 && transferType != 2 && transferType != 3 && transferType != 5)
        {
            int i = transferType;
            throw new IllegalArgumentException((new StringBuilder(32)).append("unknown transferType ").append(i).toString());
        } else
        {
            preFeeAmountMicros = getIntent().getLongExtra("amount", 0L);
            currencyCode = getIntent().getStringExtra("currency");
            memo = getIntent().getStringExtra("memo");
            recipient = (Contact)getIntent().getParcelableExtra("contact");
            moneyRequestId = getIntent().getStringExtra("money_request_id");
            return;
        }
    }

    private void renderDelayForNoFees()
    {
        if (transferType == 5)
        {
            TextView textview = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.FeeDelayText);
            View view = Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.FeeDelayBanner);
            Views.setLink(textview, getString(com.google.android.apps.walletnfcrel.R.string.withdraw_transaction_delay, new Object[] {
                HelpUrls.createWithdrawBalanceHelpUrl()
            }));
            textview.setVisibility(0);
            view.setVisibility(8);
            return;
        } else
        {
            throw new IllegalStateException();
        }
    }

    private void renderFeesForNoFees()
    {
        if (transferType == 5)
        {
            Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.AmountSection).setVisibility(8);
            return;
        } else
        {
            throw new IllegalStateException();
        }
    }

    private void renderFundingSourceFeesAndDelay()
    {
        Object obj = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.FundingSourceButton);
        ((TextView) (obj)).setText(com.google.android.apps.walletnfcrel.R.string.button_change);
        ((TextView) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

            final ConfirmMoneyTransferActivity this$0;

            public final void onClick(View view)
            {
                view = ConfirmMoneyTransferActivity.this;
                view = ConfirmMoneyTransferActivity.createSelectFundingSourceIntent(ConfirmMoneyTransferActivity.this, ((Integer)ConfirmMoneyTransferActivity.INSTRUMENT_USE.get(Integer.valueOf(transferType))).intValue(), selectedFundingSource, true);
                startActivityForResult(view, 2);
            }

            
            {
                this$0 = ConfirmMoneyTransferActivity.this;
                super();
            }
        });
        byte byte0;
        if (selectedFundingSource == null)
        {
            renderNoValidFundingSource();
        } else
        {
            renderSelectedFundingSource();
            renderOrFetchFees();
            renderOrFetchDelay();
        }
        obj = Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.ConfirmButton);
        if (selectedFundingSource == null)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        ((View) (obj)).setVisibility(byte0);
        if (!isActionRunning("send_money_action") && !isActionRunning("top_up_action"))
        {
            fullScreenProgressSpinnerManager.hide();
        }
    }

    private void renderIntentExtraData()
    {
        Object obj = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.TransferAmount);
        java.util.Currency currency = CurrencyUtil.getLegalAddressCurrency();
        ((TextView) (obj)).setText(CurrencyUtil.microsToDisplayableMoney(getAmount().micros.longValue(), currency));
        if (memo != null)
        {
            ((TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.RequestMemo)).setText(memo);
        }
        if (recipient != null)
        {
            ((TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.RecipientEmail)).setText(recipient.getEmailAddress());
            obj = getString(com.google.android.apps.walletnfcrel.R.string.send_money_to_name, new Object[] {
                recipient.getRealName()
            });
            ((TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.RecipientName)).setText(((CharSequence) (obj)));
            ((P2pHeaderFragment)getSupportFragmentManager().findFragmentById(com.google.android.apps.walletnfcrel.R.id.P2pHeaderFragment)).updateContactPhoto(recipient.getPhoto());
        }
        obj = (Button)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.ConfirmButton);
        ((Button) (obj)).setText(((Integer)BUTTON.get(Integer.valueOf(transferType))).intValue());
        ((Button) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

            final ConfirmMoneyTransferActivity this$0;

            public final void onClick(View view)
            {
                analyticsUtil.startTiming(null, (String)ConfirmMoneyTransferActivity.CSI_TIMING.get(Integer.valueOf(transferType)));
                analyticsUtil.sendButtonTap((String)ConfirmMoneyTransferActivity.ANALYTICS_LABEL.get(Integer.valueOf(transferType)), new AnalyticsCustomDimension[0]);
                WLog.i(ConfirmMoneyTransferActivity.TAG, "Send button clicked");
                sendMoneyTransferRequest();
            }

            
            {
                this$0 = ConfirmMoneyTransferActivity.this;
                super();
            }
        });
    }

    private void renderNoValidFundingSource()
    {
        findViewById(com.google.android.apps.walletnfcrel.R.id.AmountSection).setVisibility(8);
        FundingSourceView fundingsourceview = (FundingSourceView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.FundingSourceIcon);
        TextView textview = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.FundingSourceName);
        TextView textview1 = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.FundingSourceMessage);
        boolean flag;
        if (!((PaymentCardModelEvent)paymentCardModelEvent.get()).getModel().getAllCredentials().isEmpty() || !getBankAccountsFromEvent().isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            fundingsourceview.setFundingSource(null);
            textview.setText(com.google.android.apps.walletnfcrel.R.string.no_valid_funding_sources);
            textview1.setVisibility(8);
            return;
        }
        TextView textview2 = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.FundingSourceButton);
        if (transferType == 1)
        {
            fundingsourceview.setImageResource(com.google.android.apps.walletnfcrel.R.drawable.ic_fop_promo_debit_color_40dp);
            textview.setText(com.google.android.apps.walletnfcrel.R.string.debit_card_promo_title);
            textview1.setVisibility(0);
            textview1.setText(com.google.android.apps.walletnfcrel.R.string.debit_card_promo_message);
            textview2.setText(com.google.android.apps.walletnfcrel.R.string.button_add_card);
            textview2.setOnClickListener(new android.view.View.OnClickListener() {

                final ConfirmMoneyTransferActivity this$0;

                public final void onClick(View view)
                {
                    startActivity(PaymentCardApi.createAddNewCardIntent(ConfirmMoneyTransferActivity.this, "instrument_add_context_P2P"));
                }

            
            {
                this$0 = ConfirmMoneyTransferActivity.this;
                super();
            }
            });
            return;
        } else
        {
            fundingsourceview.setImageResource(com.google.android.apps.walletnfcrel.R.drawable.ic_fop_promo_bank_card_color_40dp);
            textview.setText(com.google.android.apps.walletnfcrel.R.string.no_funding_source_title);
            textview1.setVisibility(0);
            textview1.setText(com.google.android.apps.walletnfcrel.R.string.funding_source_add_or_link);
            textview2.setText(com.google.android.apps.walletnfcrel.R.string.button_add_card);
            return;
        }
    }

    private void renderOrFetchDelay()
    {
        if (((Integer)FEE_INFO_MODE.get(Integer.valueOf(transferType))).intValue() == 3)
        {
            renderDelayForNoFees();
        } else
        {
            TextView textview = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.FeeDelayText);
            View view = Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.FeeDelayBanner);
            if (shortFeeDelayMessage != null || longFeeDelayMessage != null)
            {
                TextView textview2 = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.FeeDelayBannerText);
                ImageButton imagebutton = (ImageButton)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.FeeDelayBannerButton);
                if (longFeeDelayMessage == null)
                {
                    textview.setText(shortFeeDelayMessage);
                    textview.setVisibility(0);
                    view.setVisibility(8);
                    return;
                } else
                {
                    textview2.setText(shortFeeDelayMessage);
                    textview.setVisibility(8);
                    view.setVisibility(0);
                    imagebutton.setOnClickListener(new android.view.View.OnClickListener() {

                        final ConfirmMoneyTransferActivity this$0;

                        public final void onClick(View view1)
                        {
                            AlertDialogFragment.newBuilder().setTitle(shortFeeDelayMessage).setMessage(longFeeDelayMessage).setNegativeButton(feeHelpLink.text).setNegativeButtonActionUri(Uri.parse(feeHelpLink.linkUri)).build().show(getSupportFragmentManager());
                        }

            
            {
                this$0 = ConfirmMoneyTransferActivity.this;
                super();
            }
                    });
                    return;
                }
            }
            if (!isFetchingDelay)
            {
                isFetchingDelay = true;
                TextView textview1 = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.FeeDelayText);
                textview1.setText(com.google.android.apps.walletnfcrel.R.string.transfer_availability_pending);
                textview1.setVisibility(0);
                actionExecutor.executeAction(new Callable() {

                    final ConfirmMoneyTransferActivity this$0;

                    private com.google.wallet.proto.api.NanoWalletFundsTransfer.GetFundsTransferAvailabilityResponse call()
                        throws Exception
                    {
                        com.google.wallet.proto.api.NanoWalletFundsTransfer.GetFundsTransferAvailabilityRequest getfundstransferavailabilityrequest = new com.google.wallet.proto.api.NanoWalletFundsTransfer.GetFundsTransferAvailabilityRequest();
                        getfundstransferavailabilityrequest.amount = getAmount();
                        getfundstransferavailabilityrequest.fundingInstrumentSubId = selectedFundingSource.getCdpId();
                        getfundstransferavailabilityrequest.transactionType = new com.google.wallet.proto.NanoWalletEntities.TransactionType();
                        getfundstransferavailabilityrequest.transactionType.type = (Integer)ConfirmMoneyTransferActivity.TRANSACTION_TYPE.get(Integer.valueOf(transferType));
                        if (((Integer)ConfirmMoneyTransferActivity.TRANSACTION_TYPE.get(Integer.valueOf(transferType))).intValue() == 1)
                        {
                            getfundstransferavailabilityrequest.recipient = new com.google.wallet.proto.NanoWalletEntities.AccountIdentifier();
                            getfundstransferavailabilityrequest.recipient.emailAddress = recipient.getEmailAddress();
                        }
                        return fundsTransferClient.getFundsTransferAvailability(getfundstransferavailabilityrequest);
                    }

                    public final volatile Object call()
                        throws Exception
                    {
                        return call();
                    }

            
            {
                this$0 = ConfirmMoneyTransferActivity.this;
                super();
            }
                }, new AsyncCallback() {

                    final ConfirmMoneyTransferActivity this$0;

                    private void onSuccess(com.google.wallet.proto.api.NanoWalletFundsTransfer.GetFundsTransferAvailabilityResponse getfundstransferavailabilityresponse)
                    {
                        handleFetchDelayResponse(getfundstransferavailabilityresponse);
                        isFetchingDelay = false;
                    }

                    public final void onFailure(Exception exception)
                    {
                        handleOtherErrors(exception);
                        isFetchingDelay = false;
                    }

                    public final volatile void onSuccess(Object obj)
                    {
                        onSuccess((com.google.wallet.proto.api.NanoWalletFundsTransfer.GetFundsTransferAvailabilityResponse)obj);
                    }

            
            {
                this$0 = ConfirmMoneyTransferActivity.this;
                super();
            }
                });
                return;
            }
        }
    }

    private void renderOrFetchFees()
    {
        if (((Integer)FEE_INFO_MODE.get(Integer.valueOf(transferType))).intValue() == 3)
        {
            renderFeesForNoFees();
        } else
        {
            TextView textview = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.FeeAmount);
            TextView textview1 = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.FeeDescription);
            TextView textview2 = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.TotalAmount);
            Views.setLinkOnClickListener(textview1, new android.view.View.OnClickListener() {

                final ConfirmMoneyTransferActivity this$0;

                public final void onClick(View view)
                {
                    view = createFeeInfoIntent();
                    startActivity(view);
                }

            
            {
                this$0 = ConfirmMoneyTransferActivity.this;
                super();
            }
            });
            if (fees != null && totalAmount != null)
            {
                textview.setText(fees.displayAmount);
                textview2.setText(totalAmount.displayAmount);
                int i;
                if ((new FeeDescriber(((FundsTransferInfoEvent)fundsTransferInfoEvent.get()).getFundingSourceInfos())).isFree(selectedFundingSource))
                {
                    i = com.google.android.apps.walletnfcrel.R.string.fee_no_fee;
                } else
                {
                    i = com.google.android.apps.walletnfcrel.R.string.fee_transaction_fee;
                }
                textview1.setText(i);
                return;
            }
            if (!isFetchingFees)
            {
                isFetchingFees = true;
                textview.setText(com.google.android.apps.walletnfcrel.R.string.loading);
                textview2.setText(com.google.android.apps.walletnfcrel.R.string.loading);
                textview1.setText(com.google.android.apps.walletnfcrel.R.string.fee_transaction_fee);
                actionExecutor.executeAction(new Callable() {

                    final ConfirmMoneyTransferActivity this$0;

                    private com.google.wallet.proto.api.NanoWalletFundsTransfer.CalculateFeeResponse call()
                        throws Exception
                    {
                        com.google.wallet.proto.api.NanoWalletFundsTransfer.CalculateFeeRequest calculatefeerequest = new com.google.wallet.proto.api.NanoWalletFundsTransfer.CalculateFeeRequest();
                        calculatefeerequest.amount = getAmount();
                        calculatefeerequest.fundingInstrumentSubId = selectedFundingSource.getCdpId();
                        calculatefeerequest.transactionType = new com.google.wallet.proto.NanoWalletEntities.TransactionType();
                        calculatefeerequest.transactionType.type = (Integer)ConfirmMoneyTransferActivity.TRANSACTION_TYPE.get(Integer.valueOf(transferType));
                        return fundsTransferClient.calculateFee(calculatefeerequest);
                    }

                    public final volatile Object call()
                        throws Exception
                    {
                        return call();
                    }

            
            {
                this$0 = ConfirmMoneyTransferActivity.this;
                super();
            }
                }, new AsyncCallback() {

                    final ConfirmMoneyTransferActivity this$0;

                    private void onSuccess(com.google.wallet.proto.api.NanoWalletFundsTransfer.CalculateFeeResponse calculatefeeresponse)
                    {
                        handleFetchFeesResponse(calculatefeeresponse);
                        isFetchingFees = false;
                    }

                    public final void onFailure(Exception exception)
                    {
                        handleOtherErrors(exception);
                        isFetchingFees = false;
                    }

                    public final volatile void onSuccess(Object obj)
                    {
                        onSuccess((com.google.wallet.proto.api.NanoWalletFundsTransfer.CalculateFeeResponse)obj);
                    }

            
            {
                this$0 = ConfirmMoneyTransferActivity.this;
                super();
            }
                });
                return;
            }
        }
    }

    private void renderSelectedFundingSource()
    {
        findViewById(com.google.android.apps.walletnfcrel.R.id.AmountSection).setVisibility(0);
        ((FundingSourceView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.FundingSourceIcon)).setFundingSource(selectedFundingSource);
        ((TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.FundingSourceName)).setText(selectedFundingSource.getDescriptiveName(this));
        findViewById(com.google.android.apps.walletnfcrel.R.id.FundingSourceMessage).setVisibility(8);
        TextView textview = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.TransferAmountDescription);
        if (transferType == 5)
        {
            textview.setText(com.google.android.apps.walletnfcrel.R.string.wallet_balance);
            ((TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.FundingSourceButton)).setVisibility(8);
            return;
        } else
        {
            textview.setText(com.google.android.apps.walletnfcrel.R.string.subtotal);
            return;
        }
    }

    private void restoreInstanceState(Bundle bundle)
    {
        if (bundle.containsKey("is_tranasction_id"))
        {
            transactionId = bundle.getString("is_tranasction_id");
        }
        if (bundle.containsKey("is_fees"))
        {
            fees = (com.google.wallet.proto.NanoWalletEntities.DisplayableMoney)Protos.mergeProto(new com.google.wallet.proto.NanoWalletEntities.DisplayableMoney(), bundle.getByteArray("is_fees"));
        }
        if (bundle.containsKey("is_total_amount"))
        {
            totalAmount = (com.google.wallet.proto.NanoWalletEntities.DisplayableMoney)Protos.mergeProto(new com.google.wallet.proto.NanoWalletEntities.DisplayableMoney(), bundle.getByteArray("is_total_amount"));
        }
        if (bundle.containsKey("is_selected_funding_source"))
        {
            selectedFundingSource = (FundingSource)bundle.getParcelable("is_selected_funding_source");
        }
        if (bundle.containsKey("is_short_fee_delay_message"))
        {
            shortFeeDelayMessage = bundle.getString("is_short_fee_delay_message");
        }
        if (bundle.containsKey("is_long_fee_delay_message"))
        {
            longFeeDelayMessage = bundle.getString("is_long_fee_delay_message");
        }
        if (bundle.containsKey("is_fee_help_link"))
        {
            feeHelpLink = (com.google.wallet.proto.api.NanoWalletFundsTransfer.GetFundsTransferAvailabilityResponse.HelpLink)Protos.mergeProto(new com.google.wallet.proto.api.NanoWalletFundsTransfer.GetFundsTransferAvailabilityResponse.HelpLink(), bundle.getByteArray("is_fee_help_link"));
        }
    }

    private static FundingSource selectDefaultFundingSource(int i, long l, List list, List list1, com.google.wallet.proto.NanoWalletEntities.StoredValue storedvalue, FeeDescriber feedescriber)
    {
        if (i == 3 && storedvalue != null && storedvalue.balance.amount.micros.longValue() >= l)
        {
            storedvalue = new FundingSource(storedvalue);
        } else
        {
            feedescriber = selectFreePaymentCard(list, feedescriber);
            storedvalue = feedescriber;
            if (feedescriber == null)
            {
                if (hasApplicableBankAccount(list1, i))
                {
                    return new FundingSource((BankAccount)list1.get(0));
                }
                if (!list.isEmpty())
                {
                    return new FundingSource((PaymentCard)list.get(0));
                } else
                {
                    return null;
                }
            }
        }
        return storedvalue;
    }

    private static FundingSource selectFreePaymentCard(List list, FeeDescriber feedescriber)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            PaymentCard paymentcard = (PaymentCard)list.next();
            if (feedescriber.isFree(new FundingSource(paymentcard)))
            {
                return new FundingSource(paymentcard);
            }
        }

        return null;
    }

    private void sendAddToStoredValueRequest()
    {
        final com.google.wallet.proto.api.NanoWalletFundsTransfer.AddToStoredValueRequest addToStoredValueRequest = new com.google.wallet.proto.api.NanoWalletFundsTransfer.AddToStoredValueRequest();
        addToStoredValueRequest.fundingInstrumentId = CdpId.newCdpIdData(selectedFundingSource.getCdpId());
        addToStoredValueRequest.amount = getAmount();
        addToStoredValueRequest.fees = fees.amount;
        addToStoredValueRequest.topUpId = transactionId;
        fullScreenProgressSpinnerManager.show();
        executeAction("top_up_action", new Callable() {

            final ConfirmMoneyTransferActivity this$0;
            final com.google.wallet.proto.api.NanoWalletFundsTransfer.AddToStoredValueRequest val$addToStoredValueRequest;

            private com.google.wallet.proto.api.NanoWalletFundsTransfer.AddToStoredValueResponse call()
                throws Exception
            {
                return fundsTransferClient.addToStoredValue(addToStoredValueRequest);
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = ConfirmMoneyTransferActivity.this;
                addToStoredValueRequest = addtostoredvaluerequest;
                super();
            }
        });
    }

    private void sendMoneyTransferRequest()
    {
        if (((Integer)FEE_INFO_MODE.get(Integer.valueOf(transferType))).intValue() != 3 && fees == null)
        {
            sendWhenFeesReady = true;
        } else
        if (validate())
        {
            if (transactionId == null)
            {
                transactionId = UUID.randomUUID().toString();
            }
            if (((Integer)TRANSACTION_TYPE.get(Integer.valueOf(transferType))).intValue() == 1)
            {
                sendSendMoneyRequest();
                return;
            }
            if (((Integer)TRANSACTION_TYPE.get(Integer.valueOf(transferType))).intValue() == 2)
            {
                sendAddToStoredValueRequest();
                return;
            }
            if (((Integer)TRANSACTION_TYPE.get(Integer.valueOf(transferType))).intValue() == 3)
            {
                withdraw();
                return;
            }
        }
    }

    private void sendSendMoneyRequest()
    {
        final com.google.wallet.proto.api.NanoWalletFundsTransfer.SendMoneyRequest sendMoneyRequest = new com.google.wallet.proto.api.NanoWalletFundsTransfer.SendMoneyRequest();
        sendMoneyRequest.transferId = transactionId;
        sendMoneyRequest.accountIdentifier = new com.google.wallet.proto.NanoWalletEntities.AccountIdentifier();
        sendMoneyRequest.accountIdentifier.emailAddress = recipient.getEmailAddress();
        sendMoneyRequest.memo = memo;
        sendMoneyRequest.fundingInstrumentId = CdpId.newCdpIdData(selectedFundingSource.getCdpId());
        sendMoneyRequest.amount = getAmount();
        sendMoneyRequest.fees = fees.amount;
        sendMoneyRequest.id = moneyRequestId;
        fullScreenProgressSpinnerManager.show();
        executeAction("send_money_action", new Callable() {

            final ConfirmMoneyTransferActivity this$0;
            final com.google.wallet.proto.api.NanoWalletFundsTransfer.SendMoneyRequest val$sendMoneyRequest;

            private com.google.wallet.proto.api.NanoWalletFundsTransfer.SendMoneyResponse call()
                throws Exception
            {
                return fundsTransferClient.sendMoney(sendMoneyRequest);
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = ConfirmMoneyTransferActivity.this;
                sendMoneyRequest = sendmoneyrequest;
                super();
            }
        });
    }

    private void showAddressUpgradeRequiredDialog()
    {
        AddressUpgradeRequiredDialog.show(selectedFundingSource.getPaymentCard(), getSupportFragmentManager());
    }

    private void showHeader()
    {
        TextView textview = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.MoneyTransferDescription);
        TextView textview1 = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.MoneyTransferLargeDescription);
        P2pHeaderFragment p2pheaderfragment = (P2pHeaderFragment)getSupportFragmentManager().findFragmentById(com.google.android.apps.walletnfcrel.R.id.P2pHeaderFragment);
        TextView textview2 = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.RecipientName);
        TextView textview3 = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.RecipientEmail);
        TextView textview4 = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.RequestMemo);
        if (transferType == 1)
        {
            textview.setVisibility(8);
            p2pheaderfragment.getView().setVisibility(0);
            textview2.setVisibility(0);
            textview3.setVisibility(0);
            textview4.setVisibility(0);
        } else
        {
            textview.setVisibility(0);
            p2pheaderfragment.getView().setVisibility(8);
            textview2.setVisibility(8);
            textview3.setVisibility(8);
            textview4.setVisibility(8);
        }
        if (transferType == 3)
        {
            Views.setNativeLink(textview, com.google.android.apps.walletnfcrel.R.string.settle_balance_instruction, UriIntents.create(this, HelpUrls.createSettleBalanceHelpUrl()));
        } else
        {
            if (transferType == 2)
            {
                textview1.setVisibility(0);
                textview1.setText(MoneyConverter.toString(getAmount()));
                textview.setText(com.google.android.apps.walletnfcrel.R.string.confirm_header_add_money);
                return;
            }
            if (transferType == 5)
            {
                textview1.setVisibility(0);
                textview1.setText(MoneyConverter.toString(getAmount()));
                textview.setText(com.google.android.apps.walletnfcrel.R.string.confirm_header_withdraw_money);
                return;
            }
        }
    }

    private void toastSuccessAndFinish()
    {
        analyticsUtil.sendSuccess((String)ANALYTICS_LABEL.get(Integer.valueOf(transferType)), new AnalyticsCustomDimension[0]);
        Toasts.show(this, getSuccessMessage());
        setResult(-1);
        finish();
    }

    private boolean validate()
    {
        if (selectedFundingSource == null)
        {
            return false;
        }
        String s = moneyTransferAmountValidator.validateInstrument(getResources(), getAmount(), selectedFundingSource, previousError);
        TextView textview = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.FundingSourceError);
        if (s != null)
        {
            previousError = s;
            textview.setText(s);
            textview.setVisibility(0);
            textview.sendAccessibilityEvent(32);
            return false;
        } else
        {
            previousError = null;
            textview.setVisibility(8);
            return true;
        }
    }

    private void waitForAllEventsAndRenderFundingSource()
    {
        if (!eventsAreReady())
        {
            return;
        }
        if (selectedFundingSource == null)
        {
            selectedFundingSource = selectDefaultFundingSource(((Integer)INSTRUMENT_USE.get(Integer.valueOf(transferType))).intValue(), preFeeAmountMicros, ((PaymentCardModelEvent)paymentCardModelEvent.get()).getModel().getValidCredentials(((Integer)INSTRUMENT_USE.get(Integer.valueOf(transferType))).intValue()), getBankAccountsFromEvent(), ((StoredValueEvent)storedValueEvent.get()).getModel().getStoredValue(), new FeeDescriber(((FundsTransferInfoEvent)fundsTransferInfoEvent.get()).getFundingSourceInfos()));
        }
        renderFundingSourceFeesAndDelay();
    }

    private void withdraw()
    {
        analyticsUtil.sendButtonTap("TransferToBank", new AnalyticsCustomDimension[0]);
        analyticsUtil.startTiming(null, "user_withdraw");
        fullScreenProgressSpinnerManager.show();
        executeAction("withdraw", new WithdrawAction(fundsTransferClient, selectedFundingSource.getBankAccount(), getAmount(), transactionId));
    }

    protected final Intent createFeeInfoIntent()
    {
        return TopUpApi.createFeeInfoActivityIntent(this, ((Integer)FEE_INFO_MODE.get(Integer.valueOf(transferType))).intValue());
    }

    protected final void doOnCreate(Bundle bundle)
    {
        super.doOnCreate(bundle);
        if (bundle != null)
        {
            restoreInstanceState(bundle);
        }
        setContentView(getActivityLayout());
        loadIntentExtras();
        setTitle(com.google.android.apps.walletnfcrel.R.string.review_recurring_topup_title);
        showHeader();
        renderIntentExtraData();
    }

    public final void doOnResume()
    {
        analyticsUtil.sendScreen((String)ANALYTICS_SCREEN.get(Integer.valueOf(transferType)), new AnalyticsCustomDimension[0]);
        isFetchingDelay = false;
        isFetchingFees = false;
        fullScreenProgressSpinnerManager.show();
        eventBus.register(this, com/google/android/apps/wallet/transfer/ConfirmMoneyTransferActivity);
        eventBus.register(this, com/google/android/apps/wallet/transfer/api/FundsTransferInfoEvent, TRANSACTION_TYPE.get(Integer.valueOf(transferType)), new EventHandler() {

            final ConfirmMoneyTransferActivity this$0;

            private void handleEvent(FundsTransferInfoEvent fundstransferinfoevent)
            {
                if (handleLoadingError(fundstransferinfoevent.getFailureCause()))
                {
                    return;
                } else
                {
                    fundsTransferInfoEvent = Optional.of(fundstransferinfoevent);
                    waitForAllEventsAndRenderFundingSource();
                    return;
                }
            }

            public final volatile void handleEvent(Object obj)
            {
                handleEvent((FundsTransferInfoEvent)obj);
            }

            
            {
                this$0 = ConfirmMoneyTransferActivity.this;
                super();
            }
        });
        ((TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.TransferAmount)).setText(MoneyConverter.toString(getAmount()));
        waitForAllEventsAndRenderFundingSource();
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public final boolean onActionFailure(String s, Callable callable, Exception exception)
    {
        if (!super.onActionFailure(s, callable, exception))
        {
            analyticsUtil.sendError((String)ANALYTICS_LABEL.get(Integer.valueOf(transferType)), new AnalyticsCustomDimension[0]);
            handleOtherErrors(exception);
        } else
        {
            fullScreenProgressSpinnerManager.hide();
        }
        return true;
    }

    public final void onActionSuccess(String s, Callable callable, Object obj)
    {
        analyticsUtil.endTiming(null, (String)CSI_TIMING.get(Integer.valueOf(transferType)));
        if ("send_money_action".equals(s))
        {
            handleSendMoneyResponse((com.google.wallet.proto.api.NanoWalletFundsTransfer.SendMoneyResponse)obj);
        } else
        {
            if ("top_up_action".equals(s))
            {
                handleTopUpResponse((com.google.wallet.proto.api.NanoWalletFundsTransfer.AddToStoredValueResponse)obj);
                return;
            }
            if ("withdraw".equals(s))
            {
                handleFundTransferResponse((com.google.wallet.proto.api.NanoWalletFundsTransfer.WithdrawFundsResponse)obj);
                return;
            }
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 1 && j != 0)
        {
            sendMoneyTransferRequest();
        } else
        if (i == 2 && j == -1 && intent.hasExtra("funding_source"))
        {
            selectedFundingSource = (FundingSource)intent.getParcelableExtra("funding_source");
            clearFundingSourceDerivedData();
            validate();
            return;
        }
    }

    public void onNewBankAccountsModel(BankAccountsModelEvent bankaccountsmodelevent)
    {
        if (bankaccountsmodelevent.isFeatureEnabled() && handleLoadingError(bankaccountsmodelevent.getFailureCause()))
        {
            return;
        } else
        {
            bankAccountsModelEvent = Optional.of(bankaccountsmodelevent);
            waitForAllEventsAndRenderFundingSource();
            return;
        }
    }

    public void onNewPaymentCardModel(PaymentCardModelEvent paymentcardmodelevent)
    {
        if (handleLoadingError(paymentcardmodelevent.getFailureCause()))
        {
            return;
        } else
        {
            paymentCardModelEvent = Optional.of(paymentcardmodelevent);
            waitForAllEventsAndRenderFundingSource();
            return;
        }
    }

    public void onNewStoredValueModel(StoredValueEvent storedvalueevent)
    {
        if (handleLoadingError(storedvalueevent.getFailureCause()))
        {
            return;
        } else
        {
            storedValueEvent = Optional.of(storedvalueevent);
            waitForAllEventsAndRenderFundingSource();
            return;
        }
    }

    protected void onPause()
    {
        super.onPause();
        eventBus.unregisterAll(this);
        actionExecutor.cancelAll();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (transactionId != null)
        {
            bundle.putString("is_tranasction_id", transactionId);
        }
        if (fees != null)
        {
            bundle.putByteArray("is_fees", MessageNano.toByteArray(fees));
        }
        if (totalAmount != null)
        {
            bundle.putByteArray("is_total_amount", MessageNano.toByteArray(totalAmount));
        }
        if (selectedFundingSource != null)
        {
            bundle.putParcelable("is_selected_funding_source", selectedFundingSource);
        }
        if (shortFeeDelayMessage != null)
        {
            bundle.putString("is_short_fee_delay_message", shortFeeDelayMessage);
        }
        if (longFeeDelayMessage != null)
        {
            bundle.putString("is_long_fee_delay_message", longFeeDelayMessage);
        }
        if (feeHelpLink != null)
        {
            bundle.putByteArray("is_fee_help_link", MessageNano.toByteArray(feeHelpLink));
        }
    }

    protected final void onUpPressed()
    {
        finish();
    }

    static 
    {
        BUTTON = ImmutableMap.of(Integer.valueOf(1), Integer.valueOf(com.google.android.apps.walletnfcrel.R.string.button_send), Integer.valueOf(3), Integer.valueOf(com.google.android.apps.walletnfcrel.R.string.add_money), Integer.valueOf(2), Integer.valueOf(com.google.android.apps.walletnfcrel.R.string.add_money), Integer.valueOf(5), Integer.valueOf(com.google.android.apps.walletnfcrel.R.string.transfer_to_bank));
    }




/*
    static Optional access$102(ConfirmMoneyTransferActivity confirmmoneytransferactivity, Optional optional)
    {
        confirmmoneytransferactivity.fundsTransferInfoEvent = optional;
        return optional;
    }

*/








/*
    static boolean access$1702(ConfirmMoneyTransferActivity confirmmoneytransferactivity, boolean flag)
    {
        confirmmoneytransferactivity.isFetchingFees = flag;
        return flag;
    }

*/








}
