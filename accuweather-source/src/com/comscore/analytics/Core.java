// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.analytics;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.comscore.applications.ApplicationMeasurement;
import com.comscore.applications.EventType;
import com.comscore.applications.KeepAliveAlarmReceiver;
import com.comscore.measurement.Measurement;
import com.comscore.measurement.MeasurementDispatcher;
import com.comscore.utils.CSLog;
import com.comscore.utils.CacheFlusher;
import com.comscore.utils.ConnectivityChangeReceiver;
import com.comscore.utils.Constants;
import com.comscore.utils.CustomExceptionHandler;
import com.comscore.utils.Date;
import com.comscore.utils.DispatchQueue;
import com.comscore.utils.OfflineMeasurementsCache;
import com.comscore.utils.Storage;
import com.comscore.utils.TransmissionMode;
import com.comscore.utils.Utils;
import com.comscore.utils.id.IdHelper;
import com.comscore.utils.task.TaskExecutor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.comscore.analytics:
//            ApplicationState, SessionState, comScore, z, 
//            h, i, v, u, 
//            ac, y, w, aa, 
//            ab, a, l, ad, 
//            d, m, s, o, 
//            p, n, r, q, 
//            g, k, b, f, 
//            e, t, af, ae, 
//            c, j, x

public class Core
{

    protected static final long y = 300L;
    protected AtomicInteger A;
    protected AtomicInteger B;
    protected AtomicInteger C;
    protected long D;
    protected long E;
    protected long F;
    protected long G;
    protected long H;
    protected long I;
    protected long J;
    protected long K;
    protected long L;
    protected SessionState M;
    protected long N;
    protected long O;
    protected long P;
    protected int Q;
    protected int R;
    protected int S;
    protected long T;
    protected long U;
    protected long V;
    protected int W;
    protected long X;
    protected long Y;
    protected Timer Z;
    OfflineMeasurementsCache a;
    protected String aa;
    String ab;
    Context ac;
    protected final HashMap ad = new HashMap();
    protected final HashMap ae = new HashMap();
    boolean af;
    protected long ag;
    protected boolean ah;
    protected Thread.UncaughtExceptionHandler ai;
    boolean aj;
    TransmissionMode ak;
    TransmissionMode al;
    String am[];
    private IdHelper an;
    private boolean ao;
    private boolean ap;
    Storage b;
    KeepAliveAlarmReceiver c;
    CacheFlusher d;
    DispatchQueue e;
    TaskExecutor f;
    MeasurementDispatcher g;
    ConnectivityChangeReceiver h;
    protected Timer i;
    protected Timer j;
    protected TimerTask k;
    protected long l;
    protected boolean m;
    protected boolean n;
    boolean o;
    AtomicInteger p;
    long q;
    AtomicInteger r;
    long s;
    long t;
    String u;
    String v;
    boolean w;
    String x;
    protected ApplicationState z;

    public Core()
    {
        m = true;
        n = true;
        o = false;
        w = true;
        z = ApplicationState.INACTIVE;
        M = SessionState.INACTIVE;
        ag = 0L;
        ah = false;
        ao = true;
        r = new AtomicInteger(0);
        p = new AtomicInteger();
        C = new AtomicInteger(0);
        A = new AtomicInteger(0);
        B = new AtomicInteger(0);
        ai = Thread.getDefaultUncaughtExceptionHandler();
        af = true;
        reset();
    }

