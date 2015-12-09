// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amplitude.api;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.amplitude.a.a;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.conn.HttpHostConnectException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amplitude.api:
//            WorkerThread, e, d, f, 
//            b

public class c
{

    protected static c a = new c();
    private boolean A;
    private boolean B;
    private AtomicBoolean C;
    private AtomicBoolean D;
    protected Context b;
    protected String c;
    protected String d;
    protected String e;
    JSONObject f;
    Throwable g;
    String h;
    WorkerThread i;
    WorkerThread j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private f p;
    private long q;
    private int r;
    private int s;
    private int t;
    private long u;
    private long v;
    private long w;
    private boolean x;
    private int y;
    private boolean z;

    public c()
    {
        k = false;
        l = false;
        m = false;
        n = false;
        o = false;
        q = -1L;
        r = 30;
        s = 100;
        t = 1000;
        u = 30000L;
        v = 0x493e0L;
        w = 0x1b7740L;
        x = false;
        y = s;
        z = false;
        A = false;
        B = false;
        C = new AtomicBoolean(false);
        D = new AtomicBoolean(false);
        h = "https://api.amplitude.com/";
        i = new WorkerThread("logThread");
        j = new WorkerThread("httpThread");
        i.start();
        j.start();
    }

    static int a(c c1, int i1)
    {
        c1.y = i1;
        return i1;
    }

    public static c a()
    {
        return a;
    }

    static String a(c c1)
    {
        return c1.j();
    }

    private void a(Runnable runnable)
    {
        if (Thread.currentThread() != i)
        {
            i.a(runnable);
            return;
        } else
        {
            runnable.run();
            return;
        }
    }

    static boolean a(Context context)
    {
        return b(context, null, null);
    }

    static boolean a(c c1, boolean flag)
    {
        c1.x = flag;
        return flag;
    }

    static f b(c c1)
    {
        return c1.p;
    }

    private JSONObject b(JSONObject jsonobject)
    {
        int j1 = 0;
        if (jsonobject == null)
        {
            return null;
        }
        JSONArray jsonarray = jsonobject.names();
        String as[];
        int i1;
        if (jsonarray != null)
        {
            i1 = jsonarray.length();
        } else
        {
            i1 = 0;
        }
        as = new String[i1];
        for (; j1 < i1; j1++)
        {
            as[j1] = jsonarray.optString(j1);
        }

        try
        {
            jsonobject = new JSONObject(jsonobject, as);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.e("com.amplitude.api.AmplitudeClient", jsonobject.toString());
            return null;
        }
        return jsonobject;
    }

    static boolean b(Context context)
    {
        return b(context, null);
    }

