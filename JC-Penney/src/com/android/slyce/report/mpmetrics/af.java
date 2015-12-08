// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

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
import com.android.slyce.report.c.ab;
import com.android.slyce.report.c.ac;
import com.android.slyce.report.c.z;
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

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            bb, al, av, o, 
//            a, k, ah, aj, 
//            ag, b, aq, ab, 
//            at, ar, ap, as, 
//            p, ak

public class af
{

    private static final Map m = new HashMap();
    private static final bb n = new bb();
    private static Future o;
    private final Context a;
    private final a b = f();
    private final com.android.slyce.report.mpmetrics.ab c = g();
    private final String d;
    private final al e = new al(this, null);
    private final ab f;
    private final av g;
    private final as h = h();
    private final z i = i();
    private final o j;
    private final Map k;
    private final Map l = new HashMap();

    af(Context context, Future future, String s)
    {
        a = context;
        d = s;
        HashMap hashmap = new HashMap();
        hashmap.put("$android_lib_version", "4.5.3");
        hashmap.put("$android_os", "Android");
        Object obj;
        if (android.os.Build.VERSION.RELEASE == null)
        {
            obj = "UNKNOWN";
        } else
        {
            obj = android.os.Build.VERSION.RELEASE;
        }
        hashmap.put("$android_os_version", obj);
        if (Build.MANUFACTURER == null)
        {
            obj = "UNKNOWN";
        } else
        {
            obj = Build.MANUFACTURER;
        }
        hashmap.put("$android_manufacturer", obj);
        if (Build.BRAND == null)
        {
            obj = "UNKNOWN";
        } else
        {
            obj = Build.BRAND;
        }
        hashmap.put("$android_brand", obj);
        if (Build.MODEL == null)
        {
            obj = "UNKNOWN";
        } else
        {
            obj = Build.MODEL;
        }
        hashmap.put("$android_model", obj);
        try
        {
            obj = a.getPackageManager().getPackageInfo(a.getPackageName(), 0);
            hashmap.put("$android_app_version", ((PackageInfo) (obj)).versionName);
            hashmap.put("$android_app_version_code", Integer.toString(((PackageInfo) (obj)).versionCode));
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            Log.e("MixpanelAPI.MixpanelAPI", "Exception getting app version name", namenotfoundexception);
        }
        k = Collections.unmodifiableMap(hashmap);
        f = b(context, s);
        g = a(context, future, s);
        j = a(s, h, f);
        context = g.d();
        j.a(context);
        b.a(j);
        e();
        if (j())
        {
            a("$app_open", ((JSONObject) (null)));
        }
    }

