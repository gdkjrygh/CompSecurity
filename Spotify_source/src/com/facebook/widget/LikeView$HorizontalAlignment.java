// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;


public final class intValue extends Enum
{

    public static final a a;
    public static final a b;
    public static final a c;
    static a d;
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
        return (intValue)Enum.valueOf(com/facebook/widget/LikeView$HorizontalAlignment, s);
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
        a = new <init>("CENTER", 0, "center", 0);
        b = new <init>("LEFT", 1, "left", 1);
        c = new <init>("RIGHT", 2, "right", 2);
        e = (new e[] {
            a, b, c
        });
        d = a;
    }

    private (String s, int i, String s1, int j)
    {
        super(s, i);
        stringValue = s1;
        intValue = j;
    }
}
