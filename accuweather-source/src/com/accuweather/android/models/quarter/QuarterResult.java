// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.quarter;

import android.content.Context;
import com.accuweather.android.enums.ForecastModelType;
import com.accuweather.android.models.Direction;
import com.accuweather.android.models.Measurement;
import com.accuweather.android.models.MeasurementRange;
import com.accuweather.android.models.Wind;
import com.accuweather.android.models.hourly.HourlyForecastValues;
import com.accuweather.android.utilities.ConversionUtilities;
import com.accuweather.android.utilities.UserPreferences;
import java.io.Serializable;

public class QuarterResult
    implements Serializable, HourlyForecastValues
{

    private static final long serialVersionUID = 1L;
    private Integer CloudCover;
    private String Date;
    private Measurement DewPoint;
    private Measurement Ice;
    private Integer Icon;
    private String IconPhrase;
    private Integer PrecipitationProbability;
    private Integer Quarter;
    private Measurement Rain;
    private MeasurementRange RealFeelTemperature;
    private Integer RelativeHumidity;
    private Measurement Snow;
    private MeasurementRange Temperature;
    private Integer ThunderstormProbability;
    private Measurement TotalLiquid;
    private Measurement Visibility;
    private Wind Wind;
    private Wind WindGust;

    public QuarterResult()
    {
    }

    public static long getSerialVersionUID()
    {
        return 1L;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof QuarterResult))
            {
                return false;
            }
            obj = (QuarterResult)obj;
            if (CloudCover == null ? ((QuarterResult) (obj)).CloudCover != null : !CloudCover.equals(((QuarterResult) (obj)).CloudCover))
            {
                return false;
            }
            if (Date == null ? ((QuarterResult) (obj)).Date != null : !Date.equals(((QuarterResult) (obj)).Date))
            {
                return false;
            }
            if (DewPoint == null ? ((QuarterResult) (obj)).DewPoint != null : !DewPoint.equals(((QuarterResult) (obj)).DewPoint))
            {
                return false;
            }
            if (Ice == null ? ((QuarterResult) (obj)).Ice != null : !Ice.equals(((QuarterResult) (obj)).Ice))
            {
                return false;
            }
            if (Icon == null ? ((QuarterResult) (obj)).Icon != null : !Icon.equals(((QuarterResult) (obj)).Icon))
            {
                return false;
            }
            if (IconPhrase == null ? ((QuarterResult) (obj)).IconPhrase != null : !IconPhrase.equals(((QuarterResult) (obj)).IconPhrase))
            {
                return false;
            }
            if (PrecipitationProbability == null ? ((QuarterResult) (obj)).PrecipitationProbability != null : !PrecipitationProbability.equals(((QuarterResult) (obj)).PrecipitationProbability))
            {
                return false;
            }
            if (Quarter == null ? ((QuarterResult) (obj)).Quarter != null : !Quarter.equals(((QuarterResult) (obj)).Quarter))
            {
                return false;
            }
            if (Rain == null ? ((QuarterResult) (obj)).Rain != null : !Rain.equals(((QuarterResult) (obj)).Rain))
            {
                return false;
            }
            if (RealFeelTemperature == null ? ((QuarterResult) (obj)).RealFeelTemperature != null : !RealFeelTemperature.equals(((QuarterResult) (obj)).RealFeelTemperature))
            {
                return false;
            }
            if (RelativeHumidity == null ? ((QuarterResult) (obj)).RelativeHumidity != null : !RelativeHumidity.equals(((QuarterResult) (obj)).RelativeHumidity))
            {
                return false;
            }
            if (Snow == null ? ((QuarterResult) (obj)).Snow != null : !Snow.equals(((QuarterResult) (obj)).Snow))
            {
                return false;
            }
            if (Temperature == null ? ((QuarterResult) (obj)).Temperature != null : !Temperature.equals(((QuarterResult) (obj)).Temperature))
            {
                return false;
            }
            if (ThunderstormProbability == null ? ((QuarterResult) (obj)).ThunderstormProbability != null : !ThunderstormProbability.equals(((QuarterResult) (obj)).ThunderstormProbability))
            {
                return false;
            }
            if (TotalLiquid == null ? ((QuarterResult) (obj)).TotalLiquid != null : !TotalLiquid.equals(((QuarterResult) (obj)).TotalLiquid))
            {
                return false;
            }
            if (Visibility == null ? ((QuarterResult) (obj)).Visibility != null : !Visibility.equals(((QuarterResult) (obj)).Visibility))
            {
                return false;
            }
            if (Wind == null ? ((QuarterResult) (obj)).Wind != null : !Wind.equals(((QuarterResult) (obj)).Wind))
            {
                return false;
            }
            if (WindGust == null ? ((QuarterResult) (obj)).WindGust != null : !WindGust.equals(((QuarterResult) (obj)).WindGust))
            {
                return false;
            }
        }
        return true;
    }

    public Integer getCloudCover()
    {
        return CloudCover;
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

    public String getDate()
    {
        return Date;
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

    public Integer getIcon()
    {
        return Icon;
    }

    public String getIconPhrase()
    {
        return IconPhrase;
    }

    public String getPrecipProbability_string()
    {
        return (new StringBuilder()).append(getPrecipitationProbability()).append("").toString();
    }

    public Integer getPrecipitationProbability()
    {
        return PrecipitationProbability;
    }

    public Integer getQuarter()
    {
        return Quarter;
    }

    public Measurement getRain()
    {
        return Rain;
    }

    public String getRainForAlarm()
    {
        return (new StringBuilder()).append(getRain().getValue()).append("").toString();
    }

    public MeasurementRange getRealFeelTemperature()
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

    public MeasurementRange getTemperature()
    {
        return Temperature;
    }

    public Integer getThunderstormProbability()
    {
        return ThunderstormProbability;
    }

    public Measurement getTotalLiquid()
    {
        return TotalLiquid;
    }

    public String getTstorm_string()
    {
        return null;
    }

    public Measurement getVisibility()
    {
        return Visibility;
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
        int j4 = 0;
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
        if (Date != null)
        {
            i = Date.hashCode();
        } else
        {
            i = 0;
        }
        if (Quarter != null)
        {
            j = Quarter.hashCode();
        } else
        {
            j = 0;
        }
        if (Icon != null)
        {
            k = Icon.hashCode();
        } else
        {
            k = 0;
        }
        if (IconPhrase != null)
        {
            l = IconPhrase.hashCode();
        } else
        {
            l = 0;
        }
        if (Temperature != null)
        {
            i1 = Temperature.hashCode();
        } else
        {
            i1 = 0;
        }
        if (RealFeelTemperature != null)
        {
            j1 = RealFeelTemperature.hashCode();
        } else
        {
            j1 = 0;
        }
        if (DewPoint != null)
        {
            k1 = DewPoint.hashCode();
        } else
        {
            k1 = 0;
        }
        if (RelativeHumidity != null)
        {
            l1 = RelativeHumidity.hashCode();
        } else
        {
            l1 = 0;
        }
        if (Wind != null)
        {
            i2 = Wind.hashCode();
        } else
        {
            i2 = 0;
        }
        if (WindGust != null)
        {
            j2 = WindGust.hashCode();
        } else
        {
            j2 = 0;
        }
        if (Visibility != null)
        {
            k2 = Visibility.hashCode();
        } else
        {
            k2 = 0;
        }
        if (CloudCover != null)
        {
            l2 = CloudCover.hashCode();
        } else
        {
            l2 = 0;
        }
        if (PrecipitationProbability != null)
        {
            i3 = PrecipitationProbability.hashCode();
        } else
        {
            i3 = 0;
        }
        if (ThunderstormProbability != null)
        {
            j3 = ThunderstormProbability.hashCode();
        } else
        {
            j3 = 0;
        }
        if (TotalLiquid != null)
        {
            k3 = TotalLiquid.hashCode();
        } else
        {
            k3 = 0;
        }
        if (Rain != null)
        {
            l3 = Rain.hashCode();
        } else
        {
            l3 = 0;
        }
        if (Snow != null)
        {
            i4 = Snow.hashCode();
        } else
        {
            i4 = 0;
        }
        if (Ice != null)
        {
            j4 = Ice.hashCode();
        }
        return ((((((((((((((((i * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31 + j3) * 31 + k3) * 31 + l3) * 31 + i4) * 31 + j4;
    }

    public void setCloudCover(Integer integer)
    {
        CloudCover = integer;
    }

    public void setDate(String s)
    {
        Date = s;
    }

    public void setDewPoint(Measurement measurement)
    {
        DewPoint = measurement;
    }

    public void setIce(Measurement measurement)
    {
        Ice = measurement;
    }

    public void setIcon(Integer integer)
    {
        Icon = integer;
    }

    public void setIconPhrase(String s)
    {
        IconPhrase = s;
    }

    public void setPrecipitationProbability(Integer integer)
    {
        PrecipitationProbability = integer;
    }

    public void setQuarter(Integer integer)
    {
        Quarter = integer;
    }

    public void setRain(Measurement measurement)
    {
        Rain = measurement;
    }

    public void setRealFeelTemperature(MeasurementRange measurementrange)
    {
        RealFeelTemperature = measurementrange;
    }

    public void setRelativeHumidity(Integer integer)
    {
        RelativeHumidity = integer;
    }

    public void setSnow(Measurement measurement)
    {
        Snow = measurement;
    }

    public void setTemperature(MeasurementRange measurementrange)
    {
        Temperature = measurementrange;
    }

    public void setThunderstormProbability(Integer integer)
    {
        ThunderstormProbability = integer;
    }

    public void setTotalLiquid(Measurement measurement)
    {
        TotalLiquid = measurement;
    }

    public void setVisibility(Measurement measurement)
    {
        Visibility = measurement;
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
        return (new StringBuilder()).append("QuarterResult{Date='").append(Date).append('\'').append(", Quarter=").append(Quarter).append(", Icon=").append(Icon).append(", IconPhrase='").append(IconPhrase).append('\'').append(", Temperature=").append(Temperature).append(", RealFeelTemperature=").append(RealFeelTemperature).append(", DewPoint=").append(DewPoint).append(", RelativeHumidity=").append(RelativeHumidity).append(", Wind=").append(Wind).append(", WindGust=").append(WindGust).append(", Visibility=").append(Visibility).append(", CloudCover=").append(CloudCover).append(", PrecipitationProbability=").append(PrecipitationProbability).append(", ThunderstormProbability=").append(ThunderstormProbability).append(", TotalLiquid=").append(TotalLiquid).append(", Rain=").append(Rain).append(", Snow=").append(Snow).append(", Ice=").append(Ice).append('}').toString();
    }
}
