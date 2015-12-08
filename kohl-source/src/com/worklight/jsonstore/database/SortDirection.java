// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.database;


public final class SortDirection extends Enum
{

    private static final SortDirection $VALUES[];
    public static final SortDirection ASCENDING;
    public static final SortDirection DESCENDING;
    public static final SortDirection NO_SORT;

    private SortDirection(String s, int i)
    {
        super(s, i);
    }

    public static SortDirection valueOf(String s)
    {
        return (SortDirection)Enum.valueOf(com/worklight/jsonstore/database/SortDirection, s);
    }

    public static SortDirection[] values()
    {
        return (SortDirection[])$VALUES.clone();
    }

    static 
    {
        ASCENDING = new SortDirection("ASCENDING", 0);
        DESCENDING = new SortDirection("DESCENDING", 1);
        NO_SORT = new SortDirection("NO_SORT", 2);
        $VALUES = (new SortDirection[] {
            ASCENDING, DESCENDING, NO_SORT
        });
    }
}
