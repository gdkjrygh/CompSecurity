// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.imageview;


public final class  extends Enum
{

    private static final TRANSPARENT $VALUES[];
    public static final TRANSPARENT GRAY;
    public static final TRANSPARENT LIGHT_GRAY;
    public static final TRANSPARENT NONE;
    public static final TRANSPARENT TRANSPARENT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/ui/imageview/GrayWebImageView$BorderStyle, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        LIGHT_GRAY = new <init>("LIGHT_GRAY", 1);
        GRAY = new <init>("GRAY", 2);
        TRANSPARENT = new <init>("TRANSPARENT", 3);
        $VALUES = (new .VALUES[] {
            NONE, LIGHT_GRAY, GRAY, TRANSPARENT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
