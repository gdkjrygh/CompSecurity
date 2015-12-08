// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import com.squareup.okhttp.OkHttpClient;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUtils
{

    public HttpUtils()
    {
    }

    public static String doGet(String s)
        throws Exception
    {
        Object obj;
        obj = (new OkHttpClient()).open(new URL(s));
        ((HttpURLConnection) (obj)).setReadTimeout(10000);
        s = null;
        obj = ((HttpURLConnection) (obj)).getInputStream();
        s = ((String) (obj));
        String s1 = readResponse(((InputStream) (obj)));
        if (obj != null)
        {
            ((InputStream) (obj)).close();
        }
        return s1;
        Exception exception;
        exception;
        if (s != null)
        {
            s.close();
        }
        throw exception;
    }

    private static String readResponse(InputStream inputstream)
        throws IOException
    {
        inputstream = new BufferedReader(new InputStreamReader(inputstream));
        StringBuilder stringbuilder = new StringBuilder();
        char ac[] = new char[1024];
        do
        {
            int i = inputstream.read(ac);
            if (i != -1)
            {
                stringbuilder.append(ac, 0, i);
            } else
            {
                return stringbuilder.toString();
            }
        } while (true);
    }
}
