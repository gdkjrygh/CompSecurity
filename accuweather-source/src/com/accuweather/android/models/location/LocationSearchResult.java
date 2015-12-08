// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.location;

import android.text.TextUtils;
import com.accuweather.android.utilities.Logger;
import java.util.List;

// Referenced classes of package com.accuweather.android.models.location:
//            Region, TimeZone, GeoPosition, Details, 
//            GeocodedAddress, LocationModel, DMA

public class LocationSearchResult
{

    private List AdditionalAreas;
    private Region AdministrativeArea;
    private Region Country;
    private Details Details;
    private String EnglishDetails;
    private String EnglishName;
    private GeoPosition GeoPosition;
    private String Key;
    private String LocalizedDetails;
    private String LocalizedName;
    private String PrimaryPostalCode;
    private Region Region;
    private TimeZone TimeZone;
    private String Type;
    private GeocodedAddress geocodedAddress;

    public LocationSearchResult()
    {
        Key = "";
        LocalizedName = "";
        EnglishName = "";
        PrimaryPostalCode = "";
        Type = "";
        Region = new Region();
        Country = new Region();
        AdministrativeArea = new Region();
        TimeZone = new TimeZone();
        GeoPosition = new GeoPosition();
        LocalizedDetails = "";
        EnglishDetails = "";
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (LocationSearchResult)obj;
        if (AdditionalAreas == null)
        {
            if (((LocationSearchResult) (obj)).AdditionalAreas != null)
            {
                return false;
            }
        } else
        if (!AdditionalAreas.equals(((LocationSearchResult) (obj)).AdditionalAreas))
        {
            return false;
        }
        if (AdministrativeArea == null)
        {
            if (((LocationSearchResult) (obj)).AdministrativeArea != null)
            {
                return false;
            }
        } else
        if (!AdministrativeArea.equals(((LocationSearchResult) (obj)).AdministrativeArea))
        {
            return false;
        }
        if (Country == null)
        {
            if (((LocationSearchResult) (obj)).Country != null)
            {
                return false;
            }
        } else
        if (!Country.equals(((LocationSearchResult) (obj)).Country))
        {
            return false;
        }
        if (Details == null)
        {
            if (((LocationSearchResult) (obj)).Details != null)
            {
                return false;
            }
        } else
        if (!Details.equals(((LocationSearchResult) (obj)).Details))
        {
            return false;
        }
        if (EnglishDetails == null)
        {
            if (((LocationSearchResult) (obj)).EnglishDetails != null)
            {
                return false;
            }
        } else
        if (!EnglishDetails.equals(((LocationSearchResult) (obj)).EnglishDetails))
        {
            return false;
        }
        if (EnglishName == null)
        {
            if (((LocationSearchResult) (obj)).EnglishName != null)
            {
                return false;
            }
        } else
        if (!EnglishName.equals(((LocationSearchResult) (obj)).EnglishName))
        {
            return false;
        }
        if (GeoPosition == null)
        {
            if (((LocationSearchResult) (obj)).GeoPosition != null)
            {
                return false;
            }
        } else
        if (!GeoPosition.equals(((LocationSearchResult) (obj)).GeoPosition))
        {
            return false;
        }
        if (Key == null)
        {
            if (((LocationSearchResult) (obj)).Key != null)
            {
                return false;
            }
        } else
        if (!Key.equals(((LocationSearchResult) (obj)).Key))
        {
            return false;
        }
        if (LocalizedDetails == null)
        {
            if (((LocationSearchResult) (obj)).LocalizedDetails != null)
            {
                return false;
            }
        } else
        if (!LocalizedDetails.equals(((LocationSearchResult) (obj)).LocalizedDetails))
        {
            return false;
        }
        if (LocalizedName == null)
        {
            if (((LocationSearchResult) (obj)).LocalizedName != null)
            {
                return false;
            }
        } else
        if (!LocalizedName.equals(((LocationSearchResult) (obj)).LocalizedName))
        {
            return false;
        }
        if (PrimaryPostalCode == null)
        {
            if (((LocationSearchResult) (obj)).PrimaryPostalCode != null)
            {
                return false;
            }
        } else
        if (!PrimaryPostalCode.equals(((LocationSearchResult) (obj)).PrimaryPostalCode))
        {
            return false;
        }
        if (Region == null)
        {
            if (((LocationSearchResult) (obj)).Region != null)
            {
                return false;
            }
        } else
        if (!Region.equals(((LocationSearchResult) (obj)).Region))
        {
            return false;
        }
        if (TimeZone == null)
        {
            if (((LocationSearchResult) (obj)).TimeZone != null)
            {
                return false;
            }
        } else
        if (!TimeZone.equals(((LocationSearchResult) (obj)).TimeZone))
        {
            return false;
        }
        if (Type == null)
        {
            if (((LocationSearchResult) (obj)).Type != null)
            {
                return false;
            }
        } else
        if (!Type.equals(((LocationSearchResult) (obj)).Type))
        {
            return false;
        }
        if (geocodedAddress != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((LocationSearchResult) (obj)).geocodedAddress == null) goto _L1; else goto _L3
_L3:
        return false;
        if (geocodedAddress.equals(((LocationSearchResult) (obj)).geocodedAddress)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public List getAdditionalAreas()
    {
        return AdditionalAreas;
    }

    public Region getAdministrativeArea()
    {
        return AdministrativeArea;
    }

    public Region getCountry()
    {
        return Country;
    }

    public Details getDetails()
    {
        return Details;
    }

    public String getEnglishDetails()
    {
        return EnglishDetails;
    }

    public String getEnglishName()
    {
        return EnglishName;
    }

    public String getFullNameWithMarkup()
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s2 = getAdministrativeArea().getLocalizedName();
        String s1 = getLocalizedName();
        String s3 = getCountry().getLocalizedName();
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = getEnglishName();
        }
        stringbuilder.append("<font>").append(s).append("</font><br/><font>").append(s2).append(", ").append(s3).append("</font>");
        return stringbuilder.toString();
    }

