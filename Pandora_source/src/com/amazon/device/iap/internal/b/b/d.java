// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.b.b;

import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.b.h;
import com.amazon.device.iap.internal.b.i;
import com.amazon.device.iap.internal.model.PurchaseResponseBuilder;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.RequestId;

// Referenced classes of package com.amazon.device.iap.internal.b.b:
//            c, b

public final class d extends e
{

    public d(RequestId requestid, String s)
    {
        super(requestid);
        requestid = new c(this, s);
        requestid.b(new b(this, s));
        a(requestid);
    }

    public void a()
    {
    }

    public void b()
    {
        PurchaseResponse purchaseresponse1 = (PurchaseResponse)d().a();
        PurchaseResponse purchaseresponse = purchaseresponse1;
        if (purchaseresponse1 == null)
        {
            purchaseresponse = (new PurchaseResponseBuilder()).setRequestId(c()).setRequestStatus(com.amazon.device.iap.model.PurchaseResponse.RequestStatus.FAILED).build();
        }
        a(purchaseresponse);
    }
}
