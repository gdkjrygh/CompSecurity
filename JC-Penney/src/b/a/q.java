// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Process;
import com.crittercism.app.Transaction;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package b.a:
//            ib, l, n, o, 
//            et, ex, gt, s, 
//            ei, ag, ap, ar, 
//            x, w, kl, eu, 
//            jh, v, cw, cx, 
//            dk, au, be, ef, 
//            ea, ab, dp, dt, 
//            r, k, t, u, 
//            en, er, br, ca, 
//            cb, bd, es, eq, 
//            du, db, eg

public final class q
    implements ib, l, n, o
{

    static q a;
    protected gt A;
    public en B;
    es C;
    public ar D;
    Map E;
    public eq F;
    int G;
    public boolean H;
    public Set I;
    private be J;
    private be K;
    public boolean b;
    public Context c;
    public String d;
    public final ConditionVariable e = new ConditionVariable(false);
    public final ConditionVariable f = new ConditionVariable(false);
    public et g;
    be h;
    be i;
    be j;
    be k;
    be l;
    be m;
    be n;
    be o;
    be p;
    public du q;
    public ei r;
    jh s;
    ExecutorService t;
    public ExecutorService u;
    public k v;
    boolean w;
    public boolean x;
    public String y;
    public ab z;

    protected q()
    {
        b = false;
        c = null;
        d = null;
        g = new et();
        q = null;
        r = null;
        s = null;
        t = Executors.newCachedThreadPool(new ex());
        u = Executors.newSingleThreadExecutor(new ex());
        w = false;
        x = false;
        y = "";
        C = null;
        E = new HashMap();
        F = null;
        G = 0;
        H = false;
        I = new HashSet();
        A = new gt(u);
    }

    public static q A()
    {
        if (a == null)
        {
            a = new q();
        }
        return a;
    }

    public static boolean B()
    {
        boolean flag1 = false;
        StackTraceElement astacktraceelement[] = Thread.currentThread().getStackTrace();
        int i1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i1 < astacktraceelement.length)
                {
                    StackTraceElement stacktraceelement = astacktraceelement[i1];
                    if (!stacktraceelement.getMethodName().equals("onCreate") && !stacktraceelement.getMethodName().equals("onResume"))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i1++;
        } while (true);
    }

    public final void C()
    {
        int j1 = Process.myUid();
        int k1 = Process.myPid();
        Object obj = (ActivityManager)c.getSystemService("activity");
        Iterator iterator = ((ActivityManager) (obj)).getRunningAppProcesses().iterator();
        int i1 = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (((android.app.ActivityManager.RunningAppProcessInfo)iterator.next()).uid == j1)
            {
                i1++;
            }
        } while (true);
        if (i1 <= 1)
        {
            x = false;
        } else
        {
            obj = ((ActivityManager) (obj)).getRunningServices(0x7fffffff).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                if (((android.app.ActivityManager.RunningServiceInfo)((Iterator) (obj)).next()).pid == k1)
                {
                    x = true;
                    return;
                }
            }
        }
    }

    public final boolean D()
    {
        e.block();
        return g.b();
    }

    public final void E()
    {
        s s1;
        if (!x)
        {
            if (!r.a(s1 = new s(this, this)))
            {
                t.execute(s1);
                return;
            }
        }
    }

    public final String a()
    {
        String s2 = d;
        String s1 = s2;
        if (s2 == null)
        {
            s1 = "";
        }
        return s1;
    }

    public final String a(String s1, String s2)
    {
        Object obj = null;
        SharedPreferences sharedpreferences = c.getSharedPreferences(s1, 0);
        s1 = obj;
        if (sharedpreferences != null)
        {
            s1 = sharedpreferences.getString(s2, null);
        }
        return s1;
    }

    public final void a(ap ap1)
    {
        ar ar1 = D;
        if (D != null)
        {
            ag.a(ap1);
            ag.h();
            if (ap1.a)
            {
                D.a(ap1.b, TimeUnit.SECONDS);
                D.b();
                return;
            }
        }
    }

    public final void a(db db)
    {
        if (!g.b())
        {
            if (!r.a(db = new x(this, db)))
            {
                u.execute(db);
                return;
            }
        }
    }

    public final void a(eg eg)
    {
        eg = new w(this, eg);
        if (!r.a(eg))
        {
            u.execute(eg);
        }
    }

    public final void a(kl kl1)
    {
        while (s == null || !kl1.a || kl1.c) 
        {
            return;
        }
        eu.a("Enabling OPTMZ");
        s.a(kl1.d, TimeUnit.SECONDS);
        s.a();
    }

    public final void a(String s1)
    {
        v v1;
        if (!g.b())
        {
            if (!r.a(v1 = new v(this, new cw(s1, cx.a))))
            {
                (new StringBuilder("SENDING ")).append(s1).append(" TO EXECUTOR");
                eu.b();
                u.execute(v1);
                return;
            }
        }
    }

    public final void a(String s1, String s2, int i1)
    {
        s1 = c.getSharedPreferences(s1, 0);
        if (s1 != null)
        {
            s1 = s1.edit();
            if (s1 != null)
            {
                s1.remove(s2);
                s1.putInt(s2, i1);
                s1.commit();
            }
        }
    }

    final void a(Throwable throwable)
    {
        List list = ag.a(this, throwable instanceof dk);
        throwable = new au(throwable, Thread.currentThread().getId());
        throwable.a("crashed_session", l);
        if (K.b() > 0)
        {
            throwable.a("previous_session", K);
        }
        throwable.a(m);
        throwable.b(n);
        throwable.d = new JSONArray();
        Iterator iterator = Thread.getAllStackTraces().entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            HashMap hashmap = new HashMap();
            Thread thread = (Thread)entry.getKey();
            if (thread.getId() != ((au) (throwable)).a)
            {
                hashmap.put("name", thread.getName());
                hashmap.put("id", Long.valueOf(thread.getId()));
                hashmap.put("state", thread.getState().name());
                hashmap.put("stacktrace", new JSONArray(Arrays.asList((Object[])entry.getValue())));
                ((au) (throwable)).d.put(new JSONObject(hashmap));
            }
        } while (true);
        throwable.a(list);
        k.a(throwable);
        throwable = new ef(c);
        throwable.a(h, new ea(), z.n(), "/v0/appload", null, this, new dp());
        throwable.a(i, new ea(), z.k(), "/android_v2/handle_exceptions", null, this, new dt());
        throwable.a(j, new ea(), z.k(), "/android_v2/handle_ndk_crashes", null, this, new dt());
        throwable.a(k, new ea(), z.k(), "/android_v2/handle_crashes", null, this, new dt());
        try
        {
            throwable.a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            (new StringBuilder("InterruptedException in logCrashException: ")).append(throwable.getMessage());
            eu.b();
            eu.c();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            (new StringBuilder("Unexpected throwable in logCrashException: ")).append(throwable.getMessage());
        }
        eu.b();
        eu.c();
    }

    public final void a(JSONObject jsonobject)
    {
        if (!x)
        {
            if (!r.a(jsonobject = new r(this, this, jsonobject)))
            {
                u.execute(jsonobject);
                return;
            }
        }
    }

    public final int b(String s1, String s2)
    {
        int i1 = 0;
        s1 = c.getSharedPreferences(s1, 0);
        if (s1 != null)
        {
            i1 = s1.getInt(s2, 0);
        }
        return i1;
    }

    public final String b()
    {
        return v.a;
    }

    public final void b(String s1)
    {
        if (!x) goto _L2; else goto _L1
_L1:
        eu.c((new StringBuilder("Transactions are not supported for services. Ignoring Crittercism.beginTransaction() call for ")).append(s1).append(".").toString());
_L4:
        return;
_L2:
        Transaction transaction = Transaction.a(s1);
        if (!(transaction instanceof ag)) goto _L4; else goto _L3
_L3:
        Map map = E;
        map;
        JVM INSTR monitorenter ;
        Transaction transaction1 = (Transaction)E.remove(s1);
        if (transaction1 == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        ((ag)transaction1).g();
        if (E.size() <= 50)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        eu.c((new StringBuilder("Crittercism only supports a maximum of 50 concurrent transactions. Ignoring Crittercism.beginTransaction() call for ")).append(s1).append(".").toString());
        map;
        JVM INSTR monitorexit ;
        return;
        s1;
        map;
        JVM INSTR monitorexit ;
        throw s1;
        E.put(s1, transaction);
        transaction.a();
        map;
        JVM INSTR monitorexit ;
    }

    public final void b(Throwable throwable)
    {
        this;
        JVM INSTR monitorenter ;
        if (throwable != null) goto _L2; else goto _L1
_L1:
        eu.c("Calling logHandledException with a null java.lang.Throwable. Nothing will be reported to Crittercism");
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!x)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        throwable = new t(this, throwable, Thread.currentThread().getId());
        if (!r.a(throwable))
        {
            u.execute(throwable);
        }
          goto _L3
        throwable;
        throw throwable;
        throwable = new u(this, throwable, Thread.currentThread().getId());
        if (!r.a(throwable))
        {
            u.execute(throwable);
        }
          goto _L3
    }

    public final String c()
    {
        String s1 = "";
        if (B != null)
        {
            s1 = B.a();
        }
        return s1;
    }

    public final void c(String s1)
    {
        if (x)
        {
            eu.c((new StringBuilder("Transactions are not supported for services. Ignoring Crittercism.endTransaction() call for ")).append(s1).append(".").toString());
        } else
        {
            synchronized (E)
            {
                s1 = (Transaction)E.remove(s1);
            }
            if (s1 != null)
            {
                s1.b();
                return;
            }
        }
    }

    public final boolean c(String s1, String s2)
    {
        boolean flag = false;
        s1 = c.getSharedPreferences(s1, 0);
        if (s1 != null)
        {
            flag = s1.getBoolean(s2, false);
        }
        return flag;
    }

    public final String d()
    {
        return "5.3.3";
    }

    public final void d(String s1)
    {
        if (x)
        {
            eu.c((new StringBuilder("Transactions are not supported for services. Ignoring Crittercism.failTransaction() call for ")).append(s1).append(".").toString());
        } else
        {
            synchronized (E)
            {
                s1 = (Transaction)E.remove(s1);
            }
            if (s1 != null)
            {
                s1.c();
                return;
            }
        }
    }

    public final int e()
    {
        int i1 = -1;
        if (g != null)
        {
            i1 = Integer.valueOf(g.a().a).intValue();
        }
        return i1;
    }

    public final String f()
    {
        return (new br()).a;
    }

    public final int g()
    {
        return (new ca()).a.intValue();
    }

    public final int h()
    {
        return (new cb()).a.intValue();
    }

    public final String i()
    {
        return "Android";
    }

    public final String j()
    {
        return Build.MODEL;
    }

    public final String k()
    {
        return android.os.Build.VERSION.RELEASE;
    }

    public final et l()
    {
        return g;
    }

    public final eq m()
    {
        return F;
    }

    public final be n()
    {
        return h;
    }

    public final be o()
    {
        return i;
    }

    public final be p()
    {
        return J;
    }

    public final be q()
    {
        return j;
    }

    public final be r()
    {
        return k;
    }

    public final be s()
    {
        return l;
    }

    public final be t()
    {
        return m;
    }

    public final be u()
    {
        return K;
    }

    public final be v()
    {
        return n;
    }

    public final be w()
    {
        return o;
    }

    public final be x()
    {
        return p;
    }

    public final es y()
    {
        return C;
    }

    public final void z()
    {
        if (x)
        {
            l = (new be(c, bd.f)).a(c);
        } else
        {
            l = new be(c, bd.f);
        }
        K = new be(c, bd.h);
        m = new be(c, bd.g);
        n = new be(c, bd.k);
        h = new be(c, bd.a);
        i = new be(c, bd.b);
        J = new be(c, bd.c);
        j = new be(c, bd.d);
        k = new be(c, bd.e);
        o = new be(c, bd.i);
        p = new be(c, bd.j);
        if (!x)
        {
            C = new es(c, d);
        }
    }
}
