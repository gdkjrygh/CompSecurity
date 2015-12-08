// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.settings.ui;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.callstatus.CallErrorDialogs;
import com.google.android.apps.wallet.cardlist.PaymentCardModelEvent;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.funding.api.FundingApi;
import com.google.android.apps.wallet.hce.setup.api.NfcSetupApi;
import com.google.android.apps.wallet.hce.setup.setupstate.NfcPaymentSetupEvent;
import com.google.android.apps.wallet.hce.setup.setupstate.NfcPaymentSetupState;
import com.google.android.apps.wallet.hce.setup.tos.TermsOfUseDialog;
import com.google.android.apps.wallet.location.api.LocationSettings;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.network.NetworkConnectivityEvent;
import com.google.android.apps.wallet.paymentcard.api.CredentialManager;
import com.google.android.apps.wallet.pin.api.PinApi;
import com.google.android.apps.wallet.plastic.api.PlasticCard;
import com.google.android.apps.wallet.plastic.api.PlasticCardModel;
import com.google.android.apps.wallet.plastic.api.PlasticCardModelEvent;
import com.google.android.apps.wallet.preferences.PreferenceSaveEvent;
import com.google.android.apps.wallet.settings.UserSettingsEvent;
import com.google.android.apps.wallet.settings.UserSettingsPublisher;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.ui.listener.OnActionListener;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.android.apps.wallet.util.accessibility.AccessibilityUtil;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import dagger.Lazy;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.apps.wallet.settings.ui:
//            TextAndButtonListRowDisplay, NotificationSettingsActivity

public class SettingsActivity extends WalletActivity
{

    private static final Map STATUS_CAPTION_ID;
    private static final String TAG = com/google/android/apps/wallet/settings/ui/SettingsActivity.getSimpleName();
    AccessibilityUtil accessibilityUtil;
    String accountName;
    AnalyticsUtil analyticsUtil;
    CredentialManager credentialManager;
    TextAndButtonListRowDisplay emailSettingDisplay;
    Lazy enableSystemPreferencesLocationDialog;
    EventBus eventBus;
    private final Set eventsNeededToRender = Sets.newHashSet(new Class[] {
        com/google/android/apps/wallet/settings/UserSettingsEvent, com/google/android/apps/wallet/cardlist/PaymentCardModelEvent
    });
    FeatureManager featureManager;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    LocationSettings locationSettings;
    private NetworkConnectivityEvent networkConnectivityEvent;
    TextAndButtonListRowDisplay notificationSettingDisplay;
    TextAndButtonListRowDisplay pinSettingsView;
    private PlasticCardModelEvent plasticCardModelEvent;
    private ViewGroup sectionContainer;
    private ArrayList settingsDisplayList;
    SharedPreferences sharedPreferences;
    TextAndButtonListRowDisplay tapAndPaySettingsDisplay;
    UriRegistry uriRegistry;
    UserEventLogger userEventLogger;
    UserSettingsPublisher userSettingsPublisher;
    TextAndButtonListRowDisplay walletCardDisplay;

    public SettingsActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    private void addDisplayRow(TextAndButtonListRowDisplay textandbuttonlistrowdisplay)
    {
        android.view.View view = textandbuttonlistrowdisplay.getView();
        if (view != null)
        {
            if (!settingsDisplayList.isEmpty())
            {
                ((TextAndButtonListRowDisplay)Iterables.getLast(settingsDisplayList)).setDividerVisible(true);
            }
            settingsDisplayList.add(textandbuttonlistrowdisplay);
            sectionContainer.addView(view);
        }
    }

