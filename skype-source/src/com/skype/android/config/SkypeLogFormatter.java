// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config;

import java.util.Calendar;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class SkypeLogFormatter extends Formatter
{

    public static final String EOL = System.getProperty("line.separator");
    private final Calendar calendar = Calendar.getInstance();

    public SkypeLogFormatter()
    {
    }

    private void appendThreeDigitInt(StringBuilder stringbuilder, int i)
    {
        if (i < 100)
        {
            stringbuilder.append(0);
        }
        appendTwoDigitInt(stringbuilder, i);
    }

    private void appendTwoDigitInt(StringBuilder stringbuilder, int i)
    {
        if (i < 10)
        {
            stringbuilder.append(0);
        }
        stringbuilder.append(i);
    }

    public static String arrayToString(String s, Object aobj[])
    {
        s = new StringBuilder(s);
        for (int i = 0; i < aobj.length; i++)
        {
            s.append('"').append(aobj[i].toString()).append('"');
            if (i != aobj.length - 1)
            {
                s.append(',').append(' ');
            }
        }

        return s.toString();
    }

    private String timePrefix(LogRecord logrecord)
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        calendar.setTimeInMillis(logrecord.getMillis());
        appendTwoDigitInt(stringbuilder, calendar.get(2));
        stringbuilder.append('-');
        appendTwoDigitInt(stringbuilder, calendar.get(5));
        stringbuilder.append(' ');
        appendTwoDigitInt(stringbuilder, calendar.get(11));
        stringbuilder.append(':');
        appendTwoDigitInt(stringbuilder, calendar.get(12));
        stringbuilder.append(':');
        appendTwoDigitInt(stringbuilder, calendar.get(13));
        stringbuilder.append('.');
        appendThreeDigitInt(stringbuilder, calendar.get(14));
        stringbuilder.append(' ').append(logrecord.getLevel()).append(' ').append(logrecord.getLoggerName()).append(": ");
        return stringbuilder.toString();
    }

    public static String toHexString(byte abyte0[])
    {
        java.util.Formatter formatter;
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder(abyte0.length * 2);
        formatter = new java.util.Formatter(stringbuilder);
        int j = abyte0.length;
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        formatter.format("%02x", new Object[] {
            Byte.valueOf(abyte0[i])
        });
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        formatter.close();
        return stringbuilder.toString();
        abyte0;
        formatter.close();
        throw abyte0;
    }

    public String format(LogRecord logrecord)
    {
        this;
        JVM INSTR monitorenter ;
        StringBuilder stringbuilder;
        String s;
        stringbuilder = new StringBuilder(512);
        s = timePrefix(logrecord);
        stringbuilder.append(s).append(logrecord.getMessage()).append(EOL);
        logrecord = logrecord.getThrown();
        if (logrecord == null) goto _L2; else goto _L1
_L1:
        int j;
        stringbuilder.append(s).append(logrecord.getMessage());
        stringbuilder.append(EOL);
        logrecord = logrecord.getStackTrace();
        j = logrecord.length;
        int i = 0;
_L3:
        StackTraceElement stacktraceelement;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        stacktraceelement = logrecord[i];
        stringbuilder.append(s).append('\t').append(stacktraceelement.getClassName()).append('.').append(stacktraceelement.getMethodName()).append('(').append(stacktraceelement.getFileName()).append(':').append(stacktraceelement.getLineNumber()).append(')').append(EOL);
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        logrecord = stringbuilder.toString();
        this;
        JVM INSTR monitorexit ;
        return logrecord;
        logrecord;
        throw logrecord;
    }

}
