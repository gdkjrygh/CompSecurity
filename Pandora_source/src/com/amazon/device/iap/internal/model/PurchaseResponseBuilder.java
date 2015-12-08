// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.model;

import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserData;

public class PurchaseResponseBuilder
{

    private Receipt receipt;
    private RequestId requestId;
    private com.amazon.device.iap.model.PurchaseResponse.RequestStatus requestStatus;
    private UserData userData;

    public PurchaseResponseBuilder()
    {
    }

    public PurchaseResponse build()
    {
        return new PurchaseResponse(this);
    }

    public Receipt getReceipt()
    {
        return receipt;
    }

    public RequestId getRequestId()
    {
        return requestId;
    }

    public com.amazon.device.iap.model.PurchaseResponse.RequestStatus getRequestStatus()
    {
        return requestStatus;
    }

    public UserData getUserData()
    {
        return userData;
    }

    public PurchaseResponseBuilder setReceipt(Receipt receipt1)
    {
        receipt = receipt1;
        return this;
    }

    public PurchaseResponseBuilder setRequestId(RequestId requestid)
    {
        requestId = requestid;
        return this;
    }

    public PurchaseResponseBuilder setRequestStatus(com.amazon.device.iap.model.PurchaseResponse.RequestStatus requeststatus)
    {
        requestStatus = requeststatus;
        return this;
    }

    public PurchaseResponseBuilder setUserData(UserData userdata)
    {
        userData = userdata;
        return this;
    }
}
