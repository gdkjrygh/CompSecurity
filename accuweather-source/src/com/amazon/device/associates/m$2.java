// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import java.util.Map;

// Referenced classes of package com.amazon.device.associates:
//            m, ShoppingServiceResponse, RequestId, ShoppingServiceRequest, 
//            PurchaseRequest, PurchaseResponse, av, x

class b
    implements Runnable
{

    final ShoppingServiceResponse a;
    final  b;
    final m c;

    public void run()
    {
        RequestId requestid;
        ShoppingServiceRequest shoppingservicerequest;
        boolean flag1;
        requestid = a.getRequestId();
        shoppingservicerequest = (ShoppingServiceRequest)m.a(c).remove(requestid.toString());
        flag1 = a.a();
        if (shoppingservicerequest == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        Object obj;
        PurchaseResponse purchaseresponse;
        if (!(shoppingservicerequest instanceof PurchaseRequest))
        {
            break MISSING_BLOCK_LABEL_83;
        }
        obj = (PurchaseRequest)shoppingservicerequest;
        purchaseresponse = (PurchaseResponse)a;
        if (((PurchaseRequest) (obj)).getPurchaseExperience() == null && purchaseresponse.getStatus() == haseResponse.Status.INVALID_ID)
        {
            flag1 = true;
        }
        obj = av.b();
        if (shoppingservicerequest == null || !flag1 || obj == null) goto _L2; else goto _L1
_L1:
        a[b.ordinal()];
        boolean flag;
        JVM INSTR tableswitch 2 5: default 212
    //                   2 161
    //                   3 161
    //                   4 161
    //                   5 161;
           goto _L2 _L3 _L3 _L3 _L3
_L3:
        m.a(c, b, requestid, shoppingservicerequest, ((ar) (obj)));
        flag = false;
        continue; /* Loop/switch isn't completed */
_L5:
        if (flag)
        {
            try
            {
                m.a(c, b, a);
                return;
            }
            catch (Exception exception)
            {
                x.a(m.c(), (new StringBuilder()).append("Error in sendResponse: ").append(exception).toString());
            }
        }
        return;
_L2:
        flag = true;
        if (true) goto _L5; else goto _L4
_L4:
    }

    (m m1, ShoppingServiceResponse shoppingserviceresponse,  )
    {
        c = m1;
        a = shoppingserviceresponse;
        b = ;
        super();
    }
}
