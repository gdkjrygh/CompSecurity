// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.tasks.subtasks;

import android.content.Intent;
import android.os.Handler;
import com.fitbit.bluetooth.connection.b;
import com.fitbit.bluetooth.g;
import com.fitbit.e.a;
import com.fitbit.util.threading.FitbitHandlerThread;
import java.util.UUID;

public abstract class GalileoSubTask
{
    private static final class State extends Enum
    {

        public static final State a;
        public static final State b;
        public static final State c;
        public static final State d;
        public static final State e;
        public static final State f;
        private static final State g[];

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/fitbit/galileo/tasks/subtasks/GalileoSubTask$State, s);
        }

        public static State[] values()
        {
            return (State[])g.clone();
        }

        static 
        {
            a = new State("STATE_NOT_STARTED", 0);
            b = new State("STATE_STARTING", 1);
            c = new State("STATE_IN_PROGRESS", 2);
            d = new State("STATE_COMPLETED", 3);
            e = new State("STATE_FAILED", 4);
            f = new State("STATE_CANCELLED", 5);
            g = (new State[] {
                a, b, c, d, e, f
            });
        }

        private State(String s, int i1)
        {
            super(s, i1);
        }
    }

    public static interface a
    {

        public abstract void a(GalileoSubTask galileosubtask);

        public abstract void b(GalileoSubTask galileosubtask);

        public abstract void c(GalileoSubTask galileosubtask);
    }


    private static final String a = "GalileoSubTask";
    private final int b = 3;
    private Intent c;
    private int d;
    private State e;
    private a f;
    private b g;
    private int h;

    protected GalileoSubTask()
    {
        d = 0;
        e = com.fitbit.galileo.tasks.subtasks.State.a;
        f = null;
        h = 0;
    }

    static void a(GalileoSubTask galileosubtask, boolean flag)
    {
        galileosubtask.b(flag);
    }

    private void b(boolean flag)
    {
        if (!h() || i()) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a("GalileoSubTask", "Subtask %s was finished with result: %s", new Object[] {
            e(), Boolean.valueOf(flag)
        });
        if (!flag)
        {
            com.fitbit.e.a.e("GalileoSubTask", "Subtask %s failed!", new Object[] {
                e()
            });
        }
        if (g != null)
        {
            g.a();
            g = null;
        }
        State state;
        if (flag)
        {
            state = State.d;
        } else
        {
            state = State.e;
        }
        e = state;
        c();
        if (f == null) goto _L2; else goto _L3
_L3:
        if (!j()) goto _L5; else goto _L4
_L4:
        f.a(this);
_L7:
        f = null;
_L2:
        return;
_L5:
        if (k())
        {
            f.b(this);
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void a(int i1)
    {
        h = i1;
    }

    public void a(Intent intent)
    {
        c = intent;
    }

    protected final void a(boolean flag)
    {
        if (d >= 3)
        {
            com.fitbit.bluetooth.g.a();
        }
        if (!flag && d < 3)
        {
            d = d + 1;
            if (x_())
            {
                return;
            }
        }
        if (e == com.fitbit.galileo.tasks.subtasks.State.b)
        {
            FitbitHandlerThread.b(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.d).post(new Runnable(flag) {

                final boolean a;
                final GalileoSubTask b;

                public void run()
                {
                    com.fitbit.galileo.tasks.subtasks.GalileoSubTask.a(b, a);
                }

            
            {
                b = GalileoSubTask.this;
                a = flag;
                super();
            }
            });
            return;
        } else
        {
            b(flag);
            return;
        }
    }

    protected final boolean a(b b1)
    {
        if (!i())
        {
            g = b1;
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean a(a a1)
    {
        if (!h())
        {
            com.fitbit.e.a.a("GalileoSubTask", "Starting subtask: %s", new Object[] {
                e()
            });
            e = com.fitbit.galileo.tasks.subtasks.State.b;
            f = a1;
            b();
            if (e == com.fitbit.galileo.tasks.subtasks.State.b)
            {
                e = State.c;
            }
            return true;
        } else
        {
            com.fitbit.e.a.e("GalileoSubTask", "Trying to start subtask that have been already started: %s ", new Object[] {
                e()
            });
            return false;
        }
    }

    protected boolean a(UUID uuid)
    {
        if (uuid == null)
        {
            return false;
        }
        b b1 = new b() {

            final GalileoSubTask a;

            protected void a(boolean flag)
            {
                if (!flag)
                {
                    a.a(false);
                }
            }

            
            {
                a = GalileoSubTask.this;
                super();
            }
        };
        if (a(((b) (b1))))
        {
            b1.a(uuid, com.fitbit.util.threading.FitbitHandlerThread.ThreadName.d);
            return true;
        } else
        {
            b1.a();
            return false;
        }
    }

    protected abstract void b();

    protected abstract void c();

    protected abstract void d();

    public abstract String e();

    public final boolean h()
    {
        return e.ordinal() > com.fitbit.galileo.tasks.subtasks.State.a.ordinal();
    }

    public final boolean i()
    {
        return e.ordinal() > State.c.ordinal();
    }

    public final boolean j()
    {
        return e == State.d;
    }

    public final boolean k()
    {
        return e == State.e;
    }

    public final boolean l()
    {
        return e == State.f;
    }

    public final int m()
    {
        return h;
    }

    public final void n()
    {
        if (h() && !i())
        {
            com.fitbit.e.a.a("GalileoSubTask", "Canceling subtask: %s", new Object[] {
                e()
            });
            d();
        }
    }

    protected final b o()
    {
        return g;
    }

    protected final void p()
    {
        if (h() && !i())
        {
            com.fitbit.e.a.a("GalileoSubTask", "Subtask %s was canceled", new Object[] {
                e()
            });
            if (g != null)
            {
                g.a();
                g = null;
            }
            e = State.f;
            c();
            if (f != null)
            {
                f.c(this);
                f = null;
            }
        }
    }

    public Intent q()
    {
        return c;
    }

    public String toString()
    {
        return (new StringBuilder()).append(e()).append("(").append(e.toString()).append(")").toString();
    }

    protected boolean x_()
    {
        return false;
    }
}
