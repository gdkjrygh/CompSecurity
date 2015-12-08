// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class cxk
{

    private static final Map m = new HashMap();
    private static final cxx n = new cxx();
    private static final cyd o = new cyd();
    private static Future p;
    public final cwv a;
    public final cxn b = new cxn(this, (byte)0);
    public final cxt c;
    public final Map d;
    private final Context e;
    private final cxi f;
    private final String g;
    private final czi h;
    private final cxr i;
    private final czg j;
    private final cxe k;
    private final Map l = new HashMap();

    private cxk(Context context, Future future, String s)
    {
        e = context;
        g = s;
        f = cxi.a(e);
        Object obj1 = new HashMap();
        ((Map) (obj1)).put("$android_lib_version", "4.7.0");
        ((Map) (obj1)).put("$android_os", "Android");
        Object obj;
        boolean flag;
        if (android.os.Build.VERSION.RELEASE == null)
        {
            obj = "UNKNOWN";
        } else
        {
            obj = android.os.Build.VERSION.RELEASE;
        }
        ((Map) (obj1)).put("$android_os_version", obj);
        if (Build.MANUFACTURER == null)
        {
            obj = "UNKNOWN";
        } else
        {
            obj = Build.MANUFACTURER;
        }
        ((Map) (obj1)).put("$android_manufacturer", obj);
        if (Build.BRAND == null)
        {
            obj = "UNKNOWN";
        } else
        {
            obj = Build.BRAND;
        }
        ((Map) (obj1)).put("$android_brand", obj);
        if (Build.MODEL == null)
        {
            obj = "UNKNOWN";
        } else
        {
            obj = Build.MODEL;
        }
        ((Map) (obj1)).put("$android_model", obj);
        try
        {
            obj = e.getPackageManager().getPackageInfo(e.getPackageName(), 0);
            ((Map) (obj1)).put("$android_app_version", ((PackageInfo) (obj)).versionName);
            ((Map) (obj1)).put("$android_app_version_code", Integer.toString(((PackageInfo) (obj)).versionCode));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("MixpanelAPI.API", "Exception getting app version name", ((Throwable) (obj)));
        }
        d = Collections.unmodifiableMap(((Map) (obj1)));
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            Log.i("MixpanelAPI.API", "Web Configuration, A/B Testing, and Dynamic Tweaks are not supported on this Android OS Version");
            obj = new cxp();
        } else
        {
            obj = new czj(e, g, this, o);
        }
        h = ((czi) (obj));
        if (h instanceof czj)
        {
            obj = (czg)h;
        } else
        {
            obj = null;
        }
        j = ((czg) (obj));
        obj = new cxz() {

            private cxk a;

            public final void a(SharedPreferences sharedpreferences)
            {
                sharedpreferences = cxt.a(sharedpreferences);
                if (sharedpreferences != null)
                {
                    cxk.a(a, sharedpreferences);
                }
            }

            
            {
                a = cxk.this;
                super();
            }
        };
        obj1 = (new StringBuilder("com.mixpanel.android.mpmetrics.MixpanelAPI_")).append(s).toString();
        c = new cxt(future, n.a(context, ((String) (obj1)), ((cxz) (obj))));
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            Log.i("MixpanelAPI.API", "Surveys and Notifications are not supported on this Android OS Version");
            context = new cxq((byte)0);
        } else
        {
            context = new cxo((byte)0);
        }
        i = context;
        k = new cxe(s, i, h);
        future = c.c();
        context = future;
        if (future == null)
        {
            context = c.b();
        }
        k.a(context);
        a = cwv.a(e);
        context = a;
        future = k;
        s = Message.obtain();
        s.what = 12;
        s.obj = future;
        ((cwv) (context)).a.a(s);
        if (android.os.Build.VERSION.SDK_INT >= 16 && f.p)
        {
            if (e.getApplicationContext() instanceof Application)
            {
                ((Application)e.getApplicationContext()).registerActivityLifecycleCallbacks(new cxs(this));
            } else
            {
                Log.i("MixpanelAPI.API", "Context is not an Application, Mixpanel will not automatically show surveys, in-app notifications, or A/B test experiments.");
            }
        }
        if (!f.i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            a("$app_open", ((JSONObject) (null)));
        }
        h.a();
    }

    public static cxk a(Context context, String s)
    {
        if (s == null || context == null)
        {
            return null;
        }
        Map map = m;
        map;
        JVM INSTR monitorenter ;
        Object obj;
        Context context1;
        context1 = context.getApplicationContext();
        if (p == null)
        {
            p = n.a(context, "com.mixpanel.android.mpmetrics.ReferralInfo", null);
        }
        obj = (Map)m.get(s);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        obj = new HashMap();
        m.put(s, obj);
        Object obj1 = (cxk)((Map) (obj)).get(context1);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_527;
        }
        if (!cxc.a(context1))
        {
            break MISSING_BLOCK_LABEL_527;
        }
        s = new cxk(context1, p, s);
        obj1 = Class.forName("de");
        Method method = ((Class) (obj1)).getMethod("getInstance", new Class[] {
            android/content/Context
        });
        ((Class) (obj1)).getMethod("registerReceiver", new Class[] {
            android/content/BroadcastReceiver, android/content/IntentFilter
        }).invoke(method.invoke(null, new Object[] {
            context
        }), new Object[] {
            s. new BroadcastReceiver() {

                private cxk a;

                public final void onReceive(Context context2, Intent intent)
                {
                    context2 = new JSONObject();
                    Bundle bundle = intent.getBundleExtra("event_args");
                    if (bundle != null)
                    {
                        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext();)
                        {
                            String s1 = (String)iterator.next();
                            try
                            {
                                context2.put(s1, bundle.get(s1));
                            }
                            catch (JSONException jsonexception)
                            {
                                Log.e("MixpanelAPI.AL", (new StringBuilder("failed to add key \"")).append(s1).append("\" to properties for tracking bolts event").toString(), jsonexception);
                            }
                        }

                    }
                    a.a((new StringBuilder("$")).append(intent.getStringExtra("event_name")).toString(), context2);
                }

            
            {
                a = cxk.this;
                super();
            }
            }, new IntentFilter("com.parse.bolts.measurement_event")
        });
