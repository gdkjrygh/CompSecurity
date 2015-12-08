// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.comscore.analytics.ApplicationState;
import com.comscore.analytics.SessionState;
import com.comscore.applications.EventType;
import com.comscore.utils.DispatchQueue;
import com.comscore.utils.TransmissionMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public final class aif
{

    protected Timer A;
    public String B;
    public Context C;
    public HashMap D;
    HashMap E;
    public boolean F;
    public long G;
    Thread.UncaughtExceptionHandler H;
    public boolean I;
    public TransmissionMode J;
    public TransmissionMode K;
    public String L[];
    public akg M;
    public boolean N;
    private Timer O;
    private long P;
    private boolean Q;
    private String R;
    private long S;
    private long T;
    private long U;
    private long V;
    private long W;
    private long X;
    private long Y;
    private long Z;
    public aju a;
    private long aa;
    private long ab;
    private int ac;
    private int ad;
    private long ae;
    private long af;
    private long ag;
    private int ah;
    private long ai;
    private long aj;
    private String ak;
    public ajx b;
    public aje c;
    ajo d;
    public aki e;
    public ajh f;
    ajq g;
    protected Timer h;
    protected TimerTask i;
    boolean j;
    boolean k;
    public AtomicInteger l;
    public long m;
    public AtomicInteger n;
    public long o;
    public long p;
    public String q;
    boolean r;
    protected ApplicationState s;
    protected AtomicInteger t;
    protected AtomicInteger u;
    AtomicInteger v;
    public long w;
    public long x;
    protected SessionState y;
    protected int z;

    public aif()
    {
        j = true;
        Q = true;
        k = false;
        r = true;
        s = ApplicationState.a;
        y = SessionState.a;
        G = 0L;
        N = true;
        n = new AtomicInteger(0);
        l = new AtomicInteger();
        v = new AtomicInteger(0);
        t = new AtomicInteger(0);
        u = new AtomicInteger(0);
        H = Thread.getDefaultUncaughtExceptionHandler();
        F = true;
        D = new HashMap();
        E = new HashMap();
        u();
    }

    private void a(String s1, String s2)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(s2);
        a(s1, arraylist);
    }

    private void a(String s1, ArrayList arraylist)
    {
        arraylist = arraylist.iterator();
        do
        {
            if (!arraylist.hasNext())
            {
                break;
            }
            String s2 = (String)arraylist.next();
            String s3 = b.b(s1);
            String s4 = b.b(s2);
            if (ajy.f(s3) && ajy.g(s4))
            {
                b.a(s2, s3);
            }
        } while (true);
        b.c(s1);
    }

    private void b(String s1, String s2)
    {
        if (!N)
        {
            return;
        } else
        {
            c(s1, s2);
            return;
        }
    }

    private void c(String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = N;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        D.put(s1, s2);
        if (true) goto _L1; else goto _L3
_L3:
        s1;
        throw s1;
    }

    private void p(boolean flag)
    {
        if (N) goto _L2; else goto _L1
_L1:
        return;
_L2:
        long l1;
        long l2;
        l1 = System.currentTimeMillis();
        l2 = l1 - Y;
        aiu.a[s.ordinal()];
        JVM INSTR tableswitch 1 3: default 56
    //                   1 248
    //                   2 223
    //                   3 198;
           goto _L3 _L4 _L5 _L6
_L4:
        break MISSING_BLOCK_LABEL_248;
_L3:
        break; /* Loop/switch isn't completed */
_L6:
        break; /* Loop/switch isn't completed */
_L8:
        Y = l1;
        if (flag)
        {
            b.a("lastApplicationAccumulationTimestamp", Long.toString(Y));
            b.a("foregroundTransitionsCount", Long.toString(v.get()));
            b.a("accumulatedForegroundTime", Long.toString(W));
            b.a("accumulatedBackgroundTime", Long.toString(V));
            b.a("accumulatedInactiveTime", Long.toString(X));
            b.a("totalForegroundTime", Long.toString(S));
            b.a("totalBackgroundTime", Long.toString(T));
            b.a("totalInactiveTime", Long.toString(U));
            return;
        }
        if (true) goto _L1; else goto _L7
_L7:
        W = W + l2;
        S = l2 + S;
          goto _L8
_L5:
        V = V + l2;
        T = l2 + T;
          goto _L8
        X = X + l2;
        U = l2 + U;
          goto _L8
    }

    private void q(boolean flag)
    {
        if (N) goto _L2; else goto _L1
_L1:
        return;
_L2:
        long l1;
        long l2;
        l1 = System.currentTimeMillis();
        l2 = l1 - aj;
        aiu.b[y.ordinal()];
        JVM INSTR tableswitch 1 3: default 56
    //                   1 306
    //                   2 322
    //                   3 338;
           goto _L3 _L4 _L5 _L6
_L3:
        aj = l1;
        if (flag)
        {
            b.a("lastSessionAccumulationTimestamp", Long.toString(aj));
            b.a("lastApplicationSessionTimestamp", Long.toString(ae));
            b.a("lastUserSessionTimestamp", Long.toString(af));
            b.a("lastActiveUserSessionTimestamp", Long.toString(ag));
            b.a("accumulatedApplicationSessionTime", Long.toString(Z));
            b.a("accumulatedActiveUserSessionTime", Long.toString(ab));
            b.a("accumulatedUserSessionTime", Long.toString(aa));
            b.a("activeUserSessionCount", Long.toString(ad));
            b.a("userSessionCount", Long.toString(z));
            b.a("lastUserInteractionTimestamp", Long.toString(ai));
            b.a("userInteractionCount", Integer.toString(ah));
            b.a("previousGenesis", Long.toString(x));
            b.a("genesis", Long.toString(w));
            b.a("applicationSessionCountKey", Integer.toString(ac));
            return;
        }
          goto _L7
_L4:
        ab = ab + l2;
        ag = l1;
_L5:
        aa = aa + l2;
        af = l1;
_L6:
        Z = l2 + Z;
        ae = l1;
        if (true) goto _L3; else goto _L7
_L7:
        if (true) goto _L1; else goto _L8
_L8:
    }

    private void u()
    {
        this;
        JVM INSTR monitorenter ;
        J = TransmissionMode.a;
        K = TransmissionMode.a;
        I = false;
        L = ajr.c;
        s = ApplicationState.a;
        y = SessionState.a;
        k = false;
        l.set(0);
        m = -1L;
        n.set(0);
        p = -1L;
        o = -1L;
        q = null;
        R = null;
        t.set(0);
        u.set(0);
        S = 0L;
        T = 0L;
        U = 0L;
        V = 0L;
        W = 0L;
        X = 0L;
        Z = 0L;
        ab = 0L;
        aa = 0L;
        w = -1L;
        x = 0L;
        ad = -1;
        z = -1;
        ah = 0;
        ai = -1L;
        Y = -1L;
        aj = -1L;
        ae = -1L;
        af = -1L;
        ag = -1L;
        o = -1L;
        p = -1L;
        x();
        if (h != null)
        {
            h.cancel();
            i = null;
            h = null;
        }
        if (A != null)
        {
            A.cancel();
            A = null;
        }
        if (c != null)
        {
            c.b();
        }
        if (d != null)
        {
            d.c();
        }
        if (e != null)
        {
            e.b.clear();
        }
        if (b == null) goto _L2; else goto _L1
_L1:
        ajx ajx1 = b;
        Object obj = ajx1.e;
        obj;
        JVM INSTR monitorenter ;
        ajx1.g = false;
_L3:
        long l1 = ajx1.f;
        Exception exception1;
label0:
        {
            if (l1 < 0L)
            {
                break label0;
            }
            try
            {
                ajx1.e.wait(100L);
            }
            catch (InterruptedException interruptedexception) { }
            finally { }
        }
          goto _L3
        obj;
        JVM INSTR monitorexit ;
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private String v()
    {
        String s1 = C.getPackageName();
        try
        {
            s1 = C.getPackageManager().getPackageInfo(s1, 0).versionName;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return "0";
        }
        return s1;
    }

    private boolean w()
    {
        boolean flag = false;
        if (!N)
        {
            return false;
        }
        long l1 = System.currentTimeMillis();
        if (l1 - ae > 0x1b7740L)
        {
            x = w;
            w = l1;
            ac = ac + 1;
            flag = true;
        }
        ae = l1;
        return flag;
    }

    private void x()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = N;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        r();
        j = true;
        P = -1L;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final int a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = v.get();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        if (N)
        {
            v.set(0);
            b.a("foregroundTransitionsCount", Long.toString(v.get()));
        }
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    final String a(String s1, Properties properties, boolean flag)
    {
        properties = properties.getProperty(s1);
        if (properties != null)
        {
            b.a(s1, properties);
            return properties;
        }
        if (flag && b.a(s1).booleanValue())
        {
            return b.b(s1);
        } else
        {
            return null;
        }
    }

    protected final void a()
    {
        b = new ajx(C);
        f = new ajh(this);
        Object obj = new ArrayList();
        ((ArrayList) (obj)).add("lastApplicationAccumulationTimestamp");
        ((ArrayList) (obj)).add("lastSessionAccumulationTimestamp");
        a("lastActivityTime", ((ArrayList) (obj)));
        a("ns_ap_fg", "foregroundTransitionsCount");
        a("installTime", "installId");
        a("ns_ap_ver", "previousVersion");
        obj = f;
        if (((ajh) (obj)).a.N)
        {
            ajx ajx1 = ((ajh) (obj)).a.b;
            long l2;
            long l3;
            if (ajx1.a("q_dcc").booleanValue() && ajx1.a("q_dcf").booleanValue())
            {
                try
                {
                    int i1 = Integer.parseInt(ajx1.b("q_dcc"), 10);
                    long l1 = Long.parseLong(ajx1.b("q_dcf"), 10);
                    if (System.currentTimeMillis() >= l1)
                    {
                        ((ajh) (obj)).c.set(i1);
                        ((ajh) (obj)).b.set(l1);
                    }
                }
                catch (NumberFormatException numberformatexception)
                {
                    if (ajr.a)
                    {
                        ajn.b(obj, "Unexpected error parsing storage data: ");
                        ajn.a(numberformatexception);
                        throw numberformatexception;
                    }
                }
            }
        }
        new DispatchQueue(this);
        c = new aje(this);
        a = new aju(this);
        d = new ajo(this);
        g = new ajq(this);
        Y = ajy.a(b.b("lastApplicationAccumulationTimestamp"), -1L);
        aj = ajy.a(b.b("lastSessionAccumulationTimestamp"), -1L);
        ae = ajy.a(b.b("lastApplicationSessionTimestamp"), -1L);
        af = ajy.a(b.b("lastUserSessionTimestamp"), -1L);
        ag = ajy.a(b.b("lastActiveUserSessionTimestamp"), -1L);
        v.set(ajy.d(b.b("foregroundTransitionsCount")));
        W = ajy.c(b.b("accumulatedForegroundTime"));
        V = ajy.c(b.b("accumulatedBackgroundTime"));
        X = ajy.c(b.b("accumulatedInactiveTime"));
        S = ajy.c(b.b("totalForegroundTime"));
        T = ajy.c(b.b("totalBackgroundTime"));
        U = ajy.c(b.b("totalInactiveTime"));
        Z = ajy.c(b.b("accumulatedApplicationSessionTime"));
        ab = ajy.c(b.b("accumulatedActiveUserSessionTime"));
        aa = ajy.c(b.b("accumulatedUserSessionTime"));
        ad = ajy.a(b.b("activeUserSessionCount"), -1);
        z = ajy.a(b.b("userSessionCount"), -1);
        ai = ajy.a(b.b("lastUserInteractionTimestamp"), -1L);
        ah = ajy.a(b.b("userInteractionCount"), 0);
        ac = ajy.a(b.b("applicationSessionCountKey"), 0);
        q = v();
        x = ajy.a(b.b("previousGenesis"), 0L);
        w = ajy.a(b.b("genesis"), -1L);
        if (w < 0L)
        {
            w = System.currentTimeMillis();
            x = 0L;
            ae = w;
            ac = ac + 1;
        } else
        {
            if (!w())
            {
                Z = Z + (System.currentTimeMillis() - aj);
                b.a("accumulatedApplicationSessionTime", Long.toString(Z));
            }
            ae = w;
        }
        p = ajy.a(b.b("firstInstallId"), -1L);
        if (p < 0L)
        {
            p = w;
            o = w;
            b.a("currentVersion", q);
            b.a("firstInstallId", String.valueOf(p));
            b.a("installId", String.valueOf(o));
        } else
        {
            if (b.a("previousVersion").booleanValue())
            {
                R = b.b("previousVersion");
            }
            String s1 = b.b("currentVersion");
            if (!s1.equals(q))
            {
                R = s1;
                b.a("previousVersion", R);
                o = w;
                b.a("installId", String.valueOf(o));
            } else
            {
                o = ajy.a(b.b("installId"), -1L);
            }
            b.a("currentVersion", q);
        }
        b.a("genesis", Long.toString(w));
        b.a("previousGenesis", Long.toString(x));
        l2 = System.currentTimeMillis();
        if (Y >= 0L)
        {
            l3 = l2 - Y;
            X = X + l3;
            b.a("accumulatedInactiveTime", Long.toString(X));
            U = l3 + U;
            b.a("totalInactiveTime", Long.toString(U));
        }
        Y = l2;
        aj = l2;
        b.a("lastApplicationAccumulationTimestamp", Long.toString(Y));
        b.a("lastSessionAccumulationTimestamp", Long.toString(aj));
        b.a("lastApplicationSessionTimestamp", Long.toString(ae));
        if (!b.a("runs").booleanValue())
        {
            b.a("runs", "0");
        }
        l.set(ajy.d(b.b("runs")));
        n.set(ajy.d(b.b("coldStartCount")));
        M = new akg(C, b);
    }

    final void a(int i1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = N;
        if (flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        r();
        int j1;
        j1 = i1;
        if (i1 < 60)
        {
            j1 = 60;
        }
        j = flag;
        P = j1 * 1000;
        if (s != ApplicationState.c) goto _L4; else goto _L3
_L3:
        q();
          goto _L1
        Exception exception;
        exception;
        throw exception;
_L4:
        if (s != ApplicationState.b || j) goto _L1; else goto _L5
_L5:
        q();
          goto _L1
    }

    protected final void a(SessionState sessionstate)
    {
        if (N)
        {
            ajn.a(this, (new StringBuilder("Leaving session state: ")).append(sessionstate).toString());
            long l1 = System.currentTimeMillis();
            switch (aiu.b[sessionstate.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                if (A != null)
                {
                    A.cancel();
                    A = null;
                }
                ag = l1;
                // fall through

            case 2: // '\002'
                af = l1;
                // fall through

            case 3: // '\003'
                ae = l1;
                return;

            case 4: // '\004'
                break;
            }
            if (!w())
            {
                long l2 = Z;
                Z = (l1 - aj) + l2;
                return;
            }
        }
    }

    final void a(EventType eventtype, HashMap hashmap)
    {
        if (N && !s())
        {
            if (!k && eventtype != EventType.a)
            {
                f.a(ajd.a(this, EventType.a, new HashMap(), B));
            }
            if (eventtype != EventType.c)
            {
                f.a(ajd.a(this, eventtype, hashmap, B));
                return;
            }
        }
    }

    public final void a(EventType eventtype, HashMap hashmap, boolean flag)
    {
        if (N)
        {
            if (!flag)
            {
                a(eventtype, hashmap);
                return;
            }
            if (e != null)
            {
                e.a(new ait(this, eventtype, hashmap), flag);
                return;
            }
        }
    }

    final void a(String s1)
    {
        int j1;
        if (!N)
        {
            return;
        }
        j1 = s1.indexOf('?');
        if (j1 < 0) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = s1;
        if (j1 < s1.length() - 1)
        {
            obj = s1.substring(j1 + 1).split("&");
            int k1 = obj.length;
            int i1 = 0;
            while (i1 < k1) 
            {
                String as[] = obj[i1].split("=");
                if (as.length == 2)
                {
                    b(as[0], as[1]);
                } else
                if (as.length == 1)
                {
                    b("name", as[0]);
                }
                i1++;
            }
            obj = s1.substring(0, j1 + 1);
        }
_L4:
        B = ((String) (obj));
        return;
_L2:
        obj = (new StringBuilder()).append(s1).append('?').toString();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final long b(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = S;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        if (N)
        {
            S = 0L;
            b.a("totalForegroundTime", Long.toString(S));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    protected final void b(SessionState sessionstate)
    {
        if (!N)
        {
            return;
        }
        ajn.a(this, (new StringBuilder("Entering session state: ")).append(sessionstate).toString());
        switch (aiu.b[sessionstate.ordinal()])
        {
        default:
            return;

        case 3: // '\003'
            break;

        case 1: // '\001'
            if (N)
            {
                long l1 = System.currentTimeMillis();
                if (l1 - ag >= 0x493e0L)
                {
                    ad = ad + 1;
                }
                ag = l1;
            }
            if (N)
            {
                if (A != null)
                {
                    A.cancel();
                    A = null;
                }
                A = new Timer();
                A.schedule(new aig(this), 0x493e0L);
            }
            // fall through

        case 2: // '\002'
            if (N)
            {
                long l2 = System.currentTimeMillis();
                if (l2 - af >= 0x493e0L)
                {
                    z = z + 1;
                }
                af = l2;
            }
            break;
        }
        w();
    }

    final void b(String s1)
    {
_L2:
        return;
        if (!N || M == null) goto _L2; else goto _L1
_L1:
        M.e = s1;
        s1 = M;
        if (s1.b()) goto _L2; else goto _L3
_L3:
        aiy.c(((akg) (s1)).d);
        if (!((akg) (s1)).c.a("vid").booleanValue()) goto _L5; else goto _L4
_L4:
        s1.b = ((akg) (s1)).c.b("vid");
_L7:
        s1.c();
        return;
_L5:
        Object obj = aiy.c(((akg) (s1)).d);
        String s2 = ((aix) (obj)).a;
        obj = (new StringBuilder()).append("-cs").append((new StringBuilder()).append(((aix) (obj)).b).append(((aix) (obj)).c).toString()).toString();
        if (((akg) (s1)).b == null)
        {
            s1.b = (new StringBuilder()).append(ajy.a((new StringBuilder()).append(s2).append(s1.a()).toString())).append(((String) (obj))).toString();
            ((akg) (s1)).c.a("vid", ((akg) (s1)).b);
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final boolean b()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = N;
        if (flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (k)
        {
            continue; /* Loop/switch isn't completed */
        }
        k = true;
        n.getAndIncrement();
        b.a("coldStartCount", String.valueOf(n));
        m = System.currentTimeMillis();
        flag = true;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final long c(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = W;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        if (N)
        {
            W = 0L;
            b.a("accumulatedForegroundTime", Long.toString(W));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = N;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (e != null)
        {
            e.a(new aih(this), true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    final void c(String s1)
    {
        if (N)
        {
            ak = s1;
            if (b != null)
            {
                b.a("appName", ak);
                return;
            }
        }
    }

    public final long d(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = T;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        if (N)
        {
            T = 0L;
            b.a("totalBackgroundTime", Long.toString(T));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public final void d()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = N;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (e != null)
        {
            e.a(new aio(this), true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    final void d(String s1)
    {
        if (!N)
        {
            return;
        }
        String s2;
        if (I)
        {
            s2 = "https://sb.scorecardresearch.com/p2?";
        } else
        {
            s2 = "http://b.scorecardresearch.com/p2?";
        }
        a(s2);
        c("c2", s1);
    }

    public final long e(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = V;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        if (N)
        {
            V = 0L;
            b.a("accumulatedBackgroundTime", Long.toString(V));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    protected final void e()
    {
        if (N)
        {
            if (h != null)
            {
                h.cancel();
                i = null;
                h = null;
            }
            long l1 = System.currentTimeMillis();
            SessionState sessionstate;
            ApplicationState applicationstate;
            ApplicationState applicationstate1;
            SessionState sessionstate1;
            if (t.get() > 0)
            {
                applicationstate = ApplicationState.c;
            } else
            if (u.get() > 0)
            {
                applicationstate = ApplicationState.b;
            } else
            {
                applicationstate = ApplicationState.a;
            }
            if (l1 - ai < 0x493e0L)
            {
                sessionstate = SessionState.d;
            } else
            if (u.get() > 0)
            {
                sessionstate = SessionState.c;
            } else
            if (t.get() > 0)
            {
                sessionstate = SessionState.b;
            } else
            {
                sessionstate = SessionState.a;
            }
            applicationstate1 = s;
            sessionstate1 = y;
            if (applicationstate != applicationstate1 || sessionstate != sessionstate1)
            {
                i = new aij(this, applicationstate1, applicationstate, sessionstate1, sessionstate);
                if (Q && applicationstate != ApplicationState.c)
                {
                    h = new Timer();
                    h.schedule(i, 300L);
                    return;
                } else
                {
                    i.run();
                    i = null;
                    return;
                }
            }
        }
    }

    public final long f(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = U;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        if (N)
        {
            U = 0L;
            b.a("totalInactiveTime", Long.toString(U));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    protected final void f()
    {
        p(true);
    }

    public final long g(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = X;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        if (N)
        {
            X = 0L;
            b.a("accumulatedInactiveTime", Long.toString(X));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    protected final void g()
    {
        q(true);
    }

    public final long h(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = Z;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (N)
        {
            Z = 0L;
            b.a("accumulatedApplicationSessionTime", Long.toString(Z));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public final ApplicationState h()
    {
        return s;
    }

    public final long i(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = ab;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (N)
        {
            ab = 0L;
            b.a("accumulatedActiveUserSessionTime", Long.toString(ab));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public final String i()
    {
        this;
        JVM INSTR monitorenter ;
        String s1;
        s1 = R;
        if (R != null && R.length() > 0)
        {
            b.c("previousVersion");
            R = null;
        }
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public final long j()
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = P;
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public final long j(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = aa;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (N)
        {
            aa = 0L;
            b.a("accumulatedUserSessionTime", Long.toString(aa));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public final int k(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = ac;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (N)
        {
            ac = 0;
            b.a("applicationSessionCountKey", Integer.toString(ac));
        }
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public final String k()
    {
        if (M == null)
        {
            return null;
        }
        akg akg1 = M;
        if (akg1.f)
        {
            if (akg1.e())
            {
                akg1.c();
                if (akg1.g && !akg1.h)
                {
                    return "none";
                } else
                {
                    return akg1.a;
                }
            } else
            {
                return "none";
            }
        } else
        {
            return akg1.a;
        }
    }

    public final int l(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = -1;
        int j1;
        if (ad < 0)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        j1 = ad;
        i1 = j1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        i1 = j1;
        if (!N)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        ad = 0;
        b.a("activeUserSessionCount", Integer.toString(ad));
        i1 = j1;
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public final String l()
    {
        if (M == null)
        {
            return null;
        } else
        {
            return M.b;
        }
    }

    public final int m(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = -1;
        int j1;
        if (z < 0)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        j1 = z;
        i1 = j1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        i1 = j1;
        if (!N)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        z = 0;
        b.a("userSessionCount", Integer.toString(z));
        i1 = j1;
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public final String m()
    {
        Object obj;
        PackageManager packagemanager;
        if (ak != null && ak.length() != 0 || C == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        obj = C.getPackageName();
        packagemanager = C.getPackageManager();
        obj = packagemanager.getApplicationLabel(packagemanager.getApplicationInfo(((String) (obj)), 0));
        if (obj != null)
        {
            try
            {
                obj = obj.toString();
                if (N)
                {
                    c(((String) (obj)));
                }
            }
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
            {
                ak = b.b("appName");
            }
        }
        return ak;
    }

    public final int n(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = ah;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (N)
        {
            ah = 0;
            b.a("userInteractionCount", Integer.toString(ah));
        }
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public final String n()
    {
        return (String)D.get("c2");
    }

    public final void o()
    {
        while (!N || e == null) 
        {
            return;
        }
        e.a(new aip(this), false);
    }

    public final void o(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = N;
        if (flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (h != null)
        {
            h.cancel();
            h = null;
            i.run();
            i = null;
        }
        p(flag);
        q(flag);
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void p()
    {
        this;
        JVM INSTR monitorenter ;
        o(true);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final void q()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = N;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        r();
        if (P >= 60000L)
        {
            O = new Timer("AutoUpdateTimer");
            O.scheduleAtFixedRate(new ais(this), new Date(System.currentTimeMillis() + P), P);
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    final void r()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = N;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (O != null)
        {
            O.cancel();
            O = null;
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    final boolean s()
    {
        return C == null || M.b() || B == null || B.length() == 0;
    }

    public final void t()
    {
        this;
        JVM INSTR monitorenter ;
        if (N)
        {
            N = false;
            if (Thread.getDefaultUncaughtExceptionHandler() != H)
            {
                Thread.setDefaultUncaughtExceptionHandler(H);
            }
            g.b();
            c.a();
            a.b();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
