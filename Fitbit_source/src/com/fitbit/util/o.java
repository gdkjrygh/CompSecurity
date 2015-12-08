// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateUtils;
import android.text.format.Time;
import com.fitbit.runtrack.Duration;
import com.fitbit.util.format.d;
import com.fitbit.util.format.e;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.fitbit.util:
//            bn, al

public class o
{
    public static class a
    {

        private final SimpleDateFormat a = new SimpleDateFormat("EEE", Locale.getDefault());
        private final SimpleDateFormat b = new SimpleDateFormat("MMM d", Locale.getDefault());
        private final CharSequence c;
        private final Date d = new Date();

        public CharSequence a(Date date)
        {
            if (date.after(d))
            {
                return c;
            }
            if (Duration.a(date, d).b() > 168L)
            {
                return b.format(date);
            }
            if (!DateUtils.isToday(date.getTime()))
            {
                return a.format(date);
            } else
            {
                return c;
            }
        }

        public a(Context context)
        {
            c = context.getText(0x7f080540);
        }
    }

    public static class b
    {

        private final DateFormat a;
        private final DateFormat b = new SimpleDateFormat("yyyy", al.a());
        private final Context c;

        public String a(Date date)
        {
            Calendar calendar = o.b(date.getTime());
            date = o.c(date.getTime());
            String s1 = b.format(com.fitbit.util.o.d().getTime());
            String s2 = b.format(date.getTime());
            if (calendar.equals(o.b(o.b().getTime())))
            {
                date = c.getString(0x7f08051e);
            } else
            if (!s2.equals(s1))
            {
                date = String.format(c.getString(0x7f080237), new Object[] {
                    a.format(calendar.getTime()), a.format(date.getTime()), b.format(date.getTime())
                });
            } else
            {
                date = String.format(c.getString(0x7f080236), new Object[] {
                    a.format(calendar.getTime()), a.format(date.getTime())
                });
            }
            date.toUpperCase(al.a());
            return date;
        }

        public b(Context context)
        {
            c = context;
            a = com.fitbit.util.format.d.y(context);
        }
    }


    public static final long a = 1000L;
    public static final long b = 60000L;
    public static final long c = 0x36ee80L;
    public static final long d = 0x5265c00L;
    public static final long e = 0x240c8400L;
    public static final long f = 0x9a7ec800L;
    public static final long g = 0x757b12c00L;
    public static final long h = 0xf4240L;
    public static final long i = 0x3938700L;
    public static final long j = 3600L;
    public static final long k = 1440L;
    public static final long l = 60L;
    public static final long m = 24L;

    public o()
    {
    }

    public static int a(int i1, int j1)
    {
        return (i1 * 60 + j1) * 60 * 1000;
    }

    public static int a(Context context)
    {
        int i1;
        try
        {
            i1 = context.getResources().getInteger(0x7f0e0001);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return 1990;
        }
        return i1;
    }

    public static int a(Calendar calendar, Calendar calendar1)
    {
        calendar = (Calendar)calendar.clone();
        calendar.set(5, 0);
        calendar.set(7, 0);
        calendar.set(8, 0);
        calendar.set(6, 0);
        calendar.set(4, 0);
        calendar.set(3, 0);
        calendar.set(2, 0);
        calendar.set(1, 0);
        calendar1 = (Calendar)calendar1.clone();
        calendar1.set(5, 0);
        calendar1.set(7, 0);
        calendar1.set(8, 0);
        calendar1.set(6, 0);
        calendar1.set(4, 0);
        calendar1.set(3, 0);
        calendar1.set(2, 0);
        calendar1.set(1, 0);
        return calendar.compareTo(calendar1);
    }

    public static int a(Calendar calendar, Date date)
    {
        calendar.setTime(date);
        return calendar.get(1);
    }

    public static long a(Date date, Date date1)
    {
        return (date1.getTime() - date.getTime()) / 0x240c8400L;
    }

    public static long a(Date date, Date date1, long l1)
    {
        return (long)Math.ceil((double)(date1.getTime() - date.getTime()) / (double)l1);
    }

    public static long a(Date date, Date date1, TimeUnit timeunit)
    {
        return timeunit.convert(date1.getTime() - date.getTime(), TimeUnit.MILLISECONDS);
    }

