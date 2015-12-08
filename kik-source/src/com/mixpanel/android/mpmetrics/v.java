// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            af, a, t, w, 
//            ac, h, ab, x, 
//            f, UpdateDisplayState, z, c, 
//            y, aa

public final class v
{
    static interface a
    {

        public abstract void a(v v1);
    }

    public static interface b
    {

        public abstract void a();

        public abstract void a(Activity activity);

        public abstract void a(String s);

        public abstract void a(String s, Object obj);

        public abstract b b(String s);

        public abstract void b(Activity activity);
    }

    private class c
        implements b
    {

        final v a;

        private void a(JSONObject jsonobject)
        {
            JSONObject jsonobject1;
            jsonobject1 = new JSONObject();
            jsonobject1.put("$android_lib_version", "4.4.1");
            jsonobject1.put("$android_os", "Android");
            if (android.os.Build.VERSION.RELEASE != null) goto _L2; else goto _L1
_L1:
            Object obj = "UNKNOWN";
_L9:
            jsonobject1.put("$android_os_version", obj);
            jsonobject1.put("$android_app_version", v.d(a).getPackageManager().getPackageInfo(v.d(a).getPackageName(), 0).versionName);
_L10:
            if (Build.MANUFACTURER != null) goto _L4; else goto _L3
_L3:
            obj = "UNKNOWN";
_L11:
            jsonobject1.put("$android_manufacturer", obj);
            if (Build.BRAND != null) goto _L6; else goto _L5
_L5:
            obj = "UNKNOWN";
_L12:
            jsonobject1.put("$android_brand", obj);
            if (Build.MODEL != null) goto _L8; else goto _L7
_L7:
            obj = "UNKNOWN";
_L13:
            try
            {
                jsonobject1.put("$android_model", obj);
                String s;
                for (obj = jsonobject.keys(); ((Iterator) (obj)).hasNext(); jsonobject1.put(s, jsonobject.get(s)))
                {
                    s = (String)((Iterator) (obj)).next();
                }

            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.e("MixpanelAPI", "Exception setting people properties", jsonobject);
                return;
            }
            break MISSING_BLOCK_LABEL_221;
_L2:
            obj = android.os.Build.VERSION.RELEASE;
              goto _L9
            obj;
            Log.e("MixpanelAPI", "Exception getting app version name", ((Throwable) (obj)));
              goto _L10
_L4:
            obj = Build.MANUFACTURER;
              goto _L11
_L6:
            obj = Build.BRAND;
              goto _L12
_L8:
            obj = Build.MODEL;
              goto _L13
            jsonobject = b("$set", jsonobject1);
            v.a(a, jsonobject);
            return;
              goto _L9
        }

        private JSONObject b(String s, Object obj)
        {
            JSONObject jsonobject = new JSONObject();
            String s1 = b();
            jsonobject.put(s, obj);
            jsonobject.put("$token", v.c(a));
            jsonobject.put("$time", System.currentTimeMillis());
            if (s1 != null)
            {
                jsonobject.put("$distinct_id", s1);
            }
            return jsonobject;
        }

        public final void a()
        {
            v.a(a).e();
            JSONArray jsonarray = new JSONArray();
            try
            {
                a((new JSONObject()).put("$android_devices", jsonarray));
                return;
            }
            catch (JSONException jsonexception)
            {
                Log.e("MixpanelAPI", "set", jsonexception);
            }
        }

        public final void a(Activity activity)
        {
            ReentrantLock reentrantlock;
            while (android.os.Build.VERSION.SDK_INT < 14 || android.os.Build.VERSION.SDK_INT < 14 || !com.mixpanel.android.mpmetrics.f.a(activity.getApplicationContext())) 
            {
                return;
            }
            reentrantlock = UpdateDisplayState.a();
            reentrantlock.lock();
            boolean flag = UpdateDisplayState.b();
            if (flag)
            {
                reentrantlock.unlock();
                return;
            }
            flag = a.d();
            Object obj;
            if (flag)
            {
                break MISSING_BLOCK_LABEL_75;
            }
            obj = null;
_L1:
            if (obj == null)
            {
                reentrantlock.unlock();
                return;
            }
            break MISSING_BLOCK_LABEL_99;
            obj = v.b(a).a(v.e(a).e());
              goto _L1
            int l;
            obj = new UpdateDisplayState.DisplayState.SurveyState(((Survey) (obj)));
            l = UpdateDisplayState.a(((UpdateDisplayState.DisplayState) (obj)), b(), v.c(a));
            if (l > 0)
            {
                break MISSING_BLOCK_LABEL_143;
            }
            Log.e("MixpanelAPI", "DisplayState Lock is in an inconsistent state! Please report this issue to Mixpanel");
            reentrantlock.unlock();
            return;
            obj = new z(this, ((UpdateDisplayState.DisplayState.SurveyState) (obj)), activity, l);
            reentrantlock.unlock();
            com.mixpanel.android.mpmetrics.c.a(activity, ((c.b) (obj)));
            return;
            activity;
            reentrantlock.unlock();
            throw activity;
        }

        public final void a(String s)
        {
label0:
            {
                synchronized (v.a(a))
                {
                    if (v.a(a).d() != null)
                    {
                        break label0;
                    }
                }
                return;
            }
            v.a(a).b(s);
            s = new JSONArray((new StringBuilder("[")).append(s).append("]").toString());
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("$android_devices", s);
            s = b("$union", jsonobject);
            v.a(a, s);
_L1:
            ac1;
            JVM INSTR monitorexit ;
            return;
            s;
            ac1;
            JVM INSTR monitorexit ;
            throw s;
            s;
            Log.e("MixpanelAPI", "Exception unioning a property");
              goto _L1
            s;
            Log.e("MixpanelAPI", "set push registration id error", s);
              goto _L1
        }

        public final void a(String s, Object obj)
        {
            try
            {
                JSONObject jsonobject = new JSONObject();
                jsonobject.put(s, obj);
                s = b("$append", jsonobject);
                v.a(a, s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("MixpanelAPI", "Exception appending a property", s);
            }
        }

        public final b b(String s)
        {
            if (s == null)
            {
                return null;
            } else
            {
                return new y(this, s);
            }
        }

        public String b()
        {
            return v.a(a).d();
        }

        public final void b(Activity activity)
        {
            while (android.os.Build.VERSION.SDK_INT < 14 || android.os.Build.VERSION.SDK_INT < 14) 
            {
                return;
            }
            activity.runOnUiThread(new aa(this, activity));
        }

        private c()
        {
            a = v.this;
            super();
        }

        c(byte byte0)
        {
            this();
        }
    }

    private final class d
        implements h.a, Runnable
    {

        final v a;
        private final Set b;
        private final Executor c;

        public final void a()
        {
            c.execute(this);
        }

        public final void run()
        {
            this;
            JVM INSTR monitorenter ;
            for (Iterator iterator = b.iterator(); iterator.hasNext(); iterator.next()) { }
            break MISSING_BLOCK_LABEL_36;
            Exception exception;
            exception;
            throw exception;
            this;
            JVM INSTR monitorexit ;
        }

        private d()
        {
            a = v.this;
            super();
            b = new HashSet();
            c = Executors.newSingleThreadExecutor();
        }

        d(byte byte0)
        {
            this();
        }
    }


    private static final Map i = new HashMap();
    private static final af j = new af();
    private static Future k;
    private final Context a;
    private final com.mixpanel.android.mpmetrics.a b;
    private final t c;
    private final String d;
    private final c e = new c((byte)0);
    private final ac f;
    private final d g = new d((byte)0);
    private h h;

    private v(Context context, Future future, String s)
    {
        a = context;
        d = s;
        b = com.mixpanel.android.mpmetrics.a.a(a);
        c = t.a(a);
        w w1 = new w(this);
        String s1 = (new StringBuilder("com.mixpanel.android.mpmetrics.MixpanelAPI_")).append(s).toString();
        f = new ac(future, j.a(context, s1, w1));
        h = null;
        context = f.d();
        if (context != null)
        {
            h = new h(s, context, g);
        }
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 14 && c.l())
        {
            if (a.getApplicationContext() instanceof Application)
            {
                ((Application)a.getApplicationContext()).registerActivityLifecycleCallbacks(new ab(this));
            } else
            {
                flag = t.a;
            }
        }
        if (h != null)
        {
            b.a(h);
        }
    }