    private void handleNfcPaymentSetupState(NfcPaymentSetupEvent nfcpaymentsetupevent)
    {
        static final class _cls11
        {

            static final int $SwitchMap$com$google$android$apps$wallet$hce$setup$setupstate$NfcPaymentSetupState[];

            static 
            {
                $SwitchMap$com$google$android$apps$wallet$hce$setup$setupstate$NfcPaymentSetupState = new int[NfcPaymentSetupState.values().length];
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$hce$setup$setupstate$NfcPaymentSetupState[NfcPaymentSetupState.NOT_STARTED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$hce$setup$setupstate$NfcPaymentSetupState[NfcPaymentSetupState.FAILED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$hce$setup$setupstate$NfcPaymentSetupState[NfcPaymentSetupState.COMPLETE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$hce$setup$setupstate$NfcPaymentSetupState[NfcPaymentSetupState.IN_FLIGHT.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls11..SwitchMap.com.google.android.apps.wallet.hce.setup.setupstate.NfcPaymentSetupState[nfcpaymentsetupevent.getState().ordinal()])
        {
        default:
            String s = TAG;
            nfcpaymentsetupevent = String.valueOf(nfcpaymentsetupevent.getState());
            WLog.e(s, (new StringBuilder(String.valueOf(nfcpaymentsetupevent).length() + 26)).append("Received unsupported state").append(nfcpaymentsetupevent).toString());
            return;

        case 1: // '\001'
            tapAndPaySettingsDisplay.setSubtitle(getString(com.google.android.apps.walletnfcrel.R.string.settings_tap_and_pay_description_not_started));
            tapAndPaySettingsDisplay.setRowActionListener(new OnActionListener() {

                final SettingsActivity this$0;

                private void onAction(Void void1)
                {
                    TermsOfUseDialog.createAndShow(SettingsActivity.this);
                }

                public final volatile void onAction(Object obj)
                {
                    onAction((Void)obj);
                }

            
            {
                this$0 = SettingsActivity.this;
                super();
            }
            });
            return;

        case 2: // '\002'
            tapAndPaySettingsDisplay.setSubtitle(getString(com.google.android.apps.walletnfcrel.R.string.settings_tap_and_pay_description_setup_failed));
            tapAndPaySettingsDisplay.setRowActionListener(new OnActionListener() {

                final SettingsActivity this$0;

                private void onAction(Void void1)
                {
                    startActivity(NfcSetupApi.createTapAndPaySetupIntent(SettingsActivity.this));
                }

                public final volatile void onAction(Object obj)
                {
                    onAction((Void)obj);
                }

            
            {
                this$0 = SettingsActivity.this;
                super();
            }
            });
            return;

        case 3: // '\003'
            tapAndPaySettingsDisplay.setSubtitle(getString(com.google.android.apps.walletnfcrel.R.string.settings_tap_and_pay_description_complete));
            break;
        }
        tapAndPaySettingsDisplay.setRowActionListener(new OnActionListener() {

            final SettingsActivity this$0;

            private void onAction(Void void1)
            {
                startActivity(FundingApi.createSelectNfcPaymentCardIntent(SettingsActivity.this));
            }

            public final volatile void onAction(Object obj)
            {
                onAction((Void)obj);
            }

            
            {
                this$0 = SettingsActivity.this;
                super();
            }
        });
    }

    private void initAllNotificationAndEmailSettings(com.google.wallet.proto.api.NanoWalletSettings.Settings settings)
    {
        setNotificationStatus(settings.enableNotifications.booleanValue());
        notificationSettingDisplay.setEnabled(true);
        emailSettingDisplay.setSwitch(settings.marketingEmail.booleanValue());
        emailSettingDisplay.setEnabled(true);
    }

    private void onEventNeededToRender(Object obj)
    {
        eventsNeededToRender.remove(obj.getClass());
        if (eventsNeededToRender.isEmpty())
        {
            fullScreenProgressSpinnerManager.hide();
        }
    }

    private void setNotificationStatus(boolean flag)
    {
        if (flag)
        {
            notificationSettingDisplay.setSubtitle(getResources().getString(com.google.android.apps.walletnfcrel.R.string.settings_view_notifications_on));
            return;
        } else
        {
            notificationSettingDisplay.setSubtitle(getResources().getString(com.google.android.apps.walletnfcrel.R.string.settings_view_notifications_off));
            return;
        }
    }

    private void setUpEmailSection()
    {
        emailSettingDisplay = new TextAndButtonListRowDisplay(getLayoutInflater());
        emailSettingDisplay.setTitle(getString(com.google.android.apps.walletnfcrel.R.string.settings_view_email_updates));
        emailSettingDisplay.setSubtitle(getString(com.google.android.apps.walletnfcrel.R.string.settings_view_email_updates_description));
        emailSettingDisplay.setRowActionListener(new OnActionListener() {

            final SettingsActivity this$0;

            private void onAction(Void void1)
            {
                android.view.View view;
                int i;
                boolean flag;
                if (!emailSettingDisplay.isSwitchOn())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                analyticsUtil.sendToggleValue(flag, "EmailUpdates", new AnalyticsCustomDimension[0]);
                emailSettingDisplay.setSwitch(flag);
                userSettingsPublisher.updateSetting(101, flag);
                void1 = accessibilityUtil;
                view = emailSettingDisplay.getView();
                if (flag)
                {
                    i = com.google.android.apps.walletnfcrel.R.string.settings_view_email_updates_enabled_description;
                } else
                {
                    i = com.google.android.apps.walletnfcrel.R.string.settings_view_email_updates_disabled_description;
                }
                void1.announce(view, i);
            }

            public final volatile void onAction(Object obj)
            {
                onAction((Void)obj);
            }

            
            {
                this$0 = SettingsActivity.this;
                super();
            }
        });
        addDisplayRow(emailSettingDisplay);
    }

    private void setUpNotificationSection()
    {
        notificationSettingDisplay = new TextAndButtonListRowDisplay(getLayoutInflater());
        notificationSettingDisplay.setTitle(getString(com.google.android.apps.walletnfcrel.R.string.settings_view_notifications));
        notificationSettingDisplay.setSubtitle(null);
        notificationSettingDisplay.setRowActionListener(new OnActionListener() {

            final SettingsActivity this$0;

            private void onAction(Void void1)
            {
                startActivity(InternalIntents.forClass(SettingsActivity.this, com/google/android/apps/wallet/settings/ui/NotificationSettingsActivity));
            }

            public final volatile void onAction(Object obj)
            {
                onAction((Void)obj);
            }

            
            {
                this$0 = SettingsActivity.this;
                super();
            }
        });
        addDisplayRow(notificationSettingDisplay);
    }

    private void setUpPinSection()
    {
        pinSettingsView = new TextAndButtonListRowDisplay(getLayoutInflater());
        pinSettingsView.setTitle(getString(com.google.android.apps.walletnfcrel.R.string.settings_view_wallet_pin));
        pinSettingsView.setRowActionListener(new OnActionListener() {

            final SettingsActivity this$0;

            private void onAction(Void void1)
            {
                startActivity(PinApi.createIntentForPinSettingsActivity(SettingsActivity.this));
            }

            public final volatile void onAction(Object obj)
            {
                onAction((Void)obj);
            }

            
            {
                this$0 = SettingsActivity.this;
                super();
            }
        });
        addDisplayRow(pinSettingsView);
    }

    private void setUpTapAndPaySection()
    {
        tapAndPaySettingsDisplay = new TextAndButtonListRowDisplay(getLayoutInflater());
        tapAndPaySettingsDisplay.setTitle(getString(com.google.android.apps.walletnfcrel.R.string.settings_tap_and_pay_title));
        addDisplayRow(tapAndPaySettingsDisplay);
    }

    private void setUpWalletCardSection()
    {
        walletCardDisplay = new TextAndButtonListRowDisplay(getLayoutInflater());
        walletCardDisplay.setTitle(getString(com.google.android.apps.walletnfcrel.R.string.settings_view_wallet_card_title));
        addDisplayRow(walletCardDisplay);
        updatePlasticCardSetting();
    }

    private void setupMonthyStatementSection()
    {
        TextAndButtonListRowDisplay textandbuttonlistrowdisplay = new TextAndButtonListRowDisplay(getLayoutInflater());
        textandbuttonlistrowdisplay.setTitle(getString(com.google.android.apps.walletnfcrel.R.string.settings_view_monthly_statement_title));
        textandbuttonlistrowdisplay.setSubtitle(getString(com.google.android.apps.walletnfcrel.R.string.settings_view_monthly_statement_body));
        addDisplayRow(textandbuttonlistrowdisplay);
        textandbuttonlistrowdisplay.setRowActionListener(new OnActionListener() {

            final SettingsActivity this$0;

            private void onAction(Void void1)
            {
                startActivity(uriRegistry.createIntent(5004, new Object[0]));
            }

            public final volatile void onAction(Object obj)
            {
                onAction((Void)obj);
            }

            
            {
                this$0 = SettingsActivity.this;
                super();
            }
        });
    }

    private void updatePlasticCardSetting()
    {
        if (walletCardDisplay == null || plasticCardModelEvent == null)
        {
            return;
        }
        if (plasticCardModelEvent.getModel() == null)
        {
            walletCardDisplay.setSubtitle(getString(com.google.android.apps.walletnfcrel.R.string.settings_view_wallet_card_status_unknown));
            walletCardDisplay.setRowActionListener(null);
            return;
        }
        if (!plasticCardModelEvent.getModel().hasCard() || plasticCardModelEvent.getModel().getCard().getStatus() == com.google.android.apps.wallet.plastic.api.PlasticCard.Status.NOT_REQUESTED)
        {
            walletCardDisplay.setSubtitle(getString(com.google.android.apps.walletnfcrel.R.string.settings_view_wallet_card_status_not_requested));
            walletCardDisplay.setRowActionListener(new OnActionListener() {

                final SettingsActivity this$0;

                private void onAction(Void void1)
                {
                    startActivity(uriRegistry.createIntent(6000, new Object[0]));
                }

                public final volatile void onAction(Object obj)
                {
                    onAction((Void)obj);
                }

            
            {
                this$0 = SettingsActivity.this;
                super();
            }
            });
            return;
        } else
        {
            walletCardDisplay.setSubtitle(getString(((Integer)STATUS_CAPTION_ID.get(plasticCardModelEvent.getModel().getCard().getStatus())).intValue()));
            walletCardDisplay.setRowActionListener(new OnActionListener() {

                final SettingsActivity this$0;

                private void onAction(Void void1)
                {
                    startActivity(uriRegistry.createIntent(6003, new Object[0]));
                }

                public final volatile void onAction(Object obj)
                {
                    onAction((Void)obj);
                }

            
            {
                this$0 = SettingsActivity.this;
                super();
            }
            });
            return;
        }
    }

    protected final void doOnCreate(Bundle bundle)
    {
        setContentView(com.google.android.apps.walletnfcrel.R.layout.settings_view);
        setTitle(com.google.android.apps.walletnfcrel.R.string.settings);
        sectionContainer = (ViewGroup)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.SettingsSectionContainer);
        settingsDisplayList = Lists.newArrayList();
        fullScreenProgressSpinnerManager.show();
        if (featureManager.isFeatureEnabled(Feature.WALLET_CARD))
        {
            setUpWalletCardSection();
        }
        if (featureManager.isFeatureEnabled(Feature.NFC_HCE_PPMS))
        {
            setUpTapAndPaySection();
        }
        setUpNotificationSection();
        setUpEmailSection();
        setUpPinSection();
        if (featureManager.isFeatureEnabled(Feature.STORED_VALUE_STATEMENTS))
        {
            setupMonthyStatementSection();
        }
    }

    public final void doOnResume()
    {
        eventBus.register(this);
        if (featureManager.isFeatureEnabled(Feature.NFC_HCE_PPMS))
        {
            eventBus.register(this, com/google/android/apps/wallet/hce/setup/setupstate/NfcPaymentSetupEvent, new EventHandler() {

                final SettingsActivity this$0;

                private void handleEvent(NfcPaymentSetupEvent nfcpaymentsetupevent)
                {
                    handleNfcPaymentSetupState(nfcpaymentsetupevent);
                }

                public final volatile void handleEvent(Object obj)
                {
                    handleEvent((NfcPaymentSetupEvent)obj);
                }

            
            {
                this$0 = SettingsActivity.this;
                super();
            }
            });
        }
        analyticsUtil.endTiming("OpenSettings", null);
    }

    public final boolean hasDrawerIndicator()
    {
        return false;
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public void onBackPressed()
    {
        startActivity(uriRegistry.createIntent(2, new Object[0]));
    }

    public void onNetworkConnectivityEvent(NetworkConnectivityEvent networkconnectivityevent)
    {
        networkConnectivityEvent = networkconnectivityevent;
    }

    public void onNewPaymentCardModel(PaymentCardModelEvent paymentcardmodelevent)
    {
        onEventNeededToRender(paymentcardmodelevent);
    }

    public void onNewPlasticCardModel(PlasticCardModelEvent plasticcardmodelevent)
    {
        plasticCardModelEvent = plasticcardmodelevent;
        updatePlasticCardSetting();
    }

    protected final void onPause()
    {
        eventBus.unregisterAll(this);
        super.onPause();
    }

    public void onPreferenceSaveEvent(PreferenceSaveEvent preferencesaveevent)
    {
        if (!preferencesaveevent.isSuccessful())
        {
            int j = com.google.android.apps.walletnfcrel.R.string.save_settings_failed;
            int i = j;
            if (networkConnectivityEvent != null)
            {
                i = j;
                if (!networkConnectivityEvent.isConnected())
                {
                    i = com.google.android.apps.walletnfcrel.R.string.save_settings_failed_no_connection;
                }
            }
            Toasts.show(this, i);
            WLog.d(TAG, "Could not save preferences", preferencesaveevent.getException());
        }
    }

    protected final void onUpPressed()
    {
        navigateUpWithIntent(uriRegistry.createIntent(2, new Object[0]));
    }

    public void onUserSettingsEvent(UserSettingsEvent usersettingsevent)
    {
        onEventNeededToRender(usersettingsevent);
        if (usersettingsevent.getSettings() != null)
        {
            initAllNotificationAndEmailSettings(usersettingsevent.getSettings());
        } else
        {
            if (usersettingsevent.getError() != null)
            {
                CallErrorDialogs.createBuilderWithGenericTitle(usersettingsevent.getError(), com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message).build().show(getSupportFragmentManager());
                return;
            }
            if (usersettingsevent.getThrowable() != null)
            {
                Toasts.show(this, com.google.android.apps.walletnfcrel.R.string.error_generic_problem_title);
                return;
            }
        }
    }

    static 
    {
        STATUS_CAPTION_ID = ImmutableMap.builder().put(com.google.android.apps.wallet.plastic.api.PlasticCard.Status.UNKNOWN, Integer.valueOf(com.google.android.apps.walletnfcrel.R.string.settings_view_wallet_card_status_unknown)).put(com.google.android.apps.wallet.plastic.api.PlasticCard.Status.NOT_REQUESTED, Integer.valueOf(com.google.android.apps.walletnfcrel.R.string.settings_view_wallet_card_status_not_requested)).put(com.google.android.apps.wallet.plastic.api.PlasticCard.Status.REQUESTED, Integer.valueOf(com.google.android.apps.walletnfcrel.R.string.settings_view_wallet_card_status_sending)).put(com.google.android.apps.wallet.plastic.api.PlasticCard.Status.ACTIVATED, Integer.valueOf(com.google.android.apps.walletnfcrel.R.string.settings_view_wallet_card_status_activated)).put(com.google.android.apps.wallet.plastic.api.PlasticCard.Status.LOCKED, Integer.valueOf(com.google.android.apps.walletnfcrel.R.string.settings_view_wallet_card_status_locked)).put(com.google.android.apps.wallet.plastic.api.PlasticCard.Status.CANCELED, Integer.valueOf(com.google.android.apps.walletnfcrel.R.string.settings_view_wallet_card_status_canceled)).put(com.google.android.apps.wallet.plastic.api.PlasticCard.Status.SUSPENDED, Integer.valueOf(com.google.android.apps.walletnfcrel.R.string.settings_view_wallet_card_status_suspended)).build();
    }

}
