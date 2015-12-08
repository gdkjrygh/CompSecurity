// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bricolsoftconsulting.geocoderplus;

import android.util.Log;
import com.bricolsoftconsulting.geocoderplus.util.http.HttpRetriever;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Vector;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.bricolsoftconsulting.geocoderplus:
//            Address, Area, Position

public class Geocoder
{

    public static final String HTTP_ERROR = "Failed to retrieve JSON data over HTTP!";
    public static final String INVALID_REQUEST_ERROR = "The HTTP request was invalid!";
    public static final String JSON_PARSE_ERROR = "Failed to parse JSON data!";
    public static final String PARAMETER_ERROR = "Location name cannot be null!";
    public static final String PARAM_ADDRESS = "address";
    public static final String PARAM_BOUNDS = "bounds";
    public static final String PARAM_LANGUAGE = "language";
    public static final String PARAM_REGION = "region";
    public static final String PARAM_SENSOR = "sensor";
    public static final String QUERY_LIMIT_ERROR = "You exceeded the number of queries that the Google Maps API allows in a 24 hour period!";
    public static final String REQUEST_DENIED_ERROR = "The HTTP request was denied!";
    public static final String URL_MAPS_GEOCODE = "http://maps.googleapis.com/maps/api/geocode/json";
    Locale mLocale;
    double mNortheastLatitude;
    double mNortheastLongitude;
    double mSouthWestLatitude;
    double mSouthWestLongitude;
    boolean mUseBounds;
    boolean mUseRegionBias;

    public Geocoder()
    {
        mUseRegionBias = false;
        mUseBounds = false;
        mLocale = Locale.getDefault();
    }

    public Geocoder(Locale locale)
    {
        mUseRegionBias = false;
        mUseBounds = false;
        mLocale = locale;
    }

    private JSONObject getAddressComponent(JSONArray jsonarray, String s)
        throws IOException
    {
        for (int i = 0; i < jsonarray.length(); i++)
        {
            JSONObject jsonobject;
            boolean flag;
            try
            {
                jsonobject = jsonarray.getJSONObject(i);
                flag = isTypeInTypeArray(s, jsonobject.getJSONArray("types"));
            }
            // Misplaced declaration of an exception variable
            catch (JSONArray jsonarray)
            {
                throw new IOException("Failed to parse JSON data!");
            }
            if (flag)
            {
                return jsonobject;
            }
        }

        return null;
    }

    private Address getAddressFromJSON(JSONObject jsonobject)
        throws IOException
    {
        Address address = new Address();
        populateAddressComponentsFromJSON(address, jsonobject);
        populateAddressGeometryFromJSON(address, jsonobject);
        return address;
    }

    private List getAddressesFromJSON(String s, int i)
        throws IOException
    {
        ArrayList arraylist;
        Object obj;
        obj = null;
        arraylist = obj;
        if (s == null) goto _L2; else goto _L1
_L1:
        arraylist = obj;
        if (s.length() <= 0) goto _L2; else goto _L3
_L3:
        s = new JSONObject(s);
        arraylist = obj;
        if (!isRequestSuccessful(s)) goto _L2; else goto _L4
_L4:
        int k;
        s = s.getJSONArray("results");
        k = s.length();
        int j;
        j = k;
        if (i != -1)
        {
            j = k;
            if (i < k)
            {
                j = i;
            }
        }
        Locale locale = Locale.getDefault();
        arraylist = obj;
        if (j <= 0) goto _L2; else goto _L5
_L5:
        arraylist = new ArrayList();
        i = 0;
_L6:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        JSONObject jsonobject = s.getJSONObject(i);
        new Address(locale);
        arraylist.add(getAddressFromJSON(jsonobject));
        i++;
        if (true) goto _L6; else goto _L2
        s;
_L8:
        throw new IOException("Failed to parse JSON data!");
_L2:
        return arraylist;
        s;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private Area getAreaFromJSON(JSONObject jsonobject)
        throws IOException
    {
        try
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject("northeast");
            jsonobject = jsonobject.getJSONObject("southwest");
            jsonobject = new Area(getPositionFromJSON(jsonobject1), getPositionFromJSON(jsonobject));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new IOException("Failed to parse JSON data!");
        }
        return jsonobject;
    }

