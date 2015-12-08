// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.leanplum.callbacks.ActionCallback;
import com.leanplum.callbacks.RegisterDeviceCallback;
import com.leanplum.callbacks.RegisterDeviceFinishedCallback;
import com.leanplum.callbacks.StartCallback;
import com.leanplum.callbacks.VariablesChangedCallback;
import com.leanplum.messagetemplates.MessageTemplates;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.leanplum:
//            LeanplumDeviceIdMode, T, N, LeanplumActivityHelper, 
//            g, aU, c, aV, 
//            aa, E, Util, ActionContext, 
//            s, w, a, y, 
//            ActionArgs, f, t, u, 
//            LeanplumException, z, K, LeanplumPushService, 
//            F, J, L, b, 
//            FileManager, l, C, D, 
//            Var, A, ac, B, 
//            x, v, M

public class Leanplum
{

    public static int ACTION_KIND_ACTION = 0;
    public static int ACTION_KIND_MESSAGE = 0;
    public static final String PURCHASE_EVENT_NAME = "Purchase";
    static boolean a;
    static boolean b = false;
    static boolean c;
    private static ArrayList d = new ArrayList();
    private static ArrayList e = new ArrayList();
    private static ArrayList f = new ArrayList();
    private static ArrayList g = new ArrayList();
    private static Map h = new HashMap();
    private static RegisterDeviceCallback i;
    private static RegisterDeviceFinishedCallback j;
    private static c k;
    private static boolean l;
    private static boolean m;
    private static boolean n;
    private static LeanplumDeviceIdMode o;
    private static String p;
    private static boolean q;
    private static boolean r = false;
    private static boolean s;
    private static Object t = new Object();
    private static ScheduledExecutorService u;
    private static Context v;
    private static Queue w = new ConcurrentLinkedQueue();
    private static StartCallback x;

    private Leanplum()
    {
    }

    private static void A()
    {
        T.b("resumeState", new HashMap()).e();
    }

    static Context a()
    {
        if (v == null)
        {
            Log.e("Leanplum", "Your application context is not set. You should call Leanplum.setApplicationContext(this) or LeanplumActivityHelper.enableLifecycleCallbacks(this) in your application's onCreate method, or have your application extend LeanplumApplication.");
        }
        return v;
    }

