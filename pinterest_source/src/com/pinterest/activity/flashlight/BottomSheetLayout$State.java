// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.flashlight;


public final class  extends Enum
{

    private static final EXPANDED $VALUES[];
    public static final EXPANDED EXPANDED;
    public static final EXPANDED HIDDEN;
    public static final EXPANDED PEEKED;
    public static final EXPANDED PREPARING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/activity/flashlight/BottomSheetLayout$State, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        HIDDEN = new <init>("HIDDEN", 0);
        PREPARING = new <init>("PREPARING", 1);
        PEEKED = new <init>("PEEKED", 2);
        EXPANDED = new <init>("EXPANDED", 3);
        $VALUES = (new .VALUES[] {
            HIDDEN, PREPARING, PEEKED, EXPANDED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
