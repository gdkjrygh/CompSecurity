// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.model;


public final class  extends Enum
{

    public static final AFTER AFTER;
    public static final AFTER BEFORE;
    public static final AFTER POINT_IN_TIME;
    private static final AFTER a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/brightcove/player/model/CuePoint$PositionType, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        BEFORE = new <init>("BEFORE", 0);
        POINT_IN_TIME = new <init>("POINT_IN_TIME", 1);
        AFTER = new <init>("AFTER", 2);
        a = (new a[] {
            BEFORE, POINT_IN_TIME, AFTER
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
