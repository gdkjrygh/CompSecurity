// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.os.Bundle;
import android.os.Vibrator;
import android.preference.Preference;
import android.preference.PreferenceGroup;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import com.skype.Account;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.SkypePreferenceFragment;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.KpiAttributeName;
import com.skype.android.analytics.KpiEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;
import com.skype.android.app.OnPreferenceChangedEvent;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.event.EventBus;
import com.skype.android.event.EventBusInstance;
import com.skype.android.util.DeviceFeatures;

public class NotificationSettingsFragment extends SkypePreferenceFragment
{

    Account account;
    Analytics analytics;
    EcsConfiguration ecsConfiguration;
    Vibrator vibrator;

    public NotificationSettingsFragment()
    {
    }

    private void attachPreferenceChangeEventSender(Preference preference)
    {
        if (preference != null)
        {
            preference.setOnPreferenceChangeListener(new android.preference.Preference.OnPreferenceChangeListener() {

                final NotificationSettingsFragment this$0;

                public final boolean onPreferenceChange(Preference preference1, Object obj)
                {
                    EventBusInstance.a().a(new OnPreferenceChangedEvent(preference1, obj));
                    if (preference1.getKey().equals(getString(0x7f080556)) && ((Boolean)obj).booleanValue())
                    {
                        analytics.c(AnalyticsEvent.aZ);
                    }
                    if (preference1.getKey().equals(getString(0x7f08053e)))
                    {
                        preference1 = (Boolean)obj;
                        obj = new SkypeTelemetryEvent(KpiEvent.d);
                        ((SkypeTelemetryEvent) (obj)).put(KpiAttributeName.m, preference1);
                        analytics.a(((SkypeTelemetryEvent) (obj)));
                    }
                    return true;
                }

            
            {
                this$0 = NotificationSettingsFragment.this;
                super();
            }
            });
        }
    }

    public void onCreate(Bundle bundle)
    {
        Preference preference;
label0:
        {
            super.onCreate(bundle);
            getComponent().inject(this);
            getPreferenceManager().setSharedPreferencesName(account.getSkypenameProp());
            addPreferencesFromResource(0x7f06000b);
            attachPreferenceChangeEventSender((Preference)findPreference(0x7f08053e));
            attachPreferenceChangeEventSender((Preference)findPreference(0x7f080556));
            bundle = (PreferenceGroup)findPreference(0x7f080523);
            if (!vibrator.hasVibrator())
            {
                preference = (Preference)findPreference(0x7f08053d);
                if (bundle != null)
                {
                    bundle.removePreference(preference);
                } else
                {
                    getPreferenceScreen().removePreference(preference);
                }
            }
            if (!DeviceFeatures.a())
            {
                preference = (Preference)findPreference(0x7f080539);
                if (bundle == null)
                {
                    break label0;
                }
                bundle.removePreference(preference);
            }
            return;
        }
        getPreferenceScreen().removePreference(preference);
    }
}
