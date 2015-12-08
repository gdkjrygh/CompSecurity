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

public class s
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

        public void a(String s1)
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
            s.b("(%-4d ms) %s", new Object[] {
                Long.valueOf(l1), s1
            });
            s1 = b.iterator();
_L4:
            if (!s1.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            a a1 = (a)s1.next();
            l1 = a1.c;
            s.b("(+%-4d) [%2d] %s", new Object[] {
                Long.valueOf(l1 - l), Long.valueOf(a1.b), a1.a
            });
            l = l1;
            if (true) goto _L4; else goto _L3
_L3:
            if (true) goto _L1; else goto _L5
_L5:
            s1;
            throw s1;
        }

        public void a(String s1, long l)
        {
            this;
            JVM INSTR monitorenter ;
            if (c)
            {
                throw new IllegalStateException("Marker added to finished log");
            }
            break MISSING_BLOCK_LABEL_24;
            s1;
            this;
            JVM INSTR monitorexit ;
            throw s1;
            b.add(new a(s1, l, SystemClock.elapsedRealtime()));
            this;
            JVM INSTR monitorexit ;
        }

        protected void finalize()
            throws Throwable
        {
            if (!c)
            {
                a("Request on the loose");
                s.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }

        static 
        {
            a = s.b;
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

        public a.a(String s1, long l, long l1)
        {
            a = s1;
            b = l;
            c = l1;
        }
    }


    public static String a;
    public static boolean b;

    public s()
    {
    }

    public static transient void a(String s1, Object aobj[])
    {
        if (b)
        {
            Log.v(a, e(s1, aobj));
        }
    }

    public static transient void a(Throwable throwable, String s1, Object aobj[])
    {
        Log.e(a, e(s1, aobj), throwable);
    }

    public static transient void b(String s1, Object aobj[])
    {
        Log.d(a, e(s1, aobj));
    }

    public static transient void c(String s1, Object aobj[])
    {
        Log.e(a, e(s1, aobj));
    }

    public static transient void d(String s1, Object aobj[])
    {
        Log.wtf(a, e(s1, aobj));
    }

    private static transient String e(String s1, Object aobj[])
    {
        int i;
        String s2;
        if (aobj != null)
        {
            s1 = String.format(Locale.US, s1, aobj);
        }
        aobj = (new Throwable()).fillInStackTrace().getStackTrace();
        i = 2;
_L3:
        if (i >= aobj.length)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        if (aobj[i].getClass().equals(com/android/volley/s)) goto _L2; else goto _L1
_L1:
        s2 = ((StackTraceElement) (aobj[i])).getClassName();
        s2 = s2.substring(s2.lastIndexOf('.') + 1);
        s2 = s2.substring(s2.lastIndexOf('$') + 1);
        aobj = (new StringBuilder()).append(s2).append(".").append(((StackTraceElement) (aobj[i])).getMethodName()).toString();
_L4:
        return String.format(Locale.US, "[%d] %s: %s", new Object[] {
            Long.valueOf(Thread.currentThread().getId()), aobj, s1
        });
_L2:
        i++;
          goto _L3
        aobj = "<unknown>";
          goto _L4
    }

    static 
    {
        a = "Volley";
        b = Log.isLoggable(a, 2);
    }
}