    private static Map a(Map map, String s1, boolean flag)
    {
        HashMap hashmap;
        Iterator iterator;
        if (map == null)
        {
            return null;
        }
        hashmap = new HashMap();
        iterator = map.keySet().iterator();
_L4:
        Object obj1;
        String s2;
        do
        {
            if (!iterator.hasNext())
            {
                return hashmap;
            }
            s2 = (String)iterator.next();
            obj1 = map.get(s2);
        } while (obj1 == null);
        if (!flag || !(obj1 instanceof Iterable)) goto _L2; else goto _L1
_L1:
        Object obj = ((Iterable)obj1).iterator();
_L6:
        boolean flag1;
        if (((Iterator) (obj)).hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        flag1 = true;
_L7:
        if (!flag1) goto _L4; else goto _L3
_L3:
        obj = obj1;
_L8:
        hashmap.put(s2, obj);
        break; /* Loop/switch isn't completed */
        if (a(((Iterator) (obj)).next(), s1)) goto _L6; else goto _L5
_L5:
        flag1 = false;
          goto _L7
_L2:
        obj = obj1;
        if (obj1 instanceof Date)
        {
            obj = Long.valueOf(((Date)obj1).getTime());
        }
        if (!a(obj, s1)) goto _L4; else goto _L8
    }

    private static void a(Context context, String s1, Map map, StartCallback startcallback, Boolean boolean1)
    {
        com/leanplum/Leanplum;
        JVM INSTR monitorenter ;
        N.a();
        if (context instanceof Activity)
        {
            LeanplumActivityHelper.b = (Activity)context;
        }
        boolean flag;
        if (LeanplumActivityHelper.b != null && !LeanplumActivityHelper.a)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (!com.leanplum.g.a()) goto _L2; else goto _L1
_L1:
        l = true;
        m = true;
        d(true);
        w();
        x();
        aU.a(new HashMap(), new HashMap(), new HashMap(), new ArrayList());
_L3:
        com/leanplum/Leanplum;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (startcallback == null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        addStartResponseHandler(startcallback);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        setApplicationContext(context.getApplicationContext());
        if (!a)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        if (!c)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        c = false;
        r();
          goto _L3
        context;
        throw context;
        Log.i("Leanplum", "Already called start");
          goto _L3
        r = true;
        MessageTemplates.register(a());
        c = flag;
        map = a(map, "userAttributes", true);
        a = true;
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        w.add(map);
        k = com.leanplum.c.a();
        aU.a(true);
        aU.d();
        aU.a(false);
        aU.a(new aV());
        T.a(new aa());
        if (p != null || !o.equals(LeanplumDeviceIdMode.ADVERTISING_ID))
        {
            break MISSING_BLOCK_LABEL_282;
        }
        Util.a(new E(context, s1, map, flag), new Void[0]);
          goto _L3
        b(context, s1, map, flag);
          goto _L3
    }

    static void a(Context context, String s1, Map map, boolean flag)
    {
        b(context, s1, map, flag);
    }

    static void a(ActionContext actioncontext)
    {
        a(actioncontext, ((VariablesChangedCallback) (null)));
    }

    private static void a(ActionContext actioncontext, VariablesChangedCallback variableschangedcallback)
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = (List)h.get(actioncontext.actionName());
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        if (variableschangedcallback == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        variableschangedcallback.variablesChanged();
        obj;
        JVM INSTR monitorexit ;
        return;
        obj1 = new ArrayList(((java.util.Collection) (obj1)));
        obj;
        JVM INSTR monitorexit ;
        obj = new AtomicBoolean(false);
        ActionCallback actioncallback;
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); N.a().a(new s(actioncallback, actioncontext, variableschangedcallback, ((AtomicBoolean) (obj)))))
        {
            actioncallback = (ActionCallback)((Iterator) (obj1)).next();
        }

        break MISSING_BLOCK_LABEL_111;
        actioncontext;
        throw actioncontext;
    }

    static void a(RuntimeException runtimeexception)
    {
        if (g.k)
        {
            throw runtimeexception;
        } else
        {
            Log.e("Leanplum", (new StringBuilder(String.valueOf(runtimeexception.getMessage()))).append(" This error is only thrown in development mode.").toString(), runtimeexception);
            return;
        }
    }

    static void a(String s1)
    {
        if (com.leanplum.g.a())
        {
            return;
        } else
        {
            s1 = new w(s1);
            x = s1;
            addStartResponseHandler(s1);
            return;
        }
    }

    static void a(String s1, double d1, String s2, Map map, Map map1)
    {
        if (com.leanplum.g.a())
        {
            return;
        }
        if (!a)
        {
            Log.e("Leanplum", "You cannot call track before calling start");
            return;
        }
        HashMap hashmap = new HashMap();
        if (map1 != null)
        {
            hashmap.putAll(map1);
        }
        hashmap.put("value", (new StringBuilder()).append(d1).toString());
        hashmap.put("info", s2);
        if (s1 != null)
        {
            hashmap.put("event", s1);
        }
        s2 = map;
        if (map != null)
        {
            s2 = a(map, "params", false);
            hashmap.put("params", com.leanplum.a.a(s2));
        }
        if (!s || LeanplumActivityHelper.a)
        {
            hashmap.put("allowOffline", Boolean.TRUE.toString());
        }
        if (l)
        {
            c(s1, s2, hashmap);
            return;
        } else
        {
            addStartResponseHandler(new y(s1, s2, hashmap));
            return;
        }
    }

    private static void a(String s1, int i1, ActionArgs actionargs, Map map, ActionCallback actioncallback)
    {
        map = a();
        if (!r)
        {
            r = true;
            MessageTemplates.register(map);
        }
        map = new HashMap();
        h.remove(s1);
        aU.a(s1, i1, actionargs.a(), map);
        if (actioncallback != null)
        {
            onAction(s1, actioncallback);
        }
    }

    static void a(String s1, String s2)
    {
        Map map = aU.l();
        if (map != null)
        {
            if ((map = (Map)map.get(s2)) != null)
            {
                (new ActionContext(map.get("action").toString(), (Map)map.get("vars"), s2)).runTrackedActionNamed(s1);
                return;
            }
        }
    }

