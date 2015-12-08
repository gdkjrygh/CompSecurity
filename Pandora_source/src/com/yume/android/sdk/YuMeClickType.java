// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;


public final class YuMeClickType extends Enum
{

    public static final YuMeClickType APPLICATION;
    public static final YuMeClickType IMAGE;
    public static final YuMeClickType NONE;
    public static final YuMeClickType URL;
    public static final YuMeClickType VIDEO;
    private static final YuMeClickType a[];

    private YuMeClickType(String s, int i)
    {
        super(s, i);
    }

    public static YuMeClickType valueOf(String s)
    {
        return (YuMeClickType)Enum.valueOf(com/yume/android/sdk/YuMeClickType, s);
    }

    public static YuMeClickType[] values()
    {
        YuMeClickType ayumeclicktype[] = a;
        int i = ayumeclicktype.length;
        YuMeClickType ayumeclicktype1[] = new YuMeClickType[i];
        System.arraycopy(ayumeclicktype, 0, ayumeclicktype1, 0, i);
        return ayumeclicktype1;
    }

    static 
    {
        NONE = new YuMeClickType("NONE", 0);
        URL = new YuMeClickType("URL", 1);
        IMAGE = new YuMeClickType("IMAGE", 2);
        VIDEO = new YuMeClickType("VIDEO", 3);
        APPLICATION = new YuMeClickType("APPLICATION", 4);
        a = (new YuMeClickType[] {
            NONE, URL, IMAGE, VIDEO, APPLICATION
        });
    }
}
