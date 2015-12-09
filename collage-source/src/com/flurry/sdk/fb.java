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
import com.flurry.android.FlurryEventRecordStatus;
import java.io.File;
import java.io.IOException;
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
//            hf, er, ew, fk, 
//            fp, gd, ex, fm, 
//            fe, fd, fr, eq, 
//            fq, ey, fw, et, 
//            fc, hp, ev, fz, 
//            hg, hh, eu, fa, 
//            fg, hn, fh, ez, 
//            fy, ff, fx, hq, 
//            ha, gw, gx

public class fb
    implements hf, hh.a
{

    static int a = 100;
    static int b = 10;
    static int c = 1000;
    static int d = 0x27100;
    static int e = 50;
    private static final String f = com/flurry/sdk/fb.getSimpleName();
    private int A;
    private final er B = new er();
    private final fy C = new fy() {

        final fb a;

        public void a(ff ff1)
        {
            fp.a().b(new hq(this) {

                final _cls1 a;

                public void safeRun()
                {
                    fb.a(a.a, true);
                }

            
            {
                a = _pcls1;
                super();
            }
            });
        }

        public void notify(fx fx)
        {
            a((ff)fx);
        }

            
            {
                a = fb.this;
                super();
            }
    };
    private final AtomicInteger g = new AtomicInteger(0);
    private final AtomicInteger h = new AtomicInteger(0);
    private final AtomicInteger i = new AtomicInteger(0);
    private File j;
    private fw k;
    private boolean l;
    private long m;
    private boolean n;
    private String o;
    private byte p;
    private Long q;
    private final List r = new ArrayList();
    private final Map s = new HashMap();
    private final Map t = new HashMap();
    private final Map u = new HashMap();
    private final List v = new ArrayList();
    private boolean w;
    private int x;
    private final List y = new ArrayList();
    private int z;

    public fb()
    {
        w = true;
        x = 0;
        z = 0;
        A = 0;
    }

    private void a(long l1)
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = v.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ew ew1 = (ew)iterator.next();
            if (ew1.a() && !ew1.b())
            {
                ew1.a(l1);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_62;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    static void a(fb fb1)
    {
        fb1.k();
    }

    static void a(fb fb1, boolean flag)
    {
        fb1.b(flag);
    }

    private void a(boolean flag)
    {
        int j1 = -1;
        Object obj;
        int i1;
        boolean flag1;
        if (flag)
        {
            t.put("boot.time", Long.toString(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
            obj = new StatFs(Environment.getRootDirectory().getAbsolutePath());
            Object obj1 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            float f1;
            Object obj2;
            StringBuilder stringbuilder;
            if (android.os.Build.VERSION.SDK_INT >= 18)
            {
                t.put("disk.size.total.internal", Long.toString(((StatFs) (obj)).getAvailableBlocksLong()));
                t.put("disk.size.available.internal", Long.toString(((StatFs) (obj)).getAvailableBlocksLong()));
                t.put("disk.size.total.external", Long.toString(((StatFs) (obj1)).getAvailableBlocksLong()));
                t.put("disk.size.available.external", Long.toString(((StatFs) (obj1)).getAvailableBlocksLong()));
            } else
            {
                t.put("disk.size.total.internal", Long.toString(((StatFs) (obj)).getAvailableBlocks()));
                t.put("disk.size.available.internal", Long.toString(((StatFs) (obj)).getAvailableBlocks()));
                t.put("disk.size.total.external", Long.toString(((StatFs) (obj1)).getAvailableBlocks()));
                t.put("disk.size.available.external", Long.toString(((StatFs) (obj1)).getAvailableBlocks()));
            }
            t.put("carrier.name", fk.a().c());
            t.put("carrier.details", fk.a().d());
        }
        obj = (ActivityManager)fp.a().c().getSystemService("activity");
        obj1 = new android.app.ActivityManager.MemoryInfo();
        ((ActivityManager) (obj)).getMemoryInfo(((android.app.ActivityManager.MemoryInfo) (obj1)));
        obj2 = t;
        stringbuilder = (new StringBuilder()).append("memory.available");
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
            obj2 = t;
            stringbuilder = (new StringBuilder()).append("memory.total");
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
        obj = fp.a().c().registerReceiver(null, ((IntentFilter) (obj)));
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
        obj1 = t;
        obj2 = (new StringBuilder()).append("battery.charging");
        if (flag)
        {
            obj = ".start";
        } else
        {
            obj = ".end";
        }
        ((Map) (obj1)).put(((StringBuilder) (obj2)).append(((String) (obj))).toString(), Boolean.toString(flag1));
        obj1 = t;
        obj2 = (new StringBuilder()).append("battery.remaining");
        if (flag)
        {
            obj = ".start";
        } else
        {
            obj = ".end";
        }
        ((Map) (obj1)).put(((StringBuilder) (obj2)).append(((String) (obj))).toString(), Float.toString(f1));
    }

    static void b(fb fb1)
    {
        fb1.o();
    }

    private void b(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (flag) goto _L2; else goto _L1
_L1:
        flag = r.isEmpty();
        if (!flag) goto _L2; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        gd.a(3, f, "generating agent report");
        Object obj = (new ex(fp.a().d(), fm.a().e(), l, fe.a().e(), m, fd.a().c(), r, fe.a().h(), B.a(false), s, fr.a().c(), System.currentTimeMillis())).a();
_L4:
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        gd.e(f, "Error generating report");
_L5:
        l();
          goto _L3
        obj;
        throw obj;
        obj;
        gd.e(f, (new StringBuilder()).append("Exception while generating report: ").append(obj).toString());
        obj = null;
          goto _L4
        gd.a(3, f, (new StringBuilder()).append("generated report of size ").append(obj.length).append(" with ").append(r.size()).append(" reports.").toString());
        ey ey1 = eq.a().c();
        String s1 = (new StringBuilder()).append("").append(fq.a()).toString();
        ey1.b(((byte []) (obj)), fp.a().d(), s1);
          goto _L5
    }

    static void c(fb fb1)
    {
        fb1.p();
    }

    static List d(fb fb1)
    {
        return fb1.r;
    }

    private void d(Context context)
    {
        if (context instanceof Activity)
        {
            Bundle bundle = ((Activity)context).getIntent().getExtras();
            if (bundle != null)
            {
                gd.a(3, f, (new StringBuilder()).append("Launch Options Bundle is present ").append(bundle.toString()).toString());
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
                        s.put(s1, new ArrayList(Arrays.asList(new String[] {
                            context
                        })));
                        gd.a(3, f, (new StringBuilder()).append("Launch options Key: ").append(s1).append(". Its value: ").append(context).toString());
                    }
                } while (true);
            }
        }
    }

    private void k()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        gd.a(4, f, "Loading persistent session report data.");
        obj = (List)k.a();
        if (obj == null) goto _L2; else goto _L1
_L1:
        r.addAll(((java.util.Collection) (obj)));
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!j.exists())
        {
            continue; /* Loop/switch isn't completed */
        }
        gd.a(4, f, "Legacy persistent agent data found, converting.");
        obj = et.a(j);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        long l2;
        boolean flag;
        flag = ((fc) (obj)).a();
        l2 = ((fc) (obj)).b();
        long l1;
        l1 = l2;
        if (l2 > 0L)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        l1 = fd.a().c();
        l = flag;
        m = l1;
        p();
        obj = ((fc) (obj)).c();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        r.addAll(((java.util.Collection) (obj)));
        j.delete();
        e();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private void l()
    {
        r.clear();
        k.b();
    }

    private String m()
    {
        return (new StringBuilder()).append(".flurryagent.").append(Integer.toString(fp.a().d().hashCode(), 16)).toString();
    }

    private String n()
    {
        return (new StringBuilder()).append(".yflurryreport.").append(Long.toString(hp.i(fp.a().d()), 16)).toString();
    }

    private void o()
    {
        SharedPreferences sharedpreferences = fp.a().c().getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0);
        l = sharedpreferences.getBoolean("com.flurry.sdk.previous_successful_report", false);
        m = sharedpreferences.getLong("com.flurry.sdk.initial_run_time", fd.a().c());
    }

    private void p()
    {
        android.content.SharedPreferences.Editor editor = fp.a().c().getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).edit();
        editor.putBoolean("com.flurry.sdk.previous_successful_report", l);
        editor.putLong("com.flurry.sdk.initial_run_time", m);
        editor.commit();
    }

    private int q()
    {
        return g.incrementAndGet();
    }

    private int r()
    {
        return h.incrementAndGet();
    }

    public FlurryEventRecordStatus a(String s1, Map map, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        FlurryEventRecordStatus flurryeventrecordstatus;
        String s2;
        long l1;
        long l2;
        flurryeventrecordstatus = FlurryEventRecordStatus.kFlurryEventRecorded;
        l1 = SystemClock.elapsedRealtime();
        l2 = fd.a().d();
        s2 = hp.b(s1);
        if (s2.length() != 0) goto _L2; else goto _L1
_L1:
        s1 = FlurryEventRecordStatus.kFlurryEventFailed;
_L11:
        this;
        JVM INSTR monitorexit ;
        return s1;
_L2:
        s1 = (ev)u.get(s2);
        if (s1 != null) goto _L4; else goto _L3
_L3:
        if (u.size() >= a) goto _L6; else goto _L5
_L5:
        s1 = new ev();
        s1.a = 1;
        u.put(s2, s1);
        gd.e(f, (new StringBuilder()).append("Event count started: ").append(s2).toString());
        s1 = flurryeventrecordstatus;
_L12:
        if (!n || v.size() >= c || x >= d) goto _L8; else goto _L7
_L7:
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_412;
        }
        s1 = Collections.emptyMap();
