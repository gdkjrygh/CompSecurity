// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.model.commerce;

import android.os.Parcel;
import android.os.Parcelable;

public class Address
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private final String country;
    private final String extraStreet;
    private final String locality;
    private final String postalCode;
    private final String region;
    private final String street;
    private final String type;

    public Address()
    {
        locality = null;
        country = null;
        region = null;
        street = null;
        postalCode = null;
        extraStreet = null;
        type = null;
    }

    public Address(Parcel parcel)
    {
        locality = parcel.readString();
        country = parcel.readString();
        region = parcel.readString();
        street = parcel.readString();
        postalCode = parcel.readString();
        extraStreet = parcel.readString();
        type = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        obj = (Address)obj;
        if (locality == null ? ((Address) (obj)).locality != null : !locality.equals(((Address) (obj)).locality))
        {
            return false;
        }
        if (country == null ? ((Address) (obj)).country != null : !country.equals(((Address) (obj)).country))
        {
            return false;
        }
        if (region == null ? ((Address) (obj)).region != null : !region.equals(((Address) (obj)).region))
        {
            return false;
        }
        if (street == null ? ((Address) (obj)).street != null : !street.equals(((Address) (obj)).street))
        {
            return false;
        }
        if (postalCode == null ? ((Address) (obj)).postalCode != null : !postalCode.equals(((Address) (obj)).postalCode))
        {
            return false;
        }
        if (extraStreet == null ? ((Address) (obj)).extraStreet != null : !extraStreet.equals(((Address) (obj)).extraStreet))
        {
            return false;
        }
        if (type == null) goto _L4; else goto _L3
_L3:
        if (type.equals(((Address) (obj)).type)) goto _L1; else goto _L5
_L5:
        return false;
_L4:
        if (((Address) (obj)).type == null)
        {
            return true;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public String getCountry()
    {
        return country;
    }

    public String getExtraStreet()
    {
        return extraStreet;
    }

    public String getLocality()
    {
        return locality;
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

    public String getType()
    {
        return type;
    }

    public int hashCode()
    {
        int k1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        if (locality != null)
        {
            i = locality.hashCode();
        } else
        {
            i = 0;
        }
        if (country != null)
        {
            j = country.hashCode();
        } else
        {
            j = 0;
        }
        if (region != null)
        {
            k = region.hashCode();
        } else
        {
            k = 0;
        }
        if (street != null)
        {
            l = street.hashCode();
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
        if (extraStreet != null)
        {
            j1 = extraStreet.hashCode();
        } else
        {
            j1 = 0;
        }
        if (type != null)
        {
            k1 = type.hashCode();
        }
        return (j1 + (i1 + (l + (k + (j + i * 31) * 31) * 31) * 31) * 31) * 31 + k1;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(locality);
        parcel.writeString(country);
        parcel.writeString(region);
        parcel.writeString(street);
        parcel.writeString(postalCode);
        parcel.writeString(extraStreet);
        parcel.writeString(type);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final Address createFromParcel(Parcel parcel)
        {
            return new Address(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final Address[] newArray(int i)
        {
            return new Address[i];
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
