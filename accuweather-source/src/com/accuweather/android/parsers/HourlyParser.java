// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.parsers;

import com.accuweather.android.models.hourly.HourlyResult;
import com.accuweather.android.models.hourly.HourlyResults;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;

// Referenced classes of package com.accuweather.android.parsers:
//            BaseJsonParser

public class HourlyParser extends BaseJsonParser
{

    private static final String DATE_TIME_JSON_NAME = "DateTime";
    private static final String DEW_POINT_JSON_NAME = "DewPoint";
    private static final String EPOCH_DATE_TIME_JSON_NAME = "EpochDateTime";
    private static final String ICE_JSON_NAME = "Ice";
    private static final String ICE_PROBABILITY_JSON_NAME = "IceProbability";
    private static final String ICON_PHRASE_JSON_NAME = "IconPhrase";
    private static final String LINK_JSON_NAME = "Link";
    private static final String MOBILE_LINK_JSON_NAME = "MobileLink";
    private static final String PRECIPITATION_PROBABILITY_JSON_NAME = "PrecipitationProbability";
    private static final String RAIN_JSON_NAME = "Rain";
    private static final String RAIN_PROBABILITY_JSON_NAME = "RainProbability";
    private static final String REAL_FEEL_TEMPERATURE_JSON_NAME = "RealFeelTemperature";
    private static final String RELATIVE_HUMIDITY_JSON_NAME = "RelativeHumidity";
    private static final String SNOW_JSON_NAME = "Snow";
    private static final String SNOW_PROBABILITY_JSON_NAME = "SnowProbability";
    private static final String TEMPERATURE_JSON_NAME = "Temperature";
    private static final String TOTAL_LIQUID_JSON_NAME = "TotalLiquid";
    private static final String UV_INDEX_JSON_NAME = "UVIndex";
    private static final String UV_INDEX_TEXT_JSON_NAME = "UVIndexText";
    private static final String VISIBILITY_JSON_NAME = "Visibility";
    private static final String WEATHER_ICON_JSON_NAME = "WeatherIcon";
    private static final String WIND_GUST_JSON_NAME = "WindGust";
    private static final String WIND_JSON_NAME = "Wind";

    public HourlyParser()
    {
    }

    private HourlyResult parseHourly(JsonReader jsonreader)
        throws IOException
    {
        HourlyResult hourlyresult = new HourlyResult();
        if (jsonreader.peek() == JsonToken.BEGIN_OBJECT)
        {
            jsonreader.beginObject();
            while (jsonreader.hasNext()) 
            {
                String s = jsonreader.nextName();
                if (jsonreader.hasNext() && jsonreader.peek() == JsonToken.NULL)
                {
                    jsonreader.skipValue();
                } else
                if (s.equals("DateTime"))
                {
                    hourlyresult.setDateTime(jsonreader.nextString());
                } else
                if (s.equals("EpochDateTime"))
                {
                    hourlyresult.setEpochDateTime(Long.valueOf(jsonreader.nextLong() * 1000L));
                } else
                if (s.equals("WeatherIcon"))
                {
                    hourlyresult.setWeatherIcon(jsonreader.nextString());
                } else
                if (s.equals("IconPhrase"))
                {
                    hourlyresult.setIconPhrase(jsonreader.nextString());
                } else
                if (s.equals("Temperature"))
                {
                    hourlyresult.setTemperature(parseMeasurement(jsonreader));
                } else
                if (s.equals("RealFeelTemperature"))
                {
                    hourlyresult.setRealFeelTemperature(parseMeasurement(jsonreader));
                } else
                if (s.equals("DewPoint"))
                {
                    hourlyresult.setDewPoint(parseMeasurement(jsonreader));
                } else
                if (s.equals("Wind"))
                {
                    hourlyresult.setWind(parseWind(jsonreader));
                } else
                if (s.equals("WindGust"))
                {
                    hourlyresult.setWindGust(parseWind(jsonreader));
                } else
                if (s.equals("RelativeHumidity"))
                {
                    hourlyresult.setRelativeHumidity(Integer.valueOf(jsonreader.nextInt()));
                } else
                if (s.equals("Visibility"))
                {
                    hourlyresult.setVisibility(parseMeasurement(jsonreader));
                } else
                if (s.equals("UVIndex"))
                {
                    hourlyresult.setUVIndex(Integer.valueOf(jsonreader.nextInt()));
                } else
                if (s.equals("UVIndexText"))
                {
                    hourlyresult.setUVIndexText(jsonreader.nextString());
                } else
                if (s.equals("PrecipitationProbability"))
                {
                    hourlyresult.setPrecipitationProbability(Integer.valueOf(jsonreader.nextInt()));
                } else
                if (s.equals("RainProbability"))
                {
                    hourlyresult.setRainProbability(Integer.valueOf(jsonreader.nextInt()));
                } else
                if (s.equals("SnowProbability"))
                {
                    hourlyresult.setSnowProbability(Integer.valueOf(jsonreader.nextInt()));
                } else
                if (s.equals("IceProbability"))
                {
                    hourlyresult.setIceProbability(Integer.valueOf(jsonreader.nextInt()));
                } else
                if (s.equals("TotalLiquid"))
                {
                    hourlyresult.setTotalLiquid(parseMeasurement(jsonreader));
                } else
                if (s.equals("Rain"))
                {
                    hourlyresult.setRain(parseMeasurement(jsonreader));
                } else
                if (s.equals("Snow"))
                {
                    hourlyresult.setSnow(parseMeasurement(jsonreader));
                } else
                if (s.equals("Ice"))
                {
                    hourlyresult.setIce(parseMeasurement(jsonreader));
                } else
                if (s.equals("MobileLink"))
                {
                    hourlyresult.setMobileLink(jsonreader.nextString());
                } else
                if (s.equals("Link"))
                {
                    hourlyresult.setLink(jsonreader.nextString());
                } else
                {
                    jsonreader.skipValue();
                }
            }
            jsonreader.endObject();
        } else
        if (jsonreader.hasNext())
        {
            jsonreader.skipValue();
            return hourlyresult;
        }
        return hourlyresult;
    }

    public HourlyResults parse(JsonReader jsonreader)
        throws IOException
    {
        HourlyResults hourlyresults = new HourlyResults();
        if (jsonreader.peek() == JsonToken.BEGIN_ARRAY)
        {
            jsonreader.beginArray();
            for (; jsonreader.hasNext(); hourlyresults.add(parseHourly(jsonreader))) { }
            jsonreader.endArray();
        } else
        if (jsonreader.hasNext())
        {
            jsonreader.skipValue();
            return hourlyresults;
        }
        return hourlyresults;
    }

    public volatile Object parse(JsonReader jsonreader)
        throws IOException
    {
        return parse(jsonreader);
    }
}
