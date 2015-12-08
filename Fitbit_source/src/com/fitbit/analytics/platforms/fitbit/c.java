// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.analytics.platforms.fitbit;

import android.content.Context;
import android.content.SharedPreferences;
import com.fitbit.analytics.core.a;

public class c
{

    private static final String a = "backoff_timeout";
    private static String b = "FitbitAnalytics";

    public c()
    {
    }

    public static long a()
    {
        return com.fitbit.analytics.core.a.a().d().getSharedPreferences(b, 0).getLong("backoff_timeout", 0L);
    }

    public static void a(long l)
    {
        android.content.SharedPreferences.Editor editor = com.fitbit.analytics.core.a.a().d().getSharedPreferences(b, 0).edit();
        editor.putLong("backoff_timeout", l);
        editor.apply();
    }

}
