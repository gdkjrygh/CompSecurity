// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.tracker;

import android.content.SharedPreferences;
import android.util.Log;
import com.kochava.android.util.StringUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.json.JSONObject;

// Referenced classes of package com.kochava.android.tracker:
//            Feature, Global

class b
    implements Runnable
{

    final Feature a;
    private final String b;

    public void run()
    {
        Object obj1;
        if (Global.a)
        {
            Log.i("KochavaTracker", (new StringBuilder("Checking watchlist from ")).append(b).append("...").toString());
        }
        obj1 = new HashMap();
        if (Feature.h().contains("app_short_string")) goto _L2; else goto _L1
_L1:
        if (Global.a)
        {
            Log.i("KochavaTracker", (new StringBuilder("No previous app_short_string in watchlist, adding ")).append(Feature.g(a)).toString());
        }
        Feature.h().edit().putString("app_short_string", Feature.g(a)).commit();
_L11:
        Object obj2;
        Object obj3;
        Object obj;
        BasicHeader basicheader;
        if (!Feature.h().contains("app_limit_tracking"))
        {
            if (Global.a)
            {
                Log.i("KochavaTracker", (new StringBuilder("No previous app_limit_tracking in watchlist, adding ")).append(Feature.r(a)).toString());
            }
            Feature.h().edit().putBoolean("app_limit_tracking", Feature.r(a)).commit();
        } else
        if (Feature.h().getBoolean("app_limit_tracking", false) != Feature.r(a))
        {
            if (Global.a)
            {
                Log.i("KochavaTracker", (new StringBuilder("app_limit_tracking changed! Is now ")).append(Feature.r(a)).toString());
            }
            ((HashMap) (obj1)).put("app_limit_tracking", (new StringBuilder(String.valueOf(Feature.r(a)))).toString());
            Feature.h().edit().putBoolean("app_limit_tracking", Feature.r(a)).commit();
        }
        if (!Feature.h().contains("app_version"))
        {
            if (Global.a)
            {
                Log.i("KochavaTracker", (new StringBuilder("No previous app_version in watchlist, adding ")).append(Feature.s(a)).toString());
            }
            Feature.h().edit().putString("app_version", Feature.s(a)).commit();
        } else
        if (!Feature.h().getString("app_version", "").equals(Feature.s(a)))
        {
            if (Global.a)
            {
                Log.i("KochavaTracker", (new StringBuilder("app_version changed! Is now ")).append(Feature.s(a)).toString());
            }
            ((HashMap) (obj1)).put("app_version", (new StringBuilder(String.valueOf(Feature.s(a)))).toString());
            Feature.h().edit().putString("app_version", Feature.s(a)).commit();
        }
        if (!Feature.h().contains("device_limit_tracking"))
        {
            if (Global.a)
            {
                Log.i("KochavaTracker", (new StringBuilder("No previous device_limit_tracking in watchlist, adding ")).append(Feature.q()).toString());
            }
            Feature.h().edit().putBoolean("device_limit_tracking", Feature.q()).commit();
        } else
        if (Feature.h().getBoolean("device_limit_tracking", false) != Feature.q())
        {
            if (Global.a)
            {
                Log.i("KochavaTracker", (new StringBuilder("device_limit_tracking changed! Is now ")).append(Feature.q()).toString());
            }
            ((HashMap) (obj1)).put("device_limit_tracking", (new StringBuilder(String.valueOf(Feature.q()))).toString());
            Feature.h().edit().putBoolean("device_limit_tracking", Feature.q()).commit();
        }
        if (!Feature.h().contains("adid"))
        {
            if (Global.a)
            {
                Log.i("KochavaTracker", (new StringBuilder("No previous adid in watchlist, adding ")).append(Feature.r()).toString());
            }
            Feature.h().edit().putString("adid", Feature.r()).commit();
        } else
        if (!Feature.h().getString("adid", "").equals(Feature.r()))
        {
            if (Global.a)
            {
                Log.i("KochavaTracker", (new StringBuilder("adid changed! Is now ")).append(Feature.r()).toString());
            }
            ((HashMap) (obj1)).put("adid", Feature.r());
            Feature.h().edit().putString("adid", Feature.r()).commit();
        }
        if (!Feature.h().contains("os_version"))
        {
            if (Global.a)
            {
                Log.i("KochavaTracker", (new StringBuilder("No previous os_version in watchlist, adding ")).append(Feature.t(a)).toString());
            }
            Feature.h().edit().putString("os_version", Feature.t(a)).commit();
        } else
        if (!Feature.h().getString("os_version", "").equals(Feature.t(a)))
        {
            if (Global.a)
            {
                Log.i("KochavaTracker", (new StringBuilder("os_version changed! Is now ")).append(Feature.t(a)).toString());
            }
            ((HashMap) (obj1)).put("os_version", Feature.t(a));
            Feature.h().edit().putString("os_version", Feature.t(a)).commit();
        }
        if (((HashMap) (obj1)).keySet().isEmpty()) goto _L4; else goto _L3
_L3:
        obj = new JSONObject();
        ((JSONObject) (obj)).put("action", "update");
        ((JSONObject) (obj)).put("kochava_device_id", Feature.e());
        ((JSONObject) (obj)).put("kochava_app_id", Feature.d());
        obj2 = new JSONObject();
        obj3 = ((HashMap) (obj1)).keySet().iterator();
_L8:
        if (((Iterator) (obj3)).hasNext()) goto _L6; else goto _L5
_L5:
        ((JSONObject) (obj)).put("data", obj2);
        obj1 = Feature.c(false);
        HttpProtocolParams.setUserAgent(((HttpClient) (obj1)).getParams(), Feature.b());
        if (Feature.c() == null || Feature.c().trim().isEmpty())
        {
            Feature.b("control.kochava.com");
        }
        if (Global.a)
        {
            Log.i("KochavaTracker", (new StringBuilder("posting update to ")).append("https://").append(Feature.c()).append("/track/kvTracker.php").toString());
        }
        obj2 = new HttpPost((new StringBuilder("https://")).append(Feature.c()).append("/track/kvTracker.php").toString());
        obj3 = new StringEntity(((JSONObject) (obj)).toString(), "UTF-8");
        basicheader = new BasicHeader("Content-Type", "application/xml");
        ((HttpPost) (obj2)).getParams().setBooleanParameter("http.protocol.expect-continue", false);
        ((StringEntity) (obj3)).setContentType(basicheader);
        ((HttpPost) (obj2)).setEntity(((HttpEntity) (obj3)));
        if (Global.a)
        {
            Log.e("KochavaTracker", (new StringBuilder("Trying to post an update: ")).append(((JSONObject) (obj)).toString()).toString());
        }
        obj = ((HttpClient) (obj1)).execute(((org.apache.http.client.methods.HttpUriRequest) (obj2))).getEntity();
        if (obj == null) goto _L4; else goto _L7
_L7:
        obj = StringUtils.a(((HttpEntity) (obj)).getContent());
        if (Global.a)
        {
            Log.e("KochavaTracker", (new StringBuilder("Update Result: ")).append(((String) (obj))).toString());
        }
_L4:
        return;
_L2:
        if (!Feature.h().getString("app_short_string", "").equals(Feature.g(a)))
        {
            if (Global.a)
            {
                Log.i("KochavaTracker", (new StringBuilder("app_short_string changed! Is now ")).append(Feature.g(a)).toString());
            }
            ((HashMap) (obj1)).put("app_short_string", (new StringBuilder(String.valueOf(Feature.g(a)))).toString());
            Feature.h().edit().putString("app_short_string", Feature.g(a)).commit();
        }
        continue; /* Loop/switch isn't completed */
_L6:
        String s = (String)((Iterator) (obj3)).next();
        ((JSONObject) (obj2)).put(s, ((HashMap) (obj1)).get(s));
          goto _L8
        Exception exception;
        exception;
        if (!Global.b) goto _L4; else goto _L9
_L9:
        Log.e("KochavaTracker", (new StringBuilder("Update error: ")).append(exception.toString()).toString());
        return;
        if (true) goto _L11; else goto _L10
_L10:
    }

    t(Feature feature, String s)
    {
        a = feature;
        b = s;
        super();
    }
}
