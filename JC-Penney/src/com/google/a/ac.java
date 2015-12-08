// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a;


// Referenced classes of package com.google.a:
//            ad, ae

public abstract class ac extends Enum
{

    public static final ac a;
    public static final ac b;
    private static final ac c[];

    private ac(String s, int i)
    {
        super(s, i);
    }

    ac(String s, int i, ad ad1)
    {
        this(s, i);
    }

    public static ac valueOf(String s)
    {
        return (ac)Enum.valueOf(com/google/a/ac, s);
    }

    public static ac[] values()
    {
        return (ac[])c.clone();
    }

    static 
    {
        a = new ad("DEFAULT", 0);
        b = new ae("STRING", 1);
        c = (new ac[] {
            a, b
        });
    }
}
