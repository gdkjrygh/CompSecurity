// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;


public final class  extends Enum
{

    private static final OTHER $VALUES[];
    public static final OTHER BOTTOM;
    public static final OTHER CENTER;
    public static final OTHER OTHER;
    public static final OTHER SINGLE;
    public static final OTHER TOP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/dominos/views/SavedAddressView$ViewType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        TOP = new <init>("TOP", 0);
        CENTER = new <init>("CENTER", 1);
        BOTTOM = new <init>("BOTTOM", 2);
        SINGLE = new <init>("SINGLE", 3);
        OTHER = new <init>("OTHER", 4);
        $VALUES = (new .VALUES[] {
            TOP, CENTER, BOTTOM, SINGLE, OTHER
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
