// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.settings;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.EditTextPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceGroup;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import android.support.v4.content.LocalBroadcastManager;
import android.widget.EditText;
import com.google.android.gcm.GCMRegistrar;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.app.BackgroundTask;
import com.netflix.mediaclient.media.PlayerType;
import com.netflix.mediaclient.service.configuration.CastConfiguration;
import com.netflix.mediaclient.service.configuration.PlayerTypeFactory;
import com.netflix.mediaclient.service.configuration.SubtitleConfiguration;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.LogUtils;
import com.netflix.mediaclient.util.StringUtils;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.settings:
//            OpenSourceLicensesActivity

public class SettingsFragment extends PreferenceFragment
{

    private static final String FAKE_KEY_ENABLE_NOTIFICATIONS = "nf_notification_enable";
    private static final String FAKE_KEY_PLAYER_TYPE = "ui.playertype";
    private static final String FAKE_KEY_SUBTITLE_CONFIG = "ui.subtitleConfig";
    private static final String KEY_PREF_NOTIFICATION = "pref.notification";
    private static final String PLAYER_TYPE_DEFAULT = "DEFAULT";
    private static final String PLAYER_TYPE_JPLAYER = "JPLAYER";
    private static final String PLAYER_TYPE_JPLAYER2 = "JPLAYER2";
    private static final String PLAYER_TYPE_JPLAYERBASE = "JPLAYERBASE";
    private static final String PLAYER_TYPE_XAL = "XAL";
    private static final String PLAYER_TYPE_XALMP = "XALAMP";
    private static final String PREFS_NAME = "nfxpref";
    private static final String SUBTITLE_CONFIG_DEFAULT = "DEFAULT";
    private static final String SUBTITLE_CONFIG_ENHANCED_XML = "ENHANCED_XML";
    private static final String SUBTITLE_CONFIG_SIMPLE_EVENTS = "SIMPLE_EVENTS";
    private static final String SUBTITLE_CONFIG_SIMPLE_XML = "SIMPLE_XML";
    private static final String TAG = "SettingsFragment";
    private Activity activity;

    public SettingsFragment()
    {
    }

    private void changePlayer(final PlayerType newType)
    {
        if (newType == null)
        {
            Log.w("SettingsFragment", "Invalid player type choosen! This should not happen, report it.");
            (new android.app.AlertDialog.Builder(activity)).setTitle("").setMessage(0x7f0c00fb).setPositiveButton(0x7f0c0071, null).show();
            return;
        } else
        {
            (new BackgroundTask()).execute(new Runnable() {

                final SettingsFragment this$0;
                final PlayerType val$newType;

                public void run()
                {
                    Log.w("SettingsFragment", "Updating player type!");
                    PlayerTypeFactory.setPlayerTypeForQAOverride(activity, newType);
                    Log.w("SettingsFragment", "Updating player type done.");
                }

            
            {
                this$0 = SettingsFragment.this;
                newType = playertype;
                super();
            }
            });
            return;
        }
    }

    public static Fragment create()
    {
        return new SettingsFragment();
    }

    private Intent createViewLegalTermsOfUseIntent()
    {
        return (new Intent("android.intent.action.VIEW")).setData(Uri.parse("https://www.netflix.com/TermsOfUse"));
    }

    private Intent createViewPrivacyPolicyIntent()
    {
        return (new Intent("android.intent.action.VIEW")).setData(Uri.parse("https://signup.netflix.com/PrivacyPolicy"));
    }

