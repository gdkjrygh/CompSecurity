// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.locator;


// Referenced classes of package com.dominos.android.sdk.common.dom.locator:
//            LocatorStore

public class storeId
{

    private String addressDescription;
    private String carryoutHoursDescription;
    private String deliveryHoursDescription;
    private Double distance;
    private boolean isCarryoutAvailable;
    private boolean isDeliveryAvailable;
    private boolean isDeliveryStore;
    private boolean isOnline;
    private boolean isOpen;
    private String locationInfo;
    private String phone;
    private String storeId;

    public LocatorStore build()
    {
        return new LocatorStore(storeId, addressDescription, locationInfo, phone, distance, carryoutHoursDescription, deliveryHoursDescription, isCarryoutAvailable, isDeliveryAvailable, isOpen, isOnline, isDeliveryStore, null);
    }

    public isDeliveryStore setAddressDescription(String s)
    {
        addressDescription = s;
        return this;
    }

    public addressDescription setCarryoutAvailable(boolean flag)
    {
        isCarryoutAvailable = flag;
        return this;
    }

    public isCarryoutAvailable setCarryoutHoursDescription(String s)
    {
        carryoutHoursDescription = s;
        return this;
    }

    public carryoutHoursDescription setDeliveryAvailable(boolean flag)
    {
        isDeliveryAvailable = flag;
        return this;
    }

    public isDeliveryAvailable setDeliveryHoursDescription(String s)
    {
        deliveryHoursDescription = s;
        return this;
    }

    public deliveryHoursDescription setDeliveryStore(boolean flag)
    {
        isDeliveryStore = flag;
        return this;
    }

    public isDeliveryStore setDistance(Double double1)
    {
        distance = double1;
        return this;
    }

    public distance setLocationInfo(String s)
    {
        locationInfo = s;
        return this;
    }

    public locationInfo setOnline(boolean flag)
    {
        isOnline = flag;
        return this;
    }

    public isOnline setOpen(boolean flag)
    {
        isOpen = flag;
        return this;
    }

    public isOpen setPhone(String s)
    {
        phone = s;
        return this;
    }

    public phone setStoreId(String s)
    {
        storeId = s;
        return this;
    }

    public ()
    {
        addressDescription = "";
        carryoutHoursDescription = "";
        deliveryHoursDescription = "";
        locationInfo = "";
        phone = "";
        storeId = "";
    }
}
