// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.now.card;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.now.NowAuthService;
import java.io.IOException;

public class AuthUtil
{

    private static String ACCESS_TOKEN_KEY = "ACCESS_TOKEN";
    private static String ACCESS_TOKEN_TIMESTAMP = "ACCESS_TOKEN_TIMESTAMP";
    private static long EXPIR_THRESHOLD_TIME_IN_MS = 0L;
    private static long EXPIR_TIME_IN_MS = 0L;
    private static final String TAG = "AuthUtil";

    public AuthUtil()
    {
    }

    static String getAccessToken(Context context, SharedPreferences sharedpreferences, String s)
    {
        String s1;
        String s2;
        Log.i("AuthUtil", "Inside AuthUtil.getAccessToken");
        s2 = sharedpreferences.getString(ACCESS_TOKEN_KEY, null);
        Log.i("AuthUtil", (new StringBuilder()).append("Stored AccessToken : ").append(s2).toString());
        long l = sharedpreferences.getLong(ACCESS_TOKEN_TIMESTAMP, 0L);
        Log.i("AuthUtil", (new StringBuilder()).append("Stored tokenCreatedTime : ").append(l).toString());
        long l1 = System.currentTimeMillis();
        l = (EXPIR_TIME_IN_MS + l) - l1;
        Log.i("AuthUtil", (new StringBuilder()).append("timeToExpire : ").append(l).toString());
        if (s2 != null)
        {
            s1 = s2;
            if (l > EXPIR_THRESHOLD_TIME_IN_MS)
            {
                break MISSING_BLOCK_LABEL_188;
            }
        }
        Log.i("AuthUtil", "No stored token or token invalid, fetching new access token ");
        NowAuthService.getAuthCode(context, s);
        Log.i("AuthUtil", "Got Auth code successfully, retrying getAuthCode to get HaveTokenAlreadyException ");
        NowAuthService.getAuthCode(context, s);
        Log.i("AuthUtil", "Got Auth code successfully, retrying getAuthCode to get HaveTokenAlreadyException ");
        NowAuthService.getAuthCode(context, s);
        s1 = s2;
_L2:
        return s1;
        context;
        Log.i("AuthUtil", Log.getStackTraceString(context));
        s1 = s2;
        continue; /* Loop/switch isn't completed */
        context;
        Log.i("AuthUtil", Log.getStackTraceString(context));
        s1 = s2;
        continue; /* Loop/switch isn't completed */
        context;
        Log.i("AuthUtil", Log.getStackTraceString(context));
        s1 = s2;
        continue; /* Loop/switch isn't completed */
        context;
        Log.i("AuthUtil", Log.getStackTraceString(context));
        s1 = s2;
        continue; /* Loop/switch isn't completed */
        context;
        s1 = context.getAccessToken();
        Log.i("AuthUtil", (new StringBuilder()).append("Caught HaveTokenAlreadyException with accessToken : ").append(s1).toString());
        context = sharedpreferences.edit();
        context.putString(ACCESS_TOKEN_KEY, s1);
        context.putLong(ACCESS_TOKEN_TIMESTAMP, System.currentTimeMillis());
        context.commit();
        Log.i("AuthUtil", (new StringBuilder()).append("Access token is stored in SharedPreferences : ").append(s1).toString());
        if (true) goto _L2; else goto _L1
_L1:
    }

    static 
    {
        EXPIR_TIME_IN_MS = 0x36ee80L;
        EXPIR_THRESHOLD_TIME_IN_MS = 5000L;
    }
}
