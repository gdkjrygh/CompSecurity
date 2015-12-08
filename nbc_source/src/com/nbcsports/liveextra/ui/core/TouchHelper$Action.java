// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.core;


// Referenced classes of package com.nbcsports.liveextra.ui.core:
//            TouchHelper

public static final class  extends Enum
{

    private static final BT $VALUES[];
    public static final BT BT;
    public static final BT LR;
    public static final BT None;
    public static final BT RL;
    public static final BT TB;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/nbcsports/liveextra/ui/core/TouchHelper$Action, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        None = new <init>("None", 0);
        LR = new <init>("LR", 1);
        RL = new <init>("RL", 2);
        TB = new <init>("TB", 3);
        BT = new <init>("BT", 4);
        $VALUES = (new .VALUES[] {
            None, LR, RL, TB, BT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
