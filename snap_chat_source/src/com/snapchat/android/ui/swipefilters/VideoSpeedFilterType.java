// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.swipefilters;


public final class VideoSpeedFilterType extends Enum
{

    private static final VideoSpeedFilterType $VALUES[];
    public static final VideoSpeedFilterType FAST;
    public static final VideoSpeedFilterType SLOW;
    private final double a;
    private final int b;

    private VideoSpeedFilterType(String s, int i, double d, int j)
    {
        super(s, i);
        a = d;
        b = j;
    }

    public static VideoSpeedFilterType valueOf(String s)
    {
        return (VideoSpeedFilterType)Enum.valueOf(com/snapchat/android/ui/swipefilters/VideoSpeedFilterType, s);
    }

    public static VideoSpeedFilterType[] values()
    {
        return (VideoSpeedFilterType[])$VALUES.clone();
    }

    public final int getIconResourceId()
    {
        return b;
    }

    public final double getPlaybackRate()
    {
        return a;
    }

    static 
    {
        SLOW = new VideoSpeedFilterType("SLOW", 0, 0.5D, 0x7f020235);
        FAST = new VideoSpeedFilterType("FAST", 1, 2D, 0x7f02013c);
        $VALUES = (new VideoSpeedFilterType[] {
            SLOW, FAST
        });
    }
}
