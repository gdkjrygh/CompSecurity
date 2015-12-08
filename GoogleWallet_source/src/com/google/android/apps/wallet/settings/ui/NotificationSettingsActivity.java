// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.settings.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.callstatus.CallErrorDialogs;
import com.google.android.apps.wallet.config.appcontrol.AppControl;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.location.api.LocationSettings;
import com.google.android.apps.wallet.location.ui.EnableSystemPreferencesLocationDialog;
import com.google.android.apps.wallet.network.NetworkConnectivityEvent;
import com.google.android.apps.wallet.preferences.PreferenceSaveEvent;
import com.google.android.apps.wallet.settings.UserSettingsEvent;
import com.google.android.apps.wallet.settings.UserSettingsPublisher;
import com.google.android.apps.wallet.settings.api.SettingsApi;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.ui.listener.OnActionListener;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.util.accessibility.AccessibilityUtil;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.settings.ui:
//            TextAndButtonListRowDisplay, NotificationSoundPicker, GeofencingSettingsChecker, GeofencingSettingsReminderDialogFragment, 
//            SettingsActivity

public class NotificationSettingsActivity extends WalletActivity
{
    static interface ToggleCallback
    {

        public abstract void onToggle(boolean flag);
    }


    static final int LOW_BALANCE_SETTING_ID;
    static final int RINGTONE_SETTING_ID;
    static final int VIBRATE_SETTING_ID;
    AccessibilityUtil accessibilityUtil;
    TextAndButtonListRowDisplay allNotificationsToggle;
    AnalyticsUtil analyticsUtil;
    AppControl appControl;
    private LinearLayout container;
    final Map dynamicSettingViews = Maps.newHashMap();
    EnableSystemPreferencesLocationDialog enableSystemPreferencesLocationDialog;
    Provider entryViewProvider;
    EventBus eventBus;
    FeatureManager featureManager;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    GeofencingSettingsChecker geofencingSettingsChecker;
    Provider geofencingSettingsReminderDialogFragmentProvider;
    LocationSettings locationSettings;
    TextAndButtonListRowDisplay lowBalanceSettingsEntryView;
    private NetworkConnectivityEvent networkConnectivityEvent;
    private NotificationSoundPicker notificationSoundPicker;
    private TextAndButtonListRowDisplay ringtoneSettingsEntryView;
    SharedPreferences sharedPreferences;
    UriRegistry uriRegistry;
    private com.google.wallet.proto.api.NanoWalletSettings.Settings userSettings;
    UserSettingsPublisher userSettingsPublisher;
    private TextAndButtonListRowDisplay vibrateSettingsEntryDisplay;
    private AlertDialogFragment vibrationConditionDialog;

    public NotificationSettingsActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    private TextAndButtonListRowDisplay addSettingsEntryView(int i, int j)
    {
        TextAndButtonListRowDisplay textandbuttonlistrowdisplay = createSettingsEntryView(i, j);
        container.addView(textandbuttonlistrowdisplay.getView());
        return textandbuttonlistrowdisplay;
    }

    private TextAndButtonListRowDisplay addSettingsEntryView(String s)
    {
        s = createSettingsEntryView(s);
        container.addView(s.getView());
        return s;
    }

    private TextAndButtonListRowDisplay createSettingsEntryView(int i, int j)
    {
        TextAndButtonListRowDisplay textandbuttonlistrowdisplay = createSettingsEntryView(getString(i));
        textandbuttonlistrowdisplay.setRootViewId(j);
        return textandbuttonlistrowdisplay;
    }

    private TextAndButtonListRowDisplay createSettingsEntryView(String s)
    {
        TextAndButtonListRowDisplay textandbuttonlistrowdisplay = (TextAndButtonListRowDisplay)entryViewProvider.get();
        textandbuttonlistrowdisplay.setTitle(s);
        return textandbuttonlistrowdisplay;
    }

    private String getRingtoneLocation()
    {
        return Protos.valueWithDefault(userSettings.ringtoneLocation, "content://settings/wallet/notification_sound");
    }

