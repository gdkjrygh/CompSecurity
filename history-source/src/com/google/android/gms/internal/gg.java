// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;

public final class gg
{

    public static void a(Context context, boolean flag)
    {
        context = n(context).edit();
        context.putBoolean("use_https", flag);
        context.commit();
    }

    private static SharedPreferences n(Context context)
    {
        return context.getSharedPreferences("admob", 0);
    }

    public static boolean o(Context context)
    {
        return n(context).getBoolean("use_https", true);
    }
}
