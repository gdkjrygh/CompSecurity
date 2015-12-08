// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.a;

import android.content.Context;
import android.content.SharedPreferences;

public final class m
{

    public static int a(Context context)
    {
        return context.getSharedPreferences("iab", 0).getInt("iab_result", 0);
    }

    public static void a(Context context, int i)
    {
        context.getSharedPreferences("iab", 0).edit().putInt("iab_result", i).apply();
    }

    public static int b(Context context)
    {
        return context.getSharedPreferences("iab", 0).getInt("iab_year_result", 0);
    }

    public static void b(Context context, int i)
    {
        context.getSharedPreferences("iab", 0).edit().putInt("iab_year_result", i).apply();
    }

    public static int c(Context context)
    {
        return context.getSharedPreferences("iab", 0).getInt("iab_lifelong_result", 0);
    }

    public static void c(Context context, int i)
    {
        context.getSharedPreferences("iab", 0).edit().putInt("iab_lifelong_result", i).apply();
    }
}
