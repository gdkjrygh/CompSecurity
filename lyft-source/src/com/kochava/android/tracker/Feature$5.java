// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.tracker;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.kochava.android.util.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kochava.android.tracker:
//            Feature, Global

class b
    implements Runnable
{

    final Feature a;
    private final boolean b;

    public void run()
    {
        Object obj;
        if (Global.a)
        {
            Log.i("KochavaTracker", "getKVinit thread started.");
        }
        if (Global.a)
        {
            Log.i("KochavaTracker", (new StringBuilder("getKVinit post: ")).append(a.e.toString()).toString());
        }
        obj = Feature.c(true);
        HttpProtocolParams.setUserAgent(((HttpClient) (obj)).getParams(), Feature.b());
        if (Feature.c() == null || Feature.c().trim().isEmpty())
        {
            if (Global.a)
            {
                Log.i("KochavaTracker", "KVinit - hostControl was empty, using default");
            }
            Feature.b("control.kochava.com");
        }
        if (Global.a)
        {
            Log.i("KochavaTracker", (new StringBuilder("KVinit - posting to ")).append("https://").append(Feature.c()).append("/track/kvinit").toString());
        }
        HttpPost httppost = new HttpPost((new StringBuilder("https://")).append(Feature.c()).append("/track/kvinit").toString());
        Object obj2 = a.e.toString();
        if (Global.a)
        {
            Log.i("KochavaTracker", (new StringBuilder("kvinit data:")).append(((String) (obj2))).toString());
        }
        obj2 = new StringEntity(((String) (obj2)), "UTF-8");
        BasicHeader basicheader = new BasicHeader("Content-Type", "application/xml");
        httppost.getParams().setBooleanParameter("http.protocol.expect-continue", false);
        ((StringEntity) (obj2)).setContentType(basicheader);
        httppost.setEntity(((HttpEntity) (obj2)));
        if (Global.a)
        {
            Log.e("KochavaTracker", "Trying to post to KVinit.");
        }
        obj = ((HttpClient) (obj)).execute(httppost).getEntity();
        if (obj != null) goto _L2; else goto _L1
_L1:
        if (Global.b)
        {
            Log.e("KochavaTracker", "Could not get a response entity from KVinit.");
        }
_L17:
        return;
_L2:
        if (Global.a)
        {
            Log.e("KochavaTracker", "(KVinit) Grabbing Result...");
        }
        obj = StringUtils.a(((HttpEntity) (obj)).getContent());
        if (Global.a)
        {
            Log.e("KochavaTracker", (new StringBuilder("(KVinit) Result: ")).append(((String) (obj))).toString());
        }
        JSONObject jsonobject = new JSONObject(((String) (obj)));
_L34:
        if (jsonobject == null) goto _L4; else goto _L3
_L3:
        if (Global.a)
        {
            Log.e("KochavaTracker", (new StringBuilder("(KVinit) Parsed result: ")).append(jsonobject.toString()).toString());
        }
        obj = jsonobject.getJSONObject("flags");
        Object obj1 = obj;
        if (!Global.a) goto _L6; else goto _L5
_L5:
        Log.i("KochavaTracker", (new StringBuilder("Flags: ")).append(((JSONObject) (obj)).toString()).toString());
_L35:
        if (obj == null) goto _L8; else goto _L7
_L7:
        obj1 = ((JSONObject) (obj)).getString("kochava_app_id");
        if (Global.a)
        {
            Log.i("KochavaTracker", (new StringBuilder("kochava_app_id: ")).append(((String) (obj1)).toString()).toString());
        }
        Feature.e(((String) (obj1)));
_L21:
        if (((JSONObject) (obj)).get("session_tracking").equals("none"))
        {
            Feature.d(false);
        }
_L24:
        int i;
        int j;
        try
        {
            obj1 = ((String)((JSONObject) (obj)).get("currency")).toUpperCase();
            if (Global.a)
            {
                Log.e("KochavaTracker", (new StringBuilder("setting currency to: ")).append(((String) (obj1))).toString());
            }
            Feature.h(a, ((String) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        try
        {
            if (((JSONObject) (obj)).get("resend_initial").equals("true"))
            {
                if (Global.a)
                {
                    Log.e("KochavaTracker", "resend_initial flag triggered.");
                }
                Feature.a(Feature.d(a).getSharedPreferences("initPrefs", 0));
                Feature.h().edit().putString("initBool", "false").commit();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
_L8:
        obj = jsonobject.getJSONArray("blacklist");
        if (Global.a)
        {
            Log.i("KochavaTracker", (new StringBuilder("blacklist: ")).append(((JSONArray) (obj)).toString()).toString());
        }
          goto _L9
_L33:
        j = ((JSONArray) (obj)).length();
        if (i < j) goto _L11; else goto _L10
_L10:
        obj = jsonobject.getJSONArray("whitelist");
        if (Global.a)
        {
            Log.i("KochavaTracker", (new StringBuilder("whitelist: ")).append(((JSONArray) (obj)).toString()).toString());
        }
          goto _L12
_L28:
        j = ((JSONArray) (obj)).length();
        if (i < j) goto _L14; else goto _L13
_L13:
        obj = jsonobject.getJSONArray("eventname_blacklist");
        if (Global.a)
        {
            Log.i("KochavaTracker", (new StringBuilder("saving eventname_blacklist: ")).append(((JSONArray) (obj)).toString()).toString());
        }
        Feature.o().clear();
        i = 0;
_L29:
        j = ((JSONArray) (obj)).length();
        if (i < j) goto _L16; else goto _L15
_L15:
        obj = jsonobject.getString("error");
        if (Global.b)
        {
            Log.e("KochavaTracker", (new StringBuilder("There was a problem getting the KVinit response: ")).append(((String) (obj))).toString());
        }
_L4:
        if (Global.a)
        {
            Log.i("KochavaTracker", "getKVinit thread ended, sending message to initHandler.");
        }
        obj = Message.obtain();
        obj1 = new Bundle();
        ((Bundle) (obj1)).putBoolean("sendonstart", b);
        ((Message) (obj)).setData(((Bundle) (obj1)));
        Feature.p(a).sendMessage(((Message) (obj)));
        if (!Feature.q(a) && Feature.p())
        {
            if (Global.a)
            {
                Log.i("KochavaTracker", "Requesting attribution data...");
            }
            Feature.a(7);
            return;
        }
          goto _L17
        obj;
        if (Global.b)
        {
            Log.e("KochavaTracker", (new StringBuilder("Error while parsing result json: ")).append(((JSONException) (obj)).toString()).toString());
        }
          goto _L18
_L32:
        obj1 = obj;
        if (!Global.a) goto _L6; else goto _L19
_L19:
        Log.e("KochavaTracker", "KVinit response did not contain flags.");
        obj1 = obj;
          goto _L6
        obj1;
        if (!Global.a) goto _L21; else goto _L20
_L20:
        Log.e("KochavaTracker", "KVinit response did not contain a kochava_app_id.");
          goto _L21
        obj;
        if (!Global.a) goto _L17; else goto _L22
_L22:
        Log.e("KochavaTracker", "TrackTask", ((Throwable) (obj)));
        return;
        obj;
        if (Global.a)
        {
            Log.e("KochavaTracker", "TrackTask", ((Throwable) (obj)));
            return;
        }
          goto _L17
        obj1;
        if (!Global.a) goto _L24; else goto _L23
_L23:
        Log.e("KochavaTracker", "KVinit response did not contain flags.");
          goto _L24
        obj;
        if (!Global.a) goto _L17; else goto _L25
_L25:
        Log.e("KochavaTracker", "TrackTask", ((Throwable) (obj)));
        return;
        obj;
        if (!Global.a) goto _L17; else goto _L26
_L26:
        Log.e("KochavaTracker", "TrackTask", ((Throwable) (obj)));
        return;
_L11:
        if (((JSONArray) (obj)).get(i).toString().toLowerCase().equals("android_id"))
        {
            if (Global.a)
            {
                Log.i("KochavaTracker", "disabling: android_id");
            }
            Feature.n().put("android_id", Boolean.valueOf(false));
            break MISSING_BLOCK_LABEL_1648;
        }
        if (((JSONArray) (obj)).get(i).toString().toLowerCase().equals("fb_attribution_id"))
        {
            if (Global.a)
            {
                Log.i("KochavaTracker", "disabling: fb_attribution_id");
            }
            Feature.n().put("fb_attribution_id", Boolean.valueOf(false));
            break MISSING_BLOCK_LABEL_1648;
        }
        break MISSING_BLOCK_LABEL_1243;
        obj;
        if (!Global.a) goto _L10; else goto _L27
_L27:
        Log.e("KochavaTracker", "KVinit response did not contain a blacklist.");
          goto _L10
        obj;
        if (Global.b)
        {
            Log.e("KochavaTracker", "Unexpected error during KVinit communication.", ((Throwable) (obj)));
        }
          goto _L4
        if (((JSONArray) (obj)).get(i).toString().toLowerCase().equals("imei"))
        {
            if (Global.a)
            {
                Log.i("KochavaTracker", "disabling: imei");
            }
            Feature.n().put("imei", Boolean.valueOf(false));
            break MISSING_BLOCK_LABEL_1648;
        }
        if (((JSONArray) (obj)).get(i).toString().toLowerCase().equals("mac"))
        {
            if (Global.a)
            {
                Log.i("KochavaTracker", "disabling: mac");
            }
            Feature.n().put("mac", Boolean.valueOf(false));
            break MISSING_BLOCK_LABEL_1648;
        }
        if (((JSONArray) (obj)).get(i).toString().toLowerCase().equals("odin"))
        {
            if (Global.a)
            {
                Log.i("KochavaTracker", "disabling: odin");
            }
            Feature.n().put("odin", Boolean.valueOf(false));
            break MISSING_BLOCK_LABEL_1648;
        }
        if (((JSONArray) (obj)).get(i).toString().toLowerCase().equals("adid"))
        {
            if (Global.a)
            {
                Log.i("KochavaTracker", "disabling: adid");
            }
            Feature.n().put("adid", Boolean.valueOf(false));
        }
        break MISSING_BLOCK_LABEL_1648;
_L14:
        if (((JSONArray) (obj)).get(i).toString().toLowerCase().equals("email"))
        {
            if (Global.a)
            {
                Log.i("KochavaTracker", "sending emails");
            }
            Feature.e(true);
        }
        i++;
          goto _L28
_L16:
        if (Global.a)
        {
            Log.i("KochavaTracker", (new StringBuilder("eventname_blacklist item: ")).append(((JSONArray) (obj)).get(i).toString()).toString());
        }
        Feature.o().add(((JSONArray) (obj)).get(i).toString());
        i++;
          goto _L29
        obj;
        if (!Global.a) goto _L15; else goto _L30
_L30:
        Log.e("KochavaTracker", "KVinit response did not contain an eventname_blacklist.");
          goto _L15
        obj;
        if (!Global.a) goto _L4; else goto _L31
_L31:
        Log.e("KochavaTracker", "KVinit response did not contain an error.");
          goto _L4
        obj;
          goto _L13
        obj1;
          goto _L32
_L9:
        i = 0;
          goto _L33
_L12:
        i = 0;
          goto _L28
_L18:
        jsonobject = null;
          goto _L34
        obj;
        obj = null;
          goto _L32
_L6:
        obj = obj1;
          goto _L35
        i++;
          goto _L33
    }

    xception(Feature feature, boolean flag)
    {
        a = feature;
        b = flag;
        super();
    }
}