_L13:
        if (s1.size() <= b) goto _L10; else goto _L9
_L9:
        gd.e(f, (new StringBuilder()).append("MaxEventParams exceeded: ").append(s1.size()).toString());
        s1 = FlurryEventRecordStatus.kFlurryEventParamsCountExceeded;
          goto _L11
_L6:
        gd.e(f, (new StringBuilder()).append("Too many different events. Event not counted: ").append(s2).toString());
        s1 = FlurryEventRecordStatus.kFlurryEventUniqueCountExceeded;
          goto _L12
_L4:
        s1.a = ((ev) (s1)).a + 1;
        gd.e(f, (new StringBuilder()).append("Event count incremented: ").append(s2).toString());
        s1 = FlurryEventRecordStatus.kFlurryEventRecorded;
          goto _L12
_L10:
label0:
        {
            s1 = new ew(q(), s2, s1, l1 - l2, flag);
            if (s1.d() + x > d)
            {
                break label0;
            }
            v.add(s1);
            int i1 = x;
            x = s1.d() + i1;
            s1 = FlurryEventRecordStatus.kFlurryEventRecorded;
        }
          goto _L11
        x = d;
        w = false;
        gd.e(f, "Event Log size exceeded. No more event details logged.");
        s1 = FlurryEventRecordStatus.kFlurryEventLogCountExceeded;
          goto _L11
