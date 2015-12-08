// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            Conversation

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value NOT_MULTIPARTY_VIDEO;
    public static final value RESULT_200_OK;
    public static final value RESULT_400_BAD_REQUEST_SOME_FIELDS_MISSING;
    public static final value RESULT_401_P2P_BLOCK;
    public static final value RESULT_403_PAID_SERVICE_BLOCK;
    public static final value RESULT_404_CONVERSATION_ID_NOT_FOUND_OR_CALL_ALREADY_TERMINATED;
    public static final _ALREADY_TERMINATED RESULT_405_GROUP_TOO_LARGE;
    public static final _ALREADY_TERMINATED RESULT_410_NO_VALID_SUBSCRIPTION_BUT_TRIAL_IS_AVAILABLE;
    public static final S_AVAILABLE RESULT_412_SUBSCRIPTION_INSUFFICENT_FOR_THIS_CALL;
    public static final _CALL RESULT_414_NO_SUBSCRIPTION;
    public static final _CALL RESULT_416_SUBSCRIPTION_IS_ALREADY_IN_USE;
    public static final _CALL RESULT_420_FAIR_USAGE_POLICY_VIOLATION_CALL_LIMIT_REACHED;
    public static final LIMIT_REACHED RESULT_422_FAIR_USAGE_POLICY_VIOLATION_SPONSORS_DAY_LIMIT_REACHED;
    public static final ORS_DAY_LIMIT_REACHED RESULT_424_FAIR_USAGE_POLICY_VIOLATION_SPONSORS_MONTH_LIMIT_REACHED;
    public static final ORS_MONTH_LIMIT_REACHED RESULT_430_GRACE_TIME_EXPIRED;
    public static final ORS_MONTH_LIMIT_REACHED RESULT_500_GENERAL_SERVICE_ERROR;
    public static final ORS_MONTH_LIMIT_REACHED RESULT_503_SERVICE_TIMEOUT;
    public static final ORS_MONTH_LIMIT_REACHED WRAPPER_UNKNOWN_VALUE;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/Conversation$PREMIUM_VIDEO_STATUS, s);
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
        NOT_MULTIPARTY_VIDEO = new <init>("NOT_MULTIPARTY_VIDEO", 0, 0);
        RESULT_200_OK = new <init>("RESULT_200_OK", 1, 1);
        RESULT_400_BAD_REQUEST_SOME_FIELDS_MISSING = new <init>("RESULT_400_BAD_REQUEST_SOME_FIELDS_MISSING", 2, 2);
        RESULT_401_P2P_BLOCK = new <init>("RESULT_401_P2P_BLOCK", 3, 3);
        RESULT_403_PAID_SERVICE_BLOCK = new <init>("RESULT_403_PAID_SERVICE_BLOCK", 4, 4);
        RESULT_404_CONVERSATION_ID_NOT_FOUND_OR_CALL_ALREADY_TERMINATED = new <init>("RESULT_404_CONVERSATION_ID_NOT_FOUND_OR_CALL_ALREADY_TERMINATED", 5, 5);
        RESULT_405_GROUP_TOO_LARGE = new <init>("RESULT_405_GROUP_TOO_LARGE", 6, 6);
        RESULT_410_NO_VALID_SUBSCRIPTION_BUT_TRIAL_IS_AVAILABLE = new <init>("RESULT_410_NO_VALID_SUBSCRIPTION_BUT_TRIAL_IS_AVAILABLE", 7, 7);
        RESULT_412_SUBSCRIPTION_INSUFFICENT_FOR_THIS_CALL = new <init>("RESULT_412_SUBSCRIPTION_INSUFFICENT_FOR_THIS_CALL", 8, 8);
        RESULT_414_NO_SUBSCRIPTION = new <init>("RESULT_414_NO_SUBSCRIPTION", 9, 9);
        RESULT_416_SUBSCRIPTION_IS_ALREADY_IN_USE = new <init>("RESULT_416_SUBSCRIPTION_IS_ALREADY_IN_USE", 10, 10);
        RESULT_420_FAIR_USAGE_POLICY_VIOLATION_CALL_LIMIT_REACHED = new <init>("RESULT_420_FAIR_USAGE_POLICY_VIOLATION_CALL_LIMIT_REACHED", 11, 11);
        RESULT_422_FAIR_USAGE_POLICY_VIOLATION_SPONSORS_DAY_LIMIT_REACHED = new <init>("RESULT_422_FAIR_USAGE_POLICY_VIOLATION_SPONSORS_DAY_LIMIT_REACHED", 12, 12);
        RESULT_424_FAIR_USAGE_POLICY_VIOLATION_SPONSORS_MONTH_LIMIT_REACHED = new <init>("RESULT_424_FAIR_USAGE_POLICY_VIOLATION_SPONSORS_MONTH_LIMIT_REACHED", 13, 13);
        RESULT_430_GRACE_TIME_EXPIRED = new <init>("RESULT_430_GRACE_TIME_EXPIRED", 14, 14);
        RESULT_500_GENERAL_SERVICE_ERROR = new <init>("RESULT_500_GENERAL_SERVICE_ERROR", 15, 15);
        RESULT_503_SERVICE_TIMEOUT = new <init>("RESULT_503_SERVICE_TIMEOUT", 16, 16);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 17, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            NOT_MULTIPARTY_VIDEO, RESULT_200_OK, RESULT_400_BAD_REQUEST_SOME_FIELDS_MISSING, RESULT_401_P2P_BLOCK, RESULT_403_PAID_SERVICE_BLOCK, RESULT_404_CONVERSATION_ID_NOT_FOUND_OR_CALL_ALREADY_TERMINATED, RESULT_405_GROUP_TOO_LARGE, RESULT_410_NO_VALID_SUBSCRIPTION_BUT_TRIAL_IS_AVAILABLE, RESULT_412_SUBSCRIPTION_INSUFFICENT_FOR_THIS_CALL, RESULT_414_NO_SUBSCRIPTION, 
            RESULT_416_SUBSCRIPTION_IS_ALREADY_IN_USE, RESULT_420_FAIR_USAGE_POLICY_VIOLATION_CALL_LIMIT_REACHED, RESULT_422_FAIR_USAGE_POLICY_VIOLATION_SPONSORS_DAY_LIMIT_REACHED, RESULT_424_FAIR_USAGE_POLICY_VIOLATION_SPONSORS_MONTH_LIMIT_REACHED, RESULT_430_GRACE_TIME_EXPIRED, RESULT_500_GENERAL_SERVICE_ERROR, RESULT_503_SERVICE_TIMEOUT, WRAPPER_UNKNOWN_VALUE
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
