// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;


// Referenced classes of package com.facebook.share.widget:
//            LikeView

public static final class intValue extends Enum
{

    private static final STANDARD $VALUES[];
    public static final STANDARD BOX_COUNT;
    public static final STANDARD BUTTON;
    static STANDARD DEFAULT;
    public static final STANDARD STANDARD;
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
        return (intValue)Enum.valueOf(com/facebook/share/widget/LikeView$Style, s);
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
        STANDARD = new <init>("STANDARD", 0, "standard", 0);
        BUTTON = new <init>("BUTTON", 1, "button", 1);
        BOX_COUNT = new <init>("BOX_COUNT", 2, "box_count", 2);
        $VALUES = (new .VALUES[] {
            STANDARD, BUTTON, BOX_COUNT
        });
        DEFAULT = STANDARD;
    }


    private (String s, int i, String s1, int j)
    {
        super(s, i);
        stringValue = s1;
        intValue = j;
    }
}
