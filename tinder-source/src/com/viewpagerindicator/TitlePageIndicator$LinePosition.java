// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.viewpagerindicator;


// Referenced classes of package com.viewpagerindicator:
//            TitlePageIndicator

public static final class c extends Enum
{

    public static final b a;
    public static final b b;
    private static final b d[];
    public final int c;

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/viewpagerindicator/TitlePageIndicator$LinePosition, s);
    }

    public static c[] values()
    {
        return (c[])d.clone();
    }

    static 
    {
        a = new <init>("Bottom", 0, 0);
        b = new <init>("Top", 1, 1);
        d = (new d[] {
            a, b
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        c = j;
    }
}