    private String getToggleStateAsString(boolean flag)
    {
        if (flag)
        {
            return getString(com.google.android.apps.walletnfcrel.R.string.enabled);
        } else
        {
            return getString(com.google.android.apps.walletnfcrel.R.string.disabled);
        }
    }

    private int getVibrationCondition()
    {
        return Protos.valueWithDefault(userSettings.vibrationCondition, 1);
    }

    private void handleVibrationConditionSelected(int i)
    {
        i++;
        updateVibrateSettingsEntryView(i);
        userSettingsPublisher.updateSetting(103, i);
        vibrationConditionDialog.dismiss();
    }

    private void initRingSettings()
    {
        updateVibrateSettingsEntryView(getVibrationCondition());
        updateRingtoneSettingsEntryView(getRingtoneLocation());
    }

    private boolean isLocationSettingEnabled()
    {
        return locationSettings.isSystemPreferencesLocationEnabled();
    }

    private boolean isNewSettingIdsSameAsDisplayedSettingIds()
    {
        boolean flag = false;
        java.util.HashSet hashset = Sets.newHashSet();
        com.google.wallet.proto.api.NanoWalletSettings.DynamicSetting adynamicsetting[] = userSettings.transactionNotificationSetting;
        int k = adynamicsetting.length;
        for (int i = 0; i < k; i++)
        {
            hashset.add(adynamicsetting[i].id);
        }

        adynamicsetting = userSettings.wobNotificationSetting;
        k = adynamicsetting.length;
        for (int j = ((flag) ? 1 : 0); j < k; j++)
        {
            hashset.add(adynamicsetting[j].id);
        }

        return hashset.equals(dynamicSettingViews.keySet());
    }

    private void launchRingtonePicker()
    {
        if (notificationSoundPicker == null)
        {
            notificationSoundPicker = new NotificationSoundPicker(this);
            notificationSoundPicker.initialize();
            notificationSoundPicker.setOnSelectionCompleteListener(new android.view.View.OnClickListener() {

                final NotificationSettingsActivity this$0;

                public final void onClick(View view)
                {
                    userSettingsPublisher.updateSetting(104, notificationSoundPicker.getRingtoneLocation());
                    ringtoneSettingsEntryView.setTitle(getString(com.google.android.apps.walletnfcrel.R.string.notification_title));
                    ringtoneSettingsEntryView.setSubtitle(notificationSoundPicker.getRingtoneTitle());
                }

            
            {
                this$0 = NotificationSettingsActivity.this;
                super();
            }
            });
        }
        notificationSoundPicker.setRingtoneLocation(getRingtoneLocation());
        notificationSoundPicker.showPicker();
    }

    private void launchVibrationConditionPicker()
    {
        String as[] = getResources().getStringArray(com.google.android.apps.walletnfcrel.R.array.notification_settings_vibrate_condition_array);
        int i = getVibrationCondition();
        vibrationConditionDialog = AlertDialogFragment.newBuilder().setTitle(com.google.android.apps.walletnfcrel.R.string.notification_settings_vibrate).setSingleChoiceItems(as, i - 1).build();
        vibrationConditionDialog.show(getSupportFragmentManager(), "vibrate");
    }

