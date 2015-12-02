// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;


public final class av extends Enum
{

    private static final av $VALUES[];
    public static final av NUX;
    public static final av TOOLTIP;
    public static final av TOOLTIP_HOVER_OFF;

    private av(String s, int i)
    {
        super(s, i);
    }

    public static av valueOf(String s)
    {
        return (av)Enum.valueOf(com/facebook/orca/d/av, s);
    }

    public static av[] values()
    {
        return (av[])$VALUES.clone();
    }

    static 
    {
        TOOLTIP = new av("TOOLTIP", 0);
        TOOLTIP_HOVER_OFF = new av("TOOLTIP_HOVER_OFF", 1);
        NUX = new av("NUX", 2);
        $VALUES = (new av[] {
            TOOLTIP, TOOLTIP_HOVER_OFF, NUX
        });
    }
}
