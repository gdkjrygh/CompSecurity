// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;


final class  extends Enum
{

    private static final LoadMore $VALUES[];
    public static final LoadMore LoadMore;
    public static final LoadMore Section;

    public static  getType(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalStateException("Passed a value that is not in the range of this enum");

        case 0: // '\0'
            return Section;

        case 1: // '\001'
            return LoadMore;
        }
    }

    public static LoadMore valueOf(String s)
    {
        return (LoadMore)Enum.valueOf(com/pinterest/activity/commerce/ShopSpaceSectionFragment$Type, s);
    }

    public static LoadMore[] values()
    {
        return (LoadMore[])$VALUES.clone();
    }

    static 
    {
        Section = new <init>("Section", 0);
        LoadMore = new <init>("LoadMore", 1);
        $VALUES = (new .VALUES[] {
            Section, LoadMore
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
