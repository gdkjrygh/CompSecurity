// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import android.content.Context;
import android.net.Uri;
import com.accuweather.android.models.current.CurrentConditionsResult;
import com.accuweather.android.models.current.CurrentConditionsResults;
import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.models.photos.PhotoResults;
import com.accuweather.android.models.photos.PhotoUtilities;
import com.accuweather.android.parsers.PhotoParser;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.accuweather.android.services:
//            BaseDataRetrievalService, IPhotoService

public class PhotoService extends BaseDataRetrievalService
    implements IPhotoService
{

    private static final String ANIMATION_FRIENDLY = "210";
    private static final String DAY_TAG = "D";
    private static String DETAILS_TAG = "details=";
    private static String EXACT_MATCH_TAG = "exactMatch";
    private static final String FALL_TAG = "F";
    private static final String NIGHT_TAG = "N";
    private static final String PHOTO_URL = "http://api.accuweather.com/imagery/v1/photos/";
    private static final String SPRING_TAG = "P";
    private static final String SUMMER_TAG = "U";
    private static final String UNIVERSAL_TAG = "211";
    private static final String WINTER_TAG = "W";
    private Context mContext;
    private PhotoParser photoParser;

    public PhotoService(Context context)
    {
        photoParser = new PhotoParser();
        mContext = context;
    }

    private String buildTags(String s, CurrentConditionsResults currentconditionsresults)
        throws ParseException
    {
        if (currentconditionsresults != null)
        {
            String s1 = "";
            List list = Arrays.asList(new Integer[] {
                Integer.valueOf(12), Integer.valueOf(13), Integer.valueOf(14), Integer.valueOf(15), Integer.valueOf(16), Integer.valueOf(17), Integer.valueOf(18), Integer.valueOf(19), Integer.valueOf(20), Integer.valueOf(21), 
                Integer.valueOf(22), Integer.valueOf(23), Integer.valueOf(24), Integer.valueOf(25), Integer.valueOf(26), Integer.valueOf(29), Integer.valueOf(39), Integer.valueOf(40), Integer.valueOf(41), Integer.valueOf(42), 
                Integer.valueOf(43)
            });
            CurrentConditionsResult currentconditionsresult = (CurrentConditionsResult)currentconditionsresults.get(0);
            Integer integer = currentconditionsresult.getWeatherIcon();
            String s2;
            int i;
            if (currentconditionsresult.isDayTime().booleanValue())
            {
                currentconditionsresults = "D";
            } else
            {
                currentconditionsresults = "N";
            }
            s2 = getWeatherTag(Integer.toString(integer.intValue()));
            s = getSeasonTag(parseTimeStamp(currentconditionsresult.getLocalObservationDateTime()), s);
            if (list.contains(integer))
            {
                s = Arrays.asList(new String[] {
                    currentconditionsresults, s, s2, "210", "211"
                });
            } else
            {
                s = Arrays.asList(new String[] {
                    currentconditionsresults, s, s2, "211"
                });
            }
            Collections.sort(s);
            i = 0;
            currentconditionsresults = s1;
            for (; i < s.size(); i++)
            {
                currentconditionsresults = (new StringBuilder()).append(currentconditionsresults).append(",").append((String)s.get(i)).toString();
            }

            return currentconditionsresults.substring(1);
        } else
        {
            return "";
        }
    }

    private String getSeasonTag(Calendar calendar, String s)
    {
        s = Data.getInstance(mContext).getLocationFromKey(s);
        try
        {
            calendar = PhotoUtilities.getSeason(calendar, s.getLatitude().doubleValue());
        }
        // Misplaced declaration of an exception variable
        catch (Calendar calendar)
        {
            calendar.printStackTrace();
            return null;
        }
        return calendar;
    }

    private String getWeatherTag(String s)
    {
        s = (new PhotoUtilities()).getWeatherConditionTagFromIconCode(s);
        if (s.equals(com.accuweather.android.models.photos.PhotoUtilities.Condition.MIX) || s.equals(com.accuweather.android.models.photos.PhotoUtilities.Condition.RAINY) || s.equals(com.accuweather.android.models.photos.PhotoUtilities.Condition.SNOWY) || s.equals(com.accuweather.android.models.photos.PhotoUtilities.Condition.THUNDERSTORM))
        {
            return com.accuweather.android.models.photos.PhotoUtilities.Condition.CLOUDY.getConditionCode();
        } else
        {
            return s.getConditionCode();
        }
    }

    private Calendar parseTimeStamp(String s)
        throws ParseException
    {
        s = (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", new Locale("en,EN"))).parse(s);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(s);
        return calendar;
    }

    public PhotoResults retrievePhotos(String s, CurrentConditionsResults currentconditionsresults)
        throws Exception
    {
        s = Uri.parse((new StringBuilder()).append("http://api.accuweather.com/imagery/v1/photos/").append(s).toString()).buildUpon().appendQueryParameter("tags", buildTags(s, currentconditionsresults)).appendQueryParameter("exactMatch", String.valueOf(true)).appendQueryParameter("details", String.valueOf(true)).appendQueryParameter("apikey", "srRLeAmTroxPinDG8Aus3Ikl6tLGJd94").build().toString();
        if (Logger.isDebugEnabled())
        {
            Logger.i(getClass().getName(), (new StringBuilder()).append("In retrievePhotos, url ").append(s).toString());
        }
        return (PhotoResults)parse(s, photoParser);
    }

}