    private void renderDynamicSettings(com.google.wallet.proto.api.NanoWalletSettings.DynamicSetting adynamicsetting[])
    {
        int j = adynamicsetting.length;
        for (int i = 0; i < j; i++)
        {
            final com.google.wallet.proto.api.NanoWalletSettings.DynamicSetting setting = adynamicsetting[i];
            final TextAndButtonListRowDisplay viewHolder = addSettingsEntryView(setting.title);
            viewHolder.setSubtitle(setting.description);
            viewHolder.setEnabled(userSettings.enableNotifications.booleanValue());
            viewHolder.setSwitch(setting.value.booleanValue());
            setOnToggleCallback(viewHolder, new ToggleCallback() {

                final NotificationSettingsActivity this$0;
                final com.google.wallet.proto.api.NanoWalletSettings.DynamicSetting val$setting;
                final TextAndButtonListRowDisplay val$viewHolder;

                public final void onToggle(boolean flag)
                {
                    viewHolder.setSwitch(flag);
                    userSettingsPublisher.updateSetting(setting.id.intValue(), flag);
                    accessibilityUtil.announce(viewHolder.getView(), (new StringBuilder()).append(setting.title).append(" ").append(getToggleStateAsString(flag)).toString());
                    if (setting.analyticsLabel != null)
                    {
                        analyticsUtil.sendToggleValue(flag, setting.analyticsLabel, new AnalyticsCustomDimension[0]);
                    }
                }

            
            {
                this$0 = NotificationSettingsActivity.this;
                viewHolder = textandbuttonlistrowdisplay;
                setting = dynamicsetting;
                super();
            }
            });
            dynamicSettingViews.put(setting.id, viewHolder);
            if (Protos.valueWithDefaultFalse(setting.requiresLocationConsent))
            {
                setUpGeoFencingDynamicSetting(setting.id.intValue(), setting.analyticsLabel);
            }
        }

    }

    private void renderLowBalanceSetting()
    {
        lowBalanceSettingsEntryView = addSettingsEntryView(com.google.android.apps.walletnfcrel.R.string.low_balance_settings_entry, LOW_BALANCE_SETTING_ID);
        lowBalanceSettingsEntryView.setDividerVisible(false);
        lowBalanceSettingsEntryView.setRowActionListener(new OnActionListener() {

            final NotificationSettingsActivity this$0;

            private void onAction(Void void1)
            {
                startActivity(SettingsApi.createLowBalanceSettingsActivityIntentForSettings(NotificationSettingsActivity.this));
            }

            public final volatile void onAction(Object obj)
            {
                onAction((Void)obj);
            }

            
            {
                this$0 = NotificationSettingsActivity.this;
                super();
            }
        });
        updateLowBalanceSetting();
    }

    private void renderTransactionNotificationSettings()
    {
        TextView textview = (TextView)getLayoutInflater().inflate(com.google.android.apps.walletnfcrel.R.layout.subheader, null);
        textview.setText(getString(com.google.android.apps.walletnfcrel.R.string.notification_settings_transactions));
        container.addView(textview);
        renderDynamicSettings(userSettings.transactionNotificationSetting);
        if (featureManager.isFeatureEnabled(Feature.LOW_BALANCE_ALERT))
        {
            renderLowBalanceSetting();
        }
    }

    private void renderWalletItemsNotificationSettings()
    {
        TextView textview = (TextView)getLayoutInflater().inflate(com.google.android.apps.walletnfcrel.R.layout.subheader, null);
        textview.setText(getString(com.google.android.apps.walletnfcrel.R.string.notification_settings_saved_items));
        container.addView(textview);
        renderDynamicSettings(userSettings.wobNotificationSetting);
    }

    private void setEnableDynamicNotifications(boolean flag)
    {
        allNotificationsToggle.setSwitch(flag);
        int i;
        for (Iterator iterator = dynamicSettingViews.keySet().iterator(); iterator.hasNext(); ((TextAndButtonListRowDisplay)dynamicSettingViews.get(Integer.valueOf(i))).setEnabled(flag))
        {
            i = ((Integer)iterator.next()).intValue();
        }

    }

    private void setOnToggleCallback(final TextAndButtonListRowDisplay display, final ToggleCallback callback)
    {
        display.setRowActionListener(new OnActionListener() {

            final NotificationSettingsActivity this$0;
            final ToggleCallback val$callback;
            final TextAndButtonListRowDisplay val$display;

            private void onAction(Void void1)
            {
                void1 = callback;
                boolean flag;
                if (!display.isSwitchOn())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                void1.onToggle(flag);
            }

            public final volatile void onAction(Object obj)
            {
                onAction((Void)obj);
            }

            
            {
                this$0 = NotificationSettingsActivity.this;
                callback = togglecallback;
                display = textandbuttonlistrowdisplay;
                super();
            }
        });
    }

