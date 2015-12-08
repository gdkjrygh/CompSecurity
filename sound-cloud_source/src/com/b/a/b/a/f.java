// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.b.a;


public final class f extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    private static final f d[];

    private f(String s, int i)
    {
        super(s, i);
    }

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/b/a/b/a/f, s);
    }

    public static f[] values()
    {
        return (f[])d.clone();
    }

    static 
    {
        a = new f("NETWORK", 0);
        b = new f("DISC_CACHE", 1);
        c = new f("MEMORY_CACHE", 2);
        d = (new f[] {
            a, b, c
        });
    }
}
