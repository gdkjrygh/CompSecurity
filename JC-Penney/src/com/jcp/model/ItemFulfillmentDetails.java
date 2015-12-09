// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model;


public class ItemFulfillmentDetails
{

    private String id;
    private String message;
    private String selected;
    private String status;

    public ItemFulfillmentDetails()
    {
    }

    public String getId()
    {
        return id;
    }

    public String getMessage()
    {
        return message;
    }

    public String getSelected()
    {
        return selected;
    }

    public String getStatus()
    {
        return status;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setMessage(String s)
    {
        message = s;
    }

    public void setSelected(String s)
    {
        selected = s;
    }

    public void setStatus(String s)
    {
        status = s;
    }
}
