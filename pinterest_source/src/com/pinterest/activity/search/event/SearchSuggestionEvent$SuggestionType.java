// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.event;


public final class  extends Enum
{

    private static final AUTO_COMPLETE $VALUES[];
    public static final AUTO_COMPLETE AUTO_COMPLETE;
    public static final AUTO_COMPLETE NONE;
    public static final AUTO_COMPLETE RECENT_QUERY;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/activity/search/event/SearchSuggestionEvent$SuggestionType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        RECENT_QUERY = new <init>("RECENT_QUERY", 1);
        AUTO_COMPLETE = new <init>("AUTO_COMPLETE", 2);
        $VALUES = (new .VALUES[] {
            NONE, RECENT_QUERY, AUTO_COMPLETE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
