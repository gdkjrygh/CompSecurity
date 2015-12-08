// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.a;

import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.internal.util.e;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.UserDataResponse;

// Referenced classes of package com.amazon.device.iap.internal.a:
//            c

class b
    implements Runnable
{

    final Object a;
    final PurchasingListener b;
    final c c;

    public void run()
    {
        try
        {
            if (a instanceof ProductDataResponse)
            {
                b.onProductDataResponse((ProductDataResponse)a);
                return;
            }
        }
        catch (Exception exception)
        {
            e.b(com.amazon.device.iap.internal.a.c.a(), (new StringBuilder()).append("Error in sendResponse: ").append(exception).toString());
            return;
        }
        if (a instanceof UserDataResponse)
        {
            b.onUserDataResponse((UserDataResponse)a);
            return;
        }
        if (a instanceof PurchaseUpdatesResponse)
        {
            b.onPurchaseUpdatesResponse((PurchaseUpdatesResponse)a);
            return;
        }
        if (a instanceof PurchaseResponse)
        {
            b.onPurchaseResponse((PurchaseResponse)a);
            return;
        }
        e.b(com.amazon.device.iap.internal.a.c.a(), (new StringBuilder()).append("Unknown response type:").append(a.getClass().getName()).toString());
        return;
    }

    ner(c c1, Object obj, PurchasingListener purchasinglistener)
    {
        c = c1;
        a = obj;
        b = purchasinglistener;
        super();
    }
}
