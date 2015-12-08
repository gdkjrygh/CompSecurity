// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.b.a;

import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.b.f.b;
import com.amazon.device.iap.internal.b.f.c;
import com.amazon.device.iap.internal.b.h;
import com.amazon.device.iap.internal.b.i;
import com.amazon.device.iap.internal.model.PurchaseResponseBuilder;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.RequestId;

// Referenced classes of package com.amazon.device.iap.internal.b.a:
//            a, b

public final class d extends e
{

    public d(RequestId requestid)
    {
        super(requestid);
        requestid = new a(this);
        requestid.b(new com.amazon.device.iap.internal.b.a.b(this));
        a(requestid);
    }

    public void a()
    {
        PurchaseResponse purchaseresponse = (PurchaseResponse)d().a();
        if (purchaseresponse == null)
        {
            return;
        }
        Receipt receipt = purchaseresponse.getReceipt();
        c c1;
        boolean flag;
        if (receipt != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c1 = new c(this, flag);
        if (flag && (ProductType.ENTITLED == receipt.getProductType() || ProductType.SUBSCRIPTION == receipt.getProductType()))
        {
            c1.b(new b(this, c().toString()));
        }
        a(purchaseresponse, ((i) (c1)));
    }

    public void b()
    {
        PurchaseResponse purchaseresponse1 = (PurchaseResponse)d().a();
        PurchaseResponse purchaseresponse = purchaseresponse1;
        if (purchaseresponse1 == null)
        {
            purchaseresponse = (new PurchaseResponseBuilder()).setRequestId(c()).setRequestStatus(com.amazon.device.iap.model.PurchaseResponse.RequestStatus.FAILED).build();
        }
        a(purchaseresponse, new c(this, false));
    }
}
