// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.SystemClock;
import com.flurry.android.impl.analytics.FlurryAnalyticsModule;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.flurry.sdk:
//            cy, eo, dc, cx, 
//            fd, dk, fe, db, 
//            dn, dd, dp, dq, 
//            dr, dm, eb, ep, 
//            do, da, dz, di, 
//            dh, ff, dw, dy, 
//            ea, dl

public class dj
    implements dm.b, dq.a
{

    static int a = 100;
    static int b = 10;
    static int c = 1000;
    static int d = 0x27100;
    static int e = 50;
    static int f = 20;
    private static final String g = com/flurry/sdk/dj.getSimpleName();
    private String A;
    private String B;
    private byte C;
    private Location D;
    private boolean E;
    private String F;
    private byte G;
    private long H;
    private long I;
    private final Map J = new HashMap();
    private final List K = new ArrayList();
    private boolean L;
    private int M;
    private final List N = new ArrayList();
    private int O;
    private int P;
    private final cy Q = new cy();
    private Map R;
    private dm S;
    private int T;
    private boolean U;
    private final AtomicInteger h = new AtomicInteger(0);
    private final AtomicInteger i = new AtomicInteger(0);
    private final AtomicInteger j = new AtomicInteger(0);
    private final String k;
    private String l;
    private WeakReference m;
    private File n;
    private List o;
    private final Map p = new HashMap();
    private boolean q;
    private long r;
    private List s;
    private com.google.android.gms.ads.a.a.a t;
    private byte u[];
    private String v;
    private long w;
    private long x;
    private long y;
    private long z;

    public dj(String s1)
    {
        n = null;
        s = new ArrayList();
        A = "";
        B = "";
        C = -1;
        U = false;
        eo.a(4, g, "Creating new Flurry session");
        k = s1;
        m = new WeakReference(null);
    }

    private void A()
    {
        eo.a(3, g, "generating agent report");
        dc dc1 = new dc(k, l, q, o(), r, w, s, p(), Q.a(false), a(), cx.a().b(), System.currentTimeMillis());
        o = new ArrayList(s);
        if (dc1.a() != null)
        {
            eo.a(3, g, (new StringBuilder("generated report of size ")).append(dc1.a().length).append(" with ").append(s.size()).append(" reports.").toString());
            a(dc1.a());
            s.removeAll(o);
            o = null;
            B();
            return;
        }
        try
        {
            eo.d(g, "Error generating report");
            return;
        }
        catch (Throwable throwable)
        {
            eo.a(6, g, "", throwable);
        }
        return;
    }

    private void B()
    {
        this;
        JVM INSTR monitorenter ;
        if (fd.a(n)) goto _L2; else goto _L1
_L1:
        eo.d(g, "Error persisting report: could not create directory");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        DataOutputStream dataoutputstream = new DataOutputStream(new FileOutputStream(n));
        dk dk1 = new dk();
        dk1.a(q);
        dk1.a(r);
        dk1.a(s);
        dk1.a(dataoutputstream, k, i());
        continue; /* Loop/switch isn't completed */
        Object obj;
        obj;
        eo.b(g, "Error saving persistent data", ((Throwable) (obj)));
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        throw obj;
    }

    private void C()
    {
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        boolean flag2;
        eo.a(4, g, (new StringBuilder("Loading persistent data: ")).append(n.getAbsolutePath()).toString());
        flag2 = n.exists();
        if (!flag2) goto _L2; else goto _L1
_L1:
        Object obj1 = new FileInputStream(n);
        DataInputStream datainputstream = new DataInputStream(((java.io.InputStream) (obj1)));
        obj = new dk();
        ((dk) (obj)).a(datainputstream, k);
        q = ((dk) (obj)).a();
        r = ((dk) (obj)).c();
        s = ((dk) (obj)).b();
        boolean flag = true;
        fe.a(datainputstream);
        fe.a(((java.io.Closeable) (obj1)));
_L3:
        boolean flag1;
        flag1 = flag;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        eo.a(3, g, "Deleting agent cache file");
        n.delete();
        flag1 = flag;
_L4:
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        q = false;
        r = w;
        this;
        JVM INSTR monitorexit ;
        return;
        obj1;
        datainputstream = null;
_L6:
        eo.b(g, "Error loading persistent data", ((Throwable) (obj1)));
        fe.a(datainputstream);
        fe.a(((java.io.Closeable) (obj)));
        flag = false;
          goto _L3
_L5:
        fe.a(datainputstream);
        fe.a(((java.io.Closeable) (obj1)));
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        eo.a(4, g, "Agent cache file doesn't exist.");
        flag1 = false;
          goto _L4
        obj;
        datainputstream = null;
          goto _L5
        obj;
          goto _L5
        Object obj2;
        obj2;
        obj1 = obj;
        obj = obj2;
          goto _L5
        obj2;
        datainputstream = null;
        obj = obj1;
        obj1 = obj2;
          goto _L6
        obj2;
        obj = obj1;
        obj1 = obj2;
          goto _L6
        obj;
        datainputstream = null;
        obj1 = null;
          goto _L5
    }

    private void D()
    {
        T = T + 1;
    }

    private void E()
    {
        if (T > 0)
        {
            T = T - 1;
        }
    }

    private String F()
    {
        return (new StringBuilder(".flurryagent.")).append(Integer.toString(k.hashCode(), 16)).toString();
    }

    private int G()
    {
        return h.incrementAndGet();
    }

    private int H()
    {
        return i.incrementAndGet();
    }

    static com.google.android.gms.ads.a.a.a a(dj dj1, com.google.android.gms.ads.a.a.a a1)
    {
        dj1.t = a1;
        return a1;
    }

    static String a(dj dj1, String s1)
    {
        dj1.v = s1;
        return s1;
    }

    private void a(long l1)
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = K.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            db db1 = (db)iterator.next();
            if (db1.a() && !db1.b())
            {
                db1.a(l1);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_62;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    static void a(dj dj1)
    {
        dj1.C();
    }

    private void a(dr dr1, ByteBuffer bytebuffer)
    {
        synchronized (p)
        {
            p.put(dr1, bytebuffer);
        }
        return;
        dr1;
        map;
        JVM INSTR monitorexit ;
        throw dr1;
    }

    private void a(byte abyte0[])
    {
        dd dd1 = FlurryAnalyticsModule.getInstance().a();
        String s1 = (new StringBuilder()).append(dn.a().b()).toString();
        dd1.b(abyte0, k, s1);
    }

    static byte[] a(dj dj1, byte abyte0[])
    {
        dj1.u = abyte0;
        return abyte0;
    }

    static void b(dj dj1)
    {
        dj1.v();
    }

    static List c(dj dj1)
    {
        return dj1.s;
    }

    private Map d(Context context)
    {
        Object obj = null;
        HashMap hashmap = obj;
        if (context instanceof Activity)
        {
            Bundle bundle = ((Activity)context).getIntent().getExtras();
            hashmap = obj;
            if (bundle != null)
            {
                eo.a(3, g, (new StringBuilder("Launch Options Bundle is present ")).append(bundle.toString()).toString());
                hashmap = new HashMap();
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
                        hashmap.put(s1, new ArrayList(Arrays.asList(new String[] {
                            context
                        })));
                        eo.a(3, g, (new StringBuilder("Launch options Key: ")).append(s1).append(". Its value: ").append(context).toString());
                    }
                } while (true);
            }
        }
        return hashmap;
    }

    static void d(dj dj1)
    {
        dj1.B();
    }

    static void e(dj dj1)
    {
        dj1.y();
    }

    private void u()
    {
        dq dq1 = dp.a();
        G = ((Byte)dq1.a("Gender")).byteValue();
        dq1.a("Gender", this);
        eo.a(4, g, (new StringBuilder("initSettings, Gender = ")).append(G).toString());
        F = (String)dq1.a("UserId");
        dq1.a("UserId", this);
        eo.a(4, g, (new StringBuilder("initSettings, UserId = ")).append(F).toString());
        E = ((Boolean)dq1.a("LogEvents")).booleanValue();
        dq1.a("LogEvents", this);
        eo.a(4, g, (new StringBuilder("initSettings, LogEvents = ")).append(E).toString());
        H = ((Long)dq1.a("Age")).longValue();
        dq1.a("Age", this);
        eo.a(4, g, (new StringBuilder("initSettings, BirthDate = ")).append(H).toString());
        I = ((Long)dq1.a("ContinueSessionMillis")).longValue();
        dq1.a("ContinueSessionMillis", this);
        eo.a(4, g, (new StringBuilder("initSettings, ContinueSessionMillis = ")).append(I).toString());
    }

    private void v()
    {
        try
        {
            if (v != null)
            {
                eo.a(3, g, "Fetched phone id");
                a(dr.a, ByteBuffer.wrap(v.getBytes()));
            }
            if (u != null)
            {
                eo.a(3, g, "Fetched hashed IMEI");
                a(dr.b, ByteBuffer.wrap(u));
            }
            if (t != null)
            {
                eo.a(3, g, "Fetched advertising id");
                a(dr.c, ByteBuffer.wrap(t.a().getBytes()));
            }
            A();
            return;
        }
        catch (Throwable throwable)
        {
            eo.a(6, g, "", throwable);
        }
    }

    private void w()
    {
        a(new ff() {

            final dj a;

            public void a()
            {
                dh dh1 = a.d();
                dj.c(a).clear();
                dj.c(a).add(dh1);
                dj.d(a);
            }

            
            {
                a = dj.this;
                super();
            }
        });
    }

    private void x()
    {
        a(new ff() {

            final dj a;

            public void a()
            {
                dj.e(a);
            }

            
            {
                a = dj.this;
                super();
            }
        });
    }

    private void y()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (s.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        A();
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (Throwable throwable)
        {
            eo.a(6, g, "", throwable);
        }
        return;
    }

    private void z()
    {
        a(new ff() {

            final dj a;

            public void a()
            {
                dz.a().d();
            }

            
            {
                a = dj.this;
                super();
            }
        });
    }

    Map a()
    {
        return R;
    }

    public void a(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        eo.a(4, g, (new StringBuilder("Initializing new Flurry session with context:")).append(context).toString());
        m = new WeakReference(context);
        S = new dm(this);
        n = context.getFileStreamPath(F());
        l = eb.a();
        y = -1L;
        O = 0;
        B = TimeZone.getDefault().getID();
        A = (new StringBuilder()).append(Locale.getDefault().getLanguage()).append("_").append(Locale.getDefault().getCountry()).toString();
        L = true;
        M = 0;
        P = 0;
        R = d(context);
        u();
        long l1 = SystemClock.elapsedRealtime();
        w = System.currentTimeMillis();
        x = l1;
        a(((ff) (new ff() {

            final dj a;

            public void a()
            {
                dj.a(a, dw.a());
            }

            
            {
                a = dj.this;
                super();
            }
        })));
        a(((ff) (new ff() {

            final dj a;

            public void a()
            {
                dj.a(a, dy.a());
            }

            
            {
                a = dj.this;
                super();
            }
        })));
        a(((ff) (new ff() {

            final dj a;

            public void a()
            {
                dj.a(a, ea.a());
            }

            
            {
                a = dj.this;
                super();
            }
        })));
        a(((ff) (new ff() {

            final dj a;

            public void a()
            {
                dj.a(a);
            }

            
            {
                a = dj.this;
                super();
            }
        })));
        a(((ff) (new ff() {

            final dj a;

            public void a()
            {
                dj.b(a);
            }

            
            {
                a = dj.this;
                super();
            }
        })));
        ep.a().a(this, context);
        U = true;
        this;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public void a(ff ff)
    {
        com.flurry.sdk.do.a().c(ff);
    }

    public void a(String s1, Object obj)
    {
        if (s1.equals("Gender"))
        {
            G = ((Byte)obj).byteValue();
            eo.a(4, g, (new StringBuilder("onSettingUpdate, Gender = ")).append(G).toString());
            return;
        }
        if (s1.equals("UserId"))
        {
            F = (String)obj;
            eo.a(4, g, (new StringBuilder("onSettingUpdate, UserId = ")).append(F).toString());
            return;
        }
        if (s1.equals("LogEvents"))
        {
            E = ((Boolean)obj).booleanValue();
            eo.a(4, g, (new StringBuilder("onSettingUpdate, LogEvents = ")).append(E).toString());
            return;
        }
        if (s1.equals("Age"))
        {
            H = ((Long)obj).longValue();
            eo.a(4, g, (new StringBuilder("onSettingUpdate, Birthdate = ")).append(H).toString());
            return;
        }
        if (s1.equals("ContinueSessionMillis"))
        {
            I = ((Long)obj).longValue();
            eo.a(4, g, (new StringBuilder("onSettingUpdate, ContinueSessionMillis = ")).append(I).toString());
            return;
        } else
        {
            eo.a(6, g, "onSettingUpdate internal error!");
            return;
        }
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
        O = O + 1;
        if (N.size() >= e) goto _L5; else goto _L4
_L4:
        long l1 = System.currentTimeMillis();
        s1 = new da(H(), Long.valueOf(l1).longValue(), s1, s2, s3, throwable);
        N.add(s1);
        eo.d(g, (new StringBuilder("Error logged: ")).append(s1.c()).toString());
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
        if (i1 >= N.size()) goto _L8; else goto _L7
_L7:
        da da1 = (da)N.get(i1);
        if (da1.c() == null || "uncaught".equals(da1.c()))
        {
            break MISSING_BLOCK_LABEL_231;
        }
        long l2 = System.currentTimeMillis();
        s1 = new da(H(), Long.valueOf(l2).longValue(), s1, s2, s3, throwable);
        N.set(i1, s1);
          goto _L8
        s1;
        throw s1;
        i1++;
          goto _L9
        eo.d(g, "Max errors logged. No more errors logged.");
          goto _L8
    }

    public void a(String s1, Map map)
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = K.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        db db1 = (db)iterator.next();
        if (!db1.a(s1)) goto _L4; else goto _L3
_L3:
        long l1;
        long l2;
        l1 = SystemClock.elapsedRealtime();
        l2 = x;
        if (map == null) goto _L6; else goto _L5
_L5:
        if (map.size() <= 0 || M >= d) goto _L6; else goto _L7
_L7:
        int i1;
        i1 = M - db1.d();
        s1 = new HashMap(db1.c());
        db1.a(map);
        if (db1.d() + i1 > d)
        {
            break MISSING_BLOCK_LABEL_199;
        }
        if (db1.c().size() <= b) goto _L9; else goto _L8
_L8:
        eo.d(g, (new StringBuilder("MaxEventParams exceeded on endEvent: ")).append(db1.c().size()).toString());
        db1.b(s1);
_L6:
        db1.a(l1 - l2);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L9:
        M = i1 + db1.d();
          goto _L6
        s1;
        throw s1;
        db1.b(s1);
        L = false;
        M = d;
        eo.d(g, "Event Log size exceeded. No more event details logged.");
          goto _L6
    }

    public void a(String s1, Map map, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        String s2;
        int i1;
        long l1;
        long l2;
        l1 = SystemClock.elapsedRealtime();
        l2 = x;
        s2 = fe.a(s1);
        i1 = s2.length();
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        s1 = (cx.a)J.get(s2);
        if (s1 != null) goto _L4; else goto _L3
_L3:
        if (J.size() >= a) goto _L6; else goto _L5
_L5:
        s1 = new cx.a();
        s1.a = 1;
        J.put(s2, s1);
        eo.d(g, (new StringBuilder("Event count started: ")).append(s2).toString());
_L11:
        if (!E || K.size() >= c || M >= d) goto _L8; else goto _L7
_L7:
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_369;
        }
        s1 = Collections.emptyMap();
