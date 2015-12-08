// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.parsers;

import com.accuweather.android.models.MeasurementRange;
import com.accuweather.android.models.quarter.QuarterResult;
import com.accuweather.android.models.quarter.QuarterResults;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;

// Referenced classes of package com.accuweather.android.parsers:
//            BaseJsonParser

public class QuartersParser extends BaseJsonParser
{

    private static final String AVERAGE_JSON_NAME = "Average";
    private static final String CLOUD_COVER_JSON_NAME = "CloudCover";
    private static final String DATE_JSON_NAME = "Date";
    private static final String DEW_POINT_JSON_NAME = "DewPoint";
    private static final String ICE_JSON_NAME = "Ice";
    private static final String ICON_JSON_NAME = "Icon";
    private static final String ICON_PHRASE_JSON_NAME = "IconPhrase";
    private static final String MAXIMUM_JSON_NAME = "Maximum";
    private static final String MINIMUM_JSON_NAME = "Minimum";
    private static final String PRECIPITATION_PROBABILITY_JSON_NAME = "PrecipitationProbability";
    private static final String QUARTER_JSON_NAME = "Quarter";
    private static final String RAIN_JSON_NAME = "Rain";
    private static final String REAL_FEEL_TEMPERATURE_JSON_NAME = "RealFeelTemperature";
    private static final String RELATIVE_HUMIDITY_JSON_NAME = "RelativeHumidity";
    private static final String SNOW_JSON_NAME = "Snow";
    private static final String TEMPERATURE_JSON_NAME = "Temperature";
    private static final String THUNDERSTORM_PROBABILITY_JSON_NAME = "ThunderstormProbability";
    private static final String TOTAL_LIQUID_JSON_NAME = "TotalLiquid";
    private static final String VISIBILITY_JSON_NAME = "Visibility";
    private static final String WIND_GUST_JSON_NAME = "WindGust";
    private static final String WIND_JSON_NAME = "Wind";

    public QuartersParser()
    {
    }

    private MeasurementRange parseMeasurementRange(JsonReader jsonreader)
        throws IOException
    {
        MeasurementRange measurementrange = new MeasurementRange();
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
                if (s.equals("Minimum"))
                {
                    measurementrange.setMinimum(parseMeasurement(jsonreader));
                } else
                if (s.equals("Maximum"))
                {
                    measurementrange.setMaximum(parseMeasurement(jsonreader));
                } else
                if (s.equals("Average"))
                {
                    measurementrange.setAverage(parseMeasurement(jsonreader));
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
            return measurementrange;
        }
        return measurementrange;
    }

    private QuarterResult parseQuarter(JsonReader jsonreader)
        throws IOException
    {
        QuarterResult quarterresult = new QuarterResult();
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
                if (s.equals("Date"))
                {
                    quarterresult.setDate(jsonreader.nextString());
                } else
                if (s.equals("Quarter"))
                {
                    quarterresult.setQuarter(Integer.valueOf(jsonreader.nextInt()));
                } else
                if (s.equals("Icon"))
                {
                    quarterresult.setIcon(Integer.valueOf(jsonreader.nextInt()));
                } else
                if (s.equals("IconPhrase"))
                {
                    quarterresult.setIconPhrase(jsonreader.nextString());
                } else
                if (s.equals("Temperature"))
                {
                    quarterresult.setTemperature(parseMeasurementRange(jsonreader));
                } else
                if (s.equals("RealFeelTemperature"))
                {
                    quarterresult.setRealFeelTemperature(parseMeasurementRange(jsonreader));
                } else
                if (s.equals("DewPoint"))
                {
                    quarterresult.setDewPoint(parseMeasurement(jsonreader));
                } else
                if (s.equals("Wind"))
                {
                    quarterresult.setWind(parseWind(jsonreader));
                } else
                if (s.equals("WindGust"))
                {
                    quarterresult.setWindGust(parseWind(jsonreader));
                } else
                if (s.equals("RelativeHumidity"))
                {
                    quarterresult.setRelativeHumidity(Integer.valueOf(jsonreader.nextInt()));
                } else
                if (s.equals("Visibility"))
                {
                    quarterresult.setVisibility(parseMeasurement(jsonreader));
                } else
                if (s.equals("CloudCover"))
                {
                    quarterresult.setCloudCover(Integer.valueOf(jsonreader.nextInt()));
                } else
                if (s.equals("ThunderstormProbability"))
                {
                    quarterresult.setThunderstormProbability(Integer.valueOf(jsonreader.nextInt()));
                } else
                if (s.equals("PrecipitationProbability"))
                {
                    quarterresult.setPrecipitationProbability(Integer.valueOf(jsonreader.nextInt()));
                } else
                if (s.equals("TotalLiquid"))
                {
                    quarterresult.setTotalLiquid(parseMeasurement(jsonreader));
                } else
                if (s.equals("Rain"))
                {
                    quarterresult.setRain(parseMeasurement(jsonreader));
                } else
                if (s.equals("Snow"))
                {
                    quarterresult.setSnow(parseMeasurement(jsonreader));
                } else
                if (s.equals("Ice"))
                {
                    quarterresult.setIce(parseMeasurement(jsonreader));
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
            return quarterresult;
        }
        return quarterresult;
    }

    public QuarterResults parse(JsonReader jsonreader)
        throws IOException
    {
        QuarterResults quarterresults = new QuarterResults();
        if (jsonreader.peek() == JsonToken.BEGIN_ARRAY)
        {
            jsonreader.beginArray();
            for (; jsonreader.hasNext(); quarterresults.add(parseQuarter(jsonreader))) { }
            jsonreader.endArray();
        } else
        if (jsonreader.hasNext())
        {
            jsonreader.skipValue();
            return quarterresults;
        }
        return quarterresults;
    }

    public volatile Object parse(JsonReader jsonreader)
        throws IOException
    {
        return parse(jsonreader);
    }
}
