// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.appsflyer:
//            AppsFlyerLib, AppsFlyerProperties, HashUtils

private static class <init>
    implements Runnable
{

    private WeakReference ctxReference;
    Map params;
    private String urlString;

    public void run()
    {
        Object obj = (Context)ctxReference.get();
        if (obj == null) goto _L2; else goto _L1
_L1:
        Object obj1 = AppsFlyerProperties.getInstance().getReferrer(((Context) (obj)));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        if (((String) (obj1)).length() > 0 && params.get("referrer") == null)
        {
            params.put("referrer", obj1);
        }
        Object obj2;
        boolean flag1;
        flag1 = "true".equals(((Context) (obj)).getSharedPreferences("appsflyer-data", 0).getString("sentSuccessfully", ""));
        obj1 = (String)params.get("eventName");
        obj2 = params;
        Throwable throwable;
        Iterator iterator;
        String s;
        boolean flag;
        if (obj1 == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((Map) (obj2)).put("counter", Integer.toString(AppsFlyerLib.access$300(((Context) (obj)), flag)));
        flag = flag1;
_L11:
        obj = params;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((Map) (obj)).put("isFirstCall", Boolean.toString(flag));
        params.put("af_timestamp", Long.toString((new Date()).getTime()));
        obj1 = (String)params.get("appsflyerKey");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        if (((String) (obj1)).length() != 0)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        Log.d("AppsFlyer_1.5.3", "Not sending data yet, waiting for dev key");
        return;
        obj = (new HashUtils()).getHashCode(params);
        params.put("af_v", obj);
        obj2 = new StringBuilder();
        iterator = params.keySet().iterator();
_L7:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        s = (String)iterator.next();
        obj = (String)params.get(s);
        if (obj != null) goto _L6; else goto _L5
_L5:
        obj = "";
_L8:
        if (((StringBuilder) (obj2)).length() > 0)
        {
            ((StringBuilder) (obj2)).append('&');
        }
        ((StringBuilder) (obj2)).append(s).append('=').append(((String) (obj)));
          goto _L7
        obj1;
        obj = null;
_L9:
        if (obj != null && ctxReference != null && !urlString.contains("&isCachedRequest=true"))
        {
            Log.e("AppsFlyer_1.5.3", ((IOException) (obj1)).getMessage(), ((Throwable) (obj1)));
            return;
        } else
        {
            return;
        }
_L6:
        obj = URLEncoder.encode(((String) (obj)), "UTF-8");
          goto _L8
_L4:
        obj = ((StringBuilder) (obj2)).toString();
        try
        {
            AppsFlyerLib.access$400(urlString, ((String) (obj)), ((String) (obj1)), ctxReference, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
          goto _L9
        throwable;
        Log.e("AppsFlyer_1.5.3", throwable.getMessage(), throwable);
        return;
_L2:
        flag = false;
        if (true) goto _L11; else goto _L10
_L10:
    }

    private (String s, Map map, Context context)
    {
        ctxReference = null;
        urlString = s;
        params = map;
        ctxReference = new WeakReference(context);
    }

    ctxReference(String s, Map map, Context context, ctxReference ctxreference)
    {
        this(s, map, context);
    }
}
