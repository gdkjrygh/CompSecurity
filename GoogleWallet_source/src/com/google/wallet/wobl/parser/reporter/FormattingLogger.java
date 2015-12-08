// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser.reporter;

import java.util.IllegalFormatException;
import java.util.logging.Logger;

// Referenced classes of package com.google.wallet.wobl.parser.reporter:
//            ReportLevel, Environment

public class FormattingLogger
{

    private static final int LOGGER_MAX_LENGTH = 23;
    private final Logger logger;

    private FormattingLogger(String s)
    {
        logger = Logger.getLogger(s);
    }

    public static FormattingLogger getLogger(Class class1)
    {
        return getLogger(class1.getSimpleName());
    }

    public static FormattingLogger getLogger(String s)
    {
        String s1 = s;
        if (s.length() > 23)
        {
            s1 = s.substring(0, 23);
        }
        return new FormattingLogger(s1);
    }

    private void log(ReportLevel reportlevel, String s)
    {
        java.util.logging.Level level;
        if (reportlevel != null)
        {
            if (logger.isLoggable(level = reportlevel.getLoggerLevel()) && reportlevel.compareTo(Environment.getMinLoggingLevel()) >= 0)
            {
                logger.log(level, s);
                return;
            }
        }
    }

    private void log(ReportLevel reportlevel, Throwable throwable, String s)
    {
        java.util.logging.Level level;
        if (reportlevel != null)
        {
            if (logger.isLoggable(level = reportlevel.getLoggerLevel()) && reportlevel.compareTo(Environment.getMinLoggingLevel()) >= 0)
            {
                logger.log(level, s, throwable);
                return;
            }
        }
    }

    private transient void logfmt(ReportLevel reportlevel, String s, Object aobj[])
    {
        try
        {
            log(reportlevel, String.format(s, aobj));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ReportLevel reportlevel)
        {
            aobj = ReportLevel.ERROR;
        }
        reportlevel = String.valueOf(s);
        if (reportlevel.length() != 0)
        {
            reportlevel = "Illegal format during logging. Dropping all args: ".concat(reportlevel);
        } else
        {
            reportlevel = new String("Illegal format during logging. Dropping all args: ");
        }
        log(((ReportLevel) (aobj)), reportlevel);
    }

    private transient void logfmt(ReportLevel reportlevel, Throwable throwable, String s, Object aobj[])
    {
        try
        {
            log(reportlevel, throwable, String.format(s, aobj));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ReportLevel reportlevel)
        {
            aobj = ReportLevel.ERROR;
        }
        reportlevel = String.valueOf(s);
        if (reportlevel.length() != 0)
        {
            reportlevel = "Illegal format during logging. Dropping all args: ".concat(reportlevel);
        } else
        {
            reportlevel = new String("Illegal format during logging. Dropping all args: ");
        }
        log(((ReportLevel) (aobj)), throwable, reportlevel);
    }

    public void error(String s)
    {
        log(ReportLevel.ERROR, s);
    }

    public void error(Throwable throwable, String s)
    {
        log(ReportLevel.ERROR, throwable, s);
    }

    public transient void errorfmt(String s, Object aobj[])
    {
        logfmt(ReportLevel.ERROR, s, aobj);
    }

    public transient void errorfmt(Throwable throwable, String s, Object aobj[])
    {
        logfmt(ReportLevel.ERROR, throwable, s, aobj);
    }

    public void info(String s)
    {
        log(ReportLevel.INFO, s);
    }

    public void info(Throwable throwable, String s)
    {
        log(ReportLevel.INFO, throwable, s);
    }

    public transient void infofmt(String s, Object aobj[])
    {
        logfmt(ReportLevel.INFO, s, aobj);
    }

    public transient void infofmt(Throwable throwable, String s, Object aobj[])
    {
        logfmt(ReportLevel.INFO, throwable, s, aobj);
    }

    public void warn(String s)
    {
        log(ReportLevel.WARN, s);
    }

    public void warn(Throwable throwable, String s)
    {
        log(ReportLevel.WARN, throwable, s);
    }

    public transient void warnfmt(String s, Object aobj[])
    {
        logfmt(ReportLevel.WARN, s, aobj);
    }

    public transient void warnfmt(Throwable throwable, String s, Object aobj[])
    {
        logfmt(ReportLevel.WARN, throwable, s, aobj);
    }
}
