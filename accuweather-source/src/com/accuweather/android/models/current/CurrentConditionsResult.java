// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.current;

import com.accuweather.android.models.ExpirableModel;
import com.accuweather.android.models.MetricImperial;
import com.accuweather.android.utilities.IClock;
import java.io.Serializable;

// Referenced classes of package com.accuweather.android.models.current:
//            PressureTendency, CurrentConditionsWind

public class CurrentConditionsResult
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private MetricImperial ApparentTemperature;
    private MetricImperial Ceiling;
    private String CloudCover;
    private MetricImperial DewPoint;
    private Long EpochTime;
    private Boolean IsDayTime;
    private String Link;
    private String LocalObservationDateTime;
    private String MobileLink;
    private String ObstructionsToVisibility;
    private MetricImperial Past24HourTemperatureDeparture;
    private MetricImperial Pressure;
    private PressureTendency PressureTendency;
    private MetricImperial RealFeelTemperature;
    private MetricImperial RealFeelTemperatureShade;
    private Double RelativeHumidity;
    private MetricImperial Temperature;
    private Integer UVIndex;
    private String UVIndexText;
    private MetricImperial Visibility;
    private Integer WeatherIcon;
    private String WeatherText;
    private CurrentConditionsWind Wind;
    private MetricImperial WindChillTemperature;
    private CurrentConditionsWind WindGust;
    private ExpirableModel expirableModel;

    public CurrentConditionsResult()
    {
        expirableModel = new ExpirableModel() {

            final CurrentConditionsResult this$0;

            protected int getExpirationTimeInMinutes()
            {
                return 7;
            }

            
            {
                this$0 = CurrentConditionsResult.this;
                super();
            }
        };
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
        obj = (CurrentConditionsResult)obj;
        if (ApparentTemperature == null)
        {
            if (((CurrentConditionsResult) (obj)).ApparentTemperature != null)
            {
                return false;
            }
        } else
        if (!ApparentTemperature.equals(((CurrentConditionsResult) (obj)).ApparentTemperature))
        {
            return false;
        }
        if (Ceiling == null)
        {
            if (((CurrentConditionsResult) (obj)).Ceiling != null)
            {
                return false;
            }
        } else
        if (!Ceiling.equals(((CurrentConditionsResult) (obj)).Ceiling))
        {
            return false;
        }
        if (CloudCover == null)
        {
            if (((CurrentConditionsResult) (obj)).CloudCover != null)
            {
                return false;
            }
        } else
        if (!CloudCover.equals(((CurrentConditionsResult) (obj)).CloudCover))
        {
            return false;
        }
        if (DewPoint == null)
        {
            if (((CurrentConditionsResult) (obj)).DewPoint != null)
            {
                return false;
            }
        } else
        if (!DewPoint.equals(((CurrentConditionsResult) (obj)).DewPoint))
        {
            return false;
        }
        if (EpochTime == null)
        {
            if (((CurrentConditionsResult) (obj)).EpochTime != null)
            {
                return false;
            }
        } else
        if (!EpochTime.equals(((CurrentConditionsResult) (obj)).EpochTime))
        {
            return false;
        }
        if (IsDayTime == null)
        {
            if (((CurrentConditionsResult) (obj)).IsDayTime != null)
            {
                return false;
            }
        } else
        if (!IsDayTime.equals(((CurrentConditionsResult) (obj)).IsDayTime))
        {
            return false;
        }
        if (Link == null)
        {
            if (((CurrentConditionsResult) (obj)).Link != null)
            {
                return false;
            }
        } else
        if (!Link.equals(((CurrentConditionsResult) (obj)).Link))
        {
            return false;
        }
        if (LocalObservationDateTime == null)
        {
            if (((CurrentConditionsResult) (obj)).LocalObservationDateTime != null)
            {
                return false;
            }
        } else
        if (!LocalObservationDateTime.equals(((CurrentConditionsResult) (obj)).LocalObservationDateTime))
        {
            return false;
        }
        if (MobileLink == null)
        {
            if (((CurrentConditionsResult) (obj)).MobileLink != null)
            {
                return false;
            }
        } else
        if (!MobileLink.equals(((CurrentConditionsResult) (obj)).MobileLink))
        {
            return false;
        }
        if (ObstructionsToVisibility == null)
        {
            if (((CurrentConditionsResult) (obj)).ObstructionsToVisibility != null)
            {
                return false;
            }
        } else
        if (!ObstructionsToVisibility.equals(((CurrentConditionsResult) (obj)).ObstructionsToVisibility))
        {
            return false;
        }
        if (Past24HourTemperatureDeparture == null)
        {
            if (((CurrentConditionsResult) (obj)).Past24HourTemperatureDeparture != null)
            {
                return false;
            }
        } else
        if (!Past24HourTemperatureDeparture.equals(((CurrentConditionsResult) (obj)).Past24HourTemperatureDeparture))
        {
            return false;
        }
        if (Pressure == null)
        {
            if (((CurrentConditionsResult) (obj)).Pressure != null)
            {
                return false;
            }
        } else
        if (!Pressure.equals(((CurrentConditionsResult) (obj)).Pressure))
        {
            return false;
        }
        if (PressureTendency == null)
        {
            if (((CurrentConditionsResult) (obj)).PressureTendency != null)
            {
                return false;
            }
        } else
        if (!PressureTendency.equals(((CurrentConditionsResult) (obj)).PressureTendency))
        {
            return false;
        }
        if (RealFeelTemperature == null)
        {
            if (((CurrentConditionsResult) (obj)).RealFeelTemperature != null)
            {
                return false;
            }
        } else
        if (!RealFeelTemperature.equals(((CurrentConditionsResult) (obj)).RealFeelTemperature))
        {
            return false;
        }
        if (RealFeelTemperatureShade == null)
        {
            if (((CurrentConditionsResult) (obj)).RealFeelTemperatureShade != null)
            {
                return false;
            }
        } else
        if (!RealFeelTemperatureShade.equals(((CurrentConditionsResult) (obj)).RealFeelTemperatureShade))
        {
            return false;
        }
        if (RelativeHumidity == null)
        {
            if (((CurrentConditionsResult) (obj)).RelativeHumidity != null)
            {
                return false;
            }
        } else
        if (!RelativeHumidity.equals(((CurrentConditionsResult) (obj)).RelativeHumidity))
        {
            return false;
        }
        if (Temperature == null)
        {
            if (((CurrentConditionsResult) (obj)).Temperature != null)
            {
                return false;
            }
        } else
        if (!Temperature.equals(((CurrentConditionsResult) (obj)).Temperature))
        {
            return false;
        }
        if (UVIndex == null)
        {
            if (((CurrentConditionsResult) (obj)).UVIndex != null)
            {
                return false;
            }
        } else
        if (!UVIndex.equals(((CurrentConditionsResult) (obj)).UVIndex))
        {
            return false;
        }
        if (UVIndexText == null)
        {
            if (((CurrentConditionsResult) (obj)).UVIndexText != null)
            {
                return false;
            }
        } else
        if (!UVIndexText.equals(((CurrentConditionsResult) (obj)).UVIndexText))
        {
            return false;
        }
        if (Visibility == null)
        {
            if (((CurrentConditionsResult) (obj)).Visibility != null)
            {
                return false;
            }
        } else
        if (!Visibility.equals(((CurrentConditionsResult) (obj)).Visibility))
        {
            return false;
        }
        if (WeatherIcon == null)
        {
            if (((CurrentConditionsResult) (obj)).WeatherIcon != null)
            {
                return false;
            }
        } else
        if (!WeatherIcon.equals(((CurrentConditionsResult) (obj)).WeatherIcon))
        {
            return false;
        }
        if (WeatherText == null)
        {
            if (((CurrentConditionsResult) (obj)).WeatherText != null)
            {
                return false;
            }
        } else
        if (!WeatherText.equals(((CurrentConditionsResult) (obj)).WeatherText))
        {
            return false;
        }
        if (Wind == null)
        {
            if (((CurrentConditionsResult) (obj)).Wind != null)
            {
                return false;
            }
        } else
        if (!Wind.equals(((CurrentConditionsResult) (obj)).Wind))
        {
            return false;
        }
        if (WindChillTemperature == null)
        {
            if (((CurrentConditionsResult) (obj)).WindChillTemperature != null)
            {
                return false;
            }
        } else
        if (!WindChillTemperature.equals(((CurrentConditionsResult) (obj)).WindChillTemperature))
        {
            return false;
        }
        if (WindGust == null)
        {
            if (((CurrentConditionsResult) (obj)).WindGust != null)
            {
                return false;
            }
        } else
        if (!WindGust.equals(((CurrentConditionsResult) (obj)).WindGust))
        {
            return false;
        }
        if (expirableModel != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((CurrentConditionsResult) (obj)).expirableModel == null) goto _L1; else goto _L3
_L3:
        return false;
        if (expirableModel.equals(((CurrentConditionsResult) (obj)).expirableModel)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public MetricImperial getApparentTemperature()
    {
        return ApparentTemperature;
    }

    public MetricImperial getCeiling()
    {
        return Ceiling;
    }

    public String getCloudCover()
    {
        return CloudCover;
    }

    public MetricImperial getDewPoint()
    {
        return DewPoint;
    }

    public Long getEpochTime()
    {
        return EpochTime;
    }

    public String getLink()
    {
        return Link;
    }

    public String getLocalObservationDateTime()
    {
        return LocalObservationDateTime;
    }

    public String getMobileLink()
    {
        return MobileLink;
    }

    public String getObservationGmtOffset()
    {
        if (getLocalObservationDateTime() != null)
        {
            return getLocalObservationDateTime().substring(19);
        } else
        {
            return null;
        }
    }

    public String getObstructionsToVisibility()
    {
        return ObstructionsToVisibility;
    }

    public MetricImperial getPast24HourTemperatureDeparture()
    {
        return Past24HourTemperatureDeparture;
    }

    public MetricImperial getPressure()
    {
        return Pressure;
    }

    public PressureTendency getPressureTendency()
    {
        return PressureTendency;
    }

    public MetricImperial getRealFeelTemperature()
    {
        return RealFeelTemperature;
    }

    public MetricImperial getRealFeelTemperatureShade()
    {
        return RealFeelTemperatureShade;
    }

    public Double getRelativeHumidity()
    {
        return RelativeHumidity;
    }

    public MetricImperial getTemperature()
    {
        return Temperature;
    }

    public Integer getUVIndex()
    {
        return UVIndex;
    }

    public String getUVIndexText()
    {
        return UVIndexText;
    }

    public long getUpdateTime()
    {
        return expirableModel.getUpdateTime();
    }

    public MetricImperial getVisibility()
    {
        return Visibility;
    }

    public Integer getWeatherIcon()
    {
        return WeatherIcon;
    }

    public String getWeatherText()
    {
        return WeatherText;
    }

    public CurrentConditionsWind getWind()
    {
        return Wind;
    }

    public MetricImperial getWindChillTemperature()
    {
        return WindChillTemperature;
    }

    public CurrentConditionsWind getWindGust()
    {
        return WindGust;
    }

    public int hashCode()
    {
        int j6 = 0;
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
        int l3;
        int i4;
        int j4;
        int k4;
        int l4;
        int i5;
        int j5;
        int k5;
        int l5;
        int i6;
        if (ApparentTemperature == null)
        {
            i = 0;
        } else
        {
            i = ApparentTemperature.hashCode();
        }
        if (Ceiling == null)
        {
            j = 0;
        } else
        {
            j = Ceiling.hashCode();
        }
        if (CloudCover == null)
        {
            k = 0;
        } else
        {
            k = CloudCover.hashCode();
        }
        if (DewPoint == null)
        {
            l = 0;
        } else
        {
            l = DewPoint.hashCode();
        }
        if (EpochTime == null)
        {
            i1 = 0;
        } else
        {
            i1 = EpochTime.hashCode();
        }
        if (IsDayTime == null)
        {
            j1 = 0;
        } else
        {
            j1 = IsDayTime.hashCode();
        }
        if (Link == null)
        {
            k1 = 0;
        } else
        {
            k1 = Link.hashCode();
        }
        if (LocalObservationDateTime == null)
        {
            l1 = 0;
        } else
        {
            l1 = LocalObservationDateTime.hashCode();
        }
        if (MobileLink == null)
        {
            i2 = 0;
        } else
        {
            i2 = MobileLink.hashCode();
        }
        if (ObstructionsToVisibility == null)
        {
            j2 = 0;
        } else
        {
            j2 = ObstructionsToVisibility.hashCode();
        }
        if (Past24HourTemperatureDeparture == null)
        {
            k2 = 0;
        } else
        {
            k2 = Past24HourTemperatureDeparture.hashCode();
        }
        if (Pressure == null)
        {
            l2 = 0;
        } else
        {
            l2 = Pressure.hashCode();
        }
        if (PressureTendency == null)
        {
            i3 = 0;
        } else
        {
            i3 = PressureTendency.hashCode();
        }
        if (RealFeelTemperature == null)
        {
            j3 = 0;
        } else
        {
            j3 = RealFeelTemperature.hashCode();
        }
        if (RealFeelTemperatureShade == null)
        {
            k3 = 0;
        } else
        {
            k3 = RealFeelTemperatureShade.hashCode();
        }
        if (RelativeHumidity == null)
        {
            l3 = 0;
        } else
        {
            l3 = RelativeHumidity.hashCode();
        }
        if (Temperature == null)
        {
            i4 = 0;
        } else
        {
            i4 = Temperature.hashCode();
        }
        if (UVIndex == null)
        {
            j4 = 0;
        } else
        {
            j4 = UVIndex.hashCode();
        }
        if (UVIndexText == null)
        {
            k4 = 0;
        } else
        {
            k4 = UVIndexText.hashCode();
        }
        if (Visibility == null)
        {
            l4 = 0;
        } else
        {
            l4 = Visibility.hashCode();
        }
        if (WeatherIcon == null)
        {
            i5 = 0;
        } else
        {
            i5 = WeatherIcon.hashCode();
        }
        if (WeatherText == null)
        {
            j5 = 0;
        } else
        {
            j5 = WeatherText.hashCode();
        }
        if (Wind == null)
        {
            k5 = 0;
        } else
        {
            k5 = Wind.hashCode();
        }
        if (WindChillTemperature == null)
        {
            l5 = 0;
        } else
        {
            l5 = WindChillTemperature.hashCode();
        }
        if (WindGust == null)
        {
            i6 = 0;
        } else
        {
            i6 = WindGust.hashCode();
        }
        if (expirableModel != null)
        {
            j6 = expirableModel.hashCode();
        }
        return (((((((((((((((((((((((((i + 31) * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31 + j3) * 31 + k3) * 31 + l3) * 31 + i4) * 31 + j4) * 31 + k4) * 31 + l4) * 31 + i5) * 31 + j5) * 31 + k5) * 31 + l5) * 31 + i6) * 31 + j6;
    }

    public Boolean isDayTime()
    {
        return IsDayTime;
    }

    public final boolean isExpired(IClock iclock)
    {
        return expirableModel.isExpired(iclock);
    }

    public void setApparentTemperature(MetricImperial metricimperial)
    {
        ApparentTemperature = metricimperial;
    }

    public void setCeiling(MetricImperial metricimperial)
    {
        Ceiling = metricimperial;
    }

    public void setCloudCover(String s)
    {
        CloudCover = s;
    }

    public void setDayTime(Boolean boolean1)
    {
        IsDayTime = boolean1;
    }

    public void setDewPoint(MetricImperial metricimperial)
    {
        DewPoint = metricimperial;
    }

    public void setEpochTime(Long long1)
    {
        EpochTime = long1;
    }

    public void setLink(String s)
    {
        Link = s;
    }

    public void setLocalObservationDateTime(String s)
    {
        LocalObservationDateTime = s;
    }

    public void setMobileLink(String s)
    {
        MobileLink = s;
    }

    public void setObstructionsToVisibility(String s)
    {
        ObstructionsToVisibility = s;
    }

    public void setPast24HourTemperatureDeparture(MetricImperial metricimperial)
    {
        Past24HourTemperatureDeparture = metricimperial;
    }

    public void setPressure(MetricImperial metricimperial)
    {
        Pressure = metricimperial;
    }

    public void setPressureTendency(PressureTendency pressuretendency)
    {
        PressureTendency = pressuretendency;
    }

    public void setRealFeelTemperature(MetricImperial metricimperial)
    {
        RealFeelTemperature = metricimperial;
    }

    public void setRealFeelTemperatureShade(MetricImperial metricimperial)
    {
        RealFeelTemperatureShade = metricimperial;
    }

    public void setRelativeHumidity(Double double1)
    {
        RelativeHumidity = double1;
    }

    public void setTemperature(MetricImperial metricimperial)
    {
        Temperature = metricimperial;
    }

    public void setUVIndex(Integer integer)
    {
        UVIndex = integer;
    }

    public void setUVIndexText(String s)
    {
        UVIndexText = s;
    }

    public void setUpdateTime(long l)
    {
        expirableModel.setUpdateTime(l);
    }

    public void setVisibility(MetricImperial metricimperial)
    {
        Visibility = metricimperial;
    }

    public void setWeatherIcon(Integer integer)
    {
        WeatherIcon = integer;
    }

    public void setWeatherText(String s)
    {
        WeatherText = s;
    }

    public void setWind(CurrentConditionsWind currentconditionswind)
    {
        Wind = currentconditionswind;
    }

    public void setWindChillTemperature(MetricImperial metricimperial)
    {
        WindChillTemperature = metricimperial;
    }

    public void setWindGust(CurrentConditionsWind currentconditionswind)
    {
        WindGust = currentconditionswind;
    }

    public String toString()
    {
        return (new StringBuilder()).append("CurrentConditionsResult [LocalObservationDateTime=").append(LocalObservationDateTime).append(", EpochTime=").append(EpochTime).append(", WeatherText=").append(WeatherText).append(", WeatherIcon=").append(WeatherIcon).append(", IsDayTime=").append(IsDayTime).append(", Temperature=").append(Temperature).append(", RealFeelTemperature=").append(RealFeelTemperature).append(", RealFeelTemperatureShade=").append(RealFeelTemperatureShade).append(", RelativeHumidity=").append(RelativeHumidity).append(", DewPoint=").append(DewPoint).append(", Wind=").append(Wind).append(", WindGust=").append(WindGust).append(", UVIndex=").append(UVIndex).append(", UVIndexText=").append(UVIndexText).append(", Visibility=").append(Visibility).append(", ObstructionsToVisibility=").append(ObstructionsToVisibility).append(", CloudCover=").append(CloudCover).append(", Ceiling=").append(Ceiling).append(", Pressure=").append(Pressure).append(", PressureTendency=").append(PressureTendency).append(", Past24HourTemperatureDeparture=").append(Past24HourTemperatureDeparture).append(", ApparentTemperature=").append(ApparentTemperature).append(", WindChillTemperature=").append(WindChillTemperature).append(", MobileLink=").append(MobileLink).append(", Link=").append(Link).append(", expirableModel=").append(expirableModel).append("]").toString();
    }
}
