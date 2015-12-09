// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.util;

import android.app.Application;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.ibm.eo.EOCore;
import com.ibm.eo.http.TLDefaultHttpClient;
import com.ibm.eo.service.EnvironmentalDataService;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.StatusLine;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.ibm.eo.util:
//            LogInternal, ConnectionReceiver, ScreenReceiver

public final class HTTPUtil
{

    private static final int BUFFER_SIZE = 1024;
    private static final int SUCCESS_IM_USED_RFC_3229 = 226;
    private static final int SUCCESS_OK = 200;
    public static final String TLF_SESSION_ID_FROM_PCA = "TLTSID";
    public static final String UTF_8 = "UTF-8";
    private static volatile HTTPUtil _myInstance;

    private HTTPUtil()
    {
    }

    public static String convertStreamToString(InputStream inputstream)
    {
        Object obj = "";
        if (inputstream == null) goto _L2; else goto _L1
_L1:
        char ac[];
        obj = new StringBuffer();
        ac = new char[1024];
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(inputstream, "UTF-8"));
_L5:
        int i = bufferedreader.read(ac);
        if (i == -1) goto _L4; else goto _L3
_L3:
        ((StringBuffer) (obj)).append(ac, 0, i);
          goto _L5
        Exception exception1;
        exception1;
        LogInternal.logException(exception1);
        inputstream.close();
_L7:
        obj = ((StringBuffer) (obj)).toString().trim();
_L2:
        return ((String) (obj));
_L4:
        inputstream.close();
        if (true) goto _L7; else goto _L6
_L6:
        Exception exception;
        exception;
        inputstream.close();
        throw exception;
    }

    public static AbstractHttpEntity createEntity(String s, Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            s = s.getBytes("UTF-8");
            boolean1 = new ByteArrayOutputStream(s.length);
            GZIPOutputStream gzipoutputstream = new GZIPOutputStream(boolean1);
            gzipoutputstream.write(s);
            gzipoutputstream.finish();
            gzipoutputstream.close();
            return new ByteArrayEntity(boolean1.toByteArray());
        } else
        {
            return new StringEntity(s);
        }
    }

    public static CookieSyncManager getCookieSyncManager()
    {
        CookieSyncManager cookiesyncmanager = null;
        CookieSyncManager cookiesyncmanager1 = CookieSyncManager.getInstance();
        cookiesyncmanager = cookiesyncmanager1;
_L2:
        CookieSyncManager cookiesyncmanager2 = cookiesyncmanager;
        if (cookiesyncmanager == null)
        {
            cookiesyncmanager2 = CookieSyncManager.createInstance(EOCore.getApplication().getApplicationContext());
        }
        return cookiesyncmanager2;
        Exception exception;
        exception;
        LogInternal.logException(exception, "CookieSyncManager is null will need to create it to sync cookies.");
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String getCookieValue(URLConnection urlconnection, String s)
    {
        String s1 = null;
        if ((urlconnection == null || urlconnection.getHeaderFields() == null) && s == null)
        {
            return null;
        }
        CookieSyncManager cookiesyncmanager = getCookieSyncManager();
        CookieManager cookiemanager = CookieManager.getInstance();
        LogInternal.log("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
        LogInternal.log("Header from request:");
        for (Iterator iterator = urlconnection.getHeaderFields().entrySet().iterator(); iterator.hasNext();)
        {
            Object obj = (java.util.Map.Entry)iterator.next();
            if (obj != null)
            {
                LogInternal.log((new StringBuilder()).append((String)((java.util.Map.Entry) (obj)).getKey()).append(": ").append(((java.util.Map.Entry) (obj)).getValue()).append("\n").toString());
                if (((java.util.Map.Entry) (obj)).getKey() != null && "Set-Cookie".equalsIgnoreCase((String)((java.util.Map.Entry) (obj)).getKey()))
                {
                    obj = ((List)((java.util.Map.Entry) (obj)).getValue()).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        String s2 = (String)((Iterator) (obj)).next();
                        if (cookiemanager != null)
                        {
                            cookiemanager.setCookie(urlconnection.getURL().toString(), s2);
                        }
                        s2 = s2.substring(0, s2.indexOf(';'));
                        if (s2.substring(0, s2.indexOf('=')).equals(s))
                        {
                            s1 = s2.substring(s2.indexOf('=') + 1, s2.length());
                        }
                    }
                }
            }
        }

        cookiesyncmanager.sync();
        LogInternal.log("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        return s1;
    }

    public static String getHeaders(Header aheader[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < aheader.length; i++)
        {
            stringbuilder.append((new StringBuilder()).append(aheader[i].toString()).append("\n").toString());
        }

        return stringbuilder.toString();
    }

    public static HTTPUtil getInstance()
    {
        com/ibm/eo/util/HTTPUtil;
        JVM INSTR monitorenter ;
        HTTPUtil httputil;
        if (_myInstance == null)
        {
            _myInstance = new HTTPUtil();
        }
        httputil = _myInstance;
        com/ibm/eo/util/HTTPUtil;
        JVM INSTR monitorexit ;
        return httputil;
        Exception exception;
        exception;
        throw exception;
    }

    public static Boolean sendHttpGet(String s, String s1, String s2, HashMap hashmap)
    {
        if (s2 == null)
        {
            return Boolean.valueOf(false);
        }
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        if (EOCore.getEnvironmentalDataService() != null && EOCore.getEnvironmentalDataService().getConnectionReceiver() != null && EOCore.getEnvironmentalDataService().getConnectionReceiver().isOnline().booleanValue())
        {
            break MISSING_BLOCK_LABEL_48;
        }
        return Boolean.valueOf(false);
        s2 = new JSONObject(s2);
        hashmap = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(hashmap, EOCore.getConfigItemInt("PostMessageTimeout", EOCore.getInstance()));
        HttpConnectionParams.setSoTimeout(hashmap, EOCore.getConfigItemInt("PostMessageSocketTimeout", EOCore.getInstance()));
        HttpProtocolParams.setVersion(hashmap, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setUseExpectContinue(hashmap, false);
        s1 = new TLDefaultHttpClient(hashmap, s1, Boolean.valueOf(false));
        s2 = (JSONArray)s2.get("sessions");
        if (s2 != null) goto _L2; else goto _L1
_L1:
        return Boolean.valueOf(false);
_L7:
        int i;
        if (i >= s2.length()) goto _L4; else goto _L3
_L3:
        hashmap = (JSONObject)s2.get(i);
        if (hashmap != null)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        return Boolean.valueOf(false);
        hashmap = (JSONArray)hashmap.get("messages");
        int j = 0;
_L6:
        StringBuffer stringbuffer;
        if (j >= hashmap.length())
        {
            break MISSING_BLOCK_LABEL_526;
        }
        JSONObject jsonobject = (JSONObject)hashmap.get(j);
        stringbuffer = new StringBuffer();
        for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); stringbuffer.append("&"))
        {
            String s3 = (String)iterator.next();
            String s4 = jsonobject.getString(s3);
            stringbuffer.append(s3);
            stringbuffer.append("=");
            stringbuffer.append(URLEncoder.encode(s4, "UTF-8"));
        }

        int k;
        try
        {
            stringbuffer.deleteCharAt(stringbuffer.length() - 1);
            Object obj = (new StringBuilder()).append(s).append("?").append(stringbuffer.toString()).toString();
            LogInternal.log((new StringBuilder()).append("DigitalAnalytics Post Url: ").append(((String) (obj))).toString());
            obj = new HttpGet(((String) (obj)));
            getCookieSyncManager();
            CookieManager.getInstance();
            obj = s1.execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
            ((HttpResponse) (obj)).getEntity().consumeContent();
            k = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            LogInternal.logException(s1, (new StringBuilder()).append("url:").append(s).toString());
            return Boolean.valueOf(false);
        }
        if (k < 200 || k > 226)
        {
            break; /* Loop/switch isn't completed */
        }
        LogInternal.log("DigitalAnalytics Tag successfully sent");
        j++;
        if (true) goto _L6; else goto _L5
_L5:
        LogInternal.log((new StringBuilder()).append("Got back status code:").append(k).append(" from url:").append(s).toString());
        LogInternal.log("DigitalAnalytics Tag send Failure");
        return Boolean.valueOf(false);
_L4:
        return Boolean.valueOf(true);
_L2:
        i = 0;
          goto _L7
        i++;
          goto _L7
    }

    public static Boolean sendHttpImagePost(String s, String s1, String s2, ByteArrayOutputStream bytearrayoutputstream, HashMap hashmap)
    {
        if (s2 == null)
        {
            return Boolean.valueOf(false);
        } else
        {
            return sendPost(s, null, Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), null, s2, s1, bytearrayoutputstream, hashmap);
        }
    }

    public static Boolean sendHttpImagePost(String s, String s1, String s2, String s3, HashMap hashmap)
    {
        if (s3 == null)
        {
            return Boolean.valueOf(false);
        } else
        {
            return sendPost(s, null, Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), s2, s3, s1, null, hashmap);
        }
    }

    public static Boolean sendHttpPost(String s, String s1, String s2, Boolean boolean1, Boolean boolean2, HashMap hashmap)
    {
        if (s2 == null)
        {
            return Boolean.valueOf(false);
        } else
        {
            return sendPost(s, s2, boolean1, Boolean.valueOf(true), boolean2, null, null, s1, null, hashmap);
        }
    }

    private static Boolean sendPost(String s, String s1, Boolean boolean1, Boolean boolean2, Boolean boolean3, String s2, String s3, String s4, 
            ByteArrayOutputStream bytearrayoutputstream, HashMap hashmap)
    {
        if (s1 == null && s3 == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        if (EOCore.getEnvironmentalDataService() != null && EOCore.getEnvironmentalDataService().getConnectionReceiver() != null && EOCore.getEnvironmentalDataService().getConnectionReceiver().isOnline().booleanValue())
        {
            break MISSING_BLOCK_LABEL_44;
        }
        return Boolean.valueOf(false);
        s2 = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(s2, EOCore.getConfigItemInt("PostMessageTimeout", EOCore.getInstance()));
        HttpConnectionParams.setSoTimeout(s2, EOCore.getConfigItemInt("PostMessageSocketTimeout", EOCore.getInstance()));
        HttpProtocolParams.setVersion(s2, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setUseExpectContinue(s2, false);
        s2 = new TLDefaultHttpClient(s2, s4, boolean3);
        if (!boolean2.booleanValue()) goto _L2; else goto _L1
_L1:
        boolean3 = s;
_L5:
        boolean3 = new HttpPost(boolean3);
        boolean3.setHeader("Accept-Language", "en-US");
        if (!boolean2.booleanValue())
        {
            break MISSING_BLOCK_LABEL_444;
        }
        s1 = createEntity(s1, boolean1);
        boolean3.setHeader("Content-Type", "text/json; charset=UTF-8");
        if (boolean1.booleanValue())
        {
            boolean3.setHeader("Content-Encoding", "gzip");
        }
_L7:
        if (hashmap == null) goto _L4; else goto _L3
_L3:
        for (boolean1 = hashmap.entrySet().iterator(); boolean1.hasNext(); boolean3.setHeader((String)boolean2.getKey(), (String)boolean2.getValue()))
        {
            boolean2 = (java.util.Map.Entry)boolean1.next();
        }

          goto _L4
        s1;
        LogInternal.logException(s1, (new StringBuilder()).append("url:").append(s).toString());
_L6:
        return Boolean.valueOf(false);
_L2:
        boolean3 = (new StringBuilder()).append(s).append("?width=").append(EOCore.getEnvironmentalDataService().getScreenReceiver().getDeviceWidth()).append("&height=").append(EOCore.getEnvironmentalDataService().getScreenReceiver().getDeviceHeight()).append("&orientation=").append(EOCore.getEnvironmentalDataService().getScreenReceiver().getRotation()).toString();
          goto _L5
_L4:
        int i;
        boolean3.setEntity(s1);
        s1 = s2.execute(boolean3);
        updateCookies(s2, s);
        i = s1.getStatusLine().getStatusCode();
        if (i < 200 || i > 226)
        {
            break MISSING_BLOCK_LABEL_407;
        }
        return Boolean.valueOf(true);
        LogInternal.log((new StringBuilder()).append("Got back status code:").append(i).append(" from url:").append(s).toString());
          goto _L6
        s1 = null;
          goto _L7
    }

    private static Boolean updateCookies(DefaultHttpClient defaulthttpclient, String s)
    {
        Object obj = defaulthttpclient.getCookieStore().getCookies();
        if (!((List) (obj)).isEmpty())
        {
            defaulthttpclient = getCookieSyncManager();
            CookieManager cookiemanager = CookieManager.getInstance();
            if (cookiemanager != null)
            {
                StringBuilder stringbuilder;
                for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); cookiemanager.setCookie(s, validateData(stringbuilder.toString())))
                {
                    Cookie cookie = (Cookie)((Iterator) (obj)).next();
                    stringbuilder = new StringBuilder();
                    stringbuilder.append((new StringBuilder()).append(cookie.getName()).append("=").append(cookie.getValue()).toString());
                    stringbuilder.append((new StringBuilder()).append("; domain=").append(cookie.getDomain()).toString());
                    stringbuilder.append((new StringBuilder()).append("; path=").append(cookie.getPath()).toString());
                    if (cookie.getExpiryDate() != null)
                    {
                        stringbuilder.append((new StringBuilder()).append("; expiry=").append(cookie.getExpiryDate()).toString());
                    }
                    if (cookie.isSecure())
                    {
                        stringbuilder.append(";Secure");
                    }
                }

                defaulthttpclient.sync();
            }
        }
        return Boolean.valueOf(true);
    }

    public static String validateData(String s)
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (s != null)
        {
            stringbuffer.append(s.trim().replaceAll("[\r\n]", ""));
        }
        return stringbuffer.toString();
    }
}
