// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.model;

import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserData;
import java.util.List;

public class PurchaseUpdatesResponseBuilder
{

    private boolean hasMore;
    private List receipts;
    private RequestId requestId;
    private com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus requestStatus;
    private UserData userData;

    public PurchaseUpdatesResponseBuilder()
    {
    }

    public PurchaseUpdatesResponse build()
    {
        return new PurchaseUpdatesResponse(this);
    }

    public List getReceipts()
    {
        return receipts;
    }

    public RequestId getRequestId()
    {
        return requestId;
    }

    public com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus getRequestStatus()
    {
        return requestStatus;
    }

    public UserData getUserData()
    {
        return userData;
    }

    public boolean hasMore()
    {
        return hasMore;
    }

    public PurchaseUpdatesResponseBuilder setHasMore(boolean flag)
    {
        hasMore = flag;
        return this;
    }

    public PurchaseUpdatesResponseBuilder setReceipts(List list)
    {
        receipts = list;
        return this;
    }

    public PurchaseUpdatesResponseBuilder setRequestId(RequestId requestid)
    {
        requestId = requestid;
        return this;
    }

    public PurchaseUpdatesResponseBuilder setRequestStatus(com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus requeststatus)
    {
        requestStatus = requeststatus;
        return this;
    }

    public PurchaseUpdatesResponseBuilder setUserData(UserData userdata)
    {
        userData = userdata;
        return this;
    }
}
