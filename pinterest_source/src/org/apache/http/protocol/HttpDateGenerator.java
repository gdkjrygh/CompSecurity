// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.protocol;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class HttpDateGenerator
{

    public static final TimeZone GMT = TimeZone.getTimeZone("GMT");
    public static final String PATTERN_RFC1123 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    private long dateAsLong;
    private String dateAsText;
    private final DateFormat dateformat;

    public HttpDateGenerator()
    {
        dateAsLong = 0L;
        dateAsText = null;
        dateformat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        dateformat.setTimeZone(GMT);
    }

    public String getCurrentDate()
    {
        this;
        JVM INSTR monitorenter ;
        String s;
        long l = System.currentTimeMillis();
        if (l - dateAsLong > 1000L)
        {
            dateAsText = dateformat.format(new Date(l));
            dateAsLong = l;
        }
        s = dateAsText;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

}
