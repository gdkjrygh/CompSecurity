// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.util;

import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.b.h.a;
import com.amazon.device.iap.model.RequestId;
import org.json.JSONObject;

// Referenced classes of package com.amazon.device.iap.internal.util:
//            e

public class MetricsHelper
{

    private static final String DESCRIPTION = "description";
    private static final String EXCEPTION_MESSAGE = "exceptionMessage";
    private static final String EXCEPTION_METRIC = "GenericException";
    private static final String JSON_PARSING_EXCEPTION_METRIC = "JsonParsingFailed";
    private static final String JSON_STRING = "jsonString";
    private static final String RECEIPT_VERIFICATION_FAILED_METRIC = "IapReceiptVerificationFailed";
    private static final String SIGNATURE = "signature";
    private static final String STRING_TO_SIGN = "stringToSign";
    private static final String TAG = com/amazon/device/iap/internal/util/MetricsHelper.getSimpleName();

    public MetricsHelper()
    {
    }

    public static void submitExceptionMetrics(String s, String s1, Exception exception)
    {
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("exceptionMessage", exception.getMessage());
            jsonobject.put("description", s1);
            submitMetric(s, "GenericException", jsonobject);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            e.b(TAG, (new StringBuilder()).append("error calling submitMetric: ").append(s).toString());
        }
    }

    public static void submitJsonParsingExceptionMetrics(String s, String s1, String s2)
    {
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("jsonString", s1);
            jsonobject.put("description", s2);
            submitMetric(s, "JsonParsingFailed", jsonobject);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            e.b(TAG, (new StringBuilder()).append("error calling submitMetric: ").append(s).toString());
        }
    }

    protected static void submitMetric(String s, String s1, JSONObject jsonobject)
    {
        (new a(new e(RequestId.fromString(s)), s1, jsonobject.toString())).a_();
    }

    public static void submitReceiptVerificationFailureMetrics(String s, String s1, String s2)
    {
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("stringToSign", s1);
            jsonobject.put("signature", s2);
            submitMetric(s, "IapReceiptVerificationFailed", jsonobject);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            e.b(TAG, (new StringBuilder()).append("error calling submitMetric: ").append(s).toString());
        }
    }

}
