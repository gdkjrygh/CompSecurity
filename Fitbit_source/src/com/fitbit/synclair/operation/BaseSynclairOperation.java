// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.operation;

import com.fitbit.e.a;
import com.fitbit.synclair.SynclairError;
import com.fitbit.synclair.operation.info.SynclairOperationInfo;
import com.fitbit.util.threading.FitbitHandlerThread;
import java.util.List;

public abstract class BaseSynclairOperation
    implements SynclairOperationInfo
{
    public static final class OperationState extends Enum
    {

        public static final OperationState a;
        public static final OperationState b;
        public static final OperationState c;
        private static final OperationState d[];

        public static OperationState valueOf(String s)
        {
            return (OperationState)Enum.valueOf(com/fitbit/synclair/operation/BaseSynclairOperation$OperationState, s);
        }

        public static OperationState[] values()
        {
            return (OperationState[])d.clone();
        }

        static 
        {
            a = new OperationState("NOT_STARTED", 0);
            b = new OperationState("EXECUTING", 1);
            c = new OperationState("FINISHED", 2);
            d = (new OperationState[] {
                a, b, c
            });
        }

        private OperationState(String s, int i1)
        {
            super(s, i1);
        }
    }

    public static interface a
    {

        public abstract void b(BaseSynclairOperation basesynclairoperation);

        public abstract void c(BaseSynclairOperation basesynclairoperation);

        public abstract void d(BaseSynclairOperation basesynclairoperation);

        public abstract void e(BaseSynclairOperation basesynclairoperation);
    }


    private static final String a = "BaseSynclairOperation";
    private OperationState e;
    private com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationResult f;
    private a g;
    private SynclairError h;
    private final com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType i;
    private Object j;
    private Integer k;

    public BaseSynclairOperation(com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType synclairoperationtype)
    {
        e = com.fitbit.synclair.operation.OperationState.a;
        f = null;
        g = null;
        h = null;
        j = null;
        k = Integer.valueOf(0);
        i = synclairoperationtype;
        synclairoperationtype = synclairoperationtype.a();
        if (synclairoperationtype.size() == 0)
        {
            k = Integer.valueOf(0);
            return;
        } else
        {
            k = (Integer)synclairoperationtype.get(0);
            return;
        }
    }

    static void a(BaseSynclairOperation basesynclairoperation)
    {
        basesynclairoperation.q();
    }

    static void a(BaseSynclairOperation basesynclairoperation, int i1)
    {
        basesynclairoperation.b(i1);
    }

    static void a(BaseSynclairOperation basesynclairoperation, SynclairError synclairerror)
    {
        basesynclairoperation.b(synclairerror);
    }

    static void a(BaseSynclairOperation basesynclairoperation, Object obj)
    {
        basesynclairoperation.b(obj);
    }

    protected static void a(Runnable runnable)
    {
        FitbitHandlerThread.a(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.b, runnable);
    }

    private final void b(int i1)
    {
        if (g() && i.a().contains(Integer.valueOf(i1)) && k.intValue() != i1)
        {
            k = Integer.valueOf(i1);
            n();
            if (g != null)
            {
                g.b(this);
            }
        }
    }

    private void b(SynclairError synclairerror)
    {
        if (e == OperationState.b)
        {
            a((new StringBuilder()).append("Failed: ").append(synclairerror).toString());
            e = OperationState.c;
            f = com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationResult.b;
            h = synclairerror;
            m();
            if (g != null)
            {
                g.d(this);
                g = null;
            }
        }
    }

    private void b(Object obj)
    {
        if (e == OperationState.b)
        {
            a("Completed");
            e = OperationState.c;
            f = com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationResult.a;
            j = obj;
            m();
            if (g != null)
            {
                g.c(this);
                g = null;
            }
        }
    }

    private void q()
    {
        if (e == OperationState.b)
        {
            a("Canceled");
            e = OperationState.c;
            f = com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationResult.c;
            m();
            if (g != null)
            {
                g.e(this);
                g = null;
            }
        }
    }

    public final com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationResult a()
    {
        return f;
    }

    protected final void a(int i1)
    {
        FitbitHandlerThread.a(new Runnable(i1) {

            final int a;
            final BaseSynclairOperation b;

            public void run()
            {
                com.fitbit.synclair.operation.BaseSynclairOperation.a(b, a);
            }

            
            {
                b = BaseSynclairOperation.this;
                a = i1;
                super();
            }
        });
    }

    protected final void a(SynclairError synclairerror)
    {
        FitbitHandlerThread.a(new Runnable(synclairerror) {

            final SynclairError a;
            final BaseSynclairOperation b;

            public void run()
            {
                com.fitbit.synclair.operation.BaseSynclairOperation.a(b, a);
            }

            
            {
                b = BaseSynclairOperation.this;
                a = synclairerror;
                super();
            }
        });
    }

    public final void a(a a1)
    {
        a("Starting");
        g = a1;
        if (e == com.fitbit.synclair.operation.OperationState.a)
        {
            e = OperationState.b;
            o();
        } else
        {
            a("Already started!");
            if (!h())
            {
                static class _cls5
                {

                    static final int a[];

                    static 
                    {
                        a = new int[com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationResult.values().length];
                        try
                        {
                            a[com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationResult.c.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            a[com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationResult.a.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationResult.b.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                switch (com.fitbit.synclair.operation._cls5.a[f.ordinal()])
                {
                default:
                    return;

                case 1: // '\001'
                    g.e(this);
                    return;

                case 2: // '\002'
                    g.c(this);
                    return;

                case 3: // '\003'
                    g.d(this);
                    break;
                }
                return;
            }
        }
    }

    protected final void a(Object obj)
    {
        FitbitHandlerThread.a(new Runnable(obj) {

            final Object a;
            final BaseSynclairOperation b;

            public void run()
            {
                com.fitbit.synclair.operation.BaseSynclairOperation.a(b, a);
            }

            
            {
                b = BaseSynclairOperation.this;
                a = obj;
                super();
            }
        });
    }

    protected void a(String s)
    {
        com.fitbit.e.a.a("BaseSynclairOperation", "%s: %s", new Object[] {
            p(), s
        });
    }

    public final SynclairError b()
    {
        return h;
    }

    public final com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType c()
    {
        return i;
    }

    public final Object d()
    {
        return j;
    }

    public final int e()
    {
        return k.intValue();
    }

    public final boolean f()
    {
        return e.ordinal() > com.fitbit.synclair.operation.OperationState.a.ordinal();
    }

    public final boolean g()
    {
        return e == OperationState.b;
    }

    public final boolean h()
    {
        return e == OperationState.c;
    }

    protected final void i()
    {
        a("Restarting");
        e = com.fitbit.synclair.operation.OperationState.a;
        f = null;
        h = null;
        j = null;
        List list = i.a();
        if (list.size() == 0)
        {
            k = Integer.valueOf(0);
        } else
        {
            k = (Integer)list.get(0);
        }
        a(g);
    }

    public final void j()
    {
        if (e == OperationState.b)
        {
            a("Cancelling");
            l();
        }
    }

    protected final void k()
    {
        FitbitHandlerThread.a(new Runnable() {

            final BaseSynclairOperation a;

            public void run()
            {
                com.fitbit.synclair.operation.BaseSynclairOperation.a(a);
            }

            
            {
                a = BaseSynclairOperation.this;
                super();
            }
        });
    }

    protected void l()
    {
        k();
    }

    protected void m()
    {
    }

    protected void n()
    {
    }

    protected abstract void o();

    protected abstract String p();

    public String toString()
    {
        return p();
    }
}
