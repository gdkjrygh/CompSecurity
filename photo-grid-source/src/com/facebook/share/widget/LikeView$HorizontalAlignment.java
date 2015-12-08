// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;


public final class intValue extends Enum
{

    private static final CENTER $VALUES[];
    public static final CENTER CENTER;
    static CENTER DEFAULT;
    public static final CENTER LEFT;
    public static final CENTER RIGHT;
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
        return (intValue)Enum.valueOf(com/facebook/share/widget/LikeView$HorizontalAlignment, s);
    }

    public static intValue[] values()
    {
        return (intValue[])$VALUES.clone();
    }

    public final String toString()
    {
        return stringValue;
    }

    static 
    {
        CENTER = new <init>("CENTER", 0, "center", 0);
        LEFT = new <init>("LEFT", 1, "left", 1);
        RIGHT = new <init>("RIGHT", 2, "right", 2);
        $VALUES = (new .VALUES[] {
            CENTER, LEFT, RIGHT
        });
        DEFAULT = CENTER;
    }


    private (String s, int i, String s1, int j)
    {
        super(s, i);
        stringValue = s1;
        intValue = j;
    }
}
