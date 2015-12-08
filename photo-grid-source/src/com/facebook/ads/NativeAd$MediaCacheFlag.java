// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import java.util.EnumSet;

public final class a extends Enum
{

    public static final EnumSet ALL = EnumSet.allOf(com/facebook/ads/NativeAd$MediaCacheFlag);
    public static final IMAGE ICON;
    public static final IMAGE IMAGE;
    public static final IMAGE NONE;
    private static final IMAGE b[];
    private final long a;

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/facebook/ads/NativeAd$MediaCacheFlag, s);
    }

    public static a[] values()
    {
        return (a[])b.clone();
    }

    public final long getCacheFlagValue()
    {
        return a;
    }

    static 
    {
        NONE = new <init>("NONE", 0, 0L);
        ICON = new <init>("ICON", 1, 1L);
        IMAGE = new <init>("IMAGE", 2, 2L);
        b = (new b[] {
            NONE, ICON, IMAGE
        });
    }

    private (String s, int i, long l)
    {
        super(s, i);
        a = l;
    }
}
