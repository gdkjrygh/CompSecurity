// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.loyalty;


public final class  extends Enum
{

    private static final STORE_NOT_POP $VALUES[];
    public static final STORE_NOT_POP CUSTOMER_AUTH_REQUIRED;
    public static final STORE_NOT_POP CUSTOMER_NOT_ENOUGH_POINTS;
    public static final STORE_NOT_POP CUSTOMER_NOT_ENROLLED;
    public static final STORE_NOT_POP REDEMPTION_COUPON_LIMIT;
    public static final STORE_NOT_POP REDEMPTION_NOT_AVAILABLE;
    public static final STORE_NOT_POP STORE_NOT_POP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/dominos/android/sdk/core/loyalty/LoyaltyManager$InvalidRedemptionCause, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        REDEMPTION_NOT_AVAILABLE = new <init>("REDEMPTION_NOT_AVAILABLE", 0);
        REDEMPTION_COUPON_LIMIT = new <init>("REDEMPTION_COUPON_LIMIT", 1);
        CUSTOMER_NOT_ENOUGH_POINTS = new <init>("CUSTOMER_NOT_ENOUGH_POINTS", 2);
        CUSTOMER_NOT_ENROLLED = new <init>("CUSTOMER_NOT_ENROLLED", 3);
        CUSTOMER_AUTH_REQUIRED = new <init>("CUSTOMER_AUTH_REQUIRED", 4);
        STORE_NOT_POP = new <init>("STORE_NOT_POP", 5);
        $VALUES = (new .VALUES[] {
            REDEMPTION_NOT_AVAILABLE, REDEMPTION_COUPON_LIMIT, CUSTOMER_NOT_ENOUGH_POINTS, CUSTOMER_NOT_ENROLLED, CUSTOMER_AUTH_REQUIRED, STORE_NOT_POP
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
