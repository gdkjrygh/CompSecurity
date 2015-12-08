// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.parsers;

import com.accuweather.android.models.MeasurementRange;
import com.accuweather.android.models.daily.AirAndPollen;
import com.accuweather.android.models.daily.DailyForecast;
import com.accuweather.android.models.daily.ForecastResult;
import com.accuweather.android.models.daily.Headline;
import com.accuweather.android.models.daily.Moon;
import com.accuweather.android.models.daily.Sun;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.accuweather.android.parsers:
//            BaseJsonParser, DayNightParser

public class ForecastParser extends BaseJsonParser
{

    private static final String AGE_JSON_NAME = "Age";
    private static final String AIR_AND_POLLEN_JSON_NAME = "AirAndPollen";
    private static final String CATEGORY_JSON_NAME = "Category";
    private static final String DAILY_FORECASTS_JSON_NAME = "DailyForecasts";
    private static final String DATE_JSON_NAME = "Date";
    private static final String DAY_JSON_NAME = "Day";
    private static final String EFFECTIVE_DATE_JSON_NAME = "EffectiveDate";
    private static final String EFFECTIVE_EPOCH_DATE_JSON_NAME = "EffectiveEpochDate";
    private static final String END_DATE_JSON_NAME = "EndDate";
    private static final String EPOCH_DATE_JSON_NAME = "EpochDate";
    private static final String EPOCH_RISE_JSON_NAME = "EpochRise";
    private static final String EPOCH_SET_JSON_NAME = "EpochSet";
    private static final String HEADLINE_JSON_NAME = "Headline";
    private static final String LINK_JSON_NAME = "Link";
    private static final String MAXIMUM_JSON_NAME = "Maximum";
    private static final String MINIMUM_JSON_NAME = "Minimum";
    private static final String MOBILE_LINK_JSON_NAME = "MobileLink";
    private static final String MOON_JSON_NAME = "Moon";
    private static final String NAME_JSON_NAME = "Name";
    private static final String NIGHT_JSON_NAME = "Night";
    private static final String PHASE_JSON_NAME = "Phase";
    private static final String REAL_FEEL_TEMPERATURE_JSON_NAME = "RealFeelTemperature";
    private static final String RISE_JSON_NAME = "Rise";
    private static final String SET_JSON_NAME = "Set";
    private static final String SEVERITY_JSON_NAME = "Severity";
    private static final String SOURCES_JSON_NAME = "Sources";
    private static final String SUN_JSON_NAME = "Sun";
    private static final String TEMPERATURE_JSON_NAME = "Temperature";
    private static final String TEXT_JSON_NAME = "Text";
    private static final String TYPE_JSON_NAME = "Type";
    private static final String VALUE_JSON_NAME = "Value";
    private DayNightParser dayNightParser;

    public ForecastParser()
    {
        dayNightParser = new DayNightParser();
    }

    private AirAndPollen parseAirAndPollen(JsonReader jsonreader)
        throws IOException
    {
        AirAndPollen airandpollen = new AirAndPollen();
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
                if (s.equals("Name"))
                {
                    airandpollen.setName(jsonreader.nextString());
                } else
                if (s.equals("Value"))
                {
                    airandpollen.setValue(jsonreader.nextString());
                } else
                if (s.equals("Category"))
                {
                    airandpollen.setCategory(jsonreader.nextString());
                } else
                if (s.equals("Type"))
                {
                    airandpollen.setType(jsonreader.nextString());
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
            return airandpollen;
        }
        return airandpollen;
    }

    private List parseAirAndPollens(JsonReader jsonreader)
        throws IOException
    {
        ArrayList arraylist = new ArrayList();
        if (jsonreader.peek() == JsonToken.BEGIN_ARRAY)
        {
            jsonreader.beginArray();
            for (; jsonreader.hasNext(); arraylist.add(parseAirAndPollen(jsonreader))) { }
            jsonreader.endArray();
        } else
        if (jsonreader.hasNext())
        {
            jsonreader.skipValue();
            return arraylist;
        }
        return arraylist;
    }

    private List parseDailyForecasts(JsonReader jsonreader)
        throws IOException
    {
        ArrayList arraylist = new ArrayList();
        if (jsonreader.peek() == JsonToken.BEGIN_ARRAY)
        {
            jsonreader.beginArray();
            for (; jsonreader.hasNext(); arraylist.add(parseDailyForecast(jsonreader))) { }
            jsonreader.endArray();
        } else
        if (jsonreader.hasNext())
        {
            jsonreader.skipValue();
            return arraylist;
        }
        return arraylist;
    }

