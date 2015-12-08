// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.location.GeocodedAddress;
import com.accuweather.android.models.minutecast.Intervals;
import com.accuweather.android.models.minutecast.MinuteCastPrecipitationType;
import com.accuweather.android.models.minutecast.MinuteCastResult;
import com.accuweather.android.models.minutecast.Summary;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.accuweather.android.utilities:
//            DateUtils, UserPreferences

public class MinuteCastUtilities
{

    private static final String GEOCODER_CANADA_COUNTRY = "canada";
    private static final String GEOCODER_US_COUNTRY = "United States";
    private static final String LOCATION_API_ALASKA_STATE = "ak";
    private static final String LOCATION_API_BELGIUM = "be";
    private static final String LOCATION_API_CANADA_COUNTRY = "ca";
    private static final String LOCATION_API_CZCECH = "cz";
    private static final String LOCATION_API_FRANCE = "fr";
    private static final String LOCATION_API_GERMANY = "de";
    private static final String LOCATION_API_HAWAII_STATE = "hi";
    private static final String LOCATION_API_IRELAND_STATE = "ie";
    private static final String LOCATION_API_JAPAN_STATE = "jp";
    private static final String LOCATION_API_LUXEMBOURG = "lu";
    private static final String LOCATION_API_NETHERLANDS = "nl";
    private static final String LOCATION_API_SPAIN = "es";
    private static final String LOCATION_API_SWITZERLAND = "ch";
    private static final String LOCATION_API_UK_COUNTRY = "gb";
    private static final String LOCATION_API_US_COUNTRY = "us";
    private static final String NATIVE_GEOCODER_ALASKA = "alaska";
    private static final String NATIVE_GEOCODER_HAWAII = "hawaii";
    public static final int NUMBER_OF_MINUTES = 120;
    private static int minuteCastdryColor = Color.parseColor("#4D011032");

    public MinuteCastUtilities()
    {
    }

    public static int[] getMinuteCastColors(WeatherDataModel weatherdatamodel)
    {
        return getMinuteCastColors(weatherdatamodel, minuteCastdryColor);
    }

    public static int[] getMinuteCastColors(WeatherDataModel weatherdatamodel, int i)
    {
        int ai[] = new int[120];
        for (int j = 0; j < ai.length; j++)
        {
            ai[j] = i;
        }

        if (weatherdatamodel != null && weatherdatamodel.getMinuteCastResult() != null)
        {
            weatherdatamodel = weatherdatamodel.getMinuteCastResult().getIntervals();
            if (weatherdatamodel != null)
            {
                for (i = 0; i < weatherdatamodel.size(); i++)
                {
                    if (i > ai.length - 1)
                    {
                        continue;
                    }
                    com.accuweather.android.models.minutecast.Color color = ((Intervals)weatherdatamodel.get(i)).getSimplifiedColor();
                    if (color != null)
                    {
                        ai[i] = Color.parseColor(color.getHex());
                    }
                }

            }
        }
        return ai;
    }

