// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.internal.GmsLogger;

public final class JingleLog
{

    private static final GmsLogger sLogger = new GmsLogger("GamesJingle");

    public static void e(String s, String s1)
    {
        sLogger.e(s, s1);
    }

    public static String getTag()
    {
        return "GamesJingle";
    }

    public static void v(String s, String s1)
    {
        sLogger.v(s, s1);
    }

}
