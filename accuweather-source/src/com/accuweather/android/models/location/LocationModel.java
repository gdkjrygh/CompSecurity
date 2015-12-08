// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.location;

import java.io.Serializable;

// Referenced classes of package com.accuweather.android.models.location:
//            GeocodedAddress

public class LocationModel
    implements Serializable
{

    public static final int LATEST_MODEL_VERSION = 4;
    private static final long serialVersionUID = 0xff1e32bef95ff2d1L;
    private String adminAreaId;
    private String alias;
    private String canonicalLocationKey;
    private String canonicalPostalCode;
    private String countryId;
    private String dmaId;
    private GeocodedAddress geocodedAddress;
    private boolean isAliased;
    private boolean isHome;
    private Double lat;
    private String locKey;
    private Double lon;
    private int modelVersion;
    private String postalCode;
    private String prettyName;
    private String timezoneCode;
    private String type;
    private String videoCode;

    public LocationModel()
    {
        locKey = "";
        canonicalLocationKey = null;
        postalCode = "";
        canonicalPostalCode = null;
        prettyName = "";
        countryId = "";
        alias = "";
        type = "";
        isAliased = false;
        timezoneCode = "";
        videoCode = "";
        adminAreaId = "";
        isHome = false;
        modelVersion = 0;
    }

    public static String toSimpleName(String s)
    {
        return s.split(",")[0];
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof LocationModel))
        {
            obj = (LocationModel)obj;
            if (locKey != null && ((LocationModel) (obj)).getKey() != null && locKey.equals(((LocationModel) (obj)).getKey()))
            {
                return true;
            }
        }
        return false;
    }

    public GeocodedAddress getAddress()
    {
        return geocodedAddress;
    }

    public String getAdminAreaId()
    {
        return adminAreaId;
    }

    public String getAlias()
    {
        return alias;
    }

    public String getAliasedName()
    {
        if (isAliased)
        {
            return getAlias();
        } else
        {
            return getPrettyName();
        }
    }

    public String getCanonicalLocationKey()
    {
        return canonicalLocationKey;
    }

    public String getCanonicalPostalCode()
    {
        return canonicalPostalCode;
    }

    public String getCountryId()
    {
        return countryId;
    }

    public String getDmaId()
    {
        return dmaId;
    }

    public String getKey()
    {
        return locKey.replace("cityId:", "");
    }

    public Double getLatitude()
    {
        if (geocodedAddress != null)
        {
            Double double1 = geocodedAddress.getLatitude();
            if (double1 != null)
            {
                return double1;
            }
        }
        return lat;
    }

    public String getLocKey()
    {
        return locKey;
    }

    public Double getLongitude()
    {
        if (geocodedAddress != null)
        {
            Double double1 = geocodedAddress.getLongitude();
            if (double1 != null)
            {
                return double1;
            }
        }
        return lon;
    }

    public int getModelVersion()
    {
        return modelVersion;
    }

    public String getPostalCode()
    {
        return postalCode;
    }

    public String getPrettyName()
    {
        return prettyName;
    }

    public String getTimezoneCode()
    {
        return timezoneCode;
    }

    public String getType()
    {
        return type;
    }

    public String getVideoCode()
    {
        return videoCode;
    }

    public int hashCode()
    {
        char c1 = '\u04CF';
        int k3 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        char c;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int l3;
        if (adminAreaId == null)
        {
            i = 0;
        } else
        {
            i = adminAreaId.hashCode();
        }
        if (alias == null)
        {
            j = 0;
        } else
        {
            j = alias.hashCode();
        }
        if (canonicalLocationKey == null)
        {
            k = 0;
        } else
        {
            k = canonicalLocationKey.hashCode();
        }
        if (canonicalPostalCode == null)
        {
            l = 0;
        } else
        {
            l = canonicalPostalCode.hashCode();
        }
        if (countryId == null)
        {
            i1 = 0;
        } else
        {
            i1 = countryId.hashCode();
        }
        if (dmaId == null)
        {
            j1 = 0;
        } else
        {
            j1 = dmaId.hashCode();
        }
        if (geocodedAddress == null)
        {
            k1 = 0;
        } else
        {
            k1 = geocodedAddress.hashCode();
        }
        if (isAliased)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (!isHome)
        {
            c1 = '\u04D5';
        }
        if (lat == null)
        {
            l1 = 0;
        } else
        {
            l1 = lat.hashCode();
        }
        if (locKey == null)
        {
            i2 = 0;
        } else
        {
            i2 = locKey.hashCode();
        }
        if (lon == null)
        {
            j2 = 0;
        } else
        {
            j2 = lon.hashCode();
        }
        l3 = modelVersion;
        if (postalCode == null)
        {
            k2 = 0;
        } else
        {
            k2 = postalCode.hashCode();
        }
        if (prettyName == null)
        {
            l2 = 0;
        } else
        {
            l2 = prettyName.hashCode();
        }
        if (timezoneCode == null)
        {
            i3 = 0;
        } else
        {
            i3 = timezoneCode.hashCode();
        }
        if (type == null)
        {
            j3 = 0;
        } else
        {
            j3 = type.hashCode();
        }
        if (videoCode != null)
        {
            k3 = videoCode.hashCode();
        }
        return (((((((((((((((((i + 31) * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + c) * 31 + c1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + l3) * 31 + k2) * 31 + l2) * 31 + i3) * 31 + j3) * 31 + k3;
    }

    public boolean isAliased()
    {
        return isAliased;
    }

    public boolean isHome()
    {
        return isHome;
    }

    public boolean isLatestModelVersion()
    {
        return modelVersion == 4;
    }

    public void setAddress(GeocodedAddress geocodedaddress)
    {
        geocodedAddress = geocodedaddress;
    }

    public void setAdminAreaId(String s)
    {
        adminAreaId = s;
    }

    public void setAliasName(String s)
    {
        alias = s;
        isAliased = true;
    }

    public void setAliased(boolean flag)
    {
        isAliased = flag;
    }

    public void setCanonicalLocationKey(String s)
    {
        canonicalLocationKey = s;
    }

    public void setCanonicalPostalCode(String s)
    {
        canonicalPostalCode = s;
    }

    public void setCoordinates(Double double1, Double double2)
    {
        lat = double1;
        lon = double2;
    }

    public void setCountryId(String s)
    {
        countryId = s;
    }

    public void setDmaId(String s)
    {
        dmaId = s;
    }

    public void setHome(boolean flag)
    {
        isHome = flag;
    }

    public void setLocKey(String s)
    {
        locKey = s;
    }

    public void setLocation(String s, String s1)
    {
        locKey = s;
        prettyName = s1;
        alias = s1;
    }

    public void setLocationName(String s)
    {
        prettyName = s;
        alias = s;
    }

    public void setModelVersion(int i)
    {
        modelVersion = i;
    }

    public void setPostalCode(String s)
    {
        postalCode = s;
    }

    public void setPrettyName(String s)
    {
        prettyName = s;
    }

    public void setTimezoneCode(String s)
    {
        timezoneCode = s;
    }

    public void setType(String s)
    {
        type = s;
    }

    public void setVideoCode(String s)
    {
        videoCode = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("LocationModel [locKey=").append(locKey).append(", canonicalLocationKey=").append(canonicalLocationKey).append(", postalCode=").append(postalCode).append(", canonicalPostalCode=").append(canonicalPostalCode).append(", prettyName=").append(prettyName).append(", countryId=").append(countryId).append(", alias=").append(alias).append(", type=").append(type).append(", isAliased=").append(isAliased).append(", timezoneCode=").append(timezoneCode).append(", videoCode=").append(videoCode).append(", adminAreaId=").append(adminAreaId).append(", lat=").append(lat).append(", lon=").append(lon).append(", dmaId=").append(dmaId).append(", isHome=").append(isHome).append(", geocodedAddress=").append(geocodedAddress).append(", modelVersion=").append(modelVersion).append("]").toString();
    }
}
