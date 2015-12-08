// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.ui;


final class  extends Enum
{

    private static final LOCAL_SEARCH $VALUES[];
    public static final LOCAL_SEARCH GLOBAL_SEARCH;
    public static final LOCAL_SEARCH LOCAL_SEARCH;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/activity/search/ui/GuidedSearchBar$SearchScope, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        GLOBAL_SEARCH = new <init>("GLOBAL_SEARCH", 0);
        LOCAL_SEARCH = new <init>("LOCAL_SEARCH", 1);
        $VALUES = (new .VALUES[] {
            GLOBAL_SEARCH, LOCAL_SEARCH
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
