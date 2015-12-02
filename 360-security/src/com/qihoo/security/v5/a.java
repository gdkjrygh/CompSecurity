// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v5;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.g;
import android.text.TextUtils;
import com.qihoo360.mobilesafe.share.SharedPref;

public class a
{

    public static void a(Context context)
    {
        if (context != null)
        {
            c(context);
            if (context != null)
            {
                g.a(context).a(new Intent("com.qihoo.security.v5.APPVersionRedPointHelper.ClickedReadPoint"));
                return;
            }
        }
    }

    public static void a(Context context, String s)
    {
        String s1;
        if (context != null && !TextUtils.isEmpty(s))
        {
            if (TextUtils.isEmpty(s1 = SharedPref.b(context, "app_version", "")) || a(s1, s))
            {
                SharedPref.a(context, "app_version", s);
                g.a(context).a(new Intent("com.qihoo.security.v5.APPVersionRedPointHelper.HasNewVersion"));
                SharedPref.a(context, "last_app_update_red_point_click_time", 0L);
                return;
            }
        }
    }

    private static boolean a(String s, String s1)
    {
        int j = -1;
        if (TextUtils.isEmpty(s) || TextUtils.isEmpty(s1))
        {
            return false;
        }
        s = s.replace(".", "");
        s1 = s1.replace(".", "");
        int i;
        int k;
        try
        {
            i = Integer.valueOf(s).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            i = -1;
        }
        k = Integer.valueOf(s1).intValue();
        j = k;
_L2:
        return j > i;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static boolean b(Context context)
    {
        long l = SharedPref.b(context, "last_app_update_red_point_click_time", 0L);
        context = SharedPref.b(context, "app_version", "");
        long l1 = System.currentTimeMillis();
        return a("1.0.8.3742", context) && l1 > 0x240c8400L + l;
    }

    private static void c(Context context)
    {
        SharedPref.a(context, "last_app_update_red_point_click_time", System.currentTimeMillis());
    }
}