_L1:
        ((Map) (obj)).put(context1, s);
_L3:
        boolean flag = context instanceof Activity;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_514;
        }
        Class class1 = Class.forName("acd");
        obj1 = ((Activity)context).getIntent();
        class1.getMethod("getTargetUrlFromInboundIntent", new Class[] {
            android/content/Context, android/content/Intent
        }).invoke(null, new Object[] {
            context, obj1
        });
_L2:
        map;
        JVM INSTR monitorexit ;
        return s;
        obj1;
        Log.d("MixpanelAPI.AL", "Failed to invoke LocalBroadcastManager.registerReceiver() -- App Links tracking will not be enabled due to this exception", ((Throwable) (obj1)));
          goto _L1
        context;
        map;
        JVM INSTR monitorexit ;
        throw context;
        obj1;
        Log.d("MixpanelAPI.AL", (new StringBuilder("To enable App Links tracking android.support.v4 must be installed: ")).append(((ClassNotFoundException) (obj1)).getMessage()).toString());
          goto _L1
        obj1;
        Log.d("MixpanelAPI.AL", (new StringBuilder("To enable App Links tracking android.support.v4 must be installed: ")).append(((NoSuchMethodException) (obj1)).getMessage()).toString());
          goto _L1
        obj1;
        Log.d("MixpanelAPI.AL", (new StringBuilder("App Links tracking will not be enabled due to this exception: ")).append(((IllegalAccessException) (obj1)).getMessage()).toString());
          goto _L1
        context;
        Log.d("MixpanelAPI.AL", "Failed to invoke bolts.AppLinks.getTargetUrlFromInboundIntent() -- Unable to detect inbound App Links", context);
          goto _L2
        context;
        Log.d("MixpanelAPI.AL", (new StringBuilder("Please install the Bolts library >= 1.1.2 to track App Links: ")).append(context.getMessage()).toString());
          goto _L2
        context;
        Log.d("MixpanelAPI.AL", (new StringBuilder("Please install the Bolts library >= 1.1.2 to track App Links: ")).append(context.getMessage()).toString());
          goto _L2
        context;
        Log.d("MixpanelAPI.AL", (new StringBuilder("Unable to detect inbound App Links: ")).append(context.getMessage()).toString());
          goto _L2
        Log.d("MixpanelAPI.AL", "Context is not an instance of Activity. To detect inbound App Links, pass an instance of an Activity to getInstance.");
          goto _L2
        s = ((String) (obj1));
          goto _L3
    }

    static cxt a(cxk cxk1)
    {
        return cxk1.c;
    }

    static void a(cxk cxk1, JSONArray jsonarray)
    {
        cxk1.a(jsonarray);
    }

    static void a(cxk cxk1, JSONObject jsonobject)
    {
        if (jsonobject.has("$distinct_id"))
        {
            cxk1.a.a(jsonobject);
            return;
        } else
        {
            cxk1.c.b(jsonobject);
            return;
        }
    }

    static void a(cxl cxl1)
    {
        Map map = m;
        map;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m.values().iterator(); iterator.hasNext();)
        {
            Iterator iterator1 = ((Map)iterator.next()).values().iterator();
            while (iterator1.hasNext()) 
            {
                cxl1.a((cxk)iterator1.next());
            }
        }

        break MISSING_BLOCK_LABEL_81;
        cxl1;
        map;
        JVM INSTR monitorexit ;
        throw cxl1;
        map;
        JVM INSTR monitorexit ;
    }

    private void a(JSONArray jsonarray)
    {
        int i1 = 0;
        while (i1 < jsonarray.length()) 
        {
            try
            {
                JSONObject jsonobject = jsonarray.getJSONObject(i1);
                a.a(jsonobject);
            }
            catch (JSONException jsonexception)
            {
                Log.e("MixpanelAPI.API", "Malformed people record stored pending identity, will not send it.", jsonexception);
            }
            i1++;
        }
    }

    static cxe b(cxk cxk1)
    {
        return cxk1.k;
    }

    static void c(cxk cxk1)
    {
        JSONArray jsonarray = cxk1.c.d();
        if (jsonarray != null)
        {
            cxk1.a(jsonarray);
        }
    }

    static Map d(cxk cxk1)
    {
        return cxk1.d;
    }

    static cxi e(cxk cxk1)
    {
        return cxk1.f;
    }

    static czi f(cxk cxk1)
    {
        return cxk1.h;
    }

    static String g(cxk cxk1)
    {
        return cxk1.g;
    }

    public final cxm a()
    {
        return b;
    }

    public final void a(String s)
    {
        cxt cxt1 = c;
        cxt1;
        JVM INSTR monitorenter ;
        String s1;
        c.a(s);
        s1 = c.c();
        s = s1;
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        s = c.b();
        k.a(s);
        cxt1;
        JVM INSTR monitorexit ;
        return;
        s;
        cxt1;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void a(String s, JSONObject jsonobject)
    {
        Long long1;
        synchronized (l)
        {
            long1 = (Long)l.get(s);
            l.remove(s);
        }
        obj = new JSONObject();
        java.util.Map.Entry entry;
        for (Iterator iterator1 = c.a().entrySet().iterator(); iterator1.hasNext(); ((JSONObject) (obj)).put((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator1.next();
        }

          goto _L1
        jsonobject;
        Log.e("MixpanelAPI.API", (new StringBuilder("Exception tracking event ")).append(s).toString(), jsonobject);
_L2:
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
_L1:
        double d1;
        c.a(((JSONObject) (obj)));
        d1 = (double)System.currentTimeMillis() / 1000D;
        ((JSONObject) (obj)).put("time", (long)d1);
        ((JSONObject) (obj)).put("distinct_id", c.b());
        if (long1 == null)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        ((JSONObject) (obj)).put("$duration", d1 - (double)long1.longValue() / 1000D);
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_269;
        }
        String s1;
        for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); ((JSONObject) (obj)).put(s1, jsonobject.get(s1)))
        {
            s1 = (String)iterator.next();
        }

        jsonobject = new cww(s, ((JSONObject) (obj)), g);
        cwv cwv1 = a;
        Message message = Message.obtain();
        message.what = 1;
        message.obj = jsonobject;
        cwv1.a.a(message);
        if (j != null)
        {
            j.a(s);
            return;
        }
          goto _L2
    }


    // Unreferenced inner class cxk$3

/* anonymous class */
    final class _cls3
    {

        static final int a[];

        static 
        {
            a = new int[com.mixpanel.android.mpmetrics.InAppNotification.Type.values().length];
            try
            {
                a[com.mixpanel.android.mpmetrics.InAppNotification.Type.b.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[com.mixpanel.android.mpmetrics.InAppNotification.Type.c.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
