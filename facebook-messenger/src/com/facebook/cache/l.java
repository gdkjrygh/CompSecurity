// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.cache;


public final class l extends Enum
{

    private static final l $VALUES[];
    public static final l ALL;
    public static final l DATABASE;
    public static final l FILE;
    public static final l MEMORY;
    private final String mName;

    private l(String s, int i, String s1)
    {
        super(s, i);
        mName = s1;
    }

    public static l valueOf(String s)
    {
        return (l)Enum.valueOf(com/facebook/cache/l, s);
    }

    public static l[] values()
    {
        return (l[])$VALUES.clone();
    }

    static 
    {
        MEMORY = new l("MEMORY", 0, "memory");
        DATABASE = new l("DATABASE", 1, "database");
        FILE = new l("FILE", 2, "file");
        ALL = new l("ALL", 3, "all");
        $VALUES = (new l[] {
            MEMORY, DATABASE, FILE, ALL
        });
    }
}
