// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a;


// Referenced classes of package com.c.a.a:
//            v, w, x, y, 
//            z, aa

static abstract class ng extends Enum
    implements v
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];

    public static ng valueOf(String s)
    {
        return (ng)Enum.valueOf(com/c/a/a/w$b, s);
    }

    public static ng[] values()
    {
        return (ng[])e.clone();
    }

    static 
    {
        a = new x("ALWAYS_TRUE");
        b = new y("ALWAYS_FALSE");
        c = new z("IS_NULL");
        d = new aa("NOT_NULL");
        e = (new e[] {
            a, b, c, d
        });
    }

    private ng(String s, int i)
    {
        super(s, i);
    }

    ng(String s, int i, byte byte0)
    {
        this(s, i);
    }
}
