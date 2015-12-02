// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.appsflyer.cache.CacheManager;
import com.appsflyer.cache.RequestCacheData;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.appsflyer:
//            DebugLogQueue, Installation, AppsFlyerProperties, AttributionIDNotReady, 
//            ConversionDataListener, HashUtils

public class AppsFlyerLib extends BroadcastReceiver
{
    private static class AttributionIdFetcher
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
            Object obj1 = AppsFlyerLib.getCachedChannel(context, AppsFlyerLib.getConfiguredChannel(context));
            Object obj;
            obj = "";
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_102;
            }
            obj = (new StringBuilder()).append("-").append(((String) (obj1))).toString();
            Object obj2;
            obj1 = (new StringBuilder()).append("https://api.appsflyer.com/install_data/v3/").append(context.getPackageName()).append(((String) (obj))).append("?devkey=").append(appsFlyerDevKey).append("&device_id=").append(AppsFlyerLib.getAppsFlyerUID(context));
            if (AppsFlyerLib.shouldLog())
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
            if (AppsFlyerLib.conversionDataListener == null)
            {
                break MISSING_BLOCK_LABEL_368;
            }
            obj = obj1;
            AppsFlyerLib.conversionDataListener.onConversionFailure(((Throwable) (obj2)).getMessage());
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
            if (!AppsFlyerLib.shouldLog())
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
            obj1 = AppsFlyerLib.attributionStringToMap(stringbuilder.toString());
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
            ((android.content.SharedPreferences.Editor) (obj4)).putString("attributionId", stringbuilder.toString());
            obj = obj2;
            ((android.content.SharedPreferences.Editor) (obj4)).commit();
            obj = obj2;
            if (!AppsFlyerLib.shouldLog())
            {
                break MISSING_BLOCK_LABEL_601;
            }
            obj = obj2;
            Log.d("AppsFlyer_1.5.3", (new StringBuilder()).append("iscache=").append(s).append(" caching conversion data").toString());
            obj = obj2;
            if (AppsFlyerLib.conversionDataListener == null)
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
            AppsFlyerLib.conversionDataListener.onConversionDataLoaded(AppsFlyerLib.getConversionData(context));
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
            AppsFlyerLib.conversionDataListener.onConversionDataLoaded(((Map) (obj1)));
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
            if (AppsFlyerLib.conversionDataListener == null)
            {
                break MISSING_BLOCK_LABEL_733;
            }
            obj = obj2;
            AppsFlyerLib.conversionDataListener.onConversionFailure((new StringBuilder()).append("Error connection to server: ").append(((HttpURLConnection) (obj2)).getResponseCode()).toString());
            obj = obj2;
            if (!AppsFlyerLib.shouldLog()) goto _L9; else goto _L10
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


        public AttributionIdFetcher(Context context, String s)
        {
            ctxReference = null;
            ctxReference = new WeakReference(context);
            appsFlyerDevKey = s;
        }
    }

    private static class CachedRequestSender
        implements Runnable
    {

        private WeakReference ctxReference;

        public void run()
        {
            AppsFlyerLib.isDuringCheckCache = true;
            if (ctxReference == null)
            {
                return;
            }
            String s = AppsFlyerLib.getProperty("AppsFlyerKey");
            Object obj = ctxReference;
            obj;
            JVM INSTR monitorenter ;
            Iterator iterator = CacheManager.getInstance().getCachedRequests((Context)ctxReference.get()).iterator();
_L3:
            if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
            RequestCacheData requestcachedata;
            requestcachedata = (RequestCacheData)iterator.next();
            if (AppsFlyerLib.shouldLog())
            {
                Log.i("AppsFlyer_1.5.3", (new StringBuilder()).append("resending request: ").append(requestcachedata.getRequestURL()).toString());
            }
            AppsFlyerLib.sendRequestToServer((new StringBuilder()).append(requestcachedata.getRequestURL()).append("&isCachedRequest=true").toString(), requestcachedata.getPostData(), s, ctxReference, requestcachedata.getCacheKey());
              goto _L3
            Exception exception1;
            exception1;
            Log.i("AppsFlyer_1.5.3", "Failed to resend cached request");
              goto _L3
            Exception exception;
            exception;
            obj;
            JVM INSTR monitorexit ;
            try
            {
                throw exception;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("AppsFlyer_1.5.3", "failed to check cache.");
            }
_L4:
            AppsFlyerLib.isDuringCheckCache = false;
            return;
_L2:
            obj;
            JVM INSTR monitorexit ;
              goto _L4
        }

        public CachedRequestSender(Context context)
        {
            ctxReference = null;
            ctxReference = new WeakReference(context);
        }
    }

    private static class DataCollector
        implements Runnable
    {

        private String appsFlyerKey;
        private Context context;
        private String eventName;
        private String eventValue;
        private String referrer;

        public void run()
        {
            AppsFlyerLib.sendTrackingWithEvent(context, appsFlyerKey, eventName, eventValue, referrer);
        }

        private DataCollector(Context context1, String s, String s1, String s2, String s3)
        {
            context = context1;
            appsFlyerKey = s;
            eventName = s1;
            eventValue = s2;
            referrer = s3;
        }

    }

    private static class SendToServerRunnable
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
            ((Map) (obj2)).put("counter", Integer.toString(AppsFlyerLib.getCounter(((Context) (obj)), flag)));
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
                AppsFlyerLib.sendRequestToServer(urlString, ((String) (obj)), ((String) (obj1)), ctxReference, null);
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

        private SendToServerRunnable(String s, Map map, Context context)
        {
            ctxReference = null;
            urlString = s;
            params = map;
            ctxReference = new WeakReference(context);
        }

    }


    static final String AF_COUNTER_PREF = "appsFlyerCount";
    protected static final String AF_SHARED_PREF = "appsflyer-data";
    public static final String APPS_TRACKING_URL = "https://track.appsflyer.com/api/v2.3/androidevent?buildnumber=1.5.3&app_id=";
    public static final String ATTRIBUTION_ID_COLUMN_NAME = "aid";
    public static final Uri ATTRIBUTION_ID_CONTENT_URI = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
    static final String ATTRIBUTION_ID_PREF = "attributionId";
    private static final String CACHED_CHANNEL_PREF = "CACHED_CHANNEL";
    private static final String CACHED_URL_PARAMTER = "&isCachedRequest=true";
    private static final String CALL_SERVER_ACTION = "call server.";
    private static final String ERROR_PREFIX = "ERROR:";
    static final String FIRST_INSTALL_PREF = "appsFlyerFirstInstall";
    private static final String INSTALL_UPDATE_DATE_FORMAT = "yyyy-MM-dd_hhmmZ";
    public static final String LOG_TAG = "AppsFlyer_1.5.3";
    private static final String ON_RECIEVE_CALLED = "onRecieve called. refferer=";
    private static final String PREPARE_DATA_ACTION = "collect data for server";
    protected static final String REFERRER_PREF = "referrer";
    public static final String SDK_BUILD_NUMBER = "1.5.3";
    static final String SENT_SUCCESSFULLY_PREF = "sentSuccessfully";
    public static final String SERVER_BUILD_NUMBER = "2.3";
    private static final String SERVER_RESPONDED_ACTION = "response from server. status=";
    private static final String WARNING_PREFIX = "WARNING:";
    private static ConversionDataListener conversionDataListener = null;
    private static boolean isDuringCheckCache = false;

    public AppsFlyerLib()
    {
    }

    private static void addAdvertiserIDData(Context context, Map map)
    {
        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
        Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
        info = AdvertisingIdClient.getAdvertisingIdInfo(context);
        map.put("advertiserId", info.getId());
        boolean flag;
        if (!info.isLimitAdTrackingEnabled())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        map.put("advertiserIdEnabled", Boolean.toString(flag));
_L1:
        return;
        context;
        if (shouldLog())
        {
            Log.i("AppsFlyer_1.5.3", "WARNING:Google Play services SDK is missing.");
            return;
        }
          goto _L1
        map;
        if (map.getLocalizedMessage() != null)
        {
            Log.i("AppsFlyer_1.5.3", map.getLocalizedMessage());
        } else
        {
            Log.i("AppsFlyer_1.5.3", map.toString());
        }
        debugAction("Could not fetch advertiser id: ", map.getLocalizedMessage(), context);
        return;
    }

    private static Map attributionStringToMap(String s)
    {
        HashMap hashmap = new HashMap();
        try
        {
            s = new JSONObject(s);
            String s1;
            for (Iterator iterator = s.keys(); iterator.hasNext(); hashmap.put(s1, s.getString(s1)))
            {
                s1 = (String)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("AppsFlyer_1.5.3", s);
            return null;
        }
        return hashmap;
    }

    private static void callServer(URL url, String s, String s1, WeakReference weakreference, String s2)
        throws IOException
    {
        Context context = (Context)weakreference.get();
        HttpURLConnection httpurlconnection = (HttpURLConnection)url.openConnection();
        httpurlconnection.setRequestMethod("POST");
        int i = s.getBytes().length;
        httpurlconnection.setRequestProperty("Content-Length", (new StringBuilder()).append(i).append("").toString());
        httpurlconnection.setRequestProperty("Connection", "close");
        httpurlconnection.setConnectTimeout(10000);
        httpurlconnection.setDoOutput(true);
        OutputStreamWriter outputstreamwriter = new OutputStreamWriter(httpurlconnection.getOutputStream());
        outputstreamwriter.write(s);
        if (outputstreamwriter == null)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        outputstreamwriter.close();
        int j;
        j = httpurlconnection.getResponseCode();
        if (shouldLog())
        {
            Log.i("AppsFlyer_1.5.3", (new StringBuilder()).append("response code: ").append(j).toString());
        }
        debugAction("response from server. status=", Integer.toString(j), context);
        url = context.getSharedPreferences("appsflyer-data", 0);
        if (j != 200)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        CacheManager.getInstance().deleteRequest(s2, context);
        if (weakreference.get() == null || s2 != null)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        s = url.edit();
        s.putString("sentSuccessfully", "true");
        s.commit();
        checkCache(context);
        if (url.getString("attributionId", null) != null || s1 == null) goto _L2; else goto _L1
_L1:
        Executors.newScheduledThreadPool(1).schedule(new AttributionIdFetcher(context.getApplicationContext(), s1), 10L, TimeUnit.MILLISECONDS);
_L4:
        if (httpurlconnection != null)
        {
            httpurlconnection.disconnect();
        }
        return;
        url;
        s = null;
_L6:
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_311;
        }
        s.close();
        throw url;
        url;
        s = httpurlconnection;
_L5:
        if (s != null)
        {
            s.disconnect();
        }
        throw url;
_L2:
        if (s1 != null) goto _L4; else goto _L3
_L3:
        Log.w("AppsFlyer_1.5.3", "AppsFlyer dev key is missing.");
          goto _L4
        url;
        s = null;
          goto _L5
        url;
        s = outputstreamwriter;
          goto _L6
    }

    private static void checkCache(Context context)
    {
    }

    private static void debugAction(String s, String s1, Context context)
    {
        if (context != null && "com.appsflyer".equals(context.getPackageName()))
        {
            DebugLogQueue.getInstance().push((new StringBuilder()).append(s).append(s1).toString());
        }
    }

    public static String getAppId()
    {
        return getProperty("appid");
    }

    public static String getAppUserId()
    {
        return getProperty("AppUserId");
    }

    public static String getAppsFlyerUID(Context context)
    {
        return Installation.id(context);
    }

    public static String getAttributionId(ContentResolver contentresolver)
    {
        contentresolver = contentresolver.query(ATTRIBUTION_ID_CONTENT_URI, new String[] {
            "aid"
        }, null, null, null);
        if (contentresolver == null || !contentresolver.moveToFirst())
        {
            return null;
        }
        String s = contentresolver.getString(contentresolver.getColumnIndex("aid"));
        try
        {
            contentresolver.close();
        }
        // Misplaced declaration of an exception variable
        catch (ContentResolver contentresolver)
        {
            return s;
        }
        return s;
        Object obj;
        obj;
        Log.w("AppsFlyer_1.5.3", ((Throwable) (obj)));
        try
        {
            contentresolver.close();
        }
        // Misplaced declaration of an exception variable
        catch (ContentResolver contentresolver)
        {
            return null;
        }
        return null;
        obj;
        try
        {
            contentresolver.close();
        }
        // Misplaced declaration of an exception variable
        catch (ContentResolver contentresolver) { }
        throw obj;
    }

    private static String getCachedChannel(Context context, String s)
        throws android.content.pm.PackageManager.NameNotFoundException
    {
        context = context.getSharedPreferences("appsflyer-data", 0);
        if (context.contains("CACHED_CHANNEL"))
        {
            return context.getString("CACHED_CHANNEL", null);
        } else
        {
            context = context.edit();
            context.putString("CACHED_CHANNEL", s);
            context.commit();
            return s;
        }
    }

    private static String getConfiguredChannel(Context context)
    {
        String s;
        Object obj;
        s = AppsFlyerProperties.getInstance().get("channel");
        obj = s;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        try
        {
            context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("AppsFlyer_1.5.3", "Could not load CHANNEL value", context);
            return s;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        context = ((Context) (context.get("CHANNEL")));
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        if (context instanceof String)
        {
            context = (String)context;
            break MISSING_BLOCK_LABEL_88;
        }
        context = context.toString();
        break MISSING_BLOCK_LABEL_88;
        context = s;
        obj = context;
        return ((String) (obj));
    }

    public static Map getConversionData(Context context)
        throws AttributionIDNotReady
    {
        SharedPreferences sharedpreferences = context.getSharedPreferences("appsflyer-data", 0);
        context = AppsFlyerProperties.getInstance().getReferrer(context);
        if (context != null && context.length() > 0 && context.contains("af_tranid"))
        {
            return referrerStringToMap(context);
        }
        context = sharedpreferences.getString("attributionId", null);
        if (context != null && context.length() > 0)
        {
            return attributionStringToMap(context);
        } else
        {
            throw new AttributionIDNotReady();
        }
    }

    public static void getConversionData(Context context, ConversionDataListener conversiondatalistener)
    {
        if (conversiondatalistener == null)
        {
            return;
        }
        try
        {
            conversiondatalistener.onConversionDataLoaded(getConversionData(context));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            conversionDataListener = conversiondatalistener;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("AppsFlyer_1.5.3", "error in onConversionDataLoaded", context);
        }
    }

    private static int getCounter(Context context, boolean flag)
    {
        int i;
label0:
        {
            context = context.getSharedPreferences("appsflyer-data", 0);
            int j = context.getInt("appsFlyerCount", 0);
            if (!flag)
            {
                i = j;
                if (j != 0)
                {
                    break label0;
                }
            }
            i = j + 1;
            context = context.edit();
            context.putInt("appsFlyerCount", i);
            context.commit();
        }
        return i;
    }

    private static String getFirstInstallDate(SimpleDateFormat simpledateformat, Context context)
    {
        SharedPreferences sharedpreferences = context.getSharedPreferences("appsflyer-data", 0);
        String s = sharedpreferences.getString("appsFlyerFirstInstall", null);
        Object obj = s;
        if (s == null)
        {
            if (getCounter(context, false) < 2)
            {
                if (shouldLog())
                {
                    Log.d("AppsFlyer_1.5.3", "AppsFlyer: first launch detected");
                }
                simpledateformat = simpledateformat.format(new Date());
            } else
            {
                simpledateformat = "";
            }
            context = sharedpreferences.edit();
            context.putString("appsFlyerFirstInstall", simpledateformat);
            context.commit();
            obj = simpledateformat;
        }
        if (shouldLog())
        {
            Log.i("AppsFlyer_1.5.3", (new StringBuilder()).append("AppsFlyer: first launch date: ").append(((String) (obj))).toString());
        }
        return ((String) (obj));
    }

    private static String getNetwork(Context context)
    {
        context = (ConnectivityManager)context.getSystemService("connectivity");
        if (context.getNetworkInfo(1).isConnectedOrConnecting())
        {
            return "WIFI";
        }
        if (context.getNetworkInfo(0).isConnectedOrConnecting())
        {
            return "MOBILE";
        } else
        {
            return "unkown";
        }
    }

    public static String getProperty(String s)
    {
        return AppsFlyerProperties.getInstance().get(s);
    }

    public static boolean isPreInstalledApp(Context context)
    {
        boolean flag = false;
        int i;
        try
        {
            i = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("AppsFlyer_1.5.3", "Could not check if app is pre installed", context);
            return false;
        }
        if ((i & 1) != 0)
        {
            flag = true;
        }
        return flag;
    }

    private static Map referrerStringToMap(String s)
    {
        HashMap hashmap = new HashMap();
        int i = s.indexOf('&');
        if (i >= 0 && s.length() > i + 1)
        {
            String as[] = s.split("\\&");
            int k = as.length;
            int j = 0;
            while (j < k) 
            {
                s = as[j].split("=");
                Object obj = s[0];
                if (s.length > 1)
                {
                    s = s[1];
                } else
                {
                    s = "";
                }
                hashmap.put(obj, s);
                j++;
            }
        }
        return hashmap;
    }

    private static void runInBackground(Context context, String s, String s1, String s2, String s3)
    {
        Executors.newScheduledThreadPool(1).schedule(new DataCollector(context, s, s1, s2, s3), 5L, TimeUnit.MILLISECONDS);
    }

    private static void sendRequestToServer(String s, String s1, String s2, WeakReference weakreference, String s3)
        throws IOException
    {
        URL url = new URL(s);
        if (shouldLog())
        {
            Log.i("AppsFlyer_1.5.3", (new StringBuilder()).append("url: ").append(url.toString()).toString());
        }
        debugAction("call server.", (new StringBuilder()).append("\n").append(url.toString()).append("\nPOST:").append(s1).toString(), (Context)weakreference.get());
        if (!shouldLog());
        try
        {
            callServer(url, s1, s2, weakreference, s3);
            return;
        }
        catch (IOException ioexception)
        {
            if (AppsFlyerProperties.getInstance().getBoolean("useHttpFallback", true))
            {
                debugAction((new StringBuilder()).append("https failed: ").append(ioexception.getLocalizedMessage()).toString(), "", (Context)weakreference.get());
                callServer(new URL(s.replace("https:", "http:")), s1, s2, weakreference, s3);
                return;
            } else
            {
                Log.i("AppsFlyer_1.5.3", (new StringBuilder()).append("failed to send requeset to server. ").append(ioexception.getLocalizedMessage()).toString());
                return;
            }
        }
    }

    public static void sendTracking(Context context)
    {
        sendTracking(context, null);
        AppsFlyerProperties.getInstance().setLaunchCalled();
    }

    public static void sendTracking(Context context, String s)
    {
        sendTrackingWithEvent(context, s, null, null);
    }

    public static void sendTrackingWithEvent(Context context, String s, String s1)
    {
        sendTrackingWithEvent(context, null, s, s1);
    }

    public static void sendTrackingWithEvent(Context context, String s, String s1, String s2)
    {
        String s4 = AppsFlyerProperties.getInstance().getReferrer(context);
        String s3 = s4;
        if (s4 == null)
        {
            s3 = "";
        }
        runInBackground(context, s, s1, s2, s3);
    }

    private static void sendTrackingWithEvent(Context context, String s, String s1, String s2, String s3)
    {
        if (shouldLog())
        {
            Log.i("AppsFlyer_1.5.3", (new StringBuilder()).append("Start tracking package: ").append(context.getPackageName()).toString());
            debugAction("collect data for server", "", context);
            Log.i("AppsFlyer_1.5.3", "******* sendTrackingWithEvent: ");
            debugAction("********* sendTrackingWithEvent: ", s1, context);
        }
        Object obj;
        StringBuilder stringbuilder;
        HashMap hashmap;
        String s4;
        boolean flag;
        try
        {
            List list = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
            if (!list.contains("android.permission.INTERNET"))
            {
                Log.w("AppsFlyer_1.5.3", "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
            }
            if (!list.contains("android.permission.ACCESS_NETWORK_STATE"))
            {
                Log.w("AppsFlyer_1.5.3", "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
            }
            if (!list.contains("android.permission.ACCESS_WIFI_STATE"))
            {
                Log.w("AppsFlyer_1.5.3", "Permission android.permission.ACCESS_WIFI_STATE is missing in the AndroidManifest.xml");
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        stringbuilder = new StringBuilder();
        stringbuilder.append("https://track.appsflyer.com/api/v2.3/androidevent?buildnumber=1.5.3&app_id=").append(context.getPackageName());
        hashmap = new HashMap();
        hashmap.put("brand", Build.BRAND);
        hashmap.put("device", Build.DEVICE);
        hashmap.put("product", Build.PRODUCT);
        hashmap.put("sdk", Integer.toString(android.os.Build.VERSION.SDK_INT));
        hashmap.put("model", Build.MODEL);
        hashmap.put("deviceType", Build.TYPE);
        obj = getConfiguredChannel(context);
        s4 = getCachedChannel(context, ((String) (obj)));
        if (s4 == null)
        {
            break MISSING_BLOCK_LABEL_301;
        }
        hashmap.put("channel", s4);
        if (s4 == null) goto _L2; else goto _L1
_L1:
        if (!s4.equals(obj)) goto _L3; else goto _L2
_L3:
        hashmap.put("af_latestchannel", obj);
_L10:
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_346;
        }
        obj = s;
        if (s.length() != 0)
        {
            break MISSING_BLOCK_LABEL_354;
        }
        obj = getProperty("AppsFlyerKey");
        if (obj == null) goto _L5; else goto _L4
_L4:
        if (((String) (obj)).length() <= 0) goto _L5; else goto _L6
_L6:
        hashmap.put("appsflyerKey", obj);
        if (((String) (obj)).length() > 8)
        {
            hashmap.put("dkh", ((String) (obj)).substring(0, 8));
        }
        s = getAppUserId();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_429;
        }
        hashmap.put("appUserId", s);
        if (s1 == null || s2 == null)
        {
            break MISSING_BLOCK_LABEL_461;
        }
        hashmap.put("eventName", s1);
        hashmap.put("eventValue", s2);
        if (getProperty("appid") != null)
        {
            hashmap.put("appid", getProperty("appid"));
        }
        s = getProperty("currencyCode");
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_550;
        }
        if (s.length() != 3)
        {
            Log.w("AppsFlyer_1.5.3", (new StringBuilder()).append("WARNING:currency code should be 3 characters!!! '").append(s).append("' is not a legal value.").toString());
        }
        hashmap.put("currency", s);
        s = getProperty("IS_UPDATE");
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_573;
        }
        hashmap.put("isUpdate", s);
        hashmap.put("af_preinstalled", Boolean.toString(isPreInstalledApp(context)));
        s = getAttributionId(context.getContentResolver());
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_615;
        }
        hashmap.put("fb", s);
        if (AppsFlyerProperties.getInstance().getBoolean("deviceTrackingDisabled", false))
        {
            hashmap.put("deviceTrackingDisabled", "true");
        }
        flag = AppsFlyerProperties.getInstance().getBoolean("collectIMEI", true);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_712;
        }
        s = (TelephonyManager)context.getSystemService("phone");
        s = (String)s.getClass().getMethod("getDeviceId", new Class[0]).invoke(s, new Object[0]);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_712;
        }
        hashmap.put("imei", s);
