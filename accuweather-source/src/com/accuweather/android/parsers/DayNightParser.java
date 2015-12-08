// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.parsers;

import com.accuweather.android.models.daily.DayNight;
import com.google.gson.stream.JsonReader;
import java.io.IOException;

// Referenced classes of package com.accuweather.android.parsers:
//            BaseJsonParser

public class DayNightParser extends BaseJsonParser
{

    private static final String CLOUD_COVER_JSON_NAME = "CloudCover";
    private static final String HOURS_OF_PRECIP_JSON_NAME = "HoursOfPrecipitation";
    private static final String HOURS_OF_RAIN_JSON_NAME = "HoursOfRain";
    private static final String ICE_JSON_NAME = "Ice";
    private static final String ICE_PROBABILITY_JSON_NAME = "IceProbability";
    private static final String ICON_JSON_NAME = "Icon";
    private static final String ICON_PHRASE_JSON_NAME = "IconPhrase";
    private static final String LONG_PHRASE_JSON_NAME = "LongPhrase";
    private static final String PRECIPITATION_PROBABILITY_JSON_NAME = "PrecipitationProbability";
    private static final String RAIN_JSON_NAME = "Rain";
    private static final String RAIN_PROBABILITY_JSON_NAME = "RainProbability";
    private static final String SHORT_PHRASE_JSON_NAME = "ShortPhrase";
    private static final String SNOW_JSON_NAME = "Snow";
    private static final String SNOW_PROBABILITY_JSON_NAME = "SnowProbability";
    private static final String THUNDERSTORM_PROBABILITY_JSON_NAME = "ThunderstormProbability";
    private static final String TOTAL_LIQUID_JSON_NAME = "TotalLiquid";
    private static final String WIND_GUST_JSON_NAME = "WindGust";
    private static final String WIND_JSON_NAME = "Wind";

    public DayNightParser()
    {
    }

    public DayNight parse(JsonReader jsonreader)
        throws IOException
    {
        DayNight daynight = new DayNight();
        jsonreader.beginObject();
        while (jsonreader.hasNext()) 
        {
            String s = jsonreader.nextName();
            if (s.equals("Icon"))
            {
                daynight.setIcon(Integer.valueOf(jsonreader.nextInt()));
            } else
            if (s.equals("IconPhrase"))
            {
                daynight.setIconPhrase(jsonreader.nextString());
            } else
            if (s.equals("ShortPhrase"))
            {
                daynight.setShortPhrase(jsonreader.nextString());
            } else
            if (s.equals("LongPhrase"))
            {
                daynight.setLongPhrase(jsonreader.nextString());
            } else
            if (s.equals("PrecipitationProbability"))
            {
                daynight.setPrecipitationProbability(Integer.valueOf(jsonreader.nextInt()));
            } else
            if (s.equals("ThunderstormProbability"))
            {
                daynight.setThunderstormProbability(Integer.valueOf(jsonreader.nextInt()));
            } else
            if (s.equals("RainProbability"))
            {
                daynight.setRainProbability(Integer.valueOf(jsonreader.nextInt()));
            } else
            if (s.equals("SnowProbability"))
            {
                daynight.setSnowProbability(Integer.valueOf(jsonreader.nextInt()));
            } else
            if (s.equals("IceProbability"))
            {
                daynight.setIceProbability(Integer.valueOf(jsonreader.nextInt()));
            } else
            if (s.equals("Wind"))
            {
                daynight.setWind(parseWind(jsonreader));
            } else
            if (s.equals("WindGust"))
            {
                daynight.setWindGust(parseWind(jsonreader));
            } else
            if (s.equals("TotalLiquid"))
            {
                daynight.setTotalLiquid(parseMeasurement(jsonreader));
            } else
            if (s.equals("Rain"))
            {
                daynight.setRain(parseMeasurement(jsonreader));
            } else
            if (s.equals("Snow"))
            {
                daynight.setSnow(parseMeasurement(jsonreader));
            } else
            if (s.equals("Ice"))
            {
                daynight.setIce(parseMeasurement(jsonreader));
            } else
            if (s.equals("HoursOfPrecipitation"))
            {
                daynight.setHoursOfPrecipitation(Double.valueOf(jsonreader.nextDouble()));
            } else
            if (s.equals("HoursOfRain"))
            {
                daynight.setHoursOfRain(Double.valueOf(jsonreader.nextDouble()));
            } else
            if (s.equals("CloudCover"))
            {
                daynight.setCloudCover(Integer.valueOf(jsonreader.nextInt()));
            } else
            {
                jsonreader.skipValue();
            }
        }
        jsonreader.endObject();
        return daynight;
    }

    public volatile Object parse(JsonReader jsonreader)
        throws IOException
    {
        return parse(jsonreader);
    }
}
