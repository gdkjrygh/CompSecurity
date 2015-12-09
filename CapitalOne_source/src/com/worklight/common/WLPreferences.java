// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceCategory;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.widget.EditText;
import com.worklight.androidgap.WLDroidGap;
import java.net.MalformedURLException;
import java.net.URL;

// Referenced classes of package com.worklight.common:
//            WLUtils, WLConfig

public class WLPreferences extends PreferenceActivity
{

    public static final String APP_ID_PREF_KEY = "appIdPref";
    public static final String APP_VERSION_PREF_KEY = "appVersionPref";
    public static final String EDIT_WL_SERVER_URL_PREF_KEY = "editWLServerURLPref";
    public static final String LAST_SETTINGS_URL_STATE_PREF_KEY = "lastSettingsUrlStatePref";
    public static final String MODIFY_WL_SERVER_URL_PREF_KEY = "resetWLServerURLPref";
    private static final String NEW_APP_ID_PREF_KEY = "newAppIdPref";
    private static final String NEW_APP_VERSION_PREF_KEY = "newAppVersionPref";
    private static final String NEW_LINE = "\n";
    public static final String SHOULD_MODIFY_URL_PREF_KEY = "shouldModifyUrlPref";
    public static final String WL_SERVER_URL = "WLServerURL";
    private EditTextPreference appIdEditTextPreference;
    private EditTextPreference appVersionEditTextPreference;
    private CheckBoxPreference modifyServerURLCheckBoxPreference;
    private EditTextPreference serverURLEditTextPreference;
    private String serverURLafter;
    private String serverURLbefore;
    private WLConfig wlConfig;

    public WLPreferences()
    {
        serverURLbefore = null;
        serverURLafter = null;
        serverURLEditTextPreference = null;
        modifyServerURLCheckBoxPreference = null;
        appIdEditTextPreference = null;
        appVersionEditTextPreference = null;
        wlConfig = null;
    }

    private void createModifyServerCheckbox()
    {
        modifyServerURLCheckBoxPreference = new CheckBoxPreference(this);
        modifyServerURLCheckBoxPreference.setTitle(WLUtils.getResourceString("serverAddress", this));
        modifyServerURLCheckBoxPreference.setSummary(WLUtils.getResourceString("changeServerAddress", this));
        modifyServerURLCheckBoxPreference.setKey("resetWLServerURLPref");
        modifyServerURLCheckBoxPreference.setPersistent(true);
    }

    private void createServerURLTextField()
    {
        String s = WLUtils.getResourceString("summaryWLServerUrl", this);
        serverURLEditTextPreference = new EditTextPreference(this);
        serverURLbefore = WLUtils.readWLPref(getApplicationContext(), "WLServerURL");
        if (serverURLbefore == null || serverURLbefore.trim().equals(""))
        {
            serverURLbefore = wlConfig.getRootURL();
        }
        serverURLEditTextPreference.setTitle(WLUtils.getResourceString("titleWLServerUrl", this));
        serverURLEditTextPreference.setKey("editWLServerURLPref");
        serverURLEditTextPreference.setDefaultValue(serverURLbefore);
        String s1 = WLUtils.readWLPref(getApplicationContext(), "lastSettingsUrlStatePref");
        EditTextPreference edittextpreference = serverURLEditTextPreference;
        boolean flag;
        if (s1 != null)
        {
            s = (new StringBuilder(String.valueOf(s1))).append("\n").append(s).toString();
        }
        edittextpreference.setSummary(s);
        s = WLUtils.readWLPref(getApplicationContext(), "shouldModifyUrlPref");
        edittextpreference = serverURLEditTextPreference;
        if (s == null || !Boolean.valueOf(s).booleanValue())
        {
            flag = false;
        } else
        {
            flag = true;
        }
        edittextpreference.setEnabled(flag);
        serverURLEditTextPreference.setPersistent(true);
    }

    private EditTextPreference createTextField(String s, String s1, String s2)
    {
        EditTextPreference edittextpreference = new EditTextPreference(this);
        edittextpreference.setTitle(WLUtils.getResourceString(s, this));
        String s3 = WLUtils.readWLPref(getApplicationContext(), s1);
        s = s3;
        if (s3 == null)
        {
            s = s2;
        }
        WLUtils.writeWLPref(getApplicationContext(), s1, s);
        edittextpreference.setSummary(s);
        edittextpreference.setDefaultValue(s);
        edittextpreference.setKey(s1);
        edittextpreference.setPersistent(true);
        s = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(s);
        int i = ((DisplayMetrics) (s)).widthPixels;
        edittextpreference.getEditText().setWidth(i - 20);
        return edittextpreference;
    }

