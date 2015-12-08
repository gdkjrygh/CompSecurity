// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.adapters;


final class  extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN BREAD;
    public static final UNKNOWN CHIPS;
    public static final UNKNOWN DESSERT;
    public static final UNKNOWN DRINK;
    public static final UNKNOWN PASTA;
    public static final UNKNOWN PIZZA;
    public static final UNKNOWN SALAD;
    public static final UNKNOWN SANDWICH;
    public static final UNKNOWN SIDE;
    public static final UNKNOWN UNKNOWN;
    public static final UNKNOWN WING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/dominos/adapters/LabsProductListAdapter$ProductType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PIZZA = new <init>("PIZZA", 0);
        SANDWICH = new <init>("SANDWICH", 1);
        PASTA = new <init>("PASTA", 2);
        BREAD = new <init>("BREAD", 3);
        SALAD = new <init>("SALAD", 4);
        CHIPS = new <init>("CHIPS", 5);
        DRINK = new <init>("DRINK", 6);
        DESSERT = new <init>("DESSERT", 7);
        SIDE = new <init>("SIDE", 8);
        WING = new <init>("WING", 9);
        UNKNOWN = new <init>("UNKNOWN", 10);
        $VALUES = (new .VALUES[] {
            PIZZA, SANDWICH, PASTA, BREAD, SALAD, CHIPS, DRINK, DESSERT, SIDE, WING, 
            UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
