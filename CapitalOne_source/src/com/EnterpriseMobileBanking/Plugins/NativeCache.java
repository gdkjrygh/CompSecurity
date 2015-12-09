// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.EnterpriseMobileBanking.AppHelper;
import com.EnterpriseMobileBanking.Utils.Log;
import java.util.HashMap;
import java.util.Map;
import org.apache.cordova.api.Plugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class NativeCache extends Plugin
{

    private static final String TAG = "NativeCache";
    private static android.content.SharedPreferences.Editor cache = null;
    private static SharedPreferences prefs = null;
    private static final Map resultsMap;
    PluginResult result;

    public NativeCache()
    {
        result = null;
    }

    private void cameraControl(String s)
    {
        try
        {
            result = new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, "success");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            result = new PluginResult(org.apache.cordova.api.PluginResult.Status.ERROR, "Failed to set cameraControl");
        }
    }

    public static boolean contains(String s)
    {
        setupPreferences();
        return prefs.contains(s);
    }

    private void delete(String s)
    {
        try
        {
            cache.remove(s);
            cache.commit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            result = new PluginResult(org.apache.cordova.api.PluginResult.Status.ERROR, "Failed to remove the key from cache");
        }
    }

    private void read(String s)
    {
        if (prefs.contains(s))
        {
            result = new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, prefs.getString(s, "xxx"));
            return;
        }
        try
        {
            result = new PluginResult(org.apache.cordova.api.PluginResult.Status.ERROR, "xxx");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            result = new PluginResult(org.apache.cordova.api.PluginResult.Status.ERROR, "Unknown Error");
        }
        return;
    }

    private static void setupPreferences()
    {
        if (prefs == null || cache == null)
        {
            prefs = PreferenceManager.getDefaultSharedPreferences(AppHelper.getAppContext());
            cache = prefs.edit();
        }
    }

    public static int staticRead(String s, int i)
    {
        setupPreferences();
        return prefs.getInt(s, i);
    }

    public static long staticRead(String s, long l)
    {
        setupPreferences();
        return prefs.getLong(s, l);
    }

    public static String staticRead(String s)
    {
        setupPreferences();
        return prefs.getString(s, null);
    }

    public static String staticRead(String s, String s1)
    {
        setupPreferences();
        return prefs.getString(s, s1);
    }

    public static boolean staticRead(String s, boolean flag)
    {
        setupPreferences();
        return prefs.getBoolean(s, flag);
    }

    public static boolean staticWrite(String s, int i)
    {
        cache.putInt(s, i);
        return cache.commit();
    }

    public static boolean staticWrite(String s, long l)
    {
        cache.putLong(s, l);
        return cache.commit();
    }

    public static boolean staticWrite(String s, String s1)
    {
        cache.putString(s, s1);
        return cache.commit();
    }

    public static boolean staticWrite(String s, boolean flag)
    {
        cache.putBoolean(s, flag);
        return cache.commit();
    }

    private void worklightProperties(JSONObject jsonobject, JSONArray jsonarray)
    {
        int i = 0;
_L2:
        if (i < jsonarray.length())
        {
            String s = jsonarray.get(i).toString();
            if (resultsMap.containsKey(s))
            {
                String s2 = jsonobject.optString(s, staticRead(s));
                write((String)resultsMap.get(s), s2);
            }
            break MISSING_BLOCK_LABEL_287;
        } else
        {
            try
            {
                String s3 = jsonobject.optString("FacebookApp", staticRead("SP_CONTACT_360_FACEBOOK"));
                String s4 = jsonobject.optString("FacebookHTTP", staticRead("SP_CONTACT_360_FACEBOOK"));
                jsonarray = jsonobject.optString("TwitterApp", staticRead("SP_CONTACT_360_TWITTER"));
                String s1 = jsonobject.optString("TwitterHTTP", staticRead("SP_CONTACT_360_TWITTER"));
                jsonobject = jsonobject.optString("threeSixtyProductsUrl", staticRead("SP_PRODUCTS_360_PRODUCTS_URL"));
                s3 = (new StringBuilder()).append("{ \"app\":\"").append(s3).append("\", \"web\":\"").append(s4).append("\" }").toString();
                jsonarray = (new StringBuilder()).append("{ \"app\":\"").append(jsonarray).append("\", \"web\":\"").append(s1).append("\" }").toString();
                write("SP_CONTACT_360_FACEBOOK", s3);
                write("SP_CONTACT_360_TWITTER", jsonarray);
                write("SP_PRODUCTS_360_PRODUCTS_AUTH_URL", jsonobject);
                write("SP_PRODUCTS_360_PRODUCTS_URL", jsonobject);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.v("NativeCache", (new StringBuilder()).append("Error parsing data ").append(jsonobject.toString()).toString());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.v("NativeCache", (new StringBuilder()).append("Error converting result ").append(jsonobject.toString()).toString());
            }
            return;
        }
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void write(String s, String s1)
    {
        try
        {
            cache.putString(s, s1);
            cache.commit();
            result = new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, "success");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            result = new PluginResult(org.apache.cordova.api.PluginResult.Status.ERROR, "failed");
        }
    }

    public PluginResult execute(String s, JSONArray jsonarray, String s1)
    {
        setupPreferences();
        s1 = jsonarray.getString(0).trim();
        if (!s.equals("read")) goto _L2; else goto _L1
_L1:
        read(s1);
_L3:
        return result;
_L2:
        if (!s.equals("write"))
        {
            break MISSING_BLOCK_LABEL_141;
        }
        s = jsonarray.getString(1).trim();
        if (!s1.equals("adapconfig") && !s1.equals("config"))
        {
            break MISSING_BLOCK_LABEL_126;
        }
        s = new JSONObject((new JSONObject(s)).getString("invocationResult"));
        worklightProperties(s, s.names());
          goto _L3
        s;
        result = new PluginResult(org.apache.cordova.api.PluginResult.Status.ERROR, "still an error");
        return result;
        write(s1, s);
          goto _L3
        s;
        return result;
label0:
        {
            if (!s.equals("delete"))
            {
                break label0;
            }
            delete(s1);
        }
          goto _L3
label1:
        {
            if (!s.equals("cameraControl"))
            {
                break label1;
            }
            cameraControl(s1);
        }
          goto _L3
        result = new PluginResult(org.apache.cordova.api.PluginResult.Status.ERROR, "invalid action");
          goto _L3
    }

    static 
    {
        resultsMap = new HashMap();
        resultsMap.put("PhoneNumber", "SP_CONTACT_360_US_PHONE");
        resultsMap.put("Email", "SP_CONTACT_360_EMAIL");
        resultsMap.put("threeSixtyProductsUrl", "SP_PRODUCTS_360_PRODUCTS_URL");
        resultsMap.put("atmThreeSixty", "SP_ATM_CAP360_ATM_LOCATOR");
    }
}
