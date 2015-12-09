// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.order;


public final class  extends Enum
{

    private static final NEW_ORDER $VALUES[];
    public static final NEW_ORDER EASY_ORDER;
    public static final NEW_ORDER NEW_ORDER;
    public static final NEW_ORDER RECENT_ORDERS;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/dominos/android/sdk/core/order/OrderManager$OrderType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        EASY_ORDER = new <init>("EASY_ORDER", 0);
        RECENT_ORDERS = new <init>("RECENT_ORDERS", 1);
        NEW_ORDER = new <init>("NEW_ORDER", 2);
        $VALUES = (new .VALUES[] {
            EASY_ORDER, RECENT_ORDERS, NEW_ORDER
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
