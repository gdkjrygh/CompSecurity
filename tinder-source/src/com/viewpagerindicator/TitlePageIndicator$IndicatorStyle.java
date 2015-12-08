// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.viewpagerindicator;


// Referenced classes of package com.viewpagerindicator:
//            TitlePageIndicator

public static final class d extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c e[];
    public final int d;

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/viewpagerindicator/TitlePageIndicator$IndicatorStyle, s);
    }

    public static d[] values()
    {
        return (d[])e.clone();
    }

    static 
    {
        a = new <init>("None", 0, 0);
        b = new <init>("Triangle", 1, 1);
        c = new <init>("Underline", 2, 2);
        e = (new e[] {
            a, b, c
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        d = j;
    }
}
