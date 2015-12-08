// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads.factories;

import com.mopub.common.Preconditions;
import com.mopub.nativeads.CustomEventNative;
import com.mopub.nativeads.MoPubCustomEventNative;
import java.lang.reflect.Constructor;

public class CustomEventNativeFactory
{

    protected static CustomEventNativeFactory a = new CustomEventNativeFactory();

    public CustomEventNativeFactory()
    {
    }

    public static CustomEventNative create(String s)
    {
        if (s != null)
        {
            s = Class.forName(s).asSubclass(com/mopub/nativeads/CustomEventNative);
            Preconditions.checkNotNull(s);
            s = s.getDeclaredConstructor(null);
            s.setAccessible(true);
            return (CustomEventNative)s.newInstance(new Object[0]);
        } else
        {
            return new MoPubCustomEventNative();
        }
    }

    public static void setInstance(CustomEventNativeFactory customeventnativefactory)
    {
        Preconditions.checkNotNull(customeventnativefactory);
        a = customeventnativefactory;
    }

}
