// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.parse;

import com.tinder.model.TinderLocation;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class h
{

    public static List a(JSONObject jsonobject)
        throws JSONException
    {
        int i = 0;
        jsonobject = jsonobject.optJSONArray("results");
        if (jsonobject == null)
        {
            return new ArrayList(0);
        }
        ArrayList arraylist = new ArrayList(jsonobject.length());
        for (; i < jsonobject.length(); i++)
        {
            arraylist.add(b(jsonobject.getJSONObject(i)));
        }

        return arraylist;
    }

    public static TinderLocation b(JSONObject jsonobject)
        throws JSONException
    {
        TinderLocation tinderlocation = new TinderLocation();
        if (jsonobject.has("locality"))
        {
            tinderlocation.setCity(jsonobject.getJSONObject("locality").optString("long_name"));
        }
        if (jsonobject.has("administrative_area_level_1"))
        {
            Object obj = jsonobject.getJSONObject("administrative_area_level_1");
            String s = ((JSONObject) (obj)).optString("short_name");
            obj = ((JSONObject) (obj)).optString("long_name");
            tinderlocation.setStateProvinceShort(s);
            tinderlocation.setStateProvinceLong(((String) (obj)));
        }
        if (jsonobject.has("administrative_area_level_2"))
        {
            tinderlocation.setCounty(jsonobject.optJSONObject("administrative_area_level_2").optString("long_name"));
        }
        if (jsonobject.has("country"))
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject("country");
            String s1 = jsonobject1.optString("short_name");
            tinderlocation.setCountryLong(jsonobject1.optString("long_name"));
            tinderlocation.setCountryShort(s1);
        }
        if (jsonobject.has("route"))
        {
            tinderlocation.setRoute(jsonobject.getJSONObject("route").optString("short_name"));
        }
        if (jsonobject.has("street_number"))
        {
            tinderlocation.setStreetNumber(jsonobject.getJSONObject("street_number").getString("short_name"));
        }
        tinderlocation.setAddress(jsonobject.optString("street_address"));
        tinderlocation.setLatitude(jsonobject.optDouble("lat"));
        tinderlocation.setLongitude(jsonobject.optDouble("lon"));
        return tinderlocation;
    }
}