    private void handleCastAppIdSettings()
    {
        Preference preference = findPreference("ui.castAppId");
        if (preference != null)
        {
            preference.setSummary((new StringBuilder()).append(getText(0x7f0c01bc)).append(CastConfiguration.getCastApplicationId(activity)).toString());
            preference.setOnPreferenceChangeListener(new android.preference.Preference.OnPreferenceChangeListener() {

                final SettingsFragment this$0;

                public boolean onPreferenceChange(Preference preference1, Object obj)
                {
                    Log.d("SettingsFragment", (new StringBuilder()).append("onPreferenceChange ").append(obj).toString());
                    if (preference1 instanceof EditTextPreference)
                    {
                        preference1 = ((EditTextPreference)preference1).getEditText().getText().toString();
                        Log.d("SettingsFragment", (new StringBuilder()).append("EditText.getText(): ").append(preference1).toString());
                        (new BackgroundTask()).execute(preference1. new Runnable() {

                            final _cls7 this$1;
                            final String val$newAppId;

                            public void run()
                            {
                                CastConfiguration.setNewCastApplicationId(activity, newAppId);
                            }

            
            {
                this$1 = final__pcls7;
                newAppId = String.this;
                super();
            }
                        });
                        return true;
                    } else
                    {
                        return false;
                    }
                }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
            });
        }
    }

    private void handlePlayerType()
    {
        Preference preference = findPreference("ui.playertype");
        if (preference != null)
        {
            Log.d("SettingsFragment", "Debug: player type");
            preference.setOnPreferenceChangeListener(new android.preference.Preference.OnPreferenceChangeListener() {

                final SettingsFragment this$0;

                public boolean onPreferenceChange(Preference preference1, Object obj)
                {
                    if (obj instanceof String)
                    {
                        preference1 = (String)obj;
                        if ("DEFAULT".equals(preference1))
                        {
                            Log.d("SettingsFragment", "Reset player to default");
                            PlayerTypeFactory.resetPlayerTypeByQA(activity);
                        } else
                        if ("XAL".equals(preference1))
                        {
                            Log.d("SettingsFragment", "Set Player type to XAL");
                            changePlayer(PlayerTypeFactory.getXalPlayer());
                        } else
                        if ("XALAMP".equals(preference1))
                        {
                            Log.d("SettingsFragment", "Set Player type to XALMP");
                            changePlayer(PlayerTypeFactory.getXalmpPlayer());
                        } else
                        if ("JPLAYER".equals(preference1))
                        {
                            Log.d("SettingsFragment", "Set Player type to JPLAYER");
                            changePlayer(PlayerTypeFactory.getJPlayer());
                        } else
                        if ("JPLAYERBASE".equals(preference1))
                        {
                            Log.d("SettingsFragment", "Set Player type to JPLAYERBASE");
                            changePlayer(PlayerTypeFactory.getJPlayerBase());
                        } else
                        if ("JPLAYER2".equals(preference1))
                        {
                            Log.d("SettingsFragment", "Set Player type to JPLAYER2");
                            changePlayer(PlayerTypeFactory.getJPlayer2());
                        } else
                        {
                            Log.e("SettingsFragment", (new StringBuilder()).append("Received unexpected value for player type ").append(preference1).toString());
                        }
                    } else
                    {
                        Log.e("SettingsFragment", (new StringBuilder()).append("Received unexpected NON string value for player type ").append(obj).toString());
                    }
                    return true;
                }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
            });
            if (preference instanceof ListPreference)
            {
                populatePlayerTypes((ListPreference)preference);
                return;
            } else
            {
                Log.e("SettingsFragment", "Preference player type is NOT list preference!");
                return;
            }
        } else
        {
            Log.w("SettingsFragment", "Debug: player overlay not found");
            return;
        }
    }

