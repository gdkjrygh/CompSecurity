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

public final class g
{

    private static final TimeZone a = TimeZone.getTimeZone("GMT");
    private static final ThreadLocal b = new ThreadLocal() {

        protected final Object initialValue()
        {
            SimpleDateFormat simpledateformat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpledateformat.setLenient(false);
            simpledateformat.setTimeZone(g.a());
            return simpledateformat;
        }

    };
    private static final String c[] = {
        "EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", 
        "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"
    };
    private static final DateFormat d[] = new DateFormat[15];

    public static Date a(String s)
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
        obj = ((DateFormat)b.get()).parse(s, parseposition);
        if (parseposition.getIndex() == s.length()) goto _L4; else goto _L3
_L3:
        String as[] = c;
        as;
        JVM INSTR monitorenter ;
        int j = c.length;
_L6:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        DateFormat dateformat = d[i];
        obj = dateformat;
        if (dateformat != null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        obj = new SimpleDateFormat(c[i], Locale.US);
        ((DateFormat) (obj)).setTimeZone(a);
        d[i] = ((DateFormat) (obj));
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

    static TimeZone a()
    {
        return a;
    }

}
