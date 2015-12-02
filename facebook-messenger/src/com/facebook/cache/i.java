// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.cache;


public final class i extends Enum
{

    private static final i $VALUES[];
    public static final i HIGH;
    public static final i LOW;
    public static final i MEDIUM;
    private final int mPriorityValue;

    private i(String s, int j, int k)
    {
        super(s, j);
        mPriorityValue = k;
    }

    public static i valueOf(String s)
    {
        return (i)Enum.valueOf(com/facebook/cache/i, s);
    }

    public static i[] values()
    {
        return (i[])$VALUES.clone();
    }

    public int getPriorityValue()
    {
        return mPriorityValue;
    }

    static 
    {
        HIGH = new i("HIGH", 0, 150);
        MEDIUM = new i("MEDIUM", 1, 100);
        LOW = new i("LOW", 2, 50);
        $VALUES = (new i[] {
            HIGH, MEDIUM, LOW
        });
    }
}
