// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.settings.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.callstatus.CallErrorDialogs;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.money.MoneyConverter;
import com.google.android.apps.wallet.settings.UserSettingsEvent;
import com.google.android.apps.wallet.settings.UserSettingsPublisher;
import com.google.android.apps.wallet.settings.api.SettingsApi;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.ui.listener.OnActionListener;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.money.MonetaryValueInput;
import com.google.android.apps.wallet.widgets.money.MoneyInputSection;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.protobuf.nano.MessageNano;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.settings.ui:
//            TextAndButtonListRowDisplay, NotificationSettingsActivity

public class LowBalanceSettingsActivity extends WalletActivity
{

    private static final String TAG = com/google/android/apps/wallet/settings/ui/LowBalanceSettingsActivity.getSimpleName();
    private TextView allNotificationsDisabledNotice;
    private MoneyInputSection amountField;
    private TextView amountLabel;
    AnalyticsUtil analyticsUtil;
    EventBus eventBus;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    TextAndButtonListRowDisplay lowBalanceToggleRow;
    Provider lowBalanceToggleRowProvider;
    UriRegistry uriRegistry;
    private com.google.wallet.proto.api.NanoWalletSettings.Settings userSettings;
    UserSettingsPublisher userSettingsPublisher;

    public LowBalanceSettingsActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    private void saveLowBalanceSettings()
    {
        boolean flag1 = true;
        com.google.wallet.proto.NanoWalletEntities.MoneyProto moneyproto = amountField.getInput().getMoneyValue();
        boolean flag;
        boolean flag2;
        if (!MessageNano.messageNanoEquals(userSettings.lowBalanceSettings.balanceThreshold.amount, moneyproto))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            analyticsUtil.sendChangeText("LowBalanceThreshold", new AnalyticsCustomDimension[0]);
        }
        flag2 = lowBalanceToggleRow.isSwitchOn();
        if (userSettings.lowBalanceSettings.enableNotifications.booleanValue() == flag2)
        {
            flag1 = false;
        }
        if (flag1)
        {
            analyticsUtil.sendToggleValue(flag2, "LowBalance", new AnalyticsCustomDimension[0]);
        }
        if (flag || flag1)
        {
            userSettingsPublisher.updateSetting(102, flag2, moneyproto);
        }
    }

    private void setAmountEnabled(boolean flag)
    {
        amountLabel.setEnabled(flag);
        amountField.setEnabled(flag);
        if (flag)
        {
            amountField.requestFocus();
            Views.showSoftKeyboard(this, amountField.getInput());
        }
    }

    protected final void doOnCreate(Bundle bundle)
    {
        setTitle(com.google.android.apps.walletnfcrel.R.string.low_balance_settings_title);
        setContentView(com.google.android.apps.walletnfcrel.R.layout.low_balance_settings);
        lowBalanceToggleRow = (TextAndButtonListRowDisplay)lowBalanceToggleRowProvider.get();
        lowBalanceToggleRow.setTitle(getString(com.google.android.apps.walletnfcrel.R.string.low_balance_toggle));
        lowBalanceToggleRow.setTitleStyleToDisableable();
        lowBalanceToggleRow.setRowActionListener(new OnActionListener() {

            final LowBalanceSettingsActivity this$0;

            private void onAction(Void void1)
            {
                boolean flag;
                if (!lowBalanceToggleRow.isSwitchOn())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                lowBalanceToggleRow.setSwitch(flag);
                setAmountEnabled(flag);
                saveLowBalanceSettings();
            }

            public final volatile void onAction(Object obj)
            {
                onAction((Void)obj);
            }

            
            {
                this$0 = LowBalanceSettingsActivity.this;
                super();
            }
        });
        bundle = new TypedValue();
        if (getTheme().resolveAttribute(0x10102eb, bundle, true))
        {
            int i = TypedValue.complexToDimensionPixelSize(((TypedValue) (bundle)).data, getResources().getDisplayMetrics());
            ((RelativeLayout)lowBalanceToggleRow.getView()).setMinimumHeight(i);
        }
        ((ViewGroup)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.LowBalanceToggleCard)).addView(lowBalanceToggleRow.getView());
        amountLabel = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.AmountLabel);
        amountField = (MoneyInputSection)findViewById(com.google.android.apps.walletnfcrel.R.id.Amount);
        amountField.getInput().setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final LowBalanceSettingsActivity this$0;

            public final boolean onEditorAction(TextView textview, int j, KeyEvent keyevent)
            {
                if (j == 6)
                {
                    saveLowBalanceSettings();
                }
                return false;
            }

            
            {
                this$0 = LowBalanceSettingsActivity.this;
                super();
            }
        });
        amountField.getInput().setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            final LowBalanceSettingsActivity this$0;

            public final void onFocusChange(View view, boolean flag)
            {
                if (!flag)
                {
                    saveLowBalanceSettings();
                }
            }

            
            {
                this$0 = LowBalanceSettingsActivity.this;
                super();
            }
        });
        allNotificationsDisabledNotice = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.AllNotificationsDisabledNotice);
        Views.setLink(allNotificationsDisabledNotice, getString(com.google.android.apps.walletnfcrel.R.string.wobs_notification_settings_subtext_device_all_notifications_disabled, new Object[] {
            SettingsApi.getNotificationSettingsUri()
        }));
        fullScreenProgressSpinnerManager.showImmediately();
    }

    public final void doOnResume()
    {
        eventBus.register(this);
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    protected void onPause()
    {
        eventBus.unregisterAll(this);
        super.onPause();
    }

    protected final void onUpPressed()
    {
        Intent intent;
        if (getIntent().getBooleanExtra("PARENTED_BY_SEETINGS", true))
        {
            intent = InternalIntents.forClass(this, com/google/android/apps/wallet/settings/ui/NotificationSettingsActivity);
        } else
        {
            intent = uriRegistry.createIntent(5003, new Object[0]);
        }
        navigateUpWithIntent(intent);
    }

    public void onUserSettingsEvent(UserSettingsEvent usersettingsevent)
    {
        byte byte0 = 0;
        if (usersettingsevent.getError() != null)
        {
            String s1 = TAG;
            String s = String.valueOf(usersettingsevent.getError().content);
            if (s.length() != 0)
            {
                s = "Received error from an event publisher: ".concat(s);
            } else
            {
                s = new String("Received error from an event publisher: ");
            }
            WLog.e(s1, s);
            CallErrorDialogs.createBuilderWithGenericTitle(usersettingsevent.getError(), com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message).setFinishActivityOnClick().build().show(getSupportFragmentManager());
            return;
        }
        if (usersettingsevent.getThrowable() != null)
        {
            WLog.e(TAG, "Received exception from an event publisher", usersettingsevent.getThrowable());
            CallErrorDialogs.createBuilderWithGenericTitle(usersettingsevent.getThrowable(), com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message).setFinishActivityOnClick().build().show(getSupportFragmentManager());
            return;
        }
        userSettings = usersettingsevent.getSettings();
        lowBalanceToggleRow.setEnabled(userSettings.enableNotifications.booleanValue());
        lowBalanceToggleRow.setSwitch(Boolean.TRUE.equals(userSettings.lowBalanceSettings.enableNotifications));
        boolean flag;
        if (userSettings.enableNotifications.booleanValue() && lowBalanceToggleRow.isSwitchOn())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setAmountEnabled(flag);
        if (userSettings.lowBalanceSettings.balanceThreshold != null)
        {
            usersettingsevent = MoneyConverter.toMoneyFieldString(userSettings.lowBalanceSettings.balanceThreshold.amount);
            if (!amountField.getInput().getText().toString().equals(usersettingsevent))
            {
                amountField.getInput().setText(usersettingsevent);
            }
        }
        usersettingsevent = allNotificationsDisabledNotice;
        if (userSettings.enableNotifications.booleanValue())
        {
            byte0 = 8;
        }
        usersettingsevent.setVisibility(byte0);
        fullScreenProgressSpinnerManager.hide();
    }



}