    static void a(String s1, String s2, int i1, String s3, b b1)
    {
        a(new String[] {
            s1
        }, s2, i1, s3, b1);
    }

    static void a(String s1, HashMap hashmap)
    {
        b(s1, hashmap);
    }

    static void a(String s1, Map map, Map map1)
    {
        c(s1, map, map1);
    }

    static void a(HashMap hashmap)
    {
        b(hashmap);
    }

    static void a(boolean flag)
    {
        l = true;
    }

    private static void a(String as[], String s1, int i1, String s2, b b1)
    {
        Map map = aU.l();
        if (map != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Iterator iterator = map.keySet().iterator();
_L5:
        if (!iterator.hasNext()) goto _L1; else goto _L3
_L3:
        String s3 = (String)iterator.next();
        if (s3 != null && s3.equals(s2)) goto _L5; else goto _L4
_L4:
        Object obj;
        Object obj1;
        obj = (Map)map.get(s3);
        obj1 = (String)((Map) (obj)).get("action");
        if (!(obj1 instanceof String)) goto _L5; else goto _L6
_L6:
        int j1;
        int k1;
        if (((String) (obj1)).equals("__Push Notification"))
        {
            j1 = 0;
        } else
        {
            j1 = 1;
        }
        if (j1 != 0 && (i1 & 1) == 0) goto _L5; else goto _L7
_L7:
        obj1 = new f();
        k1 = as.length;
        j1 = 0;
_L8:
label0:
        {
            if (j1 < k1)
            {
                break label0;
            }
            if (((f) (obj1)).b)
            {
                a(new ActionContext((new StringBuilder("__Cancel")).append(((Map) (obj)).get("action")).toString(), new HashMap(), s3), ((VariablesChangedCallback) (new t(s3))));
            }
            if (((f) (obj1)).a)
            {
                k.a(s3);
                if (((f) (obj1)).c)
                {
                    obj = new ActionContext(((Map) (obj)).get("action").toString(), (Map)((Map) (obj)).get("vars"), s3);
                    ((ActionContext) (obj)).a(b1);
                    a(((ActionContext) (obj)), ((VariablesChangedCallback) (new u(s3))));
                }
            }
        }
          goto _L5
          goto _L1
        Object obj2 = as[j1];
        obj2 = k.a(s3, ((Map) (obj)), ((String) (obj2)), s1, b1);
        obj1.a = ((f) (obj1)).a | ((f) (obj2)).a;
        obj1.b = ((f) (obj1)).b | ((f) (obj2)).b;
        boolean flag = ((f) (obj1)).c;
        obj1.c = ((f) (obj2)).c | flag;
        j1++;
          goto _L8
    }

    private static boolean a(Object obj, String s1)
    {
        if (!(obj instanceof Number) && !(obj instanceof String) && !(obj instanceof Boolean))
        {
            a(((RuntimeException) (new LeanplumException((new StringBuilder(String.valueOf(s1))).append(" values must be of type String, Number, or Boolean.").toString()))));
            return false;
        } else
        {
            return true;
        }
    }

    public static void addOnceVariablesChangedAndNoDownloadsPendingHandler(VariablesChangedCallback variableschangedcallback)
    {
        if (aU.c() && T.i() == 0)
        {
            variableschangedcallback.variablesChanged();
            return;
        }
        synchronized (g)
        {
            g.add(variableschangedcallback);
        }
    }

    public static void addStartResponseHandler(StartCallback startcallback)
    {
        if (l)
        {
            startcallback.setSuccess(m);
            startcallback.run();
            return;
        }
        synchronized (d)
        {
            if (d.indexOf(startcallback) == -1)
            {
                d.add(startcallback);
            }
        }
    }

    public static void addVariablesChangedAndNoDownloadsPendingHandler(VariablesChangedCallback variableschangedcallback)
    {
        synchronized (f)
        {
            f.add(variableschangedcallback);
        }
        if (aU.c() && T.i() == 0)
        {
            variableschangedcallback.variablesChanged();
        }
    }

    public static void addVariablesChangedHandler(VariablesChangedCallback variableschangedcallback)
    {
        synchronized (e)
        {
            e.add(variableschangedcallback);
        }
        if (aU.c())
        {
            variableschangedcallback.variablesChanged();
        }
    }

    public static void advanceTo(String s1)
    {
        advanceTo(s1, "", null);
    }

    public static void advanceTo(String s1, String s2)
    {
        advanceTo(s1, s2, null);
    }

    public static void advanceTo(String s1, String s2, Map map)
    {
        if (com.leanplum.g.a())
        {
            return;
        }
        if (!a)
        {
            Log.e("Leanplum", "You cannot call advanceTo before calling start");
            return;
        }
        HashMap hashmap = new HashMap();
        hashmap.put("info", s2);
        hashmap.put("state", s1);
        if (map != null)
        {
            s2 = a(map, "params", false);
            hashmap.put("params", com.leanplum.a.a(s2));
        } else
        {
            s2 = null;
        }
        if (l)
        {
            d(s1, s2, hashmap);
            return;
        } else
        {
            addStartResponseHandler(new z(s1, s2, hashmap));
            return;
        }
    }

    public static void advanceTo(String s1, Map map)
    {
        advanceTo(s1, "", map);
    }

    static void b()
    {
        if (com.leanplum.g.a())
        {
            return;
        }
        if (!a)
        {
            Log.e("Leanplum", "You cannot call pause before calling start");
            return;
        }
        b = true;
        if (l)
        {
            s();
            return;
        } else
        {
            addStartResponseHandler(new K());
            return;
        }
    }

    private static void b(Context context, String s1, Map map, boolean flag)
    {
        LeanplumPushService.b();
        Object obj1 = null;
        HashMap hashmap = null;
        if (T.c() == null)
        {
            Object obj;
            int i1;
            if (!q && g.i != null)
            {
                obj = g.i;
                obj1 = hashmap;
            } else
            if (p != null)
            {
                obj = p;
                obj1 = hashmap;
            } else
            {
                obj1 = Util.a(o);
                obj = ((Util.DeviceIdInfo) (obj1)).a;
                obj1 = Boolean.valueOf(((Util.DeviceIdInfo) (obj1)).b);
            }
            T.a(((String) (obj)));
        }
        obj = s1;
        if (s1 == null)
        {
            s1 = T.d();
            obj = s1;
            if (s1 == null)
            {
                obj = T.c();
            }
        }
        T.b(((String) (obj)));
        obj = Util.a();
        s1 = ((String) (obj));
        if (obj == null)
        {
            s1 = "";
        }
        obj = TimeZone.getDefault();
        i1 = ((TimeZone) (obj)).getOffset((new Date()).getTime()) / 1000;
        hashmap = new HashMap();
        hashmap.put("includeDefaults", "false");
        if (flag)
        {
            hashmap.put("background", Boolean.toString(true));
        }
        hashmap.put("versionName", s1);
        hashmap.put("deviceName", Util.f());
        hashmap.put("deviceModel", Util.b());
        hashmap.put("systemName", Util.c());
        hashmap.put("systemVersion", Util.d());
        hashmap.put("timezone", ((TimeZone) (obj)).getID());
        hashmap.put("timezoneOffsetSeconds", (new StringBuilder()).append(i1).toString());
        hashmap.put("locale", Util.g());
        hashmap.put("country", "(detect)");
        hashmap.put("region", "(detect)");
        hashmap.put("city", "(detect)");
        hashmap.put("location", "(detect)");
        if (Boolean.TRUE.equals(obj1))
        {
            hashmap.put("limitTracking", ((Boolean) (obj1)).toString());
        }
        if (map != null)
        {
            hashmap.put("userAttributes", com.leanplum.a.a(map));
        }
        if (g.k)
        {
            hashmap.put("devMode", Boolean.TRUE.toString());
        }
        Util.a(hashmap);
        s1 = T.b("start", hashmap);
        s1.a(new F(context, flag));
        s1.a(new J());
        s1.h();
    }

    private static void b(String s1, HashMap hashmap)
    {
        T.b("setUserAttributes", hashmap).e();
        if (s1 != null && s1.length() > 0)
        {
            T.b(s1);
            if (l)
            {
                aU.e();
            }
        }
        y();
    }

    static void b(String s1, Map map, Map map1)
    {
        d(s1, map, map1);
    }

    private static void b(HashMap hashmap)
    {
        T.b("setTrafficSourceInfo", hashmap).e();
    }

    static void b(boolean flag)
    {
        m = flag;
    }

    static void c()
    {
        if (com.leanplum.g.a())
        {
            return;
        }
        if (!a)
        {
            Log.e("Leanplum", "You cannot call resume before calling start");
            return;
        }
        b = false;
        if (l)
        {
            t();
            return;
        } else
        {
            addStartResponseHandler(new L());
            return;
        }
    }

    private static void c(String s1, Map map, Map map1)
    {
        T.b("track", map1).e();
        String s2 = (String)map1.get("messageId");
        map1 = s1;
        if (s2 != null)
        {
            map1 = (new StringBuilder(".m")).append(s2).toString();
            if (s1 != null && s1.length() > 0)
            {
                map1 = (new StringBuilder(String.valueOf(map1))).append(" ").append(s1).toString();
            }
        }
        s1 = new b();
        s1.a = map;
        a("event", map1, 3, s2, s1);
    }

    static void c(boolean flag)
    {
        d(flag);
    }

    static void d()
    {
        Object obj = FileManager.b;
        obj;
        JVM INSTR monitorenter ;
        if (!FileManager.a())
        {
            break MISSING_BLOCK_LABEL_25;
        }
        FileManager.a(new l());
_L2:
        return;
        v();
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        throw exception;
    }

    private static void d(String s1, Map map, Map map1)
    {
        T.b("advance", map1).e();
        map1 = new b();
        map1.a = map;
        a("state", s1, 3, ((String) (null)), map1);
    }

    private static void d(boolean flag)
    {
        ArrayList arraylist = d;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator = d.iterator();
_L2:
        if (iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_31;
        }
        d.clear();
        return;
        StartCallback startcallback = (StartCallback)iterator.next();
        startcallback.setSuccess(flag);
        N.a().a(startcallback);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        throw exception;
    }

    public static void defineAction(String s1, int i1, ActionArgs actionargs)
    {
        a(s1, i1, actionargs, ((Map) (null)), ((ActionCallback) (null)));
    }

    public static void defineAction(String s1, int i1, ActionArgs actionargs, ActionCallback actioncallback)
    {
        a(s1, i1, actionargs, ((Map) (null)), actioncallback);
    }

    static void e()
    {
        w();
    }

    public static void enableTestMode()
    {
        g.l = true;
    }

    public static void enableVerboseLoggingInDevelopmentMode()
    {
        g.m = true;
    }

    static void f()
    {
        x();
    }

    public static void forceContentUpdate()
    {
        forceContentUpdate(null);
    }

    public static void forceContentUpdate(VariablesChangedCallback variableschangedcallback)
    {
        if (com.leanplum.g.a())
        {
            if (variableschangedcallback != null)
            {
                N.a().a(variableschangedcallback);
            }
            return;
        } else
        {
            Object obj = new HashMap();
            ((Map) (obj)).put("includeDefaults", "false");
            obj = T.b("getVars", ((Map) (obj)));
            ((T) (obj)).a(new C(variableschangedcallback));
            ((T) (obj)).a(new D(variableschangedcallback));
            ((T) (obj)).h();
            return;
        }
    }

    static RegisterDeviceCallback g()
    {
        return i;
    }

    static RegisterDeviceFinishedCallback h()
    {
        return j;
    }

    public static boolean hasStarted()
    {
        return l;
    }

    public static boolean hasStartedAndRegisteredAsDeveloper()
    {
        return n;
    }

    static void i()
    {
        r();
    }

    public static boolean isTestModeEnabled()
    {
        return g.l;
    }

    static void j()
    {
        u();
    }

    static void k()
    {
        s();
    }

    static void l()
    {
        t();
    }

    static void m()
    {
        v();
    }

    static c n()
    {
        return k;
    }

    static StartCallback o()
    {
        return x;
    }

    public static transient Object objectForKeyPath(Object aobj[])
    {
        return aU.a(aobj);
    }

    public static Object objectForKeyPathComponents(Object aobj[])
    {
        return aU.a(aobj);
    }

    public static void onAction(String s1, ActionCallback actioncallback)
    {
        if (h == null)
        {
            h = new HashMap();
        }
        List list = (List)h.get(s1);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            h.put(s1, obj);
        }
        ((List) (obj)).add(actioncallback);
    }

