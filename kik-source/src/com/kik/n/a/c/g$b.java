// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.n.a.c;


// Referenced classes of package com.kik.n.a.c:
//            g

public static final class d extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c e[];
    public final int d;

    public static d a(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return a;

        case 1: // '\001'
            return b;

        case 2: // '\002'
            return c;
        }
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/kik/n/a/c/g$b, s);
    }

    public static ueOf[] values()
    {
        return (ueOf[])e.clone();
    }

    static 
    {
        a = new <init>("UNSPECIFIED", 0, 0);
        b = new <init>("ALLOWED", 1, 1);
        c = new <init>("DECLINED", 2, 2);
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
