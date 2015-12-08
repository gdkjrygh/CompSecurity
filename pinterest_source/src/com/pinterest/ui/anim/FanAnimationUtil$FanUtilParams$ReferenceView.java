// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.anim;


public final class  extends Enum
{

    private static final RIGHT $VALUES[];
    public static final RIGHT CENTER;
    public static final RIGHT LEFT;
    public static final RIGHT RIGHT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/ui/anim/FanAnimationUtil$FanUtilParams$ReferenceView, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        CENTER = new <init>("CENTER", 0);
        LEFT = new <init>("LEFT", 1);
        RIGHT = new <init>("RIGHT", 2);
        $VALUES = (new .VALUES[] {
            CENTER, LEFT, RIGHT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
