// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common.event;


public final class a extends Enum
{

    public static final NATIVE NATIVE;
    public static final NATIVE NONE;
    public static final NATIVE WEB_VIEW;
    private static final NATIVE b[];
    private final int a;

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/mopub/common/event/BaseEvent$SdkProduct, s);
    }

    public static a[] values()
    {
        return (a[])b.clone();
    }

    public final int getType()
    {
        return a;
    }

    static 
    {
        NONE = new <init>("NONE", 0, 0);
        WEB_VIEW = new <init>("WEB_VIEW", 1, 1);
        NATIVE = new <init>("NATIVE", 2, 2);
        b = (new b[] {
            NONE, WEB_VIEW, NATIVE
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        a = j;
    }
}
