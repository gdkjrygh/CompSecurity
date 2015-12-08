// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer.request;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.callstatus.CallErrorDialogs;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.money.CurrencyUtil;
import com.google.android.apps.wallet.p2p.api.Contact;
import com.google.android.apps.wallet.pin.api.PinApi;
import com.google.android.apps.wallet.transfer.api.FundsTransferClient;
import com.google.android.apps.wallet.transfer.api.FundsTransferInfoEvent;
import com.google.android.apps.wallet.transfer.ui.P2pHeaderFragment;
import com.google.android.apps.wallet.transfer.validator.MoneyTransferAmountValidator;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.util.text.DefaultTextWatcher;
import com.google.android.apps.wallet.widgets.money.MonetaryValueInput;
import com.google.android.apps.wallet.widgets.money.MoneyInputSection;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.common.base.Optional;
import java.util.UUID;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.transfer.request:
//            RequestMoneyAction

public class RequestMoneyActivity extends WalletActivity
{

    private static final String TAG = com/google/android/apps/wallet/transfer/request/RequestMoneyActivity.getSimpleName();
    private MonetaryValueInput amount;
    private TextView amountError;
    AnalyticsUtil analyticsUtil;
    EventBus eventBus;
    FundsTransferClient fundsTransferClient;
    private Optional maxTransferAmount;
    private EditText memo;
    MoneyTransferAmountValidator moneyTransferAmountValidator;
    private P2pHeaderFragment p2pHeaderFragment;
    private String previousError;
    FullScreenProgressSpinnerManager progressSpinner;
    UriRegistry uriRegistry;