    private String getGeocodingUrl(String s)
    {
        String s1 = mLocale.getLanguage();
        Vector vector = new Vector();
        vector.add(new BasicNameValuePair("sensor", "true"));
        vector.add(new BasicNameValuePair("address", s));
        if (s1 != null && s1.length() > 0)
        {
            vector.add(new BasicNameValuePair("language", s1));
        }
        if (mUseRegionBias)
        {
            vector.add(new BasicNameValuePair("region", mLocale.getCountry()));
        }
        if (mUseBounds)
        {
            vector.add(new BasicNameValuePair("bounds", (new StringBuilder()).append(mNortheastLatitude).append(",").append(mNortheastLongitude).append("|").append(mSouthWestLatitude).append(",").append(mSouthWestLongitude).toString()));
        }
        s = URLEncodedUtils.format(vector, "UTF-8");
        s = (new StringBuilder()).append("http://maps.googleapis.com/maps/api/geocode/json?").append(s).toString();
        Log.d("Geocoder", s);
        return s;
    }

    private String getJSONStringField(JSONObject jsonobject, String s)
    {
        if (jsonobject == null || s == null)
        {
            return null;
        }
        try
        {
            jsonobject = jsonobject.getString(s);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return null;
        }
        return jsonobject;
    }

    private Position getPositionFromJSON(JSONObject jsonobject)
        throws IOException
    {
        try
        {
            jsonobject = new Position(jsonobject.getDouble("lat"), jsonobject.getDouble("lng"));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new IOException("Failed to parse JSON data!");
        }
        return jsonobject;
    }

