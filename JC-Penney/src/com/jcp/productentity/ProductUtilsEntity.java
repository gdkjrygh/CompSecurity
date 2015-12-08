// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.productentity;


public class ProductUtilsEntity
{

    private String assetReferenceURL;
    private String description;
    private String editor;
    private Boolean isWhiteGlovedDelivery;
    private String tags;
    private String title;
    private String webId;

    public ProductUtilsEntity()
    {
    }

    public String getAssetReferenceURL()
    {
        if (assetReferenceURL == null)
        {
            assetReferenceURL = "";
        }
        return assetReferenceURL;
    }

    public String getDescription()
    {
        if (description == null)
        {
            description = "";
        }
        return description;
    }

    public String getEditor()
    {
        if (editor == null)
        {
            editor = "";
        }
        return editor;
    }

    public Boolean getIsWhiteGlovedDelivery()
    {
        return isWhiteGlovedDelivery;
    }

    public String getTags()
    {
        return tags;
    }

    public String getTitle()
    {
        if (title == null)
        {
            title = "";
        }
        return title;
    }

    public String getWebId()
    {
        if (webId == null)
        {
            webId = "";
        }
        return webId;
    }

    public void setAssetReferenceURL(String s)
    {
        assetReferenceURL = s;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setEditor(String s)
    {
        editor = s;
    }

    public void setIsWhiteGlovedDelivery(Boolean boolean1)
    {
        isWhiteGlovedDelivery = boolean1;
    }

    public void setTags(String s)
    {
        tags = s;
    }

    public void setTitle(String s)
    {
        title = s;
    }

    public void setWebId(String s)
    {
        webId = s;
    }
}
