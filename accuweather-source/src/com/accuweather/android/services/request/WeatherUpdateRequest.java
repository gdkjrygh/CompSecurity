// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services.request;

import com.accuweather.android.models.WeatherContentUpdateParams;

// Referenced classes of package com.accuweather.android.services.request:
//            Request

public class WeatherUpdateRequest extends Request
{

    private int isMetric;
    private boolean isNotification;
    private boolean isPrimaryLocation;
    private boolean isResultOfGpsSearch;
    private boolean isResultOfTimerRefresh;
    private boolean isWidget;
    private String langId;
    private Double lat;
    private String locationKey;
    private Double lon;
    private String partnerCode;
    private WeatherContentUpdateParams weatherContentUpdateParams;

    public WeatherUpdateRequest()
    {
        lat = null;
        lon = null;
        weatherContentUpdateParams = new WeatherContentUpdateParams();
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
        obj = (WeatherUpdateRequest)obj;
        if (isMetric != ((WeatherUpdateRequest) (obj)).isMetric)
        {
            return false;
        }
        if (isNotification != ((WeatherUpdateRequest) (obj)).isNotification)
        {
            return false;
        }
        if (isPrimaryLocation != ((WeatherUpdateRequest) (obj)).isPrimaryLocation)
        {
            return false;
        }
        if (isResultOfGpsSearch != ((WeatherUpdateRequest) (obj)).isResultOfGpsSearch)
        {
            return false;
        }
        if (isResultOfTimerRefresh != ((WeatherUpdateRequest) (obj)).isResultOfTimerRefresh)
        {
            return false;
        }
        if (isWidget != ((WeatherUpdateRequest) (obj)).isWidget)
        {
            return false;
        }
        if (langId == null)
        {
            if (((WeatherUpdateRequest) (obj)).langId != null)
            {
                return false;
            }
        } else
        if (!langId.equals(((WeatherUpdateRequest) (obj)).langId))
        {
            return false;
        }
        if (lat == null)
        {
            if (((WeatherUpdateRequest) (obj)).lat != null)
            {
                return false;
            }
        } else
        if (!lat.equals(((WeatherUpdateRequest) (obj)).lat))
        {
            return false;
        }
        if (locationKey == null)
        {
            if (((WeatherUpdateRequest) (obj)).locationKey != null)
            {
                return false;
            }
        } else
        if (!locationKey.equals(((WeatherUpdateRequest) (obj)).locationKey))
        {
            return false;
        }
        if (lon == null)
        {
            if (((WeatherUpdateRequest) (obj)).lon != null)
            {
                return false;
            }
        } else
        if (!lon.equals(((WeatherUpdateRequest) (obj)).lon))
        {
            return false;
        }
        if (partnerCode == null)
        {
            if (((WeatherUpdateRequest) (obj)).partnerCode != null)
            {
                return false;
            }
        } else
        if (!partnerCode.equals(((WeatherUpdateRequest) (obj)).partnerCode))
        {
            return false;
        }
        if (weatherContentUpdateParams != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((WeatherUpdateRequest) (obj)).weatherContentUpdateParams == null) goto _L1; else goto _L3
_L3:
        return false;
        if (weatherContentUpdateParams.equals(((WeatherUpdateRequest) (obj)).weatherContentUpdateParams)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public String getLangId()
    {
        return langId;
    }

    public Double getLat()
    {
        return lat;
    }

    public String getLocationKey()
    {
        return locationKey;
    }

    public Double getLon()
    {
        return lon;
    }

    public int getMetric()
    {
        return isMetric;
    }

    public String getPartnerCode()
    {
        return partnerCode;
    }

    public WeatherContentUpdateParams getWeatherContentUpdateParams()
    {
        return weatherContentUpdateParams;
    }

    public int hashCode()
    {
        char c4 = '\u04CF';
        int j1 = 0;
        int k1 = super.hashCode();
        int l1 = isMetric;
        char c;
        char c1;
        char c2;
        char c3;
        int i;
        int j;
        int k;
        int l;
        int i1;
        if (isNotification)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (isPrimaryLocation)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        if (isResultOfGpsSearch)
        {
            c2 = '\u04CF';
        } else
        {
            c2 = '\u04D5';
        }
        if (isResultOfTimerRefresh)
        {
            c3 = '\u04CF';
        } else
        {
            c3 = '\u04D5';
        }
        if (!isWidget)
        {
            c4 = '\u04D5';
        }
        if (langId == null)
        {
            i = 0;
        } else
        {
            i = langId.hashCode();
        }
        if (lat == null)
        {
            j = 0;
        } else
        {
            j = lat.hashCode();
        }
        if (locationKey == null)
        {
            k = 0;
        } else
        {
            k = locationKey.hashCode();
        }
        if (lon == null)
        {
            l = 0;
        } else
        {
            l = lon.hashCode();
        }
        if (partnerCode == null)
        {
            i1 = 0;
        } else
        {
            i1 = partnerCode.hashCode();
        }
        if (weatherContentUpdateParams != null)
        {
            j1 = weatherContentUpdateParams.hashCode();
        }
        return (((((((((((k1 * 31 + l1) * 31 + c) * 31 + c1) * 31 + c2) * 31 + c3) * 31 + c4) * 31 + i) * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1;
    }

    public boolean isMetric()
    {
        return getMetric() == 1;
    }

    public boolean isNotification()
    {
        return isNotification;
    }

    public boolean isPrimaryLocation()
    {
        return isPrimaryLocation;
    }

    public boolean isResultOfGpsSearch()
    {
        return isResultOfGpsSearch;
    }

    public boolean isResultOfTimerRefresh()
    {
        return isResultOfTimerRefresh;
    }

    public boolean isWidget()
    {
        return isWidget;
    }

    public void setCoordinates(Double double1, Double double2)
    {
        lat = double1;
        lon = double2;
    }

    public void setLangId(String s)
    {
        langId = s;
    }

    public void setLocationKey(String s)
    {
        locationKey = s;
    }

    public void setMetric(int i)
    {
        isMetric = i;
    }

    public void setNotification(boolean flag)
    {
        isNotification = flag;
    }

    public void setPartnerCode(String s)
    {
        partnerCode = s;
    }

    public void setPrimaryLocation(boolean flag)
    {
        isPrimaryLocation = flag;
    }

    public void setResultOfGpsSearch(boolean flag)
    {
        isResultOfGpsSearch = flag;
    }

    public void setResultOfTimerRefresh(boolean flag)
    {
        isResultOfTimerRefresh = flag;
    }

    public void setWeatherContentUpdateParams(WeatherContentUpdateParams weathercontentupdateparams)
    {
        weatherContentUpdateParams = weathercontentupdateparams;
    }

    public void setWidget(boolean flag)
    {
        isWidget = flag;
    }

    public String toString()
    {
        return (new StringBuilder()).append("WeatherUpdateRequest [locationKey=").append(locationKey).append(", isMetric=").append(isMetric).append(", langId=").append(langId).append(", partnerCode=").append(partnerCode).append(", isPrimaryLocation=").append(isPrimaryLocation).append(", isNotification=").append(isNotification).append(", isWidget=").append(isWidget).append(", isResultOfGpsSearch=").append(isResultOfGpsSearch).append(", lat=").append(lat).append(", lon=").append(lon).append(", weatherContentUpdateParams=").append(weatherContentUpdateParams).append(", isResultOfTimerRefresh=").append(isResultOfTimerRefresh).append("]").toString();
    }
}
