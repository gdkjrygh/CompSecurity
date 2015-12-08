// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BundleResponse
{

    private List bundles;
    private Map shareMessage;

    public BundleResponse()
    {
        bundles = new ArrayList();
        shareMessage = new HashMap();
    }

    public boolean canEqual(Object obj)
    {
        return obj instanceof BundleResponse;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof BundleResponse))
            {
                return false;
            }
            obj = (BundleResponse)obj;
            if (!((BundleResponse) (obj)).canEqual(this))
            {
                return false;
            }
            Object obj1 = getBundles();
            List list = ((BundleResponse) (obj)).getBundles();
            if (obj1 != null ? !obj1.equals(list) : list != null)
            {
                return false;
            }
            obj1 = getShareMessage();
            obj = ((BundleResponse) (obj)).getShareMessage();
            if (obj1 != null ? !obj1.equals(obj) : obj != null)
            {
                return false;
            }
        }
        return true;
    }

    public List getBundles()
    {
        return bundles;
    }

    public Map getShareMessage()
    {
        return shareMessage;
    }

    public int hashCode()
    {
        int j = 0;
        Object obj = getBundles();
        int i;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        obj = getShareMessage();
        if (obj != null)
        {
            j = obj.hashCode();
        }
        return (i + 31) * 31 + j;
    }

    public void setBundles(List list)
    {
        bundles = list;
    }

    public void setShareMessage(Map map)
    {
        shareMessage = map;
    }

    public String toString()
    {
        return (new StringBuilder("BundleResponse(bundles=")).append(getBundles()).append(", shareMessage=").append(getShareMessage()).append(")").toString();
    }
}
