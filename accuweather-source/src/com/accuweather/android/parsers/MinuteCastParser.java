// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.parsers;

import android.text.TextUtils;
import com.accuweather.android.models.minutecast.Color;
import com.accuweather.android.models.minutecast.Intervals;
import com.accuweather.android.models.minutecast.MinuteCastPrecipitationType;
import com.accuweather.android.models.minutecast.MinuteCastResult;
import com.accuweather.android.models.minutecast.MinuteCastThresholdType;
import com.accuweather.android.models.minutecast.Summaries;
import com.accuweather.android.models.minutecast.Summary;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.accuweather.android.parsers:
//            BaseJsonParser

public class MinuteCastParser extends BaseJsonParser
{

    private static final String BLUE_JSON_NAME = "Blue";
    private static final String CODE_JSON_PHRASE = "Code";
    private static final String COLOR_JSON_NAME = "Color";
    private static final String COUNT_MINUTE_JSON_NAME = "CountMinute";
    private static final String DBZ_JSON_NAME = "Dbz";
    private static final String END_MINUTE_JSON_NAME = "EndMinute";
    private static final String GREEN_JSON_NAME = "Green";
    private static final String HEX_JSON_NAME = "Hex";
    private static final String INTERVALS_JSON_NAME = "Intervals";
    private static final String MINUTES_TEXT_JSON_NAME = "MinutesText";
    private static final String MINUTE_JSON_NAME = "Minute";
    private static final String MINUTE_TEXT_JSON_NAME = "MinuteText";
    private static final String PHRASE_60_JSON_NAME = "Phrase_60";
    private static final String PHRASE_JSON_NAME = "Phrase";
    private static final String PRECIPITATION_TYPE_JSON_PHRASE = "PrecipitationType";
    private static final String RED_JSON_NAME = "Red";
    private static final String SHORT_PHRASE_JSON_NAME = "ShortPhrase";
    private static final String SIMPLIFIED_COLOR_JSON_NAME = "SimplifiedColor";
    private static final String START_DATE_TIME_JSON_NAME = "StartDateTime";
    private static final String START_EPOCH_DATE_TIME_JSON_NAME = "StartEpochDateTime";
    private static final String START_MINUTE_JSON_NAME = "StartMinute";
    private static final String SUMMARIES_JSON_NAME = "Summaries";
    private static final String SUMMARY_JSON_NAME = "Summary";
    private static final String THRESHOLD_JSON_NAME = "Threshold";

    public MinuteCastParser()
    {
    }

    private Color parseColor(JsonReader jsonreader)
        throws IOException
    {
        if (jsonreader.peek() == JsonToken.NULL)
        {
            return null;
        }
        Color color = new Color();
        jsonreader.beginObject();
        while (jsonreader.hasNext()) 
        {
            String s = jsonreader.nextName();
            if (s.equals("Red"))
            {
                color.setRed(Integer.valueOf(jsonreader.nextInt()));
            } else
            if (s.equals("Green"))
            {
                color.setGreen(Integer.valueOf(jsonreader.nextInt()));
            } else
            if (s.equals("Blue"))
            {
                color.setBlue(Integer.valueOf(jsonreader.nextInt()));
            } else
            if (s.equals("Hex"))
            {
                color.setHex(jsonreader.nextString());
            } else
            {
                jsonreader.skipValue();
            }
        }
        jsonreader.endObject();
        return color;
    }

