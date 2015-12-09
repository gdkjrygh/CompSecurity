// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.bsp;

import java.util.ArrayList;

// Referenced classes of package com.yume.android.bsp:
//            f

final class b
{

    private static b c;
    private ArrayList a;
    private ArrayList b;

    b()
    {
        a = new ArrayList();
        b = new ArrayList();
    }

    public static b a()
    {
        if (c == null)
        {
            c = new b();
        }
        return c;
    }

    private void b()
    {
        ArrayList arraylist = b;
        arraylist;
        JVM INSTR monitorenter ;
        Runnable runnable;
        if (b.isEmpty())
        {
            break MISSING_BLOCK_LABEL_77;
        }
        runnable = (Runnable)b.get(0);
        b.remove(0);
        synchronized (a)
        {
            a.add(runnable);
        }
        obj = new Thread(runnable);
        ((f)runnable).a(((Thread) (obj)));
        ((Thread) (obj)).start();
        arraylist;
        JVM INSTR monitorexit ;
        return;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception2;
        exception2;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception2;
        Exception exception;
        exception;
        exception.printStackTrace();
        return;
    }

    public final void a(Runnable runnable)
    {
        synchronized (b)
        {
            b.add(runnable);
        }
        synchronized (a)
        {
            if (a.size() < 10)
            {
                b();
            }
        }
        return;
        runnable;
        arraylist;
        JVM INSTR monitorexit ;
        throw runnable;
        runnable;
        runnable.printStackTrace();
        return;
        exception;
        runnable;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b(Runnable runnable)
    {
        synchronized (b)
        {
            b.remove(runnable);
        }
        return;
        runnable;
        arraylist;
        JVM INSTR monitorexit ;
        throw runnable;
        runnable;
        runnable.printStackTrace();
        return;
    }

    public final void c(Runnable runnable)
    {
        synchronized (a)
        {
            a.remove(runnable);
        }
        try
        {
            b();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            runnable.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_33;
        runnable;
        arraylist;
        JVM INSTR monitorexit ;
        throw runnable;
    }
}
