// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.domain;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.fsr.tracker.domain:
//            SignificantEvent, SignificantEventThreshold

public class MeasureConfiguration
    implements Serializable, Comparable
{

    public static final int DEFAULT_MAX_DAYS_SINCE_FIRST_LAUNCH = 10;
    public static final int DEFAULT_MAX_LAUNCH_COUNT = 3;
    public static final String DEFAULT_MEASURE_NAME = "DEFAULT_MEASURE";
    private int maxDaysSinceLaunch;
    private int maxLaunchCount;
    private int maxSignificantEventsCount;
    private String name;
    private int sequence;
    private Map significantEventThresholds;
    private String surveyId;

    private MeasureConfiguration(String s, String s1, int i)
    {
        significantEventThresholds = new HashMap();
        name = s;
        surveyId = s1;
        sequence = i;
    }

    public static MeasureConfiguration base(String s, String s1, int i)
    {
        return new MeasureConfiguration(s, s1, i);
    }

    public static MeasureConfiguration defaultConfig(String s, String s1, int i)
    {
        s = base(s, s1, i);
        s.maxLaunchCount = 3;
        s.maxDaysSinceLaunch = 10;
        return s;
    }

    private boolean meetsFirstLaunchDateThreshold(Date date)
    {
        if (date != null)
        {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(5, maxDaysSinceLaunch);
            date = new Date();
            if (date.equals(calendar.getTime()) || date.after(calendar.getTime()))
            {
                return true;
            }
        }
        return false;
    }

    private boolean meetsLaunchCountThreshold(int i)
    {
        return i >= maxLaunchCount;
    }

    private boolean meetsSignificantEventsThreshold(Map map)
    {
        for (map = map.entrySet().iterator(); map.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            if (significantEventThresholds.containsKey(entry.getKey()) && ((SignificantEvent)entry.getValue()).getCount() >= ((SignificantEventThreshold)significantEventThresholds.get(entry.getKey())).getThreshold())
            {
                return true;
            }
        }

        return false;
    }

    public MeasureConfiguration addSignificantEventThreshold(String s, int i)
    {
        SignificantEventThreshold significanteventthreshold = new SignificantEventThreshold(s, i);
        significantEventThresholds.put(s, significanteventthreshold);
        return this;
    }

    public int compareTo(MeasureConfiguration measureconfiguration)
    {
        return sequence - measureconfiguration.sequence;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((MeasureConfiguration)obj);
    }

    public int getMaxDaysSinceLaunch()
    {
        return maxDaysSinceLaunch;
    }

    public int getMaxLaunchCount()
    {
        return maxLaunchCount;
    }

    public int getMaxSignificantEventsCount()
    {
        return maxSignificantEventsCount;
    }

    public String getName()
    {
        return name;
    }

    public int getSignificantEventThreshold(String s)
    {
        if (significantEventThresholds.containsKey(s))
        {
            return ((SignificantEventThreshold)significantEventThresholds.get(s)).getThreshold();
        } else
        {
            return 0;
        }
    }

    public String getSurveyId()
    {
        return surveyId;
    }

    public boolean isEligible(int i, Date date, Map map)
    {
        return meetsFirstLaunchDateThreshold(date) | meetsLaunchCountThreshold(i) | meetsSignificantEventsThreshold(map);
    }

    public MeasureConfiguration withMaxDaysSinceLaunch(int i)
    {
        maxDaysSinceLaunch = i;
        return this;
    }

    public MeasureConfiguration withMaxLaunchCount(int i)
    {
        maxLaunchCount = i;
        return this;
    }

    public MeasureConfiguration withMaxSignificantEventCount(int i)
    {
        maxSignificantEventsCount = i;
        return this;
    }
}
