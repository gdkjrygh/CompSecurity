// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.extension.nina;


public final class Q extends Enum
{

    private static final COMPLETED $VALUES[];
    public static final COMPLETED CATEGORY;
    public static final COMPLETED COMPLETED;
    public static final COMPLETED ERROR;
    public static final COMPLETED ERROR_NOT_ON_COUPON;
    public static final COMPLETED ERROR_NOT_ON_MENU;
    public static final COMPLETED FLAVOR;
    public static final COMPLETED PRODUCT;
    public static final COMPLETED SIZE;
    public static final COMPLETED TOPPINGS;
    public static final COMPLETED UNKNOWN;
    public static final COMPLETED VARIANT;

    public static Q valueOf(String s)
    {
        return (Q)Enum.valueOf(com/dominos/android/sdk/extension/nina/DomProductManager$ProductGranularity, s);
    }

    public static Q[] values()
    {
        return (Q[])$VALUES.clone();
    }

    static 
    {
        UNKNOWN = new <init>("UNKNOWN", 0);
        ERROR_NOT_ON_MENU = new <init>("ERROR_NOT_ON_MENU", 1);
        ERROR_NOT_ON_COUPON = new <init>("ERROR_NOT_ON_COUPON", 2);
        ERROR = new <init>("ERROR", 3);
        CATEGORY = new <init>("CATEGORY", 4);
        PRODUCT = new <init>("PRODUCT", 5);
        VARIANT = new <init>("VARIANT", 6);
        SIZE = new <init>("SIZE", 7);
        FLAVOR = new <init>("FLAVOR", 8);
        TOPPINGS = new <init>("TOPPINGS", 9);
        COMPLETED = new <init>("COMPLETED", 10);
        $VALUES = (new .VALUES[] {
            UNKNOWN, ERROR_NOT_ON_MENU, ERROR_NOT_ON_COUPON, ERROR, CATEGORY, PRODUCT, VARIANT, SIZE, FLAVOR, TOPPINGS, 
            COMPLETED
        });
    }

    private Q(String s, int i)
    {
        super(s, i);
    }
}