    private MinuteCastPrecipitationType parseMinuteCastPrecipitation(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return MinuteCastPrecipitationType.DRY;
        }
        if (s.equalsIgnoreCase("rain"))
        {
            return MinuteCastPrecipitationType.RAIN;
        }
        if (s.equalsIgnoreCase("snow"))
        {
            return MinuteCastPrecipitationType.SNOW;
        }
        if (s.equalsIgnoreCase("mix"))
        {
            return MinuteCastPrecipitationType.MIX;
        }
        if (s.equalsIgnoreCase("ice"))
        {
            return MinuteCastPrecipitationType.ICE;
        } else
        {
            return MinuteCastPrecipitationType.DRY;
        }
    }

    private MinuteCastThresholdType parseMinuteCastThreshold(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return MinuteCastThresholdType.NONE;
        }
        if (s.equalsIgnoreCase("light"))
        {
            return MinuteCastThresholdType.LIGHT;
        }
        if (s.equalsIgnoreCase("light-moderate"))
        {
            return MinuteCastThresholdType.LIGHT_MODERATE;
        }
        if (s.equalsIgnoreCase("moderate"))
        {
            return MinuteCastThresholdType.MODERATE;
        }
        if (s.equalsIgnoreCase("heavy"))
        {
            return MinuteCastThresholdType.HEAVY;
        } else
        {
            return MinuteCastThresholdType.NONE;
        }
    }

    private Summary parseSummary(JsonReader jsonreader)
        throws IOException
    {
        if (jsonreader.peek() == JsonToken.NULL)
        {
            return null;
        }
        Summary summary = new Summary();
        jsonreader.beginObject();
        while (jsonreader.hasNext()) 
        {
            String s = jsonreader.nextName();
            if (s.equals("Phrase"))
            {
                summary.setPhrase(jsonreader.nextString());
            } else
            if (s.equals("Phrase_60"))
            {
                summary.setPhrase_60(jsonreader.nextString());
            } else
            {
                jsonreader.skipValue();
            }
        }
        jsonreader.endObject();
        return summary;
    }

    public MinuteCastResult parse(JsonReader jsonreader)
        throws IOException
    {
        MinuteCastResult minutecastresult = new MinuteCastResult();
        jsonreader.beginObject();
        while (jsonreader.hasNext()) 
        {
            if (jsonreader.peek() == JsonToken.NULL)
            {
                jsonreader.skipValue();
            } else
            {
                String s = jsonreader.nextName();
                if (s.equals("Summary") && jsonreader.peek() == JsonToken.BEGIN_OBJECT)
                {
                    minutecastresult.setSummary(parseSummary(jsonreader));
                } else
                if (s.equals("Summaries"))
                {
                    minutecastresult.setSummaries(parseListSummaries(jsonreader));
                } else
                if (s.equals("Intervals"))
                {
                    minutecastresult.setIntervals(parseListIntervals(jsonreader));
                } else
                if (s.equals("Code"))
                {
                    jsonreader.endObject();
                } else
                {
                    jsonreader.skipValue();
                }
            }
        }
        jsonreader.endObject();
        return minutecastresult;
    }

    public volatile Object parse(JsonReader jsonreader)
        throws IOException
    {
        return parse(jsonreader);
    }

    protected Intervals parseIntervals(JsonReader jsonreader)
        throws IOException
    {
        if (jsonreader.peek() == JsonToken.NULL)
        {
            return null;
        }
        Intervals intervals = new Intervals();
        jsonreader.beginObject();
        while (jsonreader.hasNext()) 
        {
            String s = jsonreader.nextName();
            if (s.equals("StartDateTime"))
            {
                intervals.setStartDateTime(jsonreader.nextString());
            } else
            if (s.equals("StartEpochDateTime"))
            {
                intervals.setStartEpochDateTime(Long.valueOf(jsonreader.nextLong()));
            } else
            if (s.equals("Minute"))
            {
                intervals.setMinute(Integer.valueOf(jsonreader.nextInt()));
            } else
            if (s.equals("Dbz"))
            {
                intervals.setDbz(Double.valueOf(jsonreader.nextDouble()));
            } else
            if (s.equals("ShortPhrase"))
            {
                intervals.setShortPhrase(jsonreader.nextString());
            } else
            if (s.equals("Threshold"))
            {
                intervals.setThreshold(parseMinuteCastThreshold(jsonreader.nextString()));
            } else
            if (s.equals("PrecipitationType"))
            {
                intervals.setPrecipitationType(parseMinuteCastPrecipitation(jsonreader.nextString()));
            } else
            if (s.equals("Color"))
            {
                intervals.setColor(parseColor(jsonreader));
            } else
            if (s.equals("SimplifiedColor"))
            {
                intervals.setSimplifiedColor(parseColor(jsonreader));
            } else
            {
                jsonreader.skipValue();
            }
        }
        jsonreader.endObject();
        return intervals;
    }

    protected List parseListIntervals(JsonReader jsonreader)
        throws IOException
    {
        if (jsonreader.peek() == JsonToken.NULL)
        {
            return null;
        }
        ArrayList arraylist = new ArrayList();
        jsonreader.beginArray();
        for (; jsonreader.hasNext(); arraylist.add(parseIntervals(jsonreader))) { }
        jsonreader.endArray();
        return arraylist;
    }

    protected List parseListSummaries(JsonReader jsonreader)
        throws IOException
    {
        if (jsonreader.peek() == JsonToken.NULL)
        {
            return null;
        }
        ArrayList arraylist = new ArrayList();
        jsonreader.beginArray();
        for (; jsonreader.hasNext(); arraylist.add(parseSummaries(jsonreader))) { }
        jsonreader.endArray();
        return arraylist;
    }

    public Summaries parseSummaries(JsonReader jsonreader)
        throws IOException
    {
        Summaries summaries = new Summaries();
        jsonreader.beginObject();
        while (jsonreader.hasNext()) 
        {
            String s = jsonreader.nextName();
            if (s.equals("StartMinute"))
            {
                summaries.setStartMinute(Integer.valueOf(jsonreader.nextInt()));
            } else
            if (s.equals("EndMinute"))
            {
                summaries.setEndMinute(Integer.valueOf(jsonreader.nextInt()));
            } else
            if (s.equals("CountMinute"))
            {
                summaries.setCountMinute(Integer.valueOf(jsonreader.nextInt()));
            } else
            if (s.equals("MinuteText"))
            {
                summaries.setMinuteText(jsonreader.nextString());
            } else
            if (s.equals("MinutesText"))
            {
                summaries.setMinutesText(jsonreader.nextString());
            } else
            {
                jsonreader.skipValue();
            }
        }
        jsonreader.endObject();
        return summaries;
    }
}