    public static List getMinuteCastSupportedAddresses(List list)
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < list.size(); i++)
        {
            if (isMinuteCastLocation(((GeocodedAddress)list.get(i)).getCountry(), ((GeocodedAddress)list.get(i)).getAdminArea()))
            {
                arraylist.add(list.get(i));
            }
        }

        return arraylist;
    }

    public static String getMinuteTime(Context context, WeatherDataModel weatherdatamodel, int i)
    {
        if (weatherdatamodel != null && weatherdatamodel.getMinuteCastResult() != null && weatherdatamodel.getMinuteCastResult().getIntervals() != null && weatherdatamodel.getMinuteCastResult().getIntervals().size() > i)
        {
            weatherdatamodel = ((Intervals)weatherdatamodel.getMinuteCastResult().getIntervals().get(i)).getStartDateTime();
            if (weatherdatamodel != null)
            {
                return getMinuteTime(context, ((String) (weatherdatamodel)));
            }
        }
        return context.getString(com.accuweather.android.R.string.NA);
    }

    public static String getMinuteTime(Context context, String s)
    {
        String s1 = DateUtils.to12HourTimeWithAmPm(s, context.getResources().getConfiguration().locale);
        s = DateUtils.to24HourTime(s);
        if (UserPreferences.isTwelveHourFormat(context))
        {
            return s1;
        } else
        {
            return s;
        }
    }

    public static String getShortPhrase(int i, WeatherDataModel weatherdatamodel)
    {
        if (weatherdatamodel != null && weatherdatamodel.getMinuteCastResult() != null)
        {
            weatherdatamodel = weatherdatamodel.getMinuteCastResult().getIntervals();
            if (weatherdatamodel != null && i <= weatherdatamodel.size() - 1)
            {
                weatherdatamodel = (Intervals)weatherdatamodel.get(i);
                if (weatherdatamodel.getShortPhrase() != null)
                {
                    return weatherdatamodel.getShortPhrase();
                }
            }
        }
        return "dry";
    }

    private static MinuteCastPrecipitationType getSinglePrecipitationType(MinuteCastResult minutecastresult)
    {
        if (minutecastresult.getSummaries().size() == 1)
        {
            List list = minutecastresult.getIntervals();
            if (list != null && !list.isEmpty())
            {
                return ((Intervals)minutecastresult.getIntervals().get(0)).getPrecipitationType();
            }
        }
        return null;
    }

    public static boolean hasMinuteCastResult(WeatherDataModel weatherdatamodel)
    {
        return weatherdatamodel.getMinuteCastResult().getIntervals().size() != 0;
    }

    public static boolean isAllDry(MinuteCastResult minutecastresult)
    {
        minutecastresult = getSinglePrecipitationType(minutecastresult);
        return minutecastresult != null && minutecastresult.equals(MinuteCastPrecipitationType.DRY);
    }

    public static boolean isAllSamePrecipitationType(MinuteCastResult minutecastresult)
    {
        minutecastresult = getSinglePrecipitationType(minutecastresult);
        return minutecastresult != null && !minutecastresult.equals(MinuteCastPrecipitationType.DRY);
    }

    public static boolean isMinuteCastLocation(WeatherDataModel weatherdatamodel)
    {
        if (weatherdatamodel != null)
        {
            return isMinuteCastLocation(weatherdatamodel.getCountry(), weatherdatamodel.getStateAbrev());
        } else
        {
            return false;
        }
    }

    public static boolean isMinuteCastLocation(String s, String s1)
    {
        boolean flag = true;
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (!"United States".equalsIgnoreCase(s) && !"us".equalsIgnoreCase(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (TextUtils.isEmpty(s1)) goto _L1; else goto _L3
_L3:
        if ("ak".equalsIgnoreCase(s1) || "hi".equalsIgnoreCase(s1) || "alaska".equalsIgnoreCase(s1) || "hawaii".equalsIgnoreCase(s1))
        {
            flag = false;
        }
        return flag;
        if (!"ca".equalsIgnoreCase(s) && !"canada".equalsIgnoreCase(s) && !"ie".equalsIgnoreCase(s) && !"jp".equalsIgnoreCase(s) && !"gb".equalsIgnoreCase(s) && !"be".equalsIgnoreCase(s) && !"fr".equalsIgnoreCase(s) && !"de".equalsIgnoreCase(s) && !"lu".equalsIgnoreCase(s) && !"nl".equalsIgnoreCase(s) && !"ch".equalsIgnoreCase(s) && !"es".equalsIgnoreCase(s) && !"cz".equalsIgnoreCase(s)) goto _L1; else goto _L4
_L4:
        return true;
    }

    public static boolean isMinuteCastSupportedLanguage()
    {
        return Locale.getDefault().getLanguage().startsWith("en");
    }

    public static boolean shouldShowMinuteCastSummaryText(WeatherDataModel weatherdatamodel)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (weatherdatamodel.getMinuteCastResult() != null)
        {
            flag = flag1;
            if (weatherdatamodel.getMinuteCastResult().getSummary() != null)
            {
                flag = flag1;
                if (!TextUtils.isEmpty(weatherdatamodel.getMinuteCastResult().getSummary().getPhrase()))
                {
                    flag = flag1;
                    if (!isAllDry(weatherdatamodel.getMinuteCastResult()))
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

}
