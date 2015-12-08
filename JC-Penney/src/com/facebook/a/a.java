// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.a;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.a.f;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.an;
import com.facebook.aq;
import com.facebook.b.al;
import com.facebook.b.ap;
import com.facebook.b.ar;
import com.facebook.b.d;
import com.facebook.b.z;
import com.facebook.o;
import com.facebook.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.a:
//            j, h, q, m, 
//            g, k, n, e, 
//            b, i, l, p, 
//            f, c, d

public class a
{

    private static final String a = com/facebook/a/a.getCanonicalName();
    private static Map d = new ConcurrentHashMap();
    private static ScheduledThreadPoolExecutor e;
    private static j f;
    private static boolean g;
    private static Context h;
    private static Object i = new Object();
    private static String j;
    private static String k;
    private static boolean l;
    private final Context b;
    private final h c;

    private a(Context context, String s1, AccessToken accesstoken)
    {
        ar.a(context, "context");
        b = context;
        AccessToken accesstoken1 = accesstoken;
        if (accesstoken == null)
        {
            accesstoken1 = AccessToken.a();
        }
        if (accesstoken1 != null && (s1 == null || s1.equals(accesstoken1.h())))
        {
            c = new h(accesstoken1);
        } else
        {
            accesstoken = s1;
            if (s1 == null)
            {
                accesstoken = al.a(context);
            }
            c = new h(null, accesstoken);
        }
        synchronized (i)
        {
            if (h == null)
            {
                h = context.getApplicationContext();
            }
        }
        j();
        return;
        context;
        s1;
        JVM INSTR monitorexit ;
        throw context;
    }

    private static GraphRequest a(h h1, q q1, boolean flag, m m1)
    {
        Object obj = h1.b();
        ap ap1 = al.a(((String) (obj)), false);
        GraphRequest graphrequest = GraphRequest.a(null, String.format("%s/activities", new Object[] {
            obj
        }), null, null);
        Bundle bundle = graphrequest.c();
        obj = bundle;
        if (bundle == null)
        {
            obj = new Bundle();
        }
        ((Bundle) (obj)).putString("access_token", h1.a());
        graphrequest.a(((Bundle) (obj)));
        if (ap1 == null)
        {
            return null;
        }
        int i1 = q1.a(graphrequest, ap1.a(), flag);
        if (i1 == 0)
        {
            return null;
        } else
        {
            m1.a = i1 + m1.a;
            graphrequest.a(new g(h1, graphrequest, q1, m1));
            return graphrequest;
        }
    }

