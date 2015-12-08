// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;

public final class zzhm
{

    public static void zza(Context context, int i)
    {
        context = zzq(context).edit();
        context.putInt("webview_cache_version", i);
        context.commit();
    }

    public static void zza(Context context, boolean flag)
    {
        context = zzq(context).edit();
        context.putBoolean("use_https", flag);
        context.commit();
    }

    private static SharedPreferences zzq(Context context)
    {
        return context.getSharedPreferences("admob", 0);
    }

    public static boolean zzr(Context context)
    {
        return zzq(context).getBoolean("use_https", true);
    }

    public static int zzs(Context context)
    {
        return zzq(context).getInt("webview_cache_version", 0);
    }
}
