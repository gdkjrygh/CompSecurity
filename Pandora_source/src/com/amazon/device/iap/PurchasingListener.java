// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap;

import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.UserDataResponse;

public interface PurchasingListener
{

    public abstract void onProductDataResponse(ProductDataResponse productdataresponse);

    public abstract void onPurchaseResponse(PurchaseResponse purchaseresponse);

    public abstract void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseupdatesresponse);

    public abstract void onUserDataResponse(UserDataResponse userdataresponse);
}
