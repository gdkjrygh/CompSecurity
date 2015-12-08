// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.order;


// Referenced classes of package com.dominos.android.sdk.common.dom.order:
//            Address

public class isDefault
{

    private String addressType;
    private String buildingId;
    private String campusId;
    private String city;
    private String deliveryInstructions;
    private boolean isDefault;
    private String line2;
    private String line3;
    private String line4;
    private String name;
    private String organizationName;
    private String postalCode;
    private String region;
    private String street;
    private String unitNumber;
    private String unitType;

    public Address build()
    {
        return new Address(street, unitType, unitNumber, line2, line3, line4, city, region, postalCode, buildingId, campusId, deliveryInstructions, addressType, name, organizationName, isDefault, null);
    }

    public isDefault setAddressType(String s)
    {
        addressType = s;
        return this;
    }

    public addressType setBuildingId(String s)
    {
        buildingId = s;
        return this;
    }

    public buildingId setCampusId(String s)
    {
        campusId = s;
        return this;
    }

    public campusId setCity(String s)
    {
        city = s;
        return this;
    }

    public city setDeliveryInstructions(String s)
    {
        deliveryInstructions = s;
        return this;
    }

    public deliveryInstructions setIsDefault(boolean flag)
    {
        isDefault = flag;
        return this;
    }

    public isDefault setLine2(String s)
    {
        line2 = s;
        return this;
    }

    public line2 setLine3(String s)
    {
        line3 = s;
        return this;
    }

    public line3 setLine4(String s)
    {
        line4 = s;
        return this;
    }

    public line4 setName(String s)
    {
        name = s;
        return this;
    }

    public name setOrganizationName(String s)
    {
        organizationName = s;
        return this;
    }

    public organizationName setPostalCode(String s)
    {
        if (s != null)
        {
            postalCode = s.replaceAll("[^\\d]", "");
            return this;
        } else
        {
            postalCode = s;
            return this;
        }
    }

    public postalCode setRegion(String s)
    {
        region = s;
        return this;
    }

    public region setStreet(String s)
    {
        street = s;
        return this;
    }

    public street setUnitNumber(String s)
    {
        unitNumber = s;
        return this;
    }

    public unitNumber setUnitType(String s)
    {
        unitType = s;
        return this;
    }

    public ()
    {
        city = "";
        line2 = "";
        line3 = "";
        line4 = "";
        postalCode = "";
        region = "";
        street = "";
        unitNumber = "";
        unitType = "";
        buildingId = "";
        campusId = "";
        deliveryInstructions = "";
        addressType = "";
        name = "";
        organizationName = "";
        isDefault = false;
    }
}
