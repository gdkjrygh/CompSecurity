// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;


public final class intValue extends Enum
{

    public static final a a;
    public static final a b;
    static a c;
    private static a d;
    private static final a e[];
    private int intValue;
    private String stringValue;

    static int a(intValue intvalue)
    {
        return intvalue.intValue;
    }

    static intValue a(int i)
    {
        intValue aintvalue[] = values();
        int k = aintvalue.length;
        for (int j = 0; j < k; j++)
        {
            intValue intvalue = aintvalue[j];
            if (intvalue.intValue == i)
            {
                return intvalue;
            }
        }

        return null;
    }

    public static intValue valueOf(String s)
    {
        return (intValue)Enum.valueOf(com/facebook/widget/LikeView$Style, s);
    }

    public static intValue[] values()
    {
        return (intValue[])e.clone();
    }

    public final String toString()
    {
        return stringValue;
    }

    static 
    {
        a = new <init>("STANDARD", 0, "standard", 0);
        d = new <init>("BUTTON", 1, "button", 1);
        b = new <init>("BOX_COUNT", 2, "box_count", 2);
        e = (new e[] {
            a, d, b
        });
        c = a;
    }

    private (String s, int i, String s1, int j)
    {
        super(s, i);
        stringValue = s1;
        intValue = j;
    }
}
