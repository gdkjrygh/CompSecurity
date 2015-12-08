// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;


public final class  extends Enum
{

    public static final ON OFF;
    public static final ON ON;
    private static final ON a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/brightcove/player/view/BrightcoveClosedCaptioningView$ClosedCaptioningMode, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        OFF = new <init>("OFF", 0);
        ON = new <init>("ON", 1);
        a = (new a[] {
            OFF, ON
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
