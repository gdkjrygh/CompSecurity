// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.model;


public final class ProductType extends Enum
{

    private static final ProductType $VALUES[];
    public static final ProductType CONSUMABLE;
    public static final ProductType ENTITLED;
    public static final ProductType SUBSCRIPTION;

    private ProductType(String s, int i)
    {
        super(s, i);
    }

    public static ProductType valueOf(String s)
    {
        return (ProductType)Enum.valueOf(com/amazon/device/iap/model/ProductType, s);
    }

    public static ProductType[] values()
    {
        return (ProductType[])$VALUES.clone();
    }

    static 
    {
        CONSUMABLE = new ProductType("CONSUMABLE", 0);
        ENTITLED = new ProductType("ENTITLED", 1);
        SUBSCRIPTION = new ProductType("SUBSCRIPTION", 2);
        $VALUES = (new ProductType[] {
            CONSUMABLE, ENTITLED, SUBSCRIPTION
        });
    }
}
