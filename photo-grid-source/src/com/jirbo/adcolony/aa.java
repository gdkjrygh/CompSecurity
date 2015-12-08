// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import java.util.ArrayList;
import java.util.Iterator;

class aa
{

    static String a = new String("mutex");
    static ArrayList b = new ArrayList();
    static ArrayList c = new ArrayList();
    static ArrayList d = new ArrayList();
    static ArrayList e = new ArrayList();
    static volatile boolean f;

    aa()
    {
    }

    static void a()
    {
        c();
        synchronized (a)
        {
            d.clear();
        }
        b();
        return;
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void a(Runnable runnable)
    {
label0:
        {
            synchronized (a)
            {
                if (!f)
                {
                    break label0;
                }
                d.add(runnable);
            }
            return;
        }
        int i = b.size();
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        obj = (a)b.remove(i - 1);
_L1:
        obj1;
        JVM INSTR monitorexit ;
        if (obj == null)
        {
            obj1 = new a();
            synchronized (a)
            {
                c.add(obj1);
            }
            obj1.a = runnable;
            ((a) (obj1)).start();
            return;
        }
        break MISSING_BLOCK_LABEL_97;
        runnable;
        obj1;
        JVM INSTR monitorexit ;
        throw runnable;
        runnable;
        obj;
        JVM INSTR monitorexit ;
        throw runnable;
        obj;
        JVM INSTR monitorenter ;
        obj.a = runnable;
        obj.notify();
        obj;
        JVM INSTR monitorexit ;
        return;
        runnable;
        obj;
        JVM INSTR monitorexit ;
        throw runnable;
        obj = null;
          goto _L1
    }

    static void b()
    {
        synchronized (a)
        {
            f = false;
            e.clear();
            e.addAll(d);
            d.clear();
            c.clear();
        }
        for (obj = e.iterator(); ((Iterator) (obj)).hasNext(); a((Runnable)((Iterator) (obj)).next())) { }
        break MISSING_BLOCK_LABEL_76;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void c()
    {
        String s = a;
        s;
        JVM INSTR monitorenter ;
        f = true;
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            synchronized ((a)iterator.next())
            {
                a1.notify();
            }
        }

        break MISSING_BLOCK_LABEL_57;
        exception1;
        a1;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
        synchronized (a)
        {
            b.clear();
        }
        s;
        JVM INSTR monitorexit ;
        return;
        exception2;
        s1;
        JVM INSTR monitorexit ;
        throw exception2;
    }


    private class a extends Thread
    {

        Runnable a;

        public void run()
        {
_L2:
            if (a != null)
            {
                try
                {
                    a.run();
                }
                catch (RuntimeException runtimeexception)
                {
                    com.jirbo.adcolony.a.e("Exception caught in reusable thread.");
                    com.jirbo.adcolony.a.e(String.valueOf(runtimeexception));
                    runtimeexception.printStackTrace();
                }
                a = null;
            }
            if (aa.f)
            {
                return;
            }
            this;
            JVM INSTR monitorenter ;
            synchronized (aa.a)
            {
                aa.b.add(this);
            }
            try
            {
                wait();
            }
            catch (InterruptedException interruptedexception) { }
            this;
            JVM INSTR monitorexit ;
            if (true) goto _L2; else goto _L1
_L1:
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        a()
        {
        }
    }

}
