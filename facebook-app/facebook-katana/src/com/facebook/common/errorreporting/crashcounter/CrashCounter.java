// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.errorreporting.crashcounter;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.facebook.acra.CustomReportDataSupplier;
import com.facebook.acra.ErrorReporter;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CrashCounter
{

    private final Context a;
    private final CalendarProvider b;
    private final String c;
    private boolean d;
    private int e;
    private long f[];
    private int g[];
    private HashMap h;

    public CrashCounter(Context context)
    {
        this(context, ((CalendarProvider) (new DefaultCalendarProvider((byte)0))));
    }

    private CrashCounter(Context context, CalendarProvider calendarprovider)
    {
        a = context;
        b = calendarprovider;
        c = (new StringBuilder()).append(context.getPackageName()).append(".crash.count").toString();
        f = new long[24];
        g = new int[24];
        h = new HashMap();
    }

    public static void a(Context context, ErrorReporter errorreporter)
    {
        context = new CrashCounter(context);
        context.b(errorreporter);
        context.a(errorreporter);
    }

    private void a(Intent intent)
    {
        int j = intent.getIntExtra("crash_count", 0);
        int ai[] = intent.getIntArrayExtra("crash_count_24h");
        long al[] = intent.getLongArrayExtra("crash_count_timestamp_24h");
        e = j;
        if (ai != null && ai.length == g.length)
        {
            System.arraycopy(ai, 0, g, 0, g.length);
        } else
        {
            Arrays.fill(g, 0);
        }
        if (al != null && al.length == f.length)
        {
            System.arraycopy(al, 0, f, 0, f.length);
        } else
        {
            Arrays.fill(f, 0L);
        }
        h.clear();
        if (intent.getExtras() != null)
        {
            Iterator iterator = intent.getExtras().keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s = (String)iterator.next();
                if (s.startsWith("flag_"))
                {
                    String s1 = s.substring(5);
                    long l = intent.getLongExtra(s, 0L);
                    h.put(s1, Long.valueOf(l));
                }
            } while (true);
        }
    }

    private void a(ErrorReporter errorreporter)
    {
        errorreporter.putLazyCustomData("crash_counter", h());
        errorreporter.putLazyCustomData("crash_counter_24h", i());
    }

    private void b(Intent intent)
    {
        intent.putExtra("crash_count", e);
        intent.putExtra("crash_count_24h", g);
        intent.putExtra("crash_count_timestamp_24h", f);
        java.util.Map.Entry entry;
        for (Iterator iterator = h.entrySet().iterator(); iterator.hasNext(); intent.putExtra((new StringBuilder("flag_")).append((String)entry.getKey()).toString(), (Serializable)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

    }

    private void b(ErrorReporter errorreporter)
    {
        if (errorreporter.isNativeCrashedOnPreviousRun())
        {
            a();
            c();
            b();
        }
    }

    private void f()
    {
        if (!d)
        {
            throw new IllegalStateException("State is not restored.");
        } else
        {
            return;
        }
    }

    private Calendar g()
    {
        Calendar calendar = b.a();
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    private CustomReportDataSupplier h()
    {
        return new _cls1();
    }

    private CustomReportDataSupplier i()
    {
        return new _cls2();
    }

    public final void a()
    {
        Intent intent1 = a.registerReceiver(null, new IntentFilter(c));
        Intent intent = intent1;
        if (intent1 == null)
        {
            intent = new Intent();
        }
        a(intent);
        d = true;
    }

    public final void a(String s)
    {
        f();
        Calendar calendar = g();
        h.put(s, Long.valueOf(calendar.getTimeInMillis()));
    }

    public final void b()
    {
        Intent intent = new Intent(c);
        b(intent);
        a.sendStickyBroadcast(intent);
    }

    public final boolean b(String s)
    {
        f();
        Calendar calendar = g();
        s = (Long)h.get(s);
        if (s != null)
        {
            return calendar.getTimeInMillis() - s.longValue() < 0x5265c00L;
        } else
        {
            return false;
        }
    }

    public final void c()
    {
        f();
        e = e + 1;
        Calendar calendar = g();
        int j = calendar.get(11);
        long l1 = f[j];
        long l = calendar.getTimeInMillis();
        l1 = l - l1;
        if (l1 >= 0L && l1 < 0x36ee80L)
        {
            int ai[] = g;
            ai[j] = ai[j] + 1;
        } else
        {
            g[j] = 1;
        }
        f[j] = l;
    }

    public final int d()
    {
        f();
        return e;
    }

    public final int e()
    {
        int k = 0;
        f();
        long l1 = g().getTimeInMillis();
        for (int j = 0; j < 24;)
        {
            long l2 = l1 - f[j];
            int l = k;
            if (l2 >= 0L)
            {
                l = k;
                if (l2 < 0x5265c00L)
                {
                    l = k + g[j];
                }
            }
            j++;
            k = l;
        }

        return k;
    }

    private class DefaultCalendarProvider
        implements CalendarProvider
    {

        public final Calendar a()
        {
            return Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        }

        private DefaultCalendarProvider()
        {
        }

        DefaultCalendarProvider(byte byte0)
        {
            this();
        }
    }


    private class CalendarProvider
    {

        public abstract Calendar a();
    }


    private class _cls1
        implements CustomReportDataSupplier
    {

        final CrashCounter a;

        public String getCustomData(Throwable throwable)
        {
            try
            {
                a.a();
                throwable = Integer.toString(a.d());
            }
            // Misplaced declaration of an exception variable
            catch (Throwable throwable)
            {
                return "n/a";
            }
            return throwable;
        }

        _cls1()
        {
            a = CrashCounter.this;
            super();
        }
    }


    private class _cls2
        implements CustomReportDataSupplier
    {

        final CrashCounter a;

        public String getCustomData(Throwable throwable)
        {
            try
            {
                a.a();
                throwable = Integer.toString(a.e());
            }
            // Misplaced declaration of an exception variable
            catch (Throwable throwable)
            {
                return "n/a";
            }
            return throwable;
        }

        _cls2()
        {
            a = CrashCounter.this;
            super();
        }
    }

}
