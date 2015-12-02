// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;


public final class ch extends Enum
{

    private static final ch $VALUES[];
    public static final ch LOCAL_DATA;
    public static final ch NETWORK_DATA;
    public static final ch NO_DATA;
    public static final ch UNDEFINED;
    private final int mFlags;

    private ch(String s, int i, int j)
    {
        super(s, i);
        mFlags = j;
    }

    public static ch valueOf(String s)
    {
        return (ch)Enum.valueOf(com/facebook/analytics/ch, s);
    }

    public static ch[] values()
    {
        return (ch[])$VALUES.clone();
    }

    public int getValue()
    {
        return mFlags;
    }

    static 
    {
        UNDEFINED = new ch("UNDEFINED", 0, 0);
        NO_DATA = new ch("NO_DATA", 1, 1);
        LOCAL_DATA = new ch("LOCAL_DATA", 2, 2);
        NETWORK_DATA = new ch("NETWORK_DATA", 3, 3);
        $VALUES = (new ch[] {
            UNDEFINED, NO_DATA, LOCAL_DATA, NETWORK_DATA
        });
    }
}
