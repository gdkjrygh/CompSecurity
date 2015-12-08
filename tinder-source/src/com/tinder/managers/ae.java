// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tinder.enums.Blend;
import com.tinder.utils.DateUtils;
import com.tinder.utils.v;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public final class ae
{

    public static SharedPreferences a;
    public static android.content.SharedPreferences.Editor b;

    public ae(Context context)
    {
        context = context.getSharedPreferences("SP", 0);
        a = context;
        b = context.edit();
    }

    public static boolean A()
    {
        return a.getBoolean("KEY_WARNED_MOMENTS_SUNSET", false);
    }

    public static boolean B()
    {
        return a.getBoolean("moments enabled", false);
    }

    public static String C()
    {
        return a.getString("KEY_BLEND", Blend.OPTIMAL.name);
    }

    public static boolean D()
    {
        return a.getBoolean("KEY_BLEND_ENABLED", false);
    }

    public static void a(long l1)
    {
        b.putLong("LAST_ACTIVITY_DATE", l1).commit();
    }

    public static void a(String s1)
    {
        b.putString("INSTAGRAM_USERNAME", s1);
        b.commit();
    }

    public static void a(boolean flag)
    {
        b.putBoolean("KEY_SUPERLIKE_REMINDER_SHOWN", flag);
        b.commit();
    }

    public static boolean a()
    {
        return a.getBoolean("KEY_HAS_PLUS_SUBSCRIPTION_ENABLED", false);
    }

    public static void b(boolean flag)
    {
        b.putBoolean("REGISTERED TINDER PUSH", flag);
        b.commit();
    }

    public static boolean b()
    {
        return a.getBoolean("KEY_SUPERLIKE_PUSH_ENABLED", true);
    }

    public static void c()
    {
        b.putInt("SWIPE_COUNTER", e() + 1);
        b.apply();
    }

    public static void c(boolean flag)
    {
        b.putBoolean("KEY_HAS_PLUS_SUBSCRIPTION_ENABLED", flag);
        b.commit();
    }

    public static void d()
    {
        b.putInt("SWIPE_COUNTER", 0);
        b.commit();
    }

    public static int e()
    {
        return a.getInt("SWIPE_COUNTER", 0);
    }

    public static String f()
    {
        return a.getString("ACCOUNT CREATED DATE", "");
    }

    public static boolean g()
    {
        return a.getBoolean("KEY_NEW_MATCH_PUSH_ENABLED", true);
    }

    public static boolean h()
    {
        return a.getBoolean("KEY_NEW_MESSAGE_PUSH_ENABLED", true);
    }

    public static boolean i()
    {
        return a.getBoolean("DISCOVER ENABLED", true);
    }

    public static boolean j()
    {
        return a.getBoolean("KEY_SUPERLIKE_REMINDER_SHOWN", true);
    }

    public static double k()
    {
        String s1 = a.getString("LATITUDE", "");
        if (TextUtils.isEmpty(s1))
        {
            return -100000D;
        }
        double d1;
        try
        {
            d1 = Double.parseDouble(s1);
        }
        catch (NumberFormatException numberformatexception)
        {
            com.tinder.utils.v.a("Failed to parse saved latitude", numberformatexception);
            return -100000D;
        }
        return d1;
    }

    public static double l()
    {
        String s1 = a.getString("LONGITUDE", "");
        if (TextUtils.isEmpty(s1))
        {
            return -100000D;
        }
        double d1;
        try
        {
            d1 = Double.parseDouble(s1);
        }
        catch (NumberFormatException numberformatexception)
        {
            com.tinder.utils.v.a("Failed to parse saved longitude", numberformatexception);
            return -100000D;
        }
        return d1;
    }

    public static void m()
    {
        b.putBoolean("HAS_VIEWED_INTRO", true);
        b.commit();
    }

    public static float n()
    {
        float f1;
        try
        {
            f1 = a.getFloat("DISTANCE", 50F);
        }
        catch (Exception exception)
        {
            com.tinder.utils.v.a((new StringBuilder("exception=")).append(exception).toString());
            return (float)a.getInt("DISTANCE", 50);
        }
        return f1;
    }

    public static Date o()
    {
        long l1 = a.getLong("LAST_ACTIVITY_DATE", -1L);
        if (l1 <= 0L) goto _L2; else goto _L1
_L1:
        Object obj = new Date(l1);
        return ((Date) (obj));
        ClassCastException classcastexception;
        classcastexception;
        obj = a.getString("LAST_ACTIVITY_DATE", null);
        if (obj == null) goto _L2; else goto _L3
_L3:
        obj = DateUtils.a().parse(((String) (obj)));
        a.edit().putLong("LAST_ACTIVITY_DATE", ((Date) (obj)).getTime()).commit();
        return ((Date) (obj));
        ParseException parseexception1;
        parseexception1;
_L5:
        com.tinder.utils.v.a("Failed to parse old last activity date for migration", classcastexception);
        a.edit().remove("LAST_ACTIVITY_DATE").commit();
        return ((Date) (obj));
_L2:
        return null;
        ParseException parseexception;
        parseexception;
        parseexception = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static String p()
    {
        return a.getString("USER_ID", null);
    }

    public static void q()
    {
        b.putBoolean("HAS_BEEN_ASKED_FOR_PHOTO_PERMISSION", true);
        b.commit();
    }

    public static boolean r()
    {
        return a.getBoolean("KEY_APPBOY_ENABLED", true);
    }

    public static boolean s()
    {
        return a.getBoolean("KEY_TINDER_PLUS_ENABLED", false);
    }

    public static boolean t()
    {
        return a() || s();
    }

    public static boolean u()
    {
        return a.getBoolean("HAS_VIEWED_ROADBLOCK", false);
    }

    public static String v()
    {
        return a.getString("INSTAGRAM_USERNAME", "");
    }

    public static void w()
    {
        b.putBoolean("INSTAGRAM_EXPIRED_SEEN", true);
        b.commit();
    }

    public static boolean x()
    {
        return a.getBoolean("FETCH_CONNECTIONS", true);
    }

    public static boolean y()
    {
        return a.getBoolean("KEY_SUPERLIKE_ENABLED", false);
    }

    public static boolean z()
    {
        return y() && t();
    }
}
