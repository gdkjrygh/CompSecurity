// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b;


public final class e extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    private static final e g[];
    private final boolean e;
    private final boolean f;

    private e(String s, int i, boolean flag, boolean flag1)
    {
        super(s, i);
        e = flag;
        f = flag1;
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/bumptech/glide/load/b/e, s);
    }

    public static e[] values()
    {
        return (e[])g.clone();
    }

    public final boolean a()
    {
        return e;
    }

    public final boolean b()
    {
        return f;
    }

    static 
    {
        a = new e("ALL", 0, true, true);
        b = new e("NONE", 1, false, false);
        c = new e("SOURCE", 2, true, false);
        d = new e("RESULT", 3, false, true);
        g = (new e[] {
            a, b, c, d
        });
    }
}
