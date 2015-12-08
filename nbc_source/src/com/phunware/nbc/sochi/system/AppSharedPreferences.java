// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.system;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class AppSharedPreferences
{

    private AppSharedPreferences()
    {
    }

    public static void addSetting(Context context, String s, String s1)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext()).edit();
        context.putString(s, s1);
        context.commit();
    }

    public static void deleteSetting(Context context, String s)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext()).edit();
        context.remove(s);
        context.commit();
    }

    public static String getSetting(Context context, String s)
    {
        return PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext()).getString(s, null);
    }
}
