// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.clearengine.d;

import android.content.Context;
import android.content.SharedPreferences;

public class c
{

    public static long a(Context context, String s, long l)
    {
        return (new com.qihoo.security.clearengine.sdk.a.c(context)).getDefaultSharedPreferences().getLong(s, l);
    }

    public static String a(Context context, String s, String s1)
    {
        return (new com.qihoo.security.clearengine.sdk.a.c(context)).getDefaultSharedPreferences().getString(s, s1);
    }

    public static void b(Context context, String s, long l)
    {
        context = (new com.qihoo.security.clearengine.sdk.a.c(context)).getDefaultSharedPreferences().edit();
        context.putLong(s, l);
        context.commit();
    }

    public static void b(Context context, String s, String s1)
    {
        context = (new com.qihoo.security.clearengine.sdk.a.c(context)).getDefaultSharedPreferences().edit();
        context.putString(s, s1);
        context.commit();
    }
}
