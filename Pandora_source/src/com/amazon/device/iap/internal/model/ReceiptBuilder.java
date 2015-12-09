// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.model;

import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.Receipt;
import java.util.Date;

public class ReceiptBuilder
{

    private Date cancelDate;
    private ProductType productType;
    private Date purchaseDate;
    private String receiptId;
    private String sku;

    public ReceiptBuilder()
    {
    }

    public Receipt build()
    {
        return new Receipt(this);
    }

    public Date getCancelDate()
    {
        return cancelDate;
    }

    public ProductType getProductType()
    {
        return productType;
    }

    public Date getPurchaseDate()
    {
        return purchaseDate;
    }

    public String getReceiptId()
    {
        return receiptId;
    }

    public String getSku()
    {
        return sku;
    }

    public ReceiptBuilder setCancelDate(Date date)
    {
        cancelDate = date;
        return this;
    }

    public ReceiptBuilder setProductType(ProductType producttype)
    {
        productType = producttype;
        return this;
    }

    public ReceiptBuilder setPurchaseDate(Date date)
    {
        purchaseDate = date;
        return this;
    }

    public ReceiptBuilder setReceiptId(String s)
    {
        receiptId = s;
        return this;
    }

    public ReceiptBuilder setSku(String s)
    {
        sku = s;
        return this;
    }
}
