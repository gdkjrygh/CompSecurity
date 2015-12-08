// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.preferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.Preference;
import android.preference.PreferenceScreen;
import com.accuweather.android.utilities.AccuAnalytics;
import com.actionbarsherlock.app.SherlockPreferenceActivity;
import java.util.Map;

public class AbstractPreferenceActivity extends SherlockPreferenceActivity
    implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
{

    public AbstractPreferenceActivity()
    {
    }

    private void logSharedPreferencesSelection(SharedPreferences sharedpreferences, String s)
    {
        try
        {
            sharedpreferences = ((SharedPreferences) (sharedpreferences.getAll().get(s)));
            AccuAnalytics.logUiEvent(this, "Settings item selected", (new StringBuilder()).append(s).append(" = ").append(sharedpreferences).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SharedPreferences sharedpreferences)
        {
            return;
        }
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
        logSharedPreferencesSelection(sharedpreferences, s);
    }

    protected final void removePreference(String s)
    {
        s = findPreference(s);
        if (s != null && getPreferenceScreen() != null)
        {
            getPreferenceScreen().removePreference(s);
        }
    }

    protected final void setPreferenceClickListener(String s, final Class intentClassToLaunch)
    {
        s = findPreference(s);
        if (s != null)
        {
            s.setOnPreferenceClickListener(new android.preference.Preference.OnPreferenceClickListener() {

                final AbstractPreferenceActivity this$0;
                final Class val$intentClassToLaunch;

                public boolean onPreferenceClick(Preference preference)
                {
                    startActivity(new Intent(AbstractPreferenceActivity.this, intentClassToLaunch));
                    return true;
                }

            
            {
                this$0 = AbstractPreferenceActivity.this;
                intentClassToLaunch = class1;
                super();
            }
            });
        }
    }
}