    private void handlePushNotificationsSettings()
    {
        if (!isGcmSupported())
        {
            Log.d("SettingsFragment", "Notifications are NOT supported!");
            removeNotificationGroup();
            return;
        }
        Log.d("SettingsFragment", "Enable notifications");
        boolean flag = isRegisteredForPushNotifications();
        if (Log.isLoggable("SettingsFragment", 3))
        {
            Log.d("SettingsFragment", (new StringBuilder()).append("Notifications were enabled ").append(flag).toString());
        }
        CheckBoxPreference checkboxpreference = (CheckBoxPreference)findPreference("nf_notification_enable");
        if (checkboxpreference != null)
        {
            checkboxpreference.setChecked(flag);
            checkboxpreference.setOnPreferenceClickListener(new android.preference.Preference.OnPreferenceClickListener() {

                final SettingsFragment this$0;

                public boolean onPreferenceClick(Preference preference)
                {
                    Log.d("SettingsFragment", "Notification enabled clicked");
                    if (preference instanceof CheckBoxPreference)
                    {
                        if (((CheckBoxPreference)preference).isChecked())
                        {
                            Log.d("SettingsFragment", "Register for notifications");
                            preference = new Intent("com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_OPTIN");
                            preference.addCategory("com.netflix.mediaclient.intent.category.PUSH");
                            LocalBroadcastManager.getInstance(activity).sendBroadcast(preference);
                        } else
                        {
                            Log.d("SettingsFragment", "Unregister from notifications");
                            preference = new Intent("com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_OPTOUT");
                            preference.addCategory("com.netflix.mediaclient.intent.category.PUSH");
                            LocalBroadcastManager.getInstance(activity).sendBroadcast(preference);
                        }
                    } else
                    {
                        Log.e("SettingsFragment", "We did not received notification checkbox preference!");
                    }
                    return true;
                }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
            });
            return;
        } else
        {
            removeNotificationGroup();
            return;
        }
    }

    private void handleSubtitleConfig()
    {
        Preference preference = findPreference("ui.subtitleConfig");
        if (preference != null)
        {
            Log.d("SettingsFragment", "Debug: subtitle config");
            preference.setOnPreferenceChangeListener(new android.preference.Preference.OnPreferenceChangeListener() {

                final SettingsFragment this$0;

                public boolean onPreferenceChange(Preference preference1, Object obj)
                {
                    if (obj instanceof String)
                    {
                        preference1 = (String)obj;
                        if ("DEFAULT".equals(preference1))
                        {
                            Log.d("SettingsFragment", "Sets ENHANCED XML subtitle configuration (default)");
                            SubtitleConfiguration.clearQaLocalOverride(activity);
                            updateSubtitleConfig(SubtitleConfiguration.DEFAULT);
                        } else
                        if ("ENHANCED_XML".equals(preference1))
                        {
                            Log.d("SettingsFragment", "Sets ENHANCED XML subtitle configuration (default)");
                            SubtitleConfiguration.updateQaLocalOverride(activity, Integer.valueOf(SubtitleConfiguration.ENHANCED_XML.getLookupType()));
                            updateSubtitleConfig(SubtitleConfiguration.ENHANCED_XML);
                        } else
                        if ("SIMPLE_XML".equals(preference1))
                        {
                            Log.d("SettingsFragment", "Sets SIMPLE XML subtitle configuration");
                            SubtitleConfiguration.updateQaLocalOverride(activity, Integer.valueOf(SubtitleConfiguration.SIMPLE_XML.getLookupType()));
                            updateSubtitleConfig(SubtitleConfiguration.SIMPLE_XML);
                        } else
                        if ("SIMPLE_EVENTS".equals(preference1))
                        {
                            Log.d("SettingsFragment", "Sets SIMPLE EVENTS subtitle configuration (legacy)");
                            SubtitleConfiguration.updateQaLocalOverride(activity, Integer.valueOf(SubtitleConfiguration.SIMPLE_EVENTS.getLookupType()));
                            updateSubtitleConfig(SubtitleConfiguration.SIMPLE_EVENTS);
                        } else
                        {
                            Log.e("SettingsFragment", (new StringBuilder()).append("Received unexpected value for player type ").append(preference1).toString());
                        }
                    } else
                    {
                        Log.e("SettingsFragment", (new StringBuilder()).append("Received unexpected NON string value for player type ").append(obj).toString());
                    }
                    return true;
                }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
            });
            if (preference instanceof ListPreference)
            {
                populateSubtitleConfig((ListPreference)preference);
                return;
            } else
            {
                Log.e("SettingsFragment", "Preference player type is NOT list preference!");
                return;
            }
        } else
        {
            Log.w("SettingsFragment", "Debug: player overlay not found");
            return;
        }
    }

