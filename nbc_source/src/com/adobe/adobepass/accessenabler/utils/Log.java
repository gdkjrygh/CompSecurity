// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.utils;

import java.util.ArrayList;

// Referenced classes of package com.adobe.adobepass.accessenabler.utils:
//            Utils

public class Log
{
    public static class LogEntry
    {

        public String dateTime;
        public String message;
        public Severity severity;
        public String tag;

        public LogEntry(String s, String s1, Severity severity1, String s2)
        {
            dateTime = s;
            message = s1;
            severity = severity1;
            tag = s2;
        }
    }

    public static final class Severity extends Enum
    {

        private static final Severity $VALUES[];
        public static final Severity DEBUG;
        public static final Severity ERROR;
        public static final Severity INFO;

        public static Severity valueOf(String s)
        {
            return (Severity)Enum.valueOf(com/adobe/adobepass/accessenabler/utils/Log$Severity, s);
        }

        public static Severity[] values()
        {
            return (Severity[])$VALUES.clone();
        }

        static 
        {
            INFO = new Severity("INFO", 0);
            DEBUG = new Severity("DEBUG", 1);
            ERROR = new Severity("ERROR", 2);
            $VALUES = (new Severity[] {
                INFO, DEBUG, ERROR
            });
        }

        private Severity(String s, int j)
        {
            super(s, j);
        }
    }


    private static boolean LOGGING_ENABLED = false;
    private static final int MAX_SIZE = 100;
    private static ArrayList logEntries = new ArrayList();

    public Log()
    {
    }

    private static void addEntry(LogEntry logentry)
    {
        if (logEntries.size() >= 100)
        {
            logEntries.remove(0);
        }
        logEntries.add(logentry);
    }

    public static void clearLogEntries()
    {
        logEntries.clear();
    }

    public static void d(String s, String s1)
    {
        if (LOGGING_ENABLED)
        {
            android.util.Log.d(s, s1);
            addEntry(new LogEntry(Utils.now(), s1, Severity.DEBUG, s));
        }
    }

    public static void e(String s, String s1)
    {
        if (LOGGING_ENABLED)
        {
            android.util.Log.e(s, s1);
            addEntry(new LogEntry(Utils.now(), s1, Severity.ERROR, s));
        }
    }

    public static ArrayList getLogEntries()
    {
        return logEntries;
    }

    public static void i(String s, String s1)
    {
        if (LOGGING_ENABLED)
        {
            android.util.Log.i(s, s1);
            addEntry(new LogEntry(Utils.now(), s1, Severity.INFO, s));
        }
    }

    public static void setEnabled(boolean flag)
    {
        LOGGING_ENABLED = flag;
    }

    static 
    {
        LOGGING_ENABLED = true;
    }
}
