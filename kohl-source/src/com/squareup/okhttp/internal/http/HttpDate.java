// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

final class HttpDate
{

    private static final DateFormat BROWSER_COMPATIBLE_DATE_FORMATS[] = new DateFormat[BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS.length];
    private static final String BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS[] = {
        "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", 
        "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"
    };
    private static final ThreadLocal STANDARD_DATE_FORMAT = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected DateFormat initialValue()
        {
            SimpleDateFormat simpledateformat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpledateformat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpledateformat;
        }

    };

    private HttpDate()
    {
    }

    public static String format(Date date)
    {
        return ((DateFormat)STANDARD_DATE_FORMAT.get()).format(date);
    }

    public static Date parse(String s)
    {
        Object obj = ((DateFormat)STANDARD_DATE_FORMAT.get()).parse(s);
        return ((Date) (obj));
        ParseException parseexception;
        parseexception;
        String as[] = BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS;
        as;
        JVM INSTR monitorenter ;
        int i = 0;
        int j = BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS.length;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        DateFormat dateformat = BROWSER_COMPATIBLE_DATE_FORMATS[i];
        parseexception = dateformat;
        if (dateformat != null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        parseexception = new SimpleDateFormat(BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS[i], Locale.US);
        BROWSER_COMPATIBLE_DATE_FORMATS[i] = parseexception;
        parseexception = parseexception.parse(s);
        as;
        JVM INSTR monitorexit ;
        return parseexception;
        s;
        as;
        JVM INSTR monitorexit ;
        throw s;
        parseexception;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        as;
        JVM INSTR monitorexit ;
        return null;
    }

}
