// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.preferences;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.PartnerCoding;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.MenuItem;

// Referenced classes of package com.accuweather.android.preferences:
//            AbstractPreferenceActivity

public class AdvancedSettingsActivity extends AbstractPreferenceActivity
    implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
{

    private BroadcastReceiver mBr;
    private Context mContext;
    private SharedPreferences mSp;

    public AdvancedSettingsActivity()
    {
    }

    private Data getData()
    {
        return Data.getInstance(getApplication());
    }

    private void initActionBar()
    {
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null)
        {
            actionbar.setBackgroundDrawable(getResources().getDrawable(com.accuweather.android.R.drawable.action_bar_gradient));
            actionbar.setSubtitle(com.accuweather.android.R.string.Advanced);
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
        mContext = this;
        mSp = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        addPreferencesFromResource(com.accuweather.android.R.xml.pref_screen_advanced);
        for (int i = 0; i < getPreferenceScreen().getPreferenceCount(); i++)
        {
            initSummary(getPreferenceScreen().getPreference(i));
        }

    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            getData().clearTaskQueue();
            finish();
        }
        return super.onMenuItemSelected(i, menuitem);
    }

    public void onPause()
    {
        super.onPause();
        mSp.unregisterOnSharedPreferenceChangeListener(this);
        if (mBr != null)
        {
            unregisterReceiver(mBr);
        }
        overridePendingTransition(com.accuweather.android.R.anim.fade_in, com.accuweather.android.R.anim.fade_out);
    }

    public void onResume()
    {
        super.onResume();
        mSp.registerOnSharedPreferenceChangeListener(this);
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
        super.onSharedPreferenceChanged(sharedpreferences, s);
        Logger.i(getClass().getName(), (new StringBuilder()).append("value of key is ").append(s).toString());
        updatePrefSummary(findPreference(s));
        mSp.unregisterOnSharedPreferenceChangeListener(this);
        sharedpreferences = PreferenceManager.getDefaultSharedPreferences(mContext).edit();
        sharedpreferences.putBoolean("changed_advanced_settings", true);
        sharedpreferences.putBoolean("changed_advanced_settings_for_primary_activity", true);
        sharedpreferences.commit();
        mSp.registerOnSharedPreferenceChangeListener(this);
    }

    public void onStart()
    {
        super.onStart();
        if (!PartnerCoding.isPartnerCodedAmazonPhone(this))
        {
            initActionBar();
        }
    }

    public void onStop()
    {
        super.onStop();
    }
}
