// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.threading;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.fitbit.e.a;
import com.fitbit.e.b;
import java.util.HashMap;
import java.util.Map;

public final class FitbitHandlerThread
{
    public static final class ThreadName extends Enum
    {

        public static final ThreadName a;
        public static final ThreadName b;
        public static final ThreadName c;
        public static final ThreadName d;
        public static final ThreadName e;
        public static final ThreadName f;
        public static final ThreadName g;
        public static final ThreadName h;
        private static final ThreadName i[];
        private final String threadName;

        static String a(ThreadName threadname)
        {
            return threadname.threadName;
        }

        public static ThreadName valueOf(String s)
        {
            return (ThreadName)Enum.valueOf(com/fitbit/util/threading/FitbitHandlerThread$ThreadName, s);
        }

        public static ThreadName[] values()
        {
            return (ThreadName[])i.clone();
        }

        static 
        {
            a = new ThreadName("BLUETOOTH_CONNECTION", 0, "com.fitbit.util.threading.BLUETOOTH_CONNECTION");
            b = new ThreadName("GALILEO_PROTOCOL", 1, "com.fitbit.util.threading.GALILEO_PROTOCOL");
            c = new ThreadName("GALILEO_PROTOCOL_REQUEST", 2, "com.fitbit.util.threading.GALILEO_PROTOCOL_REQUEST");
            d = new ThreadName("GALILEO_TASK_MANAGER", 3, "com.fitbit.util.threading.GALILEO_TASK_MANAGER");
            e = new ThreadName("NOTIFICATIONS_OBSERVER", 4, "com.fitbit.util.threading.NOTIFICATIONS_OBSERVER");
            f = new ThreadName("DNCS_CONNECTION_SERVICE", 5, "com.fitbit.util.threading.DNCS_CONNECTION_SERVICE");
            g = new ThreadName("PEDOMETER", 6, "com.fitbit.util.threading.PEDOMETER");
            h = new ThreadName("GENERAL", 7, "com.fitbit.util.threading.GENERAL");
            i = (new ThreadName[] {
                a, b, c, d, e, f, g, h
            });
        }

        private ThreadName(String s, int j, String s1)
        {
            super(s, j);
            threadName = s1;
        }
    }

    private static class a
    {

        public static FitbitHandlerThread a = new FitbitHandlerThread();


        private a()
        {
        }
    }


    private static final String a = "FitbitHandlerThread";
    private Map b;
    private final Handler c = new Handler(Looper.getMainLooper());

    public FitbitHandlerThread()
    {
        b = new HashMap();
    }

    public static Handler a()
    {
        if (Looper.myLooper() != null)
        {
            return new Handler();
        } else
        {
            return new Handler(Looper.getMainLooper());
        }
    }

    private static HandlerThread a(String s)
    {
        HandlerThread handlerthread = new HandlerThread(s);
        b().b.put(s, handlerthread);
        com.fitbit.e.a.a("FitbitHandlerThread", String.format("Added thread with name %s to thread map. Size is now %s", new Object[] {
            s, Integer.valueOf(b().b.size())
        }), new Object[0]);
        handlerthread.start();
        return handlerthread;
    }

    public static void a(ThreadName threadname)
    {
        com/fitbit/util/threading/FitbitHandlerThread;
        JVM INSTR monitorenter ;
        if (threadname == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        HandlerThread handlerthread = (HandlerThread)b().b.remove(com.fitbit.util.threading.ThreadName.a(threadname));
        if (handlerthread == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        handlerthread.interrupt();
        handlerthread.quit();
        com.fitbit.e.a.a("FitbitHandlerThread", "Removed thread with name \"%s\"", new Object[] {
            com.fitbit.util.threading.ThreadName.a(threadname)
        });
        com.fitbit.e.a.a("FitbitHandlerThread", "Size of thread map = %s", new Object[] {
            Integer.valueOf(b().b.size())
        });
        com/fitbit/util/threading/FitbitHandlerThread;
        JVM INSTR monitorexit ;
        return;
        threadname;
        throw threadname;
    }

    public static void a(Runnable runnable, long l)
    {
        b().c.postDelayed(runnable, l);
    }

    private static boolean a(HandlerThread handlerthread, Runnable runnable)
    {
        boolean flag = (new Handler(handlerthread.getLooper())).post(runnable);
        if (!flag)
        {
            com.fitbit.e.a.e("FitbitHandlerThread", "Runnable skipped.", new Object[0]);
            com.fitbit.e.b.a(20, "FitbitHandlerThread", "Skipped runnable stacktrace", new Object[] {
                ""
            });
        }
        return flag;
    }

    public static boolean a(ThreadName threadname, Runnable runnable)
    {
        if (threadname == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        com/fitbit/util/threading/FitbitHandlerThread;
        JVM INSTR monitorenter ;
        HandlerThread handlerthread = (HandlerThread)b().b.get(com.fitbit.util.threading.ThreadName.a(threadname));
        if (handlerthread != null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        boolean flag = a(a(com.fitbit.util.threading.ThreadName.a(threadname)), runnable);
        com/fitbit/util/threading/FitbitHandlerThread;
        JVM INSTR monitorexit ;
        return flag;
        if (Thread.currentThread() != handlerthread)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        com/fitbit/util/threading/FitbitHandlerThread;
        JVM INSTR monitorexit ;
        runnable.run();
        return true;
        flag = a(handlerthread, runnable);
        com/fitbit/util/threading/FitbitHandlerThread;
        JVM INSTR monitorexit ;
        return flag;
        threadname;
        com/fitbit/util/threading/FitbitHandlerThread;
        JVM INSTR monitorexit ;
        throw threadname;
        return a(runnable);
    }

    public static boolean a(Runnable runnable)
    {
        return a(false, runnable);
    }

    public static boolean a(boolean flag, Runnable runnable)
    {
        Handler handler = b().c;
        if (flag && Looper.myLooper() == handler.getLooper())
        {
            runnable.run();
            return true;
        } else
        {
            return handler.post(runnable);
        }
    }

    public static Handler b(ThreadName threadname)
    {
        com/fitbit/util/threading/FitbitHandlerThread;
        JVM INSTR monitorenter ;
        if (threadname == null) goto _L2; else goto _L1
_L1:
        HandlerThread handlerthread = (HandlerThread)b().b.get(com.fitbit.util.threading.ThreadName.a(threadname));
        if (handlerthread != null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        threadname = a(com.fitbit.util.threading.ThreadName.a(threadname));
_L6:
        if (threadname.getLooper() == null) goto _L2; else goto _L3
_L3:
        threadname = new Handler(threadname.getLooper());
_L5:
        com/fitbit/util/threading/FitbitHandlerThread;
        JVM INSTR monitorexit ;
        return threadname;
_L2:
        threadname = a();
        if (true) goto _L5; else goto _L4
_L4:
        threadname;
        throw threadname;
        threadname = handlerthread;
          goto _L6
    }

    private static FitbitHandlerThread b()
    {
        return com.fitbit.util.threading.a.a;
    }
}
