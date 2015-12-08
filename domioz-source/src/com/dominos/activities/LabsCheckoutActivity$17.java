// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.core.order.PlaceOrderErrorCode;

class rorCode
{

    static final int $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[];

    static 
    {
        $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode = new int[PlaceOrderErrorCode.values().length];
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[PlaceOrderErrorCode.UNAUTHORIZED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[PlaceOrderErrorCode.CUSTOMER_PROFILE_ORDER_MISMATCH_ADDRESS_OR_PAYMENT.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[PlaceOrderErrorCode.CASH_LIMIT_EXCEEDED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[PlaceOrderErrorCode.BELOW_MINIMUM_DELIVER_AMOUNT.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[PlaceOrderErrorCode.POS_MINIMUM_DELIVERY_AMOUNT.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[PlaceOrderErrorCode.STORE_CLOSED.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[PlaceOrderErrorCode.STORE_CLOSED_FOR_DELIVERY.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[PlaceOrderErrorCode.STORE_NOT_ALLOWED_FOR_DELIVERY.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[PlaceOrderErrorCode.STORE_CLOSED_FOR_CARRYOUT.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[PlaceOrderErrorCode.STORE_NOT_ALLOWED_FOR_CARRYOUT.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[PlaceOrderErrorCode.GENERIC_PULSE_ERROR.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[PlaceOrderErrorCode.GENERIC_CREDIT_CARD_ERROR.ordinal()] = 12;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[PlaceOrderErrorCode.UNABLE_TO_PROCESS_LOYALTY.ordinal()] = 13;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[PlaceOrderErrorCode.UNABLE_TO_REDEEM.ordinal()] = 14;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[PlaceOrderErrorCode.UNABLE_TO_PROCESS_LOYALTY_AT_THIS_TIME.ordinal()] = 15;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
