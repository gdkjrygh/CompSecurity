// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;


// Referenced classes of package com.google.ads:
//            a

public static final class t> extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static t> valueOf(String s)
    {
        return (t>)Enum.valueOf(com/google/ads/a$a, s);
    }

    public static eOf[] values()
    {
        return (eOf[])d.clone();
    }

    static 
    {
        a = new <init>("UNKNOWN", 0);
        b = new <init>("MALE", 1);
        c = new <init>("FEMALE", 2);
        d = (new d[] {
            a, b, c
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
