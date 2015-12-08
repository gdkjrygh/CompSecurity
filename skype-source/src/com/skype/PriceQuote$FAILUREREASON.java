// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            PriceQuote

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value ACCOUNT_ON_HOLD;
    public static final value CALL_NOT_IN_PROGRESS;
    public static final value GW_AUTHENTICATION_FAILED;
    public static final value INTERNAL_ERROR;
    public static final value NETWORK_PROBLEM;
    public static final value NOT_SUPPORTED_BY_BUYER;
    public static final value NO_FAILURE;
    public static final value OUT_OF_FUNDS;
    public static final value PAYMENTS_STOPPED;
    public static final value PRICE_EXCEEDS_LIMIT;
    public static final value REJECTED_BY_BUYER;
    public static final value SECURITY_CHECK_FAILED;
    public static final value SIGNUP_REQUIRED;
    public static final value TIMEOUT;
    public static final value WRAPPER_UNKNOWN_VALUE;
    private static final j intToTypeMap;
    private final int value;

    public static value fromInt(int i)
    {
        value value1 = (value)intToTypeMap.a(i);
        if (value1 != null)
        {
            return value1;
        } else
        {
            return WRAPPER_UNKNOWN_VALUE;
        }
    }

    public static WRAPPER_UNKNOWN_VALUE valueOf(String s)
    {
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/PriceQuote$FAILUREREASON, s);
    }

    public static WRAPPER_UNKNOWN_VALUE[] values()
    {
        return (WRAPPER_UNKNOWN_VALUE[])$VALUES.clone();
    }

    public final int toInt()
    {
        return value;
    }

    static 
    {
        NO_FAILURE = new <init>("NO_FAILURE", 0, 0);
        REJECTED_BY_BUYER = new <init>("REJECTED_BY_BUYER", 1, 1);
        NETWORK_PROBLEM = new <init>("NETWORK_PROBLEM", 2, 2);
        INTERNAL_ERROR = new <init>("INTERNAL_ERROR", 3, 3);
        GW_AUTHENTICATION_FAILED = new <init>("GW_AUTHENTICATION_FAILED", 4, 4);
        SIGNUP_REQUIRED = new <init>("SIGNUP_REQUIRED", 5, 5);
        PRICE_EXCEEDS_LIMIT = new <init>("PRICE_EXCEEDS_LIMIT", 6, 6);
        NOT_SUPPORTED_BY_BUYER = new <init>("NOT_SUPPORTED_BY_BUYER", 7, 7);
        PAYMENTS_STOPPED = new <init>("PAYMENTS_STOPPED", 8, 8);
        SECURITY_CHECK_FAILED = new <init>("SECURITY_CHECK_FAILED", 9, 9);
        OUT_OF_FUNDS = new <init>("OUT_OF_FUNDS", 10, 10);
        TIMEOUT = new <init>("TIMEOUT", 11, 11);
        ACCOUNT_ON_HOLD = new <init>("ACCOUNT_ON_HOLD", 12, 12);
        CALL_NOT_IN_PROGRESS = new <init>("CALL_NOT_IN_PROGRESS", 13, 13);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 14, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            NO_FAILURE, REJECTED_BY_BUYER, NETWORK_PROBLEM, INTERNAL_ERROR, GW_AUTHENTICATION_FAILED, SIGNUP_REQUIRED, PRICE_EXCEEDS_LIMIT, NOT_SUPPORTED_BY_BUYER, PAYMENTS_STOPPED, SECURITY_CHECK_FAILED, 
            OUT_OF_FUNDS, TIMEOUT, ACCOUNT_ON_HOLD, CALL_NOT_IN_PROGRESS, WRAPPER_UNKNOWN_VALUE
        });
        intToTypeMap = new j();
        value avalue[] = values();
        int k = avalue.length;
        for (int i = 0; i < k; i++)
        {
            value value1 = avalue[i];
            intToTypeMap.a(value1.value, value1);
        }

    }

    private (String s, int i, int k)
    {
        super(s, i);
        value = k;
    }
}
