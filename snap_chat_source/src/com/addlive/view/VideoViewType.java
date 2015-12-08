// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.view;


public final class VideoViewType extends Enum
{

    private static final VideoViewType $VALUES[];
    public static final VideoViewType CIRCLE;
    public static final VideoViewType RECTANGLE;

    private VideoViewType(String s, int i)
    {
        super(s, i);
    }

    public static VideoViewType valueOf(String s)
    {
        return (VideoViewType)Enum.valueOf(com/addlive/view/VideoViewType, s);
    }

    public static VideoViewType[] values()
    {
        return (VideoViewType[])$VALUES.clone();
    }

    static 
    {
        RECTANGLE = new VideoViewType("RECTANGLE", 0);
        CIRCLE = new VideoViewType("CIRCLE", 1);
        $VALUES = (new VideoViewType[] {
            RECTANGLE, CIRCLE
        });
    }
}
