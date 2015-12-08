// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login.widget;


public final class  extends Enum
{

    private static final BLACK $VALUES[];
    public static final BLACK BLACK;
    public static final BLACK BLUE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/facebook/login/widget/ToolTipPopup$Style, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        BLUE = new <init>("BLUE", 0);
        BLACK = new <init>("BLACK", 1);
        $VALUES = (new .VALUES[] {
            BLUE, BLACK
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
