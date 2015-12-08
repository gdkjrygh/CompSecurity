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
import android.support.v4.content.k;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.aj;
import com.facebook.am;
import com.facebook.internal.ak;
import com.facebook.internal.aw;
import com.facebook.internal.ba;
import com.facebook.internal.bc;
import com.facebook.n;
import com.facebook.q;
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
//            k, i, d, e, 
//            n, r, h, l, 
//            b, o, m, q, 
//            j, f, c, g

public class a
{

    private static final String a = com/facebook/a/a.getCanonicalName();
    private static Map d = new ConcurrentHashMap();
    private static ScheduledThreadPoolExecutor e;
    private static int f;
    private static boolean g;
    private static Context h;
    private static Object i = new Object();
    private static String j;
    private static String k;
    private static boolean l;
    private final Context b;
    private final i c;

    private a(Context context, String s)
    {
        bc.a(context, "context");
        b = context;
        AccessToken accesstoken = AccessToken.a();
        if (accesstoken != null && (s == null || s.equals(accesstoken.f())))
        {
            c = new i(accesstoken);
        } else
        {
            String s1 = s;
            if (s == null)
            {
                s1 = aw.a(context);
            }
            c = new i(null, s1);
        }
        synchronized (i)
        {
            if (h == null)
            {
                h = context.getApplicationContext();
            }
        }
        synchronized (i)
        {
            if (e == null)
            {
                break MISSING_BLOCK_LABEL_118;
            }
        }
        return;
        context;
        s;
        JVM INSTR monitorexit ;
        throw context;
        e = new ScheduledThreadPoolExecutor(1);
        context;
        JVM INSTR monitorexit ;
        context = new d();
        e.scheduleAtFixedRate(context, 0L, 15L, TimeUnit.SECONDS);
        context = new e();
        e.scheduleAtFixedRate(context, 0L, 0x15180L, TimeUnit.SECONDS);
        return;
        s;
        context;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static int a()
    {
        int i1;
        synchronized (i)
        {
            i1 = f;
        }
        return i1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static a a(Context context, String s)
    {
        return new a(context, s);
    }

    private static com.facebook.a.n a(l l1, Set set)
    {
        com.facebook.a.n n1 = new com.facebook.a.n((byte)0);
        boolean flag = q.b(h);
        ArrayList arraylist = new ArrayList();
        Iterator iterator = set.iterator();
        do
        {
            if (iterator.hasNext())
            {
                i i1 = (i)iterator.next();
                r r1 = a(i1);
                if (r1 != null)
                {
                    set = i1.b();
                    ba ba1 = aw.a(set, false);
                    GraphRequest graphrequest = GraphRequest.a(String.format("%s/activities", new Object[] {
                        set
                    }), null);
                    Bundle bundle = graphrequest.c();
                    set = bundle;
                    if (bundle == null)
                    {
                        set = new Bundle();
                    }
                    set.putString("access_token", i1.a());
                    graphrequest.a(set);
                    if (ba1 == null)
                    {
                        set = null;
                    } else
                    {
                        int j1 = r1.a(graphrequest, ba1.a(), flag);
                        if (j1 == 0)
                        {
                            set = null;
                        } else
                        {
                            n1.a = j1 + n1.a;
                            graphrequest.a(new h(i1, graphrequest, r1, n1));
                            set = graphrequest;
                        }
                    }
                    if (set != null)
                    {
                        arraylist.add(set);
                    }
                }
            } else
            {
                if (arraylist.size() > 0)
                {
                    ak.a(am.e, a, "Flushing %d events due to %s.", new Object[] {
                        Integer.valueOf(n1.a), l1.toString()
                    });
                    for (l1 = arraylist.iterator(); l1.hasNext(); ((GraphRequest)l1.next()).g()) { }
                    return n1;
                }
                return null;
            }
        } while (true);
    }

    static r a(Context context, i i1)
    {
        return b(context, i1);
    }

    private static r a(i i1)
    {
        synchronized (i)
        {
            i1 = (r)d.get(i1);
        }
        return i1;
        i1;
        obj;
        JVM INSTR monitorexit ;
        throw i1;
    }

    public static void a(Context context)
    {
        Object obj;
        q.a(context);
        obj = aw.a(context);
        if (context == null || obj == null)
        {
            throw new IllegalArgumentException("Both context and applicationId must be non-null");
        }
        if (!(context instanceof Activity)) goto _L2; else goto _L1
_L1:
        Object obj1;
        Object obj2;
        obj1 = (Activity)context;
        obj2 = ((Activity) (obj1)).getCallingActivity();
        if (obj2 == null) goto _L4; else goto _L3
_L3:
        obj2 = ((ComponentName) (obj2)).getPackageName();
        if (!((String) (obj2)).equals(((Activity) (obj1)).getPackageName())) goto _L6; else goto _L5
_L5:
        j();
_L8:
        q.a(context, ((String) (obj)));
        obj1 = new a(context, ((String) (obj)));
        long l1 = System.currentTimeMillis();
        context = "Unclassified";
        if (l)
        {
            context = "Applink";
        }
        obj = context;
        if (k != null)
        {
            obj = (new StringBuilder()).append(context).append("(").append(k).append(")").toString();
        }
        e.execute(new b(((a) (obj1)), l1, ((String) (obj))));
        return;
_L6:
        k = ((String) (obj2));
_L4:
        obj1 = ((Activity) (obj1)).getIntent();
        if (obj1 == null || ((Intent) (obj1)).getBooleanExtra("_fbSourceApplicationHasBeenSet", false))
        {
            j();
        } else
        {
            Bundle bundle = ((Intent) (obj1)).getBundleExtra("al_applink_data");
            if (bundle == null)
            {
                j();
            } else
            {
                l = true;
                bundle = bundle.getBundle("referer_app_link");
                if (bundle == null)
                {
                    k = null;
                } else
                {
                    k = bundle.getString("package");
                    ((Intent) (obj1)).putExtra("_fbSourceApplicationHasBeenSet", true);
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        j();
        Log.d(com/facebook/a/a.getName(), "To set source application the context of activateApp must be an instance of Activity");
        if (true) goto _L8; else goto _L7
_L7:
    }

    static void a(a a1, long l1)
    {
        o.a(h, a1.c, l1);
    }

    static void a(a a1, long l1, String s)
    {
        o.a(h, a1.c, a1, l1, s);
    }

    static void a(i i1, GraphRequest graphrequest, aj aj1, r r1, com.facebook.a.n n1)
    {
        n n2 = aj1.a();
        Object obj = m.a;
        String s;
        boolean flag;
        if (n2 != null)
        {
            if (n2.b() == -1)
            {
                aj1 = m.c;
                s = "Failed: No Connectivity";
            } else
            {
                s = String.format("Failed:\n  Response: %s\n  Error %s", new Object[] {
                    aj1.toString(), n2.toString()
                });
                aj1 = m.b;
            }
        } else
        {
            s = "Success";
            aj1 = ((aj) (obj));
        }
        if (q.a(am.e))
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
            ak.a(am.e, a, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", new Object[] {
                graphrequest.a().toString(), s, obj
            });
        }
        if (n2 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        r1.a(flag);
        if (aj1 == m.c)
        {
            q.a(h, i1, r1);
        }
        if (aj1 != m.a && n1.b != m.c)
        {
            n1.b = aj1;
        }
    }

    static void a(l l1)
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
        i();
        obj = null;
        try
        {
            l1 = a(l1, ((Set) (hashset)));
        }
        // Misplaced declaration of an exception variable
        catch (l l1)
        {
            aw.a(a, "Caught unexpected exception while flushing: ", l1);
            l1 = ((l) (obj));
        }
        synchronized (i)
        {
            g = false;
        }
        if (l1 != null)
        {
            obj = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
            ((Intent) (obj)).putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", ((com.facebook.a.n) (l1)).a);
            ((Intent) (obj)).putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", ((com.facebook.a.n) (l1)).b);
            android.support.v4.content.k.a(h).a(((Intent) (obj)));
            return;
        } else
        {
            return;
        }
        l1;
        obj;
        JVM INSTR monitorexit ;
        throw l1;
        l1;
        obj;
        JVM INSTR monitorexit ;
        throw l1;
    }

    private void a(String s, Double double1, Bundle bundle, boolean flag)
    {
        s = new j(b, s, double1, bundle, flag);
        double1 = b;
        bundle = c;
        q.d().execute(new f(double1, bundle, s));
    }

    private static r b(Context context, i i1)
    {
        com.facebook.internal.a a1;
        r r1 = (r)d.get(i1);
        a1 = null;
        if (r1 == null)
        {
            a1 = com.facebook.internal.a.a(context);
        }
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        r r3 = (r)d.get(i1);
        r r2;
        r2 = r3;
        if (r3 != null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        r2 = new r(a1, context.getPackageName(), d(context));
        d.put(i1, r2);
        obj;
        JVM INSTR monitorexit ;
        return r2;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static Object b()
    {
        return i;
    }

    public static void b(Context context)
    {
        String s = aw.a(context);
        if (context == null || s == null)
        {
            throw new IllegalArgumentException("Both context and applicationId must be non-null");
        } else
        {
            j();
            context = new a(context, s);
            long l1 = System.currentTimeMillis();
            e.execute(new c(context, l1));
            return;
        }
    }

    public static a c(Context context)
    {
        return new a(context, null);
    }

    static Map c()
    {
        return d;
    }

    public static String d(Context context)
    {
        if (j != null) goto _L2; else goto _L1
_L1:
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        String s;
        if (j != null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        s = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
        j = s;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        j = (new StringBuilder("XZ")).append(UUID.randomUUID().toString()).toString();
        context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", j).apply();
        obj;
        JVM INSTR monitorexit ;
_L2:
        return j;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static void d()
    {
        synchronized (i)
        {
            if (a() != k.b && h() > 100)
            {
                l l1 = l.e;
                q.d().execute(new g(l1));
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static Context e()
    {
        return h;
    }

    static String f()
    {
        return a;
    }

    static ScheduledThreadPoolExecutor g()
    {
        return e;
    }

    private static int h()
    {
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = d.values().iterator();
        int i1 = 0;
        while (iterator.hasNext()) 
        {
            i1 = ((r)iterator.next()).a() + i1;
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

    private static int i()
    {
        com.facebook.a.q q1 = q.a(h);
        Iterator iterator = q1.a().iterator();
        Object obj;
        int i1;
        for (i1 = 0; iterator.hasNext(); i1 = ((List) (obj)).size() + i1)
        {
            obj = (i)iterator.next();
            r r1 = b(h, ((i) (obj)));
            obj = q1.a(((i) (obj)));
            r1.a(((List) (obj)));
        }

        return i1;
    }

    private static void j()
    {
        k = null;
        l = false;
    }

    public final void a(String s)
    {
        a(s, ((Bundle) (null)));
    }

    public final void a(String s, double d1, Bundle bundle)
    {
        a(s, Double.valueOf(d1), bundle, false);
    }

    public final void a(String s, Bundle bundle)
    {
        a(s, null, bundle, false);
    }

    public final void b(String s, Bundle bundle)
    {
        a(s, null, bundle, true);
    }

    static 
    {
        f = k.a;
    }
}