_L8:
        w = false;
          goto _L11
        s1;
        throw s1;
        s1 = map;
          goto _L13
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        fz.a().a(C);
        if (fe.a().c())
        {
            fp.a().b(new hq() {

                final fb a;

                public void safeRun()
                {
                    fb.a(a, false);
                }

            
            {
                a = fb.this;
                super();
            }
            });
        }
        hg.a().b("Gender", this);
        hg.a().b("UserId", this);
        hg.a().b("Age", this);
        hg.a().b("LogEvents", this);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(Context context)
    {
        hg hg1 = hg.a();
        n = ((Boolean)hg1.a("LogEvents")).booleanValue();
        hg1.a("LogEvents", this);
        gd.a(4, f, (new StringBuilder()).append("initSettings, LogEvents = ").append(n).toString());
        o = (String)hg1.a("UserId");
        hg1.a("UserId", this);
        gd.a(4, f, (new StringBuilder()).append("initSettings, UserId = ").append(o).toString());
        p = ((Byte)hg1.a("Gender")).byteValue();
        hg1.a("Gender", this);
        gd.a(4, f, (new StringBuilder()).append("initSettings, Gender = ").append(p).toString());
        q = (Long)hg1.a("Age");
        hg1.a("Age", this);
        gd.a(4, f, (new StringBuilder()).append("initSettings, BirthDate = ").append(q).toString());
        j = context.getFileStreamPath(m());
        k = new fw(context.getFileStreamPath(n()), ".yflurryreport.", 1, new ha() {

            final fb a;

            public gx a(int i1)
            {
                return new gw(new ez.a());
            }

            
            {
                a = fb.this;
                super();
            }
        });
        d(context);
        a(true);
        fp.a().b(new hq() {

            final fb a;

            public void safeRun()
            {
                fb.a(a);
            }

            
            {
                a = fb.this;
                super();
            }
        });
        fp.a().b(new hq() {

            final fb a;

            public void safeRun()
            {
                fb.b(a);
            }

            
            {
                a = fb.this;
                super();
            }
        });
        if (fe.a().c())
        {
            fp.a().b(new hq() {

                final fb a;

                public void safeRun()
                {
                    fb.a(a, true);
                }

            
            {
                a = fb.this;
                super();
            }
            });
            return;
        } else
        {
            fz.a().a("com.flurry.android.sdk.IdProviderFinishedEvent", C);
            return;
        }
    }

    public void a(String s1, Object obj)
    {
        byte byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 4: default 48
    //                   -1752163738: 107
    //                   -738063011: 92
    //                   65759: 137
    //                   2129321697: 122;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_137;
_L6:
        switch (byte0)
        {
        default:
            gd.a(6, f, "onSettingUpdate internal error!");
            return;

        case 0: // '\0'
            n = ((Boolean)obj).booleanValue();
            gd.a(4, f, (new StringBuilder()).append("onSettingUpdate, LogEvents = ").append(n).toString());
            return;

        case 1: // '\001'
            o = (String)obj;
            gd.a(4, f, (new StringBuilder()).append("onSettingUpdate, UserId = ").append(o).toString());
            return;

        case 2: // '\002'
            p = ((Byte)obj).byteValue();
            gd.a(4, f, (new StringBuilder()).append("onSettingUpdate, Gender = ").append(p).toString());
            return;

        case 3: // '\003'
            q = (Long)obj;
            break;
        }
        break MISSING_BLOCK_LABEL_283;
_L3:
        if (s1.equals("LogEvents"))
        {
            byte0 = 0;
        }
          goto _L6
_L2:
        if (s1.equals("UserId"))
        {
            byte0 = 1;
        }
          goto _L6
_L5:
        if (s1.equals("Gender"))
        {
            byte0 = 2;
        }
          goto _L6
        if (s1.equals("Age"))
        {
            byte0 = 3;
        }
          goto _L6
        gd.a(4, f, (new StringBuilder()).append("onSettingUpdate, Birthdate = ").append(q).toString());
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
        z = z + 1;
        if (y.size() >= e) goto _L5; else goto _L4
_L4:
        long l1 = System.currentTimeMillis();
        s1 = new eu(r(), Long.valueOf(l1).longValue(), s1, s2, s3, throwable);
        y.add(s1);
        gd.e(f, (new StringBuilder()).append("Error logged: ").append(s1.c()).toString());
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
            break MISSING_BLOCK_LABEL_243;
        }
        i1 = 0;
