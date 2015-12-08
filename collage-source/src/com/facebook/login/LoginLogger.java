// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsLogger;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.login:
//            LoginBehavior, LoginClient, DefaultAudience

class LoginLogger
{

    static final String EVENT_EXTRAS_DEFAULT_AUDIENCE = "default_audience";
    static final String EVENT_EXTRAS_FACEBOOK_VERSION = "facebookVersion";
    static final String EVENT_EXTRAS_IS_REAUTHORIZE = "isReauthorize";
    static final String EVENT_EXTRAS_LOGIN_BEHAVIOR = "login_behavior";
    static final String EVENT_EXTRAS_MISSING_INTERNET_PERMISSION = "no_internet_permission";
    static final String EVENT_EXTRAS_NEW_PERMISSIONS = "new_permissions";
    static final String EVENT_EXTRAS_NOT_TRIED = "not_tried";
    static final String EVENT_EXTRAS_PERMISSIONS = "permissions";
    static final String EVENT_EXTRAS_REQUEST_CODE = "request_code";
    static final String EVENT_EXTRAS_TRY_LOGIN_ACTIVITY = "try_login_activity";
    static final String EVENT_NAME_LOGIN_COMPLETE = "fb_mobile_login_complete";
    static final String EVENT_NAME_LOGIN_METHOD_COMPLETE = "fb_mobile_login_method_complete";
    static final String EVENT_NAME_LOGIN_METHOD_START = "fb_mobile_login_method_start";
    static final String EVENT_NAME_LOGIN_START = "fb_mobile_login_start";
    static final String EVENT_PARAM_AUTH_LOGGER_ID = "0_auth_logger_id";
    static final String EVENT_PARAM_ERROR_CODE = "4_error_code";
    static final String EVENT_PARAM_ERROR_MESSAGE = "5_error_message";
    static final String EVENT_PARAM_EXTRAS = "6_extras";
    static final String EVENT_PARAM_LOGIN_RESULT = "2_result";
    static final String EVENT_PARAM_METHOD = "3_method";
    static final String EVENT_PARAM_METHOD_RESULT_SKIPPED = "skipped";
    static final String EVENT_PARAM_TIMESTAMP = "1_timestamp_ms";
    static final String FACEBOOK_PACKAGE_NAME = "com.facebook.katana";
    private final AppEventsLogger appEventsLogger;
    private String applicationId;
    private String facebookVersion;

    LoginLogger(Context context, String s)
    {
        applicationId = s;
        appEventsLogger = AppEventsLogger.newLogger(context, s);
        try
        {
            context = context.getPackageManager();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        context = context.getPackageInfo("com.facebook.katana", 0);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        facebookVersion = ((PackageInfo) (context)).versionName;
    }

    static Bundle newAuthorizationLoggingBundle(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        bundle.putString("0_auth_logger_id", s);
        bundle.putString("3_method", "");
        bundle.putString("2_result", "");
        bundle.putString("5_error_message", "");
        bundle.putString("4_error_code", "");
        bundle.putString("6_extras", "");
        return bundle;
    }

    public String getApplicationId()
    {
        return applicationId;
    }

    public void logAuthorizationMethodComplete(String s, String s1, String s2, String s3, String s4, Map map)
    {
        s = newAuthorizationLoggingBundle(s);
        if (s2 != null)
        {
            s.putString("2_result", s2);
        }
        if (s3 != null)
        {
            s.putString("5_error_message", s3);
        }
        if (s4 != null)
        {
            s.putString("4_error_code", s4);
        }
        if (map != null && !map.isEmpty())
        {
            s.putString("6_extras", (new JSONObject(map)).toString());
        }
        s.putString("3_method", s1);
        appEventsLogger.logSdkEvent("fb_mobile_login_method_complete", null, s);
    }

    public void logAuthorizationMethodStart(String s, String s1)
    {
        s = newAuthorizationLoggingBundle(s);
        s.putString("3_method", s1);
        appEventsLogger.logSdkEvent("fb_mobile_login_method_start", null, s);
    }

    public void logCompleteLogin(String s, Map map, LoginClient.Result.Code code, Map map1, Exception exception)
    {
        Bundle bundle = newAuthorizationLoggingBundle(s);
        if (code != null)
        {
            bundle.putString("2_result", code.getLoggingValue());
        }
        if (exception != null && exception.getMessage() != null)
        {
            bundle.putString("5_error_message", exception.getMessage());
        }
        if (!map.isEmpty())
        {
            s = new JSONObject(map);
        } else
        {
            s = null;
        }
        map = s;
        if (map1 == null) goto _L2; else goto _L1
_L1:
        if (s == null)
        {
            s = new JSONObject();
        }
        for (map = map1.entrySet().iterator(); map.hasNext(); s.put((String)code.getKey(), code.getValue()))
        {
            code = (java.util.Map.Entry)map.next();
        }

          goto _L3
        map;
        map = s;
_L2:
        if (map != null)
        {
            bundle.putString("6_extras", map.toString());
        }
        appEventsLogger.logSdkEvent("fb_mobile_login_complete", null, bundle);
        return;
_L3:
        map = s;
        if (true) goto _L2; else goto _L4
_L4:
    }

    public void logStartLogin(LoginClient.Request request)
    {
        Bundle bundle = newAuthorizationLoggingBundle(request.getAuthId());
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("login_behavior", request.getLoginBehavior().toString());
            jsonobject.put("request_code", LoginClient.getLoginRequestCode());
            jsonobject.put("permissions", TextUtils.join(",", request.getPermissions()));
            jsonobject.put("default_audience", request.getDefaultAudience().toString());
            jsonobject.put("isReauthorize", request.isRerequest());
            if (facebookVersion != null)
            {
                jsonobject.put("facebookVersion", facebookVersion);
            }
            bundle.putString("6_extras", jsonobject.toString());
        }
        // Misplaced declaration of an exception variable
        catch (LoginClient.Request request) { }
        appEventsLogger.logSdkEvent("fb_mobile_login_start", null, bundle);
    }

    public void logUnexpectedError(String s, String s1)
    {
        logUnexpectedError(s, s1, "");
    }

    public void logUnexpectedError(String s, String s1, String s2)
    {
        Bundle bundle = newAuthorizationLoggingBundle("");
        bundle.putString("2_result", LoginClient.Result.Code.ERROR.getLoggingValue());
        bundle.putString("5_error_message", s1);
        bundle.putString("3_method", s2);
        appEventsLogger.logSdkEvent(s, null, bundle);
    }
}
