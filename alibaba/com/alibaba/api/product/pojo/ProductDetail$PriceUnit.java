// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.product.pojo;

import com.alibaba.api.base.pojo.Amount;
import java.io.Serializable;
import java.util.ArrayList;

// Referenced classes of package com.alibaba.api.product.pojo:
//            ProductDetail

public static class BulkOption
    implements Serializable
{
    public static class BulkOption
        implements Serializable
    {

        public Amount skuBulkAmount;
        public int skuBulkDiscount;
        public int skuBulkOrder;

        public BulkOption()
        {
        }
    }


    public BulkOption bulkOption;
    public boolean isActivity;
    public boolean isBulk;
    public Amount maxAmount;
    public int maxPurchaseNumber;
    public Amount minAmount;
    public int minPurchaseNumber;
    public Amount previewMaxAmount;
    public Amount previewMinAmount;
    public ArrayList priceRangeList;
    public int processingTime;

    public BulkOption()
    {
    }
}
