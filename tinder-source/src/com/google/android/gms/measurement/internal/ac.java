// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.internal.ef;
import com.google.android.gms.internal.eg;
import com.google.android.gms.measurement.AppMeasurementReceiver;
import com.google.android.gms.measurement.AppMeasurementService;
import com.google.android.gms.measurement.a;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            ag, j, z, w, 
//            h, m, u, k, 
//            x, c, b, e, 
//            y, ab, af, AppMetadata, 
//            a, n, EventParcel, EventParams, 
//            o, f, UserAttributeParcel, ae

public class ac
{

    private static ag h;
    private static volatile ac i;
    final Context a;
    final j b = new j(this);
    final ab c;
    final ef d = eg.c();
    final c e;
    int f;
    int g;
    private final z j;
    private final w k;
    private final a l = new a(this);
    private final h m = new h(this);
    private final k n;
    private final x o;
    private final m p;
    private final b q;
    private final com.google.android.gms.measurement.internal.u r;
    private final y s = new y(this);
    private final e t;
    private final boolean u = true;
    private Boolean v;
    private List w;

    private ac(ag ag1)
    {
        com.google.android.gms.common.internal.u.a(ag1);
        a = ag1.a;
        ag1 = new z(this);
        ag1.u();
        j = ag1;
        ag1 = new w(this);
        ag1.u();
        k = ag1;
        ag1 = new m(this);
        ag1.u();
        p = ag1;
        ag1 = new com.google.android.gms.measurement.internal.u(this);
        ag1.u();
        r = ag1;
        ag1 = new k(this);
        ag1.u();
        n = ag1;
        ag1 = new x(this);
        ag1.u();
        o = ag1;
        ag1 = ag.b(this);
        ag1.u();
        e = ag1;
        ag1 = com.google.android.gms.measurement.internal.ag.a(this);
        ag1.u();
        q = ag1;
        ag1 = ag.c(this);
        ag1.u();
        t = ag1;
        ag1 = new ab(this);
        ag1.u();
        c = ag1;
        if (f != g)
        {
            e().a.a("Not all components initialized", Integer.valueOf(f), Integer.valueOf(g));
        }
        c.a(new Runnable() {

            final ac a;

            public final void run()
            {
                a.c();
            }

            
            {
                a = ac.this;
                super();
            }
        });
    }

