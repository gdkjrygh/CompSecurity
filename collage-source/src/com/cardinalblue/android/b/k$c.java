// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

// Referenced classes of package com.cardinalblue.android.b:
//            k

public static class es.Editor
{

    public static void a(Context context, String s, int i)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext()).edit();
        context.putInt(s, i);
        context.apply();
    }

    public static void a(Context context, String s, boolean flag)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext()).edit();
        context.putBoolean(s, flag);
        context.apply();
    }

    public static int b(Context context, String s, int i)
    {
        return PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext()).getInt(s, i);
    }

    public static boolean b(Context context, String s, boolean flag)
    {
        return PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext()).getBoolean(s, flag);
    }

    public es.Editor()
    {
    }
}