    static boolean b(Context context, String s1)
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "com.amplitude.api";
        }
        s1 = context.getSharedPreferences((new StringBuilder()).append(s2).append(".").append(context.getPackageName()).toString(), 0);
        s2 = s1.getString("com.amplitude.api.deviceId", null);
        if (!TextUtils.isEmpty(s2))
        {
            com.amplitude.api.e.a(context).a("device_id", s2);
            s1.edit().remove("com.amplitude.api.deviceId").apply();
        }
        return true;
    }

    static boolean b(Context context, String s1, String s2)
    {
        String s3;
        s3 = s1;
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        s3 = "com.amplitude.api";
        s1 = com/amplitude/api/d.getPackage().getName();
        s3 = s1;
_L2:
        s1 = s2;
        if (s2 == null)
        {
            s1 = "com.amplitude.api";
        }
        if (s1.equals(s3))
        {
            return false;
        }
        try
        {
            s2 = (new StringBuilder()).append(s3).append(".").append(context.getPackageName()).toString();
            SharedPreferences sharedpreferences = context.getSharedPreferences(s2, 0);
            if (sharedpreferences.getAll().size() == 0)
            {
                break MISSING_BLOCK_LABEL_480;
            }
            s1 = (new StringBuilder()).append(s1).append(".").append(context.getPackageName()).toString();
            context = context.getSharedPreferences(s1, 0).edit();
            if (sharedpreferences.contains((new StringBuilder()).append(s3).append(".previousSessionId").toString()))
            {
                context.putLong("com.amplitude.api.previousSessionId", sharedpreferences.getLong((new StringBuilder()).append(s3).append(".previousSessionId").toString(), -1L));
            }
            if (sharedpreferences.contains((new StringBuilder()).append(s3).append(".deviceId").toString()))
            {
                context.putString("com.amplitude.api.deviceId", sharedpreferences.getString((new StringBuilder()).append(s3).append(".deviceId").toString(), null));
            }
            if (sharedpreferences.contains((new StringBuilder()).append(s3).append(".userId").toString()))
            {
                context.putString("com.amplitude.api.userId", sharedpreferences.getString((new StringBuilder()).append(s3).append(".userId").toString(), null));
            }
            if (sharedpreferences.contains((new StringBuilder()).append(s3).append(".optOut").toString()))
            {
                context.putBoolean("com.amplitude.api.optOut", sharedpreferences.getBoolean((new StringBuilder()).append(s3).append(".optOut").toString(), false));
            }
            context.apply();
            sharedpreferences.edit().clear().apply();
            Log.i("com.amplitude.api.AmplitudeClient", (new StringBuilder()).append("Upgraded shared preferences from ").append(s2).append(" to ").append(s1).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("com.amplitude.api.AmplitudeClient", "Error upgrading shared preferences", context);
            return false;
        }
        return true;
        s1;
        if (true) goto _L2; else goto _L1
_L1:
        return false;
    }

    static AtomicBoolean c(c c1)
    {
        return c1.C;
    }

    static AtomicBoolean d(c c1)
    {
        return c1.D;
    }

    static int e(c c1)
    {
        return c1.r;
    }

    private void e(String s1)
    {
        while (!d(String.format("sendSessionEvent('%s')", new Object[] {
            s1
        })) || !i()) 
        {
            return;
        }
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("special", s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return;
        }
        b(s1, null, jsonobject, c(), false);
    }

    static boolean f(c c1)
    {
        return c1.x;
    }

    static int g(c c1)
    {
        return c1.s;
    }

    private void h()
    {
        p = new f(b);
        a(new AmplitudeClient._cls1());
    }

    private void h(long l1)
    {
        if (A)
        {
            e("session_end");
        }
        j(l1);
        e(l1);
        if (A)
        {
            e("session_start");
        }
    }

    private boolean i()
    {
        return q >= 0L;
    }

    private boolean i(long l1)
    {
        long l3 = c();
        long l2;
        if (z)
        {
            l2 = v;
        } else
        {
            l2 = w;
        }
        return l1 - l3 < l2;
    }

    private String j()
    {
        Object obj = new HashSet();
        ((Set) (obj)).add("");
        ((Set) (obj)).add("9774d56d682e549c");
        ((Set) (obj)).add("unknown");
        ((Set) (obj)).add("000000000000000");
        ((Set) (obj)).add("Android");
        ((Set) (obj)).add("DEFACE");
        e e1 = com.amplitude.api.e.a(b);
        String s1 = e1.b("device_id");
        if (!TextUtils.isEmpty(s1) && !((Set) (obj)).contains(s1))
        {
            return s1;
        }
        if (!k && l)
        {
            String s2 = p.l();
            if (!TextUtils.isEmpty(s2) && !((Set) (obj)).contains(s2))
            {
                e1.a("device_id", s2);
                return s2;
            }
        }
        obj = (new StringBuilder()).append(p.b()).append("R").toString();
        e1.a("device_id", ((String) (obj)));
        return ((String) (obj));
    }

    private void j(long l1)
    {
        q = l1;
        c(l1);
    }

    private void k(long l1)
    {
        if (C.getAndSet(true))
        {
            return;
        } else
        {
            i.a(new AmplitudeClient._cls5(), l1);
            return;
        }
    }

    protected long a(JSONObject jsonobject)
    {
        e e1 = com.amplitude.api.e.a(b);
        long l1 = e1.a(jsonobject.toString());
        b(l1);
        long l2 = e1.a();
        if (l2 >= (long)t)
        {
            e1.b(e1.a(20L));
        }
        if (l2 % (long)r == 0L && l2 >= (long)r)
        {
            f();
            return l1;
        } else
        {
            k(u);
            return l1;
        }
    }

    public c a(Application application)
    {
        if (z)
        {
            return a;
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            application.registerActivityLifecycleCallbacks(new b(a));
        }
        return a;
    }

    public c a(Context context, String s1)
    {
        return a(context, s1, ((String) (null)));
    }

    public c a(Context context, String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        if (context != null) goto _L2; else goto _L1
_L1:
        Log.e("com.amplitude.api.AmplitudeClient", "Argument context cannot be null in initialize()");
        context = a;
_L7:
        this;
        JVM INSTR monitorexit ;
        return context;
_L2:
        a(context);
        b(context);
        if (TextUtils.isEmpty(s1))
        {
            Log.e("com.amplitude.api.AmplitudeClient", "Argument apiKey cannot be null or blank in initialize()");
            context = a;
            continue; /* Loop/switch isn't completed */
        }
        if (m) goto _L4; else goto _L3
_L3:
        b = context.getApplicationContext();
        c = s1;
        h();
        context = context.getSharedPreferences(g(), 0);
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        d = s2;
        context.edit().putString("com.amplitude.api.userId", s2).commit();
_L5:
        n = context.getBoolean("com.amplitude.api.optOut", false);
        m = true;
_L4:
        context = a;
        continue; /* Loop/switch isn't completed */
        d = context.getString("com.amplitude.api.userId", null);
          goto _L5
        context;
        throw context;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public c a(boolean flag)
    {
        A = flag;
        return a;
    }

    protected Object a(Object obj)
    {
        Object obj1 = obj;
        if (obj == null)
        {
            obj1 = JSONObject.NULL;
        }
        return obj1;
    }

    protected String a(byte abyte0[])
    {
        char ac[] = new char[16];
        char[] _tmp = ac;
        ac[0] = '0';
        ac[1] = '1';
        ac[2] = '2';
        ac[3] = '3';
        ac[4] = '4';
        ac[5] = '5';
        ac[6] = '6';
        ac[7] = '7';
        ac[8] = '8';
        ac[9] = '9';
        ac[10] = 'a';
        ac[11] = 'b';
        ac[12] = 'c';
        ac[13] = 'd';
        ac[14] = 'e';
        ac[15] = 'f';
        char ac1[] = new char[abyte0.length * 2];
        for (int i1 = 0; i1 < abyte0.length; i1++)
        {
            int j1 = abyte0[i1] & 0xff;
            ac1[i1 * 2] = ac[j1 >>> 4];
            ac1[i1 * 2 + 1] = ac[j1 & 0xf];
        }

        return new String(ac1);
    }

    void a(long l1)
    {
        b.getSharedPreferences(g(), 0).edit().putLong("com.amplitude.api.lastEventTime", l1).commit();
    }

    protected void a(OkHttpClient okhttpclient, String s1, long l1)
    {
        String s2;
        String s4;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        flag1 = true;
        flag2 = true;
        flag3 = true;
        flag4 = true;
        flag = true;
        s4 = (new StringBuilder()).append("").append(System.currentTimeMillis()).toString();
        s2 = "";
        String s3;
        s3 = (new StringBuilder()).append("2").append(c).append(s1).append(s4).toString();
        s3 = a((new a()).digest(s3.getBytes("UTF-8")));
        s2 = s3;
_L3:
        s1 = (new FormEncodingBuilder()).add("v", "2").add("client", c).add("e", s1).add("upload_time", s4).add("checksum", s2).build();
        s1 = (new com.squareup.okhttp.Request.Builder()).url(h).post(s1).build();
        boolean flag5;
        okhttpclient = okhttpclient.newCall(s1).execute();
        s1 = okhttpclient.body().string();
        flag5 = s1.equals("success");
        if (!flag5) goto _L2; else goto _L1
_L1:
        i.a(new AmplitudeClient._cls7(l1));
        flag = true;
_L4:
        if (!flag)
        {
            D.set(false);
        }
        return;
        UnsupportedEncodingException unsupportedencodingexception;
        unsupportedencodingexception;
        Log.e("com.amplitude.api.AmplitudeClient", unsupportedencodingexception.toString());
          goto _L3
_L2:
        if (!s1.equals("invalid_api_key"))
        {
            break MISSING_BLOCK_LABEL_286;
        }
        Log.e("com.amplitude.api.AmplitudeClient", "Invalid API key, make sure your API key is correct in initialize()");
        flag = false;
          goto _L4
        if (!s1.equals("bad_checksum"))
        {
            break MISSING_BLOCK_LABEL_311;
        }
        Log.w("com.amplitude.api.AmplitudeClient", "Bad checksum, post request was mangled in transit, will attempt to reupload later");
        flag = false;
          goto _L4
        if (!s1.equals("request_db_write_failed"))
        {
            break MISSING_BLOCK_LABEL_336;
        }
        Log.w("com.amplitude.api.AmplitudeClient", "Couldn't write to request database on server, will attempt to reupload later");
        flag = false;
          goto _L4
        if (okhttpclient.code() != 413)
        {
            break MISSING_BLOCK_LABEL_434;
        }
        okhttpclient = com.amplitude.api.e.a(b);
        if (x && y == 1)
        {
            okhttpclient.c(l1);
        }
        x = true;
        y = (int)Math.ceil((double)Math.min((int)okhttpclient.a(), y) / 2D);
        Log.w("com.amplitude.api.AmplitudeClient", "Request too large, will decrease size and attempt to reupload");
        i.a(new AmplitudeClient._cls8());
        flag = false;
          goto _L4
        Log.w("com.amplitude.api.AmplitudeClient", (new StringBuilder()).append("Upload failed, ").append(s1).append(", will attempt to reupload later").toString());
        flag = false;
          goto _L4
        okhttpclient;
        flag = false;
_L9:
        g = okhttpclient;
          goto _L4
        okhttpclient;
        flag = false;
_L8:
        g = okhttpclient;
          goto _L4
        okhttpclient;
        flag = false;
_L7:
        Log.e("com.amplitude.api.AmplitudeClient", okhttpclient.toString());
        g = okhttpclient;
          goto _L4
        okhttpclient;
        flag = false;
_L6:
        Log.e("com.amplitude.api.AmplitudeClient", "Exception:", okhttpclient);
        g = okhttpclient;
          goto _L4
        okhttpclient;
        flag = false;
_L5:
        Log.e("com.amplitude.api.AmplitudeClient", "Exception:", okhttpclient);
        g = okhttpclient;
          goto _L4
        okhttpclient;
        flag = flag4;
          goto _L5
        okhttpclient;
        flag = flag3;
          goto _L6
        okhttpclient;
        flag = flag2;
          goto _L7
        okhttpclient;
        flag = flag1;
          goto _L8
        okhttpclient;
          goto _L9
    }

    public void a(String s1)
    {
        a(s1, ((JSONObject) (null)));
    }

    public void a(String s1, JSONObject jsonobject)
    {
        a(s1, jsonobject, false);
    }

    protected void a(String s1, JSONObject jsonobject, JSONObject jsonobject1, long l1, boolean flag)
    {
        if (jsonobject != null)
        {
            jsonobject = b(jsonobject);
        }
        a(new AmplitudeClient._cls2(s1, jsonobject, jsonobject1, l1, flag));
    }

    public void a(String s1, JSONObject jsonobject, boolean flag)
    {
        if (b(s1))
        {
            a(s1, jsonobject, null, System.currentTimeMillis(), flag);
        }
    }

    protected long b(String s1, JSONObject jsonobject, JSONObject jsonobject1, long l1, boolean flag)
    {
        long l2 = -1L;
        Log.d("com.amplitude.api.AmplitudeClient", (new StringBuilder()).append("Logged event to Amplitude: ").append(s1).toString());
        if (n)
        {
            return -1L;
        }
        JSONObject jsonobject2;
        JSONObject jsonobject3;
        boolean flag1;
        if (A && (s1.equals("session_start") || s1.equals("session_end")))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1 && !flag)
        {
            if (!B)
            {
                d(l1);
            } else
            {
                e(l1);
            }
        }
        jsonobject2 = new JSONObject();
        jsonobject2.put("event_type", a(s1));
        jsonobject2.put("timestamp", l1);
        jsonobject2.put("user_id", a(d));
        jsonobject2.put("device_id", a(e));
        if (!flag) goto _L2; else goto _L1
_L1:
        l1 = l2;
_L5:
        jsonobject2.put("session_id", l1);
        jsonobject2.put("version_name", a(p.c()));
        jsonobject2.put("os_name", a(p.d()));
        jsonobject2.put("os_version", a(p.e()));
        jsonobject2.put("device_brand", a(p.f()));
        jsonobject2.put("device_manufacturer", a(p.g()));
        jsonobject2.put("device_model", a(p.h()));
        jsonobject2.put("carrier", a(p.i()));
        jsonobject2.put("country", a(p.j()));
        jsonobject2.put("language", a(p.k()));
        jsonobject2.put("platform", "Android");
        s1 = new JSONObject();
        s1.put("name", "amplitude-android");
        s1.put("version", "2.0.2");
        jsonobject2.put("library", s1);
        s1 = jsonobject1;
        if (jsonobject1 != null)
        {
            break MISSING_BLOCK_LABEL_429;
        }
        s1 = new JSONObject();
        jsonobject1 = p.n();
        if (jsonobject1 == null)
        {
            break MISSING_BLOCK_LABEL_486;
        }
        jsonobject3 = new JSONObject();
        jsonobject3.put("lat", jsonobject1.getLatitude());
        jsonobject3.put("lng", jsonobject1.getLongitude());
        s1.put("location", jsonobject3);
        if (p.l() != null)
        {
            s1.put("androidADID", p.l());
        }
        s1.put("limit_ad_tracking", p.m());
        jsonobject2.put("api_properties", s1);
        s1 = jsonobject;
        if (jsonobject != null)
        {
            break MISSING_BLOCK_LABEL_550;
        }
        s1 = new JSONObject();
        jsonobject2.put("event_properties", s1);
        if (f != null) goto _L4; else goto _L3
_L3:
        s1 = new JSONObject();
_L6:
        jsonobject2.put("user_properties", s1);
_L7:
        return a(jsonobject2);
_L2:
        l1 = q;
          goto _L5
_L4:
        s1 = f;
          goto _L6
        s1;
        Log.e("com.amplitude.api.AmplitudeClient", s1.toString());
          goto _L7
    }

    void b()
    {
        z = true;
    }

    void b(long l1)
    {
        b.getSharedPreferences(g(), 0).edit().putLong("com.amplitude.api.lastEventId", l1).commit();
    }

    protected void b(boolean flag)
    {
        int i1;
        while (n || o || D.getAndSet(true)) 
        {
            return;
        }
        Object obj = com.amplitude.api.e.a(b);
        long l1;
        try
        {
            l1 = d();
        }
        catch (JSONException jsonexception)
        {
            D.set(false);
            Log.e("com.amplitude.api.AmplitudeClient", jsonexception.toString());
            return;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        if (!x) goto _L2; else goto _L1
_L1:
        i1 = y;
_L3:
        obj = ((e) (obj)).a(l1, i1);
        l1 = ((Long)((Pair) (obj)).first).longValue();
        obj = (JSONArray)((Pair) (obj)).second;
        j.a(new AmplitudeClient._cls6(((JSONArray) (obj)), l1));
        return;
_L2:
        i1 = s;
          goto _L3
        i1 = -1;
          goto _L3
    }

    protected boolean b(String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            Log.e("com.amplitude.api.AmplitudeClient", "Argument eventType cannot be null or blank in logEvent()");
        } else
        if (d("logEvent()"))
        {
            return true;
        }
        return false;
    }

    long c()
    {
        return b.getSharedPreferences(g(), 0).getLong("com.amplitude.api.lastEventTime", -1L);
    }

    void c(long l1)
    {
        b.getSharedPreferences(g(), 0).edit().putLong("com.amplitude.api.previousSessionId", l1).commit();
    }

    public void c(String s1)
    {
        if (!d("setUserId()"))
        {
            return;
        } else
        {
            d = s1;
            b.getSharedPreferences(g(), 0).edit().putString("com.amplitude.api.userId", s1).commit();
            return;
        }
    }

    long d()
    {
        return b.getSharedPreferences(g(), 0).getLong("com.amplitude.api.lastEventId", -1L);
    }

    boolean d(long l1)
    {
        if (i())
        {
            if (i(l1))
            {
                e(l1);
                return false;
            } else
            {
                h(l1);
                return true;
            }
        }
        if (i(l1))
        {
            long l2 = e();
            if (l2 == -1L)
            {
                h(l1);
                return true;
            } else
            {
                j(l2);
                e(l1);
                return false;
            }
        } else
        {
            h(l1);
            return true;
        }
    }

    protected boolean d(String s1)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        if (b != null) goto _L2; else goto _L1
_L1:
        Log.e("com.amplitude.api.AmplitudeClient", (new StringBuilder()).append("context cannot be null, set context with initialize() before calling ").append(s1).toString());
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (TextUtils.isEmpty(c))
        {
            Log.e("com.amplitude.api.AmplitudeClient", (new StringBuilder()).append("apiKey cannot be null or empty, set apiKey with initialize() before calling ").append(s1).toString());
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_85;
        s1;
        throw s1;
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
    }

    long e()
    {
        return b.getSharedPreferences(g(), 0).getLong("com.amplitude.api.previousSessionId", -1L);
    }

    void e(long l1)
    {
        if (!i())
        {
            return;
        } else
        {
            a(l1);
            return;
        }
    }

    protected void f()
    {
        b(true);
    }

    void f(long l1)
    {
        e(l1);
        B = false;
    }

    protected String g()
    {
        return (new StringBuilder()).append("com.amplitude.api.").append(b.getPackageName()).toString();
    }

    void g(long l1)
    {
        d(l1);
        B = true;
    }


    // Unreferenced inner class com/amplitude/api/AmplitudeClient$1

/* anonymous class */
    class AmplitudeClient._cls1
        implements Runnable
    {

        final c a;

        public void run()
        {
            a.e = com.amplitude.api.c.a(a);
            c.b(a).a();
        }

            
            {
                a = c.this;
                super();
            }
    }


    // Unreferenced inner class com/amplitude/api/AmplitudeClient$2

/* anonymous class */
    class AmplitudeClient._cls2
        implements Runnable
    {

        final String a;
        final JSONObject b;
        final JSONObject c;
        final long d;
        final boolean e;
        final c f;

        public void run()
        {
            f.b(a, b, c, d, e);
        }

            
            {
                f = c.this;
                a = s1;
                b = jsonobject;
                c = jsonobject1;
                d = l1;
                e = flag;
                super();
            }
    }


    // Unreferenced inner class com/amplitude/api/AmplitudeClient$3

/* anonymous class */
    class AmplitudeClient._cls3
        implements Runnable
    {

        final JSONObject a;
        final boolean b;
        final c c;

        public void run()
        {
            Object obj1 = c;
            if (a == null)
            {
                if (b)
                {
                    obj1.f = null;
                }
            } else
            {
                Object obj;
                JSONObject jsonobject;
                try
                {
                    obj = new JSONObject(a.toString());
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Log.e("com.amplitude.api.AmplitudeClient", ((JSONException) (obj)).toString());
                    return;
                }
                jsonobject = ((c) (obj1)).f;
                if (b || jsonobject == null)
                {
                    obj1.f = ((JSONObject) (obj));
                    return;
                }
                obj1 = ((JSONObject) (obj)).keys();
                while (((Iterator) (obj1)).hasNext()) 
                {
                    String s1 = (String)((Iterator) (obj1)).next();
                    try
                    {
                        jsonobject.put(s1, ((JSONObject) (obj)).get(s1));
                    }
                    catch (JSONException jsonexception)
                    {
                        Log.e("com.amplitude.api.AmplitudeClient", jsonexception.toString());
                    }
                }
            }
        }
    }


    // Unreferenced inner class com/amplitude/api/AmplitudeClient$4

/* anonymous class */
    class AmplitudeClient._cls4
        implements Runnable
    {

        final c a;

        public void run()
        {
            a.f();
        }
    }


    // Unreferenced inner class com/amplitude/api/AmplitudeClient$5

/* anonymous class */
    class AmplitudeClient._cls5
        implements Runnable
    {

        final c a;

        public void run()
        {
            c.c(a).set(false);
            a.f();
        }

            
            {
                a = c.this;
                super();
            }
    }


    // Unreferenced inner class com/amplitude/api/AmplitudeClient$6

/* anonymous class */
    class AmplitudeClient._cls6
        implements Runnable
    {

        final JSONArray a;
        final long b;
        final c c;

        public void run()
        {
            c.a(new OkHttpClient(), a.toString(), b);
        }

            
            {
                c = c.this;
                a = jsonarray;
                b = l1;
                super();
            }
    }


    // Unreferenced inner class com/amplitude/api/AmplitudeClient$7

/* anonymous class */
    class AmplitudeClient._cls7
        implements Runnable
    {

        final long a;
        final c b;

        public void run()
        {
            e e1 = com.amplitude.api.e.a(b.b);
            e1.b(a);
            c.d(b).set(false);
            if (e1.a() > (long)c.e(b))
            {
                b.i.a(new AmplitudeClient._cls7._cls1(this));
                return;
            } else
            {
                com.amplitude.api.c.a(b, false);
                com.amplitude.api.c.a(b, c.g(b));
                return;
            }
        }

            
            {
                b = c.this;
                a = l1;
                super();
            }
    }


    // Unreferenced inner class com/amplitude/api/AmplitudeClient$7$1

/* anonymous class */
    class AmplitudeClient._cls7._cls1
        implements Runnable
    {

        final AmplitudeClient._cls7 a;

        public void run()
        {
            a.b.b(c.f(a.b));
        }

            
            {
                a = _pcls7;
                super();
            }
    }


    // Unreferenced inner class com/amplitude/api/AmplitudeClient$8

/* anonymous class */
    class AmplitudeClient._cls8
        implements Runnable
    {

        final c a;

        public void run()
        {
            c.d(a).set(false);
            a.b(true);
        }

            
            {
                a = c.this;
                super();
            }
    }

}
