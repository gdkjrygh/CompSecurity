// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public final class gcy
{

    private static final SimpleDateFormat a;
    private static final SimpleDateFormat b;

    public static String a()
    {
        gcy;
        JVM INSTR monitorenter ;
        String s = a(Calendar.getInstance());
        gcy;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public static String a(Calendar calendar)
    {
        gcy;
        JVM INSTR monitorenter ;
        ctz.a(calendar);
        calendar = a.format(calendar.getTime());
        gcy;
        JVM INSTR monitorexit ;
        return calendar;
        calendar;
        throw calendar;
    }

    public static Calendar a(String s)
    {
        gcy;
        JVM INSTR monitorenter ;
        s = s.replace("Z", "+00:00");
        s = (new StringBuilder()).append(s.substring(0, 22)).append(s.substring(23)).toString();
        Calendar calendar;
        s = (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US)).parse(s);
        calendar = GregorianCalendar.getInstance();
        calendar.setTime(s);
        gcy;
        JVM INSTR monitorexit ;
        return calendar;
        s;
        throw new ParseException("Invalid length", 0);
        s;
        gcy;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static String b()
    {
        gcy;
        JVM INSTR monitorenter ;
        String s = b(Calendar.getInstance());
        gcy;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    private static String b(Calendar calendar)
    {
        gcy;
        JVM INSTR monitorenter ;
        ctz.a(calendar);
        calendar = b.format(calendar.getTime());
        gcy;
        JVM INSTR monitorexit ;
        return calendar;
        calendar;
        throw calendar;
    }

    static 
    {
        a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
        b = new SimpleDateFormat("yyyy-MM-dd--HH-mm-ss-SSS", Locale.US);
    }
}
