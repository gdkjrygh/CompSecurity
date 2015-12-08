// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cc;


// Referenced classes of package com.google.android.m4b.maps.cc:
//            i

public static final class  extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static  a(int j)
    {
        switch (j)
        {
        default:
            throw new IllegalArgumentException("Unknown justification");

        case 1: // '\001'
            return a;

        case 2: // '\002'
            return b;

        case 3: // '\003'
            return c;
        }
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/google/android/m4b/maps/cc/i$c, s);
    }

    public static c[] values()
    {
        return (c[])d.clone();
    }

    static 
    {
        a = new <init>("CENTER", 0);
        b = new <init>("LEFT", 1);
        c = new <init>("RIGHT", 2);
        d = (new d[] {
            a, b, c
        });
    }

    private (String s, int j)
    {
        super(s, j);
    }
}
