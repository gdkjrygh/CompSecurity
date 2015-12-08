// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.hourly.HourlyResult;
import com.accuweather.android.models.hourly.HourlyResults;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.accuweather.android.utilities:
//            DateUtils, UserPreferences

public class GuiUtils
{

    private static final String JAPANESE_LANGUAGE_CODE = "ja";

    public GuiUtils()
    {
    }

    public static List buildHourlyTitles(boolean flag, Context context, WeatherDataModel weatherdatamodel)
    {
        if (weatherdatamodel.getHourly().size() != 0) goto _L2; else goto _L1
_L1:
        weatherdatamodel = new ArrayList();
_L4:
        return weatherdatamodel;
_L2:
        Resources resources = context.getResources();
        Locale locale = resources.getConfiguration().locale;
        String s1 = resources.getString(com.accuweather.android.R.string.Today);
        String s2 = resources.getString(com.accuweather.android.R.string.Tomorrow);
        ArrayList arraylist = new ArrayList();
        int j = getFirstHourOfDay(context, weatherdatamodel);
        HourlyResults hourlyresults = weatherdatamodel.getCappedHourlyModels();
        int i = 0;
        do
        {
            weatherdatamodel = arraylist;
            if (i >= hourlyresults.size())
            {
                continue;
            }
            weatherdatamodel = getTime((HourlyResult)hourlyresults.get(i), locale);
            String s = getAmPmDesignator(weatherdatamodel);
            int k = convertFrom12HourTo24HourFormat(parseHour(weatherdatamodel), s, context);
            StringBuilder stringbuilder;
            if (flag)
            {
                weatherdatamodel = weatherdatamodel.toLowerCase(locale);
            } else
            {
                weatherdatamodel = (new StringBuilder()).append(k).append(":00").toString();
            }
            stringbuilder = new StringBuilder();
            if (k >= j)
            {
                s = s1;
            } else
            {
                s = s2;
            }
            arraylist.add(stringbuilder.append(s).append(" ").append(weatherdatamodel).toString());
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static List buildHourlyTitlesAbbrev(boolean flag, Context context, WeatherDataModel weatherdatamodel)
    {
        if (weatherdatamodel.getHourly().size() != 0) goto _L2; else goto _L1
_L1:
        weatherdatamodel = new ArrayList();
_L4:
        return weatherdatamodel;
_L2:
        Resources resources = context.getResources();
        Locale locale = resources.getConfiguration().locale;
        String s6 = locale.getLanguage();
        String s = resources.getString(com.accuweather.android.R.string.Today).toUpperCase(locale);
        String s4 = resources.getString(com.accuweather.android.R.string.Tomorrow).toUpperCase(locale);
        String s5 = resources.getString(com.accuweather.android.R.string.tomorrow_abbrev).toUpperCase(locale);
        ArrayList arraylist = new ArrayList();
        int j = getFirstHourOfDay(context, weatherdatamodel);
        HourlyResults hourlyresults = weatherdatamodel.getCappedHourlyModels();
        int i = 0;
        do
        {
            weatherdatamodel = arraylist;
            if (i >= hourlyresults.size())
            {
                continue;
            }
            weatherdatamodel = getTime((HourlyResult)hourlyresults.get(i), locale);
            String s1 = getAmPmDesignator(weatherdatamodel);
            int k = convertFrom12HourTo24HourFormat(parseHour(weatherdatamodel), s1, context);
            if (flag)
            {
                weatherdatamodel = weatherdatamodel.toUpperCase(locale);
            } else
            {
                weatherdatamodel = (new StringBuilder()).append(k).append(":00").toString();
            }
            if (s6.equals("en"))
            {
                StringBuilder stringbuilder = new StringBuilder();
                String s2;
                if (k >= j)
                {
                    s2 = s;
                } else
                {
                    s2 = s5;
                }
                arraylist.add(stringbuilder.append(s2).append(" ").append(weatherdatamodel).toString());
            } else
            {
                StringBuilder stringbuilder1 = new StringBuilder();
                String s3;
                if (k >= j)
                {
                    s3 = s;
                } else
                {
                    s3 = s4;
                }
                arraylist.add(stringbuilder1.append(s3).append(" ").append(weatherdatamodel).toString());
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static List buildHourlyTitlesGraph(boolean flag, Context context, WeatherDataModel weatherdatamodel)
    {
        if (weatherdatamodel.getHourly().size() != 0) goto _L2; else goto _L1
_L1:
        weatherdatamodel = new ArrayList();
_L4:
        return weatherdatamodel;
_L2:
        ArrayList arraylist = new ArrayList();
        HourlyResults hourlyresults = weatherdatamodel.getCappedHourlyModels();
        Locale locale = context.getResources().getConfiguration().locale;
        int i = 0;
        do
        {
            weatherdatamodel = arraylist;
            if (i >= hourlyresults.size())
            {
                continue;
            }
            weatherdatamodel = getTime((HourlyResult)hourlyresults.get(i), locale);
            String s = getAmPmDesignator(weatherdatamodel);
            int j = convertFrom12HourTo24HourFormat(parseHour(weatherdatamodel), s, context);
            if (flag)
            {
                weatherdatamodel = Integer.toString(parseHour(weatherdatamodel));
            } else
            {
                weatherdatamodel = Integer.toString(j);
            }
            arraylist.add(weatherdatamodel);
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static int convertFrom12HourTo24HourFormat(int i, String s, Context context)
    {
        return DateUtils.convertFrom12HourTo24HourFormat(i, s, context);
    }

    private static String getAmPmDesignator(String s)
    {
        return DateUtils.getAmPmDesignator(s);
    }

    private static int getFirstHourOfDay(Context context, WeatherDataModel weatherdatamodel)
    {
        return DateUtils.getFirstHourOfDay(context, getTime((HourlyResult)weatherdatamodel.getHourly().get(0), context.getResources().getConfiguration().locale));
    }

    private static String getTime(HourlyResult hourlyresult, Locale locale)
    {
        return DateUtils.to12HourTimeNoMinutesWithAmPm(hourlyresult.getDateTime(), locale);
    }

    public static String getUpdateTimeText(Context context, WeatherDataModel weatherdatamodel)
    {
        String s1 = weatherdatamodel.getLocalObservationDateTime();
        String s = DateUtils.to12HourTimeWithAmPm(s1, context.getResources().getConfiguration().locale);
        s1 = DateUtils.to24HourTime(s1);
        if (!UserPreferences.isTwelveHourFormat(context))
        {
            s = s1;
        }
        if (weatherdatamodel.getLanguage() != null && !weatherdatamodel.getLanguage().equals("ja"))
        {
            return (new StringBuilder()).append(context.getString(com.accuweather.android.R.string.UpdatedAt)).append(" ").append(s).append(" ").append(weatherdatamodel.getTimeZoneAbbrev()).toString();
        } else
        {
            return (new StringBuilder()).append(s).append(" ").append(weatherdatamodel.getTimeZoneAbbrev()).toString();
        }
    }

    public static void hideVirtualKeyboard(View view, Activity activity)
    {
        InputMethodManager inputmethodmanager = (InputMethodManager)activity.getSystemService("input_method");
        if (view != null)
        {
            inputmethodmanager.hideSoftInputFromWindow(view.getWindowToken(), 2);
        } else
        {
            view = activity.getWindow().findViewById(0x1020002);
            if (view != null)
            {
                inputmethodmanager.hideSoftInputFromWindow(view.getWindowToken(), 2);
                return;
            }
        }
    }

    private static int parseHour(String s)
    {
        return DateUtils.parseHour(s);
    }
}
