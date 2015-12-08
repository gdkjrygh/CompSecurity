// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
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
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.money.CurrencyUtil;
import com.google.android.apps.wallet.p2p.api.Contact;
import com.google.android.apps.wallet.p2p.people.ContactsUtil;
import com.google.android.apps.wallet.purchaserecord.PurchaseRecord;
import com.google.android.apps.wallet.purchaserecord.PurchaseRecordEvent;
import com.google.android.apps.wallet.transfer.api.FundsTransferClient;
import com.google.android.apps.wallet.transfer.api.FundsTransferInfoEvent;
import com.google.android.apps.wallet.transfer.api.TransferApi;
import com.google.android.apps.wallet.transfer.ui.P2pHeaderFragment;
import com.google.android.apps.wallet.transfer.validator.MoneyTransferAmountValidator;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.android.apps.wallet.util.text.DefaultTextWatcher;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.money.MonetaryValueInput;
import com.google.android.apps.wallet.widgets.money.MoneyInputSection;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.common.base.Optional;
import com.google.common.base.Strings;
import com.google.common.io.BaseEncoding;
import com.google.protobuf.nano.MessageNano;
import java.math.BigDecimal;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            SendMoneyPrerequisiteGate

public class SendMoneyActivity extends WalletActivity
{
    static final class PrereqsState extends Enum
    {

        private static final PrereqsState $VALUES[];
        public static final PrereqsState REQUIRED;
        public static final PrereqsState SATISFIED;
        public static final PrereqsState STARTED;

        public static PrereqsState valueOf(String s)
        {
            return (PrereqsState)Enum.valueOf(com/google/android/apps/wallet/p2p/SendMoneyActivity$PrereqsState, s);
        }

        public static PrereqsState[] values()
        {
            return (PrereqsState[])$VALUES.clone();
        }

        static 
        {
            REQUIRED = new PrereqsState("REQUIRED", 0);
            STARTED = new PrereqsState("STARTED", 1);
            SATISFIED = new PrereqsState("SATISFIED", 2);
            $VALUES = (new PrereqsState[] {
                REQUIRED, STARTED, SATISFIED
            });
        }

