// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.development;

import me.lyft.android.LyftApplication;

public class LeakCanarySupport
{

    public LeakCanarySupport()
    {
    }

    private static Class getProxyClass()
    {
        return Class.forName("me.lyft.android.development.proxies.LeakCanaryProxy");
    }

    public static void installIfPresent(LyftApplication lyftapplication)
    {
    }
}
