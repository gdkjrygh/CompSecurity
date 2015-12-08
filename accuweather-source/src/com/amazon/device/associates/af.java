// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.content.Intent;

// Referenced classes of package com.amazon.device.associates:
//            ar, RequestId, e, p, 
//            PurchaseRequest, PurchaseExperience, PurchaseResponse, ay, 
//            bo, ab, OpenProductPageRequest, ReceiptsResponse, 
//            SearchByIdResponse, SearchResponse, ReceiptsRequest, SearchByIdRequest, 
//            SearchRequest

final class af
    implements ar
{

    private static final String a = com/amazon/device/associates/af.getSimpleName();

    af()
    {
    }

    private void a(RequestId requestid, String s, ay ay1)
    {
        s = new Intent(s);
        s.putExtra("requestId", requestid.toString());
        requestid = new e();
        p.c(a, (new StringBuilder()).append("Intent action sending for DAS response receiver:").append(s.getAction()).toString());
        requestid.a(s, ay1);
    }

    public void a(RequestId requestid, PurchaseRequest purchaserequest, ay ay1)
    {
        p.c(a, (new StringBuilder()).append("sendPurchaseRequest for request:").append(purchaserequest.toString()).toString());
        if (purchaserequest.getPurchaseExperience() != null && purchaserequest.getPurchaseExperience() != PurchaseExperience.DIRECT_WITH_DETAIL && purchaserequest.getPurchaseExperience() != PurchaseExperience.DIRECT_WITH_PREVIEW || purchaserequest.getReceiveReceipt())
        {
            requestid = new PurchaseResponse(requestid, PurchaseResponse.Status.NOT_SUPPORTED);
            ay1.a(ay.a.e, requestid);
            return;
        }
        ab ab1 = ab.a(bo.a(), bo.b(), null);
        OpenProductPageRequest openproductpagerequest = new OpenProductPageRequest(purchaserequest.getProductId());
        if (PurchaseExperience.DIRECT_WITH_PREVIEW.equals(purchaserequest.getPurchaseExperience()))
        {
            p.c(a, (new StringBuilder()).append("Calling showProductPreview for productID:").append(openproductpagerequest.getProductId()).toString());
            ab1.a(purchaserequest.getOriginView(), openproductpagerequest);
        } else
        {
            p.c(a, (new StringBuilder()).append("Calling showProductDetail for productID:").append(openproductpagerequest.getProductId()).toString());
            ab1.b(purchaserequest.getOriginView(), openproductpagerequest);
        }
        a(requestid, "com.amazon.device.iap.physical.physical_purchase", ay1);
    }

    public void a(RequestId requestid, ReceiptsRequest receiptsrequest, ay ay1)
    {
        requestid = new ReceiptsResponse(requestid, ReceiptsResponse.Status.NOT_SUPPORTED);
        ay1.a(ay.a.b, requestid);
    }

    public void a(RequestId requestid, SearchByIdRequest searchbyidrequest, ay ay1)
    {
        requestid = new SearchByIdResponse(requestid, SearchByIdResponse.Status.NOT_SUPPORTED);
        ay1.a(ay.a.d, requestid);
    }

    public void a(RequestId requestid, SearchRequest searchrequest, ay ay1)
    {
        requestid = new SearchResponse(requestid, SearchResponse.Status.NOT_SUPPORTED);
        ay1.a(ay.a.c, requestid);
    }

    public void a(RequestId requestid, ay ay1)
    {
        p.c(a, (new StringBuilder()).append("sendGetServiceStatusRequest for requestId:").append(requestid).toString());
        a(requestid, "com.amazon.device.iap.physical.get_serviceStatus", ay1);
    }

    public void b(RequestId requestid, ay ay1)
    {
    }

    public void c(RequestId requestid, ay ay1)
    {
    }

}
