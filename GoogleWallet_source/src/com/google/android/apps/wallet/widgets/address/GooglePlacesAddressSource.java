// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.address;

import android.app.Application;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.Pair;
import com.google.android.apps.wallet.config.appcontrol.AppControl;
import com.google.android.apps.wallet.config.appcontrol.AppControlKey;
import com.google.android.apps.wallet.http.HttpUrlConnectionFactory;
import com.google.android.apps.wallet.logging.WLog;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.apps.wallet.widgets.address:
//            AddressSource, AddressSourceResult

public class GooglePlacesAddressSource
    implements AddressSource
{

    private static final String TAG = com/google/android/apps/wallet/widgets/address/GooglePlacesAddressSource.getSimpleName();
    private final String apiKey;
    private final int autocompleteThresholdAddress1;
    private final int autocompleteThresholdDefault;
    private final Context context;
    private boolean hasLocationPermission;
    private final HttpUrlConnectionFactory httpUrlConnectionFactory;
    private boolean queriedLocationPermission;

    public GooglePlacesAddressSource(Application application, AppControl appcontrol, HttpUrlConnectionFactory httpurlconnectionfactory)
    {
        hasLocationPermission = false;
        queriedLocationPermission = false;
        context = application;
        httpUrlConnectionFactory = httpurlconnectionfactory;
        apiKey = appcontrol.getString(AppControlKey.ADDRESS_AUTOCOMPLETE_API_KEY);
        autocompleteThresholdDefault = appcontrol.getInt(AppControlKey.ADDRESS_AUTOCOMPLETE_THRESHOLD_DEFAULT);
        autocompleteThresholdAddress1 = appcontrol.getInt(AppControlKey.ADDRESS_AUTOCOMPLETE_THRESHOLD_ADDRESS_LINE_1);
    }

    private String buildPlaceDetailsUrl(String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("reference", s));
        if (getLastKnownLocation() != null)
        {
            s = "true";
        } else
        {
            s = "false";
        }
        arraylist.add(new BasicNameValuePair("sensor", s));
        arraylist.add(new BasicNameValuePair("key", apiKey));
        if (!TextUtils.isEmpty(s1))
        {
            arraylist.add(new BasicNameValuePair("language", s1));
        }
        s1 = URLEncodedUtils.format(arraylist, "utf-8");
        s = String.valueOf("https://maps.googleapis.com/maps/api/place/details/json?");
        s1 = String.valueOf(s1);
        if (s1.length() != 0)
        {
            return s.concat(s1);
        } else
        {
            return new String(s);
        }
    }

    private String buildPlacesAutocompleteUrl(CharSequence charsequence, char c, String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("input", charsequence.toString()));
        arraylist.add(new BasicNameValuePair("key", apiKey));
        arraylist.add(new BasicNameValuePair("types", getRequestTypeForField(c)));
        charsequence = getLastKnownLocation();
        if (charsequence != null)
        {
            double d = charsequence.getLatitude();
            double d1 = charsequence.getLongitude();
            arraylist.add(new BasicNameValuePair("location", (new StringBuilder(49)).append(d).append(",").append(d1).toString()));
            arraylist.add(new BasicNameValuePair("radius", "80000"));
        }
        if (charsequence != null)
        {
            charsequence = "true";
        } else
        {
            charsequence = "false";
        }
        arraylist.add(new BasicNameValuePair("sensor", charsequence));
        charsequence = String.valueOf(s.toLowerCase(Locale.US));
        if (charsequence.length() != 0)
        {
            charsequence = "country:".concat(charsequence);
        } else
        {
            charsequence = new String("country:");
        }
        arraylist.add(new BasicNameValuePair("components", charsequence));
        if (!TextUtils.isEmpty(s1))
        {
            arraylist.add(new BasicNameValuePair("language", s1));
        }
        s = URLEncodedUtils.format(arraylist, "utf-8");
        charsequence = String.valueOf("https://maps.googleapis.com/maps/api/place/autocomplete/json?");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            return charsequence.concat(s);
        } else
        {
            return new String(charsequence);
        }
    }

    private static final ArrayList convertJsonObjectToAddressSourceResults(JSONObject jsonobject, CharSequence charsequence, char c)
    {
        if (jsonobject != null) goto _L2; else goto _L1
_L1:
        jsonobject = null;
_L4:
        return jsonobject;
_L2:
        ArrayList arraylist;
        String s;
        if (!hasStatus(jsonobject, "OK"))
        {
            charsequence = TAG;
            jsonobject = String.valueOf(getStatus(jsonobject));
            if (jsonobject.length() != 0)
            {
                jsonobject = "Response has invalid status: ".concat(jsonobject);
            } else
            {
                jsonobject = new String("Response has invalid status: ");
            }
            WLog.w(charsequence, jsonobject);
            return null;
        }
        JSONArray jsonarray;
        int i;
        int j;
        int k;
        try
        {
            jsonarray = jsonobject.getJSONArray("predictions");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            WLog.w(TAG, "Response does not contain predictions");
            return null;
        }
        arraylist = new ArrayList();
        i = 0;
        j = jsonarray.length();
        jsonobject = arraylist;
        if (i >= j) goto _L4; else goto _L3
_L3:
        jsonobject = jsonarray.getJSONObject(i);
        s = jsonobject.getString("description");
        k = s.length();
        if (k != 0) goto _L6; else goto _L5
_L5:
        i++;
        break MISSING_BLOCK_LABEL_89;
_L6:
        String s1;
        String s2;
        s1 = jsonobject.getString("reference");
        if (s1.length() == 0 || !hasTypeForField(jsonobject, c))
        {
            continue; /* Loop/switch isn't completed */
        }
        s2 = getMatchingTerm(jsonobject);
        if (s2 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        Object obj;
        if (shouldValidateMatchingTerm(c) && !s2.toLowerCase().startsWith(charsequence.toString().toLowerCase()))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = getMatchedSubstrings(jsonobject);
        jsonobject = s;
        if (!((List) (obj)).isEmpty())
        {
            jsonobject = new SpannableString(s);
            StyleSpan stylespan;
            SpannableString spannablestring;
            int l;
            int i1;
            for (Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext(); spannablestring.setSpan(stylespan, l, ((Integer)((Pair) (obj)).second).intValue() + i1, 0))
            {
                obj = (Pair)iterator.next();
                stylespan = new StyleSpan(1);
                spannablestring = (SpannableString)jsonobject;
                l = ((Integer)((Pair) (obj)).first).intValue();
                i1 = ((Integer)((Pair) (obj)).first).intValue();
            }

        }
        try
        {
            arraylist.add(new AddressSourceResult(s2, jsonobject, "GooglePlacesAddressSource", s1));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject) { }
        if (true) goto _L5; else goto _L7
_L7:
    }

    private static final com.google.location.country.NanoPostaladdress.PostalAddress convertJsonObjectToPostalAddress(JSONObject jsonobject, String s)
    {
        if (jsonobject != null) goto _L2; else goto _L1
_L1:
        jsonobject = null;
_L6:
        return jsonobject;
_L2:
        if (!hasStatus(jsonobject, "OK"))
        {
            s = TAG;
            jsonobject = String.valueOf(getStatus(jsonobject));
            if (jsonobject.length() != 0)
            {
                jsonobject = "Response has invalid status: ".concat(jsonobject);
            } else
            {
                jsonobject = new String("Response has invalid status: ");
            }
            WLog.w(s, jsonobject);
            return null;
        }
        Object obj;
        HashMap hashmap;
        Object obj1;
        int i;
        int j;
        int k;
        int l;
        try
        {
            jsonobject = jsonobject.getJSONObject("result");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return null;
        }
        try
        {
            obj = jsonobject.getJSONArray("address_components");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return null;
        }
        hashmap = new HashMap();
        i = 0;
        k = ((JSONArray) (obj)).length();
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        try
        {
            obj1 = ((JSONArray) (obj)).getJSONObject(i);
            if (hasType(((JSONObject) (obj1)), "postal_code_prefix"))
            {
                break; /* Loop/switch isn't completed */
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!hasType(((JSONObject) (obj1)), "administrative_area_level_1") && !hasType(((JSONObject) (obj1)), "country"))
        {
            jsonobject = "long_name";
        } else
        {
            jsonobject = "short_name";
        }
        jsonobject = ((JSONObject) (obj1)).getString(jsonobject);
        obj1 = ((JSONObject) (obj1)).getJSONArray("types");
        j = 0;
        l = ((JSONArray) (obj1)).length();
_L4:
        if (j >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        hashmap.put(((JSONArray) (obj1)).getString(j), jsonobject);
        j++;
        if (true) goto _L4; else goto _L3
_L3:
        break; /* Loop/switch isn't completed */
        obj = new com.google.location.country.NanoPostaladdress.PostalAddress();
        if (hashmap.containsKey("street_number") || hashmap.containsKey("route"))
        {
            jsonobject = (String)hashmap.get("street_number");
            obj1 = (String)hashmap.get("route");
            if (TextUtils.isEmpty(jsonobject))
            {
                obj.addressLine = (new String[] {
                    obj1
                });
            } else
            if (TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                obj.addressLine = (new String[] {
                    jsonobject
                });
            } else
            {
                obj.addressLine = (new String[] {
                    (new StringBuilder(String.valueOf(jsonobject).length() + 1 + String.valueOf(obj1).length())).append(jsonobject).append(" ").append(((String) (obj1))).toString()
                });
            }
        }
        if (hashmap.containsKey("locality"))
        {
            obj.localityName = (String)hashmap.get("locality");
        }
        if (hashmap.containsKey("administrative_area_level_1"))
        {
            obj.administrativeAreaName = (String)hashmap.get("administrative_area_level_1");
        }
        if (hashmap.containsKey("postal_code"))
        {
            obj.postalCodeNumber = (String)hashmap.get("postal_code");
        }
        if (hashmap.containsKey("country"))
        {
            obj.countryNameCode = (String)hashmap.get("country");
        }
        jsonobject = ((JSONObject) (obj));
        if (!TextUtils.isEmpty(s))
        {
            obj.languageCode = s;
            return ((com.google.location.country.NanoPostaladdress.PostalAddress) (obj));
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L6; else goto _L5
_L5:
        i++;
        break MISSING_BLOCK_LABEL_96;
    }

    private JSONObject fetchJsonObject(String s)
    {
        String s1;
        String s2;
        String s3;
        InputStreamReader inputstreamreader;
        char ac[];
        Object obj;
        StringBuilder stringbuilder;
        ac = null;
        obj = null;
        inputstreamreader = null;
        stringbuilder = new StringBuilder();
        s2 = inputstreamreader;
        s3 = ac;
        s1 = obj;
        s = new URL(s.toString());
        s2 = inputstreamreader;
        s3 = ac;
        s1 = obj;
        s = httpUrlConnectionFactory.get(s);
        s2 = s;
        s3 = s;
        s1 = s;
        if (s.getResponseCode() == 200) goto _L2; else goto _L1
_L1:
        s2 = s;
        s3 = s;
        s1 = s;
        WLog.efmt(TAG, "Error connecting to Places API %s", new Object[] {
            Integer.valueOf(s.getResponseCode())
        });
        if (s != null)
        {
            s.disconnect();
        }
_L6:
        return null;
_L2:
        s2 = s;
        s3 = s;
        s1 = s;
        inputstreamreader = new InputStreamReader(s.getInputStream());
        s2 = s;
        s3 = s;
        s1 = s;
        ac = new char[1024];
_L4:
        s2 = s;
        s3 = s;
        s1 = s;
        int i = inputstreamreader.read(ac);
        if (i == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        s2 = s;
        s3 = s;
        s1 = s;
        stringbuilder.append(ac, 0, i);
        if (true) goto _L4; else goto _L3
_L3:
        break; /* Loop/switch isn't completed */
        s;
        s1 = s2;
        WLog.e(TAG, "Error processing Places API URL", s);
        if (s2 != null)
        {
            s2.disconnect();
            return null;
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (s != null)
        {
            s.disconnect();
        }
        try
        {
            s = new JSONObject(stringbuilder.toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            WLog.e(TAG, "Cannot process JSON results", s);
            return null;
        }
        return s;
        s;
        s1 = s3;
        WLog.e(TAG, "Error connecting to Places API", s);
        if (s3 == null) goto _L6; else goto _L7
_L7:
        s3.disconnect();
        return null;
        s;
        if (s1 != null)
        {
            s1.disconnect();
        }
        throw s;
    }

    private Location getLastKnownLocation()
    {
        LocationManager locationmanager;
        if (hasLocationPermission())
        {
            if ((locationmanager = (LocationManager)context.getSystemService("location")) != null)
            {
                return locationmanager.getLastKnownLocation("network");
            }
        }
        return null;
    }

    private static List getMatchedSubstrings(JSONObject jsonobject)
    {
        ArrayList arraylist = new ArrayList();
        JSONObject jsonobject1;
        int i;
        int j;
        try
        {
            jsonobject = jsonobject.getJSONArray("matched_substrings");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            break; /* Loop/switch isn't completed */
        }
        i = 0;
        j = jsonobject.length();
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject1 = jsonobject.getJSONObject(i);
        arraylist.add(Pair.create(Integer.valueOf(jsonobject1.getInt("offset")), Integer.valueOf(jsonobject1.getInt("length"))));
        i++;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L1
_L1:
        return arraylist;
    }

    private static String getMatchingTerm(JSONObject jsonobject)
        throws JSONException
    {
        int j = jsonobject.getJSONArray("matched_substrings").getJSONObject(0).getInt("offset");
        jsonobject = jsonobject.getJSONArray("terms");
        int i = 0;
        for (int k = jsonobject.length(); i < k; i++)
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject(i);
            if (j < jsonobject1.getInt("offset") + jsonobject1.getString("value").length())
            {
                return jsonobject1.getString("value");
            }
        }

        return null;
    }

    private static String getRequestTypeForField(char c)
    {
        switch (c)
        {
        default:
            return null;

        case 49: // '1'
            return "geocode";

        case 67: // 'C'
            return "(cities)";

        case 83: // 'S'
            return "(regions)";
        }
    }

    private static String getResponseTypeForField(char c)
    {
        switch (c)
        {
        default:
            return null;

        case 49: // '1'
            return "route";

        case 67: // 'C'
            return "locality";

        case 83: // 'S'
            return "administrative_area_level_1";

        case 90: // 'Z'
            return "locality";
        }
    }

    private static String getStatus(JSONObject jsonobject)
    {
        return jsonobject.optString("status");
    }

    private int getThresholdForField(char c)
    {
        switch (c)
        {
        default:
            return autocompleteThresholdDefault;

        case 49: // '1'
            return autocompleteThresholdAddress1;
        }
    }

    private boolean hasLocationPermission()
    {
        boolean flag1 = true;
        this;
        JVM INSTR monitorenter ;
        if (queriedLocationPermission)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        queriedLocationPermission = true;
        boolean flag = flag1;
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0)
        {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        hasLocationPermission = flag;
        flag = hasLocationPermission;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    private static boolean hasStatus(JSONObject jsonobject, String s)
    {
        return s.equalsIgnoreCase(getStatus(jsonobject));
    }

    private static boolean hasType(JSONObject jsonobject, String s)
    {
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i;
        int j;
        boolean flag;
        try
        {
            jsonobject = jsonobject.getJSONArray("types");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return false;
        }
        i = 0;
        j = jsonobject.length();
_L4:
        if (i >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = s.equalsIgnoreCase(jsonobject.getString(i));
        if (flag)
        {
            return true;
        }
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
    }

    private static boolean hasTypeForField(JSONObject jsonobject, char c)
    {
        return hasType(jsonobject, getResponseTypeForField(c));
    }

    private static boolean isFieldSupported(char c)
    {
        return getRequestTypeForField(c) != null;
    }

    private static boolean shouldValidateMatchingTerm(char c)
    {
        switch (c)
        {
        default:
            return true;

        case 49: // '1'
        case 67: // 'C'
            return false;
        }
    }

    public final com.google.location.country.NanoPostaladdress.PostalAddress getAddress(String s, String s1)
    {
        if (TextUtils.isEmpty(s))
        {
            return null;
        } else
        {
            return convertJsonObjectToPostalAddress(fetchJsonObject(buildPlaceDetailsUrl(s, s1)), s1);
        }
    }

    public final List getAddresses(CharSequence charsequence, char c, char ac[], String s, String s1)
    {
        while (charsequence == null || charsequence.length() < getThresholdForField(c) || !isFieldSupported(c)) 
        {
            return null;
        }
        return convertJsonObjectToAddressSourceResults(fetchJsonObject(buildPlacesAutocompleteUrl(charsequence, c, s, s1)), charsequence, c);
    }

    public final String getName()
    {
        return "GooglePlacesAddressSource";
    }

}
