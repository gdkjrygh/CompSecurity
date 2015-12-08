// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.config.impl.resolvers;

import com.skype.android.util.config.impl.NameResolver;

public class PropertyNameResolver
    implements NameResolver
{

    private static final String PREFIX = "prop/";

    public PropertyNameResolver()
    {
    }

    static native String getAndroidProperty(String s);

    public String getPrefix()
    {
        return "prop/";
    }

    public String getValue(String s)
    {
        String s1 = System.getProperty(s);
        if (s1 != null)
        {
            return s1;
        } else
        {
            return getAndroidProperty(s);
        }
    }
}
