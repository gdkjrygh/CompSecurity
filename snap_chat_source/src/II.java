// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.snapchat.android.SnapchatApplication;

public final class II
{

    private static final SharedPreferences SHARED_PREFERENCES = PreferenceManager.getDefaultSharedPreferences(SnapchatApplication.get());

    public static String a(String s)
    {
        return SHARED_PREFERENCES.getString(s, null);
    }

    public static void a(String s, int i)
    {
        SHARED_PREFERENCES.edit().putInt(s, i).apply();
    }

    public static void a(String s, String s1)
    {
        SHARED_PREFERENCES.edit().putString(s, s1).apply();
    }

    public static boolean a(String s, boolean flag)
    {
        return SHARED_PREFERENCES.getBoolean(s, flag);
    }

    public static int b(String s)
    {
        return SHARED_PREFERENCES.getInt(s, 0);
    }

    public static void b(String s, boolean flag)
    {
        SHARED_PREFERENCES.edit().putBoolean(s, flag).apply();
    }

}
