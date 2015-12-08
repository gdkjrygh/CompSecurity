// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;


public final class MemoryPolicy extends Enum
{

    public static final MemoryPolicy a;
    public static final MemoryPolicy b;
    private static final MemoryPolicy d[];
    final int c;

    private MemoryPolicy(String s, int i, int j)
    {
        super(s, i);
        c = j;
    }

    static boolean a(int i)
    {
        return (a.c & i) == 0;
    }

    static boolean b(int i)
    {
        return (b.c & i) == 0;
    }

    public static MemoryPolicy valueOf(String s)
    {
        return (MemoryPolicy)Enum.valueOf(com/squareup/picasso/MemoryPolicy, s);
    }

    public static MemoryPolicy[] values()
    {
        return (MemoryPolicy[])d.clone();
    }

    static 
    {
        a = new MemoryPolicy("NO_CACHE", 0, 1);
        b = new MemoryPolicy("NO_STORE", 1, 2);
        d = (new MemoryPolicy[] {
            a, b
        });
    }
}