    private boolean isRequestSuccessful(JSONObject jsonobject)
        throws IOException
    {
        boolean flag1 = false;
        jsonobject = getJSONStringField(jsonobject, "status");
        boolean flag;
        if (jsonobject.equals("OK"))
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (!jsonobject.equals("ZERO_RESULTS"))
            {
                if (jsonobject.equals("OVER_QUERY_LIMIT"))
                {
                    throw new IOException("You exceeded the number of queries that the Google Maps API allows in a 24 hour period!");
                }
                if (jsonobject.equals("REQUEST_DENIED"))
                {
                    throw new IOException("The HTTP request was denied!");
                }
                flag = flag1;
                if (jsonobject.equals("INVALID_REQUEST"))
                {
                    throw new IOException("The HTTP request was invalid!");
                }
            }
        }
        return flag;
    }

    private boolean isTypeInTypeArray(String s, JSONArray jsonarray)
        throws IOException
    {
        if (s != null && jsonarray != null)
        {
            int i = 0;
            while (i < jsonarray.length()) 
            {
                boolean flag;
                try
                {
                    flag = jsonarray.getString(i).equals(s);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw new IOException("Failed to parse JSON data!");
                }
                if (flag)
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    private void populateAddressBoundsFromJSON(Address address, JSONObject jsonobject)
        throws IOException
    {
        try
        {
            address.setBounds(getAreaFromJSON(jsonobject.getJSONObject("bounds")));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Address address)
        {
            return;
        }
    }

    private void populateAddressComponentsFromJSON(Address address, JSONObject jsonobject)
        throws IOException
    {
        try
        {
            JSONArray jsonarray = jsonobject.getJSONArray("address_components");
            address.setFormattedAddress(getJSONStringField(jsonobject, "formatted_address"));
            address.setStreetNumber(getJSONStringField(getAddressComponent(jsonarray, "street_number"), "long_name"));
            address.setPremise(getJSONStringField(getAddressComponent(jsonarray, "premise"), "long_name"));
            address.setSubPremise(getJSONStringField(getAddressComponent(jsonarray, "subpremise"), "long_name"));
            address.setFloor(getJSONStringField(getAddressComponent(jsonarray, "floor"), "long_name"));
            address.setRoom(getJSONStringField(getAddressComponent(jsonarray, "room"), "long_name"));
            address.setRoute(getJSONStringField(getAddressComponent(jsonarray, "route"), "long_name"));
            address.setNeighborhood(getJSONStringField(getAddressComponent(jsonarray, "neighborhood"), "long_name"));
            address.setLocality(getJSONStringField(getAddressComponent(jsonarray, "locality"), "long_name"));
            address.setSubLocality(getJSONStringField(getAddressComponent(jsonarray, "sublocality"), "long_name"));
            address.setPostalCode(getJSONStringField(getAddressComponent(jsonarray, "postal_code"), "long_name"));
            address.setAdminArea(getJSONStringField(getAddressComponent(jsonarray, "administrative_area_level_1"), "long_name"));
            address.setSubAdminArea(getJSONStringField(getAddressComponent(jsonarray, "administrative_area_level_2"), "long_name"));
            address.setSubAdminArea2(getJSONStringField(getAddressComponent(jsonarray, "administrative_area_level_3"), "long_name"));
            address.setCountryCode(getJSONStringField(getAddressComponent(jsonarray, "country"), "short_name"));
            address.setCountryName(getJSONStringField(getAddressComponent(jsonarray, "country"), "long_name"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Address address)
        {
            throw new IOException("Failed to parse JSON data!");
        }
    }

    private void populateAddressGeometryFromJSON(Address address, JSONObject jsonobject)
        throws IOException
    {
        try
        {
            jsonobject = jsonobject.getJSONObject("geometry");
            populateAddressLocationFromJSON(address, jsonobject);
            populateAddressViewPortFromJSON(address, jsonobject);
            populateAddressBoundsFromJSON(address, jsonobject);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Address address)
        {
            throw new IOException("Failed to parse JSON data!");
        }
    }

    private void populateAddressLocationFromJSON(Address address, JSONObject jsonobject)
        throws IOException
    {
        try
        {
            jsonobject = getPositionFromJSON(jsonobject.getJSONObject("location"));
        }
        // Misplaced declaration of an exception variable
        catch (Address address)
        {
            throw new IOException("Failed to parse JSON data!");
        }
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        address.setLatitude(jsonobject.getLatitude());
        address.setLongitude(jsonobject.getLongitude());
    }

    private void populateAddressViewPortFromJSON(Address address, JSONObject jsonobject)
        throws IOException
    {
        try
        {
            address.setViewPort(getAreaFromJSON(jsonobject.getJSONObject("viewport")));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Address address)
        {
            throw new IOException("Failed to parse JSON data!");
        }
    }

    public void clearBounds()
    {
        mUseBounds = false;
    }

    public List getFromLocationName(String s)
        throws IllegalArgumentException, IOException
    {
        return getFromLocationName(s, -1);
    }

    public List getFromLocationName(String s, int i)
        throws IllegalArgumentException, IOException
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Location name cannot be null!");
        }
        s = getGeocodingUrl(s);
        HttpRetriever httpretriever = new HttpRetriever();
        try
        {
            s = httpretriever.retrieve(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IOException("Failed to retrieve JSON data over HTTP!");
        }
        return getAddressesFromJSON(s, i);
    }

    public Locale getLocale()
    {
        return mLocale;
    }

    public boolean getUseRegionBias()
    {
        return mUseRegionBias;
    }

    public void setBounds(double d, double d1, double d2, double d3)
    {
        mNortheastLatitude = d;
        mNortheastLongitude = d1;
        mSouthWestLatitude = d2;
        mSouthWestLongitude = d3;
        mUseBounds = true;
    }

    public void setLocale(Locale locale)
    {
        mLocale = locale;
    }

    public void setUseRegionBias(boolean flag)
    {
        mUseRegionBias = flag;
    }
}
