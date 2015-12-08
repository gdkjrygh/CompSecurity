// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.utils;

import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Json
{

    private static final String TAG = "Json";

    public Json()
    {
    }

    public static JSONObject convertToJSON(String s)
    {
        try
        {
            s = new JSONObject(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("Json", (new StringBuilder()).append("Error parsing data ").append(s.toString()).toString());
            return null;
        }
        return s;
    }

    public static JSONObject getJSONfromURL(String s)
    {
        BufferedReader bufferedreader;
        StringBuilder stringbuilder;
        String s1;
        try
        {
            s = (new DefaultHttpClient()).execute(new HttpPost(s)).getEntity().getContent();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("Json", (new StringBuilder()).append("Error in http connection ").append(s.toString()).toString());
            return null;
        }
        bufferedreader = new BufferedReader(new InputStreamReader(s, "UTF-8"), 8);
        stringbuilder = new StringBuilder();
_L1:
        s1 = bufferedreader.readLine();
label0:
        {
            if (s1 == null)
            {
                break label0;
            }
            try
            {
                stringbuilder.append((new StringBuilder()).append(s1).append("\n").toString());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("Json", (new StringBuilder()).append("Error converting result ").append(s.toString()).toString());
                return null;
            }
        }
          goto _L1
        s.close();
        s = stringbuilder.toString();
        Log.i("Json", (new StringBuilder()).append("This is the json result: ").append(s).toString());
        try
        {
            s = new JSONObject(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("Json", (new StringBuilder()).append("Error parsing data ").append(s.toString()).toString());
            s = null;
        }
        return s;
    }

    public static JSONObject getJsonObjectByIndex(JSONObject jsonobject, String s, int i)
    {
        try
        {
            jsonobject = jsonobject.getJSONArray(s).getJSONObject(i);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.e("log_tag", (new StringBuilder()).append("Error parsing data ").append(jsonobject.toString()).toString());
            return null;
        }
        return jsonobject;
    }
}
