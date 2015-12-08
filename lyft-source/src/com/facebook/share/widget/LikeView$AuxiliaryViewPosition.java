// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;


public final class intValue extends Enum
{

    private static final BOTTOM $VALUES[];
    public static final BOTTOM BOTTOM;
    static BOTTOM DEFAULT;
    public static final BOTTOM INLINE;
    public static final BOTTOM TOP;
    private int intValue;
    private String stringValue;

    static intValue fromInt(int i)
    {
        intValue aintvalue[] = values();
        int k = aintvalue.length;
        for (int j = 0; j < k; j++)
        {
            intValue intvalue = aintvalue[j];
            if (intvalue.getValue() == i)
            {
                return intvalue;
            }
        }

        return null;
    }

    private int getValue()
    {
        return intValue;
    }

    public static intValue valueOf(String s)
    {
        return (intValue)Enum.valueOf(com/facebook/share/widget/LikeView$AuxiliaryViewPosition, s);
    }

    public static intValue[] values()
    {
        return (intValue[])$VALUES.clone();
    }

    public String toString()
    {
        return stringValue;
    }

    static 
    {
        BOTTOM = new <init>("BOTTOM", 0, "bottom", 0);
        INLINE = new <init>("INLINE", 1, "inline", 1);
        TOP = new <init>("TOP", 2, "top", 2);
        $VALUES = (new .VALUES[] {
            BOTTOM, INLINE, TOP
        });
        DEFAULT = BOTTOM;
    }


    private (String s, int i, String s1, int j)
    {
        super(s, i);
        stringValue = s1;
        intValue = j;
    }
}
