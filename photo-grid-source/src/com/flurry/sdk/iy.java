// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.text.TextUtils;
import com.flurry.android.FlurryEventRecordStatus;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.flurry.sdk:
//            hj, jy, jj, jo, 
//            kc, iu, jl, jc, 
//            jq, hi, jp, iv, 
//            it, jv, hl, iz, 
//            jb, lp, is, ix, 
//            jf, ln, jg, iw, 
//            lg, lh, ir, jx, 
//            lb

public class iy
    implements lh.a
{

    static int a = 100;
    static int b = 10;
    static int c = 1000;
    static int d = 0x27100;
    static int e = 50;
    private static final String f = com/flurry/sdk/iy.getSimpleName();
    private final List A = new ArrayList();
    private int B;
    private int C;
    private boolean D;
    private final hj E = new hj();
    private final jx F = new _cls9();
    private final AtomicInteger g = new AtomicInteger(0);
    private final AtomicInteger h = new AtomicInteger(0);
    private final AtomicInteger i = new AtomicInteger(0);
    private final jx j = new _cls1();
    private WeakReference k;
    private File l;
    private jv m;
    private boolean n;
    private long o;
    private boolean p;
    private String q;
    private byte r;
    private Long s;
    private final List t = new ArrayList();
    private final Map u = new HashMap();
    private final Map v = new HashMap();
    private final Map w = new HashMap();
    private final List x = new ArrayList();
    private boolean y;
    private int z;

    public iy()
    {
        y = true;
        z = 0;
        B = 0;
        C = 0;
        D = true;
        jy.a().a("com.flurry.android.sdk.FlurrySessionEvent", j);
    }

    static WeakReference a(iy iy1)
    {
        return iy1.k;
    }

    static void a(iy iy1, boolean flag, long l1)
    {
        iy1.a(flag, l1);
    }

    private void a(boolean flag)
    {
        int j1 = -1;
        Object obj;
        int i1;
        boolean flag1;
        if (flag)
        {
            v.put("boot.time", Long.toString(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
            obj = new StatFs(Environment.getRootDirectory().getAbsolutePath());
            Object obj1 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            float f1;
            Object obj2;
            StringBuilder stringbuilder;
            if (android.os.Build.VERSION.SDK_INT >= 18)
            {
                v.put("disk.size.total.internal", Long.toString(((StatFs) (obj)).getAvailableBlocksLong()));
                v.put("disk.size.available.internal", Long.toString(((StatFs) (obj)).getAvailableBlocksLong()));
                v.put("disk.size.total.external", Long.toString(((StatFs) (obj1)).getAvailableBlocksLong()));
                v.put("disk.size.available.external", Long.toString(((StatFs) (obj1)).getAvailableBlocksLong()));
            } else
            {
                v.put("disk.size.total.internal", Long.toString(((StatFs) (obj)).getAvailableBlocks()));
                v.put("disk.size.available.internal", Long.toString(((StatFs) (obj)).getAvailableBlocks()));
                v.put("disk.size.total.external", Long.toString(((StatFs) (obj1)).getAvailableBlocks()));
                v.put("disk.size.available.external", Long.toString(((StatFs) (obj1)).getAvailableBlocks()));
            }
            v.put("carrier.name", jj.a().c());
            v.put("carrier.details", jj.a().d());
        }
        obj = (ActivityManager)jo.a().c().getSystemService("activity");
        obj1 = new android.app.ActivityManager.MemoryInfo();
        ((ActivityManager) (obj)).getMemoryInfo(((android.app.ActivityManager.MemoryInfo) (obj1)));
        obj2 = v;
        stringbuilder = new StringBuilder("memory.available");
        if (flag)
        {
            obj = ".start";
        } else
        {
            obj = ".end";
        }
        ((Map) (obj2)).put(stringbuilder.append(((String) (obj))).toString(), Long.toString(((android.app.ActivityManager.MemoryInfo) (obj1)).availMem));
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            obj2 = v;
            stringbuilder = new StringBuilder("memory.total");
            if (flag)
            {
                obj = ".start";
            } else
            {
                obj = ".end";
            }
            ((Map) (obj2)).put(stringbuilder.append(((String) (obj))).toString(), Long.toString(((android.app.ActivityManager.MemoryInfo) (obj1)).availMem));
        }
        obj = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        obj = jo.a().c().registerReceiver(null, ((IntentFilter) (obj)));
        if (obj != null)
        {
            i1 = ((Intent) (obj)).getIntExtra("status", -1);
            if (i1 == 2 || i1 == 5)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            j1 = ((Intent) (obj)).getIntExtra("level", -1);
            i1 = ((Intent) (obj)).getIntExtra("scale", -1);
        } else
        {
            flag1 = false;
            i1 = -1;
        }
        f1 = (float)j1 / (float)i1;
        obj1 = v;
        obj2 = new StringBuilder("battery.charging");
        if (flag)
        {
            obj = ".start";
        } else
        {
            obj = ".end";
        }
        ((Map) (obj1)).put(((StringBuilder) (obj2)).append(((String) (obj))).toString(), Boolean.toString(flag1));
        obj1 = v;
        obj2 = new StringBuilder("battery.remaining");
        if (flag)
        {
            obj = ".start";
        } else
        {
            obj = ".end";
        }
        ((Map) (obj1)).put(((StringBuilder) (obj2)).append(((String) (obj))).toString(), Float.toString(f1));
    }

    private void a(boolean flag, long l1)
    {
        this;
        JVM INSTR monitorenter ;
        if (D) goto _L2; else goto _L1
_L1:
        kc.a(3, f, "Analytics disabled, not sending agent report.");
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (flag) goto _L4; else goto _L3
_L3:
        if (t.isEmpty()) goto _L5; else goto _L4
_L4:
        kc.a(3, f, "generating agent report");
        Object obj = (new iu(jo.a().d(), jl.a().e(), n, jc.a().e(), o, l1, t, jc.a().h(), E.a(false), u, jq.a().c(), System.currentTimeMillis())).a();
_L6:
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_178;
        }
        kc.e(f, "Error generating report");
_L7:
        j();
          goto _L5
        obj;
        throw obj;
        obj;
        kc.e(f, (new StringBuilder("Exception while generating report: ")).append(obj).toString());
        obj = null;
          goto _L6
        kc.a(3, f, (new StringBuilder("generated report of size ")).append(obj.length).append(" with ").append(t.size()).append(" reports.").toString());
        iv iv1 = hi.a().d();
        String s1 = (new StringBuilder()).append(jp.a()).toString();
        iv1.b(((byte []) (obj)), jo.a().d(), s1);
          goto _L7
    }

    static jx b(iy iy1)
    {
        return iy1.j;
    }

    private void b(long l1)
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = x.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            it it1 = (it)iterator.next();
            if (it1.a() && !it1.b())
            {
                it1.a(l1);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_62;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    private void c(Context context)
    {
        if (context instanceof Activity)
        {
            Bundle bundle = ((Activity)context).getIntent().getExtras();
            if (bundle != null)
            {
                kc.a(3, f, (new StringBuilder("Launch Options Bundle is present ")).append(bundle.toString()).toString());
                Iterator iterator = bundle.keySet().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    String s1 = (String)iterator.next();
                    if (s1 != null)
                    {
                        context = ((Context) (bundle.get(s1)));
                        if (context != null)
                        {
                            context = context.toString();
                        } else
                        {
                            context = "null";
                        }
                        u.put(s1, new ArrayList(Arrays.asList(new String[] {
                            context
                        })));
                        kc.a(3, f, (new StringBuilder("Launch options Key: ")).append(s1).append(". Its value: ").append(context).toString());
                    }
                } while (true);
            }
        }
    }

    static void c(iy iy1)
    {
        iy1.i();
    }

    static void d(iy iy1)
    {
        iy1.m();
    }

    static void e(iy iy1)
    {
        iy1.n();
    }

    static List f(iy iy1)
    {
        return iy1.t;
    }

    static boolean g(iy iy1)
    {
        return iy1.D;
    }

    private void i()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        kc.a(4, f, "Loading persistent session report data.");
        obj = (List)m.a();
        if (obj == null) goto _L2; else goto _L1
_L1:
        t.addAll(((java.util.Collection) (obj)));
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!l.exists())
        {
            continue; /* Loop/switch isn't completed */
        }
        kc.a(4, f, "Legacy persistent agent data found, converting.");
        obj = hl.a(l);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        long l2;
        boolean flag;
        flag = ((iz) (obj)).a();
        l2 = ((iz) (obj)).b();
        long l1;
        l1 = l2;
        if (l2 > 0L)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        l1 = jb.a().d();
        n = flag;
        o = l1;
        n();
        obj = ((iz) (obj)).c();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        t.addAll(((java.util.Collection) (obj)));
        l.delete();
        c();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private void j()
    {
        t.clear();
        m.b();
    }

    private String k()
    {
        return (new StringBuilder(".flurryagent.")).append(Integer.toString(jo.a().d().hashCode(), 16)).toString();
    }

    private String l()
    {
        return (new StringBuilder(".yflurryreport.")).append(Long.toString(lp.i(jo.a().d()), 16)).toString();
    }

    private void m()
    {
        SharedPreferences sharedpreferences = jo.a().c().getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0);
        n = sharedpreferences.getBoolean("com.flurry.sdk.previous_successful_report", false);
        o = sharedpreferences.getLong("com.flurry.sdk.initial_run_time", jb.a().d());
    }

    private void n()
    {
        android.content.SharedPreferences.Editor editor = jo.a().c().getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).edit();
        editor.putBoolean("com.flurry.sdk.previous_successful_report", n);
        editor.putLong("com.flurry.sdk.initial_run_time", o);
        editor.commit();
    }

    private int o()
    {
        return g.incrementAndGet();
    }

    private int p()
    {
        return h.incrementAndGet();
    }

    public FlurryEventRecordStatus a(String s1, String s2, Map map, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        FlurryEventRecordStatus flurryeventrecordstatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (map != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flurryeventrecordstatus;
_L2:
        if (!TextUtils.isEmpty(s2))
        {
            map.put("\uE8FFsid+Tumblr", s2);
            flurryeventrecordstatus = a(s1, map, false);
            kc.a(5, f, (new StringBuilder("logEvent status for syndication:")).append(flurryeventrecordstatus).toString());
        }
        if (true) goto _L1; else goto _L3
_L3:
        s1;
        throw s1;
    }

    public FlurryEventRecordStatus a(String s1, Map map, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        FlurryEventRecordStatus flurryeventrecordstatus = FlurryEventRecordStatus.kFlurryEventRecorded;
        if (D) goto _L2; else goto _L1
_L1:
        s1 = FlurryEventRecordStatus.kFlurryEventAnalyticsDisabled;
        kc.e(f, "Analytics has been disabled, not logging event.");
_L3:
        this;
        JVM INSTR monitorexit ;
        return s1;
_L2:
        String s2;
        long l1;
        long l2;
label0:
        {
            l1 = SystemClock.elapsedRealtime();
            l2 = jb.a().e();
            s2 = lp.b(s1);
            if (s2.length() != 0)
            {
                break label0;
            }
            s1 = FlurryEventRecordStatus.kFlurryEventFailed;
        }
          goto _L3
        s1 = (is)w.get(s2);
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_270;
        }
        if (w.size() >= a) goto _L5; else goto _L4
_L4:
        s1 = new is();
        s1.a = 1;
        w.put(s2, s1);
        kc.e(f, (new StringBuilder("Event count started: ")).append(s2).toString());
        s1 = flurryeventrecordstatus;
_L6:
        if (!p || x.size() >= c || z >= d)
        {
            break MISSING_BLOCK_LABEL_458;
        }
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        map = Collections.emptyMap();
        if (map.size() <= b)
        {
            break MISSING_BLOCK_LABEL_311;
        }
        kc.e(f, (new StringBuilder("MaxEventParams exceeded: ")).append(map.size()).toString());
        s1 = FlurryEventRecordStatus.kFlurryEventParamsCountExceeded;
          goto _L3
_L5:
        kc.e(f, (new StringBuilder("Too many different events. Event not counted: ")).append(s2).toString());
        s1 = FlurryEventRecordStatus.kFlurryEventUniqueCountExceeded;
          goto _L6
        s1.a = ((is) (s1)).a + 1;
        kc.e(f, (new StringBuilder("Event count incremented: ")).append(s2).toString());
        s1 = FlurryEventRecordStatus.kFlurryEventRecorded;
          goto _L6
        s1 = new it(o(), s2, map, l1 - l2, flag);
        if (s1.d() + z > d)
        {
            break MISSING_BLOCK_LABEL_430;
        }
        x.add(s1);
        int i1 = z;
        z = s1.d() + i1;
        flurryeventrecordstatus = FlurryEventRecordStatus.kFlurryEventRecorded;
        s1 = flurryeventrecordstatus;
        if (!D) goto _L3; else goto _L7
_L7:
        s1 = flurryeventrecordstatus;
        if (hi.a().c() == null) goto _L3; else goto _L8
_L8:
        jo.a().b(new _cls7(s2, map));
        s1 = flurryeventrecordstatus;
          goto _L3
        s1;
        throw s1;
        z = d;
        y = false;
        kc.e(f, "Event Log size exceeded. No more event details logged.");
        s1 = FlurryEventRecordStatus.kFlurryEventLogCountExceeded;
          goto _L3
        y = false;
          goto _L3
    }

    iw a(long l1, long l2, long l3, int i1)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = new ix();
        ((ix) (obj)).a(jl.a().e());
        ((ix) (obj)).a(l1);
        ((ix) (obj)).b(l2);
        ((ix) (obj)).c(l3);
        ((ix) (obj)).a(v);
        ((ix) (obj)).b(jb.a().i());
        ((ix) (obj)).c(jb.a().j());
        ((ix) (obj)).b(jb.a().k());
        ((ix) (obj)).d(jf.a().c());
        ((ix) (obj)).e(jf.a().d());
        ((ix) (obj)).a(i1);
        ((ix) (obj)).b(ln.j());
        ((ix) (obj)).f(d());
        ((ix) (obj)).a(jg.a().e());
        ((ix) (obj)).c(h());
        ((ix) (obj)).a(r);
        ((ix) (obj)).a(s);
        ((ix) (obj)).c(g());
        ((ix) (obj)).a(e());
        ((ix) (obj)).a(y);
        ((ix) (obj)).b(f());
        ((ix) (obj)).d(B);
        obj = new iw(((ix) (obj)));
