// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.model;


// Referenced classes of package com.brightcove.player.model:
//            StyledElement

public static final class  extends Enum
{

    public static final BOLD BOLD;
    public static final BOLD NORMAL;
    public static final BOLD UNDEFINED;
    private static final BOLD a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/brightcove/player/model/StyledElement$FontWeight, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        UNDEFINED = new <init>("UNDEFINED", 0);
        NORMAL = new <init>("NORMAL", 1);
        BOLD = new <init>("BOLD", 2);
        a = (new a[] {
            UNDEFINED, NORMAL, BOLD
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
