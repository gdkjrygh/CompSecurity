// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v4.content.LocalBroadcastManager;
import com.fitbit.FitBitApplication;

// Referenced classes of package com.fitbit.savedstate:
//            a

public class d extends a
{

    public static final String b = "SavedState.AppState.SOFT_RELOGIN_REQUIRED";
    private static final d c = new d();
    private static final String d = "LAST_USER";
    private static final String e = "PUSH_NOTIFICATIONS_ENABLED";
    private static final String f = "TIMEZONE_AUTOMATIC";
    private static final String g = "SOFT_RELOGIN_REQUIRED";
    private static final String h = "MIX_PANEL_TOKEN";
    private static final String i = "LINK_LAUNCH_REQUEST";
    private static final String j = "APP_VERSION_CHAIN";

    d()
    {
        super("ApplicationSavedState");
    }

    public static void a(String s)
    {
        c.b().edit().putString("LAST_USER", s).apply();
    }

    public static void a(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = c.b().edit();
        editor.putBoolean("PUSH_NOTIFICATIONS_ENABLED", flag);
        editor.apply();
    }

    public static void b(String s)
    {
        android.content.SharedPreferences.Editor editor = c.b().edit();
        editor.putString("APP_VERSION_CHAIN", s);
        editor.apply();
    }

    public static void b(boolean flag)
    {
        c.b().edit().putBoolean("TIMEZONE_AUTOMATIC", flag).apply();
    }

    public static void c(String s)
    {
        android.content.SharedPreferences.Editor editor = c.b().edit();
        if (s == null)
        {
            editor.remove("MIX_PANEL_TOKEN");
        } else
        {
            editor.putString("MIX_PANEL_TOKEN", s);
        }
        editor.apply();
    }

    public static void c(boolean flag)
    {
        if (flag == m())
        {
            return;
        } else
        {
            android.content.SharedPreferences.Editor editor = c.b().edit();
            editor.putBoolean("SOFT_RELOGIN_REQUIRED", flag);
            editor.apply();
            q();
            return;
        }
    }

    public static void d(String s)
    {
        c.b().edit().putString("LINK_LAUNCH_REQUEST", s).apply();
    }

    protected static a g()
    {
        return c;
    }

    public static String h()
    {
        return c.b().getString("LAST_USER", null);
    }

    public static String i()
    {
        return c.b().getString("APP_VERSION_CHAIN", null);
    }

    public static boolean j()
    {
        return c.b().getBoolean("PUSH_NOTIFICATIONS_ENABLED", true);
    }

    public static boolean k()
    {
        return c.b().getBoolean("TIMEZONE_AUTOMATIC", true);
    }

    public static void l()
    {
        android.content.SharedPreferences.Editor editor = c.b().edit();
        editor.remove("PUSH_NOTIFICATIONS_ENABLED");
        editor.remove("TIMEZONE_AUTOMATIC");
        editor.remove("LINK_LAUNCH_REQUEST");
        editor.remove("SOFT_RELOGIN_REQUIRED");
        editor.apply();
    }

    public static boolean m()
    {
        return c.b().getBoolean("SOFT_RELOGIN_REQUIRED", false);
    }

    public static String n()
    {
        return c.b().getString("MIX_PANEL_TOKEN", null);
    }

    public static String o()
    {
        return c.b().getString("LINK_LAUNCH_REQUEST", null);
    }

    public static void p()
    {
        c.b().edit().remove("LINK_LAUNCH_REQUEST").apply();
    }

    private static void q()
    {
        Intent intent = new Intent("SavedState.AppState.SOFT_RELOGIN_REQUIRED");
        LocalBroadcastManager.getInstance(FitBitApplication.a()).sendBroadcast(intent);
    }

    public volatile int a()
    {
        return super.a();
    }

    public volatile SharedPreferences a(Context context)
    {
        return super.a(context);
    }

    public volatile void a(Context context, int i1, int j1, android.content.SharedPreferences.Editor editor)
    {
        super.a(context, i1, j1, editor);
    }

    public volatile SharedPreferences b()
    {
        return super.b();
    }

    public void b(Context context, int i1, int j1, android.content.SharedPreferences.Editor editor)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context);
        android.content.SharedPreferences.Editor editor1 = context.edit();
        if (context.contains("SavedState.AppState.LAST_USER"))
        {
            editor.putString("LAST_USER", context.getString("SavedState.AppState.LAST_USER", null));
            editor1.remove("SavedState.AppState.LAST_USER");
        }
        if (context.contains("SavedState.AppState.PUSH_NOTIFICATIONS_ENABLED"))
        {
            editor.putBoolean("PUSH_NOTIFICATIONS_ENABLED", context.getBoolean("SavedState.AppState.PUSH_NOTIFICATIONS_ENABLED", false));
            editor1.remove("SavedState.AppState.PUSH_NOTIFICATIONS_ENABLED");
        }
        if (context.contains("SavedState.AppState.TIMEZONE_AUTOMATIC"))
        {
            editor.putBoolean("TIMEZONE_AUTOMATIC", context.getBoolean("SavedState.AppState.TIMEZONE_AUTOMATIC", false));
            editor1.remove("SavedState.AppState.TIMEZONE_AUTOMATIC");
        }
        if (context.contains("SavedState.AppState.SOFT_RELOGIN_REQUIRED"))
        {
            editor.putBoolean("SOFT_RELOGIN_REQUIRED", context.getBoolean("SavedState.AppState.SOFT_RELOGIN_REQUIRED", false));
            editor1.remove("SavedState.AppState.SOFT_RELOGIN_REQUIRED");
        }
        if (context.contains("SavedState.AppState.MIX_PANEL_TOKEN"))
        {
            editor.putString("MIX_PANEL_TOKEN", context.getString("SavedState.AppState.MIX_PANEL_TOKEN", null));
            editor1.remove("SavedState.AppState.MIX_PANEL_TOKEN");
        }
        if (context.contains("SavedState.AppState.LINK_LAUNCH_REQUEST"))
        {
            editor.putString("LINK_LAUNCH_REQUEST", context.getString("SavedState.AppState.LINK_LAUNCH_REQUEST", null));
            editor1.remove("SavedState.AppState.LINK_LAUNCH_REQUEST");
        }
        if (context.contains("SavedState.AppState.APP_VERSION_CHAIN"))
        {
            editor.putString("APP_VERSION_CHAIN", context.getString("SavedState.AppState.APP_VERSION_CHAIN", null));
            editor1.remove("SavedState.AppState.APP_VERSION_CHAIN");
        }
        editor1.apply();
    }

    public volatile android.content.SharedPreferences.Editor c()
    {
        return super.c();
    }

    public void d()
    {
        l();
    }

    public volatile void e()
    {
        super.e();
    }

    public volatile String f()
    {
        return super.f();
    }

}
