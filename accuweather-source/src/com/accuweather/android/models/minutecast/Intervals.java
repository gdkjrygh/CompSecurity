// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.minutecast;

import java.io.Serializable;

// Referenced classes of package com.accuweather.android.models.minutecast:
//            MinuteCastThresholdType, MinuteCastPrecipitationType, Color

public class Intervals
    implements Serializable
{

    private static final long serialVersionUID = 0xf659c2fcfcdd74acL;
    private Color Color;
    private Double Dbz;
    private Integer Minute;
    private String ShortPhrase;
    private Color SimplifiedColor;
    private String StartDateTime;
    private Long StartEpochDateTime;
    private MinuteCastPrecipitationType precipitationType;
    private MinuteCastThresholdType threshold;

    public Intervals()
    {
        threshold = MinuteCastThresholdType.NONE;
        precipitationType = MinuteCastPrecipitationType.DRY;
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
            obj = (Intervals)obj;
            if (Color == null)
            {
                if (((Intervals) (obj)).Color != null)
                {
                    return false;
                }
            } else
            if (!Color.equals(((Intervals) (obj)).Color))
            {
                return false;
            }
            if (Dbz == null)
            {
                if (((Intervals) (obj)).Dbz != null)
                {
                    return false;
                }
            } else
            if (!Dbz.equals(((Intervals) (obj)).Dbz))
            {
                return false;
            }
            if (Minute == null)
            {
                if (((Intervals) (obj)).Minute != null)
                {
                    return false;
                }
            } else
            if (!Minute.equals(((Intervals) (obj)).Minute))
            {
                return false;
            }
            if (ShortPhrase == null)
            {
                if (((Intervals) (obj)).ShortPhrase != null)
                {
                    return false;
                }
            } else
            if (!ShortPhrase.equals(((Intervals) (obj)).ShortPhrase))
            {
                return false;
            }
            if (SimplifiedColor == null)
            {
                if (((Intervals) (obj)).SimplifiedColor != null)
                {
                    return false;
                }
            } else
            if (!SimplifiedColor.equals(((Intervals) (obj)).SimplifiedColor))
            {
                return false;
            }
            if (StartDateTime == null)
            {
                if (((Intervals) (obj)).StartDateTime != null)
                {
                    return false;
                }
            } else
            if (!StartDateTime.equals(((Intervals) (obj)).StartDateTime))
            {
                return false;
            }
            if (StartEpochDateTime == null)
            {
                if (((Intervals) (obj)).StartEpochDateTime != null)
                {
                    return false;
                }
            } else
            if (!StartEpochDateTime.equals(((Intervals) (obj)).StartEpochDateTime))
            {
                return false;
            }
            if (precipitationType != ((Intervals) (obj)).precipitationType)
            {
                return false;
            }
            if (threshold != ((Intervals) (obj)).threshold)
            {
                return false;
            }
        }
        return true;
    }

    public Color getColor()
    {
        return Color;
    }

    public Double getDbz()
    {
        return Dbz;
    }

    public Integer getMinute()
    {
        return Minute;
    }

    public MinuteCastPrecipitationType getPrecipitationType()
    {
        return precipitationType;
    }

    public String getShortPhrase()
    {
        return ShortPhrase;
    }

    public Color getSimplifiedColor()
    {
        return SimplifiedColor;
    }

    public String getStartDateTime()
    {
        return StartDateTime;
    }

    public Long getStartEpochDateTime()
    {
        return StartEpochDateTime;
    }

    public MinuteCastThresholdType getThreshold()
    {
        return threshold;
    }

    public int hashCode()
    {
        int i2 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        if (Color == null)
        {
            i = 0;
        } else
        {
            i = Color.hashCode();
        }
        if (Dbz == null)
        {
            j = 0;
        } else
        {
            j = Dbz.hashCode();
        }
        if (Minute == null)
        {
            k = 0;
        } else
        {
            k = Minute.hashCode();
        }
        if (ShortPhrase == null)
        {
            l = 0;
        } else
        {
            l = ShortPhrase.hashCode();
        }
        if (SimplifiedColor == null)
        {
            i1 = 0;
        } else
        {
            i1 = SimplifiedColor.hashCode();
        }
        if (StartDateTime == null)
        {
            j1 = 0;
        } else
        {
            j1 = StartDateTime.hashCode();
        }
        if (StartEpochDateTime == null)
        {
            k1 = 0;
        } else
        {
            k1 = StartEpochDateTime.hashCode();
        }
        if (precipitationType == null)
        {
            l1 = 0;
        } else
        {
            l1 = precipitationType.hashCode();
        }
        if (threshold != null)
        {
            i2 = threshold.hashCode();
        }
        return ((((((((i + 31) * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2;
    }

    public void setColor(Color color)
    {
        Color = color;
    }

    public void setDbz(Double double1)
    {
        Dbz = double1;
    }

    public void setMinute(Integer integer)
    {
        Minute = integer;
    }

    public void setPrecipitationType(MinuteCastPrecipitationType minutecastprecipitationtype)
    {
        precipitationType = minutecastprecipitationtype;
    }

    public void setShortPhrase(String s)
    {
        ShortPhrase = s;
    }

    public void setSimplifiedColor(Color color)
    {
        SimplifiedColor = color;
    }

    public void setStartDateTime(String s)
    {
        StartDateTime = s;
    }

    public void setStartEpochDateTime(Long long1)
    {
        StartEpochDateTime = long1;
    }

    public void setThreshold(MinuteCastThresholdType minutecastthresholdtype)
    {
        threshold = minutecastthresholdtype;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Intervals [StartDateTime=").append(StartDateTime).append(", StartEpochDateTime=").append(StartEpochDateTime).append(", Minute=").append(Minute).append(", Dbz=").append(Dbz).append(", ShortPhrase=").append(ShortPhrase).append(", threshold=").append(threshold).append(", precipitationType=").append(precipitationType).append(", Color=").append(Color).append(", SimplifiedColor=").append(SimplifiedColor).append("]").toString();
    }
}
