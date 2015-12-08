// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.you;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;

public class BasicSettingsFragment extends PreferenceFragment
{

    public BasicSettingsFragment()
    {
    }

    public static BasicSettingsFragment create()
    {
        return new BasicSettingsFragment();
    }

    private void setupClearCachePreference()
    {
        getPreferenceScreen().findPreference("clearCache").setOnPreferenceClickListener(new _cls1());
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        addPreferencesFromResource(0x7f050006);
        setupClearCachePreference();
    }

    private class _cls1
        implements android.preference.Preference.OnPreferenceClickListener
    {

        final BasicSettingsFragment this$0;

        public boolean onPreferenceClick(Preference preference)
        {
            ClearCacheDialog.show(getFragmentManager());
            return true;
        }

        _cls1()
        {
            this$0 = BasicSettingsFragment.this;
            super();
        }
    }

}
