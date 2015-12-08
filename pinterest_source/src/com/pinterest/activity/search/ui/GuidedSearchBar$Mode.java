// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.ui;


final class  extends Enum
{

    private static final Edit $VALUES[];
    public static final Edit Edit;
    public static final Edit View;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/activity/search/ui/GuidedSearchBar$Mode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        View = new <init>("View", 0);
        Edit = new <init>("Edit", 1);
        $VALUES = (new .VALUES[] {
            View, Edit
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
