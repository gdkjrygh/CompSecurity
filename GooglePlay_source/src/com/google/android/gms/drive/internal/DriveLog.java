// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.internal.GmsLogger;

public final class DriveLog
{

    private static final GmsLogger LOGGER = new GmsLogger("GmsDrive");

    public static void d(String s, String s1)
    {
        LOGGER.d(s, s1);
    }

    public static void e(String s, String s1)
    {
        LOGGER.e(s, s1);
    }

    public static void e(String s, Throwable throwable, String s1)
    {
        LOGGER.e(s, s1, throwable);
    }

    public static void w(String s, String s1)
    {
        LOGGER.w(s, s1);
    }

}
