// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.order.Address;
import com.google.b.w;
import com.google.b.z;
import org.a.a.a.a.f;
import org.a.a.a.a.g;
import org.json.JSONObject;

public class LabsAddress
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
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
    private String streetNumber;
    private String unitNumber;
    private String unitType;

    public LabsAddress()
    {
        city = "";
        line2 = "";
        line3 = "";
        line4 = "";
        postalCode = "";
        region = "";
        street = "";
        streetNumber = "";
        unitNumber = "";
        unitType = "";
        buildingId = "";
        addressType = "";
        name = "";
        organizationName = "";
        deliveryInstructions = "";
        campusId = "";
        isDefault = false;
    }

    private LabsAddress(Parcel parcel)
    {
        city = "";
        line2 = "";
        line3 = "";
        line4 = "";
        postalCode = "";
        region = "";
        street = "";
        streetNumber = "";
        unitNumber = "";
        unitType = "";
        buildingId = "";
        addressType = "";
        name = "";
        organizationName = "";
        deliveryInstructions = "";
        campusId = "";
        isDefault = false;
        city = parcel.readString();
        line2 = parcel.readString();
        line3 = parcel.readString();
        line4 = parcel.readString();
        postalCode = parcel.readString();
        region = parcel.readString();
        street = parcel.readString();
        streetNumber = parcel.readString();
        unitNumber = parcel.readString();
        unitType = parcel.readString();
        buildingId = parcel.readString();
        campusId = parcel.readString();
        addressType = parcel.readString();
        name = parcel.readString();
        organizationName = parcel.readString();
        deliveryInstructions = parcel.readString();
    }

    LabsAddress(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    public LabsAddress(Address address)
    {
        city = "";
        line2 = "";
        line3 = "";
        line4 = "";
        postalCode = "";
        region = "";
        street = "";
        streetNumber = "";
        unitNumber = "";
        unitType = "";
        buildingId = "";
        addressType = "";
        name = "";
        organizationName = "";
        deliveryInstructions = "";
        campusId = "";
        isDefault = false;
        setName(address.getName());
        setBuildingId(address.getBuildingId());
        setCity(address.getCity());
        setLine2(address.getLine2());
        setLine3(address.getLine3());
        setLine4(address.getLine4());
        setPostalCode(address.getPostalCode());
        setRegion(address.getRegion());
        setStreet(address.getStreet());
        setDeliveryInstructions(address.getDeliveryInstructions());
        setAddressType(address.getAddressType());
        setCampusId(address.getCampusId());
        setUnitNumber(address.getUnitNumber());
        setOrganizationName(address.getOrganizationName());
        setIsDefault(address.isDefault());
    }

    public LabsAddress(LabsAddress labsaddress)
    {
        city = "";
        line2 = "";
        line3 = "";
        line4 = "";
        postalCode = "";
        region = "";
        street = "";
        streetNumber = "";
        unitNumber = "";
        unitType = "";
        buildingId = "";
        addressType = "";
        name = "";
        organizationName = "";
        deliveryInstructions = "";
        campusId = "";
        isDefault = false;
        name = labsaddress.name;
        buildingId = labsaddress.buildingId;
        line2 = labsaddress.line2;
        line3 = labsaddress.line3;
        line4 = labsaddress.line4;
        postalCode = labsaddress.postalCode;
        city = labsaddress.city;
        region = labsaddress.region;
        street = labsaddress.street;
        streetNumber = labsaddress.streetNumber;
        unitNumber = labsaddress.unitNumber;
        unitType = labsaddress.unitType;
        buildingId = labsaddress.buildingId;
        addressType = labsaddress.addressType;
        name = labsaddress.name;
        organizationName = labsaddress.organizationName;
        deliveryInstructions = labsaddress.deliveryInstructions;
        isDefault = labsaddress.isDefault;
        campusId = labsaddress.campusId;
    }

    public LabsAddress(z z1)
    {
        city = "";
        line2 = "";
        line3 = "";
        line4 = "";
        postalCode = "";
        region = "";
        street = "";
        streetNumber = "";
        unitNumber = "";
        unitType = "";
        buildingId = "";
        addressType = "";
        name = "";
        organizationName = "";
        deliveryInstructions = "";
        campusId = "";
        isDefault = false;
        String s;
        boolean flag;
        if (z1.a("DeliveryInstructions"))
        {
            s = z1.b("DeliveryInstructions").c();
        } else
        {
            s = "";
        }
        deliveryInstructions = s;
        if (z1.a("OrganizationName"))
        {
            s = z1.b("OrganizationName").c();
        } else
        {
            s = "";
        }
        organizationName = s;
        if (organizationName.equals(""))
        {
            if (z1.a("LocationName"))
            {
                s = z1.b("LocationName").c();
            } else
            {
                s = "";
            }
            organizationName = s;
        }
        if (z1.a("Street"))
        {
            s = z1.b("Street").c();
        } else
        {
            s = "";
        }
        street = s;
        if (z1.a("StreetNumber"))
        {
            s = z1.b("StreetNumber").c();
        } else
        {
            s = "";
        }
        streetNumber = s;
        if (z1.a("UnitType"))
        {
            s = z1.b("UnitType").c();
        } else
        {
            s = "";
        }
        unitType = s;
        if (z1.a("UnitNumber"))
        {
            s = z1.b("UnitNumber").c();
        } else
        {
            s = "";
        }
        unitNumber = s;
        if (z1.a("AddressLine2"))
        {
            s = z1.b("AddressLine2").c();
        } else
        {
            s = "";
        }
        line2 = s;
        if (z1.a("AddressLine3"))
        {
            s = z1.b("AddressLine3").c();
        } else
        {
            s = "";
        }
        line3 = s;
        if (z1.a("AddressLine4"))
        {
            s = z1.b("AddressLine4").c();
        } else
        {
            s = "";
        }
        line4 = s;
        if (z1.a("City"))
        {
            s = z1.b("City").c();
        } else
        {
            s = "";
        }
        city = s;
        if (z1.a("Region"))
        {
            s = z1.b("Region").c();
        } else
        {
            s = "";
        }
        region = s;
        if (z1.a("PostalCode"))
        {
            s = z1.b("PostalCode").c();
        } else
        {
            s = "";
        }
        postalCode = s;
        if (z1.a("BuildingID"))
        {
            s = z1.b("BuildingID").c();
        } else
        {
            s = "";
        }
        buildingId = s;
        if (z1.a("CampusID"))
        {
            s = z1.b("CampusID").c();
        } else
        {
            s = "";
        }
        campusId = s;
        if (z1.a("AddressType"))
        {
            s = z1.b("AddressType").c();
        } else
        if (z1.a("Type"))
        {
            s = z1.b("Type").c();
        } else
        {
            s = "";
        }
        addressType = s;
        if (z1.a("Name"))
        {
            s = z1.b("Name").c();
        } else
        {
            s = "";
        }
        name = s;
        if (z1.a("IsDefault"))
        {
            flag = z1.b("IsDefault").g();
        } else
        {
            flag = false;
        }
        isDefault = flag;
        if (deliveryInstructions.length() > 0)
        {
            if (deliveryInstructions.contains(";"))
            {
                z1 = deliveryInstructions.split(";");
                if (z1[0].length() > 0)
                {
                    setDeliveryInstructions(z1[0]);
                    return;
                } else
                {
                    setDeliveryInstructions("");
                    return;
                }
            } else
            {
                setDeliveryInstructions(deliveryInstructions);
                return;
            }
        } else
        {
            setDeliveryInstructions("");
            return;
        }
    }

    public static LabsAddress fromAddressDescription(String s)
    {
        String as[];
        String as1[];
        String as2[];
        as = s.split("\\n");
        as1 = as[1].split(",");
        as2 = as1[1].trim().split(" ");
        Object obj;
        String s1;
        String s2;
        String s3;
        LabsAddress labsaddress;
        if (as.length != 0)
        {
            obj = as[0];
        } else
        {
            obj = "";
        }
        if (as1.length != 0)
        {
            s1 = as1[0];
        } else
        {
            s1 = "";
        }
        if (as2.length != 0)
        {
            s2 = as2[0];
        } else
        {
            s2 = "";
        }
        s3 = "";
        if (as2.length > 1)
        {
            s3 = as2[1];
        }
        try
        {
            labsaddress = new LabsAddress();
            labsaddress.setCity(s1);
            labsaddress.setStreet(((String) (obj)));
            labsaddress.setRegion(s2);
            labsaddress.setPostalCode(s3);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            s = new RuntimeException((new StringBuilder()).append(s).append(", Error parsing address from String").toString());
            s.setStackTrace(((Exception) (obj)).getStackTrace());
            throw s;
        }
        return labsaddress;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || !(obj instanceof LabsAddress))
            {
                return false;
            }
            obj = (LabsAddress)obj;
            if (addressType == null ? ((LabsAddress) (obj)).addressType != null : !addressType.equals(((LabsAddress) (obj)).addressType))
            {
                return false;
            }
            if (buildingId == null ? ((LabsAddress) (obj)).buildingId != null : !buildingId.equals(((LabsAddress) (obj)).buildingId))
            {
                return false;
            }
            if (campusId == null ? ((LabsAddress) (obj)).campusId != null : !campusId.equals(((LabsAddress) (obj)).campusId))
            {
                return false;
            }
            if (city == null ? ((LabsAddress) (obj)).city != null : !city.equals(((LabsAddress) (obj)).city))
            {
                return false;
            }
            if (deliveryInstructions == null ? ((LabsAddress) (obj)).deliveryInstructions != null : !deliveryInstructions.equals(((LabsAddress) (obj)).deliveryInstructions))
            {
                return false;
            }
            if (line2 == null ? ((LabsAddress) (obj)).line2 != null : !line2.equals(((LabsAddress) (obj)).line2))
            {
                return false;
            }
            if (line3 == null ? ((LabsAddress) (obj)).line3 != null : !line3.equals(((LabsAddress) (obj)).line3))
            {
                return false;
            }
            if (line4 == null ? ((LabsAddress) (obj)).line4 != null : !line4.equals(((LabsAddress) (obj)).line4))
            {
                return false;
            }
            if (name == null ? ((LabsAddress) (obj)).name != null : !name.equals(((LabsAddress) (obj)).name))
            {
                return false;
            }
            if (organizationName == null ? ((LabsAddress) (obj)).organizationName != null : !organizationName.equals(((LabsAddress) (obj)).organizationName))
            {
                return false;
            }
            if (postalCode == null ? ((LabsAddress) (obj)).postalCode != null : !postalCode.equals(((LabsAddress) (obj)).postalCode))
            {
                return false;
            }
            if (region == null ? ((LabsAddress) (obj)).region != null : !region.equals(((LabsAddress) (obj)).region))
            {
                return false;
            }
            if (street == null ? ((LabsAddress) (obj)).street != null : !street.equals(((LabsAddress) (obj)).street))
            {
                return false;
            }
            if (streetNumber == null ? ((LabsAddress) (obj)).streetNumber != null : !streetNumber.equals(((LabsAddress) (obj)).streetNumber))
            {
                return false;
            }
            if (unitNumber == null ? ((LabsAddress) (obj)).unitNumber != null : !unitNumber.equals(((LabsAddress) (obj)).unitNumber))
            {
                return false;
            }
            if (unitType == null ? ((LabsAddress) (obj)).unitType != null : !unitType.equals(((LabsAddress) (obj)).unitType))
            {
                return false;
            }
            if (isDefault != isDefault)
            {
                return false;
            }
        }
        return true;
    }

    public String getAddressType()
    {
        if (addressType.equals(""))
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
        if (city.equals("") && region.equals(""))
        {
            return postalCode;
        } else
        {
            return String.format("%s, %s %s", new Object[] {
                city, region, postalCode
            }).trim();
        }
    }

    public String getDeliveryInstructions()
    {
        return deliveryInstructions;
    }

    public String getDescription()
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s = getStreetLine();
        String s1 = getCityRegionLine();
        if (StringHelper.isNotEmpty(s))
        {
            stringbuilder.append(s);
        }
        if (StringHelper.isNotEmpty(getLine2()))
        {
            if (!stringbuilder.toString().isEmpty())
            {
                stringbuilder.append("\n");
            }
            stringbuilder.append(getLine2());
        }
        if (StringHelper.isNotEmpty(getLine3()))
        {
            if (!stringbuilder.toString().isEmpty())
            {
                stringbuilder.append("\n");
            }
            stringbuilder.append(getLine3());
        }
        if (StringHelper.isNotEmpty(getLine4()))
        {
            if (!stringbuilder.toString().isEmpty())
            {
                stringbuilder.append("\n");
            }
            stringbuilder.append(getLine4());
        }
        if (StringHelper.isNotEmpty(s1))
        {
            if (!stringbuilder.toString().isEmpty())
            {
                stringbuilder.append("\n");
            }
            stringbuilder.append(s1);
        }
        return stringbuilder.toString();
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
        return String.format("%s %s %s", new Object[] {
            street, unitType, getUnitNumber()
        }).trim();
    }

    public String getStreetNumber()
    {
        return streetNumber;
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
        int l3 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        if (city != null)
        {
            i = city.hashCode();
        } else
        {
            i = 0;
        }
        if (line2 != null)
        {
            j = line2.hashCode();
        } else
        {
            j = 0;
        }
        if (line3 != null)
        {
            k = line3.hashCode();
        } else
        {
            k = 0;
        }
        if (line4 != null)
        {
            l = line4.hashCode();
        } else
        {
            l = 0;
        }
        if (postalCode != null)
        {
            i1 = postalCode.hashCode();
        } else
        {
            i1 = 0;
        }
        if (region != null)
        {
            j1 = region.hashCode();
        } else
        {
            j1 = 0;
        }
        if (street != null)
        {
            k1 = street.hashCode();
        } else
        {
            k1 = 0;
        }
        if (streetNumber != null)
        {
            l1 = streetNumber.hashCode();
        } else
        {
            l1 = 0;
        }
        if (unitNumber != null)
        {
            i2 = unitNumber.hashCode();
        } else
        {
            i2 = 0;
        }
        if (unitType != null)
        {
            j2 = unitType.hashCode();
        } else
        {
            j2 = 0;
        }
        if (buildingId != null)
        {
            k2 = buildingId.hashCode();
        } else
        {
            k2 = 0;
        }
        if (campusId != null)
        {
            l2 = campusId.hashCode();
        } else
        {
            l2 = 0;
        }
        if (addressType != null)
        {
            i3 = addressType.hashCode();
        } else
        {
            i3 = 0;
        }
        if (name != null)
        {
            j3 = name.hashCode();
        } else
        {
            j3 = 0;
        }
        if (organizationName != null)
        {
            k3 = organizationName.hashCode();
        } else
        {
            k3 = 0;
        }
        if (deliveryInstructions != null)
        {
            l3 = deliveryInstructions.hashCode();
        }
        return (k3 + (j3 + (i3 + (l2 + (k2 + (j2 + (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + (j + i * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + l3;
    }

    public boolean isDefault()
    {
        return isDefault;
    }

    public void setAddressType(String s)
    {
        addressType = s;
    }

    public void setBuildingId(String s)
    {
        buildingId = s;
    }

    public void setCampusId(String s)
    {
        campusId = s;
    }

    public void setCity(String s)
    {
        city = s;
    }

    public void setDeliveryInstructions(String s)
    {
        deliveryInstructions = s;
    }

    public void setIsDefault(boolean flag)
    {
        isDefault = flag;
    }

    public void setLine2(String s)
    {
        line2 = s;
    }

    public void setLine3(String s)
    {
        line3 = s;
    }

    public void setLine4(String s)
    {
        line4 = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setOrganizationName(String s)
    {
        organizationName = s;
    }

    public void setPostalCode(String s)
    {
        postalCode = s;
    }

    public void setRegion(String s)
    {
        region = s;
    }

    public void setStreet(String s)
    {
        street = s;
    }

    public void setStreetNumber(String s)
    {
        streetNumber = s;
    }

    public void setUnitNumber(String s)
    {
        unitNumber = s;
    }

    public void setUnitType(String s)
    {
        unitType = s;
    }

    public JSONObject toJson()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("Name", name);
        jsonobject.put("AddressType", addressType);
        jsonobject.put("Type", addressType);
        jsonobject.put("Street", street);
        jsonobject.put("StreetNumber", streetNumber);
        jsonobject.put("OrganizationName", organizationName);
        jsonobject.put("LocationName", organizationName);
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

    public String toString()
    {
        return f.b(this, g.d);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(city);
        parcel.writeString(line2);
        parcel.writeString(line3);
        parcel.writeString(line4);
        parcel.writeString(postalCode);
        parcel.writeString(region);
        parcel.writeString(street);
        parcel.writeString(streetNumber);
        parcel.writeString(unitNumber);
        parcel.writeString(unitType);
        parcel.writeString(buildingId);
        parcel.writeString(campusId);
        parcel.writeString(addressType);
        parcel.writeString(name);
        parcel.writeString(organizationName);
        parcel.writeString(deliveryInstructions);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final LabsAddress createFromParcel(Parcel parcel)
        {
            return new LabsAddress(parcel, null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final LabsAddress[] newArray(int i)
        {
            return new LabsAddress[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
