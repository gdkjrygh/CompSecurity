// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;


public final class  extends Enum
{

    private static final NONE $VALUES[];
    public static final NONE ERROR;
    public static final NONE LOADED;
    public static final NONE LOADING;
    public static final NONE NONE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/ui/grid/PinterestGridView$State, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        LOADED = new <init>("LOADED", 0);
        LOADING = new <init>("LOADING", 1);
        ERROR = new <init>("ERROR", 2);
        NONE = new <init>("NONE", 3);
        $VALUES = (new .VALUES[] {
            LOADED, LOADING, ERROR, NONE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
