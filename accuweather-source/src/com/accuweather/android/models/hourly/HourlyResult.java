// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.hourly;

import android.content.Context;
import com.accuweather.android.enums.ForecastModelType;
import com.accuweather.android.models.Direction;
import com.accuweather.android.models.Measurement;
import com.accuweather.android.models.Wind;
import com.accuweather.android.utilities.ConversionUtilities;
import com.accuweather.android.utilities.UserPreferences;
import java.io.Serializable;

// Referenced classes of package com.accuweather.android.models.hourly:
//            HourlyForecastValues

public class HourlyResult
    implements Serializable, HourlyForecastValues
{

    private static final long serialVersionUID = 1L;
    private String DateTime;
    private Measurement DewPoint;
    private Long EpochDateTime;
    private Measurement Ice;
    private Integer IceProbability;
    private String IconPhrase;
    private String Link;
    private String MobileLink;
    private Integer PrecipitationProbability;
    private Measurement Rain;
    private Integer RainProbability;
    private Measurement RealFeelTemperature;
    private Integer RelativeHumidity;
    private Measurement Snow;
    private Integer SnowProbability;
    private Measurement Temperature;
    private Measurement TotalLiquid;
    private Integer UVIndex;
    private String UVIndexText;
    private Measurement Visibility;
    private String WeatherIcon;
    private Wind Wind;
    private Wind WindGust;

    public HourlyResult()
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
        obj = (HourlyResult)obj;
        if (DateTime == null)
        {
            if (((HourlyResult) (obj)).DateTime != null)
            {
                return false;
            }
        } else
        if (!DateTime.equals(((HourlyResult) (obj)).DateTime))
        {
            return false;
        }
        if (DewPoint == null)
        {
            if (((HourlyResult) (obj)).DewPoint != null)
            {
                return false;
            }
        } else
        if (!DewPoint.equals(((HourlyResult) (obj)).DewPoint))
        {
            return false;
        }
        if (EpochDateTime == null)
        {
            if (((HourlyResult) (obj)).EpochDateTime != null)
            {
                return false;
            }
        } else
        if (!EpochDateTime.equals(((HourlyResult) (obj)).EpochDateTime))
        {
            return false;
        }
        if (Ice == null)
        {
            if (((HourlyResult) (obj)).Ice != null)
            {
                return false;
            }
        } else
        if (!Ice.equals(((HourlyResult) (obj)).Ice))
        {
            return false;
        }
        if (IceProbability == null)
        {
            if (((HourlyResult) (obj)).IceProbability != null)
            {
                return false;
            }
        } else
        if (!IceProbability.equals(((HourlyResult) (obj)).IceProbability))
        {
            return false;
        }
        if (IconPhrase == null)
        {
            if (((HourlyResult) (obj)).IconPhrase != null)
            {
                return false;
            }
        } else
        if (!IconPhrase.equals(((HourlyResult) (obj)).IconPhrase))
        {
            return false;
        }
        if (Link == null)
        {
            if (((HourlyResult) (obj)).Link != null)
            {
                return false;
            }
        } else
        if (!Link.equals(((HourlyResult) (obj)).Link))
        {
            return false;
        }
        if (MobileLink == null)
        {
            if (((HourlyResult) (obj)).MobileLink != null)
            {
                return false;
            }
        } else
        if (!MobileLink.equals(((HourlyResult) (obj)).MobileLink))
        {
            return false;
        }
        if (PrecipitationProbability == null)
        {
            if (((HourlyResult) (obj)).PrecipitationProbability != null)
            {
                return false;
            }
        } else
        if (!PrecipitationProbability.equals(((HourlyResult) (obj)).PrecipitationProbability))
        {
            return false;
        }
        if (Rain == null)
        {
            if (((HourlyResult) (obj)).Rain != null)
            {
                return false;
            }
        } else
        if (!Rain.equals(((HourlyResult) (obj)).Rain))
        {
            return false;
        }
        if (RainProbability == null)
        {
            if (((HourlyResult) (obj)).RainProbability != null)
            {
                return false;
            }
        } else
        if (!RainProbability.equals(((HourlyResult) (obj)).RainProbability))
        {
            return false;
        }
        if (RealFeelTemperature == null)
        {
            if (((HourlyResult) (obj)).RealFeelTemperature != null)
            {
                return false;
            }
        } else
        if (!RealFeelTemperature.equals(((HourlyResult) (obj)).RealFeelTemperature))
        {
            return false;
        }
        if (RelativeHumidity == null)
        {
            if (((HourlyResult) (obj)).RelativeHumidity != null)
            {
                return false;
            }
        } else
        if (!RelativeHumidity.equals(((HourlyResult) (obj)).RelativeHumidity))
        {
            return false;
        }
        if (Snow == null)
        {
            if (((HourlyResult) (obj)).Snow != null)
            {
                return false;
            }
        } else
        if (!Snow.equals(((HourlyResult) (obj)).Snow))
        {
            return false;
        }
        if (SnowProbability == null)
        {
            if (((HourlyResult) (obj)).SnowProbability != null)
            {
                return false;
            }
        } else
        if (!SnowProbability.equals(((HourlyResult) (obj)).SnowProbability))
        {
            return false;
        }
        if (Temperature == null)
        {
            if (((HourlyResult) (obj)).Temperature != null)
            {
                return false;
            }
        } else
        if (!Temperature.equals(((HourlyResult) (obj)).Temperature))
        {
            return false;
        }
        if (TotalLiquid == null)
        {
            if (((HourlyResult) (obj)).TotalLiquid != null)
            {
                return false;
            }
        } else
        if (!TotalLiquid.equals(((HourlyResult) (obj)).TotalLiquid))
        {
            return false;
        }
        if (UVIndex == null)
        {
            if (((HourlyResult) (obj)).UVIndex != null)
            {
                return false;
            }
        } else
        if (!UVIndex.equals(((HourlyResult) (obj)).UVIndex))
        {
            return false;
        }
        if (UVIndexText == null)
        {
            if (((HourlyResult) (obj)).UVIndexText != null)
            {
                return false;
            }
        } else
        if (!UVIndexText.equals(((HourlyResult) (obj)).UVIndexText))
        {
            return false;
        }
        if (Visibility == null)
        {
            if (((HourlyResult) (obj)).Visibility != null)
            {
                return false;
            }
        } else
        if (!Visibility.equals(((HourlyResult) (obj)).Visibility))
        {
            return false;
        }
        if (WeatherIcon == null)
        {
            if (((HourlyResult) (obj)).WeatherIcon != null)
            {
                return false;
            }
        } else
        if (!WeatherIcon.equals(((HourlyResult) (obj)).WeatherIcon))
        {
            return false;
        }
        if (Wind == null)
        {
            if (((HourlyResult) (obj)).Wind != null)
            {
                return false;
            }
        } else
        if (!Wind.equals(((HourlyResult) (obj)).Wind))
        {
            return false;
        }
        if (WindGust != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((HourlyResult) (obj)).WindGust == null) goto _L1; else goto _L3
_L3:
        return false;
        if (WindGust.equals(((HourlyResult) (obj)).WindGust)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public String getConvertedIce(Integer integer, Context context)
    {
        return ConversionUtilities.convertRain((new StringBuilder()).append(getIce().getValue()).append("").toString(), integer.intValue(), context, UserPreferences.getMeasurement(context));
    }

    public String getConvertedRain(Integer integer, Context context)
    {
        return ConversionUtilities.convertRain((new StringBuilder()).append(getRain().getValue()).append("").toString(), integer.intValue(), context, UserPreferences.getMeasurement(context));
    }

    public String getConvertedSnow(Integer integer, Context context)
    {
        return ConversionUtilities.convertSnow((new StringBuilder()).append(getSnow().getValue()).append("").toString(), integer.intValue(), context, UserPreferences.getMeasurement(context), ForecastModelType.HOURLY_MODEL);
    }

    public String getConvertedWindDirection(Integer integer, Context context)
    {
        return ConversionUtilities.convertWindDirection(getWind().getDirection().getLocalized(), context, UserPreferences.getDirectionalUnitInt(context));
    }

    public String getConvertedWindGust(Integer integer, Context context)
    {
        return ConversionUtilities.convertSpeed((new StringBuilder()).append(getWindGust().getSpeed().getValue()).append("").toString(), integer.intValue(), context, UserPreferences.getWindSpeedFormatInt(context));
    }

    public String getConvertedWindSpeed(Integer integer, Context context)
    {
        return ConversionUtilities.convertSpeed((new StringBuilder()).append(getWind().getSpeed().getValue()).append("").toString(), integer.intValue(), context, UserPreferences.getWindSpeedFormatInt(context));
    }

    public String getDateTime()
    {
        return DateTime;
    }

    public Measurement getDewPoint()
    {
        return DewPoint;
    }

    public String getDewPointForecast()
    {
        if (getDewPoint() != null && getDewPoint().getValue() != null)
        {
            return (new StringBuilder()).append(getDewPoint().getValue().intValue()).append("").toString();
        } else
        {
            return null;
        }
    }

    public Long getEpochDateTime()
    {
        return EpochDateTime;
    }

    public String getHumidityForecast()
    {
        return (new StringBuilder()).append(getRelativeHumidity()).append("").toString();
    }

    public Measurement getIce()
    {
        return Ice;
    }

    public String getIceForAlarm()
    {
        return (new StringBuilder()).append(getIce().getValue()).append("").toString();
    }

    public Integer getIceProbability()
    {
        return IceProbability;
    }

    public String getIconPhrase()
    {
        return IconPhrase;
    }

    public String getLink()
    {
        return Link;
    }

    public String getMobileLink()
    {
        return MobileLink;
    }

    public String getPrecipProbability_string()
    {
        return (new StringBuilder()).append(getPrecipitationProbability()).append("").toString();
    }

    public Integer getPrecipitationProbability()
    {
        return PrecipitationProbability;
    }

    public Measurement getRain()
    {
        return Rain;
    }

    public String getRainForAlarm()
    {
        return (new StringBuilder()).append(getRain().getValue()).append("").toString();
    }

    public Integer getRainProbability()
    {
        return RainProbability;
    }

    public Measurement getRealFeelTemperature()
    {
        return RealFeelTemperature;
    }

    public Integer getRelativeHumidity()
    {
        return RelativeHumidity;
    }

    public Measurement getSnow()
    {
        return Snow;
    }

    public String getSnowForAlarm()
    {
        return (new StringBuilder()).append(getSnow().getValue()).append("").toString();
    }

    public Integer getSnowProbability()
    {
        return SnowProbability;
    }

    public Measurement getTemperature()
    {
        return Temperature;
    }

    public Measurement getTotalLiquid()
    {
        return TotalLiquid;
    }

    public String getTstorm_string()
    {
        return null;
    }

    public Integer getUVIndex()
    {
        return UVIndex;
    }

    public String getUVIndexText()
    {
        return UVIndexText;
    }

    public Measurement getVisibility()
    {
        return Visibility;
    }

    public String getWeatherIcon()
    {
        return WeatherIcon;
    }

    public Wind getWind()
    {
        return Wind;
    }

    public String getWindDirection()
    {
        return getWind().getDirection().getLocalized();
    }

    public Wind getWindGust()
    {
        return WindGust;
    }

    public String getWindGust_string()
    {
        return (new StringBuilder()).append(getWindGust().getSpeed().getValue()).append("").toString();
    }

    public String getWindSpeed_string()
    {
        return (new StringBuilder()).append(getWind().getSpeed().getValue()).append("").toString();
    }

    public int hashCode()
    {
        int k5 = 0;
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
        if (DateTime == null)
        {
            i = 0;
        } else
        {
            i = DateTime.hashCode();
        }
        if (DewPoint == null)
        {
            j = 0;
        } else
        {
            j = DewPoint.hashCode();
        }
        if (EpochDateTime == null)
        {
            k = 0;
        } else
        {
            k = EpochDateTime.hashCode();
        }
        if (Ice == null)
        {
            l = 0;
        } else
        {
            l = Ice.hashCode();
        }
        if (IceProbability == null)
        {
            i1 = 0;
        } else
        {
            i1 = IceProbability.hashCode();
        }
        if (IconPhrase == null)
        {
            j1 = 0;
        } else
        {
            j1 = IconPhrase.hashCode();
        }
        if (Link == null)
        {
            k1 = 0;
        } else
        {
            k1 = Link.hashCode();
        }
        if (MobileLink == null)
        {
            l1 = 0;
        } else
        {
            l1 = MobileLink.hashCode();
        }
        if (PrecipitationProbability == null)
        {
            i2 = 0;
        } else
        {
            i2 = PrecipitationProbability.hashCode();
        }
        if (Rain == null)
        {
            j2 = 0;
        } else
        {
            j2 = Rain.hashCode();
        }
        if (RainProbability == null)
        {
            k2 = 0;
        } else
        {
            k2 = RainProbability.hashCode();
        }
        if (RealFeelTemperature == null)
        {
            l2 = 0;
        } else
        {
            l2 = RealFeelTemperature.hashCode();
        }
        if (RelativeHumidity == null)
        {
            i3 = 0;
        } else
        {
            i3 = RelativeHumidity.hashCode();
        }
        if (Snow == null)
        {
            j3 = 0;
        } else
        {
            j3 = Snow.hashCode();
        }
        if (SnowProbability == null)
        {
            k3 = 0;
        } else
        {
            k3 = SnowProbability.hashCode();
        }
        if (Temperature == null)
        {
            l3 = 0;
        } else
        {
            l3 = Temperature.hashCode();
        }
        if (TotalLiquid == null)
        {
            i4 = 0;
        } else
        {
            i4 = TotalLiquid.hashCode();
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
        if (Wind == null)
        {
            j5 = 0;
        } else
        {
            j5 = Wind.hashCode();
        }
        if (WindGust != null)
        {
            k5 = WindGust.hashCode();
        }
        return ((((((((((((((((((((((i + 31) * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31 + j3) * 31 + k3) * 31 + l3) * 31 + i4) * 31 + j4) * 31 + k4) * 31 + l4) * 31 + i5) * 31 + j5) * 31 + k5;
    }

    public void setDateTime(String s)
    {
        DateTime = s;
    }

    public void setDewPoint(Measurement measurement)
    {
        DewPoint = measurement;
    }

    public void setEpochDateTime(Long long1)
    {
        EpochDateTime = long1;
    }

    public void setIce(Measurement measurement)
    {
        Ice = measurement;
    }

    public void setIceProbability(Integer integer)
    {
        IceProbability = integer;
    }

    public void setIconPhrase(String s)
    {
        IconPhrase = s;
    }

    public void setLink(String s)
    {
        Link = s;
    }

    public void setMobileLink(String s)
    {
        MobileLink = s;
    }

    public void setPrecipitationProbability(Integer integer)
    {
        PrecipitationProbability = integer;
    }

    public void setRain(Measurement measurement)
    {
        Rain = measurement;
    }

    public void setRainProbability(Integer integer)
    {
        RainProbability = integer;
    }

    public void setRealFeelTemperature(Measurement measurement)
    {
        RealFeelTemperature = measurement;
    }

    public void setRelativeHumidity(Integer integer)
    {
        RelativeHumidity = integer;
    }

    public void setSnow(Measurement measurement)
    {
        Snow = measurement;
    }

    public void setSnowProbability(Integer integer)
    {
        SnowProbability = integer;
    }

    public void setTemperature(Measurement measurement)
    {
        Temperature = measurement;
    }

    public void setTotalLiquid(Measurement measurement)
    {
        TotalLiquid = measurement;
    }

    public void setUVIndex(Integer integer)
    {
        UVIndex = integer;
    }

    public void setUVIndexText(String s)
    {
        UVIndexText = s;
    }

    public void setVisibility(Measurement measurement)
    {
        Visibility = measurement;
    }

    public void setWeatherIcon(String s)
    {
        WeatherIcon = s;
    }

    public void setWind(Wind wind)
    {
        Wind = wind;
    }

    public void setWindGust(Wind wind)
    {
        WindGust = wind;
    }

    public String toString()
    {
        return (new StringBuilder()).append("HourlyResult [DateTime=").append(DateTime).append(", EpochDateTime=").append(EpochDateTime).append(", WeatherIcon=").append(WeatherIcon).append(", IconPhrase=").append(IconPhrase).append(", Temperature=").append(Temperature).append(", RealFeelTemperature=").append(RealFeelTemperature).append(", DewPoint=").append(DewPoint).append(", Wind=").append(Wind).append(", WindGust=").append(WindGust).append(", RelativeHumidity=").append(RelativeHumidity).append(", Visibility=").append(Visibility).append(", UVIndex=").append(UVIndex).append(", UVIndexText=").append(UVIndexText).append(", PrecipitationProbability=").append(PrecipitationProbability).append(", RainProbability=").append(RainProbability).append(", SnowProbability=").append(SnowProbability).append(", IceProbability=").append(IceProbability).append(", TotalLiquid=").append(TotalLiquid).append(", Rain=").append(Rain).append(", Snow=").append(Snow).append(", Ice=").append(Ice).append(", MobileLink=").append(MobileLink).append(", Link=").append(Link).append("]").toString();
    }
}
