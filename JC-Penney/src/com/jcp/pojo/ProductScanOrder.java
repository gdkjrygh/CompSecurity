// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProductScanOrder
{

    private List productScans;

    public ProductScanOrder()
    {
        productScans = new ArrayList();
    }

    public ProductScanOrder(List list)
    {
        productScans = list;
    }

    public List getProductScans()
    {
        return productScans;
    }

    public void setProductScans(List list)
    {
        productScans = list;
    }
}
