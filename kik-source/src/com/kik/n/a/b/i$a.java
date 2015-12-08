// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.n.a.b;


// Referenced classes of package com.kik.n.a.b:
//            i

public static final class c extends Enum
{

    public static final b a;
    public static final b b;
    private static final b d[];
    public final int c;

    public static c a(int j)
    {
        switch (j)
        {
        default:
            return null;

        case 1: // '\001'
            return a;

        case 2: // '\002'
            return b;
        }
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(com/kik/n/a/b/i$a, s);
    }

    public static ueOf[] values()
    {
        return (ueOf[])d.clone();
    }

    static 
    {
        a = new <init>("PROFILE", 0, 1);
        b = new <init>("LOCATION", 1, 2);
        d = (new d[] {
            a, b
        });
    }

    private (String s, int j, int k)
    {
        super(s, j);
        c = k;
    }
}
