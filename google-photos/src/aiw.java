// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.ConditionVariable;
import android.os.Handler;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

public final class aiw
{

    public static final aiz a = new aiz(10, null);
    static final aiz b = new aiz(12, null);
    public static final aiz c = new aiz(13, null);
    static final aiz d = new aiz(3, null);
    private static int k = -1;
    private static int l = -2;
    private static final String m = aiw.getSimpleName();
    private static final aiz n = new aiz(2, null);
    private static final aiz o = new aiz(7, null);
    private static final aiz p = new aiz(4, null);
    private static ThreadLocal r = new ThreadLocal();
    final ajr e;
    Set f;
    public ajc g;
    public Thread h;
    public ahw i;
    public ajg j;
    private aji q;

    public aiw(ajr ajr1)
    {
        this(ajr1, new aiy());
    }

    private aiw(ajr ajr1, aiy aiy1)
    {
        f = new HashSet();
        h = null;
        i = null;
        j = new ajg();
        e = ajr1;
        i = new ahw(this, 1);
        q = new ajf();
        g = new ajc(this, aiy1.b);
        h = new Thread(g);
        h.setPriority(aiy1.a);
        h.start();
        aiy1 = e;
        synchronized (((ajr) (aiy1)).c)
        {
            ((ajr) (aiy1)).c.add(this);
        }
        return;
        aiy1;
        ajr1;
        JVM INSTR monitorexit ;
        throw aiy1;
    }

    static ahw a(aiw aiw1)
    {
        return aiw1.i;
    }

    public static aiw a()
    {
        return (aiw)r.get();
    }

    static void a(aiw aiw1, Exception exception, boolean flag)
    {
        ajg ajg1 = aiw1.j;
        ajg1;
        JVM INSTR monitorenter ;
        if (aiw1.j.a == null) goto _L2; else goto _L1
_L1:
        ajr ajr1 = aiw1.e;
        aiw1 = new aix(aiw1, exception, flag);
        ajr1.g.post(aiw1);
_L4:
        return;
_L2:
        if (exception == null) goto _L4; else goto _L3
_L3:
        Log.e("GraphRunner", "Uncaught exception during graph execution! Stack Trace: ");
        exception.printStackTrace();
          goto _L4
        aiw1;
        ajg1;
        JVM INSTR monitorexit ;
        throw aiw1;
    }

    static Set b(aiw aiw1)
    {
        return aiw1.f;
    }

    static aji c(aiw aiw1)
    {
        return aiw1.q;
    }

    static ajg d(aiw aiw1)
    {
        return aiw1.j;
    }

    static aiz i()
    {
        return p;
    }

    static String j()
    {
        return m;
    }

    static aiz k()
    {
        return d;
    }

    static ThreadLocal l()
    {
        return r;
    }

    static aiz m()
    {
        return n;
    }

    public static int n()
    {
        return k;
    }

    public static int o()
    {
        return l;
    }

    public final void a(ahq ahq1)
    {
        this;
        JVM INSTR monitorenter ;
        if (ahq1.d != this)
        {
            throw new IllegalArgumentException("Graph must be attached to runner!");
        }
        break MISSING_BLOCK_LABEL_25;
        ahq1;
        this;
        JVM INSTR monitorexit ;
        throw ahq1;
        g.e.close();
        g.a(1, ahq1);
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(aje aje)
    {
        synchronized (j)
        {
            j.a = aje;
        }
        return;
        aje;
        ajg1;
        JVM INSTR monitorexit ;
        throw aje;
    }

    public final void a(boolean flag)
    {
        synchronized (j)
        {
            j.b = flag;
        }
        return;
        exception;
        ajg1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b()
    {
        g.e.block();
    }

    public final void c()
    {
        g.a(p);
    }

    public final boolean d()
    {
        return !g.a(1);
    }

    public final boolean e()
    {
        boolean flag;
        synchronized (j)
        {
            flag = j.b;
        }
        return flag;
        exception;
        ajg1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean f()
    {
        return g.b && e.h;
    }

    public final boolean g()
    {
        boolean flag;
        synchronized (j)
        {
            flag = j.c;
        }
        return flag;
        exception;
        ajg1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void h()
    {
        g.a(b);
        try
        {
            h.join();
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            Log.e("GraphRunner", "Error waiting for runner thread to finish!");
        }
    }

    static 
    {
        new aiz(6, null);
        new aiz(9, null);
        new aiz(8, null);
    }
}
