// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.tracker;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.kochava.android.util.StringUtils;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kochava.android.tracker:
//            KochavaDbAdapter, Global, ReferralCapture

public class Feature
{

    private static String C;
    private static boolean E = false;
    private static long F = 0L;
    private static long G = 0L;
    private static String H;
    private static String I = "";
    private static Map J;
    private static KochavaDbAdapter K;
    private static boolean P = false;
    private static boolean Q = true;
    private static boolean R = false;
    private static boolean S = false;
    private static SharedPreferences V;
    private static SharedPreferences W;
    private static final ExecutorService X = Executors.newFixedThreadPool(1);
    private static Handler Y;
    private static final ScheduledExecutorService Z = Executors.newSingleThreadScheduledExecutor();
    protected static String a = "";
    private static final Uri aa = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
    private static HashMap ab = new HashMap() {

            
            {
                put("android_id", Boolean.valueOf(true));
                put("imei", Boolean.valueOf(true));
                put("odin", Boolean.valueOf(true));
                put("mac", Boolean.valueOf(true));
                put("fb_attribution_id", Boolean.valueOf(true));
                put("open_udid", Boolean.valueOf(true));
                put("adid", Boolean.valueOf(true));
            }
    };
    private static ArrayList ac = new ArrayList();
    private static Runnable ad = new Runnable() {

        public void run()
        {
            int i1;
            int j1;
            j1 = 60;
            i1 = j1;
            Object obj = Feature.c(true);
            i1 = j1;
            HttpProtocolParams.setUserAgent(((HttpClient) (obj)).getParams(), Feature.b());
            i1 = j1;
            if (Feature.c() == null)
            {
                break MISSING_BLOCK_LABEL_55;
            }
            i1 = j1;
            if (!Feature.c().trim().isEmpty())
            {
                break MISSING_BLOCK_LABEL_86;
            }
            i1 = j1;
            if (!Global.a)
            {
                break MISSING_BLOCK_LABEL_77;
            }
            i1 = j1;
            Log.i("KochavaTracker", "KVquery - hostControl was empty, using default");
            i1 = j1;
            Feature.b("control.kochava.com");
            i1 = j1;
            Object obj1 = (new StringBuilder("https://")).append(Feature.c()).append("/track/kvquery").toString();
            i1 = j1;
            if (!Global.a)
            {
                break MISSING_BLOCK_LABEL_150;
            }
            i1 = j1;
            Log.i("KochavaTracker", (new StringBuilder("KVquery - posting to ")).append(((String) (obj1))).toString());
            i1 = j1;
            obj1 = new HttpPost(((String) (obj1)));
            i1 = j1;
            Object obj2 = new JSONObject();
            i1 = j1;
            ((JSONObject) (obj2)).put("action", "get_attribution");
            i1 = j1;
            ((JSONObject) (obj2)).put("kochava_app_id", Feature.d());
            i1 = j1;
            ((JSONObject) (obj2)).put("kochava_device_id", Feature.e());
            i1 = j1;
            ((JSONObject) (obj2)).put("sdk_version", (new StringBuilder("Android20141023")).append(Feature.a).toString());
            i1 = j1;
            ((JSONObject) (obj2)).put("sdk_protocol", "3");
            i1 = j1;
            obj2 = ((JSONObject) (obj2)).toString();
            i1 = j1;
            if (!Global.a)
            {
                break MISSING_BLOCK_LABEL_303;
            }
            i1 = j1;
            Log.i("KochavaTracker", (new StringBuilder("KVquery data:")).append(((String) (obj2))).toString());
            i1 = j1;
            obj2 = new StringEntity(((String) (obj2)), "UTF-8");
            i1 = j1;
            BasicHeader basicheader = new BasicHeader("Content-Type", "application/xml");
            i1 = j1;
            ((HttpPost) (obj1)).getParams().setBooleanParameter("http.protocol.expect-continue", false);
            i1 = j1;
            ((StringEntity) (obj2)).setContentType(basicheader);
            i1 = j1;
            ((HttpPost) (obj1)).setEntity(((HttpEntity) (obj2)));
            i1 = j1;
            if (!Global.a)
            {
                break MISSING_BLOCK_LABEL_393;
            }
            i1 = j1;
            Log.e("KochavaTracker", "Trying to post to KVquery.");
            i1 = j1;
            obj = ((HttpClient) (obj)).execute(((org.apache.http.client.methods.HttpUriRequest) (obj1))).getEntity();
            if (obj != null) goto _L2; else goto _L1
_L1:
            i1 = j1;
            if (!Global.b)
            {
                break MISSING_BLOCK_LABEL_436;
            }
            i1 = j1;
            Log.e("KochavaTracker", "Could not get a response entity from KVquery.");
_L6:
            return;
_L2:
            i1 = j1;
            if (!Global.a)
            {
                break MISSING_BLOCK_LABEL_459;
            }
            i1 = j1;
            Log.e("KochavaTracker", "(KVquery) Grabbing Result...");
            i1 = j1;
            obj = StringUtils.a(((HttpEntity) (obj)).getContent());
            i1 = j1;
            if (!Global.a)
            {
                break MISSING_BLOCK_LABEL_509;
            }
            i1 = j1;
            Log.e("KochavaTracker", (new StringBuilder("(KVquery) Result: ")).append(((String) (obj))).toString());
            i1 = j1;
            obj = new JSONObject(((String) (obj)));
_L19:
            i1 = j1;
            if (obj == null) goto _L4; else goto _L3
_L3:
            i1 = j1;
            if (!Global.a)
            {
                break MISSING_BLOCK_LABEL_569;
            }
            i1 = j1;
            Log.e("KochavaTracker", (new StringBuilder("(KVquery) Parsed result: ")).append(((JSONObject) (obj)).toString()).toString());
            i1 = j1;
            obj = ((JSONObject) (obj)).getJSONObject("data");
            i1 = j1;
            obj1 = obj;
            if (!Global.a)
            {
                break MISSING_BLOCK_LABEL_1158;
            }
            i1 = j1;
            Log.i("KochavaTracker", (new StringBuilder("(KVquery) return data: ")).append(((JSONObject) (obj)).toString()).toString());
_L20:
            i1 = j1;
            if (obj == null) goto _L4; else goto _L5
_L5:
            i1 = j1;
            obj1 = ((JSONObject) (obj)).getString("attribution");
_L9:
            i1 = j1;
            int k1 = ((JSONObject) (obj)).getInt("retry");
            int l1;
            int i2;
            i1 = k1;
            j1 = i1;
            if (i1 >= 0)
            {
                break MISSING_BLOCK_LABEL_820;
            }
            k1 = i1;
            l1 = i1;
            i2 = i1;
            Feature.f().edit().putString("attributionData", ((String) (obj1))).commit();
            j1 = i1;
            k1 = i1;
            l1 = i1;
            i2 = i1;
            if (Feature.g() == null)
            {
                break MISSING_BLOCK_LABEL_820;
            }
            k1 = i1;
            l1 = i1;
            i2 = i1;
            obj = Message.obtain();
            k1 = i1;
            l1 = i1;
            i2 = i1;
            obj2 = new Bundle();
            k1 = i1;
            l1 = i1;
            i2 = i1;
            ((Bundle) (obj2)).putString("attributionData", ((String) (obj1)).toString());
            k1 = i1;
            l1 = i1;
            i2 = i1;
            ((Message) (obj)).setData(((Bundle) (obj2)));
            k1 = i1;
            l1 = i1;
            i2 = i1;
            Feature.g().sendMessage(((Message) (obj)));
            j1 = i1;
_L11:
            if (j1 > 0)
            {
                Feature.a(j1);
                return;
            }
              goto _L6
            obj;
            i1 = j1;
            if (!Global.b) goto _L8; else goto _L7
_L7:
            i1 = j1;
            Log.e("KochavaTracker", (new StringBuilder("(KVquery) Error while parsing result json: ")).append(((JSONException) (obj)).toString()).toString());
              goto _L8
_L18:
            i1 = j1;
            obj1 = obj;
            if (!Global.a)
            {
                break MISSING_BLOCK_LABEL_1158;
            }
            i1 = j1;
            Log.e("KochavaTracker", "KVquery response did not contain data.");
            obj1 = obj;
            break MISSING_BLOCK_LABEL_1158;
            obj1;
            i1 = j1;
            if (!Global.a)
            {
                break MISSING_BLOCK_LABEL_929;
            }
            i1 = j1;
            Log.e("KochavaTracker", "KVquery response did not contain attribution data, or JSON was invalid.");
            obj1 = "";
              goto _L9
            obj;
            i1 = 60;
_L17:
            j1 = i1;
            k1 = i1;
            l1 = i1;
            i2 = i1;
            if (!Global.a) goto _L11; else goto _L10
_L10:
            k1 = i1;
            l1 = i1;
            i2 = i1;
            Log.e("KochavaTracker", "KVquery response did not contain a retry value, or JSON was invalid.");
            j1 = i1;
              goto _L11
            obj;
            j1 = k1;
_L16:
            i1 = j1;
            if (!Global.a) goto _L6; else goto _L12
_L12:
            i1 = j1;
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
            i1 = j1;
            if (!Global.a) goto _L6; else goto _L13
_L13:
            i1 = j1;
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
            j1 = i1;
_L14:
            i1 = j1;
            if (Global.b)
            {
                Log.e("KochavaTracker", "Unexpected error during KVquery communication.", ((Throwable) (obj)));
                i1 = j1;
            }
_L4:
            j1 = i1;
              goto _L11
            obj;
            j1 = l1;
              goto _L14
            obj;
            j1 = i2;
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

    };
    protected static boolean b = false;
    protected static Context c;
    private static Map g;
    private static JSONObject h;
    private static String i = "";
    private static String j = "";
    private static int k = 60000;
    private static String u;
    private static String v;
    private static String x;
    private static String y;
    private int A;
    private int B;
    private boolean D;
    private boolean L;
    private Timer M;
    private Timer N;
    private Timer O;
    private JSONObject T;
    private JSONObject U;
    private Handler ae;
    protected JSONObject d;
    protected JSONObject e;
    protected JSONObject f;
    private Context l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private String s;
    private String t;
    private String w;
    private String z;

    public Feature(Context context, String s1)
    {
        D = false;
        L = true;
        ae = new Handler() {

            final Feature a;

            static Feature a(_cls3 _pcls3)
            {
                return _pcls3.a;
            }

            public void handleMessage(Message message)
            {
                boolean flag;
                flag = message.getData().getBoolean("sendonstart");
                Feature.c(Feature.a(a));
                Feature.a(a, Feature.b(a));
                Feature.b(a, Feature.c(a));
                Feature.c(a, "Default");
                Feature.d(a, "N/A");
                Feature.e(a, "");
                PackageManager packagemanager = Feature.d(a).getApplicationContext().getPackageManager();
                message = packagemanager.getApplicationInfo(Feature.d(a).getPackageName(), 0);
_L3:
                Feature feature = a;
                if (message == null)
                {
                    break MISSING_BLOCK_LABEL_807;
                }
                message = packagemanager.getApplicationLabel(message);
_L2:
                Feature.c(feature, (String)message);
                if (Global.a)
                {
                    Log.i("KochavaTracker", (new StringBuilder("mAppName now: ")).append(Feature.e(a)).toString());
                }
_L1:
                try
                {
                    Feature.d(a, (new StringBuilder(String.valueOf(Feature.d(a).getPackageManager().getPackageInfo(Feature.d(a).getPackageName(), 0).versionCode))).toString());
                    if (Global.a)
                    {
                        Log.i("KochavaTracker", (new StringBuilder("mAppVersionCode now: ")).append(Feature.f(a)).toString());
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    if (Global.b)
                    {
                        Log.e("KochavaTracker", (new StringBuilder("Error gathering app version code ")).append(message.toString()).toString());
                    }
                }
                try
                {
                    Feature.e(a, Feature.d(a).getPackageManager().getPackageInfo(Feature.d(a).getPackageName(), 0).versionName);
                    if (Global.a)
                    {
                        Log.i("KochavaTracker", (new StringBuilder("mAppVersionName now: ")).append(Feature.g(a)).toString());
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    if (Global.b)
                    {
                        Log.e("KochavaTracker", (new StringBuilder("Error gathering app version name ")).append(message.toString()).toString());
                    }
                }
                try
                {
                    message = (WindowManager)Feature.d(a).getSystemService("window");
                    Feature.a(a, message.getDefaultDisplay().getHeight());
                    Feature.b(a, message.getDefaultDisplay().getWidth());
                    if (Global.a)
                    {
                        Log.i("KochavaTracker", (new StringBuilder("Height: ")).append(Feature.h(a)).append(" | Width: ").append(Feature.i(a)).toString());
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    if (Global.b)
                    {
                        Log.e("KochavaTracker", (new StringBuilder("Error ")).append(message.toString()).toString());
                    }
                }
                Feature.f(a, android.provider.Settings.Secure.getString(Feature.d(a).getContentResolver(), "android_id"));
                Feature.g(a, Feature.e());
                Feature.a(Feature.d(a).getSharedPreferences("initPrefs", 0));
                if (Feature.h().getString("initBool", "").equals(""))
                {
                    Feature.h().edit().putString("initBool", "false").commit();
                }
                if (Feature.h().getString("kochavaappdata", null) != null)
                {
                    message = Feature.i().a(Feature.h().getString("kochavaappdata", null));
                    String s2 = Feature.j(a);
                    if (Global.a)
                    {
                        Log.e("KochavaTracker", (new StringBuilder("[KOCHAVA] Stored Data: ")).append(message).toString());
                        Log.e("KochavaTracker", (new StringBuilder("[KOCHAVA] Created Data: ")).append(s2).toString());
                    }
                    if (message == null)
                    {
                        Feature.i().b(Feature.h().getString("kochavaappdata", null), s2);
                    } else
                    if (!message.equals(s2))
                    {
                        Feature.i().a(Feature.h().getString("kochavaappdata", null), s2);
                    } else
                    {
                        if (Global.a)
                        {
                            Log.e("KochavaTracker", "Set start of life to false");
                        }
                        Feature.a(a, false);
                    }
                } else
                {
                    Feature.a(a, false);
                }
                if (Feature.k(a) || !Feature.h().getString("initBool", "").equals("") && Feature.h().getString("initBool", "").equals("false"))
                {
                    if (Global.a)
                    {
                        Log.e("KochavaTracker", "Initial event has not yet been qued in the database, making initial call");
                    }
                    Feature.a(a, "initial", null);
                }
                Feature.a(a, new Timer());
                Feature.l(a).schedule(new TimerTask(this) {

                    final _cls3 a;

                    public void run()
                    {
                        Feature.a();
                    }

            
            {
                a = _pcls3;
                super();
            }
                }, 0L, Feature.j());
                Feature.b(a, new Timer());
                if (!flag)
                {
                    Feature.m(a).schedule(new TimerTask(this) {

                        final _cls3 a;

                        public void run()
                        {
                            if (Global.a)
                            {
                                Log.e("KochavaTracker", "Reached 10 min mark w/o sending initial, sending now.");
                            }
                            Feature.b(_cls3.a(a), false);
                        }

            
            {
                a = _pcls3;
                super();
            }
                    }, 0x927c0L);
                    return;
                } else
                {
                    Feature.m(a).schedule(new TimerTask(this) {

                        final _cls3 a;

                        public void run()
                        {
                            if (Global.a)
                            {
                                Log.e("KochavaTracker", "Scheduling timer to que initial event if needed.");
                            }
                            Feature.b(_cls3.a(a), false);
                        }

            
            {
                a = _pcls3;
                super();
            }
                    }, 2000L);
                    Feature.c(a, new Timer());
                    Feature.n(a).schedule(new TimerTask(this) {

                        final _cls3 a;

                        public void run()
                        {
                            Feature.a();
                        }

            
            {
                a = _pcls3;
                super();
            }
                    }, 4000L);
                    return;
                }
                message;
                try
                {
                    if (Global.b)
                    {
                        Log.e("KochavaTracker", (new StringBuilder("Error gathering app name ")).append(message.toString()).toString());
                    }
                    break MISSING_BLOCK_LABEL_1082;
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    if (Global.b)
                    {
                        Log.e("KochavaTracker", (new StringBuilder("Error gathering app name ")).append(message.toString()).toString());
                    }
                }
                  goto _L1
                message = "(unknown)";
                  goto _L2
                message = null;
                  goto _L3
            }

            
            {
                a = Feature.this;
                super();
            }
        };
        HashMap hashmap = new HashMap();
        if (s1 != null && s1.trim().length() != 0)
        {
            hashmap.put("kochava_app_id", s1);
        }
        a(context, true, hashmap);
    }

    private boolean A()
    {
        return W != null && !W.getAll().isEmpty();
    }

    private String B()
    {
        if (r != null)
        {
            return r;
        } else
        {
            return "Unknown";
        }
    }

    private String C()
    {
        return (new StringBuilder(String.valueOf(o))).append(" ").append(p).toString();
    }

    private String D()
    {
        return v;
    }

    private static String E()
    {
        if (V.contains("kochava_app_id_generated") && !V.getString("kochava_app_id_generated", "").equals(""))
        {
            return V.getString("kochava_app_id_generated", "");
        } else
        {
            String s1 = UUID.randomUUID().toString().replaceAll("-", "");
            s1 = (new StringBuilder("KA")).append(s1).toString();
            V.edit().putString("kochava_app_id_generated", s1).commit();
            return s1;
        }
    }

    private String F()
    {
        if (H == null || "".equals(H)) goto _L2; else goto _L1
_L1:
        byte abyte0[];
        StringBuffer stringbuffer;
        int i1;
        MessageDigest messagedigest = MessageDigest.getInstance("SHA-1");
        byte abyte1[] = new byte[40];
        messagedigest.update(H.getBytes("iso-8859-1"), 0, H.length());
        abyte0 = messagedigest.digest();
        stringbuffer = new StringBuffer();
        i1 = 0;
_L3:
        int j1;
        int k1;
        if (i1 >= abyte0.length)
        {
            return stringbuffer.toString();
        }
        k1 = abyte0[i1] >>> 4 & 0xf;
        j1 = 0;
_L4:
        if (k1 >= 0 && k1 <= 9)
        {
            stringbuffer.append((char)(k1 + 48));
        } else
        {
            stringbuffer.append((char)((k1 - 10) + 97));
        }
        k1 = abyte0[i1];
        if (j1 < 1)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        i1++;
        if (true) goto _L3; else goto _L2
_L2:
        return "";
        j1++;
        k1 &= 0xf;
          goto _L4
    }

    private static String G()
    {
        Object obj;
        boolean flag1;
        flag1 = true;
        obj = K.a();
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = "";
_L4:
        return ((String) (obj));
_L2:
        obj = new StringTokenizer(((String) (obj)), "=");
        long l1 = Long.parseLong(((StringTokenizer) (obj)).nextToken());
        Object obj2 = ((StringTokenizer) (obj)).nextToken();
        obj = obj2;
        if (((String) (obj2)).startsWith("["))
        {
            obj = ((String) (obj2)).substring(1);
        }
        obj2 = obj;
        if (((String) (obj)).endsWith("]"))
        {
            obj2 = ((String) (obj)).substring(0, ((String) (obj)).length() - 1);
        }
        if (Global.a)
        {
            Log.e("KochavaTracker", (new StringBuilder("Post The Data 3>>>>>>")).append(((String) (obj2))).toString());
        }
        Object obj1;
        HttpPost httppost;
        boolean flag;
        if (((String) (obj2)).contains("\"action\":\"initial\""))
        {
            flag = flag1;
            if (Global.a)
            {
                Log.e("KochavaTracker", "Post Data: Event is initial, look at response");
                flag = flag1;
            }
        } else
        {
            flag = false;
        }
        obj = g(false);
        HttpProtocolParams.setUserAgent(((HttpClient) (obj)).getParams(), y);
        if (i == null || i.trim().isEmpty())
        {
            if (Global.a)
            {
                Log.i("KochavaTracker", "postEvent - hostControl was empty, using default");
            }
            i = "control.kochava.com";
        }
        if (Global.a)
        {
            Log.i("KochavaTracker", (new StringBuilder("postEvent - posting to ")).append("https://").append(i).append("/track/kvTracker.php").toString());
        }
        httppost = new HttpPost((new StringBuilder("https://")).append(i).append("/track/kvTracker.php").toString());
        try
        {
            obj2 = new StringEntity((new StringBuilder("[")).append(((String) (obj2))).append("]").toString(), "UTF-8");
            BasicHeader basicheader = new BasicHeader("Content-Type", "application/xml");
            httppost.getParams().setBooleanParameter("http.protocol.expect-continue", false);
            ((StringEntity) (obj2)).setContentType(basicheader);
            httppost.setEntity(((HttpEntity) (obj2)));
            if (Global.a)
            {
                Log.e("KochavaTracker", "Trying to post an event.");
            }
            obj = ((HttpClient) (obj)).execute(httppost).getEntity();
        }
        catch (ClientProtocolException clientprotocolexception)
        {
            if (Global.a)
            {
                Log.e("KochavaTracker", "TrackTask", clientprotocolexception);
            }
            return "";
        }
        catch (IOException ioexception)
        {
            if (Global.a)
            {
                Log.e("KochavaTracker", "TrackTask", ioexception);
            }
            return "";
        }
        if (obj == null)
        {
            return "";
        }
        if (Global.a)
        {
            Log.e("KochavaTracker", "Grabbing Result...");
        }
        obj2 = StringUtils.a(((HttpEntity) (obj)).getContent());
        if (Global.a)
        {
            Log.e("KochavaTracker", (new StringBuilder("Result: ")).append(((String) (obj2))).toString());
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_513;
        }
        obj = obj2;
        if (!((String) (obj2)).contains("\"success\":\"1\"")) goto _L4; else goto _L3
_L3:
        if (Global.a)
        {
            Log.i("KochavaTracker", "Got success response, cleaning database.");
        }
        K.a(l1);
        return ((String) (obj2));
        obj1;
        if (Global.a)
        {
            Log.e("KochavaTracker", "TrackTask", ((Throwable) (obj1)));
        }
        return "";
        K.a(l1);
        return ((String) (obj2));
        obj1;
        if (Global.a)
        {
            Log.e("KochavaTracker", "TrackTask", ((Throwable) (obj1)));
        }
        return "";
    }

    private String H()
    {
        Object obj1;
        Object obj2;
        obj2 = "";
        obj1 = "";
        Object obj3 = (new StringBuilder(String.valueOf(""))).append("\nTrying user agent method 1").toString();
        obj1 = System.getProperty("http.agent");
_L1:
        Object obj;
        Exception exception;
        Object obj4;
        Object obj5;
        boolean flag;
        if (((String) (obj1)).trim().isEmpty())
        {
            flag = false;
        } else
        {
            flag = true;
        }
        obj2 = obj3;
        obj = obj1;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        obj2 = (new StringBuilder(String.valueOf(obj3))).append("\nTrying user agent method 2").toString();
        obj = obj1;
        obj1 = (new WebView(l)).getSettings().getUserAgentString();
        obj = obj1;
        obj3 = (new StringBuilder(String.valueOf(obj2))).append("\nMethod 2 successful").toString();
        obj2 = obj3;
        obj = obj1;
_L2:
        if (((String) (obj)).trim().isEmpty())
        {
            flag = false;
        } else
        {
            flag = true;
        }
        obj3 = obj2;
        obj4 = obj;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_292;
        }
        obj3 = (new StringBuilder(String.valueOf(obj2))).append("\nTrying user agent method 3").toString();
        obj1 = android/webkit/WebSettings.getDeclaredConstructor(new Class[] {
            android/content/Context, android/webkit/WebView
        });
        obj2 = obj1;
        obj4 = obj;
        ((Constructor) (obj1)).setAccessible(true);
        obj2 = obj1;
        obj4 = obj;
        obj = ((WebSettings)((Constructor) (obj1)).newInstance(new Object[] {
            l, null
        })).getUserAgentString();
        obj2 = obj1;
        obj4 = obj;
        obj5 = (new StringBuilder(String.valueOf(obj3))).append("\nMethod 3 successful.").toString();
        obj2 = obj5;
        obj3 = obj2;
        obj4 = obj;
        if (obj1 != null)
        {
            ((Constructor) (obj1)).setAccessible(false);
            obj4 = obj;
            obj3 = obj2;
        }
_L3:
        if (Global.a)
        {
            Log.i("KochavaTracker", (new StringBuilder("user agent result: ")).append(((String) (obj3))).toString());
        }
        return ((String) (obj4));
        obj;
_L8:
        obj3 = new StringWriter();
        ((Exception) (obj)).printStackTrace(new PrintWriter(((java.io.Writer) (obj3))));
        if (Global.b)
        {
            Log.e("KochavaTracker", ((StringWriter) (obj3)).toString());
        }
        obj3 = (new StringBuilder(String.valueOf(obj1))).append("\nError with user agent first method: ").append(((Exception) (obj)).toString()).append("\n").append(((StringWriter) (obj3)).toString()).toString();
        obj1 = obj2;
          goto _L1
        obj;
        obj2 = obj3;
        obj3 = obj;
        obj = obj1;
        obj1 = obj3;
_L7:
        obj3 = new StringWriter();
        ((Exception) (obj1)).printStackTrace(new PrintWriter(((java.io.Writer) (obj3))));
        if (Global.b)
        {
            Log.e("KochavaTracker", ((StringWriter) (obj3)).toString());
        }
        obj2 = (new StringBuilder(String.valueOf(obj2))).append("\nError with user agent second method: ").append(((Exception) (obj1)).toString()).append("\n").append(((StringWriter) (obj3)).toString()).append("\n userAgent = error.").toString();
          goto _L2
        obj3;
        obj1 = null;
        obj4 = obj2;
_L6:
        obj2 = obj1;
        obj5 = new StringWriter();
        obj2 = obj1;
        ((Exception) (obj3)).printStackTrace(new PrintWriter(((java.io.Writer) (obj5))));
        obj2 = obj1;
        if (!Global.b)
        {
            break MISSING_BLOCK_LABEL_574;
        }
        obj2 = obj1;
        Log.e("KochavaTracker", ((StringWriter) (obj5)).toString());
        obj2 = obj1;
        obj3 = (new StringBuilder(String.valueOf(obj4))).append("\nError with user agent third method: ").append(((Exception) (obj3)).toString()).append("\n").append(((StringWriter) (obj5)).toString()).append("\n userAgent = error.").toString();
        obj2 = obj3;
        obj3 = obj2;
        obj4 = obj;
        if (obj1 != null)
        {
            ((Constructor) (obj1)).setAccessible(false);
            obj3 = obj2;
            obj4 = obj;
        }
          goto _L3
        obj;
        obj2 = null;
_L5:
        if (obj2 != null)
        {
            ((Constructor) (obj2)).setAccessible(false);
        }
        throw obj;
        obj;
        if (true) goto _L5; else goto _L4
_L4:
        exception;
        obj1 = null;
        obj4 = obj3;
        obj3 = exception;
          goto _L6
        obj;
        exception = ((Exception) (obj3));
        obj3 = obj;
        obj = obj4;
        obj4 = exception;
          goto _L6
        obj1;
          goto _L7
        obj;
        obj1 = obj3;
          goto _L8
    }

    private String I()
    {
        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
        int i1;
        try
        {
            i1 = GooglePlayServicesUtil.a(l);
        }
        catch (Exception exception)
        {
            if (Global.b)
            {
                Log.e("KochavaTracker", (new StringBuilder("Problem getting Advertising ID ")).append(exception.toString()).toString());
            }
            return "";
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        if (Global.b)
        {
            Log.e("KochavaTracker", (new StringBuilder("Problem getting Advertising ID ")).append(GooglePlayServicesUtil.a(i1)).toString());
        }
        return "";
        info = AdvertisingIdClient.b(l);
        E = info.b();
        if (!E)
        {
            return info.a();
        }
        if (Global.a)
        {
            Log.i("KochavaTracker", "User has Google ID disabled.");
        }
        return "";
    }

    private String J()
    {
        String s1;
        Account aaccount[];
        int i1;
        int j1;
        s1 = "";
        if (l.checkCallingOrSelfPermission("android.permission.GET_ACCOUNTS") != 0)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        aaccount = AccountManager.get(l).getAccounts();
        j1 = aaccount.length;
        i1 = 0;
_L3:
        if (i1 < j1) goto _L2; else goto _L1
_L1:
        if (s1.length() > 0)
        {
            s1 = s1.substring(0, s1.length() - 1);
        } else
        {
            s1 = "";
        }
_L4:
        return (new StringBuilder("[")).append(s1).append("]").toString();
_L2:
        Account account = aaccount[i1];
        String s2 = s1;
        if (h(account.name))
        {
            s2 = account.name.toLowerCase();
            s2 = (new StringBuilder(String.valueOf(s1))).append(s2).append(",").toString();
        }
        i1++;
        s1 = s2;
          goto _L3
        String s3 = "";
        s1 = s3;
        if (Global.a)
        {
            Log.i("KochavaTracker", "****NOTICE**** Gathering of emails was whitelisted, but android.permission.GET_ACCOUNTS declaration was missing from manifest.");
            s1 = s3;
        }
          goto _L4
    }

    protected static String a(ContentResolver contentresolver)
    {
        Cursor cursor = contentresolver.query(aa, new String[] {
            "aid"
        }, null, null, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        contentresolver = cursor;
        boolean flag = cursor.moveToFirst();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        Exception exception;
        Object obj;
        if (cursor != null)
        {
            try
            {
                if (!cursor.isClosed())
                {
                    cursor.close();
                }
            }
            // Misplaced declaration of an exception variable
            catch (ContentResolver contentresolver)
            {
                return null;
            }
        }
        return null;
        contentresolver = cursor;
        obj = cursor.getString(cursor.getColumnIndex("aid"));
label0:
        {
            contentresolver = ((ContentResolver) (obj));
            if (cursor == null)
            {
                break label0;
            }
            contentresolver = ((ContentResolver) (obj));
            try
            {
                if (cursor.isClosed())
                {
                    break label0;
                }
                cursor.close();
            }
            // Misplaced declaration of an exception variable
            catch (ContentResolver contentresolver)
            {
                contentresolver = ((ContentResolver) (obj));
                continue; /* Loop/switch isn't completed */
            }
            contentresolver = ((ContentResolver) (obj));
        }
_L6:
        return contentresolver;
        obj;
        cursor = null;
_L4:
        contentresolver = cursor;
        if (!Global.a)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        contentresolver = cursor;
        Log.e("KochavaTracker", (new StringBuilder("Problem getting FB attribution ID ")).append(((Exception) (obj)).toString()).toString());
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_219;
        }
        try
        {
            if (cursor.isClosed())
            {
                break MISSING_BLOCK_LABEL_219;
            }
            cursor.close();
        }
        // Misplaced declaration of an exception variable
        catch (ContentResolver contentresolver)
        {
            contentresolver = null;
            continue; /* Loop/switch isn't completed */
        }
        contentresolver = null;
        continue; /* Loop/switch isn't completed */
        exception;
        contentresolver = null;
_L2:
        if (contentresolver != null)
        {
            try
            {
                if (!contentresolver.isClosed())
                {
                    contentresolver.close();
                }
            }
            // Misplaced declaration of an exception variable
            catch (ContentResolver contentresolver) { }
        }
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        if (true) goto _L4; else goto _L3
_L3:
        contentresolver = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static String a(Feature feature)
    {
        return feature.H();
    }

    static JSONObject a(JSONObject jsonobject)
    {
        return b(jsonobject);
    }

    public static void a()
    {
        if (P)
        {
            if (Global.b)
            {
                Log.e("KochavaTracker", "Kochava library was not initialized properly. Until it is, this method cannot be used.");
            }
            return;
        }
        if (Global.a)
        {
            Log.e("KochavaTracker", "flush");
        }
        X.submit(new TrackTask(null));
    }

    protected static void a(int i1)
    {
        Z.schedule(ad, i1, TimeUnit.SECONDS);
    }

    private void a(Context context, boolean flag, HashMap hashmap)
    {
        boolean flag1 = true;
        if (context == null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        String s6;
        Context context1;
        String s7;
        String s8;
        l = context;
        if (Global.a)
        {
            Log.e("KochavaTracker", "Feature initialization");
        }
        if (c == null)
        {
            c = context.getApplicationContext();
        }
        V = l.getSharedPreferences("initPrefs", 0);
        K = new KochavaDbAdapter(l);
        if (hashmap != null)
        {
            if (hashmap.get("debug") != null && hashmap.get("debug").getClass().equals(java/lang/Boolean))
            {
                boolean flag2 = ((Boolean)hashmap.get("debug")).booleanValue();
                a(flag2);
                b(flag2);
            }
            if (hashmap.get("version_extension") != null && hashmap.get("version_extension").getClass().equals(java/lang/String))
            {
                a = (String)hashmap.get("version_extension");
            }
            if (hashmap.get("override_automatic_sessions") != null && hashmap.get("override_automatic_sessions").getClass().equals(java/lang/Boolean))
            {
                b = ((Boolean)hashmap.get("override_automatic_sessions")).booleanValue();
            }
        }
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        int i1;
        boolean flag3;
        if (android.os.Build.VERSION.SDK_INT >= 14 && !b)
        {
            Log.i("KochavaTracker", (new StringBuilder("using automatic sessions, overrideAutomaticSessions= ")).append(b).toString());
            ((Application)c).registerActivityLifecycleCallbacks(new LifeCycleTracker());
            c.registerComponentCallbacks(new MemoryBoss());
            AppLifeCycleStatusManager.a = true;
        } else
        {
            Log.i("KochavaTracker", (new StringBuilder("not using automatic sessions, overrideAutomaticSessions= ")).append(b).toString());
        }
        try
        {
            z = a(l.getContentResolver());
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        (new AsyncTask() {

            final Feature a;

            protected transient String a(Void avoid[])
            {
                avoid = null;
                String s9 = Feature.o(a);
                avoid = s9;
_L2:
                return avoid;
                Error error;
                error;
                if (Global.b)
                {
                    Log.e("KochavaTracker", "*****NOTICE***** \nAn error has occured when trying to gather the Google Advertising Id. Please make sure you have the Google Play Services Library integrated in your app! \n*****NOTICE*****");
                    return null;
                }
                if (true) goto _L2; else goto _L1
_L1:
            }

            protected void a(String s9)
            {
                Feature.d(s9);
                if (Global.a)
                {
                    Log.i("KochavaTracker", "ADID retrevial finished and gathered if available.");
                }
            }

            protected transient Object doInBackground(Object aobj[])
            {
                return a((Void[])aobj);
            }

            protected void onPostExecute(Object obj2)
            {
                a((String)obj2);
            }

            
            {
                a = Feature.this;
                super();
            }
        }).execute(new Void[0]);
        try
        {
            r = l.getPackageManager().getPackageInfo(l.getPackageName(), 0).packageName;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        d = new JSONObject();
        e = new JSONObject();
        f = new JSONObject();
        if (hashmap == null)
        {
            break MISSING_BLOCK_LABEL_2334;
        }
        if (hashmap.get("partner_name") != null && hashmap.get("partner_name").getClass().equals(java/lang/String))
        {
            s1 = (String)hashmap.get("partner_name");
        } else
        {
            s1 = null;
        }
        if (hashmap.get("kochava_app_id") != null && hashmap.get("kochava_app_id").getClass().equals(java/lang/String))
        {
            s2 = (String)hashmap.get("kochava_app_id");
        } else
        {
            s2 = null;
        }
        if (hashmap.get("currency") != null && hashmap.get("currency").getClass().equals(java/lang/String))
        {
            s3 = (String)hashmap.get("currency");
        } else
        {
            s3 = null;
        }
        if (hashmap.get("request_attribution") == null) goto _L4; else goto _L3
_L3:
        if (!hashmap.get("request_attribution").getClass().equals(java/lang/String)) goto _L6; else goto _L5
_L5:
        context = (String)hashmap.get("request_attribution");
_L16:
        if (hashmap.get("bidder_host") != null && hashmap.get("bidder_host").getClass().equals(java/lang/String))
        {
            s4 = (String)hashmap.get("bidder_host");
        } else
        {
            s4 = null;
        }
        if (hashmap.get("control_host") != null && hashmap.get("control_host").getClass().equals(java/lang/String))
        {
            s5 = (String)hashmap.get("control_host");
        } else
        {
            s5 = null;
        }
        if (hashmap.get("app_limit_tracking") != null && hashmap.get("app_limit_tracking").getClass().equals(java/lang/Boolean))
        {
            D = ((Boolean)hashmap.get("app_limit_tracking")).booleanValue();
        }
        if (hashmap.get("identity_link") == null || !(hashmap.get("identity_link") instanceof HashMap)) goto _L8; else goto _L7
_L7:
        g = (HashMap)hashmap.get("identity_link");
        h = new JSONObject();
        obj = g.entrySet().iterator();
_L17:
        flag3 = ((Iterator) (obj)).hasNext();
        if (flag3) goto _L9; else goto _L8
_L8:
        if (hashmap.get("clickData") != null && hashmap.get("clickData").getClass().equals(java/lang/String))
        {
            t = (String)hashmap.get("clickData");
        }
        obj = s1;
        obj1 = s2;
        s6 = s3;
        context1 = context;
        s7 = s4;
        s8 = s5;
        if (hashmap.get("flush_rate") != null)
        {
            obj = s1;
            obj1 = s2;
            s6 = s3;
            context1 = context;
            s7 = s4;
            s8 = s5;
            if (hashmap.get("flush_rate").getClass().equals(java/lang/Integer))
            {
                i1 = ((Integer)hashmap.get("flush_rate")).intValue();
                if (i1 < 1)
                {
                    obj = s1;
                    obj1 = s2;
                    s6 = s3;
                    context1 = context;
                    s7 = s4;
                    s8 = s5;
                    if (Global.a)
                    {
                        Log.i("KochavaTracker", (new StringBuilder("Trying to set flush rate to: ")).append(i1).append(". Flush rate can only be set to between 1 minute and 6 hours (360 minutes). Setting flush rate to 1 minute.").toString());
                        s8 = s5;
                        s7 = s4;
                        context1 = context;
                        s6 = s3;
                        obj1 = s2;
                        obj = s1;
                    }
                } else
                if (i1 > 360)
                {
                    if (Global.a)
                    {
                        Log.i("KochavaTracker", (new StringBuilder("Trying to set flush rate to: ")).append(i1).append(". Flush rate can only be set to between 1 minute and 6 hours (360 minutes). Setting flush rate to 6 hours.").toString());
                    }
                    k = 0x1499700;
                    obj = s1;
                    obj1 = s2;
                    s6 = s3;
                    context1 = context;
                    s7 = s4;
                    s8 = s5;
                } else
                {
                    k = i1 * 60 * 1000;
                    obj = s1;
                    obj1 = s2;
                    s6 = s3;
                    context1 = context;
                    s7 = s4;
                    s8 = s5;
                    if (Global.a)
                    {
                        Log.i("KochavaTracker", (new StringBuilder("Flush rate set to ")).append(i1).append(" minutes.").toString());
                        obj = s1;
                        obj1 = s2;
                        s6 = s3;
                        context1 = context;
                        s7 = s4;
                        s8 = s5;
                    }
                }
            }
        }
_L21:
        if (s8 != null && s8.trim().length() != 0)
        {
            i = s8;
        }
        if (s7 != null && s7.trim().length() != 0)
        {
            j = s7;
        }
        if (s6 != null && s6.length() != 0)
        {
            f(s6);
        }
        if (context1 != null && context1.equalsIgnoreCase("true"))
        {
            S = true;
        }
        W = l.getSharedPreferences("attributionPref", 0);
        if (obj1 == null) goto _L11; else goto _L10
_L10:
        if (((String) (obj1)).trim().length() == 0) goto _L11; else goto _L12
_L12:
        u = ((String) (obj1));
        e.put("kochava_app_id", obj1);
        f.put("kochava_app_id", obj1);
        if (V.getString("kochavaappdata", "").equals(""))
        {
            V.edit().putString("kochavaappdata", ((String) (obj1))).commit();
        }
_L18:
        d.put("package", B());
        d.put("platform", "android");
        d.put("session_tracking", "full");
        d.put("currency", V.getString("currency", "USD"));
        f.put("currency", V.getString("currency", "USD"));
        f.put("session_tracking", "full");
        f.put("currency", V.getString("currency", "USD"));
        e.put("sdk_version", (new StringBuilder("Android20141023")).append(a).toString());
        e.put("sdk_protocol", "3");
        e.put("data", d);
        e.put("data_orig", f);
_L19:
        G = System.currentTimeMillis() / 1000L;
        hashmap = "";
        context = new ComponentName(l, com/kochava/android/tracker/ReferralCapture);
        l.getPackageManager().getReceiverInfo(context, 0);
        if (!Global.a) goto _L14; else goto _L13
_L13:
        Log.e("KochavaTracker", "Receiver registered.");
        i1 = 0;
_L20:
        context = hashmap;
        if (l.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", l.getPackageName()) < 0)
        {
            context = (new StringBuilder(String.valueOf(hashmap))).append("\n    PERMMISION MISSING: android.permission.ACCESS_NETWORK_STATE").toString();
            i1 = 1;
        }
        hashmap = context;
        if (l.getPackageManager().checkPermission("android.permission.INTERNET", l.getPackageName()) < 0)
        {
            hashmap = (new StringBuilder(String.valueOf(context))).append("\n    PERMMISION MISSING: android.permission.INTERNET").toString();
            i1 = 1;
        }
        if (l.getPackageManager().checkPermission("android.permission.ACCESS_WIFI_STATE", l.getPackageName()) < 0)
        {
            hashmap = (new StringBuilder(String.valueOf(hashmap))).append("\n    PERMMISION MISSING: android.permission.ACCESS_WIFI_STATE").toString();
            i1 = ((flag1) ? 1 : 0);
        }
        if (i1 != 0)
        {
            if (Global.b)
            {
                Log.e("KochavaRequirements", "**NOTICE** The following items may not have been implemented correctly. Please refer to the Kochava SDK documentation to resolve these issues:");
            }
            if (Global.b)
            {
                Log.e("KochavaRequirements", hashmap);
            }
        }
        try
        {
            v = ((TelephonyManager)l.getSystemService("phone")).getDeviceId();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            if (Global.b)
            {
                Log.e("KochavaTracker", (new StringBuilder("Couldn't gather IMEI: ")).append(context.toString()).toString());
            }
        }
        try
        {
            H = ((WifiManager)l.getSystemService("wifi")).getConnectionInfo().getMacAddress();
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        try
        {
            e.put("kochava_device_id", E());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
        context = new Runnable(flag) {

            final Feature a;
            private final boolean b;

            public void run()
            {
                Object obj2;
                if (Global.a)
                {
                    Log.i("KochavaTracker", "getKVinit thread started.");
                }
                if (Global.a)
                {
                    Log.i("KochavaTracker", (new StringBuilder("getKVinit post: ")).append(a.e.toString()).toString());
                }
                obj2 = Feature.c(true);
                HttpProtocolParams.setUserAgent(((HttpClient) (obj2)).getParams(), Feature.b());
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
                Object obj4 = a.e.toString();
                if (Global.a)
                {
                    Log.i("KochavaTracker", (new StringBuilder("kvinit data:")).append(((String) (obj4))).toString());
                }
                obj4 = new StringEntity(((String) (obj4)), "UTF-8");
                BasicHeader basicheader = new BasicHeader("Content-Type", "application/xml");
                httppost.getParams().setBooleanParameter("http.protocol.expect-continue", false);
                ((StringEntity) (obj4)).setContentType(basicheader);
                httppost.setEntity(((HttpEntity) (obj4)));
                if (Global.a)
                {
                    Log.e("KochavaTracker", "Trying to post to KVinit.");
                }
                obj2 = ((HttpClient) (obj2)).execute(httppost).getEntity();
                if (obj2 != null) goto _L2; else goto _L1
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
                obj2 = StringUtils.a(((HttpEntity) (obj2)).getContent());
                if (Global.a)
                {
                    Log.e("KochavaTracker", (new StringBuilder("(KVinit) Result: ")).append(((String) (obj2))).toString());
                }
                JSONObject jsonobject = new JSONObject(((String) (obj2)));
_L34:
                if (jsonobject == null) goto _L4; else goto _L3
_L3:
                if (Global.a)
                {
                    Log.e("KochavaTracker", (new StringBuilder("(KVinit) Parsed result: ")).append(jsonobject.toString()).toString());
                }
                obj2 = jsonobject.getJSONObject("flags");
                Object obj3 = obj2;
                if (!Global.a) goto _L6; else goto _L5
_L5:
                Log.i("KochavaTracker", (new StringBuilder("Flags: ")).append(((JSONObject) (obj2)).toString()).toString());
_L35:
                if (obj2 == null) goto _L8; else goto _L7
_L7:
                obj3 = ((JSONObject) (obj2)).getString("kochava_app_id");
                if (Global.a)
                {
                    Log.i("KochavaTracker", (new StringBuilder("kochava_app_id: ")).append(((String) (obj3)).toString()).toString());
                }
                Feature.e(((String) (obj3)));
_L21:
                if (((JSONObject) (obj2)).get("session_tracking").equals("none"))
                {
                    Feature.d(false);
                }
_L24:
                int j1;
                int k1;
                try
                {
                    obj3 = ((String)((JSONObject) (obj2)).get("currency")).toUpperCase();
                    if (Global.a)
                    {
                        Log.e("KochavaTracker", (new StringBuilder("setting currency to: ")).append(((String) (obj3))).toString());
                    }
                    Feature.h(a, ((String) (obj3)));
                }
                // Misplaced declaration of an exception variable
                catch (Object obj3) { }
                try
                {
                    if (((JSONObject) (obj2)).get("resend_initial").equals("true"))
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
                catch (Object obj2) { }
_L8:
                obj2 = jsonobject.getJSONArray("blacklist");
                if (Global.a)
                {
                    Log.i("KochavaTracker", (new StringBuilder("blacklist: ")).append(((JSONArray) (obj2)).toString()).toString());
                }
                  goto _L9
_L33:
                k1 = ((JSONArray) (obj2)).length();
                if (j1 < k1) goto _L11; else goto _L10
_L10:
                obj2 = jsonobject.getJSONArray("whitelist");
                if (Global.a)
                {
                    Log.i("KochavaTracker", (new StringBuilder("whitelist: ")).append(((JSONArray) (obj2)).toString()).toString());
                }
                  goto _L12
_L28:
                k1 = ((JSONArray) (obj2)).length();
                if (j1 < k1) goto _L14; else goto _L13
_L13:
                obj2 = jsonobject.getJSONArray("eventname_blacklist");
                if (Global.a)
                {
                    Log.i("KochavaTracker", (new StringBuilder("saving eventname_blacklist: ")).append(((JSONArray) (obj2)).toString()).toString());
                }
                Feature.o().clear();
                j1 = 0;
_L29:
                k1 = ((JSONArray) (obj2)).length();
                if (j1 < k1) goto _L16; else goto _L15
_L15:
                obj2 = jsonobject.getString("error");
                if (Global.b)
                {
                    Log.e("KochavaTracker", (new StringBuilder("There was a problem getting the KVinit response: ")).append(((String) (obj2))).toString());
                }
_L4:
                if (Global.a)
                {
                    Log.i("KochavaTracker", "getKVinit thread ended, sending message to initHandler.");
                }
                obj2 = Message.obtain();
                obj3 = new Bundle();
                ((Bundle) (obj3)).putBoolean("sendonstart", b);
                ((Message) (obj2)).setData(((Bundle) (obj3)));
                Feature.p(a).sendMessage(((Message) (obj2)));
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
                obj2;
                if (Global.b)
                {
                    Log.e("KochavaTracker", (new StringBuilder("Error while parsing result json: ")).append(((JSONException) (obj2)).toString()).toString());
                }
                  goto _L18
_L32:
                obj3 = obj2;
                if (!Global.a) goto _L6; else goto _L19
_L19:
                Log.e("KochavaTracker", "KVinit response did not contain flags.");
                obj3 = obj2;
                  goto _L6
                obj3;
                if (!Global.a) goto _L21; else goto _L20
_L20:
                Log.e("KochavaTracker", "KVinit response did not contain a kochava_app_id.");
                  goto _L21
                obj2;
                if (!Global.a) goto _L17; else goto _L22
_L22:
                Log.e("KochavaTracker", "TrackTask", ((Throwable) (obj2)));
                return;
                obj2;
                if (Global.a)
                {
                    Log.e("KochavaTracker", "TrackTask", ((Throwable) (obj2)));
                    return;
                }
                  goto _L17
                obj3;
                if (!Global.a) goto _L24; else goto _L23
_L23:
                Log.e("KochavaTracker", "KVinit response did not contain flags.");
                  goto _L24
                obj2;
                if (!Global.a) goto _L17; else goto _L25
_L25:
                Log.e("KochavaTracker", "TrackTask", ((Throwable) (obj2)));
                return;
                obj2;
                if (!Global.a) goto _L17; else goto _L26
_L26:
                Log.e("KochavaTracker", "TrackTask", ((Throwable) (obj2)));
                return;
_L11:
                if (((JSONArray) (obj2)).get(j1).toString().toLowerCase().equals("android_id"))
                {
                    if (Global.a)
                    {
                        Log.i("KochavaTracker", "disabling: android_id");
                    }
                    Feature.n().put("android_id", Boolean.valueOf(false));
                    break MISSING_BLOCK_LABEL_1648;
                }
                if (((JSONArray) (obj2)).get(j1).toString().toLowerCase().equals("fb_attribution_id"))
                {
                    if (Global.a)
                    {
                        Log.i("KochavaTracker", "disabling: fb_attribution_id");
                    }
                    Feature.n().put("fb_attribution_id", Boolean.valueOf(false));
                    break MISSING_BLOCK_LABEL_1648;
                }
                break MISSING_BLOCK_LABEL_1243;
                obj2;
                if (!Global.a) goto _L10; else goto _L27
_L27:
                Log.e("KochavaTracker", "KVinit response did not contain a blacklist.");
                  goto _L10
                obj2;
                if (Global.b)
                {
                    Log.e("KochavaTracker", "Unexpected error during KVinit communication.", ((Throwable) (obj2)));
                }
                  goto _L4
                if (((JSONArray) (obj2)).get(j1).toString().toLowerCase().equals("imei"))
                {
                    if (Global.a)
                    {
                        Log.i("KochavaTracker", "disabling: imei");
                    }
                    Feature.n().put("imei", Boolean.valueOf(false));
                    break MISSING_BLOCK_LABEL_1648;
                }
                if (((JSONArray) (obj2)).get(j1).toString().toLowerCase().equals("mac"))
                {
                    if (Global.a)
                    {
                        Log.i("KochavaTracker", "disabling: mac");
                    }
                    Feature.n().put("mac", Boolean.valueOf(false));
                    break MISSING_BLOCK_LABEL_1648;
                }
                if (((JSONArray) (obj2)).get(j1).toString().toLowerCase().equals("odin"))
                {
                    if (Global.a)
                    {
                        Log.i("KochavaTracker", "disabling: odin");
                    }
                    Feature.n().put("odin", Boolean.valueOf(false));
                    break MISSING_BLOCK_LABEL_1648;
                }
                if (((JSONArray) (obj2)).get(j1).toString().toLowerCase().equals("adid"))
                {
                    if (Global.a)
                    {
                        Log.i("KochavaTracker", "disabling: adid");
                    }
                    Feature.n().put("adid", Boolean.valueOf(false));
                }
                break MISSING_BLOCK_LABEL_1648;
_L14:
                if (((JSONArray) (obj2)).get(j1).toString().toLowerCase().equals("email"))
                {
                    if (Global.a)
                    {
                        Log.i("KochavaTracker", "sending emails");
                    }
                    Feature.e(true);
                }
                j1++;
                  goto _L28
_L16:
                if (Global.a)
                {
                    Log.i("KochavaTracker", (new StringBuilder("eventname_blacklist item: ")).append(((JSONArray) (obj2)).get(j1).toString()).toString());
                }
                Feature.o().add(((JSONArray) (obj2)).get(j1).toString());
                j1++;
                  goto _L29
                obj2;
                if (!Global.a) goto _L15; else goto _L30
_L30:
                Log.e("KochavaTracker", "KVinit response did not contain an eventname_blacklist.");
                  goto _L15
                obj2;
                if (!Global.a) goto _L4; else goto _L31
_L31:
                Log.e("KochavaTracker", "KVinit response did not contain an error.");
                  goto _L4
                obj2;
                  goto _L13
                obj3;
                  goto _L32
_L9:
                j1 = 0;
                  goto _L33
_L12:
                j1 = 0;
                  goto _L28
_L18:
                jsonobject = null;
                  goto _L34
                obj2;
                obj2 = null;
                  goto _L32
_L6:
                obj2 = obj3;
                  goto _L35
                j1++;
                  goto _L33
            }

            
            {
                a = Feature.this;
                b = flag;
                super();
            }
        };
        Z.schedule(context, 5L, TimeUnit.SECONDS);
        a("init");
        return;
_L2:
        if (Global.b)
        {
            Log.e("KochavaTracker", "Context you passed was null, cannot initialize.");
        }
        P = true;
        return;
_L6:
        if (!hashmap.get("request_attribution").getClass().equals(java/lang/Boolean) || !((Boolean)hashmap.get("request_attribution")).booleanValue()) goto _L4; else goto _L15
_L15:
        context = "true";
          goto _L16
_L9:
        obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
        h.put((String)((java.util.Map.Entry) (obj1)).getKey(), (String)((java.util.Map.Entry) (obj1)).getValue());
        ((Iterator) (obj)).remove();
          goto _L17
        obj;
          goto _L8
_L11:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_2183;
        }
        if (((String) (obj)).trim().length() == 0)
        {
            break MISSING_BLOCK_LABEL_2183;
        }
        d.put("partner_name", obj);
        if (V.getString("kochavaappdata", "").equals(""))
        {
            V.edit().putString("kochavaappdata", ((String) (obj))).commit();
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_2159;
        }
        if (((String) (obj1)).trim().length() == 0)
        {
            break MISSING_BLOCK_LABEL_2159;
        }
        u = ((String) (obj1));
        e.put("kochava_app_id", obj1);
        f.put("kochava_app_id", obj1);
          goto _L18
        try
        {
            if (Global.b)
            {
                Log.e("KochavaTracker", "Kochava requires that you pass either a kochava app id, or a partner name into the datamap during initialization.");
            }
            P = true;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        if (Global.b)
        {
            Log.e("KochavaTracker", (new StringBuilder("Error building KVinit json object: ")).append(context.toString()).toString());
        }
          goto _L19
        u = (new StringBuilder("_p:")).append(((String) (obj))).toString();
          goto _L18
        context;
        hashmap = (new StringBuilder(String.valueOf(""))).append("\n    BROADCAST RECEIVER REGISTRATION MISSING: com.android.kochava.tracker.ReferralCapture").toString();
        i1 = 1;
          goto _L20
_L14:
        i1 = 0;
          goto _L20
_L4:
        context = null;
          goto _L16
        s8 = null;
        s7 = null;
        context1 = null;
        s6 = null;
        obj1 = null;
        obj = null;
          goto _L21
    }

    static void a(SharedPreferences sharedpreferences)
    {
        V = sharedpreferences;
    }

    static void a(Feature feature, int i1)
    {
        feature.A = i1;
    }

    static void a(Feature feature, String s1)
    {
        feature.m = s1;
    }

    static void a(Feature feature, String s1, Map map)
    {
        feature.b(s1, map);
    }

    static void a(Feature feature, Timer timer)
    {
        feature.M = timer;
    }

    static void a(Feature feature, boolean flag)
    {
        feature.L = flag;
    }

    private void a(String s1, Map map)
    {
        String s2;
        s2 = (String)map.get("event_name");
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        if (ac.contains(map.get("event_name"))) goto _L2; else goto _L1
_L1:
        b(s1, map);
_L4:
        return;
_L2:
        if (!Global.a) goto _L4; else goto _L3
_L3:
        Log.e("KochavaTracker", (new StringBuilder("fireEvent - Events under the key \"")).append(s2).append("\" are blocked!").toString());
        return;
        b(s1, map);
        return;
    }

    public static void a(boolean flag)
    {
        Log.i("KochavaTracker", (new StringBuilder("enableDebug to ")).append(flag).toString());
        Global.a = flag;
    }

    static String b()
    {
        return y;
    }

    static String b(Feature feature)
    {
        return feature.x();
    }

    private static JSONObject b(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        jsonobject.put("usertime", (new StringBuilder(String.valueOf(System.currentTimeMillis() / 1000L))).toString());
        jsonobject.put("uptime", (new StringBuilder(String.valueOf(System.currentTimeMillis() / 1000L - G))).toString());
        if (F == 0L)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        jsonobject.put("updelta", (new StringBuilder(String.valueOf(System.currentTimeMillis() / 1000L - F))).toString());
_L1:
        F = System.currentTimeMillis() / 1000L;
        V = c.getSharedPreferences("initPrefs", 0);
        if (V.getString("mylat", "").equals(""))
        {
            break MISSING_BLOCK_LABEL_223;
        }
        jsonobject.put("geo_lat", V.getString("mylat", ""));
        jsonobject.put("geo_lon", V.getString("mylong", ""));
        return jsonobject;
        jsonobject.put("updelta", "0");
          goto _L1
        Exception exception;
        exception;
        if (Global.a)
        {
            Log.e("KochavaTracker", "Error adding time properties to a JSON object");
        }
        return jsonobject;
    }

    static void b(Feature feature, int i1)
    {
        feature.B = i1;
    }

    static void b(Feature feature, String s1)
    {
        feature.n = s1;
    }

    static void b(Feature feature, Timer timer)
    {
        feature.O = timer;
    }

    static void b(Feature feature, boolean flag)
    {
        feature.f(flag);
    }

    static void b(String s1)
    {
        i = s1;
    }

    private void b(String s1, Map map)
    {
        JSONObject jsonobject;
        if (Global.a)
        {
            Log.e("KochavaTracker", (new StringBuilder("FIRE EVENT*** action:")).append(s1).toString());
        }
        if (Global.a)
        {
            Log.e("KochavaTracker", (new StringBuilder("FIRE EVENT*** properties:")).append(map).toString());
        }
        jsonobject = new JSONObject();
        JSONObject jsonobject1;
        jsonobject.put("kochava_app_id", u);
        jsonobject.put("kochava_device_id", E());
        jsonobject.put("action", s1);
        jsonobject.put("dev_id_strategy", x);
        jsonobject.put("last_post_time", 0);
        V = l.getSharedPreferences("initPrefs", 0);
        jsonobject.put("currency", V.getString("currency", "USD"));
        jsonobject1 = b(new JSONObject());
        if (!s1.equals("initial"))
        {
            break MISSING_BLOCK_LABEL_827;
        }
        if (Global.a)
        {
            Log.e("KochavaTracker", "Event is initial, or initial did not get que'd on first load");
        }
        jsonobject.put("sdk_version", (new StringBuilder("Android20141023")).append(a).toString());
        if (((Boolean)ab.get("adid")).booleanValue())
        {
            jsonobject1.put("adid", C);
        }
        jsonobject1.put("device", (new StringBuilder(String.valueOf(y()))).append("-").append(x()).toString());
        if (((Boolean)ab.get("imei")).booleanValue())
        {
            jsonobject1.put("imei", D());
        }
        jsonobject1.put("disp_h", A);
        jsonobject1.put("disp_w", B);
        jsonobject1.put("package_name", B());
        jsonobject1.put("app_version", C());
        if (!q.equals(""))
        {
            jsonobject1.put("app_short_string", q);
        }
        if (((Boolean)ab.get("android_id")).booleanValue())
        {
            jsonobject1.put("android_id", w);
        }
        jsonobject1.put("os_version", z());
        jsonobject1.put("app_limit_tracking", D);
        jsonobject1.put("device_limit_tracking", E);
        s1 = new JSONObject();
        if (R)
        {
            String s2 = J();
            if (!s2.equals("[]"))
            {
                s1.put("email", s2);
            }
        }
        if (s1.length() > 0)
        {
            jsonobject1.put("ids", s1);
        }
        if (h != null)
        {
            jsonobject1.put("identity_link", h);
        }
        if (((Boolean)ab.get("odin")).booleanValue())
        {
            jsonobject1.put("odin", F());
        }
        if (((Boolean)ab.get("mac")).booleanValue())
        {
            jsonobject1.put("mac", H);
        }
        if (t != null && !t.isEmpty())
        {
            jsonobject1.put("clickData", t);
        }
        if (((Boolean)ab.get("fb_attribution_id")).booleanValue())
        {
            z = a(l.getContentResolver());
            if (z != null)
            {
                break MISSING_BLOCK_LABEL_744;
            }
            jsonobject1.put("fb_attribution_id", "");
        }
_L2:
        s1 = (WindowManager)l.getSystemService("window");
        DisplayMetrics displaymetrics = new DisplayMetrics();
        s1.getDefaultDisplay().getMetrics(displaymetrics);
        U = jsonobject1;
        T = jsonobject;
        if (Global.a)
        {
            Log.e("KochavaTracker", "Initial Event, saving until next event. ");
            return;
        }
        break MISSING_BLOCK_LABEL_1021;
        jsonobject1.put("fb_attribution_id", z);
        if (true) goto _L2; else goto _L1
_L1:
        s1;
        try
        {
            s1.printStackTrace();
            if (Global.a)
            {
                Log.e("KochavaTracker", "event", s1);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            if (Global.a)
            {
                Log.e("KochavaTracker", "event", s1);
                return;
            }
        }
        break MISSING_BLOCK_LABEL_1021;
        s1;
        if (Global.b)
        {
            Log.e("KochavaTracker", "Error during fireEvent - Please review stack trace");
        }
        s1.printStackTrace();
_L12:
        if (J == null) goto _L4; else goto _L3
_L3:
        s1 = J.entrySet().iterator();
_L9:
        if (s1.hasNext()) goto _L5; else goto _L4
_L4:
        if (map == null) goto _L7; else goto _L6
_L6:
        s1 = map.entrySet().iterator();
_L10:
        if (s1.hasNext()) goto _L8; else goto _L7
_L7:
        jsonobject.put("data", jsonobject1);
        if (Global.a)
        {
            Log.i("KochavaTracker", (new StringBuilder("fireEvent with properties: ")).append(jsonobject).toString());
        }
        f(true);
        if (K.a(jsonobject) >= 50)
        {
            a();
            return;
        }
        break MISSING_BLOCK_LABEL_1021;
_L5:
        java.util.Map.Entry entry = (java.util.Map.Entry)s1.next();
        jsonobject1.put((String)entry.getKey(), entry.getValue());
          goto _L9
_L8:
        map = (java.util.Map.Entry)s1.next();
        jsonobject1.put((String)map.getKey(), map.getValue());
          goto _L10
        s1;
        continue; /* Loop/switch isn't completed */
        s1;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public static void b(boolean flag)
    {
        Log.i("KochavaTracker", (new StringBuilder("setErrorDebug to ")).append(flag).toString());
        Global.b = flag;
    }

    static String c()
    {
        return i;
    }

    static String c(Feature feature)
    {
        return feature.y();
    }

    static HttpClient c(boolean flag)
    {
        return g(flag);
    }

    static void c(Feature feature, String s1)
    {
        feature.o = s1;
    }

    static void c(Feature feature, Timer timer)
    {
        feature.N = timer;
    }

    static void c(String s1)
    {
        y = s1;
    }

    static Context d(Feature feature)
    {
        return feature.l;
    }

    static String d()
    {
        return u;
    }

    static void d(Feature feature, String s1)
    {
        feature.p = s1;
    }

    static void d(String s1)
    {
        C = s1;
    }

    static void d(boolean flag)
    {
        Q = flag;
    }

    static String e()
    {
        return E();
    }

    static String e(Feature feature)
    {
        return feature.o;
    }

    static void e(Feature feature, String s1)
    {
        feature.q = s1;
    }

    static void e(String s1)
    {
        u = s1;
    }

    static void e(boolean flag)
    {
        R = flag;
    }

    static SharedPreferences f()
    {
        return W;
    }

    static String f(Feature feature)
    {
        return feature.p;
    }

    static void f(Feature feature, String s1)
    {
        feature.w = s1;
    }

    private void f(String s1)
    {
        if (s1 != null && Global.c.contains(s1))
        {
            V = l.getSharedPreferences("initPrefs", 0);
            V.edit().putString("currency", s1).commit();
        } else
        if (Global.b)
        {
            Log.e("KochavaTracker", (new StringBuilder("Trying to set currency, but ")).append(s1).append(" is not a valid currency.").toString());
            return;
        }
    }

    private void f(boolean flag)
    {
        if (!V.getString("initBool", "").equals("false") || U == null || T == null)
        {
            break MISSING_BLOCK_LABEL_325;
        }
        if (Global.a)
        {
            Log.e("KochavaTracker", (new StringBuilder("Initial properties: ")).append(U).toString());
        }
        if (Global.a)
        {
            Log.e("KochavaTracker", (new StringBuilder("Initital Oject: ")).append(T).toString());
        }
        if (V.getString("initData", "noData").equals("noData")) goto _L2; else goto _L1
_L1:
        U.put("conversion_type", "gplay");
        U.put("conversion_data", V.getString("initData", ""));
        if (Global.a)
        {
            Log.e("KochavaTracker", (new StringBuilder("Got referral, attaching: ")).append(V.getString("initData", "")).toString());
        }
_L4:
        T.put("data", U);
        K.a(T);
        if (Global.a)
        {
            Log.e("KochavaTracker", "Sending Initial");
        }
        V.edit().putString("initBool", "true").commit();
        if (flag)
        {
            try
            {
                O.cancel();
                return;
            }
            catch (JSONException jsonexception)
            {
                if (Global.a)
                {
                    Log.e("KochavaTracker", "An error occured during que initial.", jsonexception);
                }
                jsonexception.printStackTrace();
            }
        }
        break MISSING_BLOCK_LABEL_325;
_L2:
        if (!Global.a) goto _L4; else goto _L3
_L3:
        Log.e("KochavaTracker", "Did not get referral data.");
          goto _L4
    }

    static Handler g()
    {
        return Y;
    }

    static String g(Feature feature)
    {
        return feature.q;
    }

    private static HttpClient g(boolean flag)
    {
        if (Global.a)
        {
            Log.e("KochavaTracker", "Creating https client.");
        }
        X509HostnameVerifier x509hostnameverifier = SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER;
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpProtocolParams.setVersion(basichttpparams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setContentCharset(basichttpparams, "ISO-8859-1");
        HttpProtocolParams.setUseExpectContinue(basichttpparams, true);
        if (flag)
        {
            HttpConnectionParams.setConnectionTimeout(basichttpparams, 10000);
        }
        Object obj = SSLSocketFactory.getSocketFactory();
        ((SSLSocketFactory) (obj)).setHostnameVerifier((X509HostnameVerifier)x509hostnameverifier);
        SchemeRegistry schemeregistry = new SchemeRegistry();
        schemeregistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeregistry.register(new Scheme("https", ((org.apache.http.conn.scheme.SocketFactory) (obj)), 443));
        obj = new ThreadSafeClientConnManager(basichttpparams, schemeregistry);
        HttpsURLConnection.setDefaultHostnameVerifier(x509hostnameverifier);
        return new DefaultHttpClient(((org.apache.http.conn.ClientConnectionManager) (obj)), basichttpparams);
    }

    static void g(Feature feature, String s1)
    {
        feature.s = s1;
    }

    private static void g(String s1)
    {
        (new Thread(s1) {

            private final String a;

            public void run()
            {
                JSONObject jsonobject;
                Object obj;
                if (Global.a)
                {
                    Log.e("KochavaTracker", (new StringBuilder("Got event ")).append(a).toString());
                }
                obj = new HashMap();
                ((HashMap) (obj)).put("state", a);
                if (Global.a)
                {
                    Log.e("KochavaTracker", (new StringBuilder("FIRE EVENT*** action:")).append("session").toString());
                }
                if (Global.a)
                {
                    Log.e("KochavaTracker", (new StringBuilder("FIRE EVENT*** properties:")).append(obj).toString());
                }
                jsonobject = new JSONObject();
                JSONObject jsonobject1;
                jsonobject.put("kochava_app_id", Feature.d());
                jsonobject.put("kochava_device_id", Feature.e());
                jsonobject.put("action", "session");
                jsonobject.put("dev_id_strategy", Feature.s());
                jsonobject1 = Feature.a(new JSONObject());
                if (Feature.t() == null) goto _L2; else goto _L1
_L1:
                Iterator iterator = Feature.t().entrySet().iterator();
_L6:
                if (iterator.hasNext()) goto _L3; else goto _L2
_L2:
                if (obj == null) goto _L5; else goto _L4
_L4:
                obj = ((HashMap) (obj)).entrySet().iterator();
_L9:
                if (((Iterator) (obj)).hasNext())
                {
                    break MISSING_BLOCK_LABEL_329;
                }
_L5:
                jsonobject.put("data", jsonobject1);
                if (Global.a)
                {
                    Log.i("KochavaTracker", (new StringBuilder("fireEvent with properties: ")).append(jsonobject).toString());
                }
                if (Feature.i().a(jsonobject) >= 50)
                {
                    Feature.a();
                }
_L8:
                return;
_L3:
                java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator.next();
                jsonobject1.put((String)entry1.getKey(), entry1.getValue());
                  goto _L6
                JSONException jsonexception;
                jsonexception;
                jsonexception.printStackTrace();
                if (!Global.a) goto _L8; else goto _L7
_L7:
                Log.e("KochavaTracker", "event", jsonexception);
                return;
                java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                jsonobject1.put((String)entry.getKey(), entry.getValue());
                  goto _L9
            }

            
            {
                a = s1;
                super();
            }
        }).start();
    }

    static int h(Feature feature)
    {
        return feature.A;
    }

    static SharedPreferences h()
    {
        return V;
    }

    static void h(Feature feature, String s1)
    {
        feature.f(s1);
    }

    private static boolean h(String s1)
    {
        boolean flag = false;
        if (Pattern.compile("^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$", 2).matcher(s1).matches())
        {
            flag = true;
        }
        return flag;
    }

    static int i(Feature feature)
    {
        return feature.B;
    }

    static KochavaDbAdapter i()
    {
        return K;
    }

    static int j()
    {
        return k;
    }

    static String j(Feature feature)
    {
        return feature.u();
    }

    static String k()
    {
        return G();
    }

    static boolean k(Feature feature)
    {
        return feature.L;
    }

    static Timer l(Feature feature)
    {
        return feature.M;
    }

    static void l()
    {
        v();
    }

    static Timer m(Feature feature)
    {
        return feature.O;
    }

    static void m()
    {
        w();
    }

    static HashMap n()
    {
        return ab;
    }

    static Timer n(Feature feature)
    {
        return feature.N;
    }

    static String o(Feature feature)
    {
        return feature.I();
    }

    static ArrayList o()
    {
        return ac;
    }

    static Handler p(Feature feature)
    {
        return feature.ae;
    }

    static boolean p()
    {
        return S;
    }

    static boolean q()
    {
        return E;
    }

    static boolean q(Feature feature)
    {
        return feature.A();
    }

    static String r()
    {
        return C;
    }

    static boolean r(Feature feature)
    {
        return feature.D;
    }

    static String s()
    {
        return x;
    }

    static String s(Feature feature)
    {
        return feature.C();
    }

    static String t(Feature feature)
    {
        return feature.z();
    }

    static Map t()
    {
        return J;
    }

    private String u()
    {
        return (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(""))).append(E()).append(":::").toString()))).append(y()).append(":::").toString()))).append(x()).append(":::").toString()))).append(D()).append(":::").toString()))).append(C()).append(":::").toString()))).append(z()).toString();
    }

    private static void v()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14 && !b)
        {
            if (P)
            {
                if (Global.b)
                {
                    Log.e("KochavaTracker", "Kochava library was not initialized properly. Until it is, this method cannot be used.");
                }
            } else
            {
                if (Global.a)
                {
                    Log.e("KochavaTracker", "Automatic Session start");
                }
                G = System.currentTimeMillis() / 1000L;
                if (Q)
                {
                    g("launch");
                    return;
                }
                if (Global.a)
                {
                    Log.e("KochavaTracker", "Session events disabled by server.");
                    return;
                }
            }
        }
    }

    private static void w()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14 && !b)
        {
            if (P)
            {
                if (Global.b)
                {
                    Log.e("KochavaTracker", "Kochava library was not initialized properly. Until it is, this method cannot be used.");
                }
            } else
            {
                if (Global.a)
                {
                    Log.e("KochavaTracker", "Automatic Session End");
                }
                if (Q)
                {
                    g("exit");
                    return;
                }
                if (Global.a)
                {
                    Log.e("KochavaTracker", "Session events disabled by server.");
                    return;
                }
            }
        }
    }

    private String x()
    {
        return Build.BRAND;
    }

    private String y()
    {
        return Build.MODEL;
    }

    private String z()
    {
        return (new StringBuilder("Android ")).append(android.os.Build.VERSION.RELEASE).toString();
    }

    protected void a(String s1)
    {
        s1 = new Runnable(s1) {

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
                String s2 = (String)((Iterator) (obj3)).next();
                ((JSONObject) (obj2)).put(s2, ((HashMap) (obj1)).get(s2));
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

            
            {
                a = Feature.this;
                b = s1;
                super();
            }
        };
        Z.schedule(s1, 10L, TimeUnit.SECONDS);
    }

    public void a(String s1, String s2)
    {
        if (P)
        {
            if (Global.b)
            {
                Log.e("KochavaTracker", "Kochava library was not initialized properly. Until it is, this method cannot be used.");
            }
        } else
        {
            try
            {
                if (Global.a)
                {
                    Log.e("KochavaTracker", (new StringBuilder("Got event ")).append(s1).toString());
                }
                HashMap hashmap = new HashMap();
                hashmap.put("event_name", s1);
                hashmap.put("event_data", s2);
                a("event", ((Map) (hashmap)));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
            if (Global.a)
            {
                Log.e("KochavaTracker", (new StringBuilder("Error in event call: ")).append(s1).toString());
                return;
            }
        }
    }


    private class TrackTask
        implements Runnable
    {

        public void run()
        {
            Feature.k();
        }

        private TrackTask()
        {
        }

        TrackTask(TrackTask tracktask)
        {
            this();
        }
    }


    private class LifeCycleTracker
        implements android.app.Application.ActivityLifecycleCallbacks
    {

        final Feature a;

        public void onActivityCreated(Activity activity, Bundle bundle)
        {
        }

        public void onActivityDestroyed(Activity activity)
        {
        }

        public void onActivityPaused(Activity activity)
        {
        }

        public void onActivityResumed(Activity activity)
        {
            Log.i("KochavaTracker", "Tracking Activity Resumed");
            AppLifeCycleStatusManager.a("is_focused");
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
        {
        }

        public void onActivityStarted(Activity activity)
        {
        }

        public void onActivityStopped(Activity activity)
        {
        }

        protected LifeCycleTracker()
        {
            a = Feature.this;
            super();
        }
    }


    private class MemoryBoss
        implements ComponentCallbacks2
    {

        final Feature a;

        public void onConfigurationChanged(Configuration configuration)
        {
        }

        public void onLowMemory()
        {
        }

        public void onTrimMemory(int i1)
        {
            if (i1 == 20)
            {
                Log.i("KochavaTracker", "Tracking Activity lost focus");
                AppLifeCycleStatusManager.a("is_in_background");
            }
        }

        protected MemoryBoss()
        {
            a = Feature.this;
            super();
        }
    }


    private class AppLifeCycleStatusManager
    {

        protected static boolean a = false;
        protected static boolean b = false;

        protected static void a(String s1)
        {
            (new Thread(s1) {

                private final String a;

                public void run()
                {
                    if (AppLifeCycleStatusManager.a) goto _L2; else goto _L1
_L1:
                    Log.e("KochavaTracker", "AppLifeCycleStatusManager - not active");
_L4:
                    return;
_L2:
                    if (!a.equals("is_focused"))
                    {
                        continue; /* Loop/switch isn't completed */
                    }
                    if (AppLifeCycleStatusManager.b) goto _L4; else goto _L3
_L3:
                    Log.e("KochavaTracker", "AppLifeCycleStatusManager - not already resumed, starting session...");
                    Feature.l();
                    AppLifeCycleStatusManager.b = true;
                    return;
                    if (!a.equals("is_in_background") || !AppLifeCycleStatusManager.b) goto _L4; else goto _L5
_L5:
                    Log.e("KochavaTracker", "AppLifeCycleStatusManager - going to background from app, ending session");
                    Feature.m();
                    AppLifeCycleStatusManager.b = false;
                    return;
                }

                
                {
                    a = s1;
                    super();
                }
            }).start();
        }

    }

}
