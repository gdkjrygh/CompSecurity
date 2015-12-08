// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services.request;

import com.accuweather.android.models.location.GeocodedAddress;

// Referenced classes of package com.accuweather.android.services.request:
//            Request

public class LocationGeoRequest extends Request
{

    private GeocodedAddress geocodedAddress;
    private boolean isAddressRequest;
    private boolean isFollowMeRequest;
    private String langId;
    private Double lat;
    private Double lon;

    public LocationGeoRequest()
    {
        isFollowMeRequest = true;
        isAddressRequest = false;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!super.equals(obj))
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (LocationGeoRequest)obj;
        if (geocodedAddress == null)
        {
            if (((LocationGeoRequest) (obj)).geocodedAddress != null)
            {
                return false;
            }
        } else
        if (!geocodedAddress.equals(((LocationGeoRequest) (obj)).geocodedAddress))
        {
            return false;
        }
        if (isAddressRequest != ((LocationGeoRequest) (obj)).isAddressRequest)
        {
            return false;
        }
        if (isFollowMeRequest != ((LocationGeoRequest) (obj)).isFollowMeRequest)
        {
            return false;
        }
        if (langId == null)
        {
            if (((LocationGeoRequest) (obj)).langId != null)
            {
                return false;
            }
        } else
        if (!langId.equals(((LocationGeoRequest) (obj)).langId))
        {
            return false;
        }
        if (lat == null)
        {
            if (((LocationGeoRequest) (obj)).lat != null)
            {
                return false;
            }
        } else
        if (!lat.equals(((LocationGeoRequest) (obj)).lat))
        {
            return false;
        }
        if (lon != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((LocationGeoRequest) (obj)).lon == null) goto _L1; else goto _L3
_L3:
        return false;
        if (lon.equals(((LocationGeoRequest) (obj)).lon)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public GeocodedAddress getGeocodedAddress()
    {
        return geocodedAddress;
    }

    public String getLangId()
    {
        return langId;
    }

    public Double getLat()
    {
        return lat;
    }

    public Double getLon()
    {
        return lon;
    }

    public int hashCode()
    {
        char c1 = '\u04CF';
        int l = 0;
        int i1 = super.hashCode();
        int i;
        char c;
        int j;
        int k;
        if (geocodedAddress == null)
        {
            i = 0;
        } else
        {
            i = geocodedAddress.hashCode();
        }
        if (isAddressRequest)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (!isFollowMeRequest)
        {
            c1 = '\u04D5';
        }
        if (langId == null)
        {
            j = 0;
        } else
        {
            j = langId.hashCode();
        }
        if (lat == null)
        {
            k = 0;
        } else
        {
            k = lat.hashCode();
        }
        if (lon != null)
        {
            l = lon.hashCode();
        }
        return (((((i1 * 31 + i) * 31 + c) * 31 + c1) * 31 + j) * 31 + k) * 31 + l;
    }

    public boolean isAddressRequest()
    {
        return isAddressRequest;
    }

    public boolean isFollowMeRequest()
    {
        return isFollowMeRequest;
    }

    public void setAddressRequest(boolean flag)
    {
        isAddressRequest = flag;
    }

    public void setFollowMeRequest(boolean flag)
    {
        isFollowMeRequest = flag;
    }

    public void setGeocodedAddress(GeocodedAddress geocodedaddress)
    {
        geocodedAddress = geocodedaddress;
    }

    public void setLangId(String s)
    {
        langId = s;
    }

    public void setLat(Double double1)
    {
        lat = double1;
    }

    public void setLon(Double double1)
    {
        lon = double1;
    }

    public String toString()
    {
        return (new StringBuilder()).append("LocationGeoRequest [lat=").append(lat).append(", lon=").append(lon).append(", langId=").append(langId).append(", isFollowMeRequest=").append(isFollowMeRequest).append(", isAddressRequest=").append(isAddressRequest).append(", geocodedAddress=").append(geocodedAddress).append("]").toString();
    }
}
