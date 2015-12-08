// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.paymentcard.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.base.entitymanager.EntityId;
import com.google.android.apps.wallet.cardlist.PaymentCardModel;
import com.google.android.apps.wallet.cardlist.PaymentCardModelEvent;
import com.google.android.apps.wallet.cardlist.PaymentCardModelPublisher;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.funding.api.FundingSource;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import com.google.android.apps.wallet.paymentcard.api.PaymentCard;
import com.google.android.apps.wallet.paymentcard.api.PaymentCardApi;
import com.google.android.apps.wallet.paymentcard.widgets.FundingSourceView;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public class PaymentCardDetailsActivity extends WalletActivity
{

    private static final String TAG = com/google/android/apps/wallet/paymentcard/ui/PaymentCardDetailsActivity.getSimpleName();
    ActionExecutor actionExecutor;
    AnalyticsUtil analyticsUtil;
    private TextView cardExpirationDate;
    private TextView cardHolderName;
    private TextView cardName;
    private TextView cardNumber;
    private FundingSourceView cardView;
    private EntityId currentlyRenderedCredentialId;
    private PaymentCard currentlyRenderedPaymentCard;
    private TextView errorMessage;
    EventBus eventBus;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    private Integer instrumentUse;
    NetworkAccessChecker networkAccessChecker;
    PaymentCardApi paymentCardApi;
    PaymentCardModelPublisher paymentCardModelPublisher;
    UserEventLogger userEventLogger;

    public PaymentCardDetailsActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    private void deleteCard(final PaymentCard credential)
    {
        if (!networkAccessChecker.check())
        {
            return;
        } else
        {
            fullScreenProgressSpinnerManager.show();
            credential = new Callable() {

                final PaymentCardDetailsActivity this$0;
                final PaymentCard val$credential;

                private Void call()
                    throws Exception
                {
                    paymentCardModelPublisher.delete(credential);
                    return null;
                }

                public final volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = PaymentCardDetailsActivity.this;
                credential = paymentcard;
                super();
            }
            };
            analyticsUtil.sendButtonTap("RemovePaymentCard", new AnalyticsCustomDimension[0]);
            executeAction("remove_card", credential);
            return;
        }
    }

    private void launchDeleteCardDialog()
    {
        AlertDialogFragment.newBuilder().setTitle(com.google.android.apps.walletnfcrel.R.string.are_you_sure_title).setMessage(com.google.android.apps.walletnfcrel.R.string.remove_card_confirmation).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.button_ok).setNegativeButton(com.google.android.apps.walletnfcrel.R.string.button_cancel).setCancelable(true).build().show(getSupportFragmentManager(), "dialog_remove_card");
    }

    private void launchPersonalizeCardActivity(final PaymentCard credential)
    {
        fullScreenProgressSpinnerManager.show();
        actionExecutor.executeAction(new Callable() {

            final PaymentCardDetailsActivity this$0;
            final PaymentCard val$credential;

            private Intent call()
                throws Exception
            {
                return paymentCardApi.createEditCardIntent(PaymentCardDetailsActivity.this, credential);
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = PaymentCardDetailsActivity.this;
                credential = paymentcard;
                super();
            }
        }, new AsyncCallback() {

            final PaymentCardDetailsActivity this$0;

            private void onSuccess(Intent intent)
            {
                analyticsUtil.sendScreen("Edit Payment Card", new AnalyticsCustomDimension[0]);
                startActivityForResult(intent, 1);
            }

            public final void onFailure(Exception exception)
            {
                WLog.e(PaymentCardDetailsActivity.TAG, "Could not create intent to edit instrument", exception);
                finish();
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((Intent)obj);
            }

            
            {
                this$0 = PaymentCardDetailsActivity.this;
                super();
            }
        });
    }

    private void onNewPaymentCard(PaymentCard paymentcard)
    {
        currentlyRenderedPaymentCard = paymentcard;
        invalidateOptionsMenu();
        setTitle(com.google.android.apps.walletnfcrel.R.string.credit_card_details_title);
        setCredential(paymentcard);
        fullScreenProgressSpinnerManager.hide();
    }

    private void refreshErrorMessage(PaymentCard paymentcard)
    {
        if (instrumentUse != null && paymentcard.isInapplicableForUse(instrumentUse.intValue()))
        {
            setErrorMessage(paymentcard.getRestrictedUse(instrumentUse.intValue()).shortMessage);
        } else
        {
            setErrorMessage(null);
        }
        if (paymentcard.isDeclined())
        {
            setErrorMessage(getString(com.google.android.apps.walletnfcrel.R.string.errormessage_invalid_card_how_to_update));
            return;
        }
        if (paymentcard.isExpired())
        {
            setErrorMessage(getString(com.google.android.apps.walletnfcrel.R.string.errormessage_expired_card_how_to_update));
            return;
        } else
        {
            setErrorMessage(null);
            return;
        }
    }

    private void setCredential(PaymentCard paymentcard)
    {
        Preconditions.checkNotNull(paymentcard);
        cardView.setFundingSource(new FundingSource(paymentcard));
        cardName.setText(paymentcard.getNickname());
        Views.setTextOrHide(cardNumber, paymentcard.getMaskedCardNumber());
        Views.setTextOrHide(cardHolderName, paymentcard.getCardHolderName());
        Views.setTextOrHide(cardExpirationDate, getString(com.google.android.apps.walletnfcrel.R.string.card_expiration_date, new Object[] {
            paymentcard.getExpirationMonth(), paymentcard.getExpirationYear()
        }));
        refreshErrorMessage(paymentcard);
    }

    private void setErrorMessage(String s)
    {
        Views.setTextOrHide(errorMessage, s);
    }

    private void showPaymentCardModelErrorDialog()
    {
        AlertDialogFragment.newBuilder().setMessage(com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.dialog_option_try_again).setNegativeButton(com.google.android.apps.walletnfcrel.R.string.dialog_option_try_later).setCancelable(true).build().show(getSupportFragmentManager(), "dialog_model_error");
    }

    protected final void doOnCreate(Bundle bundle)
    {
        if (getIntent().hasExtra("instrument_use_extra"))
        {
            instrumentUse = (Integer)getIntent().getSerializableExtra("instrument_use_extra");
        }
        setContentView(com.google.android.apps.walletnfcrel.R.layout.payment_card_details);
        cardView = (FundingSourceView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.Card);
        cardName = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.CardName);
        errorMessage = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.ErrorMessage);
        Views.showAlertIndicator(errorMessage);
        ViewGroup viewgroup = (ViewGroup)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.CardNumberLayout);
        ((TextView)Views.findViewById(viewgroup, com.google.android.apps.walletnfcrel.R.id.Label)).setText(com.google.android.apps.walletnfcrel.R.string.card_number);
        cardNumber = (TextView)Views.findViewById(viewgroup, com.google.android.apps.walletnfcrel.R.id.Content);
        viewgroup = (ViewGroup)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.CardHolderNameLayout);
        ((TextView)Views.findViewById(viewgroup, com.google.android.apps.walletnfcrel.R.id.Label)).setText(com.google.android.apps.walletnfcrel.R.string.cardholder_name);
        cardHolderName = (TextView)Views.findViewById(viewgroup, com.google.android.apps.walletnfcrel.R.id.Content);
        viewgroup = (ViewGroup)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.CardExpirationDateLayout);
        ((TextView)Views.findViewById(viewgroup, com.google.android.apps.walletnfcrel.R.id.Label)).setText(com.google.android.apps.walletnfcrel.R.string.card_expiration_date_label);
        cardExpirationDate = (TextView)Views.findViewById(viewgroup, com.google.android.apps.walletnfcrel.R.id.Content);
        currentlyRenderedCredentialId = EntityId.fromKeyString(getIntent().getExtras().getString("id_extra"));
        if (bundle != null && bundle.containsKey("payment_card"))
        {
            onNewPaymentCard((PaymentCard)bundle.getParcelable("payment_card"));
        }
        userEventLogger.log(12, 53);
    }

    public final void doOnResume()
    {
        eventBus.register(this);
        if (currentlyRenderedPaymentCard == null)
        {
            fullScreenProgressSpinnerManager.show();
        }
        if (isActionRunning("remove_card"))
        {
            fullScreenProgressSpinnerManager.showImmediately();
        }
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public final boolean onActionFailure(String s, Callable callable, Exception exception)
    {
        if (super.onActionFailure(s, callable, exception))
        {
            return true;
        }
        if ("remove_card".equals(s))
        {
            fullScreenProgressSpinnerManager.hide();
            analyticsUtil.sendError("RemovePaymentCard", new AnalyticsCustomDimension[0]);
            WLog.e(TAG, "Exception while deleting funding source", exception);
            AlertDialogFragment.newBuilder().setTitle(com.google.android.apps.walletnfcrel.R.string.credit_card_details_remove_error_title).setMessage(com.google.android.apps.walletnfcrel.R.string.credit_card_details_remove_error_detail).setCancelable(true).build().show(getSupportFragmentManager(), null);
            return true;
        } else
        {
            return false;
        }
    }

    public final void onActionSuccess(String s, Callable callable, Object obj)
    {
        super.onActionSuccess(s, callable, obj);
        if ("remove_card".equals(s))
        {
            analyticsUtil.sendSuccess("RemovePaymentCard", new AnalyticsCustomDimension[0]);
            finish();
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
label0:
        {
            fullScreenProgressSpinnerManager.hide();
            if (i == 1)
            {
                paymentCardModelPublisher.invalidateCacheAndFetch();
                if (j != -1)
                {
                    break label0;
                }
                analyticsUtil.sendSuccess("EditPaymentCard", new AnalyticsCustomDimension[0]);
            }
            return;
        }
        analyticsUtil.sendError("EditPaymentCard", new AnalyticsCustomDimension[0]);
    }

    public final void onAttachFragment(Fragment fragment)
    {
        super.onAttachFragment(fragment);
        if ("dialog_remove_card".equals(fragment.getTag()))
        {
            ((AlertDialogFragment)fragment).setOnClickListener(new android.content.DialogInterface.OnClickListener() {

                final PaymentCardDetailsActivity this$0;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    if (i == -1)
                    {
                        deleteCard(currentlyRenderedPaymentCard);
                    }
                }

            
            {
                this$0 = PaymentCardDetailsActivity.this;
                super();
            }
            });
        } else
        if ("dialog_model_error".equals(fragment.getTag()))
        {
            fragment = (AlertDialogFragment)fragment;
            fragment.setOnClickListener(new android.content.DialogInterface.OnClickListener() {

                final PaymentCardDetailsActivity this$0;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    if (i == -1)
                    {
                        eventBus.unregisterAll(PaymentCardDetailsActivity.this);
                        eventBus.register(PaymentCardDetailsActivity.this);
                        return;
                    } else
                    {
                        onBackPressed();
                        return;
                    }
                }

            
            {
                this$0 = PaymentCardDetailsActivity.this;
                super();
            }
            });
            fragment.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

                final PaymentCardDetailsActivity this$0;

                public final void onCancel(DialogInterface dialoginterface)
                {
                    onBackPressed();
                }

            
            {
                this$0 = PaymentCardDetailsActivity.this;
                super();
            }
            });
            return;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        boolean flag1 = false;
        super.onCreateOptionsMenu(menu);
        MenuItem menuitem = menu.add(0, 36, 0x30002, com.google.android.apps.walletnfcrel.R.string.personalize_card_label);
        menuitem.setIcon(com.google.android.apps.walletnfcrel.R.drawable.quantum_ic_mode_edit_white_24);
        menuitem.setShowAsActionFlags(2);
        boolean flag;
        if (currentlyRenderedPaymentCard != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        menuitem.setEnabled(flag);
        menu = menu.add(0, 33, 0x30000, com.google.android.apps.walletnfcrel.R.string.options_menu_item_remove_card);
        menu.setIcon(com.google.android.apps.walletnfcrel.R.drawable.quantum_ic_delete_white_24);
        flag = flag1;
        if (currentlyRenderedPaymentCard != null)
        {
            flag = true;
        }
        menu.setEnabled(flag);
        return true;
    }

    public void onNewPaymentCardListModel(PaymentCardModelEvent paymentcardmodelevent)
    {
        if (paymentcardmodelevent.getFailureCause() == null) goto _L2; else goto _L1
_L1:
        boolean flag;
        if (paymentcardmodelevent.getModel() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        WLog.efmt(TAG, paymentcardmodelevent.getFailureCause(), "The card list event contained an error (has model: %s).", new Object[] {
            Boolean.valueOf(flag)
        });
        if (flag) goto _L2; else goto _L3
_L3:
        showPaymentCardModelErrorDialog();
_L5:
        return;
_L2:
        java.util.ArrayList arraylist = Lists.newArrayList(paymentcardmodelevent.getModel().getAllCredentials());
        Object obj = null;
        Iterator iterator = arraylist.iterator();
        do
        {
            paymentcardmodelevent = obj;
            if (!iterator.hasNext())
            {
                break;
            }
            paymentcardmodelevent = (PaymentCard)iterator.next();
        } while (!paymentcardmodelevent.getId().equals(currentlyRenderedCredentialId));
        if (paymentcardmodelevent != null && !paymentcardmodelevent.equals(currentlyRenderedPaymentCard))
        {
            arraylist.remove(paymentcardmodelevent);
            onNewPaymentCard(paymentcardmodelevent);
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        case 34: // '"'
        case 35: // '#'
        default:
            return super.onOptionsItemSelected(menuitem);

        case 36: // '$'
            userEventLogger.log(12, 54);
            launchPersonalizeCardActivity(currentlyRenderedPaymentCard);
            return true;

        case 33: // '!'
            userEventLogger.log(12, 56);
            launchDeleteCardDialog();
            return true;
        }
    }

    protected void onPause()
    {
        eventBus.unregisterAll(this);
        super.onPause();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (currentlyRenderedPaymentCard != null)
        {
            bundle.putParcelable("payment_card", currentlyRenderedPaymentCard);
        }
    }

    protected final void onUpPressed()
    {
        finish();
    }




}
