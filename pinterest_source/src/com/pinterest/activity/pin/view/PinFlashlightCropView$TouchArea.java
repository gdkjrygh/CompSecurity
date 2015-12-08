// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;


final class  extends Enum
{

    private static final RIGHT_BOTTOM $VALUES[];
    public static final RIGHT_BOTTOM INSIDE;
    public static final RIGHT_BOTTOM LEFT_BOTTOM;
    public static final RIGHT_BOTTOM LEFT_TOP;
    public static final RIGHT_BOTTOM OUT_OF_BOUNDS;
    public static final RIGHT_BOTTOM RIGHT_BOTTOM;
    public static final RIGHT_BOTTOM RIGHT_TOP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/activity/pin/view/PinFlashlightCropView$TouchArea, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        OUT_OF_BOUNDS = new <init>("OUT_OF_BOUNDS", 0);
        INSIDE = new <init>("INSIDE", 1);
        LEFT_TOP = new <init>("LEFT_TOP", 2);
        RIGHT_TOP = new <init>("RIGHT_TOP", 3);
        LEFT_BOTTOM = new <init>("LEFT_BOTTOM", 4);
        RIGHT_BOTTOM = new <init>("RIGHT_BOTTOM", 5);
        $VALUES = (new .VALUES[] {
            OUT_OF_BOUNDS, INSIDE, LEFT_TOP, RIGHT_TOP, LEFT_BOTTOM, RIGHT_BOTTOM
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
