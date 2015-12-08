// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.b;

import android.content.Context;
import android.content.Intent;
import com.amazon.device.iap.internal.b.a.d;
import com.amazon.device.iap.internal.b.e.a;
import com.amazon.device.iap.internal.b.g.b;
import com.amazon.device.iap.internal.util.e;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import java.util.Set;

public final class c
    implements com.amazon.device.iap.internal.c
{

    private static final String a = com/amazon/device/iap/internal/b/c.getSimpleName();

    public c()
    {
    }

    public void a(Context context, Intent intent)
    {
        e.a(a, "handleResponse");
        context = intent.getStringExtra("response_type");
        if (context == null)
        {
            e.a(a, "Invalid response type: null");
        } else
        {
            e.a(a, (new StringBuilder()).append("Found response type: ").append(context).toString());
            if ("purchase_response".equals(context))
            {
                (new d(RequestId.fromString(intent.getStringExtra("requestId")))).e();
                return;
            }
        }
    }

    public void a(RequestId requestid)
    {
        e.a(a, "sendGetUserData");
        (new a(requestid)).e();
    }

    public void a(RequestId requestid, String s)
    {
        e.a(a, "sendPurchaseRequest");
        (new com.amazon.device.iap.internal.b.b.d(requestid, s)).e();
    }

    public void a(RequestId requestid, String s, FulfillmentResult fulfillmentresult)
    {
        e.a(a, "sendNotifyFulfillment");
        (new b(requestid, s, fulfillmentresult)).e();
    }

    public void a(RequestId requestid, Set set)
    {
        e.a(a, "sendGetProductDataRequest");
        (new com.amazon.device.iap.internal.b.c.d(requestid, set)).e();
    }

    public void a(RequestId requestid, boolean flag)
    {
        e.a(a, "sendGetPurchaseUpdates");
        (new com.amazon.device.iap.internal.b.d.a(requestid, flag)).e();
    }

}
