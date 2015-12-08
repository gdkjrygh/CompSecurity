// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;


public final class GURLUtils
{

    public GURLUtils()
    {
    }

    public static String getOrigin(String s)
    {
        return nativeGetOrigin(s);
    }

    public static String getScheme(String s)
    {
        return nativeGetScheme(s);
    }

    private static native String nativeGetOrigin(String s);

    private static native String nativeGetScheme(String s);
}
