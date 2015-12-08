// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tune.crosspromo;

import android.net.Uri;
import com.mobileapptracker.MATUtils;
import com.mobileapptracker.MobileAppTracker;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

// Referenced classes of package com.tune.crosspromo:
//            TuneAdUtils, TuneAdParams, TuneBadRequestException, TuneServerErrorException, 
//            TuneAdView

public class TuneAdClient
{

    private static String a;
    private static String b;
    private static boolean c;
    private static TuneAdUtils d;

    public static String a(TuneAdParams tuneadparams)
    {
        return a("interstitial", tuneadparams);
    }

    public static String a(String s, TuneAdParams tuneadparams)
    {
        Object obj = null;
        if (MobileAppTracker.a(d.c()))
        {
            if (c)
            {
                obj = Uri.parse((new StringBuilder()).append("http://").append(b).append("/api/v1/ads/request").toString()).buildUpon();
            } else
            {
                obj = Uri.parse((new StringBuilder()).append("https://").append(a).append(".request.").append(b).append("/request").toString()).buildUpon();
            }
            ((android.net.Uri.Builder) (obj)).encodedQuery((new StringBuilder()).append("context[type]=").append(s).toString());
            obj = a(((android.net.Uri.Builder) (obj)).build().toString(), tuneadparams.a());
        }
        return ((String) (obj));
    }

    public static String a(String s, JSONObject jsonobject)
    {
        Object obj;
        JSONObject jsonobject1;
        String s1;
        s1 = null;
        jsonobject1 = null;
        obj = s1;
        HttpURLConnection httpurlconnection = (HttpURLConnection)(new URL(s)).openConnection();
        obj = s1;
        httpurlconnection.setReadTimeout(60000);
        obj = s1;
        httpurlconnection.setConnectTimeout(60000);
        obj = s1;
        httpurlconnection.setDoInput(true);
        obj = s1;
        httpurlconnection.setDoOutput(true);
        obj = s1;
        httpurlconnection.setRequestProperty("Content-Type", "application/json");
        obj = s1;
        httpurlconnection.setRequestProperty("Accept", "application/json");
        obj = s1;
        httpurlconnection.setRequestMethod("POST");
        obj = s1;
        s = httpurlconnection.getOutputStream();
        obj = s1;
        s.write(jsonobject.toString().getBytes("UTF-8"));
        obj = s1;
        s.close();
        obj = s1;
        httpurlconnection.connect();
        obj = s1;
        int i = httpurlconnection.getResponseCode();
        if (i != 200)
        {
            break MISSING_BLOCK_LABEL_198;
        }
        obj = s1;
        jsonobject = httpurlconnection.getInputStream();
        s = jsonobject;
        obj = jsonobject;
        jsonobject1 = jsonobject;
        s1 = MATUtils.a(httpurlconnection.getInputStream());
        if (jsonobject != null)
        {
            try
            {
                jsonobject.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return s1;
            }
        }
        return s1;
        obj = s1;
        jsonobject = httpurlconnection.getErrorStream();
        s = jsonobject;
        obj = jsonobject;
        jsonobject1 = jsonobject;
        a(i, MATUtils.a(jsonobject));
        if (jsonobject != null)
        {
            try
            {
                jsonobject.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
_L1:
        return null;
        jsonobject;
        s = jsonobject1;
_L4:
        obj = s;
        jsonobject.printStackTrace();
        obj = s;
        throw new ConnectException();
        s;
_L2:
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                jsonobject.printStackTrace();
            }
        }
        throw s;
        jsonobject;
        obj = null;
_L3:
        s = ((String) (obj));
        jsonobject.printStackTrace();
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
          goto _L1
        jsonobject;
        obj = s;
        s = jsonobject;
          goto _L2
        jsonobject;
          goto _L3
        jsonobject;
        s = jsonobject1;
          goto _L4
    }

    private static void a(int i, String s)
    {
        if (i >= 400 && i < 500)
        {
            throw new TuneBadRequestException(s);
        }
        if (i >= 500)
        {
            throw new TuneServerErrorException(s);
        } else
        {
            return;
        }
    }

