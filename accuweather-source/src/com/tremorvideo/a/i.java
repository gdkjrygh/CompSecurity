// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.a;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public final class i
{

    public static Bundle a(String s)
    {
        Bundle bundle = new Bundle();
        if (s != null)
        {
            s = s.split("&");
            int k = s.length;
            for (int j = 0; j < k; j++)
            {
                String as[] = s[j].split("=");
                bundle.putString(URLDecoder.decode(as[0]), URLDecoder.decode(as[1]));
            }

        }
        return bundle;
    }

    public static String a(Bundle bundle)
    {
        if (bundle == null)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = bundle.keySet().iterator();
        boolean flag = true;
        while (iterator.hasNext()) 
        {
            String s = (String)iterator.next();
            if (flag)
            {
                flag = false;
            } else
            {
                stringbuilder.append("&");
            }
            stringbuilder.append((new StringBuilder()).append(URLEncoder.encode(s)).append("=").append(URLEncoder.encode(bundle.getString(s))).toString());
        }
        return stringbuilder.toString();
    }

    public static String a(Bundle bundle, String s)
    {
        if (bundle == null)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = bundle.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if (bundle.getByteArray(s1) == null)
            {
                stringbuilder.append((new StringBuilder()).append("Content-Disposition: form-data; name=\"").append(s1).append("\"\r\n\r\n").append(bundle.getString(s1)).toString());
                stringbuilder.append((new StringBuilder()).append("\r\n--").append(s).append("\r\n").toString());
            }
        } while (true);
        return stringbuilder.toString();
    }

    private static String a(InputStream inputstream)
        throws IOException
    {
        StringBuilder stringbuilder = new StringBuilder();
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(inputstream), 1000);
        for (String s = bufferedreader.readLine(); s != null; s = bufferedreader.readLine())
        {
            stringbuilder.append(s);
        }

        inputstream.close();
        return stringbuilder.toString();
    }

    public static String a(String s, String s1, Bundle bundle)
        throws MalformedURLException, IOException
    {
        String s2 = s;
        if (s1.equals("GET"))
        {
            s2 = (new StringBuilder()).append(s).append("?").append(a(bundle)).toString();
        }
        Log.d("Facebook-Util", (new StringBuilder()).append(s1).append(" URL: ").append(s2).toString());
        s = (HttpURLConnection)(new URL(s2)).openConnection();
        s.setRequestProperty("User-Agent", (new StringBuilder()).append(System.getProperties().getProperty("http.agent")).append(" FacebookAndroidSDK").toString());
        s.setConnectTimeout(3000);
        s.setReadTimeout(3000);
        if (!s1.equals("GET"))
        {
            Bundle bundle1 = new Bundle();
            Iterator iterator = bundle.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s4 = (String)iterator.next();
                if (bundle.getByteArray(s4) != null)
                {
                    bundle1.putByteArray(s4, bundle.getByteArray(s4));
                }
            } while (true);
            if (!bundle.containsKey("method"))
            {
                bundle.putString("method", s1);
            }
            if (bundle.containsKey("access_token"))
            {
                bundle.putString("access_token", URLDecoder.decode(bundle.getString("access_token")));
            }
            s.setRequestMethod("POST");
            s.setRequestProperty("Content-Type", (new StringBuilder()).append("multipart/form-data;boundary=").append("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f").toString());
            s.setDoOutput(true);
            s.setDoInput(true);
            s.setRequestProperty("Connection", "Keep-Alive");
            s.connect();
            s1 = new BufferedOutputStream(s.getOutputStream());
            s1.write((new StringBuilder()).append("--").append("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f").append("\r\n").toString().getBytes());
            s1.write(a(bundle, "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f").getBytes());
            s1.write((new StringBuilder()).append("\r\n").append("--").append("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f").append("\r\n").toString().getBytes());
            if (!bundle1.isEmpty())
            {
                for (bundle = bundle1.keySet().iterator(); bundle.hasNext(); s1.write((new StringBuilder()).append("\r\n").append("--").append("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f").append("\r\n").toString().getBytes()))
                {
                    String s3 = (String)bundle.next();
                    s1.write((new StringBuilder()).append("Content-Disposition: form-data; filename=\"").append(s3).append("\"").append("\r\n").toString().getBytes());
                    s1.write((new StringBuilder()).append("Content-Type: content/unknown").append("\r\n").append("\r\n").toString().getBytes());
                    s1.write(bundle1.getByteArray(s3));
                }

            }
            s1.flush();
        }
        try
        {
            s1 = a(s.getInputStream());
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return a(s.getErrorStream());
        }
        return s1;
    }

    public static void a(Context context)
    {
        CookieSyncManager.createInstance(context);
        CookieManager.getInstance().removeAllCookie();
    }

    public static void a(Context context, String s, String s1)
    {
        context = new android.app.AlertDialog.Builder(context);
        context.setTitle(s);
        context.setMessage(s1);
        context.create().show();
    }

    public static Bundle b(String s)
    {
        s = s.replace("fbconnect", "http");
        Bundle bundle;
        try
        {
            s = new URL(s);
            bundle = a(s.getQuery());
            bundle.putAll(a(s.getRef()));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return new Bundle();
        }
        return bundle;
    }
}
