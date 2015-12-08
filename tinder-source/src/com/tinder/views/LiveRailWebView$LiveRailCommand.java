// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;


// Referenced classes of package com.tinder.views:
//            LiveRailWebView

public static final class  extends Enum
{

    private static final pause $VALUES[];
    public static final pause load;
    public static final pause pause;
    public static final pause setup;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/tinder/views/LiveRailWebView$LiveRailCommand, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        load = new <init>("load", 0);
        setup = new <init>("setup", 1);
        pause = new <init>("pause", 2);
        $VALUES = (new .VALUES[] {
            load, setup, pause
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