    public static String a(Context context, Date date)
    {
        String s1;
        if (date == null)
        {
            s1 = "";
        } else
        {
            String s2 = a(date, context);
            s1 = s2;
            if (s2 == null)
            {
                return com.fitbit.util.format.e.u(context, date);
            }
        }
        return s1;
    }

    private static String a(Date date, Context context)
    {
        Object obj = null;
        if (i(date))
        {
            context = context.getString(0x7f080540);
        } else
        {
            if (p(date))
            {
                return context.getString(0x7f0805ad);
            }
            context = Calendar.getInstance();
            context.set(14, 0);
            context.set(13, 0);
            context.set(12, 0);
            context.set(11, 0);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.set(11, 0);
            int i1 = context.get(7);
            long l1 = context.getTimeInMillis() - calendar.getTimeInMillis();
            context = obj;
            if (l1 >= 0L)
            {
                l1 /= 0x5265c00L;
                context = obj;
                if (l1 >= 1L)
                {
                    context = obj;
                    if (l1 < (long)i1)
                    {
                        return com.fitbit.util.format.e.k(date);
                    }
                }
            }
        }
        return context;
    }

    public static Calendar a()
    {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        a(calendar);
        calendar.set(10, 0);
        calendar.set(9, 1);
        calendar.set(11, 12);
        return calendar;
    }

    public static Calendar a(long l1)
    {
        GregorianCalendar gregoriancalendar = c();
        gregoriancalendar.setTimeInMillis(l1);
        d(gregoriancalendar);
        return gregoriancalendar;
    }

