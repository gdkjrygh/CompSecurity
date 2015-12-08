// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Future;

public final class gu
{

    static SharedPreferences a(Context context)
    {
        return b(context);
    }

    public static Future a(Context context, int i)
    {
        return (new _cls3(context, i)).zzgn();
    }

    public static Future a(Context context, b b1)
    {
        return (new _cls2(context, b1)).zzgn();
    }

    public static Future a(Context context, boolean flag)
    {
        return (new _cls1(context, flag)).zzgn();
    }

    private static SharedPreferences b(Context context)
    {
        return context.getSharedPreferences("admob", 0);
    }

    public static Future b(Context context, b b1)
    {
        return (new _cls4(context, b1)).zzgn();
    }

    // Unreferenced inner class com/google/android/gms/internal/gu$a
    /* block-local class not found */
    class a {}


    // Unreferenced inner class com/google/android/gms/internal/gu$b
    /* block-local class not found */
    class b {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls4 {}

}
