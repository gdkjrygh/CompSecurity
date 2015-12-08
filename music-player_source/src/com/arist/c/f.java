// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.c;

import android.content.Context;
import android.content.SharedPreferences;

public final class f
{

    SharedPreferences a;

    public f(Context context)
    {
        a = context.getSharedPreferences("music_preference", 0);
    }

    public final String a()
    {
        return a.getString("third_music_path", "");
    }

    public final void a(int i1)
    {
        a.edit().putInt("second_position", i1).commit();
    }

    public final void a(long l1)
    {
        a.edit().putLong("preference_sleep_time_1", l1).commit();
    }

    public final void a(String s)
    {
        a.edit().putString("third_music_path", s).commit();
    }

    public final void a(boolean flag)
    {
        a.edit().putBoolean("pref_ignore_60seconds_music", flag).commit();
    }

    public final int b()
    {
        return a.getInt("second_position", 0);
    }

    public final void b(int i1)
    {
        a.edit().putInt("first_position", i1).commit();
    }

    public final int c()
    {
        return a.getInt("first_position", 0);
    }

    public final void c(int i1)
    {
        a.edit().putInt("playmode", i1).commit();
    }

    public final int d()
    {
        return a.getInt("playmode", 1);
    }

    public final void d(int i1)
    {
        a.edit().putInt("desk_lrc_position", i1).commit();
    }

    public final int e(int i1)
    {
        return a.getInt("desk_lrc_position", i1);
    }

    public final void e()
    {
        a.edit().putBoolean("show_desktop_lyrics", false).commit();
    }

    public final void f(int i1)
    {
        a.edit().putInt("preference_skin_color", i1).commit();
    }

    public final boolean f()
    {
        return a.getBoolean("show_desktop_lyrics", false);
    }

    public final boolean g()
    {
        return a.getBoolean("preference_shake_change_music", false);
    }

    public final long h()
    {
        return a.getLong("preference_sleep_time_1", 10L);
    }

    public final boolean i()
    {
        return a.getBoolean("preference_headset_out_stop", true);
    }

    public final boolean j()
    {
        return a.getBoolean("preference_headset_in_play", false);
    }

    public final boolean k()
    {
        return a.getBoolean("preference_headset_control_allow", true);
    }

    public final boolean l()
    {
        return a.getBoolean("pref_ignore_60seconds_music", false);
    }

    public final int m()
    {
        return a.getInt("preference_skin_color", 0xff00acc1);
    }

    public final void n()
    {
        a.edit().putBoolean("preference_color_first_start", false).commit();
    }

    public final boolean o()
    {
        return a.getBoolean("preference_color_first_start", true);
    }
}
