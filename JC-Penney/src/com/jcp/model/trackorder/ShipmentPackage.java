// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model.trackorder;


// Referenced classes of package com.jcp.model.trackorder:
//            ShipmentActivity

public class ShipmentPackage
{

    private ShipmentActivity activity[];
    private String deliveryDate;
    private String deliveryDayOfWeek;
    private String deliveryTime;
    private String leftAtPlace;
    private int progress;
    private String service;
    private String shippedDate;
    private String status;
    private String trackingNumber;
    private String type;
    private String weight;
    private String weightUnitOfMeasure;

    public ShipmentPackage()
    {
    }

    public ShipmentActivity[] getActivity()
    {
        return activity;
    }

    public String getDeliveryDate()
    {
        return deliveryDate;
    }

    public String getDeliveryDayOfWeek()
    {
        return deliveryDayOfWeek;
    }

    public String getDeliveryTime()
    {
        return deliveryTime;
    }

    public String getLeftAtPlace()
    {
        return leftAtPlace;
    }

    public int getProgress()
    {
        return progress;
    }

    public String getService()
    {
        return service;
    }

    public String getShippedDate()
    {
        return shippedDate;
    }

    public String getStatus()
    {
        return status;
    }

    public String getTrackingNumber()
    {
        return trackingNumber;
    }

    public String getType()
    {
        return type;
    }

    public String getWeight()
    {
        return weight;
    }

    public String getWeightUnitOfMeasure()
    {
        return weightUnitOfMeasure;
    }
}
