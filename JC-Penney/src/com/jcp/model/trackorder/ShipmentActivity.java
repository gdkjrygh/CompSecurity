// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model.trackorder;


// Referenced classes of package com.jcp.model.trackorder:
//            ShipmentLocation

public class ShipmentActivity
{

    private String date;
    private String description;
    private String localTime;
    private ShipmentLocation location;

    public ShipmentActivity()
    {
    }

    public String getDate()
    {
        return date;
    }

    public String getDescription()
    {
        return description;
    }

    public String getLocalTime()
    {
        return localTime;
    }

    public ShipmentLocation getLocation()
    {
        return location;
    }
}
