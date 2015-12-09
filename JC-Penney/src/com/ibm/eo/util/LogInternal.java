// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.util;

import android.util.Log;

public final class LogInternal
{

    public static final int DEBUG = 2;
    public static final int ERROR = 1;
    public static final int INFO = 3;
    public static final int VERBOSE = 5;
    public static final int WARNING = 4;
    private static boolean _isDEBUG = false;
    private static volatile LogInternal _myInstance;

    private LogInternal()
    {
    }

    public static String getExceptionMessage(Throwable throwable, String s)
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (s != null)
        {
            stringbuffer.append(s);
            stringbuffer.append('\t');
        }
        stringbuffer.append(throwable.getMessage());
        return stringbuffer.toString();
    }

    public static String getExceptionString(Throwable throwable, String s)
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (s != null)
        {
            stringbuffer.append(s);
            stringbuffer.append('\t');
        }
        stringbuffer.append(throwable.getMessage());
        stringbuffer.append(getStackTrace(throwable));
        return stringbuffer.toString();
    }

    public static LogInternal getInstance()
    {
        com/ibm/eo/util/LogInternal;
        JVM INSTR monitorenter ;
        LogInternal loginternal;
        if (_myInstance == null)
        {
            _myInstance = new LogInternal();
        }
        loginternal = _myInstance;
        com/ibm/eo/util/LogInternal;
        JVM INSTR monitorexit ;
        return loginternal;
        Exception exception;
        exception;
        throw exception;
    }

    public static String getStackTrace(Throwable throwable)
    {
        StringBuilder stringbuilder = new StringBuilder();
        throwable = throwable.getStackTrace();
        int j = throwable.length;
        for (int i = 0; i < j; i++)
        {
            stringbuilder.append(throwable[i].toString());
            stringbuilder.append('\n');
        }

        return stringbuilder.toString();
    }

    public static String getTLLibErrorExceptionMessage(Throwable throwable, String s)
    {
        StringBuffer stringbuffer = new StringBuffer(20);
        stringbuffer.append("TL Library Error: ");
        if (s != null)
        {
            stringbuffer.append(s);
            stringbuffer.append('\t');
        }
        stringbuffer.append(throwable.getMessage());
        return stringbuffer.toString();
    }

    public static String getTLLibErrorExceptionString(Throwable throwable, String s)
    {
        StringBuffer stringbuffer = new StringBuffer(20);
        stringbuffer.append("TL Library Error: ");
        if (s != null)
        {
            stringbuffer.append(s);
            stringbuffer.append('\t');
        }
        stringbuffer.append(throwable.getMessage());
        stringbuffer.append(getStackTrace(throwable));
        return stringbuffer.toString();
    }

    public static boolean isDEBUG()
    {
        return _isDEBUG;
    }

    public static void log(String s)
    {
        log(s, 3);
    }

    public static void log(String s, int i)
    {
        Log.d("EOCore", s);
    }

    public static Boolean logException(Throwable throwable, String s)
    {
        log((new StringBuffer(getTLLibErrorExceptionString(throwable, s))).toString(), 1);
        return Boolean.valueOf(true);
    }

    public static void logException(Throwable throwable)
    {
        logException(throwable, null);
    }

    public static void setIsDEBUG(boolean flag)
    {
        _isDEBUG = flag;
    }

}
