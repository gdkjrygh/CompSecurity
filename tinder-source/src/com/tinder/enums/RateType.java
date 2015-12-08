// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.enums;


public final class RateType extends Enum
{

    private static final RateType $VALUES[];
    public static final RateType LIKE;
    public static final RateType PASS;
    public static final RateType SUPERLIKE;

    private RateType(String s, int i)
    {
        super(s, i);
    }

    public static RateType valueOf(String s)
    {
        return (RateType)Enum.valueOf(com/tinder/enums/RateType, s);
    }

    public static RateType[] values()
    {
        return (RateType[])$VALUES.clone();
    }

    static 
    {
        LIKE = new RateType("LIKE", 0);
        PASS = new RateType("PASS", 1);
        SUPERLIKE = new RateType("SUPERLIKE", 2);
        $VALUES = (new RateType[] {
            LIKE, PASS, SUPERLIKE
        });
    }
}
