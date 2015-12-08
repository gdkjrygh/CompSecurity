// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.text;


public final class  extends Enum
{

    private static final DISABLED $VALUES[];
    public static final DISABLED DISABLED;
    public static final DISABLED INVERTED;
    public static final DISABLED PLAIN;
    public static final DISABLED RED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/ui/text/PButton$ButtonStyle, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        RED = new <init>("RED", 0);
        PLAIN = new <init>("PLAIN", 1);
        INVERTED = new <init>("INVERTED", 2);
        DISABLED = new <init>("DISABLED", 3);
        $VALUES = (new .VALUES[] {
            RED, PLAIN, INVERTED, DISABLED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
