// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import android.net.Uri;
import com.accuweather.android.models.location.LocationSearch;
import com.accuweather.android.models.location.LocationSearchResult;
import com.accuweather.android.parsers.LocationSearchParser;
import com.accuweather.android.parsers.LocationSearchResultParser;
import com.accuweather.android.utilities.Logger;
import java.io.IOException;

// Referenced classes of package com.accuweather.android.services:
//            BaseDataRetrievalService, ILocationService

public class LocationService extends BaseDataRetrievalService
    implements ILocationService
{

    private static String JSON_FEED_URL_AUTOCOMPLETE = "http://api.accuweather.com/locations/v1/cities/autocomplete";
    private static String JSON_FEED_URL_LOCATION_KEY = "http://api.accuweather.com/locations/v1/";
    private static String JSON_FEED_URL_POSTAL_CODE = "http://api.accuweather.com/locations/v1/postalcodes/%s/search";
    private static String JSON_FEED_URL_SEARCH = "http://api.accuweather.com/locations/v1/cities/search";
    private static String JSON_LOCATION_SEARCH_BY_LAT_LON_URL = "http://api.accuweather.com/locations/v1/cities/geoposition/search";
    private static final String QUERY_URL_KEY = "q";
    private LocationSearchParser locationSearchParser;
    private LocationSearchResultParser locationSearchResultParser;

    public LocationService()
    {
        locationSearchParser = new LocationSearchParser();
        locationSearchResultParser = new LocationSearchResultParser();
    }

    public LocationSearch performAutocompleteSearch(String s, String s1)
        throws IOException
    {
        s = Uri.parse(JSON_FEED_URL_AUTOCOMPLETE).buildUpon().appendQueryParameter("apikey", "srRLeAmTroxPinDG8Aus3Ikl6tLGJd94").appendQueryParameter("details", String.valueOf(true)).appendQueryParameter("language", s1).appendQueryParameter("q", s).build().toString();
        if (Logger.isDebugEnabled())
        {
            Logger.i(getClass().getName(), (new StringBuilder()).append("performAutocompleteSearch url ").append(s).toString());
        }
        return (LocationSearch)parse(s, locationSearchParser);
    }

    public LocationSearch performCitySearch(String s, String s1)
        throws IOException
    {
        s = Uri.parse(JSON_FEED_URL_SEARCH).buildUpon().appendQueryParameter("apikey", "srRLeAmTroxPinDG8Aus3Ikl6tLGJd94").appendQueryParameter("details", String.valueOf(true)).appendQueryParameter("language", s1).appendQueryParameter("alias", "always").appendQueryParameter("q", s).build().toString();
        if (Logger.isDebugEnabled())
        {
            Logger.i(getClass().getName(), (new StringBuilder()).append("performCitySearch url ").append(s).toString());
        }
        return (LocationSearch)parse(s, locationSearchParser);
    }

    public LocationSearchResult performCoordinatesSearch(double d, double d1, String s)
        throws IOException
    {
        s = Uri.parse(JSON_LOCATION_SEARCH_BY_LAT_LON_URL).buildUpon().appendQueryParameter("apikey", "srRLeAmTroxPinDG8Aus3Ikl6tLGJd94").appendQueryParameter("details", String.valueOf(true)).appendQueryParameter("language", s).appendQueryParameter("q", (new StringBuilder()).append(d).append(",").append(d1).toString()).build().toString();
        if (Logger.isDebugEnabled())
        {
            Logger.i(getClass().getName(), (new StringBuilder()).append("performCoordinatesSearch url ").append(s).toString());
        }
        return (LocationSearchResult)parse(s, locationSearchResultParser);
    }

    public LocationSearchResult performLocationKeySearch(String s, String s1)
        throws IOException
    {
        s = Uri.parse((new StringBuilder()).append(JSON_FEED_URL_LOCATION_KEY).append(s).toString()).buildUpon().appendQueryParameter("apikey", "srRLeAmTroxPinDG8Aus3Ikl6tLGJd94").appendQueryParameter("details", String.valueOf(true)).appendQueryParameter("language", s1).build().toString();
        if (Logger.isDebugEnabled())
        {
            Logger.i(getClass().getName(), (new StringBuilder()).append("performLocationKeySearch url ").append(s).toString());
        }
        return (LocationSearchResult)parse(s, locationSearchResultParser);
    }

}
