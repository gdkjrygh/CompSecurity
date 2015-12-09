// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.model;


public final class FulfillmentResult extends Enum
{

    private static final FulfillmentResult $VALUES[];
    public static final FulfillmentResult FULFILLED;
    public static final FulfillmentResult UNAVAILABLE;

    private FulfillmentResult(String s, int i)
    {
        super(s, i);
    }

    public static FulfillmentResult valueOf(String s)
    {
        return (FulfillmentResult)Enum.valueOf(com/amazon/device/iap/model/FulfillmentResult, s);
    }

    public static FulfillmentResult[] values()
    {
        return (FulfillmentResult[])$VALUES.clone();
    }

    static 
    {
        FULFILLED = new FulfillmentResult("FULFILLED", 0);
        UNAVAILABLE = new FulfillmentResult("UNAVAILABLE", 1);
        $VALUES = (new FulfillmentResult[] {
            FULFILLED, UNAVAILABLE
        });
    }
}
