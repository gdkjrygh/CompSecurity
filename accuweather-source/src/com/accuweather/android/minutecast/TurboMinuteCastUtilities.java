// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.minutecast;

import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.minutecast.Intervals;
import com.accuweather.android.models.minutecast.MinuteCastPrecipitationType;
import com.accuweather.android.models.minutecast.MinuteCastResult;
import com.accuweather.android.models.minutecast.MinuteCastThresholdType;
import com.accuweather.android.utilities.Utilities;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class TurboMinuteCastUtilities
{

    private static final Map precipTypeToIconName;
    private static final Map thresholdToIconName;

    public TurboMinuteCastUtilities()
    {
    }

    public static int getPrecipitationImageResourceId(int i, WeatherDataModel weatherdatamodel)
    {
        if (weatherdatamodel != null && weatherdatamodel.getMinuteCastResult() != null)
        {
            weatherdatamodel = weatherdatamodel.getMinuteCastResult().getIntervals();
            if (weatherdatamodel != null && i <= weatherdatamodel.size() - 1)
            {
                weatherdatamodel = (Intervals)weatherdatamodel.get(i);
                if (weatherdatamodel.getPrecipitationType() == MinuteCastPrecipitationType.DRY || weatherdatamodel.getThreshold() == MinuteCastThresholdType.NONE)
                {
                    return com.accuweather.android.R.drawable.ic_minute_cast_no_precip;
                }
                StringBuilder stringbuilder = new StringBuilder();
                stringbuilder.append("ic_minute_cast_");
                stringbuilder.append((String)precipTypeToIconName.get(weatherdatamodel.getPrecipitationType())).append("_");
                if (weatherdatamodel.getThreshold() != MinuteCastThresholdType.NONE)
                {
                    stringbuilder.append((String)thresholdToIconName.get(weatherdatamodel.getThreshold()));
                }
                return Utilities.getDrawableId(stringbuilder.toString());
            }
        }
        return com.accuweather.android.R.drawable.ic_minute_cast_no_precip;
    }

    static 
    {
        precipTypeToIconName = new EnumMap(com/accuweather/android/models/minutecast/MinuteCastPrecipitationType);
        precipTypeToIconName.put(MinuteCastPrecipitationType.SNOW, "snow");
        precipTypeToIconName.put(MinuteCastPrecipitationType.RAIN, "rain");
        precipTypeToIconName.put(MinuteCastPrecipitationType.MIX, "mix");
        precipTypeToIconName.put(MinuteCastPrecipitationType.ICE, "ice");
        thresholdToIconName = new EnumMap(com/accuweather/android/models/minutecast/MinuteCastThresholdType);
        thresholdToIconName.put(MinuteCastThresholdType.LIGHT, "default");
        thresholdToIconName.put(MinuteCastThresholdType.LIGHT_MODERATE, "light");
        thresholdToIconName.put(MinuteCastThresholdType.MODERATE, "medium");
        thresholdToIconName.put(MinuteCastThresholdType.HEAVY, "heavy");
    }
}