_L12:
        if (s1.size() <= b) goto _L10; else goto _L9
_L9:
        eo.d(g, (new StringBuilder("MaxEventParams exceeded: ")).append(s1.size()).toString());
          goto _L1
        s1;
        throw s1;
_L6:
        eo.d(g, (new StringBuilder("Too many different events. Event not counted: ")).append(s2).toString());
          goto _L11
_L4:
        s1.a = ((cx.a) (s1)).a + 1;
        eo.d(g, (new StringBuilder("Event count incremented: ")).append(s2).toString());
          goto _L11
_L10:
label0:
        {
            s1 = new db(G(), s2, s1, l1 - l2, flag);
            if (s1.d() + M > d)
            {
                break label0;
            }
            K.add(s1);
            int j1 = M;
            M = s1.d() + j1;
        }
          goto _L1
        M = d;
        L = false;
        eo.d(g, "Event Log size exceeded. No more event details logged.");
          goto _L1
_L8:
        L = false;
          goto _L1
        s1 = map;
          goto _L12
    }

    public void b()
    {
        q = true;
    }

    public void b(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = U;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        eo.d(g, (new StringBuilder("Start session with context: ")).append(context).append(" count:").append(g()).toString());
        m = new WeakReference(context);
        if (S.b())
        {
            S.a();
        }
        D();
        dz.a().c();
        D = dz.a().f();
        ep.a().b(this, context);
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = U;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        eo.d(g, "Finalize session");
        if (S.b())
        {
            S.a();
        }
        if (g() != 0)
        {
            eo.a(6, g, (new StringBuilder("Session with apiKey = ")).append(j()).append(" was ended while getSessionCount() is not 0").toString());
        }
        T = 0;
        x();
        ep.a().a(this);
        a(new ff() {

            final dj a;

            public void a()
            {
                dl.a().a(a.j());
            }

            
            {
                a = dj.this;
                super();
            }
        });
        dp.a().b("Gender", this);
        dp.a().b("UserId", this);
        dp.a().b("Age", this);
        dp.a().b("LogEvents", this);
        dp.a().b("ContinueSessionMillis", this);
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void c(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = U;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ep.a().c(this, context);
        D = dz.a().f();
        z();
        E();
        eo.d(g, (new StringBuilder("End session with context: ")).append(context).append(" count:").append(g()).toString());
        y = SystemClock.elapsedRealtime() - x;
        a(y);
        w();
        if (g() == 0)
        {
            S.a(I);
        }
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    dh d()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = new di();
        ((di) (obj)).a(l);
        ((di) (obj)).a(w);
        ((di) (obj)).b(y);
        ((di) (obj)).c(z);
        ((di) (obj)).b(k());
        ((di) (obj)).c(l());
        ((di) (obj)).a(C);
        ((di) (obj)).d(h());
        ((di) (obj)).a(D);
        ((di) (obj)).b(f());
        ((di) (obj)).a(G);
        ((di) (obj)).a(Long.valueOf(H));
        ((di) (obj)).a(t());
        ((di) (obj)).a(r());
        ((di) (obj)).a(L);
        ((di) (obj)).b(s());
        ((di) (obj)).c(O);
        obj = new dh(((di) (obj)));
_L2:
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        eo.d(g, "New session report wasn't created");
        this;
        JVM INSTR monitorexit ;
        return ((dh) (obj));
        Object obj1;
        obj1;
        ((IOException) (obj1)).printStackTrace();
        obj1 = null;
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        throw obj1;
    }

    public void e()
    {
        this;
        JVM INSTR monitorenter ;
        P = P + 1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    int f()
    {
        return P;
    }

    int g()
    {
        return T;
    }

    String h()
    {
        if (F == null)
        {
            return "";
        } else
        {
            return F;
        }
    }

    public String i()
    {
        return v;
    }

    public String j()
    {
        return k;
    }

    public String k()
    {
        return A;
    }

    public String l()
    {
        return B;
    }

    public long m()
    {
        return w;
    }

    public long n()
    {
        return x;
    }

    public boolean o()
    {
        return t == null || !t.b();
    }

    public Map p()
    {
        return new HashMap(p);
    }

    public void q()
    {
        c();
    }

    List r()
    {
        return K;
    }

    List s()
    {
        return N;
    }

    Map t()
    {
        return J;
    }

}
