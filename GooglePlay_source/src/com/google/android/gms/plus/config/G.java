// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.config;

import android.net.Uri;
import com.google.android.gms.common.config.GservicesValue;
import java.util.List;

public final class G
{

    public static GservicesValue apiaryTrace = GservicesValue.value("plus.apiary_trace", "");
    public static GservicesValue cacheEnabled = GservicesValue.value("plus.cache_enabled", false);
    public static GservicesValue lsoAspenScopeIds = GservicesValue.value("plus.lso_aspen_scope_ids", "9335");
    public static GservicesValue lsoConnReadScopeId = GservicesValue.value("plus.lso_conn_read_scope_ids", Integer.valueOf(64806));
    public static GservicesValue maxFaclCacheAge = GservicesValue.value("plus.facl.max_age", Integer.valueOf(0xa4cb800));
    public static GservicesValue momentsBackendOverride = GservicesValue.value("plus.connect_backend_override", "");
    public static GservicesValue oauthBackendOverride = GservicesValue.value("plus.oauth_backend_override", "");
    public static GservicesValue oauthServerApiPath = GservicesValue.value("plus.oauth_server_api_path", "/o/oauth2");
    public static GservicesValue oauthServerUrl = GservicesValue.value("plus.oauth_server_url", "https://accounts.google.com");
    public static GservicesValue plusBackendOverride = GservicesValue.value("plus.connect_backend_override", "");
    public static GservicesValue plusDefaultTimeoutMs = GservicesValue.value("plus.server.timeout_ms.default", Integer.valueOf(2500));
    public static GservicesValue plusGcmSenderId = GservicesValue.value("plus.gcm.sender_id", "745476177629");
    public static GservicesValue plusListAppsDisabledUrl = GservicesValue.value("plus.list_apps.disabled_url", "https://support.google.com/plus/?p=plus_controls_mobile");
    public static GservicesValue plusListAppsDisabledVersions = GservicesValue.value("plus.list_apps.disabled_versions", "");
    public static GservicesValue plusListAppsHelpUrl = GservicesValue.value("plus.list_apps.help_url", "https://support.google.com/plus/?p=plus_controls_mobile");
    public static GservicesValue plusListAppsLearnMoreUrl = GservicesValue.value("plus.list_apps.learn_more_url", "https://support.google.com/plus/?p=plus_sign_in");
    public static GservicesValue plusListAppsMaxItems = GservicesValue.value("plus.list_apps.max_items", Integer.valueOf(100));
    public static GservicesValue plusListFitnessAppsHelpUrl = GservicesValue.value("plus.list_apps_fitness._help_url", "https://support.google.com/mobile/?p=google_settings_fitness");
    public static GservicesValue plusListFitnessAppsLearnMoreUrl = GservicesValue.value("plus.list_fitness_apps.learn_more_url", "https://support.google.com/mobile/?p=google_settings_fitness_devices");
    public static GservicesValue plusListLSOAppsHelpUrl = GservicesValue.value("plus.list_apps_lso._help_url", "https://support.google.com/accounts/answer/3290768");
    public static GservicesValue plusListMomentsDisabledUrl = GservicesValue.value("plus.list_moments.disabled_url", "https://support.google.com/plus/?p=plus_controls_mobile");
    public static GservicesValue plusListMomentsDisabledVersions = GservicesValue.value("plus.list_moments.disabled_versions", "");
    public static GservicesValue plusListMomentsHelpUrl = GservicesValue.value("plus.list_moments.help_url", "https://support.google.com/plus/?p=plus_controls_mobile");
    public static GservicesValue plusManageAppDisabledUrl = GservicesValue.value("plus.manage_app.disabled_url", "https://support.google.com/plus/?p=plus_controls_mobile");
    public static GservicesValue plusManageAppDisabledVersions = GservicesValue.value("plus.manage_app.disabled_versions", "");
    public static GservicesValue plusMomentManageWebUrl = GservicesValue.value("plus.moments.manage_web_url", "https://support.google.com/plus/?p=plus_controls_mobile");
    public static GservicesValue plusMomentsListMaxItems = GservicesValue.value("plus.list_moments.max_items", Integer.valueOf(100));
    public static GservicesValue plusOobDebugging = GservicesValue.value("plus.oob_debugging", false);
    public static GservicesValue plusOobDefaultBirthday = GservicesValue.value("plus.oob_default_birthday", "1940-01-01");
    public static GservicesValue plusOobLastNameFirstCountries = GservicesValue.value("plus.oob_last_name_first_countries", "*ja*ko*hu*zh*");
    public static GservicesValue plusPostMaxIndividualAcls = GservicesValue.value("plus.post_max_individual_acls", Integer.valueOf(10));
    public static GservicesValue plusServerApiPath = GservicesValue.value("plus.connect_server_api_path", "/plus/v1whitelisted/");
    public static GservicesValue plusServerUrl = GservicesValue.value("plus.connect_server_url", "https://www.googleapis.com");
    public static GservicesValue plusShareBoxAddToCircleMaxNameLength = GservicesValue.value("plus.share_box.add_to_circle_max_name_length", Integer.valueOf(50));
    public static GservicesValue plusShareBoxClientSuggestionCount = GservicesValue.value("plus.share_box.client_suggestion_count", Integer.valueOf(3));
    public static GservicesValue plusShareBoxDefaultIncludeSuggestions = GservicesValue.value("plus.share_box.include_suggestions_default", true);
    public static GservicesValue plusShareBoxDefaultShowAddToCircle = GservicesValue.value("plus.share_box.show_add_to_circle_default", true);
    public static GservicesValue plusShareBoxDefaultShowSuggested = GservicesValue.value("plus.share_box.show_suggested_default", true);
    public static GservicesValue plusShareBoxEnableAddToCircleDefault = GservicesValue.value("plus.share_box.add_to_circle_default", true);
    public static GservicesValue plusShareBoxEnableAddToCircleFeature = GservicesValue.value("plus.share_box.add_to_circle_enabled", false);
    public static GservicesValue plusShareBoxMaxPeople = GservicesValue.value("plus.share_box.max_people", Integer.valueOf(100));
    public static GservicesValue plusShareBoxShowAclPickerFirst = GservicesValue.value("plus.share_box.show_acl_picker_first", true);
    public static GservicesValue plusShareBoxShowcasedSuggestionCount = GservicesValue.value("plus.share_box.showcased_suggestion_count", Integer.valueOf(6));
    public static GservicesValue plusShareBoxSuggestionCount = GservicesValue.value("plus.share_box.suggestion_count", Integer.valueOf(0));
    public static GservicesValue plusShareBoxSyncAllowanceSeconds = GservicesValue.value("plus.share_box.people_sync_allowance_seconds", Long.valueOf(28800L));
    public static GservicesValue plusShareBoxSyncAllowanceSecondsSignIn = GservicesValue.value("plus.share_box.people_sync_allowance_seconds_sign_in", Long.valueOf(0L));
    public static GservicesValue plusV1BackendOverride = GservicesValue.value("plus.v1_backend_override", "");
    public static GservicesValue plusV1ServerApiPath = GservicesValue.value("plus.v1_server_api_path", "/plus/v1/");
    public static GservicesValue plusV1ServerUrl = GservicesValue.value("plus.v1_server_url", "https://www.googleapis.com");
    public static GservicesValue plusWhitelistedBackendOverride = GservicesValue.value("plus.whitelisted_backend_override", "");
    public static GservicesValue plusWhitelistedServerApiPath = GservicesValue.value("plus.whitelisted_server_api_path", "/plus/v1whitelisted/");
    public static GservicesValue plusWhitelistedServerUrl = GservicesValue.value("plus.whitelisted_server_url", "https://www.googleapis.com");
    public static GservicesValue plusWriteMomentsOnlineDisabled = GservicesValue.value("plus.write_moments.online_disabled", false);
    public static GservicesValue posAnonymousApiKey = GservicesValue.value("plus.pos_anonymous_api_key", "AIzaSyBa9bgzwtnGchlkux96-c5Q_fi19fE1pEA");
    public static GservicesValue posBackendOverride = GservicesValue.value("plus.pos_backend_override", "");
    public static GservicesValue posServerApiPath = GservicesValue.value("plus.pos_server_api_path", "/pos/v1/");
    public static GservicesValue posServerUrl = GservicesValue.value("plus.pos_server_url", "https://www.googleapis.com");
    public static GservicesValue protoBackendOverride = GservicesValue.value("plus.proto_backend_override", "");
    public static GservicesValue protoServerApiPath = GservicesValue.value("plus.proto_server_api_path", "/plusi/v3/ozInternal");
    public static GservicesValue protoServerUrl = GservicesValue.value("plus.proto_server_url", "https://www.googleapis.com");
    public static GservicesValue smartProfileSocialCardsCount = GservicesValue.value("smart_profile.social_cards_count", Integer.valueOf(20));
    public static GservicesValue verboseLogging = GservicesValue.value("plus.verbose_logging", true);

