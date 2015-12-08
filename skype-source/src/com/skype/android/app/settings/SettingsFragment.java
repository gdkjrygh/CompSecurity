// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceGroup;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import android.preference.TwoStatePreference;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.widget.Toast;
import com.skype.Account;
import com.skype.PROPKEY;
import com.skype.Setup;
import com.skype.SkyLib;
import com.skype.android.SkypeApplication;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.SkypePreferenceFragment;
import com.skype.android.ads.AdManager;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.AnalyticsParameter;
import com.skype.android.analytics.AttributeContainer;
import com.skype.android.analytics.ExperimentTag;
import com.skype.android.analytics.StatsType;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.NavigationUrl;
import com.skype.android.app.shortcircuit.AutoBuddyManager;
import com.skype.android.app.shortcircuit.AutoBuddyPreferenceResult;
import com.skype.android.app.shortcircuit.OnAutoBuddyPreferenceResult;
import com.skype.android.app.shortcircuit.ShortCircuitProfileWebClient;
import com.skype.android.app.signin.SignoutHelper;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.res.Urls;
import com.skype.android.service.SyncAccountUtil;
import com.skype.android.telemetry.SCTManager;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.cache.SpannedStringCache;
import com.skype.android.util.permission.Permission;
import com.skype.android.util.permission.PermissionHandlerAdapter;
import com.skype.android.util.permission.PermissionRequest;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.skype.android.app.settings:
//            AutoBuddyDialogPreference, AboutActivity, UserPreferences, ContactSyncDialogPreference, 
//            SettingsActivity, DebugSettingsFragment, ManageAliasesActivity, NotificationSettingsFragment

public class SettingsFragment extends SkypePreferenceFragment
{
    private final class a
        implements android.preference.Preference.OnPreferenceChangeListener
    {

        ContactSyncDialogPreference copyToPhoneBook;
        Preference generic;
        final SyncAccountUtil syncAccountUtil;
        final SettingsFragment this$0;

        public final boolean onPreferenceChange(Preference preference, Object obj)
        {
            permissionRequest.a(Permission.p, true, ((_cls1) (obj)). new PermissionHandlerAdapter() {

                final a this$1;
                final Object val$newValue;

                public final void onDenied(Set set)
                {
                    boolean flag = ((Boolean)newValue).booleanValue();
                    copyToPhoneBook.setOnPreferenceChangeListener(null);
                    set = copyToPhoneBook;
                    if (!flag)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    set.setValue(flag);
                    copyToPhoneBook.setOnPreferenceChangeListener(a.this);
                }

                public final void onGranted()
                {
                    boolean flag = ((Boolean)newValue).booleanValue();
                    syncAccountUtil.setContactSyncModePreference(flag);
                    userPrefs.setEnableSyncContacts(flag);
                    generic.setSummary(contactSyncEntries[getCopyToPhoneBookPosition(flag)]);
                }

            
            {
                this$1 = final_a1;
                newValue = Object.this;
                super();
            }
            });
            return true;
        }

        public a(Preference preference, ContactSyncDialogPreference contactsyncdialogpreference, SyncAccountUtil syncaccountutil)
        {
            this$0 = SettingsFragment.this;
            super();
            generic = preference;
            copyToPhoneBook = contactsyncdialogpreference;
            syncAccountUtil = syncaccountutil;
        }
    }


    public static final String DISPLAY_CATEGORY_KEY = "category_key";
    private static final int EVENT_SOURCE_ACCESS_UI = 1;
    private static final int EVENT_TYPE_SKYPE_WIFI_START = 1021;
    private static final int EVENT_TYPE_SKYPE_WIFI_STORE = 1022;
    private static final String EXTRA_HAS_ALIASES = "hasAliases";
    private static final int LOW_VIDEO_QUALITTY_BPS = 51200;
    Account account;
    AdManager adManager;
    Analytics analytics;
    AutoBuddyManager autoBuddyManager;
    private boolean autoBuddyOptionValue;
    EcsConfiguration configuration;
    private String contactSyncEntries[];
    private String findFriendsEntries[];
    private Boolean hasAliases;
    private ExperimentTag hideSignOutExperimentGroup;
    LayoutExperience layoutExperience;
    SkyLib lib;
    NavigationUrl navUrl;
    PermissionRequest permissionRequest;
    private String privacyRequestsFromEntries[];
    SCTManager sctManager;
    ShortCircuitProfileWebClient shortCircuitProfileWebClient;
    SpannedStringCache spannedStringCache;
    TimeUtil timeUtil;
    Urls urls;
    UserPreferences userPrefs;
    private String videoQualityEntries[];

