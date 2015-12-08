// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import android.util.Log;
import java.util.Arrays;
import java.util.Locale;

// Referenced classes of package com.adjust.sdk:
//            ILogger, LogLevel

public class Logger
    implements ILogger
{

    private static String formatErrorMessage = "Error formating log message: %s, with params: %s";
    private LogLevel logLevel;

    public Logger()
    {
        setLogLevel(LogLevel.INFO);
    }

    public transient void Assert(String s, Object aobj[])
    {
        try
        {
            Log.println(7, "Adjust", String.format(Locale.US, s, aobj));
            return;
        }
        catch (Exception exception)
        {
            String.format(Locale.US, formatErrorMessage, new Object[] {
                s, Arrays.toString(aobj)
            });
        }
    }

    public transient void debug(String s, Object aobj[])
    {
        if (logLevel.androidLogLevel > 3)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        String.format(Locale.US, s, aobj);
        return;
        Exception exception;
        exception;
        String.format(Locale.US, formatErrorMessage, new Object[] {
            s, Arrays.toString(aobj)
        });
        return;
    }

    public transient void error(String s, Object aobj[])
    {
        if (logLevel.androidLogLevel > 6)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        String.format(Locale.US, s, aobj);
        return;
        Exception exception;
        exception;
        String.format(Locale.US, formatErrorMessage, new Object[] {
            s, Arrays.toString(aobj)
        });
        return;
    }

    public transient void info(String s, Object aobj[])
    {
        if (logLevel.androidLogLevel > 4)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        String.format(Locale.US, s, aobj);
        return;
        Exception exception;
        exception;
        String.format(Locale.US, formatErrorMessage, new Object[] {
            s, Arrays.toString(aobj)
        });
        return;
    }

    public void setLogLevel(LogLevel loglevel)
    {
        logLevel = loglevel;
    }

    public void setLogLevelString(String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        setLogLevel(LogLevel.valueOf(s.toUpperCase(Locale.US)));
        return;
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        error("Malformed logLevel '%s', falling back to 'info'", new Object[] {
            s
        });
        return;
    }

    public transient void verbose(String s, Object aobj[])
    {
        if (logLevel.androidLogLevel > 2)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        String.format(Locale.US, s, aobj);
        return;
        Exception exception;
        exception;
        String.format(Locale.US, formatErrorMessage, new Object[] {
            s, Arrays.toString(aobj)
        });
        return;
    }

    public transient void warn(String s, Object aobj[])
    {
        if (logLevel.androidLogLevel > 5)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        String.format(Locale.US, s, aobj);
        return;
        Exception exception;
        exception;
        String.format(Locale.US, formatErrorMessage, new Object[] {
            s, Arrays.toString(aobj)
        });
        return;
    }

}
