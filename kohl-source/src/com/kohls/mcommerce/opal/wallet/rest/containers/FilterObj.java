// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.rest.containers;

import java.io.Serializable;

public class FilterObj
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String FilterValue;
    private String filterName;

    public FilterObj()
    {
    }

    public String getFilterName()
    {
        return filterName;
    }

    public String getFilterValue()
    {
        return FilterValue;
    }

    public void setFilterName(String s)
    {
        filterName = s;
    }

    public void setFilterValue(String s)
    {
        FilterValue = s;
    }
}
