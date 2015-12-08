// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments.googleplay;

import android.content.Intent;
import android.os.Bundle;

final class BillingUtil
{

    public static final int ERROR_INVALID_DATA = -2;
    public static final int ERROR_REMOTE_EXCEPTION = -1;
    private static final String IN_PARENTHESES = "\\(.*?\\)";
    public static final String REQUEST_PRODUCT_DETAILS = "ITEM_ID_LIST";
    public static final String RESPONSE_BUY_INTENT = "BUY_INTENT";
    public static final String RESPONSE_CODE = "RESPONSE_CODE";
    public static final String RESPONSE_GET_SKU_DETAILS_LIST = "DETAILS_LIST";
    public static final String RESPONSE_PURCHASE_DATA = "INAPP_PURCHASE_DATA";
    public static final String RESPONSE_PURCHASE_DATA_LIST = "INAPP_PURCHASE_DATA_LIST";
    public static final String RESPONSE_SIGNATURE = "INAPP_DATA_SIGNATURE";
    public static final String RESPONSE_SIGNATURE_LIST = "INAPP_DATA_SIGNATURE_LIST";
    public static final int RESULT_BILLING_UNAVAILABLE = 3;
    public static final int RESULT_DEVELOPER_ERROR = 5;
    public static final int RESULT_ERROR = 6;
    public static final int RESULT_ITEM_ALREADY_OWNED = 7;
    public static final int RESULT_ITEM_NOT_OWNED = 8;
    public static final int RESULT_ITEM_UNAVAILABLE = 4;
    public static final int RESULT_OK = 0;
    public static final int RESULT_USER_CANCELED = 1;
    private static final String TAG = "PlayBilling";

    private BillingUtil()
    {
    }

    public static int getResponseCodeFromBundle(Bundle bundle)
    {
        if (bundle == null)
        {
            return -2;
        } else
        {
            return responseCodeFromObject(bundle.get("RESPONSE_CODE"));
        }
    }

    public static int getResponseCodeFromIntent(Intent intent)
    {
        if (intent == null)
        {
            return -2;
        } else
        {
            return responseCodeFromObject(intent.getExtras().get("RESPONSE_CODE"));
        }
    }

    public static void log(String s)
    {
    }

    public static void logBillingResponse(String s, int i)
    {
        switch (i)
        {
        case 1: // '\001'
        case 2: // '\002'
        default:
            (new StringBuilder()).append(s).append(": Unknown response code of ").append(i);
            return;

        case 0: // '\0'
            (new StringBuilder()).append(s).append(": OK");
            return;

        case 3: // '\003'
            (new StringBuilder()).append(s).append(": UNAVAILABLE");
            return;

        case -1: 
            (new StringBuilder()).append(s).append(": RemoteException");
            return;
        }
    }

    public static String removeAppName(String s)
    {
        return s.replaceAll("\\(.*?\\)", "").trim();
    }

    private static int responseCodeFromObject(Object obj)
    {
        if (obj == null)
        {
            return 0;
        }
        if (obj instanceof Integer)
        {
            return ((Integer)obj).intValue();
        }
        if (obj instanceof Long)
        {
            return ((Long)obj).intValue();
        } else
        {
            throw new IllegalArgumentException("Invalid type for Google Play billing RESPONSE_CODE");
        }
    }
}
