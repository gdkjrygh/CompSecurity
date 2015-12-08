// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.productlistentity;

import java.io.Serializable;

public class ProductListImageEntity
    implements Serializable
{

    private String altText;
    private String swatchUrl;
    private String type;
    private String url;

    public ProductListImageEntity()
    {
    }

    public String getAltText()
    {
        return altText;
    }

    public String getSwatchUrl()
    {
        return swatchUrl;
    }

    public String getType()
    {
        return type;
    }

    public String getUrl()
    {
        if (url != null && url.length() > 0 && url.contains(".tif"))
        {
            url = url.replace(".tif", "");
        }
        return url;
    }

    public void setAltText(String s)
    {
        altText = s;
    }

    public void setSwatchUrl(String s)
    {
        swatchUrl = s;
    }

    public void setType(String s)
    {
        type = s;
    }

    public void setUrl(String s)
    {
        url = s;
    }
}