    private void setUpGeoFencingDynamicSetting(final int settingId, final String label)
    {
        setOnToggleCallback((TextAndButtonListRowDisplay)dynamicSettingViews.get(Integer.valueOf(settingId)), new ToggleCallback() {

            final NotificationSettingsActivity this$0;
            final String val$label;
            final int val$settingId;

            public final void onToggle(boolean flag)
            {
                if (flag && !isLocationSettingEnabled())
                {
                    enableSystemPreferencesLocationDialog.show(getSupportFragmentManager());
                } else
                {
                    TextAndButtonListRowDisplay textandbuttonlistrowdisplay = (TextAndButtonListRowDisplay)dynamicSettingViews.get(Integer.valueOf(settingId));
                    textandbuttonlistrowdisplay.setSwitch(flag);
                    if (label != null)
                    {
                        analyticsUtil.sendToggleValue(flag, label, new AnalyticsCustomDimension[0]);
                    }
                    userSettingsPublisher.updateSetting(settingId, flag);
                    accessibilityUtil.announce(textandbuttonlistrowdisplay.getView(), (new StringBuilder()).append(textandbuttonlistrowdisplay.getTitle()).append(" ").append(getToggleStateAsString(flag)).toString());
                    if (flag)
                    {
                        SharedPreference.GEOFENCING_SETTINGS_REMINDER_DIALOG_DISMISSED.put(sharedPreferences, Boolean.valueOf(false));
                        if (geofencingSettingsChecker.shouldShowGeofencingSettingsReminderDialog())
                        {
                            ((GeofencingSettingsReminderDialogFragment)geofencingSettingsReminderDialogFragmentProvider.get()).show(getSupportFragmentManager());
                            return;
                        }
                    }
                }
            }

            
            {
                this$0 = NotificationSettingsActivity.this;
                settingId = i;
                label = s;
                super();
            }
        });
    }

    private void setupAllNotificationsToggleView()
    {
        allNotificationsToggle = createSettingsEntryView(com.google.android.apps.walletnfcrel.R.string.notification_settings_all_notifications, com.google.android.apps.walletnfcrel.R.id.AllNotificationsSettingListRow);
        Object obj = new TypedValue();
        if (getTheme().resolveAttribute(0x10102eb, ((TypedValue) (obj)), true))
        {
            int i = TypedValue.complexToDimensionPixelSize(((TypedValue) (obj)).data, getResources().getDisplayMetrics());
            ((RelativeLayout)allNotificationsToggle.getView()).setMinimumHeight(i);
        }
        obj = (FrameLayout)getLayoutInflater().inflate(com.google.android.apps.walletnfcrel.R.layout.generic_card, null);
        ((FrameLayout) (obj)).addView(allNotificationsToggle.getView());
        container.addView(((View) (obj)));
        setOnToggleCallback(allNotificationsToggle, new ToggleCallback() {

            final NotificationSettingsActivity this$0;

            public final void onToggle(boolean flag)
            {
                setEnableDynamicNotifications(flag);
                userSettingsPublisher.updateSetting(100, flag);
            }

            
            {
                this$0 = NotificationSettingsActivity.this;
                super();
            }
        });
    }

