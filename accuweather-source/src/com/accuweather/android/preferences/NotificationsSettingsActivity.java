// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.preferences;

import android.app.NotificationManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import android.widget.Toast;
import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.notifications.NotificationService;
import com.accuweather.android.notifications.NotificationServiceBootstrapper;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.PartnerCoding;
import com.accuweather.android.utilities.PushUtils;
import com.accuweather.android.utilities.Utilities;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.MenuItem;
import com.urbanairship.UAirship;
import com.urbanairship.push.PushManager;

// Referenced classes of package com.accuweather.android.preferences:
//            AbstractPreferenceActivity

public class NotificationsSettingsActivity extends AbstractPreferenceActivity
    implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
{

    private static final String OFF = "1";
    private static final String ON = "0";
    private SharedPreferences sharedPreferences;

    public NotificationsSettingsActivity()
    {
    }

    private void enablePushNotifications()
    {
        LocationModel locationmodel = Data.getInstance(this).getHomeLocation();
        String s = locationmodel.getAliasedName();
        String s1 = locationmodel.getLocKey();
        UAirship.shared().getPushManager().setPushEnabled(true);
        UAirship.shared().getPushManager().setUserNotificationsEnabled(true);
        PushUtils.updatePush(this, s1, s);
        Logger.d(getClass().getName(), (new StringBuilder()).append("In logPushExtras(), alias = ").append(UAirship.shared().getPushManager().getAlias()).append(", Channel_Id = ").append(UAirship.shared().getPushManager().getChannelId()).append(", GcmId = ").append(UAirship.shared().getPushManager().getGcmId()).append(", generatedIntNotificationId = ").append("com.urbanairship.push.NOTIFICATION_ID").append(", pushId = ").append("com.urbanairship.push.EXTRA_PUSH_BUNDLE").toString());
        showPushNotificationsEnabledToast(locationmodel);
    }

    private void initActionBar()
    {
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null)
        {
            actionbar.setBackgroundDrawable(getResources().getDrawable(com.accuweather.android.R.drawable.action_bar_gradient));
            actionbar.setSubtitle(com.accuweather.android.R.string.Notifications);
            actionbar.setTitle(com.accuweather.android.R.string.Settings_Abbr18);
            actionbar.setDisplayHomeAsUpEnabled(true);
            actionbar.setDisplayUseLogoEnabled(true);
        }
    }

    private void initSummary(Preference preference)
    {
        if (preference instanceof PreferenceCategory)
        {
            preference = (PreferenceCategory)preference;
            for (int i = 0; i < preference.getPreferenceCount(); i++)
            {
                initSummary(preference.getPreference(i));
            }

        } else
        {
            updatePrefSummary(preference);
        }
    }

    private void showPushNotificationsEnabledToast(LocationModel locationmodel)
    {
        locationmodel = Toast.makeText(this, getString(com.accuweather.android.R.string.EnabledAlertNotifications_PlaceName).replace("{Place name}", locationmodel.getAliasedName()), 1);
        locationmodel.setGravity(17, locationmodel.getXOffset() / 2, locationmodel.getYOffset() / 2);
        locationmodel.show();
    }

    private void updatePrefSummary(Preference preference)
    {
        if (preference instanceof ListPreference)
        {
            preference.setSummary(((ListPreference)preference).getEntry());
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        addPreferencesFromResource(com.accuweather.android.R.xml.pref_screen_notifications);
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        for (int i = 0; i < getPreferenceScreen().getPreferenceCount(); i++)
        {
            initSummary(getPreferenceScreen().getPreference(i));
            if (!Utilities.shouldShowGpsButton(this))
            {
                bundle = (ListPreference)findPreference("pref_temp_notifications");
                bundle.setEntryValues(com.accuweather.android.R.array.pref_temp_notification_values_no_gps);
                bundle.setEntries(com.accuweather.android.R.array.pref_temp_notification_no_gps);
            }
        }

        if (!Utilities.shouldShowPush(this))
        {
            bundle = findPreference("pref_push_notification");
            getPreferenceScreen().removePreference(bundle);
        }
    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            Data.getInstance(this).clearTaskQueue();
            finish();
        }
        return super.onMenuItemSelected(i, menuitem);
    }

    public void onPause()
    {
        super.onPause();
        sharedPreferences.unregisterOnSharedPreferenceChangeListener(this);
        overridePendingTransition(com.accuweather.android.R.anim.fade_in, com.accuweather.android.R.anim.fade_out);
    }

    public void onResume()
    {
        super.onResume();
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
        super.onSharedPreferenceChanged(sharedpreferences, s);
        Logger.i(getClass().getName(), (new StringBuilder()).append("value of key is ").append(s).toString());
        if (!s.equals("pref_push_notification")) goto _L2; else goto _L1
_L1:
        sharedpreferences = sharedpreferences.getString("pref_push_notification", "");
        if (!sharedpreferences.equals("0")) goto _L4; else goto _L3
_L3:
        enablePushNotifications();
_L6:
        updatePrefSummary(findPreference(s));
        return;
_L4:
        if (sharedpreferences.equals("1"))
        {
            UAirship.shared().getPushManager().setPushEnabled(false);
            UAirship.shared().getPushManager().setUserNotificationsEnabled(false);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (s.equals("pref_notification_interval"))
        {
            NotificationServiceBootstrapper.bootstrap(this);
        } else
        if (s.equals("pref_temp_notifications"))
        {
            if (!NotificationService.isNotificationEnabled(this))
            {
                ((NotificationManager)getSystemService("notification")).cancelAll();
                stopService(new Intent(this, com/accuweather/android/notifications/NotificationService));
            } else
            {
                sendBroadcast(new Intent("accuwx.intent.action.UPDATE_NOTIFICATION"));
            }
        } else
        if (s.equals("pref_notification_temperature") && NotificationService.isNotificationEnabled(this))
        {
            sendBroadcast(new Intent("accuwx.intent.action.UPDATE_NOTIFICATION"));
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onStart()
    {
        super.onStart();
        if (!PartnerCoding.isPartnerCodedAmazonPhone(this))
        {
            initActionBar();
        }
    }
}
