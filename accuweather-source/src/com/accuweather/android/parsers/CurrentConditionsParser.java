// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.parsers;

import com.accuweather.android.models.current.CurrentConditionsResult;
import com.accuweather.android.models.current.CurrentConditionsResults;
import com.accuweather.android.models.current.CurrentConditionsWind;
import com.accuweather.android.models.current.PressureTendency;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;

// Referenced classes of package com.accuweather.android.parsers:
//            BaseJsonParser

public class CurrentConditionsParser extends BaseJsonParser
{

    private static final String APPARENT_TEMPERATURE_JSON_NAME = "ApparentTemperature";
    private static final String CEILING_JSON_NAME = "Ceiling";
    private static final String CLOUD_COVER_JSON_NAME = "CloudCover";
    private static final String CODE_JSON_NAME = "Code";
    private static final String DEW_POINT_JSON_NAME = "DewPoint";
    private static final String DIRECTION_JSON_NAME = "Direction";
    private static final String EPOCH_TIME_JSON_NAME = "EpochTime";
    private static final String IS_DAY_TIME_JSON_NAME = "IsDayTime";
    private static final String LINK_JSON_NAME = "Link";
    private static final String LOCALIZED_TEXT_JSON_NAME = "LocalizedText";
    private static final String LOCAL_OBSERVATION_DATE_TIME_JSON_NAME = "LocalObservationDateTime";
    private static final String MOBILE_LINK_JSON_NAME = "MobileLink";
    private static final String OBSTRUCTIONS_TO_VISIBILITY_JSON_NAME = "ObstructionsToVisibility";
    private static final String PAST_24_HOUR_TEMPERATURE_DEPARTURE_JSON_NAME = "Past24HourTemperatureDeparture";
    private static final String PRESSURE_JSON_NAME = "Pressure";
    private static final String PRESSURE_TENDENCY_JSON_NAME = "PressureTendency";
    private static final String REAL_FEEL_TEMPERATURE_JSON_NAME = "RealFeelTemperature";
    private static final String REAL_FEEL_TEMPERATURE_SHADE_JSON_NAME = "RealFeelTemperatureShade";
    private static final String RELATIVE_HUMIDITY_JSON_NAME = "RelativeHumidity";
    private static final String SPEED_JSON_NAME = "Speed";
    private static final String TEMPERATURE_JSON_NAME = "Temperature";
    private static final String UV_INDEX_JSON_NAME = "UVIndex";
    private static final String UV_INDEX_TEXT_JSON_NAME = "UVIndexText";
    private static final String VISIBILITY_JSON_NAME = "Visibility";
    private static final String WEATHER_ICON_JSON_NAME = "WeatherIcon";
    private static final String WEATHER_TEXT_JSON_NAME = "WeatherText";
    private static final String WIND_CHILL_TEMPERATURE_JSON_NAME = "WindChillTemperature";
    private static final String WIND_GUST_JSON_NAME = "WindGust";
    private static final String WIND_JSON_NAME = "Wind";

    public CurrentConditionsParser()
    {
    }

