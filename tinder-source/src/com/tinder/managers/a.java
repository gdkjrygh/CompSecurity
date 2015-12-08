// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDiskIOException;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.google.gson.e;
import com.taplytics.ci;
import com.taplytics.gs;
import com.taplytics.hi;
import com.taplytics.j;
import com.taplytics.shelduck;
import com.tinder.a.b;
import com.tinder.a.f;
import com.tinder.b.l;
import com.tinder.enums.Gender;
import com.tinder.f.ak;
import com.tinder.model.FacebookAnalyticsUtils;
import com.tinder.model.SparksEvent;
import com.tinder.model.User;
import com.tinder.utils.k;
import com.tinder.utils.v;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            ManagerApp, z, ad, ae, 
//            g, d

public final class a
{

    private static final e a = new e();
    private static final com.tinder.b.a b = new com.tinder.b.a();
    private static final ThreadPoolExecutor c;
    private static final BlockingQueue d;
    private static final Set e;
    private static final Set f;
    private static int g;
    private static long h;
    private static int i;
    private static Boolean j = Boolean.valueOf(false);
    private static Boolean k;
    private static Boolean l;
    private static TimerTask m;
    private static Timer n;
    private static SparksEvent o = null;

    static Boolean a(Boolean boolean1)
    {
        j = boolean1;
        return boolean1;
    }