    private void setupRingtoneAndVibrationSettingsViews()
    {
        TextView textview = (TextView)getLayoutInflater().inflate(com.google.android.apps.walletnfcrel.R.layout.subheader, null);
        textview.setText(getString(com.google.android.apps.walletnfcrel.R.string.notification_settings_ringtone));
        container.addView(textview);
        ringtoneSettingsEntryView = addSettingsEntryView(com.google.android.apps.walletnfcrel.R.string.notification_title, RINGTONE_SETTING_ID);
        ringtoneSettingsEntryView.setDividerVisible(true);
        ringtoneSettingsEntryView.setRowActionListener(new OnActionListener() {

            final NotificationSettingsActivity this$0;

            private void onAction(Void void1)
            {
                launchRingtonePicker();
            }

            public final volatile void onAction(Object obj)
            {
                onAction((Void)obj);
            }

            
            {
                this$0 = NotificationSettingsActivity.this;
                super();
            }
        });
        vibrateSettingsEntryDisplay = addSettingsEntryView(com.google.android.apps.walletnfcrel.R.string.notification_settings_vibrate, VIBRATE_SETTING_ID);
        vibrateSettingsEntryDisplay.setRowActionListener(new OnActionListener() {

            final NotificationSettingsActivity this$0;

            private void onAction(Void void1)
            {
                launchVibrationConditionPicker();
            }

            public final volatile void onAction(Object obj)
            {
                onAction((Void)obj);
            }

            
            {
                this$0 = NotificationSettingsActivity.this;
                super();
            }
        });
        vibrateSettingsEntryDisplay.setDividerVisible(false);
    }

    private void showGeofenceReminderIfNecessary()
    {
        com.google.wallet.proto.api.NanoWalletSettings.DynamicSetting dynamicsetting = null;
        com.google.wallet.proto.api.NanoWalletSettings.DynamicSetting adynamicsetting[] = userSettings.wobNotificationSetting;
        int j = adynamicsetting.length;
        for (int i = 0; i < j; i++)
        {
            com.google.wallet.proto.api.NanoWalletSettings.DynamicSetting dynamicsetting1 = adynamicsetting[i];
            if (Protos.valueWithDefaultFalse(dynamicsetting1.requiresLocationConsent))
            {
                dynamicsetting = dynamicsetting1;
            }
        }

        while (dynamicsetting == null || !isLocationSettingEnabled() || !userSettings.enableNotifications.booleanValue() || !dynamicsetting.value.booleanValue() || !geofencingSettingsChecker.shouldShowGeofencingSettingsReminderDialog()) 
        {
            return;
        }
        ((GeofencingSettingsReminderDialogFragment)geofencingSettingsReminderDialogFragmentProvider.get()).show(getSupportFragmentManager());
    }

    private void updateLowBalanceSetting()
    {
        String s;
        TextAndButtonListRowDisplay textandbuttonlistrowdisplay;
        boolean flag;
        if (userSettings.enableNotifications.booleanValue() && userSettings.lowBalanceSettings.enableNotifications.booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        textandbuttonlistrowdisplay = lowBalanceSettingsEntryView;
        if (flag)
        {
            s = getString(com.google.android.apps.walletnfcrel.R.string.low_balance_settings_entry_amount, new Object[] {
                userSettings.lowBalanceSettings.balanceThreshold.displayAmount
            });
        } else
        {
            s = getString(com.google.android.apps.walletnfcrel.R.string.low_balance_settings_entry_off);
        }
        textandbuttonlistrowdisplay.setSubtitle(s);
    }

    private void updateRingtoneSettingsEntryView(String s)
    {
        ringtoneSettingsEntryView.setSubtitle(NotificationSoundPicker.getRingtoneTitle(this, s));
    }

    private void updateVibrateSettingsEntryView(int i)
    {
        String as[] = getResources().getStringArray(com.google.android.apps.walletnfcrel.R.array.notification_settings_vibrate_condition_array);
        vibrateSettingsEntryDisplay.setSubtitle(as[i - 1]);
    }

    protected final void doOnCreate(Bundle bundle)
    {
        setTitle(com.google.android.apps.walletnfcrel.R.string.notification_settings_title);
        setContentView(com.google.android.apps.walletnfcrel.R.layout.settings_view);
        container = (LinearLayout)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.SettingsSectionContainer);
        setupAllNotificationsToggleView();
        setupRingtoneAndVibrationSettingsViews();
        fullScreenProgressSpinnerManager.show();
    }

