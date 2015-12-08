// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.utils;


public class VersionUtils
{

    private static final int MARSHMALLOW = 23;

    private VersionUtils()
    {
    }

    public static boolean hasJellyBean()
    {
        return android.os.Build.VERSION.SDK_INT >= 16;
    }

    public static boolean hasKitKat()
    {
        return android.os.Build.VERSION.SDK_INT >= 19;
    }

    public static boolean hasLollipop()
    {
        return android.os.Build.VERSION.SDK_INT >= 21;
    }

    public static boolean hasMarshmallow()
    {
        return android.os.Build.VERSION.SDK_INT >= 23 || "MNC".equals(android.os.Build.VERSION.CODENAME);
    }
}
