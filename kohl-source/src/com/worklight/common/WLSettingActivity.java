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
import android.util.Patterns;
import android.view.Display;
import android.view.WindowManager;
import android.widget.EditText;
import com.worklight.nativeandroid.common.WLUtils;
import com.worklight.wlclient.api.WLClient;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.worklight.common:
//            WLConfig

public class WLSettingActivity extends PreferenceActivity
{

    public static final String APP_ID_PREF_KEY = "appIdPref";
    public static final String APP_VERSION_PREF_KEY = "appVersionPref";
    public static final String EDIT_WL_SERVER_URL_PREF_KEY = "editWLServerURLPref";
    public static final String LAST_SETTINGS_URL_STATE_PREF_KEY = "lastSettingsUrlStatePref";
    public static final String MODIFY_WL_SERVER_URL_PREF_KEY = "resetWLServerURLPref";
    private static final String NEW_APP_ID_PREF_KEY = "newAppIdPref";
    private static final String NEW_APP_VERSION_PREF_KEY = "newAppVersionPref";
    private static final String NEW_LINE = "\n";
    private EditTextPreference appIdEditTextPreference;
    private EditTextPreference appVersionEditTextPreference;
    private CheckBoxPreference modifyServerURLCheckBoxPreference;
    private EditTextPreference serverURLEditTextPreference;
    private String serverURLafter;
    private String serverURLbefore;

    public WLSettingActivity()
    {
        serverURLbefore = null;
        serverURLafter = null;
        serverURLEditTextPreference = null;
        modifyServerURLCheckBoxPreference = null;
        appIdEditTextPreference = null;
        appVersionEditTextPreference = null;
    }

    private void createModifyServerCheckbox()
    {
        modifyServerURLCheckBoxPreference = new CheckBoxPreference(this);
        modifyServerURLCheckBoxPreference.setTitle(WLUtils.getResourceString("serverAddress", this));
        modifyServerURLCheckBoxPreference.setSummary(WLUtils.getResourceString("changeServerAddress", this));
        modifyServerURLCheckBoxPreference.setKey("resetWLServerURLPref");
        modifyServerURLCheckBoxPreference.setPersistent(true);
        modifyServerURLCheckBoxPreference.setChecked(WLConfig.getInstance().shouldUseCustomServerUrl());
    }

    private void createServerURLTextField()
    {
        String s = WLUtils.getResourceString("summaryWLServerUrl", this);
        serverURLEditTextPreference = new EditTextPreference(this);
        serverURLEditTextPreference.setTitle(WLUtils.getResourceString("titleWLServerUrl", this));
        serverURLEditTextPreference.setKey("editWLServerURLPref");
        serverURLEditTextPreference.setPositiveButtonText(WLUtils.getResourceString("OKTitleWLServerUrl", this));
        serverURLEditTextPreference.setNegativeButtonText(WLUtils.getResourceString("cancel", this));
        serverURLEditTextPreference.setDefaultValue(serverURLbefore);
        String s1 = WLConfig.getInstance().readWLPref("lastSettingsUrlStatePref");
        EditTextPreference edittextpreference = serverURLEditTextPreference;
        if (s1 != null)
        {
            s = (new StringBuilder()).append(s1).append("\n").append(s).toString();
        }
        edittextpreference.setSummary(s);
        serverURLEditTextPreference.setEnabled(WLConfig.getInstance().shouldUseCustomServerUrl());
        serverURLEditTextPreference.setPersistent(true);
    }

    private EditTextPreference createTextField(String s, String s1, String s2)
    {
        EditTextPreference edittextpreference = new EditTextPreference(this);
        edittextpreference.setTitle(WLUtils.getResourceString(s, this));
        String s3 = WLConfig.getInstance().readWLPref(s1);
        s = s3;
        if (s3 == null)
        {
            s = s2;
        }
        WLConfig.getInstance().writeWLPref(s1, s);
        edittextpreference.setSummary(s);
        edittextpreference.setDefaultValue(s);
        edittextpreference.setKey(s1);
        edittextpreference.setPersistent(true);
        edittextpreference.setPositiveButtonText(WLUtils.getResourceString("OKTitleWLServerUrl", this));
        edittextpreference.setNegativeButtonText(WLUtils.getResourceString("cancel", this));
        s = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(s);
        int i = ((DisplayMetrics) (s)).widthPixels;
        edittextpreference.getEditText().setWidth(i - 20);
        return edittextpreference;
    }

