// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.b.g;

import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.b.i;
import com.amazon.device.iap.internal.c.a;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.amazon.device.iap.internal.b.g:
//            a

public final class b extends e
{

    private final String a;
    private final FulfillmentResult b;

    public b(RequestId requestid, String s, FulfillmentResult fulfillmentresult)
    {
        super(requestid);
        requestid = new HashSet();
        requestid.add(s);
        a = s;
        b = fulfillmentresult;
        a(new com.amazon.device.iap.internal.b.g.a(this, requestid, fulfillmentresult.toString()));
    }

    public void a()
    {
    }

    public void b()
    {
        if (FulfillmentResult.FULFILLED == b || FulfillmentResult.UNAVAILABLE == b)
        {
            String s = com.amazon.device.iap.internal.c.a.a().c(a);
            if (s != null)
            {
                (new com.amazon.device.iap.internal.b.f.b(this, s)).a_();
                com.amazon.device.iap.internal.c.a.a().a(a);
            }
        }
    }
}
