// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs.service;

import com.fitbit.e.a;
import com.fitbit.galileo.bluetooth.BluetoothWorker;
import com.fitbit.galileo.bluetooth.GalileoTaskExecutor;
import com.fitbit.galileo.bluetooth.b;
import com.fitbit.galileo.bluetooth.f;
import com.fitbit.util.threading.FitbitHandlerThread;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

abstract class DncsOperation
{
    public static final class State extends Enum
    {

        public static final State a;
        public static final State b;
        public static final State c;
        public static final State d;
        private static final State e[];

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/fitbit/dncs/service/DncsOperation$State, s);
        }

        public static State[] values()
        {
            return (State[])e.clone();
        }

        public boolean a()
        {
            return ordinal() > a.ordinal();
        }

        public boolean b()
        {
            return ordinal() > a.ordinal() && ordinal() < c.ordinal();
        }

        public boolean c()
        {
            return ordinal() >= c.ordinal();
        }

        public boolean d()
        {
            return this == c;
        }

        public boolean e()
        {
            return this == d;
        }

        static 
        {
            a = new State("STATE_NOT_STARTED", 0);
            b = new State("STATE_EXECUTING", 1);
            c = new State("STATE_COMPLETED", 2);
            d = new State("STATE_FAILED", 3);
            e = (new State[] {
                a, b, c, d
            });
        }

        private State(String s, int i1)
        {
            super(s, i1);
        }
    }

    static interface a
    {

        public abstract void a(DncsOperation dncsoperation);

        public abstract void a(DncsOperation dncsoperation, boolean flag);
    }


    private final a a;
    private final com.fitbit.bluetooth.connection.BluetoothConnectionController.ConnectionConsumer b;
    private final com.fitbit.util.threading.FitbitHandlerThread.ThreadName c;
    private final Set d = new HashSet();
    private BluetoothWorker e;
    private State f;
    private Enum g;

    public DncsOperation(com.fitbit.bluetooth.connection.BluetoothConnectionController.ConnectionConsumer connectionconsumer, com.fitbit.util.threading.FitbitHandlerThread.ThreadName threadname, a a1)
    {
        f = com.fitbit.dncs.service.State.a;
        a = a1;
        b = connectionconsumer;
        c = threadname;
    }

    static State a(DncsOperation dncsoperation)
    {
        return dncsoperation.f;
    }

    static a b(DncsOperation dncsoperation)
    {
        return dncsoperation.a;
    }

    static Set c(DncsOperation dncsoperation)
    {
        return dncsoperation.d;
    }

    private void m()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = new HashSet(d);
        d.clear();
        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((GalileoTaskExecutor)((Iterator) (obj)).next()).a(false)) { }
        break MISSING_BLOCK_LABEL_60;
        Exception exception;
        exception;
        throw exception;
        if (e != null)
        {
            com.fitbit.galileo.bluetooth.b.a().b(e);
            e = null;
        }
        this;
        JVM INSTR monitorexit ;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (f != com.fitbit.dncs.service.State.a) goto _L2; else goto _L1
_L1:
        a("Starting operation");
        f = com.fitbit.dncs.service.State.b;
        a(((Runnable) (new _cls1())));
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a("Operation is already started");
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected void a(f f1)
    {
        this;
        JVM INSTR monitorenter ;
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        if (!f.b())
        {
            break MISSING_BLOCK_LABEL_130;
        }
        if (d.contains(f1)) goto _L2; else goto _L1
_L1:
        if (e == null)
        {
            e = l();
        }
        if (e == null || !com.fitbit.galileo.bluetooth.b.a().a(e)) goto _L4; else goto _L3
_L3:
        f1 = new _cls2(f1, e, c);
        d.add(f1);
        if (!f1.g())
        {
            d.remove(f1);
            g();
        }
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        g();
          goto _L2
        f1;
        throw f1;
        g();
          goto _L2
    }

    protected void a(Enum enum)
    {
        this;
        JVM INSTR monitorenter ;
        if (!f.b()) goto _L2; else goto _L1
_L1:
        a((new StringBuilder()).append("Operation failed.").append(enum).toString());
        g = enum;
        f = State.d;
        m();
        a(((Runnable) (new _cls4())));
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a("onFailed() - operation is not in processing state");
        if (true) goto _L4; else goto _L3
_L3:
        enum;
        throw enum;
    }

    protected void a(Runnable runnable)
    {
        FitbitHandlerThread.a(c, runnable);
    }

    protected void a(String s)
    {
        com.fitbit.e.a.a(k(), s, new Object[0]);
    }

    public void b()
    {
        a(((Enum) (null)));
    }

    protected void b(f f1)
    {
        h();
    }

    public State c()
    {
        this;
        JVM INSTR monitorenter ;
        State state = f;
        this;
        JVM INSTR monitorexit ;
        return state;
        Exception exception;
        exception;
        throw exception;
    }

    protected void c(f f1)
    {
        a(((Enum) (null)));
    }

    public Enum d()
    {
        this;
        JVM INSTR monitorenter ;
        Enum enum = g;
        this;
        JVM INSTR monitorexit ;
        return enum;
        Exception exception;
        exception;
        throw exception;
    }

    protected void d(f f1)
    {
        a(((Enum) (null)));
    }

    public com.fitbit.bluetooth.connection.BluetoothConnectionController.ConnectionConsumer e()
    {
        return b;
    }

    protected boolean f()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = (new HashSet(d)).iterator();
_L1:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_48;
        }
        ((GalileoTaskExecutor)iterator.next()).a(false);
        flag = true;
          goto _L1
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    protected void g()
    {
        a(((Enum) (null)));
    }

    protected void h()
    {
        this;
        JVM INSTR monitorenter ;
        if (!f.b()) goto _L2; else goto _L1
_L1:
        a("Operation completed.");
        f = State.c;
        m();
        a(new _cls3());
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a("onCompleted() - operation is not in processing state");
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected abstract void i();

    protected abstract void j();

    protected abstract String k();

    protected abstract BluetoothWorker l();

    public String toString()
    {
        return (new StringBuilder()).append(k()).append("(").append(f).append(", ").append(g).append(")").toString();
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls3 {}

}
