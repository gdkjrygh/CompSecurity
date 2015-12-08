// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.text;


public final class  extends Enum
{

    private static final DYNAMIC_GRID $VALUES[];
    public static final DYNAMIC_GRID DYNAMIC_GRID;
    public static final DYNAMIC_GRID NORMAL;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/ui/text/FollowButton$MODE, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NORMAL = new <init>("NORMAL", 0);
        DYNAMIC_GRID = new <init>("DYNAMIC_GRID", 1);
        $VALUES = (new .VALUES[] {
            NORMAL, DYNAMIC_GRID
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
