// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Handler;
import android.util.Pair;
import com.android.volley.Request;
import com.android.volley.a.i;
import com.android.volley.h;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            k, n, gs, ci, 
//            bf, bd, hi, m, 
//            gt, shelduck, el, dp, 
//            ba, dx, dy, z, 
//            w, aa, ae, x, 
//            ab, t, u, ad

public final class j
{

    static Map b = new HashMap();
    private static Map e = new HashMap();
    private static Map f = new HashMap();
    public ArrayList a;
    public n c;
    private boolean d;
    private Handler g;
    private Runnable h;
    private SimpleDateFormat i;
    private ArrayList j;
    private Date k;

    public j()
    {
        d = false;
        c = null;
        g = new Handler();
        h = new k(this);
        i = new SimpleDateFormat("yyyy-MM-dd'T'HH:mmZ", Locale.US);
        j = new ArrayList();
        k = null;
        c = new n();
    }

    static ArrayList a(j j1)
    {
        return j1.j;
    }

    static ArrayList a(j j1, ArrayList arraylist)
    {
        j1.j = arraylist;
        return arraylist;
    }

    public static Map a()
    {
        return e;
    }

    public static void a(int l)
    {
        if (f.containsKey(Integer.valueOf(l)))
        {
            Long long1 = Long.valueOf(System.currentTimeMillis() - ((Long)((Pair)f.get(Integer.valueOf(l))).second).longValue());
            f.remove(Integer.valueOf(l));
            if (gs.b())
            {
                gs.a((new StringBuilder("Time on fragment: ")).append(String.format("%d min, %d sec", new Object[] {
                    Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(long1.longValue())), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(long1.longValue()) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(long1.longValue())))
                })).toString());
            }
            ci.b().d.a("viewTimeOnPage", long1, null);
        } else
        if (gs.b())
        {
            gs.a("Problem: Id not in fragment map, cant track time");
            return;
        }
    }

    static void a(j j1, bf bf1)
    {
        j1.b(bf1);
    }

    public static void a(String s)
    {
        if (e.containsKey(s))
        {
            Long long1 = Long.valueOf(System.currentTimeMillis() - ((Long)e.get(s)).longValue());
            e.remove(s);
            if (gs.b())
            {
                gs.a((new StringBuilder("Time on activity: ")).append(String.format("%d min, %d sec", new Object[] {
                    Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(long1.longValue())), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(long1.longValue()) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(long1.longValue())))
                })).toString());
            }
            ci.b().d.a("viewTimeOnPage", long1, null);
        } else
        if (gs.b())
        {
            gs.a("Problem: Activity not in activity map, cant track time");
            return;
        }
    }

    public static Map b()
    {
        return f;
    }

    private void b(bf bf1)
    {
        if (bf1 != null)
        {
            bf1.a();
        }
        if (k == null && j.size() > 0)
        {
            k = new Date();
            double d1;
            if (ci.b().t != null)
            {
                d1 = ci.b().t.o;
            } else
            {
                d1 = -1D;
            }
            if (ci.b().g)
            {
                d1 = hi.a(20D) + 5D;
            } else
            {
                double d2 = d1;
                if (d1 == -1D)
                {
                    d2 = 60D;
                }
                d1 = d2 + hi.a(5D);
            }
            g.postDelayed(h, Math.round(d1) * 1000L);
        }
    }

    private boolean b(String s)
    {
label0:
        {
            if (a == null)
            {
                break label0;
            }
            Iterator iterator = a.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
            } while (!((String)iterator.next()).equals(s));
            return true;
        }
        return false;
    }

    private static boolean b(JSONObject jsonobject)
    {
        JSONObject jsonobject1 = ci.b().t.p;
        if (jsonobject1 == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        if (!jsonobject1.has(jsonobject.optString("type")))
        {
            break MISSING_BLOCK_LABEL_82;
        }
        boolean flag;
        if (jsonobject1.opt(jsonobject.optString("type")) == JSONObject.NULL)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        flag = ((HashSet)jsonobject1.opt(jsonobject.optString("type"))).contains(jsonobject.optString("gn"));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        return true;
        jsonobject;
        return false;
        return false;
    }

    public final void a(bf bf1)
    {
        Object obj;
        Object obj1;
        ArrayList arraylist;
        Object obj2;
        Object obj3;
        Object obj4;
        if (!ci.b().j)
        {
            return;
        }
        k = null;
        obj2 = ci.b();
        obj3 = ((ci) (obj2)).t;
        Iterator iterator;
        Object obj5;
        if (obj3 != null)
        {
            obj = ((bd) (obj3)).a;
        } else
        {
            obj = null;
        }
        arraylist = j;
        arraylist;
        JVM INSTR monitorenter ;
        if (j.size() < 100) goto _L2; else goto _L1
_L1:
        obj1 = j.subList(0, 99);
_L12:
        obj1 = new ArrayList(((java.util.Collection) (obj1)));
        if (((ArrayList) (obj1)).size() <= 0 || obj3 == null || obj == null) goto _L4; else goto _L3
_L3:
        obj3 = new JSONArray();
        iterator = ((ArrayList) (obj1)).iterator();
_L11:
        if (!iterator.hasNext()) goto _L6; else goto _L5
_L5:
        obj4 = (JSONObject)iterator.next();
        if (!((JSONObject) (obj4)).has("sid"))
        {
            ((JSONObject) (obj4)).put("sid", obj);
        }
        if (((JSONObject) (obj4)).has("prod")) goto _L8; else goto _L7
_L7:
        if (!ci.b().g) goto _L10; else goto _L9
_L9:
        ((JSONObject) (obj4)).put("prod", 0);
_L8:
        if (((JSONObject) (obj4)).get("type").equals("tlError") && ((JSONObject) (obj4)).has("data"))
        {
            obj5 = ((JSONObject) (obj4)).optJSONObject("data");
            if (((JSONObject) (obj5)).has("taplyticsMessage"))
            {
                obj5 = ((JSONObject) (obj5)).optString("taplyticsMessage");
                if (b.containsKey(obj5))
                {
                    ((JSONObject) (obj4)).put("val", ((Pair)b.get(obj5)).second);
                    b.put(obj5, new Pair(Boolean.valueOf(false), ((Pair)b.get(obj5)).second));
                }
            }
        }
        ((JSONArray) (obj3)).put(obj4);
          goto _L11
        obj4;
        gs.b("Adding JSONObject to eventQueue", ((Exception) (obj4)));
          goto _L11
        bf1;
        arraylist;
        JVM INSTR monitorexit ;
        try
        {
            throw bf1;
        }
        // Misplaced declaration of an exception variable
        catch (bf bf1)
        {
            gs.b("Something has gone wrong flushing.", bf1);
        }
        return;
_L2:
        obj1 = j;
          goto _L12
_L10:
        ((JSONObject) (obj4)).put("prod", 1);
          goto _L8
_L6:
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        if (((ci) (obj2)).f != null)
        {
            jsonobject.put("t", ((ci) (obj2)).f);
        }
        jsonobject.put("sid", obj);
        jsonobject.put("e", obj3);
        obj = ((ci) (obj2)).b;
        obj2 = new m(this, bf1, ((ArrayList) (obj1)));
        if (ci.b().j && jsonobject.length() != 0) goto _L14; else goto _L13
_L13:
        if (j.size() < 100)
        {
            break MISSING_BLOCK_LABEL_705;
        }
        j.removeAll(((java.util.Collection) (obj1)));
_L18:
        gt.a().a(j);
        if (j.size() > 20)
        {
            b(bf1);
        }
_L17:
        arraylist;
        JVM INSTR monitorexit ;
        return;
_L14:
        if (!hi.a(shelduck.A)) goto _L16; else goto _L15
_L15:
        ((el) (obj2)).a(null);
          goto _L13
        obj;
        gs.b("Flushing Events Queue", ((Exception) (obj)));
        gt.a().a(j);
_L4:
        b(bf1);
          goto _L17
_L16:
        StringBuilder stringbuilder = new StringBuilder((new StringBuilder()).append(((dp) (obj)).e).append(((dp) (obj)).c).append("/api/v1/clientEvents").toString());
        String s = stringbuilder.toString();
        ci.b().c.a(stringbuilder);
        Date date = new Date();
        obj2 = new i(1, stringbuilder.toString().replaceAll(" ", "%20"), jsonobject, new dx(((dp) (obj)), date, ((el) (obj2))), new dy(((dp) (obj)), s, ((el) (obj2))));
        obj2.l = "post_clientEvents";
        ((dp) (obj)).f.a(((Request) (obj2)));
          goto _L13
        j.clear();
          goto _L18
    }

    public final void a(String s, Object obj, JSONObject jsonobject)
    {
        a(s, obj, jsonobject, ((String) (null)));
    }

    public final void a(String s, Object obj, JSONObject jsonobject, String s1)
    {
        while (!ci.b().j || hi.a(shelduck.b) || s == null) 
        {
            return;
        }
        if (gs.b())
        {
            gs.a((new StringBuilder("Log TL Event: ")).append(s).append(", value: ").append(obj).toString());
        }
        try
        {
            jsonobject = b(s, obj, jsonobject);
            if (s.equals("viewAppeared") || s.equals("viewDisappeared"))
            {
                jsonobject.put("val", i.format(new Date()));
                jsonobject.put("vKey", obj);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            gs.b("Tracking TLEvent", s);
            return;
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        jsonobject.put("gn", s1);
        a(jsonobject);
        return;
    }

    public final void a(String s, String s1)
    {
        while (!ci.b().j || hi.a(shelduck.b) || s == null) 
        {
            return;
        }
        if (gs.b())
        {
            gs.a((new StringBuilder("Track Code Experiment Shown, expID: ")).append(s).append(", varID: ").append(s1).toString());
        }
        JSONObject jsonobject;
        try
        {
            jsonobject = b("codeExperiment", null, null);
            jsonobject.put("exp_id", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            gs.b("Tracking Code Experiment Shown", s);
            return;
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        jsonobject.put("var_id", s1);
        a(jsonobject);
        return;
    }

    public final void a(String s, String s1, Object obj, JSONObject jsonobject)
    {
        while (!ci.b().j || hi.a(shelduck.b) || hi.a(shelduck.d) || s1 == null) 
        {
            return;
        }
        if (gs.b())
        {
            StringBuilder stringbuilder = (new StringBuilder("Log event: ")).append(s1).append(", value: ").append(obj).append(". From source: ").append(s).append(". Metadata: ");
            String s2;
            if (jsonobject == null)
            {
                s2 = "none";
            } else
            {
                s2 = jsonobject.toString();
            }
            gs.a(stringbuilder.append(s2).toString());
        }
        try
        {
            s = b(s, obj, jsonobject);
            s.put("gn", s1);
            a(((JSONObject) (s)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        if (s instanceof Exception)
        {
            s = (Exception)s;
        } else
        {
            s = null;
        }
        gs.b("Track source event", s);
    }

    public final void a(JSONObject jsonobject)
    {
        while (jsonobject == null || !hi.a(jsonobject.toString()) || b(jsonobject)) 
        {
            return;
        }
        j.add(jsonobject);
        gt.a().a(j);
        b(((bf) (null)));
    }

    public final JSONObject b(String s, Object obj, JSONObject jsonobject)
        throws JSONException
    {
        if (s == null)
        {
            return null;
        }
        ci ci1 = ci.b();
        bd bd1 = ci1.t;
        JSONObject jsonobject1 = new JSONObject();
        jsonobject1.put("type", s);
        int l;
        if (jsonobject != null && jsonobject.has("TLTime"))
        {
            jsonobject1.put("date", i.format(new Date(Long.valueOf(jsonobject.optString("TLTime")).longValue())));
        } else
        if (s.equals("tlError"))
        {
            jsonobject1.put("date", i.format(new Date()));
        } else
        {
            jsonobject1.put("date", i.format(new Date()));
        }
        if (jsonobject != null)
        {
            jsonobject1.put("data", jsonobject);
        }
        if (obj != null)
        {
            jsonobject1.put("val", obj);
        }
        if (bd1 != null && bd1.a != null)
        {
            jsonobject1.put("sid", bd1.a);
        }
        if (ci1.g)
        {
            l = 0;
        } else
        {
            l = 1;
        }
        jsonobject1.put("prod", l);
        return jsonobject1;
    }

    public final void c()
    {
        if (ci.b().j && !hi.a(shelduck.d)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj = ci.b().t;
        Object obj1;
        Object obj3;
        Object obj5;
        Object obj6;
        if (obj != null)
        {
            obj = ((bd) (obj)).d;
        } else
        {
            obj = null;
        }
        if (obj == null || d) goto _L1; else goto _L3
_L3:
        if (!b("Mixpanel") && ((JSONObject) (obj)).optBoolean("mpSource", false) && !hi.a(shelduck.f))
        {
            z.a().c = true;
        }
        boolean flag;
        if (!b("GA") && ((JSONObject) (obj)).optBoolean("gaSource", false) && !hi.a(shelduck.e))
        {
            z.a().f = true;
            if (gs.b())
            {
                gs.a("Enabling GA");
            }
        } else
        if (gs.b())
        {
            gs.a("GA not enabled.");
        }
        if (!b("Localytics") && ((JSONObject) (obj)).optBoolean("llSource", false) && !hi.a(com.taplytics.shelduck.i))
        {
            z.a().g = true;
        }
        if (!b("Flurry") && ((JSONObject) (obj)).optBoolean("flSource", false) && !hi.a(shelduck.g))
        {
            z.a().d = true;
        }
        if (!b("Adobe"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag & ((JSONObject) (obj)).has("adbSource") && ((JSONObject) (obj)).optBoolean("adbSource", true) && !hi.a(com.taplytics.shelduck.h))
        {
            z.a().e = true;
        }
        if (!b("Amplitude") && ((JSONObject) (obj)).optBoolean("ampSource", false) && !hi.a(shelduck.j))
        {
            z.a().h = true;
        }
        obj = z.a();
        if (((z) (obj)).c && z.b())
        {
            obj1 = ((z) (obj)).b;
            if (w.c == null)
            {
                w.c = new w();
            }
            ((ArrayList) (obj1)).add(w.c);
        }
        if (((z) (obj)).f && z.e())
        {
            try
            {
                (new Handler()).postDelayed(new aa(((z) (obj))), 3000L);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2)
            {
                gs.b("ExtA GA issues", ((Exception) (obj2)));
            }
        }
        if (((z) (obj)).g && z.f())
        {
            try
            {
                (new Handler()).post(new ae(((z) (obj))));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2)
            {
                gs.c((new StringBuilder("Error when posting localytics runnable ")).append(((Exception) (obj2)).getMessage()).toString());
            }
        }
        if (!((z) (obj)).e || !z.d().booleanValue())
        {
            break MISSING_BLOCK_LABEL_522;
        }
        obj1 = Class.forName("com.adobe.mobile.StaticMethods");
        if (obj1 != null)
        {
            try
            {
                obj3 = ((Class) (obj1)).getDeclaredMethod("getAnalyticsExecutor", new Class[0]);
                ((Method) (obj3)).setAccessible(true);
                obj5 = (ExecutorService)((Method) (obj3)).invoke(obj1, new Object[0]);
                ((Method) (obj3)).setAccessible(false);
                obj3 = new x(((ExecutorService) (obj5)));
                obj5 = ((Class) (obj1)).getDeclaredField("analyticsExecutor");
                ((Field) (obj5)).setAccessible(true);
                ((Field) (obj5)).set(obj1, obj3);
                ((Field) (obj5)).setAccessible(false);
                if (gs.b())
                {
                    gs.a("adobe connected");
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2)
            {
                if (gs.b())
                {
                    gs.a("Something went wrong when replacing adobe executor");
                }
            }
        }
        if (((z) (obj)).d && z.c())
        {
            (new Handler()).postDelayed(new ab(((z) (obj))), 1000L);
        }
        if (((z) (obj)).h && z.g())
        {
            if (t.a == null)
            {
                t.a = new t();
            }
            obj.a = t.a;
            Object obj2 = ((z) (obj)).a;
            obj3 = ci.b().u;
            Object obj4 = ((Context) (obj3)).getSharedPreferences((new StringBuilder("com.amplitude.api.")).append(((Context) (obj3)).getPackageName()).toString(), 0);
            obj2.f = new u(((t) (obj2)));
            ((SharedPreferences) (obj4)).registerOnSharedPreferenceChangeListener(((t) (obj2)).f);
            try
            {
                obj2.d = Class.forName("com.amplitude.api.DatabaseHelper");
                obj2.b = ((t) (obj2)).d.getDeclaredMethod("getDatabaseHelper", new Class[] {
                    android/content/Context
                });
                obj6 = Class.forName("com.amplitude.api.AmplitudeClient");
                obj5 = ((Class) (obj6)).getMethod("getInstance", new Class[0]).invoke(obj6, new Object[0]);
                obj6 = ((Class) (obj6)).getDeclaredField("logThread");
                ((Field) (obj6)).setAccessible(true);
                obj5 = ((Field) (obj6)).get(obj5);
                ((Field) (obj6)).setAccessible(false);
                obj6 = obj5.getClass().getDeclaredMethod("waitForInitialization", new Class[0]);
                ((Method) (obj6)).setAccessible(true);
                ((Method) (obj6)).invoke(obj5, new Object[0]);
                ((Method) (obj6)).setAccessible(false);
                obj6 = obj5.getClass().getDeclaredField("handler");
                ((Field) (obj6)).setAccessible(true);
                obj2.e = (Handler)((Field) (obj6)).get(obj5);
                ((Field) (obj6)).setAccessible(false);
            }
            catch (Exception exception)
            {
                ((SharedPreferences) (obj4)).unregisterOnSharedPreferenceChangeListener(((t) (obj2)).f);
            }
        }
        if (((z) (obj)).b.size() > 0 && ((z) (obj)).c && z.b())
        {
            obj2 = (AlarmManager)ci.b().u.getSystemService("alarm");
            obj4 = new ad(((z) (obj)));
            ci.b().u.registerReceiver(((android.content.BroadcastReceiver) (obj4)), new IntentFilter("com.taplytics"));
            obj.i = PendingIntent.getBroadcast(ci.b().u, 109, new Intent("com.taplytics"), 0);
            ((AlarmManager) (obj2)).setRepeating(3, 35000L, 52000L, ((z) (obj)).i);
        }
        d = true;
        return;
    }

}
