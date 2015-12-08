// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.service;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import com.bricolsoftconsulting.geocoderplus.Address;
import com.bricolsoftconsulting.geocoderplus.Area;
import com.bricolsoftconsulting.geocoderplus.Position;
import com.thetransitapp.droid.data.TransitSourceFactory;
import com.thetransitapp.droid.util.ServiceUtility;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GeocoderTask extends AsyncTask
{
    public static interface GeocoderTaskCallback
    {

        public abstract void onAddressReceived(Address address);
    }


    private static final String API_KEY_1 = "AIzaSyDQzN6bZalwK_oAspvs9VUjVC2BSz-tQJE";
    private static final String API_KEY_2 = "AIzaSyAxkB78JcpBz-QrxAu69Vb0qBa1Qt9dtFY";
    private static final String LOG_TAG = com/thetransitapp/droid/service/GeocoderTask.getSimpleName();
    private static final String OUT_JSON = "/json";
    private static final String PLACES_API_BASE = "https://maps.googleapis.com/maps/api/place";
    private static final String TYPE_DETAILS = "/details";
    private final GeocoderTaskCallback callback;
    private ProgressDialog dialog;

    public GeocoderTask(Context context, GeocoderTaskCallback geocodertaskcallback)
    {
        dialog = null;
        callback = geocodertaskcallback;
        dialog = new ProgressDialog(context);
        dialog.setCancelable(false);
        dialog.setMessage(context.getString(0x7f0a0058));
    }

    private String getAddressComponent(JSONArray jsonarray, String s)
    {
        int i = 0;
_L2:
        if (i >= jsonarray.length())
        {
            return null;
        }
        Object obj;
        obj = jsonarray.getJSONObject(i);
        if (!isTypeInTypeArray(s, ((JSONObject) (obj)).getJSONArray("types")))
        {
            break MISSING_BLOCK_LABEL_55;
        }
        obj = TransitSourceFactory.getString(((JSONObject) (obj)), "long_name", null);
        return ((String) (obj));
        JSONException jsonexception;
        jsonexception;
        Log.d("Geocoder", "ParceExpcetion", jsonexception);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private Address getAddressFromJSON(JSONObject jsonobject)
    {
        Address address = new Address();
        populateAddressComponentsFromJSON(address, jsonobject);
        populateAddressGeometryFromJSON(address, jsonobject);
        return address;
    }

    private Area getAreaFromJSON(JSONObject jsonobject)
    {
        try
        {
            jsonobject = new Area(getPositionFromJSON(jsonobject.getJSONObject("northeast")), getPositionFromJSON(jsonobject.getJSONObject("southwest")));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.d("Geocoder", "ParceExpcetion", jsonobject);
            return null;
        }
        return jsonobject;
    }

    private Address getPlaceDetail(String s)
    {
        String s1;
        String s2;
        Object obj1;
        Object obj2;
        obj2 = null;
        obj1 = null;
        s2 = obj1;
        s1 = obj2;
        StringBuilder stringbuilder = new StringBuilder("https://maps.googleapis.com/maps/api/place/details/json");
        s2 = obj1;
        s1 = obj2;
        Object obj;
        if ((new Random()).nextBoolean())
        {
            obj = "AIzaSyDQzN6bZalwK_oAspvs9VUjVC2BSz-tQJE";
        } else
        {
            obj = "AIzaSyAxkB78JcpBz-QrxAu69Vb0qBa1Qt9dtFY";
        }
        s2 = obj1;
        s1 = obj2;
        stringbuilder.append((new StringBuilder("?sensor=false&key=")).append(((String) (obj))).toString());
        s2 = obj1;
        s1 = obj2;
        stringbuilder.append("&reference=");
        s2 = obj1;
        s1 = obj2;
        stringbuilder.append(s);
        s2 = obj1;
        s1 = obj2;
        Log.d("Place URL", stringbuilder.toString());
        s2 = obj1;
        s1 = obj2;
        s = (HttpURLConnection)(new URL(stringbuilder.toString())).openConnection();
        s2 = s;
        s1 = s;
        obj = getAddressFromJSON((new JSONObject(ServiceUtility.convertStreamToString(s.getInputStream()))).getJSONObject("result"));
        if (s != null)
        {
            s.disconnect();
        }
        return ((Address) (obj));
        s;
        s1 = s2;
        Log.e(LOG_TAG, "Error with Places API", s);
        if (s2 != null)
        {
            s2.disconnect();
        }
        return null;
        s;
        if (s1 != null)
        {
            s1.disconnect();
        }
        throw s;
    }

    private Position getPositionFromJSON(JSONObject jsonobject)
    {
        try
        {
            jsonobject = new Position(jsonobject.getDouble("lat"), jsonobject.getDouble("lng"));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.d("Geocoder", "ParceExpcetion", jsonobject);
            return null;
        }
        return jsonobject;
    }

    private boolean isTypeInTypeArray(String s, JSONArray jsonarray)
    {
        if (s != null && jsonarray != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i = 0;
_L4:
        if (i >= jsonarray.length())
        {
            continue; /* Loop/switch isn't completed */
        }
        boolean flag = jsonarray.getString(i).equals(s);
        if (flag)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_51;
        JSONException jsonexception;
        jsonexception;
        Log.d("Geocoder", "ParceExpcetion", jsonexception);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
    }

    private void populateAddressBoundsFromJSON(Address address, JSONObject jsonobject)
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
    {
        try
        {
            address.setFormattedAddress(TransitSourceFactory.getString(jsonobject, "formatted_address", null));
            jsonobject = jsonobject.getJSONArray("address_components");
            address.setStreetNumber(getAddressComponent(jsonobject, "street_number"));
            address.setPremise(getAddressComponent(jsonobject, "premise"));
            address.setSubPremise(getAddressComponent(jsonobject, "subpremise"));
            address.setFloor(getAddressComponent(jsonobject, "floor"));
            address.setRoom(getAddressComponent(jsonobject, "room"));
            address.setRoute(getAddressComponent(jsonobject, "route"));
            address.setNeighborhood(getAddressComponent(jsonobject, "neighborhood"));
            address.setLocality(getAddressComponent(jsonobject, "locality"));
            address.setSubLocality(getAddressComponent(jsonobject, "sublocality"));
            address.setPostalCode(getAddressComponent(jsonobject, "postal_code"));
            address.setAdminArea(getAddressComponent(jsonobject, "administrative_area_level_1"));
            address.setSubAdminArea(getAddressComponent(jsonobject, "administrative_area_level_2"));
            address.setSubAdminArea2(getAddressComponent(jsonobject, "administrative_area_level_3"));
            address.setCountryCode(getAddressComponent(jsonobject, "country"));
            address.setCountryName(getAddressComponent(jsonobject, "country"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Address address)
        {
            Log.d("Geocoder", "ParceExpcetion", address);
        }
    }

    private void populateAddressGeometryFromJSON(Address address, JSONObject jsonobject)
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
            Log.d("Geocoder", "ParceExpcetion", address);
        }
    }

    private void populateAddressLocationFromJSON(Address address, JSONObject jsonobject)
    {
        try
        {
            jsonobject = getPositionFromJSON(jsonobject.getJSONObject("location"));
        }
        // Misplaced declaration of an exception variable
        catch (Address address)
        {
            Log.d("Geocoder", "ParceExpcetion", address);
            return;
        }
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        address.setLatitude(jsonobject.getLatitude());
        address.setLongitude(jsonobject.getLongitude());
    }

    private void populateAddressViewPortFromJSON(Address address, JSONObject jsonobject)
    {
        try
        {
            address.setViewPort(getAreaFromJSON(jsonobject.getJSONObject("viewport")));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Address address)
        {
            return;
        }
    }

    protected transient Address doInBackground(String as[])
    {
        if (!as[0].startsWith("my_loc")) goto _L2; else goto _L1
_L1:
        String as1[];
        as1 = as[0].split(",");
        as = new Address();
        as.setFormattedAddress(as1[1]);
        as.setLatitude(Double.parseDouble(as1[2]));
        as.setLongitude(Double.parseDouble(as1[3]));
_L4:
        if (as != null)
        {
            return as;
        }
        break; /* Loop/switch isn't completed */
_L2:
        as = getPlaceDetail(as[0]);
        if (true) goto _L4; else goto _L3
        as;
_L6:
        Log.e("Geocoder", "Error with places API", as);
_L3:
        return null;
        as;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected volatile transient Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected void onPostExecute(Address address)
    {
        super.onPostExecute(address);
        if (dialog.isShowing())
        {
            try
            {
                dialog.dismiss();
            }
            catch (IllegalArgumentException illegalargumentexception) { }
        }
        callback.onAddressReceived(address);
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Address)obj);
    }

    protected void onPreExecute()
    {
        super.onPreExecute();
        dialog.show();
    }

}