    private boolean isGcmSupported()
    {
        try
        {
            Log.d("SettingsFragment", "Verifies that the device supports GCM");
            GCMRegistrar.checkDevice(activity);
        }
        catch (Throwable throwable)
        {
            Log.e("SettingsFragment", "Device does NOT supports GCM");
            return false;
        }
        return true;
    }

    private boolean isRegisteredForPushNotifications()
    {
        String s = GCMRegistrar.getRegistrationId(activity);
        Log.d("SettingsFragment", (new StringBuilder()).append("RegId ").append(s).toString());
        return !StringUtils.isEmpty(s);
    }

    private void populatePlayerTypes(ListPreference listpreference)
    {
        PlayerType playertype = PlayerTypeFactory.getCurrentType(activity);
        boolean flag = PlayerTypeFactory.isDefault(activity);
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(getString(0x7f0c00fa)).append(" ");
        stringbuilder.append(PlayerTypeFactory.findDefaultPlayerType().getDescription());
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        arraylist.add(stringbuilder.toString());
        arraylist1.add("DEFAULT");
        if (AndroidUtils.isOpenMaxALSupported())
        {
            arraylist.add(getText(0x7f0c011a));
            arraylist1.add("XAL");
            if (PlayerTypeFactory.isXalPlayer(playertype))
            {
                if (!flag)
                {
                    listpreference.setDefaultValue("XAL");
                }
                listpreference.setValue("XAL");
            }
            arraylist.add(getText(0x7f0c011b));
            arraylist1.add("XALAMP");
            if (PlayerTypeFactory.isXalmpPlayer(playertype))
            {
                if (!flag)
                {
                    listpreference.setDefaultValue("XALAMP");
                }
                listpreference.setValue("XALAMP");
            }
        }
        if (PlayerTypeFactory.isPlayerTypeSupported(PlayerType.device10))
        {
            arraylist.add(getText(0x7f0c0120));
            arraylist1.add("JPLAYER");
            if (PlayerTypeFactory.isJPlayer(playertype))
            {
                if (!flag)
                {
                    listpreference.setDefaultValue("JPLAYER");
                }
                listpreference.setValue("JPLAYER");
            }
        }
        if (PlayerTypeFactory.isPlayerTypeSupported(PlayerType.device11))
        {
            arraylist.add(getText(0x7f0c0121));
            arraylist1.add("JPLAYERBASE");
            if (PlayerTypeFactory.isJPlayerBase(playertype))
            {
                if (!flag)
                {
                    listpreference.setDefaultValue("JPLAYERBASE");
                }
                listpreference.setValue("JPLAYERBASE");
            }
        }
        if (PlayerTypeFactory.isPlayerTypeSupported(PlayerType.device12))
        {
            arraylist.add(getText(0x7f0c0122));
            arraylist1.add("JPLAYER2");
            if (PlayerTypeFactory.isJPlayer2(playertype))
            {
                if (!flag)
                {
                    listpreference.setDefaultValue("JPLAYER2");
                }
                listpreference.setValue("JPLAYER2");
            }
        }
        listpreference.setEntries((CharSequence[])arraylist.toArray(new CharSequence[arraylist.size()]));
        listpreference.setEntryValues((CharSequence[])arraylist1.toArray(new CharSequence[arraylist1.size()]));
    }

    private void populateSubtitleConfig(ListPreference listpreference)
    {
        SubtitleConfiguration subtitleconfiguration = SubtitleConfiguration.loadQaLocalOverride(activity);
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        arraylist.add(getText(0x7f0c01aa));
        arraylist1.add("DEFAULT");
        arraylist.add(getText(0x7f0c01ab));
        arraylist1.add("ENHANCED_XML");
        arraylist.add(getText(0x7f0c01ac));
        arraylist1.add("SIMPLE_XML");
        arraylist.add(getText(0x7f0c01ad));
        arraylist1.add("SIMPLE_EVENTS");
        listpreference.setDefaultValue("DEFAULT");
        if (subtitleconfiguration == SubtitleConfiguration.SIMPLE_EVENTS)
        {
            listpreference.setValue("SIMPLE_EVENTS");
        } else
        if (subtitleconfiguration == SubtitleConfiguration.SIMPLE_XML)
        {
            listpreference.setValue("SIMPLE_XML");
        } else
        if (subtitleconfiguration == SubtitleConfiguration.ENHANCED_XML)
        {
            listpreference.setValue("ENHANCED_XML");
        } else
        {
            listpreference.setValue("DEFAULT");
        }
        listpreference.setEntries((CharSequence[])arraylist.toArray(new CharSequence[arraylist.size()]));
        listpreference.setEntryValues((CharSequence[])arraylist1.toArray(new CharSequence[arraylist1.size()]));
    }

