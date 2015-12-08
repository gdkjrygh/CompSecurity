// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;


public final class A extends Enum
{

    private static final UNAVAILABLE $VALUES[];
    public static final UNAVAILABLE IN_STOCK;
    public static final UNAVAILABLE OUT_OF_STOCK;
    public static final UNAVAILABLE PREORDER;
    public static final UNAVAILABLE UNAVAILABLE;
    public static final UNAVAILABLE UNKNOWN;

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/pinterest/api/model/BuyableProduct$Variant$Availability, s);
    }

    public static A[] values()
    {
        return (A[])$VALUES.clone();
    }

    static 
    {
        UNKNOWN = new <init>("UNKNOWN", 0);
        IN_STOCK = new <init>("IN_STOCK", 1);
        OUT_OF_STOCK = new <init>("OUT_OF_STOCK", 2);
        PREORDER = new <init>("PREORDER", 3);
        UNAVAILABLE = new <init>("UNAVAILABLE", 4);
        $VALUES = (new .VALUES[] {
            UNKNOWN, IN_STOCK, OUT_OF_STOCK, PREORDER, UNAVAILABLE
        });
    }

    private A(String s, int i)
    {
        super(s, i);
    }
}
