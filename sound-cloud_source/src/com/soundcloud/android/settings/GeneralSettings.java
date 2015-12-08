// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.settings;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.UpgradeTrackingEvent;
import com.soundcloud.android.offline.OfflineSettingsOperations;
import com.soundcloud.android.utils.AndroidUtils;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.settings:
//            NotificationSettingsActivity, LegalActivity, ClearCacheDialog

class GeneralSettings
    implements android.preference.Preference.OnPreferenceClickListener
{

    public static final int CLICKS_TO_DEBUG_MODE = 5;
    private final Context appContext;
    private int clicksToDebug;
    private final EventBus eventBus;
    private final FeatureOperations featureOperations;
    private final OfflineSettingsOperations offlineSettingsOperations;
    private PreferenceFragment settings;

    public GeneralSettings(Context context, FeatureOperations featureoperations, OfflineSettingsOperations offlinesettingsoperations, EventBus eventbus)
    {
        clicksToDebug = 5;
        appContext = context;
        featureOperations = featureoperations;
        offlineSettingsOperations = offlinesettingsoperations;
        eventBus = eventbus;
    }

    private void addOfflineSettings(PreferenceFragment preferencefragment)
    {
        ((PreferenceCategory)preferencefragment.findPreference("generalSettings")).addPreference(createOfflineSyncPref(preferencefragment));
    }

    private Preference createOfflineSyncPref(final PreferenceFragment parent)
    {
        parent = parent.getActivity();
        Preference preference = new Preference(parent);
        preference.setKey("offlineSyncSettings");
        preference.setTitle(0x7f0702fa);
        preference.setSummary(0x7f0702fb);
        preference.setOrder(1);
        preference.setOnPreferenceClickListener(new _cls1());
        return preference;
    }

    private void setupListeners(PreferenceFragment preferencefragment)
    {
        preferencefragment.findPreference("notificationSettings").setOnPreferenceClickListener(this);
        preferencefragment.findPreference("legal").setOnPreferenceClickListener(this);
        preferencefragment.findPreference("logout").setOnPreferenceClickListener(this);
        preferencefragment.findPreference("help").setOnPreferenceClickListener(this);
        preferencefragment.findPreference("clearCache").setOnPreferenceClickListener(this);
        preferencefragment.findPreference("wireless").setOnPreferenceClickListener(this);
    }

    private void setupOfflineSync(PreferenceFragment preferencefragment)
    {
        if (featureOperations.isOfflineContentEnabled() || offlineSettingsOperations.hasOfflineContent())
        {
            addOfflineSettings(preferencefragment);
        } else
        if (featureOperations.upsellMidTier())
        {
            eventBus.publish(EventQueue.TRACKING, UpgradeTrackingEvent.forSettingsImpression());
            addOfflineSettings(preferencefragment);
            return;
        }
    }

    private void setupVersion(PreferenceFragment preferencefragment)
    {
        preferencefragment = preferencefragment.findPreference("version");
        preferencefragment.setSummary("2015.11.20-release");
        preferencefragment.setOnPreferenceClickListener(new _cls2());
    }

    private void showLogoutDialog(final Activity parent)
    {
        android.support.v7.app.AlertDialog.Builder builder = (new android.support.v7.app.AlertDialog.Builder(parent)).setTitle(0x7f0701eb);
        int i;
        if (offlineSettingsOperations.hasOfflineContent())
        {
            i = 0x7f07030e;
        } else
        {
            i = 0x7f0701ea;
        }
        builder.setMessage(i).setPositiveButton(0x104000a, new _cls3()).show();
    }

    private void togglePlaybackDebugMode()
    {
        Object obj = PreferenceManager.getDefaultSharedPreferences(appContext);
        Context context;
        int i;
        boolean flag;
        if (!((SharedPreferences) (obj)).getBoolean("playbackErrorReportingEnabled", false))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((SharedPreferences) (obj)).edit().putBoolean("playbackErrorReportingEnabled", flag).apply();
        (new StringBuilder("Toggling error reporting (enabled=")).append(flag).append(")");
        obj = appContext.getResources();
        context = appContext;
        if (flag)
        {
            i = 0x7f070127;
        } else
        {
            i = 0x7f07011a;
        }
        AndroidUtils.showToast(context, ((Resources) (obj)).getString(0x7f07017f, new Object[] {
            ((Resources) (obj)).getText(i)
        }));
    }

    public void addTo(PreferenceFragment preferencefragment)
    {
        settings = preferencefragment;
        preferencefragment.addPreferencesFromResource(0x7f050007);
        setupOfflineSync(preferencefragment);
        setupListeners(preferencefragment);
        setupVersion(preferencefragment);
    }

    public boolean onPreferenceClick(Preference preference)
    {
        Activity activity;
        byte byte0;
        boolean flag;
        flag = true;
        activity = settings.getActivity();
        preference = preference.getKey();
        byte0 = -1;
        preference.hashCode();
        JVM INSTR lookupswitch 6: default 80
    //                   -1097329270: 154
    //                   -1000044642: 196
    //                   -759238347: 182
    //                   -660500946: 126
    //                   3198785: 168
    //                   102851257: 140;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        byte0;
        JVM INSTR tableswitch 0 5: default 120
    //                   0 210
    //                   1 227
    //                   2 244
    //                   3 257
    //                   4 286
    //                   5 295;
           goto _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L8:
        flag = false;
_L16:
        return flag;
_L5:
        if (preference.equals("notificationSettings"))
        {
            byte0 = 0;
        }
          goto _L1
_L7:
        if (preference.equals("legal"))
        {
            byte0 = 1;
        }
          goto _L1
_L2:
        if (preference.equals("logout"))
        {
            byte0 = 2;
        }
          goto _L1
_L6:
        if (preference.equals("help"))
        {
            byte0 = 3;
        }
          goto _L1
_L4:
        if (preference.equals("clearCache"))
        {
            byte0 = 4;
        }
          goto _L1
_L3:
        if (preference.equals("wireless"))
        {
            byte0 = 5;
        }
          goto _L1
_L9:
        activity.startActivity(new Intent(activity, com/soundcloud/android/settings/NotificationSettingsActivity));
        return true;
_L10:
        activity.startActivity(new Intent(activity, com/soundcloud/android/settings/LegalActivity));
        return true;
_L11:
        if (AndroidUtils.isUserAMonkey()) goto _L16; else goto _L15
_L15:
        showLogoutDialog(activity);
        return true;
_L12:
        activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(appContext.getString(0x7f070334))));
        return true;