_L2:
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_237;
        }
        kc.e(f, "New session report wasn't created");
        this;
        JVM INSTR monitorexit ;
        return ((iw) (obj));
        Object obj1;
        obj1;
        kc.a(5, f, (new StringBuilder("Error creating analytics session report: ")).append(obj1).toString());
        obj1 = null;
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        throw obj1;
    }

    public void a()
    {
        n = true;
    }

    public void a(long l1)
    {
        this;
        JVM INSTR monitorenter ;
        jy.a().a(F);
        jo.a().b(new _cls5());
        if (jc.a().c())
        {
            jo.a().b(new _cls6(l1));
        }
        lg.a().b("Gender", this);
        lg.a().b("UserId", this);
        lg.a().b("Age", this);
        lg.a().b("LogEvents", this);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        if (hi.a().e() != null)
        {
            jo.a().b(new _cls15());
        }
        if (D && hi.a().c() != null)
        {
            jo.a().b(new _cls16());
        }
        this;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public void a(lb lb, Context context)
    {
        k = new WeakReference(lb);
        lb = lg.a();
        p = ((Boolean)lb.a("LogEvents")).booleanValue();
        lb.a("LogEvents", this);
        kc.a(4, f, (new StringBuilder("initSettings, LogEvents = ")).append(p).toString());
        q = (String)lb.a("UserId");
        lb.a("UserId", this);
        kc.a(4, f, (new StringBuilder("initSettings, UserId = ")).append(q).toString());
        r = ((Byte)lb.a("Gender")).byteValue();
        lb.a("Gender", this);
        kc.a(4, f, (new StringBuilder("initSettings, Gender = ")).append(r).toString());
        s = (Long)lb.a("Age");
        lb.a("Age", this);
        kc.a(4, f, (new StringBuilder("initSettings, BirthDate = ")).append(s).toString());
        D = ((Boolean)lb.a("analyticsEnabled")).booleanValue();
        lb.a("analyticsEnabled", this);
        kc.a(4, f, (new StringBuilder("initSettings, AnalyticsEnabled = ")).append(D).toString());
        l = context.getFileStreamPath(k());
        m = new jv(context.getFileStreamPath(l()), ".yflurryreport.", 1, new _cls10());
        c(context);
        a(true);
        if (hi.a().c() != null)
        {
            jo.a().b(new _cls11());
        }
        jo.a().b(new _cls12());
        jo.a().b(new _cls13());
        if (jc.a().c())
        {
            jo.a().b(new _cls14());
            return;
        } else
        {
            jy.a().a("com.flurry.android.sdk.IdProviderFinishedEvent", F);
            return;
        }
    }

    public void a(String s1, Object obj)
    {
        byte byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 5: default 56
    //                   -1752163738: 119
    //                   -1720015653: 164
    //                   -738063011: 104
    //                   65759: 149
    //                   2129321697: 134;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_164;
_L7:
        switch (byte0)
        {
        default:
            kc.a(6, f, "onSettingUpdate internal error!");
            return;

        case 0: // '\0'
            p = ((Boolean)obj).booleanValue();
            kc.a(4, f, (new StringBuilder("onSettingUpdate, LogEvents = ")).append(p).toString());
            return;

        case 1: // '\001'
            q = (String)obj;
            kc.a(4, f, (new StringBuilder("onSettingUpdate, UserId = ")).append(q).toString());
            return;

        case 2: // '\002'
            r = ((Byte)obj).byteValue();
            kc.a(4, f, (new StringBuilder("onSettingUpdate, Gender = ")).append(r).toString());
            return;

        case 3: // '\003'
            s = (Long)obj;
            kc.a(4, f, (new StringBuilder("onSettingUpdate, Birthdate = ")).append(s).toString());
            return;

        case 4: // '\004'
            D = ((Boolean)obj).booleanValue();
            break;
        }
        break MISSING_BLOCK_LABEL_340;
_L4:
        if (s1.equals("LogEvents"))
        {
            byte0 = 0;
        }
          goto _L7
_L2:
        if (s1.equals("UserId"))
        {
            byte0 = 1;
        }
          goto _L7
_L6:
        if (s1.equals("Gender"))
        {
            byte0 = 2;
        }
          goto _L7
_L5:
        if (s1.equals("Age"))
        {
            byte0 = 3;
        }
          goto _L7
        if (s1.equals("analyticsEnabled"))
        {
            byte0 = 4;
        }
          goto _L7
        kc.a(4, f, (new StringBuilder("onSettingUpdate, AnalyticsEnabled = ")).append(D).toString());
        return;
    }

    public void a(String s1, String s2, String s3, Throwable throwable)
    {
        this;
        JVM INSTR monitorenter ;
        if (s1 == null) goto _L2; else goto _L1
_L1:
        if (!"uncaught".equals(s1)) goto _L2; else goto _L3
_L3:
        int i1 = 1;
_L6:
        B = B + 1;
        if (A.size() >= e) goto _L5; else goto _L4
_L4:
        long l1 = System.currentTimeMillis();
        s1 = new ir(p(), Long.valueOf(l1).longValue(), s1, s2, s3, throwable);
        A.add(s1);
        kc.e(f, (new StringBuilder("Error logged: ")).append(s1.c()).toString());
_L8:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        i1 = 0;
          goto _L6
_L5:
        if (!i1)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        i1 = 0;
_L9:
        if (i1 >= A.size()) goto _L8; else goto _L7
_L7:
        ir ir1 = (ir)A.get(i1);
        if (ir1.c() == null || "uncaught".equals(ir1.c()))
        {
            break MISSING_BLOCK_LABEL_231;
        }
        long l2 = System.currentTimeMillis();
        s1 = new ir(p(), Long.valueOf(l2).longValue(), s1, s2, s3, throwable);
        A.set(i1, s1);
          goto _L8
        s1;
        throw s1;
        i1++;
          goto _L9
        kc.e(f, "Max errors logged. No more errors logged.");
          goto _L8
    }

    public void a(String s1, Map map)
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = x.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        it it1 = (it)iterator.next();
        if (!it1.a(s1)) goto _L4; else goto _L3
_L3:
        long l1;
        long l2;
        l1 = SystemClock.elapsedRealtime();
        l2 = jb.a().e();
        if (map == null) goto _L6; else goto _L5
_L5:
        if (map.size() <= 0 || z >= d) goto _L6; else goto _L7
_L7:
        int i1;
        i1 = z - it1.d();
        s1 = new HashMap(it1.c());
        it1.a(map);
        if (it1.d() + i1 > d)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        if (it1.c().size() <= b) goto _L9; else goto _L8
_L8:
        kc.e(f, (new StringBuilder("MaxEventParams exceeded on endEvent: ")).append(it1.c().size()).toString());
        it1.b(s1);
_L6:
        it1.a(l1 - l2);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L9:
        z = i1 + it1.d();
          goto _L6
        s1;
        throw s1;
        it1.b(s1);
        y = false;
        z = d;
        kc.e(f, "Event Log size exceeded. No more event details logged.");
          goto _L6
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        C = C + 1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void b(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        a(false);
        long l1 = jb.a().d();
        long l2 = jb.a().f();
        long l3 = jb.a().h();
        int i1 = jb.a().l().a();
        b(jb.a().f());
        if (D && hi.a().c() != null)
        {
            jo.a().b(new _cls2(l1));
        }
        jo.a().b(new _cls3());
        if (jc.a().c())
        {
            jo.a().b(new _cls4(l1, l2, l3, i1));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        kc.a(4, f, "Saving persistent agent data.");
        m.a(t);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    String d()
    {
        if (q == null)
        {
            return "";
        } else
        {
            return q;
        }
    }

    List e()
    {
        return x;
    }

    List f()
    {
        return A;
    }

    Map g()
    {
        return w;
    }

    int h()
    {
        return C;
    }


    private class _cls1
        implements jx
    {

        final iy a;

        public volatile void a(jw jw)
        {
            a((lc)jw);
        }

        public void a(lc lc1)
        {
            if (iy.a(a) != null && lc1.b != iy.a(a).get())
            {
                return;
            }
            switch (_cls8.a[lc1.c.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                a.a(lc1.b, (Context)lc1.a.get());
                return;

            case 2: // '\002'
                a.a((Context)lc1.a.get());
                return;

            case 3: // '\003'
                a.b((Context)lc1.a.get());
                return;

            case 4: // '\004'
                jy.a().b("com.flurry.android.sdk.FlurrySessionEvent", iy.b(a));
                break;
            }
            a.a(lc1.d);
        }

        _cls1()
        {
            a = iy.this;
            super();
        }

        private class _cls8
        {

            static final int a[];

            static 
            {
                a = new int[lc.a.values().length];
                try
                {
                    a[lc.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[lc.a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[lc.a.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[lc.a.e.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

    }


    private class _cls9
        implements jx
    {

        final iy a;

        public void a(jd jd1)
        {
            class _cls1 extends lr
            {

                final _cls9 a;

                public void a()
                {
                    iy.a(a.a, true, jb.a().d());
                }

                _cls1()
                {
                    a = _cls9.this;
                    super();
                }
            }

            jo.a().b(new _cls1());
        }

        public volatile void a(jw jw)
        {
            a((jd)jw);
        }

        _cls9()
        {
            a = iy.this;
            super();
        }
    }


    private class _cls7
        implements Runnable
    {

        final String a;
        final Map b;
        final iy c;

        public void run()
        {
            hi.a().c().a(a, b);
        }

        _cls7(String s1, Map map)
        {
            c = iy.this;
            a = s1;
            b = map;
            super();
        }
    }


    private class _cls5 extends lr
    {

        final iy a;

        public void a()
        {
            if (iy.g(a) && hi.a().c() != null)
            {
                hi.a().c().d();
            }
            class _cls1 extends lr
            {

                final _cls5 a;

                public void a()
                {
                    hi.a().e().d();
                }

                _cls1()
                {
                    a = _cls5.this;
                    super();
                }
            }

            if (hi.a().e() != null)
            {
                jo.a().b(new _cls1());
            }
        }

        _cls5()
        {
            a = iy.this;
            super();
        }
    }


    private class _cls6 extends lr
    {

        final long a;
        final iy b;

        public void a()
        {
            iy.a(b, false, a);
        }

        _cls6(long l1)
        {
            b = iy.this;
            a = l1;
            super();
        }
    }


    private class _cls15 extends lr
    {

        final iy a;

        public void a()
        {
            hi.a().e().e();
        }

        _cls15()
        {
            a = iy.this;
            super();
        }
    }


    private class _cls16 extends lr
    {

        final iy a;

        public void a()
        {
            hi.a().c().c();
        }

        _cls16()
        {
            a = iy.this;
            super();
        }
    }


    private class _cls10
        implements la
    {

        final iy a;

        public kx a(int i1)
        {
            return new kw(new iw.a());
        }

        _cls10()
        {
            a = iy.this;
            super();
        }
    }


    private class _cls11 extends lr
    {

        final iy a;

        public void a()
        {
            hi.a().c().b();
        }

        _cls11()
        {
            a = iy.this;
            super();
        }
    }


    private class _cls12 extends lr
    {

        final iy a;

        public void a()
        {
            iy.c(a);
        }

        _cls12()
        {
            a = iy.this;
            super();
        }
    }


    private class _cls13 extends lr
    {

        final iy a;

        public void a()
        {
            iy.d(a);
        }

        _cls13()
        {
            a = iy.this;
            super();
        }
    }


    private class _cls14 extends lr
    {

        final iy a;

        public void a()
        {
            iy.a(a, true, jb.a().d());
        }

        _cls14()
        {
            a = iy.this;
            super();
        }
    }


    private class _cls2 extends lr
    {

        final long a;
        final iy b;

        public void a()
        {
            hi.a().c().a(a);
        }

        _cls2(long l1)
        {
            b = iy.this;
            a = l1;
            super();
        }
    }


    private class _cls3 extends lr
    {

        final iy a;

        public void a()
        {
            iy.e(a);
        }

        _cls3()
        {
            a = iy.this;
            super();
        }
    }


    private class _cls4 extends lr
    {

        final long a;
        final long b;
        final long c;
        final int d;
        final iy e;

        public void a()
        {
            iw iw1 = e.a(a, b, c, d);
            iy.f(e).clear();
            iy.f(e).add(iw1);
            e.c();
        }

        _cls4(long l1, long l2, long l3, 
                int i1)
        {
            e = iy.this;
            a = l1;
            b = l2;
            c = l3;
            d = i1;
            super();
        }
    }

}
