// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.microsoft.advertising.android.AdControl;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.skype.android.ads:
//            SkypeAdManager, SkypeAdEvents, SkypeAdTrackingManager, ConnectionManager

public class ConfigManager
{
    public static interface ConfigListener
    {

        public abstract void a(Exception exception);

        public abstract void a(JSONObject jsonobject);
    }


    private static Context a = null;
    private static String b = null;
    private static JSONObject c = null;
    private static JSONObject d = null;
    private static long e = 60000L;
    private static long f = 0L;
    private static boolean g = false;
    private static long h = 0L;
    private static long i = 0x36ee80L;
    private static boolean j = true;
    private static boolean k = false;
    private static String l = "0.0.0";
    private static String m = null;
    private static String n = null;
    private static long o = 0x48190800L;
    private static long p = 0x4d3f6400L;
    private static String q = "https://apps.skype.com/countrycode";
    private static String r = "";
    private static HashMap s = new HashMap();
    private static HashMap t = null;
    private static String u = "4.0";
    private static String v = "4.4";

    public ConfigManager()
    {
    }

    static long a(long l1)
    {
        h = l1;
        return l1;
    }

    public static String a(String s1, String s2)
    {
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorenter ;
        Object obj = null;
        Object obj1 = c;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        s1 = null;
_L14:
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorexit ;
        return s1;
_L2:
        Object obj2 = obj;
        obj1 = SkypeAdManager.d();
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        obj2 = obj;
        if (((SkypeAdManager) (obj1)).e() != null) goto _L5; else goto _L4
_L5:
        obj2 = obj;
        obj1 = ((SkypeAdManager) (obj1)).e().getSharedPreferences(((SkypeAdManager) (obj1)).f(), 0).getString("adUnitId", null);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_328;
        }
        obj2 = obj;
        if (((String) (obj1)).length() <= 4)
        {
            break MISSING_BLOCK_LABEL_328;
        }
        obj2 = obj;
        if (((String) (obj1)).indexOf("/") <= 0) goto _L7; else goto _L6
_L6:
        obj2 = obj;
        obj = ((String) (obj1)).split("/")[1];
          goto _L8
_L17:
        obj2 = obj;
        JSONArray jsonarray = c.getJSONArray("adUnitIdMap");
        int i1 = 0;
_L15:
        obj1 = obj;
        obj2 = obj;
        if (i1 >= jsonarray.length()) goto _L10; else goto _L9
_L9:
        obj2 = obj;
        obj1 = jsonarray.getJSONObject(i1);
        obj2 = obj;
        Object obj3 = ((JSONObject) (obj1)).getJSONObject("key");
        obj2 = obj;
        String s3 = ((JSONObject) (obj3)).getString("cntry");
        obj2 = obj;
        int j1 = ((JSONObject) (obj3)).getInt("width");
        obj2 = obj;
        int k1 = ((JSONObject) (obj3)).getInt("height");
        obj2 = obj;
        obj3 = ((JSONObject) (obj3)).getString("placement");
        obj2 = obj;
        if (!s3.equalsIgnoreCase(s1) || j1 != 320 || k1 != 50) goto _L12; else goto _L11
_L11:
        obj2 = obj;
        if (!((String) (obj3)).equalsIgnoreCase(s2)) goto _L12; else goto _L13
_L13:
        obj2 = obj;
        obj1 = ((JSONObject) (obj1)).getString("value");
_L10:
        s1 = ((String) (obj1));
          goto _L14
_L12:
        i1++;
          goto _L15
        s1;
        Log.e("SkypeAdConfigManager", (new StringBuilder("Unable to pull the adUnitMapId array ")).append(s1.getMessage()).toString());
        obj1 = obj2;
          goto _L10
        s1;
        throw s1;
_L4:
        obj = null;
_L8:
        if (obj == null) goto _L17; else goto _L16
_L16:
        s1 = ((String) (obj));
          goto _L14
_L7:
        obj = obj1;
          goto _L8
        obj = null;
          goto _L8
    }

    static String a(HttpEntity httpentity)
    {
        return b(httpentity);
    }

    static String a(HttpResponse httpresponse, String s1)
    {
        return b(httpresponse, s1);
    }

    public static Map a()
    {
        int i1 = 0;
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorenter ;
        if (t != null) goto _L2; else goto _L1
_L1:
        Object obj;
        SkypeAdManager skypeadmanager;
        int j1;
        int k1;
        skypeadmanager = SkypeAdManager.d();
        j1 = skypeadmanager.a;
        k1 = skypeadmanager.b;
        obj = skypeadmanager.e;
        t = new HashMap();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        t.put("clientversion", obj);
        if (!skypeadmanager.g()) goto _L4; else goto _L3
_L3:
        t.put("gend", "");
        t.put("byr", "");
_L13:
        if (n != null)
        {
            t.put("udid", n);
        }
        t.put("partnerid", skypeadmanager.f);
_L2:
        if (!t()) goto _L6; else goto _L5
_L5:
        t.put("userstatus", "1");
_L15:
        obj = t;
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorexit ;
        return ((Map) (obj));
_L4:
        if (k1 != 1) goto _L8; else goto _L7
_L7:
        t.put("gend", "m");
_L16:
        obj = String.valueOf(j1);
        if (!TextUtils.isEmpty(((CharSequence) (obj))) && ((String) (obj)).length() >= 6) goto _L10; else goto _L9
_L19:
        if (i1 < 13 || i1 > 100) goto _L12; else goto _L11
_L11:
        i1 = ((GregorianCalendar) (obj)).get(1);
        t.put("byr", String.valueOf(i1));
          goto _L13
_L18:
        (new StringBuilder("getTargetingParameters exception ")).append(obj);
        if (true) goto _L15; else goto _L14
_L14:
        JVM INSTR monitorexit ;
        throw obj;
_L8:
        if (k1 != 2)
        {
            break MISSING_BLOCK_LABEL_269;
        }
        t.put("gend", "f");
          goto _L16
        t.put("gend", "");
          goto _L16
_L10:
        obj = new GregorianCalendar(Integer.parseInt(((String) (obj)).substring(0, 4)), Integer.parseInt(((String) (obj)).substring(4, 6)), Integer.parseInt(((String) (obj)).substring(6)));
          goto _L17
_L20:
        try
        {
            Calendar calendar = Calendar.getInstance();
            i1 = ((GregorianCalendar) (obj)).get(1);
            i1 = calendar.get(1) - i1;
            break; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally
        {
            com/skype/android/ads/ConfigManager;
        }
          goto _L18
_L12:
        t.put("byr", "");
          goto _L13
_L6:
label0:
        {
            if (!u())
            {
                break label0;
            }
            t.put("userstatus", "2");
        }
          goto _L15
        t.put("userstatus", "");
          goto _L15
_L9:
        obj = null;
_L17:
        if (obj != null) goto _L20; else goto _L19
    }

    public static void a(Context context)
    {
        t = null;
        a = context;
        b(context);
    }

    public static void a(AdControl adcontrol)
    {
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorenter ;
        if (t == null) goto _L2; else goto _L1
_L1:
        String s1;
        String s2;
        for (Iterator iterator = t.keySet().iterator(); iterator.hasNext(); adcontrol.a(s1))
        {
            s1 = (String)iterator.next();
            s2 = (String)t.get(s1);
            if (!s2.isEmpty())
            {
                break MISSING_BLOCK_LABEL_86;
            }
        }

          goto _L2
        adcontrol;
        (new StringBuilder("setTargetingParameters exception ")).append(adcontrol);
_L2:
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorexit ;
        return;
        adcontrol.a(s1, s2);
          goto _L1
        adcontrol;
        throw adcontrol;
    }

    public static void a(ConfigListener configlistener)
    {
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorenter ;
        if (configlistener != null) goto _L2; else goto _L1
_L1:
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorexit ;
        return;
_L2:
        s.put(configlistener, null);
        if (true) goto _L1; else goto _L3
_L3:
        configlistener;
        throw configlistener;
    }

    public static void a(Exception exception)
    {
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorenter ;
        Iterator iterator = s.keySet().iterator();
_L3:
        ConfigListener configlistener;
        Handler handler;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_90;
        }
        configlistener = (ConfigListener)iterator.next();
        handler = (Handler)s.get(configlistener);
        if (handler == null || configlistener == null) goto _L2; else goto _L1
_L1:
        handler.post(new Runnable(configlistener, exception) {

            final ConfigListener a;
            final Exception b;

            public final void run()
            {
                a.a(b);
            }

            
            {
                a = configlistener;
                b = exception;
                super();
            }
        });
          goto _L3
        exception;
        throw exception;
_L2:
        if (configlistener == null) goto _L3; else goto _L4
_L4:
        configlistener.a(exception);
          goto _L3
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorexit ;
    }

    static void a(String s1, String s2, long l1)
    {
        a(s1, s2, l1, null);
    }

    private static void a(String s1, String s2, long l1, String s3)
    {
        try
        {
            s1 = SkypeAdEvents.a(null, s1, l1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            Log.e("SkypeAdConfigManager", (new StringBuilder("publish config event exception ")).append(s1.getMessage()).toString());
            return;
        }
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        s1.put("errorData", s3);
        SkypeAdTrackingManager.a().getClass();
        s1.put("adType", s2);
        SkypeAdEvents.a(null, s1);
        return;
    }

    static void a(HttpResponse httpresponse)
    {
        b(httpresponse);
    }

    private static void a(HttpRequestBase httprequestbase)
    {
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorenter ;
        String s1 = f("ad_config_last_modified");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        if (!s1.isEmpty())
        {
            httprequestbase.addHeader("If-Modified-Since", s1);
        }
        s1 = f("ad_config_etag");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        if (!s1.isEmpty())
        {
            httprequestbase.addHeader("If-None-Match", s1);
        }
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorexit ;
        return;
        httprequestbase;
        throw httprequestbase;
    }

    static boolean a(long l1, Exception exception)
    {
        return b(l1, exception);
    }

    public static boolean a(String s1)
    {
        boolean flag = SkypeAdManager.d().i();
        boolean flag1 = k;
        boolean flag2 = b(s1);
        return flag1 && flag2 && !flag;
    }

    static boolean a(String s1, long l1)
    {
        return a(s1, l1, false);
    }

    private static boolean a(String s1, long l1, boolean flag)
    {
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorenter ;
        String s2 = n;
        if (s2 != null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        byte abyte0[];
        Object obj;
        int j1;
        String s3 = ((TelephonyManager)a.getSystemService("phone")).getDeviceId();
        obj = MessageDigest.getInstance("SHA-1");
        ((MessageDigest) (obj)).update(s3.getBytes());
        abyte0 = ((MessageDigest) (obj)).digest();
        obj = new StringBuilder();
        j1 = abyte0.length;
        int i1 = 0;
_L2:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        ((StringBuilder) (obj)).append(String.format("%02x", new Object[] {
            Byte.valueOf(abyte0[i1])
        }));
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        boolean flag1;
        boolean flag2;
        boolean flag3;
        try
        {
            n = ((StringBuilder) (obj)).toString();
        }
        catch (Exception exception) { }
        finally
        {
            com/skype/android/ads/ConfigManager;
        }
        flag2 = false;
        c = new JSONObject(s1);
        v();
        w();
        flag1 = flag2;
        if (c == null) goto _L4; else goto _L3
_L3:
        flag3 = c.getJSONObject("cntryDefaultLangMapping").has(r);
        flag1 = flag3;
        if (flag3)
        {
            break MISSING_BLOCK_LABEL_246;
        }
        flag3 = c.getJSONObject("cntryDefaultLangMapping").has(r.toUpperCase());
        r = r.toUpperCase();
        flag1 = flag3;
        if (flag3)
        {
            break MISSING_BLOCK_LABEL_246;
        }
        flag1 = c.getJSONObject("cntryDefaultLangMapping").has(r.toLowerCase());
        r = r.toLowerCase();
        if (!flag1) goto _L6; else goto _L5
_L5:
        s1 = c.getJSONObject("cntryDefaultLangMapping").getJSONObject(r);
        d = s1;
        if (s1.has("configDownloadIntervalInSec"))
        {
            i = d.getInt("configDownloadIntervalInSec") * 1000;
        }
        if (d.has("trackingEnabled"))
        {
            j = d.getBoolean("trackingEnabled");
        }
        if (d.has("adsEnabled"))
        {
            k = d.getBoolean("adsEnabled");
        }
        if (c.has("version"))
        {
            l = c.getString("version");
        }
        if (c.has("trackingUrl"))
        {
            m = c.getString("trackingUrl");
        }
_L7:
        (new StringBuilder("Country config: ")).append(d.toString());
        flag1 = true;
_L4:
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorexit ;
        return flag1;
_L6:
        (new StringBuilder(" Ads are not enabled in ")).append(r);
        d = new JSONObject();
        k = false;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_534;
        }
        a("XCONFIGLOAD", "noconfig", System.currentTimeMillis() - l1, (new StringBuilder("There is no config section for country ")).append(r).toString());
          goto _L7
        s1;
        Log.e("SkypeAdConfigManager", (new StringBuilder("loading config file error: ")).append(s1.getMessage()).toString());
        flag1 = flag2;
        if (true) goto _L4; else goto _L8
_L8:
        JVM INSTR monitorexit ;
        throw s1;
        a("CONFIGLOAD", "noconfig", System.currentTimeMillis() - l1, null);
          goto _L7
    }

    static boolean a(byte abyte0[], String s1, String s2)
    {
        return b(abyte0, s1, s2);
    }

    private static String b(HttpEntity httpentity)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        obj5 = null;
        obj4 = null;
        obj6 = null;
        obj2 = null;
        obj3 = null;
        obj = obj6;
        obj1 = obj5;
        GZIPInputStream gzipinputstream = new GZIPInputStream(new ByteArrayInputStream(EntityUtils.toByteArray(httpentity)));
        obj = obj6;
        obj1 = obj5;
        httpentity = new StringWriter();
        int i1;
        try
        {
            obj = new InputStreamReader(gzipinputstream, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj = obj2;
            obj1 = httpentity;
            httpentity = exception;
            continue; /* Loop/switch isn't completed */
        }
        obj1 = new char[1024];
        i1 = ((Reader) (obj)).read(((char []) (obj1)), 0, 1024);
_L1:
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        httpentity.write(((char []) (obj1)), 0, i1);
        i1 = ((Reader) (obj)).read(((char []) (obj1)), 0, 1024);
          goto _L1
        obj1 = httpentity.toString();
        try
        {
            ((Reader) (obj)).close();
            httpentity.close();
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntity httpentity)
        {
            Log.e("SkypeAdConfigManager", (new StringBuilder("getContentFromCompressedStream close exception ")).append(httpentity).toString());
        }
        return ((String) (obj1));
        obj2;
        httpentity = obj4;
_L5:
        obj = obj3;
        obj1 = httpentity;
        Log.e("SkypeAdConfigManager", (new StringBuilder("getContentFromCompressedStream exception ")).append(obj2).toString());
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        ((Reader) (obj3)).close();
        if (httpentity != null)
        {
            try
            {
                httpentity.close();
            }
            // Misplaced declaration of an exception variable
            catch (HttpEntity httpentity)
            {
                Log.e("SkypeAdConfigManager", (new StringBuilder("getContentFromCompressedStream close exception ")).append(httpentity).toString());
            }
        }
        return null;
        httpentity;
_L3:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        ((Reader) (obj)).close();
        if (obj1 != null)
        {
            try
            {
                ((StringWriter) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("SkypeAdConfigManager", (new StringBuilder("getContentFromCompressedStream close exception ")).append(obj).toString());
            }
        }
        throw httpentity;
        obj2;
        obj1 = httpentity;
        httpentity = ((HttpEntity) (obj2));
        if (true) goto _L3; else goto _L2
_L2:
        break MISSING_BLOCK_LABEL_67;
        obj2;
        exception = ((Exception) (obj));
        if (true) goto _L5; else goto _L4
_L4:
    }

    private static String b(HttpResponse httpresponse, String s1)
    {
        try
        {
            if (httpresponse.containsHeader(s1))
            {
                httpresponse = httpresponse.getHeaders(s1);
                if (httpresponse.length == 1)
                {
                    return httpresponse[0].getValue();
                } else
                {
                    throw new Exception((new StringBuilder("Header, ")).append(s1).append(", has more than one value").toString());
                }
            }
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            (new StringBuilder("Error getting the header value ")).append(httpresponse.getMessage());
        }
        return null;
    }

    public static JSONObject b(Context context)
    {
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorenter ;
        long l1 = System.currentTimeMillis();
        if (d == null || l1 - h >= i) goto _L2; else goto _L1
_L1:
        context = d;
_L5:
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorexit ;
        return context;
_L2:
        if (ConnectionManager.a(context)) goto _L4; else goto _L3
_L3:
        a(new Exception("download config when it is offline!"));
_L6:
        context = d;
          goto _L5
_L4:
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorenter ;
        if (System.currentTimeMillis() - f >= e)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorexit ;
          goto _L6
        context;
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorexit ;
        throw context;
        context;
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorexit ;
        throw context;
        f = System.currentTimeMillis();
        g = true;
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorexit ;
        TelephonyManager telephonymanager;
        telephonymanager = (TelephonyManager)context.getSystemService("phone");
        context = telephonymanager.getNetworkCountryIso();
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        if (!context.isEmpty() && 2 == context.length())
        {
            break MISSING_BLOCK_LABEL_149;
        }
        context = telephonymanager.getSimCountryIso();
        context = context.toUpperCase();
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        if (!context.isEmpty() && context.length() == 2)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        ConnectionManager.a(new HttpGet(q), new ConnectionManager.HTTPResponseListener() {

            public final void a(HttpRequestBase httprequestbase, Exception exception)
            {
                Log.e("SkypeAdConfigManager", (new StringBuilder("Get country code exception ")).append(exception.getMessage()).toString());
                ConfigManager.b(exception);
            }

            public final void a(HttpRequestBase httprequestbase, HttpResponse httpresponse)
            {
                httprequestbase = httpresponse.getEntity();
                if (httprequestbase == null)
                {
                    break MISSING_BLOCK_LABEL_58;
                }
                ConfigManager.d((new JSONObject(EntityUtils.toString(httprequestbase, "UTF-8"))).getString("country_code"));
                (new StringBuilder("AkamaiCountryCode: ")).append(ConfigManager.r());
                ConfigManager.e(ConfigManager.r());
                ConfigManager.f();
                return;
                httprequestbase;
                Log.e("SkypeAdConfigManager", (new StringBuilder("Read country code response exception ")).append(httprequestbase.getMessage()).toString());
                ConfigManager.b(httprequestbase);
                return;
            }

        });
          goto _L6
        r = context;
        f();
          goto _L6
    }

    public static void b()
    {
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorenter ;
        Iterator iterator = s.keySet().iterator();
_L3:
        ConfigListener configlistener;
        Handler handler;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_91;
        }
        configlistener = (ConfigListener)iterator.next();
        handler = (Handler)s.get(configlistener);
        if (handler == null || configlistener == null) goto _L2; else goto _L1
_L1:
        handler.post(new Runnable(configlistener) {

            final ConfigListener a;

            public final void run()
            {
                a.a(ConfigManager.p());
            }

            
            {
                a = configlistener;
                super();
            }
        });
          goto _L3
        Exception exception;
        exception;
        throw exception;
_L2:
        if (configlistener == null) goto _L3; else goto _L4
_L4:
        configlistener.a(d);
          goto _L3
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorexit ;
    }

    static void b(Exception exception)
    {
        c(exception);
    }

    private static void b(String s1, String s2)
    {
        try
        {
            android.content.SharedPreferences.Editor editor = SkypeAdManager.d().e().getSharedPreferences("AdConfigPrefData", 0).edit();
            editor.putString(s1, s2);
            editor.commit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            Log.e("SkypeAdConfigManager", (new StringBuilder("set user value error: ")).append(s1.getMessage()).toString());
        }
    }

    private static void b(HttpResponse httpresponse)
    {
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorenter ;
        if (httpresponse == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        String s1 = b(httpresponse, "Last-Modified");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        b("ad_config_last_modified", s1);
        httpresponse = b(httpresponse, "Etag");
        if (httpresponse == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        b("ad_config_etag", ((String) (httpresponse)));
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorexit ;
        return;
        httpresponse;
        throw httpresponse;
    }

    private static boolean b(long l1, Exception exception)
    {
        boolean flag = true;
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorenter ;
        if (c == null) goto _L2; else goto _L1
_L1:
        if (exception == null) goto _L4; else goto _L3
_L3:
        a("XCONFIGLOAD", "file", System.currentTimeMillis() - l1, exception.getMessage());
_L5:
        h = System.currentTimeMillis();
_L13:
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorexit ;
        return flag;
_L4:
        a("CONFIGLOAD", "file", System.currentTimeMillis() - l1, null);
          goto _L5
        exception;
        throw exception;
_L2:
        Object obj;
        Object obj1;
        boolean flag1;
        flag1 = false;
        obj = null;
        obj1 = null;
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(a.openFileInput("ad_config.json")));
        obj = new StringBuilder();
_L8:
        String s1 = bufferedreader.readLine();
        if (s1 == null) goto _L7; else goto _L6
_L6:
        ((StringBuilder) (obj)).append(s1);
          goto _L8
        Exception exception1;
        exception1;
_L18:
        obj = bufferedreader;
        Log.e("SkypeAdConfigManager", (new StringBuilder("loading persisted config file error: ")).append(exception1.getMessage()).toString());
        flag = flag1;
        if (bufferedreader == null)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        bufferedreader.close();
        flag = flag1;
_L14:
        if (!flag) goto _L10; else goto _L9
_L9:
        if (exception == null) goto _L12; else goto _L11
_L11:
        a("XCONFIGLOAD", "file", System.currentTimeMillis() - l1, exception.getMessage());
_L16:
        h = System.currentTimeMillis();
        b();
          goto _L13
_L7:
        flag = a(((StringBuilder) (obj)).toString(), l1, true);
        bufferedreader.close();
          goto _L14
        obj;
        Log.e("SkypeAdConfigManager", (new StringBuilder("close persisted config file reader error: ")).append(((Exception) (obj)).getMessage()).toString());
          goto _L14
        obj;
        Log.e("SkypeAdConfigManager", (new StringBuilder("close persisted config file reader error: ")).append(((Exception) (obj)).getMessage()).toString());
        flag = flag1;
          goto _L14
        exception;
_L17:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_314;
        }
        ((BufferedReader) (obj)).close();
_L15:
        throw exception;
        obj;
        Log.e("SkypeAdConfigManager", (new StringBuilder("close persisted config file reader error: ")).append(((Exception) (obj)).getMessage()).toString());
          goto _L15
_L12:
        a("CONFIGLOAD", "file", System.currentTimeMillis() - l1, null);
          goto _L16
_L10:
        if (exception == null)
        {
            break MISSING_BLOCK_LABEL_402;
        }
        SkypeAdEvents.a(null, SkypeAdEvents.a(null, "ERROR", (new StringBuilder("config file download failure ")).append(exception.getMessage()).toString(), 1000));
        s();
          goto _L13
        exception;
        obj = bufferedreader;
          goto _L17
        exception1;
        bufferedreader = obj1;
          goto _L18
    }

    public static boolean b(String s1)
    {
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorenter ;
        boolean flag1 = false;
        Object obj = c;
        boolean flag = flag1;
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = c.getJSONArray("adUnitIdMap");
        int i1 = 0;
_L9:
        flag = flag1;
        if (i1 >= ((JSONArray) (obj)).length()) goto _L2; else goto _L3
_L3:
        JSONObject jsonobject;
        String s2;
        Object obj1;
        jsonobject = ((JSONArray) (obj)).getJSONObject(i1);
        obj1 = jsonobject.getJSONObject("key");
        s2 = ((JSONObject) (obj1)).getString("cntry");
        obj1 = ((JSONObject) (obj1)).getString("placement");
        if (!s2.equalsIgnoreCase(r) || !((String) (obj1)).equalsIgnoreCase(s1)) goto _L5; else goto _L4
_L4:
        if (!jsonobject.has("adsEnabled")) goto _L7; else goto _L6
_L6:
        flag = jsonobject.getBoolean("adsEnabled");
_L2:
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorexit ;
        return flag;
_L7:
        flag = true;
          goto _L2
_L5:
        i1++;
        continue; /* Loop/switch isn't completed */
        s1;
        Log.e("SkypeAdConfigManager", "Error getting placement specific adsEnabled property");
        flag = flag1;
          goto _L2
        s1;
        throw s1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private static boolean b(byte abyte0[], String s1, String s2)
    {
        boolean flag;
        flag = false;
        if (s1 == null || s2 == null)
        {
            return false;
        }
        boolean flag1;
        Signature signature = Signature.getInstance("SHA1withRSA");
        s1 = Base64.decode(s1, 0);
        s2 = Base64.decode(s2, 0);
        signature.initVerify(KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(s2)));
        signature.update(abyte0);
        flag1 = signature.verify(s1);
        flag = flag1;
_L2:
        return flag;
        abyte0;
        (new StringBuilder("Error verifying the signature ")).append(abyte0.getMessage());
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void c()
    {
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorenter ;
        t = null;
        a();
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private static void c(Exception exception)
    {
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorenter ;
        String s1 = f("ad_country_code");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        if (!s1.isEmpty() && s1.length() == 2) goto _L3; else goto _L2
_L2:
        SkypeAdEvents.a(null, SkypeAdEvents.a(null, "ERROR", (new StringBuilder("country code retrivel failure ")).append(exception.getMessage()).toString(), 1001));
_L5:
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorexit ;
        return;
_L3:
        r = s1;
        f();
        if (true) goto _L5; else goto _L4
_L4:
        exception;
        throw exception;
    }

    static boolean c(String s1)
    {
        return h(s1);
    }

    public static String d()
    {
        String s1 = "https://az361816.vo.msecnd.net/configuration/config_android.json.gz";
        if ("https://az361816.vo.msecnd.net/configuration/config_android.json.gz".isEmpty())
        {
            s1 = "https://az361881.vo.msecnd.net/configuration/config_android.json";
        }
        return s1;
    }

    static String d(String s1)
    {
        r = s1;
        return s1;
    }

    public static void e()
    {
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorenter ;
        if (!g)
        {
            f = 0L;
        }
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void e(String s1)
    {
        g(s1);
    }

    private static String f(String s1)
    {
        try
        {
            s1 = SkypeAdManager.d().e().getSharedPreferences("AdConfigPrefData", 0).getString(s1, "");
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            Log.e("SkypeAdConfigManager", (new StringBuilder("get user value error: ")).append(s1.getMessage()).toString());
            return null;
        }
        return s1;
    }

    public static void f()
    {
        if (b == null)
        {
            b = d();
        }
        (new StringBuilder("Ad config url  sConfigUrl ")).append(b);
        long l1 = System.currentTimeMillis();
        HttpGet httpget = new HttpGet(b);
        a(httpget);
        httpget.addHeader("Accept-Encoding", "gzip");
        ConnectionManager.a(httpget, new ConnectionManager.HTTPResponseListener(l1, httpget) {

            final long a;
            final HttpRequestBase b;

            public final void a(HttpRequestBase httprequestbase, Exception exception)
            {
                ConfigManager.q();
                ConfigManager.a(exception);
                if (httprequestbase == b)
                {
                    ConfigManager.a(a, exception);
                }
            }

            public final void a(HttpRequestBase httprequestbase, HttpResponse httpresponse)
            {
                ConfigManager.q();
                if (httpresponse.getStatusLine().getStatusCode() != 304) goto _L2; else goto _L1
_L1:
                ConfigManager.a(a, null);
_L4:
                return;
_L2:
                Object obj = httpresponse.getEntity();
                if (obj == null) goto _L4; else goto _L3
_L3:
                if (httprequestbase != b) goto _L4; else goto _L5
_L5:
                String s1;
                String s2;
                s1 = ConfigManager.a(httpresponse, "x-ms-meta-signature");
                s2 = ConfigManager.a(httpresponse, "x-ms-meta-token");
                if (!ConfigManager.a(httpresponse, "Content-Encoding").equals("gzip"))
                {
                    break MISSING_BLOCK_LABEL_193;
                }
                obj = ConfigManager.a(((HttpEntity) (obj)));
_L7:
                if (!ConfigManager.a(((String) (obj)).getBytes(), s1, s2))
                {
                    break MISSING_BLOCK_LABEL_213;
                }
                if (ConfigManager.a(((String) (obj)), a))
                {
                    ConfigManager.a("CONFIGLOAD", "file", System.currentTimeMillis() - a);
                    ConfigManager.a(System.currentTimeMillis());
                    ConfigManager.b();
                    ConfigManager.c(((String) (obj)));
                    ConfigManager.a(httpresponse);
                    return;
                }
                break MISSING_BLOCK_LABEL_203;
                httpresponse;
                Log.e("SkypeAdConfigManager", (new StringBuilder("Read config response exception ")).append(httpresponse.getMessage()).toString());
                ConfigManager.a(httpresponse);
                if (httprequestbase != b) goto _L4; else goto _L6
_L6:
                ConfigManager.a(a, httpresponse);
                return;
                obj = EntityUtils.toString(((HttpEntity) (obj)), "UTF-8");
                  goto _L7
                throw new Exception("loading remote config file failed!");
                int i1 = httpresponse.getStatusLine().getStatusCode();
                if (i1 < 400)
                {
                    break MISSING_BLOCK_LABEL_264;
                }
                throw new Exception((new StringBuilder("Configuration server throwing ")).append(i1).append(" error code.").toString());
                throw new Exception("Verification of the signature failed!");
            }

            
            {
                a = l1;
                b = httprequestbase;
                super();
            }
        });
    }

    private static void g(String s1)
    {
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorenter ;
        b("ad_country_code", s1);
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public static boolean g()
    {
        return k;
    }

    public static String h()
    {
        return r;
    }

    private static boolean h(String s1)
    {
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj2;
        boolean flag1;
        flag1 = false;
        obj = null;
        obj2 = null;
        Object obj1 = new OutputStreamWriter(a.openFileOutput("ad_config.json", 0));
        ((Writer) (obj1)).write(s1);
        boolean flag = true;
        ((Writer) (obj1)).close();
_L1:
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorexit ;
        return flag;
        s1;
        Log.e("SkypeAdConfigManager", (new StringBuilder("close persisted config file writer error: ")).append(s1.getMessage()).toString());
          goto _L1
        obj1;
        s1 = obj2;
_L6:
        obj = s1;
        Log.e("SkypeAdConfigManager", (new StringBuilder("persisting config file error: ")).append(((Exception) (obj1)).getMessage()).toString());
        flag = flag1;
        if (s1 == null) goto _L1; else goto _L2
_L2:
        s1.close();
        flag = flag1;
          goto _L1
        s1;
        Log.e("SkypeAdConfigManager", (new StringBuilder("close persisted config file writer error: ")).append(s1.getMessage()).toString());
        flag = flag1;
          goto _L1
        s1;
_L7:
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorexit ;
        throw s1;
        s1;
_L5:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        ((Writer) (obj)).close();
_L3:
        throw s1;
        obj;
        Log.e("SkypeAdConfigManager", (new StringBuilder("close persisted config file writer error: ")).append(((Exception) (obj)).getMessage()).toString());
          goto _L3
        s1;
        obj = obj1;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        s1 = ((String) (obj1));
        obj1 = exception;
          goto _L6
        s1;
          goto _L7
    }

    public static String i()
    {
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorenter ;
        Object obj1 = null;
        Object obj = c;
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj1 = null;
_L4:
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorexit ;
        return ((String) (obj1));
_L2:
        obj = obj1;
        Object obj2 = SkypeAdManager.d();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        obj = obj1;
        break MISSING_BLOCK_LABEL_32;
_L5:
        obj1 = obj;
        if (obj != null) goto _L4; else goto _L3
_L3:
        obj1 = c.getString("appId");
          goto _L4
        if (((SkypeAdManager) (obj2)).e() == null)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        obj = obj1;
        obj2 = ((SkypeAdManager) (obj2)).e().getSharedPreferences(((SkypeAdManager) (obj2)).f(), 0).getString("adUnitId", null);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        obj = obj1;
        if (((String) (obj2)).length() <= 4)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        obj = obj1;
        if (((String) (obj2)).indexOf("/") <= 0)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        obj = obj1;
        obj1 = ((String) (obj2)).split("/")[0];
        obj = obj1;
          goto _L5
        obj = null;
          goto _L5
        Exception exception;
        exception;
        Log.e("SkypeAdConfigManager", (new StringBuilder("Unable to pull the applicationID ")).append(exception.getMessage()).toString());
        exception = ((Exception) (obj));
          goto _L4
        obj;
        throw obj;
        obj = null;
          goto _L5
    }

    public static int j()
    {
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorenter ;
        int i1 = 60000;
        JSONObject jsonobject = d;
        if (jsonobject != null) goto _L2; else goto _L1
_L1:
        i1 = 60000;
_L4:
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorexit ;
        return i1;
_L2:
        int j1 = d.getInt("adRotationIntervalInSec");
        i1 = j1 * 1000;
        continue; /* Loop/switch isn't completed */
        Object obj;
        obj;
        Log.e("SkypeAdConfigManager", (new StringBuilder("Unable to pull the refresh time interval ")).append(((Exception) (obj)).getMessage()).toString());
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        throw obj;
    }

    public static long k()
    {
        return i;
    }

    public static boolean l()
    {
        return j;
    }

    public static int m()
    {
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorenter ;
        boolean flag = false;
        JSONObject jsonobject = c;
        int i1;
        i1 = ((flag) ? 1 : 0);
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        i1 = ((flag) ? 1 : 0);
        if (c.has("batteryLifeThreshold"))
        {
            i1 = c.getInt("batteryLifeThreshold");
        }
_L1:
        (new StringBuilder("Setting Battery Life Threshold to '")).append(i1).append("'");
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorexit ;
        return i1;
        Object obj;
        obj;
        Log.e("SkypeAdConfigManager", (new StringBuilder("Unable to pull the batteryLifeThreshold config ")).append(((Exception) (obj)).getMessage()).toString());
        i1 = ((flag) ? 1 : 0);
          goto _L1
        obj;
        throw obj;
    }

    public static String n()
    {
        return l;
    }

    public static String o()
    {
        return m;
    }

    static JSONObject p()
    {
        return d;
    }

    static boolean q()
    {
        g = false;
        return false;
    }

    static String r()
    {
        return r;
    }

    private static void s()
    {
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorenter ;
        b("ad_config_last_modified", ((String) (null)));
        b("ad_config_etag", ((String) (null)));
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private static boolean t()
    {
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorenter ;
        long l1;
        long l2;
        long l3;
        l1 = SkypeAdManager.d().c;
        l2 = System.currentTimeMillis();
        l3 = o;
        boolean flag;
        if (l2 - l1 * 60000L < l3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    private static boolean u()
    {
        boolean flag = true;
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorenter ;
        SkypeAdManager skypeadmanager;
        long l1;
        skypeadmanager = SkypeAdManager.d();
        l1 = System.currentTimeMillis();
        int i1 = 0;
        long l2;
        long l3;
        l2 = skypeadmanager.h();
        l3 = p;
        Object obj;
        Object obj1;
        Object obj2;
        String s1;
        if (l1 - l2 < l3)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
_L6:
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        obj = u;
        obj2 = v;
        s1 = "4.3";
        int j1;
        if (obj == null || obj == "")
        {
            obj = "4.0";
        }
        break MISSING_BLOCK_LABEL_193;
_L8:
        s1 = skypeadmanager.e.split("/")[1];
        if (skypeadmanager.d == null) goto _L4; else goto _L3
_L3:
        obj2 = skypeadmanager.d.split("/")[1];
_L7:
        i1 = s1.compareTo(((String) (obj)));
        j1 = ((String) (obj2)).compareTo(((String) (obj1)));
        if (i1 > 0 && j1 < 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0) goto _L2; else goto _L5
_L5:
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorexit ;
        return flag;
        obj;
        Log.e("SkypeAdConfigManager", ((Exception) (obj)).getMessage());
          goto _L6
        obj;
        throw obj;
_L4:
        obj2 = obj;
          goto _L7
_L2:
        flag = false;
          goto _L5
        obj1 = s1;
        if (obj2 != null)
        {
            obj1 = s1;
            if (obj2 != "")
            {
                obj1 = obj2;
            }
        }
          goto _L8
    }

    private static void v()
    {
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorenter ;
        JSONObject jsonobject = c;
        if (jsonobject == null) goto _L2; else goto _L1
_L1:
        if (!c.has("firstTimeUserDays")) goto _L4; else goto _L3
_L3:
        int i1 = c.getInt("firstTimeUserDays");
_L7:
        if (!c.has("firstTimeModernClientUsersInDays")) goto _L6; else goto _L5
_L5:
        int j1 = c.getInt("firstTimeModernClientUsersInDays");
_L8:
        o = i1 * 24 * 60 * 60 * 1000;
        p = j1 * 24 * 60 * 60 * 1000;
_L2:
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorexit ;
        return;
_L4:
        i1 = 14;
          goto _L7
_L6:
        j1 = 15;
          goto _L8
        Object obj;
        obj;
        Log.e("SkypeAdConfigManager", (new StringBuilder("Error setting LCM periods from config file, message ")).append(((Exception) (obj)).getMessage()).append(". Using default values").toString());
          goto _L2
        obj;
        throw obj;
          goto _L7
    }

    private static void w()
    {
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorenter ;
        Object obj = c;
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (!c.has("minModernClientVersion")) goto _L4; else goto _L3
_L3:
        obj = c.getString("minModernClientVersion");
_L7:
        u = ((String) (obj));
        if (!c.has("maxModernClientVersion")) goto _L6; else goto _L5
_L5:
        obj = c.getString("maxModernClientVersion");
_L8:
        v = ((String) (obj));
_L2:
        com/skype/android/ads/ConfigManager;
        JVM INSTR monitorexit ;
        return;
_L4:
        obj = u;
          goto _L7
_L6:
        obj = v;
          goto _L8
        Object obj1;
        obj1;
        Log.e("SkypeAdConfigManager", "Error setting Min and Max App versions from config file, using default values");
          goto _L2
        obj1;
        throw obj1;
          goto _L7
    }

    static 
    {
        "https://apps.skype.com/countrycode".isEmpty();
    }
}
