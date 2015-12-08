// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public class anS
{
    public static interface a
    {

        public abstract void a(anM anm);

        public abstract void a(anM anm, String s, boolean flag);
    }

    public static abstract class b
        implements a
    {

        public void a(anM anm)
        {
        }

        public void a(anM anm, String s, boolean flag)
        {
        }

        public b()
        {
        }
    }

    static final class c
        implements a
    {

        final List a;

        public final void a()
        {
            a.clear();
        }

        public final void a(anM anm)
        {
            Object obj = new ArrayList(a);
            a.clear();
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((a)((Iterator) (obj)).next()).a(anm)) { }
        }

        public final void a(anM anm, String s, boolean flag)
        {
            for (Iterator iterator = a.iterator(); iterator.hasNext(); ((a)iterator.next()).a(anm, s, flag)) { }
        }

        private c()
        {
            a = new ArrayList();
        }

        c(byte byte0)
        {
            this();
        }
    }

    final class d
        implements Executor
    {

        private anS a;

        public final void execute(Runnable runnable)
        {
            Object obj1 = a.f;
            obj1;
            JVM INSTR monitorenter ;
            Object obj;
            if (a.g == null)
            {
                break MISSING_BLOCK_LABEL_73;
            }
            obj = a.g;
            if (!((anK.g) (obj)).b) goto _L2; else goto _L1
_L1:
            obj = anK.i(((anK.g) (obj)).c);
_L4:
            if (obj != null)
            {
                ((Executor) (obj)).execute(runnable);
                return;
            } else
            {
                anK.c();
                return;
            }
_L2:
            obj = aov.a;
            continue; /* Loop/switch isn't completed */
            runnable;
            obj1;
            JVM INSTR monitorexit ;
            throw runnable;
            obj = null;
            if (true) goto _L4; else goto _L3
_L3:
        }

        private d()
        {
            a = anS.this;
            super();
        }

        d(byte byte0)
        {
            this();
        }
    }


    private int a;
    private final c b = new c((byte)0);
    protected final Context c;
    protected final anK d;
    final aoh e;
    final Object f = new Object();
    anK.g g;
    private final Map h = new HashMap();
    private final d i = new d((byte)0);

    anS(Context context, anK ank, aoh aoh1)
    {
        a = 1;
        d = ank;
        anR.a(aoh1.a());
        c = context;
        context = new aoh();
        ((aoh) (context)).a.putAll(aoh1.a);
        e = context;
    }

    public static anG a(Activity activity, anK ank, aoh aoh1)
    {
        return new anG(activity, ank, aoh1);
    }

    static void a(anS ans, String s, boolean flag)
    {
        synchronized (ans.f)
        {
            ans.h.put(s, Boolean.valueOf(flag));
            ans.b.a(ans.g, s, flag);
            if (ans.e())
            {
                ans.b.a(ans.g);
                ans.b.a();
            }
        }
        return;
        ans;
        obj;
        JVM INSTR monitorexit ;
        throw ans;
    }

    private void d()
    {
        boolean flag;
        if (a == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        anR.b(flag, "Checkout is stopped");
    }

    private boolean e()
    {
        anR.a(Thread.holdsLock(f), "Should be called from synchronized block");
        return h.size() == e.b();
    }

    public void a()
    {
        anR.a();
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        Object obj2;
        Object obj3;
        h.clear();
        b.a();
        if (a != 1)
        {
            a = 3;
        }
        if (g == null)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        anK.g g1 = g;
        obj3 = anK.a(g1.c);
        obj2 = g1.a;
        Object obj1 = ((aog) (obj3)).a;
        obj1;
        JVM INSTR monitorenter ;
        (new StringBuilder("Cancelling all pending requests with tag=")).append(obj2);
        anK.f();
        obj3 = ((aog) (obj3)).a.iterator();
_L3:
        aos aos1;
        Object obj4;
        if (!((Iterator) (obj3)).hasNext())
        {
            break MISSING_BLOCK_LABEL_206;
        }
        aos1 = (aos)((Iterator) (obj3)).next();
        obj4 = aos1.d();
        if (obj4 != obj2) goto _L2; else goto _L1
_L1:
        aos1.c();
        ((Iterator) (obj3)).remove();
          goto _L3
        obj2;
        obj1;
        JVM INSTR monitorexit ;
        throw obj2;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
_L2:
        if (obj4 != null && obj2 == null || obj4 == null) goto _L3; else goto _L4
_L4:
        if (!obj4.equals(obj2)) goto _L3; else goto _L5
_L5:
        aos1.c();
        ((Iterator) (obj3)).remove();
          goto _L3
        obj1;
        JVM INSTR monitorexit ;
        g = null;
        if (a == 3)
        {
            d.h();
        }
        obj;
        JVM INSTR monitorexit ;
    }

    public final void a(a a1)
    {
        anR.a();
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        java.util.Map.Entry entry;
        for (Iterator iterator = h.entrySet().iterator(); iterator.hasNext(); a1.a(g, (String)entry.getKey(), ((Boolean)entry.getValue()).booleanValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        break MISSING_BLOCK_LABEL_86;
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
        if (!e())
        {
            break MISSING_BLOCK_LABEL_117;
        }
        d();
        anR.a(g);
        a1.a(g);
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        c c1 = b;
        if (!c1.a.contains(a1))
        {
            c1.a.add(a1);
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void b()
    {
        boolean flag;
        flag = false;
        anR.a();
        Object obj1 = f;
        obj1;
        JVM INSTR monitorenter ;
        if (a == 2)
        {
            flag = true;
        }
        anK ank;
        anR.b(flag, "Already started");
        anR.a(g, "Already started");
        a = 2;
        ank = d;
        anR.a();
        synchronized (ank.a)
        {
            ank.g = ank.g + 1;
            if (ank.g > 0 && ank.c.d())
            {
                ank.b();
            }
        }
        obj = d;
        obj2 = c;
        if (!(obj2 instanceof Activity)) goto _L2; else goto _L1
_L1:
        obj2 = (Activity)obj2;
        obj = (anK.g)(new anK.h(((anK) (obj)), (byte)0)).a(obj2).a().b();
_L3:
        g = ((anK.g) (obj));
        anK.g g1;
        aoq aoq;
        for (obj = e.a().iterator(); ((Iterator) (obj)).hasNext(); g1.c.a(new anN(((String) (obj2))), g1.a(aoq), g1.a))
        {
            obj2 = (String)((Iterator) (obj)).next();
            g1 = g;
            aoq = new aoq(((String) (obj2))) {

                private String a;
                private anS b;

                public final void a(int j, Exception exception)
                {
                    anS.a(b, a, false);
                }

                public final void a(Object obj3)
                {
                    anS.a(b, a, true);
                }

            
            {
                b = anS.this;
                a = s;
                super();
            }
            };
            anR.a(((String) (obj2)));
        }

        break MISSING_BLOCK_LABEL_293;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        obj2;
        obj;
        JVM INSTR monitorexit ;
        throw obj2;
_L2:
        if (!(obj2 instanceof Service))
        {
            break MISSING_BLOCK_LABEL_278;
        }
        obj2 = (Service)obj2;
        obj = (anK.g)(new anK.h(((anK) (obj)), (byte)0)).a(obj2).a().b();
          goto _L3
        anR.b(obj2);
        obj = (anK.g)((anK) (obj)).e;
          goto _L3
        obj1;
        JVM INSTR monitorexit ;
    }

    public final aob c()
    {
        anR.a();
        synchronized (f)
        {
            d();
        }
        obj = d.c.a(this, i);
        if (obj == null)
        {
            obj = new anT(this);
        } else
        {
            obj = new anY(this, ((aob) (obj)));
        }
        ((aob) (obj)).b();
        return ((aob) (obj));
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
