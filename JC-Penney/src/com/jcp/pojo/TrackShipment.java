// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.pojo;

import com.jcp.model.trackorder.Carrier;
import com.jcp.model.trackorder.ShipmentPackage;
import com.jcp.model.trackorder.ShipmentWeight;

public class TrackShipment
{

    private Carrier carrier;
    private ShipmentPackage packages[];
    private ShipmentWeight shipmentWeight;

    public TrackShipment()
    {
    }

    public Carrier getCarrier()
    {
        return carrier;
    }

    public ShipmentPackage[] getPackages()
    {
        return packages;
    }

    public ShipmentWeight getShipmentWeight()
    {
        return shipmentWeight;
    }
}
