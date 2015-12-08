// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;


// Referenced classes of package com.amazon.device.associates:
//            PurchaseResponse, ReceiptsResponse, SearchByIdResponse, SearchResponse, 
//            ServiceStatusResponse

public interface ShoppingListener
{

    public abstract void onPurchaseResponse(PurchaseResponse purchaseresponse);

    public abstract void onReceiptsResponse(ReceiptsResponse receiptsresponse);

    public abstract void onSearchByIdResponse(SearchByIdResponse searchbyidresponse);

    public abstract void onSearchResponse(SearchResponse searchresponse);

    public abstract void onServiceStatusResponse(ServiceStatusResponse servicestatusresponse);
}
