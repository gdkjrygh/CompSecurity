// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine;


public final class b extends Enum
{

    public static final b a;
    public static final b b;
    public static final b c;
    public static final b d;
    private static final b g[];
    private final boolean e;
    private final boolean f;

    private b(String s, int i, boolean flag, boolean flag1)
    {
        super(s, i);
        e = flag;
        f = flag1;
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(com/bumptech/glide/load/engine/b, s);
    }

    public static b[] values()
    {
        return (b[])g.clone();
    }

    public boolean a()
    {
        return e;
    }

    public boolean b()
    {
        return f;
    }

    static 
    {
        a = new b("ALL", 0, true, true);
        b = new b("NONE", 1, false, false);
        c = new b("SOURCE", 2, true, false);
        d = new b("RESULT", 3, false, true);
        g = (new b[] {
            a, b, c, d
        });
    }
}