    static void p()
    {
        z();
    }

    public static String pathForResource(String s1)
    {
        return Var.defineFile(s1, s1).fileValue();
    }

    public static void pauseState()
    {
        if (com.leanplum.g.a())
        {
            return;
        }
        if (!a)
        {
            Log.e("Leanplum", "You cannot call pauseState before calling start");
            return;
        }
        if (l)
        {
            z();
            return;
        } else
        {
            addStartResponseHandler(new A());
            return;
        }
    }

    static void q()
    {
        A();
    }

    private static void r()
    {
label0:
        {
            synchronized (t)
            {
                if (!s)
                {
                    break label0;
                }
            }
            return;
        }
        s = true;
        obj;
        JVM INSTR monitorexit ;
        if (g.k && !com.leanplum.g.a())
        {
            new ac();
        }
        a(new String[] {
            "start", "resume"
        }, ((String) (null)), 3, ((String) (null)), ((b) (null)));
        y();
        return;
        exception;
        throw exception;
    }

    public static void removeOnceVariablesChangedAndNoDownloadsPendingHandler(VariablesChangedCallback variableschangedcallback)
    {
        synchronized (g)
        {
            g.remove(variableschangedcallback);
        }
    }

    public static void removeStartResponseHandler(StartCallback startcallback)
    {
        synchronized (d)
        {
            d.remove(startcallback);
        }
    }

