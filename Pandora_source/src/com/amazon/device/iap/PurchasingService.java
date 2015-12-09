// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap;

import android.content.Context;
import android.util.Log;
import com.amazon.device.iap.internal.d;
import com.amazon.device.iap.internal.e;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import java.util.Set;

// Referenced classes of package com.amazon.device.iap:
//            PurchasingListener

public final class PurchasingService
{

    public static final boolean IS_SANDBOX_MODE = e.a();
    public static final String SDK_VERSION = "2.0.61.0";
    private static final String TAG = com/amazon/device/iap/PurchasingService.getSimpleName();

    private PurchasingService()
    {
        Log.i(TAG, (new StringBuilder()).append("In-App Purchasing SDK initializing. SDK Version 2.0.61.0, IS_SANDBOX_MODE: ").append(IS_SANDBOX_MODE).toString());
    }

    public static RequestId getProductData(Set set)
    {
        return d.d().a(set);
    }

    public static RequestId getPurchaseUpdates(boolean flag)
    {
        return d.d().a(flag);
    }

    public static RequestId getUserData()
    {
        return d.d().c();
    }

    public static void notifyFulfillment(String s, FulfillmentResult fulfillmentresult)
    {
        d.d().a(s, fulfillmentresult);
    }

    public static RequestId purchase(String s)
    {
        return d.d().a(s);
    }

    public static void registerListener(Context context, PurchasingListener purchasinglistener)
    {
        d.d().a(context, purchasinglistener);
    }

}
