// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.callstatus.CallErrorDialogs;
import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import com.google.android.apps.wallet.settings.UserSettingsEvent;
import com.google.android.apps.wallet.settings.api.SettingsApi;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.wobs.caching.WobsManager;
import com.google.android.apps.wallet.wobs.provider.WobUpdateEvent;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            ViewWoblActivity

public class PerWobNotificationSettingsActivity extends WalletActivity
{

    private static final String TAG = com/google/android/apps/wallet/wobs/PerWobNotificationSettingsActivity.getSimpleName();
    ActionExecutor actionExecutor;
    EventBus eventBus;
    NetworkAccessChecker networkAccessChecker;
    private final android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new android.widget.CompoundButton.OnCheckedChangeListener() {

        final PerWobNotificationSettingsActivity this$0;

        public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
        {
            setWobNotificationSettings(wobNotificationSettingsToggle.isChecked());
        }

            
            {
                this$0 = PerWobNotificationSettingsActivity.this;
                super();
            }
    };
    private com.google.wallet.proto.NanoWalletObjects.WobInstance wobInstance;
    private CompoundButton wobNotificationSettingsToggle;
    private TextView wobNotificationSubtextView;
    private TextView wobNotificationSwitchLabel;
    WobsManager wobsManager;

    public PerWobNotificationSettingsActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    private void configureLabelAndSwitch(boolean flag, boolean flag1)
    {
        int i;
        if (!flag)
        {
            i = com.google.android.apps.walletnfcrel.R.string.wobs_notification_settings_subtext_device_all_notifications_disabled;
            wobNotificationSettingsToggle.setEnabled(false);
            wobNotificationSwitchLabel.setEnabled(false);
            wobNotificationSwitchLabel.setTextAppearance(this, com.google.android.apps.walletnfcrel.R.style.Font_CardBodyNormal);
        } else
        if (!flag1)
        {
            i = com.google.android.apps.walletnfcrel.R.string.wobs_notification_settings_subtext_device_wob_notifications_disabled;
            wobNotificationSettingsToggle.setEnabled(false);
            wobNotificationSwitchLabel.setEnabled(false);
            wobNotificationSwitchLabel.setTextAppearance(this, com.google.android.apps.walletnfcrel.R.style.Font_CardBodyNormal);
        } else
        {
            i = com.google.android.apps.walletnfcrel.R.string.wobs_notification_settings_subtext_device_notifications_enabled;
            wobNotificationSettingsToggle.setEnabled(true);
            wobNotificationSwitchLabel.setEnabled(true);
            wobNotificationSwitchLabel.setTextAppearance(this, com.google.android.apps.walletnfcrel.R.style.Font_CardListSmallStrong);
        }
        Views.setLink(wobNotificationSubtextView, getString(i, new Object[] {
            SettingsApi.getNotificationSettingsUri()
        }));
    }

    public static Intent createIntent(Context context, com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance)
    {
        context = InternalIntents.forClass(context, com/google/android/apps/wallet/wobs/PerWobNotificationSettingsActivity);
        context.putExtra("EXTRA_WOB_INSTANCE", MessageNano.toByteArray(wobinstance));
        return context;
    }

    private void onWobInstance(com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance)
    {
        wobInstance = wobinstance;
        wobNotificationSettingsToggle.setOnCheckedChangeListener(null);
        wobinstance = wobNotificationSettingsToggle;
        boolean flag;
        if (wobInstance.notificationSettings != null && Protos.valueWithDefaultTrue(wobInstance.notificationSettings.geofencedNotificationsEnabled))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        wobinstance.setChecked(flag);
        wobNotificationSettingsToggle.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    private void setWobNotificationSettings(final boolean enableNotifications)
    {
        if (!networkAccessChecker.check())
        {
            return;
        } else
        {
            actionExecutor.executeAction(new Callable() {

                final PerWobNotificationSettingsActivity this$0;
                final boolean val$enableNotifications;

                private Void call()
                    throws CallErrorException
                {
                    wobsManager.updateInstanceNotificationSettings(wobInstance, enableNotifications);
                    return null;
                }

                public final volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = PerWobNotificationSettingsActivity.this;
                enableNotifications = flag;
                super();
            }
            }, new AsyncCallback() {

                final PerWobNotificationSettingsActivity this$0;

                private void onSuccess(Void void1)
                {
                    Toasts.show(PerWobNotificationSettingsActivity.this, com.google.android.apps.walletnfcrel.R.string.wobs_notification_settings_update_succeeded);
                }

                public final void onFailure(Exception exception)
                {
                    Toasts.show(PerWobNotificationSettingsActivity.this, com.google.android.apps.walletnfcrel.R.string.wobs_notification_settings_update_failed);
                    onWobInstance(wobInstance);
                }

                public final volatile void onSuccess(Object obj)
                {
                    onSuccess((Void)obj);
                }

            
            {
                this$0 = PerWobNotificationSettingsActivity.this;
                super();
            }
            });
            return;
        }
    }

