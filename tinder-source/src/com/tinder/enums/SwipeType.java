// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.enums;


public final class SwipeType extends Enum
{

    private static final SwipeType $VALUES[];
    public static final SwipeType LIKE_BUTTON;
    public static final SwipeType LIKE_SWIPE;
    public static final SwipeType PASS_BUTTON;
    public static final SwipeType PASS_SWIPE;
    public static final SwipeType SUPER_LIKE_BUTTON;
    public static final SwipeType SUPER_LIKE_SWIPE;
    private final boolean mAnalyticsFlag;
    private final String mAnalyticsMethod;

    private SwipeType(String s, int i, boolean flag, String s1)
    {
        super(s, i);
        mAnalyticsFlag = flag;
        mAnalyticsMethod = s1;
    }

    public static SwipeType valueOf(String s)
    {
        return (SwipeType)Enum.valueOf(com/tinder/enums/SwipeType, s);
    }

    public static SwipeType[] values()
    {
        return (SwipeType[])$VALUES.clone();
    }

    public final boolean getAnalyticsFlag()
    {
        return mAnalyticsFlag;
    }

    public final String getAnalyticsMethod()
    {
        return mAnalyticsMethod;
    }

    static 
    {
        LIKE_SWIPE = new SwipeType("LIKE_SWIPE", 0, true, "SWIPE");
        LIKE_BUTTON = new SwipeType("LIKE_BUTTON", 1, true, "BUTTON");
        PASS_SWIPE = new SwipeType("PASS_SWIPE", 2, false, "SWIPE");
        PASS_BUTTON = new SwipeType("PASS_BUTTON", 3, false, "BUTTON");
        SUPER_LIKE_SWIPE = new SwipeType("SUPER_LIKE_SWIPE", 4, true, "SWIPE");
        SUPER_LIKE_BUTTON = new SwipeType("SUPER_LIKE_BUTTON", 5, true, "BUTTON");
        $VALUES = (new SwipeType[] {
            LIKE_SWIPE, LIKE_BUTTON, PASS_SWIPE, PASS_BUTTON, SUPER_LIKE_SWIPE, SUPER_LIKE_BUTTON
        });
    }
}
