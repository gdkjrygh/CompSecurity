// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads.factories;

import com.mopub.mobileads.CustomEventInterstitial;
import java.lang.reflect.Constructor;

public class CustomEventInterstitialFactory
{

    private static CustomEventInterstitialFactory a = new CustomEventInterstitialFactory();

    public CustomEventInterstitialFactory()
    {
    }

    public static CustomEventInterstitial create(String s)
    {
        s = Class.forName(s).asSubclass(com/mopub/mobileads/CustomEventInterstitial).getDeclaredConstructor(null);
        s.setAccessible(true);
        return (CustomEventInterstitial)s.newInstance(new Object[0]);
    }

    public static void setInstance(CustomEventInterstitialFactory customeventinterstitialfactory)
    {
        a = customeventinterstitialfactory;
    }

}
