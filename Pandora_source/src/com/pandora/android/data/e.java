// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.data;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.pandora.radio.util.i;
import java.util.Iterator;
import java.util.Set;
import p.df.a;

public class e
{

    private SharedPreferences a;

    public e(Application application)
    {
        a = application.getSharedPreferences("ConfigurableConstantsPrefs", 0);
    }

    private String a(String s)
    {
        if ("com.pandora.android.extra.API_HTTP_URL".equals(s))
        {
            return "API_HTTP_URL";
        }
        if ("com.pandora.android.extra.API_HTTPS_URL".equals(s))
        {
            return "API_HTTPS_URL";
        }
        if ("com.pandora.android.extra.AJAX_HTTP_URL".equals(s))
        {
            return "AJAX_HTTP_URL";
        }
        if ("com.pandora.android.extra.HTTP_AUTHORITY".equals(s))
        {
            return "HTTP_AUTHORITY";
        }
        if ("com.pandora.android.extra.PROXY_SERVER".equals(s))
        {
            return "PANDORA_PROXY_SERVER";
        }
        if ("com.pandora.android.extra.AUTOCOMPLETE_URL".equals(s))
        {
            return "AUTOCOMPLETE_URL";
        }
        if ("com.pandora.android.extra.LISTENING_TIMEOUT_MESSAGE_URL".equals(s))
        {
            return "LISTENING_TIMEOUT_MESSAGE_URL";
        }
        if ("com.pandora.android.extra.STATS_COLLECTOR_URL".equals(s))
        {
            return "STATS_COLLECTOR_URL";
        }
        if ("com.pandora.android.extra.BUILD_TYPE".equals(s))
        {
            return "BUILD_TYPE";
        }
        if ("com.pandora.android.extra.CHROMECAST_APP_NAME".equals(s))
        {
            return "CHROMECAST_APP_NAME";
        } else
        {
            p.df.a.a("ConfigurableConstantsPrefs", (new StringBuilder()).append("ConfigurableConstantsPrefs: getPrefsKey(").append(s).append(") not found").toString());
            return null;
        }
    }

    public String a(String s, String s1)
    {
        return a.getString(s, s1);
    }

    public void a(Bundle bundle)
    {
        android.content.SharedPreferences.Editor editor = a.edit();
        Iterator iterator = bundle.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            String s1 = a(s);
            if (!i.a(s1))
            {
                editor.putString(s1, bundle.getString(s));
            }
        } while (true);
        editor.commit();
    }

    public void a(boolean flag)
    {
        a.edit().putBoolean("ENABLE_DEBUG", flag).apply();
    }

    public boolean a()
    {
        return a.getBoolean("ENABLE_DEBUG", false);
    }

    public void b(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = a.edit();
        if (flag)
        {
            editor.putBoolean("USER_ENABLED_LOG", flag);
            editor.putLong("USER_ENABLED_LOG_TS", System.currentTimeMillis());
        } else
        {
            editor.remove("USER_ENABLED_LOG");
            editor.remove("USER_ENABLED_LOG_TS");
        }
        editor.apply();
    }

    public boolean b()
    {
        boolean flag1 = a.getBoolean("USER_ENABLED_LOG", false);
        if (flag1)
        {
            long l = a.getLong("USER_ENABLED_LOG_TS", 0x8000000000000000L);
            boolean flag;
            if (l == 0x8000000000000000L || System.currentTimeMillis() > l + c())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                b(false);
                return false;
            }
        }
        return flag1;
    }

    long c()
    {
        return 0x5265c00L;
    }

    public String toString()
    {
        return a.getAll().toString();
    }
}
