// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.aq;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.comscore.utils.ConnectivityChangeReceiver;
import com.comscore.utils.d;
import com.comscore.utils.f;
import com.comscore.utils.g;
import com.comscore.utils.h;
import com.comscore.utils.i;
import com.comscore.utils.k;
import com.comscore.utils.n;
import com.comscore.utils.o;
import com.comscore.utils.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicInteger;
import p.as.c;
import p.as.e;
import p.av.a;

// Referenced classes of package p.aq:
//            a, d, c, r, 
//            i, o, m, j, 
//            f, u, t, l, 
//            n, q, v, e, 
//            p, s, g, h

public class b
{

    protected AtomicInteger A;
    protected long B;
    protected long C;
    protected long D;
    protected long E;
    protected long F;
    protected long G;
    protected long H;
    protected long I;
    protected long J;
    protected p.aq.d K;
    protected long L;
    protected long M;
    protected long N;
    protected int O;
    protected int P;
    protected int Q;
    protected long R;
    protected long S;
    protected long T;
    protected int U;
    protected long V;
    protected long W;
    protected Runnable X;
    protected String Y;
    String Z;
    k a;
    Context aa;
    protected final HashMap ab = new HashMap();
    protected final HashMap ac = new HashMap();
    boolean ad;
    protected long ae;
    protected boolean af;
    protected Thread.UncaughtExceptionHandler ag;
    boolean ah;
    o ai;
    o aj;
    String ak[];
    private a al;
    private boolean am;
    private boolean an;
    n b;
    e c;
    d d;
    i e;
    p.aw.a f;
    p.at.c g;
    ConnectivityChangeReceiver h;
    protected Runnable i;
    protected Runnable j;
    protected long k;
    protected boolean l;
    protected boolean m;
    boolean n;
    AtomicInteger o;
    long p;
    AtomicInteger q;
    long r;
    long s;
    String t;
    String u;
    boolean v;
    String w;
    protected p.aq.a x;
    protected AtomicInteger y;
    protected AtomicInteger z;

    public b()
    {
        l = true;
        m = true;
        n = false;
        v = true;
        x = p.aq.a.a;
        K = p.aq.d.a;
        ae = 0L;
        af = false;
        am = true;
        q = new AtomicInteger(0);
        o = new AtomicInteger();
        A = new AtomicInteger(0);
        y = new AtomicInteger(0);
        z = new AtomicInteger(0);
        ag = Thread.getDefaultUncaughtExceptionHandler();
        ad = true;
        a();
    }

    private String a(String s1, Properties properties, boolean flag)
    {
        if (properties != null)
        {
            properties = properties.getProperty(s1);
            if (properties != null)
            {
                b.a(s1, properties);
                return properties;
            }
        }
        if (flag && b.a(s1).booleanValue())
        {
            return b.b(s1);
        } else
        {
            return null;
        }
    }

    private void a(o o1)
    {
        if (!am)
        {
            return;
        } else
        {
            aj = o1;
            return;
        }
    }

    static void a(b b1, o o1)
    {
        b1.a(o1);
    }

    static void a(b b1, String s1)
    {
        b1.c(s1);
    }

    static void a(b b1, String s1, String s2)
    {
        b1.b(s1, s2);
    }

    static boolean a(b b1)
    {
        return b1.am;
    }

    static boolean a(b b1, boolean flag)
    {
        b1.am = flag;
        return flag;
    }

