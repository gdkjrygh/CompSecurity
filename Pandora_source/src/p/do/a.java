// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.do;

import java.util.Vector;
import java.util.concurrent.ExecutionException;
import p.dm.m;
import p.dq.c;

public abstract class p.do.a extends Thread
{
    protected class a
    {

        public final int a;
        public int b;
        public p.l.a c;
        final p.do.a d;

        public a(int i, int j, p.l.a a2)
        {
            d = p.do.a.this;
            super();
            a = i;
            b = j;
            c = a2;
        }
    }


    protected int a[];
    protected Vector b;
    protected int c;
    protected m d;
    protected boolean e;
    protected Object f;

    public p.do.a(m m1)
    {
        c = 0;
        e = false;
        f = new Object();
        d = m1;
        b = new Vector();
    }

    private a e()
        throws InterruptedException
    {
        a a1 = null;
        this;
        JVM INSTR monitorenter ;
        Vector vector = b;
        if (vector != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return a1;
_L2:
        if (b.isEmpty())
        {
            wait();
        }
        if (!b())
        {
            a("getNextStationArt");
            a1 = (a)b.firstElement();
            b.removeElementAt(0);
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private boolean f()
    {
        do
        {
            if (d == null || d.bp == null)
            {
                return false;
            }
            if (d.bp.f())
            {
                return true;
            }
            try
            {
                Thread.sleep(300L);
            }
            catch (Exception exception) { }
        } while (!b());
        return false;
    }

    protected abstract void a();

    public void a(String s)
    {
        if (d != null)
        {
            d.d((new StringBuilder()).append("[ReturnStationArtWorker] ").append(s).toString());
        }
    }

    public void a(String s, Throwable throwable)
    {
        if (d != null)
        {
            d.a((new StringBuilder()).append("[ReturnStationArtWorker] ").append(s).toString(), throwable);
        }
    }

    protected void a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        Vector vector = b;
        if (vector != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a((new StringBuilder()).append("queueStationArt stationId:").append(a1.a).append(" artLength:").append(a1.b).toString());
        b.addElement(a1);
        notify();
        if (true) goto _L1; else goto _L3
_L3:
        a1;
        throw a1;
    }

    public void a(int ai[])
    {
        a("requestStationArt");
        a = ai;
        c = 0;
        a();
        start();
    }

    public boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = e;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        a("cancelWork");
        e = true;
        interrupt();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void d()
    {
        this;
        JVM INSTR monitorenter ;
        if (b != null)
        {
            b.removeAllElements();
            b = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void run()
    {
        int i = 0;
_L2:
        boolean flag = b();
        if (flag)
        {
            d();
            a("THREAD STOPPED");
            return;
        }
        int j = a.length;
        if (i > j)
        {
            d();
            a("THREAD STOPPED");
            return;
        }
        a a1 = e();
        if (a1 == null) goto _L2; else goto _L1
_L1:
        if (!f()) goto _L2; else goto _L3
_L3:
        a((new StringBuilder()).append("returnStationArt(").append(a1.a).append(", data[").append(a1.b).append("])").toString());
        byte abyte0[] = (byte[])(byte[])a1.c.c(d.bu, d.bu).get();
        d.a(a1.a, abyte0);
        i++;
          goto _L2
        Object obj;
        obj;
        a("main thread interrupted!");
        d();
        a("THREAD STOPPED");
        return;
        obj;
        a("Failed to return station art.", ((Throwable) (obj)));
        d();
        a("THREAD STOPPED");
        return;
        obj;
        d();
        a("THREAD STOPPED");
        throw obj;
    }
}
