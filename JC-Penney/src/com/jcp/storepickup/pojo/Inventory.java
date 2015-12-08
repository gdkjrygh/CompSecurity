// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.storepickup.pojo;


public class Inventory
{

    private String message;
    private String pickUpMessage;
    private String pickUpStatus;
    private String quantity;
    private String status;
    private String updateAsOf;
    private String updatedAsOf;

    public Inventory()
    {
    }

    public String getMessage()
    {
        return message;
    }

    public String getPickUpMessage()
    {
        return pickUpMessage;
    }

    public String getPickUpStatus()
    {
        return pickUpStatus;
    }

    public String getPickupStatus()
    {
        return pickUpStatus;
    }

    public String getQuantity()
    {
        return quantity;
    }

    public String getStatus()
    {
        return status;
    }

    public String getUpdateAsOf()
    {
        return updateAsOf;
    }

    public String getUpdatedAsOf()
    {
        return updatedAsOf;
    }

    public void setMessage(String s)
    {
        message = s;
    }

    public void setPickUpMessage(String s)
    {
        pickUpMessage = s;
    }

    public void setPickUpStatus(String s)
    {
        pickUpStatus = s;
    }

    public void setPickupStatus(String s)
    {
        pickUpStatus = s;
    }

    public void setQuantity(String s)
    {
        quantity = s;
    }

    public void setStatus(String s)
    {
        status = s;
    }

    public void setUpdateAsOf(String s)
    {
        updateAsOf = s;
    }

    public void setUpdatedAsOf(String s)
    {
        updatedAsOf = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ClassPojo [message = ").append(message).append(", status = ").append(status).append(", pickupStatus = ").append(pickUpStatus).append(", pickUpMessage = ").append(pickUpMessage).append("]").toString();
    }
}
