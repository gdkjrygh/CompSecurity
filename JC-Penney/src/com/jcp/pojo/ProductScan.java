// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.pojo;


public class ProductScan
{

    private String productId;
    private String sku;

    public ProductScan()
    {
    }

    public ProductScan(String s, String s1)
    {
        productId = s;
        sku = s1;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        obj = (ProductScan)obj;
        if (productId == null ? ((ProductScan) (obj)).productId != null : !productId.equals(((ProductScan) (obj)).productId)) goto _L4; else goto _L3
_L4:
        return false;
_L3:
        if (sku == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (sku.equals(((ProductScan) (obj)).sku)) goto _L1; else goto _L4
        if (((ProductScan) (obj)).sku != null) goto _L4; else goto _L5
_L5:
        return true;
    }

    public String getProductId()
    {
        return productId;
    }

    public String getSku()
    {
        return sku;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (productId != null)
        {
            i = productId.hashCode();
        } else
        {
            i = 0;
        }
        if (sku != null)
        {
            j = sku.hashCode();
        }
        return i * 31 + j;
    }

    public void setProductId(String s)
    {
        productId = s;
    }

    public void setSku(String s)
    {
        sku = s;
    }
}
