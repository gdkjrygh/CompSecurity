// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.k;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class t
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
            t.b("(%-4d ms) %s", new Object[] {
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
            t.b("(+%-4d) [%2d] %s", new Object[] {
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
                t.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }

        static 
        {
            a = t.b;
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

    public t()
    {
    }

    public static transient void a(String s, Object aobj[])
    {
        if (b)
        {
            Log.v(a, d(s, aobj));
        }
    }

    public static transient void a(Throwable throwable, String s, Object aobj[])
    {
        Log.e(a, d(s, aobj), throwable);
    }

    public static transient void b(String s, Object aobj[])
    {
        Log.d(a, d(s, aobj));
    }

    public static transient void c(String s, Object aobj[])
    {
        Log.e(a, d(s, aobj));
    }

    private static transient String d(String s, Object aobj[])
    {
        int i;
        String s1;
        if (aobj != null)
        {
            s = String.format(Locale.US, s, aobj);
        }
        aobj = (new Throwable()).fillInStackTrace().getStackTrace();
        i = 2;
_L3:
        if (i >= aobj.length)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        if (aobj[i].getClass().equals(p/k/t)) goto _L2; else goto _L1
_L1:
        s1 = ((StackTraceElement) (aobj[i])).getClassName();
        s1 = s1.substring(s1.lastIndexOf('.') + 1);
        s1 = s1.substring(s1.lastIndexOf('$') + 1);
        aobj = (new StringBuilder()).append(s1).append(".").append(((StackTraceElement) (aobj[i])).getMethodName()).toString();
_L4:
        return String.format(Locale.US, "[%d] %s: %s", new Object[] {
            Long.valueOf(Thread.currentThread().getId()), aobj, s
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