    public RequestMoneyActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
        maxTransferAmount = Optional.absent();
    }

    private void onRequestMoneySuccess(RequestMoneyAction requestmoneyaction, com.google.wallet.proto.api.NanoWalletFundsTransfer.RequestMoneyResponse requestmoneyresponse)
    {
        progressSpinner.hide();
        if (requestmoneyresponse.callError != null)
        {
            if (requestmoneyresponse.callError.errorCode.intValue() == 3)
            {
                PinApi.startVerifyPinActivityForResult(this, 2);
                return;
            } else
            {
                WLog.e(TAG, requestmoneyresponse.callError.toString());
                analyticsUtil.sendError("RequestMoneySend", new AnalyticsCustomDimension[0]);
                CallErrorDialogs.createBuilderWithGenericTitle(requestmoneyresponse.callError, com.google.android.apps.walletnfcrel.R.string.request_money_generic_failure_message).build().show(getSupportFragmentManager());
                return;
            }
        }
        if (requestmoneyresponse.requesteeError != null && requestmoneyresponse.requesteeError.length > 0)
        {
            analyticsUtil.sendError("RequestMoneySend", new AnalyticsCustomDimension[0]);
            CallErrorDialogs.createBuilderWithGenericTitle(requestmoneyresponse.requesteeError[0].callError, com.google.android.apps.walletnfcrel.R.string.error_dialog_check_input_message).setFinishActivityOnClick().build().show(getSupportFragmentManager());
            return;
        } else
        {
            analyticsUtil.sendSuccess("RequestMoneySend", new AnalyticsCustomDimension[0]);
            requestmoneyresponse = CurrencyUtil.microsToDisplayableMoney(requestmoneyaction.getRequestedAmount().micros.longValue(), CurrencyUtil.getLegalAddressCurrency());
            Toasts.show(this, getString(com.google.android.apps.walletnfcrel.R.string.request_money_sent, new Object[] {
                requestmoneyresponse, requestmoneyaction.getRequesteeHumanIdentifier()
            }));
            setResult(-1);
            navigateUpWithIntent(uriRegistry.createIntent(2, new Object[0]));
            return;
        }
    }

    private void populateContactDetails()
    {
        Contact contact = (Contact)getIntent().getParcelableExtra("contact");
        p2pHeaderFragment.updateContactPhoto(contact.getPhoto());
        ((TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.MoneyFromText)).setText(getString(com.google.android.apps.walletnfcrel.R.string.request_money_from_name, new Object[] {
            contact.getRealName()
        }).trim());
        ((TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.ContactEmail)).setText(contact.getEmailAddress());
    }

    private void showAmountError(String s)
    {
        previousError = s;
        amountError.setText(s);
        amountError.setVisibility(0);
        amountError.sendAccessibilityEvent(32);
    }

    private void submitMoneyRequest()
    {
        if (validate())
        {
            progressSpinner.show();
            Contact contact = (Contact)getIntent().getParcelableExtra("contact");
            executeAction("request money", new RequestMoneyAction(fundsTransferClient, contact, amount.getMoneyValue(), memo.getText().toString(), UUID.randomUUID().toString()));
        }
    }

    private boolean validate()
    {
        String s = moneyTransferAmountValidator.validateAmount(getResources(), amount.getMoneyValue(), maxTransferAmount, previousError, 4);
        if (s == null)
        {
            previousError = null;
            amountError.setVisibility(8);
            return true;
        } else
        {
            showAmountError(s);
            return false;
        }
    }

    protected final void doOnCreate(Bundle bundle)
    {
        setTitle(com.google.android.apps.walletnfcrel.R.string.request_money_title);
        setContentView(com.google.android.apps.walletnfcrel.R.layout.request_money_activity);
        getWindow().getDecorView().setBackgroundColor(-1);
        if (!getIntent().hasExtra("contact"))
        {
            navigateUpWithIntent(uriRegistry.createIntent(4001, new Object[0]));
            return;
        }
        if (bundle != null)
        {
            previousError = bundle.getString("PreviousError");
            p2pHeaderFragment = (P2pHeaderFragment)getSupportFragmentManager().findFragmentById(com.google.android.apps.walletnfcrel.R.id.P2pHeaderContainer);
        } else
        {
            bundle = new Bundle();
            bundle.putSerializable("paymentDirection", com.google.android.apps.wallet.transfer.ui.P2pHeaderFragment.PaymentDirection.FROM_CONTACT_TO_USER);
            p2pHeaderFragment = new P2pHeaderFragment();
            p2pHeaderFragment.setArguments(bundle);
            getSupportFragmentManager().beginTransaction().replace(com.google.android.apps.walletnfcrel.R.id.P2pHeaderContainer, p2pHeaderFragment).commit();
            getSupportFragmentManager().executePendingTransactions();
        }
        populateContactDetails();
        amount = ((MoneyInputSection)findViewById(com.google.android.apps.walletnfcrel.R.id.MoneyInputSection)).getInput();
        amountError = ((MoneyInputSection)findViewById(com.google.android.apps.walletnfcrel.R.id.MoneyInputSection)).getErrorView();
        amount.addTextChangedListener(new DefaultTextWatcher() {

            final RequestMoneyActivity this$0;

            public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
            {
                validate();
            }

            
            {
                this$0 = RequestMoneyActivity.this;
                super();
            }
        });
        memo = (EditText)findViewById(com.google.android.apps.walletnfcrel.R.id.Memo);
        memo.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final RequestMoneyActivity this$0;

            public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                boolean flag1 = false;
                boolean flag;
                if (i == 0 && keyevent.getAction() == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (i == 6 || flag)
                {
                    analyticsUtil.sendKeyboardReturn("RequestMoneySend", new AnalyticsCustomDimension[0]);
                    submitMoneyRequest();
                    flag1 = true;
                }
                return flag1;
            }

            
            {
                this$0 = RequestMoneyActivity.this;
                super();
            }
        });
    }

    public final void doOnResume()
    {
        eventBus.register(this, com/google/android/apps/wallet/transfer/api/FundsTransferInfoEvent, Integer.valueOf(1), new EventHandler() {

            final RequestMoneyActivity this$0;

            private void handleEvent(FundsTransferInfoEvent fundstransferinfoevent)
            {
                maxTransferAmount = fundstransferinfoevent.getMaxTransferAmount();
            }

            public final volatile void handleEvent(Object obj)
            {
                handleEvent((FundsTransferInfoEvent)obj);
            }

            
            {
                this$0 = RequestMoneyActivity.this;
                super();
            }
        });
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public final boolean onActionFailure(String s, Callable callable, Exception exception)
    {
        boolean flag = false;
        if ("request money".equals(s))
        {
            analyticsUtil.sendError("RequestMoneySend", new AnalyticsCustomDimension[0]);
            progressSpinner.hide();
            if (!super.onActionFailure(s, callable, exception))
            {
                WLog.e(TAG, "Error when requesting money", exception);
                CallErrorDialogs.createBuilderWithGenericTitle(exception, com.google.android.apps.walletnfcrel.R.string.request_money_generic_failure_message).build().show(getSupportFragmentManager());
            }
            flag = true;
        }
        return flag;
    }

    public final void onActionSuccess(String s, Callable callable, Object obj)
    {
        if ("request money".equals(s))
        {
            onRequestMoneySuccess((RequestMoneyAction)callable, (com.google.wallet.proto.api.NanoWalletFundsTransfer.RequestMoneyResponse)obj);
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 2 && j != 0)
        {
            submitMoneyRequest();
        }
    }

    protected final void onBeforeCreate(Bundle bundle)
    {
        getWindow().requestFeature(12);
        super.onBeforeCreate(bundle);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(com.google.android.apps.walletnfcrel.R.menu.action_bar_button, menu);
        menu.findItem(com.google.android.apps.walletnfcrel.R.id.ActionBarButton).setTitle(com.google.android.apps.walletnfcrel.R.string.button_send);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == com.google.android.apps.walletnfcrel.R.id.ActionBarButton)
        {
            analyticsUtil.sendButtonTap("RequestMoneySend", new AnalyticsCustomDimension[0]);
            submitMoneyRequest();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void onPause()
    {
        super.onPause();
        eventBus.unregisterAll(this);
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("PreviousError", previousError);
    }

    protected final void onUpPressed()
    {
        navigateUpWithIntent(uriRegistry.createIntent(4001, new Object[0]));
    }





/*
    static Optional access$202(RequestMoneyActivity requestmoneyactivity, Optional optional)
    {
        requestmoneyactivity.maxTransferAmount = optional;
        return optional;
    }

*/
}
