// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.k;

import android.content.Context;
import android.content.SharedPreferences;

public class g
{

    private static g a = new g();
    private static SharedPreferences b;
    private final String c = "slyce_premium_mode";
    private final String d = "slyce_2D_mode";
    private final String e = "slyce_2D_secret";
    private final String f = "slyce_2D_key";
    private final String g = "slyce_client_id";
    private final String h = "slyce_people_analytics_created";
    private final String i = "slyce_public_app_key";
    private final String j = "slyce_public_app_id";
    private final String k = "slyce_client_info";
    private String l;

    private g()
    {
        l = "slyce_crop_image";
    }

    public static g a(Context context)
    {
        b = context.getSharedPreferences("com.android.slyce", 0);
        return a;
    }

    public void a(String s)
    {
        android.content.SharedPreferences.Editor editor = b.edit();
        boolean flag;
        if (s.trim().toLowerCase().equalsIgnoreCase("true"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        editor.putBoolean("slyce_premium_mode", flag);
        editor.apply();
    }

    public boolean a()
    {
        return b.getBoolean("slyce_premium_mode", false);
    }

    public void b(String s)
    {
        android.content.SharedPreferences.Editor editor = b.edit();
        boolean flag;
        if (s.trim().toLowerCase().equalsIgnoreCase("true"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        editor.putBoolean("slyce_2D_mode", flag);
        editor.apply();
    }

    public boolean b()
    {
        return b.getBoolean("slyce_2D_mode", false);
    }

    public String c()
    {
        return b.getString("slyce_2D_secret", null);
    }

    public void c(String s)
    {
        android.content.SharedPreferences.Editor editor = b.edit();
        editor.putString("slyce_2D_secret", s);
        editor.apply();
    }

    public String d()
    {
        return b.getString("slyce_2D_key", null);
    }

    public void d(String s)
    {
        android.content.SharedPreferences.Editor editor = b.edit();
        editor.putString("slyce_2D_key", s);
        editor.apply();
    }

    public String e()
    {
        return b.getString("slyce_client_id", null);
    }

    public void e(String s)
    {
        android.content.SharedPreferences.Editor editor = b.edit();
        editor.putString("slyce_client_id", s);
        editor.apply();
    }

    public String f()
    {
        return b.getString("slyce_people_analytics_created", null);
    }

    public void f(String s)
    {
        android.content.SharedPreferences.Editor editor = b.edit();
        editor.putString("slyce_people_analytics_created", s);
        editor.apply();
    }

    public String g()
    {
        return b.getString("slyce_public_app_key", null);
    }

    public void g(String s)
    {
        android.content.SharedPreferences.Editor editor = b.edit();
        boolean flag;
        if (s.trim().toLowerCase().equalsIgnoreCase("true"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        editor.putBoolean(l, flag);
        editor.apply();
    }

    public String h()
    {
        return b.getString("slyce_public_app_id", null);
    }

    public void h(String s)
    {
        android.content.SharedPreferences.Editor editor = b.edit();
        editor.putString("slyce_client_info", s);
        editor.apply();
    }

    public boolean i()
    {
        return b.getBoolean(l, false);
    }

    public String j()
    {
        return b.getString("slyce_client_info", null);
    }

}
