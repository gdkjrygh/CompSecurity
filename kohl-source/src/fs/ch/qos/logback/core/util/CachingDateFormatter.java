// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class CachingDateFormatter
{

    String cachedStr;
    long lastTimestamp;
    final SimpleDateFormat sdf;

    public CachingDateFormatter(String s)
    {
        lastTimestamp = -1L;
        cachedStr = null;
        sdf = new SimpleDateFormat(s);
    }

    public final String format(long l)
    {
        this;
        JVM INSTR monitorenter ;
        String s;
        if (l != lastTimestamp)
        {
            lastTimestamp = l;
            cachedStr = sdf.format(new Date(l));
        }
        s = cachedStr;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setTimeZone(TimeZone timezone)
    {
        sdf.setTimeZone(timezone);
    }
}