    private void removeNotificationGroup()
    {
        CheckBoxPreference checkboxpreference = (CheckBoxPreference)findPreference("nf_notification_enable");
        PreferenceScreen preferencescreen = getPreferenceScreen();
        PreferenceGroup preferencegroup = (PreferenceGroup)findPreference("pref.notification");
        if (preferencegroup != null)
        {
            if (checkboxpreference != null)
            {
                preferencegroup.removePreference(checkboxpreference);
            }
            preferencescreen.removePreference(preferencegroup);
        }
    }

    private void updateAboutDevice()
    {
        Object obj;
        String s;
        int i;
        s = getString(0x7f0c0136);
        i = 0;
        obj = s;
        PackageInfo packageinfo = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 0);
        obj = s;
        s = packageinfo.versionName;
        obj = s;
        int j = packageinfo.versionCode;
        obj = s;
        i = j;
_L2:
        obj = (new StringBuilder()).append(((String) (obj)));
        if (i > 0)
        {
            ((StringBuilder) (obj)).append(" (code ").append(i).append(")").append(", ");
        }
        ((StringBuilder) (obj)).append("OS API: ").append(AndroidUtils.getAndroidVersion()).append("\n").append("model: ").append(Build.MODEL).append(", ").append("build: ").append(Build.DISPLAY);
        findPreference("ui.about").setSummary(((StringBuilder) (obj)).toString());
        findPreference("ui.about").setSelectable(false);
        return;
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        Log.handleException("SettingsFragment", namenotfoundexception);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void updateSubtitleConfig(SubtitleConfiguration subtitleconfiguration)
    {
        Log.d("SettingsFragment", "Update subtitle config");
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.PLAYER_SUBTITLE_CONFIG_CHANGED");
        intent.addCategory("com.netflix.mediaclient.intent.category.PLAYER");
        intent.putExtra("lookupType", subtitleconfiguration.getLookupType());
        LocalBroadcastManager.getInstance(activity).sendBroadcast(intent);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        activity = getActivity();
        getPreferenceManager().setSharedPreferencesMode(0);
        getPreferenceManager().setSharedPreferencesName("nfxpref");
        addPreferencesFromResource(0x7f050001);
        findPreference(getString(0x7f0c0052)).setIntent(OpenSourceLicensesActivity.create(activity));
        bundle = findPreference("pref.privacy");
        bundle.setIntent(createViewPrivacyPolicyIntent());
        bundle.setOnPreferenceClickListener(new android.preference.Preference.OnPreferenceClickListener() {

            final SettingsFragment this$0;

            public boolean onPreferenceClick(Preference preference)
            {
                LogUtils.reportUiModalViewChanged(activity, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.privacyPolicy);
                return false;
            }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
        });
        bundle = findPreference("pref.terms");
        bundle.setIntent(createViewLegalTermsOfUseIntent());
        bundle.setOnPreferenceClickListener(new android.preference.Preference.OnPreferenceClickListener() {

            final SettingsFragment this$0;

            public boolean onPreferenceClick(Preference preference)
            {
                LogUtils.reportUiModalViewChanged(activity, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.legalTerms);
                return false;
            }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
        });
        updateAboutDevice();
        ((PreferenceGroup)findPreference("pref.screen")).removePreference(findPreference("pref.qa.debugonly"));
        handlePushNotificationsSettings();
    }



}
