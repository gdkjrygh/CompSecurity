// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.b;

import android.content.Context;
import android.os.Handler;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.internal.util.b;
import com.amazon.device.iap.internal.util.d;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;

// Referenced classes of package com.amazon.device.iap.internal.b:
//            h, i

public class e
{

    private static final String a = com/amazon/device/iap/internal/b/e.getSimpleName();
    private final RequestId b;
    private final h c = new h();
    private i d;

    public e(RequestId requestid)
    {
        b = requestid;
        d = null;
    }

    static String f()
    {
        return a;
    }

    public void a()
    {
    }

    protected void a(i j)
    {
        d = j;
    }

    protected void a(Object obj)
    {
        a(obj, null);
    }

    protected void a(Object obj, i j)
    {
        com.amazon.device.iap.internal.util.d.a(obj, "response");
        Context context = com.amazon.device.iap.internal.d.d().b();
        PurchasingListener purchasinglistener = com.amazon.device.iap.internal.d.d().a();
        if (context == null || purchasinglistener == null)
        {
            com.amazon.device.iap.internal.util.e.a(a, (new StringBuilder()).append("PurchasingListener is not set. Dropping response: ").append(obj).toString());
            return;
        } else
        {
            obj = new Runnable(obj, purchasinglistener, j) {

                final Object a;
                final PurchasingListener b;
                final i c;
                final e d;

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
                    com.amazon.device.iap.internal.util.e.b(e.f(), (new StringBuilder()).append("Error in sendResponse: ").append(throwable).toString());
                      goto _L4
                    PurchaseUpdatesResponse purchaseupdatesresponse;
                    Object obj1;
                    if (!(a instanceof PurchaseUpdatesResponse))
                    {
                        break MISSING_BLOCK_LABEL_207;
                    }
                    purchaseupdatesresponse = (PurchaseUpdatesResponse)a;
                    b.onPurchaseUpdatesResponse(purchaseupdatesresponse);
                    obj1 = d.d().a("newCursor");
                    if (obj1 == null) goto _L3; else goto _L5
_L5:
                    if (!(obj1 instanceof String)) goto _L3; else goto _L6
_L6:
                    com.amazon.device.iap.internal.util.b.a(purchaseupdatesresponse.getUserData().getUserId(), obj1.toString());
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
                    com.amazon.device.iap.internal.util.e.b(e.f(), (new StringBuilder()).append("Unknown response type:").append(a.getClass().getName()).toString());
                      goto _L3
                }

            
            {
                d = e.this;
                a = obj;
                b = purchasinglistener;
                c = j;
                super();
            }
            };
            (new Handler(context.getMainLooper())).post(((Runnable) (obj)));
            return;
        }
    }

    public void b()
    {
    }

    public RequestId c()
    {
        return b;
    }

    public h d()
    {
        return c;
    }

    public void e()
    {
        if (d != null)
        {
            d.a_();
            return;
        } else
        {
            a();
            return;
        }
    }

}
