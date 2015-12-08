// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.storepickup.pojo;

import java.util.List;

public class StorePickUp
{

    private List pages;
    private List stores;

    public StorePickUp()
    {
    }

    public List getPages()
    {
        return pages;
    }

    public List getStores()
    {
        return stores;
    }

    public void setPages(List list)
    {
        pages = list;
    }

    public void setStores(List list)
    {
        stores = list;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ClassPojo [stores = ").append(stores).append("]").toString();
    }
}
