// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.settings.ui;

import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.location.ui.EnableSystemPreferencesLocationDialog;
import com.google.android.apps.wallet.settings.UserSettingsPublisher;
import com.google.android.apps.wallet.util.accessibility.AccessibilityUtil;
import java.util.Map;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.settings.ui:
//            NotificationSettingsActivity, TextAndButtonListRowDisplay, GeofencingSettingsChecker, GeofencingSettingsReminderDialogFragment

final class val.label
    implements ggleCallback
{

    final NotificationSettingsActivity this$0;
    final String val$label;
    final int val$settingId;

    public final void onToggle(boolean flag)
    {
        if (flag && !NotificationSettingsActivity.access$700(NotificationSettingsActivity.this))
        {
            enableSystemPreferencesLocationDialog.show(getSupportFragmentManager());
        } else
        {
            TextAndButtonListRowDisplay textandbuttonlistrowdisplay = (TextAndButtonListRowDisplay)dynamicSettingViews.get(Integer.valueOf(val$settingId));
            textandbuttonlistrowdisplay.setSwitch(flag);
            if (val$label != null)
            {
                analyticsUtil.sendToggleValue(flag, val$label, new AnalyticsCustomDimension[0]);
            }
            userSettingsPublisher.updateSetting(val$settingId, flag);
            accessibilityUtil.announce(textandbuttonlistrowdisplay.getView(), (new StringBuilder()).append(textandbuttonlistrowdisplay.getTitle()).append(" ").append(NotificationSettingsActivity.access$600(NotificationSettingsActivity.this, flag)).toString());
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

    gFragment()
    {
        this$0 = final_notificationsettingsactivity;
        val$settingId = i;
        val$label = String.this;
        super();
    }
}
