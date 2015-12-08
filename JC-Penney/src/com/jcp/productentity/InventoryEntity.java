// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.productentity;

import java.io.Serializable;

public class InventoryEntity
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String message;
    private String status;

    public InventoryEntity()
    {
    }

    public String getMessage()
    {
        return message;
    }

    public String getStatus()
    {
        return status;
    }

    public void setMessage(String s)
    {
        message = s;
    }

    public void setStatus(String s)
    {
        status = s;
    }
}