    public static int getTimeoutMs(int i, String s)
    {
        Uri uri = Uri.parse(s);
        s = new StringBuilder();
        Object aobj[] = uri.getPathSegments().toArray();
        setupTimeoutKey(s, i, aobj, aobj.length, -1);
        int k = ((Integer)GservicesValue.value(s.toString(), Integer.valueOf(-1)).get()).intValue();
        int j = k;
        if (k <= 0)
        {
            int l = getTimeoutWildcards(s, i, aobj, aobj.length);
            j = l;
            if (l <= 0)
            {
                int i1 = aobj.length;
                j = l;
                l = i1;
                do
                {
                    if (l <= 0)
                    {
                        break;
                    }
                    aobj[l - 1] = "*";
                    int j1 = getTimeoutWildcards(s, i, aobj, l);
                    j = j1;
                    if (j1 > 0)
                    {
                        break;
                    }
                    l--;
                    j = j1;
                } while (true);
            }
        }
        if (j > 0)
        {
            return j;
        } else
        {
            return ((Integer)plusDefaultTimeoutMs.get()).intValue();
        }
    }

    private static int getTimeoutWildcards(StringBuilder stringbuilder, int i, Object aobj[], int j)
    {
        int k = -1;
        int l = j - 1;
        int i1;
        do
        {
            i1 = k;
            if (l < 0)
            {
                break;
            }
            setupTimeoutKey(stringbuilder, i, aobj, j, l);
            k = ((Integer)GservicesValue.value(stringbuilder.toString(), Integer.valueOf(-1)).get()).intValue();
            i1 = k;
            if (k > 0)
            {
                break;
            }
            l--;
        } while (true);
        return i1;
    }

    private static void setupTimeoutKey(StringBuilder stringbuilder, int i, Object aobj[], int j, int k)
    {
        stringbuilder.setLength(0);
        stringbuilder.append("plus.server.timeout_ms.");
        i;
        JVM INSTR tableswitch -1 3: default 48
    //                   -1 82
    //                   0 93
    //                   1 104
    //                   2 115
    //                   3 126;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        break; /* Loop/switch isn't completed */
_L6:
        break MISSING_BLOCK_LABEL_126;
_L7:
        i = 0;
        while (i < j) 
        {
            stringbuilder.append('/');
            if (i == k)
            {
                stringbuilder.append('*');
            } else
            {
                stringbuilder.append(aobj[i]);
            }
            i++;
        }
        break MISSING_BLOCK_LABEL_148;
_L2:
        stringbuilder.append("DEPRECATED_GET_OR_POST.");
          goto _L7
_L3:
        stringbuilder.append("GET.");
          goto _L7
_L4:
        stringbuilder.append("POST.");
          goto _L7
_L5:
        stringbuilder.append("PUT.");
          goto _L7
        stringbuilder.append("DELETE.");
          goto _L7
    }

}