    private Headline parseHeadline(JsonReader jsonreader)
        throws IOException
    {
        Headline headline = new Headline();
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
                if (s.equals("EffectiveDate"))
                {
                    headline.setEffectiveDate(jsonreader.nextString());
                } else
                if (s.equals("EffectiveEpochDate"))
                {
                    headline.setEffectiveEpochDate(Long.valueOf(jsonreader.nextLong() * 1000L));
                } else
                if (s.equals("Severity"))
                {
                    headline.setSeverity(Integer.valueOf(jsonreader.nextInt()));
                } else
                if (s.equals("Text"))
                {
                    headline.setText(jsonreader.nextString());
                } else
                if (s.equals("Category"))
                {
                    headline.setCategory(jsonreader.nextString());
                } else
                if (s.equals("EndDate"))
                {
                    headline.setEndDate(jsonreader.nextString());
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
            return headline;
        }
        return headline;
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

    private Moon parseMoon(JsonReader jsonreader)
        throws IOException
    {
        Moon moon = new Moon();
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
                if (s.equals("Rise") && jsonreader.peek() == JsonToken.STRING)
                {
                    moon.setRise(jsonreader.nextString());
                } else
                if (s.equals("EpochRise") && jsonreader.peek() == JsonToken.NUMBER)
                {
                    moon.setEpochRise(Long.valueOf(jsonreader.nextLong() * 1000L));
                } else
                if (s.equals("Set") && jsonreader.peek() == JsonToken.STRING)
                {
                    moon.setSet(jsonreader.nextString());
                } else
                if (s.equals("EpochSet") && jsonreader.peek() == JsonToken.NUMBER)
                {
                    moon.setEpochSet(Long.valueOf(jsonreader.nextLong() * 1000L));
                } else
                if (s.equals("Phase") && jsonreader.peek() == JsonToken.STRING)
                {
                    moon.setPhase(jsonreader.nextString());
                } else
                if (s.equals("Age") && jsonreader.peek() == JsonToken.NUMBER)
                {
                    moon.setAge(jsonreader.nextInt());
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
            return moon;
        }
        return moon;
    }

    private List parseSources(JsonReader jsonreader)
        throws IOException
    {
        ArrayList arraylist = new ArrayList();
        if (jsonreader.peek() == JsonToken.BEGIN_ARRAY)
        {
            jsonreader.beginArray();
            for (; jsonreader.hasNext(); arraylist.add(jsonreader.nextString())) { }
            jsonreader.endArray();
        } else
        if (jsonreader.hasNext())
        {
            jsonreader.skipValue();
            return arraylist;
        }
        return arraylist;
    }

    private Sun parseSun(JsonReader jsonreader)
        throws IOException
    {
        Sun sun = new Sun();
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
                if (s.equals("Rise") && jsonreader.peek() == JsonToken.STRING)
                {
                    sun.setRise(jsonreader.nextString());
                } else
                if (s.equals("EpochRise") && jsonreader.peek() == JsonToken.NUMBER)
                {
                    sun.setEpochRise(Long.valueOf(jsonreader.nextLong() * 1000L));
                } else
                if (s.equals("Set") && jsonreader.peek() == JsonToken.STRING)
                {
                    sun.setSet(jsonreader.nextString());
                } else
                if (s.equals("EpochSet") && jsonreader.peek() == JsonToken.NUMBER)
                {
                    sun.setEpochSet(Long.valueOf(jsonreader.nextLong() * 1000L));
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
            return sun;
        }
        return sun;
    }

    public ForecastResult parse(JsonReader jsonreader)
        throws IOException
    {
        ForecastResult forecastresult = new ForecastResult();
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
                if (s.equals("Headline"))
                {
                    forecastresult.setHeadline(parseHeadline(jsonreader));
                } else
                if (s.equals("DailyForecasts"))
                {
                    forecastresult.setDailyForecasts(parseDailyForecasts(jsonreader));
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
            return forecastresult;
        }
        return forecastresult;
    }

    public volatile Object parse(JsonReader jsonreader)
        throws IOException
    {
        return parse(jsonreader);
    }

    public DailyForecast parseDailyForecast(JsonReader jsonreader)
        throws IOException
    {
        DailyForecast dailyforecast = new DailyForecast();
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
                    dailyforecast.setDate(jsonreader.nextString());
                } else
                if (s.equals("EpochDate"))
                {
                    dailyforecast.setEpochDate(Long.valueOf(jsonreader.nextLong() * 1000L));
                } else
                if (s.equals("Sun") && jsonreader.peek() == JsonToken.BEGIN_OBJECT)
                {
                    dailyforecast.setSun(parseSun(jsonreader));
                } else
                if (s.equals("Moon") && jsonreader.peek() == JsonToken.BEGIN_OBJECT)
                {
                    dailyforecast.setMoon(parseMoon(jsonreader));
                } else
                if (s.equals("Temperature"))
                {
                    dailyforecast.setTemperature(parseMeasurementRange(jsonreader));
                } else
                if (s.equals("RealFeelTemperature"))
                {
                    dailyforecast.setRealFeelTemperature(parseMeasurementRange(jsonreader));
                } else
                if (s.equals("AirAndPollen"))
                {
                    dailyforecast.setAirAndPollen(parseAirAndPollens(jsonreader));
                } else
                if (s.equals("Day"))
                {
                    dailyforecast.setDay(dayNightParser.parse(jsonreader));
                } else
                if (s.equals("Night"))
                {
                    dailyforecast.setNight(dayNightParser.parse(jsonreader));
                } else
                if (s.equals("Sources"))
                {
                    dailyforecast.setSources(parseSources(jsonreader));
                } else
                if (s.equals("MobileLink") && jsonreader.peek() == JsonToken.STRING)
                {
                    dailyforecast.setMobileLink(jsonreader.nextString());
                } else
                if (s.equals("Link") && jsonreader.peek() == JsonToken.STRING)
                {
                    dailyforecast.setLink(jsonreader.nextString());
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
            return dailyforecast;
        }
        return dailyforecast;
    }
}
