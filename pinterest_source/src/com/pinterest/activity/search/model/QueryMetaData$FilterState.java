// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.model;


public final class  extends Enum
{

    private static final REMOVED $VALUES[];
    public static final REMOVED ADDED;
    public static final REMOVED NONE;
    public static final REMOVED REMOVED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/activity/search/model/QueryMetaData$FilterState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        ADDED = new <init>("ADDED", 1);
        REMOVED = new <init>("REMOVED", 2);
        $VALUES = (new .VALUES[] {
            NONE, ADDED, REMOVED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
