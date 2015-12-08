// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android;

import IO;
import Lw;
import android.util.Log;
import com.snapchat.android.util.debug.ReleaseManager;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import kC;

public final class Timber
{
    public static final class LogType extends Enum
    {

        private static final LogType $VALUES[];
        public static final LogType BITMAP_POOL_MONITOR;
        public static final LogType CHAT;
        public static final LogType DEBUG;
        public static final LogType DOWNLOAD_PROGRESS;
        public static final LogType ERROR_WITHOUT_TRACE;
        public static final LogType ERROR_WITH_TRACE;
        public static final LogType INFO;
        public static final LogType LOCATION_MANAGER;
        public static final LogType LOOKSERY;
        public static final LogType VERBOSE;
        public static final LogType WARNING;

        public static LogType valueOf(String s)
        {
            return (LogType)Enum.valueOf(com/snapchat/android/Timber$LogType, s);
        }

        public static LogType[] values()
        {
            return (LogType[])$VALUES.clone();
        }

        static 
        {
            VERBOSE = new LogType("VERBOSE", 0);
            INFO = new LogType("INFO", 1);
            DEBUG = new LogType("DEBUG", 2);
            WARNING = new LogType("WARNING", 3);
            ERROR_WITHOUT_TRACE = new LogType("ERROR_WITHOUT_TRACE", 4);
            ERROR_WITH_TRACE = new LogType("ERROR_WITH_TRACE", 5);
            CHAT = new LogType("CHAT", 6);
            LOCATION_MANAGER = new LogType("LOCATION_MANAGER", 7);
            BITMAP_POOL_MONITOR = new LogType("BITMAP_POOL_MONITOR", 8);
            DOWNLOAD_PROGRESS = new LogType("DOWNLOAD_PROGRESS", 9);
            LOOKSERY = new LogType("LOOKSERY", 10);
            $VALUES = (new LogType[] {
                VERBOSE, INFO, DEBUG, WARNING, ERROR_WITHOUT_TRACE, ERROR_WITH_TRACE, CHAT, LOCATION_MANAGER, BITMAP_POOL_MONITOR, DOWNLOAD_PROGRESS, 
                LOOKSERY
            });
        }

        private LogType(String s, int j)
        {
            super(s, j);
        }
    }


    public static String a()
    {
        if (!ReleaseManager.e())
        {
            return "";
        } else
        {
            StackTraceElement stacktraceelement = Thread.currentThread().getStackTrace()[4];
            String s = stacktraceelement.getClassName();
            s = s.substring(s.lastIndexOf('.') + 1);
            return (new StringBuilder()).append(s).append(".").append(stacktraceelement.getMethodName()).toString();
        }
    }

    public static transient void a(LogType logtype, String s, boolean flag, Throwable throwable, String s1, Object aobj[])
    {
        if (!ReleaseManager.f())
        {
            return;
        } else
        {
            long l = Thread.currentThread().getId();
            IO.SERIAL_EXECUTOR_FOR_LOGGING.submit(new Runnable(s1, aobj, logtype, s, flag, l, throwable) {

                private String a;
                private Object b[];
                private LogType c;
                private String d;
                private boolean e;
                private long f;
                private Throwable g;

                public final void run()
                {
                    String s2;
                    s2 = a;
                    if (b.length > 0)
                    {
                        s2 = String.format(a, b);
                    }
                    static final class _cls3
                    {

                        static final int a[];

                        static 
                        {
                            a = new int[LogType.values().length];
                            try
                            {
                                a[LogType.VERBOSE.ordinal()] = 1;
                            }
                            catch (NoSuchFieldError nosuchfielderror5) { }
                            try
                            {
                                a[LogType.INFO.ordinal()] = 2;
                            }
                            catch (NoSuchFieldError nosuchfielderror4) { }
                            try
                            {
                                a[LogType.DEBUG.ordinal()] = 3;
                            }
                            catch (NoSuchFieldError nosuchfielderror3) { }
                            try
                            {
                                a[LogType.WARNING.ordinal()] = 4;
                            }
                            catch (NoSuchFieldError nosuchfielderror2) { }
                            try
                            {
                                a[LogType.ERROR_WITHOUT_TRACE.ordinal()] = 5;
                            }
                            catch (NoSuchFieldError nosuchfielderror1) { }
                            try
                            {
                                a[LogType.ERROR_WITH_TRACE.ordinal()] = 6;
                            }
                            catch (NoSuchFieldError nosuchfielderror)
                            {
                                return;
                            }
                        }
                    }

                    _cls3.a[c.ordinal()];
                    JVM INSTR tableswitch 1 6: default 76
                //                               1 103
                //                               2 130
                //                               3 157
                //                               4 184
                //                               5 211
                //                               6 238;
                       goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
                    if (e)
                    {
                        Lw.a(c.name(), d, s2, f);
                    }
_L9:
                    return;
_L2:
                    if (e)
                    {
                        Lw.a(c.name(), d, s2, f);
                        return;
                    }
                    continue; /* Loop/switch isn't completed */
_L3:
                    if (e)
                    {
                        Lw.a(c.name(), d, s2, f);
                        return;
                    }
                    continue; /* Loop/switch isn't completed */
_L4:
                    if (e)
                    {
                        Lw.a(c.name(), d, s2, f);
                        return;
                    }
                    continue; /* Loop/switch isn't completed */
_L5:
                    if (e)
                    {
                        Lw.a(c.name(), d, s2, f);
                        return;
                    }
                    continue; /* Loop/switch isn't completed */
_L6:
                    if (e)
                    {
                        Lw.a(c.name(), d, s2, f);
                        return;
                    }
                    continue; /* Loop/switch isn't completed */
_L7:
                    String s3 = Log.getStackTraceString(g);
                    if (e)
                    {
                        Lw.a(c.name(), d, s3, f);
                        return;
                    }
                    if (true) goto _L9; else goto _L8
_L8:
                }

            
            {
                a = s;
                b = aobj;
                c = logtype;
                d = s1;
                e = flag;
                f = l;
                g = throwable;
                super();
            }
            });
            return;
        }
    }

