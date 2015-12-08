// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.recurringtopup;

import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.bankaccount.api.BankAccount;
import com.google.android.apps.wallet.bankaccount.api.BankAccountsModel;
import com.google.android.apps.wallet.bankaccount.api.BankAccountsModelEvent;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.callstatus.CallErrorDialogs;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.money.CurrencySymbolPosition;
import com.google.android.apps.wallet.money.CurrencyUtil;
import com.google.android.apps.wallet.topup.api.TopUpApi;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.util.date.DateAndTimeHelper;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.money.MonetaryValueInput;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.recurringtopup:
//            PreviewRecurringTopupAction, ReviewRecurringTopupActivity, RecurringTopupEvent, RecurringTopupEligibilityEvent, 
//            RecurringTopupPublisher

public class SetupRecurringTopupActivity extends WalletActivity
    implements com.google.android.apps.wallet.ui.dialog.calendar.DayOfMonthDialog.DayOfMonthDialogListener, com.google.android.apps.wallet.ui.dialog.calendar.DayOfWeekDialog.DayOfWeekDialogListener
{
    static final class Frequency extends Enum
    {

        private static final Frequency $VALUES[];
        public static final Frequency BIWEEKLY;
        public static final Frequency MONTH;
        public static final Frequency WEEK;
        private final int id;
        private final int text;

        public static Frequency valueOf(String s)
        {
            return (Frequency)Enum.valueOf(com/google/android/apps/wallet/recurringtopup/SetupRecurringTopupActivity$Frequency, s);
        }

        public static Frequency[] values()
        {
            return (Frequency[])$VALUES.clone();
        }

        public final int getId()
        {
            return id;
        }

        public final int getText()
        {
            return text;
        }

        static 
        {
            WEEK = new Frequency("WEEK", 0, 1, com.google.android.apps.walletnfcrel.R.string.weekly_topup_text);
            BIWEEKLY = new Frequency("BIWEEKLY", 1, 2, com.google.android.apps.walletnfcrel.R.string.biweekly_topup_text);
            MONTH = new Frequency("MONTH", 2, 3, com.google.android.apps.walletnfcrel.R.string.monthly_topup_text);
            $VALUES = (new Frequency[] {
                WEEK, BIWEEKLY, MONTH
            });
        }

        private Frequency(String s, int i, int j, int k)
        {
            super(s, i);
            id = j;
            text = k;
        }
    }

    final class FrequencySpinnerAdapter extends ArrayAdapter
    {

        final SetupRecurringTopupActivity this$0;

        public final View getDropDownView(int i, View view, ViewGroup viewgroup)
        {
            view = (TextView)super.getDropDownView(i, view, viewgroup);
            view.setText(((Frequency)getItem(i)).getText());
            return view;
        }

        public final View getView(int i, View view, ViewGroup viewgroup)
        {
            view = (TextView)super.getView(i, view, viewgroup);
            view.setText(((Frequency)getItem(i)).getText());
            return view;
        }

        public FrequencySpinnerAdapter()
        {
            this$0 = SetupRecurringTopupActivity.this;
            super(SetupRecurringTopupActivity.this, 0x1090008, Frequency.values());
            setDropDownViewResource(0x1090009);
        }
    }


    private static final String TAG = com/google/android/apps/wallet/recurringtopup/SetupRecurringTopupActivity.getSimpleName();
    private MonetaryValueInput amount;
    private TextView amountError;
    AnalyticsUtil analyticsUtil;
    private BankAccount bankAccount;
    DateAndTimeHelper dateAndTimeHelper;
    private int dayOfMonth;
    public com.google.android.apps.wallet.ui.dialog.calendar.DayOfMonthDialog.Factory dayOfMonthDialogFactory;
    private int dayOfWeek;
    public com.google.android.apps.wallet.ui.dialog.calendar.DayOfWeekDialog.Factory dayOfWeekDialogFactory;
    EventBus eventBus;
    private Spinner frequencySpinner;
    private List limits;
    private TextView optionText;
    public FullScreenProgressSpinnerManager progressSpinnerManager;
    RecurringTopupPublisher recurringTopupPublisher;
    UriRegistry uriRegistry;

    public SetupRecurringTopupActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
        dayOfMonth = 1;
        dayOfWeek = 2;
    }

    private boolean checkFailureCause(Throwable throwable)
    {
        if (throwable != null)
        {
            WLog.e(TAG, "Received exception from an event provider", throwable);
            if (getFragmentManager().findFragmentByTag("ERROR_DIALOG") == null)
            {
                CallErrorDialogs.createBuilderWithGenericTitle(throwable, com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message).setFinishActivityOnClick().build().show(getSupportFragmentManager(), "ERROR_DIALOG");
            }
            return true;
        } else
        {
            return false;
        }
    }

    public static Intent createIntent(Context context)
    {
        return InternalIntents.forClass(context, com/google/android/apps/wallet/recurringtopup/SetupRecurringTopupActivity);
    }

    public static Intent createIntent(Context context, long l)
    {
        context = InternalIntents.forClass(context, com/google/android/apps/wallet/recurringtopup/SetupRecurringTopupActivity);
        context.putExtra("AMOUNT_MICROS", l);
        return context;
    }

    private static BankAccount findApplicableBankAccount(List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            BankAccount bankaccount = (BankAccount)list.next();
            if (bankaccount.isValid() && !bankaccount.isInapplicableForUse(5))
            {
                return bankaccount;
            }
        }

        return null;
    }

    private com.google.wallet.proto.features.NanoPaymentSchedule.Schedule getSchedule()
    {
        com.google.wallet.proto.features.NanoPaymentSchedule.Schedule schedule = new com.google.wallet.proto.features.NanoPaymentSchedule.Schedule();
        schedule.scheduleRecurrence = Integer.valueOf(((Frequency)frequencySpinner.getSelectedItem()).getId());
        if (schedule.scheduleRecurrence.intValue() == 1 || schedule.scheduleRecurrence.intValue() == 2)
        {
            schedule.dayOfWeek = Integer.valueOf(dayOfWeek);
            return schedule;
        } else
        {
            schedule.dayOfTheMonth = Integer.valueOf(dayOfMonth);
            return schedule;
        }
    }

    private com.google.wallet.proto.api.NanoWalletScheduleTopups.CheckScheduledTopupEligibilityResponse.TransferLimit getTransferLimit()
    {
        final int recurence;
        boolean flag;
        if (limits != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        recurence = ((Frequency)frequencySpinner.getSelectedItem()).getId();
        return (com.google.wallet.proto.api.NanoWalletScheduleTopups.CheckScheduledTopupEligibilityResponse.TransferLimit)Iterables.find(limits, new Predicate() {

            final SetupRecurringTopupActivity this$0;
            final int val$recurence;

            private boolean apply(com.google.wallet.proto.api.NanoWalletScheduleTopups.CheckScheduledTopupEligibilityResponse.TransferLimit transferlimit)
            {
                return transferlimit.recurrence.intValue() == recurence;
            }

            public final volatile boolean apply(Object obj)
            {
                return apply((com.google.wallet.proto.api.NanoWalletScheduleTopups.CheckScheduledTopupEligibilityResponse.TransferLimit)obj);
            }

            
            {
                this$0 = SetupRecurringTopupActivity.this;
                recurence = i;
                super();
            }
        }, null);
    }

    private void maybeRevealView()
    {
        if (limits != null && bankAccount != null)
        {
            progressSpinnerManager.hide();
        }
    }

    private void onReviewClick()
    {
        boolean flag;
        if (bankAccount != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        if (validate())
        {
            Views.hideSoftKeyboard(this, getCurrentFocus());
            WLog.i(TAG, "Requesting scheduled topup details");
            progressSpinnerManager.showImmediately();
            executeAction("PREVIEW", new PreviewRecurringTopupAction(recurringTopupPublisher, getSchedule(), amount.getMoneyValue(), bankAccount.getSubId()));
        }
    }

    private void openOptionDialog()
    {
        FragmentManager fragmentmanager = getFragmentManager();
        static final class _cls4
        {

            static final int $SwitchMap$com$google$android$apps$wallet$recurringtopup$SetupRecurringTopupActivity$Frequency[];

            static 
            {
                $SwitchMap$com$google$android$apps$wallet$recurringtopup$SetupRecurringTopupActivity$Frequency = new int[Frequency.values().length];
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$recurringtopup$SetupRecurringTopupActivity$Frequency[Frequency.WEEK.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$recurringtopup$SetupRecurringTopupActivity$Frequency[Frequency.BIWEEKLY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$recurringtopup$SetupRecurringTopupActivity$Frequency[Frequency.MONTH.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls4..SwitchMap.com.google.android.apps.wallet.recurringtopup.SetupRecurringTopupActivity.Frequency[((Frequency)frequencySpinner.getSelectedItem()).ordinal()];
        JVM INSTR tableswitch 1 3: default 48
    //                   1 97
    //                   2 126
    //                   3 149;
           goto _L1 _L2 _L3 _L4
_L1:
        String s = String.valueOf(frequencySpinner.getSelectedItem());
        throw new IllegalStateException((new StringBuilder(String.valueOf(s).length() + 28)).append("Invalid frequency selected: ").append(s).toString());
_L2:
        Object obj;
        obj = dayOfWeekDialogFactory;
        obj = com.google.android.apps.wallet.ui.dialog.calendar.DayOfWeekDialog.Factory.create(getString(com.google.android.apps.walletnfcrel.R.string.weekly_topup_dialog_title), dayOfWeek);
_L6:
        ((DialogFragment) (obj)).show(fragmentmanager, "OPTION_DIALOG");
        return;
_L3:
        obj = dayOfWeekDialogFactory;
        obj = com.google.android.apps.wallet.ui.dialog.calendar.DayOfWeekDialog.Factory.create(getString(com.google.android.apps.walletnfcrel.R.string.biweekly_topup_dialog_title), dayOfWeek);
        continue; /* Loop/switch isn't completed */
_L4:
        obj = dayOfMonthDialogFactory;
        obj = com.google.android.apps.wallet.ui.dialog.calendar.DayOfMonthDialog.Factory.create(getString(com.google.android.apps.walletnfcrel.R.string.monthly_topup_dialog_title), dayOfMonth);
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void updateOptionText()
    {
        TextView textview;
        switch (_cls4..SwitchMap.com.google.android.apps.wallet.recurringtopup.SetupRecurringTopupActivity.Frequency[((Frequency)frequencySpinner.getSelectedItem()).ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            optionText.setText(getString(com.google.android.apps.walletnfcrel.R.string.on_day_of_week, new Object[] {
                dateAndTimeHelper.getDayOfWeekName(dayOfWeek)
            }));
            return;

        case 2: // '\002'
            optionText.setText(getString(com.google.android.apps.walletnfcrel.R.string.on_day_of_week, new Object[] {
                dateAndTimeHelper.getDayOfWeekName(dayOfWeek)
            }));
            return;

        case 3: // '\003'
            textview = optionText;
            break;
        }
        String s;
        if (dayOfMonth == 32)
        {
            s = getString(com.google.android.apps.walletnfcrel.R.string.on_last_day_of_month);
        } else
        {
            s = getString(com.google.android.apps.walletnfcrel.R.string.on_day_of_month, new Object[] {
                dateAndTimeHelper.getDayOfMonthOrdinal(dayOfMonth)
            });
        }
        textview.setText(s);
    }

    private boolean validate()
    {
        long l;
        boolean flag;
        if (limits != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        l = ((MonetaryValueInput)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.Amount)).getMoneyValue().micros.longValue();
        if (l == 0L)
        {
            analyticsUtil.sendUserError("MoneyTransferCannotSendZero", new AnalyticsCustomDimension[0]);
            amountError.setText(com.google.android.apps.walletnfcrel.R.string.transfer_money_error_zero);
            amountError.setVisibility(0);
            return false;
        }
        com.google.wallet.proto.api.NanoWalletScheduleTopups.CheckScheduledTopupEligibilityResponse.TransferLimit transferlimit = getTransferLimit();
        if (transferlimit != null)
        {
            if (l < transferlimit.minimumTopupAmount.amount.micros.longValue())
            {
                analyticsUtil.sendUserError("MoneyTransferAmountTooLow", new AnalyticsCustomDimension[0]);
                amountError.setText(getString(com.google.android.apps.walletnfcrel.R.string.recurring_topup_amount_min_error, new Object[] {
                    transferlimit.minimumTopupAmount.displayAmount
                }));
                amountError.setVisibility(0);
                return false;
            }
            if (l > transferlimit.maximumTopupAmount.amount.micros.longValue())
            {
                analyticsUtil.sendUserError("MoneyTransferAmountTooHigh", new AnalyticsCustomDimension[0]);
                amountError.setText(getString(com.google.android.apps.walletnfcrel.R.string.recurring_topup_amount_max_error, new Object[] {
                    transferlimit.maximumTopupAmount.displayAmount
                }));
                amountError.setVisibility(0);
                return false;
            }
            amountError.setVisibility(8);
        }
        return true;
    }

    protected final void doOnCreate(Bundle bundle)
    {
        setTitle(com.google.android.apps.walletnfcrel.R.string.setup_recurring_transfer_title);
        setContentView(com.google.android.apps.walletnfcrel.R.layout.setup_recurring_topup_activity);
        int i;
        if (CurrencyUtil.getCurrencySymbolPosition(Locale.getDefault()) == CurrencySymbolPosition.FOLLOW_AMOUNT)
        {
            i = com.google.android.apps.walletnfcrel.R.id.SuffixMoneySymbol;
        } else
        {
            i = com.google.android.apps.walletnfcrel.R.id.PrefixMoneySymbol;
        }
        bundle = (TextView)Views.findViewById(this, i);
        bundle.setVisibility(0);
        bundle.setText(CurrencyUtil.getCurrencySymbol());
        amount = (MonetaryValueInput)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.Amount);
        amountError = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.AmountError);
        if (getIntent().hasExtra("AMOUNT_MICROS"))
        {
            bundle = (new BigDecimal(getIntent().getLongExtra("AMOUNT_MICROS", 0L))).divide(CurrencyUtil.MICROS_PER_UNIT).toPlainString();
            amount.setText(bundle);
            amount.formatAmount();
        }
        frequencySpinner = (Spinner)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.FrequencySpinner);
        frequencySpinner.setAdapter(new FrequencySpinnerAdapter());
        frequencySpinner.setTag("INITIALIZING");
        frequencySpinner.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final SetupRecurringTopupActivity this$0;

            public final void onItemSelected(AdapterView adapterview, View view, int j, long l)
            {
                if ("INITIALIZING".equals(frequencySpinner.getTag()))
                {
                    frequencySpinner.setTag("INITIALIZED");
                } else
                {
                    analyticsUtil.sendListItemTap("RecurringTransferRecurrence", new AnalyticsCustomDimension[0]);
                }
                updateOptionText();
            }

            public final void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                this$0 = SetupRecurringTopupActivity.this;
                super();
            }
        });
        Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.OptionContainer).setOnClickListener(new android.view.View.OnClickListener() {

            final SetupRecurringTopupActivity this$0;

            public final void onClick(View view)
            {
                openOptionDialog();
            }

            
            {
                this$0 = SetupRecurringTopupActivity.this;
                super();
            }
        });
        optionText = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.OptionText);
        updateOptionText();
        progressSpinnerManager.showImmediately();
    }

    protected final void doOnResume()
    {
        super.doOnResume();
        eventBus.register(this);
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public final boolean onActionFailure(String s, Callable callable, Exception exception)
    {
        progressSpinnerManager.hide();
        if (!super.onActionFailure(s, callable, exception))
        {
            analyticsUtil.sendError("RecurringTransferPreview", new AnalyticsCustomDimension[0]);
            WLog.e(TAG, "Error previewing schedule", exception);
            CallErrorDialogs.createBuilderWithGenericTitle(exception, com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message).build().show(getSupportFragmentManager(), "ERROR_DIALOG");
        }
        return true;
    }

    public final void onActionSuccess(String s, Callable callable, Object obj)
    {
        s = (com.google.wallet.proto.api.NanoWalletScheduleTopups.PreviewTopupScheduleResponse)obj;
        if (((com.google.wallet.proto.api.NanoWalletScheduleTopups.PreviewTopupScheduleResponse) (s)).callError != null)
        {
            progressSpinnerManager.hide();
            analyticsUtil.sendError("RecurringTransferPreview", new AnalyticsCustomDimension[0]);
            WLog.e(TAG, ((com.google.wallet.proto.api.NanoWalletScheduleTopups.PreviewTopupScheduleResponse) (s)).callError.toString());
            CallErrorDialogs.createBuilderWithGenericTitle(((com.google.wallet.proto.api.NanoWalletScheduleTopups.PreviewTopupScheduleResponse) (s)).callError, com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message).build().show(getSupportFragmentManager());
            return;
        } else
        {
            analyticsUtil.sendSuccess("RecurringTransferPreview", new AnalyticsCustomDimension[0]);
            startActivity(ReviewRecurringTopupActivity.createIntent(this, ((com.google.wallet.proto.api.NanoWalletScheduleTopups.PreviewTopupScheduleResponse) (s)).schedule));
            return;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(com.google.android.apps.walletnfcrel.R.menu.action_bar_button, menu);
        menu.findItem(com.google.android.apps.walletnfcrel.R.id.ActionBarButton).setTitle(com.google.android.apps.walletnfcrel.R.string.button_review);
        return true;
    }

    public final void onDayOfMonthSelected(int i)
    {
        analyticsUtil.sendListItemTap("RecurringTransferDayOfMonth", new AnalyticsCustomDimension[0]);
        dayOfMonth = i;
        updateOptionText();
    }

    public final void onDayOfWeekSelected(int i)
    {
        analyticsUtil.sendListItemTap("RecurringTransferDayOfWeek", new AnalyticsCustomDimension[0]);
        dayOfWeek = i;
        updateOptionText();
    }

    void onNewBankAccountsModelEvent(BankAccountsModelEvent bankaccountsmodelevent)
    {
        Preconditions.checkArgument(bankaccountsmodelevent.isFeatureEnabled());
        bankAccount = findApplicableBankAccount(bankaccountsmodelevent.getModel().getBankAccounts());
        if (bankAccount == null)
        {
            AlertDialogFragment.newBuilder().setMessage(com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message).setFinishActivityOnClick().build().show(getSupportFragmentManager());
        } else
        if (!checkFailureCause(bankaccountsmodelevent.getFailureCause()))
        {
            ((TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.FundingSourceText)).setText(getString(com.google.android.apps.walletnfcrel.R.string.recurring_transfer_account, new Object[] {
                bankAccount.getNickname(this)
            }));
            maybeRevealView();
            return;
        }
    }

    void onNewRecurringTopupEvent(RecurringTopupEvent recurringtopupevent)
    {
        Preconditions.checkArgument(recurringtopupevent.isFeatureEnabled());
        if (recurringtopupevent.getTopupSchedule() != null)
        {
            WLog.w(TAG, "Recurring topup already exists");
            navigateUpWithIntent(uriRegistry.createIntent(5005, new Object[0]));
            finish();
        }
    }

    void onNewScheduledTopupEligibilityEvent(RecurringTopupEligibilityEvent recurringtopupeligibilityevent)
    {
        Preconditions.checkArgument(recurringtopupeligibilityevent.isFeatureEnabled());
        if (checkFailureCause(recurringtopupeligibilityevent.getFailureCause()))
        {
            return;
        } else
        {
            limits = recurringtopupeligibilityevent.getLimits();
            maybeRevealView();
            return;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == com.google.android.apps.walletnfcrel.R.id.ActionBarButton)
        {
            analyticsUtil.sendButtonTap("RecurringTransferPreview", new AnalyticsCustomDimension[0]);
            onReviewClick();
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

    public void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        dayOfWeek = bundle.getInt("DAY_OF_WEEK");
        dayOfMonth = bundle.getInt("DAY_OF_MONTH");
        updateOptionText();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putInt("DAY_OF_WEEK", dayOfWeek);
        bundle.putInt("DAY_OF_MONTH", dayOfMonth);
    }

    protected final void onUpPressed()
    {
        Views.hideSoftKeyboard(this, getCurrentFocus());
        navigateUpWithIntent(TopUpApi.createTopUpActivityIntent(this));
    }




}
