// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import com.facebook.LoggingBehavior;
import com.facebook.Settings;
import java.util.Collection;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//            Utility, BundleJSONConverter, Logger

public final class ServerProtocol
{

    private static final String DIALOG_AUTHORITY_FORMAT = "m.%s";
    public static final String DIALOG_PARAM_ACCESS_TOKEN = "access_token";
    public static final String DIALOG_PARAM_APP_ID = "app_id";
    public static final String DIALOG_PARAM_AUTH_TYPE = "auth_type";
    public static final String DIALOG_PARAM_CLIENT_ID = "client_id";
    public static final String DIALOG_PARAM_DEFAULT_AUDIENCE = "default_audience";
    public static final String DIALOG_PARAM_DISPLAY = "display";
    public static final String DIALOG_PARAM_E2E = "e2e";
    public static final String DIALOG_PARAM_LEGACY_OVERRIDE = "legacy_override";
    public static final String DIALOG_PARAM_REDIRECT_URI = "redirect_uri";
    public static final String DIALOG_PARAM_RESPONSE_TYPE = "response_type";
    public static final String DIALOG_PARAM_RETURN_SCOPES = "return_scopes";
    public static final String DIALOG_PARAM_SCOPE = "scope";
    public static final String DIALOG_PATH = "dialog/";
    public static final String DIALOG_REREQUEST_AUTH_TYPE = "rerequest";
    public static final String DIALOG_RESPONSE_TYPE_TOKEN = "token";
    public static final String DIALOG_RETURN_SCOPES_TRUE = "true";
    public static final String FALLBACK_DIALOG_DISPLAY_VALUE_TOUCH = "touch";
    public static final String FALLBACK_DIALOG_PARAM_APP_ID = "app_id";
    public static final String FALLBACK_DIALOG_PARAM_BRIDGE_ARGS = "bridge_args";
    public static final String FALLBACK_DIALOG_PARAM_KEY_HASH = "android_key_hash";
    public static final String FALLBACK_DIALOG_PARAM_METHOD_ARGS = "method_args";
    public static final String FALLBACK_DIALOG_PARAM_METHOD_RESULTS = "method_results";
    public static final String FALLBACK_DIALOG_PARAM_VERSION = "version";
    public static final String GRAPH_API_VERSION = "v2.2";
    private static final String GRAPH_URL_FORMAT = "https://graph.%s";
    private static final String GRAPH_VIDEO_URL_FORMAT = "https://graph-video.%s";
    private static final String LEGACY_API_VERSION = "v1.0";
    private static final String TAG = com/facebook/internal/ServerProtocol.getName();
    public static final Collection errorsProxyAuthDisabled = Utility.unmodifiableCollection(new String[] {
        "service_disabled", "AndroidAuthKillSwitchException"
    });
    public static final Collection errorsUserCanceled = Utility.unmodifiableCollection(new String[] {
        "access_denied", "OAuthAccessDeniedException"
    });

    public ServerProtocol()
    {
    }

    public static final String getAPIVersion()
    {
        if (Settings.getPlatformCompatibilityEnabled())
        {
            return "v1.0";
        } else
        {
            return "v2.2";
        }
    }

    public static final String getDialogAuthority()
    {
        return String.format("m.%s", new Object[] {
            Settings.getFacebookDomain()
        });
    }

    public static final String getGraphUrlBase()
    {
        return String.format("https://graph.%s", new Object[] {
            Settings.getFacebookDomain()
        });
    }

    public static final String getGraphVideoUrlBase()
    {
        return String.format("https://graph-video.%s", new Object[] {
            Settings.getFacebookDomain()
        });
    }

    public static Bundle getQueryParamsForPlatformActivityIntentWebFallback(Context context, String s, int i, String s1, Bundle bundle)
    {
        context = Settings.getApplicationSignature(context);
        if (!Utility.isNullOrEmpty(context)) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        Bundle bundle1;
        Bundle bundle2;
        bundle1 = new Bundle();
        bundle1.putString("android_key_hash", context);
        bundle1.putString("app_id", Settings.getApplicationId());
        bundle1.putInt("version", i);
        bundle1.putString("display", "touch");
        bundle2 = new Bundle();
        bundle2.putString("action_id", s);
        bundle2.putString("app_name", s1);
        context = bundle;
        if (bundle == null)
        {
            context = new Bundle();
        }
        s = BundleJSONConverter.convertToJSON(bundle2);
        context = BundleJSONConverter.convertToJSON(context);
        if (s == null || context == null) goto _L1; else goto _L3
_L3:
        bundle1.putString("bridge_args", s.toString());
        bundle1.putString("method_args", context.toString());
        context = bundle1;
_L5:
        return context;
        context;
        Logger.log(LoggingBehavior.DEVELOPER_ERRORS, 6, TAG, (new StringBuilder("Error creating Url -- ")).append(context).toString());
        context = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

}
