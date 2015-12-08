// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;


// Referenced classes of package com.facebook.share.widget:
//            LikeView

public static final class intValue extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static UNKNOWN DEFAULT;
    public static final UNKNOWN OPEN_GRAPH;
    public static final UNKNOWN PAGE;
    public static final UNKNOWN UNKNOWN;
    private int intValue;
    private String stringValue;

    public static intValue fromInt(int i)
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

    public static getValue valueOf(String s)
    {
        return (getValue)Enum.valueOf(com/facebook/share/widget/LikeView$ObjectType, s);
    }

    public static getValue[] values()
    {
        return (getValue[])$VALUES.clone();
    }

    public int getValue()
    {
        return intValue;
    }

    public String toString()
    {
        return stringValue;
    }

    static 
    {
        UNKNOWN = new <init>("UNKNOWN", 0, "unknown", 0);
        OPEN_GRAPH = new <init>("OPEN_GRAPH", 1, "open_graph", 1);
        PAGE = new <init>("PAGE", 2, "page", 2);
        $VALUES = (new .VALUES[] {
            UNKNOWN, OPEN_GRAPH, PAGE
        });
        DEFAULT = UNKNOWN;
    }

    private (String s, int i, String s1, int j)
    {
        super(s, i);
        stringValue = s1;
        intValue = j;
    }
}
