// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;


// Referenced classes of package com.tinder.utils:
//            CustomFont

public static final class f extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    private static final e g[];
    String f;

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/tinder/utils/CustomFont$Font, s);
    }

    public static f[] values()
    {
        return (f[])g.clone();
    }

    public final String toString()
    {
        return f;
    }

    static 
    {
        a = new <init>("LIGHT", 0, "proximanovasoft-regular.otf");
        b = new <init>("REGULAR", 1, "proximanovasoft-regular.otf");
        c = new <init>("MEDIUM", 2, "proximanovasoft-medium.otf");
        d = new <init>("SEMI_BOLD", 3, "proximanovasoft-semibold.otf");
        e = new <init>("BOLD", 4, "proximanovasoft-bold.otf");
        g = (new g[] {
            a, b, c, d, e
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        f = s1;
    }
}
