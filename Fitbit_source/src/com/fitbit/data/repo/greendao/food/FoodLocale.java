// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.food;


public class FoodLocale
{

    private Long id;
    private Boolean imageUpload;
    private String label;
    private Boolean supportsLookupByBarCode;
    private String value;

    public FoodLocale()
    {
    }

    public FoodLocale(Long long1)
    {
        id = long1;
    }

    public FoodLocale(Long long1, String s, String s1, Boolean boolean1, Boolean boolean2)
    {
        id = long1;
        value = s;
        label = s1;
        supportsLookupByBarCode = boolean1;
        imageUpload = boolean2;
    }

    public Long getId()
    {
        return id;
    }

    public Boolean getImageUpload()
    {
        return imageUpload;
    }

    public String getLabel()
    {
        return label;
    }

    public Boolean getSupportsLookupByBarCode()
    {
        return supportsLookupByBarCode;
    }

    public String getValue()
    {
        return value;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setImageUpload(Boolean boolean1)
    {
        imageUpload = boolean1;
    }

    public void setLabel(String s)
    {
        label = s;
    }

    public void setSupportsLookupByBarCode(Boolean boolean1)
    {
        supportsLookupByBarCode = boolean1;
    }

    public void setValue(String s)
    {
        value = s;
    }
}
