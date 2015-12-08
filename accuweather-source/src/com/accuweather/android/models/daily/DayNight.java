// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.daily;

import android.content.Context;
import com.accuweather.android.enums.ForecastModelType;
import com.accuweather.android.models.Direction;
import com.accuweather.android.models.Measurement;
import com.accuweather.android.models.Wind;
import com.accuweather.android.utilities.ConversionUtilities;
import com.accuweather.android.utilities.UserPreferences;
import java.io.Serializable;

// Referenced classes of package com.accuweather.android.models.daily:
//            ForecastValues

public class DayNight
    implements Serializable, ForecastValues
{

    private static final long serialVersionUID = 1L;
    private Integer CloudCover;
    private Double HoursOfPrecipitation;
    private Double HoursOfRain;
    private Measurement Ice;
    private Integer IceProbability;
    private Integer Icon;
    private String IconPhrase;
    private String LongPhrase;
    private Integer PrecipitationProbability;
    private Measurement Rain;
    private Integer RainProbability;
    private String ShortPhrase;
    private Measurement Snow;
    private Integer SnowProbability;
    private Integer ThunderstormProbability;
    private Measurement TotalLiquid;
    private Wind Wind;
    private Wind WindGust;

    public DayNight()
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
        obj = (DayNight)obj;
        if (CloudCover == null)
        {
            if (((DayNight) (obj)).CloudCover != null)
            {
                return false;
            }
        } else
        if (!CloudCover.equals(((DayNight) (obj)).CloudCover))
        {
            return false;
        }
        if (HoursOfPrecipitation == null)
        {
            if (((DayNight) (obj)).HoursOfPrecipitation != null)
            {
                return false;
            }
        } else
        if (!HoursOfPrecipitation.equals(((DayNight) (obj)).HoursOfPrecipitation))
        {
            return false;
        }
        if (HoursOfRain == null)
        {
            if (((DayNight) (obj)).HoursOfRain != null)
            {
                return false;
            }
        } else
        if (!HoursOfRain.equals(((DayNight) (obj)).HoursOfRain))
        {
            return false;
        }
        if (Ice == null)
        {
            if (((DayNight) (obj)).Ice != null)
            {
                return false;
            }
        } else
        if (!Ice.equals(((DayNight) (obj)).Ice))
        {
            return false;
        }
        if (IceProbability == null)
        {
            if (((DayNight) (obj)).IceProbability != null)
            {
                return false;
            }
        } else
        if (!IceProbability.equals(((DayNight) (obj)).IceProbability))
        {
            return false;
        }
        if (Icon == null)
        {
            if (((DayNight) (obj)).Icon != null)
            {
                return false;
            }
        } else
        if (!Icon.equals(((DayNight) (obj)).Icon))
        {
            return false;
        }
        if (IconPhrase == null)
        {
            if (((DayNight) (obj)).IconPhrase != null)
            {
                return false;
            }
        } else
        if (!IconPhrase.equals(((DayNight) (obj)).IconPhrase))
        {
            return false;
        }
        if (LongPhrase == null)
        {
            if (((DayNight) (obj)).LongPhrase != null)
            {
                return false;
            }
        } else
        if (!LongPhrase.equals(((DayNight) (obj)).LongPhrase))
        {
            return false;
        }
        if (PrecipitationProbability == null)
        {
            if (((DayNight) (obj)).PrecipitationProbability != null)
            {
                return false;
            }
        } else
        if (!PrecipitationProbability.equals(((DayNight) (obj)).PrecipitationProbability))
        {
            return false;
        }
        if (Rain == null)
        {
            if (((DayNight) (obj)).Rain != null)
            {
                return false;
            }
        } else
        if (!Rain.equals(((DayNight) (obj)).Rain))
        {
            return false;
        }
        if (RainProbability == null)
        {
            if (((DayNight) (obj)).RainProbability != null)
            {
                return false;
            }
        } else
        if (!RainProbability.equals(((DayNight) (obj)).RainProbability))
        {
            return false;
        }
        if (ShortPhrase == null)
        {
            if (((DayNight) (obj)).ShortPhrase != null)
            {
                return false;
            }
        } else
        if (!ShortPhrase.equals(((DayNight) (obj)).ShortPhrase))
        {
            return false;
        }
        if (Snow == null)
        {
            if (((DayNight) (obj)).Snow != null)
            {
                return false;
            }
        } else
        if (!Snow.equals(((DayNight) (obj)).Snow))
        {
            return false;
        }
        if (SnowProbability == null)
        {
            if (((DayNight) (obj)).SnowProbability != null)
            {
                return false;
            }
        } else
        if (!SnowProbability.equals(((DayNight) (obj)).SnowProbability))
        {
            return false;
        }
        if (ThunderstormProbability == null)
        {
            if (((DayNight) (obj)).ThunderstormProbability != null)
            {
                return false;
            }
        } else
        if (!ThunderstormProbability.equals(((DayNight) (obj)).ThunderstormProbability))
        {
            return false;
        }
        if (TotalLiquid == null)
        {
            if (((DayNight) (obj)).TotalLiquid != null)
            {
                return false;
            }
        } else
        if (!TotalLiquid.equals(((DayNight) (obj)).TotalLiquid))
        {
            return false;
        }
        if (Wind == null)
        {
            if (((DayNight) (obj)).Wind != null)
            {
                return false;
            }
        } else
        if (!Wind.equals(((DayNight) (obj)).Wind))
        {
            return false;
        }
        if (WindGust != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((DayNight) (obj)).WindGust == null) goto _L1; else goto _L3
_L3:
        return false;
        if (WindGust.equals(((DayNight) (obj)).WindGust)) goto _L1; else goto _L4
_L4:
        return false;
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
        return ConversionUtilities.convertSnow((new StringBuilder()).append(getSnow().getValue()).append("").toString(), integer.intValue(), context, UserPreferences.getMeasurement(context), ForecastModelType.HALFDAY_FORECAST_MODEL);
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

    public Double getHoursOfPrecipitation()
    {
        return HoursOfPrecipitation;
    }

    public Double getHoursOfRain()
    {
        return HoursOfRain;
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

    public Integer getIcon()
    {
        return Icon;
    }

    public String getIconPhrase()
    {
        return IconPhrase;
    }

    public String getLongPhrase()
    {
        return LongPhrase;
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

    public String getShortPhrase()
    {
        return ShortPhrase;
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

    public Integer getThunderstormProbability()
    {
        return ThunderstormProbability;
    }

    public Measurement getTotalLiquid()
    {
        return TotalLiquid;
    }

    public int getTstorm()
    {
        return getThunderstormProbability().intValue();
    }

    public String getTstorm_string()
    {
        return Integer.toString(getThunderstormProbability().intValue());
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
        if (CloudCover == null)
        {
            i = 0;
        } else
        {
            i = CloudCover.hashCode();
        }
        if (HoursOfPrecipitation == null)
        {
            j = 0;
        } else
        {
            j = HoursOfPrecipitation.hashCode();
        }
        if (HoursOfRain == null)
        {
            k = 0;
        } else
        {
            k = HoursOfRain.hashCode();
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
        if (Icon == null)
        {
            j1 = 0;
        } else
        {
            j1 = Icon.hashCode();
        }
        if (IconPhrase == null)
        {
            k1 = 0;
        } else
        {
            k1 = IconPhrase.hashCode();
        }
        if (LongPhrase == null)
        {
            l1 = 0;
        } else
        {
            l1 = LongPhrase.hashCode();
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
        if (ShortPhrase == null)
        {
            l2 = 0;
        } else
        {
            l2 = ShortPhrase.hashCode();
        }
        if (Snow == null)
        {
            i3 = 0;
        } else
        {
            i3 = Snow.hashCode();
        }
        if (SnowProbability == null)
        {
            j3 = 0;
        } else
        {
            j3 = SnowProbability.hashCode();
        }
        if (ThunderstormProbability == null)
        {
            k3 = 0;
        } else
        {
            k3 = ThunderstormProbability.hashCode();
        }
        if (TotalLiquid == null)
        {
            l3 = 0;
        } else
        {
            l3 = TotalLiquid.hashCode();
        }
        if (Wind == null)
        {
            i4 = 0;
        } else
        {
            i4 = Wind.hashCode();
        }
        if (WindGust != null)
        {
            j4 = WindGust.hashCode();
        }
        return (((((((((((((((((i + 31) * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31 + j3) * 31 + k3) * 31 + l3) * 31 + i4) * 31 + j4;
    }

    public void setCloudCover(Integer integer)
    {
        CloudCover = integer;
    }

    public void setHoursOfPrecipitation(Double double1)
    {
        HoursOfPrecipitation = double1;
    }

    public void setHoursOfRain(Double double1)
    {
        HoursOfRain = double1;
    }

    public void setIce(Measurement measurement)
    {
        Ice = measurement;
    }

    public void setIceProbability(Integer integer)
    {
        IceProbability = integer;
    }

    public void setIcon(Integer integer)
    {
        Icon = integer;
    }

    public void setIconPhrase(String s)
    {
        IconPhrase = s;
    }

    public void setLongPhrase(String s)
    {
        LongPhrase = s;
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

    public void setShortPhrase(String s)
    {
        ShortPhrase = s;
    }

    public void setSnow(Measurement measurement)
    {
        Snow = measurement;
    }

    public void setSnowProbability(Integer integer)
    {
        SnowProbability = integer;
    }

    public void setThunderstormProbability(Integer integer)
    {
        ThunderstormProbability = integer;
    }

    public void setTotalLiquid(Measurement measurement)
    {
        TotalLiquid = measurement;
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
        return (new StringBuilder()).append("DayNight [Icon=").append(Icon).append(", IconPhrase=").append(IconPhrase).append(", ShortPhrase=").append(ShortPhrase).append(", LongPhrase=").append(LongPhrase).append(", PrecipitationProbability=").append(PrecipitationProbability).append(", ThunderstormProbability=").append(ThunderstormProbability).append(", RainProbability=").append(RainProbability).append(", SnowProbability=").append(SnowProbability).append(", IceProbability=").append(IceProbability).append(", Wind=").append(Wind).append(", WindGust=").append(WindGust).append(", TotalLiquid=").append(TotalLiquid).append(", Rain=").append(Rain).append(", Snow=").append(Snow).append(", Ice=").append(Ice).append(", HoursOfPrecipitation=").append(HoursOfPrecipitation).append(", HoursOfRain=").append(HoursOfRain).append(", CloudCover=").append(CloudCover).append("]").toString();
    }
}