    private CurrentConditionsResult parseCurrentConditionsResult(JsonReader jsonreader)
        throws IOException
    {
        CurrentConditionsResult currentconditionsresult = new CurrentConditionsResult();
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
                if (s.equals("LocalObservationDateTime"))
                {
                    currentconditionsresult.setLocalObservationDateTime(jsonreader.nextString());
                } else
                if (s.equals("EpochTime"))
                {
                    currentconditionsresult.setEpochTime(Long.valueOf(jsonreader.nextLong() * 1000L));
                } else
                if (s.equals("WeatherText"))
                {
                    currentconditionsresult.setWeatherText(jsonreader.nextString());
                } else
                if (s.equals("WeatherIcon"))
                {
                    currentconditionsresult.setWeatherIcon(Integer.valueOf(jsonreader.nextInt()));
                } else
                if (s.equals("IsDayTime"))
                {
                    currentconditionsresult.setDayTime(Boolean.valueOf(jsonreader.nextBoolean()));
                } else
                if (s.equals("Temperature"))
                {
                    currentconditionsresult.setTemperature(parseMetricImperial(jsonreader));
                } else
                if (s.equals("RealFeelTemperature"))
                {
                    currentconditionsresult.setRealFeelTemperature(parseMetricImperial(jsonreader));
                } else
                if (s.equals("RealFeelTemperatureShade"))
                {
                    currentconditionsresult.setRealFeelTemperatureShade(parseMetricImperial(jsonreader));
                } else
                if (s.equals("RelativeHumidity"))
                {
                    currentconditionsresult.setRelativeHumidity(Double.valueOf(jsonreader.nextDouble()));
                } else
                if (s.equals("DewPoint"))
                {
                    currentconditionsresult.setDewPoint(parseMetricImperial(jsonreader));
                } else
                if (s.equals("Wind"))
                {
                    currentconditionsresult.setWind(parseCurrentConditionsWind(jsonreader));
                } else
                if (s.equals("WindGust"))
                {
                    currentconditionsresult.setWindGust(parseCurrentConditionsWind(jsonreader));
                } else
                if (s.equals("UVIndex"))
                {
                    currentconditionsresult.setUVIndex(Integer.valueOf(jsonreader.nextInt()));
                } else
                if (s.equals("UVIndexText"))
                {
                    currentconditionsresult.setUVIndexText(jsonreader.nextString());
                } else
                if (s.equals("Visibility"))
                {
                    currentconditionsresult.setVisibility(parseMetricImperial(jsonreader));
                } else
                if (s.equals("ObstructionsToVisibility"))
                {
                    currentconditionsresult.setObstructionsToVisibility(jsonreader.nextString());
                } else
                if (s.equals("CloudCover"))
                {
                    currentconditionsresult.setCloudCover(jsonreader.nextString());
                } else
                if (s.equals("Ceiling"))
                {
                    currentconditionsresult.setCeiling(parseMetricImperial(jsonreader));
                } else
                if (s.equals("Pressure"))
                {
                    currentconditionsresult.setPressure(parseMetricImperial(jsonreader));
                } else
                if (s.equals("PressureTendency"))
                {
                    currentconditionsresult.setPressureTendency(parsePressureTendency(jsonreader));
                } else
                if (s.equals("Past24HourTemperatureDeparture"))
                {
                    currentconditionsresult.setPast24HourTemperatureDeparture(parseMetricImperial(jsonreader));
                } else
                if (s.equals("ApparentTemperature"))
                {
                    currentconditionsresult.setApparentTemperature(parseMetricImperial(jsonreader));
                } else
                if (s.equals("WindChillTemperature"))
                {
                    currentconditionsresult.setWindChillTemperature(parseMetricImperial(jsonreader));
                } else
                if (s.equals("MobileLink"))
                {
                    currentconditionsresult.setMobileLink(jsonreader.nextString());
                } else
                if (s.equals("Link"))
                {
                    currentconditionsresult.setLink(jsonreader.nextString());
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
            return currentconditionsresult;
        }
        return currentconditionsresult;
    }

    private CurrentConditionsWind parseCurrentConditionsWind(JsonReader jsonreader)
        throws IOException
    {
        CurrentConditionsWind currentconditionswind = new CurrentConditionsWind();
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
                if (s.equals("Direction"))
                {
                    currentconditionswind.setDirection(parseDirection(jsonreader));
                } else
                if (s.equals("Speed"))
                {
                    currentconditionswind.setSpeed(parseMetricImperial(jsonreader));
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
            return currentconditionswind;
        }
        return currentconditionswind;
    }

    private PressureTendency parsePressureTendency(JsonReader jsonreader)
        throws IOException
    {
        PressureTendency pressuretendency = new PressureTendency();
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
                if (s.equals("LocalizedText"))
                {
                    pressuretendency.setLocalizedText(jsonreader.nextString());
                } else
                if (s.equals("Code"))
                {
                    pressuretendency.setCode(jsonreader.nextString());
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
            return pressuretendency;
        }
        return pressuretendency;
    }

    public CurrentConditionsResults parse(JsonReader jsonreader)
        throws IOException
    {
        CurrentConditionsResults currentconditionsresults = new CurrentConditionsResults();
        if (jsonreader.peek() == JsonToken.BEGIN_ARRAY)
        {
            jsonreader.beginArray();
            for (; jsonreader.hasNext(); currentconditionsresults.add(parseCurrentConditionsResult(jsonreader))) { }
            jsonreader.endArray();
        } else
        if (jsonreader.hasNext())
        {
            jsonreader.skipValue();
            return currentconditionsresults;
        }
        return currentconditionsresults;
    }

    public volatile Object parse(JsonReader jsonreader)
        throws IOException
    {
        return parse(jsonreader);
    }
}
