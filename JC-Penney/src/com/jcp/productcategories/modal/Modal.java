// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.productcategories.modal;


public class Modal
{

    private String categoryId;
    private Boolean external;
    private String id;
    private boolean isCatAvailable;
    private boolean isLocalAdCategory;
    private String mobile;
    private String name;
    private String titleImage;
    private String url;

    public Modal()
    {
    }

    public Modal(String s)
    {
        name = s;
    }

    public String getCategoryId()
    {
        return categoryId;
    }

    public Boolean getExternal()
    {
        return external;
    }

    public String getId()
    {
        return id;
    }

    public String getMobile()
    {
        return mobile;
    }

    public String getName()
    {
        return name;
    }

    public String getTitleImage()
    {
        return titleImage;
    }

    public String getUrl()
    {
        return url;
    }

    public boolean isCatAvailable()
    {
        return isCatAvailable;
    }

    public boolean isLocalAdCategory()
    {
        return isLocalAdCategory;
    }

    public void setCatAvailable(boolean flag)
    {
        isCatAvailable = flag;
    }

    public void setCategoryId(String s)
    {
        categoryId = s;
    }

    public void setExternal(Boolean boolean1)
    {
        external = boolean1;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setLocalAdCategory(boolean flag)
    {
        isLocalAdCategory = flag;
    }

    public void setMobile(String s)
    {
        mobile = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setTitleImage(String s)
    {
        titleImage = s;
    }

    public void setUrl(String s)
    {
        url = s;
    }
}
