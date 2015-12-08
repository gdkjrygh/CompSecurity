// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import com.amazon.android.Kiwi;

// Referenced classes of package com.amazon.device.associates:
//            ar, x, PurchaseRequest, PurchaseExperience, 
//            PurchaseResponse, ay, r, u, 
//            ao, bf, l, d, 
//            bs, aa, RequestId, ReceiptsRequest, 
//            SearchByIdRequest, SearchRequest

final class ag
    implements ar
{

    private static final String a = com/amazon/device/associates/ag.getSimpleName();
    private static ay b;

    ag()
    {
    }

    public void a(RequestId requestid, PurchaseRequest purchaserequest, ay ay1)
    {
        x.b(a, "sendPurchaseRequest");
        b = ay1;
        if (purchaserequest.getPurchaseExperience() != null && purchaserequest.getPurchaseExperience() != PurchaseExperience.IN_APP)
        {
            requestid = new PurchaseResponse(requestid, PurchaseResponse.Status.NOT_SUPPORTED);
            b.a(ay.a.e, requestid);
            return;
        } else
        {
            android.content.Context context = ay1.b();
            requestid = new r(requestid, purchaserequest, ay1);
            x.b(a, (new StringBuilder()).append("data: ").append(requestid.getCommandData()).toString());
            Kiwi.addCommandToCommandTaskPipeline(requestid, context);
            return;
        }
    }

    public void a(RequestId requestid, ReceiptsRequest receiptsrequest, ay ay1)
    {
        x.b(a, "sendGetReceiptsRequest");
        b = ay1;
        android.content.Context context = ay1.b();
        requestid = new u(requestid, receiptsrequest, ay1);
        x.b(a, (new StringBuilder()).append("data: ").append(requestid.getCommandData()).toString());
        Kiwi.addCommandToCommandTaskPipeline(requestid, context);
    }

    public void a(RequestId requestid, SearchByIdRequest searchbyidrequest, ay ay1)
    {
        x.b(a, "sendSearchByIdRequest");
        b = ay1;
        android.content.Context context = ay1.b();
        requestid = new bf(requestid, searchbyidrequest, ay1);
        x.b(a, (new StringBuilder()).append("data: ").append(requestid.getCommandData()).toString());
        Kiwi.addCommandToCommandTaskPipeline(requestid, context);
    }

    public void a(RequestId requestid, SearchRequest searchrequest, ay ay1)
    {
        x.b(a, "sendSearchRequest");
        b = ay1;
        android.content.Context context = ay1.b();
        requestid = new l(requestid, searchrequest, ay1);
        x.b(a, (new StringBuilder()).append("data: ").append(requestid.getCommandData()).toString());
        Kiwi.addCommandToCommandTaskPipeline(requestid, context);
    }

    public void a(RequestId requestid, ay ay1)
    {
        x.b(a, "sendGetUserDataRequest");
        b = ay1;
        android.content.Context context = ay1.b();
        requestid = new d(requestid, ay1);
        x.b(a, (new StringBuilder()).append("data: ").append(requestid.getCommandData()).toString());
        Kiwi.addCommandToCommandTaskPipeline(requestid, context);
    }

    public void b(RequestId requestid, ay ay1)
    {
        x.b(a, "sendGetPurchaseResultRequest");
        b = ay1;
        android.content.Context context = ay1.b();
        requestid = new bs(requestid, ay1);
        x.b(a, (new StringBuilder()).append("data: ").append(requestid.getCommandData()).toString());
        Kiwi.addCommandToCommandTaskPipeline(requestid, context);
    }

    public void c(RequestId requestid, ay ay1)
    {
        x.b(a, "sendNotifyReceiptReceivedRequest");
        b = ay1;
        android.content.Context context = ay1.b();
        requestid = new aa(requestid, ay1);
        x.b(a, (new StringBuilder()).append("data: ").append(requestid.getCommandData()).toString());
        Kiwi.addCommandToCommandTaskPipeline(requestid, context);
    }

}