_L7:
        flag = AppsFlyerProperties.getInstance().getBoolean("collectAndroidId", true);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_756;
        }
        s = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_756;
        }
        try
        {
            hashmap.put("android_id", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        s = Installation.id(context);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_777;
        }
        hashmap.put("uid", s);
_L8:
        int i;
        long l;
        long l1;
        boolean flag1;
        try
        {
            hashmap.put("lang", Locale.getDefault().getDisplayLanguage());
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            s = (TelephonyManager)context.getSystemService("phone");
            hashmap.put("operator", s.getSimOperatorName());
            hashmap.put("carrier", s.getNetworkOperatorName());
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        hashmap.put("network", getNetwork(context));
_L9:
        flag1 = AppsFlyerProperties.getInstance().getBoolean("collectMAC", true);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_900;
        }
        s = ((WifiManager)context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_900;
        }
        try
        {
            hashmap.put("mac", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        addAdvertiserIDData(context, hashmap);
        s = new SimpleDateFormat("yyyy-MM-dd_hhmmZ");
        i = android.os.Build.VERSION.SDK_INT;
        if (i < 9)
        {
            break MISSING_BLOCK_LABEL_965;
        }
        try
        {
            hashmap.put("installDate", s.format(new Date(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime)));
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        try
        {
            s1 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            hashmap.put("app_version_code", Integer.toString(((PackageInfo) (s1)).versionCode));
            hashmap.put("app_version_name", ((PackageInfo) (s1)).versionName);
            l = ((PackageInfo) (s1)).firstInstallTime;
            l1 = ((PackageInfo) (s1)).lastUpdateTime;
            hashmap.put("date1", s.format(new Date(l)));
            hashmap.put("date2", s.format(new Date(l1)));
            hashmap.put("firstLaunchDate", getFirstInstallDate(s, context));
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        if (s3.length() > 0)
        {
            hashmap.put("referrer", s3);
        }
        s = context.getSharedPreferences("appsflyer-data", 0).getString("attributionId", null);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_1146;
        }
        if (s.length() > 0)
        {
            hashmap.put("installAttribution", s);
        }
        Executors.newScheduledThreadPool(1).schedule(new SendToServerRunnable(stringbuilder.toString(), hashmap, context.getApplicationContext()), 100L, TimeUnit.MILLISECONDS);
        return;
_L5:
        try
        {
            Log.e("AppsFlyer_1.5.3", "AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.setAppsFlyerKey(...) to set it. ");
            Log.e("AppsFlyer_1.5.3", "AppsFlyer will not track this event.");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("AppsFlyer_1.5.3", "", context);
        }
        return;
        s;
        Log.w("AppsFlyer_1.5.3", "WARNING:READ_PHONE_STATE is missing");
          goto _L7
        s;
        Log.i("AppsFlyer_1.5.3", (new StringBuilder()).append("ERROR:").append("ERROR:").append("could not get uid ").append(s.getMessage()).toString());
          goto _L8
        s;
        Log.i("AppsFlyer_1.5.3", (new StringBuilder()).append("checking network error ").append(s.getMessage()).toString());
          goto _L9
_L2:
        if (s4 != null || obj == null) goto _L10; else goto _L3
    }

    public static void setAppId(String s)
    {
        setProperty("appid", s);
    }

    public static void setAppUserId(String s)
    {
        setProperty("AppUserId", s);
    }

    public static void setAppsFlyerKey(String s)
    {
        setProperty("AppsFlyerKey", s);
    }

    public static void setCollectAndroidID(boolean flag)
    {
        setProperty("collectAndroidId", Boolean.toString(flag));
    }

    public static void setCollectIMEI(boolean flag)
    {
        setProperty("collectIMEI", Boolean.toString(flag));
    }

    public static void setCollectMACAddress(boolean flag)
    {
        setProperty("collectMAC", Boolean.toString(flag));
    }

    public static void setCurrencyCode(String s)
    {
        AppsFlyerProperties.getInstance().set("currencyCode", s);
    }

    public static void setDeviceTrackingDisabled(boolean flag)
    {
        AppsFlyerProperties.getInstance().set("deviceTrackingDisabled", flag);
    }

    public static void setIsUpdate(boolean flag)
    {
        AppsFlyerProperties.getInstance().set("IS_UPDATE", flag);
    }

    public static void setProperty(String s, String s1)
    {
        AppsFlyerProperties.getInstance().set(s, s1);
    }

    public static void setUseHTTPFalback(boolean flag)
    {
        setProperty("useHttpFallback", Boolean.toString(flag));
    }

    private static boolean shouldLog()
    {
        return !AppsFlyerProperties.getInstance().isDisableLog();
    }

    public void onReceive(Context context, Intent intent)
    {
        if (shouldLog())
        {
            Log.i("AppsFlyer_1.5.3", "****** onReceive called *******");
        }
        debugAction("******* onReceive: ", "", context);
        AppsFlyerProperties.getInstance().setOnReceiveCalled();
        intent = intent.getStringExtra("referrer");
        if (shouldLog())
        {
            Log.i("AppsFlyer_1.5.3", (new StringBuilder()).append("Play store referrer: ").append(intent).toString());
        }
        if (intent != null)
        {
            debugAction("BroadcastReceiver got referrer: ", intent, context);
            debugAction("onRecieve called. refferer=", intent, context);
            android.content.SharedPreferences.Editor editor = context.getSharedPreferences("appsflyer-data", 0).edit();
            editor.putString("referrer", intent);
            editor.commit();
            AppsFlyerProperties.getInstance().setReferrer(intent);
            if (AppsFlyerProperties.getInstance().isLaunchCalled())
            {
                sendTrackingWithEvent(context, null, null, null, intent);
            }
        }
    }



/*
    static boolean access$1002(boolean flag)
    {
        isDuringCheckCache = flag;
        return flag;
    }

*/








}
