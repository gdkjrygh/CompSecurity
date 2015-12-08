// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobileapptracker;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.mobileapptracker:
//            MATUtils, MATDeferredDplinkr, MATDeeplinkListener

class MATUrlRequester
{

    MATUrlRequester()
    {
    }

    protected static JSONObject a(String s, JSONObject jsonobject, boolean flag)
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj2 = null;
        obj1 = null;
        obj = obj2;
        HttpURLConnection httpurlconnection = (HttpURLConnection)(new URL(s)).openConnection();
        obj = obj2;
        httpurlconnection.setReadTimeout(60000);
        obj = obj2;
        httpurlconnection.setConnectTimeout(60000);
        obj = obj2;
        httpurlconnection.setDoInput(true);
        if (jsonobject == null) goto _L2; else goto _L1
_L1:
        obj = obj2;
        if (jsonobject.length() != 0) goto _L3; else goto _L2
_L2:
        obj = obj2;
        httpurlconnection.setRequestMethod("GET");
_L7:
        obj = obj2;
        httpurlconnection.connect();
        obj = obj2;
        int i = httpurlconnection.getResponseCode();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        obj = obj2;
        Log.d("MobileAppTracker", (new StringBuilder()).append("Request completed with status ").append(i).toString());
        if (i != 200) goto _L5; else goto _L4
_L4:
        obj = obj2;
        jsonobject = httpurlconnection.getInputStream();
_L8:
        obj = MATUtils.a(jsonobject);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_180;
        }
        Log.d("MobileAppTracker", (new StringBuilder()).append("Server response: ").append(((String) (obj))).toString());
        obj1 = new JSONObject();
        obj = new JSONObject(new JSONTokener(((String) (obj))));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        a(((JSONObject) (obj)));
_L9:
        obj1 = httpurlconnection.getHeaderField("X-MAT-Responder");
          goto _L6
_L3:
        obj = obj2;
        httpurlconnection.setDoOutput(true);
        obj = obj2;
        httpurlconnection.setRequestProperty("Content-Type", "application/json");
        obj = obj2;
        httpurlconnection.setRequestProperty("Accept", "application/json");
        obj = obj2;
        httpurlconnection.setRequestMethod("POST");
        obj = obj2;
        outputstream = httpurlconnection.getOutputStream();
        obj = obj2;
        outputstream.write(jsonobject.toString().getBytes("UTF-8"));
        obj = obj2;
        outputstream.close();
          goto _L7
        obj;
        jsonobject = ((JSONObject) (obj1));
        obj1 = obj;
_L12:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_367;
        }
        obj = jsonobject;
        Log.d("MobileAppTracker", (new StringBuilder()).append("Request error with URL ").append(s).toString());
        obj = jsonobject;
        ((Exception) (obj1)).printStackTrace();
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
        return new JSONObject();
_L5:
        obj = obj2;
        jsonobject = httpurlconnection.getErrorStream();
          goto _L8
        exception;
        obj = obj1;
        obj1 = exception;
_L13:
        ((Exception) (obj1)).printStackTrace();
          goto _L9
_L6:
        if (i >= 200 && i < 300)
        {
            Exception exception;
            OutputStream outputstream;
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
            return ((JSONObject) (obj));
        }
        if (i != 400 || obj1 == null)
        {
            break MISSING_BLOCK_LABEL_470;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_452;
        }
        Log.d("MobileAppTracker", "Request received 400 error from MAT server, won't be retried");
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
        return null;
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
        break MISSING_BLOCK_LABEL_382;
        s;
_L11:
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
        s;
        obj = jsonobject;
        if (true) goto _L11; else goto _L10
