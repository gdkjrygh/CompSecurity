// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.umeng.common.Log;
import com.umeng.common.b.f;
import com.umeng.common.b.g;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.umeng.analytics:
//            g, a, d, ReportPolicy, 
//            f, e, h, UmengOnlineConfigureListener, 
//            i, c

class com.umeng.analytics.b
    implements com.umeng.analytics.g
{
    private final class a extends Thread
    {

        final com.umeng.analytics.b a;
        private final Object b;
        private Context c;
        private int d;
        private String e;
        private String f;
        private int g;
        private long h;
        private Map i;
        private String j;

        public void run()
        {
            Object obj = b;
            obj;
            JVM INSTR monitorenter ;
            int i1 = d;
            if (i1 != 0) goto _L2; else goto _L1
_L1:
            if (c != null)
            {
                break MISSING_BLOCK_LABEL_33;
            }
            Log.b("MobclickAgent", "unexpected null context in invokehander flag=0");
            obj;
            JVM INSTR monitorexit ;
            return;
            com.umeng.analytics.b.a(a, c);
_L3:
            obj;
            JVM INSTR monitorexit ;
            return;
            Object obj1;
            obj1;
            obj;
            JVM INSTR monitorexit ;
            try
            {
                throw obj1;
            }
            catch (Exception exception)
            {
                Log.b("MobclickAgent", "Exception occurred in invokehander.", exception);
            }
            return;
            obj1;
            Log.b("MobclickAgent", "unexpected null context in invokehander flag=0", ((Exception) (obj1)));
              goto _L3
_L2:
label0:
            {
                if (d != 1)
                {
                    break label0;
                }
                com.umeng.analytics.b.b(a, c);
            }
              goto _L3
label1:
            {
                if (d != 2)
                {
                    break label1;
                }
                com.umeng.analytics.b.c(a, c);
            }
              goto _L3
label2:
            {
                if (d != 3)
                {
                    break label2;
                }
                com.umeng.analytics.b.a(a, c, e, f, h, g);
            }
              goto _L3
label3:
            {
                if (d != 4)
                {
                    break label3;
                }
                com.umeng.analytics.b.a(a, c, e, i, h);
            }
              goto _L3
            if (d != 5) goto _L5; else goto _L4
_L4:
            com.umeng.analytics.b.a(a, c, e, i, j);
              goto _L3
_L5:
            if (d != 6) goto _L3; else goto _L6
_L6:
            com.umeng.analytics.b.a(a, c, e, j);
              goto _L3
        }

        a(Context context, int i1)
        {
            a = com.umeng.analytics.b.this;
            super();
            b = new Object();
            c = context.getApplicationContext();
            d = i1;
        }

        a(Context context, String s1, String s2, long l1, int i1, 
                int j1)
        {
            a = com.umeng.analytics.b.this;
            super();
            b = new Object();
            c = context.getApplicationContext();
            e = s1;
            f = s2;
            g = i1;
            d = j1;
            h = l1;
        }

        a(Context context, String s1, Map map, long l1, int i1)
        {
            a = com.umeng.analytics.b.this;
            super();
            b = new Object();
            c = context.getApplicationContext();
            e = s1;
            i = map;
            d = i1;
            h = l1;
        }

        a(Context context, String s1, Map map, String s2, int i1)
        {
            a = com.umeng.analytics.b.this;
            super();
            b = new Object();
            c = context.getApplicationContext();
            e = s1;
            i = map;
            j = s2;
            d = i1;
        }
    }

    private final class b
        implements Runnable
    {

        final com.umeng.analytics.b a;
        private final Object b = new Object();
        private Context c;
        private JSONObject d;

        public void run()
        {
            try
            {
                if (d.getString("type").equals("online_config"))
                {
                    com.umeng.analytics.b.a(a, c, d);
                    return;
                }
            }
            catch (Exception exception)
            {
                Log.b("MobclickAgent", "Exception occurred in ReportMessageHandler");
                exception.printStackTrace();
                return;
            }
            if (d.getString("type").equals("cmd_cache_buffer"))
            {
                synchronized (b)
                {
                    com.umeng.analytics.b.a(a).a(c);
                }
                return;
            }
            break MISSING_BLOCK_LABEL_92;
            exception1;
            obj;
            JVM INSTR monitorexit ;
            throw exception1;
            if (d.getString("type").equals("flush"))
            {
                synchronized (b)
                {
                    com.umeng.analytics.b.a(a).a(c);
                    a.a(c, d);
                }
                return;
            }
            break MISSING_BLOCK_LABEL_153;
            exception2;
            obj1;
            JVM INSTR monitorexit ;
            throw exception2;
            synchronized (b)
            {
                com.umeng.analytics.b.a(a).a(c);
                a.a(c, d);
            }
            return;
            exception3;
            obj2;
            JVM INSTR monitorexit ;
            throw exception3;
        }

        b(com.umeng.analytics.b b2, Context context, JSONObject jsonobject)
        {
            a = com.umeng.analytics.b.this;
            super();
            c = context.getApplicationContext();
            d = jsonobject;
        }
    }


    private final String A = "appkey";
    private final String B = "body";
    private final String C = "session_id";
    private final String D = "date";
    private final String E = "time";
    private final String F = "start_millis";
    private final String G = "end_millis";
    private final String H = "duration";
    private final String I = "activities";
    private final String J = "header";
    private final String K = "uptr";
    private final String L = "dntr";
    private final String M = "acc";
    private final String N = "tag";
    private final String O = "label";
    private final String P = "id";
    private final String Q = "ts";
    private final String R = "du";
    private final String S = "context";
    private final String T = "last_config_time";
    private final String U = "report_policy";
    private final String V = "online_params";
    private final String W = "report_interval";
    String a;
    String b;
    UmengOnlineConfigureListener c;
    String d;
    String e;
    private final com.umeng.analytics.a f = new com.umeng.analytics.a();
    private final d g = new d();
    private final ReportPolicy h = new ReportPolicy();
    private String i;
    private final Handler j;
    private final int k = 0;
    private final int l = 1;
    private final int m = 2;
    private final int n = 3;
    private final int o = 4;
    private final int p = 5;
    private final int q = 6;
    private final String r = "type";
    private final String s = "error";
    private final String t = "event";
    private final String u = "ekv";
    private final String v = "launch";
    private final String w = "flush";
    private final String x = "terminate";
    private final String y = "online_config";
    private final String z = "cmd_cache_buffer";

    com.umeng.analytics.b()
    {
        a = null;
        b = null;
        c = null;
        d = "";
        e = "";
        HandlerThread handlerthread = new HandlerThread("MobclickAgent");
        handlerthread.start();
        j = new Handler(handlerthread.getLooper());
    }

    static d a(com.umeng.analytics.b b1)
    {
        return b1.g;
    }

    private String a(Context context, String s1, long l1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(l1).append(s1).append(com.umeng.common.b.g.b(com.umeng.common.b.f(context)));
        return com.umeng.common.b.g.a(stringbuilder.toString());
    }

    private String a(Context context, String s1, SharedPreferences sharedpreferences)
    {
        d(context, sharedpreferences);
        long l1 = System.currentTimeMillis();
        String s2 = a(context, s1, l1);
        android.content.SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString("appkey", s1);
        editor.putString("session_id", s2);
        editor.putLong("start_millis", l1);
        editor.putLong("end_millis", -1L);
        editor.putLong("duration", 0L);
        editor.putString("activities", "");
        editor.remove("last_terminate_location_time");
        editor.commit();
        c(context, sharedpreferences);
        return s2;
    }

    private String a(Context context, JSONObject jsonobject, String s1, boolean flag, String s2)
    {
        Object obj;
        s2 = new HttpPost(s1);
        obj = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(((HttpParams) (obj)), 10000);
        HttpConnectionParams.setSoTimeout(((HttpParams) (obj)), 30000);
        obj = new DefaultHttpClient(((HttpParams) (obj)));
        s2.addHeader("X-Umeng-Sdk", n(context));
        Object obj1 = com.umeng.analytics.f.a(context);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        obj1 = new HttpHost(((String) (obj1)), 80);
        ((HttpClient) (obj)).getParams().setParameter("http.route.default-proxy", obj1);
        jsonobject = jsonobject.toString();
        Log.a("MobclickAgent", jsonobject);
        if (!e.s || flag)
        {
            break MISSING_BLOCK_LABEL_314;
        }
        jsonobject = com.umeng.common.b.f.a((new StringBuilder("content=")).append(jsonobject).toString(), "utf-8");
        s2.addHeader("Content-Encoding", "deflate");
        s2.setEntity(new InputStreamEntity(new ByteArrayInputStream(jsonobject), f.a));
_L1:
        context = com.umeng.analytics.h.c(context).edit();
        jsonobject = new Date();
        s2 = ((HttpClient) (obj)).execute(s2);
        long l1 = (new Date()).getTime();
        long l2 = jsonobject.getTime();
        if (s2.getStatusLine().getStatusCode() != 200)
        {
            break MISSING_BLOCK_LABEL_375;
        }
        Log.a("MobclickAgent", (new StringBuilder("Sent message to ")).append(s1).toString());
        context.putLong("req_time", l1 - l2);
        context.commit();
        context = s2.getEntity();
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_400;
        }
        return a(context.getContent());
        ArrayList arraylist = new ArrayList(1);
        arraylist.add(new BasicNameValuePair("content", jsonobject));
        s2.setEntity(new UrlEncodedFormEntity(arraylist, "UTF-8"));
          goto _L1
        context;
        Log.a("MobclickAgent", "ClientProtocolException,Failed to send message.", context);
        return null;
        context.putLong("req_time", -1L);
        return null;
        context;
        Log.a("MobclickAgent", "IOException,Failed to send message.", context);
        return null;
    }

    private String a(InputStream inputstream)
    {
        BufferedReader bufferedreader;
        StringBuilder stringbuilder;
        bufferedreader = new BufferedReader(new InputStreamReader(inputstream), 8192);
        stringbuilder = new StringBuilder();
_L1:
        String s1 = bufferedreader.readLine();
        if (s1 == null)
        {
            Object obj;
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                Log.b("MobclickAgent", "Caught IOException in convertStreamToString()", inputstream);
                return null;
            }
            return stringbuilder.toString();
        }
        stringbuilder.append((new StringBuilder(String.valueOf(s1))).append("\n").toString());
          goto _L1
        obj;
        Log.b("MobclickAgent", "Caught IOException in convertStreamToString()", ((Exception) (obj)));
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            Log.b("MobclickAgent", "Caught IOException in convertStreamToString()", inputstream);
            return null;
        }
        return null;
        obj;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            Log.b("MobclickAgent", "Caught IOException in convertStreamToString()", inputstream);
            return null;
        }
        throw obj;
    }

    private JSONArray a(JSONObject jsonobject, JSONArray jsonarray)
    {
        Object obj;
        String s1;
        s1 = jsonobject.getString("tag");
        if (!jsonobject.has("label"))
        {
            break MISSING_BLOCK_LABEL_255;
        }
        obj = jsonobject.getString("label");
_L5:
        String s2;
        int i1;
        s2 = jsonobject.getString("date");
        i1 = jsonarray.length() - 1;
          goto _L1
_L2:
        if (i1 == 0)
        {
            JSONObject jsonobject1;
            try
            {
                jsonarray.put(jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.a("MobclickAgent", "custom log merge error in tryToSendMessage", ((Exception) (obj)));
                jsonarray.put(jsonobject);
                return jsonarray;
            }
            return jsonarray;
        } else
        {
            return jsonarray;
        }
_L4:
        jsonobject1 = (JSONObject)jsonarray.get(i1);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        if (jsonobject1.has("label"))
        {
            break MISSING_BLOCK_LABEL_134;
        }
        if (!s1.equals(jsonobject1.get("tag")) || !s2.equals(jsonobject1.get("date")))
        {
            continue; /* Loop/switch isn't completed */
        }
        jsonobject1.put("acc", jsonobject1.getInt("acc") + 1);
        i1 = 1;
          goto _L2
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!jsonobject1.has("label") || !s1.equals(jsonobject1.get("tag")) || !((String) (obj)).equals(jsonobject1.get("label")) || !s2.equals(jsonobject1.get("date")))
        {
            continue; /* Loop/switch isn't completed */
        }
        jsonobject1.put("acc", jsonobject1.getInt("acc") + 1);
        i1 = 1;
          goto _L2
        i1--;
_L1:
        if (i1 >= 0) goto _L4; else goto _L3
_L3:
        i1 = 0;
          goto _L2
        obj = null;
          goto _L5
    }

    private void a(Context context, SharedPreferences sharedpreferences)
    {
        long l1 = System.currentTimeMillis();
        if (com.umeng.analytics.e.g && l1 - sharedpreferences.getLong("last_terminate_location_time", 0L) > 10000L)
        {
            context = com.umeng.common.b.l(context);
            if (context != null)
            {
                long l2 = sharedpreferences.getLong("gps_time", 0L);
                if (context.getTime() != l2)
                {
                    sharedpreferences.edit().putFloat("lng", (float)context.getLongitude()).putFloat("lat", (float)context.getLatitude()).putFloat("alt", (float)context.getAltitude()).putLong("gps_time", context.getTime()).putLong("last_terminate_location_time", l1).commit();
                }
            }
        }
    }

    private void a(Context context, SharedPreferences sharedpreferences, String s1, String s2, long l1, int i1)
    {
        sharedpreferences = sharedpreferences.getString("session_id", "");
        String s4 = com.umeng.common.b.g.a();
        String s3 = s4.split(" ")[0];
        s4 = s4.split(" ")[1];
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("type", "event");
            jsonobject.put("session_id", sharedpreferences);
            jsonobject.put("date", s3);
            jsonobject.put("time", s4);
            jsonobject.put("tag", s1);
            if (!TextUtils.isEmpty(s2))
            {
                jsonobject.put("label", s2);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.a("MobclickAgent", "json error in emitCustomLogReport", context);
            return;
        }
        if (l1 <= 0L)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        jsonobject.put("du", l1);
        jsonobject.put("acc", i1);
        j.post(new b(this, context, jsonobject));
        return;
    }

    private void a(Context context, SharedPreferences sharedpreferences, String s1, JSONObject jsonobject)
    {
        sharedpreferences = sharedpreferences.getString("session_id", "");
        JSONObject jsonobject1 = new JSONObject();
        JSONArray jsonarray = new JSONArray();
        try
        {
            jsonobject.put("id", s1);
            jsonobject.put("ts", System.currentTimeMillis() / 1000L);
            jsonarray.put(jsonobject);
            jsonobject1.put("type", "ekv");
            jsonobject1.put(sharedpreferences, jsonarray);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.a("MobclickAgent", "json error in emitCustomLogReport", context);
            context.printStackTrace();
            return;
        }
        j.post(new b(this, context, jsonobject1));
    }

    private void a(Context context, JSONArray jsonarray)
    {
        int i1 = 0;
_L2:
        if (i1 >= jsonarray.length())
        {
            return;
        }
        JSONObject jsonobject = jsonarray.getJSONObject(i1);
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        if (!jsonobject.has("date") || !jsonobject.has("time") || !jsonobject.has("context"))
        {
            break MISSING_BLOCK_LABEL_126;
        }
        if (!jsonobject.has("version"))
        {
            break MISSING_BLOCK_LABEL_99;
        }
        if (jsonobject.getString("version") == null || !jsonobject.getString("version").equals(com.umeng.common.b.d(context)))
        {
            break MISSING_BLOCK_LABEL_126;
        }
        jsonobject.remove("version");
        j.post(new b(this, context, jsonobject));
        break MISSING_BLOCK_LABEL_126;
        Exception exception;
        exception;
        exception.printStackTrace();
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static void a(com.umeng.analytics.b b1, Context context)
    {
        b1.j(context);
    }

    static void a(com.umeng.analytics.b b1, Context context, String s1)
    {
        b1.e(context, s1);
    }

    static void a(com.umeng.analytics.b b1, Context context, String s1, String s2)
    {
        b1.d(context, s1, s2);
    }

    static void a(com.umeng.analytics.b b1, Context context, String s1, String s2, long l1, int i1)
    {
        b1.b(context, s1, s2, l1, i1);
    }

    static void a(com.umeng.analytics.b b1, Context context, String s1, Map map, long l1)
    {
        b1.b(context, s1, map, l1);
    }

    static void a(com.umeng.analytics.b b1, Context context, String s1, Map map, String s2)
    {
        b1.b(context, s1, map, s2);
    }

    static void a(com.umeng.analytics.b b1, Context context, JSONObject jsonobject)
    {
        b1.b(context, jsonobject);
    }

    private void a(String s1)
    {
        Log.a("MobclickAgent", s1);
    }

    private boolean a(SharedPreferences sharedpreferences)
    {
        long l1 = sharedpreferences.getLong("end_millis", -1L);
        return System.currentTimeMillis() - l1 > e.d;
    }

    private boolean a(JSONObject jsonobject, JSONObject jsonobject1)
    {
        jsonobject = (String)jsonobject.remove("cache_version");
        jsonobject1 = jsonobject1.getString("version_code");
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        boolean flag = jsonobject.equals(jsonobject1);
        if (flag)
        {
            return false;
        }
        break MISSING_BLOCK_LABEL_45;
        jsonobject;
        Log.a("MobclickAgent", "Fail to filter message", jsonobject);
        return true;
    }

    private String b(Context context, SharedPreferences sharedpreferences)
    {
        long l1 = System.currentTimeMillis();
        context = sharedpreferences.edit();
        context.putLong("start_millis", Long.valueOf(l1).longValue());
        context.putLong("end_millis", -1L);
        context.commit();
        return sharedpreferences.getString("session_id", null);
    }

    private JSONArray b(JSONObject jsonobject, JSONArray jsonarray)
    {
        String s1;
        int i1;
        if (jsonarray == null || jsonobject == null)
        {
            return jsonarray;
        }
        try
        {
            s1 = (String)jsonobject.keys().next();
            i1 = jsonarray.length() - 1;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.a("MobclickAgent", "custom log merge error in tryToSendMessage", jsonobject);
            return jsonarray;
        }
_L2:
        if (i1 >= 0)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        jsonarray.put(jsonobject);
        return jsonarray;
        JSONObject jsonobject1 = (JSONObject)jsonarray.get(i1);
        if (!jsonobject1.has(s1))
        {
            break MISSING_BLOCK_LABEL_102;
        }
        jsonobject = jsonobject.getJSONArray(s1);
        jsonobject1.getJSONArray(s1).put((JSONObject)jsonobject.get(0));
        return jsonarray;
        i1--;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void b(Context context, String s1, String s2, long l1, int i1)
    {
        this;
        JVM INSTR monitorenter ;
        SharedPreferences sharedpreferences = com.umeng.analytics.h.e(context);
        if (sharedpreferences != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a(context, sharedpreferences, s1, s2, l1, i1);
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    private void b(Context context, String s1, Map map, long l1)
    {
        this;
        JVM INSTR monitorenter ;
        SharedPreferences sharedpreferences = com.umeng.analytics.h.e(context);
        if (sharedpreferences != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        map = map.entrySet().iterator();
        int i1 = 0;
_L3:
        if (map.hasNext() && i1 < 10)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        if (l1 <= 0L)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        jsonobject.put("du", l1);
        a(context, sharedpreferences, s1, jsonobject);
          goto _L1
        context;
        Log.a("MobclickAgent", "exception when convert map to json");
          goto _L1
        context;
        throw context;
        java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
        jsonobject.put((String)entry.getKey(), (String)entry.getValue());
        i1++;
          goto _L3
    }

    private void b(Context context, String s1, Map map, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        SharedPreferences sharedpreferences = com.umeng.analytics.h.e(context);
        if (sharedpreferences != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        f(context, (new StringBuilder("_kvts")).append(s1).append(s2).toString());
        context = new JSONObject();
        map = map.entrySet().iterator();
        int i1 = 0;
_L3:
        if (map.hasNext() && i1 < 10)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        sharedpreferences.edit().putString((new StringBuilder("_kvvl")).append(s1).append(s2).toString(), context.toString()).commit();
          goto _L1
        context;
        context.printStackTrace();
          goto _L1
        context;
        throw context;
        java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
        context.put((String)entry.getKey(), (String)entry.getValue());
        i1++;
          goto _L3
    }

    private void b(Context context, JSONObject jsonobject)
    {
        Log.a("MobclickAgent", "start to check onlineConfig info ...");
        String s2 = a(context, jsonobject, "http://oc.umeng.com/check_config_update", true, "online_config");
        String s1 = s2;
        if (s2 == null)
        {
            s1 = a(context, jsonobject, "http://oc.umeng.co/check_config_update", true, "online_config");
        }
        if (s1 != null)
        {
            Log.a("MobclickAgent", "get onlineConfig info succeed !");
            d(context, s1);
            return;
        }
        if (c != null)
        {
            c.onDataReceived(null);
        }
        Log.a("MobclickAgent", "get onlineConfig info failed !");
    }

    static void b(com.umeng.analytics.b b1, Context context)
    {
        b1.g(context);
    }

    private void c(Context context, SharedPreferences sharedpreferences)
    {
        Object obj;
        String s1;
        Object obj1;
        String s2;
        obj = sharedpreferences.getString("session_id", null);
        if (obj == null)
        {
            Log.a("MobclickAgent", "Missing session_id, ignore message");
            return;
        }
        obj1 = com.umeng.common.b.g.a();
        s1 = ((String) (obj1)).split(" ")[0];
        s2 = ((String) (obj1)).split(" ")[1];
        obj1 = new JSONObject();
        ((JSONObject) (obj1)).put("type", "launch");
        ((JSONObject) (obj1)).put("session_id", obj);
        ((JSONObject) (obj1)).put("date", s1);
        ((JSONObject) (obj1)).put("time", s2);
        if (!com.umeng.analytics.e.g)
        {
            break MISSING_BLOCK_LABEL_228;
        }
        obj = com.umeng.common.b.l(context);
        if (obj != null)
        {
            try
            {
                double d1 = ((Location) (obj)).getLongitude();
                double d2 = ((Location) (obj)).getLatitude();
                double d3 = ((Location) (obj)).getAltitude();
                long l1 = ((Location) (obj)).getTime();
                if (l1 != sharedpreferences.getLong("gps_time", 0L))
                {
                    ((JSONObject) (obj1)).put("lng", d1);
                    ((JSONObject) (obj1)).put("lat", d2);
                    ((JSONObject) (obj1)).put("alt", d3);
                    ((JSONObject) (obj1)).put("gps_time", l1);
                    sharedpreferences.edit().putLong("gps_time", l1).commit();
                }
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.b("MobclickAgent", "json error in emitNewSessionReport", context);
                return;
            }
        }
        j.post(new b(this, context, ((JSONObject) (obj1))));
        return;
    }

    static void c(com.umeng.analytics.b b1, Context context)
    {
        b1.m(context);
    }

    private void d(Context context, SharedPreferences sharedpreferences)
    {
        Object obj;
        Object obj1;
        Object obj2;
        String s1;
        String s2;
        obj2 = sharedpreferences.getString("session_id", null);
        if (obj2 == null)
        {
            a("Missing session_id, ignore message in emitLastEndSessionReport");
            return;
        }
        obj1 = Long.valueOf(sharedpreferences.getLong("duration", -1L));
        obj = obj1;
        if (((Long) (obj1)).longValue() <= 0L)
        {
            obj = Long.valueOf(0L);
        }
        obj1 = com.umeng.common.b.g.a();
        s1 = ((String) (obj1)).split(" ")[0];
        s2 = ((String) (obj1)).split(" ")[1];
        obj1 = new JSONObject();
        ((JSONObject) (obj1)).put("type", "terminate");
        ((JSONObject) (obj1)).put("session_id", obj2);
        ((JSONObject) (obj1)).put("date", s1);
        ((JSONObject) (obj1)).put("time", s2);
        ((JSONObject) (obj1)).put("duration", String.valueOf(((Long) (obj)).longValue() / 1000L));
        if (!e.h) goto _L2; else goto _L1
_L1:
        obj = sharedpreferences.getString("activities", "");
        if ("".equals(obj)) goto _L2; else goto _L3
_L3:
        Object aobj[];
        aobj = ((String) (obj)).split(";");
        obj2 = new JSONArray();
        int i1 = 0;
_L7:
        if (i1 < aobj.length) goto _L5; else goto _L4
_L4:
        ((JSONObject) (obj1)).put("activities", obj2);
_L2:
        aobj = e(context, sharedpreferences);
        if (aobj == null)
        {
            break MISSING_BLOCK_LABEL_251;
        }
        ((JSONObject) (obj1)).put("uptr", ((long) (aobj[1])));
        ((JSONObject) (obj1)).put("dntr", ((long) (aobj[0])));
        if (com.umeng.analytics.e.g && sharedpreferences.contains("last_terminate_location_time"))
        {
            ((JSONObject) (obj1)).put("lat", sharedpreferences.getFloat("lat", 0.0F));
            ((JSONObject) (obj1)).put("lng", sharedpreferences.getFloat("lng", 0.0F));
            ((JSONObject) (obj1)).put("alt", sharedpreferences.getFloat("alt", 0.0F));
            ((JSONObject) (obj1)).put("gps_time", sharedpreferences.getLong("gps_time", 0L));
        }
        j.post(new b(this, context, ((JSONObject) (obj1))));
        return;
_L5:
        try
        {
            ((JSONArray) (obj2)).put(new JSONArray(((String) (aobj[i1]))));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.b("MobclickAgent", "json error in emitLastEndSessionReport", context);
            return;
        }
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void d(Context context, String s1)
    {
        Object obj;
        long l1;
        long l2;
        obj = com.umeng.analytics.h.b(context);
        int i1;
        try
        {
            s1 = new JSONObject(s1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.a("MobclickAgent", "not json string");
            return;
        }
        try
        {
            if (s1.has("last_config_time"))
            {
                ((SharedPreferences) (obj)).edit().putString("umeng_last_config_time", s1.getString("last_config_time")).commit();
            }
        }
        catch (Exception exception)
        {
            Log.a("MobclickAgent", "save online config time", exception);
        }
        l2 = -1L;
        l1 = l2;
        if (!s1.has("report_interval"))
        {
            break MISSING_BLOCK_LABEL_84;
        }
        i1 = s1.getInt("report_interval");
        l1 = i1 * 1000;
_L5:
        try
        {
            if (s1.has("report_policy"))
            {
                h.a(context, s1.getInt("report_policy"), l1);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.a("MobclickAgent", "save online config policy", context);
        }
        context = null;
        if (!s1.has("online_params")) goto _L2; else goto _L1
_L1:
        context = new JSONObject(s1.getString("online_params"));
        s1 = context.keys();
        obj = ((SharedPreferences) (obj)).edit();
_L3:
        if (s1.hasNext())
        {
            break MISSING_BLOCK_LABEL_240;
        }
        ((android.content.SharedPreferences.Editor) (obj)).commit();
        Log.a("MobclickAgent", (new StringBuilder("get online setting params: ")).append(context).toString());
_L2:
        if (c != null)
        {
            c.onDataReceived(context);
        }
        return;
        try
        {
            String s2 = (String)s1.next();
            ((android.content.SharedPreferences.Editor) (obj)).putString(s2, context.getString(s2));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.a("MobclickAgent", "save online config params", context);
            return;
        }
          goto _L3
        Exception exception1;
        exception1;
        l1 = l2;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void d(Context context, String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        SharedPreferences sharedpreferences = com.umeng.analytics.h.e(context);
        if (sharedpreferences != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        int i1 = g(context, (new StringBuilder("_kvts")).append(s1).append(s2).toString());
        if (i1 >= 0)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        a("event duration less than 0 in ekvEvnetEnd");
          goto _L1
        context;
        a("exception in onLogDurationInternalEnd");
          goto _L1
        context;
        throw context;
        s2 = new JSONObject(sharedpreferences.getString((new StringBuilder("_kvvl")).append(s1).append(s2).toString(), null));
        s2.put("du", i1);
        a(context, sharedpreferences, s1, s2);
          goto _L1
    }

    private void e(Context context, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("type", "online_config");
        jsonobject.put("appkey", s1);
        jsonobject.put("version_code", com.umeng.common.b.d(context));
        jsonobject.put("package", com.umeng.common.b.u(context));
        jsonobject.put("sdk_version", "4.5");
        jsonobject.put("idmd5", com.umeng.common.b.g.b(com.umeng.common.b.f(context)));
        jsonobject.put("channel", i(context));
        jsonobject.put("report_policy", h.b(context));
        jsonobject.put("last_config_time", q(context));
        j.post(new b(this, context, jsonobject));
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        context;
        Log.b("MobclickAgent", "exception in onlineConfigInternal");
        if (true) goto _L2; else goto _L1
_L1:
        context;
        throw context;
    }

    private long[] e(Context context, SharedPreferences sharedpreferences)
    {
        Method method;
        Object obj;
        int i1;
        long l1;
        long l2;
        try
        {
            obj = Class.forName("android.net.TrafficStats");
            method = ((Class) (obj)).getMethod("getUidRxBytes", new Class[] {
                Integer.TYPE
            });
            obj = ((Class) (obj)).getMethod("getUidTxBytes", new Class[] {
                Integer.TYPE
            });
            i1 = context.getApplicationInfo().uid;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            a("sdk less than 2.2 has get no traffic");
            return null;
        }
        if (i1 == -1)
        {
            return null;
        }
        context = new long[2];
        context[0] = ((Long)method.invoke(null, new Object[] {
            Integer.valueOf(i1)
        })).longValue();
        context[1] = ((Long)((Method) (obj)).invoke(null, new Object[] {
            Integer.valueOf(i1)
        })).longValue();
        if (context[0] <= 0L || context[1] <= 0L)
        {
            break MISSING_BLOCK_LABEL_271;
        }
        l1 = sharedpreferences.getLong("traffics_up", -1L);
        l2 = sharedpreferences.getLong("traffics_down", -1L);
        sharedpreferences.edit().putLong("traffics_up", context[1]).putLong("traffics_down", context[0]).commit();
label0:
        {
            if (l1 <= 0L || l2 <= 0L)
            {
                break MISSING_BLOCK_LABEL_273;
            }
            context[0] = context[0] - l2;
            context[1] = context[1] - l1;
            if (context[0] > 0L)
            {
                l1 = context[1];
                if (l1 > 0L)
                {
                    break label0;
                }
            }
            return null;
        }
        return context;
        return null;
        return null;
    }

    private void f(Context context, String s1)
    {
        if (e.k)
        {
            g.a(s1);
            return;
        }
        try
        {
            s1 = com.umeng.analytics.i.a(context, s1);
            s1.a(Long.valueOf(System.currentTimeMillis()));
            s1.a(context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.a("MobclickAgent", "exception in save event begin info");
        }
        return;
    }

    private int g(Context context, String s1)
    {
        if (!e.k) goto _L2; else goto _L1
_L1:
        long l1 = g.b(s1);
_L4:
        if (l1 <= 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        return (int)(System.currentTimeMillis() - l1);
_L2:
        l1 = com.umeng.analytics.i.a(context, s1).a().longValue();
        if (true) goto _L4; else goto _L3
        context;
        Log.a("MobclickAgent", "exception in get event duration", context);
_L3:
        return -1;
    }

    private void g(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        SharedPreferences sharedpreferences;
        h.c(context);
        sharedpreferences = com.umeng.analytics.h.e(context);
        if (sharedpreferences != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!a(sharedpreferences))
        {
            break MISSING_BLOCK_LABEL_72;
        }
        context = a(context, h(context), sharedpreferences);
        Log.a("MobclickAgent", (new StringBuilder("Start new session: ")).append(context).toString());
          goto _L1
        context;
        throw context;
        context = b(context, sharedpreferences);
        Log.a("MobclickAgent", (new StringBuilder("Extend current session: ")).append(context).toString());
          goto _L1
    }

    private String h(Context context)
    {
        if (b == null)
        {
            return com.umeng.common.b.p(context);
        } else
        {
            return b;
        }
    }

    private String i(Context context)
    {
        if (a == null)
        {
            return com.umeng.common.b.t(context);
        } else
        {
            return a;
        }
    }

    private void j(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        SharedPreferences sharedpreferences = com.umeng.analytics.h.e(context);
        if (sharedpreferences != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        long l2 = sharedpreferences.getLong("start_millis", -1L);
        if (l2 != -1L)
        {
            break; /* Loop/switch isn't completed */
        }
        Log.b("MobclickAgent", "onEndSession called before onStartSession");
_L4:
        a(context, sharedpreferences);
        if (g.a() > 0)
        {
            k(context);
        }
        if (true) goto _L1; else goto _L3
        context;
        throw context;
_L3:
        long l1 = System.currentTimeMillis();
        l2 = l1 - l2;
        String s2;
        android.content.SharedPreferences.Editor editor;
        String s3;
        long l3;
        l3 = sharedpreferences.getLong("duration", 0L);
        editor = sharedpreferences.edit();
        if (!e.h)
        {
            break MISSING_BLOCK_LABEL_234;
        }
        s2 = sharedpreferences.getString("activities", "");
        s3 = i;
        String s1 = s2;
        if (!"".equals(s2))
        {
            s1 = (new StringBuilder(String.valueOf(s2))).append(";").toString();
        }
        s1 = (new StringBuilder(String.valueOf(s1))).append("[").append(s3).append(",").append(l2 / 1000L).append("]").toString();
        editor.remove("activities");
        editor.putString("activities", s1);
        editor.putLong("start_millis", -1L);
        editor.putLong("end_millis", l1);
        editor.putLong("duration", l2 + l3);
        editor.commit();
          goto _L4
    }

    private void k(Context context)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("type", "cmd_cache_buffer");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.b("MobclickAgent", "json error in emitCache");
            return;
        }
        j.post(new b(this, context, jsonobject));
    }

    private void l(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        p(context);
        this;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    private void m(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = f;
        if (obj != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        obj = f.b(context);
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((JSONArray) (obj)).length() != 0)
        {
            a(context, ((JSONArray) (obj)));
        }
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    private String n(Context context)
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("Android");
        stringbuffer.append("/");
        stringbuffer.append("4.5");
        stringbuffer.append(" ");
        try
        {
            StringBuffer stringbuffer1 = new StringBuffer();
            stringbuffer1.append(context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString());
            stringbuffer1.append("/");
            stringbuffer1.append(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
            stringbuffer1.append(" ");
            stringbuffer1.append(Build.MODEL);
            stringbuffer1.append("/");
            stringbuffer1.append(android.os.Build.VERSION.RELEASE);
            stringbuffer1.append(" ");
            stringbuffer1.append(com.umeng.common.b.g.b(com.umeng.common.b.f(context)));
            stringbuffer.append(URLEncoder.encode(stringbuffer1.toString()));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
        return stringbuffer.toString();
    }

    private JSONObject o(Context context)
    {
        JSONObject jsonobject;
        Object obj;
        String s1;
        jsonobject = new JSONObject();
        try
        {
            obj = com.umeng.common.b.f(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.b("MobclickAgent", "getMessageHeader error", context);
            return null;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        if (!((String) (obj)).equals(""))
        {
            break MISSING_BLOCK_LABEL_36;
        }
        Log.b("MobclickAgent", "No device id");
        return null;
        s1 = h(context);
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        Log.b("MobclickAgent", "No appkey");
        return null;
        String as[];
        jsonobject.put("device_id", obj);
        jsonobject.put("idmd5", com.umeng.common.b.g.b(((String) (obj))));
        jsonobject.put("mc", com.umeng.common.b.q(context));
        jsonobject.put("device_model", Build.MODEL);
        jsonobject.put("appkey", s1);
        jsonobject.put("channel", i(context));
        jsonobject.put("app_version", com.umeng.common.b.e(context));
        jsonobject.put("version_code", com.umeng.common.b.d(context));
        jsonobject.put("sdk_type", "Android");
        jsonobject.put("sdk_version", "4.5");
        jsonobject.put("os", "Android");
        jsonobject.put("os_version", android.os.Build.VERSION.RELEASE);
        jsonobject.put("timezone", com.umeng.common.b.n(context));
        as = com.umeng.common.b.o(context);
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_247;
        }
        jsonobject.put("country", as[0]);
        jsonobject.put("language", as[1]);
        jsonobject.put("resolution", com.umeng.common.b.r(context));
        as = com.umeng.common.b.j(context);
        if (as == null) goto _L2; else goto _L1
_L1:
        if (!as[0].equals("2G/3G")) goto _L2; else goto _L3
_L3:
        jsonobject.put("access", as[0]);
        jsonobject.put("access_subtype", as[1]);
_L7:
        jsonobject.put("carrier", com.umeng.common.b.s(context));
        jsonobject.put("cpu", com.umeng.common.b.a());
        if (!d.equals(""))
        {
            jsonobject.put("gpu_vender", d);
        }
        if (!e.equals(""))
        {
            jsonobject.put("gpu_renderer", e);
        }
        if (!e.i) goto _L5; else goto _L4
_L4:
        as = com.umeng.analytics.h.h(context);
        if (as == null) goto _L5; else goto _L6
_L6:
        jsonobject.put("uinfo", as);
_L5:
        jsonobject.put("package", com.umeng.common.b.u(context));
        return jsonobject;
_L2:
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_429;
        }
        jsonobject.put("access", as[0]);
          goto _L7
        jsonobject.put("access", "Unknown");
          goto _L7
    }

    private void p(Context context)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("type", "flush");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.b("MobclickAgent", "json error in emitCache");
            return;
        }
        j.post(new b(this, context, jsonobject));
    }

    private String q(Context context)
    {
        return com.umeng.analytics.h.b(context).getString("umeng_last_config_time", "");
    }

    JSONObject a(Context context, JSONObject jsonobject, JSONObject jsonobject1, JSONObject jsonobject2, String s1)
    {
        Object obj;
        SharedPreferences sharedpreferences = com.umeng.analytics.h.c(context);
        long l1 = sharedpreferences.getLong("req_time", 0L);
        if (l1 != 0L)
        {
            try
            {
                jsonobject1.put("req_time", l1);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.a("MobclickAgent", "json error in tryToSendMessage", ((Exception) (obj)));
            }
        }
        sharedpreferences.edit().putString("header", jsonobject1.toString()).commit();
        obj = new JSONObject();
        if (s1 == null)
        {
            return null;
        }
        if ("flush".equals(s1) && jsonobject == null)
        {
            try
            {
                Log.e("MobclickAgent", "No cache message to flush in constructMessage");
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.b("MobclickAgent", "Fail to construct json message in tryToSendMessage.", jsonobject);
                com.umeng.analytics.h.j(context);
                return null;
            }
            return null;
        }
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        if (a(jsonobject, jsonobject1))
        {
            jsonobject.remove("error");
        }
        JSONObject jsonobject3 = jsonobject;
        if ("flush".equals(s1)) goto _L2; else goto _L1
_L1:
        jsonobject3 = jsonobject;
        if (jsonobject != null)
        {
            break MISSING_BLOCK_LABEL_180;
        }
        jsonobject3 = new JSONObject();
        if (!jsonobject3.isNull(s1)) goto _L4; else goto _L3
_L3:
        jsonobject = new JSONArray();
        jsonobject.put(jsonobject2);
        jsonobject3.put(s1, jsonobject);
_L2:
        ((JSONObject) (obj)).put("header", jsonobject1);
        ((JSONObject) (obj)).put("body", jsonobject3);
        return ((JSONObject) (obj));
_L4:
label0:
        {
            jsonobject = jsonobject3.getJSONArray(s1);
            if (!"ekv".equals(s1))
            {
                break label0;
            }
            b(jsonobject2, jsonobject);
        }
          goto _L2
        jsonobject.put(jsonobject2);
          goto _L2
    }

    void a(Context context)
    {
        if (context == null)
        {
            try
            {
                Log.b("MobclickAgent", "unexpected null context in onPause");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.b("MobclickAgent", "Exception occurred in Mobclick.onRause(). ", context);
            }
            break MISSING_BLOCK_LABEL_49;
        }
        if (!context.getClass().getName().equals(i))
        {
            Log.b("MobclickAgent", "onPause() called without context from corresponding onResume()");
            return;
        }
        break MISSING_BLOCK_LABEL_50;
        return;
        (new a(context, 0)).start();
        return;
    }

    void a(Context context, String s1)
    {
        if (s1 != null && s1 != "" && s1.length() <= 10240)
        {
            if (context == null)
            {
                Log.b("MobclickAgent", "unexpected null context in reportError");
                return;
            }
            if (f != null)
            {
                f.a(context, s1);
                return;
            }
        }
    }

    void a(Context context, String s1, String s2)
    {
        if (context == null || TextUtils.isEmpty(s1) || TextUtils.isEmpty(s2))
        {
            a("invalid params in onEventBegin");
            return;
        } else
        {
            f(context, (new StringBuilder("_tl")).append(s1).append(s2).toString());
            return;
        }
    }

    void a(Context context, String s1, String s2, long l1, int i1)
    {
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        if (!TextUtils.isEmpty(s1) && i1 > 0)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        try
        {
            a("invalid params in onEvent");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.b("MobclickAgent", "Exception occurred in Mobclick.onEvent(). ", context);
        }
        break MISSING_BLOCK_LABEL_73;
        if (!h.a() && e.k)
        {
            if (g.a(context, s1, s2, l1, i1))
            {
                k(context);
                return;
            }
            break MISSING_BLOCK_LABEL_93;
        }
        break MISSING_BLOCK_LABEL_74;
        return;
        (new a(context, s1, s2, l1, i1, 3)).start();
    }

    void a(Context context, String s1, Map map, long l1)
    {
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_11;
        }
        if (!TextUtils.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        a("invalid params in onKVEventEnd");
        return;
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        if (!map.isEmpty())
        {
            break MISSING_BLOCK_LABEL_51;
        }
        a("map is null or empty in onEvent");
        return;
        try
        {
            if (!h.a() && e.k)
            {
                if (g.a(context, s1, map, l1))
                {
                    k(context);
                    return;
                }
                break MISSING_BLOCK_LABEL_105;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.b("MobclickAgent", "Exception occurred in Mobclick.onEvent(). ", context);
            return;
        }
        (new a(context, s1, map, l1, 4)).start();
    }

    void a(Context context, String s1, Map map, String s2)
    {
        if (context == null || TextUtils.isEmpty(s1) || TextUtils.isEmpty(s2))
        {
            a("invalid params in onKVEventBegin");
            return;
        }
        if (map == null || map.isEmpty())
        {
            a("map is null or empty in onKVEventBegin");
            return;
        }
        try
        {
            if (e.k)
            {
                context = (new StringBuilder(String.valueOf(s1))).append(s2).toString();
                g.a(context, map);
                g.a(context);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.a("MobclickAgent", "exception in save k-v event begin inof", context);
            return;
        }
        (new a(context, s1, map, s2, 5)).start();
        return;
    }

    protected void a(Context context, JSONObject jsonobject)
    {
        String s2;
        JSONObject jsonobject1;
        int i1;
        s2 = (String)jsonobject.remove("type");
        jsonobject1 = a(context, com.umeng.analytics.h.i(context), o(context), jsonobject, s2);
        if (jsonobject1 == null || jsonobject1.isNull("body"))
        {
            return;
        }
        if (!h.a(s2, context))
        {
            com.umeng.analytics.h.b(context, jsonobject1);
            return;
        }
        jsonobject = null;
        i1 = 0;
_L5:
        if (i1 < e.p.length) goto _L2; else goto _L1
_L1:
        String s1;
        if (jsonobject != null)
        {
            Log.a("MobclickAgent", (new StringBuilder("send applog succeed :")).append(jsonobject).toString());
            com.umeng.analytics.h.j(context);
            h.a(context);
            return;
        } else
        {
            com.umeng.analytics.h.b(context, jsonobject1);
            Log.a("MobclickAgent", "send applog failed");
            return;
        }
_L2:
        s1 = a(context, jsonobject1, e.p[i1], false, s2);
        jsonobject = s1;
        if (s1 != null) goto _L1; else goto _L3
_L3:
        i1++;
        jsonobject = s1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    void b(Context context)
    {
        String s1 = h(context);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        if (s1.length() != 0)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        Log.b("MobclickAgent", "unexpected empty appkey in onError");
        return;
        if (context == null)
        {
            try
            {
                Log.b("MobclickAgent", "unexpected null context in onError");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.b("MobclickAgent", "Exception occurred in Mobclick.onError()", context);
            }
            return;
        }
        if (f != null)
        {
            f.a(context);
            f.a(this);
        }
        (new a(context, 2)).start();
        return;
    }

    void b(Context context, String s1)
    {
        if (context == null || TextUtils.isEmpty(s1))
        {
            a("invalid params in onEventBegin");
            return;
        } else
        {
            f(context, (new StringBuilder("_t")).append(s1).toString());
            return;
        }
    }

    void b(Context context, String s1, String s2)
    {
        if (context == null || TextUtils.isEmpty(s2))
        {
            a("invalid params in onEventEnd");
            return;
        }
        int i1 = g(context, (new StringBuilder("_tl")).append(s1).append(s2).toString());
        if (i1 < 0)
        {
            a("event duration less than 0 in onEvnetEnd");
            return;
        } else
        {
            a(context, s1, s2, i1, 1);
            return;
        }
    }

    void c(Context context)
    {
        if (context == null)
        {
            try
            {
                Log.b("MobclickAgent", "unexpected null context in onResume");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.b("MobclickAgent", "Exception occurred in Mobclick.onResume(). ", context);
            }
            break MISSING_BLOCK_LABEL_48;
        }
        i = context.getClass().getName();
        (new a(context, 1)).start();
        return;
    }

    void c(Context context, String s1)
    {
        if (context == null || TextUtils.isEmpty(s1))
        {
            Log.a("MobclickAgent", "input Context is null or event_id is empty");
            return;
        }
        int i1 = g(context, (new StringBuilder("_t")).append(s1).toString());
        if (i1 < 0)
        {
            Log.a("MobclickAgent", "event duration less than 0 in onEventEnd");
            return;
        } else
        {
            a(context, s1, ((String) (null)), i1, 1);
            return;
        }
    }

    void c(Context context, String s1, String s2)
    {
        if (context == null || TextUtils.isEmpty(s1) || TextUtils.isEmpty(s2))
        {
            a("invalid params in onKVEventEnd");
            return;
        }
        if (e.k)
        {
            s2 = (new StringBuilder(String.valueOf(s1))).append(s2).toString();
            int i1 = g(context, s2);
            if (i1 < 0)
            {
                a("event duration less than 0 in onEvnetEnd");
                return;
            } else
            {
                a(context, s1, g.c(s2), i1);
                return;
            }
        } else
        {
            (new a(context, s1, null, s2, 6)).start();
            return;
        }
    }

    void d(Context context)
    {
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        Log.b("MobclickAgent", "unexpected null context in flush");
        l(context);
        return;
        context;
        Log.b("MobclickAgent", "Exception occurred in Mobclick.flush(). ", context);
        return;
    }

    public void e(Context context)
    {
        String s1;
        if (context == null)
        {
            try
            {
                Log.b("MobclickAgent", "unexpected null context in updateOnlineConfig");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.b("MobclickAgent", "exception in updateOnlineConfig");
            }
            break MISSING_BLOCK_LABEL_41;
        }
        s1 = h(context);
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        Log.b("MobclickAgent", "unexpected null appkey in updateOnlineConfig");
        return;
        return;
        (new Thread(new c(this, context, s1))).start();
        return;
    }

    public void f(Context context)
    {
        try
        {
            g.a(context);
            j(context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.a("MobclickAgent", "Exception in onAppCrash", context);
        }
    }
}
