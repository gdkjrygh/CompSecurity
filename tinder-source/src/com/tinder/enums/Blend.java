// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.enums;


public final class Blend extends Enum
{

    private static final Blend $VALUES[];
    public static final Blend DISTANCE;
    public static final Blend OPTIMAL;
    public static final Blend POPULARITY;
    public static final Blend RECENT_ACTIVITY;
    public String name;
    public int source;

    private Blend(String s, int i, String s1, int j)
    {
        super(s, i);
        name = s1;
        source = j;
    }

    public static Blend valueOf(String s)
    {
        return (Blend)Enum.valueOf(com/tinder/enums/Blend, s);
    }

    public static Blend[] values()
    {
        return (Blend[])$VALUES.clone();
    }

    static 
    {
        OPTIMAL = new Blend("OPTIMAL", 0, "optimal", 0);
        POPULARITY = new Blend("POPULARITY", 1, "popularity", 1);
        DISTANCE = new Blend("DISTANCE", 2, "distance", 2);
        RECENT_ACTIVITY = new Blend("RECENT_ACTIVITY", 3, "recency", 3);
        $VALUES = (new Blend[] {
            OPTIMAL, POPULARITY, DISTANCE, RECENT_ACTIVITY
        });
    }
}
