// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.productfilter.pojo;

import java.io.Serializable;
import java.util.List;

public class ProductList
    implements Serializable
{

    private String alternateMessage;
    private String count;
    private List filters;
    private List pages;
    private List products;
    private String query;
    private String redirectUrl;
    private String relatedTerms;
    private List sortOptions;
    private String standardizedQuery;

    public ProductList()
    {
    }

    public String getAlternateMessage()
    {
        return alternateMessage;
    }

    public String getCount()
    {
        return count;
    }

    public List getFilters()
    {
        return filters;
    }

    public List getPages()
    {
        return pages;
    }

    public List getProducts()
    {
        return products;
    }

    public String getQuery()
    {
        return query;
    }

    public String getRedirectUrl()
    {
        return redirectUrl;
    }

    public String getRelatedTerms()
    {
        return relatedTerms;
    }

    public List getSortOptions()
    {
        return sortOptions;
    }

    public String getStandardizedQuery()
    {
        return standardizedQuery;
    }

    public void setAlternateMessage(String s)
    {
        alternateMessage = s;
    }

    public void setCount(String s)
    {
        count = s;
    }

    public void setFilters(List list)
    {
        filters = list;
    }

    public void setPages(List list)
    {
        pages = list;
    }

    public void setProducts(List list)
    {
        products = list;
    }

    public void setQuery(String s)
    {
        query = s;
    }

    public void setRedirectUrl(String s)
    {
        redirectUrl = s;
    }

    public void setRelatedTerms(String s)
    {
        relatedTerms = s;
    }

    public void setSortOptions(List list)
    {
        sortOptions = list;
    }

    public void setStandardizedQuery(String s)
    {
        standardizedQuery = s;
    }
}