    public static void removeVariablesChangedAndNoDownloadsPendingHandler(VariablesChangedCallback variableschangedcallback)
    {
        synchronized (f)
        {
            f.remove(variableschangedcallback);
        }
    }

    public static void removeVariablesChangedHandler(VariablesChangedCallback variableschangedcallback)
    {
        synchronized (e)
        {
            e.remove(variableschangedcallback);
        }
    }

    static void reset()
    {
        a = false;
        l = false;
        n = false;
        m = false;
        d.clear();
        e.clear();
        f.clear();
        g.clear();
        h.clear();
        w.clear();
    }

    public static void resumeState()
    {
        if (com.leanplum.g.a())
        {
            return;
        }
        if (!a)
        {
            Log.e("Leanplum", "You cannot call resumeState before calling start");
            return;
        }
        if (l)
        {
            A();
            return;
        } else
        {
            addStartResponseHandler(new B());
            return;
        }
    }

    private static void s()
    {
        T.b("pauseSession", null).h();
        if (u != null)
        {
            u.shutdown();
        }
    }

    public static void setApiConnectionSettings(String s1, String s2, boolean flag)
    {
        g.a = s1;
        g.q = s2;
        g.d = flag;
    }

    public static void setAppIdForDevelopmentMode(String s1, String s2)
    {
        g.k = true;
        T.a(s1, s2);
    }

