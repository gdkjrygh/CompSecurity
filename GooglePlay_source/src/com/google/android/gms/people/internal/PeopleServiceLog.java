// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal;

import android.util.Log;

public final class PeopleServiceLog
{

    public static boolean canLog(int i)
    {
        return Log.isLoggable("PeopleService", i);
    }

    public static void d(String s, String s1)
    {
        if (canLog(3))
        {
            Log.d(s, s1);
        }
    }

    public static void w(String s, String s1, Throwable throwable)
    {
        if (canLog(5))
        {
            Log.w(s, s1, throwable);
        }
    }
}
