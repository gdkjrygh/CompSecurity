// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.b.c;

import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.b.h;
import com.amazon.device.iap.internal.b.i;
import com.amazon.device.iap.internal.model.ProductDataResponseBuilder;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.RequestId;
import java.util.Set;

// Referenced classes of package com.amazon.device.iap.internal.b.c:
//            a, b

public final class d extends e
{

    public d(RequestId requestid, Set set)
    {
        super(requestid);
        requestid = new a(this, set);
        requestid.b(new b(this, set));
        a(requestid);
    }

    public void a()
    {
        a((ProductDataResponse)d().a());
    }

    public void b()
    {
        ProductDataResponse productdataresponse1 = (ProductDataResponse)d().a();
        ProductDataResponse productdataresponse = productdataresponse1;
        if (productdataresponse1 == null)
        {
            productdataresponse = (new ProductDataResponseBuilder()).setRequestId(c()).setRequestStatus(com.amazon.device.iap.model.ProductDataResponse.RequestStatus.FAILED).build();
        }
        a(productdataresponse);
    }
}
