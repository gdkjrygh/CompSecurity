// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import android.widget.Toast;
import com.dominos.MobileSession;
import com.dominos.MobileSession_;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization_;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.android.sdk.data.sharedpref.ApplicationConfigurationPreferences_;
import com.dominos.beacon.util.BeaconConfigurationPreferences_;
import org.androidannotations.api.c.p;

public class SettingsPreferenceActivity extends PreferenceActivity
    implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
{

    private static final String BEACON_PREF_NAME = "BeaconConfigurationPreferences";
    private static final String PREF_NAME = "ApplicationConfigurationPreferences";
    private BeaconConfigurationPreferences_ mBeaconPreferences;
    private ApplicationConfigurationPreferences_ mPreferences;
    private UserProfileManager mProfileManager;
    private UserAuthorization mUserAuthorization;

    public SettingsPreferenceActivity()
    {
    }

    private void setUpSummary()
    {
        findPreference(getString(0x7f0803e6)).setSummary("3.0.1");
        findPreference(mPreferences.fordsyncPromptsVersion().b()).setSummary((CharSequence)mPreferences.fordsyncPromptsVersion().c());
        findPreference(mPreferences.powerURL().b()).setSummary((CharSequence)mPreferences.powerURL().c());
        findPreference(mPreferences.configURL().b()).setSummary((CharSequence)mPreferences.configURL().c());
        findPreference(mPreferences.promptsURL().b()).setSummary((CharSequence)mPreferences.promptsURL().c());
        findPreference(mPreferences.googleWalletEnvironment().b()).setSummary((CharSequence)mPreferences.googleWalletEnvironment().c());
        findPreference(mPreferences.creditCardsExpired().b()).setSummary((CharSequence)mPreferences.creditCardsExpired().c());
        findPreference(mPreferences.creditCardsNotTakenByStores().b()).setSummary((CharSequence)mPreferences.creditCardsNotTakenByStores().c());
        findPreference(mPreferences.shopRunnerLearnMoreWebUrl().b()).setSummary((CharSequence)mPreferences.shopRunnerLearnMoreWebUrl().c());
        findPreference(mPreferences.shopRunnerLoginWebUrl().b()).setSummary((CharSequence)mPreferences.shopRunnerLoginWebUrl().c());
        findPreference(mPreferences.shopRunnerValidateMemberTokenUrl().b()).setSummary((CharSequence)mPreferences.shopRunnerValidateMemberTokenUrl().c());
        findPreference(mPreferences.shopRunnerValidateSessionTokenUrl().b()).setSummary((CharSequence)mPreferences.shopRunnerValidateSessionTokenUrl().c());
        findPreference(mPreferences.grammarVersion().b()).setSummary((CharSequence)mPreferences.grammarVersion().c());
        findPreference(mPreferences.nuancePromptsVersion().b()).setSummary((CharSequence)mPreferences.nuancePromptsVersion().c());
        findPreference(mPreferences.nuanceGateway().b()).setSummary((CharSequence)mPreferences.nuanceGateway().c());
        findPreference(mPreferences.inactiveTimeLimit().b()).setSummary((CharSequence)mPreferences.inactiveTimeLimit().c());
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mPreferences = new ApplicationConfigurationPreferences_(this);
        getPreferenceManager().setSharedPreferencesName("ApplicationConfigurationPreferences");
        mBeaconPreferences = new BeaconConfigurationPreferences_(this);
        mProfileManager = (UserProfileManager)MobileSession_.getInstance_(this).getManager("user_manager");
        mUserAuthorization = UserAuthorization_.getInstance_(this);
        addPreferencesFromResource(0x7f060000);
        setUpSummary();
    }

    protected void onPause()
    {
        super.onPause();
        getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
    }

    public boolean onPreferenceTreeClick(PreferenceScreen preferencescreen, Preference preference)
    {
        String s = preference.getKey();
        if (StringHelper.isEmpty(s))
        {
            return false;
        }
        if (s.equals(getString(0x7f0803fe)))
        {
            (new android.app.AlertDialog.Builder(this)).setTitle(getString(0x7f0800b9)).setMessage(getString(0x7f0803e0)).setPositiveButton(getString(0x7f0803e1), new _cls2()).setNegativeButton(getString(0x7f0803df), new _cls1()).create().show();
            return true;
        }
        if (s.equals(getString(0x7f0803e9)))
        {
            (new android.app.AlertDialog.Builder(this)).setTitle(getString(0x7f0803d9)).setMessage(getString(0x7f080433)).setPositiveButton(getString(0x7f0803e1), new _cls4()).setNegativeButton(getString(0x7f0803df), new _cls3()).create().show();
            return true;
        }
        if (mUserAuthorization.isOAuthKey(s))
        {
            mUserAuthorization.clearOAuthToken();
            Toast.makeText(this, getString(0x7f0803ba), 0).show();
            return true;
        } else
        {
            return super.onPreferenceTreeClick(preferencescreen, preference);
        }
    }