    public SettingsFragment()
    {
    }

    private boolean addSignOutInSettings()
    {
        return !layoutExperience.isMultipane() && !hideSignOutExperimentGroup.equals(ExperimentTag.c) && !hideSignOutExperimentGroup.equals(ExperimentTag.a);
    }

    private void enableAutoBuddyOption()
    {
        AutoBuddyDialogPreference autobuddydialogpreference;
        boolean flag;
label0:
        {
            flag = true;
            if (getActivity() != null)
            {
                autobuddydialogpreference = (AutoBuddyDialogPreference)findPreference(getString(0x7f08052c));
                if (autobuddydialogpreference != null)
                {
                    break label0;
                }
            }
            return;
        }
        autobuddydialogpreference.setValue(autoBuddyOptionValue);
        if (layoutExperience.isMultipane())
        {
            if (hasAliases == null || !hasAliases.booleanValue())
            {
                flag = false;
            }
            autobuddydialogpreference.setEnabled(flag);
            return;
        } else
        {
            autobuddydialogpreference.setEnabled(true);
            return;
        }
    }

    private int getCopyToPhoneBookPosition(boolean flag)
    {
        return !flag ? 1 : 0;
    }

    private void performSignout()
    {
        (new SignoutHelper(analytics, userPrefs)).performSignout(getActivity(), getFragmentManager(), true);
    }

    private void setAboutOptions(Preference preference)
    {
        preference.setIntent(new Intent(getActivity(), com/skype/android/app/settings/AboutActivity));
        preference.setSummary(((SkypeApplication)getActivity().getApplication()).e());
    }

    private void setAllowCallsOptions(Preference preference)
    {
        int i = 0;
        preference.setPersistent(false);
        if (account.getSkypeCallPolicyProp() != com.skype.Account.SKYPECALLPOLICY.BUDDIES_OR_AUTHORIZED_CAN_CALL)
        {
            i = 1;
        }
        ((ListPreference)preference).setValueIndex(i);
        preference.setSummary(privacyRequestsFromEntries[i]);
        preference.setOnPreferenceChangeListener(new android.preference.Preference.OnPreferenceChangeListener() {

            final SettingsFragment this$0;

            public final boolean onPreferenceChange(Preference preference1, Object obj)
            {
                int k = Integer.parseInt((String)obj);
                obj = account;
                PROPKEY propkey = PROPKEY.ACCOUNT_SKYPE_CALL_POLICY;
                int j;
                if (k == 0)
                {
                    j = com.skype.Account.SKYPECALLPOLICY.BUDDIES_OR_AUTHORIZED_CAN_CALL.toInt();
                } else
                {
                    j = com.skype.Account.SKYPECALLPOLICY.EVERYONE_CAN_CALL.toInt();
                }
                ((Account) (obj)).setServersideIntProperty(propkey, j);
                preference1.setSummary(privacyRequestsFromEntries[k]);
                return true;
            }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
        });
    }

    private void setAllowDirectConnect(Preference preference)
    {
        boolean flag = false;
        preference = (TwoStatePreference)preference;
        int i = lib.getSetup().getInt("Lib/Account/PrivateSkypeMode");
        preference.setPersistent(false);
        if (i > 0)
        {
            flag = true;
        }
        preference.setChecked(flag);
        preference.setOnPreferenceChangeListener(new android.preference.Preference.OnPreferenceChangeListener() {

            final SettingsFragment this$0;

            public final boolean onPreferenceChange(Preference preference1, Object obj)
            {
                int j;
                if (!((Boolean)obj).booleanValue())
                {
                    j = 0;
                } else
                {
                    j = 1;
                }
                lib.getSetup().setInt("Lib/Account/PrivateSkypeMode", j);
                return true;
            }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
        });
    }