        private PrereqsState(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String TAG = com/google/android/apps/wallet/p2p/SendMoneyActivity.getSimpleName();
    protected MonetaryValueInput amount;
    private TextView amountError;
    public AnalyticsUtil analyticsUtil;
    public FundsTransferClient client;
    public ContactsUtil contactsUtil;
    public EventBus eventBus;
    public FeatureManager featureManager;
    private boolean formPreFilled;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    private Optional maxTransferAmount;
    protected EditText memo;
    protected Optional moneyRequestId;
    MoneyTransferAmountValidator moneyTransferAmountValidator;
    private P2pHeaderFragment p2pHeaderFragment;
    private PrereqsState prereqsState;
    private String previousError;
    protected Contact recipient;
    protected com.google.wallet.proto.NanoWalletEntities.AccountIdentifier recipientIdentifier;
    public SendMoneyPrerequisiteGate sendMoneyPrerequisiteGate;
    public SharedPreferences sharedPreferences;
    public UriRegistry uriRegistry;
    UserEventLogger userEventLogger;

    public SendMoneyActivity()
    {
        this(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    public SendMoneyActivity(int i)
    {
        super(i);
        maxTransferAmount = Optional.absent();
        formPreFilled = false;
        moneyRequestId = Optional.absent();
    }

    private void applyMoneyRequestDetails(PurchaseRecord purchaserecord)
    {
        recipient = new Contact(purchaserecord.getCounterPartyEmail());
        recipientIdentifier = new com.google.wallet.proto.NanoWalletEntities.AccountIdentifier();
        recipientIdentifier.emailAddress = recipient.getEmailAddress();
        renderRecipient();
        populateForm(purchaserecord.getTotalAmountMicros(), purchaserecord.getTotalAmountCurrencyCode(), purchaserecord.getMemo());
        fullScreenProgressSpinnerManager.hide();
    }

    private void confirmMoneyTransfer()
    {
        if (validate())
        {
            startActivityForResult(createConfirmMoneyTransferIntent(), 1);
        }
    }

    private Intent createConfirmMoneyTransferIntent()
    {
        return TransferApi.createConfirmMoneyTransferIntentWithRequestId(this, 1, amount.getMoneyValue().micros.longValue(), amount.getMoneyValue().currencyCode, recipient, memo.getText().toString(), (String)moneyRequestId.orNull());
    }

    private Intent createResultOkIntent()
    {
        return uriRegistry.createIntent(2, new Object[0]);
    }

    private static int getContentViewResId()
    {
        return com.google.android.apps.walletnfcrel.R.layout.send_money_activity;
    }

    private android.widget.TextView.OnEditorActionListener getOnEditorActionListener()
    {
        return new android.widget.TextView.OnEditorActionListener() {

            final SendMoneyActivity this$0;

            public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                analyticsUtil.sendKeyboardReturn("SendMoneyPreview", new AnalyticsCustomDimension[0]);
                confirmMoneyTransfer();
                return true;
            }

            
            {
                this$0 = SendMoneyActivity.this;
                super();
            }
        };
    }

    private void handleGenericLoadingError(String s)
    {
        handleGenericLoadingError(s, null);
    }

    private void handleGenericLoadingError(String s, Throwable throwable)
    {
        setResult(0);
        WLog.e(TAG, s, throwable);
        AlertDialogFragment.newBuilder().setMessage(getString(com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message)).build().show(getSupportFragmentManager(), "loading_error_dialog");
        fullScreenProgressSpinnerManager.hide();
    }

    private void handleHasContactSuccess(Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.UnknownContactBar).setVisibility(8);
            return;
        } else
        {
            Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.UnknownContactBar).setVisibility(0);
            boolean1 = Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.Divider1);
            android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)boolean1.getLayoutParams();
            layoutparams.addRule(3, com.google.android.apps.walletnfcrel.R.id.UnknownContactBar);
            boolean1.setLayoutParams(layoutparams);
            return;
        }
    }

    private void handleMoneyRequestStatus(PurchaseRecord purchaserecord)
    {
        if (purchaserecord.isPending()) goto _L2; else goto _L1
_L1:
        com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment.Builder builder;
        WLog.ifmt(TAG, "Tried to settle up non pending request %s, with status %", new Object[] {
            purchaserecord.getId(), purchaserecord.getStatus()
        });
        analyticsUtil.sendError("CannotSettleNonPendingRequest", new AnalyticsCustomDimension[0]);
        builder = AlertDialogFragment.newBuilder().setCancelable(false).setFinishActivityOnClick().setPositiveButtonActionUri(UriRegistry.getUri(4006, new Object[0]));
        purchaserecord.getStatus().intValue();
        JVM INSTR lookupswitch 3: default 112
    //                   5: 170
    //                   6: 153
    //                   11: 187;
           goto _L3 _L4 _L5 _L6
_L3:
        builder.setTitle(getString(com.google.android.apps.walletnfcrel.R.string.error_generic_problem_title)).setMessage(getString(com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message));
_L8:
        builder.build().show(getSupportFragmentManager());
        fullScreenProgressSpinnerManager.hide();
_L2:
        return;
_L5:
        builder.setTitle(com.google.android.apps.walletnfcrel.R.string.request_money_already_settled_dialog_title).setMessage(com.google.android.apps.walletnfcrel.R.string.request_money_already_settled_dialog_message);
        continue; /* Loop/switch isn't completed */
_L4:
        builder.setTitle(com.google.android.apps.walletnfcrel.R.string.request_money_canceled_dialog_title).setMessage(com.google.android.apps.walletnfcrel.R.string.request_money_canceled_dialog_message);
        continue; /* Loop/switch isn't completed */
_L6:
        builder.setTitle(com.google.android.apps.walletnfcrel.R.string.request_money_declined_dialog_title).setMessage(com.google.android.apps.walletnfcrel.R.string.request_money_declined_dialog_message);
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void handleOtherErrors(Exception exception)
    {
        WLog.e(TAG, "generic error", exception);
        AlertDialogFragment.newBuilder().setMessage(getString(com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message)).build().show(getSupportFragmentManager());
        fullScreenProgressSpinnerManager.hide();
    }

    private void identifyRecipient(Bundle bundle)
    {
        if (bundle == null) goto _L2; else goto _L1
_L1:
        recipient = (Contact)bundle.getParcelable("recipient");
        recipientIdentifier = (com.google.wallet.proto.NanoWalletEntities.AccountIdentifier)Protos.mergeProto(new com.google.wallet.proto.NanoWalletEntities.AccountIdentifier(), bundle.getByteArray("recipientId"));
_L4:
        if (recipient == null && moneyRequestId.isPresent())
        {
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (getIntent().hasExtra("contact"))
        {
            recipient = (Contact)getIntent().getParcelableExtra("contact");
            recipientIdentifier = new com.google.wallet.proto.NanoWalletEntities.AccountIdentifier();
            recipientIdentifier.emailAddress = recipient.getEmailAddress();
        } else
        if (!Strings.isNullOrEmpty(getIntent().getDataString()))
        {
            bundle = Uri.parse(getIntent().getDataString()).getQueryParameter("recipient");
            if (!Strings.isNullOrEmpty(bundle))
            {
                recipientIdentifier = (com.google.wallet.proto.NanoWalletEntities.AccountIdentifier)Protos.mergeProto(new com.google.wallet.proto.NanoWalletEntities.AccountIdentifier(), BaseEncoding.base64Url().decode(bundle));
                recipient = new Contact(recipientIdentifier.emailAddress);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (recipient == null || recipientIdentifier == null)
        {
            handleGenericLoadingError("Failed to determine recipient");
        }
        renderRecipient();
        return;
    }

    private void inflateMenuItems(Menu menu)
    {
        getMenuInflater().inflate(com.google.android.apps.walletnfcrel.R.menu.action_bar_button, menu);
        menu.findItem(com.google.android.apps.walletnfcrel.R.id.ActionBarButton).setTitle(com.google.android.apps.walletnfcrel.R.string.button_review);
    }

    private void logCancellation()
    {
        userEventLogger.log(36, 199);
    }

    private boolean needsMoneyRequestLookup()
    {
        return moneyRequestId.isPresent() && recipient == null;
    }

    private static String parseIdFromUri(int i, Uri uri)
    {
        uri = UriRegistry.parseVariables(i, uri);
        if (uri != null)
        {
            return uri[0];
        } else
        {
            return null;
        }
    }

    private void populateForm(long l, String s, String s1)
    {
        if (!Strings.isNullOrEmpty(s) && !"USD".equals(s))
        {
            handleGenericLoadingError(String.format("Unknown currency code: %s", new Object[] {
                s
            }));
        }
        if (l > 0L)
        {
            amount.setText((new BigDecimal(l)).divide(CurrencyUtil.MICROS_PER_UNIT).toPlainString());
            amount.formatAmount();
        }
        if (moneyRequestId.isPresent() && (l == 0L || Strings.isNullOrEmpty(s)))
        {
            handleGenericLoadingError(String.format("Missing amount for money request,recipient:%s, transactionLookupId:%s ", new Object[] {
                recipient.getRealName(), moneyRequestId.orNull()
            }));
        }
        if (!Strings.isNullOrEmpty(s1))
        {
            s = (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.RequestMemo);
            s.setText(s1);
            s.setVisibility(0);
        }
        formPreFilled = true;
    }

    private void prefillFormFromIntent()
    {
        String s;
        Intent intent;
        long l;
        intent = getIntent();
        l = 0L;
        s = null;
        if (!intent.hasExtra("amount")) goto _L2; else goto _L1
_L1:
        s = intent.getStringExtra("currency");
        l = intent.getLongExtra("amount", 0L);
_L4:
        populateForm(l, s, intent.getStringExtra("memo"));
        return;
_L2:
        if (!Strings.isNullOrEmpty(intent.getDataString()))
        {
            Uri uri = Uri.parse(intent.getDataString());
            s = uri.getQueryParameter("currency");
            l = Long.parseLong(uri.getQueryParameter("amount"));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void registerForMoneyRequestLookup()
    {
        if (!formPreFilled)
        {
            fullScreenProgressSpinnerManager.show();
        }
        eventBus.register(this, com/google/android/apps/wallet/purchaserecord/PurchaseRecordEvent, moneyRequestId.get(), new EventHandler() {

            final SendMoneyActivity this$0;

            private void handleEvent(PurchaseRecordEvent purchaserecordevent)
            {
                static final class _cls11
                {

                    static final int $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[];

                    static 
                    {
                        $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType = new int[com.google.android.apps.wallet.purchaserecord.PurchaseRecordEvent.PurchaseRecordEventType.values().length];
                        try
                        {
                            $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[com.google.android.apps.wallet.purchaserecord.PurchaseRecordEvent.PurchaseRecordEventType.FETCHING_PURCHASE_RECORD.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[com.google.android.apps.wallet.purchaserecord.PurchaseRecordEvent.PurchaseRecordEventType.FETCH_PURCHASE_RECORD_FAIL.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[com.google.android.apps.wallet.purchaserecord.PurchaseRecordEvent.PurchaseRecordEventType.FETCH_PURCHASE_RECORD_SUCCESS.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                _cls11..SwitchMap.com.google.android.apps.wallet.purchaserecord.PurchaseRecordEvent.PurchaseRecordEventType[purchaserecordevent.getType().ordinal()];
                JVM INSTR tableswitch 1 3: default 36
            //                           1 36
            //                           2 37
            //                           3 92;
                   goto _L1 _L1 _L2 _L3
_L1:
                return;
_L2:
                SendMoneyActivity sendmoneyactivity = SendMoneyActivity.this;
                purchaserecordevent = String.valueOf((String)moneyRequestId.get());
                if (purchaserecordevent.length() != 0)
                {
                    purchaserecordevent = "Failed to load purchase record ".concat(purchaserecordevent);
                } else
                {
                    purchaserecordevent = new String("Failed to load purchase record ");
                }
                sendmoneyactivity.handleGenericLoadingError(purchaserecordevent);
                return;
_L3:
                handleMoneyRequestStatus(purchaserecordevent.getPurchaseRecord());
                if (!formPreFilled)
                {
                    applyMoneyRequestDetails(purchaserecordevent.getPurchaseRecord());
                    return;
                }
                if (true) goto _L1; else goto _L4
_L4:
            }

            public final volatile void handleEvent(Object obj)
            {
                handleEvent((PurchaseRecordEvent)obj);
            }

            
            {
                this$0 = SendMoneyActivity.this;
                super();
            }
        });
    }

    private void renderRecipient()
    {
        renderRecipientDetails();
        if (Strings.isNullOrEmpty(recipient.getRealName()) && Strings.isNullOrEmpty(recipient.getPhoto()))
        {
            executeAction("get_contact", new Callable() {

                final SendMoneyActivity this$0;

                public final Object call()
                    throws Exception
                {
                    return contactsUtil.getContact(recipientIdentifier.emailAddress);
                }

            
            {
                this$0 = SendMoneyActivity.this;
                super();
            }
            });
        }
        executeAction("has_contact", new Callable() {

            final SendMoneyActivity this$0;

            public final Object call()
                throws Exception
            {
                return Boolean.valueOf(contactsUtil.hasEmailAsContact(recipientIdentifier.emailAddress));
            }

            
            {
                this$0 = SendMoneyActivity.this;
                super();
            }
        });
    }

    private void renderRecipientDetails()
    {
        ((TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.RecipientEmail)).setText(recipient.getEmailAddress());
        String s = getString(com.google.android.apps.walletnfcrel.R.string.send_money_to_name, new Object[] {
            recipient.getRealName()
        });
        ((TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.RecipientName)).setText(s);
        p2pHeaderFragment.updateContactPhoto(recipient.getPhoto());
    }

    private void showAmountError(String s)
    {
        previousError = s;
        amountError.setText(s);
        amountError.setVisibility(0);
        amountError.sendAccessibilityEvent(32);
    }

    private boolean validate()
    {
        String s = moneyTransferAmountValidator.validateAmount(getResources(), amount.getMoneyValue(), maxTransferAmount, previousError, 1);
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
        Window window;
        byte byte0;
        if (getIntent().hasExtra("money_request_id"))
        {
            moneyRequestId = Optional.of(getIntent().getStringExtra("money_request_id"));
        } else
        if (getIntent().getDataString() != null)
        {
            moneyRequestId = Optional.fromNullable(parseIdFromUri(4005, getIntent().getData()));
        }
        if (!moneyRequestId.isPresent() && getIntent().getDataString() != null)
        {
            moneyRequestId = Optional.fromNullable(parseIdFromUri(4009, getIntent().getData()));
        }
        if (bundle != null && bundle.containsKey("prereqsState"))
        {
            prereqsState = (PrereqsState)bundle.getSerializable("prereqsState");
        } else
        if (moneyRequestId.isPresent())
        {
            prereqsState = PrereqsState.REQUIRED;
        } else
        {
            prereqsState = PrereqsState.SATISFIED;
        }
        if (prereqsState == PrereqsState.REQUIRED)
        {
            fullScreenProgressSpinnerManager.showImmediately();
        }
        setTitle(com.google.android.apps.walletnfcrel.R.string.send_money);
        setContentView(getContentViewResId());
        getWindow().getDecorView().setBackgroundColor(-1);
        if (bundle == null)
        {
            FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
            Bundle bundle1 = new Bundle();
            bundle1.putSerializable("paymentDirection", com.google.android.apps.wallet.transfer.ui.P2pHeaderFragment.PaymentDirection.FROM_USER_TO_CONTACT);
            p2pHeaderFragment = new P2pHeaderFragment();
            p2pHeaderFragment.setArguments(bundle1);
            fragmenttransaction.replace(com.google.android.apps.walletnfcrel.R.id.P2pHeaderContainer, p2pHeaderFragment);
            fragmenttransaction.commit();
            getSupportFragmentManager().executePendingTransactions();
        } else
        {
            p2pHeaderFragment = (P2pHeaderFragment)getSupportFragmentManager().findFragmentById(com.google.android.apps.walletnfcrel.R.id.P2pHeaderContainer);
        }
        amount = ((MoneyInputSection)findViewById(com.google.android.apps.walletnfcrel.R.id.MoneyInputSection)).getInput();
        amountError = ((MoneyInputSection)findViewById(com.google.android.apps.walletnfcrel.R.id.MoneyInputSection)).getErrorView();
        amount.addTextChangedListener(new DefaultTextWatcher() {

            final SendMoneyActivity this$0;

            public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
            {
                validate();
            }

            
            {
                this$0 = SendMoneyActivity.this;
                super();
            }
        });
        memo = (EditText)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.Memo);
        memo.setOnEditorActionListener(getOnEditorActionListener());
        window = getWindow();
        if (moneyRequestId.isPresent())
        {
            byte0 = 2;
        } else
        {
            byte0 = 4;
        }
        window.setSoftInputMode(byte0);
        identifyRecipient(bundle);
    }

    public final void doOnResume()
    {
        if (prereqsState != PrereqsState.REQUIRED) goto _L2; else goto _L1
_L1:
        fullScreenProgressSpinnerManager.showImmediately();
        sendMoneyPrerequisiteGate.setOnSuccessCallback(new Runnable() {

            final SendMoneyActivity this$0;

            public final void run()
            {
                prereqsState = PrereqsState.SATISFIED;
                sendMoneyPrerequisiteGate.deactivate();
                fullScreenProgressSpinnerManager.hide();
            }

            
            {
                this$0 = SendMoneyActivity.this;
                super();
            }
        });
        sendMoneyPrerequisiteGate.activate();
        prereqsState = PrereqsState.STARTED;
_L4:
        eventBus.register(this, com/google/android/apps/wallet/transfer/api/FundsTransferInfoEvent, Integer.valueOf(1), new EventHandler() {

            final SendMoneyActivity this$0;

            private void handleEvent(FundsTransferInfoEvent fundstransferinfoevent)
            {
                maxTransferAmount = fundstransferinfoevent.getMaxTransferAmount();
            }

            public final volatile void handleEvent(Object obj)
            {
                handleEvent((FundsTransferInfoEvent)obj);
            }

            
            {
                this$0 = SendMoneyActivity.this;
                super();
            }
        });
        return;
_L2:
        if (prereqsState == PrereqsState.STARTED)
        {
            overridePendingTransition(0, 0);
            finish();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public final boolean onActionFailure(String s, Callable callable, Exception exception)
    {
        if ("get_contact".equals(s))
        {
            renderRecipientDetails();
            WLog.e(TAG, "Error on retrieving Contact", exception);
        } else
        if (!super.onActionFailure(s, callable, exception))
        {
            handleOtherErrors(exception);
        } else
        {
            fullScreenProgressSpinnerManager.hide();
        }
        return true;
    }

    public final void onActionSuccess(String s, Callable callable, Object obj)
    {
        if ("get_contact".equals(s))
        {
            recipient = (Contact)obj;
            renderRecipientDetails();
        } else
        if ("has_contact".equals(s))
        {
            handleHasContactSuccess((Boolean)obj);
            return;
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 1 && j == -1)
        {
            setResult(-1);
            if (!moneyRequestId.isPresent())
            {
                navigateUpWithIntent(createResultOkIntent());
            }
            finish();
        }
    }

    public final void onAttachFragment(Fragment fragment)
    {
        if ("loading_error_dialog".equals(fragment.getTag()))
        {
            fragment = (AlertDialogFragment)fragment;
            fragment.setOnClickListener(new android.content.DialogInterface.OnClickListener() {

                final SendMoneyActivity this$0;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    onBackPressed();
                }

            
            {
                this$0 = SendMoneyActivity.this;
                super();
            }
            });
            fragment.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

                final SendMoneyActivity this$0;

                public final void onCancel(DialogInterface dialoginterface)
                {
                    onBackPressed();
                }

            
            {
                this$0 = SendMoneyActivity.this;
                super();
            }
            });
        } else
        if ("sendMoneyErrorDialog".equals(fragment.getTag()))
        {
            ((AlertDialogFragment)fragment).setOnClickListener(new android.content.DialogInterface.OnClickListener() {

                final SendMoneyActivity this$0;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    finish();
                }

            
            {
                this$0 = SendMoneyActivity.this;
                super();
            }
            });
            return;
        }
    }

    public void onBackPressed()
    {
        logCancellation();
        super.onBackPressed();
    }

    protected final void onBeforeCreate(Bundle bundle)
    {
        getWindow().requestFeature(12);
        super.onBeforeCreate(bundle);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        inflateMenuItems(menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == com.google.android.apps.walletnfcrel.R.id.ActionBarButton)
        {
            analyticsUtil.sendButtonTap("SendMoneyPreview", new AnalyticsCustomDimension[0]);
            WLog.i(TAG, "Send action clicked");
            confirmMoneyTransfer();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void onPause()
    {
        super.onPause();
        if (prereqsState == PrereqsState.STARTED)
        {
            sendMoneyPrerequisiteGate.deactivate();
        }
        eventBus.unregisterAll(this);
    }

    protected final void onResumeFragments()
    {
        super.onResumeFragments();
        if (!formPreFilled && !needsMoneyRequestLookup())
        {
            prefillFormFromIntent();
        } else
        if (needsMoneyRequestLookup())
        {
            registerForMoneyRequestLookup();
            return;
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("recipient", recipient);
        bundle.putByteArray("recipientId", MessageNano.toByteArray(recipientIdentifier));
        bundle.putSerializable("prereqsState", prereqsState);
        bundle.putBoolean("prefilled", formPreFilled);
    }

    protected final void onUpPressed()
    {
        logCancellation();
        Intent intent;
        if (moneyRequestId.isPresent())
        {
            intent = uriRegistry.createIntent(8001, new Object[] {
                moneyRequestId.get()
            });
        } else
        {
            intent = uriRegistry.createIntent(4000, new Object[0]);
        }
        navigateUpWithIntent(intent);
    }





/*
    static PrereqsState access$202(SendMoneyActivity sendmoneyactivity, PrereqsState prereqsstate)
    {
        sendmoneyactivity.prereqsState = prereqsstate;
        return prereqsstate;
    }

*/


/*
    static Optional access$302(SendMoneyActivity sendmoneyactivity, Optional optional)
    {
        sendmoneyactivity.maxTransferAmount = optional;
        return optional;
    }

*/




}
