// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;


public final class mValue extends Enum
{

    private static final CENTERED $VALUES[];
    public static final CENTERED CENTERED;
    public static final CENTERED NORMAL;
    private final int mValue;

    public static mValue valueOf(String s)
    {
        return (mValue)Enum.valueOf(com/dominos/fragments/LoyaltyWidgetFragment$LoyaltyWidgetType, s);
    }

    public static mValue[] values()
    {
        return (mValue[])$VALUES.clone();
    }

    public final int getValue()
    {
        return mValue;
    }

    static 
    {
        NORMAL = new <init>("NORMAL", 0, 1);
        CENTERED = new <init>("CENTERED", 1, 2);
        $VALUES = (new .VALUES[] {
            NORMAL, CENTERED
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        mValue = j;
    }
}
