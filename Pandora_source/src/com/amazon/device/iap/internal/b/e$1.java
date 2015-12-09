// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.b;

import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.internal.util.b;
import com.amazon.device.iap.internal.util.e;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;

// Referenced classes of package com.amazon.device.iap.internal.b:
//            e, h, i

class c
    implements Runnable
{

    final Object a;
    final PurchasingListener b;
    final i c;
    final com.amazon.device.iap.internal.b.e d;

    public void run()
    {
        d.d().a("notifyListenerResult", Boolean.FALSE);
        if (!(a instanceof ProductDataResponse)) goto _L2; else goto _L1
_L1:
        b.onProductDataResponse((ProductDataResponse)a);
_L3:
        d.d().a("notifyListenerResult", Boolean.TRUE);
_L4:
        if (c != null)
        {
            c.a(true);
            c.a_();
        }
        return;
_L2:
        if (!(a instanceof UserDataResponse))
        {
            break MISSING_BLOCK_LABEL_138;
        }
        b.onUserDataResponse((UserDataResponse)a);
          goto _L3
        Throwable throwable;
        throwable;
        e.b(e.f(), (new StringBuilder()).append("Error in sendResponse: ").append(throwable).toString());
          goto _L4
        PurchaseUpdatesResponse purchaseupdatesresponse;
        Object obj;
        if (!(a instanceof PurchaseUpdatesResponse))
        {
            break MISSING_BLOCK_LABEL_207;
        }
        purchaseupdatesresponse = (PurchaseUpdatesResponse)a;
        b.onPurchaseUpdatesResponse(purchaseupdatesresponse);
        obj = d.d().a("newCursor");
        if (obj == null) goto _L3; else goto _L5
_L5:
        if (!(obj instanceof String)) goto _L3; else goto _L6
_L6:
        com.amazon.device.iap.internal.util.b.a(purchaseupdatesresponse.getUserData().getUserId(), obj.toString());
          goto _L3
label0:
        {
            if (!(a instanceof PurchaseResponse))
            {
                break label0;
            }
            b.onPurchaseResponse((PurchaseResponse)a);
        }
          goto _L3
        e.b(e.f(), (new StringBuilder()).append("Unknown response type:").append(a.getClass().getName()).toString());
          goto _L3
    }

    ner(com.amazon.device.iap.internal.b.e e1, Object obj, PurchasingListener purchasinglistener, i j)
    {
        d = e1;
        a = obj;
        b = purchasinglistener;
        c = j;
        super();
    }
}
