// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;


public final class YuMeAssetType extends Enum
{

    public static final YuMeAssetType IMAGE;
    public static final YuMeAssetType VIDEO;
    private static final YuMeAssetType a[];

    private YuMeAssetType(String s, int i)
    {
        super(s, i);
    }

    public static YuMeAssetType valueOf(String s)
    {
        return (YuMeAssetType)Enum.valueOf(com/yume/android/sdk/YuMeAssetType, s);
    }

    public static YuMeAssetType[] values()
    {
        YuMeAssetType ayumeassettype[] = a;
        int i = ayumeassettype.length;
        YuMeAssetType ayumeassettype1[] = new YuMeAssetType[i];
        System.arraycopy(ayumeassettype, 0, ayumeassettype1, 0, i);
        return ayumeassettype1;
    }

    static 
    {
        VIDEO = new YuMeAssetType("VIDEO", 0);
        IMAGE = new YuMeAssetType("IMAGE", 1);
        a = (new YuMeAssetType[] {
            VIDEO, IMAGE
        });
    }
}
