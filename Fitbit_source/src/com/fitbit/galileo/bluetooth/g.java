// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.bluetooth;

import android.content.Intent;
import com.fitbit.e.a;
import com.fitbit.util.threading.FitbitHandlerThread;
import com.fitbit.util.z;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.fitbit.galileo.bluetooth:
//            f

class g
{
    private static class a
    {

        public static g a = new g();


        private a()
        {
        }
    }


    public static final String a = "com.fitbit.galileo.bluetooth.GalileoTaskManager.ACTION_TASK_STARTED";
    public static final String b = "com.fitbit.galileo.bluetooth.GalileoTaskManager.ACTION_TASK_COMPLETED";
    public static final String c = "com.fitbit.galileo.bluetooth.GalileoTaskManager.ACTION_TASK_CANCELED";
    public static final String d = "com.fitbit.galileo.bluetooth.GalileoTaskManager.ACTION_TASK_FAILED";
    public static final String e = "com.fitbit.galileo.bluetooth.GalileoTaskManager.ACTION_TASK_SUSPENDED";
    public static final String f = "com.fitbit.galileo.bluetooth.GalileoTaskManager.EXTRA_TASK_UUID";
    public static final String g = "com.fitbit.galileo.bluetooth.GalileoTaskManager.EXTRA_TASK_FAIL_REASON";
    private static final String h = "GalileoTaskManager";
    private f i;
    private List j;
    private final f.a k;

    private g()
    {
        k = new f.a() {

            final g a;

            public void a(f f1)
            {
                Intent intent = new Intent("com.fitbit.galileo.bluetooth.GalileoTaskManager.ACTION_TASK_STARTED");
                com.fitbit.galileo.bluetooth.g.a(a, f1, intent);
            }

            public void b(f f1)
            {
                Intent intent = new Intent("com.fitbit.galileo.bluetooth.GalileoTaskManager.ACTION_TASK_COMPLETED");
                g.b(a, f1, intent);
            }

            public void c(f f1)
            {
                Intent intent = new Intent("com.fitbit.galileo.bluetooth.GalileoTaskManager.ACTION_TASK_CANCELED");
                g.b(a, f1, intent);
            }

            public void d(f f1)
            {
                Intent intent = new Intent("com.fitbit.galileo.bluetooth.GalileoTaskManager.ACTION_TASK_FAILED");
                intent.putExtra("com.fitbit.galileo.bluetooth.GalileoTaskManager.EXTRA_TASK_FAIL_REASON", f1.s());
                g.b(a, f1, intent);
            }

            public void e(f f1)
            {
                Intent intent = new Intent("com.fitbit.galileo.bluetooth.GalileoTaskManager.ACTION_TASK_SUSPENDED");
                com.fitbit.galileo.bluetooth.g.a(a, f1, intent);
            }

            
            {
                a = g.this;
                super();
            }
        };
        j = new ArrayList();
    }


    public static g a()
    {
        return com.fitbit.galileo.bluetooth.a.a;
    }

    private void a(f f1, Intent intent)
    {
        b(f1, intent);
        intent = j;
        intent;
        JVM INSTR monitorenter ;
        if (f1 != i)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        i = null;
_L2:
        b();
        return;
        j.remove(f1);
        if (true) goto _L2; else goto _L1
_L1:
        f1;
        intent;
        JVM INSTR monitorexit ;
        throw f1;
    }

    static void a(g g1, f f1)
    {
        g1.d(f1);
    }

    static void a(g g1, f f1, Intent intent)
    {
        g1.b(f1, intent);
    }

    private void b()
    {
label0:
        {
            synchronized (j)
            {
                com.fitbit.e.a.a("GalileoTaskManager", "Launch next task.", new Object[0]);
                if (i == null)
                {
                    break label0;
                }
                com.fitbit.e.a.a("GalileoTaskManager", "Unable to launch next task: current task is executing. Current task is %s", new Object[] {
                    i
                });
            }
            return;
        }
        if (!j.isEmpty())
        {
            break MISSING_BLOCK_LABEL_77;
        }
        com.fitbit.e.a.a("GalileoTaskManager", "Unable to launch next task: queue is empty.", new Object[0]);
        list;
        JVM INSTR monitorexit ;
        return;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        i = (f)j.get(0);
        j.remove(0);
        i.m();
        list;
        JVM INSTR monitorexit ;
    }

    private void b(f f1, Intent intent)
    {
        intent.putExtra("com.fitbit.galileo.bluetooth.GalileoTaskManager.EXTRA_TASK_UUID", f1.h());
        com.fitbit.e.a.a("GalileoTaskManager", "Sending task broadcast %s", new Object[] {
            intent
        });
        com.fitbit.e.a.a("GalileoTaskManager", "Broadcast extra  [%s]", new Object[] {
            intent.getExtras()
        });
        z.a(intent);
    }

    static void b(g g1, f f1)
    {
        g1.e(f1);
    }

    static void b(g g1, f f1, Intent intent)
    {
        g1.a(f1, intent);
    }

    private void d(f f1)
    {
        f1.a(k);
        synchronized (j)
        {
            com.fitbit.e.a.a("GalileoTaskManager", "Adding to queue: %s", new Object[] {
                f1
            });
            j.add(f1);
        }
        b();
        return;
        f1;
        list;
        JVM INSTR monitorexit ;
        throw f1;
    }

    private void e(f f1)
    {
        synchronized (j)
        {
            com.fitbit.e.a.a("GalileoTaskManager", "Cancel pending task", new Object[0]);
            if (j.contains(f1))
            {
                f1.n();
            }
        }
        return;
        f1;
        list;
        JVM INSTR monitorexit ;
        throw f1;
    }

    public void a(f f1)
    {
        FitbitHandlerThread.a(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.d, new Runnable(f1) {

            final f a;
            final g b;

            public void run()
            {
                com.fitbit.galileo.bluetooth.g.a(b, a);
            }

            
            {
                b = g.this;
                a = f1;
                super();
            }
        });
    }

    public void b(f f1)
    {
        FitbitHandlerThread.a(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.d, new Runnable(f1) {

            final f a;
            final g b;

            public void run()
            {
                a.n();
            }

            
            {
                b = g.this;
                a = f1;
                super();
            }
        });
    }

    public void c(f f1)
    {
        FitbitHandlerThread.a(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.d, new Runnable(f1) {

            final f a;
            final g b;

            public void run()
            {
                g.b(b, a);
            }

            
            {
                b = g.this;
                a = f1;
                super();
            }
        });
    }
}
