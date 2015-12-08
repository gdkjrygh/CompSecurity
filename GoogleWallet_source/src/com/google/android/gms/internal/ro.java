// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Log;

public final class ro
{

    private static volatile boolean aCW;

    public static void b(String s, String s1, Throwable throwable)
    {
        if (di(5))
        {
            Log.w(s, s1, throwable);
        }
    }

    private static boolean di(int i)
    {
        return aCW || Log.isLoggable("PeopleService", i);
    }

    public static boolean qQ()
    {
        return di(3);
    }

    public static void t(String s, String s1)
    {
        if (di(3))
        {
            Log.d(s, s1);
        }
    }

    public static void w(String s, String s1)
    {
        if (di(5))
        {
            Log.w(s, s1);
        }
    }
}
