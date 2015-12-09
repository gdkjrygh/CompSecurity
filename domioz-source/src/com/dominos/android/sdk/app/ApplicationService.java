// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import com.dominos.android.sdk.common.ConfigProvider;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import java.util.Locale;

public class ApplicationService
{

    public static final String REMEMBER_ME_COOKIE_VALUE = "rememberMeCookieValue";
    Context context;
    ConfigProvider mConfigProvider;
    DominosPrefs_ prefs;

    public ApplicationService(Context context1)
    {
        context = context1;
    }

    public String getLangSetting()
    {
        return Locale.getDefault().getLanguage();
    }

    public boolean isDebugMode()
    {
        return (context.getApplicationContext().getApplicationInfo().flags & 2) != 0;
    }

    public String obtainPersistentCookie(String s)
    {
        s = prefs.getSharedPreferences().getString(s, null);
        if (StringHelper.isNotEmpty(s))
        {
            return s;
        } else
        {
            return null;
        }
    }

    public void persistCookie(String s, String s1)
    {
        if (StringHelper.isNotEmpty(s) && StringHelper.isNotEmpty(s1))
        {
            prefs.getSharedPreferences().edit().putString(s, s1).commit();
        }
    }
}