    public static ac a(Context context)
    {
        com.google.android.gms.common.internal.u.a(context);
        com.google.android.gms.common.internal.u.a(context.getApplicationContext());
        if (i != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/measurement/internal/ac;
        JVM INSTR monitorenter ;
        if (i != null) goto _L4; else goto _L3
_L3:
        if (h == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        context = h;
_L5:
        i = new ac(context);
_L4:
        com/google/android/gms/measurement/internal/ac;
        JVM INSTR monitorexit ;
_L2:
        return i;
        context = new ag(context);
          goto _L5
        context;
        com/google/android/gms/measurement/internal/ac;
        JVM INSTR monitorexit ;
        throw context;
    }

    static void a(ac ac1, int i1, Throwable throwable, byte abyte0[])
    {
        boolean flag;
        flag = false;
        ac1.f().e();
        ac1.a();
        byte abyte1[] = abyte0;
        if (abyte0 == null)
        {
            abyte1 = new byte[0];
        }
        abyte0 = ac1.w;
        ac1.w = null;
        if (i1 != 200 && i1 != 204 || throwable != null)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        ac1.d().c.a(ac1.d.a());
        ac1.d().d.a(0L);
        ac1.l();
        ac1.e().g.a("Successful upload. Got network response. code, size", Integer.valueOf(i1), Integer.valueOf(abyte1.length));
        ac1.h().b();
        for (throwable = abyte0.iterator(); throwable.hasNext(); ac1.h().a(abyte0.longValue()))
        {
            abyte0 = (Long)throwable.next();
        }

        break MISSING_BLOCK_LABEL_167;
        throwable;
        ac1.h().p();
        throw throwable;
        ac1.h().o();
        ac1.h().p();
        if (ac1.i().b() && ac1.p())
        {
            ac1.k();
            return;
        } else
        {
            ac1.l();
            return;
        }
        ac1.e().g.a("Network upload failed. Will retry later. code, error", Integer.valueOf(i1), throwable);
        ac1.d().d.a(ac1.d.a());
        if (i1 == 503)
        {
            flag = true;
        }
        if (flag)
        {
            ac1.d().e.a(ac1.d.a());
        }
        ac1.l();
        return;
    }

    private static void a(ae ae)
    {
        if (ae == null)
        {
            throw new IllegalStateException("Component not created");
        } else
        {
            return;
        }
    }

    static void a(af af1)
    {
        if (af1 == null)
        {
            throw new IllegalStateException("Component not created");
        }
        if (!af1.s())
        {
            throw new IllegalStateException("Component not initialized");
        } else
        {
            return;
        }
    }

    private m m()
    {
        a(p);
        return p;
    }

    private y n()
    {
        if (s == null)
        {
            throw new IllegalStateException("Network broadcast receiver not created");
        } else
        {
            return s;
        }
    }

    private e o()
    {
        a(t);
        return t;
    }

    private boolean p()
    {
        return !TextUtils.isEmpty(h().r());
    }

    final void a()
    {
        if (!u)
        {
            throw new IllegalStateException("AppMeasurement is not initialized");
        } else
        {
            return;
        }
    }

    final void a(AppMetadata appmetadata)
    {
        com.google.android.gms.measurement.internal.a a1;
        String s1;
        boolean flag;
        f().e();
        a();
        com.google.android.gms.common.internal.u.a(appmetadata);
        com.google.android.gms.common.internal.u.a(appmetadata.b);
        a1 = h().c(appmetadata.b);
        s1 = d().o();
        flag = false;
        if (a1 != null) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = appmetadata.b;
        d();
        obj = new com.google.android.gms.measurement.internal.a(((String) (obj)), z.p(), appmetadata.c, s1, 0L, 0L);
        flag = true;
_L4:
        boolean flag1 = flag;
        a1 = ((com.google.android.gms.measurement.internal.a) (obj));
        if (!TextUtils.isEmpty(appmetadata.c))
        {
            flag1 = flag;
            a1 = ((com.google.android.gms.measurement.internal.a) (obj));
            if (!appmetadata.c.equals(((com.google.android.gms.measurement.internal.a) (obj)).c))
            {
                appmetadata = appmetadata.c;
                a1 = new com.google.android.gms.measurement.internal.a(((com.google.android.gms.measurement.internal.a) (obj)).a, ((com.google.android.gms.measurement.internal.a) (obj)).b, appmetadata, ((com.google.android.gms.measurement.internal.a) (obj)).d, ((com.google.android.gms.measurement.internal.a) (obj)).e, ((com.google.android.gms.measurement.internal.a) (obj)).f);
                flag1 = true;
            }
        }
        if (flag1)
        {
            h().a(a1);
        }
        return;
_L2:
        obj = a1;
        if (!s1.equals(a1.d))
        {
            d();
            obj = z.p();
            obj = new com.google.android.gms.measurement.internal.a(a1.a, ((String) (obj)), a1.c, s1, a1.e, a1.f);
            flag = true;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    final void a(EventParcel eventparcel, AppMetadata appmetadata)
    {
        f().e();
        a();
        com.google.android.gms.common.internal.u.a(appmetadata.b);
        if (TextUtils.isEmpty(appmetadata.c))
        {
            return;
        }
        e().g.a("Logging event", eventparcel);
        eventparcel = new n(this, eventparcel.d, appmetadata.b, eventparcel.b, eventparcel.e, eventparcel.c.a());
        h().b();
        Object obj;
        a(appmetadata);
        obj = h().a(appmetadata.b, ((n) (eventparcel)).b);
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = new o(appmetadata.b, ((n) (eventparcel)).b, 1L, 1L, ((n) (eventparcel)).d);
_L18:
        n an[];
        h().a(((o) (obj)));
        an = new n[1];
        an[0] = eventparcel;
        com.google.android.gms.internal.ep.d d1;
        com.google.android.gms.common.internal.u.a(appmetadata);
        com.google.android.gms.common.internal.u.a(an);
        f().e();
        d1 = new com.google.android.gms.internal.ep.d();
        d1.a = Integer.valueOf(1);
        d1.i = "android";
        d1.o = appmetadata.b;
        d1.n = appmetadata.e;
        d1.p = appmetadata.d;
        d1.q = Long.valueOf(appmetadata.f);
        d1.y = appmetadata.c;
        if (appmetadata.g != 0L) goto _L4; else goto _L3
_L3:
        obj = null;
_L9:
        d1.v = ((Long) (obj));
        obj = d().b();
        if (((Pair) (obj)).first != null && ((Pair) (obj)).second != null)
        {
            d1.s = (String)((Pair) (obj)).first;
            d1.t = (Boolean)((Pair) (obj)).second;
        }
        d1.k = m().b();
        d1.j = m().o();
        d1.m = Integer.valueOf((int)m().p());
        d1.l = m().q();
        d1.r = null;
        d1.d = null;
        d1.e = Long.valueOf(an[0].d);
        d1.f = Long.valueOf(an[0].d);
        obj = h().c(appmetadata.b);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_449;
        }
        obj = appmetadata.b;
        d();
        obj = new com.google.android.gms.measurement.internal.a(((String) (obj)), z.p(), appmetadata.c, d().o(), 0L, 0L);
        w w1;
        long l3;
        long l4;
        w1 = e();
        l4 = d1.f.longValue();
        com.google.android.gms.common.internal.u.a(w1);
        l3 = ((com.google.android.gms.measurement.internal.a) (obj)).e + 1L;
        long l1;
        l1 = l3;
        if (l3 <= 0x7fffffffL)
        {
            break MISSING_BLOCK_LABEL_506;
        }
        w1.b.a("Bundle index overflow");
        l1 = 0L;
        com.google.android.gms.measurement.internal.a a1 = new com.google.android.gms.measurement.internal.a(((com.google.android.gms.measurement.internal.a) (obj)).a, ((com.google.android.gms.measurement.internal.a) (obj)).b, ((com.google.android.gms.measurement.internal.a) (obj)).c, ((com.google.android.gms.measurement.internal.a) (obj)).d, l1, l4);
        h().a(a1);
        d1.u = a1.b;
        d1.w = Integer.valueOf((int)a1.e);
        if (((com.google.android.gms.measurement.internal.a) (obj)).f != 0L) goto _L6; else goto _L5
_L5:
        obj = null;
_L10:
        d1.h = ((Long) (obj));
        d1.g = d1.h;
        appmetadata = h().b(appmetadata.b);
        d1.c = new com.google.android.gms.internal.ep.e[appmetadata.size()];
        int i1 = 0;
_L8:
        if (i1 >= appmetadata.size())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = new com.google.android.gms.internal.ep.e();
        d1.c[i1] = ((com.google.android.gms.internal.ep.e) (obj));
        obj.b = ((f)appmetadata.get(i1)).b;
        obj.a = Long.valueOf(((f)appmetadata.get(i1)).c);
        g().a(((com.google.android.gms.internal.ep.e) (obj)), ((f)appmetadata.get(i1)).d);
        i1++;
        if (true) goto _L8; else goto _L7
_L2:
        long l2 = ((o) (obj)).e;
        eventparcel = new n(this, ((n) (eventparcel)).c, ((n) (eventparcel)).a, ((n) (eventparcel)).b, ((n) (eventparcel)).d, l2, ((n) (eventparcel)).f);
        l2 = ((n) (eventparcel)).d;
        obj = new o(((o) (obj)).a, ((o) (obj)).b, ((o) (obj)).c + 1L, ((o) (obj)).d + 1L, l2);
        continue; /* Loop/switch isn't completed */
_L4:
        obj = Long.valueOf(appmetadata.g);
          goto _L9
_L6:
        obj = Long.valueOf(((com.google.android.gms.measurement.internal.a) (obj)).f);
          goto _L10
_L7:
        d1.b = new com.google.android.gms.internal.ep.a[1];
        i1 = 0;
_L16:
        if (i1 > 0) goto _L12; else goto _L11
_L11:
        appmetadata = new com.google.android.gms.internal.ep.a();
        d1.b[i1] = appmetadata;
        appmetadata.b = an[i1].b;
        appmetadata.c = Long.valueOf(an[i1].d);
        appmetadata.a = new com.google.android.gms.internal.ep.b[an[i1].f.b.size()];
        obj = an[i1].f.iterator();
        int j1 = 0;
_L14:
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1 = (String)((Iterator) (obj)).next();
        com.google.android.gms.internal.ep.b b1 = new com.google.android.gms.internal.ep.b();
        ((com.google.android.gms.internal.ep.a) (appmetadata)).a[j1] = b1;
        b1.a = ((String) (obj1));
        obj1 = an[i1].f.b.get(((String) (obj1)));
        g().a(b1, obj1);
        j1++;
        if (true) goto _L14; else goto _L13
_L12:
        d1.x = e().b();
        h().a(d1);
        h().o();
        e().f.a("Event logged", eventparcel);
        h().p();
        l();
        return;
        eventparcel;
        h().p();
        throw eventparcel;
_L13:
        i1++;
        if (true) goto _L16; else goto _L15
_L15:
        if (true) goto _L18; else goto _L17
_L17:
    }

    final void a(UserAttributeParcel userattributeparcel, AppMetadata appmetadata)
    {
        f().e();
        a();
        if (!TextUtils.isEmpty(appmetadata.c)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        g();
        obj = userattributeparcel.b;
        com.google.android.gms.measurement.internal.j.b();
        if (obj == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("user attribute").append(" name is required and can't be null").toString());
        }
        if (((String) (obj)).length() == 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("user attribute").append(" name is required and can't be empty").toString());
        }
        char c1 = ((String) (obj)).charAt(0);
        if (!Character.isLetter(c1) && c1 != '_')
        {
            throw new IllegalArgumentException((new StringBuilder()).append("user attribute").append(" name must start with a letter or _").toString());
        }
        for (int i1 = 1; i1 < ((String) (obj)).length(); i1++)
        {
            char c2 = ((String) (obj)).charAt(i1);
            if (c2 != '_' && !Character.isLetterOrDigit(c2))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("user attribute").append(" name must consist of letters, digits or _ (underscores)").toString());
            }
        }

        if (((String) (obj)).length() > 24)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("user attribute").append(" name is too long. The maximum supported length is 24").toString());
        }
        g();
        obj = userattributeparcel.a();
        obj = com.google.android.gms.measurement.internal.h.a(com.google.android.gms.measurement.internal.j.p(), obj);
        if (obj == null) goto _L1; else goto _L3
