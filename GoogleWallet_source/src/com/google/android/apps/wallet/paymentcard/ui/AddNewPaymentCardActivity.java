// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.paymentcard.ui;

import android.accounts.Account;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.cardlist.PaymentCardModel;
import com.google.android.apps.wallet.cardlist.PaymentCardModelEvent;
import com.google.android.apps.wallet.cardlist.PaymentCardModelPublisher;
import com.google.android.apps.wallet.config.cloudconfig.CloudConfigurationManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.funding.api.FundingSource;
import com.google.android.apps.wallet.paymentcard.api.PaymentCard;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.android.gms.wallet.ia.AddInstrumentIntentBuilder;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

public class AddNewPaymentCardActivity extends WalletActivity
{

    Account account;
    private String addedCardId;
    private PaymentCard addedPaymentCard;
    AnalyticsUtil analyticsUtil;
    CloudConfigurationManager cloudConfigurationManager;
    EventBus eventBus;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    private boolean handledUpdate;
    PaymentCardModelPublisher paymentCardModelPublisher;

    public AddNewPaymentCardActivity()
    {
        this(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    public AddNewPaymentCardActivity(int i)
    {
        super(i);
        handledUpdate = false;
    }

    private void returnSuccess(PaymentCard paymentcard)
    {
        Intent intent = new Intent();
        intent.putExtra("id_extra", paymentcard.getCdpId().subId);
        intent.putExtra("funding_source", new FundingSource(paymentcard));
        eventBus.unregisterAll(this);
        setResult(-1, intent);
        finish();
    }

    private boolean shouldShowCreditCardWarning(PaymentCard paymentcard)
    {
        boolean flag;
        boolean flag1;
        if (paymentcard.getType() == 1 || paymentcard.getType() == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (getIntent().hasExtra("instrument_add_context") && getIntent().getStringExtra("instrument_add_context").equals("instrument_add_context_P2P"))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        return flag1 && flag;
    }

    protected final void doOnCreate(Bundle bundle)
    {
        getSupportActionBar().hide();
        if (bundle != null)
        {
            addedCardId = bundle.getString("added_card_id", null);
        }
        setContentView(com.google.android.apps.walletnfcrel.R.layout.generic_progress_activity);
        fullScreenProgressSpinnerManager.show();
        if (addedCardId != null)
        {
            eventBus.register(this, com/google/android/apps/wallet/paymentcard/ui/AddNewPaymentCardActivity);
            return;
        } else
        {
            startActivityForResult(((AddInstrumentIntentBuilder)((AddInstrumentIntentBuilder)((AddInstrumentIntentBuilder)(new AddInstrumentIntentBuilder(this)).setBuyerAccount(account)).setEnvironment(cloudConfigurationManager.getCloudConfig().getPaymentsSdkEnvironment().intValue())).setTheme(1)).build(), 1);
            return;
        }
    }

    public void handleEvent(PaymentCardModelEvent paymentcardmodelevent)
    {
        if (!handledUpdate)
        {
            if (paymentcardmodelevent.getFailureCause() != null)
            {
                Toasts.show(this, com.google.android.apps.walletnfcrel.R.string.funding_sources_loading_error);
                setResult(0);
                finish();
                return;
            }
            paymentcardmodelevent = paymentcardmodelevent.getModel().getAllCredentials().iterator();
            while (paymentcardmodelevent.hasNext()) 
            {
                PaymentCard paymentcard = (PaymentCard)paymentcardmodelevent.next();
                if (paymentcard.getPaymentsSdkId().equals(addedCardId))
                {
                    handledUpdate = true;
                    if (shouldShowCreditCardWarning(paymentcard))
                    {
                        AlertDialogFragment alertdialogfragment = AlertDialogFragment.newBuilder().setMessage(getString(com.google.android.apps.walletnfcrel.R.string.add_credit_card_warning_detail)).setTitle(getString(com.google.android.apps.walletnfcrel.R.string.add_credit_card_warning_title)).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.button_okay).build();
                        addedPaymentCard = paymentcard;
                        alertdialogfragment.show(getSupportFragmentManager(), "alert_fragment_tag");
                    } else
                    {
                        returnSuccess(paymentcard);
                    }
                }
            }
        }
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
label0:
        {
            if (i == 1)
            {
                if (j != -1)
                {
                    break label0;
                }
                setResult(-1);
                analyticsUtil.sendSuccess("AddPaymentCard", new AnalyticsCustomDimension[0]);
                addedCardId = intent.getStringExtra("com.google.android.gms.wallet.instrumentId");
                eventBus.register(this, com/google/android/apps/wallet/paymentcard/ui/AddNewPaymentCardActivity);
                paymentCardModelPublisher.invalidateCacheAndFetch();
            }
            return;
        }
        setResult(0);
        analyticsUtil.sendError("AddPaymentCard", new AnalyticsCustomDimension[0]);
        finish();
    }

    public final void onAttachFragment(Fragment fragment)
    {
        super.onAttachFragment(fragment);
        if ("alert_fragment_tag".equals(fragment.getTag()))
        {
            fragment = (AlertDialogFragment)fragment;
            fragment.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

                final AddNewPaymentCardActivity this$0;

                public final void onCancel(DialogInterface dialoginterface)
                {
                    returnSuccess(addedPaymentCard);
                }

            
            {
                this$0 = AddNewPaymentCardActivity.this;
                super();
            }
            });
            fragment.setOnClickListener(new android.content.DialogInterface.OnClickListener() {

                final AddNewPaymentCardActivity this$0;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    returnSuccess(addedPaymentCard);
                }

            
            {
                this$0 = AddNewPaymentCardActivity.this;
                super();
            }
            });
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        eventBus.unregisterAll(this);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        bundle.putString("added_card_id", addedCardId);
        super.onSaveInstanceState(bundle);
    }

    protected final void onUpPressed()
    {
    }


}
