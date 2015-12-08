// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.a;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import com.facebook.AccessToken;
import com.facebook.D;
import com.facebook.G;
import com.facebook.GraphRequest;
import com.facebook.internal.K;
import com.facebook.internal.U;
import com.facebook.internal.Y;
import com.facebook.internal.d;
import com.facebook.p;
import com.facebook.r;
import com.facebook.s;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
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
//            b, c, f, e, 
//            d

public class com.facebook.a.a
{
    private static final class a
        implements Serializable
    {

        final String a;
        final String b;

        public final boolean equals(Object obj)
        {
            if (obj instanceof a)
            {
                if (U.a(((a) (obj = (a)obj)).a, a) && U.a(((a) (obj)).b, b))
                {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode()
        {
            int l = 0;
            int k;
            if (a == null)
            {
                k = 0;
            } else
            {
                k = a.hashCode();
            }
            if (b != null)
            {
                l = b.hashCode();
            }
            return k ^ l;
        }

        a(AccessToken accesstoken)
        {
            this(accesstoken.d, s.h());
        }

        a(String s1, String s2)
        {
            String s3 = s1;
            if (U.a(s1))
            {
                s3 = null;
            }
            a = s3;
            b = s2;
        }
    }

    static final class b
        implements Serializable
    {

        private static final HashSet c = new HashSet();
        JSONObject a;
        boolean b;
        private String d;

        private static void a(String s1)
            throws p
        {
            if (s1 == null || s1.length() == 0 || s1.length() > 40)
            {
                String s2 = s1;
                if (s1 == null)
                {
                    s2 = "<None Provided>";
                }
                throw new p(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", new Object[] {
                    s2, Integer.valueOf(40)
                }));
            }
            boolean flag;
            synchronized (c)
            {
                flag = c.contains(s1);
            }
            if (!flag)
            {
                if (!s1.matches("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$"))
                {
                    break MISSING_BLOCK_LABEL_117;
                }
                synchronized (c)
                {
                    c.add(s1);
                }
            }
            return;
            s1;
            hashset;
            JVM INSTR monitorexit ;
            throw s1;
            s1;
            hashset;
            JVM INSTR monitorexit ;
            throw s1;
            throw new p(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", new Object[] {
                s1
            }));
        }

        public final String toString()
        {
            return String.format("\"%s\", implicit: %b, json: %s", new Object[] {
                a.optString("_eventName"), Boolean.valueOf(b), a.toString()
            });
        }


        public b(String s1, String s2, Bundle bundle, boolean flag)
        {
            a(s2);
            d = s2;
            b = flag;
            a = new JSONObject();
            a.put("_eventName", s2);
            a.put("_logTime", System.currentTimeMillis() / 1000L);
            a.put("_ui", s1);
            if (b)
            {
                a.put("_implicitlyLogged", "1");
            }
            if (bundle == null) goto _L2; else goto _L1
_L1:
            s1 = bundle.keySet().iterator();
_L5:
            if (!s1.hasNext()) goto _L2; else goto _L3
_L3:
            Object obj;
            s2 = (String)s1.next();
            a(s2);
            obj = bundle.get(s2);
            if (!(obj instanceof String) && !(obj instanceof Number))
            {
                throw new p(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", new Object[] {
                    obj, s2
                }));
            }
              goto _L4
            s1;
            K.a(G.e, "AppEvents", "JSON encoding for app event failed: '%s'", new Object[] {
                s1.toString()
            });
            a = null;
_L7:
            return;
_L4:
            a.put(s2, obj.toString());
              goto _L5
            s1;
            K.a(G.e, "AppEvents", "Invalid app event name or parameter:", new Object[] {
                s1.toString()
            });
            a = null;
            return;
_L2:
            if (b) goto _L7; else goto _L6
