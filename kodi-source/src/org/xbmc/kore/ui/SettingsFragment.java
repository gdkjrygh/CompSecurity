// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;
import android.support.v4.app.TaskStackBuilder;
import org.xbmc.kore.utils.LogUtils;
import org.xbmc.kore.utils.UIUtils;

// Referenced classes of package org.xbmc.kore.ui:
//            RemoteActivity, SettingsActivity, AboutDialogFragment

public class SettingsFragment extends PreferenceFragment
    implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
{

    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/ui/SettingsFragment);

    public SettingsFragment()
    {
    }

    private void setupPreferences()
    {
        Object obj;
        obj = (ListPreference)findPreference("pref_theme");
        ((ListPreference) (obj)).setSummary(((ListPreference) (obj)).getEntry());
        obj = getActivity().getString(0x7f07001e);
        String s = (new StringBuilder()).append(((String) (obj))).append(" v").append(getActivity().getPackageManager().getPackageInfo(getActivity().getPackageName(), 0).versionName).toString();
        obj = s;
_L2:
        Preference preference = findPreference("pref_about");
        preference.setSummary(((CharSequence) (obj)));
        preference.setOnPreferenceClickListener(new android.preference.Preference.OnPreferenceClickListener() {

            final SettingsFragment this$0;

            public boolean onPreferenceClick(Preference preference1)
            {
                (new AboutDialogFragment()).show(getActivity().getFragmentManager(), null);
                return true;
            }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
        });
        return;
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        addPreferencesFromResource(0x7f060000);
        setupPreferences();
    }

    public void onPause()
    {
        super.onPause();
        getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
    }

    public void onResume()
    {
        super.onResume();
        getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
        setupPreferences();
        if (s.equals("pref_theme"))
        {
            UIUtils.playPauseIconsLoaded = false;
            TaskStackBuilder.create(getActivity()).addNextIntent(new Intent(getActivity(), org/xbmc/kore/ui/RemoteActivity)).addNextIntent(new Intent(getActivity(), org/xbmc/kore/ui/SettingsActivity)).startActivities();
        }
    }

}