    public static void setAppIdForProductionMode(String s1, String s2)
    {
        g.k = false;
        T.a(s1, s2);
    }

    public static void setApplicationContext(Context context)
    {
        v = context;
    }

    public static void setCanDownloadContentMidSessionInProductionMode(boolean flag)
    {
        g.o = flag;
    }

    static void setClient(String s1, String s2, String s3)
    {
        g.h = s1;
        g.g = s2;
        g.i = s3;
    }

    public static void setDeviceId(String s1)
    {
        p = s1;
        q = true;
    }

    public static void setDeviceIdMode(LeanplumDeviceIdMode leanplumdeviceidmode)
    {
        o = leanplumdeviceidmode;
        q = true;
    }

    public static void setFileHashingEnabledInDevelopmentMode(boolean flag)
    {
        g.j = flag;
    }

    public static void setFileUploadingEnabledInDevelopmentMode(boolean flag)
    {
        g.n = flag;
    }

    public static void setIsTestModeEnabled(boolean flag)
    {
        g.l = flag;
    }

    public static void setNetworkTimeout(int i1, int j1)
    {
        g.e = i1;
        g.f = j1;
    }

    public static void setRegisterDeviceHandler(RegisterDeviceCallback registerdevicecallback, RegisterDeviceFinishedCallback registerdevicefinishedcallback)
    {
        i = registerdevicecallback;
        j = registerdevicefinishedcallback;
    }

