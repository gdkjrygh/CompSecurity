// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.i;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package p.i:
//            a

final class d
{
    private static class a
        implements Executor
    {

        private ThreadLocal a;

        private int a()
        {
            Integer integer1 = (Integer)a.get();
            Integer integer = integer1;
            if (integer1 == null)
            {
                integer = Integer.valueOf(0);
            }
            int i = integer.intValue() + 1;
            a.set(Integer.valueOf(i));
            return i;
        }

        private int b()
        {
            Integer integer1 = (Integer)a.get();
            Integer integer = integer1;
            if (integer1 == null)
            {
                integer = Integer.valueOf(0);
            }
            int i = integer.intValue() - 1;
            if (i == 0)
            {
                a.remove();
                return i;
            } else
            {
                a.set(Integer.valueOf(i));
                return i;
            }
        }

        public void execute(Runnable runnable)
        {
            if (a() > 15) goto _L2; else goto _L1
_L1:
            runnable.run();
_L4:
            b();
            return;
_L2:
            d.a().execute(runnable);
            if (true) goto _L4; else goto _L3
_L3:
            runnable;
            b();
            throw runnable;
        }

        private a()
        {
            a = new ThreadLocal();
        }

    }


    private static final d a = new d();
    private final ExecutorService b;
    private final Executor c = new a();

    private d()
    {
        ExecutorService executorservice;
        if (!c())
        {
            executorservice = Executors.newCachedThreadPool();
        } else
        {
            executorservice = p.i.a.a();
        }
        b = executorservice;
    }

    public static ExecutorService a()
    {
        return a.b;
    }

    static Executor b()
    {
        return a.c;
    }

    private static boolean c()
    {
        String s = System.getProperty("java.runtime.name");
        if (s == null)
        {
            return false;
        } else
        {
            return s.toLowerCase(Locale.US).contains("android");
        }
    }

}
