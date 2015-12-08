// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;


// Referenced classes of package com.tinder.views:
//            RecCard

static final class mValue extends Enum
{

    private static final THIRD_QUARTILE $VALUES[];
    public static final THIRD_QUARTILE FIRST_QUARTILE;
    public static final THIRD_QUARTILE INITIAL;
    public static final THIRD_QUARTILE MIDPOINT;
    public static final THIRD_QUARTILE THIRD_QUARTILE;
    private double mValue;

    public static mValue valueOf(String s)
    {
        return (mValue)Enum.valueOf(com/tinder/views/RecCard$Progress, s);
    }

    public static mValue[] values()
    {
        return (mValue[])$VALUES.clone();
    }

    public final double getValue()
    {
        return mValue;
    }

    static 
    {
        INITIAL = new <init>("INITIAL", 0, 0.0D);
        FIRST_QUARTILE = new <init>("FIRST_QUARTILE", 1, 0.25D);
        MIDPOINT = new <init>("MIDPOINT", 2, 0.5D);
        THIRD_QUARTILE = new <init>("THIRD_QUARTILE", 3, 0.75D);
        $VALUES = (new .VALUES[] {
            INITIAL, FIRST_QUARTILE, MIDPOINT, THIRD_QUARTILE
        });
    }

    private (String s, int i, double d)
    {
        super(s, i);
        mValue = d;
    }
}