    private boolean isUrlChanged()
    {
        if (serverURLafter != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (serverURLbefore != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (serverURLafter == null) goto _L1; else goto _L3
_L3:
        return true;
        if (serverURLbefore.equals(serverURLafter)) goto _L1; else goto _L4
_L4:
        return true;
    }

    private boolean isWebResourcesChanged()
    {
        boolean flag;
        boolean flag1;
        if (wlConfig.getAppId().equals(WLUtils.readWLPref(getApplicationContext(), "newAppIdPref")))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (wlConfig.getApplicationVersion().equals(WLUtils.readWLPref(getApplicationContext(), "newAppVersionPref")))
        {
            flag1 = false;
        } else
        {
            flag1 = true;
        }
        return flag || flag1;
    }

    private void setServerURLFieldSummary()
    {
        String s1 = (String)serverURLEditTextPreference.getSummary();
        String s = s1;
        if (s1.contains("\n"))
        {
            s = s1.substring(s1.lastIndexOf("\n") + 1, s1.length());
        }
        if (serverURLafter == null)
        {
            serverURLEditTextPreference.setSummary((new StringBuilder(String.valueOf(serverURLbefore))).append("\n").append(s).toString());
            return;
        } else
        {
            serverURLEditTextPreference.setSummary((new StringBuilder(String.valueOf(serverURLafter))).append("\n").append(s).toString());
            return;
        }
    }

    public void onBackPressed()
    {
        Intent intent = new Intent();
        intent.putExtra("isServerURLChanged", isUrlChanged());
        intent.putExtra("serverURL", serverURLafter);
        intent.putExtra("isWebResourcesChanged", isWebResourcesChanged());
        setResult(-1, intent);
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        wlConfig = new WLConfig(getApplication());
        bundle = getPreferenceManager().createPreferenceScreen(this);
        PreferenceCategory preferencecategory = new PreferenceCategory(this);
        preferencecategory.setTitle(WLUtils.getResourceString("networkSettingsTitleWLServerUrl", this));
        bundle.addPreference(preferencecategory);
        serverURLbefore = WLUtils.readWLPref(getApplicationContext(), "WLServerURL");
        createModifyServerCheckbox();
        createServerURLTextField();
        preferencecategory.addPreference(modifyServerURLCheckBoxPreference);
        preferencecategory.addPreference(serverURLEditTextPreference);
        preferencecategory = new PreferenceCategory(this);
        preferencecategory.setTitle(WLUtils.getResourceString("wlWebResourcesCategory", this));
        bundle.addPreference(preferencecategory);
        appIdEditTextPreference = createTextField("wlAppIdTitle", "newAppIdPref", WLDroidGap.getWLConfig().getAppId());
        appVersionEditTextPreference = createTextField("wlAppVersionTitle", "newAppVersionPref", "1.0");
        preferencecategory.addPreference(appIdEditTextPreference);
        preferencecategory.addPreference(appVersionEditTextPreference);
        setPreferenceScreen(bundle);
        modifyServerURLCheckBoxPreference.setOnPreferenceChangeListener(new android.preference.Preference.OnPreferenceChangeListener() {

            final WLPreferences this$0;

            public boolean onPreferenceChange(Preference preference, Object obj)
            {
                if (((Boolean)obj).booleanValue())
                {
                    WLUtils.writeWLPref(getApplicationContext(), "shouldModifyUrlPref", "true");
                    serverURLEditTextPreference.setEnabled(true);
                    serverURLafter = serverURLEditTextPreference.getText();
                    WLUtils.writeWLPref(getApplicationContext(), "WLServerURL", serverURLafter);
                    return true;
                } else
                {
                    WLUtils.writeWLPref(getApplicationContext(), "shouldModifyUrlPref", "false");
                    serverURLafter = wlConfig.getRootURL();
                    WLUtils.writeWLPref(getApplicationContext(), "WLServerURL", serverURLafter);
                    serverURLEditTextPreference.setEnabled(false);
                    return true;
                }
            }

            
            {
                this$0 = WLPreferences.this;
                super();
            }
        });
        serverURLEditTextPreference.setOnPreferenceChangeListener(new android.preference.Preference.OnPreferenceChangeListener() {

            final WLPreferences this$0;

            public boolean onPreferenceChange(Preference preference, Object obj)
            {
                serverURLafter = (String)obj;
                try
                {
                    new URL(serverURLafter);
                }
                // Misplaced declaration of an exception variable
                catch (Preference preference)
                {
                    (new android.app.AlertDialog.Builder(WLPreferences.this)).setTitle(WLUtils.getResourceString("titleInvalidWLServerUrl", WLPreferences.this)).setMessage((new StringBuilder(String.valueOf(serverURLafter))).append(" ").append(WLUtils.getResourceString("errorInvalidWLServerUrl", WLPreferences.this)).toString()).setNeutralButton(WLUtils.getResourceString("OKTitleWLServerUrl", WLPreferences.this), new android.content.DialogInterface.OnClickListener() {

                        final _cls2 this$1;

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                        }

            
            {
                this$1 = _cls2.this;
                super();
            }
                    }).show();
                    return false;
                }
                WLUtils.writeWLPref(getApplicationContext(), "WLServerURL", serverURLafter);
                WLUtils.writeWLPref(getApplicationContext(), "lastSettingsUrlStatePref", serverURLafter);
                setServerURLFieldSummary();
                return true;
            }

            
            {
                this$0 = WLPreferences.this;
                super();
            }
        });
        appIdEditTextPreference.setOnPreferenceChangeListener(new android.preference.Preference.OnPreferenceChangeListener() {

            final WLPreferences this$0;

            public boolean onPreferenceChange(Preference preference, Object obj)
            {
                preference = (String)obj;
                WLUtils.writeWLPref(getApplicationContext(), "newAppIdPref", preference);
                appIdEditTextPreference.setSummary(preference);
                return true;
            }

            
            {
                this$0 = WLPreferences.this;
                super();
            }
        });
        appVersionEditTextPreference.setOnPreferenceChangeListener(new android.preference.Preference.OnPreferenceChangeListener() {

            final WLPreferences this$0;

            public boolean onPreferenceChange(Preference preference, Object obj)
            {
                preference = (String)obj;
                WLUtils.writeWLPref(getApplicationContext(), "newAppVersionPref", preference);
                appVersionEditTextPreference.setSummary(preference);
                return true;
            }

            
            {
                this$0 = WLPreferences.this;
                super();
            }
        });
    }







}
