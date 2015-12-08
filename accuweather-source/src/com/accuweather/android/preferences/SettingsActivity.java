// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.preferences;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.accuweather.android.market.MarketUtils;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.PartnerCoding;
import com.accuweather.android.utilities.Utilities;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.MenuItem;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.accuweather.android.preferences:
//            AbstractPreferenceActivity, NotificationsSettingsActivity, TermsOfUseActivity, AdvancedSettingsActivity

public class SettingsActivity extends AbstractPreferenceActivity
    implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
{

    private Handler mHandler;
    private SharedPreferences mSharedPreferences;

    public SettingsActivity()
    {
        mHandler = new Handler() {

            final SettingsActivity this$0;

            public void handleMessage(Message message)
            {
                message = (TextView)message.obj;
                message.setTextSize(1, ((Float)message.getTag()).floatValue());
            }

            
            {
                this$0 = SettingsActivity.this;
                super();
            }
        };
    }

    private void createWarningDialogOverridingAdvancedChanges()
    {
        Object obj = new TextView(this);
        ((TextView) (obj)).setText(getResources().getString(com.accuweather.android.R.string.ChangingYourBasicSettingsUndoAdvancedSettings_Abbr80));
        ((TextView) (obj)).setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        ((TextView) (obj)).setGravity(17);
        ((TextView) (obj)).setTextSize(1, 18F);
        Utilities.setTypeFace(obj, Data.getRobotoCondensed());
        LinearLayout linearlayout = new LinearLayout(this);
        linearlayout.setPadding(10, 30, 10, 10);
        linearlayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        linearlayout.setGravity(17);
        linearlayout.addView(((android.view.View) (obj)));
        obj = new android.app.AlertDialog.Builder(this);
        ((android.app.AlertDialog.Builder) (obj)).setTitle(getResources().getString(com.accuweather.android.R.string.Warning)).setNegativeButton(getResources().getString(com.accuweather.android.R.string.OK), new android.content.DialogInterface.OnClickListener() {

            final SettingsActivity this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
            }

            
            {
                this$0 = SettingsActivity.this;
                super();
            }
        });
        ((android.app.AlertDialog.Builder) (obj)).setView(linearlayout).create().show();
    }

    private void initActionBar()
    {
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null)
        {
            actionbar.setBackgroundDrawable(getResources().getDrawable(com.accuweather.android.R.drawable.action_bar_gradient));
            actionbar.setTitle(com.accuweather.android.R.string.Settings_Abbr18);
            actionbar.setDisplayHomeAsUpEnabled(true);
            actionbar.setDisplayUseLogoEnabled(true);
        }
    }

    private void initSummaries()
    {
        for (int i = 0; i < getPreferenceScreen().getPreferenceCount(); i++)
        {
            initSummary(getPreferenceScreen().getPreference(i));
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

    private boolean isChangingAdvancedSettings()
    {
        return PreferenceManager.getDefaultSharedPreferences(this).getBoolean("changed_advanced_settings", false);
    }

    private void removeGooglePlayLinkPreferencesIfRequired()
    {
        if (!MarketUtils.shouldShowRateOrUpgrade(this))
        {
            removePreference("pref_upgrade");
            removePreference("pref_rate");
        }
    }

    private void removeUnusedPreferencesForAmazonPhone()
    {
        if (PartnerCoding.isPartnerCodedAmazonPhone(this))
        {
            removePreference("pref_upgrade");
            removePreference("notification_pref");
        }
    }

    private void removeUnusedPreferencesForIControl()
    {
        if (PartnerCoding.isPartnerCodedIcontrol(this))
        {
            removePreference("pref_upgrade");
            removePreference("pref_rate");
            removePreference("notification_pref");
        }
    }

    private void removeUpgradePreferenceForPaidBuild()
    {
    }

    private void runTextSizerTimerTask(int i)
    {
        (new Timer()).schedule(new TimerTask() {

            final SettingsActivity this$0;

            public void run()
            {
                for (int j = 0; j < getListView().getChildCount(); j++)
                {
                    ListView listview = getListView();
                    setTextSize(listview);
                }

            }

            
            {
                this$0 = SettingsActivity.this;
                super();
            }
        }, i);
    }

    private void setNotificationPreferenceListener()
    {
        if (findPreference("notification_pref") != null)
        {
            setPreferenceClickListener("notification_pref", com/accuweather/android/preferences/NotificationsSettingsActivity);
        }
    }

    private void setPreferenceClickListeners()
    {
        setUpgradePreferenceListener();
        setRatePreferenceListener();
        setTemperaturePreferenceClickListener();
        setNotificationPreferenceListener();
        setPreferenceClickListener("terms_of_use_pref", com/accuweather/android/preferences/TermsOfUseActivity);
        setPreferenceClickListener("advanced_pref", com/accuweather/android/preferences/AdvancedSettingsActivity);
    }

    private void setRatePreferenceListener()
    {
        Preference preference = findPreference("pref_rate");
        if (preference != null)
        {
            preference.setOnPreferenceClickListener(new android.preference.Preference.OnPreferenceClickListener() {

                final SettingsActivity this$0;

                public boolean onPreferenceClick(Preference preference1)
                {
                    MarketUtils.rateThisApp(SettingsActivity.this);
                    return false;
                }

            
            {
                this$0 = SettingsActivity.this;
                super();
            }
            });
        }
    }

    private void setTemperaturePreferenceClickListener()
    {
        Preference preference = findPreference("pref_temp_units");
        if (preference != null)
        {
            preference.setOnPreferenceClickListener(new android.preference.Preference.OnPreferenceClickListener() {

                final SettingsActivity this$0;

                public boolean onPreferenceClick(Preference preference1)
                {
                    if (isChangingAdvancedSettings())
                    {
                        createWarningDialogOverridingAdvancedChanges();
                        return true;
                    } else
                    {
                        return false;
                    }
                }

            
            {
                this$0 = SettingsActivity.this;
                super();
            }
            });
        }
    }

    private void setTextSize(Object obj)
    {
        if (!(obj instanceof ViewGroup)) goto _L2; else goto _L1
_L1:
        for (int i = 0; i < ((ViewGroup)obj).getChildCount(); i++)
        {
            setTextSize(((ViewGroup)obj).getChildAt(i));
        }

          goto _L3
_L2:
        if (!(obj instanceof TextView) || (((TextView)obj).getParent() instanceof ListView)) goto _L5; else goto _L4
_L4:
        if (((TextView)obj).getTag() == null)
        {
            int l = ((TextView)obj).getText().length();
            float f;
            int j;
            if (((TextView)obj).getId() == 0x1020016)
            {
                f = 20F;
            } else
            {
                f = 12F;
            }
            for (j = 20; j < l; j++)
            {
                f -= 0.3F;
            }

            Message message = new Message();
            obj = (TextView)obj;
            ((TextView) (obj)).setTag(Float.valueOf(f));
            message.obj = obj;
            mHandler.sendMessage(message);
        }
_L3:
        return;
_L5:
        if (obj instanceof ListView)
        {
            int k = 0;
            while (k < getListView().getChildCount()) 
            {
                setTextSize(getListView());
                k++;
            }
        }
        if (true) goto _L3; else goto _L6
_L6:
    }

    private void setUpgradePreferenceListener()
    {
        Preference preference = findPreference("pref_upgrade");
        if (preference != null)
        {
            preference.setOnPreferenceClickListener(new android.preference.Preference.OnPreferenceClickListener() {

                final SettingsActivity this$0;

                public boolean onPreferenceClick(Preference preference1)
                {
                    MarketUtils.goToPlatinumVersion(SettingsActivity.this);
                    return false;
                }

            
            {
                this$0 = SettingsActivity.this;
                super();
            }
            });
        }
    }

    private void updateCopyrightYear()
    {
        int i = Calendar.getInstance().get(1);
        Preference preference = findPreference("accuweatherBranding");
        if (preference != null)
        {
            preference.setTitle(getString(com.accuweather.android.R.string.Year_AccuWeatherInc).replace("{year}", Integer.toString(i)));
        }
    }

    private void updatePrefSummary(Preference preference)
    {
        if (preference instanceof ListPreference)
        {
            preference.setSummary(((ListPreference)preference).getEntry());
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        addPreferencesFromResource(com.accuweather.android.R.xml.pref_screen_main);
        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        initSummaries();
        updateCopyrightYear();
        removeUpgradePreferenceForPaidBuild();
        removeGooglePlayLinkPreferencesIfRequired();
        removeUnusedPreferencesForIControl();
        removeUnusedPreferencesForAmazonPhone();
        setPreferenceClickListeners();
        runTextSizerTimerTask(0);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            finish();
        }
        return super.onMenuItemSelected(i, menuitem);
    }

    public void onPause()
    {
        super.onPause();
        mSharedPreferences.unregisterOnSharedPreferenceChangeListener(this);
        overridePendingTransition(com.accuweather.android.R.anim.fade_in, com.accuweather.android.R.anim.fade_out);
    }

    public void onResume()
    {
        super.onResume();
        mSharedPreferences.registerOnSharedPreferenceChangeListener(this);
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
        super.onSharedPreferenceChanged(sharedpreferences, s);
        if ("pref_temp_units".equals(s))
        {
            updatePrefSummary(findPreference(s));
            mSharedPreferences.unregisterOnSharedPreferenceChangeListener(this);
            PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("changed_advanced_settings", false).commit();
            Data.getInstance(getApplication()).setMetric(sharedpreferences.getString(s, getResources().getString(com.accuweather.android.R.string.default_metric)));
            mSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        }
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