_L10:
        obj1;
          goto _L12
        obj1;
          goto _L13
    }

    private static void a(JSONObject jsonobject)
    {
        if (jsonobject.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_280;
        }
        try
        {
            if (jsonobject.has("errors") && jsonobject.getJSONArray("errors").length() != 0)
            {
                jsonobject = jsonobject.getJSONArray("errors").getString(0);
                Log.d("MobileAppTracker", (new StringBuilder()).append("Event was rejected by server with error: ").append(jsonobject).toString());
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.d("MobileAppTracker", "Server response status could not be parsed");
            jsonobject.printStackTrace();
            return;
        }
        if (!jsonobject.has("log_action") || jsonobject.getString("log_action").equals("null") || jsonobject.getString("log_action").equals("false") || jsonobject.getString("log_action").equals("true"))
        {
            break MISSING_BLOCK_LABEL_218;
        }
        jsonobject = jsonobject.getJSONObject("log_action");
        if (!jsonobject.has("conversion"))
        {
            break MISSING_BLOCK_LABEL_280;
        }
        jsonobject = jsonobject.getJSONObject("conversion");
        if (!jsonobject.has("status"))
        {
            break MISSING_BLOCK_LABEL_280;
        }
        if (jsonobject.getString("status").equals("rejected"))
        {
            jsonobject = jsonobject.getString("status_code");
            Log.d("MobileAppTracker", (new StringBuilder()).append("Event was rejected by server: status code ").append(jsonobject).toString());
            return;
        }
        Log.d("MobileAppTracker", "Event was accepted by server");
        return;
        if (jsonobject.has("options"))
        {
            jsonobject = jsonobject.getJSONObject("options");
            if (jsonobject.has("conversion_status"))
            {
                jsonobject = jsonobject.getString("conversion_status");
                Log.d("MobileAppTracker", (new StringBuilder()).append("Event was ").append(jsonobject).append(" by server").toString());
            }
        }
    }

    public void a(MATDeferredDplinkr matdeferreddplinkr)
    {
        Object obj;
        Object obj1;
        Object obj2;
        String s;
        Object obj3;
        boolean flag;
        obj3 = null;
        s = null;
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        obj1 = builder.scheme("https").authority((new StringBuilder()).append(matdeferreddplinkr.a()).append(".").append("deeplink.mobileapptracking.com").toString()).appendPath("v1").appendPath("link.txt").appendQueryParameter("platform", "android").appendQueryParameter("advertiser_id", matdeferreddplinkr.a()).appendQueryParameter("ver", "3.10.1").appendQueryParameter("package_name", matdeferreddplinkr.c());
        if (matdeferreddplinkr.e() != null)
        {
            obj = matdeferreddplinkr.e();
        } else
        {
            obj = matdeferreddplinkr.g();
        }
        ((android.net.Uri.Builder) (obj1)).appendQueryParameter("ad_id", ((String) (obj))).appendQueryParameter("user_agent", matdeferreddplinkr.d());
        if (matdeferreddplinkr.e() != null)
        {
            builder.appendQueryParameter("google_ad_tracking_disabled", Integer.toString(matdeferreddplinkr.f()));
        }
        obj2 = s;
        obj1 = obj3;
        obj = (HttpURLConnection)(new URL(builder.build().toString())).openConnection();
        obj2 = s;
        obj1 = obj3;
        ((HttpURLConnection) (obj)).setRequestProperty("X-MAT-Key", matdeferreddplinkr.b());
        obj2 = s;
        obj1 = obj3;
        ((HttpURLConnection) (obj)).setRequestMethod("GET");
        obj2 = s;
        obj1 = obj3;
        ((HttpURLConnection) (obj)).setDoInput(true);
        obj2 = s;
        obj1 = obj3;
        ((HttpURLConnection) (obj)).connect();
        obj2 = s;
        obj1 = obj3;
        if (((HttpURLConnection) (obj)).getResponseCode() != 200) goto _L2; else goto _L1
_L1:
        obj2 = s;
        obj1 = obj3;
        obj = ((HttpURLConnection) (obj)).getInputStream();
        flag = false;
_L8:
        obj2 = obj;
        obj1 = obj;
        s = MATUtils.a(((InputStream) (obj)));
        obj2 = obj;
        obj1 = obj;
        matdeferreddplinkr = matdeferreddplinkr.h();
        if (matdeferreddplinkr == null) goto _L4; else goto _L3
_L3:
        if (!flag) goto _L6; else goto _L5
_L5:
        obj2 = obj;
        obj1 = obj;
        matdeferreddplinkr.b(s);
          goto _L4
_L2:
        obj2 = s;
        obj1 = obj3;
        obj = ((HttpURLConnection) (obj)).getErrorStream();
        flag = true;
        continue; /* Loop/switch isn't completed */
_L6:
        obj2 = obj;
        obj1 = obj;
        matdeferreddplinkr.a(s);
          goto _L4
        matdeferreddplinkr;
        obj1 = obj2;
        matdeferreddplinkr.printStackTrace();
        try
        {
            ((InputStream) (obj2)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MATDeferredDplinkr matdeferreddplinkr)
        {
            matdeferreddplinkr.printStackTrace();
        }
        return;
_L4:
        try
        {
            ((InputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MATDeferredDplinkr matdeferreddplinkr)
        {
            matdeferreddplinkr.printStackTrace();
        }
        return;
        matdeferreddplinkr;
        try
        {
            ((InputStream) (obj1)).close();
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
        }
        throw matdeferreddplinkr;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
