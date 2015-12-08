// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

public class cuv
    implements chp
{

    private static final String f = cuv.getSimpleName();
    final Object a = new Object();
    final Set b = new HashSet();
    Object c;
    boolean d;
    boolean e;
    private final chq g;
    private int h;
    private int i;
    private boolean j;
    private chp k;

    public cuv(chq chq1)
    {
        g = (chq)b.a(chq1, "renderContext", null);
    }

    private void g()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        while (c == null) 
        {
            a.wait();
        }
        break MISSING_BLOCK_LABEL_29;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
    }

    public final Object a(Callable callable)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (e)
        {
            throw new chz();
        }
        break MISSING_BLOCK_LABEL_27;
        callable;
        obj;
        JVM INSTR monitorexit ;
        throw callable;
        chp chp1;
        if (!d)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        chp1 = k;
        k = null;
        if (chp1 == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        chp1.a(new cuw(this, chp1));
        d = false;
        chp1 = k;
        if (chp1 != null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        g();
        chq chq1 = g;
        Object obj1 = c;
        int l = d();
        int i1 = e();
        k = new chv(chq1, obj1, false, l, i1, l, i1, false, false, (byte)0);
        callable = ((Callable) (k.a(callable)));
        obj;
        JVM INSTR monitorexit ;
        return callable;
        callable;
        Log.e(f, "Interrupted while waiting for surface");
        Thread.currentThread().interrupt();
        obj;
        JVM INSTR monitorexit ;
        return null;
    }

    public void a()
    {
        synchronized (a)
        {
            if (k != null)
            {
                k.a();
                k = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(long l)
    {
        synchronized (a)
        {
            if (j)
            {
                j = false;
                k.c();
            }
            k.a(l);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(cia cia1)
    {
        b.add(cia1);
    }

    protected final void a(Object obj, int l, int i1)
    {
label0:
        {
            synchronized (a)
            {
                if (c != obj || h != l || i != i1)
                {
                    break label0;
                }
            }
            return;
        }
        c = obj;
        h = l;
        i = i1;
        d = true;
        e = false;
        a.notify();
        obj1;
        JVM INSTR monitorexit ;
        for (obj1 = b.iterator(); ((Iterator) (obj1)).hasNext(); ((cia)((Iterator) (obj1)).next()).a(obj)) { }
        break MISSING_BLOCK_LABEL_118;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public final void b()
    {
        synchronized (a)
        {
            k.b();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b(cia cia1)
    {
        b.remove(cia1);
    }

    public final void c()
    {
        j = true;
    }

    public final int d()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (e)
        {
            throw new chz();
        }
        break MISSING_BLOCK_LABEL_27;
        Object obj1;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        g();
_L1:
        int l = h;
        obj;
        JVM INSTR monitorexit ;
        return l;
        obj1;
        Log.w(f, "Interrupted while waiting for surface.");
        Thread.currentThread().interrupt();
          goto _L1
    }

    public final int e()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (e)
        {
            throw new chz();
        }
        break MISSING_BLOCK_LABEL_27;
        Object obj1;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        g();
_L1:
        int l = i;
        obj;
        JVM INSTR monitorexit ;
        return l;
        obj1;
        Log.w(f, "Interrupted while waiting for surface.");
        Thread.currentThread().interrupt();
          goto _L1
    }

    public final boolean f()
    {
        return false;
    }

}
