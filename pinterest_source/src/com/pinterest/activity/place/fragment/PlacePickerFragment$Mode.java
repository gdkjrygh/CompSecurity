// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.place.fragment;


public final class  extends Enum
{

    private static final EDIT $VALUES[];
    public static final EDIT CREATE;
    public static final EDIT DEBUG;
    public static final EDIT EDIT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/activity/place/fragment/PlacePickerFragment$Mode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        DEBUG = new <init>("DEBUG", 0);
        CREATE = new <init>("CREATE", 1);
        EDIT = new <init>("EDIT", 2);
        $VALUES = (new .VALUES[] {
            DEBUG, CREATE, EDIT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