    private void A()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add("lastApplicationAccumulationTimestamp");
        arraylist.add("lastSessionAccumulationTimestamp");
        a("lastActivityTime", arraylist);
        a("ns_ap_fg", "foregroundTransitionsCount");
        a("installTime", "installId");
        a("ns_ap_ver", "previousVersion");
    }

    private String a(String s1, Properties properties, boolean flag)
    {
        if (properties != null)
        {
            properties = properties.getProperty(s1);
            if (properties != null)
            {
                b.set(s1, properties);
                return properties;
            }
        }
        if (flag && b.has(s1).booleanValue())
        {
            return b.get(s1);
        } else
        {
            return null;
        }
    }

    static void a(Core core, TransmissionMode transmissionmode)
    {
        core.a(transmissionmode);
    }

    static void a(Core core, String s1)
    {
        core.b(s1);
    }

    static void a(Core core, String s1, String s2)
    {
        core.b(s1, s2);
    }

    private void a(TransmissionMode transmissionmode)
    {
        if (!ao)
        {
            return;
        } else
        {
            ak = transmissionmode;
            return;
        }
    }

    static boolean a(Core core)
    {
        return core.ao;
    }

    static void b(Core core, TransmissionMode transmissionmode)
    {
        core.b(transmissionmode);
    }

    static void b(Core core, String s1)
    {
        core.c(s1);
    }

    private void b(TransmissionMode transmissionmode)
    {
        if (!ao)
        {
            return;
        } else
        {
            al = transmissionmode;
            return;
        }
    }

    private void b(String s1)
    {
        while (!ao || an == null) 
        {
            return;
        }
        an.setPublisherSecret(s1);
        an.generateIds();
    }

    private void b(String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = ao;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ad.put(s1, s2);
        if (true) goto _L1; else goto _L3
_L3:
        s1;
        throw s1;
    }

    static void c(Core core, String s1)
    {
        core.d(s1);
    }

    private void c(String s1)
    {
        if (ao)
        {
            ab = s1;
            if (b != null)
            {
                b.set("appName", ab);
                return;
            }
        }
    }

    private void d(String s1)
    {
        if (!ao)
        {
            return;
        }
        String s2;
        if (isSecure())
        {
            s2 = "https://sb.scorecardresearch.com/p2?";
        } else
        {
            s2 = "http://b.scorecardresearch.com/p2?";
        }
        a(s2);
        b("c2", s1);
    }

    public static Core getInstance()
    {
        return comScore.getCore();
    }

    protected Measurement a(EventType eventtype, HashMap hashmap, String s1)
    {
        return ApplicationMeasurement.newApplicationMeasurement(this, eventtype, hashmap, s1);
    }

    protected IdHelper a(Context context, Storage storage)
    {
        return new IdHelper(context, storage);
    }

    protected void a()
    {
        b = b();
        g = e();
        a(b);
        e = c();
        c = f();
        a = g();
        d = h();
        h = i();
        j();
        an = a(ac, b);
    }

    void a(int i1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = ao;
        if (flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        w();
        int j1;
        j1 = i1;
        if (i1 < 60)
        {
            j1 = 60;
        }
        m = flag;
        l = j1 * 1000;
        if (z != ApplicationState.FOREGROUND) goto _L4; else goto _L3
_L3:
        v();
          goto _L1
        Exception exception;
        exception;
        throw exception;
_L4:
        if (z != ApplicationState.BACKGROUND_UX_ACTIVE || m) goto _L1; else goto _L5
_L5:
        v();
          goto _L1
    }

    protected void a(ApplicationState applicationstate)
    {
        CSLog.d(this, (new StringBuilder()).append("Leaving application state: ").append(applicationstate).toString());
        switch (z.a[applicationstate.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            h.start();
            c.start(3000);
            ac.registerReceiver(h, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            d.start();
            return;

        case 2: // '\002'
            w();
            return;

        case 3: // '\003'
            setCurrentActivityName(null);
            break;
        }
        w();
    }

    protected void a(ApplicationState applicationstate, ApplicationState applicationstate1)
    {
        while (!ao || applicationstate1 == ApplicationState.INACTIVE || !isAutoStartEnabled() || o) 
        {
            return;
        }
        notify(EventType.START, ae, false);
    }

    protected void a(SessionState sessionstate)
    {
        if (ao)
        {
            CSLog.d(this, (new StringBuilder()).append("Leaving session state: ").append(sessionstate).toString());
            long l1 = Date.unixTime();
            switch (z.b[sessionstate.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                if (Z != null)
                {
                    Z.cancel();
                    Z = null;
                }
                V = l1;
                // fall through

            case 2: // '\002'
                U = l1;
                // fall through

            case 3: // '\003'
                T = l1;
                return;

            case 4: // '\004'
                break;
            }
            if (!p())
            {
                long l2 = N;
                N = (l1 - Y) + l2;
                return;
            }
        }
    }

    protected void a(SessionState sessionstate, SessionState sessionstate1)
    {
    }

    void a(EventType eventtype, HashMap hashmap)
    {
        if (ao)
        {
            if (z())
            {
                x();
                return;
            }
            y();
            if (!o && eventtype != EventType.START)
            {
                g.sendMeasurmement(a(EventType.START, new HashMap(), aa), false);
            }
            if (eventtype != EventType.CLOSE)
            {
                g.sendMeasurmement(a(eventtype, hashmap, aa), false);
                return;
            }
        }
    }

    protected void a(Storage storage)
    {
        A();
        g.loadEventData();
    }

    void a(String s1)
    {
        int j1;
        if (!ao)
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
                    setLabel(as[0], as[1], false);
                } else
                if (as.length == 1)
                {
                    setLabel("name", as[0], false);
                }
                i1++;
            }
            obj = s1.substring(0, j1 + 1);
        }
_L4:
        aa = ((String) (obj));
        return;
_L2:
        obj = (new StringBuilder()).append(s1).append('?').toString();
        if (true) goto _L4; else goto _L3
_L3:
    }

    void a(String s1, String s2)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(s2);
        a(s1, arraylist);
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
            String s3 = b.get(s1);
            String s4 = b.get(s2);
            if (Utils.isNotEmpty(s3) && Utils.isEmpty(s4))
            {
                b.set(s2, s3);
            }
        } while (true);
        b.remove(s1);
    }

    protected void a(boolean flag)
    {
        if (ao) goto _L2; else goto _L1
_L1:
        return;
_L2:
        long l1;
        long l2;
        l1 = Date.unixTime();
        l2 = l1 - L;
        z.a[z.ordinal()];
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
        L = l1;
        if (flag)
        {
            b.set("lastApplicationAccumulationTimestamp", Long.toString(L));
            b.set("foregroundTransitionsCount", Long.toString(C.get()));
            b.set("accumulatedForegroundTime", Long.toString(H));
            b.set("accumulatedBackgroundTime", Long.toString(G));
            b.set("accumulatedInactiveTime", Long.toString(I));
            b.set("totalForegroundTime", Long.toString(D));
            b.set("totalBackgroundTime", Long.toString(E));
            b.set("totalInactiveTime", Long.toString(F));
            return;
        }
        if (true) goto _L1; else goto _L7
_L7:
        H = H + l2;
        D = l2 + D;
          goto _L8
_L5:
        G = G + l2;
        E = l2 + E;
          goto _L8
        I = I + l2;
        F = l2 + F;
          goto _L8
    }

    public void allowLiveTransmission(TransmissionMode transmissionmode, boolean flag)
    {
        if (ao && transmissionmode != null)
        {
            if (!flag)
            {
                a(transmissionmode);
                return;
            }
            if (f != null && getLiveTransmissionMode() != transmissionmode)
            {
                f.execute(new h(this, transmissionmode), flag);
                return;
            }
        }
    }

    public void allowOfflineTransmission(TransmissionMode transmissionmode, boolean flag)
    {
        if (ao && transmissionmode != null)
        {
            if (!flag)
            {
                b(transmissionmode);
                return;
            }
            if (f != null && getOfflineTransmissionMode() != transmissionmode)
            {
                f.execute(new i(this, transmissionmode), flag);
                return;
            }
        }
    }

    protected Storage b()
    {
        return new Storage(ac);
    }

    protected void b(ApplicationState applicationstate)
    {
        if (ao) goto _L2; else goto _L1
_L1:
        return;
_L2:
        CSLog.d(this, (new StringBuilder()).append("Entering application state: ").append(applicationstate).toString());
        switch (z.a[applicationstate.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            h.stop();
            c.stop();
            d.stop();
            ac.unregisterReceiver(h);
            w();
            return;

        case 2: // '\002'
            if (!m)
            {
                v();
                return;
            }
            break;

        case 3: // '\003'
            v();
            C.getAndIncrement();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void b(SessionState sessionstate)
    {
        if (!ao)
        {
            return;
        }
        CSLog.d(this, (new StringBuilder()).append("Entering session state: ").append(sessionstate).toString());
        switch (z.b[sessionstate.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            q();
            o();
            // fall through

        case 2: // '\002'
            r();
            // fall through

        case 3: // '\003'
            p();
            break;
        }
    }

    protected void b(boolean flag)
    {
        if (ao) goto _L2; else goto _L1
_L1:
        return;
_L2:
        long l1;
        long l2;
        l1 = Date.unixTime();
        l2 = l1 - Y;
        z.b[M.ordinal()];
        JVM INSTR tableswitch 1 3: default 56
    //                   1 305
    //                   2 321
    //                   3 337;
           goto _L3 _L4 _L5 _L6
_L3:
        Y = l1;
        if (flag)
        {
            b.set("lastSessionAccumulationTimestamp", Long.toString(Y));
            b.set("lastApplicationSessionTimestamp", Long.toString(T));
            b.set("lastUserSessionTimestamp", Long.toString(U));
            b.set("lastActiveUserSessionTimestamp", Long.toString(V));
            b.set("accumulatedApplicationSessionTime", Long.toString(N));
            b.set("accumulatedActiveUserSessionTime", Long.toString(P));
            b.set("accumulatedUserSessionTime", Long.toString(O));
            b.set("activeUserSessionCount", Long.toString(S));
            b.set("userSessionCount", Long.toString(R));
            b.set("lastUserInteractionTimestamp", Long.toString(X));
            b.set("userInteractionCount", Integer.toString(W));
            b.set("previousGenesis", Long.toString(K));
            b.set("genesis", Long.toString(J));
            b.set("applicationSessionCountKey", Integer.toString(Q));
            return;
        }
          goto _L7
_L4:
        P = P + l2;
        V = l1;
_L5:
        O = O + l2;
        U = l1;
_L6:
        N = l2 + N;
        T = l1;
        if (true) goto _L3; else goto _L7
_L7:
        if (true) goto _L1; else goto _L8
_L8:
    }

    protected DispatchQueue c()
    {
        return new DispatchQueue(this);
    }

    void c(boolean flag)
    {
        af = flag;
    }

    protected TaskExecutor d()
    {
        return new TaskExecutor(this);
    }

    protected void d(boolean flag)
    {
        if (!ao)
        {
            return;
        } else
        {
            o = flag;
            return;
        }
    }

    public void disableAutoUpdate()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = ao;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        w();
        m = true;
        l = -1L;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected MeasurementDispatcher e()
    {
        return new MeasurementDispatcher(this);
    }

    public void enableAutoUpdate(int i1, boolean flag, boolean flag1)
    {
        if (ao)
        {
            if (!flag1)
            {
                a(i1, flag);
                return;
            }
            if (f != null)
            {
                f.execute(new v(this, i1, flag), flag1);
                return;
            }
        }
    }

    protected KeepAliveAlarmReceiver f()
    {
        return new KeepAliveAlarmReceiver(this, 0x5265c00L);
    }

    public void flush(boolean flag)
    {
        while (!ao || f == null) 
        {
            return;
        }
        f.execute(new u(this), flag);
    }

    protected OfflineMeasurementsCache g()
    {
        return new OfflineMeasurementsCache(this);
    }

    public int getActiveUserSessionCountDelta(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = -1;
        int j1;
        if (S < 0)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        j1 = S;
        i1 = j1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        i1 = j1;
        if (!ao)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        S = 0;
        b.set("activeUserSessionCount", Integer.toString(S));
        i1 = j1;
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public long getActiveUserSessionTimeDelta(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = P;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (ao)
        {
            P = 0L;
            b.set("accumulatedActiveUserSessionTime", Long.toString(P));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public Context getAppContext()
    {
        return ac;
    }

    public String getAppName()
    {
        Object obj;
        PackageManager packagemanager;
        if (ab != null && ab.length() != 0 || ac == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        obj = ac.getPackageName();
        packagemanager = ac.getPackageManager();
        obj = packagemanager.getApplicationLabel(packagemanager.getApplicationInfo(((String) (obj)), 0));
        if (obj != null)
        {
            try
            {
                setAppName(obj.toString(), false);
            }
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
            {
                ab = b.get("appName");
            }
        }
        return ab;
    }

    public int getApplicationSessionCountDelta(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = Q;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (ao)
        {
            Q = 0;
            b.set("applicationSessionCountKey", Integer.toString(Q));
        }
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public long getApplicationSessionTimeDelta(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = N;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (ao)
        {
            N = 0L;
            b.set("accumulatedApplicationSessionTime", Long.toString(N));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public ApplicationState getApplicationState()
    {
        return z;
    }

    public String getAutoStartLabel(String s1)
    {
        return (String)ae.get(s1);
    }

    public HashMap getAutoStartLabels()
    {
        return ae;
    }

    public long getAutoUpdateInterval()
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = l;
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public long getBackgroundTimeDelta(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = G;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (ao)
        {
            G = 0L;
            b.set("accumulatedBackgroundTime", Long.toString(G));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public long getBackgroundTotalTime(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = E;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (ao)
        {
            E = 0L;
            b.set("totalBackgroundTime", Long.toString(E));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public CacheFlusher getCacheFlusher()
    {
        return d;
    }

    public long getCacheFlushingInterval()
    {
        return ag;
    }

    public int getCacheMaxBatchFiles()
    {
        if (a != null)
        {
            return a.getCacheMaxBatchFiles();
        } else
        {
            return 100;
        }
    }

    public int getCacheMaxFlushesInARow()
    {
        if (a != null)
        {
            return a.getCacheMaxPosts();
        } else
        {
            return 10;
        }
    }

    public int getCacheMaxMeasurements()
    {
        if (a != null)
        {
            return a.getCacheMaxMeasurements();
        } else
        {
            return 2000;
        }
    }

    public long getCacheMeasurementExpiry()
    {
        if (a != null)
        {
            return a.getCacheMeasurementExpiry();
        } else
        {
            return 31L;
        }
    }

    public long getCacheMinutesToRetry()
    {
        if (a != null)
        {
            return a.getCacheWaitMinutes();
        } else
        {
            return 30L;
        }
    }

    public int getColdStartCount()
    {
        return r.get();
    }

    public long getColdStartId()
    {
        return q;
    }

    public ConnectivityChangeReceiver getConnectivityReceiver()
    {
        return h;
    }

    public String getCrossPublisherId()
    {
        if (an == null)
        {
            return null;
        } else
        {
            return an.getCrossPublisherId();
        }
    }

    public String getCurrentActivityName()
    {
        return x;
    }

    public String getCurrentVersion()
    {
        return u;
    }

    public String getCustomerC2()
    {
        return (String)getLabels().get("c2");
    }

    public boolean getErrorHandlingEnabled()
    {
        return ah;
    }

    public long getFirstInstallId()
    {
        return t;
    }

    public long getForegroundTimeDelta(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = H;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (ao)
        {
            H = 0L;
            b.set("accumulatedForegroundTime", Long.toString(H));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public long getForegroundTotalTime(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = D;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (ao)
        {
            D = 0L;
            b.set("totalForegroundTime", Long.toString(D));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public int getForegroundTransitionsCountDelta(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = C.get();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        if (ao)
        {
            C.set(0);
            b.set("foregroundTransitionsCount", Long.toString(C.get()));
        }
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public long getGenesis()
    {
        return J;
    }

    public IdHelper getIdHelper()
    {
        return an;
    }

    public long getInactiveTimeDelta(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = I;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (ao)
        {
            I = 0L;
            b.set("accumulatedInactiveTime", Long.toString(I));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public long getInactiveTotalTime(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = F;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (ao)
        {
            F = 0L;
            b.set("totalInactiveTime", Long.toString(F));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public long getInstallId()
    {
        return s;
    }

    public KeepAliveAlarmReceiver getKeepAliveAlarmReceiver()
    {
        return c;
    }

    public String getLabel(String s1)
    {
        return (String)ad.get(s1);
    }

    public HashMap getLabels()
    {
        return ad;
    }

    public TransmissionMode getLiveTransmissionMode()
    {
        return ak;
    }

    public MeasurementDispatcher getMeasurementDispatcher()
    {
        return g;
    }

    public String[] getMeasurementLabelOrder()
    {
        return am;
    }

    public OfflineMeasurementsCache getOfflineCache()
    {
        return a;
    }

    public TransmissionMode getOfflineTransmissionMode()
    {
        return al;
    }

    public String getPixelURL()
    {
        return aa;
    }

    public long getPreviousGenesis()
    {
        return K;
    }

    public String getPreviousVersion()
    {
        this;
        JVM INSTR monitorenter ;
        String s1;
        s1 = v;
        if (v != null && v.length() > 0)
        {
            b.remove("previousVersion");
            v = null;
        }
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public String getPublisherSecret()
    {
        if (an == null)
        {
            return "";
        } else
        {
            return an.getPublisherSecret();
        }
    }

    public DispatchQueue getQueue()
    {
        return e;
    }

    public int getRunsCount()
    {
        return p.get();
    }

    public String getSalt()
    {
        return getPublisherSecret();
    }

    public SessionState getSessionState()
    {
        return M;
    }

    public Storage getStorage()
    {
        return b;
    }

    public TaskExecutor getTaskExecutor()
    {
        return f;
    }

    public int getUserInteractionCount(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = W;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (ao)
        {
            W = 0;
            b.set("userInteractionCount", Integer.toString(W));
        }
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public int getUserSessionCountDelta(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = -1;
        int j1;
        if (R < 0)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        j1 = R;
        i1 = j1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        i1 = j1;
        if (!ao)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        R = 0;
        b.set("userSessionCount", Integer.toString(R));
        i1 = j1;
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public long getUserSessionTimeDelta(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = O;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (ao)
        {
            O = 0L;
            b.set("accumulatedUserSessionTime", Long.toString(O));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public String getVersion()
    {
        return "2.1409.23";
    }

    public String getVisitorId()
    {
        if (an == null)
        {
            return null;
        } else
        {
            return an.getVisitorId();
        }
    }

    protected CacheFlusher h()
    {
        return new CacheFlusher(this);
    }

    public boolean handleColdStart()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = ao;
        if (flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (o)
        {
            continue; /* Loop/switch isn't completed */
        }
        o = true;
        r.getAndIncrement();
        b.set("coldStartCount", String.valueOf(r));
        q = Date.unixTime();
        flag = true;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected ConnectivityChangeReceiver i()
    {
        return new ConnectivityChangeReceiver(this);
    }

    public void incrementRunsCount()
    {
        if (!ao)
        {
            return;
        } else
        {
            p.getAndIncrement();
            b.set("runs", Long.toString(p.get()));
            return;
        }
    }

    public boolean isAutoStartEnabled()
    {
        return w;
    }

    public boolean isAutoUpdateEnabled()
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = l;
        boolean flag;
        if (l1 > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean isEnabled()
    {
        return ao;
    }

    public boolean isKeepAliveEnabled()
    {
        return af;
    }

    public boolean isSecure()
    {
        return aj;
    }

    protected void j()
    {
        L = Utils.getLong(b.get("lastApplicationAccumulationTimestamp"), -1L);
        Y = Utils.getLong(b.get("lastSessionAccumulationTimestamp"), -1L);
        T = Utils.getLong(b.get("lastApplicationSessionTimestamp"), -1L);
        U = Utils.getLong(b.get("lastUserSessionTimestamp"), -1L);
        V = Utils.getLong(b.get("lastActiveUserSessionTimestamp"), -1L);
        C.set(Utils.getInteger(b.get("foregroundTransitionsCount")));
        H = Utils.getLong(b.get("accumulatedForegroundTime"));
        G = Utils.getLong(b.get("accumulatedBackgroundTime"));
        I = Utils.getLong(b.get("accumulatedInactiveTime"));
        D = Utils.getLong(b.get("totalForegroundTime"));
        E = Utils.getLong(b.get("totalBackgroundTime"));
        F = Utils.getLong(b.get("totalInactiveTime"));
        N = Utils.getLong(b.get("accumulatedApplicationSessionTime"));
        P = Utils.getLong(b.get("accumulatedActiveUserSessionTime"));
        O = Utils.getLong(b.get("accumulatedUserSessionTime"));
        S = Utils.getInteger(b.get("activeUserSessionCount"), -1);
        R = Utils.getInteger(b.get("userSessionCount"), -1);
        X = Utils.getLong(b.get("lastUserInteractionTimestamp"), -1L);
        W = Utils.getInteger(b.get("userInteractionCount"), 0);
        Q = Utils.getInteger(b.get("applicationSessionCountKey"), 0);
        u = k();
        K = Utils.getLong(b.get("previousGenesis"), 0L);
        J = Utils.getLong(b.get("genesis"), -1L);
        long l1;
        if (J < 0L)
        {
            J = Date.unixTime();
            K = 0L;
            T = J;
            Q = Q + 1;
        } else
        {
            if (!p())
            {
                N = N + (Date.unixTime() - Y);
                b.set("accumulatedApplicationSessionTime", Long.toString(N));
            }
            T = J;
        }
        t = Utils.getLong(b.get("firstInstallId"), -1L);
        if (t < 0L)
        {
            t = J;
            s = J;
            b.set("currentVersion", u);
            b.set("firstInstallId", String.valueOf(t));
            b.set("installId", String.valueOf(s));
        } else
        {
            if (b.has("previousVersion").booleanValue())
            {
                v = b.get("previousVersion");
            }
            String s1 = b.get("currentVersion");
            if (!s1.equals(u))
            {
                v = s1;
                b.set("previousVersion", v);
                s = J;
                b.set("installId", String.valueOf(s));
            } else
            {
                s = Utils.getLong(b.get("installId"), -1L);
            }
            b.set("currentVersion", u);
        }
        b.set("genesis", Long.toString(J));
        b.set("previousGenesis", Long.toString(K));
        l1 = Date.unixTime();
        if (L >= 0L)
        {
            long l2 = l1 - L;
            I = I + l2;
            b.set("accumulatedInactiveTime", Long.toString(I));
            F = l2 + F;
            b.set("totalInactiveTime", Long.toString(F));
        }
        L = l1;
        Y = l1;
        b.set("lastApplicationAccumulationTimestamp", Long.toString(L));
        b.set("lastSessionAccumulationTimestamp", Long.toString(Y));
        b.set("lastApplicationSessionTimestamp", Long.toString(T));
        if (!b.has("runs").booleanValue())
        {
            b.set("runs", "0");
        }
        p.set(Utils.getInteger(b.get("runs")));
        r.set(Utils.getInteger(b.get("coldStartCount")));
    }

    protected String k()
    {
        String s1 = ac.getPackageName();
        try
        {
            s1 = ac.getPackageManager().getPackageInfo(s1, 0).versionName;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return "0";
        }
        return s1;
    }

    protected void l()
    {
        if (ac == null) goto _L2; else goto _L1
_L1:
        Object obj = ac.getResources().getAssets();
        Object obj1;
        obj1 = ((AssetManager) (obj)).open("comScore.properties");
        obj = new Properties();
        ((Properties) (obj)).load(((java.io.InputStream) (obj1)));
        Constants.DEBUG = Utils.getBoolean(a("Debug", ((Properties) (obj)), false));
        aj = Utils.getBoolean(a("Secure", ((Properties) (obj)), false));
        obj1 = a("PublisherSecret", ((Properties) (obj)), true);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        b(((String) (obj1)));
        obj1 = a("AppName", ((Properties) (obj)), true);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        c(((String) (obj1)));
        obj1 = a("CustomerC2", ((Properties) (obj)), false);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        d(((String) (obj1)));
        obj1 = a("PixelURL", ((Properties) (obj)), false);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        a(((String) (obj1)));
        obj1 = a("OfflineURL", ((Properties) (obj)), false);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        a.setUrl(((String) (obj1)));
        obj1 = a("LiveTransmissionMode", ((Properties) (obj)), false);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        ak = TransmissionMode.valueOf(((String) (obj1)).toUpperCase(Locale.getDefault()));
_L5:
        obj1 = a("OfflineTransmissionMode", ((Properties) (obj)), false);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        al = TransmissionMode.valueOf(((String) (obj1)).toUpperCase(Locale.getDefault()));
_L3:
        int i1;
        af = Utils.getBoolean(a("KeepAliveEnabled", ((Properties) (obj)), false), true);
        i1 = Utils.getInteger(a("CacheMaxSize", ((Properties) (obj)), false), -1);
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        a.setCacheMaxMeasurements(i1);
        i1 = Utils.getInteger(a("CacheMaxBatchSize", ((Properties) (obj)), false), -1);
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_293;
        }
        a.setCacheMaxBatchFiles(i1);
        i1 = Utils.getInteger(a("CacheMaxFlushesInARow", ((Properties) (obj)), false), -1);
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_319;
        }
        a.setCacheMaxPosts(i1);
        i1 = Utils.getInteger(a("CacheMinutesToRetry", ((Properties) (obj)), false), -1);
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_345;
        }
        a.setCacheWaitMinutes(i1);
        i1 = Utils.getInteger(a("CacheExpiryInDays", ((Properties) (obj)), false), -1);
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_371;
        }
        a.setCacheMeasurementExpiry(i1);
        long l1 = Utils.getLong(a("CacheFlushingInterval", ((Properties) (obj)), false), -1L);
        if (l1 < 0L)
        {
            break MISSING_BLOCK_LABEL_415;
        }
        ag = l1;
        if (d != null)
        {
            d.update();
        }
        boolean flag;
        setErrorHandlingEnabled(Utils.getBoolean(a("ErrorHandlingEnabled", ((Properties) (obj)), false)));
        w = Utils.getBoolean(a("AutoStartEnabled", ((Properties) (obj)), false), true);
        flag = Utils.getBoolean(a("AutoUpdateInForegroundOnly", ((Properties) (obj)), false), true);
        i1 = Utils.getInteger(a("AutoUpdateInterval", ((Properties) (obj)), false), -1);
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
                if (Constants.DEBUG)
                {
                    CSLog.printStackTrace(ioexception);
                    return;
                }
            }
        }
          goto _L2
        illegalargumentexception;
        ak = TransmissionMode.DEFAULT;
        continue; /* Loop/switch isn't completed */
        illegalargumentexception;
        al = TransmissionMode.DEFAULT;
          goto _L3
_L2:
        return;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected Context m()
    {
        return ac;
    }

    protected void n()
    {
        if (ao)
        {
            if (j != null)
            {
                j.cancel();
                k = null;
                j = null;
            }
            long l1 = Date.unixTime();
            SessionState sessionstate;
            ApplicationState applicationstate;
            ApplicationState applicationstate1;
            SessionState sessionstate1;
            if (A.get() > 0)
            {
                applicationstate = ApplicationState.FOREGROUND;
            } else
            if (B.get() > 0)
            {
                applicationstate = ApplicationState.BACKGROUND_UX_ACTIVE;
            } else
            {
                applicationstate = ApplicationState.INACTIVE;
            }
            if (l1 - X < 0x493e0L)
            {
                sessionstate = SessionState.ACTIVE_USER;
            } else
            if (B.get() > 0)
            {
                sessionstate = SessionState.USER;
            } else
            if (A.get() > 0)
            {
                sessionstate = SessionState.APPLICATION;
            } else
            {
                sessionstate = SessionState.INACTIVE;
            }
            applicationstate1 = z;
            sessionstate1 = M;
            if (applicationstate != applicationstate1 || sessionstate != sessionstate1)
            {
                k = new ac(this, applicationstate1, applicationstate, sessionstate1, sessionstate);
                if (n && applicationstate != ApplicationState.FOREGROUND)
                {
                    j = new Timer();
                    j.schedule(k, 300L);
                    return;
                } else
                {
                    k.run();
                    k = null;
                    return;
                }
            }
        }
    }

    public void notify(EventType eventtype, HashMap hashmap, boolean flag)
    {
        if (ao)
        {
            if (!flag)
            {
                a(eventtype, hashmap);
                return;
            }
            if (f != null)
            {
                f.execute(new y(this, eventtype, hashmap), flag);
                return;
            }
        }
    }

    protected void o()
    {
        if (!ao)
        {
            return;
        }
        if (Z != null)
        {
            Z.cancel();
            Z = null;
        }
        Z = new Timer();
        Z.schedule(new UserInteractionTask(), 0x493e0L);
    }

    public void onEnterForeground()
    {
        while (!ao || f == null) 
        {
            return;
        }
        f.execute(new w(this), true);
    }

    public void onExitForeground()
    {
        while (!ao || f == null) 
        {
            return;
        }
        f.execute(new aa(this), true);
    }

    public void onUserInteraction()
    {
        while (!ao || f == null) 
        {
            return;
        }
        f.execute(new ab(this), true);
    }

    public void onUxActive()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = ao;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (f != null)
        {
            f.execute(new a(this), true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void onUxInactive()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = ao;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (f != null)
        {
            f.execute(new l(this), true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected boolean p()
    {
        boolean flag = false;
        if (!ao)
        {
            return false;
        }
        long l1 = Date.unixTime();
        if (l1 - T > 0x1b7740L)
        {
            K = J;
            J = l1;
            Q = Q + 1;
            flag = true;
        }
        T = l1;
        return flag;
    }

    protected void q()
    {
        if (!ao)
        {
            return;
        }
        long l1 = Date.unixTime();
        if (l1 - V >= 0x493e0L)
        {
            S = S + 1;
        }
        V = l1;
    }

    protected void r()
    {
        if (!ao)
        {
            return;
        }
        long l1 = Date.unixTime();
        if (l1 - U >= 0x493e0L)
        {
            R = R + 1;
        }
        U = l1;
    }

    public void reset()
    {
        this;
        JVM INSTR monitorenter ;
        ak = TransmissionMode.DEFAULT;
        al = TransmissionMode.DEFAULT;
        aj = false;
        am = Constants.LABELS_ORDER;
        z = ApplicationState.INACTIVE;
        M = SessionState.INACTIVE;
        o = false;
        p.set(0);
        q = -1L;
        r.set(0);
        t = -1L;
        s = -1L;
        u = null;
        v = null;
        A.set(0);
        B.set(0);
        D = 0L;
        E = 0L;
        F = 0L;
        G = 0L;
        H = 0L;
        I = 0L;
        N = 0L;
        P = 0L;
        O = 0L;
        J = -1L;
        K = 0L;
        S = -1;
        R = -1;
        W = 0;
        X = -1L;
        L = -1L;
        Y = -1L;
        T = -1L;
        U = -1L;
        V = -1L;
        s = -1L;
        t = -1L;
        disableAutoUpdate();
        if (j != null)
        {
            j.cancel();
            k = null;
            j = null;
        }
        if (Z != null)
        {
            Z.cancel();
            Z = null;
        }
        if (c != null)
        {
            c.cancel();
        }
        if (d != null)
        {
            d.stop();
        }
        if (f != null)
        {
            f.clear();
        }
        if (b != null)
        {
            b.close();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void s()
    {
        a(true);
    }

    public void setAppContext(Context context)
    {
        if (ac != null || context == null)
        {
            return;
        } else
        {
            ac = context;
            f = d();
            f.execute(new ad(this), true);
            return;
        }
    }

    public void setAppName(String s1, boolean flag)
    {
        if (ao)
        {
            if (!flag)
            {
                c(s1);
                return;
            }
            if (f != null)
            {
                f.execute(new d(this, s1), flag);
                return;
            }
        }
    }

    public void setAutoStartEnabled(boolean flag, boolean flag1)
    {
        if (!ao)
        {
            return;
        } else
        {
            f.execute(new m(this, flag), flag1);
            return;
        }
    }

    public void setAutoStartLabel(String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = ao;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ae.put(s1, s2);
        if (true) goto _L1; else goto _L3
_L3:
        s1;
        throw s1;
    }

    public void setAutoStartLabels(HashMap hashmap)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = ao;
          goto _L1
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L1:
        if (!flag || hashmap == null) goto _L3; else goto _L2
_L2:
        ae.putAll(hashmap);
        if (true) goto _L3; else goto _L4
_L4:
        hashmap;
        throw hashmap;
    }

    public void setCacheFlushingInterval(long l1, boolean flag)
    {
        while (!ao || f == null || ag == l1) 
        {
            return;
        }
        f.execute(new s(this, l1), flag);
    }

    public void setCacheMaxBatchFiles(int i1, boolean flag)
    {
        while (!ao || f == null || a == null) 
        {
            return;
        }
        f.execute(new o(this, i1), flag);
    }

    public void setCacheMaxFlushesInARow(int i1, boolean flag)
    {
        while (!ao || f == null || a == null) 
        {
            return;
        }
        f.execute(new p(this, i1), flag);
    }

    public void setCacheMaxMeasurements(int i1, boolean flag)
    {
        while (!ao || f == null || a == null) 
        {
            return;
        }
        f.execute(new n(this, i1), flag);
    }

    public void setCacheMeasurementExpiry(int i1, boolean flag)
    {
        while (!ao || f == null || a == null) 
        {
            return;
        }
        f.execute(new r(this, i1), flag);
    }

    public void setCacheMinutesToRetry(int i1, boolean flag)
    {
        while (!ao || f == null || a == null) 
        {
            return;
        }
        f.execute(new q(this, i1), flag);
    }

    public void setCurrentActivityName(String s1)
    {
        x = s1;
    }

    public void setCustomerC2(String s1, boolean flag)
    {
        if (ao && s1 != null && s1.length() != 0)
        {
            if (!flag)
            {
                d(s1);
                return;
            }
            if (f != null)
            {
                f.execute(new g(this, s1), flag);
                return;
            }
        }
    }

    public void setDebug(boolean flag)
    {
        if (!ao)
        {
            return;
        } else
        {
            f.execute(new k(this, flag), true);
            return;
        }
    }

    public void setEnabled(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!flag) goto _L2; else goto _L1
_L1:
        if (ao) goto _L2; else goto _L3
_L3:
        ao = true;
        setErrorHandlingEnabled(ap);
        reset();
        getConnectivityReceiver().start();
        getKeepAliveAlarmReceiver().start(3000);
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (ao)
        {
            ao = false;
            ap = ah;
            if (Thread.getDefaultUncaughtExceptionHandler() != ai)
            {
                Thread.setDefaultUncaughtExceptionHandler(ai);
            }
            getConnectivityReceiver().stop();
            getKeepAliveAlarmReceiver().stop();
            getOfflineCache().clear();
        }
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public void setErrorHandlingEnabled(boolean flag)
    {
        if (ao)
        {
            ah = flag;
            if (flag)
            {
                Thread.setDefaultUncaughtExceptionHandler(new CustomExceptionHandler(this));
                return;
            }
            if (Thread.getDefaultUncaughtExceptionHandler() != ai)
            {
                Thread.setDefaultUncaughtExceptionHandler(ai);
                return;
            }
        }
    }

    public void setKeepAliveEnabled(boolean flag, boolean flag1)
    {
        if (ao)
        {
            if (!flag1)
            {
                c(flag);
                return;
            }
            if (f != null)
            {
                f.execute(new b(this, flag), flag1);
                return;
            }
        }
    }

    public void setLabel(String s1, String s2, boolean flag)
    {
        if (ao)
        {
            if (!flag)
            {
                b(s1, s2);
                return;
            }
            if (f != null)
            {
                f.execute(new f(this, s1, s2), flag);
                return;
            }
        }
    }

    public void setLabels(HashMap hashmap, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = ao;
          goto _L1
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L1:
        if (!flag1 || hashmap == null) goto _L3; else goto _L2
_L2:
        if (f != null)
        {
            f.execute(new e(this, hashmap), flag);
        }
        if (true) goto _L3; else goto _L4
_L4:
        hashmap;
        throw hashmap;
    }

    public void setMeasurementLabelOrder(String as[], boolean flag)
    {
        while (!ao || f == null || as == am || as == null || as.length <= 0) 
        {
            return;
        }
        f.execute(new t(this, as), flag);
    }

    public void setOfflineURL(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = ao;
          goto _L1
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L1:
        if (!flag || s1 == null) goto _L3; else goto _L2
_L2:
        if (s1.length() != 0 && f != null)
        {
            f.execute(new af(this, s1), true);
        }
        if (true) goto _L3; else goto _L4
_L4:
        s1;
        throw s1;
    }

    public void setPixelURL(String s1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = ao;
          goto _L1
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L1:
        if (!flag1 || s1 == null) goto _L3; else goto _L2
_L2:
        if (s1.length() == 0) goto _L3; else goto _L4
_L4:
        if (flag) goto _L6; else goto _L5
_L5:
        a(s1);
          goto _L3
        s1;
        throw s1;
_L6:
        if (f == null) goto _L3; else goto _L7
_L7:
        f.execute(new ae(this, s1), flag);
          goto _L3
    }

    public void setPublisherSecret(String s1, boolean flag)
    {
        while (!ao || s1 == null || s1.length() == 0 || f == null) 
        {
            return;
        }
        f.execute(new c(this, s1), flag);
    }

    public void setSecure(boolean flag, boolean flag1)
    {
        if (ao)
        {
            if (!flag1)
            {
                aj = flag;
                return;
            }
            if (f != null)
            {
                f.execute(new j(this, flag), flag1);
                return;
            }
        }
    }

    protected void t()
    {
        b(true);
    }

    protected OfflineMeasurementsCache u()
    {
        return a;
    }

    public void update()
    {
        this;
        JVM INSTR monitorenter ;
        update(true);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void update(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = ao;
        if (flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (j != null)
        {
            j.cancel();
            j = null;
            k.run();
            k = null;
        }
        a(flag);
        b(flag);
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected void v()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = ao;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        w();
        if (l >= 60000L)
        {
            i = new Timer("AutoUpdateTimer");
            i.scheduleAtFixedRate(new x(this), new java.util.Date(Date.unixTime() + l), l);
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected void w()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = ao;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (i != null)
        {
            i.cancel();
            i = null;
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected void x()
    {
    }

    protected void y()
    {
    }

    boolean z()
    {
        return ac == null || an.isPublisherSecretEmpty() || aa == null || aa.length() == 0;
    }

    private class UserInteractionTask extends TimerTask
    {

        final Core a;

        public void run()
        {
label0:
            {
                synchronized (a)
                {
                    if (Core.a(a))
                    {
                        break label0;
                    }
                }
                return;
            }
            if (a.Z != null)
            {
                a.Z.cancel();
                a.Z = null;
                a.n();
            }
            core;
            JVM INSTR monitorexit ;
            return;
            exception;
            core;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public UserInteractionTask()
        {
            a = Core.this;
            super();
        }
    }

}
