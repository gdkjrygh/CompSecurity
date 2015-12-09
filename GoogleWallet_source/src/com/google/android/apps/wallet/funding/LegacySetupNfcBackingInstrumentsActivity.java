// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.funding;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.cardlist.PaymentCardModel;
import com.google.android.apps.wallet.cardlist.PaymentCardModelEvent;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.frontinginstrument.TapAndPayModel;
import com.google.android.apps.wallet.frontinginstrument.TapAndPayModelEvent;
import com.google.android.apps.wallet.frontinginstrument.TapAndPayModelPublisher;
import com.google.android.apps.wallet.funding.api.FundingApi;
import com.google.android.apps.wallet.hce.setup.ui.NfcCancelConfirmationDialogFragment;
import com.google.android.apps.wallet.paymentcard.api.PaymentCard;
import com.google.android.apps.wallet.paymentcard.api.PaymentCardApi;
import com.google.android.apps.wallet.storedvalue.api.StoredValueEvent;
import com.google.android.apps.wallet.storedvalue.api.StoredValueModel;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.Callable;

public class LegacySetupNfcBackingInstrumentsActivity extends WalletActivity
{

    ActionExecutor actionExecutor;
    private Optional cardModel;
    EventBus eventBus;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    private boolean hasDismissedExplanation;
    private Optional storedValueEvent;
    private Optional tapAndPayModel;
    TapAndPayModelPublisher tapAndPayModelPublisher;
    UserEventLogger userEventLogger;

    public LegacySetupNfcBackingInstrumentsActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
        cardModel = Optional.absent();
        storedValueEvent = Optional.absent();
        tapAndPayModel = Optional.absent();
    }

    private void cancelFunding()
    {
        setResult(0);
        finish();
    }

    private void dismissExplanation()
    {
        hasDismissedExplanation = true;
        startCardFlowIfReady();
    }

    private void finishFunding()
    {
        setResult(-1);
        finish();
    }

    private com.google.wallet.proto.NanoWalletEntities.StoredValue getStoredValue()
    {
        if (((StoredValueEvent)storedValueEvent.get()).isFeatureEnabled())
        {
            return ((StoredValueEvent)storedValueEvent.get()).getModel().getStoredValue();
        } else
        {
            return null;
        }
    }

    private void selectCard(final ImmutableList cardToSelect, final com.google.wallet.proto.NanoWalletEntities.StoredValue storedValue, PaymentCard paymentcard)
    {
        if (cardToSelect.size() == 1)
        {
            cardToSelect = (PaymentCard)cardToSelect.get(0);
        } else
        {
            cardToSelect = paymentcard;
        }
        if (cardToSelect == null)
        {
            userEventLogger.log(26, 114);
            startActivityForResult(FundingApi.createSelectNfcPaymentCardWithTitleIntent(this, getString(com.google.android.apps.walletnfcrel.R.string.setup_nfc_set_funding_title), true), 3);
            return;
        } else
        {
            fullScreenProgressSpinnerManager.show();
            actionExecutor.executeAction(new Callable() {

                final LegacySetupNfcBackingInstrumentsActivity this$0;
                final PaymentCard val$cardToSelect;
                final com.google.wallet.proto.NanoWalletEntities.StoredValue val$storedValue;

                private Void call()
                    throws Exception
                {
                    tapAndPayModelPublisher.selectCredential(cardToSelect, storedValue);
                    return null;
                }

                public final volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = LegacySetupNfcBackingInstrumentsActivity.this;
                cardToSelect = paymentcard;
                storedValue = storedvalue;
                super();
            }
            }, new AsyncCallback() {

                final LegacySetupNfcBackingInstrumentsActivity this$0;

                private void onSuccess(Void void1)
                {
                    fullScreenProgressSpinnerManager.hide();
                    finishFunding();
                }

                public final void onFailure(Exception exception)
                {
                    fullScreenProgressSpinnerManager.hide();
                    toastAndCancel(com.google.android.apps.walletnfcrel.R.string.funding_sources_loading_error);
                }

                public final volatile void onSuccess(Object obj)
                {
                    onSuccess((Void)obj);
                }

            
            {
                this$0 = LegacySetupNfcBackingInstrumentsActivity.this;
                super();
            }
            });
            return;
        }
    }

    private void selectNewCard(final String newCardCdpId)
    {
        fullScreenProgressSpinnerManager.showImmediately();
        actionExecutor.executeAction(new Callable() {

            final LegacySetupNfcBackingInstrumentsActivity this$0;
            final String val$newCardCdpId;

            private Void call()
                throws Exception
            {
                tapAndPayModelPublisher.selectCredential(newCardCdpId, null);
                return null;
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = LegacySetupNfcBackingInstrumentsActivity.this;
                newCardCdpId = s;
                super();
            }
        }, new AsyncCallback() {

            final LegacySetupNfcBackingInstrumentsActivity this$0;

            private void onSuccess(Void void1)
            {
                fullScreenProgressSpinnerManager.hide();
                finishFunding();
            }

            public final void onFailure(Exception exception)
            {
                fullScreenProgressSpinnerManager.hide();
                toastAndCancel(com.google.android.apps.walletnfcrel.R.string.funding_sources_loading_error);
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((Void)obj);
            }

            
            {
                this$0 = LegacySetupNfcBackingInstrumentsActivity.this;
                super();
            }
        });
    }

    private void startAddCard()
    {
        userEventLogger.log(26, 113);
        startActivityForResult(PaymentCardApi.createAddNewCardIntent(this, "instrument_add_context_NFC"), 1);
    }

    private void startCardFlowIfReady()
    {
label0:
        {
            if (hasDismissedExplanation)
            {
                if (!cardModel.isPresent() || !storedValuePresent() || !tapAndPayModel.isPresent())
                {
                    break label0;
                }
                PaymentCardModel paymentcardmodel = (PaymentCardModel)cardModel.get();
                if (paymentcardmodel.getValidCredentials(1).isEmpty())
                {
                    startAddCard();
                } else
                {
                    selectCard(paymentcardmodel.getValidCredentials(1), getStoredValue(), ((TapAndPayModel)tapAndPayModel.get()).getSelectedCredential(paymentcardmodel.getAllCredentials()));
                }
                hasDismissedExplanation = false;
            }
            return;
        }
        fullScreenProgressSpinnerManager.show();
    }

    private boolean storedValuePresent()
    {
        StoredValueEvent storedvalueevent;
        if (storedValueEvent.isPresent())
        {
            if (!(storedvalueevent = (StoredValueEvent)storedValueEvent.get()).isFeatureEnabled() || storedvalueevent.getModel() != null)
            {
                return true;
            }
        }
        return false;
    }

    private void toastAndCancel(int i)
    {
        Toasts.show(this, i);
        cancelFunding();
    }

    protected final void doOnCreate(Bundle bundle)
    {
        userEventLogger.log(26, 112);
        setTitle(com.google.android.apps.walletnfcrel.R.string.explain_auto_funding_title);
        setContentView(com.google.android.apps.walletnfcrel.R.layout.explain_auto_funding);
        ((Button)findViewById(com.google.android.apps.walletnfcrel.R.id.ContinueButton)).setOnClickListener(new android.view.View.OnClickListener() {

            final LegacySetupNfcBackingInstrumentsActivity this$0;

            public final void onClick(View view)
            {
                dismissExplanation();
            }

            
            {
                this$0 = LegacySetupNfcBackingInstrumentsActivity.this;
                super();
            }
        });
    }

    protected final void doOnResume()
    {
        eventBus.register(this);
    }

    public void finish()
    {
        super.finish();
        overridePendingTransition(0, 0);
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        fullScreenProgressSpinnerManager.showImmediately();
        switch (i)
        {
        case 2: // '\002'
        default:
            return;

        case 1: // '\001'
            if (j == 0 || intent == null)
            {
                NfcCancelConfirmationDialogFragment.createAndShow(this);
                return;
            }
            intent = intent.getStringExtra("id_extra");
            if (intent != null)
            {
                selectNewCard(intent);
                return;
            } else
            {
                cancelFunding();
                return;
            }

        case 3: // '\003'
            finishFunding();
            return;
        }
    }

    public void onBackPressed()
    {
        NfcCancelConfirmationDialogFragment.createAndShow(this);
    }

    void onNewPaymentCardModel(PaymentCardModelEvent paymentcardmodelevent)
    {
        cardModel = Optional.fromNullable(paymentcardmodelevent.getModel());
        if (paymentcardmodelevent.getFailureCause() != null)
        {
            toastAndCancel(com.google.android.apps.walletnfcrel.R.string.funding_sources_loading_error);
        }
        startCardFlowIfReady();
    }

    void onNewStoredValueModel(StoredValueEvent storedvalueevent)
    {
        storedValueEvent = Optional.of(storedvalueevent);
        if (storedvalueevent.getFailureCause() != null)
        {
            toastAndCancel(com.google.android.apps.walletnfcrel.R.string.funding_sources_loading_error);
        }
        startCardFlowIfReady();
    }

    void onNewTapAndPayModelEvent(TapAndPayModelEvent tapandpaymodelevent)
    {
        tapAndPayModel = Optional.fromNullable(tapandpaymodelevent.getModel());
        if (tapandpaymodelevent.getFailureCause() != null)
        {
            toastAndCancel(com.google.android.apps.walletnfcrel.R.string.funding_sources_loading_error);
        }
        startCardFlowIfReady();
    }

    protected void onPause()
    {
        eventBus.unregisterAll(this);
        super.onPause();
    }

    protected final void onUpPressed()
    {
        onBackPressed();
    }

    public void startActivityForResult(Intent intent, int i)
    {
        super.startActivityForResult(intent, i);
        overridePendingTransition(0, 0);
    }



}
