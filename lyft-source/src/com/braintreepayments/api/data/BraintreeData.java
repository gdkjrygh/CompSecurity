// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.data;

import android.app.Activity;
import android.content.Context;
import com.devicecollector.DeviceCollector;
import java.lang.reflect.Method;
import java.util.UUID;

// Referenced classes of package com.braintreepayments.api.data:
//            BraintreeEnvironment

public final class BraintreeData
{

    private DeviceCollector deviceCollector;
    private String mCorrelationId;
    private String mDeviceSessionId;
    private String mFraudMerchantId;

    public BraintreeData(Activity activity, BraintreeEnvironment braintreeenvironment)
    {
        this(activity, braintreeenvironment.getMerchantId(), braintreeenvironment.getCollectorUrl());
    }

    public BraintreeData(Activity activity, String s, String s1)
    {
        mFraudMerchantId = s;
        mCorrelationId = getCorrelationId(activity);
        deviceCollector = new DeviceCollector(activity);
        deviceCollector.b(mFraudMerchantId);
        deviceCollector.a(s1);
    }

    private String getCorrelationId(Activity activity)
    {
        try
        {
            activity = (String)getClass().getClassLoader().loadClass("com.paypal.android.sdk.payments.PayPalConfiguration").getMethod("getClientMetadataId", new Class[] {
                android/content/Context
            }).invoke(null, new Object[] {
                activity
            });
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            return null;
        }
        return activity;
    }

    public String collectDeviceData()
    {
        if (mDeviceSessionId == null)
        {
            mDeviceSessionId = UUID.randomUUID().toString().replace("-", "");
            deviceCollector.c(mDeviceSessionId);
        }
        String s = (new StringBuilder()).append("{\"device_session_id\":\"").append(mDeviceSessionId).append("\",").append("\"fraud_merchant_id\":\"").append(mFraudMerchantId).append("\"").toString();
        if (mCorrelationId != null)
        {
            return (new StringBuilder()).append(s).append(",\"correlation_id\": \"").append(mCorrelationId).append("\"}").toString();
        } else
        {
            return (new StringBuilder()).append(s).append("}").toString();
        }
    }
}
