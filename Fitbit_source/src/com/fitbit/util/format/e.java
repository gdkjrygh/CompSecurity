// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.format;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.format.Time;
import com.fitbit.FitBitApplication;
import com.fitbit.data.domain.Alarm;
import com.fitbit.data.domain.Brand;
import com.fitbit.data.domain.FoodItem;
import com.fitbit.data.domain.FoodLogEntry;
import com.fitbit.data.domain.Profile;
import com.fitbit.e.a;
import com.fitbit.util.al;
import com.fitbit.util.an;
import com.fitbit.util.bh;
import com.fitbit.util.bn;
import com.fitbit.util.o;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.fitbit.util.format:
//            d, h

public class e
{

    private static final String a = "FormatUtilities";

    public e()
    {
    }

    public static double a(String s1)
        throws ParseException
    {
        DecimalFormat decimalformat = com.fitbit.util.format.d.a();
        double d1;
        synchronized (d.q)
        {
            d1 = decimalformat.parse(s1).doubleValue();
        }
        return d1;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public static CharSequence a(Context context, int i1)
    {
        if (context == null)
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder();
        int j1 = (int)((long)i1 / 1440L);
        if (j1 > 0)
        {
            stringbuilder.append(e(j1));
            String s1 = context.getString(0x7f080135);
            stringbuilder.append(" ");
            stringbuilder.append(s1);
            stringbuilder.append(" ");
        }
        j1 = (int)((long)i1 % 1440L) / 60;
        if (j1 > 0)
        {
            stringbuilder.append(e(j1));
            String s2 = context.getString(0x7f08025f);
            stringbuilder.append(" ");
            stringbuilder.append(s2);
            stringbuilder.append(" ");
        }
        stringbuilder.append(e((int)((long)i1 % 1440L) % 60));
        stringbuilder.append(" ");
        stringbuilder.append(context.getString(0x7f0803d8));
        return stringbuilder;
    }

    public static CharSequence a(Context context, int i1, Object aobj[], Object aobj1[])
    {
        boolean flag = false;
        if (context != null) goto _L2; else goto _L1
_L1:
        aobj = null;
_L4:
        return ((CharSequence) (aobj));
_L2:
        SpannableStringBuilder spannablestringbuilder;
        int l1;
        spannablestringbuilder = new SpannableStringBuilder();
        l1 = i1 / 60;
        if (l1 > 0)
        {
            String s1 = e(l1);
            spannablestringbuilder.append(s1);
            String s2 = context.getString(0x7f08025f);
            spannablestringbuilder.append(" ");
            int j2 = aobj.length;
            for (int j1 = 0; j1 < j2; j1++)
            {
                spannablestringbuilder.setSpan(aobj[j1], 0, s1.length(), 18);
            }

            spannablestringbuilder.append(s2);
            spannablestringbuilder.append(" ");
        }
        i1 %= 60;
        if (i1 > 0)
        {
            break; /* Loop/switch isn't completed */
        }
        aobj = spannablestringbuilder;
        if (i1 != 0) goto _L4; else goto _L3
_L3:
        aobj = spannablestringbuilder;
        if (l1 != 0) goto _L4; else goto _L5
_L5:
        aobj = e(i1);
        int k1 = spannablestringbuilder.length();
        spannablestringbuilder.append(((CharSequence) (aobj)));
        spannablestringbuilder.append(" ");
        int i2 = aobj1.length;
        for (i1 = ((flag) ? 1 : 0); i1 < i2; i1++)
        {
            spannablestringbuilder.setSpan(aobj1[i1], k1, ((String) (aobj)).length() + k1, 18);
        }

        spannablestringbuilder.append(context.getString(0x7f0803d8));
        return spannablestringbuilder;
    }

    public static CharSequence a(Context context, Calendar calendar, int i1)
    {
        if (context == null || calendar == null)
        {
            return null;
        }
        String s1;
        if (i1 == -1)
        {
            s1 = context.getString(0x7f0805ad);
        } else
        if (i1 == 0)
        {
            s1 = context.getString(0x7f080540);
        } else
        if (i1 == 1)
        {
            s1 = context.getString(0x7f080542);
        } else
        {
            s1 = l(calendar.getTime()).toString();
        }
        calendar = u(context, calendar.getTime());
        if (al.a(Locale.JAPAN))
        {
            return bh.a(context, 0x7f08021a, new String[] {
                calendar, s1
            });
        } else
        {
            return bh.a(context, 0x7f08021a, new String[] {
                s1, calendar
            });
        }
    }

    public static String a(double d1)
    {
        Object obj1 = com.fitbit.util.format.d.a();
        synchronized (d.q)
        {
            obj1 = ((DecimalFormat) (obj1)).format(an.a(d1, 1));
        }
        return ((String) (obj1));
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static String a(double d1, int i1)
    {
        DecimalFormat decimalformat = com.fitbit.util.format.d.a();
        String s1;
        synchronized (d.q)
        {
            int j1 = decimalformat.getMaximumFractionDigits();
            decimalformat.setMaximumFractionDigits(i1);
            s1 = decimalformat.format(d1);
            decimalformat.setMaximumFractionDigits(j1);
        }
        return s1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static String a(double d1, int i1, int j1)
    {
        DecimalFormat decimalformat = com.fitbit.util.format.d.a();
        String s1;
        synchronized (d.q)
        {
            int k1 = decimalformat.getMaximumFractionDigits();
            int l1 = decimalformat.getMinimumFractionDigits();
            decimalformat.setMaximumFractionDigits(j1);
            decimalformat.setMinimumFractionDigits(i1);
            s1 = decimalformat.format(an.a(d1, j1));
            decimalformat.setMaximumFractionDigits(k1);
            decimalformat.setMinimumFractionDigits(l1);
        }
        return s1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static String a(int i1)
    {
        if (i1 >= 1000)
        {
            if (((i1 % 1000) / 100) * 100 == 0 || i1 >= 10000)
            {
                return (new StringBuilder()).append(e(i1 / 1000)).append("k").toString();
            } else
            {
                return c(i1, 2);
            }
        } else
        {
            return e(i1);
        }
    }

    public static String a(int i1, int j1)
    {
        Time time = new Time();
        time.setToNow();
        time.hour = i1;
        time.minute = j1;
        return time.format("%k:%M");
    }

    public static String a(long l1)
    {
        String s1;
        synchronized (com.fitbit.util.format.d.a)
        {
            s1 = com.fitbit.util.format.d.a.format(l1);
        }
        return s1;
        exception;
        decimalformat;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static String a(long l1, DateFormat dateformat, TimeZone timezone)
    {
        dateformat;
        JVM INSTR monitorenter ;
        TimeZone timezone1 = dateformat.getTimeZone();
        if (timezone == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        dateformat.setTimeZone(timezone);
        String s1 = dateformat.format(Long.valueOf(l1));
        if (timezone == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        dateformat.setTimeZone(timezone1);
        dateformat;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        if (timezone == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        dateformat.setTimeZone(timezone1);
        throw exception;
        timezone;
        dateformat;
        JVM INSTR monitorexit ;
        throw timezone;
    }

    public static String a(Context context, int i1, int j1)
    {
        return String.format("<a href=\"%s\">%s</a>", new Object[] {
            context.getString(i1), context.getString(j1)
        });
    }

    public static String a(Context context, long l1)
    {
        if (l1 < 60L)
        {
            return bh.a(context, 0x7f08021d, new String[] {
                b(l1)
            });
        }
        if (l1 % 60L == 0L)
        {
            return bh.a(context, 0x7f08021c, new String[] {
                b(l1 / 60L)
            });
        } else
        {
            return bh.a(context, 0x7f08021b, new String[] {
                b(l1 / 60L), b(l1 % 60L)
            });
        }
    }

    private static String a(Context context, long l1, TimeZone timezone)
    {
        if (context == null)
        {
            return null;
        }
        DateFormat dateformat = com.fitbit.util.format.d.p(context);
        synchronized (d.O)
        {
            timezone = a(l1, dateformat, timezone);
        }
        return timezone;
        timezone;
        context;
        JVM INSTR monitorexit ;
        throw timezone;
    }

    public static String a(Context context, long l1, TimeUnit timeunit)
    {
        l1 = TimeUnit.SECONDS.convert(l1, timeunit);
        return context.getString(0x7f08043a, new Object[] {
            Long.valueOf(l1 / 60L), Long.valueOf(l1 % 60L)
        });
    }

    public static String a(Context context, Profile profile, Date date)
    {
        return h(context, date, bn.a(profile));
    }

    public static String a(Context context, Double double1)
    {
        return bh.a(context, 0x7f08021c, new String[] {
            a(double1.doubleValue())
        });
    }

    public static String a(Context context, Double double1, int i1)
    {
        return (new StringBuilder()).append(e(double1.doubleValue())).append(" ").append(context.getString(i1)).toString();
    }

    public static String a(Context context, String s1, int i1)
    {
        return (new StringBuilder()).append(s1).append(" ").append(context.getString(i1)).toString();
    }

    public static String a(Context context, Date date)
    {
        if (context == null || date == null)
        {
            return null;
        }
        DateFormat dateformat = com.fitbit.util.format.d.w(context);
        synchronized (d.V)
        {
            date = a(date, dateformat, ((TimeZone) (null)));
        }
        return date;
        date;
        context;
        JVM INSTR monitorexit ;
        throw date;
    }

    public static String a(Context context, Date date, Date date1)
    {
        Object obj = com.fitbit.util.o.e(new Date());
        Date date2 = date1;
        if (date1.after(((Date) (obj))))
        {
            date2 = ((Date) (obj));
        }
        date1 = Calendar.getInstance();
        date1.setTime(com.fitbit.util.o.d(date));
        obj = Calendar.getInstance();
        ((Calendar) (obj)).setTime(com.fitbit.util.o.d(date2));
        if (date1.get(2) == ((Calendar) (obj)).get(2) && date1.get(1) == ((Calendar) (obj)).get(1))
        {
            return d(context, date, date2);
        }
        if (date1.get(1) == ((Calendar) (obj)).get(1))
        {
            date1 = v(context, date);
            date = v(context, date2);
        } else
        {
            date1 = g(context, date);
            date = g(context, date2);
        }
        obj = context.getString(0x7f080236);
        if (com.fitbit.util.o.j(new Date(), date2))
        {
            date = context.getResources().getText(0x7f080540);
        }
        return String.format(((String) (obj)), new Object[] {
            date1, date
        });
    }

    public static String a(Context context, Date date, TimeZone timezone)
    {
        if (context == null || date == null)
        {
            return null;
        }
        DateFormat dateformat = com.fitbit.util.format.d.d(context);
        synchronized (d.u)
        {
            date = a(date, dateformat, timezone);
        }
        return date;
        date;
        context;
        JVM INSTR monitorexit ;
        throw date;
    }

    public static String a(FoodItem fooditem)
    {
        if (fooditem == null)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder(fooditem.f());
        fooditem = fooditem.a();
        if (fooditem != null && fooditem.a() != null && fooditem.a().length() > 0)
        {
            stringbuilder.append((new StringBuilder()).append(" (").append(fooditem.a()).append(")").toString());
        }
        return stringbuilder.toString();
    }

    public static String a(FoodLogEntry foodlogentry)
    {
        if (foodlogentry == null)
        {
            return "";
        }
        if (foodlogentry.getFoodLogName() == null && foodlogentry.getFoodItem() != null && foodlogentry.getFoodItem().getServerId() != 0L)
        {
            return a(foodlogentry.getFoodItem());
        }
        if (foodlogentry.getFoodLogName() == null)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder(foodlogentry.getFoodLogName());
        foodlogentry = foodlogentry.getFoodItem();
        if (foodlogentry != null)
        {
            foodlogentry = foodlogentry.a();
            if (foodlogentry != null)
            {
                foodlogentry = foodlogentry.a();
                if (foodlogentry != null && foodlogentry.trim().length() != 0)
                {
                    stringbuilder.append((new StringBuilder()).append(" (").append(foodlogentry).append(")").toString());
                }
            }
        }
        return stringbuilder.toString();
    }

    public static String a(Calendar calendar)
    {
        return g(calendar.getTime());
    }

    private static String a(Date date, DateFormat dateformat, TimeZone timezone)
    {
        dateformat;
        JVM INSTR monitorenter ;
        if (date == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        TimeZone timezone1 = dateformat.getTimeZone();
        if (timezone == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        dateformat.setTimeZone(timezone);
        date = dateformat.format(date);
        if (timezone == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        dateformat.setTimeZone(timezone1);
        dateformat;
        JVM INSTR monitorexit ;
        return date;
        date;
        if (timezone == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        dateformat.setTimeZone(timezone1);
        throw date;
        date;
        dateformat;
        JVM INSTR monitorexit ;
        throw date;
        dateformat;
        JVM INSTR monitorexit ;
        return "";
    }

    public static String a(Date date, TimeZone timezone)
    {
        return a(date, ((DateFormat) (d.i)), timezone);
    }

    private static Date a(String s1, DateFormat dateformat, TimeZone timezone)
    {
        dateformat;
        JVM INSTR monitorenter ;
        TimeZone timezone1 = dateformat.getTimeZone();
        if (timezone == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        dateformat.setTimeZone(timezone);
        timezone = dateformat.parse(s1);
        dateformat.setTimeZone(timezone1);
        dateformat;
        JVM INSTR monitorexit ;
        return timezone;
        ParseException parseexception;
        parseexception;
        int i1 = s1.lastIndexOf(":");
        timezone = s1;
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        timezone = (new StringBuilder()).append(s1.substring(0, i1)).append(s1.substring(i1 + 1)).toString();
        s1 = dateformat.parse(timezone);
        dateformat.setTimeZone(timezone1);
        dateformat;
        JVM INSTR monitorexit ;
        return s1;
        s1;
        dateformat;
        JVM INSTR monitorexit ;
        throw s1;
        s1;
        com.fitbit.e.a.a("FormatUtilities", timezone, parseexception, new Object[0]);
        dateformat.setTimeZone(timezone1);
        dateformat;
        JVM INSTR monitorexit ;
        return null;
        s1;
        dateformat.setTimeZone(timezone1);
        throw s1;
    }

    public static Date a(String s1, TimeZone timezone)
    {
        return a(s1, ((DateFormat) (d.i)), timezone);
    }

    public static Date a(Date date)
    {
        return a(h(date), ((DateFormat) (d.j)), ((TimeZone) (null)));
    }

    public static CharSequence b(Context context, int i1)
    {
        if (context == null)
        {
            return null;
        }
        if (i1 == 127)
        {
            return context.getString(0x7f0802e7);
        }
        GregorianCalendar gregoriancalendar = new GregorianCalendar(al.a());
        StringBuilder stringbuilder = new StringBuilder();
        gregoriancalendar.set(7, gregoriancalendar.getFirstDayOfWeek());
        for (int j1 = 0; j1 < 7; j1++)
        {
            if (Alarm.a(gregoriancalendar.get(7), i1))
            {
                if (stringbuilder.length() != 0)
                {
                    stringbuilder.append((new StringBuilder()).append(context.getString(0x7f0805e4)).append(" ").toString());
                }
                stringbuilder.append(m(gregoriancalendar.getTime()));
            }
            gregoriancalendar.add(7, 1);
        }

        return stringbuilder.toString();
    }

    public static String b(double d1)
    {
        Object obj1 = com.fitbit.util.format.d.a();
        synchronized (d.q)
        {
            obj1 = ((DecimalFormat) (obj1)).format(an.a(d1, 2));
        }
        return ((String) (obj1));
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static String b(double d1, int i1)
    {
        DecimalFormat decimalformat = com.fitbit.util.format.d.a();
        String s1;
        synchronized (d.q)
        {
            int j1 = decimalformat.getMinimumFractionDigits();
            decimalformat.setMinimumFractionDigits(i1);
            s1 = decimalformat.format(an.a(d1, 1));
            decimalformat.setMinimumFractionDigits(j1);
        }
        return s1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static String b(long l1)
    {
        String s1;
        synchronized (d.b)
        {
            s1 = d.b.format(l1);
        }
        return s1;
        exception;
        decimalformat;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static String b(Context context, long l1)
    {
        if (context == null)
        {
            return null;
        }
        Object obj = com.fitbit.util.format.d.n(context);
        synchronized (d.M)
        {
            obj = a(l1, ((DateFormat) (obj)), bn.a());
        }
        return ((String) (obj));
        exception;
        context;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static String b(Context context, long l1, TimeZone timezone)
    {
        if (context == null)
        {
            return null;
        }
        DateFormat dateformat = com.fitbit.util.format.d.q(context);
        synchronized (d.P)
        {
            timezone = a(l1, dateformat, timezone);
        }
        return timezone;
        timezone;
        context;
        JVM INSTR monitorexit ;
        throw timezone;
    }

    public static String b(Context context, Date date)
    {
        if (context == null || date == null)
        {
            return null;
        }
        DateFormat dateformat = com.fitbit.util.format.d.x(context);
        synchronized (d.W)
        {
            date = a(date, dateformat, ((TimeZone) (null)));
        }
        return date;
        date;
        context;
        JVM INSTR monitorexit ;
        throw date;
    }

    public static String b(Context context, Date date, Date date1)
    {
        if (context == null || date == null || date1 == null)
        {
            return null;
        }
        DateFormat dateformat = com.fitbit.util.format.d.t(context);
        synchronized (d.S)
        {
            date = a(date, dateformat, ((TimeZone) (null)));
        }
        obj = com.fitbit.util.format.d.u(context);
        synchronized (d.T)
        {
            date1 = a(date1, ((DateFormat) (obj)), ((TimeZone) (null)));
        }
        return String.format("%s - %s", new Object[] {
            date, date1
        });
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        date;
        context;
        JVM INSTR monitorexit ;
        throw date;
    }

    public static String b(Context context, Date date, TimeZone timezone)
    {
        if (context == null || date == null)
        {
            return null;
        }
        DateFormat dateformat = com.fitbit.util.format.d.e(context);
        synchronized (d.u)
        {
            date = a(date, dateformat, timezone);
        }
        return date;
        date;
        context;
        JVM INSTR monitorexit ;
        throw date;
    }

    public static String b(String s1)
    {
        DecimalFormat decimalformat = com.fitbit.util.format.d.a();
        Object obj = d.q;
        obj;
        JVM INSTR monitorenter ;
        double d2 = Double.valueOf(s1).doubleValue();
        double d1;
        if (d2 % 0.10000000000000001D <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        d1 = d2;
        d2 = an.a(d2, 1);
        d1 = d2;
        s1 = decimalformat.format(d2);
        obj;
        JVM INSTR monitorexit ;
        return s1;
        obj;
        JVM INSTR monitorexit ;
        return s1;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
        s1;
        d1 = 0.0D;
_L2:
        s1 = decimalformat.format(d1);
        obj;
        JVM INSTR monitorexit ;
        return s1;
        s1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String b(Date date, TimeZone timezone)
    {
        return a(date, d.j, timezone);
    }

    public static Date b(String s1, TimeZone timezone)
    {
        return a(s1, d.j, timezone);
    }

    public static Date b(Date date)
    {
        return a(e(date), d.j, ((TimeZone) (null)));
    }

    public static int c(String s1)
        throws ParseException
    {
        NumberFormat numberformat = com.fitbit.util.format.d.h();
        int i1;
        synchronized (d.I)
        {
            i1 = numberformat.parse(s1).intValue();
        }
        return i1;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public static String c(double d1)
    {
        return e(d1 / 1000D);
    }

    public static String c(double d1, int i1)
    {
        if ((int)d1 >= 1000)
        {
            return (new StringBuilder()).append(a(d1 / 1000D, an.b(d1 / 1000D, i1 - 1))).append("k").toString();
        } else
        {
            return a(d1, i1);
        }
    }

    public static String c(long l1)
    {
        Object obj1 = com.fitbit.util.format.d.f();
        synchronized (d.C)
        {
            obj1 = a(l1, ((DateFormat) (obj1)), bn.b());
        }
        return ((String) (obj1));
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static String c(Context context, long l1)
    {
        return a(context, l1, bn.a());
    }

    public static String c(Context context, Date date)
    {
        return a(context, date, bn.c());
    }

    public static String c(Context context, Date date, Date date1)
    {
        if (context == null || date == null || date1 == null)
        {
            return null;
        }
        DateFormat dateformat = com.fitbit.util.format.d.r(context);
        synchronized (d.Q)
        {
            date = a(date, dateformat, ((TimeZone) (null)));
        }
        obj = com.fitbit.util.format.d.s(context);
        synchronized (d.R)
        {
            date1 = a(date1, ((DateFormat) (obj)), ((TimeZone) (null)));
        }
        return String.format("%s - %s", new Object[] {
            date, date1
        });
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        date;
        context;
        JVM INSTR monitorexit ;
        throw date;
    }

    public static String c(Context context, Date date, TimeZone timezone)
    {
        if (context == null || date == null)
        {
            return null;
        }
        DateFormat dateformat = com.fitbit.util.format.d.v(context);
        synchronized (d.U)
        {
            date = a(date, dateformat, timezone);
        }
        return date;
        date;
        context;
        JVM INSTR monitorexit ;
        throw date;
    }

    public static String c(Date date)
    {
        return a(date, d.g, ((TimeZone) (null)));
    }

    public static String c(Date date, TimeZone timezone)
    {
        return a(date, d.j, timezone);
    }

    public static String d(double d1)
    {
        return a(d1 / 1000D);
    }

    public static String d(long l1)
    {
        Object obj1 = com.fitbit.util.format.d.g();
        synchronized (d.E)
        {
            obj1 = a(l1, ((DateFormat) (obj1)), ((TimeZone) (null)));
        }
        return ((String) (obj1));
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static String d(Context context, long l1)
    {
        return a(context, l1, bn.b());
    }

    public static String d(Context context, Date date)
    {
        return a(context, date, bn.a());
    }

    public static String d(Context context, Date date, Date date1)
    {
        if (context == null || date == null || date1 == null)
        {
            return null;
        }
        if (com.fitbit.util.o.j(new Date(), date1))
        {
            DateFormat dateformat = com.fitbit.util.format.d.p(context);
            synchronized (d.Q)
            {
                date = a(date, dateformat, ((TimeZone) (null)));
            }
            return String.format("%s - %s", new Object[] {
                date, context.getResources().getString(0x7f080540)
            });
        } else
        {
            return c(context, date, date1);
        }
        context;
        date1;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static String d(Context context, Date date, TimeZone timezone)
    {
        if (context == null || date == null)
        {
            return null;
        } else
        {
            return a(date, com.fitbit.util.format.d.A(context), timezone);
        }
    }

    public static String d(Date date)
    {
        return a(date, d.h, ((TimeZone) (null)));
    }

    public static String d(Date date, TimeZone timezone)
    {
        return a(date, d.k, timezone);
    }

    public static Date d(String s1)
    {
        return a(s1, d.d, bn.b());
    }

    public static String e(double d1)
    {
        DecimalFormat decimalformat = com.fitbit.util.format.d.a();
        String s1;
        synchronized (d.q)
        {
            int i1 = decimalformat.getMaximumFractionDigits();
            decimalformat.setMaximumFractionDigits(0);
            s1 = decimalformat.format(an.a(d1, 0));
            decimalformat.setMaximumFractionDigits(i1);
        }
        return s1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static String e(long l1)
    {
        if (android.text.format.DateFormat.is24HourFormat(FitBitApplication.a()))
        {
            return a(l1, d.n, bn.b());
        } else
        {
            return a(l1, d.m, bn.b());
        }
    }

    public static String e(Context context, long l1)
    {
        return b(context, l1, bn.a());
    }

    public static String e(Context context, Date date)
    {
        if (context == null || date == null)
        {
            return null;
        }
        DateFormat dateformat = com.fitbit.util.format.d.b(context);
        synchronized (d.s)
        {
            date = a(date, dateformat, bn.c());
        }
        return date;
        date;
        context;
        JVM INSTR monitorexit ;
        throw date;
    }

    public static String e(Context context, Date date, Date date1)
    {
        return (new StringBuilder()).append(u(context, date)).append(" - ").append(u(context, date1)).toString();
    }

    public static String e(Context context, Date date, TimeZone timezone)
    {
        if (context == null || date == null)
        {
            return null;
        } else
        {
            return a(date, com.fitbit.util.format.d.B(context), timezone);
        }
    }

    public static String e(Date date)
    {
        return a(date, d.j, ((TimeZone) (null)));
    }

    public static Date e(String s1)
    {
        return a(s1, d.e, ((TimeZone) (null)));
    }

    public static String f(double d1)
    {
        DecimalFormat decimalformat = com.fitbit.util.format.d.a();
        String s1;
        synchronized (d.q)
        {
            int i1 = decimalformat.getMaximumFractionDigits();
            boolean flag = decimalformat.isGroupingUsed();
            decimalformat.setMaximumFractionDigits(0);
            decimalformat.setGroupingUsed(false);
            s1 = decimalformat.format(an.a(d1, 0));
            decimalformat.setMaximumFractionDigits(i1);
            decimalformat.setGroupingUsed(flag);
        }
        return s1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static String f(Context context, long l1)
    {
        return b(context, l1, bn.b());
    }

    public static String f(Context context, Date date)
    {
        if (context == null || date == null)
        {
            return null;
        }
        DateFormat dateformat = com.fitbit.util.format.d.a(context);
        synchronized (d.r)
        {
            date = a(date, dateformat, bn.a());
        }
        return date;
        date;
        context;
        JVM INSTR monitorexit ;
        throw date;
    }

    public static String f(Context context, Date date, TimeZone timezone)
    {
        if (context == null || date == null)
        {
            return null;
        }
        if (!android.text.format.DateFormat.is24HourFormat(context) && (al.a(Locale.JAPANESE) || al.a(Locale.KOREAN) || al.a(Locale.CHINESE)))
        {
            DateFormat dateformat = com.fitbit.util.format.d.k(context);
            synchronized (d.H)
            {
                date = a(date, dateformat, timezone);
            }
            return date;
        } else
        {
            return g(context, date, timezone);
        }
        date;
        context;
        JVM INSTR monitorexit ;
        throw date;
    }

    public static String f(Date date)
    {
        return a(date, d.p, ((TimeZone) (null)));
    }

    public static Date f(String s1)
    {
        return a(s1, d.f, ((TimeZone) (null)));
    }

    public static String g(double d1)
    {
        Object obj1 = com.fitbit.util.format.d.h();
        synchronized (d.I)
        {
            obj1 = ((NumberFormat) (obj1)).format(d1);
        }
        return ((String) (obj1));
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static String g(Context context, long l1)
    {
        long l2 = TimeUnit.MILLISECONDS.toDays(l1);
        if (l2 != 0L)
        {
            return context.getString(0x7f080139, new Object[] {
                Long.valueOf(l2)
            });
        }
        l2 = TimeUnit.MILLISECONDS.toHours(l1);
        if (l2 != 0L)
        {
            return context.getString(0x7f080264, new Object[] {
                Long.valueOf(l2)
            });
        }
        l1 = TimeUnit.MILLISECONDS.toMinutes(l1);
        if (l1 != 0L)
        {
            return context.getString(0x7f0803df, new Object[] {
                Long.valueOf(l1)
            });
        } else
        {
            return context.getString(0x7f080429);
        }
    }

    public static String g(Context context, Date date)
    {
        return c(context, date, bn.b());
    }

    public static String g(Context context, Date date, TimeZone timezone)
    {
        if (context == null || date == null)
        {
            return null;
        }
        if (android.text.format.DateFormat.is24HourFormat(context))
        {
            return a(context, date, timezone);
        } else
        {
            return i(context, date, timezone);
        }
    }

    public static String g(Date date)
    {
        return c(date, bn.a());
    }

    public static Date g(String s1)
    {
        return a(s1, d.d, bn.c());
    }

    public static String h(double d1)
    {
        return a(d1, 0);
    }

    public static String h(Context context, long l1)
    {
        long l2 = l1 / 1000L;
        String s1 = e(l2);
        String s2;
        String s3;
        int i1;
        if (l2 > 0L)
        {
            s1 = context.getString(0x7f080576, new Object[] {
                s1
            });
            i1 = 0x7f08051f;
        } else
        {
            s1 = (new StringBuilder()).append(l1).append("").toString();
            i1 = 0x7f0804f4;
        }
        s3 = al.a(0x7f0b001d, (new StringBuilder()).append(l1).append("").toString());
        s2 = s3;
        if (TextUtils.isEmpty(s3))
        {
            s2 = context.getString(0x7f08056c);
        }
        if (l1 == 0L || TextUtils.isEmpty(s1))
        {
            return context.getString(0x7f08030b);
        } else
        {
            return context.getString(i1, new Object[] {
                s1, s2
            });
        }
    }

    public static String h(Context context, Date date)
    {
        return c(context, date, ((TimeZone) (null)));
    }

    public static String h(Context context, Date date, TimeZone timezone)
    {
        if (context == null || date == null)
        {
            return null;
        }
        android.text.format.DateFormat.is24HourFormat(context);
        if (android.text.format.DateFormat.is24HourFormat(context))
        {
            return b(context, date, timezone);
        } else
        {
            return j(context, date, timezone);
        }
    }

    public static String h(Date date)
    {
        return c(date, bn.b());
    }

    public static Date h(String s1)
    {
        return a(s1, d.l, bn.b());
    }

    public static String i(Context context, Date date)
    {
        if (context == null || date == null)
        {
            return null;
        }
        DateFormat dateformat = com.fitbit.util.format.d.c(context);
        synchronized (d.t)
        {
            date = a(date, dateformat, ((TimeZone) (null)));
        }
        return date;
        date;
        context;
        JVM INSTR monitorexit ;
        throw date;
    }

    private static String i(Context context, Date date, TimeZone timezone)
    {
        DateFormat dateformat = com.fitbit.util.format.d.f(context);
        synchronized (d.w)
        {
            date = a(date, dateformat, timezone);
        }
        return date;
        date;
        context;
        JVM INSTR monitorexit ;
        throw date;
    }

    public static String i(Date date)
    {
        return d(date, bn.a());
    }

    public static Date i(String s1)
    {
        return a(s1, d.j, bn.b());
    }

    public static String j(Context context, Date date)
    {
        if (com.fitbit.util.o.i(date))
        {
            return e(context, date, ((TimeZone) (null)));
        } else
        {
            return d(context, date, ((TimeZone) (null)));
        }
    }

    private static String j(Context context, Date date, TimeZone timezone)
    {
        DateFormat dateformat = com.fitbit.util.format.d.g(context);
        synchronized (d.w)
        {
            date = a(date, dateformat, timezone);
        }
        return date;
        date;
        context;
        JVM INSTR monitorexit ;
        throw date;
    }

    public static String j(Date date)
    {
        return d(date, bn.b());
    }

    public static Date j(String s1)
    {
        return a(s1, d.p, ((TimeZone) (null)));
    }

    public static String k(Context context, Date date)
    {
        if (context == null || date == null)
        {
            return null;
        }
        DateFormat dateformat = com.fitbit.util.format.d.h(context);
        synchronized (d.D)
        {
            date = a(date, dateformat, bn.b());
        }
        return date;
        date;
        context;
        JVM INSTR monitorexit ;
        throw date;
    }

    private static String k(Context context, Date date, TimeZone timezone)
    {
        if (date == null || context == null)
        {
            return null;
        }
        DateFormat dateformat = com.fitbit.util.format.d.j(context);
        synchronized (d.G)
        {
            date = a(date, dateformat, timezone);
        }
        return date;
        date;
        context;
        JVM INSTR monitorexit ;
        throw date;
    }

    public static String k(String s1)
    {
        return (new StringBuilder()).append("<b>").append(s1).append("</b>").toString();
    }

    public static String k(Date date)
    {
        DateFormat dateformat = com.fitbit.util.format.d.c();
        synchronized (d.z)
        {
            date = a(date, dateformat, ((TimeZone) (null)));
        }
        return date;
        date;
        obj;
        JVM INSTR monitorexit ;
        throw date;
    }

    public static CharSequence l(Date date)
    {
        DateFormat dateformat = com.fitbit.util.format.d.d();
        synchronized (d.A)
        {
            date = a(date, dateformat, ((TimeZone) (null)));
        }
        return date;
        date;
        obj;
        JVM INSTR monitorexit ;
        throw date;
    }

    public static String l(Context context, Date date)
    {
        return g(context, date, bn.c());
    }

    private static String l(Context context, Date date, TimeZone timezone)
    {
        if (context == null || date == null)
        {
            return null;
        }
        DateFormat dateformat = com.fitbit.util.format.d.p(context);
        synchronized (d.O)
        {
            date = a(date, dateformat, timezone);
        }
        return date;
        date;
        context;
        JVM INSTR monitorexit ;
        throw date;
    }

    public static CharSequence m(Date date)
    {
        DateFormat dateformat = com.fitbit.util.format.d.e();
        synchronized (d.B)
        {
            date = a(date, dateformat, ((TimeZone) (null)));
        }
        return date;
        date;
        obj;
        JVM INSTR monitorexit ;
        throw date;
    }

    public static String m(Context context, Date date)
    {
        return n(context, date).toLowerCase();
    }

    public static String n(Context context, Date date)
    {
        return g(context, date, bn.a());
    }

    public static String n(Date date)
    {
        if (date == null)
        {
            return null;
        } else
        {
            return a(date, com.fitbit.util.format.d.o, ((TimeZone) (null)));
        }
    }

    public static String o(Context context, Date date)
    {
        return f(context, date, bn.a());
    }

    public static String o(Date date)
    {
        return a(date, d.c, ((TimeZone) (null)));
    }

    public static String p(Context context, Date date)
    {
        if (date != null && context != null) goto _L2; else goto _L1
_L1:
        context = null;
_L4:
        return context;
_L2:
        DateFormat dateformat = com.fitbit.util.format.d.i(context);
        synchronized (d.F)
        {
            date = a(date, dateformat, bn.a());
        }
        context = date;
        if (date == null) goto _L4; else goto _L3
_L3:
        if (al.a(Locale.FRENCH))
        {
            break; /* Loop/switch isn't completed */
        }
        context = date;
        if (!al.a(new Locale("es"))) goto _L4; else goto _L5
_L5:
        return (new StringBuilder()).append(date.substring(0, 1).toUpperCase()).append(date.substring(1)).toString();
        date;
        context;
        JVM INSTR monitorexit ;
        throw date;
    }

    public static String q(Context context, Date date)
    {
        return k(context, date, bn.a());
    }

    public static String r(Context context, Date date)
    {
        return k(context, date, bn.b());
    }

    public static String s(Context context, Date date)
    {
        if (date == null || context == null)
        {
            return null;
        }
        DateFormat dateformat = com.fitbit.util.format.d.l(context);
        synchronized (d.J)
        {
            date = a(date, dateformat, ((TimeZone) (null)));
        }
        return date;
        date;
        context;
        JVM INSTR monitorexit ;
        throw date;
    }

    public static String t(Context context, Date date)
    {
        if (date == null || context == null)
        {
            return null;
        }
        DateFormat dateformat = com.fitbit.util.format.d.m(context);
        synchronized (d.K)
        {
            date = a(date, dateformat, bn.b());
        }
        return date;
        date;
        context;
        JVM INSTR monitorexit ;
        throw date;
    }

    public static String u(Context context, Date date)
    {
        return l(context, date, bn.a());
    }

    public static String v(Context context, Date date)
    {
        return l(context, date, bn.b());
    }

    public static CharSequence w(Context context, Date date)
    {
        if (context == null || date == null)
        {
            return null;
        } else
        {
            Calendar calendar = Calendar.getInstance(bn.b());
            calendar.setTime(date);
            return com.fitbit.util.format.h.a(context.getText(0x7f0805c3), calendar, al.a());
        }
    }

    private static String x(Context context, Date date)
    {
        if (context == null || date == null)
        {
            return null;
        }
        DateFormat dateformat = com.fitbit.util.format.d.o(context);
        synchronized (d.N)
        {
            date = a(date, dateformat, bn.a());
        }
        return date;
        date;
        context;
        JVM INSTR monitorexit ;
        throw date;
    }
}
