// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.ads;

import android.os.Build;
import android.util.Log;
import java.io.InputStream;
import java.util.Locale;
import java.util.UUID;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.skype.android.ads:
//            ConfigManager, SkypeAdManager, ConnectionManager, SkypeAdEvents

public class SkypeAdTrackingManager
    implements SkypeAdEvents.EventListener
{

    private static final SkypeAdTrackingManager D = new SkypeAdTrackingManager();
    private static JSONArray F = new JSONArray();
    private static final String G;
    private static int I = 0;
    public final String A = "AdLoading_ServerSideError";
    public final String B = "AdLoading_NoAd";
    public final String C = "Other";
    private final String E = "SkypeAdTrackingManager";
    private boolean H;
    private String J;
    public final String a = "skypeNameHash";
    public final String b = "skypeVersion";
    public final String c = "configVersion";
    public final String d = "configUrl";
    public final String e = "country";
    public final String f = "language";
    public final String g = "adType";
    public final String h = "isPaidUser";
    public final String i = "pageView";
    public final String j = "networkType";
    public final String k = "errorCode";
    public final String l = "ConfigVersion";
    public final String m = "FailedMsgCount";
    public final String n = "SkypeVersion";
    public final String o = "Model";
    public final String p = "OS";
    public final String q = "Header";
    public final String r = "TrackingEvents";
    public final String s = "Accept";
    public final String t = "Content-type";
    public final String u = "application/json";
    public final String v = "ConfigFileError";
    public final String w = "CountryCodeError";
    public final String x = "AdLoading_Timeout";
    public final String y = "AdLoading_InvalidServerResponse";
    public final String z = "AdLoading_NetworkConnectionFailure";

    private SkypeAdTrackingManager()
    {
        H = false;
        J = "";
    }

    static int a(int i1)
    {
        I = i1;
        return i1;
    }

    public static SkypeAdTrackingManager a()
    {
        return D;
    }

    private static void a(JSONObject jsonobject)
    {
        com/skype/android/ads/SkypeAdTrackingManager;
        JVM INSTR monitorenter ;
        boolean flag = ConfigManager.l();
        if (flag) goto _L2; else goto _L1
_L1:
        com/skype/android/ads/SkypeAdTrackingManager;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (F.length() <= 64)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        I++;
          goto _L1
        jsonobject;
        throw jsonobject;
        F.put(jsonobject);
        if (F.length() >= 10)
        {
            D.a(false);
        }
          goto _L1
    }

    private boolean a(JSONObject jsonobject, JSONArray jsonarray)
    {
        Object obj;
        Object obj1;
        JSONObject jsonobject1;
        JSONObject jsonobject2;
        int i1;
        try
        {
            obj1 = SkypeAdManager.d().f();
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.e("SkypeAdTrackingManager", (new StringBuilder("addTrackingRecords Exception ")).append(jsonobject).toString());
            return false;
        }
        obj = obj1;
        if (!((String) (obj1)).startsWith("live:"))
        {
            obj = (new StringBuilder("skypeid:")).append(((String) (obj1))).toString();
        }
        obj1 = new JSONObject();
        ((JSONObject) (obj1)).put("username", obj);
        ((JSONObject) (obj1)).put("ui_version", SkypeAdManager.d().e);
        obj = new JSONArray();
        jsonarray.getJSONObject(0).put("messageLoss", I);
        i1 = 0;
_L2:
        if (i1 >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject1 = jsonarray.getJSONObject(i1);
        jsonobject2 = new JSONObject();
        jsonobject2.put("id", UUID.randomUUID().toString());
        jsonobject2.put("initiating_user_composite", obj1);
        jsonobject2.put("timestamp", jsonobject1.getLong("eventTimeStamp"));
        jsonobject2.put("type", "ADTTracking");
        jsonobject2.put("event_type", (new StringBuilder("ADT_")).append(jsonobject1.getString("eventName")).toString());
        jsonobject1.remove("eventTimeStamp");
        jsonobject1.remove("eventName");
        jsonobject1.put("platform", "Android");
        jsonobject1.put("os", J);
        jsonobject2.put("extension", jsonobject1);
        ((JSONArray) (obj)).put(jsonobject2);
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        jsonobject.put("records", obj);
        return true;
    }

    private static boolean b(JSONObject jsonobject)
    {
        try
        {
            jsonobject.put("data_package_id", UUID.randomUUID().toString());
            jsonobject.put("schema", 2);
            jsonobject.put("source", "ADTTracking");
            jsonobject.put("timestamp", System.currentTimeMillis());
            jsonobject.put("version", SkypeAdManager.d().e);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.e("SkypeAdTrackingManager", (new StringBuilder("addTrackingHeader Exception ")).append(jsonobject).toString());
            return false;
        }
        return true;
    }

    static int c()
    {
        return I;
    }

    private static JSONArray d()
    {
        com/skype/android/ads/SkypeAdTrackingManager;
        JVM INSTR monitorenter ;
        JSONArray jsonarray;
        jsonarray = F;
        F = new JSONArray();
        com/skype/android/ads/SkypeAdTrackingManager;
        JVM INSTR monitorexit ;
        return jsonarray;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(Object obj, JSONObject jsonobject)
    {
        try
        {
            jsonobject.put("configVersion", ConfigManager.n());
            jsonobject.put("configUrl", ConfigManager.d());
            jsonobject.put("country", ConfigManager.h());
            jsonobject.put("language", Locale.getDefault().getLanguage());
            jsonobject.put("isPaidUser", SkypeAdManager.d().i());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("SkypeAdTrackingManager", (new StringBuilder("onEvent Exception ")).append(obj).toString());
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        jsonobject.put("pageView", "hub");
        jsonobject.put("networkType", ConnectionManager.b(SkypeAdManager.d().e()));
        if (!jsonobject.has("errorType")) goto _L2; else goto _L1
_L1:
        jsonobject.getInt("errorType");
        JVM INSTR lookupswitch 7: default 287
    //                   1: 190
    //                   2: 227
    //                   3: 251
    //                   4: 239
    //                   5: 227
    //                   1000: 263
    //                   1001: 275;
           goto _L3 _L4 _L5 _L6 _L7 _L5 _L8 _L9
_L9:
        break MISSING_BLOCK_LABEL_275;
_L3:
        jsonobject.put("errorCode", "Other");
_L10:
        jsonobject.remove("errorType");
_L2:
        a(jsonobject);
        return;
_L4:
        jsonobject.put("errorCode", "AdLoading_InvalidServerResponse");
          goto _L10
_L5:
        jsonobject.put("errorCode", "AdLoading_NetworkConnectionFailure");
          goto _L10
_L7:
        jsonobject.put("errorCode", "AdLoading_NoAd");
          goto _L10
_L6:
        jsonobject.put("errorCode", "AdLoading_ServerSideError");
          goto _L10
_L8:
        jsonobject.put("errorCode", "ConfigFileError");
          goto _L10
        jsonobject.put("errorCode", "CountryCodeError");
          goto _L10
    }

    public final void a(boolean flag)
    {
        if (ConnectionManager.a(SkypeAdManager.d().e())) goto _L2; else goto _L1
_L1:
        if (flag)
        {
            int i1 = d().length();
            I += i1;
        }
_L4:
        return;
_L2:
        Object obj = d();
        if (((JSONArray) (obj)).length() == 0) goto _L4; else goto _L3
_L3:
        JSONObject jsonobject;
        int j1;
        j1 = ((JSONArray) (obj)).length();
        (new StringBuilder("Uploading ")).append(j1).append(" tracking events");
        jsonobject = new JSONObject();
        flag = false;
        if (b(jsonobject))
        {
            flag = a(jsonobject, ((JSONArray) (obj)));
        }
        if (!flag)
        {
            try
            {
                Log.e("SkypeAdTrackingManager", "build tracking events post body failed!");
                I += j1;
                return;
            }
            catch (Exception exception)
            {
                Log.e("SkypeAdTrackingManager", (new StringBuilder("Exception ")).append(exception.getMessage()).toString());
            }
            return;
        }
        String s1 = ConfigManager.o();
        exception = s1;
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        exception = G;
        exception = new HttpPost(exception);
        exception.setEntity(new StringEntity(jsonobject.toString()));
        exception.setHeader("Accept", "application/json");
        exception.setHeader("Content-type", "application/json");
        ConnectionManager.a(exception, new ConnectionManager.HTTPResponseListener(j1) {

            final int a;
            final SkypeAdTrackingManager b;

            public final void a(HttpRequestBase httprequestbase, Exception exception1)
            {
                Log.e("SkypeAdTrackingManager", (new StringBuilder("post tracking exception ")).append(exception1.toString()).toString());
                SkypeAdTrackingManager.a(SkypeAdTrackingManager.c() + a);
            }

            public final void a(HttpRequestBase httprequestbase, HttpResponse httpresponse)
            {
                (new StringBuilder("Tracking Server Response status code: ")).append(httpresponse.getStatusLine().getStatusCode());
                if (httpresponse.getStatusLine().getStatusCode() >= 400)
                {
                    SkypeAdTrackingManager.a(SkypeAdTrackingManager.c() + a);
                } else
                {
                    SkypeAdTrackingManager.a(0);
                }
                try
                {
                    httprequestbase = httpresponse.getEntity();
                }
                // Misplaced declaration of an exception variable
                catch (HttpRequestBase httprequestbase)
                {
                    Log.e("SkypeAdTrackingManager", (new StringBuilder("tracking exception ")).append(httprequestbase.toString()).toString());
                    return;
                }
                if (httprequestbase == null)
                {
                    break MISSING_BLOCK_LABEL_79;
                }
                httprequestbase = httprequestbase.getContent();
                if (httprequestbase == null)
                {
                    break MISSING_BLOCK_LABEL_79;
                }
                httprequestbase.close();
            }

            
            {
                b = SkypeAdTrackingManager.this;
                a = i1;
                super();
            }
        });
        return;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        J = (new StringBuilder()).append(android.os.Build.VERSION.RELEASE).append(" ").append(Build.MODEL).toString();
        if (!H)
        {
            H = true;
            SkypeAdEvents.a(this);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static 
    {
        String s1;
        if ("https://pipe.skype.com/Client/2.0/".isEmpty())
        {
            s1 = "https://dev.adt.skype.net/api/messagedata";
        } else
        {
            s1 = "https://pipe.skype.com/Client/2.0/";
        }
        G = s1;
    }
}