    public static void a(TuneAdView tuneadview, JSONObject jsonobject)
    {
        if (MobileAppTracker.a(d.c()))
        {
            d.e().execute(new Runnable(tuneadview, jsonobject) {

                final TuneAdView a;
                final JSONObject b;

                public void run()
                {
                    android.net.Uri.Builder builder;
                    if (TuneAdClient.a())
                    {
                        builder = Uri.parse((new StringBuilder()).append("http://").append(TuneAdClient.b()).append("/api/v1/ads/event").toString()).buildUpon();
                    } else
                    {
                        builder = Uri.parse((new StringBuilder()).append("https://").append(TuneAdClient.c()).append(".event.").append(TuneAdClient.b()).append("/event").toString()).buildUpon();
                    }
                    builder.appendQueryParameter("action", "view").appendQueryParameter("requestId", a.c);
                    TuneAdClient.b(builder.build().toString(), b);
                }

            
            {
                a = tuneadview;
                b = jsonobject;
                super();
            }
            });
        }
    }

    static boolean a()
    {
        return c;
    }

    static String b()
    {
        return b;
    }

    public static void b(TuneAdView tuneadview, JSONObject jsonobject)
    {
        if (MobileAppTracker.a(d.c()))
        {
            d.e().execute(new Runnable(tuneadview, jsonobject) {

                final TuneAdView a;
                final JSONObject b;

                public void run()
                {
                    android.net.Uri.Builder builder;
                    if (TuneAdClient.a())
                    {
                        builder = Uri.parse((new StringBuilder()).append("http://").append(TuneAdClient.b()).append("/api/v1/ads/click").toString()).buildUpon();
                    } else
                    {
                        builder = Uri.parse((new StringBuilder()).append("https://").append(TuneAdClient.c()).append(".click.").append(TuneAdClient.b()).append("/click").toString()).buildUpon();
                    }
                    builder.appendQueryParameter("action", "click").appendQueryParameter("requestId", a.c);
                    TuneAdClient.b(builder.build().toString(), b);
                }

            
            {
                a = tuneadview;
                b = jsonobject;
                super();
            }
            });
        }
    }

    static void b(String s, JSONObject jsonobject)
    {
        c(s, jsonobject);
    }

    static String c()
    {
        return a;
    }

    public static void c(TuneAdView tuneadview, JSONObject jsonobject)
    {
        if (MobileAppTracker.a(d.c()))
        {
            d.e().execute(new Runnable(tuneadview, jsonobject) {

                final TuneAdView a;
                final JSONObject b;

                public void run()
                {
                    android.net.Uri.Builder builder;
                    if (TuneAdClient.a())
                    {
                        builder = Uri.parse((new StringBuilder()).append("http://").append(TuneAdClient.b()).append("/api/v1/ads/event").toString()).buildUpon();
                    } else
                    {
                        builder = Uri.parse((new StringBuilder()).append("https://").append(TuneAdClient.c()).append(".event.").append(TuneAdClient.b()).append("/event").toString()).buildUpon();
                    }
                    builder.appendQueryParameter("action", "close").appendQueryParameter("requestId", a.c);
                    TuneAdClient.b(builder.build().toString(), b);
                }

            
            {
                a = tuneadview;
                b = jsonobject;
                super();
            }
            });
        }
    }

    private static void c(String s, JSONObject jsonobject)
    {
        HttpURLConnection httpurlconnection = (HttpURLConnection)(new URL(s)).openConnection();
        httpurlconnection.setReadTimeout(60000);
        httpurlconnection.setConnectTimeout(60000);
        httpurlconnection.setDoOutput(true);
        httpurlconnection.setRequestProperty("Content-Type", "application/json");
        httpurlconnection.setRequestProperty("Accept", "application/json");
        httpurlconnection.setRequestMethod("POST");
        s = httpurlconnection.getOutputStream();
        s.write(jsonobject.toString().getBytes("UTF-8"));
        s.close();
        httpurlconnection.connect();
        if (true)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        throw new NullPointerException();
_L2:
        return;
        s;
        s.printStackTrace();
        return;
        s;
        s.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            throw new NullPointerException();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        return;
        jsonobject;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
        throw jsonobject;
    }
}