    public static j a()
    {
        j j1;
        synchronized (i)
        {
            j1 = f;
        }
        return j1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static m a(k k1, Set set)
    {
        m m1 = new m(null);
        boolean flag = s.b(h);
        ArrayList arraylist = new ArrayList();
        set = set.iterator();
        do
        {
            if (!set.hasNext())
            {
                break;
            }
            Object obj = (h)set.next();
            q q1 = a(((h) (obj)));
            if (q1 != null)
            {
                obj = a(((h) (obj)), q1, flag, m1);
                if (obj != null)
                {
                    arraylist.add(obj);
                }
            }
        } while (true);
        if (arraylist.size() > 0)
        {
            z.a(aq.e, a, "Flushing %d events due to %s.", new Object[] {
                Integer.valueOf(m1.a), k1.toString()
            });
            for (k1 = arraylist.iterator(); k1.hasNext(); ((GraphRequest)k1.next()).g()) { }
            return m1;
        } else
        {
            return null;
        }
    }

    static q a(Context context, h h1)
    {
        return b(context, h1);
    }

    private static q a(h h1)
    {
        synchronized (i)
        {
            h1 = (q)d.get(h1);
        }
        return h1;
        h1;
        obj;
        JVM INSTR monitorexit ;
        throw h1;
    }

    private void a(long l1, String s1)
    {
        n.a(h, c, this, l1, s1);
    }

    private static void a(Activity activity)
    {
        Object obj = activity.getCallingActivity();
        if (obj != null)
        {
            obj = ((ComponentName) (obj)).getPackageName();
            if (((String) (obj)).equals(activity.getPackageName()))
            {
                c();
                return;
            }
            k = ((String) (obj));
        }
        activity = activity.getIntent();
        if (activity == null || activity.getBooleanExtra("_fbSourceApplicationHasBeenSet", false))
        {
            c();
            return;
        }
        obj = a.a.a(activity);
        if (obj == null)
        {
            c();
            return;
        }
        l = true;
        obj = ((Bundle) (obj)).getBundle("referer_app_link");
        if (obj == null)
        {
            k = null;
            return;
        } else
        {
            k = ((Bundle) (obj)).getString("package");
            activity.putExtra("_fbSourceApplicationHasBeenSet", true);
            return;
        }
    }

    public static void a(Context context)
    {
        s.a(context);
        a(context, al.a(context));
    }

    private static void a(Context context, i i1, h h1)
    {
        s.d().execute(new e(context, h1, i1));
    }

    public static void a(Context context, String s1)
    {
        if (context == null || s1 == null)
        {
            throw new IllegalArgumentException("Both context and applicationId must be non-null");
        }
        long l1;
        if (context instanceof Activity)
        {
            a((Activity)context);
        } else
        {
            c();
            Log.d(com/facebook/a/a.getName(), "To set source application the context of activateApp must be an instance of Activity");
        }
        s.a(context, s1);
        context = new a(context, s1, null);
        l1 = System.currentTimeMillis();
        s1 = b();
        e.execute(new b(context, l1, s1));
    }

    static void a(a a1, long l1, String s1)
    {
        a1.a(l1, s1);
    }

    static void a(h h1, GraphRequest graphrequest, an an1, q q1, m m1)
    {
        b(h1, graphrequest, an1, q1, m1);
    }

    static void a(k k1)
    {
        c(k1);
    }

    private void a(String s1, Double double1, Bundle bundle, boolean flag)
    {
        s1 = new i(b, s1, double1, bundle, flag);
        a(b, ((i) (s1)), c);
    }

    public static a b(Context context)
    {
        return new a(context, null, null);
    }

    public static a b(Context context, String s1)
    {
        return new a(context, s1, null);
    }

    private static q b(Context context, h h1)
    {
        d d1;
        q q1 = (q)d.get(h1);
        d1 = null;
        if (q1 == null)
        {
            d1 = com.facebook.b.d.a(context);
        }
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        q q3 = (q)d.get(h1);
        q q2;
        q2 = q3;
        if (q3 != null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        q2 = new q(d1, context.getPackageName(), c(context));
        d.put(h1, q2);
        obj;
        JVM INSTR monitorexit ;
        return q2;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static String b()
    {
        String s1 = "Unclassified";
        if (l)
        {
            s1 = "Applink";
        }
        String s2 = s1;
        if (k != null)
        {
            s2 = (new StringBuilder()).append(s1).append("(").append(k).append(")").toString();
        }
        return s2;
    }

    private static void b(h h1, GraphRequest graphrequest, an an1, q q1, m m1)
    {
        o o1 = an1.a();
        Object obj = l.a;
        String s1;
        boolean flag;
        if (o1 != null)
        {
            if (o1.b() == -1)
            {
                an1 = l.c;
                s1 = "Failed: No Connectivity";
            } else
            {
                s1 = String.format("Failed:\n  Response: %s\n  Error %s", new Object[] {
                    an1.toString(), o1.toString()
                });
                an1 = l.b;
            }
        } else
        {
            s1 = "Success";
            an1 = ((an) (obj));
        }
        if (s.a(aq.e))
        {
            obj = (String)graphrequest.f();
            try
            {
                obj = (new JSONArray(((String) (obj)))).toString(2);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = "<Can't encode events for debug logging>";
            }
            z.a(aq.e, a, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", new Object[] {
                graphrequest.a().toString(), s1, obj
            });
        }
        if (o1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        q1.a(flag);
        if (an1 == l.c)
        {
            p.a(h, h1, q1);
        }
        if (an1 != l.a && m1.b != l.c)
        {
            m1.b = an1;
        }
    }

    private static void b(k k1)
    {
        s.d().execute(new com.facebook.a.f(k1));
    }

    public static String c(Context context)
    {
        if (j == null)
        {
            synchronized (i)
            {
                if (j == null)
                {
                    j = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                    if (j == null)
                    {
                        j = (new StringBuilder()).append("XZ").append(UUID.randomUUID().toString()).toString();
                        context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", j).apply();
                    }
                }
            }
        }
        return j;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static void c()
    {
        k = null;
        l = false;
    }

    private static void c(k k1)
    {
label0:
        {
            synchronized (i)
            {
                if (!g)
                {
                    break label0;
                }
            }
            return;
        }
        HashSet hashset;
        g = true;
        hashset = new HashSet(d.keySet());
        obj;
        JVM INSTR monitorexit ;
        m();
        obj = null;
        try
        {
            k1 = a(k1, hashset);
        }
        // Misplaced declaration of an exception variable
        catch (k k1)
        {
            al.a(a, "Caught unexpected exception while flushing: ", k1);
            k1 = ((k) (obj));
        }
        synchronized (i)
        {
            g = false;
        }
        if (k1 != null)
        {
            obj = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
            ((Intent) (obj)).putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", ((m) (k1)).a);
            ((Intent) (obj)).putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", ((m) (k1)).b);
            android.support.v4.a.f.a(h).a(((Intent) (obj)));
            return;
        } else
        {
            return;
        }
        k1;
        obj;
        JVM INSTR monitorexit ;
        throw k1;
        k1;
        obj;
        JVM INSTR monitorexit ;
        throw k1;
    }

    static Object d()
    {
        return i;
    }

    static Map e()
    {
        return d;
    }

    static void f()
    {
        k();
    }

    static Context g()
    {
        return h;
    }

    static String h()
    {
        return a;
    }

    static ScheduledThreadPoolExecutor i()
    {
        return e;
    }

    private static void j()
    {
label0:
        {
            synchronized (i)
            {
                if (e == null)
                {
                    break label0;
                }
            }
            return;
        }
        e = new ScheduledThreadPoolExecutor(1);
        obj;
        JVM INSTR monitorexit ;
        obj = new c();
        e.scheduleAtFixedRate(((Runnable) (obj)), 0L, 15L, TimeUnit.SECONDS);
        obj = new com.facebook.a.d();
        e.scheduleAtFixedRate(((Runnable) (obj)), 0L, 0x15180L, TimeUnit.SECONDS);
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static void k()
    {
        synchronized (i)
        {
            if (a() != j.b && l() > 100)
            {
                b(k.e);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static int l()
    {
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = d.values().iterator();
        int i1 = 0;
        while (iterator.hasNext()) 
        {
            i1 = ((q)iterator.next()).a() + i1;
        }
        obj;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static int m()
    {
        p p1 = p.a(h);
        Iterator iterator = p1.a().iterator();
        Object obj;
        int i1;
        for (i1 = 0; iterator.hasNext(); i1 = ((List) (obj)).size() + i1)
        {
            obj = (h)iterator.next();
            q q1 = b(h, ((h) (obj)));
            obj = p1.a(((h) (obj)));
            q1.a(((List) (obj)));
        }

        return i1;
    }

    public void a(String s1, double d1, Bundle bundle)
    {
        a(s1, Double.valueOf(d1), bundle, false);
    }

    public void a(String s1, Bundle bundle)
    {
        a(s1, ((Double) (null)), bundle, false);
    }

    public void a(String s1, Double double1, Bundle bundle)
    {
        a(s1, double1, bundle, true);
    }

    static 
    {
        f = j.a;
    }
}
