// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;


public final class  extends Enum
{

    private static final List $VALUES[];
    public static final List Grid;
    public static final List List;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/activity/commerce/view/VariantSelectionView$ViewType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Grid = new <init>("Grid", 0);
        List = new <init>("List", 1);
        $VALUES = (new .VALUES[] {
            Grid, List
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
