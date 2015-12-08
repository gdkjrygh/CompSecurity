// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.useraccounts;

import android.os.Handler;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.core.Json;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import java.util.Map;
import org.androidannotations.api.c.p;
import org.c.c.c;
import org.c.c.d;

public class UserAuthorization
{

    private static final String TAG = "UserAuthorization";
    private String authorizationCode;
    private c basicAuth;
    private long inactiveTimeLimit;
    private long lastAccessedTime;
    private c oAuth;
    DominosPrefs_ prefs;
    private Handler sessionHandler;

    public UserAuthorization()
    {
        authorizationCode = null;
        inactiveTimeLimit = 0x124f80L;
        sessionHandler = new Handler();
    }

    private c getOAuthBearerAuthentication()
    {
        final String accessToken = getOAuthToken();
        if (StringHelper.isNotEmpty(accessToken))
        {
            return new _cls2();
        } else
        {
            LogUtil.v("UserAuthorization", "getOAuthBearerAuthentication - NULL JWT", new Object[0]);
            return null;
        }
    }

    private String getOAuthToken()
    {
        Object obj = prefs.OAUTH_JWT().a("");
        if (StringHelper.isNotEmpty(((String) (obj))))
        {
            obj = Json.parse(((String) (obj)));
            if (obj != null)
            {
                return (String)((Map) (obj)).get("access_token");
            }
        }
        return null;
    }

    public void clearAuthorizationCode()
    {
        authorizationCode = null;
        basicAuth = null;
        oAuth = null;
    }

    public void clearOAuthToken()
    {
        prefs.OAUTH_JWT().b("");
    }

    public c getAuthentication(boolean flag)
    {
        if (basicAuth != null)
        {
            return basicAuth;
        }
        if (flag)
        {
            if (oAuth == null)
            {
                oAuth = getOAuthBearerAuthentication();
            }
            return oAuth;
        }
        if (basicAuth == null)
        {
            basicAuth = new _cls1();
        }
        return basicAuth;
    }

    public String getAuthorizationCode()
    {
        if (authorizationCode != null && !isAuthorizationExpired())
        {
            updateLastAccessedTime();
        } else
        {
            clearAuthorizationCode();
        }
        return authorizationCode;
    }

    public long getInactiveTimeLimit()
    {
        return inactiveTimeLimit;
    }

    public Handler getSessionHandler()
    {
        return sessionHandler;
    }

    public boolean isAuthorizationExpired()
    {
        return System.currentTimeMillis() - lastAccessedTime > inactiveTimeLimit;
    }

    public boolean isOAuthKey(String s)
    {
        return StringHelper.equals(s, prefs.OAUTH_JWT().b());
    }

    public boolean isOAuthTokenExist()
    {
        return StringHelper.isNotEmpty(getOAuthToken());
    }

    public boolean isSessionTimedOut(boolean flag)
    {
        return getAuthorizationCode() == null && !flag;
    }

    public String setAuthorizationCode(String s, String s1)
    {
        lastAccessedTime = System.currentTimeMillis();
        basicAuth = new d(s, s1);
        oAuth = getOAuthBearerAuthentication();
        authorizationCode = basicAuth.getHeaderValue();
        return authorizationCode;
    }

    public void setInactiveTimeLimit(long l)
    {
        inactiveTimeLimit = 1000L * l * 60L;
        LogUtil.d("UserAuthorization", String.format("Inactive time limit set to %d min.", new Object[] {
            Long.valueOf(l)
        }), new Object[0]);
    }

    public void startSessionTimer(Runnable runnable, boolean flag)
    {
        updateLastAccessedTime();
        sessionHandler.removeCallbacks(runnable);
        if (!flag && getAuthorizationCode() != null)
        {
            sessionHandler.postDelayed(runnable, getInactiveTimeLimit());
        }
    }

    public void updateLastAccessedTime()
    {
        if (!isAuthorizationExpired())
        {
            lastAccessedTime = System.currentTimeMillis();
        }
    }

    private class _cls2 extends c
    {

        final UserAuthorization this$0;
        final String val$accessToken;

        public String getHeaderValue()
        {
            String s = String.format("Bearer %s", new Object[] {
                accessToken
            });
            LogUtil.v("UserAuthorization", (new StringBuilder("Authorization: ")).append(s).toString(), new Object[0]);
            for (Iterator iterator = ao.a(".").a().a(StringHelper.substringBeforeLast(accessToken, ".")).iterator(); iterator.hasNext(); LogUtil.v("UserAuthorization", String.format("Decoded: %s", new Object[] {
        new String(b.decode((String)iterator.next()))
    }), new Object[0])) { }
            return s;
        }

        _cls2()
        {
            this$0 = UserAuthorization.this;
            accessToken = s;
            super();
        }
    }


    private class _cls1 extends c
    {

        final UserAuthorization this$0;

        public String getHeaderValue()
        {
            return "";
        }

        _cls1()
        {
            this$0 = UserAuthorization.this;
            super();
        }
    }

}
