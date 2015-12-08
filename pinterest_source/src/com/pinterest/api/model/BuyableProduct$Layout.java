// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.network.json.PinterestJsonObject;

public class 
{

    private Boolean layoutColors;
    private Boolean layoutMaterial;
    private Boolean layoutPattern;
    private Boolean layoutSize;

    private static  make(PinterestJsonObject pinterestjsonobject)
    {
        if (pinterestjsonobject == null)
        {
            return null;
        } else
        {
            return ()pinterestjsonobject.a(com/pinterest/api/model/BuyableProduct$Layout);
        }
    }

    public String getAttributeName()
    {
        if (layoutColors != null && layoutColors.booleanValue())
        {
            return "colors";
        }
        if (layoutSize != null && layoutSize.booleanValue())
        {
            return "size";
        }
        if (layoutPattern != null && layoutPattern.booleanValue())
        {
            return "pattern";
        }
        if (layoutMaterial != null && layoutMaterial.booleanValue())
        {
            return "material";
        } else
        {
            return null;
        }
    }

    public Boolean isLayoutColors()
    {
        return layoutColors;
    }

    public Boolean isLayoutMaterial()
    {
        return layoutMaterial;
    }

    public Boolean isLayoutPattern()
    {
        return layoutPattern;
    }

    public Boolean isLayoutSize()
    {
        return layoutSize;
    }

    public Boolean isValidLayout()
    {
        boolean flag;
        if (layoutColors != null || layoutMaterial != null || layoutPattern != null || layoutSize != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public void setLayoutColors(Boolean boolean1)
    {
        layoutColors = boolean1;
    }

    public void setLayoutMaterial(Boolean boolean1)
    {
        layoutMaterial = boolean1;
    }

    public void setLayoutPattern(Boolean boolean1)
    {
        layoutPattern = boolean1;
    }

    public void setLayoutSize(Boolean boolean1)
    {
        layoutSize = boolean1;
    }


    public ()
    {
    }
}
