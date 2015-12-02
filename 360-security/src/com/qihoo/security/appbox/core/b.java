// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.core;

import android.content.Context;
import com.qihoo360.mobilesafe.share.SharedPref;

public class b
{

    public static a.a a(Context context, String s)
    {
        a.a a1 = new a.a();
        if (s.equals("0"))
        {
            a1.a = SharedPref.b(context, "pickers_app_box_data", null);
            a1.b = SharedPref.b(context, "pickers_app_box_data_timestamp", 0L);
            a1.c = SharedPref.b(context, "pickers_app_box_previous_time", 0L);
        } else
        {
            if (s.equals("1"))
            {
                a1.a = SharedPref.b(context, "apps_app_box_data", null);
                a1.b = SharedPref.b(context, "apps_app_box_data_timestamp", 0L);
                a1.c = SharedPref.b(context, "apps_app_box_previous_time", 0L);
                return a1;
            }
            if (s.equals("2"))
            {
                a1.a = SharedPref.b(context, "games_app_box_data", null);
                a1.b = SharedPref.b(context, "games_app_box_data_timestamp", 0L);
                a1.c = SharedPref.b(context, "games_app_box_previous_time", 0L);
                return a1;
            }
        }
        return a1;
    }

    public static void a(Context context, String s, long l)
    {
        SharedPref.a(context, s, l);
    }

    public static void a(Context context, String s, String s1)
    {
        SharedPref.a(context, s, s1);
    }

    public static void a(Context context, String s, String s1, long l, long l1)
    {
        if (s1.equals("0"))
        {
            a(context, "pickers_app_box_data", s);
            a(context, "pickers_app_box_data_timestamp", l1);
            b(context, "pickers_app_box_previous_time", l);
        } else
        {
            if (s1.equals("1"))
            {
                a(context, "apps_app_box_data", s);
                a(context, "apps_app_box_data_timestamp", l1);
                b(context, "apps_app_box_previous_time", l);
                return;
            }
            if (s1.equals("2"))
            {
                a(context, "games_app_box_data", s);
                a(context, "games_app_box_data_timestamp", l1);
                b(context, "games_app_box_previous_time", l);
                return;
            }
        }
    }

    public static void a(Context context, boolean flag)
    {
        SharedPref.a(context, "app_box_createdShortcut", flag);
    }

    public static boolean a(Context context)
    {
        return SharedPref.b(context, "app_box_createdShortcut", false);
    }

    public static void b(Context context, String s, long l)
    {
        SharedPref.a(context, s, l);
    }
}
