// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services.request;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.util.Log;
import com.accuweather.android.models.location.GeoPosition;
import com.accuweather.android.models.location.GeocodedAddress;
import com.accuweather.android.services.gps.GeocoderCache;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.MinuteCastUtilities;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.accuweather.android.services.request:
//            UrlSigner

public class NativeGeocoder
{

    private static final int MAX_GEOCODER_FREE_TEXT_LOCATIONS = 5;
    private static final int MAX_GEOCODER_LAT_LON_LOCATIONS = 1;
    private static final String TAG = com/accuweather/android/services/request/NativeGeocoder.getSimpleName();
    private Context context;
    private Geocoder geocoder;

    public NativeGeocoder(Context context1)
    {
        geocoder = new Geocoder(context1);
        context = context1;
    }

    private List toGeocodedAddresses(List list)
    {
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(new GeocodedAddress((Address)list.next()))) { }
        return arraylist;
    }

    public List geocode(Double double1, Double double2)
        throws IOException, InvalidKeyException, MalformedURLException, NoSuchAlgorithmException, URISyntaxException
    {
        GeoPosition geoposition = new GeoPosition(double1, double2);
        List list = GeocoderCache.getInstance(context).getAddresses(geoposition);
        if (list != null)
        {
            return MinuteCastUtilities.getMinuteCastSupportedAddresses(list);
        }
        list = geocoder.getFromLocation(double1.doubleValue(), double2.doubleValue(), 1);
        if (!list.isEmpty())
        {
            double1 = toGeocodedAddresses(list);
            GeocoderCache.getInstance(context).putAddresses(geoposition, double1);
            return MinuteCastUtilities.getMinuteCastSupportedAddresses(double1);
        } else
        {
            double1 = toGeocodedAddresses(getLocationInfo(UrlSigner.getSignedRequestUrlFromLatLon(Double.toString(double1.doubleValue()), Double.toString(double2.doubleValue()))));
            GeocoderCache.getInstance(context).putAddresses(geoposition, double1);
            return MinuteCastUtilities.getMinuteCastSupportedAddresses(double1);
        }
    }

    public List geocode(String s)
        throws IOException, InvalidKeyException, NoSuchAlgorithmException, URISyntaxException
    {
        Logger.d(TAG, ">>>>>>>>>>>>>>>>>>List<GeocodedAddress> geocode(String locationText)");
        List list = geocoder.getFromLocationName(s, 5);
        if (!list.isEmpty())
        {
            return MinuteCastUtilities.getMinuteCastSupportedAddresses(toGeocodedAddresses(list));
        } else
        {
            return MinuteCastUtilities.getMinuteCastSupportedAddresses(toGeocodedAddresses(getLocationInfo(UrlSigner.getSignedRequestUrlFromAddress(s))));
        }
    }

    public List getLocationInfo(String s)
        throws IOException, InvalidKeyException, NoSuchAlgorithmException, URISyntaxException
    {
        Object obj;
        String s1;
        Address address;
        Object obj2;
        DefaultHttpClient defaulthttpclient;
        obj2 = new HttpGet(s);
        defaulthttpclient = new DefaultHttpClient();
        s = new StringBuilder();
        s1 = null;
        address = null;
        obj = null;
        obj2 = defaulthttpclient.execute(((org.apache.http.client.methods.HttpUriRequest) (obj2))).getEntity().getContent();
_L3:
        int i = ((InputStream) (obj2)).read();
        if (i == -1) goto _L2; else goto _L1
_L1:
        s.append((char)i);
          goto _L3
        s;
_L12:
        Log.e(com/accuweather/android/services/request/NativeGeocoder.getName(), "Error calling Google geocode webservice.", s);
        return ((List) (obj));
_L2:
        obj2 = new JSONObject(s.toString());
        s = new ArrayList();
        if (!"OK".equalsIgnoreCase(((JSONObject) (obj2)).getString("status"))) goto _L5; else goto _L4
_L4:
        obj = ((JSONObject) (obj2)).getJSONArray("results");
        i = 0;
_L6:
        if (i >= ((JSONArray) (obj)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = ((JSONArray) (obj)).getJSONObject(i).getString("formatted_address");
        address = new Address(Locale.getDefault());
        address.setAddressLine(0, s1);
        s.add(address);
        i++;
        if (true) goto _L6; else goto _L5
_L5:
        return s;
        s;
        obj = s1;
_L10:
        Log.e(com/accuweather/android/services/request/NativeGeocoder.getName(), "Error calling Google geocode webservice.", s);
        return ((List) (obj));
        s;
        obj = address;
_L8:
        Log.e(com/accuweather/android/services/request/NativeGeocoder.getName(), "Error parsing Google geocode webservice response.", s);
        return ((List) (obj));
        Object obj1;
        obj1;
        obj = s;
        s = ((String) (obj1));
        if (true) goto _L8; else goto _L7
_L7:
        obj1;
        obj = s;
        s = ((String) (obj1));
        if (true) goto _L10; else goto _L9
_L9:
        obj1;
        obj = s;
        s = ((String) (obj1));
        if (true) goto _L12; else goto _L11
_L11:
    }

}
