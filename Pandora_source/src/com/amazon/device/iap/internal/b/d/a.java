// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.b.d;

import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.b.e.c;
import com.amazon.device.iap.internal.b.e.d;
import com.amazon.device.iap.internal.b.h;
import com.amazon.device.iap.internal.b.i;
import com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.RequestId;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.amazon.device.iap.internal.b.d:
//            c, d

public final class a extends e
{

    public a(RequestId requestid, boolean flag)
    {
        super(requestid);
        requestid = new c(this);
        requestid.a(new com.amazon.device.iap.internal.b.d.c(this, flag));
        d d1 = new d(this);
        d1.a(new com.amazon.device.iap.internal.b.d.d(this));
        requestid.b(d1);
        a(requestid);
    }

    public void a()
    {
        Object obj1 = null;
        PurchaseUpdatesResponse purchaseupdatesresponse = (PurchaseUpdatesResponse)d().a();
        Object obj = obj1;
        if (purchaseupdatesresponse.getReceipts() != null)
        {
            obj = obj1;
            if (purchaseupdatesresponse.getReceipts().size() > 0)
            {
                obj = new HashSet();
                Iterator iterator = purchaseupdatesresponse.getReceipts().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    Receipt receipt = (Receipt)iterator.next();
                    if (!com.amazon.device.iap.internal.util.d.a(receipt.getReceiptId()))
                    {
                        ((Set) (obj)).add(receipt.getReceiptId());
                    }
                } while (true);
                obj = new com.amazon.device.iap.internal.b.g.a(this, ((Set) (obj)), com.amazon.device.iap.internal.model.a.a.toString());
            }
        }
        a(purchaseupdatesresponse, ((i) (obj)));
    }

    public void b()
    {
        Object obj = d().a();
        if (obj == null || !(obj instanceof PurchaseUpdatesResponse))
        {
            obj = (new PurchaseUpdatesResponseBuilder()).setRequestId(c()).setRequestStatus(com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.FAILED).build();
        } else
        {
            obj = (PurchaseUpdatesResponse)obj;
        }
        a(obj);
    }
}
