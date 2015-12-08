// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.location;

import android.location.Address;
import android.text.TextUtils;
import com.accuweather.android.models.location.gps.Point;
import com.accuweather.android.models.location.gps.Resource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GeocodedAddress
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String addressLine1;
    private List addressLines;
    private String adminArea;
    private String country;
    private String formattedAddress;
    private Double latitude;
    private String locality;
    private Double longitude;
    private int maxAddressLineIndex;
    private String postCode;
    private String subLocality;
    private String subThoroughfare;
    private String thoroughfare;

    public GeocodedAddress(Address address)
    {
        addressLines = new ArrayList();
        maxAddressLineIndex = address.getMaxAddressLineIndex();
        if (maxAddressLineIndex != -1)
        {
            for (int i = 0; i < maxAddressLineIndex; i++)
            {
                addressLines.add(address.getAddressLine(i));
            }

        }
        locality = address.getLocality();
        country = address.getCountryCode();
        adminArea = address.getAdminArea();
        latitude = Double.valueOf(address.getLatitude());
        longitude = Double.valueOf(address.getLongitude());
        postCode = address.getPostalCode();
        thoroughfare = address.getThoroughfare();
        subThoroughfare = address.getSubThoroughfare();
        subLocality = address.getSubLocality();
    }

    public GeocodedAddress(Resource resource)
    {
        addressLines = new ArrayList();
        if (resource.getAddress() != null)
        {
            locality = resource.getAddress().getLocality();
            country = resource.getAddress().getCountryRegion();
            formattedAddress = resource.getAddress().getFormattedAddress();
            addressLine1 = resource.getAddress().getAddressLine();
            adminArea = resource.getAddress().getAdminDistrict();
        }
        if (resource.getPoint() != null && resource.getPoint().getCoordinates() != null && resource.getPoint().getCoordinates().size() >= 2)
        {
            latitude = (Double)resource.getPoint().getCoordinates().get(0);
            longitude = (Double)resource.getPoint().getCoordinates().get(1);
        }
    }

    private String getAddressFull()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("");
        String s;
        if (!TextUtils.isEmpty(subThoroughfare))
        {
            s = subThoroughfare.trim();
        } else
        {
            s = "";
        }
        s = stringbuilder.append(s).toString();
        stringbuilder = (new StringBuilder()).append(s);
        if (!TextUtils.isEmpty(thoroughfare))
        {
            s = (new StringBuilder()).append(" ").append(thoroughfare.trim()).toString();
        } else
        {
            s = "";
        }
        s = stringbuilder.append(s).toString();
        stringbuilder = (new StringBuilder()).append(s);
        if (!TextUtils.isEmpty(subLocality))
        {
            s = (new StringBuilder()).append(" ").append(subLocality.trim()).toString();
        } else
        {
            s = "";
        }
        s = stringbuilder.append(s).toString();
        stringbuilder = (new StringBuilder()).append(s);
        if (!TextUtils.isEmpty(locality))
        {
            s = (new StringBuilder()).append(" ").append(locality.trim()).toString();
        } else
        {
            s = "";
        }
        s = stringbuilder.append(s).toString();
        stringbuilder = (new StringBuilder()).append(s);
        if (!TextUtils.isEmpty(adminArea))
        {
            s = (new StringBuilder()).append(", ").append(adminArea.trim()).toString();
        } else
        {
            s = "";
        }
        s = stringbuilder.append(s).toString();
        stringbuilder = (new StringBuilder()).append(s);
        if (!TextUtils.isEmpty(country))
        {
            s = (new StringBuilder()).append(", ").append(country.trim()).toString();
        } else
        {
            s = "";
        }
        s = stringbuilder.append(s).toString();
        if (s.startsWith(", "))
        {
            s.replaceFirst(", ", "");
        }
        s.trim();
        return s;
    }

    private String getFullPostalAddressForNativeAddress()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (postCode == null)
        {
            return getAddressFull();
        }
        if (maxAddressLineIndex != -1)
        {
            for (int i = 0; i < maxAddressLineIndex; i++)
            {
                stringbuilder.append((String)addressLines.get(i)).append(" ");
            }

        }
        if (stringbuilder.length() > 0)
        {
            return (new StringBuilder()).append(stringbuilder.toString().trim()).append(", ").append(country).toString();
        } else
        {
            return country;
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (GeocodedAddress)obj;
            if (addressLine1 == null)
            {
                if (((GeocodedAddress) (obj)).addressLine1 != null)
                {
                    return false;
                }
            } else
            if (!addressLine1.equals(((GeocodedAddress) (obj)).addressLine1))
            {
                return false;
            }
            if (addressLines == null)
            {
                if (((GeocodedAddress) (obj)).addressLines != null)
                {
                    return false;
                }
            } else
            if (!addressLines.equals(((GeocodedAddress) (obj)).addressLines))
            {
                return false;
            }
            if (adminArea == null)
            {
                if (((GeocodedAddress) (obj)).adminArea != null)
                {
                    return false;
                }
            } else
            if (!adminArea.equals(((GeocodedAddress) (obj)).adminArea))
            {
                return false;
            }
            if (country == null)
            {
                if (((GeocodedAddress) (obj)).country != null)
                {
                    return false;
                }
            } else
            if (!country.equals(((GeocodedAddress) (obj)).country))
            {
                return false;
            }
            if (formattedAddress == null)
            {
                if (((GeocodedAddress) (obj)).formattedAddress != null)
                {
                    return false;
                }
            } else
            if (!formattedAddress.equals(((GeocodedAddress) (obj)).formattedAddress))
            {
                return false;
            }
            if (latitude == null)
            {
                if (((GeocodedAddress) (obj)).latitude != null)
                {
                    return false;
                }
            } else
            if (!latitude.equals(((GeocodedAddress) (obj)).latitude))
            {
                return false;
            }
            if (locality == null)
            {
                if (((GeocodedAddress) (obj)).locality != null)
                {
                    return false;
                }
            } else
            if (!locality.equals(((GeocodedAddress) (obj)).locality))
            {
                return false;
            }
            if (longitude == null)
            {
                if (((GeocodedAddress) (obj)).longitude != null)
                {
                    return false;
                }
            } else
            if (!longitude.equals(((GeocodedAddress) (obj)).longitude))
            {
                return false;
            }
            if (maxAddressLineIndex != ((GeocodedAddress) (obj)).maxAddressLineIndex)
            {
                return false;
            }
        }
        return true;
    }

    public String getAddressForWearable()
    {
        String s = "";
        String s1 = s;
        if (addressLines != null)
        {
            s1 = s;
            if (addressLines.size() > 0)
            {
                int i = 0;
                do
                {
                    s1 = s;
                    if (i >= addressLines.size() - 1)
                    {
                        break;
                    }
                    s = (new StringBuilder()).append(s).append((String)addressLines.get(i)).append(" ").toString();
                    i++;
                } while (true);
            }
        }
        return s1.trim();
    }

    public String getAddressLine1()
    {
        return addressLine1;
    }

    public String getAdminArea()
    {
        return adminArea;
    }

    public String getCountry()
    {
        return country;
    }

    public String getFullPostalAddress()
    {
        if (addressLines != null && !addressLines.isEmpty())
        {
            return getFullPostalAddressForNativeAddress();
        } else
        {
            return formattedAddress;
        }
    }

    public Double getLatitude()
    {
        return latitude;
    }

    public String getLocality()
    {
        return locality;
    }

    public Double getLongitude()
    {
        return longitude;
    }

    public int hashCode()
    {
        int l1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        if (addressLine1 == null)
        {
            i = 0;
        } else
        {
            i = addressLine1.hashCode();
        }
        if (addressLines == null)
        {
            j = 0;
        } else
        {
            j = addressLines.hashCode();
        }
        if (adminArea == null)
        {
            k = 0;
        } else
        {
            k = adminArea.hashCode();
        }
        if (country == null)
        {
            l = 0;
        } else
        {
            l = country.hashCode();
        }
        if (formattedAddress == null)
        {
            i1 = 0;
        } else
        {
            i1 = formattedAddress.hashCode();
        }
        if (latitude == null)
        {
            j1 = 0;
        } else
        {
            j1 = latitude.hashCode();
        }
        if (locality == null)
        {
            k1 = 0;
        } else
        {
            k1 = locality.hashCode();
        }
        if (longitude != null)
        {
            l1 = longitude.hashCode();
        }
        return ((((((((i + 31) * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + maxAddressLineIndex;
    }

    public String toString()
    {
        return getFullPostalAddress();
    }
}
