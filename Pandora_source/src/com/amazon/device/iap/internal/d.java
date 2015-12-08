// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal;

import android.content.Context;
import android.content.Intent;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.internal.util.e;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

// Referenced classes of package com.amazon.device.iap.internal:
//            e, c

public class d
{

    private static String a = com/amazon/device/iap/internal/d.getSimpleName();
    private static String b = "sku";
    private static d c = new d();
    private final c d = com.amazon.device.iap.internal.e.b();
    private Context e;
    private PurchasingListener f;

    private d()
    {
    }

    public static d d()
    {
        return c;
    }

    private void e()
    {
        if (f == null)
        {
            throw new IllegalStateException("You must register a PurchasingListener before invoking this operation");
        } else
        {
            return;
        }
    }

    public PurchasingListener a()
    {
        return f;
    }

    public RequestId a(String s)
    {
        com.amazon.device.iap.internal.util.d.a(s, b);
        e();
        RequestId requestid = new RequestId();
        d.a(requestid, s);
        return requestid;
    }

    public RequestId a(Set set)
    {
        com.amazon.device.iap.internal.util.d.a(set, "skus");
        com.amazon.device.iap.internal.util.d.a(set, "skus");
        for (Iterator iterator = set.iterator(); iterator.hasNext();)
        {
            if (((String)iterator.next()).trim().length() == 0)
            {
                throw new IllegalArgumentException("Empty SKU values are not allowed");
            }
        }

        if (set.size() > 100)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(set.size()).append(" SKUs were provided, but no more than ").append(100).append(" SKUs are allowed").toString());
        } else
        {
            e();
            RequestId requestid = new RequestId();
            set = new LinkedHashSet(set);
            d.a(requestid, set);
            return requestid;
        }
    }

    public RequestId a(boolean flag)
    {
        e();
        RequestId requestid = new RequestId();
        d.a(requestid, flag);
        return requestid;
    }

    public void a(Context context, Intent intent)
    {
        try
        {
            d.a(context, intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.amazon.device.iap.internal.util.e.b(a, (new StringBuilder()).append("Error in onReceive: ").append(context).toString());
        }
    }

    public void a(Context context, PurchasingListener purchasinglistener)
    {
        com.amazon.device.iap.internal.util.e.a(a, (new StringBuilder()).append("PurchasingListener registered: ").append(purchasinglistener).toString());
        com.amazon.device.iap.internal.util.e.a(a, (new StringBuilder()).append("PurchasingListener Context: ").append(context).toString());
        if (purchasinglistener == null || context == null)
        {
            throw new IllegalArgumentException("Neither PurchasingListener or its Context can be null");
        } else
        {
            e = context.getApplicationContext();
            f = purchasinglistener;
            return;
        }
    }

    public void a(String s, FulfillmentResult fulfillmentresult)
    {
        if (com.amazon.device.iap.internal.util.d.a(s))
        {
            throw new IllegalArgumentException("Empty receiptId is not allowed");
        } else
        {
            com.amazon.device.iap.internal.util.d.a(fulfillmentresult, "fulfillmentResult");
            e();
            RequestId requestid = new RequestId();
            d.a(requestid, s, fulfillmentresult);
            return;
        }
    }

    public Context b()
    {
        return e;
    }

    public RequestId c()
    {
        e();
        RequestId requestid = new RequestId();
        d.a(requestid);
        return requestid;
    }

}
