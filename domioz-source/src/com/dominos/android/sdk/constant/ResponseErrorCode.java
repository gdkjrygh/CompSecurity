// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.constant;


public final class ResponseErrorCode extends Enum
{

    private static final ResponseErrorCode $VALUES[];
    public static final ResponseErrorCode ALL_ITEMS_UNAVAILABLE;
    public static final ResponseErrorCode CARRYOUT_NOT_AVAILABLE;
    public static final ResponseErrorCode COUPON_REMOVED;
    public static final ResponseErrorCode DELIVERY_NOT_AVAILABLE;
    public static final ResponseErrorCode FORCE_UPGRADE;
    public static final ResponseErrorCode HISTORICAL_PAYMENT_NOT_SUPPORTED;
    public static final ResponseErrorCode INVALID;
    public static final ResponseErrorCode NO_EASY_ORDER;
    public static final ResponseErrorCode NO_HISTORICAL_ORDER;
    public static final ResponseErrorCode NO_STORE_DELIVERY_ADDRESS;
    public static final ResponseErrorCode ORDERING_UNAVAILABLE;
    public static final ResponseErrorCode SOME_ITEMS_UNAVAILABLE;
    public static final ResponseErrorCode STORE_CLOSED;
    public static final ResponseErrorCode STORE_OFFLINE;
    public static final ResponseErrorCode UNAUTHORIZED_TO_PLACE_ORDER;
    public static final ResponseErrorCode UNAUTHORIZED_USER;
    public static final ResponseErrorCode UNKNOWN;
    public static final ResponseErrorCode UNKNOWN_PRICING_FAILURE;
    public static final ResponseErrorCode VALID;

    private ResponseErrorCode(String s, int i)
    {
        super(s, i);
    }

    public static ResponseErrorCode valueOf(String s)
    {
        return (ResponseErrorCode)Enum.valueOf(com/dominos/android/sdk/constant/ResponseErrorCode, s);
    }

    public static ResponseErrorCode[] values()
    {
        return (ResponseErrorCode[])$VALUES.clone();
    }

    static 
    {
        VALID = new ResponseErrorCode("VALID", 0);
        INVALID = new ResponseErrorCode("INVALID", 1);
        UNAUTHORIZED_USER = new ResponseErrorCode("UNAUTHORIZED_USER", 2);
        NO_HISTORICAL_ORDER = new ResponseErrorCode("NO_HISTORICAL_ORDER", 3);
        STORE_CLOSED = new ResponseErrorCode("STORE_CLOSED", 4);
        DELIVERY_NOT_AVAILABLE = new ResponseErrorCode("DELIVERY_NOT_AVAILABLE", 5);
        NO_STORE_DELIVERY_ADDRESS = new ResponseErrorCode("NO_STORE_DELIVERY_ADDRESS", 6);
        COUPON_REMOVED = new ResponseErrorCode("COUPON_REMOVED", 7);
        STORE_OFFLINE = new ResponseErrorCode("STORE_OFFLINE", 8);
        UNKNOWN = new ResponseErrorCode("UNKNOWN", 9);
        NO_EASY_ORDER = new ResponseErrorCode("NO_EASY_ORDER", 10);
        CARRYOUT_NOT_AVAILABLE = new ResponseErrorCode("CARRYOUT_NOT_AVAILABLE", 11);
        FORCE_UPGRADE = new ResponseErrorCode("FORCE_UPGRADE", 12);
        ORDERING_UNAVAILABLE = new ResponseErrorCode("ORDERING_UNAVAILABLE", 13);
        HISTORICAL_PAYMENT_NOT_SUPPORTED = new ResponseErrorCode("HISTORICAL_PAYMENT_NOT_SUPPORTED", 14);
        UNAUTHORIZED_TO_PLACE_ORDER = new ResponseErrorCode("UNAUTHORIZED_TO_PLACE_ORDER", 15);
        UNKNOWN_PRICING_FAILURE = new ResponseErrorCode("UNKNOWN_PRICING_FAILURE", 16);
        SOME_ITEMS_UNAVAILABLE = new ResponseErrorCode("SOME_ITEMS_UNAVAILABLE", 17);
        ALL_ITEMS_UNAVAILABLE = new ResponseErrorCode("ALL_ITEMS_UNAVAILABLE", 18);
        $VALUES = (new ResponseErrorCode[] {
            VALID, INVALID, UNAUTHORIZED_USER, NO_HISTORICAL_ORDER, STORE_CLOSED, DELIVERY_NOT_AVAILABLE, NO_STORE_DELIVERY_ADDRESS, COUPON_REMOVED, STORE_OFFLINE, UNKNOWN, 
            NO_EASY_ORDER, CARRYOUT_NOT_AVAILABLE, FORCE_UPGRADE, ORDERING_UNAVAILABLE, HISTORICAL_PAYMENT_NOT_SUPPORTED, UNAUTHORIZED_TO_PLACE_ORDER, UNKNOWN_PRICING_FAILURE, SOME_ITEMS_UNAVAILABLE, ALL_ITEMS_UNAVAILABLE
        });
    }
}