    private void ar()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add("lastApplicationAccumulationTimestamp");
        arraylist.add("lastSessionAccumulationTimestamp");
        a("lastActivityTime", arraylist);
        a("ns_ap_fg", "foregroundTransitionsCount");
        a("installTime", "installId");
        a("ns_ap_ver", "previousVersion");
    }

    private void b(String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = am;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ab.put(s1, s2);
        if (true) goto _L1; else goto _L3
_L3:
        s1;
        throw s1;
    }

    static void b(b b1, String s1)
    {
        b1.d(s1);
    }

    static boolean b(b b1)
    {
        return b1.an;
    }

    static boolean b(b b1, boolean flag)
    {
        b1.an = flag;
        return flag;
    }

    private void c(String s1)
    {
        while (!am || al == null) 
        {
            return;
        }
        al.a(s1);
        al.f();
    }

    static void c(b b1, String s1)
    {
        b1.e(s1);
    }

    private void d(String s1)
    {
        if (am)
        {
            Z = s1;
            if (b != null)
            {
                b.a("appName", Z);
                return;
            }
        }
    }

    private void e(String s1)
    {
        if (!am)
        {
            return;
        }
        String s2;
        if (ag())
        {
            s2 = "https://sb.scorecardresearch.com/p2?";
        } else
        {
            s2 = "http://b.scorecardresearch.com/p2?";
        }
        b(s2);
        b("c2", s1);
    }

    protected void A()
    {
        if (!am)
        {
            return;
        }
        if (X != null)
        {
            f.b(X);
            X = null;
        }
        X = new p.aq.c(this);
        f.a(X, 0x493e0L);
    }

    protected boolean B()
    {
        boolean flag = false;
        if (!am)
        {
            return false;
        }
        long l1 = com.comscore.utils.h.a();
        if (l1 - R > 0x1b7740L)
        {
            I = H;
            H = l1;
            O = O + 1;
            flag = true;
        }
        R = l1;
        return flag;
    }

    protected void C()
    {
        if (!am)
        {
            return;
        }
        long l1 = com.comscore.utils.h.a();
        if (l1 - T >= 0x493e0L)
        {
            Q = Q + 1;
        }
        T = l1;
    }

    protected void D()
    {
        if (!am)
        {
            return;
        }
        long l1 = com.comscore.utils.h.a();
        if (l1 - S >= 0x493e0L)
        {
            P = P + 1;
        }
        S = l1;
    }

    protected void E()
    {
        a(true);
    }

    protected void F()
    {
        b(true);
    }

    public p.aq.a G()
    {
        return x;
    }

    public int H()
    {
        return o.get();
    }

    public long I()
    {
        return r;
    }

    public long J()
    {
        return s;
    }

    public long K()
    {
        return p;
    }

    public int L()
    {
        return q.get();
    }

    public String M()
    {
        return t;
    }

    public String N()
    {
        this;
        JVM INSTR monitorenter ;
        String s1;
        s1 = u;
        if (u != null && u.length() > 0)
        {
            b.c("previousVersion");
            u = null;
        }
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public long O()
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = k;
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public Context P()
    {
        return aa;
    }

    public String Q()
    {
        return w;
    }

    public boolean R()
    {
        return ad;
    }

    public String S()
    {
        return Y;
    }

    public String T()
    {
        if (al == null)
        {
            return null;
        } else
        {
            return al.b();
        }
    }

    public String U()
    {
        if (al == null)
        {
            return null;
        } else
        {
            return al.c();
        }
    }

    public a V()
    {
        return al;
    }

    public String W()
    {
        if (al == null)
        {
            return "";
        } else
        {
            return al.d();
        }
    }

    public String X()
    {
        Object obj;
        PackageManager packagemanager;
        if (Z != null && Z.length() != 0 || aa == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        obj = aa.getPackageName();
        packagemanager = aa.getPackageManager();
        obj = packagemanager.getApplicationLabel(packagemanager.getApplicationInfo(((String) (obj)), 0));
        if (obj != null)
        {
            try
            {
                b(obj.toString(), false);
            }
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
            {
                Z = b.b("appName");
            }
        }
        return Z;
    }

    public String Y()
    {
        return "3.1502.26";
    }

    public long Z()
    {
        return H;
    }

    protected p.at.b a(p.as.d d1, HashMap hashmap, String s1)
    {
        return p.as.c.a(this, d1, hashmap, s1);
    }

    protected a a(Context context, n n1)
    {
        return new a(context, n1);
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        ai = o.a;
        aj = o.a;
        ah = false;
        ak = f.c;
        x = p.aq.a.a;
        K = p.aq.d.a;
        n = false;
        o.set(0);
        p = -1L;
        q.set(0);
        s = -1L;
        r = -1L;
        t = null;
        u = null;
        y.set(0);
        z.set(0);
        B = 0L;
        C = 0L;
        D = 0L;
        E = 0L;
        F = 0L;
        G = 0L;
        L = 0L;
        N = 0L;
        M = 0L;
        H = -1L;
        I = 0L;
        Q = -1;
        P = -1;
        U = 0;
        V = -1L;
        J = -1L;
        W = -1L;
        R = -1L;
        S = -1L;
        T = -1L;
        r = -1L;
        s = -1L;
        ak();
        if (j != null)
        {
            f.b(j);
            j = null;
        }
        if (X != null)
        {
            f.b(X);
            X = null;
        }
        if (c != null)
        {
            c.e();
        }
        if (d != null)
        {
            d.h();
        }
        if (f != null)
        {
            f.c();
        }
        if (b != null)
        {
            b.d();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void a(int i1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = am;
        if (flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        am();
        int j1;
        j1 = i1;
        if (i1 < 60)
        {
            j1 = 60;
        }
        l = flag;
        k = j1 * 1000;
        if (x != p.aq.a.c) goto _L4; else goto _L3
_L3:
        al();
          goto _L1
        Exception exception;
        exception;
        throw exception;
_L4:
        if (x != a.b || l) goto _L1; else goto _L5
_L5:
        al();
          goto _L1
    }

    public void a(int i1, boolean flag, boolean flag1)
    {
        if (am)
        {
            if (!flag1)
            {
                a(i1, flag);
                return;
            }
            if (f != null)
            {
                f.a(new r(this, i1, flag), flag1);
                return;
            }
        }
    }

    public void a(Context context)
    {
        if (aa != null || context == null)
        {
            return;
        } else
        {
            aa = context;
            f = e();
            f.a(new p.aq.i(this), true);
            return;
        }
    }

    protected void a(n n1)
    {
        ar();
        g.a();
    }

    public void a(o o1, boolean flag)
    {
        if (am && o1 != null)
        {
            if (!flag)
            {
                a(o1);
                return;
            }
            if (f != null && ae() != o1)
            {
                f.a(new p.aq.o(this, o1), flag);
                return;
            }
        }
    }

    public void a(String s1)
    {
        w = s1;
    }

    void a(String s1, String s2)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(s2);
        a(s1, arraylist);
    }

    public void a(String s1, String s2, boolean flag)
    {
        if (am)
        {
            if (!flag)
            {
                b(s1, s2);
                return;
            }
            if (f != null)
            {
                f.a(new m(this, s1, s2), flag);
                return;
            }
        }
    }

    void a(String s1, ArrayList arraylist)
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
            if (com.comscore.utils.p.f(s3) && com.comscore.utils.p.g(s4))
            {
                b.a(s2, s3);
            }
        } while (true);
        b.c(s1);
    }

    public void a(String s1, boolean flag)
    {
        while (!am || s1 == null || s1.length() == 0 || f == null) 
        {
            return;
        }
        f.a(new j(this, s1), flag);
    }

    protected void a(p.aq.a a1)
    {
        com.comscore.utils.c.a(this, (new StringBuilder()).append("Leaving application state: ").append(a1).toString());
        switch (p.aq.f.a[a1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            h.a();
            c.a(3000);
            aa.registerReceiver(h, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            d.a();
            return;

        case 2: // '\002'
            am();
            return;

        case 3: // '\003'
            a(((String) (null)));
            break;
        }
        am();
    }

    protected void a(p.aq.a a1, p.aq.a a2)
    {
        while (!am || a2 == p.aq.a.a || !af() || n) 
        {
            return;
        }
        a(p.as.d.a, ac, false);
    }

    protected void a(p.aq.d d1)
    {
        if (am)
        {
            com.comscore.utils.c.a(this, (new StringBuilder()).append("Leaving session state: ").append(d1).toString());
            long l1 = com.comscore.utils.h.a();
            switch (f.b[d1.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                if (X != null)
                {
                    f.b(X);
                    X = null;
                }
                T = l1;
                // fall through

            case 2: // '\002'
                S = l1;
                // fall through

            case 3: // '\003'
                R = l1;
                return;

            case 4: // '\004'
                break;
            }
            if (!B())
            {
                long l2 = L;
                L = (l1 - W) + l2;
                return;
            }
        }
    }

    protected void a(p.aq.d d1, p.aq.d d2)
    {
    }

    void a(p.as.d d1, HashMap hashmap)
    {
        if (am)
        {
            if (ap())
            {
                an();
                return;
            }
            ao();
            if (!n && d1 != p.as.d.a)
            {
                g.a(a(p.as.d.a, new HashMap(), Y), false);
            }
            if (d1 != p.as.d.c)
            {
                g.a(a(d1, com.comscore.utils.p.a(hashmap), Y), false);
                return;
            }
        }
    }

    public void a(p.as.d d1, HashMap hashmap, boolean flag)
    {
        if (am)
        {
            if (!flag)
            {
                a(d1, hashmap);
                return;
            }
            if (f != null)
            {
                f.a(new u(this, d1, hashmap), flag);
                return;
            }
        }
    }

    protected void a(boolean flag)
    {
        if (am) goto _L2; else goto _L1
_L1:
        return;
_L2:
        long l1;
        long l2;
        l1 = com.comscore.utils.h.a();
        l2 = l1 - J;
        p.aq.f.a[x.ordinal()];
        JVM INSTR tableswitch 1 3: default 56
    //                   1 254
    //                   2 229
    //                   3 204;
           goto _L3 _L4 _L5 _L6
_L4:
        break MISSING_BLOCK_LABEL_254;
_L3:
        break; /* Loop/switch isn't completed */
_L6:
        break; /* Loop/switch isn't completed */
_L8:
        J = l1;
        if (flag)
        {
            b.a("lastApplicationAccumulationTimestamp", Long.toString(J));
            b.a("foregroundTransitionsCount", Long.toString(A.get()));
            b.a("accumulatedForegroundTime", Long.toString(F));
            b.a("accumulatedBackgroundTime", Long.toString(E));
            b.a("accumulatedInactiveTime", Long.toString(G));
            b.a("totalForegroundTime", Long.toString(B));
            b.a("totalBackgroundTime", Long.toString(C));
            b.a("totalInactiveTime", Long.toString(D));
            return;
        }
        if (true) goto _L1; else goto _L7
_L7:
        F = F + l2;
        B = l2 + B;
          goto _L8
_L5:
        E = E + l2;
        C = l2 + C;
          goto _L8
        G = G + l2;
        D = l2 + D;
          goto _L8
    }

    public long aa()
    {
        return I;
    }

    public HashMap ab()
    {
        return ab;
    }

    public String ac()
    {
        return (String)ab().get("c2");
    }

    public o ad()
    {
        return ai;
    }

    public o ae()
    {
        return aj;
    }

    public boolean af()
    {
        return v;
    }

    public boolean ag()
    {
        return ah;
    }

    public long ah()
    {
        return ae;
    }

    public String[] ai()
    {
        return ak;
    }

    public void aj()
    {
        this;
        JVM INSTR monitorenter ;
        s(true);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void ak()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = am;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        am();
        l = true;
        k = -1L;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected void al()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = am;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        am();
        if (k >= 60000L)
        {
            i = new t(this);
            f.a(i, k, true, k);
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected void am()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = am;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (i != null)
        {
            f.b(i);
            i = null;
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected void an()
    {
    }

    protected void ao()
    {
    }

    boolean ap()
    {
        return aa == null || al.e() || Y == null || Y.length() == 0;
    }

    public boolean aq()
    {
        return am;
    }

    protected void b()
    {
        b = c();
        g = f();
        a(b);
        e = d();
        c = g();
        a = h();
        d = i();
        h = j();
        k();
        al = a(aa, b);
    }

    void b(String s1)
    {
        int j1;
        if (!am)
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
                    a(as[0], as[1], false);
                } else
                if (as.length == 1)
                {
                    a("name", as[0], false);
                }
                i1++;
            }
            obj = s1.substring(0, j1 + 1);
        }
_L4:
        Y = ((String) (obj));
        return;
_L2:
        obj = (new StringBuilder()).append(s1).append('?').toString();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void b(String s1, boolean flag)
    {
        if (am)
        {
            if (!flag)
            {
                d(s1);
                return;
            }
            if (f != null)
            {
                f.a(new l(this, s1), flag);
                return;
            }
        }
    }

    protected void b(p.aq.a a1)
    {
        if (am) goto _L2; else goto _L1
_L1:
        return;
_L2:
        com.comscore.utils.c.a(this, (new StringBuilder()).append("Entering application state: ").append(a1).toString());
        switch (p.aq.f.a[a1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            h.b();
            c.d();
            d.h();
            try
            {
                aa.unregisterReceiver(h);
            }
            // Misplaced declaration of an exception variable
            catch (p.aq.a a1) { }
            am();
            return;

        case 2: // '\002'
            if (!l)
            {
                al();
                return;
            }
            break;

        case 3: // '\003'
            al();
            A.getAndIncrement();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void b(p.aq.d d1)
    {
        if (!am)
        {
            return;
        }
        com.comscore.utils.c.a(this, (new StringBuilder()).append("Entering session state: ").append(d1).toString());
        switch (f.b[d1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            C();
            A();
            // fall through

        case 2: // '\002'
            D();
            // fall through

        case 3: // '\003'
            B();
            break;
        }
    }

    protected void b(boolean flag)
    {
        if (am) goto _L2; else goto _L1
_L1:
        return;
_L2:
        long l1;
        long l2;
        l1 = com.comscore.utils.h.a();
        l2 = l1 - W;
        f.b[K.ordinal()];
        JVM INSTR tableswitch 1 3: default 56
    //                   1 305
    //                   2 321
    //                   3 337;
           goto _L3 _L4 _L5 _L6
_L3:
        W = l1;
        if (flag)
        {
            b.a("lastSessionAccumulationTimestamp", Long.toString(W));
            b.a("lastApplicationSessionTimestamp", Long.toString(R));
            b.a("lastUserSessionTimestamp", Long.toString(S));
            b.a("lastActiveUserSessionTimestamp", Long.toString(T));
            b.a("accumulatedApplicationSessionTime", Long.toString(L));
            b.a("accumulatedActiveUserSessionTime", Long.toString(N));
            b.a("accumulatedUserSessionTime", Long.toString(M));
            b.a("activeUserSessionCount", Long.toString(Q));
            b.a("userSessionCount", Long.toString(P));
            b.a("lastUserInteractionTimestamp", Long.toString(V));
            b.a("userInteractionCount", Integer.toString(U));
            b.a("previousGenesis", Long.toString(I));
            b.a("genesis", Long.toString(H));
            b.a("applicationSessionCountKey", Integer.toString(O));
            return;
        }
          goto _L7
_L4:
        N = N + l2;
        T = l1;
_L5:
        M = M + l2;
        S = l1;
_L6:
        L = l2 + L;
        R = l1;
        if (true) goto _L3; else goto _L7
_L7:
        if (true) goto _L1; else goto _L8
_L8:
    }

    public int c(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = A.get();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        if (am)
        {
            A.set(0);
            b.a("foregroundTransitionsCount", Long.toString(A.get()));
        }
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    protected n c()
    {
        return new n(aa);
    }

    public void c(String s1, boolean flag)
    {
        if (am && s1 != null && s1.length() != 0)
        {
            if (!flag)
            {
                e(s1);
                return;
            }
            if (f != null)
            {
                f.a(new p.aq.n(this, s1), flag);
                return;
            }
        }
    }

    public long d(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = B;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (am)
        {
            B = 0L;
            b.a("totalForegroundTime", Long.toString(B));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    protected i d()
    {
        return new i(this);
    }

    public long e(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = F;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (am)
        {
            F = 0L;
            b.a("accumulatedForegroundTime", Long.toString(F));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    protected p.aw.a e()
    {
        return new p.aw.a(this);
    }

    public long f(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = C;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (am)
        {
            C = 0L;
            b.a("totalBackgroundTime", Long.toString(C));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    protected p.at.c f()
    {
        return new p.at.c(this);
    }

    public long g(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = E;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (am)
        {
            E = 0L;
            b.a("accumulatedBackgroundTime", Long.toString(E));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    protected e g()
    {
        return new e(this, 0x5265c00L);
    }

    public long h(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = D;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (am)
        {
            D = 0L;
            b.a("totalInactiveTime", Long.toString(D));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    protected k h()
    {
        return new k(this);
    }

    public long i(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = G;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (am)
        {
            G = 0L;
            b.a("accumulatedInactiveTime", Long.toString(G));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    protected d i()
    {
        return new d(this);
    }

    public long j(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = L;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (am)
        {
            L = 0L;
            b.a("accumulatedApplicationSessionTime", Long.toString(L));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    protected ConnectivityChangeReceiver j()
    {
        return new ConnectivityChangeReceiver(this);
    }

    public long k(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = N;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (am)
        {
            N = 0L;
            b.a("accumulatedActiveUserSessionTime", Long.toString(N));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    protected void k()
    {
        J = com.comscore.utils.p.a(b.b("lastApplicationAccumulationTimestamp"), -1L);
        W = com.comscore.utils.p.a(b.b("lastSessionAccumulationTimestamp"), -1L);
        R = com.comscore.utils.p.a(b.b("lastApplicationSessionTimestamp"), -1L);
        S = com.comscore.utils.p.a(b.b("lastUserSessionTimestamp"), -1L);
        T = com.comscore.utils.p.a(b.b("lastActiveUserSessionTimestamp"), -1L);
        A.set(com.comscore.utils.p.d(b.b("foregroundTransitionsCount")));
        F = com.comscore.utils.p.c(b.b("accumulatedForegroundTime"));
        E = com.comscore.utils.p.c(b.b("accumulatedBackgroundTime"));
        G = com.comscore.utils.p.c(b.b("accumulatedInactiveTime"));
        B = com.comscore.utils.p.c(b.b("totalForegroundTime"));
        C = com.comscore.utils.p.c(b.b("totalBackgroundTime"));
        D = com.comscore.utils.p.c(b.b("totalInactiveTime"));
        L = com.comscore.utils.p.c(b.b("accumulatedApplicationSessionTime"));
        N = com.comscore.utils.p.c(b.b("accumulatedActiveUserSessionTime"));
        M = com.comscore.utils.p.c(b.b("accumulatedUserSessionTime"));
        Q = com.comscore.utils.p.a(b.b("activeUserSessionCount"), -1);
        P = com.comscore.utils.p.a(b.b("userSessionCount"), -1);
        V = com.comscore.utils.p.a(b.b("lastUserInteractionTimestamp"), -1L);
        U = com.comscore.utils.p.a(b.b("userInteractionCount"), 0);
        O = com.comscore.utils.p.a(b.b("applicationSessionCountKey"), 0);
        t = m();
        I = com.comscore.utils.p.a(b.b("previousGenesis"), 0L);
        H = com.comscore.utils.p.a(b.b("genesis"), -1L);
        long l1;
        if (H < 0L)
        {
            H = com.comscore.utils.h.a();
            I = 0L;
            R = H;
            O = O + 1;
        } else
        {
            if (!B())
            {
                L = L + (com.comscore.utils.h.a() - W);
                b.a("accumulatedApplicationSessionTime", Long.toString(L));
            }
            R = H;
        }
        s = com.comscore.utils.p.a(b.b("firstInstallId"), -1L);
        if (s < 0L)
        {
            s = H;
            r = H;
            b.a("currentVersion", t);
            b.a("firstInstallId", String.valueOf(s));
            b.a("installId", String.valueOf(r));
        } else
        {
            if (b.a("previousVersion").booleanValue())
            {
                u = b.b("previousVersion");
            }
            String s1 = b.b("currentVersion");
            if (!s1.equals(t))
            {
                u = s1;
                b.a("previousVersion", u);
                r = H;
                b.a("installId", String.valueOf(r));
            } else
            {
                r = com.comscore.utils.p.a(b.b("installId"), -1L);
            }
            b.a("currentVersion", t);
        }
        b.a("genesis", Long.toString(H));
        b.a("previousGenesis", Long.toString(I));
        l1 = com.comscore.utils.h.a();
        if (J >= 0L)
        {
            long l2 = l1 - J;
            G = G + l2;
            b.a("accumulatedInactiveTime", Long.toString(G));
            D = l2 + D;
            b.a("totalInactiveTime", Long.toString(D));
        }
        J = l1;
        W = l1;
        b.a("lastApplicationAccumulationTimestamp", Long.toString(J));
        b.a("lastSessionAccumulationTimestamp", Long.toString(W));
        b.a("lastApplicationSessionTimestamp", Long.toString(R));
        if (!b.a("runs").booleanValue())
        {
            b.a("runs", "0");
        }
        o.set(com.comscore.utils.p.d(b.b("runs")));
        q.set(com.comscore.utils.p.d(b.b("coldStartCount")));
    }

    public long l(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = M;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (am)
        {
            M = 0L;
            b.a("accumulatedUserSessionTime", Long.toString(M));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public void l()
    {
        if (!am)
        {
            return;
        } else
        {
            o.getAndIncrement();
            b.a("runs", Long.toString(o.get()));
            return;
        }
    }

    public int m(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = O;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (am)
        {
            O = 0;
            b.a("applicationSessionCountKey", Integer.toString(O));
        }
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    protected String m()
    {
        String s1 = aa.getPackageName();
        try
        {
            s1 = aa.getPackageManager().getPackageInfo(s1, 0).versionName;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return "0";
        }
        return s1;
    }

    public int n(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = -1;
        int j1;
        if (Q < 0)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        j1 = Q;
        i1 = j1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        i1 = j1;
        if (!am)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        Q = 0;
        b.a("activeUserSessionCount", Integer.toString(Q));
        i1 = j1;
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean n()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = am;
        if (flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (n)
        {
            continue; /* Loop/switch isn't completed */
        }
        n = true;
        q.getAndIncrement();
        b.a("coldStartCount", String.valueOf(q));
        p = com.comscore.utils.h.a();
        flag = true;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public int o(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = -1;
        int j1;
        if (P < 0)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        j1 = P;
        i1 = j1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        i1 = j1;
        if (!am)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        P = 0;
        b.a("userSessionCount", Integer.toString(P));
        i1 = j1;
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    protected void o()
    {
        if (aa == null) goto _L2; else goto _L1
_L1:
        Object obj = aa.getResources().getAssets();
        Object obj1;
        obj1 = ((AssetManager) (obj)).open("comScore.properties");
        obj = new Properties();
        ((Properties) (obj)).load(((java.io.InputStream) (obj1)));
        f.a = com.comscore.utils.p.e(a("Debug", ((Properties) (obj)), false));
        ah = com.comscore.utils.p.e(a("Secure", ((Properties) (obj)), false));
        obj1 = a("PublisherSecret", ((Properties) (obj)), true);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        c(((String) (obj1)));
        obj1 = a("AppName", ((Properties) (obj)), true);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        d(((String) (obj1)));
        obj1 = a("CustomerC2", ((Properties) (obj)), false);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        e(((String) (obj1)));
        obj1 = a("PixelURL", ((Properties) (obj)), false);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        b(((String) (obj1)));
        obj1 = a("OfflineURL", ((Properties) (obj)), false);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        a.b(((String) (obj1)));
        obj1 = a("LiveTransmissionMode", ((Properties) (obj)), false);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        ai = com.comscore.utils.o.valueOf(((String) (obj1)).toUpperCase(Locale.getDefault()));
_L5:
        obj1 = a("OfflineTransmissionMode", ((Properties) (obj)), false);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        aj = com.comscore.utils.o.valueOf(((String) (obj1)).toUpperCase(Locale.getDefault()));
_L3:
        int i1;
        ad = com.comscore.utils.p.a(a("KeepAliveEnabled", ((Properties) (obj)), false), true);
        i1 = com.comscore.utils.p.a(a("CacheMaxSize", ((Properties) (obj)), false), -1);
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        a.a(i1);
        i1 = com.comscore.utils.p.a(a("CacheMaxBatchSize", ((Properties) (obj)), false), -1);
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_293;
        }
        a.b(i1);
        i1 = com.comscore.utils.p.a(a("CacheMaxFlushesInARow", ((Properties) (obj)), false), -1);
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_319;
        }
        a.c(i1);
        i1 = com.comscore.utils.p.a(a("CacheMinutesToRetry", ((Properties) (obj)), false), -1);
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_345;
        }
        a.d(i1);
        i1 = com.comscore.utils.p.a(a("CacheExpiryInDays", ((Properties) (obj)), false), -1);
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_371;
        }
        a.e(i1);
        long l1 = com.comscore.utils.p.a(a("CacheFlushingInterval", ((Properties) (obj)), false), -1L);
        if (l1 < 0L)
        {
            break MISSING_BLOCK_LABEL_415;
        }
        ae = l1;
        if (d != null)
        {
            d.d();
        }
        boolean flag;
        q(com.comscore.utils.p.e(a("ErrorHandlingEnabled", ((Properties) (obj)), false)));
        v = com.comscore.utils.p.a(a("AutoStartEnabled", ((Properties) (obj)), false), true);
        flag = com.comscore.utils.p.a(a("AutoUpdateInForegroundOnly", ((Properties) (obj)), false), true);
        i1 = com.comscore.utils.p.a(a("AutoUpdateInterval", ((Properties) (obj)), false), -1);
        IllegalArgumentException illegalargumentexception;
        if (i1 >= 60)
        {
            try
            {
                a(i1, flag);
                return;
            }
            catch (IOException ioexception)
            {
                if (f.a)
                {
                    com.comscore.utils.c.a(ioexception);
                    return;
                }
            }
        }
          goto _L2
        illegalargumentexception;
        ai = o.a;
        continue; /* Loop/switch isn't completed */
        illegalargumentexception;
        aj = o.a;
          goto _L3
_L2:
        return;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public int p(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = U;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (am)
        {
            U = 0;
            b.a("userInteractionCount", Integer.toString(U));
        }
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public k p()
    {
        return a;
    }

    public ConnectivityChangeReceiver q()
    {
        return h;
    }

    public void q(boolean flag)
    {
        if (am)
        {
            af = flag;
            if (flag)
            {
                Thread.setDefaultUncaughtExceptionHandler(new g(this));
                return;
            }
            if (Thread.getDefaultUncaughtExceptionHandler() != ag)
            {
                Thread.setDefaultUncaughtExceptionHandler(ag);
                return;
            }
        }
    }

    public n r()
    {
        return b;
    }

    public void r(boolean flag)
    {
        while (!am || f == null) 
        {
            return;
        }
        f.a(new q(this), flag);
    }

    public p.aw.a s()
    {
        return f;
    }

    public void s(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = am;
        if (flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (f.a(j))
        {
            f.b(j);
            j.run();
            j = null;
        }
        a(flag);
        b(flag);
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public p.at.c t()
    {
        return g;
    }

    public void t(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        f.a(new v(this, flag), true);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public e u()
    {
        return c;
    }

    public void v()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = am;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (f != null)
        {
            f.a(new p.aq.e(this), true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void w()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = am;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (f != null)
        {
            f.a(new p.aq.p(this), true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void x()
    {
        while (!am || f == null) 
        {
            return;
        }
        f.a(new s(this), true);
    }

    public void y()
    {
        while (!am || f == null) 
        {
            return;
        }
        f.a(new p.aq.g(this), true);
    }

    protected void z()
    {
        if (am)
        {
            if (f.a(j))
            {
                f.b(j);
                j = null;
            }
            long l1 = com.comscore.utils.h.a();
            p.aq.d d1;
            p.aq.a a1;
            p.aq.a a2;
            p.aq.d d2;
            if (y.get() > 0)
            {
                a1 = p.aq.a.c;
            } else
            if (z.get() > 0)
            {
                a1 = a.b;
            } else
            {
                a1 = p.aq.a.a;
            }
            if (l1 - V < 0x493e0L)
            {
                d1 = p.aq.d.d;
            } else
            if (z.get() > 0)
            {
                d1 = p.aq.d.c;
            } else
            if (y.get() > 0)
            {
                d1 = d.b;
            } else
            {
                d1 = p.aq.d.a;
            }
            a2 = x;
            d2 = K;
            if (a1 != a2 || d1 != d2)
            {
                j = new p.aq.h(this, a2, a1, d2, d1);
                if (m && a1 != p.aq.a.c)
                {
                    f.a(j, 300L);
                    return;
                } else
                {
                    j.run();
                    j = null;
                    return;
                }
            }
        }
    }
}
