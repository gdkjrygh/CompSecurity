// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home.view;


public final class  extends Enum
{

    private static final LAST $VALUES[];
    public static final LAST FIRST;
    public static final LAST LAST;
    public static final LAST MIDDLE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/activity/home/view/BaseNotificationListCell$CellPosition, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        FIRST = new <init>("FIRST", 0);
        MIDDLE = new <init>("MIDDLE", 1);
        LAST = new <init>("LAST", 2);
        $VALUES = (new .VALUES[] {
            FIRST, MIDDLE, LAST
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