    public static Map a(Map map, boolean flag)
    {
        Object obj;
        boolean flag1;
        flag1 = false;
        obj = ManagerApp.h().i().b();
        if (obj == null) goto _L2; else goto _L1
_L1:
        ad ad1;
        if (((User) (obj)).getId() != null)
        {
            map.put("uid", ((User) (obj)).getId());
        }
        if (((User) (obj)).getAge() != null)
        {
            map.put("age", ((User) (obj)).getAge());
        }
        map.put("gender", Integer.valueOf(((User) (obj)).getGender().getBackendId()));
        ad1 = ManagerApp.h().k();
        if (!ad1.i || !ad1.b()) goto _L4; else goto _L3
_L3:
        byte byte0 = -1;
_L6:
        map.put("targetGender", Integer.valueOf(byte0));
        obj = ((User) (obj)).getBirthDate();
        if (obj != null)
        {
            map.put("birthday", Long.toString(((Date) (obj)).getTime() / 1000L));
        }
_L2:
        map.put("platform", Integer.valueOf(2));
        map.put("tinderPlus", Boolean.valueOf(ae.a()));
        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info = ManagerApp.a();
        if (info != null)
        {
            map.put("advertisingId", info.getId());
        }
        double d1 = ManagerApp.h().l().d();
        double d2 = ManagerApp.h().l().e();
        if (d1 != 0.0D && d2 != 0.0D && d1 != -100000D && d2 != -100000D)
        {
            map.put("lat", Double.valueOf(d1));
            map.put("lon", Double.valueOf(d2));
        }
        if (!TextUtils.isEmpty(com.tinder.utils.k.b()))
        {
            map.put("deviceId", com.tinder.utils.k.b());
        }
        map.put("manu", Build.MANUFACTURER);
        map.put("model", Build.MODEL);
        map.put("osVersion", com.tinder.utils.k.d());
        map.put("dataProvider", com.tinder.utils.k.c());
        map.put("appVersion", ManagerApp.n);
        if (flag)
        {
            Map map1 = ManagerApp.i();
            if (map1 != null)
            {
                map.putAll(map1);
            }
        }
        return map;
_L4:
        byte0 = flag1;
        if (!ad1.i)
        {
            byte0 = flag1;
            if (ad1.b())
            {
                byte0 = 1;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static void a()
    {
        if (n != null)
        {
            n.cancel();
            n.purge();
            n = null;
        }
        synchronized (j)
        {
            j = Boolean.valueOf(false);
        }
        return;
        exception;
        boolean1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void a(VolleyError volleyerror, List list)
    {
        i++;
        if (volleyerror == null) goto _L2; else goto _L1
_L1:
        v.b((new StringBuilder("error=")).append(volleyerror).append(" : ").append(volleyerror.getMessage()).toString());
        if (volleyerror.a == null) goto _L4; else goto _L3
_L3:
        volleyerror = new String(volleyerror.a.b, "utf-8");
        v.b((new StringBuilder("body=")).append(volleyerror).toString());
        if (volleyerror.contains("bad-events"))
        {
            synchronized (d.a)
            {
                com.tinder.b.a.a(list);
            }
            try
            {
                i = 0;
            }
            // Misplaced declaration of an exception variable
            catch (VolleyError volleyerror)
            {
                v.b(volleyerror.toString());
            }
        }
_L6:
        synchronized (j)
        {
            j = Boolean.valueOf(false);
        }
        return;
        list;
        volleyerror;
        JVM INSTR monitorexit ;
        throw list;
_L4:
        v.b("No network response body");
        continue; /* Loop/switch isn't completed */
_L2:
        v.b("No error response");
        if (true) goto _L6; else goto _L5
_L5:
        list;
        volleyerror;
        JVM INSTR monitorexit ;
        throw list;
    }

    public static void a(SparksEvent sparksevent)
    {
        a(sparksevent, false);
    }

    private static void a(SparksEvent sparksevent, boolean flag)
    {
        String s1;
        j j1;
        JSONObject jsonobject;
        Integer integer;
        (new StringBuilder("testAdded ")).append(sparksevent.name).append(" ts: ").append(sparksevent.timestamp);
        if (o != null)
        {
            String s = sparksevent.name;
            boolean flag1;
            if (s.equals("App.Close") || s.equals("Match.StopSearch") || s.equals("Match.SearchSelect"))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                SparksEvent sparksevent1 = o.clone();
                o = null;
                a(sparksevent1, flag);
            }
        }
        if (d(sparksevent))
        {
            b(sparksevent);
            return;
        }
        sparksevent.put("ts", Long.valueOf(sparksevent.timestamp));
        a(sparksevent.params, true);
        if (l == null)
        {
            ManagerApp.h().j();
            l = Boolean.valueOf(ae.a.getBoolean("FB_ANALYTICS_ENABLED", Boolean.TRUE.booleanValue()));
        }
        if (l.booleanValue() && e(sparksevent))
        {
            FacebookAnalyticsUtils.trackFromSparksEvent(sparksevent);
        }
        boolean flag2;
        if (e(sparksevent) || f.contains(sparksevent.name))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag2)
        {
            jsonobject = new JSONObject(sparksevent.params);
            s1 = sparksevent.name;
            integer = Integer.valueOf(0);
            if (ci.b().d == null)
            {
                break MISSING_BLOCK_LABEL_440;
            }
            j1 = ci.b().d;
            break MISSING_BLOCK_LABEL_265;
        }
_L1:
        if (k == null)
        {
            ManagerApp.h().j();
            k = Boolean.valueOf(ae.a.getBoolean("SPARKS ENABLED", true));
        }
        JSONException jsonexception;
        if (k.booleanValue())
        {
            try
            {
                c.execute(new Runnable(sparksevent, flag) {

                    final SparksEvent a;
                    final boolean b;

                    public final void run()
                    {
label0:
                        {
                            Process.setThreadPriority(10);
                            com.tinder.managers.a.e();
                            com.tinder.b.a.a(a);
                            synchronized (a.c())
                            {
                                if (!a.c().booleanValue())
                                {
                                    break label0;
                                }
                            }
                            return;
                        }
                        a.a(Boolean.valueOf(true));
                        boolean1;
                        JVM INSTR monitorexit ;
                        if (b || com.tinder.managers.a.f() >= 6 && a.g())
                        {
                            a.d();
                            a.h();
                            return;
                        }
                        break MISSING_BLOCK_LABEL_78;
                        exception;
                        boolean1;
                        JVM INSTR monitorexit ;
                        throw exception;
                        synchronized (a.c())
                        {
                            a.a(Boolean.valueOf(false));
                        }
                        (new StringBuilder("Event queue not full or not enough time passed. Event queue size=")).append(a.i());
                        return;
                        exception1;
                        boolean2;
                        JVM INSTR monitorexit ;
                        throw exception1;
                    }

            
            {
                a = sparksevent;
                b = flag;
                super();
            }
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (SparksEvent sparksevent)
            {
                v.a("Failed to add event to internal cache", sparksevent);
            }
            return;
        } else
        {
            (new StringBuilder("Sparks is disabled. Not sending event ")).append(sparksevent.name);
            return;
        }
        if (ci.b().j && !hi.a(shelduck.b) && s1 != null)
        {
            if (gs.b())
            {
                gs.a((new StringBuilder("Log event: ")).append(s1).append(", value: ").append(integer).toString());
            }
            try
            {
                jsonobject = j1.b("goalAchieved", integer, jsonobject);
                jsonobject.put("gn", s1);
                j1.a(jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (JSONException jsonexception)
            {
                gs.b("Track Event", jsonexception);
            }
        }
        break MISSING_BLOCK_LABEL_283;
        Log.w("Taplytics", "Taplytics not yet instantiated. Call Taplytics.startTaplytics before any other Taplytics call.");
          goto _L1
    }

    public static void a(String s)
    {
        a(new SparksEvent(s), false);
    }

    static void a(List list)
    {
        c(list);
    }

    public static void a(boolean flag)
    {
        k = Boolean.valueOf(flag);
        ManagerApp.h().j();
        com.tinder.managers.ae.b.putBoolean("SPARKS ENABLED", flag);
        com.tinder.managers.ae.b.commit();
    }

    public static void b()
    {
        if (n != null)
        {
            n.cancel();
        }
        n = new Timer();
        m = new TimerTask() {

            public final void run()
            {
                synchronized (a.c())
                {
                    if (!a.c().booleanValue())
                    {
                        a.d();
                    }
                }
                return;
                exception;
                boolean1;
                JVM INSTR monitorexit ;
                throw exception;
            }

        };
        n.scheduleAtFixedRate(m, 0L, 10000L);
    }

    public static void b(SparksEvent sparksevent)
    {
        sparksevent.put("ts", Long.valueOf(sparksevent.timestamp));
        a(sparksevent.params, true);
        c.execute(new Runnable(sparksevent) {

            final SparksEvent a;

            public final void run()
            {
                com.tinder.managers.a.e();
                java.util.ArrayList arraylist = com.tinder.b.a.a(99);
                arraylist.add(a);
                com.tinder.managers.a.e();
                com.tinder.b.a.a(a);
                a.a(arraylist);
            }

            
            {
                a = sparksevent;
                super();
            }
        });
    }

    static void b(List list)
    {
        (new StringBuilder("Sent events! DELETING ")).append(list.size()).append(" EVENTS!");
        StringBuilder stringbuilder = new StringBuilder();
        SparksEvent sparksevent;
        for (Iterator iterator = list.iterator(); iterator.hasNext(); stringbuilder.append('n').append(sparksevent.name))
        {
            sparksevent = (SparksEvent)iterator.next();
        }

        (new StringBuilder("sent events ")).append(stringbuilder.toString());
        synchronized (d.a)
        {
            com.tinder.b.a.a(list);
        }
        i = 0;
        synchronized (j)
        {
            j = Boolean.valueOf(false);
        }
        return;
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static Boolean c()
    {
        return j;
    }

    public static void c(SparksEvent sparksevent)
    {
        o = sparksevent;
    }

    private static void c(List list)
    {
        if (list == null || list.size() <= 0)
        {
            return;
        }
        synchronized (j)
        {
            j = Boolean.valueOf(true);
        }
        if (!ManagerApp.a)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        obj = new StringBuilder();
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            SparksEvent sparksevent = (SparksEvent)iterator.next();
            ((StringBuilder) (obj)).append((new StringBuilder("\n******************\n")).append(sparksevent.name).toString());
            Iterator iterator1 = sparksevent.params.keySet().iterator();
            while (iterator1.hasNext()) 
            {
                Object obj2 = iterator1.next();
                ((StringBuilder) (obj)).append('\n');
                ((StringBuilder) (obj)).append(" ... ");
                ((StringBuilder) (obj)).append(obj2.toString());
                ((StringBuilder) (obj)).append(" : ");
                ((StringBuilder) (obj)).append(sparksevent.params.get(obj2).toString());
            }
        }

        break MISSING_BLOCK_LABEL_189;
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
        (new StringBuilder("----------Sending events----------")).append(((StringBuilder) (obj)).toString());
        Object obj1;
        HashMap hashmap;
        int i1;
        h = System.currentTimeMillis();
        obj1 = new StringBuilder("events=[");
        (new StringBuilder("sending ")).append(list.size()).append(" events in batch");
        hashmap = new HashMap(2);
        i1 = 0;
_L5:
        if (i1 >= list.size()) goto _L2; else goto _L1
_L1:
        SparksEvent sparksevent1;
        String s;
        sparksevent1 = (SparksEvent)list.get(i1);
        hashmap.put("schema", sparksevent1.name);
        hashmap.put("event", sparksevent1.params);
        s = a.a(hashmap);
        if (s.length() <= 10152) goto _L4; else goto _L3
_L3:
        long l1 = sparksevent1.timestamp;
        com.tinder.b.l.a().a("analytics_events", "timestamp", String.valueOf(l1));
        list.remove(i1);
_L6:
        i1++;
          goto _L5
_L4:
        if (s.length() + ((StringBuilder) (obj1)).length() <= 10152)
        {
            break MISSING_BLOCK_LABEL_510;
        }
        for (int j1 = list.size() - 1; j1 >= i1; j1--)
        {
            if (!d((SparksEvent)list.get(j1)))
            {
                list.remove(j1);
            }
        }

        ((StringBuilder) (obj1)).delete(((StringBuilder) (obj1)).length() - 2, ((StringBuilder) (obj1)).length() - 1);
_L2:
        ((StringBuilder) (obj1)).append(']');
        obj1 = ((StringBuilder) (obj1)).toString();
        ((String) (obj1)).length();
        com.tinder.managers.ManagerApp.b().a(new b("https://etl.tindersparks.com:443/v2/batch/event", ((String) (obj1)), new com.android.volley.i.b(list) {

            final List a;

            public final void a(Object obj3)
            {
                try
                {
                    com.tinder.managers.a.b(a);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj3)
                {
                    v.a("Failed to process event sent result", ((Throwable) (obj3)));
                }
            }

            
            {
                a = list;
                super();
            }
        }, new com.android.volley.i.a(list) {

            final List a;

            public final void a(VolleyError volleyerror)
            {
                try
                {
                    a.a(volleyerror, a);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (VolleyError volleyerror)
                {
                    v.a("Failed to process event sent result", volleyerror);
                }
            }

            
            {
                a = list;
                super();
            }
        }));
        return;
        ((StringBuilder) (obj1)).append(s);
        if (i1 < list.size() - 1)
        {
            ((StringBuilder) (obj1)).append(", ");
        }
          goto _L6
    }

    static void d()
    {
        c(com.tinder.b.a.a(100));
    }

    private static boolean d(SparksEvent sparksevent)
    {
        sparksevent = sparksevent.name;
        return sparksevent.equals("Account.Delete") || sparksevent.equals("Account.FbLogout");
    }

    static com.tinder.b.a e()
    {
        return b;
    }

    private static boolean e(SparksEvent sparksevent)
    {
        return e.contains(sparksevent.name);
    }

    static int f()
    {
        int i1 = g + 1;
        g = i1;
        return i1;
    }

    static boolean g()
    {
        long l1 = System.currentTimeMillis();
        long l2 = h;
        long l3 = 30000L * (long)Math.pow(2D, i);
        (new StringBuilder("failureCount=")).append(i).append(", threshold=").append(l3);
        return l1 - l2 > l3;
    }

    static int h()
    {
        g = 0;
        return 0;
    }

    static int i()
    {
        return g;
    }

    static 
    {
        d = new LinkedBlockingQueue();
        c = new ThreadPoolExecutor(1, 1, 5L, TimeUnit.SECONDS, d);
        HashSet hashset = new HashSet(6);
        e = hashset;
        hashset.add("App.Open");
        e.add("App.Close");
        e.add("Match.New");
        e.add("TinderPlus.Purchase");
        e.add("Chat.SendMessage");
        hashset = new HashSet();
        f = hashset;
        hashset.add("TinderPlus.PaywallFeatureView");
        f.add("TinderPlus.Paywall");
        f.add("TinderPlus.SkuOffered");
        f.add("TinderPlus.Select");
        f.add("TinderPlus.Purchase");
        f.add("TinderPlus.Restore");
        f.add("TinderPlus.Cancel");
        f.add("SuperLikeTutorial.View");
        f.add("SuperLikeTutorial.Select");
        f.add("SuperLikeRoadblock.View");
        f.add("SuperLikeRoadblock.Select");
        f.add("Roadblock.Cancel");
        f.add("Roadblock.Select");
        f.add("Roadblock.View");
        f.add("Push.Message");
    }
}