    public final void doOnResume()
    {
        eventBus.register(this);
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public final void onAttachFragment(Fragment fragment)
    {
        super.onAttachFragment(fragment);
        if ("vibrate".equals(fragment.getTag()))
        {
            ((AlertDialogFragment)fragment).setOnClickListener(new android.content.DialogInterface.OnClickListener() {

                final NotificationSettingsActivity this$0;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    if (i >= 0)
                    {
                        handleVibrationConditionSelected(i);
                    }
                }

            
            {
                this$0 = NotificationSettingsActivity.this;
                super();
            }
            });
        } else
        if ("geofencing_settings".equals(fragment.getTag()))
        {
            ((AlertDialogFragment)fragment).setOnClickListener(new android.content.DialogInterface.OnClickListener() {

                final NotificationSettingsActivity this$0;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    if (i == -1)
                    {
                        startActivity(uriRegistry.createIntent(10000, new Object[0]));
                    }
                }

            
            {
                this$0 = NotificationSettingsActivity.this;
                super();
            }
            });
            return;
        }
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        setResult(-1);
    }

    public void onNetworkConnectivityEvent(NetworkConnectivityEvent networkconnectivityevent)
    {
        networkConnectivityEvent = networkconnectivityevent;
    }

    protected void onPause()
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
        }
    }

    protected final void onUpPressed()
    {
        navigateUpWithIntent(InternalIntents.forClass(this, com/google/android/apps/wallet/settings/ui/SettingsActivity));
    }

    public void onUserSettingsEvent(UserSettingsEvent usersettingsevent)
    {
        boolean flag = false;
        if (usersettingsevent.getError() != null)
        {
            CallErrorDialogs.createBuilderWithGenericTitle(usersettingsevent.getError(), com.google.android.apps.walletnfcrel.R.string.notification_settings_loading_error_please_try_again).build().show(getSupportFragmentManager());
            return;
        }
        if (usersettingsevent.getThrowable() != null)
        {
            Toasts.show(this, com.google.android.apps.walletnfcrel.R.string.notification_settings_loading_error_please_try_again);
            return;
        }
        userSettings = usersettingsevent.getSettings();
        if (isNewSettingIdsSameAsDisplayedSettingIds())
        {
            usersettingsevent = userSettings.transactionNotificationSetting;
            int k = usersettingsevent.length;
            for (int i = 0; i < k; i++)
            {
                Object obj = usersettingsevent[i];
                ((TextAndButtonListRowDisplay)dynamicSettingViews.get(((com.google.wallet.proto.api.NanoWalletSettings.DynamicSetting) (obj)).id)).setSwitch(((com.google.wallet.proto.api.NanoWalletSettings.DynamicSetting) (obj)).value.booleanValue());
            }

            if (featureManager.isFeatureEnabled(Feature.LOW_BALANCE_ALERT))
            {
                updateLowBalanceSetting();
            }
            usersettingsevent = userSettings.wobNotificationSetting;
            k = usersettingsevent.length;
            for (int j = ((flag) ? 1 : 0); j < k; j++)
            {
                Object obj1 = usersettingsevent[j];
                ((TextAndButtonListRowDisplay)dynamicSettingViews.get(((com.google.wallet.proto.api.NanoWalletSettings.DynamicSetting) (obj1)).id)).setSwitch(((com.google.wallet.proto.api.NanoWalletSettings.DynamicSetting) (obj1)).value.booleanValue());
            }

        } else
        {
            container.removeAllViews();
            setupAllNotificationsToggleView();
            setupRingtoneAndVibrationSettingsViews();
            renderTransactionNotificationSettings();
            renderWalletItemsNotificationSettings();
        }
        setEnableDynamicNotifications(userSettings.enableNotifications.booleanValue());
        showGeofenceReminderIfNecessary();
        initRingSettings();
        fullScreenProgressSpinnerManager.hide();
    }

    static 
    {
        RINGTONE_SETTING_ID = com.google.android.apps.walletnfcrel.R.id.RingtoneSettingListRow;
        VIBRATE_SETTING_ID = com.google.android.apps.walletnfcrel.R.id.VibrateSettingListRow;
        LOW_BALANCE_SETTING_ID = com.google.android.apps.walletnfcrel.R.id.LowBalanceSettingListRow;
    }








}
