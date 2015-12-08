// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;


public final class  extends Enum
{

    private static final NEVER_DISPLAY $VALUES[];
    public static final NEVER_DISPLAY DEFAULT;
    public static final NEVER_DISPLAY DISPLAY_ALWAYS;
    public static final NEVER_DISPLAY NEVER_DISPLAY;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/facebook/widget/LoginButton$ToolTipMode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        DEFAULT = new <init>("DEFAULT", 0);
        DISPLAY_ALWAYS = new <init>("DISPLAY_ALWAYS", 1);
        NEVER_DISPLAY = new <init>("NEVER_DISPLAY", 2);
        $VALUES = (new .VALUES[] {
            DEFAULT, DISPLAY_ALWAYS, NEVER_DISPLAY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
