// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;


public final class YuMeAdBlockType extends Enum
{

    public static final YuMeAdBlockType MIDROLL;
    public static final YuMeAdBlockType NONE;
    public static final YuMeAdBlockType POSTROLL;
    public static final YuMeAdBlockType PREROLL;
    private static final YuMeAdBlockType a[];

    private YuMeAdBlockType(String s, int i)
    {
        super(s, i);
    }

    public static YuMeAdBlockType valueOf(String s)
    {
        return (YuMeAdBlockType)Enum.valueOf(com/yume/android/sdk/YuMeAdBlockType, s);
    }

    public static YuMeAdBlockType[] values()
    {
        YuMeAdBlockType ayumeadblocktype[] = a;
        int i = ayumeadblocktype.length;
        YuMeAdBlockType ayumeadblocktype1[] = new YuMeAdBlockType[i];
        System.arraycopy(ayumeadblocktype, 0, ayumeadblocktype1, 0, i);
        return ayumeadblocktype1;
    }

    static 
    {
        NONE = new YuMeAdBlockType("NONE", 0);
        PREROLL = new YuMeAdBlockType("PREROLL", 1);
        MIDROLL = new YuMeAdBlockType("MIDROLL", 2);
        POSTROLL = new YuMeAdBlockType("POSTROLL", 3);
        a = (new YuMeAdBlockType[] {
            NONE, PREROLL, MIDROLL, POSTROLL
        });
    }
}
