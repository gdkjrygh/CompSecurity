// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Utils
{

    private static final String TAG = "Utils";

    public Utils()
    {
    }

    public static String cleanString(String s)
    {
        return s.replaceAll(" ", "").replaceAll("'", "").replaceAll("-", "");
    }

    public static double convertMetersToMiles(long l)
    {
        return roundTwoDecimals(((double)l * 0.000621371192D * 100D) / 100D);
    }

    public static int convertMilesToMeters(int i)
    {
        return i * 1609;
    }

    public static double deg2rad(double d)
    {
        return (3.1415926535897931D * d) / 180D;
    }

    public static String getDateAsISO8601String()
    {
        String s = (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'")).format(new Date());
        System.out.println((new StringBuilder()).append("Current Date Time : ").append(s).toString());
        return s;
    }

    public static Date getDateFromISO8601String(String s)
    {
        String s1 = null;
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");
        try
        {
            s = simpledateformat.parse(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return s1;
        }
        s1 = s;
        System.out.println(s);
        return s;
    }

    public static Date getDateFromString(String s)
    {
        String s1 = null;
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd");
        try
        {
            s = simpledateformat.parse(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return s1;
        }
        s1 = s;
        System.out.println(s);
        return s;
    }

    public static double getDistanceBetweenLocations(double d, double d1, double d2, double d3, 
            String s)
    {
        d1 = 60D * rad2deg(Math.acos(Math.sin(deg2rad(d)) * Math.sin(deg2rad(d2)) + Math.cos(deg2rad(d)) * Math.cos(deg2rad(d2)) * Math.cos(deg2rad(d1 - d3)))) * 1.1515D;
        if (s.equalsIgnoreCase("K"))
        {
            d = d1 * 1.6093440000000001D;
        } else
        {
            d = d1;
            if (s.equalsIgnoreCase("N"))
            {
                return d1 * 0.86839999999999995D;
            }
        }
        return d;
    }

    public static String getFormattedAddressFromGeolocationData(JSONObject jsonobject)
    {
        try
        {
            jsonobject = jsonobject.getJSONArray("results");
            Log.e("Utils", (new StringBuilder()).append("formatted_address: ").append(jsonobject.getJSONObject(0).getString("formatted_address")).toString());
            jsonobject = jsonobject.getJSONObject(0).getString("formatted_address");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.e("Utils", "getFormattedAddressFromGeolocationData --- ooops failed to parse the JSON");
            return null;
        }
        return jsonobject;
    }

    public static String getFormattedLocalyticsTag(String s, String s1)
    {
        logger("Utils", (new StringBuilder()).append("localyticsTag:").append(s).toString());
        logger("Utils", (new StringBuilder()).append("appTag:").append(s1).toString());
        s1 = cleanString(s1);
        if (s.indexOf("*") > -1)
        {
            s = s.replace("*", s1);
        } else
        {
            s = (new StringBuilder()).append(s).append(s1).toString();
        }
        logger("Utils", (new StringBuilder()).append("final localyticsTag:").append(s).toString());
        return s;
    }

    public static HashMap getLocationFromGeolocationData(JSONObject jsonobject)
    {
        HashMap hashmap = new HashMap();
        try
        {
            jsonobject = jsonobject.getJSONArray("results");
            Log.e("Utils", (new StringBuilder()).append("results: ").append(jsonobject.toString()).toString());
            jsonobject = jsonobject.getJSONObject(0).getJSONObject("geometry");
            Log.e("Utils", (new StringBuilder()).append("geometry: ").append(jsonobject.toString()).toString());
            Object obj = jsonobject.getJSONObject("location");
            Log.e("Utils", (new StringBuilder()).append("location: ").append(((JSONObject) (obj)).toString()).toString());
            jsonobject = ((JSONObject) (obj)).getString("lat");
            Log.e("Utils", (new StringBuilder()).append("lat: ").append(jsonobject).toString());
            obj = ((JSONObject) (obj)).getString("lng");
            Log.e("Utils", (new StringBuilder()).append("lng: ").append(((String) (obj))).toString());
            hashmap.put("latitude", jsonobject);
            hashmap.put("longitude", obj);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.e("Utils", "getLocationFromGeolocationData --- ooops failed to parse the JSON");
            return null;
        }
        return hashmap;
    }

    public static String getTodaysDateString()
    {
        String s = (new SimpleDateFormat("yyyy-MM-dd")).format(new Date());
        System.out.println((new StringBuilder()).append("Current Date Time : ").append(s).toString());
        return s;
    }

    public static int getVersionCode(Context context)
    {
        int i;
        try
        {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return 0;
        }
        return i;
    }

    public static void logger(String s, String s1)
    {
    }

    public static double rad2deg(double d)
    {
        return (180D * d) / 3.1415926535897931D;
    }

    public static double roundTwoDecimals(double d)
    {
        return Double.valueOf((new DecimalFormat("#.#")).format(d)).doubleValue();
    }
}
