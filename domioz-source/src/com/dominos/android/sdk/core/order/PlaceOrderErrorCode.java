// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.order;

import com.dominos.android.sdk.common.StringHelper;

public final class PlaceOrderErrorCode extends Enum
{

    private static final PlaceOrderErrorCode $VALUES[];
    public static final PlaceOrderErrorCode BELOW_MINIMUM_DELIVER_AMOUNT;
    public static final PlaceOrderErrorCode CASH_LIMIT_EXCEEDED;
    public static final PlaceOrderErrorCode CUSTOMER_PROFILE_ORDER_MISMATCH_ADDRESS_OR_PAYMENT;
    public static final PlaceOrderErrorCode GENERIC_CREDIT_CARD_ERROR;
    public static final PlaceOrderErrorCode GENERIC_PULSE_ERROR;
    public static final PlaceOrderErrorCode NO_FAILURE;
    public static final PlaceOrderErrorCode POS_MINIMUM_DELIVERY_AMOUNT;
    public static final PlaceOrderErrorCode STORE_CLOSED;
    public static final PlaceOrderErrorCode STORE_CLOSED_FOR_CARRYOUT;
    public static final PlaceOrderErrorCode STORE_CLOSED_FOR_DELIVERY;
    public static final PlaceOrderErrorCode STORE_NOT_ALLOWED_FOR_CARRYOUT;
    public static final PlaceOrderErrorCode STORE_NOT_ALLOWED_FOR_DELIVERY;
    public static final PlaceOrderErrorCode UNABLE_TO_PROCESS_LOYALTY;
    public static final PlaceOrderErrorCode UNABLE_TO_PROCESS_LOYALTY_AT_THIS_TIME;
    public static final PlaceOrderErrorCode UNABLE_TO_PROCESS_LOYALTY_NON_PARTICIPATING_STORE;
    public static final PlaceOrderErrorCode UNABLE_TO_REDEEM;
    public static final PlaceOrderErrorCode UNAUTHORIZED;
    public static final PlaceOrderErrorCode UNKNOWN;
    private String mName;

    private PlaceOrderErrorCode(String s, int i, String s1)
    {
        super(s, i);
        mName = s1;
    }

    public static PlaceOrderErrorCode getFailureType(String s)
    {
        PlaceOrderErrorCode placeordererrorcode = UNKNOWN;
        PlaceOrderErrorCode aplaceordererrorcode[] = values();
        int j = aplaceordererrorcode.length;
        for (int i = 0; i < j; i++)
        {
            PlaceOrderErrorCode placeordererrorcode1 = aplaceordererrorcode[i];
            if (StringHelper.equalsIgnoreCase(placeordererrorcode1.mName, s))
            {
                return placeordererrorcode1;
            }
        }

        return placeordererrorcode;
    }

    public static PlaceOrderErrorCode valueOf(String s)
    {
        return (PlaceOrderErrorCode)Enum.valueOf(com/dominos/android/sdk/core/order/PlaceOrderErrorCode, s);
    }

    public static PlaceOrderErrorCode[] values()
    {
        return (PlaceOrderErrorCode[])$VALUES.clone();
    }

    static 
    {
        NO_FAILURE = new PlaceOrderErrorCode("NO_FAILURE", 0, "NoFailure");
        CASH_LIMIT_EXCEEDED = new PlaceOrderErrorCode("CASH_LIMIT_EXCEEDED", 1, "CashLimitExceeded");
        BELOW_MINIMUM_DELIVER_AMOUNT = new PlaceOrderErrorCode("BELOW_MINIMUM_DELIVER_AMOUNT", 2, "BelowMinimumDeliveryAmount");
        POS_MINIMUM_DELIVERY_AMOUNT = new PlaceOrderErrorCode("POS_MINIMUM_DELIVERY_AMOUNT", 3, "PosMinimumDeliveryAmount");
        STORE_CLOSED = new PlaceOrderErrorCode("STORE_CLOSED", 4, "StoreClosed");
        STORE_CLOSED_FOR_DELIVERY = new PlaceOrderErrorCode("STORE_CLOSED_FOR_DELIVERY", 5, "StoreClosedForDelivery");
        STORE_NOT_ALLOWED_FOR_DELIVERY = new PlaceOrderErrorCode("STORE_NOT_ALLOWED_FOR_DELIVERY", 6, "StoreNotAllowedForDelivery");
        STORE_CLOSED_FOR_CARRYOUT = new PlaceOrderErrorCode("STORE_CLOSED_FOR_CARRYOUT", 7, "StoreClosedForCarryout");
        STORE_NOT_ALLOWED_FOR_CARRYOUT = new PlaceOrderErrorCode("STORE_NOT_ALLOWED_FOR_CARRYOUT", 8, "StoreNotAllowedForCarryout");
        GENERIC_CREDIT_CARD_ERROR = new PlaceOrderErrorCode("GENERIC_CREDIT_CARD_ERROR", 9, "genericCreditCardError");
        GENERIC_PULSE_ERROR = new PlaceOrderErrorCode("GENERIC_PULSE_ERROR", 10, "genericPulseError");
        CUSTOMER_PROFILE_ORDER_MISMATCH_ADDRESS_OR_PAYMENT = new PlaceOrderErrorCode("CUSTOMER_PROFILE_ORDER_MISMATCH_ADDRESS_OR_PAYMENT", 11, "CustomerProfileOrderMismatch-AddressOrPayment");
        UNAUTHORIZED = new PlaceOrderErrorCode("UNAUTHORIZED", 12, "Unauthorized");
        UNABLE_TO_REDEEM = new PlaceOrderErrorCode("UNABLE_TO_REDEEM", 13, "unableToRedeem");
        UNABLE_TO_PROCESS_LOYALTY_AT_THIS_TIME = new PlaceOrderErrorCode("UNABLE_TO_PROCESS_LOYALTY_AT_THIS_TIME", 14, "UnableToProcessLoyaltyAtThisTime");
        UNABLE_TO_PROCESS_LOYALTY = new PlaceOrderErrorCode("UNABLE_TO_PROCESS_LOYALTY", 15, "UnableToProcessLoyalty");
        UNABLE_TO_PROCESS_LOYALTY_NON_PARTICIPATING_STORE = new PlaceOrderErrorCode("UNABLE_TO_PROCESS_LOYALTY_NON_PARTICIPATING_STORE", 16, "UnableToProcessLoyaltyNonParticipatingStore");
        UNKNOWN = new PlaceOrderErrorCode("UNKNOWN", 17, "unknown");
        $VALUES = (new PlaceOrderErrorCode[] {
            NO_FAILURE, CASH_LIMIT_EXCEEDED, BELOW_MINIMUM_DELIVER_AMOUNT, POS_MINIMUM_DELIVERY_AMOUNT, STORE_CLOSED, STORE_CLOSED_FOR_DELIVERY, STORE_NOT_ALLOWED_FOR_DELIVERY, STORE_CLOSED_FOR_CARRYOUT, STORE_NOT_ALLOWED_FOR_CARRYOUT, GENERIC_CREDIT_CARD_ERROR, 
            GENERIC_PULSE_ERROR, CUSTOMER_PROFILE_ORDER_MISMATCH_ADDRESS_OR_PAYMENT, UNAUTHORIZED, UNABLE_TO_REDEEM, UNABLE_TO_PROCESS_LOYALTY_AT_THIS_TIME, UNABLE_TO_PROCESS_LOYALTY, UNABLE_TO_PROCESS_LOYALTY_NON_PARTICIPATING_STORE, UNKNOWN
        });
    }
}