_L9:
        if (i1 >= y.size()) goto _L8; else goto _L7
_L7:
        eu eu1 = (eu)y.get(i1);
        if (eu1.c() == null || "uncaught".equals(eu1.c()))
        {
            break MISSING_BLOCK_LABEL_234;
        }
        long l2 = System.currentTimeMillis();
        s1 = new eu(r(), Long.valueOf(l2).longValue(), s1, s2, s3, throwable);
        y.set(i1, s1);
          goto _L8
        s1;
        throw s1;
        i1++;
          goto _L9
        gd.e(f, "Max errors logged. No more errors logged.");
          goto _L8
    }

    public void a(String s1, Map map)
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = v.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        ew ew1 = (ew)iterator.next();
        if (!ew1.a(s1)) goto _L4; else goto _L3
_L3:
        long l1;
        long l2;
        l1 = SystemClock.elapsedRealtime();
        l2 = fd.a().d();
        if (map == null) goto _L6; else goto _L5
_L5:
        if (map.size() <= 0 || x >= d) goto _L6; else goto _L7
_L7:
        int i1;
        i1 = x - ew1.d();
        s1 = new HashMap(ew1.c());
        ew1.a(map);
        if (ew1.d() + i1 > d)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        if (ew1.c().size() <= b) goto _L9; else goto _L8