    public static void setSocketConnectionSettings(String s1, int i1)
    {
        g.b = s1;
        g.c = i1;
    }

    public static void setTrafficSourceInfo(Map map)
    {
        if (com.leanplum.g.a())
        {
            return;
        }
        if (!a)
        {
            Log.e("Leanplum", "You cannot call setTrafficSourceInfo before calling start");
            return;
        }
        HashMap hashmap = new HashMap();
        hashmap.put("trafficSource", com.leanplum.a.a(a(map, "info", false)));
        if (l)
        {
            b(hashmap);
            return;
        } else
        {
            addStartResponseHandler(new x(hashmap));
            return;
        }
    }

    public static void setUserAttributes(String s1, Map map)
    {
        if (com.leanplum.g.a())
        {
            return;
        }
        if (!a)
        {
            Log.e("Leanplum", "You cannot call setUserAttributes before calling start");
            return;
        }
        HashMap hashmap = new HashMap();
        if (s1 != null)
        {
            hashmap.put("newUserId", s1);
        }
        if (map != null)
        {
            map = a(map, "userAttributes", true);
            hashmap.put("userAttributes", com.leanplum.a.a(map));
            w.add(map);
        }
        if (l)
        {
            b(s1, hashmap);
            return;
        } else
        {
            addStartResponseHandler(new v(s1, hashmap));
            return;
        }
    }

    public static void setUserAttributes(Map map)
    {
        setUserAttributes(null, map);
    }

    public static void setUserId(String s1)
    {
        setUserAttributes(s1, null);
    }

    public static void start(Context context)
    {
        a(context, ((String) (null)), ((Map) (null)), ((StartCallback) (null)), ((Boolean) (null)));
    }

    public static void start(Context context, StartCallback startcallback)
    {
        a(context, ((String) (null)), ((Map) (null)), startcallback, ((Boolean) (null)));
    }

    public static void start(Context context, String s1)
    {
        a(context, s1, ((Map) (null)), ((StartCallback) (null)), ((Boolean) (null)));
    }

    public static void start(Context context, String s1, StartCallback startcallback)
    {
        a(context, s1, ((Map) (null)), startcallback, ((Boolean) (null)));
    }

    public static void start(Context context, String s1, Map map)
    {
        a(context, s1, map, ((StartCallback) (null)), ((Boolean) (null)));
    }

    public static void start(Context context, String s1, Map map, StartCallback startcallback)
    {
        com/leanplum/Leanplum;
        JVM INSTR monitorenter ;
        a(context, s1, map, startcallback, ((Boolean) (null)));
        com/leanplum/Leanplum;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public static void start(Context context, Map map)
    {
        a(context, ((String) (null)), map, ((StartCallback) (null)), ((Boolean) (null)));
    }

    public static void syncResources()
    {
        if (com.leanplum.g.a())
        {
            return;
        } else
        {
            FileManager.a(null, null, false);
            return;
        }
    }

    public static void syncResources(List list, List list1)
    {
        FileManager.a(list, list1, false);
    }

    public static void syncResourcesAsync()
    {
        if (com.leanplum.g.a())
        {
            return;
        } else
        {
            FileManager.a(null, null, true);
            return;
        }
    }

    public static void syncResourcesAsync(List list, List list1)
    {
        FileManager.a(list, list1, true);
    }

    private static void t()
    {
        T t1 = T.b("resumeSession", null);
        if (c)
        {
            c = false;
            t1.e();
            r();
        } else
        {
            t1.f();
            a("resume", ((String) (null)), 3, ((String) (null)), ((b) (null)));
        }
        u();
    }

    public static void track(String s1)
    {
        track(s1, 0.0D, "", null);
    }

    public static void track(String s1, double d1)
    {
        track(s1, d1, "", null);
    }

    public static void track(String s1, double d1, String s2)
    {
        track(s1, d1, s2, null);
    }

    public static void track(String s1, double d1, String s2, Map map)
    {
        a(s1, d1, s2, map, ((Map) (null)));
    }

    public static void track(String s1, double d1, Map map)
    {
        track(s1, d1, "", map);
    }

    public static void track(String s1, String s2)
    {
        track(s1, 0.0D, s2, null);
    }

    public static void track(String s1, Map map)
    {
        track(s1, 0.0D, "", map);
    }

    public static void trackGooglePlayPurchase(String s1, long l1, String s2, String s3, String s4)
    {
        trackGooglePlayPurchase("Purchase", s1, l1, s2, s3, s4, null);
    }

    public static void trackGooglePlayPurchase(String s1, long l1, String s2, String s3, String s4, Map map)
    {
        trackGooglePlayPurchase("Purchase", s1, l1, s2, s3, s4, map);
    }

    public static void trackGooglePlayPurchase(String s1, String s2, long l1, String s3, String s4, String s5, Map map)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("googlePlayPurchaseData", s4);
        hashmap.put("googlePlayPurchaseDataSignature", s5);
        hashmap.put("currencyCode", s3);
        if (map == null)
        {
            s3 = new HashMap();
        } else
        {
            s3 = new HashMap(map);
        }
        s3.put("item", s2);
        a(s1, (double)l1 / 1000000D, ((String) (null)), s3, hashmap);
    }

