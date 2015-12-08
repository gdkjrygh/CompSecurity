// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.core;


public final class SortOrder extends Enum
{

    private static final SortOrder $VALUES[];
    public static final SortOrder ASC;
    public static final SortOrder DESC;
    public static final SortOrder NONE;

    private SortOrder(String s, int i)
    {
        super(s, i);
    }

    public static SortOrder valueOf(String s)
    {
        return (SortOrder)Enum.valueOf(com/nbcsports/liveextra/library/core/SortOrder, s);
    }

    public static SortOrder[] values()
    {
        return (SortOrder[])$VALUES.clone();
    }

    static 
    {
        NONE = new SortOrder("NONE", 0);
        ASC = new SortOrder("ASC", 1);
        DESC = new SortOrder("DESC", 2);
        $VALUES = (new SortOrder[] {
            NONE, ASC, DESC
        });
    }
}