_L6:
            K.a(G.e, "AppEvents", "Created app event '%s'", new Object[] {
                a.toString()
            });
            return;
              goto _L5
        }
    }

    public static final class c extends Enum
    {

        public static final int a;
        public static final int b;
        private static final int c[];

        static 
        {
            a = 1;
            b = 2;
            c = (new int[] {
                a, b
            });
        }
    }

    private static final class d extends Enum
    {

        public static final d a;
        public static final d b;
        public static final d c;
        public static final d d;
        public static final d e;
        public static final d f;
        private static final d g[];

        public static d valueOf(String s1)
        {
            return (d)Enum.valueOf(com/facebook/a/a$d, s1);
        }

        public static d[] values()
        {
            return (d[])g.clone();
        }

        static 
        {
            a = new d("EXPLICIT", 0);
            b = new d("TIMER", 1);
            c = new d("SESSION_CHANGE", 2);
            d = new d("PERSISTED_EVENTS", 3);
            e = new d("EVENT_THRESHOLD", 4);
            f = new d("EAGER_FLUSHING_EVENT", 5);
            g = (new d[] {
                a, b, c, d, e, f
            });
        }

        private d(String s1, int k)
        {
            super(s1, k);
        }
    }

    private static final class e extends Enum
    {

        public static final e a;
        public static final e b;
        public static final e c;
        public static final e d;
        private static final e e[];

        public static e valueOf(String s1)
        {
            return (e)Enum.valueOf(com/facebook/a/a$e, s1);
        }

        public static e[] values()
        {
            return (e[])e.clone();
        }

        static 
        {
            a = new e("SUCCESS", 0);
            b = new e("SERVER_ERROR", 1);
            c = new e("NO_CONNECTIVITY", 2);
            d = new e("UNKNOWN_ERROR", 3);
            e = (new e[] {
                a, b, c, d
            });
        }

        private e(String s1, int k)
        {
            super(s1, k);
        }
    }

    private static final class f
    {

        public int a;
        public e b;

        private f()
        {
            a = 0;
            b = e.a;
        }

        f(byte byte0)
        {
            this();
        }
    }

    static final class g
    {

        private static Object b = new Object();
        HashMap a;
        private Context c;

        public static g a(Context context)
        {
            Object obj1 = b;
            obj1;
            JVM INSTR monitorenter ;
            g g1 = new g(context);
            Object obj = null;
            context = new ObjectInputStream(new BufferedInputStream(g1.c.openFileInput("AppEventsLogger.persistedevents")));
            obj = context;
            HashMap hashmap = (HashMap)context.readObject();
            obj = context;
            g1.c.getFileStreamPath("AppEventsLogger.persistedevents").delete();
            obj = context;
            g1.a = hashmap;
            U.a(context);
_L1:
            obj1;
            JVM INSTR monitorexit ;
            return g1;
_L4:
            U.a(context);
              goto _L1
            context;
            obj1;
            JVM INSTR monitorexit ;
            throw context;
            Exception exception;
            exception;
            context = null;
_L3:
            obj = context;
            com.facebook.a.a.f();
            obj = context;
            (new StringBuilder("Got unexpected exception: ")).append(exception.toString());
            U.a(context);
              goto _L1
_L2:
            U.a(((java.io.Closeable) (obj)));
            throw context;
            context;
              goto _L2
            exception;
              goto _L3
            obj;
              goto _L4
            context;
            context = ((Context) (obj));
              goto _L4
            context;
            obj = null;
              goto _L2
        }

        public static void a(Context context, a a1, h h1)
        {
            HashMap hashmap = new HashMap();
            hashmap.put(a1, h1);
            a(context, ((Map) (hashmap)));
        }

        private static void a(Context context, Map map)
        {
            Object obj = b;
            obj;
            JVM INSTR monitorenter ;
            g g1;
            g1 = a(context);
            context = map.entrySet().iterator();
            do
            {
                if (!context.hasNext())
                {
                    break;
                }
                Object obj1 = (java.util.Map.Entry)context.next();
                map = ((h)((java.util.Map.Entry) (obj1)).getValue()).b();
                if (map.size() != 0)
                {
                    obj1 = (a)((java.util.Map.Entry) (obj1)).getKey();
                    if (!g1.a.containsKey(obj1))
                    {
                        g1.a.put(obj1, new ArrayList());
                    }
                    ((List)g1.a.get(obj1)).addAll(map);
                }
            } while (true);
            break MISSING_BLOCK_LABEL_134;
            context;
            obj;
            JVM INSTR monitorexit ;
            throw context;
            map = new ObjectOutputStream(new BufferedOutputStream(g1.c.openFileOutput("AppEventsLogger.persistedevents", 0)));
            context = map;
            map.writeObject(g1.a);
            U.a(map);
_L1:
            obj;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            map = null;
_L3:
            context = map;
            com.facebook.a.a.f();
            context = map;
            (new StringBuilder("Got unexpected exception: ")).append(exception.toString());
            U.a(map);
              goto _L1
_L2:
            U.a(context);
            throw map;
            map;
              goto _L2
            exception;
              goto _L3
            map;
            context = null;
              goto _L2
        }


        private g(Context context)
        {
            a = new HashMap();
            c = context;
        }
    }

    static final class h
    {

        private List a;
        private List b;
        private int c;
        private com.facebook.internal.d d;
        private String e;
        private String f;
        private final int g = 1000;

        private static byte[] a(String s1)
        {
            try
            {
                s1 = s1.getBytes("UTF-8");
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                U.a("Encoding exception: ", s1);
                return null;
            }
            return s1;
        }

        public final int a()
        {
            this;
            JVM INSTR monitorenter ;
            int k = a.size();
            this;
            JVM INSTR monitorexit ;
            return k;
            Exception exception;
            exception;
            throw exception;
        }

        public final int a(GraphRequest graphrequest, boolean flag, boolean flag1)
        {
            this;
            JVM INSTR monitorenter ;
            Object obj;
            JSONArray jsonarray;
            int k;
            k = c;
            b.addAll(a);
            a.clear();
            jsonarray = new JSONArray();
            obj = b.iterator();
_L3:
            Object obj1;
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_104;
            }
            obj1 = (b)((Iterator) (obj)).next();
            if (flag) goto _L2; else goto _L1
_L1:
            if (((b) (obj1)).b) goto _L3; else goto _L2
_L2:
            jsonarray.put(((b) (obj1)).a);
              goto _L3
            graphrequest;
            this;
            JVM INSTR monitorexit ;
            throw graphrequest;
            if (jsonarray.length() != 0)
            {
                break MISSING_BLOCK_LABEL_116;
            }
            this;
            JVM INSTR monitorexit ;
            return 0;
            this;
            JVM INSTR monitorexit ;
            obj1 = com.facebook.internal.b.a(com.facebook.internal.b.a.b, d, f, flag1, com.facebook.a.a.e());
            obj = obj1;
            if (c <= 0)
            {
                break MISSING_BLOCK_LABEL_163;
            }
            ((JSONObject) (obj1)).put("num_skipped_events", k);
            obj = obj1;
_L5:
            graphrequest.c = ((JSONObject) (obj));
            Object obj2 = graphrequest.d;
            obj = obj2;
            if (obj2 == null)
            {
                obj = new Bundle();
            }
            obj2 = jsonarray.toString();
            if (obj2 != null)
            {
                ((Bundle) (obj)).putByteArray("custom_events_file", a(((String) (obj2))));
                graphrequest.f = obj2;
            }
            graphrequest.d = ((Bundle) (obj));
            return jsonarray.length();
            JSONException jsonexception;
            jsonexception;
            jsonexception = new JSONObject();
            if (true) goto _L5; else goto _L4
_L4:
        }

        public final void a(b b1)
        {
            this;
            JVM INSTR monitorenter ;
            if (a.size() + b.size() < 1000) goto _L2; else goto _L1
_L1:
            c = c + 1;
_L4:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            a.add(b1);
            if (true) goto _L4; else goto _L3
_L3:
            b1;
            throw b1;
        }

        public final void a(List list)
        {
            this;
            JVM INSTR monitorenter ;
            a.addAll(list);
            this;
            JVM INSTR monitorexit ;
            return;
            list;
            throw list;
        }

        public final void a(boolean flag)
        {
            this;
            JVM INSTR monitorenter ;
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_20;
            }
            a.addAll(b);
            b.clear();
            c = 0;
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public final List b()
        {
            this;
            JVM INSTR monitorenter ;
            List list;
            list = a;
            a = new ArrayList();
            this;
            JVM INSTR monitorexit ;
            return list;
            Exception exception;
            exception;
            throw exception;
        }

        public h(com.facebook.internal.d d1, String s1, String s2)
        {
            a = new ArrayList();
            b = new ArrayList();
            d = d1;
            e = s1;
            f = s2;
        }
    }


    private static final String a = com/facebook/a/a.getCanonicalName();
    private static Map d = new ConcurrentHashMap();
    private static ScheduledThreadPoolExecutor e;
    private static int f;
    private static boolean g;
    private static Context h;
    private static Object i = new Object();
    private static String j;
    private final String b;
    private final a c;

    private com.facebook.a.a(Context context, String s1)
    {
        Y.a(context, "context");
        b = U.c(context);
        AccessToken accesstoken = AccessToken.a();
        if (accesstoken != null && (s1 == null || s1.equals(accesstoken.g)))
        {
            c = new a(accesstoken);
        } else
        {
            String s2 = s1;
            if (s1 == null)
            {
                s2 = U.a(context);
            }
            c = new a(null, s2);
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
                break MISSING_BLOCK_LABEL_121;
            }
        }
        return;
        context;
        s1;
        JVM INSTR monitorexit ;
        throw context;
        e = new ScheduledThreadPoolExecutor(1);
        context;
        JVM INSTR monitorexit ;
        context = new com.facebook.a.b();
        e.scheduleAtFixedRate(context, 0L, 15L, TimeUnit.SECONDS);
        context = new com.facebook.a.c();
        e.scheduleAtFixedRate(context, 0L, 0x15180L, TimeUnit.SECONDS);
        return;
        s1;
        context;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public static int a()
    {
        int k;
        synchronized (i)
        {
            k = f;
        }
        return k;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static f a(d d1, Set set)
    {
        f f1 = new f((byte)0);
        boolean flag = s.b(h);
        ArrayList arraylist = new ArrayList();
        Iterator iterator = set.iterator();
        do
        {
            if (iterator.hasNext())
            {
                a a1 = (a)iterator.next();
                h h1 = a(a1);
                if (h1 != null)
                {
                    set = a1.b;
                    com.facebook.internal.U.b b1 = U.a(set, false);
                    GraphRequest graphrequest = GraphRequest.a(String.format("%s/activities", new Object[] {
                        set
                    }));
                    Bundle bundle = graphrequest.d;
                    set = bundle;
                    if (bundle == null)
                    {
                        set = new Bundle();
                    }
                    set.putString("access_token", a1.a);
                    graphrequest.d = set;
                    if (b1 == null)
                    {
                        set = null;
                    } else
                    {
                        int k = h1.a(graphrequest, b1.a, flag);
                        if (k == 0)
                        {
                            set = null;
                        } else
                        {
                            f1.a = k + f1.a;
                            graphrequest.a(new com.facebook.a.f(a1, graphrequest, h1, f1));
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
                    K.a(G.e, a, "Flushing %d events due to %s.", new Object[] {
                        Integer.valueOf(f1.a), d1.toString()
                    });
                    for (d1 = arraylist.iterator(); d1.hasNext(); ((GraphRequest)d1.next()).a()) { }
                    return f1;
                }
                return null;
            }
        } while (true);
    }

    static h a(Context context, a a1)
    {
        return b(context, a1);
    }

    private static h a(a a1)
    {
        synchronized (i)
        {
            a1 = (h)d.get(a1);
        }
        return a1;
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public static com.facebook.a.a a(Context context)
    {
        return new com.facebook.a.a(context, null);
    }

    public static com.facebook.a.a a(Context context, String s1)
    {
        return new com.facebook.a.a(context, s1);
    }

    static void a(a a1, GraphRequest graphrequest, D d1, h h1, f f1)
    {
        r r1 = d1.b;
        Object obj = e.a;
        String s1;
        boolean flag;
        if (r1 != null)
        {
            if (r1.c == -1)
            {
                d1 = e.c;
                s1 = "Failed: No Connectivity";
            } else
            {
                s1 = String.format("Failed:\n  Response: %s\n  Error %s", new Object[] {
                    d1.toString(), r1.toString()
                });
                d1 = e.b;
            }
        } else
        {
            s1 = "Success";
            d1 = ((D) (obj));
        }
        if (s.a(G.e))
        {
            obj = (String)graphrequest.f;
            try
            {
                obj = (new JSONArray(((String) (obj)))).toString(2);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = "<Can't encode events for debug logging>";
            }
            K.a(G.e, a, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", new Object[] {
                graphrequest.c.toString(), s1, obj
            });
        }
        if (r1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h1.a(flag);
        if (d1 == e.c)
        {
            g.a(h, a1, h1);
        }
        if (d1 != e.a && f1.b != e.c)
        {
            f1.b = d1;
        }
    }

    static void a(d d1)
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
        h();
        obj = null;
        try
        {
            d1 = a(d1, ((Set) (hashset)));
        }
        // Misplaced declaration of an exception variable
        catch (d d1)
        {
            U.d(a);
            d1 = ((d) (obj));
        }
        synchronized (i)
        {
            g = false;
        }
        if (d1 != null)
        {
            obj = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
            ((Intent) (obj)).putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", ((f) (d1)).a);
            ((Intent) (obj)).putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", ((f) (d1)).b);
            LocalBroadcastManager.getInstance(h).sendBroadcast(((Intent) (obj)));
            return;
        } else
        {
            return;
        }
        d1;
        obj;
        JVM INSTR monitorexit ;
        throw d1;
        d1;
        obj;
        JVM INSTR monitorexit ;
        throw d1;
    }

    private static h b(Context context, a a1)
    {
        com.facebook.internal.d d1;
        h h1 = (h)d.get(a1);
        d1 = null;
        if (h1 == null)
        {
            d1 = com.facebook.internal.d.a(context);
        }
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        h h3 = (h)d.get(a1);
        h h2;
        h2 = h3;
        if (h3 != null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        h2 = new h(d1, context.getPackageName(), b(context));
        d.put(a1, h2);
        obj;
        JVM INSTR monitorexit ;
        return h2;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static Object b()
    {
        return i;
    }

    private static String b(Context context)
    {
        if (j != null) goto _L2; else goto _L1
_L1:
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        String s1;
        if (j != null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        s1 = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
        j = s1;
        if (s1 != null)
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

    static Map c()
    {
        return d;
    }

    static void d()
    {
        synchronized (i)
        {
            if (a() != c.b && g() > 100)
            {
                d d1 = d.e;
                s.d().execute(new com.facebook.a.e(d1));
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

    private static int g()
    {
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = d.values().iterator();
        int k = 0;
        while (iterator.hasNext()) 
        {
            k = ((h)iterator.next()).a() + k;
        }
        obj;
        JVM INSTR monitorexit ;
        return k;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static int h()
    {
        g g1 = g.a(h);
        Iterator iterator = g1.a.keySet().iterator();
        Object obj;
        int k;
        for (k = 0; iterator.hasNext(); k = ((List) (obj)).size() + k)
        {
            obj = (a)iterator.next();
            h h1 = b(h, ((a) (obj)));
            obj = (List)g1.a.get(obj);
            h1.a(((List) (obj)));
        }

        return k;
    }

    public final void a(String s1, Bundle bundle, boolean flag)
    {
        s1 = new b(b, s1, bundle, flag);
        bundle = h;
        a a1 = c;
        s.d().execute(new com.facebook.a.d(bundle, a1, s1));
    }

    static 
    {
        f = c.a;
    }
}