    private void setAllowMessagesOptions(Preference preference)
    {
        int i = 0;
        preference.setPersistent(false);
        if (account.getChatPolicyProp() != com.skype.Account.CHATPOLICY.BUDDIES_OR_AUTHORIZED_CAN_ADD)
        {
            i = 1;
        }
        ((ListPreference)preference).setValueIndex(i);
        preference.setSummary(privacyRequestsFromEntries[i]);
        preference.setOnPreferenceChangeListener(new android.preference.Preference.OnPreferenceChangeListener() {

            final SettingsFragment this$0;

            public final boolean onPreferenceChange(Preference preference1, Object obj)
            {
                int k = Integer.parseInt((String)obj);
                obj = account;
                PROPKEY propkey = PROPKEY.ACCOUNT_CHAT_POLICY;
                int j;
                if (k == 0)
                {
                    j = com.skype.Account.CHATPOLICY.BUDDIES_OR_AUTHORIZED_CAN_ADD.toInt();
                } else
                {
                    j = com.skype.Account.CHATPOLICY.EVERYONE_CAN_ADD.toInt();
                }
                ((Account) (obj)).setServersideIntProperty(propkey, j);
                preference1.setSummary(privacyRequestsFromEntries[k]);
                return true;
            }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
        });
    }

    private void setAutoBuddyOptionSummary(boolean flag)
    {
        Preference preference = (Preference)findPreference(0x7f08052c);
        if (preference != null)
        {
            int i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 1;
            }
            preference.setSummary(findFriendsEntries[i]);
        }
    }

    private void setAutoBuddyOptions(Preference preference)
    {
        preference = (AutoBuddyDialogPreference)preference;
        preference.setPersistent(true);
        setAutoBuddyOptionSummary(userPrefs.isAutoBuddyEnabledInLocalCache());
        preference.setEnabled(false);
        preference.setOnPreferenceChangeListener(new android.preference.Preference.OnPreferenceChangeListener() {

            final SettingsFragment this$0;

            public final boolean onPreferenceChange(Preference preference1, Object obj)
            {
                boolean flag = ((Boolean)obj).booleanValue();
                boolean flag1 = userPrefs.isAutoBuddyEnabledInLocalCache();
                if (TextUtils.isEmpty(userPrefs.getLocallyCachedAutoBuddy()) || flag != flag1)
                {
                    userPrefs.setLocallyCachedAutoBuddy(flag);
                    setAutoBuddyOptionSummary(flag);
                    autoBuddyManager.updateAutoBuddy(flag);
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

    private void setChatsOptions(Preference preference)
    {
        preference.setOnPreferenceClickListener(new android.preference.Preference.OnPreferenceClickListener() {

            final SettingsFragment this$0;

            public final boolean onPreferenceClick(Preference preference1)
            {
                analytics.a(AnalyticsEvent.Q, lib.getUnconsumedConversationsCount());
                lib.consumeAllConversations();
                Toast.makeText(getActivity(), 0x7f0802d4, 1).show();
                return true;
            }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
        });
    }

    private void setCopyToPhoneBookOptions(Preference preference)
    {
        ContactSyncDialogPreference contactsyncdialogpreference = (ContactSyncDialogPreference)preference;
        contactsyncdialogpreference.setPersistent(false);
        SyncAccountUtil syncaccountutil = new SyncAccountUtil(getActivity(), timeUtil);
        boolean flag = ContentResolver.getSyncAutomatically(syncaccountutil.getCurrentAccount(), "com.android.contacts");
        contactsyncdialogpreference.setValue(flag);
        int i = getCopyToPhoneBookPosition(flag);
        preference.setSummary(contactSyncEntries[i]);
        contactsyncdialogpreference.setOnPreferenceChangeListener(new a(preference, contactsyncdialogpreference, syncaccountutil));
    }

    private void setDebugOptions(Preference preference)
    {
        Intent intent = new Intent(getActivity(), com/skype/android/app/settings/SettingsActivity);
        intent.putExtra("android.intent.extra.TITLE", "Debug");
        intent.putExtra("fragmentClass", com/skype/android/app/settings/DebugSettingsFragment);
        preference.setIntent(intent);
    }

    private void setFeedbackOptions(Preference preference)
    {
        preference.setIntent(navUrl.getIntentForFeedbackPage(getActivity(), account.getSkypenameProp(), configuration.getETag()));
    }

    private void setHelpOptions(Preference preference)
    {
        preference.setIntent(navUrl.getIntentForUrl(getActivity(), urls.a(com.skype.android.res.Urls.Type.a), false, ""));
    }

    private void setManageAliasesOptions(Preference preference)
    {
        preference.setIntent(new Intent(getActivity(), com/skype/android/app/settings/ManageAliasesActivity));
        shortCircuitProfileWebClient.getVerifiedAliases();
    }

    private void setNotificationOptions(Preference preference)
    {
        Intent intent = new Intent(getActivity(), com/skype/android/app/settings/SettingsActivity);
        intent.putExtra("android.intent.extra.TITLE", getString(0x7f0802f0));
        intent.putExtra("fragmentClass", com/skype/android/app/settings/NotificationSettingsFragment);
        preference.setIntent(intent);
    }

    private void setOptions(int i)
    {
        Preference preference = (Preference)findPreference(i);
        if (preference == null) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR lookupswitch 17: default 160
    //                   2131231049: 239
    //                   2131231118: 257
    //                   2131231270: 221
    //                   2131231412: 245
    //                   2131231472: 209
    //                   2131232025: 185
    //                   2131232026: 167
    //                   2131232027: 179
    //                   2131232028: 227
    //                   2131232038: 251
    //                   2131232041: 173
    //                   2131232044: 161
    //                   2131232050: 203
    //                   2131232078: 233
    //                   2131232087: 215
    //                   2131232090: 191
    //                   2131232091: 197;
           goto _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L2:
        return;
_L14:
        setAutoBuddyOptions(preference);
        return;
_L9:
        setAllowDirectConnect(preference);
        return;
_L13:
        setCopyToPhoneBookOptions(preference);
        return;
_L10:
        setAllowMessagesOptions(preference);
        return;
_L8:
        setAllowCallsOptions(preference);
        return;
_L18:
        setUserWantsAutoAnswerOptions(preference);
        return;
_L19:
        setVideoMonitorOptions(preference);
        return;
_L15:
        setVideoQualityOptions(preference);
        return;
_L7:
        setNotificationOptions(preference);
        return;
_L17:
        setSkypeWifiOptions(preference);
        return;
_L5:
        setAboutOptions(preference);
        return;
_L11:
        setTargetedAdsOptions(preference);
        return;
_L16:
        setManageAliasesOptions(preference);
        return;
_L3:
        setHelpOptions(preference);
        return;
_L6:
        setFeedbackOptions(preference);
        return;
_L12:
        setChatsOptions(preference);
        return;
_L4:
        setSignOutOptions(preference);
        return;
    }

    private void setOptions(String s)
    {
        Preference preference = findPreference(s);
        if (preference != null && s.equals("debug_key"))
        {
            setDebugOptions(preference);
        }
    }

    private void setSignOutOptions(Preference preference)
    {
        preference.setOnPreferenceClickListener(new android.preference.Preference.OnPreferenceClickListener() {

            final SettingsFragment this$0;

            public final boolean onPreferenceClick(Preference preference1)
            {
                performSignout();
                return true;
            }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
        });
    }

    private void setSkypeWifiOptions(Preference preference)
    {
        Object obj = getActivity().getPackageManager();
        final Intent swLaunch = ((PackageManager) (obj)).getLaunchIntentForPackage(urls.a(com.skype.android.res.Urls.Type.m));
        if (swLaunch != null)
        {
            preference.setSummary(0x7f08032e);
            preference.setOnPreferenceClickListener(new android.preference.Preference.OnPreferenceClickListener() {

                final SettingsFragment this$0;
                final Intent val$swLaunch;

                public final boolean onPreferenceClick(Preference preference1)
                {
                    boolean flag = false;
                    preference1 = getActivity();
                    if (preference1 != null)
                    {
                        try
                        {
                            preference1.startActivity(swLaunch);
                            preference1 = new AttributeContainer();
                            preference1.put(AnalyticsParameter.a.b(), Integer.valueOf(1));
                            preference1.put(AnalyticsParameter.b.b(), Integer.valueOf(1021));
                            lib.reportStatsEvent(StatsType.a.a(), preference1.serialize());
                        }
                        // Misplaced declaration of an exception variable
                        catch (Preference preference1)
                        {
                            return false;
                        }
                        flag = true;
                    }
                    return flag;
                }

            
            {
                this$0 = SettingsFragment.this;
                swLaunch = intent;
                super();
            }
            });
        } else
        {
            preference.setSummary(0x7f0802c7);
            final Intent store = new Intent("android.intent.action.VIEW");
            store.setData(Uri.parse(urls.a(com.skype.android.res.Urls.Type.l)));
            obj = ((PackageManager) (obj)).queryIntentActivities(store, 0x10000);
            if (obj != null && ((List) (obj)).size() > 0)
            {
                preference.setOnPreferenceClickListener(new android.preference.Preference.OnPreferenceClickListener() {

                    final SettingsFragment this$0;
                    final Intent val$store;

                    public final boolean onPreferenceClick(Preference preference1)
                    {
                        boolean flag = false;
                        preference1 = getActivity();
                        if (preference1 != null)
                        {
                            try
                            {
                                preference1.startActivity(store);
                                preference1 = new AttributeContainer();
                                preference1.put(AnalyticsParameter.a.b(), Integer.valueOf(1));
                                preference1.put(AnalyticsParameter.b.b(), Integer.valueOf(1022));
                                lib.reportStatsEvent(StatsType.a.a(), preference1.serialize());
                            }
                            // Misplaced declaration of an exception variable
                            catch (Preference preference1)
                            {
                                return false;
                            }
                            flag = true;
                        }
                        return flag;
                    }

            
            {
                this$0 = SettingsFragment.this;
                store = intent;
                super();
            }
                });
                return;
            }
        }
    }

    private void setTargetedAdsOptions(Preference preference)
    {
        preference.setOnPreferenceChangeListener(new android.preference.Preference.OnPreferenceChangeListener() {

            final SettingsFragment this$0;

            public final boolean onPreferenceChange(Preference preference1, Object obj)
            {
                boolean flag;
                if (!((Boolean)obj).booleanValue())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                adManager.c(flag);
                return true;
            }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
        });
    }

    private void setUserWantsAutoAnswerOptions(Preference preference)
    {
        preference.setOnPreferenceChangeListener(new android.preference.Preference.OnPreferenceChangeListener() {

            final SettingsFragment this$0;

            public final boolean onPreferenceChange(Preference preference1, Object obj)
            {
                boolean flag = ((Boolean)obj).booleanValue();
                analytics.a(AnalyticsEvent.ac, flag);
                return true;
            }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
        });
    }

    private void setVideoMonitorOptions(Preference preference)
    {
        preference.setOnPreferenceChangeListener(new android.preference.Preference.OnPreferenceChangeListener() {

            final SettingsFragment this$0;

            public final boolean onPreferenceChange(Preference preference1, Object obj)
            {
                boolean flag = ((Boolean)obj).booleanValue();
                obj = analytics;
                if (flag)
                {
                    preference1 = AnalyticsEvent.bc;
                } else
                {
                    preference1 = AnalyticsEvent.bd;
                }
                ((Analytics) (obj)).c(preference1);
                return true;
            }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
        });
    }

    private void setVideoQualityOptions(Preference preference)
    {
        preference.setSummary(videoQualityEntries[userPrefs.getVideoQualityMode()]);
        preference.setOnPreferenceChangeListener(new android.preference.Preference.OnPreferenceChangeListener() {

            final SettingsFragment this$0;

            public final boolean onPreferenceChange(Preference preference1, Object obj)
            {
                int i = Integer.parseInt((String)obj);
                preference1.setSummary(videoQualityEntries[i]);
                if (i == 0)
                {
                    i = 0;
                } else
                {
                    i = 51200;
                }
                lib.setOperatingMedia(com.skype.SkyLib.OPERATING_MEDIA.OM_UNKNOWN, i, i);
                return true;
            }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
        });
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        if (bundle != null && bundle.containsKey("hasAliases"))
        {
            hasAliases = Boolean.valueOf(bundle.getBoolean("hasAliases"));
        }
        hideSignOutExperimentGroup = configuration.getExperimentHideSignoutGroupTag();
        privacyRequestsFromEntries = getResources().getStringArray(0x7f0a000b);
        videoQualityEntries = getResources().getStringArray(0x7f0a000c);
        contactSyncEntries = getResources().getStringArray(0x7f0a0007);
        findFriendsEntries = getResources().getStringArray(0x7f0a0008);
        getPreferenceManager().setSharedPreferencesName(account.getSkypenameProp());
        bundle = getArguments();
        if (bundle == null || !bundle.containsKey("category_key")) goto _L2; else goto _L1
_L1:
        addPreferencesFromResource(bundle.getInt("category_key", 0x7f06000b));
_L4:
        if (!configuration.isShortCircuitEnabled())
        {
            bundle = (Preference)findPreference(0x7f08054e);
            if (bundle != null)
            {
                getPreferenceScreen().removePreference(bundle);
            }
            bundle = (PreferenceGroup)findPreference(0x7f080524);
            if (bundle != null)
            {
                bundle.removePreference(bundle.findPreference(getString(0x7f08054e)));
            }
            bundle = (PreferenceGroup)findPreference(0x7f08051f);
            if (bundle != null)
            {
                Preference preference = (Preference)findPreference(0x7f08052c);
                if (preference != null)
                {
                    bundle.removePreference(preference);
                }
            }
        }
        return;
_L2:
        if (configuration.getCloudEmoticonsEnabled())
        {
            addPreferencesFromResource(0x7f060009);
            ((Preference)findPreference(0x7f08052a)).setOnPreferenceChangeListener(new android.preference.Preference.OnPreferenceChangeListener() {

                final SettingsFragment this$0;

                public final boolean onPreferenceChange(Preference preference2, Object obj)
                {
                    spannedStringCache.a();
                    boolean flag = ((Boolean)obj).booleanValue();
                    obj = analytics;
                    AnalyticsEvent analyticsevent = AnalyticsEvent.bQ;
                    if (flag)
                    {
                        preference2 = "enable";
                    } else
                    {
                        preference2 = "disable";
                    }
                    ((Analytics) (obj)).a(analyticsevent, preference2);
                    return true;
                }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
            });
            ((Preference)findPreference(0x7f08052b)).setOnPreferenceChangeListener(new android.preference.Preference.OnPreferenceChangeListener() {

                final SettingsFragment this$0;

                public final boolean onPreferenceChange(Preference preference2, Object obj)
                {
                    boolean flag = ((Boolean)obj).booleanValue();
                    obj = analytics;
                    AnalyticsEvent analyticsevent = AnalyticsEvent.bR;
                    if (flag)
                    {
                        preference2 = "enable";
                    } else
                    {
                        preference2 = "disable";
                    }
                    ((Analytics) (obj)).a(analyticsevent, preference2);
                    return true;
                }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
            });
            if (!configuration.isMojiSupported())
            {
                bundle = (PreferenceGroup)findPreference(0x7f080521);
                if (bundle != null)
                {
                    bundle.setTitle(0x7f08024b);
                    Preference preference1 = (Preference)findPreference(0x7f080531);
                    if (preference1 != null)
                    {
                        bundle.removePreference(preference1);
                    }
                }
            }
        }
        addPreferencesFromResource(0x7f06000c);
        addPreferencesFromResource(0x7f060006);
        addPreferencesFromResource(0x7f06000d);
        addPreferencesFromResource(0x7f060013);
        addPreferencesFromResource(0x7f060004);
        if (!layoutExperience.isMultipane())
        {
            addPreferencesFromResource(0x7f060003);
            ((Preference)findPreference(0x7f080526)).setOnPreferenceClickListener(new android.preference.Preference.OnPreferenceClickListener() {

                final SettingsFragment this$0;

                public final boolean onPreferenceClick(Preference preference2)
                {
                    analytics.a(AnalyticsEvent.Q, lib.getUnconsumedConversationsCount());
                    lib.consumeAllConversations();
                    Toast.makeText(getActivity(), 0x7f0802d4, 1).show();
                    return true;
                }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
            });
        }
        if (configuration.isFeedbackUiEnabled())
        {
            addPreferencesFromResource(0x7f060010);
        }
        addPreferencesFromResource(0x7f060000);
        if (addSignOutInSettings())
        {
            addPreferencesFromResource(0x7f06000f);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onEvent(OnAutoBuddyPreferenceResult onautobuddypreferenceresult)
    {
        if (onautobuddypreferenceresult.isSuccess())
        {
            onautobuddypreferenceresult = onautobuddypreferenceresult.getResult();
            autoBuddyOptionValue = onautobuddypreferenceresult.isOptionEnabled();
            setAutoBuddyOptionSummary(autoBuddyOptionValue);
            enableAutoBuddyOption();
            if (onautobuddypreferenceresult.isUpdateRequest())
            {
                if (onautobuddypreferenceresult.isUpdated())
                {
                    if (autoBuddyOptionValue && hasAliases != null && !hasAliases.booleanValue())
                    {
                        getActivity().runOnUiThread(new Runnable() {

                            final SettingsFragment this$0;

                            public final void run()
                            {
                                startActivity(new Intent(getActivity(), com/skype/android/app/settings/ManageAliasesActivity));
                            }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
                        });
                        return;
                    }
                } else
                {
                    Toast.makeText(getActivity(), 0x7f080443, 1).show();
                    return;
                }
            }
        }
    }

    public void onEvent(com.skype.android.app.shortcircuit.ShortCircuitProfileWebClient.OnGetVerifiedAliasesResult ongetverifiedaliasesresult)
    {
        boolean flag;
label0:
        {
            ongetverifiedaliasesresult = ongetverifiedaliasesresult.getVerifiedAliases();
            boolean flag1 = false;
            flag = flag1;
            if (ongetverifiedaliasesresult == null)
            {
                break label0;
            }
            Iterator iterator = ongetverifiedaliasesresult.iterator();
            do
            {
                flag = flag1;
                if (!iterator.hasNext())
                {
                    break label0;
                }
            } while (!((com.skype.android.app.shortcircuit.ShortCircuitProfileWebClient.AliasInfo)iterator.next()).isSearchable());
            flag = true;
        }
        boolean flag2;
        if (ongetverifiedaliasesresult != null && ongetverifiedaliasesresult.size() > 0 && flag)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        hasAliases = Boolean.valueOf(flag2);
        autoBuddyManager.queryAutoBuddy();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (hasAliases != null)
        {
            bundle.putBoolean("hasAliases", hasAliases.booleanValue());
        }
    }

    public void onStart()
    {
        super.onStart();
        setOptions("debug_key");
        setOptions(0x7f08052c);
        setOptions(0x7f080529);
        setOptions(0x7f08051b);
        setOptions(0x7f080519);
        setOptions(0x7f08055a);
        setOptions(0x7f08055b);
        setOptions(0x7f080532);
        setOptions(0x7f0802f0);
        setOptions(0x7f080149);
        setOptions(0x7f0802b4);
        setOptions(0x7f080557);
        setOptions(0x7f080226);
        setOptions(0x7f08051c);
        setOptions(0x7f08054e);
        setOptions(0x7f08051a);
        if (!hideSignOutExperimentGroup.equals(ExperimentTag.c) && !hideSignOutExperimentGroup.equals(ExperimentTag.a))
        {
            setOptions(0x7f08018e);
        }
        if (layoutExperience.isMultipane())
        {
            setOptions(0x7f080526);
        }
    }






}
