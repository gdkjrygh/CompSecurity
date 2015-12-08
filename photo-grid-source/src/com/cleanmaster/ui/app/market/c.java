// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.picksinit.PicksMob;
import com.picksinit.b;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class c
{

    private static int a;
    private static Map b;

    public static int a()
    {
        if (a < 1800)
        {
            int i = c(d("cache_time"));
            a = i;
            if (i < 1800)
            {
                a = 3600;
            }
        }
        return a * 1000;
    }

    public static long a(Long long1)
    {
        if (b == null)
        {
            return 0L;
        }
        long1 = (Long)b.get(long1);
        if (long1 == null)
        {
            return 0L;
        } else
        {
            return long1.longValue();
        }
    }

    public static void a(android.content.SharedPreferences.Editor editor)
    {
        if (android.os.Build.VERSION.SDK_INT > 8)
        {
            editor.apply();
            return;
        } else
        {
            editor.commit();
            return;
        }
    }

    private static void a(String s, int i)
    {
        PicksMob.getInstance().getContext().getSharedPreferences("market_config", 0).edit().putInt(s, i).commit();
    }

    private static void a(String s, String s1)
    {
        PicksMob.getInstance().getContext().getSharedPreferences("market_config", 0).edit().putString(s, s1).commit();
    }

    public static boolean a(String s)
    {
_L2:
        if (i >= s.length())
        {
            break MISSING_BLOCK_LABEL_345;
        }
        JSONObject jsonobject = s.getJSONObject(i);
        long l = jsonobject.getLong("posid");
        long l1 = jsonobject.getLong("cache_time");
        b.put(Long.valueOf(l), Long.valueOf(l1));
        b((new StringBuilder()).append(String.valueOf(l)).append("_posid_expire_time").toString(), l1);
        i++;
        continue; /* Loop/switch isn't completed */
        return true;
        if (TextUtils.isEmpty(s))
        {
            return false;
        }
        int i;
        try
        {
            s = new JSONObject(s);
            a("code", s.optString("code"));
            a("adn", s.optString("adn"));
            a("banner_interval_ms", s.optString("cm_softer_banner_interval_ms"));
            String s1 = s.optString("cm_softer_cache_time", "");
            a = c(s1);
            a("cache_time", s1);
            a("request_url", s.optString("request_url"));
            a("req_timeout_ms", s.optString("req_timeout_ms"));
            a("recommend_cache_time", s.optInt("recommend_cache_time"));
            a("recommend_view_frequency", s.optInt("recommend_view_frequency"));
            a("gamebox_per_query_count", s.optInt("gamebox_per_query_count", 15));
            a("sessionid_timeout_days", s.optInt("sessionid_timeout_days", 2));
            s1 = s.optString("https_request_url", "");
            if (!TextUtils.isEmpty(s1))
            {
                Object obj = new URI(s1);
                String s2 = ((URI) (obj)).getScheme();
                obj = ((URI) (obj)).getHost();
                if (!TextUtils.isEmpty(s2))
                {
                    a("scheme", s2);
                }
                if (!TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    a("host", ((String) (obj)));
                }
                a("https_request_url", s1);
            }
            s1 = s.optString("https_report_url", "");
            if (!TextUtils.isEmpty(s1))
            {
                a("https_report_url", s1);
            }
            s = s.getJSONArray("pos_cache");
            if (b == null)
            {
                b = new HashMap();
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        i = 0;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static boolean a(String s, long l)
    {
        boolean flag = false;
        SharedPreferences sharedpreferences = PicksMob.getInstance().getContext().getSharedPreferences("market_config", 0);
        long l1 = sharedpreferences.getLong(s, 0L);
        if (System.currentTimeMillis() - l1 > l)
        {
            if (android.os.Build.VERSION.SDK_INT < 9)
            {
                sharedpreferences.edit().putLong(s, System.currentTimeMillis()).commit();
            } else
            {
                sharedpreferences.edit().putLong(s, System.currentTimeMillis()).apply();
            }
            flag = true;
        }
        return flag;
    }

    public static int b()
    {
        return c(d("req_timeout_ms"));
    }

    public static long b(String s)
    {
        s = (new StringBuilder()).append(s).append("_posid_expire_time").toString();
        return PicksMob.getInstance().getContext().getSharedPreferences("market_config", 0).getLong(s, 0L) * 1000L;
    }

    private static void b(String s, long l)
    {
        a(PicksMob.getInstance().getContext().getSharedPreferences("market_config", 0).edit().putLong(s, l));
    }

    private static int c(String s)
    {
        if (TextUtils.isEmpty(s) || !TextUtils.isDigitsOnly(s))
        {
            return -1;
        } else
        {
            return Integer.parseInt(s);
        }
    }

    public static String c()
    {
        return PicksMob.getInstance().getContext().getSharedPreferences("market_config", 0).getString("scheme", "");
    }

    public static String d()
    {
        return PicksMob.getInstance().getContext().getSharedPreferences("market_config", 0).getString("host", "");
    }

    private static String d(String s)
    {
        return PicksMob.getInstance().getContext().getSharedPreferences("market_config", 0).getString(s, "");
    }

    public static String e()
    {
        return PicksMob.getInstance().getContext().getSharedPreferences("market_config", 0).getString("https_report_url", "");
    }
}