_L3:
        userattributeparcel = new f(appmetadata.b, userattributeparcel.b, userattributeparcel.c, obj);
        e().f.a("Setting user attribute", ((f) (userattributeparcel)).b, obj);
        h().b();
        a(appmetadata);
        h().a(userattributeparcel);
        h().o();
        e().f.a("User attribute set", ((f) (userattributeparcel)).b, ((f) (userattributeparcel)).d);
        h().p();
        return;
        userattributeparcel;
        h().p();
        throw userattributeparcel;
    }

    protected final boolean b()
    {
        boolean flag1 = true;
        a();
        f().e();
        if (v == null)
        {
            boolean flag;
            if (g().a() && g().a() && AppMeasurementReceiver.a(a) && AppMeasurementService.a(a))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            v = Boolean.valueOf(flag);
            if (v.booleanValue() && !com.google.android.gms.measurement.internal.j.z())
            {
                if (!TextUtils.isEmpty(j().b()))
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                v = Boolean.valueOf(flag);
            }
        }
        return v.booleanValue();
    }

    protected final void c()
    {
        f().e();
        e().e.a("App measurement is starting up");
        e().f.a("Debug logging enabled");
        if (b()) goto _L2; else goto _L1
_L1:
        if (!g().a())
        {
            e().a.a("App is missing INTERNET permission");
        }
        if (!g().a())
        {
            e().a.a("App is missing ACCESS_NETWORK_STATE permission");
        }
        if (!AppMeasurementReceiver.a(a))
        {
            e().a.a("AppMeasurementReceiver not registered/enabled");
        }
        if (!AppMeasurementService.a(a))
        {
            e().a.a("AppMeasurementService not registered/enabled");
        }
        e().a.a("Uploading is not possible. App measurement disabled");
_L4:
        l();
        return;
_L2:
        if (!com.google.android.gms.measurement.internal.j.z() && !TextUtils.isEmpty(j().b()))
        {
            a(q);
            q.b();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final z d()
    {
        a(j);
        return j;
    }

    public final w e()
    {
        a(k);
        return k;
    }

    public final ab f()
    {
        a(c);
        return c;
    }

    public final h g()
    {
        a(m);
        return m;
    }

    public final k h()
    {
        a(n);
        return n;
    }

    public final x i()
    {
        a(o);
        return o;
    }

    public final com.google.android.gms.measurement.internal.u j()
    {
        a(r);
        return r;
    }

    public final void k()
    {
        boolean flag1;
        flag1 = false;
        f().e();
        a();
        if (com.google.android.gms.measurement.internal.j.z()) goto _L2; else goto _L1
_L1:
        Object obj = d().r();
        if (obj != null) goto _L4; else goto _L3
_L3:
        e().b.a("Upload data called on the client side before use of service was decided");
_L6:
        return;
_L4:
        if (((Boolean) (obj)).booleanValue())
        {
            e().a.a("Upload called in the client side when service should be used");
            return;
        }
_L2:
        f().e();
        boolean flag;
        if (w != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            e().b.a("Uploading requested multiple times");
            return;
        }
        if (!i().b())
        {
            e().b.a("Network not connected, ignoring upload request");
            l();
            return;
        }
        long l1 = d().c.a();
        if (l1 != 0L)
        {
            l1 = Math.abs(d.a() - l1);
            e().f.a("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(l1));
        }
        obj = h().r();
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L6; else goto _L5
_L5:
        Object obj1;
        int i1 = com.google.android.gms.measurement.internal.j.F();
        int k1 = com.google.android.gms.measurement.internal.j.G();
        obj1 = h().a(((String) (obj)), i1, k1);
        if (((List) (obj1)).isEmpty()) goto _L6; else goto _L7
_L7:
        obj = ((List) (obj1)).iterator();
_L11:
        if (!((Iterator) (obj)).hasNext()) goto _L9; else goto _L8
_L8:
        Object obj2 = (com.google.android.gms.internal.ep.d)((Pair)((Iterator) (obj)).next()).first;
        if (TextUtils.isEmpty(((com.google.android.gms.internal.ep.d) (obj2)).s)) goto _L11; else goto _L10
_L10:
        obj = ((com.google.android.gms.internal.ep.d) (obj2)).s;
_L15:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_650;
        }
        int j1 = 0;
        do
        {
            if (j1 >= ((List) (obj1)).size())
            {
                break MISSING_BLOCK_LABEL_650;
            }
            obj2 = (com.google.android.gms.internal.ep.d)((Pair)((List) (obj1)).get(j1)).first;
            long l2;
            if (!TextUtils.isEmpty(((com.google.android.gms.internal.ep.d) (obj2)).s) && !((com.google.android.gms.internal.ep.d) (obj2)).s.equals(obj))
            {
                obj = ((List) (obj1)).subList(0, j1);
                break MISSING_BLOCK_LABEL_352;
            }
            j1++;
        } while (true);
_L13:
        byte abyte0[];
        obj2 = new com.google.android.gms.internal.ep.c();
        obj2.a = new com.google.android.gms.internal.ep.d[((List) (obj)).size()];
        obj1 = new ArrayList(((List) (obj)).size());
        l2 = d.a();
        for (j1 = 0; j1 < ((com.google.android.gms.internal.ep.c) (obj2)).a.length; j1++)
        {
            ((com.google.android.gms.internal.ep.c) (obj2)).a[j1] = (com.google.android.gms.internal.ep.d)((Pair)((List) (obj)).get(j1)).first;
            ((List) (obj1)).add(((Pair)((List) (obj)).get(j1)).second);
            ((com.google.android.gms.internal.ep.c) (obj2)).a[j1].r = Long.valueOf(com.google.android.gms.measurement.internal.j.y());
            ((com.google.android.gms.internal.ep.c) (obj2)).a[j1].d = Long.valueOf(l2);
            ((com.google.android.gms.internal.ep.c) (obj2)).a[j1].z = Boolean.valueOf(com.google.android.gms.measurement.internal.j.z());
        }

        abyte0 = g().a(((com.google.android.gms.internal.ep.c) (obj2)));
        obj = com.google.android.gms.measurement.internal.j.H();
        URL url = new URL(((String) (obj)));
        if (!((List) (obj1)).isEmpty())
        {
            flag1 = true;
        }
        com.google.android.gms.common.internal.u.b(flag1);
        if (w == null)
        {
            break MISSING_BLOCK_LABEL_635;
        }
        e().a.a("Set uploading progress before finishing the previous upload");
_L12:
        d().d.a(d.a());
        i().a(url, abyte0, new x.a() {

            final ac a;

            public final void a(int i2, Throwable throwable, byte abyte1[])
            {
                com.google.android.gms.measurement.internal.ac.a(a, i2, throwable, abyte1);
            }

            
            {
                a = ac.this;
                super();
            }
        });
        return;
        try
        {
            w = new ArrayList(((java.util.Collection) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            e().a.a("Failed to parse upload URL. Not uploading", obj);
            return;
        }
          goto _L12
        obj = obj1;
        if (true) goto _L13; else goto _L9
_L9:
        obj = null;
        if (true) goto _L15; else goto _L14
_L14:
    }

    final void l()
    {
        long l1;
        long l2;
        long l4;
        long l6;
        long l8;
        long l9;
        f().e();
        a();
        if (!b() || !p())
        {
            n().a();
            o().b();
            return;
        }
        l8 = d.a();
        l2 = com.google.android.gms.measurement.internal.j.K();
        l1 = com.google.android.gms.measurement.internal.j.J();
        l6 = d().c.a();
        l4 = d().d.a();
        l9 = h().a("select max(bundle_end_timestamp) from queue");
        if (l9 != 0L) goto _L2; else goto _L1
_L1:
        l1 = 0L;
_L4:
        if (l1 == 0L)
        {
            n().a();
            o().b();
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        l8 -= Math.abs(l9 - l8);
        l2 = l8 + l2;
        if (!g().a(l6, l1))
        {
            l2 = l6 + l1;
        }
        l1 = l2;
        if (l4 == 0L)
        {
            continue; /* Loop/switch isn't completed */
        }
        l1 = l2;
        if (l4 < l8)
        {
            continue; /* Loop/switch isn't completed */
        }
        for (int i1 = 0; i1 < com.google.android.gms.measurement.internal.j.M(); i1++)
        {
            l2 += (long)(1 << i1) * com.google.android.gms.measurement.internal.j.L();
            l1 = l2;
            if (l2 > l4)
            {
                continue; /* Loop/switch isn't completed */
            }
        }

        l1 = 0L;
        if (true) goto _L4; else goto _L3
_L3:
        if (!i().b())
        {
            y y1 = n();
            y1.b.a();
            y1.b.f().e();
            if (!y1.c)
            {
                y1.b.a.registerReceiver(y1, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                y1.d = y1.b.i().b();
                y1.b.e().g.a("Registering connectivity change receiver. Network connected", Boolean.valueOf(y1.d));
                y1.c = true;
            }
            o().b();
            return;
        }
        long l5 = d().e.a();
        long l7 = com.google.android.gms.measurement.internal.j.I();
        long l3 = l1;
        if (!g().a(l5, l7))
        {
            l3 = Math.max(l1, l5 + l7);
        }
        n().a();
        l1 = l3 - d.a();
        if (l1 <= 0L)
        {
            o().a(1L);
            return;
        } else
        {
            e().g.a("Upload scheduled in approximately ms", Long.valueOf(l1));
            o().a(l1);
            return;
        }
    }
}
