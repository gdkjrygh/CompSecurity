// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;


public final class YuMeImageRegion extends Enum
{

    public static final YuMeImageRegion BOTTOM_LEFT;
    public static final YuMeImageRegion BOTTOM_RIGHT;
    public static final YuMeImageRegion NONE;
    public static final YuMeImageRegion TOP_LEFT;
    public static final YuMeImageRegion TOP_RIGHT;
    private static final YuMeImageRegion a[];

    private YuMeImageRegion(String s, int i)
    {
        super(s, i);
    }

    public static YuMeImageRegion valueOf(String s)
    {
        return (YuMeImageRegion)Enum.valueOf(com/yume/android/sdk/YuMeImageRegion, s);
    }

    public static YuMeImageRegion[] values()
    {
        YuMeImageRegion ayumeimageregion[] = a;
        int i = ayumeimageregion.length;
        YuMeImageRegion ayumeimageregion1[] = new YuMeImageRegion[i];
        System.arraycopy(ayumeimageregion, 0, ayumeimageregion1, 0, i);
        return ayumeimageregion1;
    }

    static 
    {
        NONE = new YuMeImageRegion("NONE", 0);
        TOP_LEFT = new YuMeImageRegion("TOP_LEFT", 1);
        TOP_RIGHT = new YuMeImageRegion("TOP_RIGHT", 2);
        BOTTOM_LEFT = new YuMeImageRegion("BOTTOM_LEFT", 3);
        BOTTOM_RIGHT = new YuMeImageRegion("BOTTOM_RIGHT", 4);
        a = (new YuMeImageRegion[] {
            NONE, TOP_LEFT, TOP_RIGHT, BOTTOM_LEFT, BOTTOM_RIGHT
        });
    }
}
