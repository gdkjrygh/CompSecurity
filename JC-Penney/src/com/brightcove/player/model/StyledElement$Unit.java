// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.model;


public final class  extends Enum
{

    public static final PT EMS;
    public static final PT PERCENT;
    public static final PT PT;
    public static final PT PX;
    public static final PT UNDEFINED;
    private static final PT a[];

    public static  fromString(String s)
    {
        if (s == null)
        {
            return UNDEFINED;
        }
        if (s.equals("%"))
        {
            return PERCENT;
        } else
        {
            return valueOf(s);
        }
    }

    public static valueOf valueOf(String s)
    {
        return (valueOf)Enum.valueOf(com/brightcove/player/model/StyledElement$Unit, s);
    }

    public static valueOf[] values()
    {
        return (valueOf[])a.clone();
    }

    static 
    {
        UNDEFINED = new <init>("UNDEFINED", 0);
        EMS = new <init>("EMS", 1);
        PERCENT = new <init>("PERCENT", 2);
        PX = new <init>("PX", 3);
        PT = new <init>("PT", 4);
        a = (new a[] {
            UNDEFINED, EMS, PERCENT, PX, PT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
