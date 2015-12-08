// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;


// Referenced classes of package com.c.b:
//            ak, bd

public static final class <init> extends <init>
{

    private final int a;
    private b b;
    private final String c;
    private final ing d;
    private ing e[];

    static void a(<init> <init>1)
    {
        <init>1 = <init>1.e;
        int l = <init>1.length;
        for (int j = 0; j < l; j++)
        {
            a(<init>1[j]);
        }

    }

    static void a(a a1, a a2)
    {
        a1.b = a2;
        for (int j = 0; j < a1.e.length; j++)
        {
            a(a1.e[j], a2.a(j));
        }

    }

    public final String b()
    {
        return b.i();
    }

    public final String c()
    {
        return c;
    }

    public final c d()
    {
        return d;
    }

    public final volatile bd i()
    {
        return b;
    }

    private ing(ing ing, ing ing1, int j)
    {
        a = j;
        b = ing;
        c = ak.a(ing1, null, ing.i());
        d = ing1;
        e = new e[ing.j()];
        for (j = 0; j < ing.j(); j++)
        {
            e[j] = new <init>(ing.a(j), ing1, this, j, (byte)0);
        }

        a(ing1).a(this);
    }

    a(a a1, a a2, int j, byte byte0)
    {
        this(a1, a2, j);
    }
}
