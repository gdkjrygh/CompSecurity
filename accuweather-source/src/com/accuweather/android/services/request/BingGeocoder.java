// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services.request;

import android.content.Context;
import android.net.Uri;
import com.accuweather.android.models.location.GeoPosition;
import com.accuweather.android.models.location.GeocodedAddress;
import com.accuweather.android.models.location.gps.BingGeocodeResults;
import com.accuweather.android.models.location.gps.Resource;
import com.accuweather.android.models.location.gps.ResourceSet;
import com.accuweather.android.services.BaseDataRetrievalService;
import com.accuweather.android.services.gps.GeocoderCache;
import com.accuweather.android.utilities.MinuteCastUtilities;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BingGeocoder extends BaseDataRetrievalService
{

    private static final String AMAZON_BING_API_KEY = "Ah0q8cWvG_U9y5lWoCOKg3aksJrYQmKPTQbxN9dlP1sjs0m_SWSk1G-KJvrn5PBS";
    private static final String APIKEY_QUERY_PARAMETER_NAME = "key";
    private static final String BING_GEOCODER_BASE_URL = "http://dev.virtualearth.net/REST/v1/Locations";
    private static final String GOOGLE_BING_API_KEY = "AhoE2cl5VymDw3934rTCy-Xf-hmO2TjlD1oLYL1tcPVFl186pw2hJFu4ims0aF6O";
    private static final int MAX_GEOCODER_RESULTS = 5;
    private static final String MAX_RESULTS_QUERY_PARAMETER_NAME = "maxResults";
    private Context mContext;

    public BingGeocoder(Context context)
    {
        mContext = context;
    }

    private String getBingApiKey(Context context)
    {
        if (context.getPackageName().contains("amazon"))
        {
            return "Ah0q8cWvG_U9y5lWoCOKg3aksJrYQmKPTQbxN9dlP1sjs0m_SWSk1G-KJvrn5PBS";
        } else
        {
            return "AhoE2cl5VymDw3934rTCy-Xf-hmO2TjlD1oLYL1tcPVFl186pw2hJFu4ims0aF6O";
        }
    }

    private List toGeocodedAddresses(BingGeocodeResults binggeocoderesults)
    {
        ArrayList arraylist = new ArrayList();
        for (binggeocoderesults = binggeocoderesults.getResourceSets().iterator(); binggeocoderesults.hasNext();)
        {
            Iterator iterator = ((ResourceSet)binggeocoderesults.next()).getResources().iterator();
            while (iterator.hasNext()) 
            {
                arraylist.add(new GeocodedAddress((Resource)iterator.next()));
            }
        }

        return arraylist;
    }

    public List geocode(Double double1, Double double2)
        throws IOException, URISyntaxException
    {
        GeoPosition geoposition = new GeoPosition(double1, double2);
        List list = GeocoderCache.getInstance(mContext).getAddresses(geoposition);
        if (list != null)
        {
            return MinuteCastUtilities.getMinuteCastSupportedAddresses(list);
        } else
        {
            double1 = toGeocodedAddresses((BingGeocodeResults)parse(Uri.parse((new StringBuilder()).append("http://dev.virtualearth.net/REST/v1/Locations/").append(Uri.encode((new StringBuilder()).append(double1).append(",").append(double2).toString())).toString()).buildUpon().appendQueryParameter("key", getBingApiKey(mContext)).build().toString(), com/accuweather/android/models/location/gps/BingGeocodeResults));
            GeocoderCache.getInstance(mContext).putAddresses(geoposition, double1);
            return MinuteCastUtilities.getMinuteCastSupportedAddresses(double1);
        }
    }

    public List geocode(String s)
        throws IOException, URISyntaxException
    {
        return MinuteCastUtilities.getMinuteCastSupportedAddresses(toGeocodedAddresses((BingGeocodeResults)parse(Uri.parse((new StringBuilder()).append("http://dev.virtualearth.net/REST/v1/Locations/").append(Uri.encode(s.trim())).toString()).buildUpon().appendQueryParameter("key", getBingApiKey(mContext)).appendQueryParameter("maxResults", String.valueOf(5)).build().toString(), com/accuweather/android/models/location/gps/BingGeocodeResults)));
    }
}
