// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.sharedprefs;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.common.SharedPreferencesCompat;

public final class SharedPrefsConfig
{

    public static boolean getBoolean(Context context, String s, boolean flag)
    {
        return context.getSharedPreferences("playGames.sharedPrefs", 0).getBoolean(s, flag);
    }

    public static android.content.SharedPreferences.Editor getEditor(Context context)
    {
        return context.getSharedPreferences("playGames.sharedPrefs", 0).edit();
    }

    public static int getInt$607b6e67(Context context, String s)
    {
        return context.getSharedPreferences("playGames.sharedPrefs", 0).getInt(s, 0);
    }

    public static long getLong(Context context, String s, long l)
    {
        return context.getSharedPreferences("playGames.sharedPrefs", 0).getLong(s, l);
    }

    public static void registerListener(Context context, android.content.SharedPreferences.OnSharedPreferenceChangeListener onsharedpreferencechangelistener)
    {
        context.getSharedPreferences("playGames.sharedPrefs", 0).registerOnSharedPreferenceChangeListener(onsharedpreferencechangelistener);
    }

    public static void setBoolean(Context context, String s, boolean flag)
    {
        context = getEditor(context);
        context.putBoolean(s, flag);
        SharedPreferencesCompat.apply(context);
    }

    public static void setInt(Context context, String s, int i)
    {
        context = getEditor(context);
        context.putInt(s, i);
        SharedPreferencesCompat.apply(context);
    }

    public static void setLong(Context context, String s, long l)
    {
        context = getEditor(context);
        context.putLong(s, l);
        SharedPreferencesCompat.apply(context);
    }
}