    static ac a(v v1)
    {
        return v1.f;
    }

    public static v a(Context context, String s)
    {
        if (s == null || context == null)
        {
            return null;
        }
        Map map = i;
        map;
        JVM INSTR monitorenter ;
        Object obj;
        Context context1;
        context1 = context.getApplicationContext();
        if (k == null)
        {
            k = j.a(context, "com.mixpanel.android.mpmetrics.ReferralInfo", null);
        }
        obj = (Map)i.get(s);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        obj = new HashMap();
        i.put(s, obj);
        Object obj1 = (v)((Map) (obj)).get(context1);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_414;
        }
        s = new v(context1, k, s);
        obj1 = Class.forName("android.support.v4.content.LocalBroadcastManager");
        Method method = ((Class) (obj1)).getMethod("getInstance", new Class[] {
            android/content/Context
        });
        ((Class) (obj1)).getMethod("registerReceiver", new Class[] {
            android/content/BroadcastReceiver, android/content/IntentFilter
        }).invoke(method.invoke(null, new Object[] {
            context
        }), new Object[] {
            new x(s), new IntentFilter("com.parse.bolts.measurement_event")
        });
_L1:
        ((Map) (obj)).put(context1, s);
_L3:
        boolean flag = context instanceof Activity;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_269;
        }
        Class class1 = Class.forName("bolts.AppLinks");
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
        (new StringBuilder("To enable App Links tracking android.support.v4 must be installed: ")).append(((ClassNotFoundException) (obj1)).getMessage());
          goto _L1
        context;
        map;
        JVM INSTR monitorexit ;
        throw context;
        obj1;
        (new StringBuilder("To enable App Links tracking android.support.v4 must be installed: ")).append(((NoSuchMethodException) (obj1)).getMessage());
          goto _L1
        obj1;
        (new StringBuilder("App Links tracking will not be enabled due to this exception: ")).append(((IllegalAccessException) (obj1)).getMessage());
          goto _L1
        context;
        (new StringBuilder("Please install the Bolts library >= 1.1.2 to track App Links: ")).append(context.getMessage());
          goto _L2
        context;
        (new StringBuilder("Please install the Bolts library >= 1.1.2 to track App Links: ")).append(context.getMessage());
          goto _L2
        context;
        (new StringBuilder("Unable to detect inbound App Links: ")).append(context.getMessage());
          goto _L2
        context;
          goto _L2
        obj1;
          goto _L1
        s = ((String) (obj1));
          goto _L3
    }

    static void a(a a1)
    {
        Map map = i;
        map;
        JVM INSTR monitorenter ;
        for (Iterator iterator = i.values().iterator(); iterator.hasNext();)
        {
            Iterator iterator1 = ((Map)iterator.next()).values().iterator();
            while (iterator1.hasNext()) 
            {
                a1.a((v)iterator1.next());
            }
        }

        break MISSING_BLOCK_LABEL_81;
        a1;
        map;
        JVM INSTR monitorexit ;
        throw a1;
        map;
        JVM INSTR monitorexit ;
    }

    static void a(v v1, JSONArray jsonarray)
    {
        int l = 0;
        while (l < jsonarray.length()) 
        {
            try
            {
                JSONObject jsonobject = jsonarray.getJSONObject(l);
                v1.b.a(jsonobject);
            }
            catch (JSONException jsonexception)
            {
                Log.e("MixpanelAPI", "Malformed people record stored pending identity, will not send it.", jsonexception);
            }
            l++;
        }
    }

    static void a(v v1, JSONObject jsonobject)
    {
        if (jsonobject.has("$distinct_id"))
        {
            v1.b.a(jsonobject);
            return;
        } else
        {
            v1.f.a(jsonobject);
            return;
        }
    }

    static h b(v v1)
    {
        return v1.h;
    }

    static String c(v v1)
    {
        return v1.d;
    }

    static Context d(v v1)
    {
        return v1.a;
    }

    static t e(v v1)
    {
        return v1.c;
    }

    public final void a()
    {
        b.a();
    }

    public final void a(String s)
    {
        f.a(s);
    }

    public final void a(String s, JSONObject jsonobject)
    {
        JSONObject jsonobject1;
        try
        {
            jsonobject1 = new JSONObject();
            java.util.Map.Entry entry;
            for (Iterator iterator = f.b().entrySet().iterator(); iterator.hasNext(); jsonobject1.put((String)entry.getKey(), (String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.e("MixpanelAPI", (new StringBuilder("Exception tracking event ")).append(s).toString(), jsonobject);
            return;
        }
        JSONObject jsonobject2 = f.a();
        String s2;
        for (Iterator iterator2 = jsonobject2.keys(); iterator2.hasNext(); jsonobject1.put(s2, jsonobject2.get(s2)))
        {
            s2 = (String)iterator2.next();
        }

        jsonobject1.put("time", System.currentTimeMillis() / 1000L);
        jsonobject1.put("distinct_id", f.c());
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_237;
        }
        String s1;
        for (Iterator iterator1 = jsonobject.keys(); iterator1.hasNext(); jsonobject1.put(s1, jsonobject.get(s1)))
        {
            s1 = (String)iterator1.next();
        }

        jsonobject = new a.a(s, jsonobject1, d);
        b.a(jsonobject);
        return;
    }

    public final void a(JSONObject jsonobject)
    {
        f.b(jsonobject);
    }

    public final String b()
    {
        return f.c();
    }

    public final void b(String s)
    {
        f.c(s);
    }

    public final b c()
    {
        return e;
    }

    final boolean d()
    {
        return h != null;
    }


    // Unreferenced inner class com/mixpanel/android/mpmetrics/v$1

/* anonymous class */
    static final class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[InAppNotification.a.values().length];
            try
            {
                a[InAppNotification.a.b.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[InAppNotification.a.c.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
