// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.bluetooth;

import com.fitbit.util.threading.FitbitHandlerThread;
import java.util.UUID;

// Referenced classes of package com.fitbit.galileo.bluetooth:
//            h, a, f

public class GalileoTaskExecutor
{
    private static final class State extends Enum
    {

        public static final State a;
        public static final State b;
        public static final State c;
        private static final State d[];

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/fitbit/galileo/bluetooth/GalileoTaskExecutor$State, s);
        }

        public static State[] values()
        {
            return (State[])d.clone();
        }

        static 
        {
            a = new State("INIT", 0);
            b = new State("EXECUTING", 1);
            c = new State("FINISHED", 2);
            d = (new State[] {
                a, b, c
            });
        }

        private State(String s, int i1)
        {
            super(s, i1);
        }
    }


    private final f a;
    private final a b;
    private final com.fitbit.util.threading.FitbitHandlerThread.ThreadName c;
    private h d;
    private State e;

    public GalileoTaskExecutor(f f1, a a1, com.fitbit.util.threading.FitbitHandlerThread.ThreadName threadname)
    {
        e = State.a;
        a = f1;
        b = a1;
        c = threadname;
    }

    static f a(GalileoTaskExecutor galileotaskexecutor)
    {
        return galileotaskexecutor.a;
    }

    static void b(GalileoTaskExecutor galileotaskexecutor)
    {
        galileotaskexecutor.l();
    }

    private void l()
    {
        this;
        JVM INSTR monitorenter ;
        e = State.c;
        if (d != null)
        {
            d.d();
            d = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void a()
    {
    }

    public final void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (e != State.a) goto _L2; else goto _L1
_L1:
        if (b == null) goto _L4; else goto _L3
_L3:
        b.b(a);
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        l();
        if (a != null)
        {
            FitbitHandlerThread.a(c, new Runnable() {

                final GalileoTaskExecutor a;

                public void run()
                {
                    a.b();
                    a.d();
                }

            
            {
                a = GalileoTaskExecutor.this;
                super();
            }
            });
        }
          goto _L5
        Exception exception;
        exception;
        throw exception;
_L2:
        if (e != State.b) goto _L5; else goto _L6
_L6:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        b.c(a);
          goto _L5
        b.b(a);
          goto _L5
    }

    protected void b()
    {
    }

    protected void c()
    {
    }

    protected void d()
    {
    }

    public final boolean e()
    {
        this;
        JVM INSTR monitorenter ;
        State state;
        State state1;
        state = e;
        state1 = State.b;
        boolean flag;
        if (state == state1)
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

    public final boolean f()
    {
        this;
        JVM INSTR monitorenter ;
        State state;
        State state1;
        state = e;
        state1 = State.c;
        boolean flag;
        if (state == state1)
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

    public final boolean g()
    {
        this;
        JVM INSTR monitorenter ;
        if (a == null || b == null || e != State.a || a.k()) goto _L2; else goto _L1
_L1:
        d = new h(c) {

            final GalileoTaskExecutor a;

            protected void a(UUID uuid)
            {
                if (uuid.equals(GalileoTaskExecutor.a(a).i()))
                {
                    a.j();
                }
            }

            protected void b(UUID uuid)
            {
                if (uuid.equals(GalileoTaskExecutor.a(a).i()))
                {
                    GalileoTaskExecutor.b(a);
                    a.c();
                    a.d();
                }
            }

            protected void c(UUID uuid)
            {
                if (uuid.equals(GalileoTaskExecutor.a(a).i()))
                {
                    GalileoTaskExecutor.b(a);
                    a.a();
                    a.d();
                }
            }

            protected void d(UUID uuid)
            {
                if (uuid.equals(GalileoTaskExecutor.a(a).i()))
                {
                    GalileoTaskExecutor.b(a);
                    a.b();
                    a.d();
                }
            }

            protected void e(UUID uuid)
            {
                if (uuid.equals(GalileoTaskExecutor.a(a).i()))
                {
                    a.d();
                }
            }

            
            {
                a = GalileoTaskExecutor.this;
                super(threadname);
            }
        };
        d.a();
        if (!b.a(a)) goto _L2; else goto _L3
_L3:
        e = State.b;
        boolean flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public final f h()
    {
        return a;
    }

    public final a i()
    {
        return b;
    }

    protected void j()
    {
    }

    protected void k()
    {
    }
}
