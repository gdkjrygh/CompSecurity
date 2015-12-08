// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.anim;


public final class  extends Enum
{

    private static final BOTTOM $VALUES[];
    public static final BOTTOM BOTTOM;
    public static final BOTTOM BOTTOM_LEFT;
    public static final BOTTOM BOTTOM_RIGHT;
    public static final BOTTOM CENTER;
    public static final BOTTOM LEFT;
    public static final BOTTOM NONE;
    public static final BOTTOM RIGHT;
    public static final BOTTOM TOP;
    public static final BOTTOM TOP_LEFT;
    public static final BOTTOM TOP_RIGHT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/ui/anim/FanAnimationUtil$FanUtilParams$PivotPoint, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        CENTER = new <init>("CENTER", 1);
        TOP_LEFT = new <init>("TOP_LEFT", 2);
        TOP = new <init>("TOP", 3);
        TOP_RIGHT = new <init>("TOP_RIGHT", 4);
        LEFT = new <init>("LEFT", 5);
        RIGHT = new <init>("RIGHT", 6);
        BOTTOM_LEFT = new <init>("BOTTOM_LEFT", 7);
        BOTTOM_RIGHT = new <init>("BOTTOM_RIGHT", 8);
        BOTTOM = new <init>("BOTTOM", 9);
        $VALUES = (new .VALUES[] {
            NONE, CENTER, TOP_LEFT, TOP, TOP_RIGHT, LEFT, RIGHT, BOTTOM_LEFT, BOTTOM_RIGHT, BOTTOM
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
