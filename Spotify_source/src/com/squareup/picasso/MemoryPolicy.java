// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;


public final class MemoryPolicy extends Enum
{

    private static MemoryPolicy a;
    private static MemoryPolicy b;
    private static final MemoryPolicy c[];
    final int index;

    private MemoryPolicy(String s, int i, int j)
    {
        super(s, i);
        index = j;
    }

    public static boolean a(int i)
    {
        return (a.index & i) == 0;
    }

    public static boolean b(int i)
    {
        return (b.index & i) == 0;
    }

    public static MemoryPolicy valueOf(String s)
    {
        return (MemoryPolicy)Enum.valueOf(com/squareup/picasso/MemoryPolicy, s);
    }

    public static MemoryPolicy[] values()
    {
        return (MemoryPolicy[])c.clone();
    }

    static 
    {
        a = new MemoryPolicy("NO_CACHE", 0, 1);
        b = new MemoryPolicy("NO_STORE", 1, 2);
        c = (new MemoryPolicy[] {
            a, b
        });
    }
}
