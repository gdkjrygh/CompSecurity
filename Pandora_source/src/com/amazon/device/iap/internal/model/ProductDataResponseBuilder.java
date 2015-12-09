// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.model;

import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.RequestId;
import java.util.Map;
import java.util.Set;

public class ProductDataResponseBuilder
{

    private Map productData;
    private RequestId requestId;
    private com.amazon.device.iap.model.ProductDataResponse.RequestStatus requestStatus;
    private Set unavailableSkus;

    public ProductDataResponseBuilder()
    {
    }

    public ProductDataResponse build()
    {
        return new ProductDataResponse(this);
    }

    public Map getProductData()
    {
        return productData;
    }

    public RequestId getRequestId()
    {
        return requestId;
    }

    public com.amazon.device.iap.model.ProductDataResponse.RequestStatus getRequestStatus()
    {
        return requestStatus;
    }

    public Set getUnavailableSkus()
    {
        return unavailableSkus;
    }

    public ProductDataResponseBuilder setProductData(Map map)
    {
        productData = map;
        return this;
    }

    public ProductDataResponseBuilder setRequestId(RequestId requestid)
    {
        requestId = requestid;
        return this;
    }

    public ProductDataResponseBuilder setRequestStatus(com.amazon.device.iap.model.ProductDataResponse.RequestStatus requeststatus)
    {
        requestStatus = requeststatus;
        return this;
    }

    public ProductDataResponseBuilder setUnavailableSkus(Set set)
    {
        unavailableSkus = set;
        return this;
    }
}
