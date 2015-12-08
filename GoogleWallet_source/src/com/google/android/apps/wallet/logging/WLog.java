// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.logging;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

public class WLog
{
    public static final class LogPriority extends Enum
    {

        private static final LogPriority $VALUES[];
        public static final LogPriority DEBUG;
        public static final LogPriority ERROR;
        public static final LogPriority INFO;
        public static final LogPriority VERBOSE;
        public static final LogPriority WARN;
        private final int priority;

        public static LogPriority valueOf(String s)
        {
            return (LogPriority)Enum.valueOf(com/google/android/apps/wallet/logging/WLog$LogPriority, s);
        }

        public static LogPriority[] values()
        {
            return (LogPriority[])$VALUES.clone();
        }

        final boolean isShown()
        {
            return priority >= WLog.minLogPriority.priority;
        }

        static 
        {
            VERBOSE = new LogPriority("VERBOSE", 0, 2);
            DEBUG = new LogPriority("DEBUG", 1, 3);
            INFO = new LogPriority("INFO", 2, 4);
            WARN = new LogPriority("WARN", 3, 5);
            ERROR = new LogPriority("ERROR", 4, 6);
            $VALUES = (new LogPriority[] {
                VERBOSE, DEBUG, INFO, WARN, ERROR
            });
        }

        private LogPriority(String s, int j, int k)
        {
            super(s, j);
            priority = k;
        }
    }


    private static final String TAG = com/google/android/apps/wallet/logging/WLog.getSimpleName();
    private static LogPriority minLogPriority;

    public WLog()
    {
    }

    public static void d(String s, String s1)
    {
        log(LogPriority.DEBUG, s, s1);
    }

    public static void d(String s, String s1, Throwable throwable)
    {
        log(LogPriority.DEBUG, s, s1, throwable);
    }

    public static transient void dfmt(String s, String s1, Object aobj[])
    {
        logfmt(LogPriority.DEBUG, s, s1, aobj);
    }

    public static transient void dfmt(String s, Throwable throwable, String s1, Object aobj[])
    {
        logfmt(LogPriority.DEBUG, s, throwable, s1, aobj);
    }

    public static void e(String s, String s1)
    {
        log(LogPriority.ERROR, s, s1);
    }

    public static void e(String s, String s1, Throwable throwable)
    {
        log(LogPriority.ERROR, s, s1, throwable);
    }

    public static transient void efmt(String s, String s1, Object aobj[])
    {
        logfmt(LogPriority.ERROR, s, s1, aobj);
    }

    public static transient void efmt(String s, Throwable throwable, String s1, Object aobj[])
    {
        logfmt(LogPriority.ERROR, s, throwable, s1, aobj);
    }

    public static LogPriority getMinLogPriority()
    {
        return minLogPriority;
    }

    public static String getStackTraceString(Throwable throwable)
    {
        if (throwable == null)
        {
            return "";
        } else
        {
            StringWriter stringwriter = new StringWriter();
            PrintWriter printwriter = new PrintWriter(stringwriter);
            throwable.printStackTrace(printwriter);
            printwriter.flush();
            return stringwriter.toString();
        }
    }

    public static void i(String s, String s1)
    {
        log(LogPriority.INFO, s, s1);
    }

    public static void i(String s, String s1, Throwable throwable)
    {
        log(LogPriority.INFO, s, s1, throwable);
    }

    public static transient void ifmt(String s, String s1, Object aobj[])
    {
        logfmt(LogPriority.INFO, s, s1, aobj);
    }

    public static void log(LogPriority logpriority, String s, String s1)
    {
        if (!logpriority.isShown())
        {
            return;
        }
        static final class _cls1
        {

            static final int $SwitchMap$com$google$android$apps$wallet$logging$WLog$LogPriority[];

            static 
            {
                $SwitchMap$com$google$android$apps$wallet$logging$WLog$LogPriority = new int[LogPriority.values().length];
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$logging$WLog$LogPriority[LogPriority.DEBUG.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$logging$WLog$LogPriority[LogPriority.ERROR.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$logging$WLog$LogPriority[LogPriority.INFO.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$logging$WLog$LogPriority[LogPriority.VERBOSE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$logging$WLog$LogPriority[LogPriority.WARN.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.google.android.apps.wallet.logging.WLog.LogPriority[logpriority.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            Log.d(s, s1);
            return;

        case 2: // '\002'
            Log.e(s, s1);
            return;

        case 3: // '\003'
            Log.i(s, s1);
            return;

        case 4: // '\004'
            Log.v(s, s1);
            return;

        case 5: // '\005'
            Log.w(s, s1);
            break;
        }
    }

    private static void log(LogPriority logpriority, String s, String s1, Throwable throwable)
    {
        if (!logpriority.isShown())
        {
            return;
        }
        throwable = getStackTraceString(throwable);
        s1 = (new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(throwable).length())).append(s1).append("\n").append(throwable).toString();
        switch (_cls1..SwitchMap.com.google.android.apps.wallet.logging.WLog.LogPriority[logpriority.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            Log.d(s, s1);
            return;

        case 2: // '\002'
            Log.e(s, s1);
            return;

        case 3: // '\003'
            Log.i(s, s1);
            return;

        case 4: // '\004'
            Log.v(s, s1);
            return;

        case 5: // '\005'
            Log.w(s, s1);
            break;
        }
    }

    private static transient void logfmt(LogPriority logpriority, String s, String s1, Object aobj[])
    {
        if (!logpriority.isShown())
        {
            return;
        }
        try
        {
            log(logpriority, s, String.format(s1, aobj));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            dfmt(TAG, "Unable to format log statement: '%s/%s, %s'", new Object[] {
                logpriority.toString(), s, s1
            });
        }
    }

    private static transient void logfmt(LogPriority logpriority, String s, Throwable throwable, String s1, Object aobj[])
    {
        if (!logpriority.isShown())
        {
            return;
        }
        try
        {
            aobj = String.valueOf(String.format(s1, aobj));
            throwable = getStackTraceString(throwable);
            log(logpriority, s, (new StringBuilder(String.valueOf(((Object) (aobj))).length() + 1 + String.valueOf(throwable).length())).append(((String) (aobj))).append("\n").append(throwable).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            efmt(TAG, "Unable to format log statement: '%s/%s, %s'", new Object[] {
                logpriority.toString(), s, s1
            });
        }
    }

    public static void setMinLogPriority(LogPriority logpriority)
    {
        if (logpriority != null)
        {
            minLogPriority = logpriority;
        }
    }

    public static void v(String s, String s1)
    {
        log(LogPriority.VERBOSE, s, s1);
    }

    public static void v(String s, String s1, Throwable throwable)
    {
        log(LogPriority.VERBOSE, s, s1, throwable);
    }

    public static transient void vfmt(String s, String s1, Object aobj[])
    {
        logfmt(LogPriority.VERBOSE, s, s1, aobj);
    }

    public static void w(String s, String s1)
    {
        log(LogPriority.WARN, s, s1);
    }

    public static void w(String s, String s1, Throwable throwable)
    {
        log(LogPriority.WARN, s, s1, throwable);
    }

    public static transient void wfmt(String s, String s1, Object aobj[])
    {
        logfmt(LogPriority.WARN, s, s1, aobj);
    }

    static 
    {
        minLogPriority = LogPriority.INFO;
    }

}
