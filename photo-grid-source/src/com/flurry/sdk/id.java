// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.flurry.sdk:
//            kg, ip, iq, ic, 
//            jt, lg, lh, kc, 
//            jy, jv, jo, ib, 
//            ho, hn, hq, ht, 
//            hu, ik, lp, io, 
//            ig, jb, ij, jc, 
//            jm, kj, kt, hp, 
//            lm, jp, jl, hs, 
//            hm, hr, jk, jg, 
//            hw, hv, hz, il, 
//            ia, if, jx

public class id
    implements lh.a
{

    private static final String a = com/flurry/sdk/id.getSimpleName();
    private static String b = "https://proton.flurry.com/sdk/v1/config";
    private final Runnable c = new _cls1();
    private final jx d = new _cls4();
    private final jx e = new _cls5();
    private final jx f = new _cls6();
    private final kg g = new kg("proton config request", new ip());
    private final kg h = new kg("proton config response", new iq());
    private jv i;
    private jv j;
    private final ic k = new ic();
    private final jt l = new jt();
    private final List m = new ArrayList();
    private boolean n;
    private String o;
    private boolean p;
    private boolean q;
    private long r;
    private long s;
    private boolean t;
    private hq u;
    private boolean v;

    public id()
    {
        p = true;
        r = 10000L;
        lg lg1 = lg.a();
        n = ((Boolean)lg1.a("ProtonEnabled")).booleanValue();
        lg1.a("ProtonEnabled", this);
        kc.a(4, a, (new StringBuilder("initSettings, protonEnabled = ")).append(n).toString());
        o = (String)lg1.a("ProtonConfigUrl");
        lg1.a("ProtonConfigUrl", this);
        kc.a(4, a, (new StringBuilder("initSettings, protonConfigUrl = ")).append(o).toString());
        p = ((Boolean)lg1.a("analyticsEnabled")).booleanValue();
        lg1.a("analyticsEnabled", this);
        kc.a(4, a, (new StringBuilder("initSettings, AnalyticsEnabled = ")).append(p).toString());
        jy.a().a("com.flurry.android.sdk.IdProviderFinishedEvent", d);
        jy.a().a("com.flurry.android.sdk.IdProviderUpdatedAdvertisingId", e);
        jy.a().a("com.flurry.android.sdk.NetworkStateEvent", f);
        i = new jv(jo.a().c().getFileStreamPath(o()), ".yflurryprotonconfig.", 1, new _cls7());
        j = new jv(jo.a().c().getFileStreamPath(p()), ".yflurryprotonreport.", 1, new _cls8());
        jo.a().b(new _cls9());
        jo.a().b(new _cls10());
    }

    static long a(id id1, long l1)
    {
        id1.r = l1;
        return l1;
    }

    private void a(long l1, boolean flag, byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        if (abyte0 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        kc.a(4, a, "Saving proton config response");
        ib ib1 = new ib();
        ib1.a(l1);
        ib1.a(flag);
        ib1.a(abyte0);
        i.a(ib1);
        if (true) goto _L1; else goto _L3
_L3:
        abyte0;
        throw abyte0;
    }

    static void a(id id1)
    {
        id1.g();
    }

    static void a(id id1, long l1, boolean flag, byte abyte0[])
    {
        id1.a(l1, flag, abyte0);
    }

    static void a(id id1, String s1, Map map)
    {
        id1.b(s1, map);
    }

    private boolean a(ho ho1)
    {
        if (ho1 == null)
        {
            return true;
        }
        if (ho1.a == null)
        {
            return true;
        }
        for (int i1 = 0; i1 < ho1.a.size(); i1++)
        {
            hn hn1 = (hn)ho1.a.get(i1);
            if (hn1 != null && (hn1.b.equals("") || hn1.a == -1L || hn1.e.equals("") || !a(hn1.c)))
            {
                kc.a(3, a, "A callback template is missing required values");
                return false;
            }
        }

        return true;
    }

    private boolean a(hq hq1)
    {
        if (hq1 == null)
        {
            return false;
        }
        if (!a(hq1.e) || hq1.e.e.equals(""))
        {
            kc.a(3, a, "Config response is missing required values.");
            return false;
        } else
        {
            return true;
        }
    }

    static boolean a(id id1, hq hq1)
    {
        return id1.a(hq1);
    }

    static boolean a(id id1, boolean flag)
    {
        id1.t = flag;
        return flag;
    }

    private boolean a(List list)
    {
        if (list == null)
        {
            return true;
        }
        for (list = list.iterator(); list.hasNext();)
        {
            ht ht1 = (ht)list.next();
            if (ht1.a.equals(""))
            {
                kc.a(3, a, "An event is missing a name");
                return false;
            }
            if ((ht1 instanceof hu) && ((hu)ht1).c.equals(""))
            {
                kc.a(3, a, "An event trigger is missing a param name");
                return false;
            }
        }

        return true;
    }

    static long b(id id1, long l1)
    {
        id1.s = l1;
        return l1;
    }

    static hq b(id id1, hq hq1)
    {
        id1.u = hq1;
        return hq1;
    }

    private void b(long l1)
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = m.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (l1 == ((ik)iterator.next()).b())
            {
                iterator.remove();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_52;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    static void b(id id1)
    {
        id1.j();
    }

    private void b(String s1, Map map)
    {
        this;
        JVM INSTR monitorenter ;
        kc.a(3, a, (new StringBuilder("Event triggered: ")).append(s1).toString());
        if (p) goto _L2; else goto _L1
_L1:
        kc.e(a, "Analytics and pulse have been disabled.");
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (u != null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        kc.a(3, a, "Config response is empty. No events to fire.");
          goto _L3
        s1;
        throw s1;
        lp.b();
        if (TextUtils.isEmpty(s1)) goto _L3; else goto _L4
_L4:
        Object obj = l.a(s1);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        kc.a(3, a, "No events to fire. Returning.");
          goto _L3
label0:
        {
            if (((List) (obj)).size() != 0)
            {
                break label0;
            }
            kc.a(3, a, "No events to fire. Returning.");
        }
          goto _L3
        long l1 = System.currentTimeMillis();
        int i1;
        io io1;
        HashMap hashmap;
        Iterator iterator;
        String as[];
        hn hn1;
        String s2;
        HashMap hashmap1;
        byte byte0;
        long l2;
        boolean flag;
        if (map != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 3: default 818
    //                   645204782: 330
    //                   1371447545: 346
    //                   1579613685: 314;
           goto _L5 _L6 _L7 _L8
_L32:
        io1 = io.d;
_L18:
        hashmap = new HashMap();
        iterator = ((List) (obj)).iterator();
_L17:
        if (!iterator.hasNext()) goto _L10; else goto _L9
_L9:
        obj = (ht)iterator.next();
        byte0 = 0;
        if (!(obj instanceof hu)) goto _L12; else goto _L11
_L11:
        kc.a(4, a, "Event contains triggers.");
        as = ((hu)obj).d;
        if (as != null) goto _L14; else goto _L13
_L13:
        kc.a(4, a, "Template does not contain trigger values. Firing.");
        byte0 = 1;
_L19:
        s2 = (String)map.get(((hu)obj).c);
        if (s2 != null) goto _L16; else goto _L15
_L15:
        kc.a(4, a, "Publisher params has no value associated with proton key. Not firing.");
          goto _L17
_L8:
        if (s1.equals("flurry.session_start"))
        {
            byte0 = 0;
        }
          goto _L5
_L6:
        if (s1.equals("flurry.session_end"))
        {
            byte0 = 1;
        }
          goto _L5
_L7:
        if (s1.equals("flurry.app_install"))
        {
            byte0 = 2;
        }
          goto _L5
_L33:
        io1 = io.b;
          goto _L18
_L34:
        io1 = io.c;
          goto _L18
_L35:
        io1 = io.a;
          goto _L18
_L14:
        if (as.length != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        kc.a(4, a, "Template does not contain trigger values. Firing.");
        byte0 = 1;
          goto _L19
        if (map != null) goto _L19; else goto _L20
_L20:
        kc.a(4, a, "Publisher has not passed in params list. Not firing.");
          goto _L17
_L36:
        if (i1 >= as.length) goto _L22; else goto _L21
_L21:
        if (!as[i1].equals(s2)) goto _L24; else goto _L23
_L23:
        byte0 = 1;
_L22:
        if (byte0 != 0) goto _L26; else goto _L25
_L25:
        kc.a(4, a, "Publisher params list does not match proton param values. Not firing.");
          goto _L17
_L26:
        kc.a(4, a, "Publisher params match proton values. Firing.");
_L12:
        hn1 = ((ht) (obj)).b;
        if (hn1 != null) goto _L28; else goto _L27
_L27:
        kc.a(3, a, "Template is empty. Not firing current event.");
          goto _L17
_L28:
        kc.a(3, a, (new StringBuilder("Creating callback report for partner: ")).append(hn1.b).toString());
        hashmap1 = new HashMap();
        hashmap1.put("event_name", s1);
        hashmap1.put("event_time_millis", String.valueOf(l1));
        s2 = k.a(hn1.e, hashmap1);
        obj = null;
        if (hn1.f != null)
        {
            obj = k.a(hn1.f, hashmap1);
        }
        l2 = System.currentTimeMillis();
        obj = new ig(hn1.b, hn1.a, s2, l2 + 0xf731400L, u.e.b, hn1.g, hn1.d, hn1.j, hn1.i, hn1.h, ((String) (obj)));
        hashmap.put(Long.valueOf(hn1.a), obj);
          goto _L17
_L10:
        if (hashmap.size() == 0) goto _L3; else goto _L29
_L29:
        map = new ik(s1, flag, jb.a().d(), jb.a().g(), io1, hashmap);
        if (!"flurry.session_end".equals(s1)) goto _L31; else goto _L30
_L30:
        kc.a(3, a, (new StringBuilder("Storing Pulse callbacks for event: ")).append(s1).toString());
        m.add(map);
          goto _L3
_L31:
        kc.a(3, a, (new StringBuilder("Firing Pulse callbacks for event: ")).append(s1).toString());
        ij.a().a(map);
          goto _L3
_L5:
        byte0;
        JVM INSTR tableswitch 0 2: default 848
    //                   0 362
    //                   1 369
    //                   2 376;
           goto _L32 _L33 _L34 _L35
_L16:
        i1 = 0;
          goto _L36
_L24:
        i1++;
          goto _L36
    }

    static boolean b(id id1, boolean flag)
    {
        id1.v = flag;
        return flag;
    }

    static void c(id id1)
    {
        id1.l();
    }

    static void d(id id1)
    {
        id1.m();
    }

    static kg e(id id1)
    {
        return id1.h;
    }

    static String e()
    {
        return a;
    }

    private void f()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = n;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        lp.b();
        Object obj = jo.a().c().getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0);
        if (((SharedPreferences) (obj)).getBoolean("com.flurry.android.flurryAppInstall", true))
        {
            b("flurry.app_install", ((Map) (null)));
            obj = ((SharedPreferences) (obj)).edit();
            ((android.content.SharedPreferences.Editor) (obj)).putBoolean("com.flurry.android.flurryAppInstall", false);
            ((android.content.SharedPreferences.Editor) (obj)).commit();
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    static void f(id id1)
    {
        id1.i();
    }

    private void g()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = n;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        lp.b();
        if (!q || !jc.a().c()) goto _L1; else goto _L3
_L3:
        long l1 = System.currentTimeMillis();
        Object obj;
        byte abyte0[];
        kj kj1;
        if (!jc.a().e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (u == null) goto _L5; else goto _L4
_L4:
        if (t == flag) goto _L7; else goto _L6
_L6:
        kc.a(3, a, "Limit ad tracking value has changed, purging");
        u = null;
_L5:
        jm.a().a(this);
        kc.a(3, a, "Requesting proton config");
        abyte0 = h();
        if (abyte0 == null) goto _L1; else goto _L8
_L8:
        kj1 = new kj();
        if (!TextUtils.isEmpty(o))
        {
            break MISSING_BLOCK_LABEL_353;
        }
        obj = b;
_L12:
        kj1.a(((String) (obj)));
        kj1.d(5000);
        kj1.a(kl.a.c);
        kj1.a("Content-Type", "application/x-flurry;version=2");
        kj1.a("Accept", "application/x-flurry;version=2");
        kj1.a("FM-Checksum", Integer.toString(kg.c(abyte0)));
        kj1.a(new kt());
        kj1.b(new kt());
        kj1.a(abyte0);
        kj1.a(new _cls2(l1, flag));
        jm.a().a(this, kj1);
          goto _L1
        obj;
        throw obj;
_L7:
        if (System.currentTimeMillis() >= s + u.b * 1000L) goto _L10; else goto _L9
_L9:
        kc.a(3, a, "Cached Proton config valid, no need to refresh");
        if (!v)
        {
            v = true;
            b("flurry.session_start", ((Map) (null)));
        }
          goto _L1
_L10:
        if (System.currentTimeMillis() < s + u.c * 1000L) goto _L5; else goto _L11
_L11:
        kc.a(3, a, "Cached Proton config expired, purging");
        u = null;
        l.a();
          goto _L5
        obj = o;
          goto _L12
    }

    static boolean g(id id1)
    {
        return id1.v;
    }

    static void h(id id1)
    {
        id1.f();
    }

    private byte[] h()
    {
        Object obj;
        obj = new hp();
        obj.a = jo.a().d();
        obj.b = lm.c(jo.a().c());
        obj.c = lm.d(jo.a().c());
        obj.d = jp.a();
        obj.e = 3;
        obj.f = jl.a().c();
        Object obj1;
        java.util.Map.Entry entry;
        hr hr1;
        boolean flag;
        if (!jc.a().e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj.g = flag;
        obj.h = new hs();
        ((hp) (obj)).h.a = new hm();
        ((hp) (obj)).h.a.a = Build.MODEL;
        ((hp) (obj)).h.a.b = Build.BRAND;
        ((hp) (obj)).h.a.c = Build.ID;
        ((hp) (obj)).h.a.d = Build.DEVICE;
        ((hp) (obj)).h.a.e = Build.PRODUCT;
        ((hp) (obj)).h.a.f = android.os.Build.VERSION.RELEASE;
        obj.i = new ArrayList();
        obj1 = jc.a().h().entrySet().iterator();
_L2:
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_364;
        }
        entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
        hr1 = new hr();
        hr1.a = ((jk)entry.getKey()).d;
        if (!((jk)entry.getKey()).e)
        {
            break; /* Loop/switch isn't completed */
        }
        hr1.b = new String((byte[])entry.getValue());
_L3:
        ((hp) (obj)).i.add(hr1);
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            hr1.b = lp.b((byte[])entry.getValue());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            kc.a(5, a, (new StringBuilder("Proton config request failed with exception: ")).append(obj).toString());
            return null;
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
        obj1 = jg.a().e();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_456;
        }
        obj.j = new hw();
        ((hp) (obj)).j.a = new hv();
        ((hp) (obj)).j.a.a = lp.a(((Location) (obj1)).getLatitude(), 3);
        ((hp) (obj)).j.a.b = lp.a(((Location) (obj1)).getLongitude(), 3);
        ((hp) (obj)).j.a.c = (float)lp.a(((Location) (obj1)).getAccuracy(), 3);
        byte abyte0[];
        String s1 = (String)lg.a().a("UserId");
        if (!s1.equals(""))
        {
            obj.k = new hz();
            ((hp) (obj)).k.a = s1;
        }
        abyte0 = g.a(obj);
        return abyte0;
    }

    static long i(id id1)
    {
        return id1.r;
    }

    private void i()
    {
        if (u != null)
        {
            kc.a(5, a, "Processing config response");
            ij.a(u.e.c);
            ij.b(u.e.d * 1000);
            il.a().a(u.e.e);
            if (n)
            {
                lg.a().a("analyticsEnabled", Boolean.valueOf(u.f.b));
            }
            l.a();
            Object obj = u.e;
            if (obj != null)
            {
                obj = ((ho) (obj)).a;
                if (obj != null)
                {
                    obj = ((List) (obj)).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        hn hn1 = (hn)((Iterator) (obj)).next();
                        if (hn1 != null)
                        {
                            Object obj1 = hn1.c;
                            if (obj1 != null)
                            {
                                obj1 = ((List) (obj1)).iterator();
                                while (((Iterator) (obj1)).hasNext()) 
                                {
                                    ht ht1 = (ht)((Iterator) (obj1)).next();
                                    if (ht1 != null && !TextUtils.isEmpty(ht1.a))
                                    {
                                        ht1.b = hn1;
                                        l.a(ht1.a, ht1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    static Runnable j(id id1)
    {
        return id1.c;
    }

    private void j()
    {
        this;
        JVM INSTR monitorenter ;
        ib ib1 = (ib)i.a();
        if (ib1 == null) goto _L2; else goto _L1
_L1:
        hq hq1 = (hq)h.d(ib1.c());
_L5:
        hq hq2 = hq1;
        if (!a(hq1))
        {
            hq2 = null;
        }
        if (hq2 == null) goto _L2; else goto _L3
_L3:
        kc.a(4, a, "Loaded saved proton config response");
        r = 10000L;
        s = ib1.a();
        t = ib1.b();
        u = hq2;
        i();
_L2:
        q = true;
        jo.a().b(new _cls3());
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        kc.a(5, a, (new StringBuilder("Failed to decode saved proton config response: ")).append(obj).toString());
        i.b();
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
        obj;
        throw obj;
    }

    private void k()
    {
        this;
        JVM INSTR monitorenter ;
        if (p) goto _L2; else goto _L1
_L1:
        kc.e(a, "Analytics disabled, not sending pulse reports.");
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        kc.a(4, a, (new StringBuilder("Sending ")).append(m.size()).append(" queued reports.").toString());
        ik ik1;
        for (Iterator iterator = m.iterator(); iterator.hasNext(); ij.a().a(ik1))
        {
            ik1 = (ik)iterator.next();
            kc.a(3, a, (new StringBuilder("Firing Pulse callbacks for event: ")).append(ik1.c()).toString());
        }

        break MISSING_BLOCK_LABEL_130;
        Exception exception;
        exception;
        throw exception;
        n();
          goto _L3
    }

    private void l()
    {
        this;
        JVM INSTR monitorenter ;
        List list;
        kc.a(4, a, "Loading queued report data.");
        list = (List)j.a();
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        m.addAll(list);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void m()
    {
        this;
        JVM INSTR monitorenter ;
        kc.a(4, a, "Saving queued report data.");
        j.a(m);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void n()
    {
        this;
        JVM INSTR monitorenter ;
        m.clear();
        j.b();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private String o()
    {
        return (new StringBuilder(".yflurryprotonconfig.")).append(Long.toString(lp.i(jo.a().d()), 16)).toString();
    }

    private String p()
    {
        return (new StringBuilder(".yflurryprotonreport.")).append(Long.toString(lp.i(jo.a().d()), 16)).toString();
    }

    public void a()
    {
        jo.a().c(c);
        jy.a().b("com.flurry.android.sdk.NetworkStateEvent", f);
        jy.a().b("com.flurry.android.sdk.IdProviderUpdatedAdvertisingId", e);
        jy.a().b("com.flurry.android.sdk.IdProviderFinishedEvent", d);
        ij.b();
        lg.a().b("ProtonEnabled", this);
    }

    public void a(long l1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = n;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        lp.b();
        b(l1);
        b("flurry.session_end", ((Map) (null)));
        jo.a().b(new _cls11());
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void a(String s1, Object obj)
    {
        byte byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 3: default 40
    //                   -1720015653: 108
    //                   640941243: 80
    //                   1591403975: 94;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_108;
_L5:
        switch (byte0)
        {
        default:
            kc.a(6, a, "onSettingUpdate internal error!");
            return;

        case 0: // '\0'
            n = ((Boolean)obj).booleanValue();
            kc.a(4, a, (new StringBuilder("onSettingUpdate, protonEnabled = ")).append(n).toString());
            return;

        case 1: // '\001'
            o = (String)obj;
            kc.a(4, a, (new StringBuilder("onSettingUpdate, protonConfigUrl = ")).append(o).toString());
            return;

        case 2: // '\002'
            p = ((Boolean)obj).booleanValue();
            break;
        }
        break MISSING_BLOCK_LABEL_208;
_L3:
        if (s1.equals("ProtonEnabled"))
        {
            byte0 = 0;
        }
          goto _L5
_L4:
        if (s1.equals("ProtonConfigUrl"))
        {
            byte0 = 1;
        }
          goto _L5
        if (s1.equals("analyticsEnabled"))
        {
            byte0 = 2;
        }
          goto _L5
        kc.a(4, a, (new StringBuilder("onSettingUpdate, AnalyticsEnabled = ")).append(p).toString());
        return;
    }

    public void a(String s1, Map map)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = n;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        lp.b();
        b(s1, map);
        if (true) goto _L1; else goto _L3
_L3:
        s1;
        throw s1;
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = n;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        lp.b();
        if.a = jb.a().d();
        v = false;
        g();
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = n;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        lp.b();
        b(jb.a().d());
        k();
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void d()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = n;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        lp.b();
        k();
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }


    private class _cls1 extends lr
    {

        final id a;

        public void a()
        {
            id.a(a);
        }

        _cls1()
        {
            a = id.this;
            super();
        }
    }


    private class _cls4
        implements jx
    {

        final id a;

        public void a(jd jd1)
        {
            id.a(a);
        }

        public volatile void a(jw jw)
        {
            a((jd)jw);
        }

        _cls4()
        {
            a = id.this;
            super();
        }
    }


    private class _cls5
        implements jx
    {

        final id a;

        public void a(je je1)
        {
            id.a(a);
        }

        public volatile void a(jw jw)
        {
            a((je)jw);
        }

        _cls5()
        {
            a = id.this;
            super();
        }
    }


    private class _cls6
        implements jx
    {

        final id a;

        public void a(jh jh1)
        {
            if (jh1.a)
            {
                id.a(a);
            }
        }

        public volatile void a(jw jw)
        {
            a((jh)jw);
        }

        _cls6()
        {
            a = id.this;
            super();
        }
    }


    private class _cls7
        implements la
    {

        final id a;

        public kx a(int i1)
        {
            return new ib.a();
        }

        _cls7()
        {
            a = id.this;
            super();
        }
    }


    private class _cls8
        implements la
    {

        final id a;

        public kx a(int i1)
        {
            return new kw(new ik.a());
        }

        _cls8()
        {
            a = id.this;
            super();
        }
    }


    private class _cls9 extends lr
    {

        final id a;

        public void a()
        {
            id.b(a);
        }

        _cls9()
        {
            a = id.this;
            super();
        }
    }


    private class _cls10 extends lr
    {

        final id a;

        public void a()
        {
            id.c(a);
        }

        _cls10()
        {
            a = id.this;
            super();
        }
    }


    private class _cls2
        implements kj.a
    {

        final long a;
        final boolean b;
        final id c;

        public volatile void a(kj kj1, Object obj)
        {
            a(kj1, (byte[])obj);
        }

        public void a(kj kj1, byte abyte0[])
        {
            Object obj;
            int i1;
            obj = null;
            i1 = kj1.h();
            kc.a(3, id.e(), (new StringBuilder("Proton config request: HTTP status code is:")).append(i1).toString());
            if (i1 != 400 && i1 != 406 && i1 != 412 && i1 != 415) goto _L2; else goto _L1
_L1:
            id.a(c, 10000L);
_L4:
            return;
_L2:
            long l1;
            hq hq1 = obj;
            if (!kj1.f())
            {
                continue; /* Loop/switch isn't completed */
            }
            hq1 = obj;
            if (abyte0 == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            class _cls1 extends lr
            {

                final byte a[];
                final _cls2 b;

                public void a()
                {
                    id.a(b.c, b.a, b.b, a);
                }

                _cls1(byte abyte0[])
                {
                    b = _cls2.this;
                    a = abyte0;
                    super();
                }
            }

            jo.a().b(new _cls1(abyte0));
            long l2;
            try
            {
                abyte0 = (hq)id.e(c).d(abyte0);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                kc.a(5, id.e(), (new StringBuilder("Failed to decode proton config response: ")).append(abyte0).toString());
                abyte0 = null;
            }
            hq1 = abyte0;
            if (!id.a(c, abyte0))
            {
                hq1 = null;
            }
            if (hq1 != null)
            {
                id.a(c, 10000L);
                id.b(c, a);
                id.a(c, b);
                id.b(c, hq1);
                id.f(c);
                if (!id.g(c))
                {
                    id.b(c, true);
                    id.a(c, "flurry.session_start", null);
                }
                id.h(c);
            }
            if (hq1 != null) goto _L4; else goto _L3
_L3:
            l1 = id.i(c);
            if (i1 != 429) goto _L6; else goto _L5
_L5:
            kj1 = kj1.b("Retry-After");
            if (kj1.isEmpty()) goto _L6; else goto _L7
_L7:
            kj1 = (String)kj1.get(0);
            kc.a(3, id.e(), (new StringBuilder("Server returned retry time: ")).append(kj1).toString());
            l2 = Long.parseLong(kj1);
            l1 = l2 * 1000L;
_L9:
            id.a(c, l1);
            kc.a(3, id.e(), (new StringBuilder("Proton config request failed, backing off: ")).append(id.i(c)).append("ms").toString());
            jo.a().b(id.j(c), id.i(c));
            return;
            kj1;
            kc.a(3, id.e(), "Server returned nonsensical retry time");
_L6:
            l1 <<= 1;
            if (true) goto _L9; else goto _L8
_L8:
        }

        _cls2(long l1, boolean flag)
        {
            c = id.this;
            a = l1;
            b = flag;
            super();
        }
    }


    private class _cls3 extends lr
    {

        final id a;

        public void a()
        {
            id.a(a);
        }

        _cls3()
        {
            a = id.this;
            super();
        }
    }


    private class _cls11 extends lr
    {

        final id a;

        public void a()
        {
            id.d(a);
        }

        _cls11()
        {
            a = id.this;
            super();
        }
    }

}
