// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;


public final class MemoryPolicy extends Enum
{

    private static final MemoryPolicy $VALUES[];
    public static final MemoryPolicy NO_CACHE;
    public static final MemoryPolicy NO_STORE;
    final int index;

    private MemoryPolicy(String s, int i, int j)
    {
        super(s, i);
        index = j;
    }

    static boolean shouldReadFromMemoryCache(int i)
    {
        return (NO_CACHE.index & i) == 0;
    }

    static boolean shouldWriteToMemoryCache(int i)
    {
        return (NO_STORE.index & i) == 0;
    }

    public static MemoryPolicy valueOf(String s)
    {
        return (MemoryPolicy)Enum.valueOf(com/squareup/picasso/MemoryPolicy, s);
    }

    public static MemoryPolicy[] values()
    {
        return (MemoryPolicy[])$VALUES.clone();
    }

    static 
    {
        NO_CACHE = new MemoryPolicy("NO_CACHE", 0, 1);
        NO_STORE = new MemoryPolicy("NO_STORE", 1, 2);
        $VALUES = (new MemoryPolicy[] {
            NO_CACHE, NO_STORE
        });
    }
}
