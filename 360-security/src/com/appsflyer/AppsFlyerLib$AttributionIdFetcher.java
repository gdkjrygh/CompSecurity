// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.appsflyer:
//            AppsFlyerLib, AttributionIDNotReady, ConversionDataListener

private static class appsFlyerDevKey
    implements Runnable
{

    private static final String AF_ATTRIBUTION_ID_URI = "https://api.appsflyer.com/install_data/v3/";
    private static AtomicInteger currentRequestsCounter = new AtomicInteger(0);
    private String appsFlyerDevKey;
    private WeakReference ctxReference;

    public void run()
    {
        Object obj3 = null;
        if (appsFlyerDevKey != null && appsFlyerDevKey.length() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        currentRequestsCounter.incrementAndGet();
        Context context = (Context)ctxReference.get();
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        currentRequestsCounter.decrementAndGet();
        if (true) goto _L1; else goto _L3
_L3:
        throw new NullPointerException();
        Object obj1 = AppsFlyerLib.access$600(context, AppsFlyerLib.access$500(context));
        Object obj;
        obj = "";
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        obj = (new StringBuilder()).append("-").append(((String) (obj1))).toString();
        Object obj2;
        obj1 = (new StringBuilder()).append("https://api.appsflyer.com/install_data/v3/").append(context.getPackageName()).append(((String) (obj))).append("?devkey=").append(appsFlyerDevKey).append("&device_id=").append(AppsFlyerLib.getAppsFlyerUID(context));
        if (AppsFlyerLib.access$700())
        {
            Log.i("AppsFlyer_1.5.3", (new StringBuilder()).append("Calling server for attribution url: ").append(((StringBuilder) (obj1)).toString()).toString());
        }
        obj2 = (HttpURLConnection)(new URL(((StringBuilder) (obj1)).toString())).openConnection();
        obj = obj2;
        ((HttpURLConnection) (obj2)).setRequestMethod("GET");
        obj = obj2;
        ((HttpURLConnection) (obj2)).setConnectTimeout(10000);
        obj = obj2;
        ((HttpURLConnection) (obj2)).setRequestProperty("Connection", "close");
        obj = obj2;
        ((HttpURLConnection) (obj2)).connect();
        obj = obj2;
        if (((HttpURLConnection) (obj2)).getResponseCode() != 200) goto _L5; else goto _L4
_L4:
        obj = obj2;
        StringBuilder stringbuilder = new StringBuilder();
        Object obj4 = new InputStreamReader(((HttpURLConnection) (obj2)).getInputStream());
        obj1 = new BufferedReader(((java.io.Reader) (obj4)));
_L8:
        obj = ((BufferedReader) (obj1)).readLine();
        if (obj == null) goto _L7; else goto _L6
_L6:
        stringbuilder.append(((String) (obj))).append('\n');
          goto _L8
        obj;
        obj3 = obj1;
        obj1 = obj;
_L13:
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_325;
        }
        obj = obj2;
        ((BufferedReader) (obj3)).close();
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_337;
        }
        obj = obj2;
        ((InputStreamReader) (obj4)).close();
        obj = obj2;
        String s;
        int i;
        try
        {
            throw obj1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj1 = obj2;
        }
        finally
        {
            obj1 = obj;
        }
        obj2 = obj;
_L12:
        obj = obj1;
        if (AppsFlyerLib.access$900() == null)
        {
            break MISSING_BLOCK_LABEL_368;
        }
        obj = obj1;
        AppsFlyerLib.access$900().onConversionFailure(((Throwable) (obj2)).getMessage());
        obj = obj1;
        Log.e("AppsFlyer_1.5.3", ((Throwable) (obj2)).getMessage(), ((Throwable) (obj2)));
        currentRequestsCounter.decrementAndGet();
        if (obj1 != null)
        {
            ((HttpURLConnection) (obj1)).disconnect();
            return;
        }
          goto _L1
_L7:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_407;
        }
        obj = obj2;
        ((BufferedReader) (obj1)).close();
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_419;
        }
        obj = obj2;
        ((InputStreamReader) (obj4)).close();
        obj = obj2;
        if (!AppsFlyerLib.access$700())
        {
            break MISSING_BLOCK_LABEL_458;
        }
        obj = obj2;
        Log.i("AppsFlyer_1.5.3", (new StringBuilder()).append("Attribution data: ").append(stringbuilder.toString()).toString());
        obj = obj2;
        if (stringbuilder.length() <= 0 || context == null)
        {
            break MISSING_BLOCK_LABEL_640;
        }
        obj = obj2;
        obj1 = AppsFlyerLib.access$800(stringbuilder.toString());
        obj = obj2;
        s = (String)((Map) (obj1)).get("iscache");
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_516;
        }
        obj = obj2;
        if (!"true".equals(s))
        {
            break MISSING_BLOCK_LABEL_601;
        }
        obj = obj2;
        obj4 = context.getSharedPreferences("appsflyer-data", 0).edit();
        obj = obj2;
        ((android.content.tAndGet) (obj4)).("attributionId", stringbuilder.toString());
        obj = obj2;
        ((android.content.) (obj4)).();
        obj = obj2;
        if (!AppsFlyerLib.access$700())
        {
            break MISSING_BLOCK_LABEL_601;
        }
        obj = obj2;
        Log.d("AppsFlyer_1.5.3", (new StringBuilder()).append("iscache=").append(s).append(" caching conversion data").toString());
        obj = obj2;
        if (AppsFlyerLib.access$900() == null)
        {
            break MISSING_BLOCK_LABEL_640;
        }
        obj = obj2;
        i = currentRequestsCounter.intValue();
        if (i > 1)
        {
            break MISSING_BLOCK_LABEL_640;
        }
        obj = obj2;
        AppsFlyerLib.access$900().onConversionDataLoaded(AppsFlyerLib.getConversionData(context));
_L9:
        currentRequestsCounter.decrementAndGet();
        if (obj2 != null)
        {
            ((HttpURLConnection) (obj2)).disconnect();
            return;
        }
          goto _L1
        obj;
        obj = obj2;
        AppsFlyerLib.access$900().onConversionDataLoaded(((Map) (obj1)));
          goto _L9
        obj = obj2;
_L11:
        currentRequestsCounter.decrementAndGet();
        if (obj1 != null)
        {
            ((HttpURLConnection) (obj1)).disconnect();
        }
        throw obj;
_L5:
        obj = obj2;
        if (AppsFlyerLib.access$900() == null)
        {
            break MISSING_BLOCK_LABEL_733;
        }
        obj = obj2;
        AppsFlyerLib.access$900().onConversionFailure((new StringBuilder()).append("Error connection to server: ").append(((HttpURLConnection) (obj2)).getResponseCode()).toString());
        obj = obj2;
        if (!AppsFlyerLib.access$700()) goto _L9; else goto _L10
_L10:
        obj = obj2;
        Log.i("AppsFlyer_1.5.3", (new StringBuilder()).append("AttributionIdFetcher response code: ").append(((HttpURLConnection) (obj2)).getResponseCode()).append("  url: ").append(obj1).toString());
          goto _L9
        obj;
        obj1 = null;
          goto _L11
        obj2;
        obj1 = null;
          goto _L12
        obj1;
        obj4 = null;
          goto _L13
        obj1;
          goto _L13
    }


    public (Context context, String s)
    {
        ctxReference = null;
        ctxReference = new WeakReference(context);
        appsFlyerDevKey = s;
    }
}