    public static af a(Context context, String s)
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
        if (o == null)
        {
            o = n.a(context, "com.mixpanel.android.mpmetrics.ReferralInfo", null);
        }
        obj = (Map)m.get(s);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        obj = new HashMap();
        m.put(s, obj);
        af af2 = (af)((Map) (obj)).get(context1);
        af af1;
        af1 = af2;
        if (af2 != null)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        af1 = af2;
        if (com.android.slyce.report.mpmetrics.k.a(context1))
        {
            af1 = new af(context1, o, s);
            a(context, af1);
            ((Map) (obj)).put(context1, af1);
        }
        a(context);
        map;
        JVM INSTR monitorexit ;
        return af1;
        context;
        map;
        JVM INSTR monitorexit ;
        throw context;
    }

    static av a(af af1)
    {
        return af1.g;
    }

    private static void a(Context context)
    {
        if (context instanceof Activity)
        {
            try
            {
                Class class1 = Class.forName("a.a");
                Intent intent = ((Activity)context).getIntent();
                class1.getMethod("getTargetUrlFromInboundIntent", new Class[] {
                    android/content/Context, android/content/Intent
                }).invoke(null, new Object[] {
                    context, intent
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.d("MixpanelAPI - App Links (OPTIONAL)", "Failed to invoke bolts.AppLinks.getTargetUrlFromInboundIntent() -- Unable to detect inbound App Links", context);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.d("MixpanelAPI - App Links (OPTIONAL)", (new StringBuilder()).append("Please install the Bolts library >= 1.1.2 to track App Links: ").append(context.getMessage()).toString());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.d("MixpanelAPI - App Links (OPTIONAL)", (new StringBuilder()).append("Please install the Bolts library >= 1.1.2 to track App Links: ").append(context.getMessage()).toString());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.d("MixpanelAPI - App Links (OPTIONAL)", (new StringBuilder()).append("Unable to detect inbound App Links: ").append(context.getMessage()).toString());
            }
            return;
        } else
        {
            Log.d("MixpanelAPI - App Links (OPTIONAL)", "Context is not an instance of Activity. To detect inbound App Links, pass an instance of an Activity to getInstance.");
            return;
        }
    }

    private static void a(Context context, af af1)
    {
        try
        {
            Class class1 = Class.forName("android.support.v4.a.f");
            Method method = class1.getMethod("getInstance", new Class[] {
                android/content/Context
            });
            class1.getMethod("registerReceiver", new Class[] {
                android/content/BroadcastReceiver, android/content/IntentFilter
            }).invoke(method.invoke(null, new Object[] {
                context
            }), new Object[] {
                new ah(af1), new IntentFilter("com.parse.bolts.measurement_event")
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.d("MixpanelAPI - App Links (OPTIONAL)", "Failed to invoke LocalBroadcastManager.registerReceiver() -- App Links tracking will not be enabled due to this exception", context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.d("MixpanelAPI - App Links (OPTIONAL)", (new StringBuilder()).append("To enable App Links tracking android.support.v4 must be installed: ").append(context.getMessage()).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.d("MixpanelAPI - App Links (OPTIONAL)", (new StringBuilder()).append("To enable App Links tracking android.support.v4 must be installed: ").append(context.getMessage()).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.d("MixpanelAPI - App Links (OPTIONAL)", (new StringBuilder()).append("App Links tracking will not be enabled due to this exception: ").append(context.getMessage()).toString());
        }
    }

    static void a(af af1, JSONArray jsonarray)
    {
        af1.a(jsonarray);
    }

    static void a(af af1, JSONObject jsonobject)
    {
        af1.c(jsonobject);
    }

    static void a(aj aj1)
    {
        Map map = m;
        map;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m.values().iterator(); iterator.hasNext();)
        {
            Iterator iterator1 = ((Map)iterator.next()).values().iterator();
            while (iterator1.hasNext()) 
            {
                aj1.a((af)iterator1.next());
            }
        }

        break MISSING_BLOCK_LABEL_81;
        aj1;
        map;
        JVM INSTR monitorexit ;
        throw aj1;
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
                b.a(jsonobject);
            }
            catch (JSONException jsonexception)
            {
                Log.e("MixpanelAPI.MixpanelAPI", "Malformed people record stored pending identity, will not send it.", jsonexception);
            }
            i1++;
        }
    }

    static o b(af af1)
    {
        return af1.j;
    }

    static void c(af af1)
    {
        af1.k();
    }

    private void c(JSONObject jsonobject)
    {
        if (jsonobject.has("$distinct_id"))
        {
            b.a(jsonobject);
            return;
        } else
        {
            g.a(jsonobject);
            return;
        }
    }

    static Map d(af af1)
    {
        return af1.k;
    }

    static com.android.slyce.report.mpmetrics.ab e(af af1)
    {
        return af1.c;
    }

    static String f(af af1)
    {
        return af1.d;
    }

    private void k()
    {
        JSONArray jsonarray = g.e();
        if (jsonarray != null)
        {
            a(jsonarray);
        }
    }

    av a(Context context, Future future, String s)
    {
        ag ag1 = new ag(this);
        s = (new StringBuilder()).append("com.mixpanel.android.mpmetrics.MixpanelAPI_").append(s).toString();
        return new av(future, n.a(context, s, ag1));
    }

    o a(String s, p p, ab ab1)
    {
        return new o(s, p, ab1);
    }

    public void a()
    {
        b.a();
    }

    public void a(String s, JSONObject jsonobject)
    {
        Long long1;
        synchronized (l)
        {
            long1 = (Long)l.get(s);
            l.remove(s);
        }
        obj = new JSONObject();
        java.util.Map.Entry entry;
        for (Iterator iterator1 = g.b().entrySet().iterator(); iterator1.hasNext(); ((JSONObject) (obj)).put((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator1.next();
        }

          goto _L1
        jsonobject;
        Log.e("MixpanelAPI.MixpanelAPI", (new StringBuilder()).append("Exception tracking event ").append(s).toString(), jsonobject);
_L2:
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
_L1:
        JSONObject jsonobject1 = g.a();
        String s2;
        for (Iterator iterator2 = jsonobject1.keys(); iterator2.hasNext(); ((JSONObject) (obj)).put(s2, jsonobject1.get(s2)))
        {
            s2 = (String)iterator2.next();
        }

        double d1;
        d1 = (double)System.currentTimeMillis() / 1000D;
        ((JSONObject) (obj)).put("time", (long)d1);
        ((JSONObject) (obj)).put("distinct_id", b());
        if (long1 == null)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        ((JSONObject) (obj)).put("$duration", d1 - (double)long1.longValue() / 1000D);
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_316;
        }
        String s1;
        for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); ((JSONObject) (obj)).put(s1, jsonobject.get(s1)))
        {
            s1 = (String)iterator.next();
        }

        jsonobject = new b(s, ((JSONObject) (obj)), d);
        b.a(jsonobject);
        if (i != null)
        {
            i.a(s);
            return;
        }
          goto _L2
    }

    public void a(JSONObject jsonobject)
    {
        g.b(jsonobject);
    }

    ab b(Context context, String s)
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            Log.i("MixpanelAPI.MixpanelAPI", "Web Configuration, A/B Testing, and Dynamic Tweaks are not supported on this Android OS Version");
            return new aq(this);
        } else
        {
            return new ac(a, d, this);
        }
    }

    public String b()
    {
        return g.c();
    }

    public void b(JSONObject jsonobject)
    {
        g.c(jsonobject);
    }

    public ak c()
    {
        return e;
    }

    public Map d()
    {
        return k;
    }

    void e()
    {
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 16 && c.o())
            {
                if (!(a.getApplicationContext() instanceof Application))
                {
                    break label0;
                }
                ((Application)a.getApplicationContext()).registerActivityLifecycleCallbacks(new at(this));
            }
            return;
        }
        Log.i("MixpanelAPI.MixpanelAPI", "Context is not an Application, Mixpanel will not automatically show surveys or in-app notifications.");
    }

    a f()
    {
        return com.android.slyce.report.mpmetrics.a.a(a);
    }

    com.android.slyce.report.mpmetrics.ab g()
    {
        return ab.a(a);
    }

    as h()
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            Log.i("MixpanelAPI.MixpanelAPI", "Surveys and Notifications are not supported on this Android OS Version");
            return new ar(this, null);
        } else
        {
            return new ap(this, null);
        }
    }

    z i()
    {
        if (f instanceof ac)
        {
            return (z)f;
        } else
        {
            return null;
        }
    }

    boolean j()
    {
        return !c.g();
    }

}
