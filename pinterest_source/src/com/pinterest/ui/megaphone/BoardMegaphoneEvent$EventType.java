// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.megaphone;


public final class  extends Enum
{

    private static final PLACEPIN_SWITCH_BOARD_EDU $VALUES[];
    public static final PLACEPIN_SWITCH_BOARD_EDU PLACEPIN_SWITCH_BOARD_EDU;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/ui/megaphone/BoardMegaphoneEvent$EventType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PLACEPIN_SWITCH_BOARD_EDU = new <init>("PLACEPIN_SWITCH_BOARD_EDU", 0);
        $VALUES = (new .VALUES[] {
            PLACEPIN_SWITCH_BOARD_EDU
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
