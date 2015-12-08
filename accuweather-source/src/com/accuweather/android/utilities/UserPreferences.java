// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import android.content.Context;

// Referenced classes of package com.accuweather.android.utilities:
//            PreferenceUtils

public class UserPreferences
{

    public UserPreferences()
    {
    }

    private static String getCurrentFormat(String s, Context context)
    {
        return PreferenceUtils.get(context, s, context.getString(com.accuweather.android.R.string.default_metric));
    }

    private static String getDefaultPressureFormat(String s)
    {
        String s1 = s;
        if (s.equals(Constants.Units.StringValue.METRIC))
        {
            s1 = Constants.Units.PressureUnits.StringValue.MB;
        }
        return s1;
    }

    public static String getDirectionalUnit(Context context)
    {
        return getCurrentFormat("pref_wind_direction", context);
    }

    public static int getDirectionalUnitInt(Context context)
    {
        return Integer.parseInt(getDirectionalUnit(context));
    }

    public static int getMeasurement(Context context)
    {
        return Integer.parseInt(getCurrentFormat("pref_measurement", context));
    }

    public static int getMetricIntPreference(Context context)
    {
        return Integer.parseInt(getMetricStringPreference(context));
    }

    private static String getMetricStringPreference(Context context)
    {
        return PreferenceUtils.get(context, "pref_temp_units", context.getString(com.accuweather.android.R.string.default_metric));
    }

    public static String getPressureFormat(Context context)
    {
        return PreferenceUtils.get(context, "pref_pressure", getDefaultPressureFormat(context.getString(com.accuweather.android.R.string.default_metric)));
    }

    public static int getPressureFormatInt(Context context)
    {
        return Integer.parseInt(getPressureFormat(context));
    }

    public static String getVisibilityUnit(boolean flag, Context context)
    {
        if (flag)
        {
            return context.getString(com.accuweather.android.R.string.KM);
        } else
        {
            return context.getString(com.accuweather.android.R.string.mi);
        }
    }

    public static String getWindSpeedFormat(Context context)
    {
        return getCurrentFormat("pref_speed", context);
    }

    public static int getWindSpeedFormatInt(Context context)
    {
        return Integer.parseInt(getWindSpeedFormat(context));
    }

    public static boolean isDatePreferenceImperial(Context context)
    {
        return getCurrentFormat("pref_date", context).equals("0");
    }

    public static boolean isMetric(Context context)
    {
        return getMetricIntPreference(context) == 1;
    }

    public static boolean isTwelveHourFormat(Context context)
    {
        return getCurrentFormat("pref_time", context).equals("0");
    }

    private static void setDateFormat(String s, Context context)
    {
        PreferenceUtils.save(context, "pref_date", s);
    }

    public static void setDirectionalUnit(String s, Context context)
    {
        PreferenceUtils.save(context, "pref_wind_direction", s);
    }

    private static void setMeasurement(String s, Context context)
    {
        PreferenceUtils.save(context, "pref_measurement", s);
    }

    public static void setMetric(String s, Context context)
    {
        String s1 = getDefaultPressureFormat(s);
        PreferenceUtils.save(context, "pref_temp_units", s);
        setMeasurement(s, context);
        setDateFormat(s, context);
        setSpeedFormat(s, context);
        setPressureFormat(s1, context);
        setTimeFormat(s, context);
        setDirectionalUnit(s, context);
    }

    private static void setPressureFormat(String s, Context context)
    {
        PreferenceUtils.save(context, "pref_pressure", s);
    }

    private static void setSpeedFormat(String s, Context context)
    {
        PreferenceUtils.save(context, "pref_speed", s);
    }

    private static void setTimeFormat(String s, Context context)
    {
        PreferenceUtils.save(context, "pref_time", s);
    }
}
