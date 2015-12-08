// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models;


public class WeatherContentUpdateParams
{

    private boolean isAlertsUpdate;
    private boolean isCurrentConditionsUpdate;
    private boolean isDailyUpdate;
    private boolean isHourlyUpdate;
    private boolean isMinuteCastUpdate;
    private boolean isNewsUpdate;
    private boolean isPhotosUpdate;
    private boolean isVideoUpdate;

    public WeatherContentUpdateParams()
    {
        isCurrentConditionsUpdate = true;
        isHourlyUpdate = true;
        isDailyUpdate = true;
        isAlertsUpdate = true;
        isNewsUpdate = true;
        isVideoUpdate = true;
        isMinuteCastUpdate = true;
        isPhotosUpdate = false;
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
            obj = (WeatherContentUpdateParams)obj;
            if (isAlertsUpdate != ((WeatherContentUpdateParams) (obj)).isAlertsUpdate)
            {
                return false;
            }
            if (isCurrentConditionsUpdate != ((WeatherContentUpdateParams) (obj)).isCurrentConditionsUpdate)
            {
                return false;
            }
            if (isDailyUpdate != ((WeatherContentUpdateParams) (obj)).isDailyUpdate)
            {
                return false;
            }
            if (isHourlyUpdate != ((WeatherContentUpdateParams) (obj)).isHourlyUpdate)
            {
                return false;
            }
            if (isMinuteCastUpdate != ((WeatherContentUpdateParams) (obj)).isMinuteCastUpdate)
            {
                return false;
            }
            if (isNewsUpdate != ((WeatherContentUpdateParams) (obj)).isNewsUpdate)
            {
                return false;
            }
            if (isVideoUpdate != ((WeatherContentUpdateParams) (obj)).isVideoUpdate)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        char c6 = '\u04CF';
        char c;
        char c1;
        char c2;
        char c3;
        char c4;
        char c5;
        if (isAlertsUpdate)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (isCurrentConditionsUpdate)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        if (isDailyUpdate)
        {
            c2 = '\u04CF';
        } else
        {
            c2 = '\u04D5';
        }
        if (isHourlyUpdate)
        {
            c3 = '\u04CF';
        } else
        {
            c3 = '\u04D5';
        }
        if (isMinuteCastUpdate)
        {
            c4 = '\u04CF';
        } else
        {
            c4 = '\u04D5';
        }
        if (isNewsUpdate)
        {
            c5 = '\u04CF';
        } else
        {
            c5 = '\u04D5';
        }
        if (!isVideoUpdate)
        {
            c6 = '\u04D5';
        }
        return ((((((c + 31) * 31 + c1) * 31 + c2) * 31 + c3) * 31 + c4) * 31 + c5) * 31 + c6;
    }

    public boolean isAlertsUpdate()
    {
        return isAlertsUpdate;
    }

    public boolean isCurrentConditionsUpdate()
    {
        return isCurrentConditionsUpdate;
    }

    public boolean isDailyUpdate()
    {
        return isDailyUpdate;
    }

    public boolean isHourlyUpdate()
    {
        return isHourlyUpdate;
    }

    public boolean isMinuteCastUpdate()
    {
        return isMinuteCastUpdate;
    }

    public boolean isNewsUpdate()
    {
        return isNewsUpdate;
    }

    public boolean isPhotosUpdate()
    {
        return isPhotosUpdate;
    }

    public boolean isVideoUpdate()
    {
        return isVideoUpdate;
    }

    public void setAlertsUpdate(boolean flag)
    {
        isAlertsUpdate = flag;
    }

    public void setCurrentConditionsUpdate(boolean flag)
    {
        isCurrentConditionsUpdate = flag;
    }

    public void setDailyUpdate(boolean flag)
    {
        isDailyUpdate = flag;
    }

    public void setHourlyUpdate(boolean flag)
    {
        isHourlyUpdate = flag;
    }

    public void setMinuteCastUpdate(boolean flag)
    {
        isMinuteCastUpdate = flag;
    }

    public void setNewsUpdate(boolean flag)
    {
        isNewsUpdate = flag;
    }

    public void setPhotosUpdate(boolean flag)
    {
        isPhotosUpdate = flag;
    }

    public void setVideoUpdate(boolean flag)
    {
        isVideoUpdate = flag;
    }

    public String toString()
    {
        return (new StringBuilder()).append("WeatherContentUpdateParams [isCurrentConditionsUpdate=").append(isCurrentConditionsUpdate).append(", isHourlyUpdate=").append(isHourlyUpdate).append(", isDailyUpdate=").append(isDailyUpdate).append(", isAlertsUpdate=").append(isAlertsUpdate).append(", isNewsUpdate=").append(isNewsUpdate).append(", isVideoUpdate=").append(isVideoUpdate).append(", isMinuteCastUpdate=").append(isMinuteCastUpdate).append("]").toString();
    }
}
