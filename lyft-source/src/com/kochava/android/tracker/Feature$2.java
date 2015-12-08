// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.tracker;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.kochava.android.util.StringUtils;
import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kochava.android.tracker:
//            Feature, Global

class xception
    implements Runnable
{

    public void run()
    {
        int i;
        int j;
        j = 60;
        i = j;
        Object obj = Feature.c(true);
        i = j;
        HttpProtocolParams.setUserAgent(((HttpClient) (obj)).getParams(), Feature.b());
        i = j;
        if (Feature.c() == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        i = j;
        if (!Feature.c().trim().isEmpty())
        {
            break MISSING_BLOCK_LABEL_86;
        }
        i = j;
        if (!Global.a)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        i = j;
        Log.i("KochavaTracker", "KVquery - hostControl was empty, using default");
        i = j;
        Feature.b("control.kochava.com");
        i = j;
        Object obj1 = (new StringBuilder("https://")).append(Feature.c()).append("/track/kvquery").toString();
        i = j;
        if (!Global.a)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        i = j;
        Log.i("KochavaTracker", (new StringBuilder("KVquery - posting to ")).append(((String) (obj1))).toString());
        i = j;
        obj1 = new HttpPost(((String) (obj1)));
        i = j;
        Object obj2 = new JSONObject();
        i = j;
        ((JSONObject) (obj2)).put("action", "get_attribution");
        i = j;
        ((JSONObject) (obj2)).put("kochava_app_id", Feature.d());
        i = j;
        ((JSONObject) (obj2)).put("kochava_device_id", Feature.e());
        i = j;
        ((JSONObject) (obj2)).put("sdk_version", (new StringBuilder("Android20141023")).append(Feature.a).toString());
        i = j;
        ((JSONObject) (obj2)).put("sdk_protocol", "3");
        i = j;
        obj2 = ((JSONObject) (obj2)).toString();
        i = j;
        if (!Global.a)
        {
            break MISSING_BLOCK_LABEL_303;
        }
        i = j;
        Log.i("KochavaTracker", (new StringBuilder("KVquery data:")).append(((String) (obj2))).toString());
        i = j;
        obj2 = new StringEntity(((String) (obj2)), "UTF-8");
        i = j;
        BasicHeader basicheader = new BasicHeader("Content-Type", "application/xml");
        i = j;
        ((HttpPost) (obj1)).getParams().setBooleanParameter("http.protocol.expect-continue", false);
        i = j;
        ((StringEntity) (obj2)).setContentType(basicheader);
        i = j;
        ((HttpPost) (obj1)).setEntity(((HttpEntity) (obj2)));
        i = j;
        if (!Global.a)
        {
            break MISSING_BLOCK_LABEL_393;
        }
        i = j;
        Log.e("KochavaTracker", "Trying to post to KVquery.");
        i = j;
        obj = ((HttpClient) (obj)).execute(((org.apache.http.client.methods.HttpUriRequest) (obj1))).getEntity();
        if (obj != null) goto _L2; else goto _L1
_L1:
        i = j;
        if (!Global.b)
        {
            break MISSING_BLOCK_LABEL_436;
        }
        i = j;
        Log.e("KochavaTracker", "Could not get a response entity from KVquery.");
_L6:
        return;
_L2:
        i = j;
        if (!Global.a)
        {
            break MISSING_BLOCK_LABEL_459;
        }
        i = j;
        Log.e("KochavaTracker", "(KVquery) Grabbing Result...");
        i = j;
        obj = StringUtils.a(((HttpEntity) (obj)).getContent());
        i = j;
        if (!Global.a)
        {
            break MISSING_BLOCK_LABEL_509;
        }
        i = j;
        Log.e("KochavaTracker", (new StringBuilder("(KVquery) Result: ")).append(((String) (obj))).toString());
        i = j;
        obj = new JSONObject(((String) (obj)));
_L19:
        i = j;
        if (obj == null) goto _L4; else goto _L3
_L3:
        i = j;
        if (!Global.a)
        {
            break MISSING_BLOCK_LABEL_569;
        }
        i = j;
        Log.e("KochavaTracker", (new StringBuilder("(KVquery) Parsed result: ")).append(((JSONObject) (obj)).toString()).toString());
        i = j;
        obj = ((JSONObject) (obj)).getJSONObject("data");
        i = j;
        obj1 = obj;
        if (!Global.a)
        {
            break MISSING_BLOCK_LABEL_1158;
        }
        i = j;
        Log.i("KochavaTracker", (new StringBuilder("(KVquery) return data: ")).append(((JSONObject) (obj)).toString()).toString());
_L20:
        i = j;
        if (obj == null) goto _L4; else goto _L5
_L5:
        i = j;
        obj1 = ((JSONObject) (obj)).getString("attribution");
_L9:
        i = j;
        int k = ((JSONObject) (obj)).getInt("retry");
        int l;
        int i1;
        i = k;
        j = i;
        if (i >= 0)
        {
            break MISSING_BLOCK_LABEL_820;
        }
        k = i;
        l = i;
        i1 = i;
        Feature.f().edit().putString("attributionData", ((String) (obj1))).commit();
        j = i;
        k = i;
        l = i;
        i1 = i;
        if (Feature.g() == null)
        {
            break MISSING_BLOCK_LABEL_820;
        }
        k = i;
        l = i;
        i1 = i;
        obj = Message.obtain();
        k = i;
        l = i;
        i1 = i;
        obj2 = new Bundle();
        k = i;
        l = i;
        i1 = i;
        ((Bundle) (obj2)).putString("attributionData", ((String) (obj1)).toString());
        k = i;
        l = i;
        i1 = i;
        ((Message) (obj)).setData(((Bundle) (obj2)));
        k = i;
        l = i;
        i1 = i;
        Feature.g().sendMessage(((Message) (obj)));
        j = i;
_L11:
        if (j > 0)
        {
            Feature.a(j);
            return;
        }
          goto _L6
        obj;
        i = j;
        if (!Global.b) goto _L8; else goto _L7
_L7:
        i = j;
        Log.e("KochavaTracker", (new StringBuilder("(KVquery) Error while parsing result json: ")).append(((JSONException) (obj)).toString()).toString());
          goto _L8
_L18:
        i = j;
        obj1 = obj;
        if (!Global.a)
        {
            break MISSING_BLOCK_LABEL_1158;
        }
        i = j;
        Log.e("KochavaTracker", "KVquery response did not contain data.");
        obj1 = obj;
        break MISSING_BLOCK_LABEL_1158;
        obj1;
        i = j;
        if (!Global.a)
        {
            break MISSING_BLOCK_LABEL_929;
        }
        i = j;
        Log.e("KochavaTracker", "KVquery response did not contain attribution data, or JSON was invalid.");
        obj1 = "";
          goto _L9
        obj;
        i = 60;
_L17:
        j = i;
        k = i;
        l = i;
        i1 = i;
        if (!Global.a) goto _L11; else goto _L10
_L10:
        k = i;
        l = i;
        i1 = i;
        Log.e("KochavaTracker", "KVquery response did not contain a retry value, or JSON was invalid.");
        j = i;
          goto _L11
        obj;
        j = k;
_L16:
        i = j;
        if (!Global.a) goto _L6; else goto _L12
_L12:
        i = j;
        Log.e("KochavaTracker", "KVquery IOException:", ((Throwable) (obj)));
        return;
        obj;
        if (Global.a)
        {
            Log.e("KochavaTracker", "KVquery ClientProtocolException:", ((Throwable) (obj)));
            return;
        }
          goto _L6
        obj;
_L15:
        i = j;
        if (!Global.a) goto _L6; else goto _L13
_L13:
        i = j;
        Log.e("KochavaTracker", "KVquery OutOfMemoryError:", ((Throwable) (obj)));
        return;
        obj;
        if (Global.a)
        {
            Log.e("KochavaTracker", "KVquery IOException:", ((Throwable) (obj)));
            return;
        }
          goto _L6
        obj;
        j = i;
_L14:
        i = j;
        if (Global.b)
        {
            Log.e("KochavaTracker", "Unexpected error during KVquery communication.", ((Throwable) (obj)));
            i = j;
        }
_L4:
        j = i;
          goto _L11
        obj;
        j = l;
          goto _L14
        obj;
        j = i1;
          goto _L15
        obj;
          goto _L16
        obj;
          goto _L17
        obj1;
          goto _L18
_L8:
        obj = null;
          goto _L19
        obj;
        obj = null;
          goto _L18
        obj = obj1;
          goto _L20
    }

    xception()
    {
    }
}
