// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.daily;

import com.accuweather.android.models.Measurement;
import com.accuweather.android.models.MeasurementRange;
import java.io.Serializable;
import java.util.List;

// Referenced classes of package com.accuweather.android.models.daily:
//            DayNight, Moon, Sun, AirAndPollen

public class DailyForecast
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private List AirAndPollen;
    private String Date;
    private DayNight Day;
    private Long EpochDate;
    private String Link;
    private String MobileLink;
    private Moon Moon;
    private DayNight Night;
    private MeasurementRange RealFeelTemperature;
    private List Sources;
    private Sun Sun;
    private MeasurementRange Temperature;

    public DailyForecast()
    {
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
        obj = (DailyForecast)obj;
        if (AirAndPollen == null)
        {
            if (((DailyForecast) (obj)).AirAndPollen != null)
            {
                return false;
            }
        } else
        if (!AirAndPollen.equals(((DailyForecast) (obj)).AirAndPollen))
        {
            return false;
        }
        if (Date == null)
        {
            if (((DailyForecast) (obj)).Date != null)
            {
                return false;
            }
        } else
        if (!Date.equals(((DailyForecast) (obj)).Date))
        {
            return false;
        }
        if (Day == null)
        {
            if (((DailyForecast) (obj)).Day != null)
            {
                return false;
            }
        } else
        if (!Day.equals(((DailyForecast) (obj)).Day))
        {
            return false;
        }
        if (EpochDate == null)
        {
            if (((DailyForecast) (obj)).EpochDate != null)
            {
                return false;
            }
        } else
        if (!EpochDate.equals(((DailyForecast) (obj)).EpochDate))
        {
            return false;
        }
        if (Link == null)
        {
            if (((DailyForecast) (obj)).Link != null)
            {
                return false;
            }
        } else
        if (!Link.equals(((DailyForecast) (obj)).Link))
        {
            return false;
        }
        if (MobileLink == null)
        {
            if (((DailyForecast) (obj)).MobileLink != null)
            {
                return false;
            }
        } else
        if (!MobileLink.equals(((DailyForecast) (obj)).MobileLink))
        {
            return false;
        }
        if (Moon == null)
        {
            if (((DailyForecast) (obj)).Moon != null)
            {
                return false;
            }
        } else
        if (!Moon.equals(((DailyForecast) (obj)).Moon))
        {
            return false;
        }
        if (Night == null)
        {
            if (((DailyForecast) (obj)).Night != null)
            {
                return false;
            }
        } else
        if (!Night.equals(((DailyForecast) (obj)).Night))
        {
            return false;
        }
        if (RealFeelTemperature == null)
        {
            if (((DailyForecast) (obj)).RealFeelTemperature != null)
            {
                return false;
            }
        } else
        if (!RealFeelTemperature.equals(((DailyForecast) (obj)).RealFeelTemperature))
        {
            return false;
        }
        if (Sources == null)
        {
            if (((DailyForecast) (obj)).Sources != null)
            {
                return false;
            }
        } else
        if (!Sources.equals(((DailyForecast) (obj)).Sources))
        {
            return false;
        }
        if (Sun == null)
        {
            if (((DailyForecast) (obj)).Sun != null)
            {
                return false;
            }
        } else
        if (!Sun.equals(((DailyForecast) (obj)).Sun))
        {
            return false;
        }
        if (Temperature != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((DailyForecast) (obj)).Temperature == null) goto _L1; else goto _L3
_L3:
        return false;
        if (Temperature.equals(((DailyForecast) (obj)).Temperature)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public List getAirAndPollen()
    {
        return AirAndPollen;
    }

    public String getDate()
    {
        return Date;
    }

    public DayNight getDay()
    {
        return Day;
    }

    public Long getEpochDate()
    {
        return EpochDate;
    }

    public Double getHighTemperature()
    {
        if (getTemperature() != null && getTemperature().getMaximum() != null && getTemperature().getMaximum().getValue() != null)
        {
            return getTemperature().getMaximum().getValue();
        } else
        {
            return null;
        }
    }

    public String getLink()
    {
        return Link;
    }

    public Double getLowTemperature()
    {
        if (getTemperature() != null && getTemperature().getMinimum() != null && getTemperature().getMinimum().getValue() != null)
        {
            return getTemperature().getMinimum().getValue();
        } else
        {
            return null;
        }
    }

    public String getMobileLink()
    {
        return MobileLink;
    }

    public Moon getMoon()
    {
        return Moon;
    }

    public DayNight getNight()
    {
        return Night;
    }

    public Double getRealFeelHighTemperature()
    {
        if (getRealFeelTemperature() != null && getRealFeelTemperature().getMaximum() != null && getRealFeelTemperature().getMaximum().getValue() != null)
        {
            return getRealFeelTemperature().getMaximum().getValue();
        } else
        {
            return null;
        }
    }

    public Double getRealFeelLowTemperature()
    {
        if (getRealFeelTemperature() != null && getRealFeelTemperature().getMinimum() != null && getRealFeelTemperature().getMinimum().getValue() != null)
        {
            return getRealFeelTemperature().getMinimum().getValue();
        } else
        {
            return null;
        }
    }

    public MeasurementRange getRealFeelTemperature()
    {
        return RealFeelTemperature;
    }

    public List getSources()
    {
        return Sources;
    }

    public Sun getSun()
    {
        return Sun;
    }

    public MeasurementRange getTemperature()
    {
        return Temperature;
    }

    public String getUVIndex()
    {
        if (getAirAndPollen() != null)
        {
            for (int i = 0; i < getAirAndPollen().size(); i++)
            {
                if (((AirAndPollen)getAirAndPollen().get(i)).isUvIndex())
                {
                    return ((AirAndPollen)getAirAndPollen().get(i)).getValue();
                }
            }

        }
        return "";
    }

    public int hashCode()
    {
        int l2 = 0;
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
        if (AirAndPollen == null)
        {
            i = 0;
        } else
        {
            i = AirAndPollen.hashCode();
        }
        if (Date == null)
        {
            j = 0;
        } else
        {
            j = Date.hashCode();
        }
        if (Day == null)
        {
            k = 0;
        } else
        {
            k = Day.hashCode();
        }
        if (EpochDate == null)
        {
            l = 0;
        } else
        {
            l = EpochDate.hashCode();
        }
        if (Link == null)
        {
            i1 = 0;
        } else
        {
            i1 = Link.hashCode();
        }
        if (MobileLink == null)
        {
            j1 = 0;
        } else
        {
            j1 = MobileLink.hashCode();
        }
        if (Moon == null)
        {
            k1 = 0;
        } else
        {
            k1 = Moon.hashCode();
        }
        if (Night == null)
        {
            l1 = 0;
        } else
        {
            l1 = Night.hashCode();
        }
        if (RealFeelTemperature == null)
        {
            i2 = 0;
        } else
        {
            i2 = RealFeelTemperature.hashCode();
        }
        if (Sources == null)
        {
            j2 = 0;
        } else
        {
            j2 = Sources.hashCode();
        }
        if (Sun == null)
        {
            k2 = 0;
        } else
        {
            k2 = Sun.hashCode();
        }
        if (Temperature != null)
        {
            l2 = Temperature.hashCode();
        }
        return (((((((((((i + 31) * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2;
    }

    public void setAirAndPollen(List list)
    {
        AirAndPollen = list;
    }

    public void setDate(String s)
    {
        Date = s;
    }

    public void setDay(DayNight daynight)
    {
        Day = daynight;
    }

    public void setEpochDate(Long long1)
    {
        EpochDate = long1;
    }

    public void setLink(String s)
    {
        Link = s;
    }

    public void setMobileLink(String s)
    {
        MobileLink = s;
    }

    public void setMoon(Moon moon)
    {
        Moon = moon;
    }

    public void setNight(DayNight daynight)
    {
        Night = daynight;
    }

    public void setRealFeelTemperature(MeasurementRange measurementrange)
    {
        RealFeelTemperature = measurementrange;
    }

    public void setSources(List list)
    {
        Sources = list;
    }

    public void setSun(Sun sun)
    {
        Sun = sun;
    }

    public void setTemperature(MeasurementRange measurementrange)
    {
        Temperature = measurementrange;
    }

    public String toString()
    {
        return (new StringBuilder()).append("DailyForecast [Date=").append(Date).append(", EpochDate=").append(EpochDate).append(", MobileLink=").append(MobileLink).append(", Link=").append(Link).append(", Sun=").append(Sun).append(", Moon=").append(Moon).append(", Temperature=").append(Temperature).append(", RealFeelTemperature=").append(RealFeelTemperature).append(", AirAndPollen=").append(AirAndPollen).append(", Day=").append(Day).append(", Night=").append(Night).append(", Sources=").append(Sources).append("]").toString();
    }
}