    public static Date a(int i1, int j1, int k1, int l1, int i2, int j2)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, i1);
        calendar.set(2, j1);
        calendar.set(5, k1);
        calendar.set(11, l1);
        calendar.set(12, i2);
        calendar.set(13, j2);
        return calendar.getTime();
    }

    public static Date a(Date date)
    {
        return a(date, TimeZone.getDefault());
    }

    public static Date a(Date date, int i1, int j1)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(j1, i1);
        return calendar.getTime();
    }

    public static Date a(Date date, TimeZone timezone)
    {
        while (date == null || timezone == null) 
        {
            return null;
        }
        timezone = Calendar.getInstance(timezone);
        timezone.setTime(date);
        a(((Calendar) (timezone)));
        return timezone.getTime();
    }

    public static GregorianCalendar a(Locale locale)
    {
        return new GregorianCalendar(bn.b(), locale);
    }

    public static void a(Calendar calendar)
    {
        calendar.clear(10);
        calendar.clear(9);
        calendar.clear(11);
        calendar.clear(12);
        calendar.clear(13);
        calendar.clear(14);
    }

    public static void a(Calendar calendar, int i1)
    {
        calendar.set(14, 0);
        calendar.set(13, i1 % 60);
        i1 /= 60;
        calendar.set(12, i1 % 60);
        calendar.set(11, (i1 / 60) % 24);
    }

    private static boolean a(Date date, Calendar calendar)
    {
        Time time = new Time();
        time.set(calendar.getTimeInMillis());
        calendar = new Time();
        calendar.set(date.getTime());
        return time.year == ((Time) (calendar)).year && time.month == ((Time) (calendar)).month && time.monthDay == ((Time) (calendar)).monthDay;
    }

    public static boolean a(Date date, Date date1, Date date2)
    {
        return date.compareTo(date1) > 0 && date.compareTo(date2) < 0;
    }

    public static int b(Calendar calendar, Calendar calendar1)
    {
        return h(calendar) - h(calendar1);
    }

    public static int b(Calendar calendar, Date date)
    {
        calendar.setTime(date);
        return calendar.get(3);
    }

    public static long b(Date date, Date date1)
    {
        return Math.round((double)(date1.getTime() - date.getTime()) / 604800000D);
    }

    public static Calendar b(long l1)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l1);
        d(calendar);
        return calendar;
    }

    public static Date b()
    {
        return new Date();
    }

    public static Date b(Context context)
    {
        GregorianCalendar gregoriancalendar = new GregorianCalendar();
        a(gregoriancalendar);
        gregoriancalendar.set(a(context), 0, 1);
        return gregoriancalendar.getTime();
    }

    public static Date b(Date date)
    {
        return c(date, TimeZone.getDefault());
    }

    public static Date b(Date date, TimeZone timezone)
    {
        if (date == null)
        {
            return null;
        } else
        {
            timezone = Calendar.getInstance(timezone);
            timezone.setTime(date);
            timezone.set(10, 11);
            timezone.set(9, 1);
            timezone.set(11, 23);
            timezone.set(12, 59);
            timezone.set(13, 59);
            timezone.set(14, 999);
            return timezone.getTime();
        }
    }

    public static void b(Calendar calendar)
    {
        a(calendar);
        calendar.set(10, 0);
        calendar.set(9, 1);
        calendar.set(11, 12);
    }

    public static boolean b(Date date, Date date1, Date date2)
    {
        return date.compareTo(date1) >= 0 && date.compareTo(date2) <= 0;
    }

    public static int c(Calendar calendar, Date date)
    {
        return b(calendar, date) * 10000 + a(calendar, date);
    }

    public static long c(Date date, Date date1)
    {
        return a(date, date1, TimeUnit.DAYS);
    }

    public static Calendar c(long l1)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l1);
        e(calendar);
        return calendar;
    }

    public static Date c(Date date)
    {
        return c(date, bn.b());
    }

    private static Date c(Date date, TimeZone timezone)
    {
        if (date == null)
        {
            return null;
        } else
        {
            timezone = Calendar.getInstance(timezone);
            timezone.setTime(date);
            a(timezone);
            timezone.set(10, 0);
            timezone.set(9, 1);
            timezone.set(11, 12);
            return timezone.getTime();
        }
    }

    public static GregorianCalendar c()
    {
        return a(al.a());
    }

    public static void c(Calendar calendar)
    {
        calendar.set(10, 11);
        calendar.set(9, 1);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, calendar.getActualMaximum(14));
    }

    public static boolean c(Calendar calendar, Calendar calendar1)
    {
        if (calendar == null || calendar1 == null)
        {
            throw new IllegalArgumentException("The date must not be null");
        }
        return calendar.get(0) == calendar1.get(0) && calendar.get(1) == calendar1.get(1) && calendar.get(6) == calendar1.get(6);
    }

    public static int d(Calendar calendar, Date date)
    {
        calendar.setTime(date);
        return calendar.get(2);
    }

    public static long d(Date date, Date date1)
    {
        return a(date, date1, TimeUnit.HOURS);
    }

    public static String d(long l1)
    {
        Calendar calendar = Calendar.getInstance(bn.b());
        calendar.setTimeInMillis(l1);
        return DateUtils.getDayOfWeekString(calendar.get(7), 50);
    }

    public static Calendar d()
    {
        Calendar calendar = Calendar.getInstance(al.a());
        a(calendar);
        return calendar;
    }

    public static Date d(Date date)
    {
        return a(date, bn.b());
    }

    public static void d(Calendar calendar)
    {
        a(calendar);
        calendar.set(7, calendar.getFirstDayOfWeek());
    }

    public static int e()
    {
        return Calendar.getInstance().get(1);
    }

    public static long e(Date date, Date date1)
    {
        return a(date, date1, 60000L);
    }

    public static Date e(Calendar calendar, Date date)
    {
        calendar.setTime(date);
        calendar.set(7, calendar.getFirstDayOfWeek());
        a(calendar);
        return calendar.getTime();
    }

    public static Date e(Date date)
    {
        return b(date, TimeZone.getDefault());
    }

    public static void e(Calendar calendar)
    {
        a(calendar);
        calendar.set(7, calendar.getFirstDayOfWeek());
        calendar.add(7, 7);
        calendar.add(13, -1);
    }

    public static long f(Date date, Date date1)
    {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar1 = Calendar.getInstance();
        calendar.setTime(date);
        calendar1.setTime(date1);
        return (long)(h(calendar1) - h(calendar));
    }

    public static Date f()
    {
        return new Date((new Date()).getTime() + 0x496cebb800L);
    }

    public static Date f(Calendar calendar, Date date)
    {
        return new Date((d(e(calendar, date)).getTime() + 0x240c8400L) - 1L);
    }

    public static Date f(Date date)
    {
        return b(date, bn.b());
    }

    public static void f(Calendar calendar)
    {
        calendar.set(10, 11);
        calendar.set(9, 1);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, calendar.getActualMaximum(14));
        calendar.set(5, calendar.getActualMaximum(5));
    }

    public static int g(Date date, Date date1)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        date = Calendar.getInstance();
        date.setTime(date1);
        int j1 = date.get(1) - calendar.get(1);
        int i1 = j1;
        if (calendar.get(6) > date.get(6))
        {
            i1 = j1 - 1;
        }
        return i1;
    }

    public static Date g()
    {
        return new Date((new Date()).getTime() - 0xa4cb800L);
    }

    public static Date g(Date date)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(5, 1);
        calendar.add(2, 1);
        a(calendar);
        calendar.add(14, -1);
        return calendar.getTime();
    }

    public static void g(Calendar calendar)
    {
        calendar.set(10, 0);
        calendar.set(9, 0);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.set(5, 1);
    }

    public static int h(Calendar calendar)
    {
        Date date1 = com.fitbit.util.format.e.b(calendar.getTime());
        Date date = date1;
        if (date1 == null)
        {
            date = calendar.getTime();
        }
        return (int)(date.getTime() / 0x5265c00L);
    }

    public static Date h(Date date)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(11, 23);
        calendar.add(12, 59);
        calendar.add(13, 59);
        calendar.add(14, 999);
        return calendar.getTime();
    }

    public static Date h(Date date, Date date1)
    {
        if (date.before(date1))
        {
            return date;
        } else
        {
            return date1;
        }
    }

    public static Date i(Date date, Date date1)
    {
        if (date.after(date1))
        {
            return date;
        } else
        {
            return date1;
        }
    }

    public static boolean i(Calendar calendar)
    {
        return (new GregorianCalendar()).get(3) == calendar.get(3) && (new GregorianCalendar()).get(1) == calendar.get(1);
    }

    public static boolean i(Date date)
    {
        if (date == null)
        {
            return false;
        } else
        {
            return a(date, Calendar.getInstance());
        }
    }

    public static boolean j(Calendar calendar)
    {
        return (new GregorianCalendar()).get(2) == calendar.get(2) && (new GregorianCalendar()).get(1) == calendar.get(1);
    }

    public static boolean j(Date date)
    {
        return a(date, Calendar.getInstance(bn.b()));
    }

    public static boolean j(Date date, Date date1)
    {
        return a(date).equals(a(date1));
    }

    public static boolean k(Date date)
    {
        Calendar calendar = Calendar.getInstance(bn.b());
        calendar.add(5, -1);
        return j(calendar.getTime(), date);
    }

    public static boolean k(Date date, Date date1)
    {
        if (!date1.equals(date))
        {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date1);
            calendar.add(5, 1);
            if (date.getTime() > calendar.getTime().getTime())
            {
                return false;
            }
        }
        return true;
    }

    public static boolean l(Date date)
    {
        Calendar calendar = Calendar.getInstance(bn.b());
        calendar.setTime(date);
        return calendar.get(11) == 23 && calendar.get(12) == 59 && calendar.get(13) == 59;
    }

    public static boolean l(Date date, Date date1)
    {
        if (date == null || date1 == null)
        {
            throw new IllegalArgumentException("The date must not be null");
        } else
        {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            date = Calendar.getInstance();
            date.setTime(date1);
            return c(calendar, date);
        }
    }

    public static Date m(Date date)
    {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.setTime(date);
        calendar.add(14, bn.b().getOffset(date.getTime()) - TimeZone.getDefault().getOffset(date.getTime()));
        return calendar.getTime();
    }

    public static Date n(Date date)
    {
        if (date == null)
        {
            return null;
        } else
        {
            Calendar calendar = Calendar.getInstance(bn.b());
            calendar.setTime(date);
            calendar.add(14, -(TimeZone.getDefault().getOffset(date.getTime()) - bn.b().getOffset(date.getTime())));
            return calendar.getTime();
        }
    }

    public static Date o(Date date)
    {
        if (date == null)
        {
            return null;
        } else
        {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(14, -TimeZone.getDefault().getOffset(date.getTime()));
            return calendar.getTime();
        }
    }

    public static boolean p(Date date)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -1);
        return j(calendar.getTime(), date);
    }

    public static boolean q(Date date)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, 1);
        return j(calendar.getTime(), date);
    }

    public static Date r(Date date)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(2, -1);
        return calendar.getTime();
    }

    public static boolean s(Date date)
    {
        return date != null && date.after(b());
    }

    public static boolean t(Date date)
    {
        return date != null && date.before(b());
    }
}