    public static transient void a(Class class1, String s, Object aobj[])
    {
        String s1 = class1.getSimpleName();
        class1 = s1;
        if (s1.length() > 23)
        {
            class1 = s1.substring(0, 23);
        }
        c(class1, s, aobj);
    }

    public static transient void a(String s, String s1, Object aobj[])
    {
        if (!ReleaseManager.f())
        {
            return;
        } else
        {
            a(LogType.VERBOSE, s, true, null, s1, aobj);
            return;
        }
    }

    public static void a(String s, Throwable throwable)
    {
        if (!ReleaseManager.f())
        {
            return;
        } else
        {
            a(LogType.ERROR_WITH_TRACE, s, true, throwable, "", new Object[0]);
            return;
        }
    }

    public static void a(kC kc)
    {
        if (!ReleaseManager.f())
        {
            return;
        } else
        {
            long l = Thread.currentThread().getId();
            IO.SERIAL_EXECUTOR_FOR_LOGGING.submit(new Runnable(kc, l) {

                private kC a;
                private long b;

                public final void run()
                {
                    kC kc1 = a;
                    long l3 = b;
                    kC.a(kc1.a, (new StringBuilder()).append(kc1.b).append(": begin").toString(), l3);
                    long l2 = ((Long)kc1.c.get(0)).longValue();
                    int j = 1;
                    long l1 = l2;
                    for (; j < kc1.c.size(); j++)
                    {
                        l1 = ((Long)kc1.c.get(j)).longValue();
                        String s = (String)kc1.d.get(j);
                        long l4 = ((Long)kc1.c.get(j - 1)).longValue();
                        kC.a(kc1.a, (new StringBuilder()).append(kc1.b).append(":      ").append(l1 - l4).append(" ms, ").append(s).toString(), l3);
                    }

                    kC.a(kc1.a, (new StringBuilder()).append(kc1.b).append(": end, ").append(l1 - l2).append(" ms").toString(), l3);
                }

            
            {
                a = kc;
                b = l;
                super();
            }
            });
            return;
        }
    }

    public static transient void b(String s, String s1, Object aobj[])
    {
        if (!ReleaseManager.f())
        {
            return;
        } else
        {
            a(LogType.INFO, s, true, null, s1, aobj);
            return;
        }
    }

    public static void b(String s, Throwable throwable)
    {
        if (!ReleaseManager.f())
        {
            return;
        } else
        {
            a(LogType.LOOKSERY, s, true, throwable, "", new Object[0]);
            return;
        }
    }

    public static transient void c(String s, String s1, Object aobj[])
    {
        if (!ReleaseManager.f())
        {
            return;
        } else
        {
            a(LogType.DEBUG, s, true, null, s1, aobj);
            return;
        }
    }

    public static transient void d(String s, String s1, Object aobj[])
    {
        if (!ReleaseManager.f())
        {
            return;
        } else
        {
            a(LogType.WARNING, s, true, null, s1, aobj);
            return;
        }
    }

    public static transient void e(String s, String s1, Object aobj[])
    {
        if (!ReleaseManager.f())
        {
            return;
        } else
        {
            a(LogType.ERROR_WITHOUT_TRACE, s, true, null, s1, aobj);
            return;
        }
    }

    public static transient void f(String s, String s1, Object aobj[])
    {
        if (!ReleaseManager.f())
        {
            return;
        } else
        {
            a(LogType.CHAT, s, true, null, s1, aobj);
            return;
        }
    }

    public static transient void g(String s, String s1, Object aobj[])
    {
        if (!ReleaseManager.f())
        {
            return;
        } else
        {
            a(LogType.LOCATION_MANAGER, s, true, null, s1, aobj);
            return;
        }
    }

    public static transient void h(String s, String s1, Object aobj[])
    {
        if (!ReleaseManager.f())
        {
            return;
        } else
        {
            a(LogType.BITMAP_POOL_MONITOR, s, true, null, s1, aobj);
            return;
        }
    }

    public static transient void i(String s, String s1, Object aobj[])
    {
        if (!ReleaseManager.f())
        {
            return;
        } else
        {
            a(LogType.LOOKSERY, s, true, null, s1, aobj);
            return;
        }
    }
}
