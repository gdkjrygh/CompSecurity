// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.coupon;


public class DefaultItem
{

    private String categoryCode;
    private String flavorCode;
    private boolean needsCustomization;
    private String pageCode;
    private String productCode;
    private String sizeCode;
    private String specialtyCode;

    public DefaultItem()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (DefaultItem)obj;
            if (categoryCode == null ? ((DefaultItem) (obj)).categoryCode != null : !categoryCode.equals(((DefaultItem) (obj)).categoryCode))
            {
                return false;
            }
            if (flavorCode == null ? ((DefaultItem) (obj)).flavorCode != null : !flavorCode.equals(((DefaultItem) (obj)).flavorCode))
            {
                return false;
            }
            if (needsCustomization != ((DefaultItem) (obj)).needsCustomization)
            {
                return false;
            }
            if (pageCode == null ? ((DefaultItem) (obj)).pageCode != null : !pageCode.equals(((DefaultItem) (obj)).pageCode))
            {
                return false;
            }
            if (productCode == null ? ((DefaultItem) (obj)).productCode != null : !productCode.equals(((DefaultItem) (obj)).productCode))
            {
                return false;
            }
            if (sizeCode == null ? ((DefaultItem) (obj)).sizeCode != null : !sizeCode.equals(((DefaultItem) (obj)).sizeCode))
            {
                return false;
            }
            if (specialtyCode == null ? ((DefaultItem) (obj)).specialtyCode != null : !specialtyCode.equals(((DefaultItem) (obj)).specialtyCode))
            {
                return false;
            }
        }
        return true;
    }

    public String getCategoryCode()
    {
        return categoryCode;
    }

    public String getFlavorCode()
    {
        return flavorCode;
    }

    public boolean getNeedsCustomization()
    {
        return needsCustomization;
    }

    public String getPageCode()
    {
        return pageCode;
    }

    public String getProductCode()
    {
        return productCode;
    }

    public String getSizeCode()
    {
        return sizeCode;
    }

    public String getSpecialtyCode()
    {
        return specialtyCode;
    }

    public void setCategoryCode(String s)
    {
        categoryCode = s;
    }

    public void setFlavorCode(String s)
    {
        flavorCode = s;
    }

    public void setNeedsCustomization(boolean flag)
    {
        needsCustomization = flag;
    }

    public void setPageCode(String s)
    {
        pageCode = s;
    }

    public void setProductCode(String s)
    {
        productCode = s;
    }

    public void setSizeCode(String s)
    {
        sizeCode = s;
    }

    public void setSpecialtyCode(String s)
    {
        specialtyCode = s;
    }
}
