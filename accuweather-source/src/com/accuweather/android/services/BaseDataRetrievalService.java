// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import com.accuweather.android.parsers.BaseJsonParser;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.squareup.okhttp.OkHttpClient;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;

public abstract class BaseDataRetrievalService
{

    protected static final String ACCUWEATHER_JSON_API_KEY = "srRLeAmTroxPinDG8Aus3Ikl6tLGJd94";
    protected static final String ALIAS_URL_PARAMETER_NAME = "alias";
    protected static final String ALWAYS_PARAMETER_NAME = "always";
    protected static final String API_DOMAIN = "api";
    protected static final String API_KEY_URL_PARAMETER_NAME = "apikey";
    protected static final String DETAILS_URL_PARAMETER_NAME = "details";
    protected static final String DEV_API_DOMAIN = "apidev";
    protected static final String EXACT_MATCH_PARAMETER_NAME = "exactMatch";
    protected static final String LANGUAGE_URL_PARAMETER_NAME = "language";
    protected static final String LAT_LON_QUERY_PARAMETER_NAME = "q";
    protected static final String TAGS_PARAMETER_NAME = "tags";
    private static Gson gson = new Gson();
    private OkHttpClient client;

    public BaseDataRetrievalService()
    {
        client = new OkHttpClient();
    }

    protected void closeInputStream(InputStream inputstream)
    {
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        inputstream.close();
        return;
        inputstream;
    }

    protected void closeReader(JsonReader jsonreader)
    {
        if (jsonreader == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        jsonreader.close();
        return;
        jsonreader;
    }

    protected InputStream getInputStream(String s)
        throws IOException
    {
        s = new URL(s);
        s = client.open(s);
        s.setRequestProperty("Cache-Control", "no-cache");
        s.setUseCaches(false);
        s.setDefaultUseCaches(false);
        s.setReadTimeout(15000);
        return s.getInputStream();
    }

    protected JsonReader getReader(InputStream inputstream)
        throws IOException
    {
        return new JsonReader(new BufferedReader(new InputStreamReader(inputstream)));
    }

    public Object parse(String s, BaseJsonParser basejsonparser)
        throws IOException
    {
        String s1;
        JsonReader jsonreader;
        JsonReader jsonreader1;
        jsonreader1 = null;
        s1 = null;
        jsonreader = jsonreader1;
        s = getInputStream(s);
        s1 = s;
        jsonreader = jsonreader1;
        jsonreader1 = getReader(s);
        s1 = s;
        jsonreader = jsonreader1;
        basejsonparser = ((BaseJsonParser) (basejsonparser.parse(jsonreader1)));
        closeReader(jsonreader1);
        closeInputStream(s);
        return basejsonparser;
        s;
        closeReader(jsonreader);
        closeInputStream(s1);
        throw s;
    }

    protected Object parse(String s, Class class1)
        throws URISyntaxException, IOException
    {
        String s1;
        JsonReader jsonreader;
        JsonReader jsonreader1;
        jsonreader1 = null;
        s1 = null;
        jsonreader = jsonreader1;
        s = getInputStream(s);
        s1 = s;
        jsonreader = jsonreader1;
        jsonreader1 = getReader(s);
        s1 = s;
        jsonreader = jsonreader1;
        class1 = ((Class) (gson.fromJson(jsonreader1, class1)));
        closeReader(jsonreader1);
        closeInputStream(s);
        return class1;
        s;
        closeReader(jsonreader);
        closeInputStream(s1);
        throw s;
    }

}