    public GeoPosition getGeoPosition()
    {
        return GeoPosition;
    }

    public GeocodedAddress getGeocodedAddress()
    {
        return geocodedAddress;
    }

    public String getKey()
    {
        return Key;
    }

    public String getLocalizedDetails()
    {
        return LocalizedDetails;
    }

    public String getLocalizedName()
    {
        if (TextUtils.isEmpty(LocalizedName))
        {
            return EnglishName;
        } else
        {
            return LocalizedName;
        }
    }

    public String getPrettyName()
    {
        String s1 = getLocalizedName();
        String s4 = getCountry().getLocalizedName();
        String s6 = getCountry().getID();
        String s5 = getAdministrativeArea().getID();
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = getEnglishName();
        }
        if (s6.equalsIgnoreCase("us"))
        {
            if (getType().equalsIgnoreCase("postalcode"))
            {
                String s2 = getPrimaryPostalCode().replaceAll("\\D+", "");
                s = (new StringBuilder()).append(s).append(", ").append(s5).append(" (").append(s2).append(")").toString();
            } else
            {
                s = (new StringBuilder()).append(s).append(", ").append(s5).toString();
            }
        } else
        if (getType().equalsIgnoreCase("postalcode"))
        {
            String s3 = getPrimaryPostalCode().replaceAll("\\D+", "");
            s = (new StringBuilder()).append(s).append(", ").append(s4).append(" (").append(s3).append(")").toString();
        } else
        {
            s = (new StringBuilder()).append(s).append(", ").append(s4).toString();
        }
        Logger.i(this, (new StringBuilder()).append("getPrettyName is ").append(s).toString());
        return s;
    }

    public String getPrimaryPostalCode()
    {
        return PrimaryPostalCode;
    }

    public Region getRegion()
    {
        return Region;
    }

    public TimeZone getTimeZone()
    {
        return TimeZone;
    }

    public String getType()
    {
        return Type;
    }

    public int hashCode()
    {
        int k3 = 0;
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
        if (AdditionalAreas == null)
        {
            i = 0;
        } else
        {
            i = AdditionalAreas.hashCode();
        }
        if (AdministrativeArea == null)
        {
            j = 0;
        } else
        {
            j = AdministrativeArea.hashCode();
        }
        if (Country == null)
        {
            k = 0;
        } else
        {
            k = Country.hashCode();
        }
        if (Details == null)
        {
            l = 0;
        } else
        {
            l = Details.hashCode();
        }
        if (EnglishDetails == null)
        {
            i1 = 0;
        } else
        {
            i1 = EnglishDetails.hashCode();
        }
        if (EnglishName == null)
        {
            j1 = 0;
        } else
        {
            j1 = EnglishName.hashCode();
        }
        if (GeoPosition == null)
        {
            k1 = 0;
        } else
        {
            k1 = GeoPosition.hashCode();
        }
        if (Key == null)
        {
            l1 = 0;
        } else
        {
            l1 = Key.hashCode();
        }
        if (LocalizedDetails == null)
        {
            i2 = 0;
        } else
        {
            i2 = LocalizedDetails.hashCode();
        }
        if (LocalizedName == null)
        {
            j2 = 0;
        } else
        {
            j2 = LocalizedName.hashCode();
        }
        if (PrimaryPostalCode == null)
        {
            k2 = 0;
        } else
        {
            k2 = PrimaryPostalCode.hashCode();
        }
        if (Region == null)
        {
            l2 = 0;
        } else
        {
            l2 = Region.hashCode();
        }
        if (TimeZone == null)
        {
            i3 = 0;
        } else
        {
            i3 = TimeZone.hashCode();
        }
        if (Type == null)
        {
            j3 = 0;
        } else
        {
            j3 = Type.hashCode();
        }
        if (geocodedAddress != null)
        {
            k3 = geocodedAddress.hashCode();
        }
        return ((((((((((((((i + 31) * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31 + j3) * 31 + k3;
    }

    public void setAdditionalAreas(List list)
    {
        AdditionalAreas = list;
    }

    public void setAdministrativeArea(Region region)
    {
        AdministrativeArea = region;
    }

    public void setCountry(Region region)
    {
        Country = region;
    }

    public void setDetails(Details details)
    {
        Details = details;
    }

    public void setEnglishDetails(String s)
    {
        EnglishDetails = s;
    }

    public void setEnglishName(String s)
    {
        EnglishName = s;
    }

    public void setGeoPosition(GeoPosition geoposition)
    {
        GeoPosition = geoposition;
    }

    public void setGeocodedAddress(GeocodedAddress geocodedaddress)
    {
        geocodedAddress = geocodedaddress;
    }

    public void setKey(String s)
    {
        Key = s;
    }

    public void setLocalizedDetails(String s)
    {
        LocalizedDetails = s;
    }

    public void setLocalizedName(String s)
    {
        LocalizedName = s;
    }

    public void setPrimaryPostalCode(String s)
    {
        PrimaryPostalCode = s;
    }

    public void setRegion(Region region)
    {
        Region = region;
    }

    public void setTimeZone(TimeZone timezone)
    {
        TimeZone = timezone;
    }

    public void setType(String s)
    {
        Type = s;
    }

    public LocationModel toLocationModel()
    {
        LocationModel locationmodel = new LocationModel();
        locationmodel.setLocKey(getKey());
        locationmodel.setLocationName(getLocalizedName());
        locationmodel.setAddress(getGeocodedAddress());
        locationmodel.setType(getType());
        if (getCountry() != null)
        {
            locationmodel.setCountryId(getCountry().getID());
        }
        locationmodel.setPostalCode(getPrimaryPostalCode());
        locationmodel.setPrettyName(getPrettyName());
        if (getAdministrativeArea() != null && getAdministrativeArea().getID() != null)
        {
            locationmodel.setAdminAreaId(getAdministrativeArea().getID());
        }
        if (getPrimaryPostalCode() != null)
        {
            locationmodel.setPostalCode(getPrimaryPostalCode());
        }
        if (getDetails() != null)
        {
            locationmodel.setCanonicalLocationKey(getDetails().getCanonicalLocationKey());
            locationmodel.setCanonicalPostalCode(getDetails().getCanonicalPostalCode());
            if (getDetails().getDMA() != null)
            {
                locationmodel.setDmaId(getDetails().getDMA().getID());
            }
        }
        if (getDetails() != null && getDetails().getDMA() != null)
        {
            locationmodel.setDmaId(getDetails().getDMA().getID());
        }
        if (getGeoPosition() != null && getGeoPosition().getLatitude() != null && getGeoPosition().getLongitude() != null)
        {
            locationmodel.setCoordinates(getGeoPosition().getLatitude(), getGeoPosition().getLongitude());
        }
        if (getTimeZone() != null)
        {
            locationmodel.setTimezoneCode(getTimeZone().getCode());
        }
        if (getDetails() != null)
        {
            locationmodel.setVideoCode(getDetails().getVideoCode());
        }
        locationmodel.setModelVersion(4);
        return locationmodel;
    }

    public String toString()
    {
        return (new StringBuilder()).append("LocationSearchResult [Key=").append(Key).append(", LocalizedName=").append(LocalizedName).append(", EnglishName=").append(EnglishName).append(", PrimaryPostalCode=").append(PrimaryPostalCode).append(", Type=").append(Type).append(", Region=").append(Region).append(", Country=").append(Country).append(", AdministrativeArea=").append(AdministrativeArea).append(", TimeZone=").append(TimeZone).append(", GeoPosition=").append(GeoPosition).append(", LocalizedDetails=").append(LocalizedDetails).append(", EnglishDetails=").append(EnglishDetails).append(", AdditionalAreas=").append(AdditionalAreas).append(", Details=").append(Details).append(", geocodedAddress=").append(geocodedAddress).append("]").toString();
    }
}
