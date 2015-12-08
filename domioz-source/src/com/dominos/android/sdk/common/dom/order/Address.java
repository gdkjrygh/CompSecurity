// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.order;

import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.core.MapNode;
import com.dominos.android.sdk.common.core.Seq;
import com.dominos.android.sdk.common.core.ToMap;
import com.dominos.android.sdk.common.core.ToMapBuilder;
import com.dominos.android.sdk.common.core.Util;
import com.dominos.android.sdk.common.dom.useraccounts.States;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.google.a.b.ar;
import java.util.Map;
import org.a.a.a.a.b;
import org.a.a.a.a.c;
import org.a.a.a.a.f;
import org.json.JSONObject;

public class Address
    implements ToMap
{

    public static final Address EMPTY = (new Builder()).build();
    private final String addressType;
    private final String buildingId;
    private final String campusId;
    private final String city;
    private String deliveryInstructions;
    private boolean isDefault;
    private final String line2;
    private final String line3;
    private final String line4;
    private final String name;
    private final String organizationName;
    private final String postalCode;
    private final String region;
    private final String street;
    private final String unitNumber;
    private final String unitType;

    private Address(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String s9, String s10, String s11, String s12, String s13, 
            String s14, boolean flag)
    {
        street = (String)Util.notNull(s);
        unitType = (String)Util.notNull(s1);
        unitNumber = (String)Util.notNull(s2);
        line2 = (String)Util.notNull(s3);
        line3 = (String)Util.notNull(s4);
        line4 = (String)Util.notNull(s5);
        city = (String)Util.notNull(s6);
        s1 = (String)Util.notNull(s7);
        s = s1;
        if (s1.length() > 2)
        {
            s = States.getStateAbbrev(s1);
        }
        region = s;
        postalCode = (String)Util.notNull(s8);
        buildingId = s9;
        campusId = s10;
        deliveryInstructions = s11;
        addressType = s12;
        name = s13;
        organizationName = s14;
        isDefault = flag;
    }

    Address(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String s9, String s10, String s11, String s12, String s13, 
            String s14, boolean flag, _cls1 _pcls1)
    {
        this(s, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, flag);
    }

    public static Address from(LabsAddress labsaddress)
    {
        return (new Builder()).setStreet(labsaddress.getStreet()).setUnitType(labsaddress.getUnitType()).setUnitNumber(labsaddress.getUnitNumber()).setLine2(labsaddress.getLine2()).setLine3(labsaddress.getLine3()).setLine4(labsaddress.getLine4()).setCity(labsaddress.getCity()).setRegion(labsaddress.getRegion()).setPostalCode(labsaddress.getPostalCode()).setBuildingId(labsaddress.getBuildingId()).setCampusId(labsaddress.getCampusId()).setAddressType(labsaddress.getAddressType()).setName(labsaddress.getName()).setOrganizationName(labsaddress.getOrganizationName()).setDeliveryInstructions(labsaddress.getDeliveryInstructions()).setIsDefault(labsaddress.isDefault()).build();
    }

    public static Address from(Map map)
    {
        MapNode mapnode = new MapNode(map);
        String s2 = mapnode.getText("DeliveryInstructions", "");
        String s = mapnode.getText("OrganizationName", "");
        map = s;
        if (s.equals(""))
        {
            map = mapnode.getText("LocationName", "");
        }
        String s1 = mapnode.getText("AddressType", "");
        s = s1;
        if (StringHelper.isEmpty(s1))
        {
            s = mapnode.getText("Type", "");
        }
        map = (new Builder()).setStreet(mapnode.getText("Street", "")).setUnitType(mapnode.getText("UnitType", "")).setUnitNumber(mapnode.getText("UnitNumber", "")).setLine2(mapnode.getText("AddressLine2", "")).setLine3(mapnode.getText("AddressLine3", "")).setLine4(mapnode.getText("AddressLine4", "")).setCity(mapnode.getText("City", "")).setRegion(mapnode.getText("Region", "")).setPostalCode(mapnode.getText("PostalCode", "")).setBuildingId(mapnode.getText("BuildingID", "")).setCampusId(mapnode.getText("CampusID", "")).setAddressType(s).setName(mapnode.getText("Name", "")).setOrganizationName(map).setIsDefault(mapnode.getBool("IsDefault", Boolean.FALSE).booleanValue());
        if (s2.length() > 0)
        {
            if (s2.contains(";"))
            {
                String as[] = s2.split(";");
                if (as.length > 0 && as[0].length() > 0)
                {
                    map.setDeliveryInstructions(as[0]);
                } else
                {
                    map.setDeliveryInstructions("");
                }
            } else
            {
                map.setDeliveryInstructions(s2);
            }
        } else
        {
            map.setDeliveryInstructions("");
        }
        return map.build();
    }

    public boolean equals(Object obj)
    {
        return b.a(this, obj);
    }

    public String getAddressType()
    {
        if (addressType.length() == 0)
        {
            return "house";
        } else
        {
            return addressType;
        }
    }

    public String getBuildingId()
    {
        return buildingId;
    }

    public String getCampusId()
    {
        return campusId;
    }

    public String getCity()
    {
        return city;
    }

    public String getCityRegionLine()
    {
        return Util.glue(Util.glue(city, ", ", region), " ", postalCode);
    }

    public String getDeliveryInstructions()
    {
        return deliveryInstructions;
    }

    public String getDescription()
    {
        return Util.seq(ar.a(getStreetLine(), getLine2(), getLine3(), getLine4(), getCityRegionLine())).select(new _cls1()).join("\n");
    }

    public String getLine2()
    {
        return line2;
    }

    public String getLine3()
    {
        return line3;
    }

    public String getLine4()
    {
        return line4;
    }

    public String getName()
    {
        return name;
    }

    public String getOrganizationName()
    {
        return organizationName;
    }

    public String getPostalCode()
    {
        return postalCode;
    }

    public String getRegion()
    {
        return region;
    }

    public String getStreet()
    {
        return street;
    }

    public String getStreetLine()
    {
        return Util.glue(street, " ", Util.glue(unitType, " ", getUnitNumber()));
    }

    public String getUnitNumber()
    {
        if (unitNumber.equals(""))
        {
            return line2;
        } else
        {
            return unitNumber;
        }
    }

    public String getUnitType()
    {
        return unitType;
    }

    public int hashCode()
    {
        return c.a(this);
    }

    public boolean isDefault()
    {
        return isDefault;
    }

    public JSONObject toJson()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("Name", name);
        jsonobject.put("AddressType", addressType);
        jsonobject.put("Street", street);
        jsonobject.put("OrganizationName", organizationName);
        jsonobject.put("AddressLine2", line2);
        jsonobject.put("AddressLine3", line3);
        jsonobject.put("AddressLine4", line4);
        jsonobject.put("City", city);
        jsonobject.put("Region", region);
        jsonobject.put("PostalCode", postalCode);
        jsonobject.put("BuildingID", buildingId);
        jsonobject.put("CampusID", campusId);
        jsonobject.put("UnitNumber", getUnitNumber());
        jsonobject.put("DeliveryInstructions", deliveryInstructions);
        jsonobject.put("IsDefault", isDefault);
        return jsonobject;
    }

    public Map toMap()
    {
        ToMapBuilder tomapbuilder = (new ToMapBuilder()).put("Street", street).put("UnitType", unitType).put("UnitNumber", getUnitNumber()).put("AddressType", addressType).put("AddressLine2", line2).put("AddressLine3", line3).put("AddressLine4", line4).put("City", city).put("Region", region).put("PostalCode", postalCode).put("BuildingID", buildingId).put("CampusID", campusId).put("OrganizationName", organizationName);
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (deliveryInstructions.length() > 0)
        {
            s = deliveryInstructions;
        } else
        {
            s = " ";
        }
        return tomapbuilder.put("DeliveryInstructions", stringbuilder.append(s).append(";").append(organizationName).toString()).put("IsDefault", Boolean.valueOf(isDefault)).build();
    }

    public String toString()
    {
        return f.a(this);
    }

    public void updateDeliveryInstructions(String s)
    {
        deliveryInstructions = s;
    }


    private class Builder
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

        public Builder setAddressType(String s)
        {
            addressType = s;
            return this;
        }

        public Builder setBuildingId(String s)
        {
            buildingId = s;
            return this;
        }

        public Builder setCampusId(String s)
        {
            campusId = s;
            return this;
        }

        public Builder setCity(String s)
        {
            city = s;
            return this;
        }

        public Builder setDeliveryInstructions(String s)
        {
            deliveryInstructions = s;
            return this;
        }

        public Builder setIsDefault(boolean flag)
        {
            isDefault = flag;
            return this;
        }

        public Builder setLine2(String s)
        {
            line2 = s;
            return this;
        }

        public Builder setLine3(String s)
        {
            line3 = s;
            return this;
        }

        public Builder setLine4(String s)
        {
            line4 = s;
            return this;
        }

        public Builder setName(String s)
        {
            name = s;
            return this;
        }

        public Builder setOrganizationName(String s)
        {
            organizationName = s;
            return this;
        }

        public Builder setPostalCode(String s)
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

        public Builder setRegion(String s)
        {
            region = s;
            return this;
        }

        public Builder setStreet(String s)
        {
            street = s;
            return this;
        }

        public Builder setUnitNumber(String s)
        {
            unitNumber = s;
            return this;
        }

        public Builder setUnitType(String s)
        {
            unitType = s;
            return this;
        }

        public Builder()
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


    private class _cls1
        implements ae
    {

        final Address this$0;

        public volatile boolean apply(Object obj)
        {
            return apply((String)obj);
        }

        public boolean apply(String s)
        {
            return StringHelper.isNotEmpty(s);
        }

        _cls1()
        {
            this$0 = Address.this;
            super();
        }
    }

}
