// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.deeplink;

import afw;
import uo;

public final class DeepLinkParser_Factory extends Enum
    implements afw
{

    private static final DeepLinkParser_Factory $VALUES[];
    public static final DeepLinkParser_Factory INSTANCE;

    private DeepLinkParser_Factory(String s)
    {
        super(s, 0);
    }

    public static afw create()
    {
        return INSTANCE;
    }

    public static DeepLinkParser_Factory valueOf(String s)
    {
        return (DeepLinkParser_Factory)Enum.valueOf(com/snapchat/android/deeplink/DeepLinkParser_Factory, s);
    }

    public static DeepLinkParser_Factory[] values()
    {
        return (DeepLinkParser_Factory[])$VALUES.clone();
    }

    public final volatile Object get()
    {
        return get();
    }

    public final uo get()
    {
        return new uo();
    }

    static 
    {
        INSTANCE = new DeepLinkParser_Factory("INSTANCE");
        $VALUES = (new DeepLinkParser_Factory[] {
            INSTANCE
        });
    }
}
