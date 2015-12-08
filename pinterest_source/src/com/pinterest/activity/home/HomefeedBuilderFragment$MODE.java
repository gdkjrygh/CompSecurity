// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home;


public final class  extends Enum
{

    private static final DYNAMIC_GRID $VALUES[];
    public static final DYNAMIC_GRID BROWSE;
    public static final DYNAMIC_GRID DYNAMIC_GRID;
    public static final DYNAMIC_GRID SEARCH;
    public static final DYNAMIC_GRID SEARCH_TYPEAHEAD;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/activity/home/HomefeedBuilderFragment$MODE, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        BROWSE = new <init>("BROWSE", 0);
        SEARCH = new <init>("SEARCH", 1);
        SEARCH_TYPEAHEAD = new <init>("SEARCH_TYPEAHEAD", 2);
        DYNAMIC_GRID = new <init>("DYNAMIC_GRID", 3);
        $VALUES = (new .VALUES[] {
            BROWSE, SEARCH, SEARCH_TYPEAHEAD, DYNAMIC_GRID
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
