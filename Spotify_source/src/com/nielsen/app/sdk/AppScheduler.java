// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Timer;

class AppScheduler extends Timer
{

    private static AppScheduler b = null;
    private Map a;

    private AppScheduler()
    {
        a = null;
    }

    public static AppScheduler a()
    {
        com/nielsen/app/sdk/AppScheduler;
        JVM INSTR monitorenter ;
        AppScheduler appscheduler1;
        if (b == null)
        {
            AppScheduler appscheduler = new AppScheduler();
            b = appscheduler;
            appscheduler.e();
        }
        appscheduler1 = b;
        com/nielsen/app/sdk/AppScheduler;
        JVM INSTR monitorexit ;
        return appscheduler1;
        Exception exception;
        exception;
        throw exception;
    }

    static Map a(AppScheduler appscheduler)
    {
        return appscheduler.a;
    }

    static AppScheduler d()
    {
        return b;
    }

    private void e()
    {
        a = new HashMap();
    }

    public boolean a(String s)
    {
        s = (AppTask)a.get(s);
        if (s != null)
        {
            if (!AppTask.a(s))
            {
                AppTask.a(s, true);
            }
            return true;
        } else
        {
            return false;
        }
    }

    public void b()
    {
        for (Iterator iterator = a.keySet().iterator(); iterator.hasNext(); a((String)iterator.next())) { }
    }

    public boolean b(String s)
    {
        AppTask apptask = (AppTask)a.get(s);
        if (apptask != null)
        {
            synchronized (AppTask.b(apptask))
            {
                AppTask.a(apptask, false);
                apptask.cancel();
            }
            a.remove(s);
            super.purge();
            return true;
        } else
        {
            return false;
        }
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public AppTask c(String s)
    {
        return (AppTask)a.get(s);
    }

    public void c()
    {
        for (; !a.isEmpty(); b((String)a.keySet().toArray()[0])) { }
    }


    private class AppTask extends TimerTask
    {

        private boolean a;
        private Object b;
        final AppScheduler f;

        private void a(String s, long l, long l1)
        {
            if (s == null || s.isEmpty())
            {
                throw new Exception("Cannot add task. Invalid name");
            }
            if (l < 0L || l1 < 0L)
            {
                throw new Exception((new StringBuilder("Cannot add task (")).append(s).append("). Period/Delay invalid. Period = ").append(l1).append(" Delay = ").append(l).toString());
            } else
            {
                f.b(s);
                AppScheduler.a(f).put(s, this);
                AppScheduler.d().schedule(this, l, l1);
                return;
            }
        }

        static boolean a(AppTask apptask)
        {
            return apptask.a;
        }

        static boolean a(AppTask apptask, boolean flag)
        {
            apptask.a = flag;
            return flag;
        }

        static Object b(AppTask apptask)
        {
            return apptask.b;
        }

        public abstract boolean execute();

        public void run()
        {
            synchronized (b)
            {
                if (a && !execute())
                {
                    a = false;
                }
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public AppTask(String s, long l)
        {
            f = AppScheduler.this;
            super();
            a = false;
            b = new Object();
            a(s, l, l);
        }

        public AppTask(String s, long l, long l1)
        {
            f = AppScheduler.this;
            super();
            a = false;
            b = new Object();
            a(s, l, l1);
        }
    }

}
