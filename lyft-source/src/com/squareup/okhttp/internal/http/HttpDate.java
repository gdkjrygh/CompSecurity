// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class HttpDate
{

    private static final DateFormat BROWSER_COMPATIBLE_DATE_FORMATS[] = new DateFormat[BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS.length];
    private static final String BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS[] = {
        "EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", 
        "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"
    };
    private static final TimeZone GMT = TimeZone.getTimeZone("GMT");
    private static final ThreadLocal STANDARD_DATE_FORMAT = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected DateFormat initialValue()
        {
            SimpleDateFormat simpledateformat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpledateformat.setLenient(false);
            simpledateformat.setTimeZone(HttpDate.GMT);
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
        int i = 0;
        if (s.length() != 0) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((Date) (obj));
_L2:
        ParsePosition parseposition;
        parseposition = new ParsePosition(0);
        obj = ((DateFormat)STANDARD_DATE_FORMAT.get()).parse(s, parseposition);
        if (parseposition.getIndex() == s.length()) goto _L4; else goto _L3
_L3:
        String as[] = BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS;
        as;
        JVM INSTR monitorenter ;
        int j = BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS.length;
_L6:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        DateFormat dateformat = BROWSER_COMPATIBLE_DATE_FORMATS[i];
        obj = dateformat;
        if (dateformat != null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        obj = new SimpleDateFormat(BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS[i], Locale.US);
        ((DateFormat) (obj)).setTimeZone(GMT);
        BROWSER_COMPATIBLE_DATE_FORMATS[i] = ((DateFormat) (obj));
        parseposition.setIndex(0);
        obj = ((DateFormat) (obj)).parse(s, parseposition);
        if (parseposition.getIndex() == 0)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        as;
        JVM INSTR monitorexit ;
        return ((Date) (obj));
        s;
        as;
        JVM INSTR monitorexit ;
        throw s;
        i++;
        if (true) goto _L6; else goto _L5
_L5:
        as;
        JVM INSTR monitorexit ;
        return null;
    }


}