    private void showErrorDialog()
    {
        AlertDialogFragment.newBuilder().setCancelable(true).setTitle(com.google.android.apps.walletnfcrel.R.string.wobs_rendering_error_title).setMessage(com.google.android.apps.walletnfcrel.R.string.wobs_rendering_error_details).setFinishActivityOnClick().setFinishActivityOnDismiss().build().show(getSupportFragmentManager());
    }

    protected final void doOnCreate(Bundle bundle)
    {
        setTitle(com.google.android.apps.walletnfcrel.R.string.wobs_notification_settings_title);
        setContentView(com.google.android.apps.walletnfcrel.R.layout.per_wob_notification_settings_activity);
        wobNotificationSettingsToggle = (CompoundButton)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.WobNotificationSettingsToggle);
        wobNotificationSwitchLabel = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.WobNotificationSwitchLabel);
        wobNotificationSubtextView = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.WobNotificationSubtext);
        wobNotificationSettingsToggle.setOnCheckedChangeListener(onCheckedChangeListener);
        bundle = getIntent();
        try
        {
            onWobInstance((com.google.wallet.proto.NanoWalletObjects.WobInstance)MessageNano.mergeFrom(new com.google.wallet.proto.NanoWalletObjects.WobInstance(), bundle.getByteArrayExtra("EXTRA_WOB_INSTANCE")));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            WLog.e(TAG, "Could not parse wobInstance. finishing()", bundle);
        }
        finish();
    }

    public void finish()
    {
        super.finish();
        overridePendingTransition(0x10a0000, 0x10a0001);
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    protected void onStart()
    {
        super.onStart();
        eventBus.register(this);
        eventBus.register(this, com/google/android/apps/wallet/wobs/provider/WobUpdateEvent, wobInstance.id, new EventHandler() {

            final PerWobNotificationSettingsActivity this$0;

            private void handleEvent(WobUpdateEvent wobupdateevent)
            {
                if (wobupdateevent.hasError())
                {
                    showErrorDialog();
                    return;
                } else
                {
                    onWobInstance(wobupdateevent.getWobInstance());
                    return;
                }
            }

            public final volatile void handleEvent(Object obj)
            {
                handleEvent((WobUpdateEvent)obj);
            }

            
            {
                this$0 = PerWobNotificationSettingsActivity.this;
                super();
            }
        });
    }

    protected void onStop()
    {
        super.onStop();
        eventBus.unregisterAll(this);
    }

    protected final void onUpPressed()
    {
        navigateUpWithIntent(ViewWoblActivity.createExpandedViewIntent(this, wobInstance));
    }

    public void onUserSettingsEvent(UserSettingsEvent usersettingsevent)
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
        usersettingsevent = usersettingsevent.getSettings();
        boolean flag = true;
        boolean flag1 = ((com.google.wallet.proto.api.NanoWalletSettings.Settings) (usersettingsevent)).enableNotifications.booleanValue();
        usersettingsevent = ((com.google.wallet.proto.api.NanoWalletSettings.Settings) (usersettingsevent)).wobNotificationSetting;
        int j = usersettingsevent.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = usersettingsevent[i];
            if (Protos.valueWithDefaultFalse(((com.google.wallet.proto.api.NanoWalletSettings.DynamicSetting) (obj)).requiresLocationConsent))
            {
                flag = ((com.google.wallet.proto.api.NanoWalletSettings.DynamicSetting) (obj)).value.booleanValue();
            }
        }

        configureLabelAndSwitch(flag1, flag);
    }






}
