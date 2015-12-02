// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class n
{
    static class a
    {

        public static final boolean a;
        private final List b = new ArrayList();
        private boolean c;

        private long a()
        {
            if (b.size() == 0)
            {
                return 0L;
            } else
            {
                long l = ((a)b.get(0)).c;
                return ((a)b.get(b.size() - 1)).c - l;
            }
        }

        public void a(String s)
        {
            this;
            JVM INSTR monitorenter ;
            long l1;
            c = true;
            l1 = a();
            if (l1 > 0L) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            long l;
            l = ((a)b.get(0)).c;
            n.b("(%-4d ms) %s", new Object[] {
                Long.valueOf(l1), s
            });
            s = b.iterator();
_L4:
            if (!s.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            a a1 = (a)s.next();
            l1 = a1.c;
            n.b("(+%-4d) [%2d] %s", new Object[] {
                Long.valueOf(l1 - l), Long.valueOf(a1.b), a1.a
            });
            l = l1;
            if (true) goto _L4; else goto _L3
_L3:
            if (true) goto _L1; else goto _L5
_L5:
            s;
            throw s;
        }

        public void a(String s, long l)
        {
            this;
            JVM INSTR monitorenter ;
            if (c)
            {
                throw new IllegalStateException("Marker added to finished log");
            }
            break MISSING_BLOCK_LABEL_24;
            s;
            this;
            JVM INSTR monitorexit ;
            throw s;
            b.add(new a(s, l, SystemClock.elapsedRealtime()));
            this;
            JVM INSTR monitorexit ;
        }

        protected void finalize()
            throws Throwable
        {
            if (!c)
            {
                a("Request on the loose");
                n.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }

        static 
        {
            a = n.b;
        }

        a()
        {
            c = false;
        }
    }

    private static class a.a
    {

        public final String a;
        public final long b;
        public final long c;

        public a.a(String s, long l, long l1)
        {
            a = s;
            b = l;
            c = l1;
        }
    }


    public static String a;
    public static boolean b;

    public n()
    {
    }

    public static transient void a(String s, Object aobj[])
    {
        if (b)
        {
            Log.v(a, e(s, aobj));
        }
    }

    public static transient void a(Throwable throwable, String s, Object aobj[])
    {
        Log.e(a, e(s, aobj), throwable);
    }

    public static transient void b(String s, Object aobj[])
    {
        Log.d(a, e(s, aobj));
    }

    public static transient void c(String s, Object aobj[])
    {
        Log.e(a, e(s, aobj));
    }

    public static transient void d(String s, Object aobj[])
    {
        Log.wtf(a, e(s, aobj));
    }

    private static transient String e(String s, Object aobj[])
    {
        int i;
        if (aobj != null)
        {
            s = String.format(Locale.US, s, aobj);
        }
        aobj = (new Throwable()).fillInStackTrace().getStackTrace();
        i = 2;
_L6:
        if (i < aobj.length) goto _L2; else goto _L1
_L1:
        aobj = "<unknown>";
_L4:
        return String.format(Locale.US, "[%d] %s: %s", new Object[] {
            Long.valueOf(Thread.currentThread().getId()), aobj, s
        });
_L2:
        if (aobj[i].getClass().equals(com/android/volley/n))
        {
            break; /* Loop/switch isn't completed */
        }
        String s1 = ((StackTraceElement) (aobj[i])).getClassName();
        s1 = s1.substring(s1.lastIndexOf('.') + 1);
        aobj = (new StringBuilder(String.valueOf(s1.substring(s1.lastIndexOf('$') + 1)))).append(".").append(((StackTraceElement) (aobj[i])).getMethodName()).toString();
        if (true) goto _L4; else goto _L3
_L3:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static 
    {
        a = "Volley";
        b = Log.isLoggable(a, 2);
    }
}
