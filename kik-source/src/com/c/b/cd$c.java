// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;


// Referenced classes of package com.c.b:
//            cd, ci, cj, ck, 
//            g

static abstract class ing extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static ing valueOf(String s)
    {
        return (ing)Enum.valueOf(com/c/b/cd$c, s);
    }

    public static ing[] values()
    {
        return (ing[])d.clone();
    }

    abstract Object a(g g);

    static 
    {
        a = new ci("LOOSE");
        b = new cj("STRICT");
        c = new ck("LAZY");
        d = (new d[] {
            a, b, c
        });
    }

    private ing(String s, int i)
    {
        super(s, i);
    }

    ing(String s, int i, byte byte0)
    {
        this(s, i);
    }
}