_L8:
        gd.e(f, (new StringBuilder()).append("MaxEventParams exceeded on endEvent: ").append(ew1.c().size()).toString());
        ew1.b(s1);
_L6:
        ew1.a(l1 - l2);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L9:
        x = i1 + ew1.d();
          goto _L6
        s1;
        throw s1;
        ew1.b(s1);
        w = false;
        x = d;
        gd.e(f, "Event Log size exceeded. No more event details logged.");
          goto _L6
    }

    public void b()
    {
        l = true;
    }

    public void b(Context context)
    {
        this;
        JVM INSTR monitorenter ;
    }

    ez c()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = new fa();
        ((fa) (obj)).a(fm.a().e());
        ((fa) (obj)).a(fd.a().c());
        ((fa) (obj)).b(fd.a().e());
        ((fa) (obj)).c(fd.a().g());
        ((fa) (obj)).a(t);
        ((fa) (obj)).b(fg.a().c());
        ((fa) (obj)).c(fg.a().d());
        ((fa) (obj)).a(fd.a().h().a());
        ((fa) (obj)).b(hn.j());
        ((fa) (obj)).d(f());
        ((fa) (obj)).a(fh.a().e());
        ((fa) (obj)).c(j());
        ((fa) (obj)).a(p);
        ((fa) (obj)).a(q);
        ((fa) (obj)).b(i());
        ((fa) (obj)).a(g());
        ((fa) (obj)).a(w);
        ((fa) (obj)).b(h());
        ((fa) (obj)).d(z);
        obj = new ez(((fa) (obj)));
_L2:
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        gd.e(f, "New session report wasn't created");
        this;
        JVM INSTR monitorexit ;
        return ((ez) (obj));
        Object obj1;
        obj1;
        gd.a(5, f, (new StringBuilder()).append("Error creating analytics session report: ").append(obj1).toString());
        obj1 = null;
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        throw obj1;
    }

    public void c(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        a(false);
        a(fd.a().e());
        fp.a().b(new hq() {

            final fb a;

            public void safeRun()
            {
                fb.c(a);
            }

            
            {
                a = fb.this;
                super();
            }
        });
        if (fe.a().c())
        {
            fp.a().b(new hq() {

                final fb a;

                public void safeRun()
                {
                    ez ez1 = a.c();
                    fb.d(a).add(ez1);
                    a.e();
                }

            
            {
                a = fb.this;
                super();
            }
            });
        }
        this;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public void d()
    {
        this;
        JVM INSTR monitorenter ;
        A = A + 1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void e()
    {
        this;
        JVM INSTR monitorenter ;
        gd.a(4, f, "Saving persistent agent data.");
        k.a(r);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    String f()
    {
        if (o == null)
        {
            return "";
        } else
        {
            return o;
        }
    }

    List g()
    {
        return v;
    }

    List h()
    {
        return y;
    }

    Map i()
    {
        return u;
    }

    int j()
    {
        return A;
    }

}
