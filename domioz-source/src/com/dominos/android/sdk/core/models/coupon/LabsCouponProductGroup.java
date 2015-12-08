// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.coupon;

import java.util.List;

// Referenced classes of package com.dominos.android.sdk.core.models.coupon:
//            DefaultItem

public class LabsCouponProductGroup
{

    private boolean expandGroup;
    private int includedOpttionQty;
    private DefaultItem mDefaultItem;
    private String matchCode;
    private int maximumQty;
    private List productCodes;
    private DefaultItem reAddDefault;
    private int requiredQty;
    private String targetProductCode;

    public LabsCouponProductGroup()
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
            obj = (LabsCouponProductGroup)obj;
            if (requiredQty != ((LabsCouponProductGroup) (obj)).requiredQty)
            {
                return false;
            }
            if (maximumQty != ((LabsCouponProductGroup) (obj)).maximumQty)
            {
                return false;
            }
            if (includedOpttionQty != ((LabsCouponProductGroup) (obj)).includedOpttionQty)
            {
                return false;
            }
            if (expandGroup != ((LabsCouponProductGroup) (obj)).expandGroup)
            {
                return false;
            }
            if (matchCode == null ? ((LabsCouponProductGroup) (obj)).matchCode != null : !matchCode.equals(((LabsCouponProductGroup) (obj)).matchCode))
            {
                return false;
            }
            if (targetProductCode == null ? ((LabsCouponProductGroup) (obj)).targetProductCode != null : !targetProductCode.equals(((LabsCouponProductGroup) (obj)).targetProductCode))
            {
                return false;
            }
            if (mDefaultItem == null ? ((LabsCouponProductGroup) (obj)).mDefaultItem != null : !mDefaultItem.equals(((LabsCouponProductGroup) (obj)).mDefaultItem))
            {
                return false;
            }
            if (reAddDefault == null ? ((LabsCouponProductGroup) (obj)).reAddDefault != null : !reAddDefault.equals(((LabsCouponProductGroup) (obj)).reAddDefault))
            {
                return false;
            }
            if (productCodes == null ? ((LabsCouponProductGroup) (obj)).productCodes != null : !productCodes.equals(((LabsCouponProductGroup) (obj)).productCodes))
            {
                return false;
            }
        }
        return true;
    }

    public int getIncludedOpttionQty()
    {
        return includedOpttionQty;
    }

    public String getMatchCode()
    {
        return matchCode;
    }

    public int getMaximumQty()
    {
        return maximumQty;
    }

    public List getProductCodes()
    {
        return productCodes;
    }

    public DefaultItem getReAddDefault()
    {
        return reAddDefault;
    }

    public int getRequiredQty()
    {
        return requiredQty;
    }

    public String getTargetProductCode()
    {
        return targetProductCode;
    }

    public DefaultItem getmDefaultItem()
    {
        return mDefaultItem;
    }

    public boolean isExpandGroup()
    {
        return expandGroup;
    }

    public void setExpandGroup(boolean flag)
    {
        expandGroup = flag;
    }

    public void setIncludedOpttionQty(int i)
    {
        includedOpttionQty = i;
    }

    public void setMatchCode(String s)
    {
        matchCode = s;
    }

    public void setMaximumQty(int i)
    {
        maximumQty = i;
    }

    public void setProductCodes(List list)
    {
        productCodes = list;
    }

    public void setReAddDefault(DefaultItem defaultitem)
    {
        reAddDefault = defaultitem;
    }

    public void setRequiredQty(int i)
    {
        requiredQty = i;
    }

    public void setTargetProductCode(String s)
    {
        targetProductCode = s;
    }

    public void setmDefaultItem(DefaultItem defaultitem)
    {
        mDefaultItem = defaultitem;
    }
}
