// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.utils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public abstract class TinyURLUtils
{

    private static String tinyUrl;

    public TinyURLUtils()
    {
    }

    public static String getTinyUrl(String s)
    {
        DefaultHttpClient defaulthttpclient = new DefaultHttpClient();
        HttpPost httppost = new HttpPost("http://tinyurl.com/api-create.php");
        ArrayList arraylist = new ArrayList(2);
        arraylist.add(new BasicNameValuePair("url", s));
        try
        {
            httppost.setEntity(new UrlEncodedFormEntity(arraylist));
            tinyUrl = EntityUtils.toString(defaulthttpclient.execute(httppost).getEntity());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            tinyUrl = "Problem";
            s.printStackTrace();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            tinyUrl = "ClientProtocolProblem";
            s.printStackTrace();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            tinyUrl = "IOException";
            s.printStackTrace();
        }
        return tinyUrl;
    }
}
