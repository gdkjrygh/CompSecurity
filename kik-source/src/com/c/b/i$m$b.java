// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;


// Referenced classes of package com.c.b:
//            bl, i, v

public static final class g extends Enum
    implements bl
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static c d = new v();
    private static final t> e[] = values();
    private static final values h[];
    private final int f;
    private final int g;

    public static  a(int j)
    {
        switch (j)
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

    public static ng valueOf(String s)
    {
        return (ng)Enum.valueOf(com/c/b/i$m$b, s);
    }

    public static ng[] values()
    {
        return (ng[])h.clone();
    }

    public final int a()
    {
        return g;
    }

    static 
    {
        a = new <init>("STRING", 0, 0, 0);
        b = new <init>("CORD", 1, 1, 1);
        c = new <init>("STRING_PIECE", 2, 2, 2);
        h = (new h[] {
            a, b, c
        });
    }

    private ng(String s, int j, int k, int l)
    {
        super(s, j);
        f = k;
        g = l;
    }
}
