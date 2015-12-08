// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.Utility;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.login:
//            LoginClient

abstract class LoginMethodHandler
    implements Parcelable
{

    protected LoginClient loginClient;
    Map methodLoggingExtras;

    LoginMethodHandler(Parcel parcel)
    {
        methodLoggingExtras = Utility.readStringMapFromParcel(parcel);
    }

    LoginMethodHandler(LoginClient loginclient)
    {
        loginClient = loginclient;
    }

    static AccessToken createAccessTokenFromNativeLogin(Bundle bundle, AccessTokenSource accesstokensource, String s)
    {
        Date date = Utility.getBundleLongAsDate(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
        ArrayList arraylist = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String s1 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        if (Utility.isNullOrEmpty(s1))
        {
            return null;
        } else
        {
            return new AccessToken(s1, s, bundle.getString("com.facebook.platform.extra.USER_ID"), arraylist, null, accesstokensource, date, new Date());
        }
    }

    public static AccessToken createAccessTokenFromWebBundle(Collection collection, Bundle bundle, AccessTokenSource accesstokensource, String s)
        throws FacebookException
    {
        Date date = Utility.getBundleLongAsDate(bundle, "expires_in", new Date());
        String s1 = bundle.getString("access_token");
        Object obj = bundle.getString("granted_scopes");
        if (!Utility.isNullOrEmpty(((String) (obj))))
        {
            collection = new ArrayList(Arrays.asList(((String) (obj)).split(",")));
        }
        obj = bundle.getString("denied_scopes");
        if (!Utility.isNullOrEmpty(((String) (obj))))
        {
            obj = new ArrayList(Arrays.asList(((String) (obj)).split(",")));
        } else
        {
            obj = null;
        }
        if (Utility.isNullOrEmpty(s1))
        {
            return null;
        } else
        {
            return new AccessToken(s1, s, getUserIDFromSignedRequest(bundle.getString("signed_request")), collection, ((Collection) (obj)), accesstokensource, date, new Date());
        }
    }

    private static String getUserIDFromSignedRequest(String s)
        throws FacebookException
    {
        if (s == null || s.isEmpty())
        {
            throw new FacebookException("Authorization response does not contain the signed_request");
        }
        s = s.split("\\.");
        if (s.length != 2)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        s = (new JSONObject(new String(Base64.decode(s[1], 0), "UTF-8"))).getString("user_id");
        return s;
        s;
_L2:
        throw new FacebookException("Failed to retrieve user_id from signed_request");
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected void addLoggingExtra(String s, Object obj)
    {
        if (methodLoggingExtras == null)
        {
            methodLoggingExtras = new HashMap();
        }
        Map map = methodLoggingExtras;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = obj.toString();
        }
        map.put(s, obj);
    }

    void cancel()
    {
    }

    abstract String getNameForLogging();

    protected void logWebLoginCompleted(String s)
    {
        String s1 = loginClient.getPendingRequest().getApplicationId();
        AppEventsLogger appeventslogger = AppEventsLogger.newLogger(loginClient.getActivity(), s1);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", s);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", s1);
        appeventslogger.logSdkEvent("fb_dialogs_web_login_dialog_complete", null, bundle);
    }

    boolean needsInternetPermission()
    {
        return false;
    }

    boolean onActivityResult(int i, int j, Intent intent)
    {
        return false;
    }

    void setLoginClient(LoginClient loginclient)
    {
        if (loginClient != null)
        {
            throw new FacebookException("Can't set LoginClient if it is already set.");
        } else
        {
            loginClient = loginclient;
            return;
        }
    }

    abstract boolean tryAuthorize(LoginClient.Request request);

    public void writeToParcel(Parcel parcel, int i)
    {
        Utility.writeStringMapToParcel(parcel, methodLoggingExtras);
    }
}
