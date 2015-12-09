// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.b;

import android.content.SharedPreferences;

// Referenced classes of package com.cardinalblue.android.b:
//            k

public final class d
{

    public d()
    {
    }

    public static void a(boolean flag)
    {
        k.j().edit().putBoolean("pref_debug_mode_enabled", flag).apply();
    }

    public static boolean a()
    {
        return k.j().getBoolean("pref_debug_mode_enabled", false);
    }

    public static boolean b()
    {
        return k.j().getBoolean("pref_key_nslogger", false);
    }

    public static boolean c()
    {
        return k.j().getBoolean("pref_key_debug_collage_panel", false);
    }

    public static boolean d()
    {
        return k.j().getBoolean("pref_key_notification_log", false);
    }

    public static boolean e()
    {
        return k.j().getBoolean("pref_key_ads_test_mode", false);
    }

    public static boolean f()
    {
        return k.j().getBoolean("pref_key_webview_debug_enabled", false);
    }

    public static boolean g()
    {
        return k.j().getBoolean("pref_force_load_gallery_banner", false);
    }

    public static boolean h()
    {
        return k.j().getBoolean("pref_key_print_sandbox_mode", false);
    }

    public static long i()
    {
        SharedPreferences sharedpreferences = k.j();
        String s;
        if (a())
        {
            s = "pref_key_test_paid_sticker_expire_time";
        } else
        {
            s = "pref_key_paid_sticker_expire_time";
        }
        return sharedpreferences.getLong(s, 0xf731400L);
    }
}
