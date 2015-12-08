// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.properties.Flag;
import com.soundcloud.android.utils.ScTextUtils;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.b;
import java.util.EnumSet;
import java.util.Iterator;

public class DevDrawerFragment extends PreferenceFragment
{

    private static final int SYNC_CLEAR_MODE_NOT_SET = -1;
    EventBus eventBus;
    FeatureFlags featureFlags;

    public DevDrawerFragment()
    {
        SoundCloudApplication.getObjectGraph().a(this);
    }

    private void addActions()
    {
        final PreferenceScreen screen = getPreferenceScreen();
        screen.findPreference(getString(0x7f070297)).setOnPreferenceClickListener(new _cls1());
        screen.findPreference(getString(0x7f07029b)).setOnPreferenceClickListener(new _cls2());
        screen.findPreference(getString(0x7f070299)).setOnPreferenceClickListener(new _cls3());
        screen.findPreference(getString(0x7f07029d)).setOnPreferenceClickListener(new _cls4());
        screen.findPreference(getString(0x7f070293)).setOnPreferenceClickListener(new _cls5());
        screen.findPreference(getString(0x7f07029f)).setOnPreferenceClickListener(new _cls6());
        screen.findPreference(getString(0x7f070295)).setOnPreferenceClickListener(new _cls7());
    }

    private void addFeatureToggles()
    {
        PreferenceScreen preferencescreen = getPreferenceScreen();
        PreferenceCategory preferencecategory = new PreferenceCategory(preferencescreen.getContext());
        preferencecategory.setTitle(getString(0x7f0702a5));
        preferencescreen.addPreference(preferencecategory);
        CheckBoxPreference checkboxpreference;
        for (Iterator iterator = Flag.realFeatures().iterator(); iterator.hasNext(); preferencecategory.addPreference(checkboxpreference))
        {
            Flag flag = (Flag)iterator.next();
            checkboxpreference = new CheckBoxPreference(preferencescreen.getContext());
            checkboxpreference.setKey(featureFlags.getPreferenceKey(flag));
            checkboxpreference.setTitle(ScTextUtils.fromSnakeCaseToCamelCase(flag.name()));
            checkboxpreference.setChecked(featureFlags.isEnabled(flag));
        }

    }

    private SoundCloudApplication getApp()
    {
        return (SoundCloudApplication)getActivity().getApplication();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        addPreferencesFromResource(0x7f050002);
        addActions();
        addFeatureToggles();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = (ViewGroup)super.onCreateView(layoutinflater, viewgroup, bundle);
        layoutinflater.setBackgroundColor(getResources().getColor(0x106000b));
        return layoutinflater;
    }


    private class _cls1
        implements android.preference.Preference.OnPreferenceClickListener
    {

        final DevDrawerFragment this$0;

        public boolean onPreferenceClick(Preference preference)
        {
            Process.killProcess(Process.myPid());
            return true;
        }

        _cls1()
        {
            this$0 = DevDrawerFragment.this;
            super();
        }
    }


    private class _cls2
        implements android.preference.Preference.OnPreferenceClickListener
    {

        final DevDrawerFragment this$0;
        final PreferenceScreen val$screen;

        public boolean onPreferenceClick(Preference preference)
        {
            Flag flag;
            String s;
            for (preference = Flag.realFeatures().iterator(); preference.hasNext(); ((CheckBoxPreference)screen.findPreference(s)).setChecked(featureFlags.resetAndGet(flag)))
            {
                flag = (Flag)preference.next();
                s = featureFlags.getPreferenceKey(flag);
            }

            return true;
        }

        _cls2()
        {
            this$0 = DevDrawerFragment.this;
            screen = preferencescreen;
            super();
        }
    }


    private class _cls3
        implements android.preference.Preference.OnPreferenceClickListener
    {

        final DevDrawerFragment this$0;

        public boolean onPreferenceClick(Preference preference)
        {
            DailyUpdateService.start(getActivity().getApplicationContext());
            return true;
        }

        _cls3()
        {
            this$0 = DevDrawerFragment.this;
            super();
        }
    }


    private class _cls4
        implements android.preference.Preference.OnPreferenceClickListener
    {

        final DevDrawerFragment this$0;

        public boolean onPreferenceClick(Preference preference)
        {
            SyncAdapterService.requestNewSync(getApp(), 2);
            return true;
        }

        _cls4()
        {
            this$0 = DevDrawerFragment.this;
            super();
        }
    }


    private class _cls5
        implements android.preference.Preference.OnPreferenceClickListener
    {

        final DevDrawerFragment this$0;

        public boolean onPreferenceClick(Preference preference)
        {
            SyncAdapterService.requestNewSync(getApp(), 1);
            return true;
        }

        _cls5()
        {
            this$0 = DevDrawerFragment.this;
            super();
        }
    }


    private class _cls6
        implements android.preference.Preference.OnPreferenceClickListener
    {

        final DevDrawerFragment this$0;

        public boolean onPreferenceClick(Preference preference)
        {
            SyncAdapterService.requestNewSync(getApp(), -1);
            return true;
        }

        _cls6()
        {
            this$0 = DevDrawerFragment.this;
            super();
        }
    }


    private class _cls7
        implements android.preference.Preference.OnPreferenceClickListener
    {

        final DevDrawerFragment this$0;

        public boolean onPreferenceClick(Preference preference)
        {
            if (!AndroidUtils.isUserAMonkey())
            {
                throw new RuntimeException("Developer requested crash");
            } else
            {
                return true;
            }
        }

        _cls7()
        {
            this$0 = DevDrawerFragment.this;
            super();
        }
    }

}
