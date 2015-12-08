// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.parsers;

import com.accuweather.android.models.Direction;
import com.accuweather.android.models.Measurement;
import com.accuweather.android.models.MetricImperial;
import com.accuweather.android.models.Wind;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;

public abstract class BaseJsonParser
{

    private static final String DEGREES_JSON_NAME = "Degrees";
    private static final String DIRECTION_JSON_NAME = "Direction";
    private static final String IMPERIAL_JSON_NAME = "Imperial";
    private static final String LOCALIZED_JSON_NAME = "Localized";
    private static final String METRIC_JSON_NAME = "Metric";
    private static final String SPEED_JSON_NAME = "Speed";
    private static final String UNIT_JSON_NAME = "Unit";
    private static final String UNIT_TYPE_JSON_NAME = "UnitType";
    private static final String VALUE_JSON_NAME = "Value";

    public BaseJsonParser()
    {
    }

    public abstract Object parse(JsonReader jsonreader)
        throws IOException;

    protected Direction parseDirection(JsonReader jsonreader)
        throws IOException
    {
        Direction direction = new Direction();
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
                if (s.equals("Degrees"))
                {
                    direction.setDegrees(Integer.valueOf(jsonreader.nextInt()));
                } else
                if (s.equals("Localized"))
                {
                    direction.setLocalized(jsonreader.nextString());
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
            return direction;
        }
        return direction;
    }

    protected Measurement parseMeasurement(JsonReader jsonreader)
        throws IOException
    {
        Measurement measurement = new Measurement();
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
                if (s.equals("Value"))
                {
                    measurement.setValue(Double.valueOf(jsonreader.nextDouble()));
                } else
                if (s.equals("Unit"))
                {
                    measurement.setUnit(jsonreader.nextString());
                } else
                if (s.equals("UnitType"))
                {
                    measurement.setUnitType(Integer.valueOf(jsonreader.nextInt()));
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
            return measurement;
        }
        return measurement;
    }

    protected MetricImperial parseMetricImperial(JsonReader jsonreader)
        throws IOException
    {
        MetricImperial metricimperial = new MetricImperial();
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
                if (s.equals("Metric"))
                {
                    metricimperial.setMetric(parseMeasurement(jsonreader));
                } else
                if (s.equals("Imperial"))
                {
                    metricimperial.setImperial(parseMeasurement(jsonreader));
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
            return metricimperial;
        }
        return metricimperial;
    }

    protected Wind parseWind(JsonReader jsonreader)
        throws IOException
    {
        Wind wind = new Wind();
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
                if (s.equals("Speed"))
                {
                    wind.setSpeed(parseMeasurement(jsonreader));
                } else
                if (s.equals("Direction"))
                {
                    wind.setDirection(parseDirection(jsonreader));
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
            return wind;
        }
        return wind;
    }
}
