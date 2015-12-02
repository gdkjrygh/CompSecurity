// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.core.d;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

public class h
{

    private static final String a = com/qihoo360/mobilesafe/core/d/h.getSimpleName();

    public h()
    {
    }

    private static long a(Context context, String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return 0L;
        }
        long l;
        try
        {
            l = context.getSharedPreferences("sysclear_lib", 0).getLong(s, 0L);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return 0L;
        }
        return l;
    }

    public static void a(Context context)
    {
        a(context, "last_memory_clear_time", System.currentTimeMillis());
    }

    private static void a(Context context, String s, long l)
    {
        if (TextUtils.isEmpty(s))
        {
            return;
        }
        try
        {
            context = context.getSharedPreferences("sysclear_lib", 0).edit();
            context.putLong(s, l);
            context.commit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public static long b(Context context)
    {
        return a(context, "last_memory_clear_time");
    }

}
