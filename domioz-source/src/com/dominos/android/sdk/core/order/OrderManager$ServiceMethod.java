// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.order;


public final class  extends Enum
{

    private static final CARRYOUT $VALUES[];
    public static final CARRYOUT CARRYOUT;
    public static final CARRYOUT DELIVERY;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/dominos/android/sdk/core/order/OrderManager$ServiceMethod, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        DELIVERY = new <init>("DELIVERY", 0);
        CARRYOUT = new <init>("CARRYOUT", 1);
        $VALUES = (new .VALUES[] {
            DELIVERY, CARRYOUT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