_L13:
        ClearCacheDialog.show(activity.getFragmentManager());
        return true;
_L14:
        try
        {
            activity.startActivity(new Intent("android.settings.WIRELESS_SETTINGS"));
        }
        // Misplaced declaration of an exception variable
        catch (Preference preference)
        {
            preference = SoundCloudApplication.TAG;
        }
          goto _L8
    }





/*
    static int access$202(GeneralSettings generalsettings, int i)
    {
        generalsettings.clicksToDebug = i;
        return i;
    }

*/


/*
    static int access$210(GeneralSettings generalsettings)
    {
        int i = generalsettings.clicksToDebug;
        generalsettings.clicksToDebug = i - 1;
        return i;
    }

*/


    private class _cls1
        implements android.preference.Preference.OnPreferenceClickListener
    {

        final GeneralSettings this$0;
        final Activity val$parent;

        public boolean onPreferenceClick(Preference preference)
        {
            parent.startActivity(new Intent(parent, com/soundcloud/android/settings/OfflineSettingsActivity));
            if (featureOperations.upsellMidTier())
            {
                eventBus.publish(EventQueue.TRACKING, UpgradeTrackingEvent.forSettingsClick());
            }
            return true;
        }

        _cls1()
        {
            this$0 = GeneralSettings.this;
            parent = activity;
            super();
        }
    }


    private class _cls2
        implements android.preference.Preference.OnPreferenceClickListener
    {

        final GeneralSettings this$0;

        public boolean onPreferenceClick(Preference preference)
        {
            int i = 
// JavaClassFileOutputException: get_constant: invalid tag

        _cls2()
        {
            this$0 = GeneralSettings.this;
            super();
        }
    }


    private class _cls3
        implements android.content.DialogInterface.OnClickListener
    {

        final GeneralSettings this$0;
        final Activity val$parent;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            LogoutActivity.start(parent);
        }

        _cls3()
        {
            this$0 = GeneralSettings.this;
            parent = activity;
            super();
        }
    }

}
