// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;


// Referenced classes of package com.amazon.device.associates:
//            NoListenerException, ReceiptsRequest, RequestId, PurchaseRequest, 
//            SearchRequest, SearchByIdRequest, ShoppingListener

public interface ShoppingService
{

    public abstract RequestId getReceipts(ReceiptsRequest receiptsrequest)
        throws NoListenerException;

    public abstract RequestId getServiceStatus()
        throws NoListenerException;

    public abstract RequestId purchase(PurchaseRequest purchaserequest)
        throws NoListenerException;

    public abstract RequestId search(SearchRequest searchrequest)
        throws NoListenerException;

    public abstract RequestId searchById(SearchByIdRequest searchbyidrequest)
        throws NoListenerException;

    public abstract void setListener(ShoppingListener shoppinglistener);
}