    private boolean isUrlChanged()
    {
        boolean flag = true;
        if (serverURLafter != null) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        return flag;
_L2:
        if (serverURLbefore != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (serverURLafter != null) goto _L4; else goto _L3
_L3:
        return false;
        if (!serverURLbefore.equals(serverURLafter)) goto _L4; else goto _L5
_L5:
        return false;
    }

    private boolean isWebResourcesChanged()
    {
        boolean flag2 = false;
        boolean flag;
        boolean flag1;
        if (!WLConfig.getInstance().getAppId().equals(WLConfig.getInstance().readWLPref("newAppIdPref")))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!WLConfig.getInstance().getApplicationVersion().equals(WLConfig.getInstance().readWLPref("newAppVersionPref")))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag || flag1)
        {
            flag2 = true;
        }
        return flag2;
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
            serverURLEditTextPreference.setSummary((new StringBuilder()).append(serverURLbefore).append("\n").append(s).toString());
            return;
        } else
        {
            serverURLEditTextPreference.setSummary((new StringBuilder()).append(serverURLafter).append("\n").append(s).toString());
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
        bundle = getPreferenceManager().createPreferenceScreen(this);
        bundle.setTitle(WLUtils.getResourceString("worklightSettingsTitle", this));
        PreferenceCategory preferencecategory = new PreferenceCategory(this);
        preferencecategory.setTitle(WLUtils.getResourceString("networkSettingsTitleWLServerUrl", this));
        bundle.addPreference(preferencecategory);
        serverURLbefore = WLClient.getInstance().getServerUrl().toString();
        createModifyServerCheckbox();
        createServerURLTextField();
        preferencecategory.addPreference(modifyServerURLCheckBoxPreference);
        preferencecategory.addPreference(serverURLEditTextPreference);
        preferencecategory = new PreferenceCategory(this);
        preferencecategory.setTitle(WLUtils.getResourceString("wlWebResourcesCategory", this));
        bundle.addPreference(preferencecategory);
        WLConfig wlconfig = WLConfig.getInstance();
        appIdEditTextPreference = createTextField("wlAppIdTitle", "newAppIdPref", wlconfig.getAppId());
        appVersionEditTextPreference = createTextField("wlAppVersionTitle", "newAppVersionPref", wlconfig.getApplicationVersion());
        preferencecategory.addPreference(appIdEditTextPreference);
        preferencecategory.addPreference(appVersionEditTextPreference);
        setPreferenceScreen(bundle);
        modifyServerURLCheckBoxPreference.setOnPreferenceChangeListener(new android.preference.Preference.OnPreferenceChangeListener() {

            final WLSettingActivity this$0;

            public boolean onPreferenceChange(Preference preference, Object obj)
            {
                if (((Boolean)obj).booleanValue())
                {
                    WLConfig.getInstance().useCustomServerUrl(true);
                    serverURLEditTextPreference.setEnabled(true);
                    serverURLafter = serverURLEditTextPreference.getText();
                    try
                    {
                        WLClient.getInstance().setServerUrl(new URL(serverURLafter));
                    }
                    // Misplaced declaration of an exception variable
                    catch (Preference preference)
                    {
                        return false;
                    }
                } else
                {
                    WLConfig.getInstance().useCustomServerUrl(false);
                    serverURLafter = WLClient.getInstance().getServerUrl().toString();
                    serverURLEditTextPreference.setEnabled(false);
                }
                return true;
            }

            
            {
                this$0 = WLSettingActivity.this;
                super();
            }
        });
        serverURLEditTextPreference.setOnPreferenceChangeListener(new android.preference.Preference.OnPreferenceChangeListener() {

            final WLSettingActivity this$0;

            public boolean onPreferenceChange(Preference preference, Object obj)
            {
                serverURLafter = (String)obj;
                boolean flag;
                if (serverURLafter.startsWith("http://["))
                {
                    break MISSING_BLOCK_LABEL_44;
                }
                flag = serverURLafter.startsWith("https://[");
                if (!flag)
                {
                    break MISSING_BLOCK_LABEL_240;
                }
                class _cls1
                    implements android.content.DialogInterface.OnClickListener
                {

                    final _cls2 this$1;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                    }

            
            {
                this$1 = _cls2.this;
                super();
            }
                }

                preference = serverURLafter.substring(serverURLafter.indexOf('[') + 1, serverURLafter.indexOf(']'));
                obj = serverURLafter.substring(serverURLafter.indexOf(']') + 1);
                if (!preference.matches("(([0-9a-fA-F]{1,4}:){7,7}[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,7}:|([0-9a-fA-F]{1,4}:){1,6}:[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,5}(:[0-9a-fA-F]{1,4}){1,2}|([0-9a-fA-F]{1,4}:){1,4}(:[0-9a-fA-F]{1,4}){1,3}|([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F]{1,4}){1,4}|([0-9a-fA-F]{1,4}:){1,2}(:[0-9a-fA-F]{1,4}){1,5}|[0-9a-fA-F]{1,4}:((:[0-9a-fA-F]{1,4}){1,6})|:((:[0-9a-fA-F]{1,4}){1,7}|:)|fe80:(:[0-9a-fA-F]{0,4}){0,4}%[0-9a-zA-Z]{1,}|::(ffff(:0{1,4}){0,1}:){0,1}((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]).){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])|([0-9a-fA-F]{1,4}:){1,4}:((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]).){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]))"))
                {
                    throw new MalformedURLException();
                }
                try
                {
                    if (!Patterns.WEB_URL.matcher((new StringBuilder()).append("http://9.8.7.6").append(((String) (obj))).toString()).matches())
                    {
                        throw new MalformedURLException();
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Preference preference)
                {
                    try
                    {
                        throw new MalformedURLException();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Preference preference)
                    {
                        (new android.app.AlertDialog.Builder(WLSettingActivity.this)).setTitle(WLUtils.getResourceString("titleInvalidWLServerUrl", WLSettingActivity.this)).setMessage(WLUtils.getResourceString("errorInvalidWLServerUrl", serverURLafter, WLSettingActivity.this)).setNeutralButton(WLUtils.getResourceString("OKTitleWLServerUrl", WLSettingActivity.this), new _cls1()).show();
                    }
                    return false;
                }
                break MISSING_BLOCK_LABEL_282;
                new URL(serverURLafter);
                if (!Patterns.WEB_URL.matcher(serverURLafter).matches())
                {
                    throw new MalformedURLException();
                }
                WLClient.getInstance().setServerUrl(new URL(serverURLafter));
                WLConfig.getInstance().writeWLPref("lastSettingsUrlStatePref", serverURLafter);
                setServerURLFieldSummary();
                return true;
            }

            
            {
                this$0 = WLSettingActivity.this;
                super();
            }
        });
        appIdEditTextPreference.setOnPreferenceChangeListener(new android.preference.Preference.OnPreferenceChangeListener() {

            final WLSettingActivity this$0;

            public boolean onPreferenceChange(Preference preference, Object obj)
            {
                preference = (String)obj;
                WLConfig.getInstance().writeWLPref("newAppIdPref", preference);
                appIdEditTextPreference.setSummary(preference);
                return true;
            }

            
            {
                this$0 = WLSettingActivity.this;
                super();
            }
        });
        appVersionEditTextPreference.setOnPreferenceChangeListener(new android.preference.Preference.OnPreferenceChangeListener() {

            final WLSettingActivity this$0;

            public boolean onPreferenceChange(Preference preference, Object obj)
            {
                preference = (String)obj;
                WLConfig.getInstance().writeWLPref("newAppVersionPref", preference);
                appVersionEditTextPreference.setSummary(preference);
                return true;
            }

            
            {
                this$0 = WLSettingActivity.this;
                super();
            }
        });
    }




/*
    static String access$102(WLSettingActivity wlsettingactivity, String s)
    {
        wlsettingactivity.serverURLafter = s;
        return s;
    }

*/



}