    private static void u()
    {
        ScheduledExecutorService scheduledexecutorservice = Executors.newScheduledThreadPool(1);
        u = scheduledexecutorservice;
        scheduledexecutorservice.scheduleAtFixedRate(new M(), 15L, 15L, TimeUnit.MINUTES);
    }

    private static void v()
    {
        if (!n)
        {
            n = true;
            aU.g();
            aU.h();
        }
    }

    public static List variants()
    {
        List list = aU.j();
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
        }
        return ((List) (obj));
    }

    private static void w()
    {
        ArrayList arraylist = e;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator = e.iterator();
_L2:
        if (iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_25;
        }
        return;
        VariablesChangedCallback variableschangedcallback = (VariablesChangedCallback)iterator.next();
        N.a().a(variableschangedcallback);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        throw exception;
    }

    private static void x()
    {
        ArrayList arraylist = f;
        arraylist;
        JVM INSTR monitorenter ;
        Object obj = f.iterator();
_L4:
        if (((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        arraylist = g;
        arraylist;
        JVM INSTR monitorenter ;
        obj = g.iterator();
_L5:
        if (!((Iterator) (obj)).hasNext())
        {
            g.clear();
            return;
        }
          goto _L3
_L2:
        VariablesChangedCallback variableschangedcallback = (VariablesChangedCallback)((Iterator) (obj)).next();
        N.a().a(variableschangedcallback);
          goto _L4
        obj;
        throw obj;
_L3:
        VariablesChangedCallback variableschangedcallback1 = (VariablesChangedCallback)((Iterator) (obj)).next();
        N.a().a(variableschangedcallback1);
          goto _L5
        Exception exception;
        exception;
        throw exception;
          goto _L4
    }

    private static void y()
    {
        Iterator iterator = w.iterator();
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                w.clear();
                if (flag)
                {
                    aU.n();
                }
                return;
            }
            Map map = (Map)iterator.next();
            Map map1 = aU.m();
            Iterator iterator1 = map.keySet().iterator();
            while (iterator1.hasNext()) 
            {
                String s1 = (String)iterator1.next();
                Object obj = map1.get(s1);
                Object obj1 = map.get(s1);
                if (obj == null && obj1 != null || obj != null && !obj.equals(obj1))
                {
                    b b1 = new b();
                    b1.b = obj;
                    b1.c = obj1;
                    map1.put(s1, obj1);
                    a("userAttribute", s1, 3, ((String) (null)), b1);
                    flag = true;
                }
            }
        } while (true);
    }

    private static void z()
    {
        T.b("pauseState", new HashMap()).e();
    }

    static 
    {
        ACTION_KIND_MESSAGE = 1;
        ACTION_KIND_ACTION = 2;
        o = LeanplumDeviceIdMode.MD5_MAC_ADDRESS;
    }
}
