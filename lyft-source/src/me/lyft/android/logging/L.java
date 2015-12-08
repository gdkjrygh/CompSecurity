// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.logging;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package me.lyft.android.logging:
//            ILogger

public class L
{

    private static final ILogger log = new ILogger() {

        public transient void d(String s, Object aobj[])
        {
            for (Iterator iterator = L.loggers.iterator(); iterator.hasNext(); ((ILogger)iterator.next()).d(s, aobj)) { }
        }

        public transient void d(Throwable throwable, String s, Object aobj[])
        {
            for (Iterator iterator = L.loggers.iterator(); iterator.hasNext(); ((ILogger)iterator.next()).d(throwable, s, aobj)) { }
        }

        public transient void e(String s, Object aobj[])
        {
            for (Iterator iterator = L.loggers.iterator(); iterator.hasNext(); ((ILogger)iterator.next()).e(s, aobj)) { }
        }

        public transient void e(Throwable throwable, String s, Object aobj[])
        {
            for (Iterator iterator = L.loggers.iterator(); iterator.hasNext(); ((ILogger)iterator.next()).e(throwable, s, aobj)) { }
        }

        public transient void i(String s, Object aobj[])
        {
            for (Iterator iterator = L.loggers.iterator(); iterator.hasNext(); ((ILogger)iterator.next()).i(s, aobj)) { }
        }

        public transient void i(Throwable throwable, String s, Object aobj[])
        {
            for (Iterator iterator = L.loggers.iterator(); iterator.hasNext(); ((ILogger)iterator.next()).i(throwable, s, aobj)) { }
        }

        public transient void v(String s, Object aobj[])
        {
            for (Iterator iterator = L.loggers.iterator(); iterator.hasNext(); ((ILogger)iterator.next()).v(s, aobj)) { }
        }

        public transient void v(Throwable throwable, String s, Object aobj[])
        {
            for (Iterator iterator = L.loggers.iterator(); iterator.hasNext(); ((ILogger)iterator.next()).v(throwable, s, aobj)) { }
        }

        public transient void w(String s, Object aobj[])
        {
            for (Iterator iterator = L.loggers.iterator(); iterator.hasNext(); ((ILogger)iterator.next()).w(s, aobj)) { }
        }

        public transient void w(Throwable throwable, String s, Object aobj[])
        {
            for (Iterator iterator = L.loggers.iterator(); iterator.hasNext(); ((ILogger)iterator.next()).w(throwable, s, aobj)) { }
        }

    };
    static final List loggers = new CopyOnWriteArrayList();

    private L()
    {
    }

    public static void add(ILogger ilogger)
    {
        loggers.add(ilogger);
    }

    public static transient void d(String s, Object aobj[])
    {
        log.d(s, aobj);
    }

    public static transient void d(Throwable throwable, String s, Object aobj[])
    {
        log.d(throwable, s, aobj);
    }

    public static transient void e(String s, Object aobj[])
    {
        log.e(s, aobj);
    }

    public static transient void e(Throwable throwable, String s, Object aobj[])
    {
        log.e(throwable, s, aobj);
    }

    public static transient void i(String s, Object aobj[])
    {
        log.i(s, aobj);
    }

    public static transient void i(Throwable throwable, String s, Object aobj[])
    {
        log.i(throwable, s, aobj);
    }

    public static void remove(ILogger ilogger)
    {
        int j = 0;
        for (int k = loggers.size(); j < k; j++)
        {
            if (loggers.get(j) == ilogger)
            {
                loggers.remove(j);
                return;
            }
        }

        throw new IllegalArgumentException((new StringBuilder()).append("Cannot remove log that was not added: ").append(ilogger).toString());
    }

    public static void removeAll()
    {
        loggers.clear();
    }

    public static transient void v(String s, Object aobj[])
    {
        log.v(s, aobj);
    }

    public static transient void v(Throwable throwable, String s, Object aobj[])
    {
        log.v(throwable, s, aobj);
    }

    public static transient void w(String s, Object aobj[])
    {
        log.w(s, aobj);
    }

    public static transient void w(Throwable throwable, String s, Object aobj[])
    {
        log.w(throwable, s, aobj);
    }

}