    protected void onResume()
    {
        super.onResume();
        getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
        if (!StringHelper.equals(s, mPreferences.fordsyncPromptsVersion().b())) goto _L2; else goto _L1
_L1:
        findPreference(s).setSummary((CharSequence)mPreferences.fordsyncPromptsVersion().c());
_L4:
        Toast.makeText(this, getString(0x7f08042b), 0).show();
        return;
_L2:
        if (StringHelper.equals(s, mPreferences.powerURL().b()))
        {
            mProfileManager.clearCurrentUser();
            findPreference(s).setSummary((CharSequence)mPreferences.powerURL().c());
        } else
        if (StringHelper.equals(s, mPreferences.configURL().b()))
        {
            findPreference(s).setSummary((CharSequence)mPreferences.configURL().c());
        } else
        if (StringHelper.equals(s, mPreferences.promptsURL().b()))
        {
            findPreference(s).setSummary((CharSequence)mPreferences.promptsURL().c());
        } else
        if (StringHelper.equals(s, mPreferences.googleWalletEnvironment().b()))
        {
            findPreference(s).setSummary((CharSequence)mPreferences.googleWalletEnvironment().c());
        } else
        if (StringHelper.equals(s, mPreferences.creditCardsExpired().b()))
        {
            findPreference(s).setSummary((CharSequence)mPreferences.creditCardsExpired().c());
        } else
        if (StringHelper.equals(s, mPreferences.creditCardsNotTakenByStores().b()))
        {
            findPreference(s).setSummary((CharSequence)mPreferences.creditCardsNotTakenByStores().c());
        } else
        if (StringHelper.equals(s, mPreferences.shopRunnerLearnMoreWebUrl().b()))
        {
            findPreference(s).setSummary((CharSequence)mPreferences.shopRunnerLearnMoreWebUrl().c());
        } else
        if (StringHelper.equals(s, mPreferences.shopRunnerLoginWebUrl().b()))
        {
            findPreference(s).setSummary((CharSequence)mPreferences.shopRunnerLoginWebUrl().c());
        } else
        if (StringHelper.equals(s, mPreferences.shopRunnerValidateMemberTokenUrl().b()))
        {
            findPreference(s).setSummary((CharSequence)mPreferences.shopRunnerValidateMemberTokenUrl().c());
        } else
        if (StringHelper.equals(s, mPreferences.shopRunnerValidateSessionTokenUrl().b()))
        {
            findPreference(s).setSummary((CharSequence)mPreferences.shopRunnerValidateSessionTokenUrl().c());
        } else
        if (StringHelper.equals(s, mPreferences.grammarVersion().b()))
        {
            findPreference(s).setSummary((CharSequence)mPreferences.grammarVersion().c());
        } else
        if (StringHelper.equals(s, mPreferences.nuancePromptsVersion().b()))
        {
            findPreference(s).setSummary((CharSequence)mPreferences.nuancePromptsVersion().c());
        } else
        if (StringHelper.equals(s, mPreferences.nuanceGateway().b()))
        {
            findPreference(s).setSummary((CharSequence)mPreferences.nuanceGateway().c());
        } else
        if (StringHelper.equals(s, mPreferences.inactiveTimeLimit().b()))
        {
            findPreference(s).setSummary((CharSequence)mPreferences.inactiveTimeLimit().c());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }




    private class _cls2
        implements android.content.DialogInterface.OnClickListener
    {

        final SettingsPreferenceActivity this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            mProfileManager.clearCurrentUser();
            mPreferences.clear();
            mBeaconPreferences.clear();
            Toast.makeText(SettingsPreferenceActivity.this, getString(0x7f08042b), 0).show();
        }

        _cls2()
        {
            this$0 = SettingsPreferenceActivity.this;
            super();
        }
    }


    private class _cls1
        implements android.content.DialogInterface.OnClickListener
    {

        final SettingsPreferenceActivity this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
        }

        _cls1()
        {
            this$0 = SettingsPreferenceActivity.this;
            super();
        }
    }


    private class _cls4
        implements android.content.DialogInterface.OnClickListener
    {

        final SettingsPreferenceActivity this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            dialoginterface = new Intent(SettingsPreferenceActivity.this, com/dominos/beacon/service/BeaconService_);
            dialoginterface.setAction("beacon.intent.action.BEACON_RESTART");
            startService(dialoginterface);
        }

        _cls4()
        {
            this$0 = SettingsPreferenceActivity.this;
            super();
        }
    }


    private class _cls3
        implements android.content.DialogInterface.OnClickListener
    {

        final SettingsPreferenceActivity this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
        }

        _cls3()
        {
            this$0 = SettingsPreferenceActivity.this;
            super();
        }
    }

}
